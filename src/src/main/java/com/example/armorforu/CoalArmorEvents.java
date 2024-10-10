package com.example.armorforu;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.event.level.BlockEvent.BreakEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ArmorMod.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class CoalArmorEvents {

    @SubscribeEvent
    public static void onBlockBreak(BreakEvent event) {
        Player player = event.getPlayer();
    
        if (event.getState().is(Tags.Blocks.ORES_COAL)) {
            if (isWearingFullCoalArmor(player)) {
                int extraCoal = 5;
                ItemStack coalStack = new ItemStack(Items.COAL, extraCoal);
                Block.popResource((Level) event.getLevel(), event.getPos(), coalStack);
            }
        }
    }

    private static boolean isWearingFullCoalArmor(Player player) {
        return player.getItemBySlot(EquipmentSlot.HEAD).getItem() == ModItems.COAL_HELMET.get() &&
               player.getItemBySlot(EquipmentSlot.CHEST).getItem() == ModItems.COAL_CHESTPLATE.get() &&
               player.getItemBySlot(EquipmentSlot.LEGS).getItem() == ModItems.COAL_LEGGINGS.get() &&
               player.getItemBySlot(EquipmentSlot.FEET).getItem() == ModItems.COAL_BOOTS.get();
    }
}
