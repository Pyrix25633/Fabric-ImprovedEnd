package net.pyriken.improved_end.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.pyriken.improved_end.ImprovedEnd;
import net.pyriken.improved_end.block.custom.EndGrassBlock;
import net.pyriken.improved_end.item.ModItemGroup;

public class ModBlocks {
    //Variables to better control block hardness and resistance
    static final float woodHardness = 2f, woodResistance = 2f, stoneHardness = 1.5f, stoneResistance = 2.2f;
    static final FabricBlockSettings endGrassSettings = FabricBlockSettings.of(Material.STONE)
            .strength(stoneHardness, stoneResistance).sounds(BlockSoundGroup.STONE).requiresTool();

    //"End Grass"
    public static final Block DARK_GRASS = registerBlock("dark_grass",
            new EndGrassBlock(endGrassSettings.mapColor(MapColor.BLACK)));
    public static final Block INFUSORIAL_GRASS = registerBlock("infusorial_grass",
            new EndGrassBlock(endGrassSettings.mapColor(MapColor.PURPLE)));
    public static final Block BUDDING_GRASS = registerBlock("budding_grass",
            new EndGrassBlock(endGrassSettings.mapColor(MapColor.PINK)));
    public static final Block REDLEAF_GRASS = registerBlock("redleaf_grass",
            new EndGrassBlock(endGrassSettings.mapColor(MapColor.RED)));
    public static final Block FIRE_GRASS = registerBlock("fire_grass",
            new EndGrassBlock(endGrassSettings.mapColor(MapColor.ORANGE)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(ImprovedEnd.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registry.ITEM, new Identifier(ImprovedEnd.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(ModItemGroup.IMPROVED_END)));
    }

    public static void registerModBlocks() {
        System.out.println("Registering ModBlocks for " + ImprovedEnd.MOD_ID);
    }
}
