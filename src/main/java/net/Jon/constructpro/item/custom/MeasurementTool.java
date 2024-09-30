package net.Jon.constructpro.item.custom;

import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3; // Ensure Vec3 is imported correctly

public class MeasurementTool extends Item {
    private BlockPos firstPos = null;

    public MeasurementTool(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
        ItemStack itemStack = player.getItemInHand(hand); // Get the ItemStack in hand

        if (!world.isClientSide) {
            BlockPos lookingAt = getLookingAt(player);

            if (lookingAt != null) {
                if (firstPos == null) {
                    firstPos = lookingAt;
                    player.sendSystemMessage(Component.literal("First position set: " + firstPos.toShortString()));
                } else {
                    double distance = Math.sqrt(firstPos.distSqr(lookingAt));
                    player.sendSystemMessage(Component.literal("Distance: " + Math.round(distance) + " blocks"));

                    Vec3 direction = player.getViewVector(1.0F); // Use Vec3
                    Vec3 blockDirection = new Vec3(
                            lookingAt.getX() - firstPos.getX(),
                            lookingAt.getY() - firstPos.getY(),
                            lookingAt.getZ() - firstPos.getZ()
                    );
                    double angle = Math.acos(direction.dot(blockDirection) / (direction.length() * blockDirection.length()));
                    player.sendSystemMessage(Component.literal("Angle: " + Math.toDegrees(angle) + " degrees"));

                    firstPos = null; // Reset after measuring
                }
            }
        }

        return InteractionResultHolder.success(itemStack); // Return the InteractionResultHolder with the itemStack
    }

    private BlockPos getLookingAt(Player player) {
        // Define a ray trace distance
        double distance = 5.0; // Adjust as needed
        Vec3 eyePosition = player.getEyePosition(1.0F);
        Vec3 lookDirection = player.getViewVector(1.0F);

        // Calculate the target position using floating-point coordinates
        Vec3 targetPosition = eyePosition.add(lookDirection.x * distance, lookDirection.y * distance, lookDirection.z * distance);

        // Convert to BlockPos using floor to ensure integer coordinates
        BlockPos targetBlockPos = new BlockPos((int) Math.floor(targetPosition.x), (int) Math.floor(targetPosition.y), (int) Math.floor(targetPosition.z));

        // Use getCommandSenderWorld() to access the Level
        if (!player.getCommandSenderWorld().getBlockState(targetBlockPos).isAir()) {
            return targetBlockPos;
        } else {
            return null; // No valid block found
        }
    }
}
