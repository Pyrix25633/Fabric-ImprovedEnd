package net.rupyber_studios.improved_end.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.World;
import net.rupyber_studios.improved_end.item.ModItems;

import java.util.function.ToIntFunction;

public interface Branius {
    VoxelShape SHAPE = Block.createCuboidShape(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
    BooleanProperty BERRIES = Properties.BERRIES;

    static ActionResult pickBerries(BlockState state, World world, BlockPos pos) {
        if (state.get(BERRIES)) {
            Block.dropStack(world, pos, new ItemStack(ModItems.BRANIUS_BERRIES, 1));
            float f = MathHelper.nextBetween(world.random, 0.8F, 1.2F);
            world.playSound(null, pos, SoundEvents.BLOCK_CAVE_VINES_PICK_BERRIES, SoundCategory.BLOCKS, 1.0F, f);
            world.setBlockState(pos, state.with(BERRIES, false), 2);
            return ActionResult.success(world.isClient);
        } else {
            return ActionResult.PASS;
        }
    }

    static boolean hasBerries(BlockState state) {
        return state.contains(BERRIES) && state.get(BERRIES);
    }

    static ToIntFunction<BlockState> getLuminanceSupplier(int luminance) {
        return (state) -> {
            return (Boolean)state.get(Properties.BERRIES) ? luminance : 0;
        };
    }
}
