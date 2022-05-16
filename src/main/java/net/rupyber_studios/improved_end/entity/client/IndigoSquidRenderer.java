package net.rupyber_studios.improved_end.entity.client;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import net.rupyber_studios.improved_end.ImprovedEnd;
import net.rupyber_studios.improved_end.entity.custom.IndigoSquidEntity;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class IndigoSquidRenderer extends GeoEntityRenderer<IndigoSquidEntity> {
    public IndigoSquidRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new IndigoSquidModel());
    }

    @Override
    public Identifier getTextureLocation(IndigoSquidEntity instance) {
        return new Identifier(ImprovedEnd.MOD_ID, "textures/entity/squid/indigo_squid.png");
    }
}