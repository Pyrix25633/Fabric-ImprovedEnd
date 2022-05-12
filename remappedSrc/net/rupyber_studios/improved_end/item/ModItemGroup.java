package net.rupyber_studios.improved_end.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.rupyber_studios.improved_end.ImprovedEnd;
import net.rupyber_studios.improved_end.block.ModBlocks;

public class ModItemGroup {
    public static final ItemGroup IMPROVED_END_BIOMES_BLOCKS = FabricItemGroupBuilder.build(new Identifier(ImprovedEnd.MOD_ID,
            "improved_end_biomes_blocks"), () -> new ItemStack(ModBlocks.DARK_GRASS_BLOCK));
    public static final ItemGroup IMPROVED_END_BLOCKS = FabricItemGroupBuilder.build(new Identifier(ImprovedEnd.MOD_ID,
            "improved_end_blocks"), () -> new ItemStack(ModBlocks.POLISHED_END_STONE));
}
