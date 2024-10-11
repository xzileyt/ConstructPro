package net.Jon.constructpro.event;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.HashMap;
import java.util.Map;

import static net.Jon.constructpro.block.ModBlocks.HEIGHT_MARKER; // Import your HeightMarker block

@Mod.EventBusSubscriber
public class BlockEventHandler {

    private static final Map<ServerPlayer, Long> lastInteractionTimes = new HashMap<>();
    private static final long COOLDOWN_TIME_MS = 1000; // 1 second cooldown

    @SubscribeEvent
    public static void onBlockInteract(PlayerInteractEvent.RightClickBlock event) {
        if (!event.getLevel().isClientSide()) {
            ServerPlayer player = (ServerPlayer) event.getEntity();
            BlockHitResult hit = event.getHitVec();
            BlockPos pos = hit.getBlockPos();

            // Check cooldown
            long currentTime = System.currentTimeMillis();
            if (lastInteractionTimes.containsKey(player) &&
                    currentTime - lastInteractionTimes.get(player) < COOLDOWN_TIME_MS) {
                return; // Exit if the player is within the cooldown period
            }

            // Update the last interaction time
            lastInteractionTimes.put(player, currentTime);

            // Check if the clicked block is your HeightMarker block
            BlockState blockState = event.getLevel().getBlockState(pos);
            if (blockState.getBlock() == HEIGHT_MARKER.get()) {
                int height = pos.below().getY(); // Get the height of the block below
                player.sendSystemMessage(Component.literal("Height of the block below: " + height));
                event.setCancellationResult(InteractionResult.SUCCESS); // Set result to success
                event.setCanceled(true); // Cancel the event if you don't want the default behavior
            }
        }
    }
}
