// package com.example.stonearmorforu;

package com.example.armorforu;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.core.Holder;

public class ModItems {

    // Registering items using DeferredRegister
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "armorforu");

    // Registering the stone armor items with the new StoneArmorMaterial
    public static final RegistryObject<Item> COBBLESTONE_HELMET = ITEMS.register("cobblestone_helmet", 
        () -> new ArmorItem(Holder.direct(ArmorForuMaterial.COBBLESTONE_ARMOR), ArmorItem.Type.HELMET, new Item.Properties())
    );
    
    public static final RegistryObject<Item> COBBLESTONE_CHESTPLATE = ITEMS.register("cobblestone_chestplate", 
        () -> new ArmorItem(Holder.direct(ArmorForuMaterial.COBBLESTONE_ARMOR), ArmorItem.Type.CHESTPLATE, new Item.Properties())
    );
    
    public static final RegistryObject<Item> COBBLESTONE_LEGGINGS = ITEMS.register("cobblestone_leggings", 
        () -> new ArmorItem(Holder.direct(ArmorForuMaterial.COBBLESTONE_ARMOR), ArmorItem.Type.LEGGINGS, new Item.Properties())
    );
    
    public static final RegistryObject<Item> COBBLESTONE_BOOTS = ITEMS.register("cobblestone_boots", 
        () -> new ArmorItem(Holder.direct(ArmorForuMaterial.COBBLESTONE_ARMOR), ArmorItem.Type.BOOTS, new Item.Properties())
    );

    public static final RegistryObject<Item> COBBLEDDEEPSLATE_HELMET = ITEMS.register("cobbleddeepslate_helmet", 
        () -> new ArmorItem(Holder.direct(ArmorForuMaterial.COBBLEDDEEPSLATE_ARMOR), ArmorItem.Type.HELMET, new Item.Properties())
    );
    
    public static final RegistryObject<Item> COBBLEDDEEPSLATE_CHESTPLATE = ITEMS.register("cobbleddeepslate_chestplate", 
        () -> new ArmorItem(Holder.direct(ArmorForuMaterial.COBBLEDDEEPSLATE_ARMOR), ArmorItem.Type.CHESTPLATE, new Item.Properties())
    );
    
    public static final RegistryObject<Item> COBBLEDDEEPSLATE_LEGGINGS = ITEMS.register("cobbleddeepslate_leggings", 
        () -> new ArmorItem(Holder.direct(ArmorForuMaterial.COBBLEDDEEPSLATE_ARMOR), ArmorItem.Type.LEGGINGS, new Item.Properties())
    );
    
    public static final RegistryObject<Item> COBBLEDDEEPSLATE_BOOTS = ITEMS.register("cobbleddeepslate_boots", 
        () -> new ArmorItem(Holder.direct(ArmorForuMaterial.COBBLEDDEEPSLATE_ARMOR), ArmorItem.Type.BOOTS, new Item.Properties())
    );

    // Method to register items to the event bus
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
