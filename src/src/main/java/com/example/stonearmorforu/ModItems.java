// package com.example.stonearmorforu;

package com.example.stonearmorforu;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.core.Holder;

public class ModItems {

    // Registering items using DeferredRegister
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "stonearmorforu");

    // Registering the stone armor items with the new StoneArmorMaterial
    public static final RegistryObject<Item> STONE_HELMET = ITEMS.register("stone_helmet", 
        () -> new ArmorItem(Holder.direct(StoneArmorMaterial.STONE_ARMOR), ArmorItem.Type.HELMET, new Item.Properties())
    );
    
    public static final RegistryObject<Item> STONE_CHESTPLATE = ITEMS.register("stone_chestplate", 
        () -> new ArmorItem(Holder.direct(StoneArmorMaterial.STONE_ARMOR), ArmorItem.Type.CHESTPLATE, new Item.Properties())
    );
    
    public static final RegistryObject<Item> STONE_LEGGINGS = ITEMS.register("stone_leggings", 
        () -> new ArmorItem(Holder.direct(StoneArmorMaterial.STONE_ARMOR), ArmorItem.Type.LEGGINGS, new Item.Properties())
    );
    
    public static final RegistryObject<Item> STONE_BOOTS = ITEMS.register("stone_boots", 
        () -> new ArmorItem(Holder.direct(StoneArmorMaterial.STONE_ARMOR), ArmorItem.Type.BOOTS, new Item.Properties())
    );

    // Method to register items to the event bus
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
