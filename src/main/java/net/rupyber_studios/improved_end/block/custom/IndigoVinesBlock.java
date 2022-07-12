package net.rupyber_studios.improved_end.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.WeepingVinesBlock;
import net.rupyber_studios.improved_end.block.ModBlocks;

public class IndigoVinesBlock extends WeepingVinesBlock {
    public IndigoVinesBlock(Settings settings) {
        super(settings);
    }

    protected Block getPlant() {
        return ModBlocks.INDIGO_VINES_PLANT;
    }
}