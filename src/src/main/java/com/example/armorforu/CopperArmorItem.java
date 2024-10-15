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
    private static final int TICKS_PER_STAGE = 20 * 60 * 10;

    public CopperArmorItem(Holder<ArmorMaterial> material, Type slot, Properties properties) {
        super(material, slot, properties);
    }

    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
        Player player = event.player;
        for (ItemStack armorPiece : player.getArmorSlots()) {
            if (armorPiece.getItem() instanceof CopperArmorItem) {
                CompoundTag nbt = (CompoundTag) armorPiece.getTags();
                int wearTime = nbt.getInt(WEAR_TIME_KEY);

                wearTime++;
                nbt.putInt(WEAR_TIME_KEY, wearTime);

                updateTexture(armorPiece, wearTime);
            }
        }
    }

    private static void updateTexture(ItemStack armorPiece, int wearTime) {
        int stage = wearTime / TICKS_PER_STAGE;

        if (stage >= 3) {
            setCustomTexture(armorPiece, "copper_fully_weathered");
        } else if (stage == 2) {
            setCustomTexture(armorPiece, "copper_semi_weathered");
        } else if (stage == 1) {
            setCustomTexture(armorPiece, "copper_lightly_weathered");
        } else {
            setCustomTexture(armorPiece, "copper_normal");
        }
    }

    private static void setCustomTexture(ItemStack armorPiece, String textureName) {
        CompoundTag nbt = (CompoundTag) armorPiece.getTags();
        nbt.putString("CustomTexture", textureName);
    }

    @OverrideOnly
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
        CompoundTag nbt = (CompoundTag) stack.getTags();
        String texture = nbt.getString("CustomTexture");

        if (texture.isEmpty()) {
            texture = "copper_normal";
        }

        return String.format("modid:textures/models/armor/%s_layer_%d.png", texture, slot == EquipmentSlot.LEGS ? 2 : 1);
    }

}

