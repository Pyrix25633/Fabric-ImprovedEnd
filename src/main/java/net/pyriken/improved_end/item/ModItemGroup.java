package net.pyriken.improved_end.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.pyriken.improved_end.ImprovedEnd;
import net.pyriken.improved_end.block.ModBlocks;

public class ModItemGroup {
    public static final ItemGroup IMPROVED_END_BIOMES = FabricItemGroupBuilder.build(new Identifier(ImprovedEnd.MOD_ID,
            "improved_end_biomes"), () -> new ItemStack(ModBlocks.DARK_GRASS));
    //public static final ItemGroup IMPROVED_END_ = FabricItemGroupBuilder.build(new Identifier(ImprovedEnd.MOD_ID,
    //        "improved_end"), () -> new ItemStack(ModBlocks.DARK_GRASS));
}
