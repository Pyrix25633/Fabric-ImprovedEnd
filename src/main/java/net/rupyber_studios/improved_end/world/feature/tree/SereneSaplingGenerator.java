package net.rupyber_studios.improved_end.world.feature.tree;

import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.rupyber_studios.improved_end.world.feature.ModConfiguredFeatures;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class SereneSaplingGenerator extends SaplingGenerator {
    @Nullable
    @Override
    protected RegistryEntry<? extends ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
        return ModConfiguredFeatures.SERENE_TREE;
    }
}
