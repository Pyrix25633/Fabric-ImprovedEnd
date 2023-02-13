package net.rupyber_studios.improved_end.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.PillarBlock;
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
import net.rupyber_studios.improved_end.block.ModBlocks;

public class ModLogBlock extends PillarBlock {
    public ModLogBlock(Settings settings) {
        super(settings);
    }

    @Override
    @SuppressWarnings("deprecation")
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        ItemStack playerItem = player.getStackInHand(hand);
        boolean finished = false;

        if(state.isOf(this)) {
            Block toPlace;
            if((playerItem.getItem() == Items.WOODEN_AXE || playerItem.getItem() == Items.STONE_AXE || playerItem.getItem() == Items.GOLDEN_AXE ||
                playerItem.getItem() == Items.IRON_AXE || playerItem.getItem() == Items.DIAMOND_AXE || playerItem.getItem() == Items.NETHERITE_AXE)) {
                //Strip Log
                finished = true;
                if(state.isOf(ModBlocks.DARK_LOG)) { //Dark
                    toPlace = ModBlocks.STRIPPED_DARK_LOG;
                } else if(state.isOf(ModBlocks.DARK_WOOD)) {
                    toPlace = ModBlocks.STRIPPED_DARK_WOOD;
                } else if(state.isOf(ModBlocks.INFUSORIAL_LOG)) { //Infusorial
                    toPlace = ModBlocks.STRIPPED_INFUSORIAL_LOG;
                } else if(state.isOf(ModBlocks.INFUSORIAL_WOOD)) {
                    toPlace = ModBlocks.STRIPPED_INFUSORIAL_WOOD;
                } else if(state.isOf(ModBlocks.BUDDING_LOG)) { //Budding
                    toPlace = ModBlocks.STRIPPED_BUDDING_LOG;
                } else if(state.isOf(ModBlocks.BUDDING_WOOD)) {
                    toPlace = ModBlocks.STRIPPED_BUDDING_WOOD;
                } else if(state.isOf(ModBlocks.REDLEAF_LOG)) { //Redleaf
                    toPlace = ModBlocks.STRIPPED_REDLEAF_LOG;
                } else if(state.isOf(ModBlocks.REDLEAF_WOOD)) {
                    toPlace = ModBlocks.STRIPPED_REDLEAF_WOOD;
                } else if(state.isOf(ModBlocks.FIRE_LOG)) { //Fire
                    toPlace = ModBlocks.STRIPPED_FIRE_LOG;
                } else if(state.isOf(ModBlocks.FIRE_WOOD)) {
                    toPlace = ModBlocks.STRIPPED_FIRE_WOOD;
                } else if(state.isOf(ModBlocks.SHINING_LOG)) { //Shining
                    toPlace = ModBlocks.STRIPPED_SHINING_LOG;
                } else if(state.isOf(ModBlocks.SHINING_WOOD)) {
                    toPlace = ModBlocks.STRIPPED_SHINING_WOOD;
                } else if(state.isOf(ModBlocks.SERENE_LOG)) { //Serene
                    toPlace = ModBlocks.STRIPPED_SERENE_LOG;
                } else if(state.isOf(ModBlocks.SERENE_WOOD)) {
                    toPlace = ModBlocks.STRIPPED_SERENE_WOOD;
                } else if(state.isOf(ModBlocks.SCAB_LOG)) { //Scab
                    toPlace = ModBlocks.STRIPPED_SCAB_LOG;
                } else if(state.isOf(ModBlocks.SCAB_WOOD)) {
                    toPlace = ModBlocks.STRIPPED_SCAB_WOOD;
                } else if(state.isOf(ModBlocks.INDIGO_LOG)) { //Indigo
                    toPlace = ModBlocks.STRIPPED_INDIGO_LOG;
                } else if(state.isOf(ModBlocks.INDIGO_WOOD)) {
                    toPlace = ModBlocks.STRIPPED_INDIGO_WOOD;
                } else {
                    finished = false;
                    toPlace = Blocks.AIR;
                }
                if(finished) {
                    world.setBlockState(pos, toPlace.getDefaultState().with(ModLogBlock.AXIS, state.get(ModLogBlock.AXIS)));
                    playerItem.damage(1, player, (p) -> p.sendToolBreakStatus(hand));
                    world.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0f, 1.0f);
                }
            }
        }
        if(finished) {
            return ActionResult.success(true);
        }
        return super.onUse(state, world, pos, player, hand, hit);
    }
}