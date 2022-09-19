package net.rupyber_studios.improved_end.world.structure;

import com.mojang.serialization.Codec;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.structure.Structure;
import net.minecraft.world.gen.structure.StructureType;
import net.rupyber_studios.improved_end.ImprovedEnd;

public class ModStructures {
    public static StructureType<?> END_HOUSE;
    public static StructureType<?> END_TREE;

    public static void registerStructureFeatures() {
        END_HOUSE = register(new Identifier(ImprovedEnd.MOD_ID, "end_house"), EndHouse.CODEC);
        END_TREE = register(new Identifier(ImprovedEnd.MOD_ID, "end_tree"), EndTree.CODEC);
    }

    private static <S extends Structure> StructureType<S> register(Identifier id, Codec<S> codec) {
        return Registry.register(Registry.STRUCTURE_TYPE, id, () -> codec);
    }
}