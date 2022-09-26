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
import net.minecraft.util.math.Vec3i;
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
        if (context.getConfig().nbtResourcelocationsAndWeights.size() == 0) {
            return false;
        }

        StructureTemplateManager templatemanager = context.getWorld().getServer().getStructureTemplateManager();
        Identifier nbtRL = GeneralUtils.getRandomEntry(context.getConfig().nbtResourcelocationsAndWeights, context.getRandom());

        Optional<StructureTemplate> template = templatemanager.getTemplate(nbtRL);
        if (template.isEmpty()) {
            ImprovedEnd.LOGGER.warn(context.getConfig().nbtResourcelocationsAndWeights.toString() + " NTB does not exist!");
            return false;
        }

        Vec3i size = template.get().getSize();
        if(size.getX() == 0 && size.getY() == 0 && size.getZ() == 0) {
            ImprovedEnd.LOGGER.warn(context.getConfig().nbtResourcelocationsAndWeights.toString() + " NTB is size 0 in all dimensions!");
            return false;
        }

        BlockPos halfLengths = new BlockPos(size.getX() / 2, 0, size.getZ() / 2);
        placementsettings.setRotation(BlockRotation.random(context.getRandom())).setPosition(halfLengths).setIgnoreEntities(false);
        if(context.getConfig().processor != null) {
            context.getWorld().getRegistryManager().get(Registry.STRUCTURE_PROCESSOR_LIST_KEY)
                .getOrEmpty(context.getConfig().processor).ifPresent(processor -> processor.getList().forEach(placementsettings::addProcessor));
        }

        BlockPos offset = new BlockPos(-size.getX() / 2, context.getConfig().heightOffset, -size.getZ() / 2);
        template.get().place(context.getWorld(), context.getOrigin().add(offset), context.getOrigin().add(offset), placementsettings, context.getRandom(), Block.NOTIFY_LISTENERS);
        return true;
    }
}