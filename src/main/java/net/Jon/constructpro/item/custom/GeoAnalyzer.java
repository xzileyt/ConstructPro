package net.Jon.constructpro.item.custom;

import net.Jon.constructpro.block.ModBlocks;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.core.BlockPos;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeoAnalyzer extends Item {

    public GeoAnalyzer(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
        if (!world.isClientSide) {
            BlockPos playerPos = player.blockPosition();
            String foundOres = analyzeOres(world, playerPos);
            player.sendSystemMessage(Component.translatable("Ore Analysis Complete! Found ores: " + foundOres));
        }
        return InteractionResultHolder.success(player.getItemInHand(hand));
    }

    private String analyzeOres(Level world, BlockPos pos) {
        int radius = 10; // Example radius
        Map<String, Integer> oreCounts = new HashMap<>();

        for (int x = -radius; x <= radius; x++) {
            for (int y = -radius; y <= radius; y++) {
                for (int z = -radius; z <= radius; z++) {
                    BlockPos currentPos = pos.offset(x, y, z);
                    Block block = world.getBlockState(currentPos).getBlock();
                    if (isOre(block)) {
                        String blockName = block.getDescriptionId();
                        oreCounts.put(blockName, oreCounts.getOrDefault(blockName, 0) + 1);
                    }
                }
            }
        }

        // Convert oreCounts to a readable string
        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, Integer> entry : oreCounts.entrySet()) {
            result.append(entry.getKey()).append(": ").append(entry.getValue()).append(", ");
        }

        // Remove trailing comma and space
        if (!result.isEmpty()) {
            result.setLength(result.length() - 2);
        }

        return result.toString(); // Return the found ores as a string
    }

    private boolean isOre(Block block) {
        return block == Blocks.DIAMOND_ORE ||
                block == Blocks.IRON_ORE ||
                block == Blocks.GOLD_ORE ||
                block == Blocks.REDSTONE_ORE ||
                block == Blocks.LAPIS_ORE ||
                block == Blocks.EMERALD_ORE ||
                block == ModBlocks.celestial_ore.get() ||
                block == ModBlocks.celestial_deepslate_ore.get() ||
                block == ModBlocks.starlite_ore.get() ||
                block == ModBlocks.starlite_deepslate_ore.get() ||
                block == ModBlocks.molten_ore.get() ||
                block == ModBlocks.celestial_ore.get() ||
                block == ModBlocks.fossilized_amber_ore.get() ||
                block == ModBlocks.crimson_quartz_ore.get();
    }

    @Override
    public String getDescriptionId(ItemStack stack) {
        return "item.constructpro.geoanalyzer"; // Use localization key
    }

    @Override
    public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
        if (Screen.hasShiftDown()) {
            pTooltipComponents.add(Component.translatable("tooltip.constructpro.geoanalyzer.shift_down"));
        } else {
            pTooltipComponents.add(Component.translatable("tooltip.constructpro.geoanalyzer"));
        }

        super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);

    }
}
