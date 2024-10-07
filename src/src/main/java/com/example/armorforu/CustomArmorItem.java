package com.example.armorforu;

import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.tags.ItemTags;

public class CustomArmorItem extends ArmorItem {

    public CustomArmorItem(Holder<ArmorMaterial> material, Type slot, Item.Properties properties) {
        super(material, slot, properties);
    }

    @Override
    public boolean canApplyAtEnchantingTable(ItemStack stack, Enchantment enchantment) {
        if (stack.is(ItemTags.create(new ResourceLocation("armorforu", "armor_enchantable")))) {
            return true;
        }
        return super.canApplyAtEnchantingTable(stack, enchantment);
    }
}

