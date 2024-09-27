package net.Jon.constructpro.util;

import net.Jon.constructpro.ConstructPro;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_CELESTIAL_TOOL = createTag("needs_celestial_tool");
        public static final TagKey<Block> INCORRECT_FOR_CELESTIAL_TOOL = createTag("incorrect_for_celestial_tool");
        public static final TagKey<Block> NEEDS_TIMBER_TOOL = createTag("needs_timber_tool"); // Added
        public static final TagKey<Block> INCORRECT_FOR_TIMBER_TOOL = createTag("incorrect_for_timber_tool"); // Added

        private static TagKey<Block> createTag(String name) {
            // Create a ResourceLocation using tryParse
            return BlockTags.create(ResourceLocation.tryParse(ConstructPro.MOD_ID + ":" + name));
        }
    }

    public static class Items {
        public static final TagKey<Item> TRANSFORMABLE_ITEMS = createTag("transformable_items");
        public static final TagKey<Item> TIMBER_AXE_ITEM = createTag("timber_axes");

        private static TagKey<Item> createTag(String name) {
            // Create a ResourceLocation using tryParse
            return ItemTags.create(ResourceLocation.tryParse(ConstructPro.MOD_ID + ":" + name));
        }
    }
}
