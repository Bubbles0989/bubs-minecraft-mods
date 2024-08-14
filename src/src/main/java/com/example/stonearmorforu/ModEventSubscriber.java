// package com.example.stonearmorforu;

// import net.minecraft.world.item.CreativeModeTab;
// import net.minecraftforge.api.distmarker.Dist;
// import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
// import net.minecraftforge.eventbus.api.SubscribeEvent;
// import net.minecraftforge.fml.common.Mod;
// import net.minecraft.core.registries.BuiltInRegistries;
// import net.minecraft.resources.ResourceKey;
// import net.minecraft.resources.ResourceLocation;

// @Mod.EventBusSubscriber(modid = StoneArmorMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
// public class ModEventSubscriber {

//     @SubscribeEvent
//     public static void onBuildCreativeModeTabContents(BuildCreativeModeTabContentsEvent event) {
//         CreativeModeTab eventTab = event.getTab();
//         CreativeModeTab stonearmorTab = ModCreativeTabs.STONE_ARMOR_TAB;
//         ResourceLocation eventTabLocation = getResourceLocation(eventTab);
//         ResourceLocation stonearmorTabLocation = getResourceLocation(stonearmorTab);
        
//         if (eventTabLocation.equals(stonearmorTabLocation)) {
//             event.accept(ModItems.STONE_HELMET.get());
//             event.accept(ModItems.STONE_CHESTPLATE.get());
//             event.accept(ModItems.STONE_LEGGINGS.get());
//             event.accept(ModItems.STONE_BOOTS.get());
//         }
//     }

//     public static ResourceLocation getResourceLocation(CreativeModeTab tab) {
//         ResourceKey<CreativeModeTab> tabKey = BuiltInRegistries.CREATIVE_MODE_TAB.getResourceKey(tab).orElseThrow(
//             () -> new IllegalStateException("Unregistered creative tab: " + tab)
//         );

//         net.minecraft.resources.ResourceLocation tabId = tabKey.location();
        
//         return tabId;
//     }


// }
