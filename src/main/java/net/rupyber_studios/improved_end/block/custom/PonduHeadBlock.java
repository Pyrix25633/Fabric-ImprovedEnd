package net.rupyber_studios.improved_end.block.custom;

import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Property;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.rupyber_studios.improved_end.block.ModBlocks;

public class PonduHeadBlock extends AbstractPlantStemBlock implements Fertilizable, Pondu {
    private static final float GROW_CHANCE = 0.11F;

    public PonduHeadBlock(AbstractBlock.Settings settings) {
        super(settings, Direction.DOWN, SHAPE, false, 0.1);
        this.setDefaultState(((this.stateManager.getDefaultState()).with(AGE, 0)).with(BERRIES, false));
    }

    protected int getGrowthLength(Random random) {
        return 1;
    }

    protected boolean chooseStemState(BlockState state) {
        return state.isAir();
    }

    protected Block getPlant() {
        return ModBlocks.PONDU_PLANT;
    }

    protected BlockState copyState(BlockState from, BlockState to) {
        return to.with(BERRIES, from.get(BERRIES));
    }

    protected BlockState age(BlockState state, Random random) {
        return super.age(state, random).with(BERRIES, random.nextFloat() < 0.11F);
    }

    public ItemStack getPickStack(BlockView world, BlockPos pos, BlockState state) {
        return new ItemStack(Items.GLOW_BERRIES);
    }

    @SuppressWarnings("deprecation")
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        return Pondu.pickBerries(state, world, pos);
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        super.appendProperties(builder);
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
