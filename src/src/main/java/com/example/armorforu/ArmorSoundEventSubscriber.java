package com.example.armorforu;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.living.LivingEvent.LivingTickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ArmorMod.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ArmorSoundEventSubscriber {

    private static float lastWalkDist = 0;

    @SubscribeEvent
    public static void onPlayerWalk(LivingTickEvent event) {
        if (event.getEntity() instanceof Player player) {
            boolean isWearingAmethystArmor = 
                    player.getItemBySlot(EquipmentSlot.HEAD).getItem() == ModItems.AMETHYST_HELMET.get() &&
                    player.getItemBySlot(EquipmentSlot.CHEST).getItem() == ModItems.AMETHYST_CHESTPLATE.get() &&
                    player.getItemBySlot(EquipmentSlot.LEGS).getItem() == ModItems.AMETHYST_LEGGINGS.get() &&
                    player.getItemBySlot(EquipmentSlot.FEET).getItem() == ModItems.AMETHYST_BOOTS.get();

            if (isWearingAmethystArmor && player.onGround() && !player.isCrouching()) {
                if (player.walkDist > lastWalkDist + 0.5F) {
                    player.level().playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.AMETHYST_CLUSTER_STEP, SoundSource.PLAYERS, 1.0F, 1.0F);
                    lastWalkDist = player.walkDist;
                }
            } else if (!player.onGround()) {
                lastWalkDist = player.walkDist;
            }
        }
    }
}

