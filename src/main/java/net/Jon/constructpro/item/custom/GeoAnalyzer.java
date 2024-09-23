package net.Jon.constructpro.item.custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.InteractionResultHolder; // Correct import
import net.minecraft.world.InteractionHand; // Correct import
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import java.util.HashMap;
import java.util.Map;

public class GeoAnalyzer extends Item {

    public GeoAnalyzer(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
        if (!world.isClientSide) {
            BlockPos playerPos = player.blockPosition();
            analyzeOres(world, playerPos, player);
        }
        return InteractionResultHolder.success(player.getItemInHand(hand)); // Return the correct InteractionResultHolder
    }

    private void analyzeOres(Level world, BlockPos pos, Player player) {
        int radius = 10; // Example radius
        Map<String, Integer> oreCounts = new HashMap<>();

        for (int x = -radius; x <= radius; x++) {
            for (int y = -radius; y <= radius; y++) {
                for (int z = -radius; z <= radius; z++) {
                    BlockPos currentPos = pos.offset(x, y, z);
                    Block block = world.getBlockState(currentPos).getBlock();
                    if (isOre(block)) {
                        String blockName = block.getDescriptionId(); // Get block name
                        oreCounts.put(blockName, oreCounts.getOrDefault(blockName, 0) + 1);
                    }
                }
            }
        }

        player.sendSystemMessage(Component.translatable("Ore Analysis: " + oreCounts.toString())); // Send message to player
    }

    private boolean isOre(Block block) {
        return block == net.minecraft.world.level.block.Blocks.DIAMOND_ORE ||
                block == net.minecraft.world.level.block.Blocks.IRON_ORE ||
                block == net.minecraft.world.level.block.Blocks.GOLD_ORE ||
                block == net.minecraft.world.level.block.Blocks.REDSTONE_ORE ||
                block == net.minecraft.world.level.block.Blocks.LAPIS_ORE ||
                block == net.minecraft.world.level.block.Blocks.EMERALD_ORE;
    }

    @Override
    public String getDescriptionId(ItemStack stack) {
        return "item.constructpro.geoanalyzer"; // Use localization key
    }
}
