
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


public class ArmorForuMaterial{

    public static final ArmorMaterial COBBLESTONE_ARMOR = new ArmorMaterial(
        Map.of(
            ArmorItem.Type.HELMET, 2,
            ArmorItem.Type.CHESTPLATE, 5,
            ArmorItem.Type.LEGGINGS, 6,
            ArmorItem.Type.BOOTS, 2
        ),
        25, 
        Holder.direct(SoundEvents.STONE_BREAK), 
        () -> Ingredient.of(Items.COBBLESTONE),
        List.of(
        new ArmorMaterial.Layer(new ResourceLocation("armorforu", "cobblestone"))),
        0.0F, 
        0.0F
    );

    public static final ArmorMaterial COBBLEDDEEPSLATE_ARMOR = new ArmorMaterial(
        Map.of(
            ArmorItem.Type.HELMET, 3,
            ArmorItem.Type.CHESTPLATE, 6,
            ArmorItem.Type.LEGGINGS, 7,
            ArmorItem.Type.BOOTS, 3
        ),
        25, 
        Holder.direct(SoundEvents.DEEPSLATE_BREAK), 
        () -> Ingredient.of(Items.COBBLED_DEEPSLATE),
        List.of(
        new ArmorMaterial.Layer(new ResourceLocation("armorforu", "cobbleddeepslate"))),
        0.0F, 
        0.0F
    );

    public static final ArmorMaterial NETHERRACK_ARMOR = new ArmorMaterial(
        Map.of(
            ArmorItem.Type.HELMET, 2,
            ArmorItem.Type.CHESTPLATE, 2,
            ArmorItem.Type.LEGGINGS, 2,
            ArmorItem.Type.BOOTS, 2
        ),
        25, 
        Holder.direct(SoundEvents.NETHERRACK_PLACE),
        () -> Ingredient.of(Items.NETHERRACK),
        List.of(
        new ArmorMaterial.Layer(new ResourceLocation("armorforu", "netherrack"))),
        0.0F, 
        0.0F
    );

    public static final ArmorMaterial NETHERBRICK_ARMOR = new ArmorMaterial(
        Map.of(
            ArmorItem.Type.HELMET, 4,
            ArmorItem.Type.CHESTPLATE, 7,
            ArmorItem.Type.LEGGINGS, 8,
            ArmorItem.Type.BOOTS, 4
        ),
        25, 
        Holder.direct(SoundEvents.NETHER_BRICKS_STEP),
        () -> Ingredient.of(Items.NETHER_BRICK),
        List.of(
        new ArmorMaterial.Layer(new ResourceLocation("armorforu", "netherbrick"))),
        0.0F, 
        0.0F
    );

    public static final ArmorMaterial GLASS_ARMOR = new ArmorMaterial(
        Map.of(
            ArmorItem.Type.HELMET, 1,
            ArmorItem.Type.CHESTPLATE, 2,
            ArmorItem.Type.LEGGINGS, 3,
            ArmorItem.Type.BOOTS, 1
        ),
        25, 
        Holder.direct(SoundEvents.GLASS_STEP),
        () -> Ingredient.of(Items.GLASS),
        List.of(
        new ArmorMaterial.Layer(new ResourceLocation("armorforu", "glass"))),
        0.0F, 
        0.0F
    );

    public static final ArmorMaterial AMETHYST_ARMOR = new ArmorMaterial(
        Map.of(
            ArmorItem.Type.HELMET, 2,
            ArmorItem.Type.CHESTPLATE, 5,
            ArmorItem.Type.LEGGINGS, 6,
            ArmorItem.Type.BOOTS, 2
        ),
        25, 
        Holder.direct(SoundEvents.AMETHYST_BLOCK_CHIME),
        () -> Ingredient.of(Items.AMETHYST_SHARD),
        List.of(
        new ArmorMaterial.Layer(new ResourceLocation("armorforu", "amethyst"))),
        0.0F, 
        0.0F
    );

    public static final ArmorMaterial LAPIS_ARMOR = new ArmorMaterial(
        Map.of(
            ArmorItem.Type.HELMET, 2,
            ArmorItem.Type.CHESTPLATE, 5,
            ArmorItem.Type.LEGGINGS, 6,
            ArmorItem.Type.BOOTS, 2
        ),
        25, 
        Holder.direct(SoundEvents.ENCHANTMENT_TABLE_USE),
        () -> Ingredient.of(Items.LAPIS_LAZULI),
        List.of(
        new ArmorMaterial.Layer(new ResourceLocation("armorforu", "lapis"))),
        0.0F, 
        0.0F
    );

    public static final ArmorMaterial EMERALD_ARMOR = new ArmorMaterial(
        Map.of(
            ArmorItem.Type.HELMET, 2,
            ArmorItem.Type.CHESTPLATE, 5,
            ArmorItem.Type.LEGGINGS, 6,
            ArmorItem.Type.BOOTS, 2
        ),
        25, 
        Holder.direct(SoundEvents.VILLAGER_CELEBRATE),
        () -> Ingredient.of(Items.EMERALD),
        List.of(
        new ArmorMaterial.Layer(new ResourceLocation("armorforu", "emerald"))),
        0.0F, 
        0.0F
    );

    public static final ArmorMaterial TORCH_ARMOR = new ArmorMaterial(
        Map.of(
            ArmorItem.Type.HELMET, 5
        ),
        25, 
        Holder.direct(SoundEvents.STONE_BUTTON_CLICK_ON),
        () -> Ingredient.of(Items.TORCH),
        List.of(
        new ArmorMaterial.Layer(new ResourceLocation("armorforu", "torch"))),
        0.0F, 
        0.0F
    );

    public static int getDurabilityForSlot(EquipmentSlot slot) {
        int[] BASE_DURABILITY = {11, 16, 15, 13};
        return BASE_DURABILITY[slot.getIndex()] * 15;
    }
}

