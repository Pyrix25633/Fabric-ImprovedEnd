package net.rupyber_studios.improved_end.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;

public class ModPlacedFeatures {
    public static final RegistryEntry<PlacedFeature> XORUM_ORE_PLACED = PlacedFeatures.register("xorum_ore_placed",
            ModConfiguredFeatures.XORUM_ORE, ModOreFeatures.modifiersWithCount(3,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(0), YOffset.aboveBottom(46))));

    //Wave end stones
    public static final RegistryEntry<PlacedFeature> DARK_WAVE_STONE_ORE_PLACED = PlacedFeatures.register("dark_wave_stone_ore_placed",
            ModConfiguredFeatures.DARK_WAVE_STONE_ORE, ModOreFeatures.modifiersWithCount(1,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(0), YOffset.aboveBottom(50))));
    public static final RegistryEntry<PlacedFeature> INFUSORIAL_WAVE_STONE_ORE_PLACED = PlacedFeatures.register("infusorial_wave_stone_ore_placed",
            ModConfiguredFeatures.INFUSORIAL_WAVE_STONE_ORE, ModOreFeatures.modifiersWithCount(1,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(0), YOffset.aboveBottom(50))));
    public static final RegistryEntry<PlacedFeature> REDLEAF_WAVE_STONE_ORE_PLACED = PlacedFeatures.register("redleaf_wave_stone_ore_placed",
            ModConfiguredFeatures.REDLEAF_WAVE_STONE_ORE, ModOreFeatures.modifiersWithCount(1,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(0), YOffset.aboveBottom(50))));
    public static final RegistryEntry<PlacedFeature> SHINING_WAVE_STONE_ORE_PLACED = PlacedFeatures.register("shining_wave_stone_ore_placed",
            ModConfiguredFeatures.SHINING_WAVE_STONE_ORE, ModOreFeatures.modifiersWithCount(1,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(0), YOffset.aboveBottom(50))));
    public static final RegistryEntry<PlacedFeature> SCAB_WAVE_STONE_ORE_PLACED = PlacedFeatures.register("scab_wave_stone_ore_placed",
            ModConfiguredFeatures.SCAB_WAVE_STONE_ORE, ModOreFeatures.modifiersWithCount(1,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(0), YOffset.aboveBottom(50))));
    public static final RegistryEntry<PlacedFeature> INDIGO_WAVE_STONE_ORE_PLACED = PlacedFeatures.register("indigo_wave_stone_ore_placed",
            ModConfiguredFeatures.INDIGO_WAVE_STONE_ORE, ModOreFeatures.modifiersWithCount(1,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(0), YOffset.aboveBottom(50))));

    //Sand
    public static final RegistryEntry<PlacedFeature> DARK_SAND_ORE_PLACED = PlacedFeatures.register("dark_sand_ore_placed",
            ModConfiguredFeatures.DARK_SAND_ORE, ModOreFeatures.modifiersWithCount(1,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(46), YOffset.aboveBottom(60))));
    //Stones
    public static final RegistryEntry<PlacedFeature> INFUSORIAL_STONE_ORE_PLACED = PlacedFeatures.register("infusorial_stone_ore_placed",
            ModConfiguredFeatures.INFUSORIAL_STONE_ORE, ModOreFeatures.modifiersWithCount(1,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(0), YOffset.aboveBottom(50))));
    public static final RegistryEntry<PlacedFeature> REDLEAF_STONE_ORE_PLACED = PlacedFeatures.register("redleaf_stone_ore_placed",
            ModConfiguredFeatures.REDLEAF_STONE_ORE, ModOreFeatures.modifiersWithCount(1,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(0), YOffset.aboveBottom(50))));
    public static final RegistryEntry<PlacedFeature> SCAB_STONE_ORE_PLACED = PlacedFeatures.register("scab_stone_ore_placed",
            ModConfiguredFeatures.SCAB_STONE_ORE, ModOreFeatures.modifiersWithCount(1,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(0), YOffset.aboveBottom(50))));
    //Soil
    public static final RegistryEntry<PlacedFeature> INDIGO_SOIL_ORE_PLACED = PlacedFeatures.register("indigo_soil_ore_placed",
            ModConfiguredFeatures.INDIGO_SOIL_ORE, ModOreFeatures.modifiersWithCount(1,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(0), YOffset.aboveBottom(50))));
    //Moss
    public static final RegistryEntry<PlacedFeature> WASP_MOSS_ORE_PLACED = PlacedFeatures.register("wasp_moss_ore_placed",
            ModConfiguredFeatures.WASP_MOSS_ORE, ModOreFeatures.modifiersWithCount(1,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(0), YOffset.aboveBottom(60))));
}
