package net.rupyber_studios.improved_end.entity.client;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import net.rupyber_studios.improved_end.ImprovedEnd;
import net.rupyber_studios.improved_end.entity.custom.WatchlingEntity;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class WatchlingRenderer extends GeoEntityRenderer<WatchlingEntity> {
    public WatchlingRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new WatchlingModel());
    }

    @Override
    public Identifier getTextureLocation(WatchlingEntity instance) {
        return new Identifier(ImprovedEnd.MOD_ID, "textures/entity/enderman/watchling.png");
    }
}