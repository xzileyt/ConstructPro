package net.Jon.constructpro.item.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResult;

public class TerrainFlatteningTool extends Item {

    public TerrainFlatteningTool(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        Player player = context.getPlayer();
        Level level = context.getLevel();
        BlockPos clickedPos = context.getClickedPos();
        ItemStack itemStack = context.getItemInHand();

        if (player != null && !level.isClientSide()) {
            // Message to player


            // Define flattening area radius (e.g., 3x3 area)
            int radius = 2; // Radius of 1 creates a 3x3 area

            // Get the block at the clicked position
            Block targetBlock = level.getBlockState(clickedPos).getBlock();
            int targetY = clickedPos.getY(); // Get the height of the clicked block

            // Loop through the area around the clicked block
            for (int x = -radius; x <= radius; x++) {
                for (int z = -radius; z <= radius; z++) {
                    BlockPos pos = clickedPos.offset(x, 0, z); // Get position in the area

                    // Replace block at this position with the target block at the target Y level
                    BlockPos flattenPos = new BlockPos(pos.getX(), targetY, pos.getZ());
                    level.setBlock(flattenPos, targetBlock.defaultBlockState(), 3); // Set the block to match the clicked block type
                }
            }

            return InteractionResult.SUCCESS;
        }

        return InteractionResult.PASS;
    }
}
