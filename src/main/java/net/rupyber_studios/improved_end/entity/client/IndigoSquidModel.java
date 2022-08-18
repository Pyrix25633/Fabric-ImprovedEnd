package net.rupyber_studios.improved_end.entity.client;

import net.minecraft.util.Identifier;
import net.rupyber_studios.improved_end.ImprovedEnd;
import net.rupyber_studios.improved_end.entity.custom.IndigoSquidEntity;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class IndigoSquidModel extends AnimatedGeoModel<IndigoSquidEntity> {
    @Override
    public Identifier getModelLocation(IndigoSquidEntity object) {
        return new Identifier(ImprovedEnd.MOD_ID, "geo/indigo_squid.geo.json");
    }

    @Override
    public Identifier getTextureLocation(IndigoSquidEntity object) {
        return new Identifier(ImprovedEnd.MOD_ID, "textures/entity/squid/indigo_squid.png");
    }

    @Override
    public Identifier getAnimationFileLocation(IndigoSquidEntity animatable) {
        return new Identifier(ImprovedEnd.MOD_ID, "animations/indigo_squid.animations.json");
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    @Override
    public void setLivingAnimations(IndigoSquidEntity entity, Integer uniqueID, AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        IBone head = this.getAnimationProcessor().getBone("body");

        if (head != null) {
            head.setRotationX(entity.tiltAngle * ((float) Math.PI / 180F));
            head.setRotationY(entity.tentacleAngle * ((float) Math.PI / 180F));
        }
    }
}