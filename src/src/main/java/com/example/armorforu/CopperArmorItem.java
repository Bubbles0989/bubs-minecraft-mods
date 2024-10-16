package com.example.armorforu;

import org.jetbrains.annotations.ApiStatus.OverrideOnly;

import net.minecraft.core.Holder;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class CopperArmorItem extends CustomArmorItem {
    private static final String WEAR_TIME_KEY = "WearTime";
    private static final String OXIDATION_LEVEL_KEY = "OxidationLevel";
    private static final int TICKS_PER_STAGE = 20 * 60 * 10; 

    public CopperArmorItem(Holder<ArmorMaterial> material, Type slot, Properties properties) {
        super(material, slot, properties);
    }

    public int getOxidationLevel(ItemStack stack) {
        CompoundTag nbt = (CompoundTag) stack.getTags();
        return nbt.getInt(OXIDATION_LEVEL_KEY);
    }

    public void setOxidationLevel(ItemStack stack, int level) {
        CompoundTag nbt = (CompoundTag) stack.getTags();
        nbt.putInt(OXIDATION_LEVEL_KEY, Math.min(3, Math.max(0, level)));
    }

    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
        Player player = event.player;

        for (ItemStack armorPiece : player.getArmorSlots()) {
            if (armorPiece.getItem() instanceof CopperArmorItem copperArmor) {
                CompoundTag nbt = (CompoundTag) armorPiece.getTags();
                int wearTime = nbt.getInt(WEAR_TIME_KEY);

                wearTime++;
                nbt.putInt(WEAR_TIME_KEY, wearTime);

                copperArmor.updateOxidationLevel(armorPiece, wearTime);
            }
        }
    }

    private void updateOxidationLevel(ItemStack armorPiece, int wearTime) {
        int stage = wearTime / TICKS_PER_STAGE;
        setOxidationLevel(armorPiece, Math.min(stage, 3));
    }

    @OverrideOnly
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
        int oxidationLevel = getOxidationLevel(stack);

        String textureName;
        switch (oxidationLevel) {
            case 3: textureName = "copper_fully_weathered"; break;
            case 2: textureName = "copper_semi_weathered"; break;
            case 1: textureName = "copper_lightly_weathered"; break;
            default: textureName = "copper_normal"; break;
        }

        return String.format("modid:textures/models/armor/%s_layer_%d.png", textureName, slot == EquipmentSlot.LEGS ? 2 : 1);
    }
}
