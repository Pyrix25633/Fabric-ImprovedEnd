package net.rupyber_studios.improved_end.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.rupyber_studios.improved_end.block.ModBlocks;

import java.util.Random;

public class ModSaplingBlock extends SaplingBlock {
    public ModSaplingBlock(SaplingGenerator generator, Settings settings) {
        super(generator, settings);
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (world.getLightLevel(pos.up()) < 7 && random.nextInt(7) == 0) {
            this.generate(world, pos, state, random);
        }
    }

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        Block block = floor.getBlock();
        return block == Blocks.END_STONE || block == ModBlocks.DARK_GRASS || block == ModBlocks.INFUSORIAL_GRASS
                || block == ModBlocks.BUDDING_GRASS || block == ModBlocks.REDLEAF_GRASS || block == ModBlocks.FIRE_GRASS
                || block == ModBlocks.SHINING_GRASS || block == ModBlocks.SERENE_GRASS || block == ModBlocks.SCAB_GRASS
                || block == ModBlocks.INDIGO_GRASS || block == ModBlocks.XIBIEN;
    }
}
