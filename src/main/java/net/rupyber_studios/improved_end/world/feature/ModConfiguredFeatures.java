package net.rupyber_studios.improved_end.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.rupyber_studios.improved_end.ImprovedEnd;
import net.rupyber_studios.improved_end.block.ModBlocks;

import java.util.List;

public class ModConfiguredFeatures {
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
