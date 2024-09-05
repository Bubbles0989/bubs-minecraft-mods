package com.example.armorforu;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.event.entity.living.LivingEquipmentChangeEvent;

import java.util.HashMap;
import java.util.Map;

@Mod.EventBusSubscriber(modid = "armorforu")
public class LightMovement {

    private static final Map<Player, BlockPos> playerLightBlocks = new HashMap<>();

    @SuppressWarnings("removal")
    @SubscribeEvent
    public static void onLevelTick(TickEvent.LevelTickEvent event) {
        if (event.phase == TickEvent.Phase.END && event.level instanceof ServerLevel) {
            ServerLevel world = (ServerLevel) event.level;

            for (Player player : world.players()) {
                ItemStack helmet = player.getItemBySlot(EquipmentSlot.HEAD);
                boolean isWearingHelmet = helmet.getItem() == ModItems.TORCH_HELMET.get();
                BlockPos currentPos = player.blockPosition().above();
                BlockPos previousPos = playerLightBlocks.get(player);

                if (isWearingHelmet) {
                    if (previousPos == null || !currentPos.equals(previousPos)) {
                        // Remove the old light block only if it's still fake air
                        if (previousPos != null) {
                            BlockState previousBlockState = world.getBlockState(previousPos);
                            if (previousBlockState.getBlock() == ModItems.FAKE_AIR_BLOCK.get()) {
                                world.removeBlock(previousPos, false); // Don't break blocks
                            }
                        }
                        
                        // Only place fake air block if the current position is replaceable (air, water, etc.)
                        BlockState currentBlockState = world.getBlockState(currentPos);
                        if (currentBlockState.isAir() || currentBlockState.canBeReplaced()) {
                            world.setBlock(currentPos, ModItems.FAKE_AIR_BLOCK.get().defaultBlockState(), 3);
                            playerLightBlocks.put(player, currentPos);
                        }
                    }
                } else if (previousPos != null) {
                    // Remove the light block when the player takes off the helmet, if it's still fake air
                    BlockState previousBlockState = world.getBlockState(previousPos);
                    if (previousBlockState.getBlock() == ModItems.FAKE_AIR_BLOCK.get()) {
                        world.removeBlock(previousPos, false);
                    }
                    playerLightBlocks.remove(player);
                }
            }
        }
    }

    @SubscribeEvent
    public static void onEquipmentChange(LivingEquipmentChangeEvent event) {
        if (event.getEntity() instanceof Player player) {
            ItemStack oldItem = event.getFrom();
            ItemStack newItem = event.getTo();

            if (oldItem.getItem() == ModItems.TORCH_HELMET.get() && !newItem.is(ModItems.TORCH_HELMET.get())) {
                ServerLevel world = (ServerLevel) player.level();
                BlockPos pos = playerLightBlocks.remove(player);
                if (pos != null) {
                    BlockState blockState = world.getBlockState(pos);
                    if (blockState.getBlock() == ModItems.FAKE_AIR_BLOCK.get()) {
                        world.removeBlock(pos, false);
                    }
                }
            }
        }
    }
}