package com.example.armorforu;

import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ArmorMod.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ClientSetup {
    @SubscribeEvent
    public static void setup() {
        ItemProperties.register(ModItems.COPPER_HELMET.get(),
            new ResourceLocation("oxidation_level"),
            (stack, world, entity, seed) -> {
                if (stack.getItem() instanceof CopperArmorItem copperArmor) {
                    return copperArmor.getOxidationLevel(stack);
                }
                return 0;
            });

        ItemProperties.register(ModItems.COPPER_CHESTPLATE.get(),
            new ResourceLocation("oxidation_level"),
            (stack, world, entity, seed) -> {
                if (stack.getItem() instanceof CopperArmorItem copperArmor) {
                    return copperArmor.getOxidationLevel(stack);
                }
                return 0;
            });

        ItemProperties.register(ModItems.COPPER_LEGGINGS.get(),
            new ResourceLocation("oxidation_level"),
            (stack, world, entity, seed) -> {
                if (stack.getItem() instanceof CopperArmorItem copperArmor) {
                    return copperArmor.getOxidationLevel(stack);
                }
                return 0;
            });

        ItemProperties.register(ModItems.COPPER_BOOTS.get(),
            new ResourceLocation("oxidation_level"),
            (stack, world, entity, seed) -> {
                if (stack.getItem() instanceof CopperArmorItem copperArmor) {
                    return copperArmor.getOxidationLevel(stack);
                }
                return 0;
            });
    }
}

