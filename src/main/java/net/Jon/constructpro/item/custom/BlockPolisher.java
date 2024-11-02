package net.Jon.constructpro.item.custom;

import net.Jon.constructpro.block.ModBlocks;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.context.UseOnContext;

import java.util.List;

public class BlockPolisher extends Item {
    public BlockPolisher(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level world = context.getLevel();
        Player player = context.getPlayer();
        BlockPos pos = context.getClickedPos();
        BlockState clickedBlock = world.getBlockState(pos);
        Block clicked = clickedBlock.getBlock();

        // Determine the polished version of the clicked block
        Block polishedBlock = null;
        if (clicked == Blocks.ANDESITE) {
            polishedBlock = Blocks.POLISHED_ANDESITE;
        } else if (clicked == Blocks.DIORITE) {
            polishedBlock = Blocks.POLISHED_DIORITE;
        } else if (clicked == Blocks.GRANITE) {
            polishedBlock = Blocks.POLISHED_GRANITE;
        } else if (clicked == Blocks.DEEPSLATE) {
            polishedBlock = Blocks.POLISHED_DEEPSLATE;
        } else if (clicked == Blocks.BLACKSTONE) {
            polishedBlock = Blocks.POLISHED_BLACKSTONE;
        } else if (clicked == Blocks.POLISHED_BLACKSTONE) {
            polishedBlock = Blocks.POLISHED_BLACKSTONE_BRICKS;
        } else if (clicked == Blocks.QUARTZ_BLOCK) {
            polishedBlock = Blocks.SMOOTH_QUARTZ;
        } else if (clicked == Blocks.BASALT) {
            polishedBlock = Blocks.POLISHED_BASALT;
        } else if (clicked == Blocks.TUFF) {
            polishedBlock = Blocks.POLISHED_TUFF;
        } else if (clicked == ModBlocks.LIMESTONE_ANDESITE.get()) {
            polishedBlock = ModBlocks.LIMESTONE_POLISHED_ANDESITE.get();
        }

        // If a polished block was identified, replace it
        if (polishedBlock != null) {
            world.setBlock(pos, polishedBlock.defaultBlockState(), 3);

            // Decrease the item stack size if not in creative mode
            if (!player.isCreative()) {
                ItemStack stack = context.getItemInHand();
                stack.shrink(1); // Decrease item stack size
            }
            return InteractionResult.SUCCESS;
        }
        return InteractionResult.FAIL;
    }



}
