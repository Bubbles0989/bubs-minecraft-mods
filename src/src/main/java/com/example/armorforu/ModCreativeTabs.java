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
        })
        .build();
}
