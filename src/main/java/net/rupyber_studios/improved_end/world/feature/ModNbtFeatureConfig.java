package net.rupyber_studios.improved_end.world.feature;

import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.FeatureConfig;

import java.util.List;

public class ModNbtFeatureConfig implements FeatureConfig {
    public static final Codec<ModNbtFeatureConfig> CODEC = RecordCodecBuilder.create((configInstance) -> configInstance.group(
        Codec.BOOL.fieldOf("allow_liquid").orElse(false).forGetter(nbtFeatureConfig -> nbtFeatureConfig.allowInWater),
        Codec.INT.fieldOf("height_offset").orElse(0).forGetter(nbtFeatureConfig -> nbtFeatureConfig.heightOffset),
        Codec.mapPair(Identifier.CODEC.fieldOf("resourcelocation"), Codec.intRange(1, Integer.MAX_VALUE).fieldOf("weight")).codec().listOf().fieldOf("nbt_entries").forGetter(nbtFeatureConfig -> nbtFeatureConfig.nbtResourcelocationsAndWeights),
        Identifier.CODEC.fieldOf("processors").orElse(null).forGetter(nbtFeatureConfig -> nbtFeatureConfig.processor)
    ).apply(configInstance, ModNbtFeatureConfig::new));

    public final boolean allowInWater;
    public final int heightOffset;
    public final List<Pair<Identifier, Integer>> nbtResourcelocationsAndWeights;
    public final Identifier processor;

    public ModNbtFeatureConfig(boolean allowInWater, int heightOffset, List<Pair<Identifier, Integer>> nbtResourcelocationsAndWeights, Identifier processor) {
        this.allowInWater = allowInWater;
        this.heightOffset = heightOffset;
        this.nbtResourcelocationsAndWeights = nbtResourcelocationsAndWeights;
        this.processor = processor;
    }
}