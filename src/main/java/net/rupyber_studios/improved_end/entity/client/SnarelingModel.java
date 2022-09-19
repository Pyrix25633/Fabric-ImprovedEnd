package net.rupyber_studios.improved_end.entity.client;

import net.minecraft.util.Identifier;
import net.rupyber_studios.improved_end.ImprovedEnd;
import net.rupyber_studios.improved_end.entity.custom.SnarelingEntity;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class SnarelingModel extends AnimatedGeoModel<SnarelingEntity> {
    @Override
    public Identifier getModelResource(SnarelingEntity object) {
        return new Identifier(ImprovedEnd.MOD_ID, "geo/snareling.geo.json");
    }

    @Override
    public Identifier getTextureResource(SnarelingEntity object) {
        return new Identifier(ImprovedEnd.MOD_ID, "textures/entity/enderman/snareling.png");
    }

    @Override
    public Identifier getAnimationResource(SnarelingEntity animatable) {
        return new Identifier(ImprovedEnd.MOD_ID, "animations/snareling.animations.json");
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    @Override
    public void setLivingAnimations(SnarelingEntity entity, Integer uniqueID, AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        IBone head = this.getAnimationProcessor().getBone("head");

        EntityModelData extraData = (EntityModelData) customPredicate.getExtraDataOfType(EntityModelData.class).get(0);
        if (head != null) {
            head.setRotationX(extraData.headPitch * ((float) Math.PI / 180F));
            head.setRotationY(extraData.netHeadYaw * ((float) Math.PI / 180F));
        }
    }
}