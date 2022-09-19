package net.rupyber_studios.improved_end.world.structure;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.structure.pool.StructurePool;
import net.minecraft.structure.pool.StructurePoolBasedGenerator;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.Heightmap;
import net.minecraft.world.gen.HeightContext;
import net.minecraft.world.gen.heightprovider.HeightProvider;
import net.minecraft.world.gen.structure.Structure;
import net.minecraft.world.gen.structure.StructureType;

import java.util.Optional;

public class EndHouse extends Structure {
    public static final Codec<EndHouse> CODEC = RecordCodecBuilder.<EndHouse>mapCodec(instance ->
        instance.group(EndHouse.configCodecBuilder(instance),
            StructurePool.REGISTRY_CODEC.fieldOf("start_pool").forGetter(structure -> structure.startPool),
            Identifier.CODEC.optionalFieldOf("start_jigsaw_name").forGetter(structure -> structure.startJigsawName),
            Codec.intRange(0, 30).fieldOf("size").forGetter(structure -> structure.size),
            HeightProvider.CODEC.fieldOf("start_height").forGetter(structure -> structure.startHeight),
            Heightmap.Type.CODEC.optionalFieldOf("project_start_to_heightmap").forGetter(structure -> structure.projectStartToHeightmap),
            Codec.intRange(1, 128).fieldOf("max_distance_from_center").forGetter(structure -> structure.maxDistanceFromCenter)
        ).apply(instance, EndHouse::new)).codec();

    private final RegistryEntry<StructurePool> startPool;
    private final Optional<Identifier> startJigsawName;
    private final int size;
    private final HeightProvider startHeight;
    private final Optional<Heightmap.Type> projectStartToHeightmap;
    private final int maxDistanceFromCenter;


    public EndHouse(Structure.Config config, RegistryEntry<StructurePool> startPool, Optional<Identifier> startJigsawName,
                    int size, HeightProvider startHeight, Optional<Heightmap.Type> projectStartToHeightmap, int maxDistanceFromCenter) {
        super(config);
        this.startPool = startPool;
        this.startJigsawName = startJigsawName;
        this.size = size;
        this.startHeight = startHeight;
        this.projectStartToHeightmap = projectStartToHeightmap;
        this.maxDistanceFromCenter = maxDistanceFromCenter;
    }

    private static boolean extraSpawningChecks(Structure.Context context) {
        BlockPos blockpos = context.chunkPos().getCenterAtY(0);
        boolean corner1 = context.chunkGenerator().getHeightOnGround(blockpos.getX(), blockpos.getZ(), Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, context.world(), context.noiseConfig()) > 16;
        blockpos = blockpos.offset(Direction.Axis.X, 5);
        boolean corner2 = context.chunkGenerator().getHeightOnGround(blockpos.getX(), blockpos.getZ(), Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, context.world(), context.noiseConfig()) > 16;
        blockpos = blockpos.offset(Direction.Axis.Z, 5);
        boolean corner3 = context.chunkGenerator().getHeightOnGround(blockpos.getX(), blockpos.getZ(), Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, context.world(), context.noiseConfig()) > 16;
        return corner1 && corner2 && corner3;
    }

    @Override
    public Optional<Structure.StructurePosition> getStructurePosition(Structure.Context context) {
        if (!EndHouse.extraSpawningChecks(context)) {
            return Optional.empty();
        }
        int startY = this.startHeight.get(context.random(), new HeightContext(context.chunkGenerator(), context.world()));
        ChunkPos chunkPos = context.chunkPos();
        BlockPos blockPos = new BlockPos(chunkPos.getStartX(), startY, chunkPos.getStartZ());

        Optional<StructurePosition> structurePiecesGenerator =
            StructurePoolBasedGenerator.generate(
                context,
                this.startPool,
                this.startJigsawName,
                this.size,
                blockPos,
                false,
                this.projectStartToHeightmap,
                this.maxDistanceFromCenter);
        return structurePiecesGenerator;
    }


    @Override
    public StructureType<?> getType() {
        return ModStructures.END_HOUSE;
    }
}