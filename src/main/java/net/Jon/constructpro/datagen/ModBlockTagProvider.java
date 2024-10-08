package net.Jon.constructpro.datagen;

import net.Jon.constructpro.ConstructPro;
import net.Jon.constructpro.block.ModBlocks;
import net.Jon.constructpro.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, ConstructPro.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.celestial_block.get())
                .add(ModBlocks.crimson_quartz_block.get())
                .add(ModBlocks.fossilize_amber_block.get())
                .add(ModBlocks.crimson_quartz_ore.get())
                .add(ModBlocks.molten_ore.get())
                .add(ModBlocks.starlite_deepslate_ore.get())
                .add(ModBlocks.starlite_ore.get())
                .add(ModBlocks.celestial_ore.get())
                .add(ModBlocks.celestial_deepslate_ore.get())
                .add(ModBlocks.raw_mithril_block.get())
                .add(ModBlocks.mithril_ore.get())
                .add(ModBlocks.deepslate_mithril_ore.get())
                .add(ModBlocks.mithril_block.get());

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.molten_ore.get())
                .add(ModBlocks.mithril_ore.get())
                .add(ModBlocks.deepslate_mithril_ore.get());

        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.crimson_quartz_ore.get())
                .add(ModBlocks.starlite_deepslate_ore.get())
                .add(ModBlocks.starlite_ore.get())
                .add(ModBlocks.celestial_ore.get())
                .add(ModBlocks.celestial_deepslate_ore.get());

        tag(ModTags.Blocks.NEEDS_CELESTIAL_TOOL)
                .add(ModBlocks.starlite_ore.get())
                .add(ModBlocks.starlite_deepslate_ore.get())
                .addTag(BlockTags.NEEDS_IRON_TOOL);

        tag(ModTags.Blocks.INCORRECT_FOR_CELESTIAL_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_IRON_TOOL)
                .remove(ModTags.Blocks.NEEDS_CELESTIAL_TOOL);

        tag(BlockTags.FENCES).add(ModBlocks.LAVENDERWOOD_FENCE.get());
        tag(BlockTags.FENCE_GATES).add(ModBlocks.LAVENDERWOOD_FENCE_GATE.get());
        tag(BlockTags.WALLS).add(ModBlocks.LAVENDERWOOD_WALL.get());

    }
}
