package net.rupyber_studios.improved_end.world.feature;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.structure.StructurePlacementData;
import net.minecraft.structure.StructureTemplate;
import net.minecraft.structure.StructureTemplateManager;
import net.minecraft.structure.processor.BlockIgnoreStructureProcessor;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.util.FeatureContext;
import net.rupyber_studios.improved_end.ImprovedEnd;
import net.rupyber_studios.improved_end.util.GeneralUtils;
import org.spongepowered.include.com.google.common.collect.ImmutableList;

import java.util.Optional;

public class ModNbtFeature extends Feature<ModNbtFeatureConfig> {

    public ModNbtFeature() {
        super(ModNbtFeatureConfig.CODEC);
    }

    private final BlockIgnoreStructureProcessor IGNORE_STRUCTURE_VOID = new BlockIgnoreStructureProcessor(ImmutableList.of(Blocks.STRUCTURE_VOID));
    private final StructurePlacementData placementsettings = (new StructurePlacementData()).setMirror(BlockMirror.NONE).addProcessor(IGNORE_STRUCTURE_VOID).setIgnoreEntities(false);

    @Override
    public boolean generate(FeatureContext<ModNbtFeatureConfig> context) {
        BlockPos.Mutable mutable = new BlockPos.Mutable().set(context.getOrigin());
        for (mutable.move(Direction.UP); context.getWorld().isAir(mutable) && mutable.getY() > 2; ) {
            mutable.move(Direction.DOWN);
        }
        if (!context.getWorld().getBlockState(mutable).isAir() &&
            !context.getWorld().isAir(mutable.down()) &&
            !context.getWorld().isAir(mutable.down(2))) {
            mutable.move(Direction.DOWN);
        }
        else{
            return false;
        }
        if (context.getConfig().nbtResourcelocationsAndWeights.size() == 0) {
            return false;
        }
        BlockPos.Mutable blockpos$Mutable = new BlockPos.Mutable();
        StructureTemplateManager templatemanager = context.getWorld().getServer().getStructureTemplateManager();
        Identifier nbtRL = GeneralUtils.getRandomEntry(context.getConfig().nbtResourcelocationsAndWeights, context.getRandom());
        Optional<StructureTemplate> template = templatemanager.getTemplate(nbtRL);
        if (template.isEmpty()) {
            ImprovedEnd.LOGGER.warn(context.getConfig().nbtResourcelocationsAndWeights.toString() + " NTB does not exist!");
            return false;
        }
        int radius = template.get().getSize().getX() / 2;
        for (int x = -radius; x <= radius; x++) {
            for (int z = -radius; z <= radius; z++) {
                if ((x * x) + (z * z) < radius * radius + 1) {
                    blockpos$Mutable.set(context.getOrigin()).move(x, 0, z);
                    if (!context.getConfig().allowInWater && !context.getWorld().getFluidState(blockpos$Mutable).isEmpty()) {
                        return false;
                    }
                    else if(context.getWorld().getBlockState(blockpos$Mutable.move(Direction.UP)).isOpaque() ||
                        !context.getWorld().getBlockState(blockpos$Mutable.move(Direction.DOWN, 3)).isOpaque())
                        return false;
                }
            }
        }

        BlockPos halfLengths = new BlockPos(template.get().getSize().getX() / 2, 0, template.get().getSize().getZ() / 2);
        placementsettings.setRotation(BlockRotation.random(context.getRandom())).setPosition(halfLengths).setIgnoreEntities(false);
        if(context.getConfig().processor != null) {
            context.getWorld().getRegistryManager().get(Registry.STRUCTURE_PROCESSOR_LIST_KEY)
                .getOrEmpty(context.getConfig().processor).ifPresent(processor -> processor.getList().forEach(placementsettings::addProcessor));
        }
        blockpos$Mutable.set(context.getOrigin());
        Direction offset = Direction.fromVector(-template.get().getSize().getX() / 2, context.getConfig().heightOffset, -template.get().getSize().getZ() / 2);
        template.get().place(context.getWorld(), blockpos$Mutable.offset(offset), blockpos$Mutable.offset(offset), placementsettings, context.getRandom(), Block.NOTIFY_LISTENERS);
        return true;
    }
}