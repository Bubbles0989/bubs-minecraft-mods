package com.example.armorforu;

import java.util.stream.Stream;

import org.jetbrains.annotations.ApiStatus.OverrideOnly;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;


// public class CopperArmorItem extends Block {

//     // Enum to represent oxidation stages
//     public enum OxidationStage {
//         NORMAL,
//         EXPOSED,
//         WEATHERED,
//         OXIDIZED;
//     }

//     // Constructor
//     public CopperArmorItem(Properties properties) {
//         super(properties);
//     }

//     // Returns the next oxidation stage for a block
//     public static OxidationStage getNextOxidationStage(OxidationStage currentStage) {
//         switch (currentStage) {
//             case NORMAL:
//                 return OxidationStage.EXPOSED;
//             case EXPOSED:
//                 return OxidationStage.WEATHERED;
//             case WEATHERED:
//                 return OxidationStage.OXIDIZED;
//             default:
//                 return OxidationStage.OXIDIZED; // Final stage remains oxidized
//         }
//     }

//     // Called periodically to advance the oxidation stage
//     @Override
//     public void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
//         super.randomTick(state, level, pos, random);
        
//         // 20% chance to oxidize each tick
//         if (random.nextFloat() < 0.2F) {
//             OxidationStage currentStage = state.getValue(OXIDATION_STAGE); // Assuming OXIDATION_STAGE is a BlockState property
//             OxidationStage nextStage = getNextOxidationStage(currentStage);

//             // Update the block state to the next stage
//             if (currentStage != nextStage) {
//                 level.setBlock(pos, state.setValue(OXIDATION_STAGE, nextStage), 3);
//             }
//         }
//     }
// }


public class CopperArmorItem extends CustomArmorItem {
    private static final int TICKS_PER_STAGE = 20 * 60 * 10;

    public CopperArmorItem(Holder<ArmorMaterial> material, Type slot, Properties properties) {
        super(material, slot, properties);
    }

    public int getOxidationLevel(ItemStack stack) {
        Stream<TagKey<Item>> tags = stack.getTags();
        if (tags.anyMatch(tag -> tag.equals(ModTags.Items.COPPER_ARMOR_FULLY_OXIDIZED))) {
            return 3;
        } else if (tags.anyMatch(tag -> tag.equals(ModTags.Items.COPPER_ARMOR_SEMI_OXIDIZED))) {
            return 2;
        } else if (tags.anyMatch(tag -> tag.equals(ModTags.Items.COPPER_ARMOR_LIGHTLY_OXIDIZED))) {
            return 1;
        } else {
            return 0;
        }
    }

    public void setOxidationLevel(ItemStack stack, int level) {
        // switch (level) {
        //     case 3:
        //         stack.addTag(ModTags.Items.COPPER_ARMOR_FULLY_OXIDIZED);
        //         break;
        //     case 2:
        //         stack.addTag(ModTags.Items.COPPER_ARMOR_SEMI_OXIDIZED);
        //         break;
        //     case 1:
        //         stack.addTag(ModTags.Items.COPPER_ARMOR_LIGHTLY_OXIDIZED);
        //         break;
        //     default:
        //         stack.removeTag(ModTags.Items.COPPER_ARMOR_FULLY_OXIDIZED);
        //         stack.removeTag(ModTags.Items.COPPER_ARMOR_SEMI_OXIDIZED);
        //         stack.removeTag(ModTags.Items.COPPER_ARMOR_LIGHTLY_OXIDIZED);
        //         break;
        // }
    }

    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
        Player player = event.player;

        for (ItemStack armorPiece : player.getArmorSlots()) {
            if (armorPiece.getItem() instanceof CopperArmorItem copperArmor) {
                int wearTime = player.tickCount;

                int stage = wearTime / TICKS_PER_STAGE;
                copperArmor.setOxidationLevel(armorPiece, Math.min(stage, 3));
            }
        }
    }

    @OverrideOnly
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
        int oxidationLevel = getOxidationLevel(stack);

        String textureName;
        switch (oxidationLevel) {
            case 3: textureName = "copper_fully_weathered"; break;
            case 2: textureName = "copper_semi_weathered"; break;
            case 1: textureName = "copper_lightly_weathered"; break;
            default: textureName = "copper_normal"; break;
        }

        return String.format("modid:textures/models/armor/%s_layer_%d.png", textureName, slot == EquipmentSlot.LEGS ? 2 : 1);
    }
}
