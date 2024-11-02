package net.Jon.constructpro.item.custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item.Properties;

import java.util.List;

public class PatternStencil extends Item {
    public PatternStencil(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        Player player = context.getPlayer();
        if (player != null && !context.getLevel().isClientSide) {
            BlockPos pos = context.getClickedPos();
            BlockState clickedState = context.getLevel().getBlockState(pos);

            // Here you need to determine the chiseled version of the block.
            BlockState chiseledState = getChiseledBlock(clickedState);
            if (chiseledState != null) {
                // Set the new block state
                context.getLevel().setBlock(pos, chiseledState, 3);
                // Reduce item stack
                ItemStack itemStack = context.getItemInHand();
                itemStack.shrink(1);
                return InteractionResult.SUCCESS;
            }
        }
        return InteractionResult.FAIL;
    }

    private BlockState getChiseledBlock(BlockState state) {

        if (state.is(Blocks.QUARTZ_BLOCK)) {
            return Blocks.CHISELED_QUARTZ_BLOCK.defaultBlockState();
        } else if (state.is(Blocks.POLISHED_BLACKSTONE)) {
            return Blocks.CHISELED_POLISHED_BLACKSTONE.defaultBlockState();
        } else if (state.is(Blocks.SANDSTONE)) {
            return Blocks.CHISELED_SANDSTONE.defaultBlockState();
        } else if (state.is(Blocks.COPPER_BLOCK)) {
            return Blocks.CHISELED_COPPER.defaultBlockState();
        } else if (state.is(Blocks.DEEPSLATE)) {
            return Blocks.CHISELED_DEEPSLATE.defaultBlockState();
        } else if (state.is(Blocks.NETHER_BRICKS)) {
            return Blocks.CHISELED_NETHER_BRICKS.defaultBlockState();
        } else if (state.is(Blocks.POLISHED_BLACKSTONE)) {
            return Blocks.CHISELED_POLISHED_BLACKSTONE.defaultBlockState();
        } else if (state.is(Blocks.SMOOTH_RED_SANDSTONE)) {
            return Blocks.CHISELED_RED_SANDSTONE.defaultBlockState();
        } else if (state.is(Blocks.SMOOTH_SANDSTONE)) {
            return Blocks.CHISELED_SANDSTONE.defaultBlockState();
        } else if (state.is(Blocks.STONE_BRICKS)) {
            return Blocks.CHISELED_STONE_BRICKS.defaultBlockState();
        } else if (state.is(Blocks.TUFF)) {
            return Blocks.CHISELED_TUFF.defaultBlockState();
        } else if (state.is(Blocks.TUFF_BRICKS)) {
            return Blocks.CHISELED_TUFF_BRICKS.defaultBlockState();
        } 

        return null; // Return null if no chiseled version is found
    }
}
