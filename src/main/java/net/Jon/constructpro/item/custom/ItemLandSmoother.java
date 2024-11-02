package net.Jon.constructpro.item.custom;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.Heightmap;

import java.util.List;

public class ItemLandSmoother extends Item {

    public ItemLandSmoother(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level world = context.getLevel();
        BlockPos pos = context.getClickedPos();

        // Level the terrain
        levelTerrain(world, pos);

        return InteractionResult.SUCCESS;
    }

    private void levelTerrain(Level world, BlockPos pos) {
        // Debug: Log the position being processed
        System.out.println("Leveling terrain at: " + pos);

        // Get the current block at the clicked position
        BlockState clickedBlockState = world.getBlockState(pos);

        // Check if the clicked block is solid and not air
        if (clickedBlockState.isAir() || clickedBlockState.getFluidState().isSource()) {
            System.out.println("Clicked block is not solid; aborting.");
            return; // Abort if the clicked block is not solid
        }

        // Check the block directly beneath the clicked position
        BlockState blockBelow = world.getBlockState(pos.below());

        // Only proceed if the block below is dirt or stone
        if (!(blockBelow.is(Blocks.DIRT) || blockBelow.is(Blocks.STONE))) {
            System.out.println("Block below is not dirt or stone; aborting.");
            return; // Abort if the block below is not dirt or stone
        }

        int highestY = pos.getY();

        // Determine the highest Y value within the smoothing radius
        for (int x = -5; x <= 5; x++) {
            for (int z = -5; z <= 5; z++) {
                BlockPos targetPos = pos.offset(x, 0, z);
                BlockState blockState = world.getBlockState(targetPos);
                // Debug: Log block state
                System.out.println("Checking block at: " + targetPos + ", State: " + blockState);

                // Check if the block is solid (not air and not a liquid)
                if (!blockState.isAir() && blockState.getFluidState().isEmpty()) {
                    highestY = Math.max(highestY, targetPos.getY());
                }
            }
        }

        // Debug: Log the highest Y found
        System.out.println("Highest Y found: " + highestY);

        // Replace blocks at the same height or lower than the highestY
        for (int x = -5; x <= 5; x++) {
            for (int z = -5; z <= 5; z++) {
                BlockPos targetPos = pos.offset(x, 0, z);
                BlockState blockState = world.getBlockState(targetPos);
                // Only replace blocks that are below the highest Y found and are not grass
                if (targetPos.getY() <= highestY && blockState.getBlock() != Blocks.GRASS_BLOCK) {
                    // Replace the block with grass or your desired block
                    world.setBlock(targetPos, Blocks.GRASS_BLOCK.defaultBlockState(), 3);
                    // Debug: Log the block replacement
                    System.out.println("Replacing block at: " + targetPos);
                }
            }
        }
    }


    @Override
    public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
        if (Screen.hasShiftDown()) {
            pTooltipComponents.add(Component.translatable("tooltip.constructpro.terrain_smoother.shift_down"));
        } else {
            pTooltipComponents.add(Component.translatable("tooltip.constructpro.terrain_smoother"));
        }

        super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);

    }
}
