package net.rupyber_studios.improved_end.entity.client;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import net.rupyber_studios.improved_end.ImprovedEnd;
import net.rupyber_studios.improved_end.entity.custom.BlastlingEntity;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class BlastlingRenderer extends GeoEntityRenderer<BlastlingEntity> {
    public BlastlingRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new BlastlingModel());
    }

    @Override
    public Identifier getTextureLocation(BlastlingEntity instance) {
        return new Identifier(ImprovedEnd.MOD_ID, "textures/entity/enderman/blastling.png");
    }
}