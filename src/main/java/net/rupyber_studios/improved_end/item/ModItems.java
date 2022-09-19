package net.rupyber_studios.improved_end.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.rupyber_studios.improved_end.ImprovedEnd;
import net.rupyber_studios.improved_end.block.ModBlocks;
import net.rupyber_studios.improved_end.entity.ModEntities;
import net.rupyber_studios.improved_end.item.custom.*;
import net.rupyber_studios.improved_end.sounds.ModSounds;

public class ModItems {
    //Wasp Moss Carpet
    public static final Item WASP_MOSS_CARPET = registerItem("wasp_moss_carpet",
        new BlockItem(ModBlocks.WASP_MOSS_CARPET, new FabricItemSettings().group(ModItemGroup.IMPROVED_END_BIOMES_BLOCKS)));

    //Signs
    public static final Item DARK_SIGN = registerItem("dark_sign",
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
            ModBlocks.INDIGO_SIGN, ModBlocks.INDIGO_WALL_SIGN));

    //Indigo Lily Pad
    public static final Item INDIGO_LILY_PAD = registerItem("indigo_lily_pad",
        new PlaceableOnWaterItem(ModBlocks.INDIGO_LILY_PAD, new FabricItemSettings().group(ModItemGroup.IMPROVED_END_BIOMES_BLOCKS)));

    //Pondu
    public static final Item PONDU_BERRIES = registerItem("pondu_berries",
        new AliasedBlockItem(ModBlocks.PONDU, new FabricItemSettings().food(ModFoodComponents.PONDU_BERRIES)
            .group(ModItemGroup.IMPROVED_END_BIOMES_BLOCKS)));
    //Branius
    public static final Item BRANIUS_BERRIES = registerItem("branius_berries",
        new AliasedBlockItem(ModBlocks.BRANIUS, new FabricItemSettings().food(ModFoodComponents.BRANIUS_BERRIES)
            .group(ModItemGroup.IMPROVED_END_BIOMES_BLOCKS)));

    //Indigo Soil Brick
    public static final Item INDIGO_SOIL_BRICK = registerItem("indigo_soil_brick",
        new Item(new FabricItemSettings().group(ModItemGroup.IMPROVED_END_BIOMES_BLOCKS)));

    //Xorum
    public static final Item XORUM_ORE = registerItem("xorum_ore",
        new BlockItem(ModBlocks.XORUM_ORE, new FabricItemSettings().group(ModItemGroup.IMPROVED_END_BLOCKS).maxCount(64)));
    public static final Item RAW_XORUM_ORE = registerItem("raw_xorum_ore",
        new Item(new FabricItemSettings().group(ModItemGroup.IMPROVED_END_BLOCKS).maxCount(64)));
    public static final Item XORUM_INGOT = registerItem("xorum_ingot",
        new Item(new FabricItemSettings().group(ModItemGroup.IMPROVED_END_BLOCKS).maxCount(64)));
    public static final Item XORUM_SWORD = registerItem("xorum_sword",
        new SwordItem(ModToolMaterials.XORUM, 3, -2.5F,
            new FabricItemSettings().group(ModItemGroup.IMPROVED_END_BLOCKS).maxCount(1)));
    public static final Item XORUM_SHOVEL = registerItem("xorum_shovel",
        new ShovelItem(ModToolMaterials.XORUM, 1.5F, -3.0F,
            new FabricItemSettings().group(ModItemGroup.IMPROVED_END_BLOCKS).maxCount(1)));
    public static final Item XORUM_PICKAXE = registerItem("xorum_pickaxe",
        new ModPickaxeItem(ModToolMaterials.XORUM, 1, -2.8F,
            new FabricItemSettings().group(ModItemGroup.IMPROVED_END_BLOCKS).maxCount(1)));
    public static final Item XORUM_AXE = registerItem("xorum_axe",
        new ModAxeItem(ModToolMaterials.XORUM, 6.0F, -3.1F,
            new FabricItemSettings().group(ModItemGroup.IMPROVED_END_BLOCKS).maxCount(1)));
    public static final Item XORUM_HOE = registerItem("xorum_hoe",
        new ModHoeItem(ModToolMaterials.XORUM, -2, -3.1F,
            new FabricItemSettings().group(ModItemGroup.IMPROVED_END_BLOCKS).maxCount(1)));

    //Shulker
    public static final Item SHULKER_INGOT = registerItem("shulker_ingot",
        new Item(new FabricItemSettings().group(ModItemGroup.IMPROVED_END_BLOCKS).maxCount(64)));
    public static final Item SHULKER_HELMET = registerItem("shulker_helmet",
        new ModArmorItem(ModArmorMaterials.SHULKER, EquipmentSlot.HEAD,
            new FabricItemSettings().group(ModItemGroup.IMPROVED_END_BLOCKS)));
    public static final Item SHULKER_CHESTPLATE = registerItem("shulker_chestplate",
        new ModArmorItem(ModArmorMaterials.SHULKER, EquipmentSlot.CHEST,
            new FabricItemSettings().group(ModItemGroup.IMPROVED_END_BLOCKS)));
    public static final Item SHULKER_LEGGINGS = registerItem("shulker_leggings",
        new ModArmorItem(ModArmorMaterials.SHULKER, EquipmentSlot.LEGS,
            new FabricItemSettings().group(ModItemGroup.IMPROVED_END_BLOCKS)));
    public static final Item SHULKER_BOOTS = registerItem("shulker_boots",
        new ModArmorItem(ModArmorMaterials.SHULKER, EquipmentSlot.FEET,
            new FabricItemSettings().group(ModItemGroup.IMPROVED_END_BLOCKS)));

    //Discs
    public static final Item MUSIC_DISC_TWO_WORLDS_COLLIDE = registerItem("music_disc_two_worlds_collide",
        new ModMusicDiscItem(4, ModSounds.TWO_WORLDS_COLLIDE, new FabricItemSettings()
            .group(ModItemGroup.IMPROVED_END_BLOCKS).maxCount(1), 320));
    public static final Item MUSIC_DISC_NEVER_FORGIVE = registerItem("music_disc_never_forgive",
        new ModMusicDiscItem(4, ModSounds.NEVER_FORGIVE, new FabricItemSettings()
            .group(ModItemGroup.IMPROVED_END_BLOCKS).maxCount(1), 102));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(ImprovedEnd.MOD_ID, name), item);
    }

    //Spawn Eggs
    public static final Item INDIGO_SQUID_SPAWN_EGG = registerItem("indigo_squid_spawn_egg",
        new SpawnEggItem(ModEntities.INDIGO_SQUID, 0x43546F, 0x94FFE7,
            new FabricItemSettings().group(ModItemGroup.IMPROVED_END_BLOCKS).maxCount(1)));
    public static final Item BLASTLING_SPAWN_EGG = registerItem("blastling_spawn_egg",
        new SpawnEggItem(ModEntities.BLASTLING, 0x1B1224, 0xF08FFF,
            new FabricItemSettings().group(ModItemGroup.IMPROVED_END_BLOCKS).maxCount(1)));
    public static final Item SNARELING_SPAWN_EGG = registerItem("snareling_spawn_egg",
        new SpawnEggItem(ModEntities.SNARELING, 0x1B1224, 0xA4CC1F,
            new FabricItemSettings().group(ModItemGroup.IMPROVED_END_BLOCKS).maxCount(1)));
    public static final Item MAWLING_SPAWN_EGG = registerItem("mawling_spawn_egg",
        new SpawnEggItem(ModEntities.MAWLING, 0x1B1224, 0x621DA7,
            new FabricItemSettings().group(ModItemGroup.IMPROVED_END_BLOCKS).maxCount(1)));
    public static final Item WATCHLING_SPAWN_EGG = registerItem("watchling_spawn_egg",
        new SpawnEggItem(ModEntities.WATCHLING, 0x1B1224, 0x8017BD,
            new FabricItemSettings().group(ModItemGroup.IMPROVED_END_BLOCKS).maxCount(1)));

    public static void registerModItems() {
        System.out.println("Registering ModItems for " + ImprovedEnd.MOD_ID);
    }
}
