package net.rupyber_studios.improved_end.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.rupyber_studios.improved_end.world.feature.ModPlacedFeatures;

public class ModFlowerGeneration {
    public static void generateFlowers() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.END_HIGHLANDS),
            GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.REDLEAF_FLOWER_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.END_BARRENS),
            GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.INDIGO_FLOWER_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.END_HIGHLANDS),
            GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.DARK_GRASS_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.END_HIGHLANDS),
            GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.INFUSORIAL_GRASS_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.END_HIGHLANDS),
            GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.BUDDING_GRASS_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.END_MIDLANDS),
            GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.REDLEAF_GRASS_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.END_MIDLANDS),
            GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.FIRE_GRASS_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.END_MIDLANDS),
            GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.SHINING_GRASS_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.END_BARRENS),
            GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.SERENE_GRASS_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.END_BARRENS),
            GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.SCAB_GRASS_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.END_BARRENS),
            GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.INDIGO_GRASS_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.END_MIDLANDS),
            GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.REDLEAF_TALL_GRASS_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.END_MIDLANDS),
            GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.FIRE_ROOTS_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.END_BARRENS),
            GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.SERENE_ROOTS_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.END_BARRENS),
            GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.SCAB_ROOTS_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.END_HIGHLANDS),
            GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.BUDDING_SPROUTS_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.END_BARRENS),
            GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.SERENE_SPROUTS_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.END_BARRENS),
            GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.SCAB_SPROUTS_PLACED.getKey().get());
    }
}
