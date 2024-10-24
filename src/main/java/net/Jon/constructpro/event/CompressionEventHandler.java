package net.Jon.constructpro.event;

import net.Jon.constructpro.block.ModBlocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.event.level.BlockEvent;

import java.util.HashMap;
import java.util.Map;

@Mod.EventBusSubscriber
public class CompressionEventHandler {

    public static final Map<Block, Block> blockCompressionMap = new HashMap<>();

    // This method should be called after all blocks have been registered
    public static void initializeBlockCompressionMap() {
        System.out.println("Initializing block compression map...");

        blockCompressionMap.put(Blocks.ANDESITE, ModBlocks.COMPRESSED_ANDESITE.get());
        blockCompressionMap.put(Blocks.CHISELED_STONE_BRICKS, ModBlocks.COMPRESSED_CHISELED_STONE_BRICKS.get());
        blockCompressionMap.put(Blocks.COBBLED_DEEPSLATE, ModBlocks.COMPRESSED_COBBLED_DEEPSLATE.get());
        blockCompressionMap.put(Blocks.COBBLESTONE, ModBlocks.COMPRESSED_COBBLESTONE.get());
        blockCompressionMap.put(Blocks.CRACKED_DEEPSLATE_BRICKS, ModBlocks.COMPRESSED_CRACKED_DEEPSLATE_BRICKS.get());
        blockCompressionMap.put(Blocks.CRACKED_DEEPSLATE_TILES, ModBlocks.COMPRESSED_CRACKED_DEEPSLATE_TILES.get());
        blockCompressionMap.put(Blocks.DEEPSLATE, ModBlocks.COMPRESSED_DEEPSLATE.get());
        blockCompressionMap.put(Blocks.DEEPSLATE_BRICKS, ModBlocks.COMPRESSED_DEEPSLATE_BRICKS.get());
        blockCompressionMap.put(Blocks.DIORITE, ModBlocks.COMPRESSED_DIORITE.get());
        blockCompressionMap.put(Blocks.GRANITE, ModBlocks.COMPRESSED_GRANITE.get());
        blockCompressionMap.put(Blocks.GRAVEL, ModBlocks.COMPRESSED_GRAVEL.get());
        blockCompressionMap.put(Blocks.MOSS_BLOCK, ModBlocks.COMPRESSED_MOSS_BLOCK.get());
        blockCompressionMap.put(Blocks.MOSSY_COBBLESTONE, ModBlocks.COMPRESSED_MOSSY_COBBLESTONE.get());
        blockCompressionMap.put(Blocks.MOSSY_STONE_BRICKS, ModBlocks.COMPRESSED_MOSSY_STONE_BRICKS.get());
        blockCompressionMap.put(Blocks.MUD, ModBlocks.COMPRESSED_MUD.get());
        blockCompressionMap.put(Blocks.MUD_BRICKS, ModBlocks.COMPRESSED_MUD_BRICKS.get());
        blockCompressionMap.put(Blocks.POLISHED_ANDESITE, ModBlocks.COMPRESSED_POLISHED_ANDESITE.get());
        blockCompressionMap.put(Blocks.POLISHED_DEEPSLATE, ModBlocks.COMPRESSED_POLISHED_DEEPSLATE.get());
        blockCompressionMap.put(Blocks.POLISHED_DIORITE, ModBlocks.COMPRESSED_POLISHED_DIORITE.get());
        blockCompressionMap.put(Blocks.POLISHED_GRANITE, ModBlocks.COMPRESSED_POLISHED_GRANITE.get());
        blockCompressionMap.put(Blocks.POLISHED_TUFF, ModBlocks.COMPRESSED_POLISHED_TUFF.get());
        blockCompressionMap.put(Blocks.SAND, ModBlocks.COMPRESSED_SAND.get());
        blockCompressionMap.put(Blocks.STONE, ModBlocks.COMPRESSED_STONE.get());
        blockCompressionMap.put(Blocks.STONE_BRICKS, ModBlocks.COMPRESSED_STONE_BRICKS.get());
        blockCompressionMap.put(Blocks.TERRACOTTA, ModBlocks.COMPRESSED_TERRACOTTA.get());
        blockCompressionMap.put(Blocks.TUFF, ModBlocks.COMPRESSED_TUFF.get());
    }

    @SubscribeEvent
    public static void onBlockEvent(BlockEvent event) {
        // Handle your block events here
    }
}
