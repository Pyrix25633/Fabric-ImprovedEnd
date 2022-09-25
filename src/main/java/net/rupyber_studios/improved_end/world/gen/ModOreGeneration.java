package net.rupyber_studios.improved_end.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.rupyber_studios.improved_end.world.feature.ModPlacedFeatures;

public class ModOreGeneration {
    public static void generateOres() {
        //Wave end stones
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.END_HIGHLANDS),
            GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.DARK_WAVE_STONE_ORE_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.END_HIGHLANDS),
            GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.INFUSORIAL_WAVE_STONE_ORE_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.END_MIDLANDS),
            GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.REDLEAF_WAVE_STONE_ORE_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.END_MIDLANDS),
            GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.SHINING_WAVE_STONE_ORE_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.END_BARRENS),
            GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.SCAB_WAVE_STONE_ORE_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.END_BARRENS),
            GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.INDIGO_WAVE_STONE_ORE_PLACED.getKey().get());

        //Sand
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.END_HIGHLANDS),
            GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.DARK_SAND_ORE_PLACED.getKey().get());
        //Stones
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.END_HIGHLANDS),
            GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.INFUSORIAL_STONE_ORE_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.END_MIDLANDS),
            GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.REDLEAF_STONE_ORE_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.END_BARRENS),
            GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.SCAB_STONE_ORE_PLACED.getKey().get());
        //Soil
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.END_BARRENS),
            GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.INDIGO_SOIL_ORE_PLACED.getKey().get());
        //Moss
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.END_MIDLANDS),
            GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.WASP_MOSS_ORE_PLACED.getKey().get());

        //Xorum generates last, eventually replacing some wave stone blocks
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(),
            GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.XORUM_ORE_PLACED.getKey().get());
    }
}