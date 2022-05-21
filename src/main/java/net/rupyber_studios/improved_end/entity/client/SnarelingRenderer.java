package net.rupyber_studios.improved_end.entity.client;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import net.rupyber_studios.improved_end.ImprovedEnd;
import net.rupyber_studios.improved_end.entity.custom.SnarelingEntity;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class SnarelingRenderer extends GeoEntityRenderer<SnarelingEntity> {
    public SnarelingRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new SnarelingModel());
    }

    @Override
    public Identifier getTextureLocation(SnarelingEntity instance) {
        return new Identifier(ImprovedEnd.MOD_ID, "textures/entity/enderman/snareling.png");
    }
}