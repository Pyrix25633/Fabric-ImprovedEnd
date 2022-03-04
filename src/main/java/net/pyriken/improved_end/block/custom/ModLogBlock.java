package net.pyriken.improved_end.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

public class ModLogBlock extends Block {
    public static final EnumProperty<Direction.Axis> AXIS;

    public ModLogBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.getDefaultState().with(AXIS, Direction.Axis.Y));
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(AXIS, ctx.getSide().getAxis());
    }

    @Override
    @SuppressWarnings("deprecation")
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        ItemStack playerItem = player.getStackInHand(hand);
        boolean finished = false;

        if(state.isOf(this)){
            if ((playerItem.getItem() == Items.WOODEN_AXE || playerItem.getItem() == Items.STONE_AXE || playerItem.getItem() == Items.GOLDEN_AXE ||
                    playerItem.getItem() == Items.IRON_AXE || playerItem.getItem() == Items.DIAMOND_AXE || playerItem.getItem() == Items.NETHERITE_AXE)) {
                //Strip Log
                /*if (state.isOf(ModBlocks.DECORATED_OAK_LOG)) {
                    world.setBlockState(pos, ModBlocks.DECORATED_STRIPPED_OAK_LOG.getDefaultState().with(ModLogBlock.AXIS, state.get(ModLogBlock.AXIS)));
                    playerItem.<PlayerEntity>damage(1, player, (p) -> p.sendToolBreakStatus(hand));
                    world.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.ITEM_AXE_STRIP, SoundCategory.NEUTRAL, 1.0f, 1.0f);
                    finished = true;
                }*/
            }
        }
        if(finished){
            return ActionResult.success(true);
        }
        return super.onUse(state, world, pos, player, hand, hit);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(ModLogBlock.AXIS);
    }

    static {
        AXIS = Properties.AXIS;
    }
}