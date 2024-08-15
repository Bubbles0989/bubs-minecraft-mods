// package com.example.stonearmorforu;

package com.example.armorforu;

import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Items;

import java.util.Map;
import java.util.List;

public class ArmorForuMaterial {

    public static final ArmorMaterial COBBLESTONE_ARMOR = new ArmorMaterial(
        Map.of(
            ArmorItem.Type.HELMET, 2,
            ArmorItem.Type.CHESTPLATE, 5,
            ArmorItem.Type.LEGGINGS, 6,
            ArmorItem.Type.BOOTS, 2
        ),
        9, 
        Holder.direct(SoundEvents.STONE_BREAK), // Use appropriate sound event
        () -> Ingredient.of(Items.COBBLESTONE),
        List.of(
        new ArmorMaterial.Layer(new ResourceLocation("armorforu", "cobblestone"))),
        0.0F, 
        0.0F
    );

    public static final ArmorMaterial COBBLEDDEEPSLATE_ARMOR = new ArmorMaterial(
        Map.of(
            ArmorItem.Type.HELMET, 4,
            ArmorItem.Type.CHESTPLATE, 10,
            ArmorItem.Type.LEGGINGS, 12,
            ArmorItem.Type.BOOTS, 4
        ),
        9, 
        Holder.direct(SoundEvents.DEEPSLATE_BREAK), // Use appropriate sound event
        () -> Ingredient.of(Items.COBBLED_DEEPSLATE),
        List.of(
        new ArmorMaterial.Layer(new ResourceLocation("armorforu", "cobbleddeepslate"))),
        0.0F, 
        0.0F
    );

    public static int getDurabilityForSlot(EquipmentSlot slot) {
        int[] BASE_DURABILITY = {1, 3, 2, 1};
        return BASE_DURABILITY[slot.getIndex()] * 15;
    }
}

