package com.example.armorforu;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.living.LivingChangeTargetEvent;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.monster.piglin.Piglin;


@Mod.EventBusSubscriber(modid = "armorforu", bus = Mod.EventBusSubscriber.Bus.FORGE)
public class PiglinBehaviorModifier {

    @SubscribeEvent
    public static void onPiglinTargeting(LivingChangeTargetEvent event) {
        if (event.getEntity() instanceof Piglin) {
            if (event.getNewTarget() instanceof Player player) {
                if (isWearingCustomArmor(player)) {
                    ((Piglin) event.getEntity()).setAggressive(false);
                    event.setCanceled(true);
                }
            }   
        }
    }

    private static boolean isWearingCustomArmor(Player player) {
        for (ItemStack itemStack : player.getArmorSlots()) {
            if (itemStack.getItem() instanceof ArmorItem armorItem && armorItem.getMaterial().get() == ArmorForuMaterial.NETHERRACK_ARMOR) {
                return true;
            }
        }
        return false;
    }
}

