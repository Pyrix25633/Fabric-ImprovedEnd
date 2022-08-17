package net.rupyber_studios.improved_end.world.feature;

import net.minecraft.block.Blocks;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.JungleFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.ForkingTrunkPlacer;
import net.rupyber_studios.improved_end.ImprovedEnd;
import net.rupyber_studios.improved_end.block.ModBlocks;

import java.util.List;

public class ModConfiguredFeatures {
    //Trees
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> DARK_TREE =
            ConfiguredFeatures.register("dark_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.DARK_LOG),
                    new ForkingTrunkPlacer(5, 6, 3),
                    BlockStateProvider.of(ModBlocks.DARK_LEAVES),
                    new JungleFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4),
                    new TwoLayersFeatureSize(1, 0, 2))
                    .dirtProvider(BlockStateProvider.of(Blocks.END_STONE)).build());
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> INFUSORIAL_TREE =
            ConfiguredFeatures.register("infusorial_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.INFUSORIAL_LOG),
                    new ForkingTrunkPlacer(5, 6, 3),
                    BlockStateProvider.of(ModBlocks.INFUSORIAL_LEAVES),
                    new JungleFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4),
                    new TwoLayersFeatureSize(1, 0, 2))
                    .dirtProvider(BlockStateProvider.of(Blocks.END_STONE)).build());
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> BUDDING_TREE =
            ConfiguredFeatures.register("budding_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.BUDDING_LOG),
                    new ForkingTrunkPlacer(5, 6, 3),
                    BlockStateProvider.of(ModBlocks.BUDDING_LEAVES),
                    new JungleFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4),
                    new TwoLayersFeatureSize(1, 0, 2))
                    .dirtProvider(BlockStateProvider.of(Blocks.END_STONE)).build());
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> REDLEAF_TREE =
            ConfiguredFeatures.register("redleaf_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.REDLEAF_LOG),
                    new ForkingTrunkPlacer(5, 6, 3),
                    BlockStateProvider.of(ModBlocks.REDLEAF_LEAVES),
                    new JungleFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4),
                    new TwoLayersFeatureSize(1, 0, 2))
                    .dirtProvider(BlockStateProvider.of(Blocks.END_STONE)).build());
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> FIRE_TREE =
            ConfiguredFeatures.register("fire_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.FIRE_LOG),
                    new ForkingTrunkPlacer(5, 6, 3),
                    BlockStateProvider.of(ModBlocks.FIRE_LEAVES),
                    new JungleFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4),
                    new TwoLayersFeatureSize(1, 0, 2))
                    .dirtProvider(BlockStateProvider.of(Blocks.END_STONE)).build());
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> SHINING_TREE =
            ConfiguredFeatures.register("shining_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.SHINING_LOG),
                    new ForkingTrunkPlacer(5, 6, 3),
                    BlockStateProvider.of(ModBlocks.SHINING_LEAVES),
                    new JungleFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4),
                    new TwoLayersFeatureSize(1, 0, 2))
                    .dirtProvider(BlockStateProvider.of(Blocks.END_STONE)).build());
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> SERENE_TREE =
            ConfiguredFeatures.register("serene_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.SERENE_LOG),
                    new ForkingTrunkPlacer(5, 6, 3),
                    BlockStateProvider.of(ModBlocks.SERENE_LEAVES),
                    new JungleFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4),
                    new TwoLayersFeatureSize(1, 0, 2))
                    .dirtProvider(BlockStateProvider.of(Blocks.END_STONE)).build());
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> SCAB_TREE =
            ConfiguredFeatures.register("scab_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.SCAB_LOG),
                    new ForkingTrunkPlacer(5, 6, 3),
                    BlockStateProvider.of(ModBlocks.SCAB_LEAVES),
                    new JungleFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4),
                    new TwoLayersFeatureSize(1, 0, 2))
                    .dirtProvider(BlockStateProvider.of(Blocks.END_STONE)).build());
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> INDIGO_TREE =
            ConfiguredFeatures.register("indigo_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.INDIGO_LOG),
                    new ForkingTrunkPlacer(5, 6, 3),
                    BlockStateProvider.of(ModBlocks.INDIGO_LEAVES),
                    new JungleFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4),
                    new TwoLayersFeatureSize(1, 0, 2))
                    .dirtProvider(BlockStateProvider.of(Blocks.END_STONE)).build());

    public static final RegistryEntry<PlacedFeature> DARK_TREE_CHECKED =
            PlacedFeatures.register("dark_tree_checked", DARK_TREE,
                    PlacedFeatures.wouldSurvive(ModBlocks.DARK_SAPLING));
    public static final RegistryEntry<PlacedFeature> INFUSORIAL_TREE_CHECKED =
            PlacedFeatures.register("infusorial_tree_checked", INFUSORIAL_TREE,
                    PlacedFeatures.wouldSurvive(ModBlocks.INFUSORIAL_SAPLING));
    public static final RegistryEntry<PlacedFeature> BUDDING_TREE_CHECKED =
            PlacedFeatures.register("budding_tree_checked", BUDDING_TREE,
                    PlacedFeatures.wouldSurvive(ModBlocks.BUDDING_SAPLING));
    public static final RegistryEntry<PlacedFeature> REDLEAF_TREE_CHECKED =
            PlacedFeatures.register("redleaf_tree_checked", REDLEAF_TREE,
                    PlacedFeatures.wouldSurvive(ModBlocks.REDLEAF_SAPLING));
    public static final RegistryEntry<PlacedFeature> FIRE_TREE_CHECKED =
            PlacedFeatures.register("fire_tree_checked", FIRE_TREE,
                    PlacedFeatures.wouldSurvive(ModBlocks.FIRE_SAPLING));
    public static final RegistryEntry<PlacedFeature> SHINING_TREE_CHECKED =
            PlacedFeatures.register("shining_tree_checked", SHINING_TREE,
                    PlacedFeatures.wouldSurvive(ModBlocks.SHINING_SAPLING));
    public static final RegistryEntry<PlacedFeature> SERENE_TREE_CHECKED =
            PlacedFeatures.register("serene_tree_checked", SERENE_TREE,
                    PlacedFeatures.wouldSurvive(ModBlocks.SERENE_SAPLING));
    public static final RegistryEntry<PlacedFeature> SCAB_TREE_CHECKED =
            PlacedFeatures.register("scab_tree_checked", SCAB_TREE,
                    PlacedFeatures.wouldSurvive(ModBlocks.SCAB_SAPLING));
    public static final RegistryEntry<PlacedFeature> INDIGO_TREE_CHECKED =
            PlacedFeatures.register("indigo_tree_checked", INDIGO_TREE,
                    PlacedFeatures.wouldSurvive(ModBlocks.INDIGO_SAPLING));


    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> DARK_TREE_SPAWN =
            ConfiguredFeatures.register("dark_tree_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(DARK_TREE_CHECKED, 0.5f)),
                            DARK_TREE_CHECKED));
    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> INFUSORIAL_TREE_SPAWN =
            ConfiguredFeatures.register("infusorial_tree_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(INFUSORIAL_TREE_CHECKED, 0.5f)),
                            INFUSORIAL_TREE_CHECKED));
    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> BUDDING_TREE_SPAWN =
            ConfiguredFeatures.register("budding_tree_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(BUDDING_TREE_CHECKED, 0.5f)),
                            BUDDING_TREE_CHECKED));
    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> REDLEAF_TREE_SPAWN =
            ConfiguredFeatures.register("redleaf_tree_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(REDLEAF_TREE_CHECKED, 0.5f)),
                            REDLEAF_TREE_CHECKED));
    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> FIRE_TREE_SPAWN =
            ConfiguredFeatures.register("fire_tree_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(FIRE_TREE_CHECKED, 0.5f)),
                            FIRE_TREE_CHECKED));
    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> SHINING_TREE_SPAWN =
            ConfiguredFeatures.register("shining_tree_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(SHINING_TREE_CHECKED, 0.5f)),
                            SHINING_TREE_CHECKED));
    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> SERENE_TREE_SPAWN =
            ConfiguredFeatures.register("serene_tree_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(SERENE_TREE_CHECKED, 0.5f)),
                            SERENE_TREE_CHECKED));
    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> SCAB_TREE_SPAWN =
            ConfiguredFeatures.register("scab_tree_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(SCAB_TREE_CHECKED, 0.5f)),
                            SCAB_TREE_CHECKED));
    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> INDIGO_TREE_SPAWN =
            ConfiguredFeatures.register("indigo_tree_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(INDIGO_TREE_CHECKED, 0.5f)),
                            INDIGO_TREE_CHECKED));

    //Xorum
    public static final List<OreFeatureConfig.Target> END_XORUM_ORES = List.of(
        OreFeatureConfig.createTarget(ModOreConfiguredFeatures.END_STONE_ORE_REPLACEABLES,
                ModBlocks.XORUM_ORE.getDefaultState())
    );

    //Wave end stones
    public static final List<OreFeatureConfig.Target> END_DARK_WAVE_STONE_ORE = List.of(
            OreFeatureConfig.createTarget(ModOreConfiguredFeatures.END_STONE_ORE_REPLACEABLES,
                    ModBlocks.DARK_WAVE_END_STONE.getDefaultState())
    );
    public static final List<OreFeatureConfig.Target> END_INFUSORIAL_WAVE_STONE_ORE = List.of(
            OreFeatureConfig.createTarget(ModOreConfiguredFeatures.END_STONE_ORE_REPLACEABLES,
                    ModBlocks.INFUSORIAL_WAVE_END_STONE.getDefaultState())
    );
    public static final List<OreFeatureConfig.Target> END_REDLEAF_WAVE_STONE_ORE = List.of(
            OreFeatureConfig.createTarget(ModOreConfiguredFeatures.END_STONE_ORE_REPLACEABLES,
                    ModBlocks.REDLEAF_WAVE_END_STONE.getDefaultState())
    );
    public static final List<OreFeatureConfig.Target> END_SHINING_WAVE_STONE_ORE = List.of(
            OreFeatureConfig.createTarget(ModOreConfiguredFeatures.END_STONE_ORE_REPLACEABLES,
                    ModBlocks.SHINING_WAVE_END_STONE.getDefaultState())
    );
    public static final List<OreFeatureConfig.Target> END_SCAB_WAVE_STONE_ORE = List.of(
            OreFeatureConfig.createTarget(ModOreConfiguredFeatures.END_STONE_ORE_REPLACEABLES,
                    ModBlocks.SCAB_WAVE_END_STONE.getDefaultState())
    );
    public static final List<OreFeatureConfig.Target> END_INDIGO_WAVE_STONE_ORE = List.of(
            OreFeatureConfig.createTarget(ModOreConfiguredFeatures.END_STONE_ORE_REPLACEABLES,
                    ModBlocks.INDIGO_WAVE_END_STONE.getDefaultState())
    );

    //Sand
    public static final List<OreFeatureConfig.Target> END_DARK_SAND_ORE = List.of(
            OreFeatureConfig.createTarget(ModOreConfiguredFeatures.END_STONE_ORE_REPLACEABLES,
                    ModBlocks.DARK_SAND.getDefaultState())
    );
    //Stones
    public static final List<OreFeatureConfig.Target> END_INFUSORIAL_STONE_ORE = List.of(
            OreFeatureConfig.createTarget(ModOreConfiguredFeatures.END_STONE_ORE_REPLACEABLES,
                    ModBlocks.INFUSORIAL_STONE.getDefaultState())
    );
    public static final List<OreFeatureConfig.Target> END_REDLEAF_STONE_ORE = List.of(
            OreFeatureConfig.createTarget(ModOreConfiguredFeatures.END_STONE_ORE_REPLACEABLES,
                    ModBlocks.REDLEAF_STONE.getDefaultState())
    );
    public static final List<OreFeatureConfig.Target> END_SCAB_STONE_ORE = List.of(
            OreFeatureConfig.createTarget(ModOreConfiguredFeatures.END_STONE_ORE_REPLACEABLES,
                    ModBlocks.SCAB_STONE.getDefaultState())
    );
    //Soil
    public static final List<OreFeatureConfig.Target> END_INDIGO_SOIL_ORE = List.of(
            OreFeatureConfig.createTarget(ModOreConfiguredFeatures.END_STONE_ORE_REPLACEABLES,
                    ModBlocks.INDIGO_SOIL.getDefaultState())
    );
    //Moss
    public static final List<OreFeatureConfig.Target> END_WASP_MOSS_ORE = List.of(
            OreFeatureConfig.createTarget(ModOreConfiguredFeatures.END_STONE_ORE_REPLACEABLES,
                    ModBlocks.WASP_MOSS_BLOCK.getDefaultState())
    );

    //Xorum
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> XORUM_ORE =
            ConfiguredFeatures.register("xorum_ore", Feature.ORE,
                    new OreFeatureConfig(END_XORUM_ORES, 12));

    //Wave end stones
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> DARK_WAVE_STONE_ORE =
            ConfiguredFeatures.register("dark_wave_stone_ore", Feature.ORE,
                    new OreFeatureConfig(END_DARK_WAVE_STONE_ORE, 46));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> INFUSORIAL_WAVE_STONE_ORE =
            ConfiguredFeatures.register("infusorial_wave_stone_ore", Feature.ORE,
                    new OreFeatureConfig(END_INFUSORIAL_WAVE_STONE_ORE, 46));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> REDLEAF_WAVE_STONE_ORE =
            ConfiguredFeatures.register("redleaf_wave_stone_ore", Feature.ORE,
                    new OreFeatureConfig(END_REDLEAF_WAVE_STONE_ORE, 46));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> SHINING_WAVE_STONE_ORE =
            ConfiguredFeatures.register("shining_wave_stone_ore", Feature.ORE,
                    new OreFeatureConfig(END_SHINING_WAVE_STONE_ORE, 46));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> SCAB_WAVE_STONE_ORE =
            ConfiguredFeatures.register("scab_wave_stone_ore", Feature.ORE,
                    new OreFeatureConfig(END_SCAB_WAVE_STONE_ORE, 46));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> INDIGO_WAVE_STONE_ORE =
            ConfiguredFeatures.register("indigo_wave_stone_ore", Feature.ORE,
                    new OreFeatureConfig(END_INDIGO_WAVE_STONE_ORE, 46));

    //Sand
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> DARK_SAND_ORE =
            ConfiguredFeatures.register("dark_sand_ore", Feature.ORE,
                    new OreFeatureConfig(END_DARK_SAND_ORE, 46));
    //Stones
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> INFUSORIAL_STONE_ORE =
            ConfiguredFeatures.register("infusorial_stone_ore", Feature.ORE,
                    new OreFeatureConfig(END_INFUSORIAL_STONE_ORE, 46));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> REDLEAF_STONE_ORE =
            ConfiguredFeatures.register("redleaf_stone_ore", Feature.ORE,
                    new OreFeatureConfig(END_REDLEAF_STONE_ORE, 46));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> SCAB_STONE_ORE =
            ConfiguredFeatures.register("scab_stone_ore", Feature.ORE,
                    new OreFeatureConfig(END_SCAB_STONE_ORE, 46));
    //Soil
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> INDIGO_SOIL_ORE =
            ConfiguredFeatures.register("indigo_soil_ore", Feature.ORE,
                    new OreFeatureConfig(END_INDIGO_SOIL_ORE, 46));
    //Moss
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> WASP_MOSS_ORE =
            ConfiguredFeatures.register("wasp_moss_ore", Feature.ORE,
                    new OreFeatureConfig(END_WASP_MOSS_ORE, 46));

    public static void registerConfiguredFeatures() {
        System.out.println("Registering ModConfiguredFeatures for " + ImprovedEnd.MOD_ID);
    }
}
