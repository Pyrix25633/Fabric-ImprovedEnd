package net.rupyber_studios.improved_end.entity.client;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import net.rupyber_studios.improved_end.ImprovedEnd;
import net.rupyber_studios.improved_end.entity.custom.MawlingEntity;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class MawlingRenderer extends GeoEntityRenderer<MawlingEntity> {
    public MawlingRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new MawlingModel());
    }

    @Override
    public Identifier getTextureLocation(MawlingEntity instance) {
        return new Identifier(ImprovedEnd.MOD_ID, "textures/entity/enderman/mawling.png");
    }
}