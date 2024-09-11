package com.example.armorforu;

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

@Mod(ArmorMod.MODID)
public class ArmorMod {
    
    public static final String MODID = "armorforu";

    public ArmorMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::onClientSetup);
        modEventBus.addListener(CreativeTabEventSubscriber::onBuildCreativeModeTabContents);

        ModItems.register(modEventBus);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, new ResourceLocation("armorforu", "armorforu"), ModCreativeTabs.ARMORFORU_TAB);
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