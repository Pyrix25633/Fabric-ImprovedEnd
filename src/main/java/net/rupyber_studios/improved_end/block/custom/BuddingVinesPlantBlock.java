package net.rupyber_studios.improved_end.block.custom;

import net.minecraft.block.AbstractPlantStemBlock;
import net.minecraft.block.WeepingVinesPlantBlock;
import net.rupyber_studios.improved_end.block.ModBlocks;

public class BuddingVinesPlantBlock extends WeepingVinesPlantBlock {
    public BuddingVinesPlantBlock(Settings settings) {
        super(settings);
    }

    protected AbstractPlantStemBlock getStem() {
        return (AbstractPlantStemBlock) ModBlocks.BUDDING_VINES;
    }
}