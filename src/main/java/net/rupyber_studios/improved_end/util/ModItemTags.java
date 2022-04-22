package net.rupyber_studios.improved_end.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.rupyber_studios.improved_end.ImprovedEnd;

public final class ModItemTags {
    public static final TagKey<Item> DARK_LOGS = register("dark_logs");
    public static final TagKey<Item> INFUSORIAL_LOGS = register("infusorial_logs");
    public static final TagKey<Item> BUDDING_LOGS = register("budding_logs");
    public static final TagKey<Item> REDLEAF_LOGS = register("redleaf_logs");
    public static final TagKey<Item> FIRE_LOGS = register("fire_logs");
    public static final TagKey<Item> SHINING_LOGS = register("shining_logs");
    public static final TagKey<Item> SERENE_LOGS = register("serene_logs");
    public static final TagKey<Item> SCAB_LOGS = register("scab_logs");
    public static final TagKey<Item> INDIGO_LOGS = register("indigo_logs");

    private ModItemTags() {
    }

    private static TagKey<Item> register(String id) {
        return TagKey.of(Registry.ITEM_KEY, new Identifier(ImprovedEnd.MOD_ID, id));
    }

    public static void registerModItemTags() {
        System.out.println("Registering ModItemTags for " + ImprovedEnd.MOD_ID);
    }
}
