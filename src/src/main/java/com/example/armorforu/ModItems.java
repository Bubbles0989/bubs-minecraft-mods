// package com.example.stonearmorforu;

package com.example.armorforu;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.Holder;

public class ModItems {

    // Registering items using DeferredRegister

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "armorforu");

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, "armorforu");

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

    public static final RegistryObject<Item> NETHERRACK_HELMET = ITEMS.register("netherrack_helmet", 
        () -> new ArmorItem(Holder.direct(ArmorForuMaterial.NETHERRACK_ARMOR), ArmorItem.Type.HELMET, new Item.Properties())
    );
    
    public static final RegistryObject<Item> NETHERRACK_CHESTPLATE = ITEMS.register("netherrack_chestplate", 
        () -> new ArmorItem(Holder.direct(ArmorForuMaterial.NETHERRACK_ARMOR), ArmorItem.Type.CHESTPLATE, new Item.Properties())
    );
    
    public static final RegistryObject<Item> NETHERRACK_LEGGINGS = ITEMS.register("netherrack_leggings", 
        () -> new ArmorItem(Holder.direct(ArmorForuMaterial.NETHERRACK_ARMOR), ArmorItem.Type.LEGGINGS, new Item.Properties())
    );
    
    public static final RegistryObject<Item> NETHERRACK_BOOTS = ITEMS.register("netherrack_boots", 
        () -> new ArmorItem(Holder.direct(ArmorForuMaterial.NETHERRACK_ARMOR), ArmorItem.Type.BOOTS, new Item.Properties())
    );

    public static final RegistryObject<Item> NETHERBRICK_HELMET = ITEMS.register("netherbrick_helmet", 
        () -> new ArmorItem(Holder.direct(ArmorForuMaterial.NETHERBRICK_ARMOR), ArmorItem.Type.HELMET, new Item.Properties())
    );
    
    public static final RegistryObject<Item> NETHERBRICK_CHESTPLATE = ITEMS.register("netherbrick_chestplate", 
        () -> new ArmorItem(Holder.direct(ArmorForuMaterial.NETHERBRICK_ARMOR), ArmorItem.Type.CHESTPLATE, new Item.Properties())
    );
    
    public static final RegistryObject<Item> NETHERBRICK_LEGGINGS = ITEMS.register("netherbrick_leggings", 
        () -> new ArmorItem(Holder.direct(ArmorForuMaterial.NETHERBRICK_ARMOR), ArmorItem.Type.LEGGINGS, new Item.Properties())
    );
    
    public static final RegistryObject<Item> NETHERBRICK_BOOTS = ITEMS.register("netherbrick_boots", 
        () -> new ArmorItem(Holder.direct(ArmorForuMaterial.NETHERBRICK_ARMOR), ArmorItem.Type.BOOTS, new Item.Properties())
    );

    public static final RegistryObject<Item> AMETHYST_HELMET = ITEMS.register("amethyst_helmet", 
        () -> new ArmorItem(Holder.direct(ArmorForuMaterial.AMETHYST_ARMOR), ArmorItem.Type.HELMET, new Item.Properties())
    );
    
    public static final RegistryObject<Item> AMETHYST_CHESTPLATE = ITEMS.register("amethyst_chestplate", 
        () -> new ArmorItem(Holder.direct(ArmorForuMaterial.AMETHYST_ARMOR), ArmorItem.Type.CHESTPLATE, new Item.Properties())
    );
    
    public static final RegistryObject<Item> AMETHYST_LEGGINGS = ITEMS.register("amethyst_leggings", 
        () -> new ArmorItem(Holder.direct(ArmorForuMaterial.AMETHYST_ARMOR), ArmorItem.Type.LEGGINGS, new Item.Properties())
    );
    
    public static final RegistryObject<Item> AMETHYST_BOOTS = ITEMS.register("amethyst_boots", 
        () -> new ArmorItem(Holder.direct(ArmorForuMaterial.AMETHYST_ARMOR), ArmorItem.Type.BOOTS, new Item.Properties())
    );

    public static final RegistryObject<Item> TORCH_HELMET = ITEMS.register("torch_helmet", 
        () -> new ArmorItem(Holder.direct(ArmorForuMaterial.TORCH_ARMOR), ArmorItem.Type.HELMET, new Item.Properties())
    );

    public static final RegistryObject<Block> FAKE_AIR_BLOCK = BLOCKS.register("fake_air_block", 
        () -> new Block(BlockBehaviour.Properties.of().air().noCollission().noLootTable().lightLevel((state) -> 15)));
    
    // Method to register items to the event bus
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
        BLOCKS.register(eventBus);
    }
}
