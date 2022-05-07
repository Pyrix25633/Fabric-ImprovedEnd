package net.rupyber_studios.improved_end.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.FernBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.rupyber_studios.improved_end.block.ModBlocks;

public class ModFernBlock extends FernBlock {
    public ModFernBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        Block block = floor.getBlock();
        return block == Blocks.END_STONE || block == ModBlocks.DARK_GRASS_BLOCK || block == ModBlocks.INFUSORIAL_GRASS_BLOCK
                || block == ModBlocks.BUDDING_GRASS_BLOCK || block == ModBlocks.REDLEAF_GRASS_BLOCK || block == ModBlocks.FIRE_GRASS_BLOCK
                || block == ModBlocks.SHINING_GRASS_BLOCK || block == ModBlocks.SERENE_GRASS_BLOCK || block == ModBlocks.SCAB_GRASS_BLOCK
                || block == ModBlocks.INDIGO_GRASS_BLOCK || block == ModBlocks.XIBIEN;
    }
}
