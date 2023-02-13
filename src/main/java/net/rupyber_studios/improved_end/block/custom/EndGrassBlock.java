package net.rupyber_studios.improved_end.block.custom;

import net.minecraft.block.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.WorldView;

public class EndGrassBlock extends Block {
    public EndGrassBlock(Settings settings) {
        super(settings.ticksRandomly());
    }

    private static boolean canSurvive(WorldView world, BlockPos pos) {
        Block block = world.getBlockState(pos.up()).getBlock();
        return !block.getDefaultState().isOpaque() || block instanceof VerticalSlabBlock || block instanceof SlabBlock
            || block instanceof StairsBlock;
    }

    private static boolean canSpread(WorldView world, BlockPos pos) {
        return canSurvive(world, pos) && world.getLightLevel(pos.up()) < 7;
    }

    @Override
    @SuppressWarnings("deprecation")
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        super.randomTick(state, world, pos, random);
        if(!canSurvive(world, pos)) {
            world.setBlockState(pos, Blocks.END_STONE.getDefaultState());
        } else {
            for(int i = 0; i < 4; ++i) {
                BlockPos blockPos = pos.add(random.nextInt(3) - 1, random.nextInt(5) - 3, random.nextInt(3) - 1);
                if(world.getBlockState(blockPos).isOf(Blocks.END_STONE) && canSurvive(world, blockPos)
                    && canSpread(world, pos) && world.getBlockState(blockPos.up()).getBlock() != Blocks.CHORUS_PLANT) {
                    world.setBlockState(blockPos, state);
                }
            }
        }
    }
}
