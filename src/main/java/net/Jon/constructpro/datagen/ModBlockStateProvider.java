package net.Jon.constructpro.datagen;

import net.Jon.constructpro.ConstructPro;
import net.Jon.constructpro.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, ConstructPro.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.celestial_block);
        blockWithItem(ModBlocks.crimson_quartz_block);
        blockWithItem(ModBlocks.fossilize_amber_block);
        blockWithItem(ModBlocks.raw_mithril_block);
        blockWithItem(ModBlocks.mithril_block);

        blockWithItem(ModBlocks.celestial_ore);
        blockWithItem(ModBlocks.celestial_deepslate_ore);
        blockWithItem(ModBlocks.crimson_quartz_ore);
        blockWithItem(ModBlocks.fossilized_amber_ore);
        blockWithItem(ModBlocks.molten_ore);
        blockWithItem(ModBlocks.starlite_ore);
        blockWithItem(ModBlocks.starlite_deepslate_ore);
        blockWithItem(ModBlocks.mithril_ore);
        blockWithItem(ModBlocks.deepslate_mithril_ore);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}