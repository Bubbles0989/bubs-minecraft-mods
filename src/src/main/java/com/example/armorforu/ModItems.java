// package com.example.stonearmorforu;

package com.example.armorforu;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;

import org.jetbrains.annotations.ApiStatus.OverrideOnly;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "armorforu");

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, "armorforu");

    public static final RegistryObject<Item> COBBLESTONE_HELMET = ITEMS.register("cobblestone_helmet", 
        () -> new CustomArmorItem(Holder.direct(ArmorForuMaterial.COBBLESTONE_ARMOR), ArmorItem.Type.HELMET,         
        new Item.Properties()
            .stacksTo(1)
            .durability(ArmorForuMaterial.getDurabilityForSlot(EquipmentSlot.HEAD)))
    );
    
    public static final RegistryObject<Item> COBBLESTONE_CHESTPLATE = ITEMS.register("cobblestone_chestplate", 
        () -> new CustomArmorItem(Holder.direct(ArmorForuMaterial.COBBLESTONE_ARMOR), ArmorItem.Type.CHESTPLATE,         
        new Item.Properties()
            .stacksTo(1)
            .durability(ArmorForuMaterial.getDurabilityForSlot(EquipmentSlot.BODY)))
    );
    
    public static final RegistryObject<Item> COBBLESTONE_LEGGINGS = ITEMS.register("cobblestone_leggings", 
        () -> new CustomArmorItem(Holder.direct(ArmorForuMaterial.COBBLESTONE_ARMOR), ArmorItem.Type.LEGGINGS,         
        new Item.Properties()
            .stacksTo(1)
            .durability(ArmorForuMaterial.getDurabilityForSlot(EquipmentSlot.LEGS)))
    );
    
    public static final RegistryObject<Item> COBBLESTONE_BOOTS = ITEMS.register("cobblestone_boots", 
        () -> new CustomArmorItem(Holder.direct(ArmorForuMaterial.COBBLESTONE_ARMOR), ArmorItem.Type.BOOTS,         
        new Item.Properties()
            .stacksTo(1)
            .durability(ArmorForuMaterial.getDurabilityForSlot(EquipmentSlot.FEET)))
    );

    public static final RegistryObject<Item> COBBLEDDEEPSLATE_HELMET = ITEMS.register("cobbleddeepslate_helmet", 
        () -> new CustomArmorItem(Holder.direct(ArmorForuMaterial.COBBLEDDEEPSLATE_ARMOR), ArmorItem.Type.HELMET,         
        new Item.Properties()
            .stacksTo(1)
            .durability(ArmorForuMaterial.getDurabilityForSlot(EquipmentSlot.HEAD)))
    );
    
    public static final RegistryObject<Item> COBBLEDDEEPSLATE_CHESTPLATE = ITEMS.register("cobbleddeepslate_chestplate", 
        () -> new CustomArmorItem(Holder.direct(ArmorForuMaterial.COBBLEDDEEPSLATE_ARMOR), ArmorItem.Type.CHESTPLATE,         
        new Item.Properties()
            .stacksTo(1)
            .durability(ArmorForuMaterial.getDurabilityForSlot(EquipmentSlot.BODY)))
    );
    
    public static final RegistryObject<Item> COBBLEDDEEPSLATE_LEGGINGS = ITEMS.register("cobbleddeepslate_leggings", 
        () -> new CustomArmorItem(Holder.direct(ArmorForuMaterial.COBBLEDDEEPSLATE_ARMOR), ArmorItem.Type.LEGGINGS,         
        new Item.Properties()
            .stacksTo(1)
            .durability(ArmorForuMaterial.getDurabilityForSlot(EquipmentSlot.LEGS)))
    );
    
    public static final RegistryObject<Item> COBBLEDDEEPSLATE_BOOTS = ITEMS.register("cobbleddeepslate_boots", 
        () -> new CustomArmorItem(Holder.direct(ArmorForuMaterial.COBBLEDDEEPSLATE_ARMOR), ArmorItem.Type.BOOTS,         
        new Item.Properties()
            .stacksTo(1)
            .durability(ArmorForuMaterial.getDurabilityForSlot(EquipmentSlot.FEET)))
    );

    public static final RegistryObject<Item> NETHERRACK_HELMET = ITEMS.register("netherrack_helmet", 
        () -> new CustomArmorItem(Holder.direct(ArmorForuMaterial.NETHERRACK_ARMOR), ArmorItem.Type.HELMET,         
        new Item.Properties()
            .stacksTo(1)
            .durability(ArmorForuMaterial.getDurabilityForSlot(EquipmentSlot.HEAD)))
    );
    
    public static final RegistryObject<Item> NETHERRACK_CHESTPLATE = ITEMS.register("netherrack_chestplate", 
        () -> new CustomArmorItem(Holder.direct(ArmorForuMaterial.NETHERRACK_ARMOR), ArmorItem.Type.CHESTPLATE,         
        new Item.Properties()
            .stacksTo(1)
            .durability(ArmorForuMaterial.getDurabilityForSlot(EquipmentSlot.BODY)))
    );
    
    public static final RegistryObject<Item> NETHERRACK_LEGGINGS = ITEMS.register("netherrack_leggings", 
        () -> new CustomArmorItem(Holder.direct(ArmorForuMaterial.NETHERRACK_ARMOR), ArmorItem.Type.LEGGINGS,         
        new Item.Properties()
            .stacksTo(1)
            .durability(ArmorForuMaterial.getDurabilityForSlot(EquipmentSlot.LEGS)))
    );
    
    public static final RegistryObject<Item> NETHERRACK_BOOTS = ITEMS.register("netherrack_boots", 
        () -> new CustomArmorItem(Holder.direct(ArmorForuMaterial.NETHERRACK_ARMOR), ArmorItem.Type.BOOTS,         
        new Item.Properties()
            .stacksTo(1)
            .durability(ArmorForuMaterial.getDurabilityForSlot(EquipmentSlot.FEET)))
    );

    public static final RegistryObject<Item> NETHERBRICK_HELMET = ITEMS.register("netherbrick_helmet", 
        () -> new CustomArmorItem(Holder.direct(ArmorForuMaterial.NETHERBRICK_ARMOR), ArmorItem.Type.HELMET,         
        new Item.Properties()
            .stacksTo(1)
            .durability(ArmorForuMaterial.getDurabilityForSlot(EquipmentSlot.HEAD)))
    );
    
    public static final RegistryObject<Item> NETHERBRICK_CHESTPLATE = ITEMS.register("netherbrick_chestplate", 
        () -> new CustomArmorItem(Holder.direct(ArmorForuMaterial.NETHERBRICK_ARMOR), ArmorItem.Type.CHESTPLATE,         
        new Item.Properties()
            .stacksTo(1)
            .durability(ArmorForuMaterial.getDurabilityForSlot(EquipmentSlot.BODY)))
    );
    
    public static final RegistryObject<Item> NETHERBRICK_LEGGINGS = ITEMS.register("netherbrick_leggings", 
        () -> new CustomArmorItem(Holder.direct(ArmorForuMaterial.NETHERBRICK_ARMOR), ArmorItem.Type.LEGGINGS,         
        new Item.Properties()
            .stacksTo(1)
            .durability(ArmorForuMaterial.getDurabilityForSlot(EquipmentSlot.LEGS)))
    );
    
    public static final RegistryObject<Item> NETHERBRICK_BOOTS = ITEMS.register("netherbrick_boots", 
        () -> new CustomArmorItem(Holder.direct(ArmorForuMaterial.NETHERBRICK_ARMOR), ArmorItem.Type.BOOTS,         
        new Item.Properties()
            .stacksTo(1)
            .durability(ArmorForuMaterial.getDurabilityForSlot(EquipmentSlot.FEET)))
    );

    public static final RegistryObject<Item> GLASS_HELMET = ITEMS.register("glass_helmet", 
        () -> new CustomArmorItem(Holder.direct(ArmorForuMaterial.GLASS_ARMOR), ArmorItem.Type.HELMET,         
        new Item.Properties()
            .stacksTo(1)
            .durability(ArmorForuMaterial.getDurabilityForSlot(EquipmentSlot.HEAD)))
    );
    
    public static final RegistryObject<Item> GLASS_CHESTPLATE = ITEMS.register("glass_chestplate", 
        () -> new CustomArmorItem(Holder.direct(ArmorForuMaterial.GLASS_ARMOR), ArmorItem.Type.CHESTPLATE,         
        new Item.Properties()
            .stacksTo(1)
            .durability(ArmorForuMaterial.getDurabilityForSlot(EquipmentSlot.BODY)))
    );
    
    public static final RegistryObject<Item> GLASS_LEGGINGS = ITEMS.register("glass_leggings", 
        () -> new CustomArmorItem(Holder.direct(ArmorForuMaterial.GLASS_ARMOR), ArmorItem.Type.LEGGINGS,         
        new Item.Properties()
            .stacksTo(1)
            .durability(ArmorForuMaterial.getDurabilityForSlot(EquipmentSlot.LEGS)))
    );
    
    public static final RegistryObject<Item> GLASS_BOOTS = ITEMS.register("glass_boots", 
        () -> new CustomArmorItem(Holder.direct(ArmorForuMaterial.GLASS_ARMOR), ArmorItem.Type.BOOTS,         
        new Item.Properties()
            .stacksTo(1)
            .durability(ArmorForuMaterial.getDurabilityForSlot(EquipmentSlot.FEET)))
    );

    public static final RegistryObject<Item> AMETHYST_HELMET = ITEMS.register("amethyst_helmet", 
        () -> new CustomArmorItem(Holder.direct(ArmorForuMaterial.AMETHYST_ARMOR), ArmorItem.Type.HELMET,         
        new Item.Properties()
            .stacksTo(1)
            .durability(ArmorForuMaterial.getDurabilityForSlot(EquipmentSlot.HEAD)))
    );
    
    public static final RegistryObject<Item> AMETHYST_CHESTPLATE = ITEMS.register("amethyst_chestplate", 
        () -> new CustomArmorItem(Holder.direct(ArmorForuMaterial.AMETHYST_ARMOR), ArmorItem.Type.CHESTPLATE,         
        new Item.Properties()
            .stacksTo(1)
            .durability(ArmorForuMaterial.getDurabilityForSlot(EquipmentSlot.BODY)))
    );
    
    public static final RegistryObject<Item> AMETHYST_LEGGINGS = ITEMS.register("amethyst_leggings", 
        () -> new CustomArmorItem(Holder.direct(ArmorForuMaterial.AMETHYST_ARMOR), ArmorItem.Type.LEGGINGS,         
        new Item.Properties()
            .stacksTo(1)
            .durability(ArmorForuMaterial.getDurabilityForSlot(EquipmentSlot.LEGS)))
    );
    
    public static final RegistryObject<Item> AMETHYST_BOOTS = ITEMS.register("amethyst_boots", 
        () -> new CustomArmorItem(Holder.direct(ArmorForuMaterial.AMETHYST_ARMOR), ArmorItem.Type.BOOTS,         
        new Item.Properties()
            .stacksTo(1)
            .durability(ArmorForuMaterial.getDurabilityForSlot(EquipmentSlot.FEET)))
    );

    public static final RegistryObject<Item> LAPIS_HELMET = ITEMS.register("lapis_helmet", 
        () -> new CustomArmorItem(Holder.direct(ArmorForuMaterial.LAPIS_ARMOR), ArmorItem.Type.HELMET, 
        new Item.Properties()
            .stacksTo(1)
            .durability(ArmorForuMaterial.getDurabilityForSlot(EquipmentSlot.HEAD)))
    );
    
    public static final RegistryObject<Item> LAPIS_CHESTPLATE = ITEMS.register("lapis_chestplate", 
        () -> new CustomArmorItem(Holder.direct(ArmorForuMaterial.LAPIS_ARMOR), ArmorItem.Type.CHESTPLATE, 
        new Item.Properties()
            .stacksTo(1)
            .durability(ArmorForuMaterial.getDurabilityForSlot(EquipmentSlot.BODY)))
    );
    
    public static final RegistryObject<Item> LAPIS_LEGGINGS = ITEMS.register("lapis_leggings", 
        () -> new CustomArmorItem(Holder.direct(ArmorForuMaterial.LAPIS_ARMOR), ArmorItem.Type.LEGGINGS, 
        new Item.Properties()
            .stacksTo(1)
            .durability(ArmorForuMaterial.getDurabilityForSlot(EquipmentSlot.LEGS)))
    );
    
    public static final RegistryObject<Item> LAPIS_BOOTS = ITEMS.register("lapis_boots", 
        () -> new CustomArmorItem(Holder.direct(ArmorForuMaterial.LAPIS_ARMOR), ArmorItem.Type.BOOTS, 
        new Item.Properties()
            .stacksTo(1)
            .durability(ArmorForuMaterial.getDurabilityForSlot(EquipmentSlot.FEET)))
    );

    public static final RegistryObject<Item> EMERALD_HELMET = ITEMS.register("emerald_helmet", 
        () -> new CustomArmorItem(Holder.direct(ArmorForuMaterial.EMERALD_ARMOR), ArmorItem.Type.HELMET, 
        new Item.Properties()
            .stacksTo(1)
            .durability(ArmorForuMaterial.getDurabilityForSlot(EquipmentSlot.HEAD)))
    );
    
    public static final RegistryObject<Item> EMERALD_CHESTPLATE = ITEMS.register("emerald_chestplate", 
        () -> new CustomArmorItem(Holder.direct(ArmorForuMaterial.EMERALD_ARMOR), ArmorItem.Type.CHESTPLATE, 
        new Item.Properties()
            .stacksTo(1)
            .durability(ArmorForuMaterial.getDurabilityForSlot(EquipmentSlot.BODY)))
    );
    
    public static final RegistryObject<Item> EMERALD_LEGGINGS = ITEMS.register("emerald_leggings", 
        () -> new CustomArmorItem(Holder.direct(ArmorForuMaterial.EMERALD_ARMOR), ArmorItem.Type.LEGGINGS, 
        new Item.Properties()
            .stacksTo(1)
            .durability(ArmorForuMaterial.getDurabilityForSlot(EquipmentSlot.LEGS)))
    );
    
    public static final RegistryObject<Item> EMERALD_BOOTS = ITEMS.register("emerald_boots", 
        () -> new CustomArmorItem(Holder.direct(ArmorForuMaterial.EMERALD_ARMOR), ArmorItem.Type.BOOTS, 
        new Item.Properties()
            .stacksTo(1)
            .durability(ArmorForuMaterial.getDurabilityForSlot(EquipmentSlot.FEET)))
    );

    public static final RegistryObject<Item> QUARTZ_HELMET = ITEMS.register("quartz_helmet", 
        () -> new CustomArmorItem(Holder.direct(ArmorForuMaterial.QUARTZ_ARMOR), ArmorItem.Type.HELMET, 
        new Item.Properties()
            .stacksTo(1)
            .durability(ArmorForuMaterial.getDurabilityForSlot(EquipmentSlot.HEAD)))
    );
    
    public static final RegistryObject<Item> QUARTZ_CHESTPLATE = ITEMS.register("quartz_chestplate", 
        () -> new CustomArmorItem(Holder.direct(ArmorForuMaterial.QUARTZ_ARMOR), ArmorItem.Type.CHESTPLATE, 
        new Item.Properties()
            .stacksTo(1)
            .durability(ArmorForuMaterial.getDurabilityForSlot(EquipmentSlot.BODY)))
    );
    
    public static final RegistryObject<Item> QUARTZ_LEGGINGS = ITEMS.register("quartz_leggings", 
        () -> new CustomArmorItem(Holder.direct(ArmorForuMaterial.QUARTZ_ARMOR), ArmorItem.Type.LEGGINGS, 
        new Item.Properties()
            .stacksTo(1)
            .durability(ArmorForuMaterial.getDurabilityForSlot(EquipmentSlot.LEGS)))
    );
    
    public static final RegistryObject<Item> QUARTZ_BOOTS = ITEMS.register("quartz_boots", 
        () -> new CustomArmorItem(Holder.direct(ArmorForuMaterial.QUARTZ_ARMOR), ArmorItem.Type.BOOTS, 
        new Item.Properties()
            .stacksTo(1)
            .durability(ArmorForuMaterial.getDurabilityForSlot(EquipmentSlot.FEET)))
    );

    public static final RegistryObject<Item> COAL_HELMET = ITEMS.register("coal_helmet", 
        () -> new CustomArmorItem(Holder.direct(ArmorForuMaterial.COAL_ARMOR), ArmorItem.Type.HELMET, 
        new Item.Properties()
            .stacksTo(1)
            .durability(ArmorForuMaterial.getDurabilityForSlot(EquipmentSlot.HEAD)))
    );
    
    public static final RegistryObject<Item> COAL_CHESTPLATE = ITEMS.register("coal_chestplate", 
        () -> new CustomArmorItem(Holder.direct(ArmorForuMaterial.COAL_ARMOR), ArmorItem.Type.CHESTPLATE, 
        new Item.Properties()
            .stacksTo(1)
            .durability(ArmorForuMaterial.getDurabilityForSlot(EquipmentSlot.BODY)))
    );
    
    public static final RegistryObject<Item> COAL_LEGGINGS = ITEMS.register("coal_leggings", 
        () -> new CustomArmorItem(Holder.direct(ArmorForuMaterial.COAL_ARMOR), ArmorItem.Type.LEGGINGS, 
        new Item.Properties()
            .stacksTo(1)
            .durability(ArmorForuMaterial.getDurabilityForSlot(EquipmentSlot.LEGS)))
    );
    
    public static final RegistryObject<Item> COAL_BOOTS = ITEMS.register("coal_boots", 
        () -> new CustomArmorItem(Holder.direct(ArmorForuMaterial.COAL_ARMOR), ArmorItem.Type.BOOTS, 
        new Item.Properties()
            .stacksTo(1)
            .durability(ArmorForuMaterial.getDurabilityForSlot(EquipmentSlot.FEET)))
    );
    
    public static final RegistryObject<Item> TORCH_HELMET = ITEMS.register("torch_helmet", 
        () -> new CustomArmorItem(Holder.direct(ArmorForuMaterial.TORCH_ARMOR), ArmorItem.Type.HELMET, 
        new Item.Properties()
            .stacksTo(1)
            .durability(ArmorForuMaterial.getDurabilityForSlot(EquipmentSlot.HEAD))) 
    );
 
    public static final RegistryObject<Block> FAKE_AIR_BLOCK = BLOCKS.register("fake_air_block", 
        () -> new Block(BlockBehaviour.Properties.of().air().noCollission().noOcclusion().lightLevel((state) -> 15)) {
            @OverrideOnly
            public boolean isAir(BlockState state, BlockGetter world, BlockPos pos) {
                return true;  
            }

            @OverrideOnly
            public boolean canOcclude(BlockState state) {
                return false;  
            }

            @SuppressWarnings("null")
            @Override
            public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
                return Shapes.empty();  
            }
            
            @SuppressWarnings("null")
            @Override
            public boolean useShapeForLightOcclusion(BlockState state) {
                return false;  
            }
        }
    );

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
        BLOCKS.register(eventBus);
    }
}
