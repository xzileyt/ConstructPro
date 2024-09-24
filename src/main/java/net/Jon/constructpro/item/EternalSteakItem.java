// File: EternalSteakItem.java
package net.Jon.constructpro.item;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;

import java.util.List;

public class EternalSteakItem extends Item {

    public EternalSteakItem(Properties properties) {
        super(properties
                .stacksTo(1) // Limit to one per stack
                .food(new FoodProperties.Builder()
                        .nutrition(8) // Same as regular steak
                        .saturationModifier(0.8F) // Correct method name
                        .build()));
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level world, LivingEntity entity) {
        entity.eat(world, stack);
        return stack; // Return the same stack without consuming
    }

    @Override
    public UseAnim getUseAnimation(ItemStack stack) {
        return UseAnim.EAT;
    }

    @Override
    public boolean isFoil(ItemStack stack) {
        return true; // Makes it glow like enchanted items
    }

    @Override
    public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
        if (Screen.hasShiftDown()) {
            pTooltipComponents.add(Component.translatable("tooltip.constructpro.EternalSteak.shift_down"));
        } else {
            pTooltipComponents.add(Component.translatable("tooltip.constructpro.GeoAnalyzer"));
        }

        super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);

    }
}
