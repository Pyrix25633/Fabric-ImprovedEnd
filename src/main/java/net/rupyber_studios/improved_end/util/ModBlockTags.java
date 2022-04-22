package net.rupyber_studios.improved_end.util;

import net.minecraft.block.Block;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.rupyber_studios.improved_end.ImprovedEnd;

public final class ModBlockTags {
    public static final TagKey<Block> DARK_LOGS = register("dark_logs");
    public static final TagKey<Block> INFUSORIAL_LOGS = register("infusorial_logs");
    public static final TagKey<Block> BUDDING_LOGS = register("budding_logs");
    public static final TagKey<Block> REDLEAF_LOGS = register("redleaf_logs");
    public static final TagKey<Block> FIRE_LOGS = register("fire_logs");
    public static final TagKey<Block> SHINING_LOGS = register("shining_logs");
    public static final TagKey<Block> SERENE_LOGS = register("serene_logs");
    public static final TagKey<Block> SCAB_LOGS = register("scab_logs");
    public static final TagKey<Block> INDIGO_LOGS = register("indigo_logs");

    private ModBlockTags() {
    }

    private static TagKey<Block> register(String id) {
        return TagKey.of(Registry.BLOCK_KEY, new Identifier(ImprovedEnd.MOD_ID, id));
    }

    public static void registerModBlockTags() {
        System.out.println("Registering ModBlockTags for " + ImprovedEnd.MOD_ID);
    }
}
