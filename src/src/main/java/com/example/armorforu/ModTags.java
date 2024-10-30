package com.example.armorforu;

import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.registries.ForgeRegistries;

public class ModTags {
    public static class Items {
        public static final TagKey<Item> COPPER_ARMOR_LIGHTLY_OXIDIZED = TagKey.create(ForgeRegistries.ITEMS.getRegistryKey(), new ResourceLocation("armorforu", "copper_armor_lightly_oxidized"));
        public static final TagKey<Item> COPPER_ARMOR_SEMI_OXIDIZED = TagKey.create(ForgeRegistries.ITEMS.getRegistryKey(), new ResourceLocation("armorforu", "copper_armor_semi_oxidized"));
        public static final TagKey<Item> COPPER_ARMOR_FULLY_OXIDIZED = TagKey.create(ForgeRegistries.ITEMS.getRegistryKey(), new ResourceLocation("armorforu", "copper_armor_fully_oxidized"));
    }
}

