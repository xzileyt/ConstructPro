package net.Jon.constructpro.item.custom;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

import java.util.ArrayList;
import java.util.List;

public class ItemLandSmoother extends Item {

    public ItemLandSmoother(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level world = context.getLevel();
        Player player = context.getPlayer();
        BlockPos pos = context.getClickedPos();
        int radius = 5; // Adjusted radius for smoothing

        if (!world.isClientSide) {
            System.out.println("Smoothing terrain..."); // Debug logging
            smoothTerrain(world, pos, radius);
        }
        return InteractionResult.SUCCESS;
    }

    public void smoothTerrain(Level world, BlockPos start, int radius) {
        List<BlockPos> affectedBlocks = new ArrayList<>();
        int totalHeight = 0;
        int count = 0;

        // Collect heights and positions of blocks in the specified radius
        for (int x = -radius; x <= radius; x++) {
            for (int z = -radius; z <= radius; z++) {
                BlockPos pos = start.offset(x, 0, z);
                BlockState state = world.getBlockState(pos);

                // Only consider valid blocks for smoothing (grass or dirt)
                if (state.is(Blocks.GRASS_BLOCK) || state.is(Blocks.DIRT)) {
                    affectedBlocks.add(pos);
                    totalHeight += pos.getY(); // Use the Y-coordinate
                    count++;
                }
            }
        }

        // Avoid division by zero if no blocks are found
        if (count == 0) {
            return;
        }

        // Calculate the average height of the collected blocks
        int averageHeight = totalHeight / count;

        // Update the blocks to create a slope
        for (BlockPos pos : affectedBlocks) {
            int distance = Math.max(Math.abs(pos.getX() - start.getX()), Math.abs(pos.getZ() - start.getZ()));
            // Calculate target height based on the average height and distance
            int targetHeight = averageHeight - (distance / 2);

            // Replace the block if it's below the target height
            if (pos.getY() < targetHeight) {
                BlockState newBlockState = targetHeight > averageHeight ? Blocks.GRASS_BLOCK.defaultBlockState() : Blocks.DIRT.defaultBlockState();
                world.setBlock(pos, newBlockState, 3); // Replace with the desired block
            }
        }
    }

    @Override
    public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
        if (Screen.hasShiftDown()) {
            pTooltipComponents.add(Component.translatable("tooltip.constructpro.itemLandSmoother.shift_down"));
        } else {
            pTooltipComponents.add(Component.translatable("tooltip.constructpro.itemLandSmoother"));
        }

        super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);

    }
}
