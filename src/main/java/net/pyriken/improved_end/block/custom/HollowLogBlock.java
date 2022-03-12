package net.pyriken.improved_end.block.custom;

import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.pyriken.improved_end.block.ModBlocks;

public class HollowLogBlock extends Block implements Waterloggable{
    public static final EnumProperty<Direction.Axis> AXIS;
    public static final BooleanProperty MOSSY;
    public static final BooleanProperty WATERLOGGED;

    public HollowLogBlock(AbstractBlock.Settings settings) {
        super(settings);
        this.setDefaultState(this.getDefaultState().with(AXIS, Direction.Axis.Y).with(MOSSY, false)
                .with(WATERLOGGED, false));
    }

    @Override
    @SuppressWarnings("deprecation")
    public boolean hasSidedTransparency(BlockState state) {
        return true;
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        FluidState fluidState = ctx.getWorld().getFluidState(ctx.getBlockPos());
        boolean bl = fluidState.getFluid() == Fluids.WATER;
        return this.getDefaultState().with(AXIS, ctx.getSide().getAxis()).with(MOSSY, false).with(WATERLOGGED, bl);
    }

    @Override
    @SuppressWarnings("deprecation")
    public FluidState getFluidState(BlockState state) {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }

    public boolean isTranslucent(BlockState state, BlockView world, BlockPos pos) {
        return state.getFluidState().isEmpty();
    }

    public boolean tryFillWithFluid(WorldAccess world, BlockPos pos, BlockState state, FluidState fluidState) {
        return Waterloggable.super.tryFillWithFluid(world, pos, state, fluidState);
    }

    public boolean canFillWithFluid(BlockView world, BlockPos pos, BlockState state, Fluid fluid) {
        return Waterloggable.super.canFillWithFluid(world, pos, state, fluid);
    }

    @SuppressWarnings("deprecation")
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState newState,
                                                WorldAccess world, BlockPos pos, BlockPos posFrom) {
        if (state.get(WATERLOGGED)) {
            world.createAndScheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        }
        return super.getStateForNeighborUpdate(state, direction, newState, world, pos, posFrom);
    }

    private static final VoxelShape X_1 = Block.createCuboidShape(0,0,0,16,2,16);
    private static final VoxelShape X_2 = Block.createCuboidShape(0,14,0,16,16,16);
    private static final VoxelShape X_3 = Block.createCuboidShape(0,2,0,16,14,2);
    private static final VoxelShape X_4 = Block.createCuboidShape(0,2,14,16,14,16);
    private static final VoxelShape X_MOSS = Block.createCuboidShape(0,2,2,16,3,14);
    private static final VoxelShape X = VoxelShapes.union(X_1, X_2, X_3, X_4);
    private static final VoxelShape X_MOSSY = VoxelShapes.union(X_1, X_2, X_3, X_4, X_MOSS);
    private static final VoxelShape Y_1 = Block.createCuboidShape(0,0,0,16,16,2);
    private static final VoxelShape Y_2 = Block.createCuboidShape(0,0,2,2,16,14);
    private static final VoxelShape Y_3 = Block.createCuboidShape(0,0,14,16,16,16);
    private static final VoxelShape Y_4 = Block.createCuboidShape(14,0,2,16,16,14);
    private static final VoxelShape Y_MOSS = Block.createCuboidShape(2,0,2,14,1,14);
    private static final VoxelShape Y = VoxelShapes.union(Y_1, Y_2, Y_3, Y_4);
    private static final VoxelShape Y_MOSSY = VoxelShapes.union(Y_1, Y_2, Y_3, Y_4, Y_MOSS);
    private static final VoxelShape Z_1 = Block.createCuboidShape(0,0,0,16,2,16);
    private static final VoxelShape Z_2 = Block.createCuboidShape(0,14,0,16,16,16);
    private static final VoxelShape Z_3 = Block.createCuboidShape(0,2,0,2,14,16);
    private static final VoxelShape Z_4 = Block.createCuboidShape(14,2,0,16,14,16);
    private static final VoxelShape Z_MOSS = Block.createCuboidShape(2,2,0,14,3,16);
    private static final VoxelShape Z = VoxelShapes.union(Z_1, Z_2, Z_3, Z_4);
    private static final VoxelShape Z_MOSSY = VoxelShapes.union(Z_1, Z_2, Z_3, Z_4, Z_MOSS);

    @Override
    @SuppressWarnings("deprecation")
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return getShape(state);
    }

    @Override
    @SuppressWarnings("deprecation")
    public VoxelShape getCameraCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return getShape(state);
    }

    @Override
    @SuppressWarnings("deprecation")
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return getShape(state);
    }

    public VoxelShape getShape(BlockState state) {
        VoxelShape toReturn;
        if(state.get(AXIS) == Direction.Axis.X) {
            if(state.get(MOSSY)) {
                return X_MOSSY;
            }
            return X;
        }
        if(state.get(AXIS) == Direction.Axis.Z) {
            if(state.get(MOSSY)) {
                return Z_MOSSY;
            }
            return Z;
        }
        if(state.get(MOSSY)) {
            return Y_MOSSY;
        }
        return Y;
    }

    @Override
    @SuppressWarnings("deprecation")
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        ItemStack playerItem = player.getStackInHand(hand);
        boolean finished = false;
        Block toPlace = Blocks.AIR;
        if(state.isOf(this)) {
            if(playerItem.getItem() == Items.MOSS_CARPET) {
                if(!state.get(MOSSY)) {
                    //All
                    world.setBlockState(pos, state.with(AXIS, state.get(AXIS)).with(MOSSY, true)
                            .with(WATERLOGGED, state.get(WATERLOGGED)));
                    world.playSound(player, player.getX(), player.getY(), player.getZ(),
                            SoundEvents.BLOCK_MOSS_CARPET_PLACE, SoundCategory.NEUTRAL, 1.0f, 1.0f);
                    if(!player.isCreative()) {
                        playerItem.decrement(1);
                    }
                    finished = true;
                }
            }
            else if(playerItem.getItem() == Items.SHEARS) {
                if(state.get(MOSSY)) {
                    //All
                    world.setBlockState(pos, state.with(AXIS, state.get(AXIS)).with(MOSSY, false)
                            .with(WATERLOGGED, state.get(WATERLOGGED)));
                    world.playSound(player, player.getX(), player.getY(), player.getZ(),
                            SoundEvents.BLOCK_MOSS_CARPET_BREAK, SoundCategory.NEUTRAL, 1.0f, 1.0f);
                    world.addBlockBreakParticles(pos, Blocks.MOSS_CARPET.getDefaultState());
                    dropStack(world, pos, new ItemStack(Items.MOSS_CARPET));
                    playerItem.damage(1, player, (p) -> p.sendToolBreakStatus(hand));
                    finished = true;
                }
            }
            else if(playerItem.getItem() == Items.WOODEN_AXE || playerItem.getItem() == Items.STONE_AXE ||
                    playerItem.getItem() == Items.IRON_AXE || playerItem.getItem() == Items.GOLDEN_AXE ||
                    playerItem.getItem() == Items.DIAMOND_AXE || playerItem.getItem() == Items.NETHERITE_AXE) {
                finished = true;
                /*
                if(state.isOf(ModBlocks.HOLLOW_OAK_LOG)) {
                    toPlace = ModBlocks.STRIPPED_HOLLOW_OAK_LOG;
                }
                else if(state.isOf(ModBlocks.HOLLOW_SPRUCE_LOG)) {
                    toPlace = ModBlocks.STRIPPED_HOLLOW_SPRUCE_LOG;
                }
                else if(state.isOf(ModBlocks.HOLLOW_BIRCH_LOG)) {
                    toPlace = ModBlocks.STRIPPED_HOLLOW_BIRCH_LOG;
                }
                else if(state.isOf(ModBlocks.HOLLOW_ACACIA_LOG)) {
                    toPlace = ModBlocks.STRIPPED_HOLLOW_ACACIA_LOG;
                }
                else if(state.isOf(ModBlocks.HOLLOW_JUNGLE_LOG)) {
                    toPlace = ModBlocks.STRIPPED_HOLLOW_JUNGLE_LOG;
                }
                else if(state.isOf(ModBlocks.HOLLOW_DARK_OAK_LOG)) {
                    toPlace = ModBlocks.STRIPPED_HOLLOW_DARK_OAK_LOG;
                }
                else if(state.isOf(ModBlocks.HOLLOW_CRIMSON_STEM)) {
                    toPlace = ModBlocks.STRIPPED_HOLLOW_CRIMSON_STEM;
                }
                else if(state.isOf(ModBlocks.HOLLOW_WARPED_STEM)) {
                    toPlace = ModBlocks.STRIPPED_HOLLOW_WARPED_STEM;
                }
                else {
                    finished = false;
                }
                if(finished) {
                    world.setBlockState(pos, toPlace.getDefaultState()
                            .with(AXIS, state.get(AXIS)).with(MOSSY, state.get(MOSSY))
                            .with(WATERLOGGED, state.get(WATERLOGGED)));
                    playerItem.damage(1, player, (p) -> p.sendToolBreakStatus(hand));
                    world.playSound(player, player.getX(), player.getY(), player.getZ(),
                            SoundEvents.ITEM_AXE_STRIP, SoundCategory.NEUTRAL, 1.0f, 1.0f);
                */
            }
        }

        if(finished){
            return ActionResult.success(true);
        }

        return super.onUse(state, world, pos, player, hand, hit);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AXIS, MOSSY, WATERLOGGED);
    }

    static {
        AXIS = Properties.AXIS;
        MOSSY = BooleanProperty.of("mossy");
        WATERLOGGED = Properties.WATERLOGGED;
    }
}