package com.example.armorforu;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;
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
                BlockPos currentPos = player.blockPosition().above(2);
                BlockPos previousPos = playerLightBlocks.get(player);

                if (isWearingHelmet) {
                    if (previousPos == null || !currentPos.equals(previousPos)) {
                        if (previousPos != null) {
                            world.removeBlock(previousPos, false);
                        }
                        world.setBlock(currentPos, ModItems.FAKE_AIR_BLOCK.get().defaultBlockState(), 3);
                        playerLightBlocks.put(player, currentPos);
                    }
                } else if (previousPos != null) {
                    world.removeBlock(previousPos, false);
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
                    world.removeBlock(pos, false);
                }
            }
        }
    }
}
