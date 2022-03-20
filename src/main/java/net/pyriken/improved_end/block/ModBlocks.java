package net.pyriken.improved_end.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.entity.EntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.pyriken.improved_end.ImprovedEnd;
import net.pyriken.improved_end.block.custom.EndGrassBlock;
import net.pyriken.improved_end.block.custom.HollowLogBlock;
import net.pyriken.improved_end.block.custom.ModLogBlock;
import net.pyriken.improved_end.item.ModItemGroup;
import net.pyriken.improved_end.util.MinecraftBlocks;

public class ModBlocks {
    AbstractBlock.TypedContextPredicate<EntityType<?>> allowsSpawningPredicate;
    AbstractBlock.ContextPredicate blockVisionPredicate;
    //Variables to better control block hardness and resistance
    static final float woodHardness = 2f, woodResistance = 3f, stoneHardness = 2f, stoneResistance = 6f,
            leavesStrength = 0.2f;
    static final FabricBlockSettings stoneSettings = FabricBlockSettings.of(Material.STONE)
            .strength(stoneHardness, stoneResistance).sounds(BlockSoundGroup.STONE).requiresTool();
    static final FabricBlockSettings woodSettings = FabricBlockSettings.of(Material.WOOD)
            .strength(woodHardness, woodResistance).sounds(BlockSoundGroup.WOOD);
    static final FabricBlockSettings leavesSettings = FabricBlockSettings.of(Material.LEAVES).strength(leavesStrength)
            .sounds(BlockSoundGroup.GRASS).nonOpaque().ticksRandomly().allowsSpawning(MinecraftBlocks::canSpawnOnLeaves)
            .suffocates(MinecraftBlocks::never).blockVision(MinecraftBlocks::never);

    //Grass
    public static final Block DARK_GRASS = registerBiomesBlock("dark_grass",
            new EndGrassBlock(stoneSettings.mapColor(MapColor.BLACK)));
    public static final Block INFUSORIAL_GRASS = registerBiomesBlock("infusorial_grass",
            new EndGrassBlock(stoneSettings.mapColor(MapColor.PURPLE)));
    public static final Block BUDDING_GRASS = registerBiomesBlock("budding_grass",
            new EndGrassBlock(stoneSettings.mapColor(MapColor.PINK)));
    public static final Block REDLEAF_GRASS = registerBiomesBlock("redleaf_grass",
            new EndGrassBlock(stoneSettings.mapColor(MapColor.RED)));
    public static final Block FIRE_GRASS = registerBiomesBlock("fire_grass",
            new EndGrassBlock(stoneSettings.mapColor(MapColor.ORANGE)));
    public static final Block SHINING_GRASS = registerBiomesBlock("shining_grass",
            new EndGrassBlock(stoneSettings.mapColor(MapColor.YELLOW)));
    public static final Block SERENE_GRASS = registerBiomesBlock("serene_grass",
            new EndGrassBlock(stoneSettings.mapColor(MapColor.LIME)));
    public static final Block SCAB_GRASS = registerBiomesBlock("scab_grass",
            new EndGrassBlock(stoneSettings.mapColor(MapColor.LIGHT_BLUE)));
    public static final Block INDIGO_GRASS = registerBiomesBlock("indigo_grass",
            new EndGrassBlock(stoneSettings.mapColor(MapColor.BLUE)));

    //Logs
    public static final Block DARK_LOG = registerBiomesBlock("dark_log",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block INFUSORIAL_LOG = registerBiomesBlock("infusorial_log",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_PURPLE)));
    public static final Block BUDDING_LOG = registerBiomesBlock("budding_log",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_PINK)));
    public static final Block REDLEAF_LOG = registerBiomesBlock("redleaf_log",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_RED)));
    public static final Block FIRE_LOG = registerBiomesBlock("fire_log",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final Block SHINING_LOG = registerBiomesBlock("shining_log",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_YELLOW)));
    public static final Block SERENE_LOG = registerBiomesBlock("serene_log",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_LIME)));
    public static final Block SCAB_LOG = registerBiomesBlock("scab_log",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));
    public static final Block INDIGO_LOG = registerBiomesBlock("indigo_log",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_BLUE)));

    //Stripped Logs
    public static final Block STRIPPED_DARK_LOG = registerBiomesBlock("stripped_dark_log",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block STRIPPED_INFUSORIAL_LOG = registerBiomesBlock("stripped_infusorial_log",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_PURPLE)));
    public static final Block STRIPPED_BUDDING_LOG = registerBiomesBlock("stripped_budding_log",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_PINK)));
    public static final Block STRIPPED_REDLEAF_LOG = registerBiomesBlock("stripped_redleaf_log",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_RED)));
    public static final Block STRIPPED_FIRE_LOG = registerBiomesBlock("stripped_fire_log",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final Block STRIPPED_SHINING_LOG = registerBiomesBlock("stripped_shining_log",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_YELLOW)));
    public static final Block STRIPPED_SERENE_LOG = registerBiomesBlock("stripped_serene_log",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_LIME)));
    public static final Block STRIPPED_SCAB_LOG = registerBiomesBlock("stripped_scab_log",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));
    public static final Block STRIPPED_INDIGO_LOG = registerBiomesBlock("stripped_indigo_log",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_BLUE)));

    //Wood
    public static final Block DARK_WOOD = registerBiomesBlock("dark_wood",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block INFUSORIAL_WOOD = registerBiomesBlock("infusorial_wood",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_PURPLE)));
    public static final Block BUDDING_WOOD = registerBiomesBlock("budding_wood",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_PINK)));
    public static final Block REDLEAF_WOOD = registerBiomesBlock("redleaf_wood",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_RED)));
    public static final Block FIRE_WOOD = registerBiomesBlock("fire_wood",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final Block SHINING_WOOD = registerBiomesBlock("shining_wood",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_YELLOW)));
    public static final Block SERENE_WOOD = registerBiomesBlock("serene_wood",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_LIME)));
    public static final Block SCAB_WOOD = registerBiomesBlock("scab_wood",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));
    public static final Block INDIGO_WOOD = registerBiomesBlock("indigo_wood",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_BLUE)));

    //Stripped Wood
    public static final Block STRIPPED_DARK_WOOD = registerBiomesBlock("stripped_dark_wood",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block STRIPPED_INFUSORIAL_WOOD = registerBiomesBlock("stripped_infusorial_wood",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_PURPLE)));
    public static final Block STRIPPED_BUDDING_WOOD = registerBiomesBlock("stripped_budding_wood",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_PINK)));
    public static final Block STRIPPED_REDLEAF_WOOD = registerBiomesBlock("stripped_redleaf_wood",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_RED)));
    public static final Block STRIPPED_FIRE_WOOD = registerBiomesBlock("stripped_fire_wood",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final Block STRIPPED_SHINING_WOOD = registerBiomesBlock("stripped_shining_wood",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_YELLOW)));
    public static final Block STRIPPED_SERENE_WOOD = registerBiomesBlock("stripped_serene_wood",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_LIME)));
    public static final Block STRIPPED_SCAB_WOOD = registerBiomesBlock("stripped_scab_wood",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));
    public static final Block STRIPPED_INDIGO_WOOD = registerBiomesBlock("stripped_indigo_wood",
            new ModLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_BLUE)));

    //Planks
    public static final Block DARK_PLANKS = registerBiomesBlock("dark_planks",
            new Block(woodSettings.mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block INFUSORIAL_PLANKS = registerBiomesBlock("infusorial_planks",
            new Block(woodSettings.mapColor(MapColor.TERRACOTTA_PURPLE)));
    public static final Block BUDDING_PLANKS = registerBiomesBlock("budding_planks",
            new Block(woodSettings.mapColor(MapColor.TERRACOTTA_PINK)));
    public static final Block REDLEAF_PLANKS = registerBiomesBlock("redleaf_planks",
            new Block(woodSettings.mapColor(MapColor.TERRACOTTA_RED)));
    public static final Block FIRE_PLANKS = registerBiomesBlock("fire_planks",
            new Block(woodSettings.mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final Block SHINING_PLANKS = registerBiomesBlock("shining_planks",
            new Block(woodSettings.mapColor(MapColor.TERRACOTTA_YELLOW)));
    public static final Block SERENE_PLANKS = registerBiomesBlock("serene_planks",
            new Block(woodSettings.mapColor(MapColor.TERRACOTTA_LIME)));
    public static final Block SCAB_PLANKS = registerBiomesBlock("scab_planks",
            new Block(woodSettings.mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));
    public static final Block INDIGO_PLANKS = registerBiomesBlock("indigo_planks",
            new Block(woodSettings.mapColor(MapColor.TERRACOTTA_BLUE)));
    
    //Hollow Logs
    public static final Block HOLLOW_DARK_LOG = registerBiomesBlock("hollow_dark_log",
            new HollowLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_BLACK).nonOpaque()));
    public static final Block HOLLOW_INFUSORIAL_LOG = registerBiomesBlock("hollow_infusorial_log",
            new HollowLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_PURPLE).nonOpaque()));
    public static final Block HOLLOW_BUDDING_LOG = registerBiomesBlock("hollow_budding_log",
            new HollowLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_PINK).nonOpaque()));
    public static final Block HOLLOW_REDLEAF_LOG = registerBiomesBlock("hollow_redleaf_log",
            new HollowLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_RED).nonOpaque()));
    public static final Block HOLLOW_FIRE_LOG = registerBiomesBlock("hollow_fire_log",
            new HollowLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_ORANGE).nonOpaque()));
    public static final Block HOLLOW_SHINING_LOG = registerBiomesBlock("hollow_shining_log",
            new HollowLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_YELLOW).nonOpaque()));
    public static final Block HOLLOW_SERENE_LOG = registerBiomesBlock("hollow_serene_log",
            new HollowLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_LIME).nonOpaque()));
    public static final Block HOLLOW_SCAB_LOG = registerBiomesBlock("hollow_scab_log",
            new HollowLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_LIGHT_BLUE).nonOpaque()));
    public static final Block HOLLOW_INDIGO_LOG = registerBiomesBlock("hollow_indigo_log",
            new HollowLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_BLUE).nonOpaque()));

    //Stripped Hollow Logs
    public static final Block STRIPPED_HOLLOW_DARK_LOG = registerBiomesBlock("stripped_hollow_dark_log",
            new HollowLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_BLACK).nonOpaque()));
    public static final Block STRIPPED_HOLLOW_INFUSORIAL_LOG = registerBiomesBlock("stripped_hollow_infusorial_log",
            new HollowLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_PURPLE).nonOpaque()));
    public static final Block STRIPPED_HOLLOW_BUDDING_LOG = registerBiomesBlock("stripped_hollow_budding_log",
            new HollowLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_PINK).nonOpaque()));
    public static final Block STRIPPED_HOLLOW_REDLEAF_LOG = registerBiomesBlock("stripped_hollow_redleaf_log",
            new HollowLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_RED).nonOpaque()));
    public static final Block STRIPPED_HOLLOW_FIRE_LOG = registerBiomesBlock("stripped_hollow_fire_log",
            new HollowLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_ORANGE).nonOpaque()));
    public static final Block STRIPPED_HOLLOW_SHINING_LOG = registerBiomesBlock("stripped_hollow_shining_log",
            new HollowLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_YELLOW).nonOpaque()));
    public static final Block STRIPPED_HOLLOW_SERENE_LOG = registerBiomesBlock("stripped_hollow_serene_log",
            new HollowLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_LIME).nonOpaque()));
    public static final Block STRIPPED_HOLLOW_SCAB_LOG = registerBiomesBlock("stripped_hollow_scab_log",
            new HollowLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_LIGHT_BLUE).nonOpaque()));
    public static final Block STRIPPED_HOLLOW_INDIGO_LOG = registerBiomesBlock("stripped_hollow_indigo_log",
            new HollowLogBlock(woodSettings.mapColor(MapColor.TERRACOTTA_BLUE).nonOpaque()));

    //Leaves
    public static final Block DARK_LEAVES = registerBiomesBlock("dark_leaves",
            new LeavesBlock(leavesSettings.mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block INFUSORIAL_LEAVES = registerBiomesBlock("infusorial_leaves",
            new LeavesBlock(leavesSettings.mapColor(MapColor.TERRACOTTA_PURPLE)));
    public static final Block BUDDING_LEAVES = registerBiomesBlock("budding_leaves",
            new LeavesBlock(leavesSettings.mapColor(MapColor.TERRACOTTA_PINK)));
    public static final Block REDLEAF_LEAVES = registerBiomesBlock("redleaf_leaves",
            new LeavesBlock(leavesSettings.mapColor(MapColor.TERRACOTTA_RED)));
    public static final Block FIRE_LEAVES = registerBiomesBlock("fire_leaves",
            new LeavesBlock(leavesSettings.mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final Block SHINING_LEAVES = registerBiomesBlock("shining_leaves",
            new LeavesBlock(leavesSettings.mapColor(MapColor.TERRACOTTA_YELLOW)));
    public static final Block SERENE_LEAVES = registerBiomesBlock("serene_leaves",
            new LeavesBlock(leavesSettings.mapColor(MapColor.TERRACOTTA_LIME)));
    public static final Block SCAB_LEAVES = registerBiomesBlock("scab_leaves",
            new LeavesBlock(leavesSettings.mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));
    public static final Block INDIGO_LEAVES = registerBiomesBlock("indigo_leaves",
            new LeavesBlock(leavesSettings.mapColor(MapColor.TERRACOTTA_BLUE)));

    //End Stone and Purpur
    public static final Block POLISHED_END_STONE = registerBiomesBlock("polished_end_stone",
            new Block(stoneSettings.mapColor(MapColor.PALE_YELLOW)));
    public static final Block END_STONE_TILES = registerBiomesBlock("end_stone_tiles",
            new Block(stoneSettings.mapColor(MapColor.PALE_YELLOW)));
    public static final Block CRACKED_END_STONE_BRICKS = registerBiomesBlock("cracked_end_stone_bricks",
            new Block(stoneSettings.mapColor(MapColor.PALE_YELLOW)));
    public static final Block CHISELED_END_STONE_BRICKS = registerBiomesBlock("chiseled_end_stone_bricks",
            new Block(stoneSettings.mapColor(MapColor.PALE_YELLOW)));
    public static final Block END_STONE_PILLAR = registerBiomesBlock("end_stone_pillar",
            new PillarBlock(stoneSettings.mapColor(MapColor.PALE_YELLOW)));
    public static final Block CRACKED_PURPUR = registerBiomesBlock("cracked_purpur",
            new Block(stoneSettings.mapColor(MapColor.MAGENTA).strength(1.5f, 6.0f)));

    private static Block registerBiomesBlock(String name, Block block) {
        registerBiomesBlockItem(name, block, ModItemGroup.IMPROVED_END_BIOMES);
        return Registry.register(Registry.BLOCK, new Identifier(ImprovedEnd.MOD_ID, name), block);
    }

    private static Item registerBiomesBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(ImprovedEnd.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        System.out.println("Registering ModBlocks for " + ImprovedEnd.MOD_ID);
    }
}
