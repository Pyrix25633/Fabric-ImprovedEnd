package net.rupyber_studios.improved_end.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.rupyber_studios.improved_end.world.feature.ModPlacedFeatures;

public class ModTreeGeneration {
    public static void generateTrees() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.END_HIGHLANDS),
            GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.DARK_TREE_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.END_HIGHLANDS),
            GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.INFUSORIAL_TREE_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.END_HIGHLANDS),
            GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.BUDDING_TREE_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.END_MIDLANDS),
            GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.REDLEAF_TREE_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.END_MIDLANDS),
            GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.FIRE_TREE_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.END_MIDLANDS),
            GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.SHINING_TREE_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.END_BARRENS),
            GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.SERENE_TREE_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.END_BARRENS),
            GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.SCAB_TREE_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.END_BARRENS),
            GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.INDIGO_TREE_PLACED.getKey().get());

    }
}
