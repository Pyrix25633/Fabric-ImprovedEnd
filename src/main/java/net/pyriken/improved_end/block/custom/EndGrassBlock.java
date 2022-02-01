package net.pyriken.improved_end.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldView;

import java.util.Random;

public class EndGrassBlock extends Block {
    public EndGrassBlock(Settings settings) {
        super(settings.ticksRandomly());
    }

    private static boolean canSurvive(WorldView world, BlockPos pos) {
        return !world.getBlockState(pos.up()).isOpaque();
    }

    private static boolean canSpread(WorldView world, BlockPos pos) {
        return canSurvive(world, pos) && world.getLightLevel(pos.up()) < 7;
    }

    @Override
    @SuppressWarnings("deprecation")
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        super.randomTick(state, world, pos, random);
        if (!canSurvive(world, pos)) {
            world.setBlockState(pos, Blocks.END_STONE.getDefaultState());
        } else {
            for(int i = 0; i < 4; ++i) {
                BlockPos blockPos = pos.add(random.nextInt(3) - 1, random.nextInt(5) - 3, random.nextInt(3) - 1);
                if (world.getBlockState(blockPos).isOf(Blocks.END_STONE) && canSurvive(world, blockPos)
                        && canSpread(world, pos) && world.getBlockState(blockPos.up()).getBlock() != Blocks.CHORUS_PLANT) {
                    world.setBlockState(blockPos, state);
                }
            }
        }
    }
}
