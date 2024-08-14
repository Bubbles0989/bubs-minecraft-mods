package com.example.stonearmorforu;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "stonearmorforu", bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeTabs {

    public static final CreativeModeTab STONE_ARMOR_TAB = CreativeModeTab.builder()
        .title(Component.translatable("creativetab.stonearmor"))
        .icon(() -> new ItemStack(ModItems.STONE_HELMET.get()))
        .displayItems((parameters, output) -> {
            output.accept(ModItems.STONE_HELMET.get());
            output.accept(ModItems.STONE_CHESTPLATE.get());
            output.accept(ModItems.STONE_LEGGINGS.get());
            output.accept(ModItems.STONE_BOOTS.get());
        })
        .build();

}
