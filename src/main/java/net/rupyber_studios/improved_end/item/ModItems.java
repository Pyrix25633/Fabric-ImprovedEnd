package net.rupyber_studios.improved_end.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.SignItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.rupyber_studios.improved_end.ImprovedEnd;
import net.rupyber_studios.improved_end.block.ModBlocks;

public class ModItems {
    //Signs
/*    public static final Item DARK_SIGN = registerItem("dark_sign",
            new SignItem(new FabricItemSettings().group(ModItemGroup.IMPROVED_END_BIOMES_BLOCKS).maxCount(16),
                    ModBlocks.DARK_SIGN, ModBlocks.DARK_WALL_SIGN));
    public static final Item INFUSORIAL_SIGN = registerItem("infusorial_sign",
            new SignItem(new FabricItemSettings().group(ModItemGroup.IMPROVED_END_BIOMES_BLOCKS).maxCount(16),
                    ModBlocks.INFUSORIAL_SIGN, ModBlocks.INFUSORIAL_WALL_SIGN));
    public static final Item BUDDING_SIGN = registerItem("budding_sign",
            new SignItem(new FabricItemSettings().group(ModItemGroup.IMPROVED_END_BIOMES_BLOCKS).maxCount(16),
                    ModBlocks.BUDDING_SIGN, ModBlocks.BUDDING_WALL_SIGN));
    public static final Item REDLEAF_SIGN = registerItem("redleaf_sign",
            new SignItem(new FabricItemSettings().group(ModItemGroup.IMPROVED_END_BIOMES_BLOCKS).maxCount(16),
                    ModBlocks.REDLEAF_SIGN, ModBlocks.REDLEAF_WALL_SIGN));
    public static final Item FIRE_SIGN = registerItem("fire_sign",
            new SignItem(new FabricItemSettings().group(ModItemGroup.IMPROVED_END_BIOMES_BLOCKS).maxCount(16),
                    ModBlocks.FIRE_SIGN, ModBlocks.FIRE_WALL_SIGN));
    public static final Item SHINING_SIGN = registerItem("shining_sign",
            new SignItem(new FabricItemSettings().group(ModItemGroup.IMPROVED_END_BIOMES_BLOCKS).maxCount(16),
                    ModBlocks.SHINING_SIGN, ModBlocks.SHINING_WALL_SIGN));
    public static final Item SERENE_SIGN = registerItem("serene_sign",
            new SignItem(new FabricItemSettings().group(ModItemGroup.IMPROVED_END_BIOMES_BLOCKS).maxCount(16),
                    ModBlocks.SERENE_SIGN, ModBlocks.SERENE_WALL_SIGN));
    public static final Item SCAB_SIGN = registerItem("scab_sign",
            new SignItem(new FabricItemSettings().group(ModItemGroup.IMPROVED_END_BIOMES_BLOCKS).maxCount(16),
                    ModBlocks.SCAB_SIGN, ModBlocks.SCAB_WALL_SIGN));
    public static final Item INDIGO_SIGN = registerItem("indigo_sign",
            new SignItem(new FabricItemSettings().group(ModItemGroup.IMPROVED_END_BIOMES_BLOCKS).maxCount(16),
                    ModBlocks.INDIGO_SIGN, ModBlocks.INDIGO_WALL_SIGN));*/

    private static Item registerItem(String name, Item item ) {
        return Registry.register(Registry.ITEM, new Identifier(ImprovedEnd.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering Mod Items for " + ImprovedEnd.MOD_ID);
    }
}
