package net.rupyber_studios.improved_end.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;
import net.rupyber_studios.improved_end.ImprovedEnd;
import net.rupyber_studios.improved_end.block.custom.*;
import net.rupyber_studios.improved_end.block.entity.ModSignTypes;
import net.rupyber_studios.improved_end.item.ModItemGroup;
import net.rupyber_studios.improved_end.util.MinecraftBlocks;
import net.rupyber_studios.improved_end.world.feature.tree.*;

public class ModBlocks {
    //Variables keep control of block hardness and resistance
    static final float woodHardness = 2f, woodResistance = 3f, stoneHardness = 2f, stoneResistance = 6f,
        leavesStrength = 0.2f;
    static final FabricBlockSettings stoneSettings = FabricBlockSettings.of(Material.STONE)
        .strength(stoneHardness, stoneResistance).sounds(BlockSoundGroup.STONE).requiresTool();
    static final FabricBlockSettings woodSettings = FabricBlockSettings.of(Material.WOOD)
        .strength(woodHardness, woodResistance).sounds(BlockSoundGroup.WOOD);
    static final FabricBlockSettings leavesSettings = FabricBlockSettings.of(Material.LEAVES).strength(leavesStrength)
        .sounds(BlockSoundGroup.GRASS).nonOpaque().ticksRandomly().allowsSpawning(MinecraftBlocks::canSpawnOnLeaves)
        .suffocates(MinecraftBlocks::never).blockVision(MinecraftBlocks::never);
    static final FabricBlockSettings lanternSettings = FabricBlockSettings.of(Material.METAL)
        .strength(3.5f).sounds(BlockSoundGroup.LANTERN).luminance(15)
        .requiresTool().nonOpaque();
    static final FabricBlockSettings bookshelfSettings = FabricBlockSettings.of(Material.WOOD)
        .strength(1.5F).sounds(BlockSoundGroup.WOOD);
    static final FabricBlockSettings buttonSettings = FabricBlockSettings.of(Material.DECORATION)
        .noCollision().strength(0.5F).sounds(BlockSoundGroup.WOOD);
    static final FabricBlockSettings stoneButtonSettings = FabricBlockSettings.of(Material.DECORATION)
        .noCollision().strength(0.5F).sounds(BlockSoundGroup.STONE);
    static final FabricBlockSettings pressurePlateSettings = FabricBlockSettings.of(Material.WOOD)
        .noCollision().strength(0.5F).sounds(BlockSoundGroup.WOOD);
    static final FabricBlockSettings stonePressurePlateSettings = FabricBlockSettings.of(Material.STONE)
        .noCollision().strength(0.5F).sounds(BlockSoundGroup.STONE);
    static final FabricBlockSettings trapdoorSettings = FabricBlockSettings.of(Material.WOOD)
        .strength(3.0F).sounds(BlockSoundGroup.WOOD).nonOpaque().allowsSpawning(MinecraftBlocks::never);
    static final FabricBlockSettings signSettings = FabricBlockSettings.of(Material.WOOD)
        .noCollision().strength(1.0F).sounds(BlockSoundGroup.WOOD);
    static final FabricBlockSettings doorSettings = FabricBlockSettings.of(Material.WOOD)
        .strength(3.0F).sounds(BlockSoundGroup.WOOD).nonOpaque();
    static final FabricBlockSettings fenceSettings = FabricBlockSettings.of(Material.WOOD)
        .strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD);
    static final FabricBlockSettings waylampSettings = FabricBlockSettings.of(Material.WOOD)
        .strength(0.3F).sounds(BlockSoundGroup.WOOD).luminance((state) -> 15);
    static final FabricBlockSettings saplingSettings = FabricBlockSettings.of(Material.PLANT)
        .noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS);
    static final FabricBlockSettings pottedSaplingSettings = FabricBlockSettings.of(Material.DECORATION)
        .breakInstantly().nonOpaque();
    static final FabricBlockSettings caveVineSettings = FabricBlockSettings.of(Material.PLANT)
        .noCollision().luminance(CaveVines.getLuminanceSupplier(14)).breakInstantly()
        .sounds(BlockSoundGroup.CAVE_VINES);
    static final FabricBlockSettings vineSettings = FabricBlockSettings.of(Material.PLANT)
        .ticksRandomly().noCollision().breakInstantly().sounds(BlockSoundGroup.WEEPING_VINES);
    static final FabricBlockSettings lilyPadSettings = FabricBlockSettings.of(Material.PLANT)
        .breakInstantly().sounds(BlockSoundGroup.LILY_PAD).nonOpaque();
    static final FabricBlockSettings mossSettings = FabricBlockSettings.of(Material.MOSS_BLOCK)
        .strength(0.1F).sounds(BlockSoundGroup.MOSS_BLOCK);
    static final FabricBlockSettings grassSettings = FabricBlockSettings.of(Material.REPLACEABLE_PLANT)
        .noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS);
    static final FabricBlockSettings flowerSettings = FabricBlockSettings.copyOf(Blocks.DANDELION).breakInstantly()
        .sounds(BlockSoundGroup.CROP).nonOpaque().noCollision();

    //Grass
    public static final Block DARK_GRASS_BLOCK = registerBiomesBlock("dark_grass_block",
        new EndGrassBlock(stoneSettings.mapColor(MapColor.BLACK)));
    public static final Block INFUSORIAL_GRASS_BLOCK = registerBiomesBlock("infusorial_grass_block",
        new EndGrassBlock(stoneSettings.mapColor(MapColor.PURPLE)));
    public static final Block BUDDING_GRASS_BLOCK = registerBiomesBlock("budding_grass_block",
        new EndGrassBlock(stoneSettings.mapColor(MapColor.PINK)));
    public static final Block REDLEAF_GRASS_BLOCK = registerBiomesBlock("redleaf_grass_block",
        new EndGrassBlock(stoneSettings.mapColor(MapColor.RED)));
    public static final Block FIRE_GRASS_BLOCK = registerBiomesBlock("fire_grass_block",
        new EndGrassBlock(stoneSettings.mapColor(MapColor.ORANGE)));
    public static final Block SHINING_GRASS_BLOCK = registerBiomesBlock("shining_grass_block",
        new EndGrassBlock(stoneSettings.mapColor(MapColor.YELLOW)));
    public static final Block SERENE_GRASS_BLOCK = registerBiomesBlock("serene_grass_block",
        new EndGrassBlock(stoneSettings.mapColor(MapColor.LIME)));
    public static final Block SCAB_GRASS_BLOCK = registerBiomesBlock("scab_grass_block",
        new EndGrassBlock(stoneSettings.mapColor(MapColor.LIGHT_BLUE)));
    public static final Block INDIGO_GRASS_BLOCK = registerBiomesBlock("indigo_grass_block",
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
        new PillarBlock(woodSettings.mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block STRIPPED_INFUSORIAL_LOG = registerBiomesBlock("stripped_infusorial_log",
        new PillarBlock(woodSettings.mapColor(MapColor.TERRACOTTA_PURPLE)));
    public static final Block STRIPPED_BUDDING_LOG = registerBiomesBlock("stripped_budding_log",
        new PillarBlock(woodSettings.mapColor(MapColor.TERRACOTTA_PINK)));
    public static final Block STRIPPED_REDLEAF_LOG = registerBiomesBlock("stripped_redleaf_log",
        new PillarBlock(woodSettings.mapColor(MapColor.TERRACOTTA_RED)));
    public static final Block STRIPPED_FIRE_LOG = registerBiomesBlock("stripped_fire_log",
        new PillarBlock(woodSettings.mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final Block STRIPPED_SHINING_LOG = registerBiomesBlock("stripped_shining_log",
        new PillarBlock(woodSettings.mapColor(MapColor.TERRACOTTA_YELLOW)));
    public static final Block STRIPPED_SERENE_LOG = registerBiomesBlock("stripped_serene_log",
        new PillarBlock(woodSettings.mapColor(MapColor.TERRACOTTA_LIME)));
    public static final Block STRIPPED_SCAB_LOG = registerBiomesBlock("stripped_scab_log",
        new PillarBlock(woodSettings.mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));
    public static final Block STRIPPED_INDIGO_LOG = registerBiomesBlock("stripped_indigo_log",
        new PillarBlock(woodSettings.mapColor(MapColor.TERRACOTTA_BLUE)));

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
        new PillarBlock(woodSettings.mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block STRIPPED_INFUSORIAL_WOOD = registerBiomesBlock("stripped_infusorial_wood",
        new PillarBlock(woodSettings.mapColor(MapColor.TERRACOTTA_PURPLE)));
    public static final Block STRIPPED_BUDDING_WOOD = registerBiomesBlock("stripped_budding_wood",
        new PillarBlock(woodSettings.mapColor(MapColor.TERRACOTTA_PINK)));
    public static final Block STRIPPED_REDLEAF_WOOD = registerBiomesBlock("stripped_redleaf_wood",
        new PillarBlock(woodSettings.mapColor(MapColor.TERRACOTTA_RED)));
    public static final Block STRIPPED_FIRE_WOOD = registerBiomesBlock("stripped_fire_wood",
        new PillarBlock(woodSettings.mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final Block STRIPPED_SHINING_WOOD = registerBiomesBlock("stripped_shining_wood",
        new PillarBlock(woodSettings.mapColor(MapColor.TERRACOTTA_YELLOW)));
    public static final Block STRIPPED_SERENE_WOOD = registerBiomesBlock("stripped_serene_wood",
        new PillarBlock(woodSettings.mapColor(MapColor.TERRACOTTA_LIME)));
    public static final Block STRIPPED_SCAB_WOOD = registerBiomesBlock("stripped_scab_wood",
        new PillarBlock(woodSettings.mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));
    public static final Block STRIPPED_INDIGO_WOOD = registerBiomesBlock("stripped_indigo_wood",
        new PillarBlock(woodSettings.mapColor(MapColor.TERRACOTTA_BLUE)));

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

    //Slabs
    public static final Block DARK_SLAB = registerBiomesBlock("dark_slab",
        new SlabBlock(woodSettings.mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block INFUSORIAL_SLAB = registerBiomesBlock("infusorial_slab",
        new SlabBlock(woodSettings.mapColor(MapColor.TERRACOTTA_PURPLE)));
    public static final Block BUDDING_SLAB = registerBiomesBlock("budding_slab",
        new SlabBlock(woodSettings.mapColor(MapColor.TERRACOTTA_PINK)));
    public static final Block REDLEAF_SLAB = registerBiomesBlock("redleaf_slab",
        new SlabBlock(woodSettings.mapColor(MapColor.TERRACOTTA_RED)));
    public static final Block FIRE_SLAB = registerBiomesBlock("fire_slab",
        new SlabBlock(woodSettings.mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final Block SHINING_SLAB = registerBiomesBlock("shining_slab",
        new SlabBlock(woodSettings.mapColor(MapColor.TERRACOTTA_YELLOW)));
    public static final Block SERENE_SLAB = registerBiomesBlock("serene_slab",
        new SlabBlock(woodSettings.mapColor(MapColor.TERRACOTTA_LIME)));
    public static final Block SCAB_SLAB = registerBiomesBlock("scab_slab",
        new SlabBlock(woodSettings.mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));
    public static final Block INDIGO_SLAB = registerBiomesBlock("indigo_slab",
        new SlabBlock(woodSettings.mapColor(MapColor.TERRACOTTA_BLUE)));

    //Stairs
    public static final Block DARK_STAIRS = registerBiomesBlock("dark_stairs",
        new StairsBlock(ModBlocks.DARK_PLANKS.getDefaultState(), woodSettings.mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block INFUSORIAL_STAIRS = registerBiomesBlock("infusorial_stairs",
        new StairsBlock(ModBlocks.INFUSORIAL_PLANKS.getDefaultState(), woodSettings.mapColor(MapColor.TERRACOTTA_PURPLE)));
    public static final Block BUDDING_STAIRS = registerBiomesBlock("budding_stairs",
        new StairsBlock(ModBlocks.BUDDING_PLANKS.getDefaultState(), woodSettings.mapColor(MapColor.TERRACOTTA_PINK)));
    public static final Block REDLEAF_STAIRS = registerBiomesBlock("redleaf_stairs",
        new StairsBlock(ModBlocks.REDLEAF_PLANKS.getDefaultState(), woodSettings.mapColor(MapColor.TERRACOTTA_RED)));
    public static final Block FIRE_STAIRS = registerBiomesBlock("fire_stairs",
        new StairsBlock(ModBlocks.FIRE_PLANKS.getDefaultState(), woodSettings.mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final Block SHINING_STAIRS = registerBiomesBlock("shining_stairs",
        new StairsBlock(ModBlocks.SHINING_PLANKS.getDefaultState(), woodSettings.mapColor(MapColor.TERRACOTTA_YELLOW)));
    public static final Block SERENE_STAIRS = registerBiomesBlock("serene_stairs",
        new StairsBlock(ModBlocks.SERENE_PLANKS.getDefaultState(), woodSettings.mapColor(MapColor.TERRACOTTA_LIME)));
    public static final Block SCAB_STAIRS = registerBiomesBlock("scab_stairs",
        new StairsBlock(ModBlocks.SCAB_PLANKS.getDefaultState(), woodSettings.mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));
    public static final Block INDIGO_STAIRS = registerBiomesBlock("indigo_stairs",
        new StairsBlock(ModBlocks.INDIGO_PLANKS.getDefaultState(), woodSettings.mapColor(MapColor.TERRACOTTA_BLUE)));

    //Vertical Slabs
    public static final Block DARK_VERTICAL_SLAB = registerBiomesBlock("dark_vertical_slab",
        new VerticalSlabBlock(woodSettings.mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block INFUSORIAL_VERTICAL_SLAB = registerBiomesBlock("infusorial_vertical_slab",
        new VerticalSlabBlock(woodSettings.mapColor(MapColor.TERRACOTTA_PURPLE)));
    public static final Block BUDDING_VERTICAL_SLAB = registerBiomesBlock("budding_vertical_slab",
        new VerticalSlabBlock(woodSettings.mapColor(MapColor.TERRACOTTA_PINK)));
    public static final Block REDLEAF_VERTICAL_SLAB = registerBiomesBlock("redleaf_vertical_slab",
        new VerticalSlabBlock(woodSettings.mapColor(MapColor.TERRACOTTA_RED)));
    public static final Block FIRE_VERTICAL_SLAB = registerBiomesBlock("fire_vertical_slab",
        new VerticalSlabBlock(woodSettings.mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final Block SHINING_VERTICAL_SLAB = registerBiomesBlock("shining_vertical_slab",
        new VerticalSlabBlock(woodSettings.mapColor(MapColor.TERRACOTTA_YELLOW)));
    public static final Block SERENE_VERTICAL_SLAB = registerBiomesBlock("serene_vertical_slab",
        new VerticalSlabBlock(woodSettings.mapColor(MapColor.TERRACOTTA_LIME)));
    public static final Block SCAB_VERTICAL_SLAB = registerBiomesBlock("scab_vertical_slab",
        new VerticalSlabBlock(woodSettings.mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));
    public static final Block INDIGO_VERTICAL_SLAB = registerBiomesBlock("indigo_vertical_slab",
        new VerticalSlabBlock(woodSettings.mapColor(MapColor.TERRACOTTA_BLUE)));

    //Buttons
    public static final Block DARK_BUTTON = registerBiomesBlock("dark_button",
        new WoodenButtonBlock(buttonSettings.mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block INFUSORIAL_BUTTON = registerBiomesBlock("infusorial_button",
        new WoodenButtonBlock(buttonSettings.mapColor(MapColor.TERRACOTTA_PURPLE)));
    public static final Block BUDDING_BUTTON = registerBiomesBlock("budding_button",
        new WoodenButtonBlock(buttonSettings.mapColor(MapColor.TERRACOTTA_PINK)));
    public static final Block REDLEAF_BUTTON = registerBiomesBlock("redleaf_button",
        new WoodenButtonBlock(buttonSettings.mapColor(MapColor.TERRACOTTA_RED)));
    public static final Block FIRE_BUTTON = registerBiomesBlock("fire_button",
        new WoodenButtonBlock(buttonSettings.mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final Block SHINING_BUTTON = registerBiomesBlock("shining_button",
        new WoodenButtonBlock(buttonSettings.mapColor(MapColor.TERRACOTTA_YELLOW)));
    public static final Block SERENE_BUTTON = registerBiomesBlock("serene_button",
        new WoodenButtonBlock(buttonSettings.mapColor(MapColor.TERRACOTTA_LIME)));
    public static final Block SCAB_BUTTON = registerBiomesBlock("scab_button",
        new WoodenButtonBlock(buttonSettings.mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));
    public static final Block INDIGO_BUTTON = registerBiomesBlock("indigo_button",
        new WoodenButtonBlock(buttonSettings.mapColor(MapColor.TERRACOTTA_BLUE)));

    //Pressure Plates
    public static final Block DARK_PRESSURE_PLATE = registerBiomesBlock("dark_pressure_plate",
        new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
            pressurePlateSettings.mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block INFUSORIAL_PRESSURE_PLATE = registerBiomesBlock("infusorial_pressure_plate",
        new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
            pressurePlateSettings.mapColor(MapColor.TERRACOTTA_PURPLE)));
    public static final Block BUDDING_PRESSURE_PLATE = registerBiomesBlock("budding_pressure_plate",
        new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
            pressurePlateSettings.mapColor(MapColor.TERRACOTTA_PINK)));
    public static final Block REDLEAF_PRESSURE_PLATE = registerBiomesBlock("redleaf_pressure_plate",
        new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
            pressurePlateSettings.mapColor(MapColor.TERRACOTTA_RED)));
    public static final Block FIRE_PRESSURE_PLATE = registerBiomesBlock("fire_pressure_plate",
        new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
            pressurePlateSettings.mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final Block SHINING_PRESSURE_PLATE = registerBiomesBlock("shining_pressure_plate",
        new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
            pressurePlateSettings.mapColor(MapColor.TERRACOTTA_YELLOW)));
    public static final Block SERENE_PRESSURE_PLATE = registerBiomesBlock("serene_pressure_plate",
        new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
            pressurePlateSettings.mapColor(MapColor.TERRACOTTA_LIME)));
    public static final Block SCAB_PRESSURE_PLATE = registerBiomesBlock("scab_pressure_plate",
        new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
            pressurePlateSettings.mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));
    public static final Block INDIGO_PRESSURE_PLATE = registerBiomesBlock("indigo_pressure_plate",
        new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
            pressurePlateSettings.mapColor(MapColor.TERRACOTTA_BLUE)));

    //Trapdoors
    public static final Block DARK_TRAPDOOR = registerBiomesBlock("dark_trapdoor",
        new TrapdoorBlock(trapdoorSettings.mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block INFUSORIAL_TRAPDOOR = registerBiomesBlock("infusorial_trapdoor",
        new TrapdoorBlock(trapdoorSettings.mapColor(MapColor.TERRACOTTA_PURPLE)));
    public static final Block BUDDING_TRAPDOOR = registerBiomesBlock("budding_trapdoor",
        new TrapdoorBlock(trapdoorSettings.mapColor(MapColor.TERRACOTTA_PINK)));
    public static final Block REDLEAF_TRAPDOOR = registerBiomesBlock("redleaf_trapdoor",
        new TrapdoorBlock(trapdoorSettings.mapColor(MapColor.TERRACOTTA_RED)));
    public static final Block FIRE_TRAPDOOR = registerBiomesBlock("fire_trapdoor",
        new TrapdoorBlock(trapdoorSettings.mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final Block SHINING_TRAPDOOR = registerBiomesBlock("shining_trapdoor",
        new TrapdoorBlock(trapdoorSettings.mapColor(MapColor.TERRACOTTA_YELLOW)));
    public static final Block SERENE_TRAPDOOR = registerBiomesBlock("serene_trapdoor",
        new TrapdoorBlock(trapdoorSettings.mapColor(MapColor.TERRACOTTA_LIME)));
    public static final Block SCAB_TRAPDOOR = registerBiomesBlock("scab_trapdoor",
        new TrapdoorBlock(trapdoorSettings.mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));
    public static final Block INDIGO_TRAPDOOR = registerBiomesBlock("indigo_trapdoor",
        new TrapdoorBlock(trapdoorSettings.mapColor(MapColor.TERRACOTTA_BLUE)));

    //Doors
    public static final Block DARK_DOOR = registerBiomesBlock("dark_door",
        new DoorBlock(doorSettings.mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block INFUSORIAL_DOOR = registerBiomesBlock("infusorial_door",
        new DoorBlock(doorSettings.mapColor(MapColor.TERRACOTTA_PURPLE)));
    public static final Block BUDDING_DOOR = registerBiomesBlock("budding_door",
        new DoorBlock(doorSettings.mapColor(MapColor.TERRACOTTA_PINK)));
    public static final Block REDLEAF_DOOR = registerBiomesBlock("redleaf_door",
        new DoorBlock(doorSettings.mapColor(MapColor.TERRACOTTA_RED)));
    public static final Block FIRE_DOOR = registerBiomesBlock("fire_door",
        new DoorBlock(doorSettings.mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final Block SHINING_DOOR = registerBiomesBlock("shining_door",
        new DoorBlock(doorSettings.mapColor(MapColor.TERRACOTTA_YELLOW)));
    public static final Block SERENE_DOOR = registerBiomesBlock("serene_door",
        new DoorBlock(doorSettings.mapColor(MapColor.TERRACOTTA_LIME)));
    public static final Block SCAB_DOOR = registerBiomesBlock("scab_door",
        new DoorBlock(doorSettings.mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));
    public static final Block INDIGO_DOOR = registerBiomesBlock("indigo_door",
        new DoorBlock(doorSettings.mapColor(MapColor.TERRACOTTA_BLUE)));

    //Fences
    public static final Block DARK_FENCE = registerBiomesBlock("dark_fence",
        new FenceBlock(fenceSettings.mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block INFUSORIAL_FENCE = registerBiomesBlock("infusorial_fence",
        new FenceBlock(fenceSettings.mapColor(MapColor.TERRACOTTA_PURPLE)));
    public static final Block BUDDING_FENCE = registerBiomesBlock("budding_fence",
        new FenceBlock(fenceSettings.mapColor(MapColor.TERRACOTTA_PINK)));
    public static final Block REDLEAF_FENCE = registerBiomesBlock("redleaf_fence",
        new FenceBlock(fenceSettings.mapColor(MapColor.TERRACOTTA_RED)));
    public static final Block FIRE_FENCE = registerBiomesBlock("fire_fence",
        new FenceBlock(fenceSettings.mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final Block SHINING_FENCE = registerBiomesBlock("shining_fence",
        new FenceBlock(fenceSettings.mapColor(MapColor.TERRACOTTA_YELLOW)));
    public static final Block SERENE_FENCE = registerBiomesBlock("serene_fence",
        new FenceBlock(fenceSettings.mapColor(MapColor.TERRACOTTA_LIME)));
    public static final Block SCAB_FENCE = registerBiomesBlock("scab_fence",
        new FenceBlock(fenceSettings.mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));
    public static final Block INDIGO_FENCE = registerBiomesBlock("indigo_fence",
        new FenceBlock(fenceSettings.mapColor(MapColor.TERRACOTTA_BLUE)));

    //Fence Gates
    public static final Block DARK_FENCE_GATE = registerBiomesBlock("dark_fence_gate",
        new FenceGateBlock(fenceSettings.mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block INFUSORIAL_FENCE_GATE = registerBiomesBlock("infusorial_fence_gate",
        new FenceGateBlock(fenceSettings.mapColor(MapColor.TERRACOTTA_PURPLE)));
    public static final Block BUDDING_FENCE_GATE = registerBiomesBlock("budding_fence_gate",
        new FenceGateBlock(fenceSettings.mapColor(MapColor.TERRACOTTA_PINK)));
    public static final Block REDLEAF_FENCE_GATE = registerBiomesBlock("redleaf_fence_gate",
        new FenceGateBlock(fenceSettings.mapColor(MapColor.TERRACOTTA_RED)));
    public static final Block FIRE_FENCE_GATE = registerBiomesBlock("fire_fence_gate",
        new FenceGateBlock(fenceSettings.mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final Block SHINING_FENCE_GATE = registerBiomesBlock("shining_fence_gate",
        new FenceGateBlock(fenceSettings.mapColor(MapColor.TERRACOTTA_YELLOW)));
    public static final Block SERENE_FENCE_GATE = registerBiomesBlock("serene_fence_gate",
        new FenceGateBlock(fenceSettings.mapColor(MapColor.TERRACOTTA_LIME)));
    public static final Block SCAB_FENCE_GATE = registerBiomesBlock("scab_fence_gate",
        new FenceGateBlock(fenceSettings.mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));
    public static final Block INDIGO_FENCE_GATE = registerBiomesBlock("indigo_fence_gate",
        new FenceGateBlock(fenceSettings.mapColor(MapColor.TERRACOTTA_BLUE)));

    //Signs
    public static final Block DARK_SIGN = registerBlockOnly("dark_sign",
        new SignBlock(signSettings.mapColor(MapColor.TERRACOTTA_BLACK), ModSignTypes.DARK));
    public static final Block INFUSORIAL_SIGN = registerBlockOnly("infusorial_sign",
        new SignBlock(signSettings.mapColor(MapColor.TERRACOTTA_PURPLE), ModSignTypes.INFUSORIAL));
    public static final Block BUDDING_SIGN = registerBlockOnly("budding_sign",
        new SignBlock(signSettings.mapColor(MapColor.TERRACOTTA_PINK), ModSignTypes.BUDDING));
    public static final Block REDLEAF_SIGN = registerBlockOnly("redleaf_sign",
        new SignBlock(signSettings.mapColor(MapColor.TERRACOTTA_RED), ModSignTypes.REDLEAF));
    public static final Block FIRE_SIGN = registerBlockOnly("fire_sign",
        new SignBlock(signSettings.mapColor(MapColor.TERRACOTTA_ORANGE), ModSignTypes.FIRE));
    public static final Block SHINING_SIGN = registerBlockOnly("shining_sign",
        new SignBlock(signSettings.mapColor(MapColor.TERRACOTTA_YELLOW), ModSignTypes.SHINING));
    public static final Block SERENE_SIGN = registerBlockOnly("serene_sign",
        new SignBlock(signSettings.mapColor(MapColor.TERRACOTTA_LIME), ModSignTypes.SERENE));
    public static final Block SCAB_SIGN = registerBlockOnly("scab_sign",
        new SignBlock(signSettings.mapColor(MapColor.TERRACOTTA_LIGHT_BLUE), ModSignTypes.SCAB));
    public static final Block INDIGO_SIGN = registerBlockOnly("indigo_sign",
        new SignBlock(signSettings.mapColor(MapColor.TERRACOTTA_BLUE), ModSignTypes.INDIGO));
    //Wall Signs
    public static final Block DARK_WALL_SIGN = registerBlockOnly("dark_wall_sign",
        new WallSignBlock(signSettings.mapColor(MapColor.TERRACOTTA_BLACK).dropsLike(ModBlocks.DARK_SIGN),
            ModSignTypes.DARK));
    public static final Block INFUSORIAL_WALL_SIGN = registerBlockOnly("infusorial_wall_sign",
        new WallSignBlock(signSettings.mapColor(MapColor.TERRACOTTA_PURPLE).dropsLike(ModBlocks.INFUSORIAL_SIGN),
            ModSignTypes.INFUSORIAL));
    public static final Block BUDDING_WALL_SIGN = registerBlockOnly("budding_wall_sign",
        new WallSignBlock(signSettings.mapColor(MapColor.TERRACOTTA_PINK).dropsLike(ModBlocks.BUDDING_SIGN),
            ModSignTypes.BUDDING));
    public static final Block REDLEAF_WALL_SIGN = registerBlockOnly("redleaf_wall_sign",
        new WallSignBlock(signSettings.mapColor(MapColor.TERRACOTTA_RED).dropsLike(ModBlocks.REDLEAF_SIGN),
            ModSignTypes.REDLEAF));
    public static final Block FIRE_WALL_SIGN = registerBlockOnly("fire_wall_sign",
        new WallSignBlock(signSettings.mapColor(MapColor.TERRACOTTA_ORANGE).dropsLike(ModBlocks.FIRE_SIGN),
            ModSignTypes.FIRE));
    public static final Block SHINING_WALL_SIGN = registerBlockOnly("shining_wall_sign",
        new WallSignBlock(signSettings.mapColor(MapColor.TERRACOTTA_YELLOW).dropsLike(ModBlocks.SHINING_SIGN),
            ModSignTypes.SHINING));
    public static final Block SERENE_WALL_SIGN = registerBlockOnly("serene_wall_sign",
        new WallSignBlock(signSettings.mapColor(MapColor.TERRACOTTA_LIME).dropsLike(ModBlocks.SERENE_SIGN),
            ModSignTypes.SERENE));
    public static final Block SCAB_WALL_SIGN = registerBlockOnly("scab_wall_sign",
        new WallSignBlock(signSettings.mapColor(MapColor.TERRACOTTA_LIGHT_BLUE).dropsLike(ModBlocks.SCAB_SIGN),
            ModSignTypes.SCAB));
    public static final Block INDIGO_WALL_SIGN = registerBlockOnly("indigo_wall_sign",
        new WallSignBlock(signSettings.mapColor(MapColor.TERRACOTTA_BLUE).dropsLike(ModBlocks.INDIGO_SIGN),
            ModSignTypes.INDIGO));

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

    //Lanterns
    public static final Block DARK_LANTERN = registerBiomesBlock("dark_lantern",
        new LanternBlock(lanternSettings));
    public static final Block INFUSORIAL_LANTERN = registerBiomesBlock("infusorial_lantern",
        new LanternBlock(lanternSettings));
    public static final Block BUDDING_LANTERN = registerBiomesBlock("budding_lantern",
        new LanternBlock(lanternSettings));
    public static final Block REDLEAF_LANTERN = registerBiomesBlock("redleaf_lantern",
        new LanternBlock(lanternSettings));
    public static final Block FIRE_LANTERN = registerBiomesBlock("fire_lantern",
        new LanternBlock(lanternSettings));
    public static final Block SHINING_LANTERN = registerBiomesBlock("shining_lantern",
        new LanternBlock(lanternSettings));
    public static final Block SERENE_LANTERN = registerBiomesBlock("serene_lantern",
        new LanternBlock(lanternSettings));
    public static final Block SCAB_LANTERN = registerBiomesBlock("scab_lantern",
        new LanternBlock(lanternSettings));
    public static final Block INDIGO_LANTERN = registerBiomesBlock("indigo_lantern",
        new LanternBlock(lanternSettings));

    //Waylamps
    public static final Block DARK_WAYLAMP = registerBiomesBlock("dark_waylamp",
        new Block(waylampSettings.mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block INFUSORIAL_WAYLAMP = registerBiomesBlock("infusorial_waylamp",
        new Block(waylampSettings.mapColor(MapColor.TERRACOTTA_PURPLE)));
    public static final Block BUDDING_WAYLAMP = registerBiomesBlock("budding_waylamp",
        new Block(waylampSettings.mapColor(MapColor.TERRACOTTA_PINK)));
    public static final Block REDLEAF_WAYLAMP = registerBiomesBlock("redleaf_waylamp",
        new Block(waylampSettings.mapColor(MapColor.TERRACOTTA_RED)));
    public static final Block FIRE_WAYLAMP = registerBiomesBlock("fire_waylamp",
        new Block(waylampSettings.mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final Block SHINING_WAYLAMP = registerBiomesBlock("shining_waylamp",
        new Block(waylampSettings.mapColor(MapColor.TERRACOTTA_YELLOW)));
    public static final Block SERENE_WAYLAMP = registerBiomesBlock("serene_waylamp",
        new Block(waylampSettings.mapColor(MapColor.TERRACOTTA_LIME)));
    public static final Block SCAB_WAYLAMP = registerBiomesBlock("scab_waylamp",
        new Block(waylampSettings.mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));
    public static final Block INDIGO_WAYLAMP = registerBiomesBlock("indigo_waylamp",
        new Block(waylampSettings.mapColor(MapColor.TERRACOTTA_BLUE)));

    //Bookshelves
    public static final Block DARK_BOOKSHELF = registerBiomesBlock("dark_bookshelf",
        new Block(bookshelfSettings.mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block INFUSORIAL_BOOKSHELF = registerBiomesBlock("infusorial_bookshelf",
        new Block(bookshelfSettings.mapColor(MapColor.TERRACOTTA_PURPLE)));
    public static final Block BUDDING_BOOKSHELF = registerBiomesBlock("budding_bookshelf",
        new Block(bookshelfSettings.mapColor(MapColor.TERRACOTTA_PINK)));
    public static final Block REDLEAF_BOOKSHELF = registerBiomesBlock("redleaf_bookshelf",
        new Block(bookshelfSettings.mapColor(MapColor.TERRACOTTA_RED)));
    public static final Block FIRE_BOOKSHELF = registerBiomesBlock("fire_bookshelf",
        new Block(bookshelfSettings.mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final Block SHINING_BOOKSHELF = registerBiomesBlock("shining_bookshelf",
        new Block(bookshelfSettings.mapColor(MapColor.TERRACOTTA_YELLOW)));
    public static final Block SERENE_BOOKSHELF = registerBiomesBlock("serene_bookshelf",
        new Block(bookshelfSettings.mapColor(MapColor.TERRACOTTA_LIME)));
    public static final Block SCAB_BOOKSHELF = registerBiomesBlock("scab_bookshelf",
        new Block(bookshelfSettings.mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));
    public static final Block INDIGO_BOOKSHELF = registerBiomesBlock("indigo_bookshelf",
        new Block(bookshelfSettings.mapColor(MapColor.TERRACOTTA_BLUE)));

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

    //Saplings
    public static final Block DARK_SAPLING = registerBiomesBlock("dark_sapling",
        new ModSaplingBlock(new DarkSaplingGenerator(), saplingSettings.mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block INFUSORIAL_SAPLING = registerBiomesBlock("infusorial_sapling",
        new ModSaplingBlock(new InfusorialSaplingGenerator(), saplingSettings.mapColor(MapColor.TERRACOTTA_PURPLE)));
    public static final Block BUDDING_SAPLING = registerBiomesBlock("budding_sapling",
        new ModSaplingBlock(new BuddingSaplingGenerator(), saplingSettings.mapColor(MapColor.TERRACOTTA_PINK)));
    public static final Block REDLEAF_SAPLING = registerBiomesBlock("redleaf_sapling",
        new ModSaplingBlock(new RedleafSaplingGenerator(), saplingSettings.mapColor(MapColor.TERRACOTTA_RED)));
    public static final Block FIRE_SAPLING = registerBiomesBlock("fire_sapling",
        new ModSaplingBlock(new FireSaplingGenerator(), saplingSettings.mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final Block SHINING_SAPLING = registerBiomesBlock("shining_sapling",
        new ModSaplingBlock(new ShiningSaplingGenerator(), saplingSettings.mapColor(MapColor.TERRACOTTA_YELLOW)));
    public static final Block SERENE_SAPLING = registerBiomesBlock("serene_sapling",
        new ModSaplingBlock(new SereneSaplingGenerator(), saplingSettings.mapColor(MapColor.TERRACOTTA_LIME)));
    public static final Block SCAB_SAPLING = registerBiomesBlock("scab_sapling",
        new ModSaplingBlock(new ScabSaplingGenerator(), saplingSettings.mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));
    public static final Block INDIGO_SAPLING = registerBiomesBlock("indigo_sapling",
        new ModSaplingBlock(new IndigoSaplingGenerator(), saplingSettings.mapColor(MapColor.TERRACOTTA_BLUE)));
    //Potted Saplings
    public static final Block POTTED_DARK_SAPLING = registerBlockOnly("potted_dark_sapling",
        new FlowerPotBlock(DARK_SAPLING, pottedSaplingSettings.mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block POTTED_INFUSORIAL_SAPLING = registerBlockOnly("potted_infusorial_sapling",
        new FlowerPotBlock(INFUSORIAL_SAPLING, pottedSaplingSettings.mapColor(MapColor.TERRACOTTA_PURPLE)));
    public static final Block POTTED_BUDDING_SAPLING = registerBlockOnly("potted_budding_sapling",
        new FlowerPotBlock(BUDDING_SAPLING, pottedSaplingSettings.mapColor(MapColor.TERRACOTTA_PINK)));
    public static final Block POTTED_REDLEAF_SAPLING = registerBlockOnly("potted_redleaf_sapling",
        new FlowerPotBlock(REDLEAF_SAPLING, pottedSaplingSettings.mapColor(MapColor.TERRACOTTA_RED)));
    public static final Block POTTED_FIRE_SAPLING = registerBlockOnly("potted_fire_sapling",
        new FlowerPotBlock(FIRE_SAPLING, pottedSaplingSettings.mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final Block POTTED_SHINING_SAPLING = registerBlockOnly("potted_shining_sapling",
        new FlowerPotBlock(SHINING_SAPLING, pottedSaplingSettings.mapColor(MapColor.TERRACOTTA_YELLOW)));
    public static final Block POTTED_SERENE_SAPLING = registerBlockOnly("potted_serene_sapling",
        new FlowerPotBlock(SERENE_SAPLING, pottedSaplingSettings.mapColor(MapColor.TERRACOTTA_LIME)));
    public static final Block POTTED_SCAB_SAPLING = registerBlockOnly("potted_scab_sapling",
        new FlowerPotBlock(SCAB_SAPLING, pottedSaplingSettings.mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));
    public static final Block POTTED_INDIGO_SAPLING = registerBlockOnly("potted_indigo_sapling",
        new FlowerPotBlock(INDIGO_SAPLING, pottedSaplingSettings.mapColor(MapColor.TERRACOTTA_BLUE)));

    //1 block tall Grass
    public static final Block DARK_GRASS = registerBiomesBlock("dark_grass",
        new ModFernBlock(grassSettings));
    public static final Block INFUSORIAL_GRASS = registerBiomesBlock("infusorial_grass",
        new ModFernBlock(grassSettings));
    public static final Block BUDDING_GRASS = registerBiomesBlock("budding_grass",
        new ModFernBlock(grassSettings));
    public static final Block REDLEAF_GRASS = registerBiomesBlock("redleaf_grass",
        new ModFernBlock(grassSettings));
    public static final Block FIRE_GRASS = registerBiomesBlock("fire_grass",
        new ModFernBlock(grassSettings));
    public static final Block SHINING_GRASS = registerBiomesBlock("shining_grass",
        new ModShortFernBlock(grassSettings));
    public static final Block SERENE_GRASS = registerBiomesBlock("serene_grass",
        new ModFernBlock(grassSettings));
    public static final Block SCAB_GRASS = registerBiomesBlock("scab_grass",
        new ModFernBlock(grassSettings));
    public static final Block INDIGO_GRASS = registerBiomesBlock("indigo_grass",
        new ModFernBlock(grassSettings));

    //Tall Grass
    public static final Block REDLEAF_TALL_GRASS = registerBiomesBlock("redleaf_tall_grass",
        new ModTallPlantBlock(grassSettings));

    //Roots
    public static final Block FIRE_ROOTS = registerBiomesBlock("fire_roots",
        new ModFernBlock(grassSettings));
    public static final Block SERENE_ROOTS = registerBiomesBlock("serene_roots",
        new ModFernBlock(grassSettings));
    public static final Block SCAB_ROOTS = registerBiomesBlock("scab_roots",
        new ModFernBlock(grassSettings));

    //Sprouts
    public static final Block BUDDING_SPROUTS = registerBiomesBlock("budding_sprouts",
        new ModFernBlock(grassSettings));
    public static final Block SERENE_SPROUTS = registerBiomesBlock("serene_sprouts",
        new ModFernBlock(grassSettings));
    public static final Block SCAB_SPROUTS = registerBiomesBlock("scab_sprouts",
        new ModFernBlock(grassSettings));

    //Flowers
    public static final Block REDLEAF_FLOWER = registerBiomesBlock("redleaf_flower",
        new ModFlowerBlock(StatusEffects.HEALTH_BOOST, 200, flowerSettings));
    public static final Block POTTED_REDLEAF_FLOWER = registerBlockOnly("potted_redleaf_flower",
        new FlowerPotBlock(ModBlocks.REDLEAF_FLOWER, flowerSettings));
    public static final Block INDIGO_FLOWER = registerBiomesBlock("indigo_flower",
        new ModFlowerBlock(StatusEffects.HASTE, 200, flowerSettings));
    public static final Block POTTED_INDIGO_FLOWER = registerBlockOnly("potted_indigo_flower",
        new FlowerPotBlock(ModBlocks.INDIGO_FLOWER, flowerSettings));

    //Indigo Lily Pad
    public static final Block INDIGO_LILY_PAD = registerBlockOnly("indigo_lily_pad",
        new LilyPadBlock(lilyPadSettings));

    //Pondu
    public static final Block PONDU = registerBlockOnly("pondu",
        new PonduHeadBlock(caveVineSettings.ticksRandomly()));
    public static final Block PONDU_PLANT = registerBlockOnly("pondu_plant",
        new PonduBodyBlock(caveVineSettings));
    //Branius
    public static final Block BRANIUS = registerBlockOnly("branius",
        new BraniusHeadBlock(caveVineSettings.ticksRandomly()));
    public static final Block BRANIUS_PLANT = registerBlockOnly("branius_plant",
        new BraniusBodyBlock(caveVineSettings));
    //Budding Vines
    public static final Block BUDDING_VINES = registerBiomesBlock("budding_vines",
        new BuddingVinesBlock(vineSettings));
    public static final Block BUDDING_VINES_PLANT = registerBlockOnly("budding_vines_plant",
        new BuddingVinesPlantBlock(vineSettings));
    //Indigo Vines
    public static final Block INDIGO_VINES = registerBiomesBlock("indigo_vines",
        new IndigoVinesBlock(vineSettings));
    public static final Block INDIGO_VINES_PLANT = registerBlockOnly("indigo_vines_plant",
        new IndigoVinesPlantBlock(vineSettings));

    //Xibien
    public static final Block XIBIEN = registerBiomesBlock("xibien",
        new EndGrassBlock(stoneSettings.mapColor(MapColor.TERRACOTTA_CYAN)));

    //Wave End Stones
    public static final Block DARK_WAVE_END_STONE = registerBiomesBlock("dark_wave_end_stone",
        new Block(stoneSettings.mapColor(MapColor.PALE_YELLOW)));
    public static final Block INFUSORIAL_WAVE_END_STONE = registerBiomesBlock("infusorial_wave_end_stone",
        new Block(stoneSettings.mapColor(MapColor.PALE_YELLOW)));
    public static final Block REDLEAF_WAVE_END_STONE = registerBiomesBlock("redleaf_wave_end_stone",
        new Block(stoneSettings.mapColor(MapColor.PALE_YELLOW)));
    public static final Block SHINING_WAVE_END_STONE = registerBiomesBlock("shining_wave_end_stone",
        new Block(stoneSettings.mapColor(MapColor.PALE_YELLOW)));
    public static final Block SCAB_WAVE_END_STONE = registerBiomesBlock("scab_wave_end_stone",
        new Block(stoneSettings.mapColor(MapColor.PALE_YELLOW)));
    public static final Block INDIGO_WAVE_END_STONE = registerBiomesBlock("indigo_wave_end_stone",
        new Block(stoneSettings.mapColor(MapColor.PALE_YELLOW)));

    //Stones
    //Dark Sand
    public static final Block DARK_SAND = registerBiomesBlock("dark_sand",
        new SandBlock(MapColor.TERRACOTTA_BLACK.color, stoneSettings.mapColor(MapColor.TERRACOTTA_BLACK)));
    //Dark Sandstone
    public static final Block DARK_SANDSTONE = registerBiomesBlock("dark_sandstone",
        new Block(stoneSettings.mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block DARK_SANDSTONE_SLAB = registerBiomesBlock("dark_sandstone_slab",
        new SlabBlock(stoneSettings.mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block DARK_SANDSTONE_STAIRS = registerBiomesBlock("dark_sandstone_stairs",
        new StairsBlock(ModBlocks.DARK_SANDSTONE.getDefaultState(), stoneSettings.mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block DARK_SANDSTONE_VERTICAL_SLAB = registerBiomesBlock("dark_sandstone_vertical_slab",
        new VerticalSlabBlock(stoneSettings.mapColor(MapColor.TERRACOTTA_BLACK)));
    //Smooth Dark Sandstone
    public static final Block SMOOTH_DARK_SANDSTONE = registerBiomesBlock("smooth_dark_sandstone",
        new Block(stoneSettings.mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block SMOOTH_DARK_SANDSTONE_SLAB = registerBiomesBlock("smooth_dark_sandstone_slab",
        new SlabBlock(stoneSettings.mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block SMOOTH_DARK_SANDSTONE_STAIRS = registerBiomesBlock("smooth_dark_sandstone_stairs",
        new StairsBlock(ModBlocks.SMOOTH_DARK_SANDSTONE.getDefaultState(), stoneSettings.mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block SMOOTH_DARK_SANDSTONE_VERTICAL_SLAB = registerBiomesBlock("smooth_dark_sandstone_vertical_slab",
        new VerticalSlabBlock(stoneSettings.mapColor(MapColor.TERRACOTTA_BLACK)));
    //Cut Dark Sandstone
    public static final Block CUT_DARK_SANDSTONE = registerBiomesBlock("cut_dark_sandstone",
        new Block(stoneSettings.mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block CUT_DARK_SANDSTONE_SLAB = registerBiomesBlock("cut_dark_sandstone_slab",
        new SlabBlock(stoneSettings.mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block CUT_DARK_SANDSTONE_STAIRS = registerBiomesBlock("cut_dark_sandstone_stairs",
        new StairsBlock(ModBlocks.CUT_DARK_SANDSTONE.getDefaultState(), stoneSettings.mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block CUT_DARK_SANDSTONE_VERTICAL_SLAB = registerBiomesBlock("cut_dark_sandstone_vertical_slab",
        new VerticalSlabBlock(stoneSettings.mapColor(MapColor.TERRACOTTA_BLACK)));
    //Chiseled Dark Sandstone
    public static final Block CHISELED_DARK_SANDSTONE = registerBiomesBlock("chiseled_dark_sandstone",
        new Block(stoneSettings.mapColor(MapColor.TERRACOTTA_BLACK)));

    //Infusorial Stone
    public static final Block INFUSORIAL_STONE = registerBiomesBlock("infusorial_stone",
        new Block(stoneSettings.mapColor(MapColor.TERRACOTTA_PURPLE)));
    public static final Block INFUSORIAL_STONE_SLAB = registerBiomesBlock("infusorial_stone_slab",
        new SlabBlock(stoneSettings.mapColor(MapColor.TERRACOTTA_PURPLE)));
    public static final Block INFUSORIAL_STONE_STAIRS = registerBiomesBlock("infusorial_stone_stairs",
        new StairsBlock(ModBlocks.INFUSORIAL_STONE.getDefaultState(), stoneSettings.mapColor(MapColor.TERRACOTTA_PURPLE)));
    public static final Block INFUSORIAL_STONE_VERTICAL_SLAB = registerBiomesBlock("infusorial_stone_vertical_slab",
        new VerticalSlabBlock(stoneSettings.mapColor(MapColor.TERRACOTTA_PURPLE)));
    public static final Block INFUSORIAL_STONE_BUTTON = registerBiomesBlock("infusorial_stone_button",
        new StoneButtonBlock(stoneButtonSettings.mapColor(MapColor.TERRACOTTA_PURPLE)));
    public static final Block INFUSORIAL_STONE_PRESSURE_PLATE = registerBiomesBlock("infusorial_stone_pressure_plate",
        new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
            stonePressurePlateSettings.mapColor(MapColor.TERRACOTTA_PURPLE)));
    //Smooth Infusorial Stone
    public static final Block SMOOTH_INFUSORIAL_STONE = registerBiomesBlock("smooth_infusorial_stone",
        new Block(stoneSettings.mapColor(MapColor.TERRACOTTA_PURPLE)));
    public static final Block SMOOTH_INFUSORIAL_STONE_SLAB = registerBiomesBlock("smooth_infusorial_stone_slab",
        new SlabBlock(stoneSettings.mapColor(MapColor.TERRACOTTA_PURPLE)));
    public static final Block SMOOTH_INFUSORIAL_STONE_VERTICAL_SLAB = registerBiomesBlock("smooth_infusorial_stone_vertical_slab",
        new VerticalSlabBlock(stoneSettings.mapColor(MapColor.TERRACOTTA_PURPLE)));
    //Infusorial Stone Bricks
    public static final Block INFUSORIAL_STONE_BRICKS = registerBiomesBlock("infusorial_stone_bricks",
        new Block(stoneSettings.mapColor(MapColor.TERRACOTTA_PURPLE)));
    public static final Block INFUSORIAL_STONE_BRICK_SLAB = registerBiomesBlock("infusorial_stone_brick_slab",
        new SlabBlock(stoneSettings.mapColor(MapColor.TERRACOTTA_PURPLE)));
    public static final Block INFUSORIAL_STONE_BRICK_STAIRS = registerBiomesBlock("infusorial_stone_brick_stairs",
        new StairsBlock(ModBlocks.INFUSORIAL_STONE_BRICKS.getDefaultState(), stoneSettings.mapColor(MapColor.TERRACOTTA_PURPLE)));
    public static final Block INFUSORIAL_STONE_BRICK_VERTICAL_SLAB = registerBiomesBlock("infusorial_stone_brick_vertical_slab",
        new VerticalSlabBlock(stoneSettings.mapColor(MapColor.TERRACOTTA_PURPLE)));
    public static final Block INFUSORIAL_STONE_BRICK_WALL = registerBiomesBlock("infusorial_stone_brick_wall",
        new WallBlock(stoneSettings.mapColor(MapColor.TERRACOTTA_PURPLE)));

    //Redleaf Stone
    public static final Block REDLEAF_STONE = registerBiomesBlock("redleaf_stone",
        new Block(stoneSettings.mapColor(MapColor.TERRACOTTA_RED)));
    public static final Block REDLEAF_STONE_SLAB = registerBiomesBlock("redleaf_stone_slab",
        new SlabBlock(stoneSettings.mapColor(MapColor.TERRACOTTA_RED)));
    public static final Block REDLEAF_STONE_STAIRS = registerBiomesBlock("redleaf_stone_stairs",
        new StairsBlock(ModBlocks.REDLEAF_STONE.getDefaultState(), stoneSettings.mapColor(MapColor.TERRACOTTA_RED)));
    public static final Block REDLEAF_STONE_VERTICAL_SLAB = registerBiomesBlock("redleaf_stone_vertical_slab",
        new VerticalSlabBlock(stoneSettings.mapColor(MapColor.TERRACOTTA_RED)));
    public static final Block REDLEAF_STONE_BUTTON = registerBiomesBlock("redleaf_stone_button",
        new StoneButtonBlock(stoneButtonSettings.mapColor(MapColor.TERRACOTTA_RED)));
    public static final Block REDLEAF_STONE_PRESSURE_PLATE = registerBiomesBlock("redleaf_stone_pressure_plate",
        new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
            stonePressurePlateSettings.mapColor(MapColor.TERRACOTTA_RED)));
    //Polished Redleaf Stone
    public static final Block POLISHED_REDLEAF_STONE = registerBiomesBlock("polished_redleaf_stone",
        new Block(stoneSettings.mapColor(MapColor.TERRACOTTA_RED)));
    public static final Block POLISHED_REDLEAF_STONE_SLAB = registerBiomesBlock("polished_redleaf_stone_slab",
        new SlabBlock(stoneSettings.mapColor(MapColor.TERRACOTTA_RED)));
    public static final Block POLISHED_REDLEAF_STONE_STAIRS = registerBiomesBlock("polished_redleaf_stone_stairs",
        new StairsBlock(ModBlocks.POLISHED_REDLEAF_STONE.getDefaultState(), stoneSettings.mapColor(MapColor.TERRACOTTA_RED)));
    public static final Block POLISHED_REDLEAF_STONE_VERTICAL_SLAB = registerBiomesBlock("polished_redleaf_stone_vertical_slab",
        new VerticalSlabBlock(stoneSettings.mapColor(MapColor.TERRACOTTA_RED)));
    //Redleaf Stone Bricks
    public static final Block REDLEAF_STONE_BRICKS = registerBiomesBlock("redleaf_stone_bricks",
        new Block(stoneSettings.mapColor(MapColor.TERRACOTTA_RED)));
    public static final Block REDLEAF_STONE_BRICK_SLAB = registerBiomesBlock("redleaf_stone_brick_slab",
        new SlabBlock(stoneSettings.mapColor(MapColor.TERRACOTTA_RED)));
    public static final Block REDLEAF_STONE_BRICK_STAIRS = registerBiomesBlock("redleaf_stone_brick_stairs",
        new StairsBlock(ModBlocks.REDLEAF_STONE_BRICKS.getDefaultState(), stoneSettings.mapColor(MapColor.TERRACOTTA_RED)));
    public static final Block REDLEAF_STONE_BRICK_VERTICAL_SLAB = registerBiomesBlock("redleaf_stone_brick_vertical_slab",
        new VerticalSlabBlock(stoneSettings.mapColor(MapColor.TERRACOTTA_RED)));
    public static final Block REDLEAF_STONE_BRICK_WALL = registerBiomesBlock("redleaf_stone_brick_wall",
        new WallBlock(stoneSettings.mapColor(MapColor.TERRACOTTA_RED)));

    //Scab Stone
    public static final Block SCAB_STONE = registerBiomesBlock("scab_stone",
        new Block(stoneSettings.mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));
    public static final Block SCAB_STONE_SLAB = registerBiomesBlock("scab_stone_slab",
        new SlabBlock(stoneSettings.mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));
    public static final Block SCAB_STONE_STAIRS = registerBiomesBlock("scab_stone_stairs",
        new StairsBlock(ModBlocks.SCAB_STONE.getDefaultState(), stoneSettings.mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));
    public static final Block SCAB_STONE_VERTICAL_SLAB = registerBiomesBlock("scab_stone_vertical_slab",
        new VerticalSlabBlock(stoneSettings.mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));
    public static final Block SCAB_STONE_BUTTON = registerBiomesBlock("scab_stone_button",
        new StoneButtonBlock(stoneButtonSettings.mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));
    public static final Block SCAB_STONE_PRESSURE_PLATE = registerBiomesBlock("scab_stone_pressure_plate",
        new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
            stonePressurePlateSettings.mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));
    //Polished Scab Stone
    public static final Block POLISHED_SCAB_STONE = registerBiomesBlock("polished_scab_stone",
        new Block(stoneSettings.mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));
    public static final Block POLISHED_SCAB_STONE_SLAB = registerBiomesBlock("polished_scab_stone_slab",
        new SlabBlock(stoneSettings.mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));
    public static final Block POLISHED_SCAB_STONE_STAIRS = registerBiomesBlock("polished_scab_stone_stairs",
        new StairsBlock(ModBlocks.POLISHED_SCAB_STONE.getDefaultState(), stoneSettings.mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));
    public static final Block POLISHED_SCAB_STONE_VERTICAL_SLAB = registerBiomesBlock("polished_scab_stone_vertical_slab",
        new VerticalSlabBlock(stoneSettings.mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));

    //Indigo Soil
    public static final Block INDIGO_SOIL = registerBiomesBlock("indigo_soil",
        new Block(stoneSettings.mapColor(MapColor.TERRACOTTA_BLUE).sounds(BlockSoundGroup.SOUL_SOIL)));
    //Indigo Soil Bricks
    public static final Block INDIGO_SOIL_BRICKS = registerBiomesBlock("indigo_soil_bricks",
        new Block(stoneSettings.mapColor(MapColor.TERRACOTTA_BLUE).sounds(BlockSoundGroup.STONE)));
    public static final Block INDIGO_SOIL_BRICK_SLAB = registerBiomesBlock("indigo_soil_brick_slab",
        new SlabBlock(stoneSettings.mapColor(MapColor.TERRACOTTA_BLUE)));
    public static final Block INDIGO_SOIL_BRICK_STAIRS = registerBiomesBlock("indigo_soil_brick_stairs",
        new StairsBlock(ModBlocks.INDIGO_SOIL_BRICKS.getDefaultState(), stoneSettings.mapColor(MapColor.TERRACOTTA_BLUE)));
    public static final Block INDIGO_SOIL_VERTICAL_SLAB = registerBiomesBlock("indigo_soil_brick_vertical_slab",
        new VerticalSlabBlock(stoneSettings.mapColor(MapColor.TERRACOTTA_BLUE)));
    public static final Block INDIGO_SOIL_BRICK_WALL = registerBiomesBlock("indigo_soil_brick_wall",
        new WallBlock(stoneSettings.mapColor(MapColor.TERRACOTTA_BLUE)));
    //Chiseled Indigo Soil Bricks
    public static final Block CHISELED_INDIGO_SOIL_BRICKS = registerBiomesBlock("chiseled_indigo_soil_bricks",
        new Block(stoneSettings.mapColor(MapColor.TERRACOTTA_BLUE)));

    //Wasp Moss
    public static final Block WASP_MOSS_BLOCK = registerBiomesBlock("wasp_moss_block",
        new MossBlock(mossSettings.mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final Block WASP_MOSS_CARPET = registerBlockOnly("wasp_moss_carpet",
        new CarpetBlock(mossSettings.mapColor(MapColor.TERRACOTTA_ORANGE)));

    //End Stone and Purpur
    public static final Block POLISHED_END_STONE = registerBlock("polished_end_stone",
        new Block(stoneSettings.mapColor(MapColor.PALE_YELLOW)));
    public static final Block END_STONE_TILES = registerBlock("end_stone_tiles",
        new Block(stoneSettings.mapColor(MapColor.PALE_YELLOW)));
    public static final Block CRACKED_END_STONE_BRICKS = registerBlock("cracked_end_stone_bricks",
        new Block(stoneSettings.mapColor(MapColor.PALE_YELLOW)));
    public static final Block CHISELED_END_STONE_BRICKS = registerBlock("chiseled_end_stone_bricks",
        new Block(stoneSettings.mapColor(MapColor.PALE_YELLOW)));
    public static final Block END_STONE_PILLAR = registerBlock("end_stone_pillar",
        new PillarBlock(stoneSettings.mapColor(MapColor.PALE_YELLOW)));
    public static final Block CRACKED_PURPUR = registerBlock("cracked_purpur",
        new Block(stoneSettings.mapColor(MapColor.MAGENTA).strength(1.5f, 6.0f)));
    //Waylamp
    public static final Block WAYLAMP = registerBlock("waylamp",
        new Block(waylampSettings.mapColor(MapColor.YELLOW)));
    //Xorum
    public static final Block XORUM_ORE = registerBlockOnly("xorum_ore",
        new OreBlock(stoneSettings.mapColor(MapColor.TERRACOTTA_CYAN), UniformIntProvider.create(2, 6)));

    private static Block registerBiomesBlock(String name, Block block) {
        registerBlockItem(name, block, ModItemGroup.IMPROVED_END_BIOMES_BLOCKS);
        return Registry.register(Registry.BLOCK, new Identifier(ImprovedEnd.MOD_ID, name), block);
    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block, ModItemGroup.IMPROVED_END_BLOCKS);
        return Registry.register(Registry.BLOCK, new Identifier(ImprovedEnd.MOD_ID, name), block);
    }

    private static Block registerBlockOnly(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(ImprovedEnd.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block, ItemGroup group) {
        Registry.register(Registry.ITEM, new Identifier(ImprovedEnd.MOD_ID, name),
            new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        System.out.println("Registering ModBlocks for " + ImprovedEnd.MOD_ID);
    }
}
