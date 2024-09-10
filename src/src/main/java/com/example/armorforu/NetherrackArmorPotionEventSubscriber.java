package com.example.armorforu;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ArmorMod.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class NetherrackArmorPotionEventSubscriber {

    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
        Player player = event.player;
        
        if (isWearingFullArmor(player)) {
            player.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 1360,0, true, false));
        } else {
            player.removeEffect(MobEffects.FIRE_RESISTANCE);
        }
    }

    private static boolean isWearingFullArmor(Player player) {
        return player.getItemBySlot(EquipmentSlot.HEAD).getItem() == ModItems.NETHERRACK_HELMET.get() &&
               player.getItemBySlot(EquipmentSlot.CHEST).getItem() == ModItems.NETHERRACK_CHESTPLATE.get() &&
               player.getItemBySlot(EquipmentSlot.LEGS).getItem() == ModItems.NETHERRACK_LEGGINGS.get() &&
               player.getItemBySlot(EquipmentSlot.FEET).getItem() == ModItems.NETHERRACK_BOOTS.get();
    }
}
