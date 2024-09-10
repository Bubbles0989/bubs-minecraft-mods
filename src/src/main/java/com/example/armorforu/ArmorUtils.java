package com.example.armorforu;

import org.jetbrains.annotations.NotNull;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;

public class ArmorUtils {

    public static boolean isWearingCobblestoneArmor(Player player) {
        return isWearingSpecificArmor(player, ModItems.COBBLESTONE_HELMET.get(), ModItems.COBBLESTONE_CHESTPLATE.get(),
                ModItems.COBBLESTONE_LEGGINGS.get(), ModItems.COBBLESTONE_BOOTS.get());
    }

    public static boolean isWearingCobbledDeepslateArmor(Player player) {
        return isWearingSpecificArmor(player, ModItems.COBBLEDDEEPSLATE_HELMET.get(), ModItems.COBBLEDDEEPSLATE_CHESTPLATE.get(),
                ModItems.COBBLEDDEEPSLATE_LEGGINGS.get(), ModItems.COBBLEDDEEPSLATE_BOOTS.get());
    }

    public static boolean isWearingNetherrackArmor(Player player) {
        return isWearingSpecificArmor(player, ModItems.NETHERRACK_HELMET.get(), ModItems.NETHERRACK_CHESTPLATE.get(),
                ModItems.NETHERRACK_LEGGINGS.get(), ModItems.NETHERRACK_BOOTS.get());
    }

    public static boolean isWearingNetherbrickArmor(Player player) {
        return isWearingSpecificArmor(player, ModItems.NETHERBRICK_HELMET.get(), ModItems.NETHERBRICK_CHESTPLATE.get(),
                ModItems.NETHERBRICK_LEGGINGS.get(), ModItems.NETHERBRICK_BOOTS.get());
    }

    public static boolean isWearingGlassArmor(Player player) {
        return isWearingSpecificArmor(player, ModItems.GLASS_HELMET.get(), ModItems.GLASS_CHESTPLATE.get(),
                ModItems.GLASS_LEGGINGS.get(), ModItems.GLASS_BOOTS.get());
    }

    public static boolean isWearingAmethystArmor(Player player) {
        return isWearingSpecificArmor(player, ModItems.AMETHYST_HELMET.get(), ModItems.AMETHYST_CHESTPLATE.get(),
                ModItems.AMETHYST_LEGGINGS.get(), ModItems.AMETHYST_BOOTS.get());
    }

    public static boolean isWearingTorchHelmetArmor(Player player) {
        return player.getItemBySlot(EquipmentSlot.HEAD).getItem() == ModItems.TORCH_HELMET.get();
    }

    private static boolean isWearingSpecificArmor(Player player, @NotNull Item item, @NotNull Item item2, @NotNull Item item3, @NotNull Item item4) {
        return player.getItemBySlot(EquipmentSlot.HEAD).getItem() == item.asItem() &&
               player.getItemBySlot(EquipmentSlot.CHEST).getItem() == item2.asItem() &&
               player.getItemBySlot(EquipmentSlot.LEGS).getItem() == item3.asItem() &&
               player.getItemBySlot(EquipmentSlot.FEET).getItem() == item4.asItem();
    }
}
