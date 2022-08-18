package net.rupyber_studios.improved_end.world.feature;

import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.rupyber_studios.improved_end.util.ModTags;

public class ModOreConfiguredFeatures {
    public static final RuleTest END_STONE_ORE_REPLACEABLES;

    public ModOreConfiguredFeatures() {
    }

    static {
        END_STONE_ORE_REPLACEABLES = new TagMatchRuleTest(ModTags.Blocks.END_STONE_ORE_REPLACEABLES);
    }
}
