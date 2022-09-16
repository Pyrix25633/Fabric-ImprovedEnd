package net.rupyber_studios.improved_end.world.structure;

import net.minecraft.structure.PoolStructurePiece;
import net.minecraft.structure.PostPlacementProcessor;
import net.minecraft.structure.StructureGeneratorFactory;
import net.minecraft.structure.StructurePiecesGenerator;
import net.minecraft.structure.pool.StructurePoolBasedGenerator;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Heightmap;
import net.minecraft.world.gen.feature.StructureFeature;
import net.minecraft.world.gen.feature.StructurePoolFeatureConfig;
import net.rupyber_studios.improved_end.ImprovedEnd;
import org.apache.logging.log4j.Level;

import java.util.Optional;

public class EndTree extends StructureFeature<StructurePoolFeatureConfig> {

    public EndTree() {
        super(StructurePoolFeatureConfig.CODEC, EndHouse::createPiecesGenerator, PostPlacementProcessor.EMPTY);
    }

    private static boolean isFeatureChunk(int topLandY) {
        return topLandY > 16;
    }

    public static Optional<StructurePiecesGenerator<StructurePoolFeatureConfig>> createPiecesGenerator(StructureGeneratorFactory.Context<StructurePoolFeatureConfig> context) {
        BlockPos blockpos = context.chunkPos().getCenterAtY(0);
        int topLandY = context.chunkGenerator().getHeightOnGround(blockpos.getX(), blockpos.getZ(), Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, context.world());

        if (!EndTree.isFeatureChunk(topLandY)) {
            return Optional.empty();
        }

        blockpos = blockpos.up(topLandY + 1);

        Optional<StructurePiecesGenerator<StructurePoolFeatureConfig>> structurePiecesGenerator =
            StructurePoolBasedGenerator.generate(
                context,
                PoolStructurePiece::new,
                blockpos,
                false,
                false
            );

        if(structurePiecesGenerator.isPresent()) {
            ImprovedEnd.LOGGER.log(Level.DEBUG, "End Tree at {}", blockpos);
        }

        return structurePiecesGenerator;
    }
}