package net.rupyber_studios.improved_end.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.WeepingVinesBlock;
import net.rupyber_studios.improved_end.block.ModBlocks;

public class BuddingVinesBlock extends WeepingVinesBlock {
    public BuddingVinesBlock(Settings settings) {
        super(settings);
    }

    protected Block getPlant() {
        return ModBlocks.BUDDING_VINES_PLANT;
    }
}