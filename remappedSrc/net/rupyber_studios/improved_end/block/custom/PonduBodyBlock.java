package net.rupyber_studios.improved_end.block.custom;

import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Property;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.rupyber_studios.improved_end.block.ModBlocks;
import net.rupyber_studios.improved_end.item.ModItems;

import java.util.Random;

public class PonduBodyBlock extends AbstractPlantBlock implements Fertilizable, Pondu {
    public PonduBodyBlock(AbstractBlock.Settings settings) {
        super(settings, Direction.DOWN, SHAPE, false);
        this.setDefaultState((this.stateManager.getDefaultState()).with(BERRIES, false));
    }

    protected AbstractPlantStemBlock getStem() {
        return (AbstractPlantStemBlock) ModBlocks.PONDU;
    }

    protected BlockState copyState(BlockState from, BlockState to) {
        return to.with(BERRIES, from.get(BERRIES));
    }

    public ItemStack getPickStack(BlockView world, BlockPos pos, BlockState state) {
        return new ItemStack(ModItems.PONDU_BERRIES);
    }

    @SuppressWarnings("deprecation")
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        return Pondu.pickBerries(state, world, pos);
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{BERRIES});
    }

    public boolean isFertilizable(BlockView world, BlockPos pos, BlockState state, boolean isClient) {
        return !(Boolean) state.get(BERRIES);
    }

    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        return true;
    }

    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        world.setBlockState(pos, state.with(BERRIES, true), 2);
    }
}
