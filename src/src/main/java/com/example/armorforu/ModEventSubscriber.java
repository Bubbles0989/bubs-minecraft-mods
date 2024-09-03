package com.example.armorforu;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;

@Mod.EventBusSubscriber(modid = ArmorMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventSubscriber {

    @SubscribeEvent
    public static void onBuildCreativeModeTabContents(BuildCreativeModeTabContentsEvent event) {
        CreativeModeTab eventTab = event.getTab();
        CreativeModeTab armorTab = ModCreativeTabs.ARMORFORU_TAB;
        ResourceLocation eventTabLocation = getResourceLocation(eventTab);
        ResourceLocation armorTabLocation = getResourceLocation(armorTab);
        
        if (eventTabLocation.equals(armorTabLocation)) {
            event.accept(ModItems.COBBLESTONE_HELMET.get());
            event.accept(ModItems.COBBLESTONE_CHESTPLATE.get());
            event.accept(ModItems.COBBLESTONE_LEGGINGS.get());
            event.accept(ModItems.COBBLESTONE_BOOTS.get());
            event.accept(ModItems.COBBLEDDEEPSLATE_HELMET.get());
            event.accept(ModItems.COBBLEDDEEPSLATE_CHESTPLATE.get());
            event.accept(ModItems.COBBLEDDEEPSLATE_LEGGINGS.get());
            event.accept(ModItems.COBBLEDDEEPSLATE_BOOTS.get());
            event.accept(ModItems.NETHERRACK_HELMET.get());
            event.accept(ModItems.NETHERRACK_CHESTPLATE.get());
            event.accept(ModItems.NETHERRACK_LEGGINGS.get());
            event.accept(ModItems.NETHERRACK_BOOTS.get());
            event.accept(ModItems.TORCH_HELMET.get());
        }
    }
    
    public static ResourceLocation getResourceLocation(CreativeModeTab tab) {
        ResourceKey<CreativeModeTab> tabKey = BuiltInRegistries.CREATIVE_MODE_TAB.getResourceKey(tab).orElseThrow(
            () -> new IllegalStateException("Unregistered creative tab: " + tab)
        );

        net.minecraft.resources.ResourceLocation tabId = tabKey.location();
        
        return tabId;
    }
}