package net.Jon.constructpro.item.custom;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.Component;

import java.util.List;

public class HazardAlertItem extends Item {

    // Cooldown timer in milliseconds
    private long lastDetectionTime = 0;

    // Cooldown period between detections (5 seconds)
    private final long detectionCooldown = 5000;

    public HazardAlertItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if (!level.isClientSide()) {
            // Call the hazard scanning method when the player right-clicks
            scanForHazards((ServerPlayer) player, level, player.blockPosition(), 20);
        }

        // Return success and the item stack in hand
        return new InteractionResultHolder<>(InteractionResult.SUCCESS, player.getItemInHand(hand));
    }

    private void scanForHazards(ServerPlayer player, Level level, BlockPos playerPos, int radius) {
        // Check if the detection cooldown is still active
        if (System.currentTimeMillis() - lastDetectionTime < detectionCooldown) {
            player.sendSystemMessage(Component.literal("Hazard detection on cooldown..."));
            return;
        }

        // Scan blocks around the player within the radius
        boolean hazardFound = false;
        BlockPos lavaPos = null; // Store the position of lava found

        for (int x = -radius; x <= radius; x++) {
            for (int y = -radius; y <= radius; y++) {
                for (int z = -radius; z <= radius; z++) {
                    BlockPos checkPos = playerPos.offset(x, y, z);

                    // Check for lava
                    if (level.getBlockState(checkPos).getBlock() == Blocks.LAVA) {
                        lavaPos = checkPos; // Store the lava position
                        hazardFound = true;
                        break; // Exit loops as we only want the first detection
                    }
                }
                if (hazardFound) break; // Break outer loop if lava is found
            }
            if (hazardFound) break; // Break the outermost loop if lava is found
        }

        // Notify player of detected lava or no hazards found
        if (hazardFound && lavaPos != null) {
            player.sendSystemMessage(Component.literal("Lava detected at: "
                    + lavaPos.getX() + ", "
                    + lavaPos.getY() + ", "
                    + lavaPos.getZ()));
        } else {
            player.sendSystemMessage(Component.literal("No hazards detected nearby."));
        }

        lastDetectionTime = System.currentTimeMillis(); // Update cooldown time
    }

    @Override
    public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
        if (Screen.hasShiftDown()) {
            pTooltipComponents.add(Component.translatable("tooltip.constructpro.hazard_alert.shift_down"));
        } else {
            pTooltipComponents.add(Component.translatable("tooltip.constructpro.hazard_alert"));
        }

        super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);

    }
}
