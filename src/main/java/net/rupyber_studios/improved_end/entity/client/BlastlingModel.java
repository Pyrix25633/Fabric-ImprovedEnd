package net.rupyber_studios.improved_end.entity.client;

import net.minecraft.util.Identifier;
import net.rupyber_studios.improved_end.ImprovedEnd;
import net.rupyber_studios.improved_end.entity.custom.BlastlingEntity;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class BlastlingModel extends AnimatedGeoModel<BlastlingEntity> {
    @Override
    public Identifier getModelLocation(BlastlingEntity object) {
        return new Identifier(ImprovedEnd.MOD_ID, "geo/blastling.geo.json");
    }

    @Override
    public Identifier getTextureLocation(BlastlingEntity object) {
        return new Identifier(ImprovedEnd.MOD_ID, "textures/entity/enderman/blastling.png");
    }

    @Override
    public Identifier getAnimationFileLocation(BlastlingEntity animatable) {
        return new Identifier(ImprovedEnd.MOD_ID, "animations/blastling.animations.json");
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public void setLivingAnimations(BlastlingEntity entity, Integer uniqueID, AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        IBone head = this.getAnimationProcessor().getBone("head");

        EntityModelData extraData = (EntityModelData) customPredicate.getExtraDataOfType(EntityModelData.class).get(0);
        if (head != null) {
            head.setRotationX(extraData.headPitch * ((float) Math.PI / 180F));
            head.setRotationY(extraData.netHeadYaw * ((float) Math.PI / 180F));
        }
    }
}