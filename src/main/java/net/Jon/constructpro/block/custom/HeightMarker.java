package net.Jon.constructpro.block.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraftforge.registries.RegistryObject;

import static net.Jon.constructpro.item.ModItems.ITEMS;
import static net.Jon.constructpro.block.ModBlocks.HEIGHT_MARKER;

public class HeightMarker extends Block {

    public HeightMarker() {
        super(BlockBehaviour.Properties.of()
                .strength(1.5f, 6.0f)
                .sound(SoundType.HEAVY_CORE)
                .requiresCorrectToolForDrops());
    }

    // Ensure this static field is outside the constructor
    public static final RegistryObject<Item> HEIGHT_MARKER_ITEM = ITEMS.register("height_marker",
            () -> new BlockItem(HEIGHT_MARKER.get(), new Item.Properties()));
}