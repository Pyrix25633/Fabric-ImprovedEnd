package net.rupyber_studios.improved_end.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.SpawnRestriction;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.WaterCreatureEntity;
import net.minecraft.world.Heightmap;
import net.rupyber_studios.improved_end.entity.ModEntities;

public class ModEntitySpawn {
    public static void addEntitySpawn() {
        BiomeModifications.addSpawn(BiomeSelectors.foundInTheEnd(),
            SpawnGroup.CREATURE, ModEntities.INDIGO_SQUID, 40, 1, 3);

        BiomeModifications.addSpawn(BiomeSelectors.foundInTheEnd(),
            SpawnGroup.CREATURE, ModEntities.BLASTLING, 25, 1, 3);
        BiomeModifications.addSpawn(BiomeSelectors.foundInTheEnd(),
            SpawnGroup.CREATURE, ModEntities.SNARELING, 25, 1, 3);
        BiomeModifications.addSpawn(BiomeSelectors.foundInTheEnd(),
            SpawnGroup.CREATURE, ModEntities.MAWLING, 25, 1, 3);
        BiomeModifications.addSpawn(BiomeSelectors.foundInTheEnd(),
            SpawnGroup.CREATURE, ModEntities.WATCHLING, 25, 1, 3);

        SpawnRestriction.register(ModEntities.INDIGO_SQUID, SpawnRestriction.Location.IN_WATER,
            Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, WaterCreatureEntity::canMobSpawn);

        SpawnRestriction.register(ModEntities.BLASTLING, SpawnRestriction.Location.ON_GROUND,
            Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, HostileEntity::canMobSpawn);
        SpawnRestriction.register(ModEntities.SNARELING, SpawnRestriction.Location.ON_GROUND,
            Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, HostileEntity::canMobSpawn);
        SpawnRestriction.register(ModEntities.MAWLING, SpawnRestriction.Location.ON_GROUND,
            Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, HostileEntity::canMobSpawn);
        SpawnRestriction.register(ModEntities.WATCHLING, SpawnRestriction.Location.ON_GROUND,
            Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, HostileEntity::canMobSpawn);
    }
}