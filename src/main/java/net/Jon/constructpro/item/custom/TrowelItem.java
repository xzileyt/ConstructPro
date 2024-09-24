package net.Jon.constructpro.item.custom; // Updated package name

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TrowelItem extends Item {

    private final Random random = new Random();

    public TrowelItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();
        BlockPos pos = context.getClickedPos();

        // Check if we're on the server side and if the player exists
        if (!level.isClientSide && context.getPlayer() instanceof ServerPlayer player) {
            // Fetch the block to place (randomly selected from hotbar)
            Block blockToPlace = getRandomBlockFromHotbar(player);

            if (blockToPlace != null && blockToPlace != Blocks.AIR) {
                BlockState state = blockToPlace.defaultBlockState();
                BlockPos placePos = pos.relative(context.getClickedFace());

                // Ensure the position is replaceable
                if (level.getBlockState(placePos).canBeReplaced()) {
                    // Set the block at the clicked position
                    level.setBlock(placePos, state, 3);
                    return InteractionResult.SUCCESS;
                }
            }
        }

        return InteractionResult.PASS; // Pass interaction if nothing happens
    }

    // Helper function to get a random block from the player's hotbar
    private Block getRandomBlockFromHotbar(ServerPlayer player) {
        List<Block> validBlocks = new ArrayList<>();

        // Loop through the hotbar (first 9 slots of inventory)
        for (int i = 0; i < 9; i++) {
            var itemStack = player.getInventory().getItem(i); // Hotbar slots

            // Check if the item is a block (BlockItem)
            if (!itemStack.isEmpty() && itemStack.getItem() instanceof BlockItem blockItem) {
                validBlocks.add(blockItem.getBlock());
            }
        }

        // Randomly select a block from the valid ones
        if (!validBlocks.isEmpty()) {
            return validBlocks.get(random.nextInt(validBlocks.size()));
        }

        return Blocks.AIR; // Fallback to AIR if no valid blocks found
    }

    @Override
    public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
        if (Screen.hasShiftDown()) {
            pTooltipComponents.add(Component.translatable("tooltip.constructpro.Trowel.shift_down"));
        } else {
            pTooltipComponents.add(Component.translatable("tooltip.constructpro.GeoAnalyzer"));
        }

        super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);

    }
}
