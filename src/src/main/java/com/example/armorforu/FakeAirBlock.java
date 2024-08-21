// package com.example.armorforu;

// import org.jetbrains.annotations.ApiStatus.OverrideOnly;

// import net.minecraft.core.BlockPos;
// import net.minecraft.world.level.block.Block;
// import net.minecraft.world.level.block.state.BlockState;
// import net.minecraft.world.level.block.state.BlockBehaviour;
// import net.minecraft.world.level.BlockGetter;
// import net.minecraft.world.item.context.BlockPlaceContext;

// public class FakeAirBlock extends Block {

//     public FakeAirBlock(BlockBehaviour.Properties properties) {
//         super(properties);
//     }

//     @Override
//     public boolean isAir(BlockState state) {
//         return true;
//     }

//     @Override
//     public boolean canBeReplaced(BlockState state, BlockPlaceContext context) {
//         return true;
//     }

//     @Override
//     public boolean propagatesSkylightDown(BlockState state, BlockGetter level, BlockPos pos) {
//         return true;
//     }

//     @OverrideOnly
//     public boolean isRedstoneConductor(BlockState state, BlockGetter level, BlockPos pos) {
//         return false;
//     }

//     @OverrideOnly
//     public BlockBehaviour.OffsetType getOffsetType() {
//         return BlockBehaviour.OffsetType.NONE;
//     }

//     @OverrideOnly
//     public boolean useShapeForLightOcclusion() {
//         return false;
//     }

//     @OverrideOnly
//     public int getLightEmission(BlockState state) {
//         return 15; // Maximum light level
//     }
// }
