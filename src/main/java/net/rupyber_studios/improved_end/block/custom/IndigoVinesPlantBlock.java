package net.rupyber_studios.improved_end.block.custom;

import net.minecraft.block.AbstractPlantStemBlock;
import net.minecraft.block.WeepingVinesPlantBlock;
import net.rupyber_studios.improved_end.block.ModBlocks;

public class IndigoVinesPlantBlock extends WeepingVinesPlantBlock {
    public IndigoVinesPlantBlock(Settings settings) {
        super(settings);
    }

    protected AbstractPlantStemBlock getStem() {
        return (AbstractPlantStemBlock) ModBlocks.INDIGO_VINES;
    }
}