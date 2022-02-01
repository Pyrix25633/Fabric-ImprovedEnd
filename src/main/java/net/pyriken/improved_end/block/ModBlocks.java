package net.pyriken.improved_end.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.pyriken.improved_end.ImprovedEnd;
import net.pyriken.improved_end.block.custom.EndGrassBlock;
import net.pyriken.improved_end.item.ModItemGroup;

public class ModBlocks {
    //Variables to better control block hardness and resistance
    static final float woodHardness = 2f, woodResistance = 2f, stoneHardness = 1.5f, stoneResistance = 2.2f;
    static final FabricBlockSettings endGrassSettings = FabricBlockSettings.of(Material.SOLID_ORGANIC)
            .strength(stoneHardness, stoneResistance).sounds(BlockSoundGroup.GRASS).requiresTool();

    //"End Grass"
    public static final Block TIROLIUM = registerBlock("tirolium",
            new EndGrassBlock(endGrassSettings));
    public static final Block ZIOROLIUM = registerBlock("ziorolium",
            new EndGrassBlock(endGrassSettings));
    public static final Block SEROLIUM = registerBlock("serolium",
            new EndGrassBlock(endGrassSettings));
    public static final Block TEDOROLIUM = registerBlock("tedorolium",
            new EndGrassBlock(endGrassSettings));
    public static final Block GRATOROLIUM = registerBlock("gratorolium",
            new EndGrassBlock(endGrassSettings));
    public static final Block YAMPEROLIUM = registerBlock("yamperolium",
            new EndGrassBlock(endGrassSettings));
    public static final Block PIOROLIUM = registerBlock("piorolium",
            new EndGrassBlock(endGrassSettings));
    public static final Block XIOROLIUM = registerBlock("xiorolium",
            new EndGrassBlock(endGrassSettings));
    public static final Block AGGOROLIUM = registerBlock("aggorolium",
            new EndGrassBlock(endGrassSettings));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(ImprovedEnd.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registry.ITEM, new Identifier(ImprovedEnd.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(ModItemGroup.IMPROVED_END)));
    }

    public static void registerModBlocks() {
        System.out.println("Registering ModBlocks for " + ImprovedEnd.MOD_ID);
    }
}
