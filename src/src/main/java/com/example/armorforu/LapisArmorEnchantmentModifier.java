// package com.example.armorforu;

// import net.minecraft.world.entity.EquipmentSlot;
// import net.minecraft.world.entity.player.Player;
// import net.minecraft.core.BlockPos;
// import net.minecraft.core.particles.ParticleTypes;
// import net.minecraft.world.level.Level;
// import net.minecraft.world.level.block.EnchantingTableBlock;
// import net.minecraft.world.phys.Vec3;
// import net.minecraftforge.event.TickEvent;
// import net.minecraftforge.event.enchanting.EnchantmentLevelSetEvent;
// import net.minecraftforge.eventbus.api.SubscribeEvent;
// import net.minecraftforge.fml.common.Mod;

// @Mod.EventBusSubscriber(modid = ArmorMod.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
// public class LapisArmorEnchantmentModifier {

//     private static final int ENCHANTMENT_TABLE_RANGE = 5; 

//     @SubscribeEvent
//     public static void onLevelTick(TickEvent.PlayerTickEvent event) {
//         Player player = event.player;
//         Level world = player.level();
//         BlockPos playerPos = player.blockPosition();

//         boolean nearEnchantmentTable = false;
//         for (BlockPos pos : BlockPos.betweenClosed(playerPos.offset(-ENCHANTMENT_TABLE_RANGE, -ENCHANTMENT_TABLE_RANGE, -ENCHANTMENT_TABLE_RANGE),
//                                                    playerPos.offset(ENCHANTMENT_TABLE_RANGE, ENCHANTMENT_TABLE_RANGE, ENCHANTMENT_TABLE_RANGE))) {
//             if (world.getBlockState(pos).getBlock() instanceof EnchantingTableBlock) {
//                 nearEnchantmentTable = true;
//                 break;
//             }
//         }

//         if (nearEnchantmentTable && isWearingFullLapisArmor(player)) {
//             Vec3 pos = player.position();

//             double xOffset = (Math.random() - 0.5) * 0.5;
//             double yOffset = (Math.random() - 0.5) * 0.5;
//             double zOffset = (Math.random() - 0.5) * 0.5;

//             world.addParticle(ParticleTypes.HAPPY_VILLAGER, pos.x + xOffset, pos.y + yOffset, pos.z + zOffset, 0.0, 0.0, 0.0);
//         }
//     }

//     @SubscribeEvent
//     public static void onEnchantmentLevelSet(EnchantmentLevelSetEvent event, TickEvent.PlayerTickEvent playerEvent) {
//         Player player = playerEvent.player;
        
//         if (isWearingFullLapisArmor(player)) {
//             // Boost enchantment levels or modify chances
//             int newLevel = event.getEnchantLevel() + 5; // For example, boost by 5 levels
//             event.setEnchantLevel(Math.min(newLevel, 30)); // Ensure max level doesn't exceed 30
//         }
//     }

//     private static boolean isWearingFullLapisArmor(Player player) {
//         return player.getItemBySlot(EquipmentSlot.HEAD).getItem() == ModItems.LAPIS_HELMET.get() &&
//                player.getItemBySlot(EquipmentSlot.CHEST).getItem() == ModItems.LAPIS_CHESTPLATE.get() &&
//                player.getItemBySlot(EquipmentSlot.LEGS).getItem() == ModItems.LAPIS_LEGGINGS.get() &&
//                player.getItemBySlot(EquipmentSlot.FEET).getItem() == ModItems.LAPIS_BOOTS.get();
//     }
// }



