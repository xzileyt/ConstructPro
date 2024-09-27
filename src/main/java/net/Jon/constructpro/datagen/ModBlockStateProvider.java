package net.Jon.constructpro.datagen;

import net.Jon.constructpro.ConstructPro;
import net.Jon.constructpro.block.ModBlocks;
import net.Jon.constructpro.block.custom.PurpleLampBlock;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.StairBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, ConstructPro.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        // Ore blocks
        blockWithItem(ModBlocks.celestial_block);
        blockWithItem(ModBlocks.crimson_quartz_block);
        blockWithItem(ModBlocks.fossilize_amber_block);
        blockWithItem(ModBlocks.raw_mithril_block);
        blockWithItem(ModBlocks.mithril_block);

        // Wood
        blockWithItem(ModBlocks.lavenderwood_planks);
        stairsBlock(ModBlocks.LAVENDER_STAIRS.get(), blockTexture(ModBlocks.lavenderwood_planks.get()));
        slabBlock(ModBlocks.LAVENDERWOOD_SLAB.get(), blockTexture(ModBlocks.lavenderwood_planks.get()), blockTexture(ModBlocks.lavenderwood_planks.get()));
        buttonBlock(ModBlocks.LAVENDERWOOD_BUTTON.get(), blockTexture(ModBlocks.lavenderwood_planks.get()));
        pressurePlateBlock(ModBlocks.LAVENDERWOOD_PRESSURE_PLATE.get(), blockTexture(ModBlocks.lavenderwood_planks.get()));
        fenceBlock(ModBlocks.LAVENDERWOOD_FENCE.get(), blockTexture(ModBlocks.lavenderwood_planks.get()));
        fenceGateBlock(ModBlocks.LAVENDERWOOD_FENCE_GATE.get(), blockTexture(ModBlocks.lavenderwood_planks.get()));
        wallBlock(ModBlocks.LAVENDERWOOD_WALL.get(), blockTexture(ModBlocks.lavenderwood_planks.get()));
        doorBlockWithRenderType(ModBlocks.LAVENDERWOOD_DOOR.get(), modLoc("block/lavender_door_bottom"), modLoc("block/lavender_door_top"), "cutout");
        trapdoorBlockWithRenderType(ModBlocks.LAVENDERWOOD_TRAPDOOR.get(), modLoc("block/lavender_trapdoor"), true, "cutout");
        blockItem(ModBlocks.LAVENDER_STAIRS);
        blockItem(ModBlocks.LAVENDERWOOD_SLAB);
        blockItem(ModBlocks.LAVENDERWOOD_PRESSURE_PLATE);
        blockItem(ModBlocks.LAVENDERWOOD_FENCE_GATE);
        blockItem(ModBlocks.LAVENDERWOOD_TRAPDOOR, "_bottom");


        // Wood Logs




        // Building Blocks
        customLamp();
        blockWithItem(ModBlocks.BLACK_TUFF);
        blockWithItem(ModBlocks.BLUE_MUSHROOM_BLOCK);
        blockWithItem(ModBlocks.BROWN_MUSHROOM_BLOCK);
        blockWithItem(ModBlocks.CYAN_MUSHROOM_BLOCK);
        blockWithItem(ModBlocks.GREEN_MUSHROOM_BLOCK);
        blockWithItem(ModBlocks.LIGHT_BLUE_MUSHROOM_BLOCK);
        blockWithItem(ModBlocks.LIME_MUSHROOM_BLOCK);
        blockWithItem(ModBlocks.ORANGE_MUSHROOM_BLOCK);
        blockWithItem(ModBlocks.PINK_MUSHROOM_BLOCK);
        blockWithItem(ModBlocks.PURPLE_MUSHROOM_BLOCK);
        blockWithItem(ModBlocks.YELLOW_MUSHROOM_BLOCK);
        blockWithItem(ModBlocks.COPPER_ANDESITE);
        blockWithItem(ModBlocks.DARK_CALCITE);
        blockWithItem(ModBlocks.GREEN_TUFF);
        blockWithItem(ModBlocks.GREEN_GEM_BLOCK);
        blockWithItem(ModBlocks.ORANGE_GEM_BLOCK);
        blockWithItem(ModBlocks.TEAL_GEM_BLOCK);
        blockWithItem(ModBlocks.RED_GEM_BLOCK);
        blockWithItem(ModBlocks.YELLOW_GEM_BLOCK);
        blockWithItem(ModBlocks.PURPLE_GEM_BLOCK);

        // Ores
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

    private void customLamp() {
        getVariantBuilder(ModBlocks.PURPLE_LAMP.get()).forAllStates(state -> {
            if(state.getValue(PurpleLampBlock.CLICKED)) {
                return new ConfiguredModel[]{new ConfiguredModel(models().cubeAll("purple_lamp_on",
                        ResourceLocation.fromNamespaceAndPath(ConstructPro.MOD_ID, "block/" + "purple_lamp_on")))};
            } else {
                return new ConfiguredModel[]{new ConfiguredModel(models().cubeAll("purple_lamp_off",
                        ResourceLocation.fromNamespaceAndPath(ConstructPro.MOD_ID, "block/" + "purple_lamp_off")))};
            }
        });
        simpleBlockItem(ModBlocks.PURPLE_LAMP.get(), models().cubeAll("purple_lamp_on",
                ResourceLocation.fromNamespaceAndPath(ConstructPro.MOD_ID, "block/" + "purple_lamp_on")));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    private void blockItem(RegistryObject<? extends Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("constructpro:block/" +
                ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockItem(RegistryObject<? extends Block> blockRegistryObject, String appendix) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("constructpro:block/" +
                ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath() + appendix));
    }
}