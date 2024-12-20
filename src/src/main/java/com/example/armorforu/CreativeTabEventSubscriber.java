package com.example.armorforu;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;

@Mod.EventBusSubscriber(modid = ArmorMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CreativeTabEventSubscriber {

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
            event.accept(ModItems.NETHERBRICK_HELMET.get());
            event.accept(ModItems.NETHERBRICK_CHESTPLATE.get());
            event.accept(ModItems.NETHERBRICK_LEGGINGS.get());
            event.accept(ModItems.NETHERBRICK_BOOTS.get());
            event.accept(ModItems.GLASS_HELMET.get());
            event.accept(ModItems.GLASS_CHESTPLATE.get());
            event.accept(ModItems.GLASS_LEGGINGS.get());
            event.accept(ModItems.GLASS_BOOTS.get());
            event.accept(ModItems.AMETHYST_HELMET.get());
            event.accept(ModItems.AMETHYST_CHESTPLATE.get());
            event.accept(ModItems.AMETHYST_LEGGINGS.get());
            event.accept(ModItems.AMETHYST_BOOTS.get());
            event.accept(ModItems.LAPIS_HELMET.get());
            event.accept(ModItems.LAPIS_CHESTPLATE.get());
            event.accept(ModItems.LAPIS_LEGGINGS.get());
            event.accept(ModItems.LAPIS_BOOTS.get());
            event.accept(ModItems.EMERALD_HELMET.get());
            event.accept(ModItems.EMERALD_CHESTPLATE.get());
            event.accept(ModItems.EMERALD_LEGGINGS.get());
            event.accept(ModItems.EMERALD_BOOTS.get());
            event.accept(ModItems.QUARTZ_HELMET.get());
            event.accept(ModItems.QUARTZ_CHESTPLATE.get());
            event.accept(ModItems.QUARTZ_LEGGINGS.get());
            event.accept(ModItems.QUARTZ_BOOTS.get());
            event.accept(ModItems.COAL_HELMET.get());
            event.accept(ModItems.COAL_CHESTPLATE.get());
            event.accept(ModItems.COAL_LEGGINGS.get());
            event.accept(ModItems.COAL_BOOTS.get());
            event.accept(ModItems.COPPER_HELMET.get());
            event.accept(ModItems.COPPER_CHESTPLATE.get());
            event.accept(ModItems.COPPER_LEGGINGS.get());
            event.accept(ModItems.COPPER_BOOTS.get());
            event.accept(createCopperArmorWithOxidation(ModItems.COPPER_HELMET.get(), 1));
            event.accept(createCopperArmorWithOxidation(ModItems.COPPER_HELMET.get(), 2));
            event.accept(createCopperArmorWithOxidation(ModItems.COPPER_HELMET.get(), 3));
            event.accept(ModItems.TORCH_HELMET.get());
        }
    }

    private static ItemStack createCopperArmorWithOxidation(Item item, int oxidationLevel) {
        ItemStack itemStack = new ItemStack(item);
        ((CopperArmorItem) itemStack.getItem()).setOxidationLevel(itemStack, oxidationLevel);
        return itemStack;
    }    
    
    public static ResourceLocation getResourceLocation(CreativeModeTab tab) {
        ResourceKey<CreativeModeTab> tabKey = BuiltInRegistries.CREATIVE_MODE_TAB.getResourceKey(tab).orElseThrow(
            () -> new IllegalStateException("Unregistered creative tab: " + tab)
        );

        net.minecraft.resources.ResourceLocation tabId = tabKey.location();
        
        return tabId;
    }
}