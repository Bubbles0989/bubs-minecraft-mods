package com.example.stonearmorforu;

import net.minecraftforge.fml.common.Mod;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(StoneArmorMod.MODID)
public class StoneArmorMod {
    
    public static final String MODID = "stonearmorforu";

    public StoneArmorMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::onClientSetup);
        modEventBus.addListener(ModEventSubscriber::onBuildCreativeModeTabContents);

        ModItems.register(modEventBus);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, new ResourceLocation("stonearmorforu", "stonearmor"), ModCreativeTabs.STONE_ARMOR_TAB);
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // Do something when the server starts
    }

    @SubscribeEvent
    public void onClientSetup(FMLClientSetupEvent event) {
        // Do something on client setup
    }
    
}