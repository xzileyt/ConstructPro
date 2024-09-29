package net.Jon.constructpro.item;

import net.Jon.constructpro.block.ModBlocks;
import net.Jon.constructpro.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModToolTiers {
    public static final Tier CELESTIAL = new ForgeTier(1400, 4, 3f, 20,
            ModTags.Blocks.NEEDS_CELESTIAL_TOOL, () -> Ingredient.of(ModItems.CELESTIAL.get()),
            ModTags.Blocks.INCORRECT_FOR_CELESTIAL_TOOL);

    public static final Tier Molten = new ForgeTier(2000, 5, 4f, 15,
            ModTags.Blocks.NEEDS_MOLTEN_TOOL, () -> Ingredient.of(ModItems.Molten.get()),
            ModTags.Blocks.INCORRECT_FOR_MOLTEN_TOOL);
}