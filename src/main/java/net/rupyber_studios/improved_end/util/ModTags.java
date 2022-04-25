package net.rupyber_studios.improved_end.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.rupyber_studios.improved_end.ImprovedEnd;

public class ModTags {
    public static class Blocks {
        //Logs
        public static final TagKey<Block> DARK_LOGS = createTag("dark_logs");
        public static final TagKey<Block> DARK_LOGS_COMMON = createCommonTag("dark_logs");
        public static final TagKey<Block> INFUSORIAL_LOGS = createTag("infusorial_logs");
        public static final TagKey<Block> INFUSORIAL_LOGS_COMMON = createCommonTag("infusorial_logs");
        public static final TagKey<Block> BUDDING_LOGS = createTag("budding_logs");
        public static final TagKey<Block> BUDDING_LOGS_COMMON = createCommonTag("budding_logs");
        public static final TagKey<Block> REDLEAF_LOGS = createTag("redleaf_logs");
        public static final TagKey<Block> REDLEAF_LOGS_COMMON = createCommonTag("redleaf_logs");
        public static final TagKey<Block> FIRE_LOGS = createTag("fire_logs");
        public static final TagKey<Block> FIRE_LOGS_COMMON = createCommonTag("fire_logs");
        public static final TagKey<Block> SHINING_LOGS = createTag("shining_logs");
        public static final TagKey<Block> SHINING_LOGS_COMMON = createCommonTag("shining_logs");
        public static final TagKey<Block> SERENE_LOGS = createTag("serene_logs");
        public static final TagKey<Block> SERENE_LOGS_COMMON = createCommonTag("serene_logs");
        public static final TagKey<Block> SCAB_LOGS = createTag("scab_logs");
        public static final TagKey<Block> SCAB_LOGS_COMMON = createCommonTag("scab_logs");
        public static final TagKey<Block> INDIGO_LOGS = createTag("indigo_logs");
        public static final TagKey<Block> INDIGO_LOGS_COMMON = createCommonTag("indigo_logs");

        //Pondu
        public static final TagKey<Block> PONDU = createTag("pondu");
        public static final TagKey<Block> PONDU_COMMON = createCommonTag("pondu");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(Registry.BLOCK_KEY, new Identifier(ImprovedEnd.MOD_ID, name));
        }

        private static TagKey<Block> createCommonTag(String name) {
            return TagKey.of(Registry.BLOCK_KEY, new Identifier("c", name));
        }
    }

    public static class Items {
        public static final TagKey<Item> DARK_LOGS = createTag("dark_logs");
        public static final TagKey<Item> DARK_LOGS_COMMON = createCommonTag("dark_logs");
        public static final TagKey<Item> INFUSORIAL_LOGS = createTag("infusorial_logs");
        public static final TagKey<Item> INFUSORIAL_LOGS_COMMON = createCommonTag("infusorial_logs");
        public static final TagKey<Item> BUDDING_LOGS = createTag("budding_logs");
        public static final TagKey<Item> BUDDING_LOGS_COMMON = createCommonTag("budding_logs");
        public static final TagKey<Item> REDLEAF_LOGS = createTag("redleaf_logs");
        public static final TagKey<Item> REDLEAF_LOGS_COMMON = createCommonTag("redleaf_logs");
        public static final TagKey<Item> FIRE_LOGS = createTag("fire_logs");
        public static final TagKey<Item> FIRE_LOGS_COMMON = createCommonTag("fire_logs");
        public static final TagKey<Item> SHINING_LOGS = createTag("shining_logs");
        public static final TagKey<Item> SHINING_LOGS_COMMON = createCommonTag("shining_logs");
        public static final TagKey<Item> SERENE_LOGS = createTag("serene_logs");
        public static final TagKey<Item> SERENE_LOGS_COMMON = createCommonTag("serene_logs");
        public static final TagKey<Item> SCAB_LOGS = createTag("scab_logs");
        public static final TagKey<Item> SCAB_LOGS_COMMON = createCommonTag("scab_logs");
        public static final TagKey<Item> INDIGO_LOGS = createTag("indigo_logs");
        public static final TagKey<Item> INDIGO_LOGS_COMMON = createCommonTag("indigo_logs");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(Registry.ITEM_KEY, new Identifier(ImprovedEnd.MOD_ID, name));
        }

        private static TagKey<Item> createCommonTag(String name) {
            return TagKey.of(Registry.ITEM_KEY, new Identifier("c", name));
        }
    }
}
