package net.rupyber_studios.improved_end.entity.client;

import net.minecraft.util.Identifier;
import net.rupyber_studios.improved_end.ImprovedEnd;
import net.rupyber_studios.improved_end.entity.custom.WatchlingEntity;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class WatchlingModel extends AnimatedGeoModel<WatchlingEntity> {
    @Override
    public Identifier getModelResource(WatchlingEntity object) {
        return new Identifier(ImprovedEnd.MOD_ID, "geo/watchling.geo.json");
    }

    @Override
    public Identifier getTextureResource(WatchlingEntity object) {
        return new Identifier(ImprovedEnd.MOD_ID, "textures/entity/enderman/watchling.png");
    }

    @Override
    public Identifier getAnimationResource(WatchlingEntity animatable) {
        return new Identifier(ImprovedEnd.MOD_ID, "animations/watchling.animations.json");
    }

    @SuppressWarnings("unchecked")
    @Override
    public void setCustomAnimations(WatchlingEntity entity, int uniqueID, AnimationEvent customPredicate) {
        super.setCustomAnimations(entity, uniqueID, customPredicate);
        IBone head = this.getAnimationProcessor().getBone("head");

        EntityModelData extraData = (EntityModelData) customPredicate.getExtraDataOfType(EntityModelData.class).get(0);
        if (head != null) {
            head.setRotationX(extraData.headPitch * ((float) Math.PI / 180F));
            head.setRotationY(extraData.netHeadYaw * ((float) Math.PI / 180F));
        }
    }
}