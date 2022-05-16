package net.rupyber_studios.improved_end.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.rupyber_studios.improved_end.ImprovedEnd;
import net.rupyber_studios.improved_end.entity.custom.IndigoSquidEntity;

public class ModEntities {
    public static final EntityType<IndigoSquidEntity> INDIGO_SQUID = Registry.register(Registry.ENTITY_TYPE,
            new Identifier(ImprovedEnd.MOD_ID, "indigo_squid"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, IndigoSquidEntity::new)
                    .dimensions(EntityDimensions.fixed(0.5f, 1.0f)).build());
}
