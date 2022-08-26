package net.rupyber_studios.improved_end.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;
import net.minecraft.world.gen.placementmodifier.BiomePlacementModifier;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.RarityFilterPlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;

public class ModPlacedFeatures {
    //Flowers and grass
    private static final int chance = 6;
    public static final RegistryEntry<PlacedFeature> REDLEAF_FLOWER_PLACED = PlacedFeatures.register("redleaf_flower_placed",
        ModConfiguredFeatures.REDLEAF_FLOWER, RarityFilterPlacementModifier.of(chance), SquarePlacementModifier.of(),
        PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
    public static final RegistryEntry<PlacedFeature> INDIGO_FLOWER_PLACED = PlacedFeatures.register("indigo_flower_placed",
        ModConfiguredFeatures.INDIGO_FLOWER, RarityFilterPlacementModifier.of(chance), SquarePlacementModifier.of(),
        PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
    public static final RegistryEntry<PlacedFeature> DARK_GRASS_PLACED = PlacedFeatures.register("dark_grass_placed",
        ModConfiguredFeatures.DARK_GRASS, RarityFilterPlacementModifier.of(chance), SquarePlacementModifier.of(),
        PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
    public static final RegistryEntry<PlacedFeature> INFUSORIAL_GRASS_PLACED = PlacedFeatures.register("infusorial_grass_placed",
        ModConfiguredFeatures.INFUSORIAL_GRASS, RarityFilterPlacementModifier.of(chance), SquarePlacementModifier.of(),
        PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
    public static final RegistryEntry<PlacedFeature> BUDDING_GRASS_PLACED = PlacedFeatures.register("budding_grass_placed",
        ModConfiguredFeatures.BUDDING_GRASS, RarityFilterPlacementModifier.of(chance), SquarePlacementModifier.of(),
        PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
    public static final RegistryEntry<PlacedFeature> REDLEAF_GRASS_PLACED = PlacedFeatures.register("redleaf_grass_placed",
        ModConfiguredFeatures.REDLEAF_GRASS, RarityFilterPlacementModifier.of(chance), SquarePlacementModifier.of(),
        PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
    public static final RegistryEntry<PlacedFeature> FIRE_GRASS_PLACED = PlacedFeatures.register("fire_grass_placed",
        ModConfiguredFeatures.FIRE_GRASS, RarityFilterPlacementModifier.of(chance), SquarePlacementModifier.of(),
        PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
    public static final RegistryEntry<PlacedFeature> SHINING_GRASS_PLACED = PlacedFeatures.register("shining_grass_placed",
        ModConfiguredFeatures.SHINING_GRASS, RarityFilterPlacementModifier.of(chance), SquarePlacementModifier.of(),
        PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
    public static final RegistryEntry<PlacedFeature> SERENE_GRASS_PLACED = PlacedFeatures.register("serene_grass_placed",
        ModConfiguredFeatures.SERENE_GRASS, RarityFilterPlacementModifier.of(chance), SquarePlacementModifier.of(),
        PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
    public static final RegistryEntry<PlacedFeature> SCAB_GRASS_PLACED = PlacedFeatures.register("scab_grass_placed",
        ModConfiguredFeatures.SCAB_GRASS, RarityFilterPlacementModifier.of(chance), SquarePlacementModifier.of(),
        PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
    public static final RegistryEntry<PlacedFeature> INDIGO_GRASS_PLACED = PlacedFeatures.register("indigo_grass_placed",
        ModConfiguredFeatures.INDIGO_GRASS, RarityFilterPlacementModifier.of(chance), SquarePlacementModifier.of(),
        PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
    public static final RegistryEntry<PlacedFeature> REDLEAF_TALL_GRASS_PLACED = PlacedFeatures.register("redleaf_tall_grass_placed",
        ModConfiguredFeatures.REDLEAF_TALL_GRASS, RarityFilterPlacementModifier.of(chance), SquarePlacementModifier.of(),
        PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
    public static final RegistryEntry<PlacedFeature> FIRE_ROOTS_PLACED = PlacedFeatures.register("fire_roots_placed",
        ModConfiguredFeatures.FIRE_ROOTS, RarityFilterPlacementModifier.of(chance), SquarePlacementModifier.of(),
        PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
    public static final RegistryEntry<PlacedFeature> SERENE_ROOTS_PLACED = PlacedFeatures.register("serene_roots_placed",
        ModConfiguredFeatures.SERENE_ROOTS, RarityFilterPlacementModifier.of(chance), SquarePlacementModifier.of(),
        PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
    public static final RegistryEntry<PlacedFeature> SCAB_ROOTS_PLACED = PlacedFeatures.register("scab_roots_placed",
        ModConfiguredFeatures.SCAB_ROOTS, RarityFilterPlacementModifier.of(chance), SquarePlacementModifier.of(),
        PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
    public static final RegistryEntry<PlacedFeature> BUDDING_SPROUTS_PLACED = PlacedFeatures.register("budding_sprouts_placed",
        ModConfiguredFeatures.BUDDING_SPROUTS, RarityFilterPlacementModifier.of(chance), SquarePlacementModifier.of(),
        PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
    public static final RegistryEntry<PlacedFeature> SERENE_SPROUTS_PLACED = PlacedFeatures.register("serene_sprouts_placed",
        ModConfiguredFeatures.SERENE_SPROUTS, RarityFilterPlacementModifier.of(chance), SquarePlacementModifier.of(),
        PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
    public static final RegistryEntry<PlacedFeature> SCAB_SPROUTS_PLACED = PlacedFeatures.register("scab_sprouts_placed",
        ModConfiguredFeatures.SCAB_SPROUTS, RarityFilterPlacementModifier.of(chance), SquarePlacementModifier.of(),
        PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

    //Trees
    private static final int count1 = 1, extraCount = 1;
    private static final float extraChance = 0.2f;
    public static final RegistryEntry<PlacedFeature> DARK_TREE_PLACED = PlacedFeatures.register("dark_tree_placed",
        ModConfiguredFeatures.DARK_TREE_SPAWN, VegetationPlacedFeatures.modifiers(
            PlacedFeatures.createCountExtraModifier(count1, extraChance, extraCount)));
    public static final RegistryEntry<PlacedFeature> INFUSORIAL_TREE_PLACED = PlacedFeatures.register("infusorial_tree_placed",
        ModConfiguredFeatures.INFUSORIAL_TREE_SPAWN, VegetationPlacedFeatures.modifiers(
            PlacedFeatures.createCountExtraModifier(count1, extraChance, extraCount)));
    public static final RegistryEntry<PlacedFeature> BUDDING_TREE_PLACED = PlacedFeatures.register("budding_tree_placed",
        ModConfiguredFeatures.BUDDING_TREE_SPAWN, VegetationPlacedFeatures.modifiers(
            PlacedFeatures.createCountExtraModifier(count1, extraChance, extraCount)));
    public static final RegistryEntry<PlacedFeature> REDLEAF_TREE_PLACED = PlacedFeatures.register("redleaf_tree_placed",
        ModConfiguredFeatures.REDLEAF_TREE_SPAWN, VegetationPlacedFeatures.modifiers(
            PlacedFeatures.createCountExtraModifier(count1, extraChance, extraCount)));
    public static final RegistryEntry<PlacedFeature> FIRE_TREE_PLACED = PlacedFeatures.register("fire_tree_placed",
        ModConfiguredFeatures.FIRE_TREE_SPAWN, VegetationPlacedFeatures.modifiers(
            PlacedFeatures.createCountExtraModifier(count1, extraChance, extraCount)));
    public static final RegistryEntry<PlacedFeature> SHINING_TREE_PLACED = PlacedFeatures.register("shining_tree_placed",
        ModConfiguredFeatures.SHINING_TREE_SPAWN, VegetationPlacedFeatures.modifiers(
            PlacedFeatures.createCountExtraModifier(count1, extraChance, extraCount)));
    public static final RegistryEntry<PlacedFeature> SERENE_TREE_PLACED = PlacedFeatures.register("serene_tree_placed",
        ModConfiguredFeatures.SERENE_TREE_SPAWN, VegetationPlacedFeatures.modifiers(
            PlacedFeatures.createCountExtraModifier(count1, extraChance, extraCount)));
    public static final RegistryEntry<PlacedFeature> SCAB_TREE_PLACED = PlacedFeatures.register("scab_tree_placed",
        ModConfiguredFeatures.SCAB_TREE_SPAWN, VegetationPlacedFeatures.modifiers(
            PlacedFeatures.createCountExtraModifier(count1, extraChance, extraCount)));
    public static final RegistryEntry<PlacedFeature> INDIGO_TREE_PLACED = PlacedFeatures.register("indigo_tree_placed",
        ModConfiguredFeatures.INDIGO_TREE_SPAWN, VegetationPlacedFeatures.modifiers(
            PlacedFeatures.createCountExtraModifier(count1, extraChance, extraCount)));

    //Xorum
    public static final RegistryEntry<PlacedFeature> XORUM_ORE_PLACED = PlacedFeatures.register("xorum_ore_placed",
        ModConfiguredFeatures.XORUM_ORE, ModOreFeatures.modifiersWithCount(3,
            HeightRangePlacementModifier.uniform(YOffset.aboveBottom(0), YOffset.aboveBottom(46))));

    //Wave end stones
    private static final int count2 = 1, offset1 = 0, offset2 = 50;
    public static final RegistryEntry<PlacedFeature> DARK_WAVE_STONE_ORE_PLACED = PlacedFeatures.register("dark_wave_stone_ore_placed",
        ModConfiguredFeatures.DARK_WAVE_STONE_ORE, ModOreFeatures.modifiersWithCount(count2,
            HeightRangePlacementModifier.uniform(YOffset.aboveBottom(offset1), YOffset.aboveBottom(offset2))));
    public static final RegistryEntry<PlacedFeature> INFUSORIAL_WAVE_STONE_ORE_PLACED = PlacedFeatures.register("infusorial_wave_stone_ore_placed",
        ModConfiguredFeatures.INFUSORIAL_WAVE_STONE_ORE, ModOreFeatures.modifiersWithCount(count2,
            HeightRangePlacementModifier.uniform(YOffset.aboveBottom(offset1), YOffset.aboveBottom(offset2))));
    public static final RegistryEntry<PlacedFeature> REDLEAF_WAVE_STONE_ORE_PLACED = PlacedFeatures.register("redleaf_wave_stone_ore_placed",
        ModConfiguredFeatures.REDLEAF_WAVE_STONE_ORE, ModOreFeatures.modifiersWithCount(count2,
            HeightRangePlacementModifier.uniform(YOffset.aboveBottom(offset1), YOffset.aboveBottom(offset2))));
    public static final RegistryEntry<PlacedFeature> SHINING_WAVE_STONE_ORE_PLACED = PlacedFeatures.register("shining_wave_stone_ore_placed",
        ModConfiguredFeatures.SHINING_WAVE_STONE_ORE, ModOreFeatures.modifiersWithCount(count2,
            HeightRangePlacementModifier.uniform(YOffset.aboveBottom(offset1), YOffset.aboveBottom(offset2))));
    public static final RegistryEntry<PlacedFeature> SCAB_WAVE_STONE_ORE_PLACED = PlacedFeatures.register("scab_wave_stone_ore_placed",
        ModConfiguredFeatures.SCAB_WAVE_STONE_ORE, ModOreFeatures.modifiersWithCount(count2,
            HeightRangePlacementModifier.uniform(YOffset.aboveBottom(offset1), YOffset.aboveBottom(offset2))));
    public static final RegistryEntry<PlacedFeature> INDIGO_WAVE_STONE_ORE_PLACED = PlacedFeatures.register("indigo_wave_stone_ore_placed",
        ModConfiguredFeatures.INDIGO_WAVE_STONE_ORE, ModOreFeatures.modifiersWithCount(count2,
            HeightRangePlacementModifier.uniform(YOffset.aboveBottom(offset1), YOffset.aboveBottom(offset2))));

    //Sand
    public static final RegistryEntry<PlacedFeature> DARK_SAND_ORE_PLACED = PlacedFeatures.register("dark_sand_ore_placed",
        ModConfiguredFeatures.DARK_SAND_ORE, ModOreFeatures.modifiersWithCount(count2,
            HeightRangePlacementModifier.uniform(YOffset.aboveBottom(46), YOffset.aboveBottom(60))));
    //Stones
    public static final RegistryEntry<PlacedFeature> INFUSORIAL_STONE_ORE_PLACED = PlacedFeatures.register("infusorial_stone_ore_placed",
        ModConfiguredFeatures.INFUSORIAL_STONE_ORE, ModOreFeatures.modifiersWithCount(count2,
            HeightRangePlacementModifier.uniform(YOffset.aboveBottom(offset1), YOffset.aboveBottom(offset2))));
    public static final RegistryEntry<PlacedFeature> REDLEAF_STONE_ORE_PLACED = PlacedFeatures.register("redleaf_stone_ore_placed",
        ModConfiguredFeatures.REDLEAF_STONE_ORE, ModOreFeatures.modifiersWithCount(count2,
            HeightRangePlacementModifier.uniform(YOffset.aboveBottom(offset1), YOffset.aboveBottom(offset2))));
    public static final RegistryEntry<PlacedFeature> SCAB_STONE_ORE_PLACED = PlacedFeatures.register("scab_stone_ore_placed",
        ModConfiguredFeatures.SCAB_STONE_ORE, ModOreFeatures.modifiersWithCount(count2,
            HeightRangePlacementModifier.uniform(YOffset.aboveBottom(offset1), YOffset.aboveBottom(offset2))));
    //Soil
    public static final RegistryEntry<PlacedFeature> INDIGO_SOIL_ORE_PLACED = PlacedFeatures.register("indigo_soil_ore_placed",
        ModConfiguredFeatures.INDIGO_SOIL_ORE, ModOreFeatures.modifiersWithCount(count2,
            HeightRangePlacementModifier.uniform(YOffset.aboveBottom(offset1), YOffset.aboveBottom(offset2))));
    //Moss
    public static final RegistryEntry<PlacedFeature> WASP_MOSS_ORE_PLACED = PlacedFeatures.register("wasp_moss_ore_placed",
        ModConfiguredFeatures.WASP_MOSS_ORE, ModOreFeatures.modifiersWithCount(count2,
            HeightRangePlacementModifier.uniform(YOffset.aboveBottom(offset1), YOffset.aboveBottom(offset2))));
}
