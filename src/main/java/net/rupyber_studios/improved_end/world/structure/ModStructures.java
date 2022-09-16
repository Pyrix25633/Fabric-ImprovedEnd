package net.rupyber_studios.improved_end.world.structure;

import net.rupyber_studios.improved_end.ImprovedEnd;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.StructureFeature;
import net.rupyber_studios.improved_end.mixin.StructureFeatureAccessor;

public class ModStructures {
    public static StructureFeature<?> END_HOUSE = new EndHouse();
    public static StructureFeature<?> END_TREE = new EndTree();

    public static void registerStructureFeatures() {
        StructureFeatureAccessor.callRegister(ImprovedEnd.MOD_ID + ":end_house",
            END_HOUSE, GenerationStep.Feature.SURFACE_STRUCTURES);
        StructureFeatureAccessor.callRegister(ImprovedEnd.MOD_ID + ":end_tree",
            END_TREE, GenerationStep.Feature.SURFACE_STRUCTURES);
    }
}