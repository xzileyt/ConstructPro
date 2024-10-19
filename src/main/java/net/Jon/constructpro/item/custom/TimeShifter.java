package net.Jon.constructpro.item.custom;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.Jon.constructpro.sound.ModSounds;

import java.util.List;

public class TimeShifter extends Item {

    private boolean forward = true;  // Keeps track of whether we're shifting forward or backward
    private final int timeShiftAmount;

    public TimeShifter(Properties properties, int timeShiftAmount) {
        super(properties);
        this.timeShiftAmount = timeShiftAmount;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
        if (!world.isClientSide) {
            ItemStack stack = player.getItemInHand(hand);

            if (player.isShiftKeyDown()) {
                // Toggle between forward and backward mode when shift+right-click is pressed
                forward = !forward;
                player.displayClientMessage(
                        Component.literal("Time Shift Mode: " + (forward ? "Forward" : "Backward")), true);
                player.playSound(ModSounds.TIME_SHIFTER_SOUND.get(), 1.0F, 1.0F);
            } else {
                // Shift time forward or backward
                long currentTime = world.getDayTime();
                long shiftAmount = forward ? timeShiftAmount : -timeShiftAmount;
                long newTime = (currentTime + shiftAmount) % 24000;

                // Prevent time from going negative
                if (newTime < 0) {
                    newTime += 24000;
                }

                // Update the world time
                ((ServerLevel) world).setDayTime(newTime);

                // Play sound to confirm the time change
                player.playSound(ModSounds.TIME_SHIFTER_SOUND.get(), 1.0F, 1.0F);
            }
        }
        return InteractionResultHolder.success(player.getItemInHand(hand));
    }

    @Override
    public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
        if (Screen.hasShiftDown()) {
            pTooltipComponents.add(Component.translatable("tooltip.constructpro.time_shifter.shift_down"));
        } else {
            pTooltipComponents.add(Component.translatable("tooltip.constructpro.time_shifter"));
        }

        super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);

    }
}
