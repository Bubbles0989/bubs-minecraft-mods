package com.example.armorforu;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "armorforu", bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeTabs {

    public static final CreativeModeTab COBBLESTONE_ARMOR_TAB = CreativeModeTab.builder()
        .title(Component.translatable("creativetab.stonearmor"))
        .icon(() -> new ItemStack(ModItems.COBBLESTONE_HELMET.get()))
        .displayItems((parameters, output) -> {
            output.accept(ModItems.COBBLESTONE_HELMET.get());
            output.accept(ModItems.COBBLESTONE_CHESTPLATE.get());
            output.accept(ModItems.COBBLESTONE_LEGGINGS.get());
            output.accept(ModItems.COBBLESTONE_BOOTS.get());
        })
        .build();

}
