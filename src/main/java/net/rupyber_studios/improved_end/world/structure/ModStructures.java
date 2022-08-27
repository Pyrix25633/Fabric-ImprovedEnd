package net.rupyber_studios.improved_end.world.structure;

import net.rupyber_studios.improved_end.ImprovedEnd;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.StructureFeature;
import net.rupyber_studios.improved_end.mixin.StructureFeatureAccessor;

public class ModStructures {
    public static StructureFeature<?> END_HOUSE = new EndHouse();

    public static void registerStructureFeatures() {
        StructureFeatureAccessor.callRegister(ImprovedEnd.MOD_ID + ":end_house",
            END_HOUSE, GenerationStep.Feature.SURFACE_STRUCTURES);
    }
}