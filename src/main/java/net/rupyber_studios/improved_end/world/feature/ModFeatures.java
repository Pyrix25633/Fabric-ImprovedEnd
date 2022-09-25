package net.rupyber_studios.improved_end.world.feature;


import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.feature.Feature;
import net.rupyber_studios.improved_end.ImprovedEnd;

public class ModFeatures {
    public static Feature<ModNbtFeatureConfig> NBT_FEATURE = new ModNbtFeature();

    public static void registerFeatures() {
        Registry.register(Registry.FEATURE, new Identifier(ImprovedEnd.MOD_ID, "nbt_feature"), NBT_FEATURE);
    }
}