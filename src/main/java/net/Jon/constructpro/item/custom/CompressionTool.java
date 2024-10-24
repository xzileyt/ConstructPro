package net.Jon.constructpro.item.custom;

import net.Jon.constructpro.block.ModBlocks;
import net.Jon.constructpro.component.ModDataComponentTypes;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import java.util.List;

public class CompressionTool extends Item {

    public CompressionTool(Properties properties) {
        super(properties);
    }

    // Method to compress stone blocks
    public ItemStack compressItem(ItemStack stack) {
        // Check if the item is a BlockItem and get the block it represents
        if (stack.getItem() instanceof BlockItem blockItem) {
            Block block = blockItem.getBlock();
            if (block == Blocks.STONE) {
                return new ItemStack(ModBlocks.COMPRESSED_STONE.get(), 1);
            } else if (block == Blocks.GRANITE) {
                return new ItemStack(ModBlocks.COMPRESSED_GRANITE.get(), 1);
            } else if (block == Blocks.DIORITE) {
                return new ItemStack(ModBlocks.COMPRESSED_DIORITE.get(), 1);
            } else if (block == Blocks.ANDESITE) {
                return new ItemStack(ModBlocks.COMPRESSED_ANDESITE.get(), 1);
            } else if (block == Blocks.STONE_BRICKS) {
                return new ItemStack(ModBlocks.COMPRESSED_STONE_BRICKS.get(), 1);
            } else if (block == Blocks.SAND) {
                return new ItemStack(ModBlocks.COMPRESSED_SAND.get(), 1);
            } else if (block == Blocks.GRAVEL) {
                return new ItemStack(ModBlocks.COMPRESSED_GRAVEL.get(), 1);
            } else if (block == Blocks.TUFF) {
                return new ItemStack(ModBlocks.COMPRESSED_TUFF.get(), 1);
            } else if (block == Blocks.POLISHED_ANDESITE) {
                return new ItemStack(ModBlocks.COMPRESSED_POLISHED_ANDESITE.get(), 1);
            } else if (block == Blocks.POLISHED_GRANITE) {
                return new ItemStack(ModBlocks.COMPRESSED_POLISHED_GRANITE.get(), 1);
            } else if (block == Blocks.POLISHED_DIORITE) {
                return new ItemStack(ModBlocks.COMPRESSED_POLISHED_DIORITE.get(), 1);
            } else if (block == Blocks.DEEPSLATE) {
                return new ItemStack(ModBlocks.COMPRESSED_DEEPSLATE.get(), 1);
            } else if (block == Blocks.COBBLED_DEEPSLATE) {
                return new ItemStack(ModBlocks.COMPRESSED_COBBLED_DEEPSLATE.get(), 1);
            } else if (block == Blocks.CHISELED_STONE_BRICKS) {
                return new ItemStack(ModBlocks.COMPRESSED_CHISELED_STONE_BRICKS.get(), 1);
            } else if (block == Blocks.DEEPSLATE_BRICKS) {
                return new ItemStack(ModBlocks.COMPRESSED_DEEPSLATE_BRICKS.get(), 1);
            } else if (block == Blocks.CRACKED_DEEPSLATE_BRICKS) {
                return new ItemStack(ModBlocks.COMPRESSED_CRACKED_DEEPSLATE_BRICKS.get(), 1);
            } else if (block == Blocks.POLISHED_DEEPSLATE) {
                return new ItemStack(ModBlocks.COMPRESSED_POLISHED_DEEPSLATE.get(), 1);
            } else if (block == Blocks.CRACKED_DEEPSLATE_TILES) {
                return new ItemStack(ModBlocks.COMPRESSED_CRACKED_DEEPSLATE_TILES.get(), 1);
            } else if (block == Blocks.MOSSY_STONE_BRICKS) {
                return new ItemStack(ModBlocks.COMPRESSED_MOSSY_STONE_BRICKS.get(), 1);
            } else if (block == Blocks.COBBLESTONE) {
                return new ItemStack(ModBlocks.COMPRESSED_COBBLESTONE.get(), 1);
            } else if (block == Blocks.POLISHED_TUFF) {
                return new ItemStack(ModBlocks.COMPRESSED_POLISHED_TUFF.get(), 1);
            } else if (block == Blocks.MUD) {
                return new ItemStack(ModBlocks.COMPRESSED_MUD.get(), 1);
            } else if (block == Blocks.MOSS_BLOCK) {
                return new ItemStack(ModBlocks.COMPRESSED_MOSS_BLOCK.get(), 1);
            } else if (block == Blocks.TERRACOTTA) {
                return new ItemStack(ModBlocks.COMPRESSED_TERRACOTTA.get(), 1);
            } else if (block == Blocks.MUD_BRICKS) {
                return new ItemStack(ModBlocks.COMPRESSED_MUD_BRICKS.get(), 1);
            } else if (block == Blocks.MOSSY_COBBLESTONE) {
                return new ItemStack(ModBlocks.COMPRESSED_MOSSY_COBBLESTONE.get(), 1);
            }
            return stack; // Return the original stack if it can't be compressed
        }
        return stack;
    }

    // Method to decompress stone blocks
    public ItemStack decompressItem(ItemStack stack) {
        if (stack.getItem() instanceof BlockItem blockItem) {
            Block block = blockItem.getBlock();

            if (block == ModBlocks.COMPRESSED_STONE.get()) {
                return new ItemStack(Blocks.STONE, 9);
            } else if (block == ModBlocks.COMPRESSED_GRANITE.get()) {
                return new ItemStack(Blocks.GRANITE, 9);
            } else if (block == ModBlocks.COMPRESSED_CHISELED_STONE_BRICKS.get()) {
                return new ItemStack(Blocks.CHISELED_STONE_BRICKS, 9);
            } else if (block == ModBlocks.COMPRESSED_COBBLED_DEEPSLATE.get()) {
                return new ItemStack(Blocks.COBBLED_DEEPSLATE, 9);
            } else if (block == ModBlocks.COMPRESSED_COBBLESTONE.get()) {
                return new ItemStack(Blocks.COBBLESTONE, 9);
            } else if (block == ModBlocks.COMPRESSED_CRACKED_DEEPSLATE_BRICKS.get()) {
                return new ItemStack(Blocks.CRACKED_DEEPSLATE_BRICKS, 9);
            } else if (block == ModBlocks.COMPRESSED_CRACKED_DEEPSLATE_TILES.get()) {
                return new ItemStack(Blocks.CRACKED_DEEPSLATE_TILES, 9);
            } else if (block == ModBlocks.COMPRESSED_DEEPSLATE.get()) {
                return new ItemStack(Blocks.DEEPSLATE, 9);
            } else if (block == ModBlocks.COMPRESSED_DEEPSLATE_BRICKS.get()) {
                return new ItemStack(Blocks.DEEPSLATE_BRICKS, 9);
            } else if (block == ModBlocks.COMPRESSED_DIORITE.get()) {
                return new ItemStack(Blocks.DIORITE, 9);
            } else if (block == ModBlocks.COMPRESSED_GRAVEL.get()) {
                return new ItemStack(Blocks.GRAVEL, 9);
            } else if (block == ModBlocks.COMPRESSED_MOSS_BLOCK.get()) {
                return new ItemStack(Blocks.MOSS_BLOCK, 9);
            } else if (block == ModBlocks.COMPRESSED_MOSSY_COBBLESTONE.get()) {
                return new ItemStack(Blocks.MOSSY_COBBLESTONE, 9);
            } else if (block == ModBlocks.COMPRESSED_MOSSY_STONE_BRICKS.get()) {
                return new ItemStack(Blocks.MOSSY_STONE_BRICKS, 9);
            } else if (block == ModBlocks.COMPRESSED_MUD.get()) {
                return new ItemStack(Blocks.MUD, 9);
            } else if (block == ModBlocks.COMPRESSED_MUD_BRICKS.get()) {
                return new ItemStack(Blocks.MUD_BRICKS, 9);
            } else if (block == ModBlocks.COMPRESSED_POLISHED_ANDESITE.get()) {
                return new ItemStack(Blocks.POLISHED_ANDESITE, 9);
            } else if (block == ModBlocks.COMPRESSED_POLISHED_DEEPSLATE.get()) {
                return new ItemStack(Blocks.POLISHED_DEEPSLATE, 9);
            } else if (block == ModBlocks.COMPRESSED_POLISHED_DIORITE.get()) {
                return new ItemStack(Blocks.POLISHED_DIORITE, 9);
            } else if (block == ModBlocks.COMPRESSED_POLISHED_GRANITE.get()) {
                return new ItemStack(Blocks.POLISHED_GRANITE, 9);
            } else if (block == ModBlocks.COMPRESSED_POLISHED_TUFF.get()) {
                return new ItemStack(Blocks.POLISHED_TUFF, 9);
            } else if (block == ModBlocks.COMPRESSED_SAND.get()) {
                return new ItemStack(Blocks.SAND, 9);
            } else if (block == ModBlocks.COMPRESSED_STONE.get()) {
                return new ItemStack(Blocks.STONE, 9);
            } else if (block == ModBlocks.COMPRESSED_STONE_BRICKS.get()) {
                return new ItemStack(Blocks.STONE_BRICKS, 9);
            } else if (block == ModBlocks.COMPRESSED_TERRACOTTA.get()) {
                return new ItemStack(Blocks.TERRACOTTA, 9);
            } else if (block == ModBlocks.COMPRESSED_TUFF.get()) {
                return new ItemStack(Blocks.TUFF, 9);
            }
        }
        return stack;
    }

    // Step 1: Method to handle using the tool (right-click interaction)
    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack itemStack = player.getItemInHand(hand);
        ItemStack heldItem = player.getMainHandItem();

        // Check if the player is holding a BlockItem and compress it
        if (heldItem.getItem() instanceof BlockItem) {
            ItemStack compressedItem = compressItem(heldItem);
            if (!compressedItem.equals(heldItem)) {
                // Remove one block from the stack and give the compressed item
                heldItem.shrink(1);
                if (!player.addItem(compressedItem)) {
                    player.drop(compressedItem, false);
                }
            }
        }
        return InteractionResultHolder.success(itemStack);
    }

    @Override
    public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
        if (Screen.hasShiftDown()) {
            pTooltipComponents.add(Component.translatable("tooltip.constructpro.compression_tool.shift_down"));
        } else {
            pTooltipComponents.add(Component.translatable("tooltip.constructpro.compression_tool"));
        }

        super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);

    }

}

