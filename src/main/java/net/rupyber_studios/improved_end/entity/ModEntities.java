package net.rupyber_studios.improved_end.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.rupyber_studios.improved_end.ImprovedEnd;
import net.rupyber_studios.improved_end.entity.custom.BlastlingEntity;
import net.rupyber_studios.improved_end.entity.custom.IndigoSquidEntity;
import net.rupyber_studios.improved_end.entity.custom.SnarelingEntity;

public class ModEntities {
    public static final EntityType<IndigoSquidEntity> INDIGO_SQUID = Registry.register(Registry.ENTITY_TYPE,
            new Identifier(ImprovedEnd.MOD_ID, "indigo_squid"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, IndigoSquidEntity::new)
                    .dimensions(EntityDimensions.fixed(0.8f, 0.8f)).build());
    public static final EntityType<BlastlingEntity> BLASTLING = Registry.register(Registry.ENTITY_TYPE,
            new Identifier(ImprovedEnd.MOD_ID, "blastling"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, BlastlingEntity::new)
                    .dimensions(EntityDimensions.fixed(0.8f, 2.45f)).build());
    public static final EntityType<SnarelingEntity> SNARELING = Registry.register(Registry.ENTITY_TYPE,
            new Identifier(ImprovedEnd.MOD_ID, "snareling"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, SnarelingEntity::new)
                    .dimensions(EntityDimensions.fixed(0.6f, 2.45f)).build());
}
