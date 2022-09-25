package net.rupyber_studios.improved_end.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.ModificationPhase;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.rupyber_studios.improved_end.ImprovedEnd;

public class ModNbtFeatureGeneration {
    public static void generateNbtFeatures() {
        addToBiome("dark_tree", GenerationStep.Feature.SURFACE_STRUCTURES, "end_highlands");
    }

    private static void addToBiome(String featureName, GenerationStep.Feature step, String biomeTag) {
        BiomeModifications.create(new Identifier(ImprovedEnd.MOD_ID, featureName))
            .add(ModificationPhase.ADDITIONS,
                (context) -> context.hasTag(TagKey.of(Registry.BIOME_KEY, new Identifier(ImprovedEnd.MOD_ID, "has_structure/" + biomeTag))),
                (context) -> context.getGenerationSettings().addFeature(step, RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(ImprovedEnd.MOD_ID, featureName))));
    }
}