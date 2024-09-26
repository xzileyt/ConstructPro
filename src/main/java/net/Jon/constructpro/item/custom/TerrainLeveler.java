package net.Jon.constructpro.item.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.network.chat.Component;

public class TerrainLeveler extends Item {

    private int mode = 0; // Default mode (0 = 5x5, 1 = 7x7, 2 = 9x9, 3 = 11x11)
    private final int[] radii = {2, 3, 4, 5}; // Radius values for 5x5, 7x7, 9x9, 11x11

    public TerrainLeveler(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level world = context.getLevel();
        if (!world.isClientSide && world instanceof ServerLevel) {
            BlockPos pos = context.getClickedPos();
            Player player = context.getPlayer();

            if (player != null) {
                // Level terrain within the current radius mode
                levelTerrain((ServerLevel) world, pos, radii[mode]);
                player.getCooldowns().addCooldown(this, 100); // Cooldown of 5 seconds
                player.displayClientMessage(Component.literal("Using " + getCurrentModeText() + " Mode"), true);
                return InteractionResult.SUCCESS;
            }
        }
        return InteractionResult.FAIL;
    }

    private void levelTerrain(ServerLevel world, BlockPos center, int radius) {
        int targetY = center.getY(); // Level to the clicked block's Y level

        for (int x = -radius; x <= radius; x++) {
            for (int z = -radius; z <= radius; z++) {
                BlockPos blockPos = center.offset(x, 0, z);
                BlockPos newPos = new BlockPos(blockPos.getX(), targetY, blockPos.getZ());

                // Replace the block with dirt to flatten the terrain
                world.setBlock(newPos, Blocks.DIRT.defaultBlockState(), 3);
            }
        }
    }

    // Right-click in air to switch modes
    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
        if (!world.isClientSide) {
            switchMode(player);
        }
        return super.use(world, player, hand);
    }

    private void switchMode(Player player) {
        mode = (mode + 1) % radii.length; // Cycle through 4 modes (5x5, 7x7, 9x9, 11x11)
        player.displayClientMessage(Component.literal("Switched to " + getCurrentModeText() + " Mode"), true);
    }

    private String getCurrentModeText() {
        return switch (mode) {
            case 0 -> "5x5";
            case 1 -> "7x7";
            case 2 -> "9x9";
            case 3 -> "11x11";
            default -> "5x5";
        };
    }
}
