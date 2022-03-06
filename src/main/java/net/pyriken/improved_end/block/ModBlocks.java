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
import net.pyriken.improved_end.block.custom.ModLogBlock;
import net.pyriken.improved_end.item.ModItemGroup;

public class ModBlocks {
    //Variables to better control block hardness and resistance
    static final float woodHardness = 2f, woodResistance = 2f, stoneHardness = 1.5f, stoneResistance = 2.2f;
    static final FabricBlockSettings endGrassSettings = FabricBlockSettings.of(Material.STONE)
            .strength(stoneHardness, stoneResistance).sounds(BlockSoundGroup.STONE).requiresTool();
    static final FabricBlockSettings woodSettings = FabricBlockSettings.of(Material.WOOD)
            .strength(woodHardness, woodResistance).sounds(BlockSoundGroup.WOOD);

    //Dark
    public static final Block DARK_GRASS = registerBlock("dark_grass",
            new EndGrassBlock(endGrassSettings.mapColor(MapColor.BLACK)));
    public static final Block DARK_LOG = registerBlock("dark_log",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block STRIPPED_DARK_LOG = registerBlock("stripped_dark_log",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block DARK_WOOD = registerBlock("dark_wood",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block STRIPPED_DARK_WOOD = registerBlock("stripped_dark_wood",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_BLACK)));
    //Infusorial
    public static final Block INFUSORIAL_GRASS = registerBlock("infusorial_grass",
            new EndGrassBlock(endGrassSettings.mapColor(MapColor.PURPLE)));
    public static final Block INFUSORIAL_LOG = registerBlock("infusorial_log",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_PURPLE)));
    public static final Block STRIPPED_INFUSORIAL_LOG = registerBlock("stripped_infusorial_log",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_PURPLE)));
    public static final Block INFUSORIAL_WOOD = registerBlock("infusorial_wood",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_PURPLE)));
    public static final Block STRIPPED_INFUSORIAL_WOOD = registerBlock("stripped_infusorial_wood",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_PURPLE)));
    //Budding
    public static final Block BUDDING_GRASS = registerBlock("budding_grass",
            new EndGrassBlock(endGrassSettings.mapColor(MapColor.PINK)));
    public static final Block BUDDING_LOG = registerBlock("budding_log",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_PINK)));
    public static final Block STRIPPED_BUDDING_LOG = registerBlock("stripped_budding_log",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_PINK)));
    public static final Block BUDDING_WOOD = registerBlock("budding_wood",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_PINK)));
    public static final Block STRIPPED_BUDDING_WOOD = registerBlock("stripped_budding_wood",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_PINK)));
    //Redleaf
    public static final Block REDLEAF_GRASS = registerBlock("redleaf_grass",
            new EndGrassBlock(endGrassSettings.mapColor(MapColor.RED)));
    public static final Block REDLEAF_LOG = registerBlock("redleaf_log",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_RED)));
    public static final Block STRIPPED_REDLEAF_LOG = registerBlock("stripped_redleaf_log",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_RED)));
    public static final Block REDLEAF_WOOD = registerBlock("redleaf_wood",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_RED)));
    public static final Block STRIPPED_REDLEAF_WOOD = registerBlock("stripped_redleaf_wood",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_RED)));
    //Fire
    public static final Block FIRE_GRASS = registerBlock("fire_grass",
            new EndGrassBlock(endGrassSettings.mapColor(MapColor.ORANGE)));
    public static final Block FIRE_LOG = registerBlock("fire_log",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final Block STRIPPED_FIRE_LOG = registerBlock("stripped_fire_log",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final Block FIRE_WOOD = registerBlock("fire_wood",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final Block STRIPPED_FIRE_WOOD = registerBlock("stripped_fire_wood",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_ORANGE)));
    //Shining
    public static final Block SHINING_GRASS = registerBlock("shining_grass",
            new EndGrassBlock(endGrassSettings.mapColor(MapColor.YELLOW)));
    public static final Block SHINING_LOG = registerBlock("shining_log",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_YELLOW)));
    public static final Block STRIPPED_SHINING_LOG = registerBlock("stripped_shining_log",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_YELLOW)));
    public static final Block SHINING_WOOD = registerBlock("shining_wood",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_YELLOW)));
    public static final Block STRIPPED_SHINING_WOOD = registerBlock("stripped_shining_wood",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_YELLOW)));
    //Serene
    public static final Block SERENE_GRASS = registerBlock("serene_grass",
            new EndGrassBlock(endGrassSettings.mapColor(MapColor.LIME)));
    public static final Block SERENE_LOG = registerBlock("serene_log",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_LIME)));
    public static final Block STRIPPED_SERENE_LOG = registerBlock("stripped_serene_log",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_LIME)));
    public static final Block SERENE_WOOD = registerBlock("serene_wood",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_LIME)));
    public static final Block STRIPPED_SERENE_WOOD = registerBlock("stripped_serene_wood",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_LIME)));
    //Scab
    public static final Block SCAB_GRASS = registerBlock("scab_grass",
            new EndGrassBlock(endGrassSettings.mapColor(MapColor.LIGHT_BLUE)));
    public static final Block SCAB_LOG = registerBlock("scab_log",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));
    public static final Block STRIPPED_SCAB_LOG = registerBlock("stripped_scab_log",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));
    public static final Block SCAB_WOOD = registerBlock("scab_wood",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));
    public static final Block STRIPPED_SCAB_WOOD = registerBlock("stripped_scab_wood",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));
    //Indigo
    public static final Block INDIGO_GRASS = registerBlock("indigo_grass",
            new EndGrassBlock(endGrassSettings.mapColor(MapColor.BLUE)));
    public static final Block INDIGO_LOG = registerBlock("indigo_log",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_BLUE)));
    public static final Block STRIPPED_INDIGO_LOG = registerBlock("stripped_indigo_log",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_BLUE)));
    public static final Block INDIGO_WOOD = registerBlock("indigo_wood",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_BLUE)));
    public static final Block STRIPPED_INDIGO_WOOD = registerBlock("stripped_indigo_wood",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_BLUE)));

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
