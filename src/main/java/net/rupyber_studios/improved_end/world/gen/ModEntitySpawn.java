package net.rupyber_studios.improved_end.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.mixin.object.builder.SpawnRestrictionAccessor;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.SpawnRestriction;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.MobEntity;
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

        SpawnRestrictionAccessor.callRegister(ModEntities.INDIGO_SQUID, SpawnRestriction.Location.ON_GROUND,
            Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MobEntity::canMobSpawn);

        SpawnRestrictionAccessor.callRegister(ModEntities.BLASTLING, SpawnRestriction.Location.ON_GROUND,
            Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, HostileEntity::canMobSpawn);
        SpawnRestrictionAccessor.callRegister(ModEntities.SNARELING, SpawnRestriction.Location.ON_GROUND,
            Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, HostileEntity::canMobSpawn);
        SpawnRestrictionAccessor.callRegister(ModEntities.MAWLING, SpawnRestriction.Location.ON_GROUND,
            Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, HostileEntity::canMobSpawn);
        SpawnRestrictionAccessor.callRegister(ModEntities.WATCHLING, SpawnRestriction.Location.ON_GROUND,
            Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, HostileEntity::canMobSpawn);
    }
}