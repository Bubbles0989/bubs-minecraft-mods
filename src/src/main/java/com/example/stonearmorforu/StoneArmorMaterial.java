// // package com.example.stonearmorforu;

// package com.example.stonearmorforu;

// import net.minecraft.core.Holder;
// import net.minecraft.resources.ResourceLocation;
// import net.minecraft.sounds.SoundEvents;
// import net.minecraft.world.entity.EquipmentSlot;
// import net.minecraft.world.item.ArmorItem;
// import net.minecraft.world.item.ArmorMaterial;
// import net.minecraft.world.item.crafting.Ingredient;
// import net.minecraft.world.item.Items;

// import java.util.Map;
// import java.util.List;

// public class StoneArmorMaterial {

//     public static final ArmorMaterial STONE_ARMOR = new ArmorMaterial(
//         Map.of(
//             ArmorItem.Type.HELMET, 2,
//             ArmorItem.Type.CHESTPLATE, 5,
//             ArmorItem.Type.LEGGINGS, 6,
//             ArmorItem.Type.BOOTS, 2
//         ),
//         9, 
//         Holder.direct(SoundEvents.STONE_BREAK), // Use appropriate sound event
//         () -> Ingredient.of(Items.STONE),
//         List.of(
//         new ArmorMaterial.Layer(new ResourceLocation("stonearmorforu", "stonearmor"))),
//         0.0F, 
//         0.0F
//     );

//     public static int getDurabilityForSlot(EquipmentSlot slot) {
//         int[] BASE_DURABILITY = {13, 15, 16, 11};
//         return BASE_DURABILITY[slot.getIndex()] * 15;
//     }
// }

