package com.example.armorforu;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "armorforu", bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeTabs {

    public static final CreativeModeTab ARMORFORU_TAB = CreativeModeTab.builder()
        .title(Component.translatable("creativetab.armorforu"))
        .icon(() -> new ItemStack(ModItems.COBBLESTONE_CHESTPLATE.get()))
        .displayItems((parameters, output) -> {
            output.accept(ModItems.COBBLESTONE_HELMET.get());
            output.accept(ModItems.COBBLESTONE_CHESTPLATE.get());
            output.accept(ModItems.COBBLESTONE_LEGGINGS.get());
            output.accept(ModItems.COBBLESTONE_BOOTS.get());
            output.accept(ModItems.COBBLEDDEEPSLATE_HELMET.get());
            output.accept(ModItems.COBBLEDDEEPSLATE_CHESTPLATE.get());
            output.accept(ModItems.COBBLEDDEEPSLATE_LEGGINGS.get());
            output.accept(ModItems.COBBLEDDEEPSLATE_BOOTS.get());
            output.accept(ModItems.NETHERRACK_HELMET.get());
            output.accept(ModItems.NETHERRACK_CHESTPLATE.get());
            output.accept(ModItems.NETHERRACK_LEGGINGS.get());
            output.accept(ModItems.NETHERRACK_BOOTS.get());
            output.accept(ModItems.NETHERBRICK_HELMET.get());
            output.accept(ModItems.NETHERBRICK_CHESTPLATE.get());
            output.accept(ModItems.NETHERBRICK_LEGGINGS.get());
            output.accept(ModItems.NETHERBRICK_BOOTS.get());
            output.accept(ModItems.GLASS_HELMET.get());
            output.accept(ModItems.GLASS_CHESTPLATE.get());
            output.accept(ModItems.GLASS_LEGGINGS.get());
            output.accept(ModItems.GLASS_BOOTS.get());
            output.accept(ModItems.AMETHYST_HELMET.get());
            output.accept(ModItems.AMETHYST_CHESTPLATE.get());
            output.accept(ModItems.AMETHYST_LEGGINGS.get());
            output.accept(ModItems.AMETHYST_BOOTS.get());
            output.accept(ModItems.LAPIS_HELMET.get());
            output.accept(ModItems.LAPIS_CHESTPLATE.get());
            output.accept(ModItems.LAPIS_LEGGINGS.get());
            output.accept(ModItems.LAPIS_BOOTS.get());
            output.accept(ModItems.EMERALD_HELMET.get());
            output.accept(ModItems.EMERALD_CHESTPLATE.get());
            output.accept(ModItems.EMERALD_LEGGINGS.get());
            output.accept(ModItems.EMERALD_BOOTS.get());
            output.accept(ModItems.QUARTZ_HELMET.get());
            output.accept(ModItems.QUARTZ_CHESTPLATE.get());
            output.accept(ModItems.QUARTZ_LEGGINGS.get());
            output.accept(ModItems.QUARTZ_BOOTS.get());
            output.accept(ModItems.COAL_HELMET.get());
            output.accept(ModItems.COAL_CHESTPLATE.get());
            output.accept(ModItems.COAL_LEGGINGS.get());
            output.accept(ModItems.COAL_BOOTS.get());
            output.accept(ModItems.COPPER_HELMET.get());
            output.accept(ModItems.COPPER_CHESTPLATE.get());
            output.accept(ModItems.COPPER_LEGGINGS.get());
            output.accept(ModItems.COPPER_BOOTS.get());
            output.accept(ModItems.TORCH_HELMET.get());
        })
        .build();
}
