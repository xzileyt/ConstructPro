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
        blockWithItem(ModBlocks.aetherium_block);
        blockWithItem(ModBlocks.glacialite_block);
        blockWithItem(ModBlocks.necroite_block);
        blockWithItem(ModBlocks.raw_pyroclast_block);
        blockWithItem(ModBlocks.raw_volcanic_block);
        blockWithItem(ModBlocks.solisite_block);
        blockWithItem(ModBlocks.volcanic_block);
        blockWithItem(ModBlocks.pyroclast_block);

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

        blockWithItem(ModBlocks.amberwood_planks);
        stairsBlock(ModBlocks.amberwood_STAIRS.get(), blockTexture(ModBlocks.amberwood_planks.get()));
        slabBlock(ModBlocks.amberwood_SLAB.get(), blockTexture(ModBlocks.amberwood_planks.get()), blockTexture(ModBlocks.amberwood_planks.get()));
        buttonBlock(ModBlocks.amberwood_BUTTON.get(), blockTexture(ModBlocks.amberwood_planks.get()));
        pressurePlateBlock(ModBlocks.amberwood_PRESSURE_PLATE.get(), blockTexture(ModBlocks.amberwood_planks.get()));
        fenceBlock(ModBlocks.amberwood_FENCE.get(), blockTexture(ModBlocks.amberwood_planks.get()));
        fenceGateBlock(ModBlocks.amberwood_FENCE_GATE.get(), blockTexture(ModBlocks.amberwood_planks.get()));
        wallBlock(ModBlocks.amberwood_WALL.get(), blockTexture(ModBlocks.amberwood_planks.get()));
        doorBlockWithRenderType(ModBlocks.amberwood_DOOR.get(), modLoc("block/amberwood_door_bottom"), modLoc("block/amberwood_door_top"), "cutout");
        trapdoorBlockWithRenderType(ModBlocks.amberwood_TRAPDOOR.get(), modLoc("block/amberwood_trapdoor"), true, "cutout");
        blockItem(ModBlocks.amberwood_STAIRS);
        blockItem(ModBlocks.amberwood_SLAB);
        blockItem(ModBlocks.amberwood_PRESSURE_PLATE);
        blockItem(ModBlocks.amberwood_FENCE_GATE);
        blockItem(ModBlocks.amberwood_TRAPDOOR, "_bottom");

        blockWithItem(ModBlocks.ashwood_planks);
        stairsBlock(ModBlocks.ashwood_STAIRS.get(), blockTexture(ModBlocks.ashwood_planks.get()));
        slabBlock(ModBlocks.ashwood_SLAB.get(), blockTexture(ModBlocks.ashwood_planks.get()), blockTexture(ModBlocks.ashwood_planks.get()));
        buttonBlock(ModBlocks.ashwood_BUTTON.get(), blockTexture(ModBlocks.ashwood_planks.get()));
        pressurePlateBlock(ModBlocks.ashwood_PRESSURE_PLATE.get(), blockTexture(ModBlocks.ashwood_planks.get()));
        fenceBlock(ModBlocks.ashwood_FENCE.get(), blockTexture(ModBlocks.ashwood_planks.get()));
        fenceGateBlock(ModBlocks.ashwood_FENCE_GATE.get(), blockTexture(ModBlocks.ashwood_planks.get()));
        wallBlock(ModBlocks.ashwood_WALL.get(), blockTexture(ModBlocks.ashwood_planks.get()));
        doorBlockWithRenderType(ModBlocks.ashwood_DOOR.get(), modLoc("block/ashwood_door_bottom"), modLoc("block/ashwood_door_top"), "cutout");
        trapdoorBlockWithRenderType(ModBlocks.ashwood_TRAPDOOR.get(), modLoc("block/ashwood_trapdoor"), true, "cutout");
        blockItem(ModBlocks.ashwood_STAIRS);
        blockItem(ModBlocks.ashwood_SLAB);
        blockItem(ModBlocks.ashwood_PRESSURE_PLATE);
        blockItem(ModBlocks.ashwood_FENCE_GATE);
        blockItem(ModBlocks.ashwood_TRAPDOOR, "_bottom");

        blockWithItem(ModBlocks.lumenwood_planks);
        stairsBlock(ModBlocks.lumenwood_STAIRS.get(), blockTexture(ModBlocks.lumenwood_planks.get()));
        slabBlock(ModBlocks.lumenwood_SLAB.get(), blockTexture(ModBlocks.lumenwood_planks.get()), blockTexture(ModBlocks.lumenwood_planks.get()));
        buttonBlock(ModBlocks.lumenwood_BUTTON.get(), blockTexture(ModBlocks.lumenwood_planks.get()));
        pressurePlateBlock(ModBlocks.lumenwood_PRESSURE_PLATE.get(), blockTexture(ModBlocks.lumenwood_planks.get()));
        fenceBlock(ModBlocks.lumenwood_FENCE.get(), blockTexture(ModBlocks.lumenwood_planks.get()));
        fenceGateBlock(ModBlocks.lumenwood_FENCE_GATE.get(), blockTexture(ModBlocks.lumenwood_planks.get()));
        wallBlock(ModBlocks.lumenwood_WALL.get(), blockTexture(ModBlocks.lumenwood_planks.get()));
        doorBlockWithRenderType(ModBlocks.lumenwood_DOOR.get(), modLoc("block/lumenwood_door_bottom"), modLoc("block/lumenwood_door_top"), "cutout");
        trapdoorBlockWithRenderType(ModBlocks.lumenwood_TRAPDOOR.get(), modLoc("block/lumenwood_trapdoor"), true, "cutout");
        blockItem(ModBlocks.lumenwood_STAIRS);
        blockItem(ModBlocks.lumenwood_SLAB);
        blockItem(ModBlocks.lumenwood_PRESSURE_PLATE);
        blockItem(ModBlocks.lumenwood_FENCE_GATE);
        blockItem(ModBlocks.lumenwood_TRAPDOOR, "_bottom");

        blockWithItem(ModBlocks.ebonywood_planks);
        stairsBlock(ModBlocks.ebonywood_STAIRS.get(), blockTexture(ModBlocks.ebonywood_planks.get()));
        slabBlock(ModBlocks.ebonywood_SLAB.get(), blockTexture(ModBlocks.ebonywood_planks.get()), blockTexture(ModBlocks.ebonywood_planks.get()));
        buttonBlock(ModBlocks.ebonywood_BUTTON.get(), blockTexture(ModBlocks.ebonywood_planks.get()));
        pressurePlateBlock(ModBlocks.ebonywood_PRESSURE_PLATE.get(), blockTexture(ModBlocks.ebonywood_planks.get()));
        fenceBlock(ModBlocks.ebonywood_FENCE.get(), blockTexture(ModBlocks.ebonywood_planks.get()));
        fenceGateBlock(ModBlocks.ebonywood_FENCE_GATE.get(), blockTexture(ModBlocks.ebonywood_planks.get()));
        wallBlock(ModBlocks.ebonywood_WALL.get(), blockTexture(ModBlocks.ebonywood_planks.get()));
        doorBlockWithRenderType(ModBlocks.ebonywood_DOOR.get(), modLoc("block/ebonywood_door_bottom"), modLoc("block/ebonywood_door_top"), "cutout");
        trapdoorBlockWithRenderType(ModBlocks.ebonywood_TRAPDOOR.get(), modLoc("block/ebonywood_trapdoor"), true, "cutout");
        blockItem(ModBlocks.ebonywood_STAIRS);
        blockItem(ModBlocks.ebonywood_SLAB);
        blockItem(ModBlocks.ebonywood_PRESSURE_PLATE);
        blockItem(ModBlocks.ebonywood_FENCE_GATE);
        blockItem(ModBlocks.ebonywood_TRAPDOOR, "_bottom");

        blockWithItem(ModBlocks.charwood_planks);
        stairsBlock(ModBlocks.charwood_STAIRS.get(), blockTexture(ModBlocks.charwood_planks.get()));
        slabBlock(ModBlocks.charwood_SLAB.get(), blockTexture(ModBlocks.charwood_planks.get()), blockTexture(ModBlocks.charwood_planks.get()));
        buttonBlock(ModBlocks.charwood_BUTTON.get(), blockTexture(ModBlocks.charwood_planks.get()));
        pressurePlateBlock(ModBlocks.charwood_PRESSURE_PLATE.get(), blockTexture(ModBlocks.charwood_planks.get()));
        fenceBlock(ModBlocks.charwood_FENCE.get(), blockTexture(ModBlocks.charwood_planks.get()));
        fenceGateBlock(ModBlocks.charwood_FENCE_GATE.get(), blockTexture(ModBlocks.charwood_planks.get()));
        wallBlock(ModBlocks.charwood_WALL.get(), blockTexture(ModBlocks.charwood_planks.get()));
        doorBlockWithRenderType(ModBlocks.charwood_DOOR.get(), modLoc("block/charwood_door_bottom"), modLoc("block/charwood_door_top"), "cutout");
        trapdoorBlockWithRenderType(ModBlocks.charwood_TRAPDOOR.get(), modLoc("block/charwood_trapdoor"), true, "cutout");
        blockItem(ModBlocks.charwood_STAIRS);
        blockItem(ModBlocks.charwood_SLAB);
        blockItem(ModBlocks.charwood_PRESSURE_PLATE);
        blockItem(ModBlocks.charwood_FENCE_GATE);
        blockItem(ModBlocks.charwood_TRAPDOOR, "_bottom");

        blockWithItem(ModBlocks.moonwood_planks);
        stairsBlock(ModBlocks.moonwood_STAIRS.get(), blockTexture(ModBlocks.moonwood_planks.get()));
        slabBlock(ModBlocks.moonwood_SLAB.get(), blockTexture(ModBlocks.moonwood_planks.get()), blockTexture(ModBlocks.moonwood_planks.get()));
        buttonBlock(ModBlocks.moonwood_BUTTON.get(), blockTexture(ModBlocks.moonwood_planks.get()));
        pressurePlateBlock(ModBlocks.moonwood_PRESSURE_PLATE.get(), blockTexture(ModBlocks.moonwood_planks.get()));
        fenceBlock(ModBlocks.moonwood_FENCE.get(), blockTexture(ModBlocks.moonwood_planks.get()));
        fenceGateBlock(ModBlocks.moonwood_FENCE_GATE.get(), blockTexture(ModBlocks.moonwood_planks.get()));
        wallBlock(ModBlocks.moonwood_WALL.get(), blockTexture(ModBlocks.moonwood_planks.get()));
        doorBlockWithRenderType(ModBlocks.moonwood_DOOR.get(), modLoc("block/moonwood_door_bottom"), modLoc("block/moonwood_door_top"), "cutout");
        trapdoorBlockWithRenderType(ModBlocks.moonwood_TRAPDOOR.get(), modLoc("block/moonwood_trapdoor"), true, "cutout");
        blockItem(ModBlocks.moonwood_STAIRS);
        blockItem(ModBlocks.moonwood_SLAB);
        blockItem(ModBlocks.moonwood_PRESSURE_PLATE);
        blockItem(ModBlocks.moonwood_FENCE_GATE);
        blockItem(ModBlocks.moonwood_TRAPDOOR, "_bottom");

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
        blockWithItem(ModBlocks.BLUE_GLOWSTONE);
        blockWithItem(ModBlocks.GREEN_GLOWSTONE);
        blockWithItem(ModBlocks.CYAN_GLOWSTONE);
        blockWithItem(ModBlocks.LIGHT_BLUE_GLOWSTONE);
        blockWithItem(ModBlocks.PURPLE_GLOWSTONE);
        blockWithItem(ModBlocks.RED_GLOWSTONE);
        blockWithItem(ModBlocks.BLUE_COBBLESTONE);
        blockWithItem(ModBlocks.GREEN_COBBLESTONE);
        blockWithItem(ModBlocks.LIGHT_BLUE_COBBLESTONE);
        blockWithItem(ModBlocks.ORANGE_COBBLESTONE);
        blockWithItem(ModBlocks.PINK_COBBLESTONE);
        blockWithItem(ModBlocks.PURPLE_COBBLESTONE);
        blockWithItem(ModBlocks.RED_COBBLESTONE);
        blockWithItem(ModBlocks.YELLOW_COBBLESTONE);
        blockWithItem(ModBlocks.BLUE_CALCITE);
        blockWithItem(ModBlocks.GREEN_CALCITE);
        blockWithItem(ModBlocks.ORANGE_CALCITE);
        blockWithItem(ModBlocks.TEAL_CALCITE);
        blockWithItem(ModBlocks.PINK_CALCITE);
        blockWithItem(ModBlocks.PURPLE_CALCITE);
        blockWithItem(ModBlocks.RED_CALCITE);
        blockWithItem(ModBlocks.YELLOW_CALCITE);
        blockWithItem(ModBlocks.GREEN_TUFF_BRICKS);
        blockWithItem(ModBlocks.LIGHT_BLUE_TUFF_BRICKS);
        blockWithItem(ModBlocks.ORANGE_TUFF_BRICKS);
        blockWithItem(ModBlocks.PINK_TUFF_BRICKS);
        blockWithItem(ModBlocks.PURPLE_TUFF_BRICKS);
        blockWithItem(ModBlocks.RED_TUFF_BRICKS);
        blockWithItem(ModBlocks.WHITE_TUFF_BRICKS);
        blockWithItem(ModBlocks.YELLOW_TUFF_BRICKS);

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
        blockWithItem(ModBlocks.aetherium_ore);
        blockWithItem(ModBlocks.deppslate_aetherium_ore);
        blockWithItem(ModBlocks.glacialite_ore);
        blockWithItem(ModBlocks.deppslate_glacialite_ore);
        blockWithItem(ModBlocks.necroite_ore);
        blockWithItem(ModBlocks.deppslate_necroite_ore);
        blockWithItem(ModBlocks.pyroclast_ore);
        blockWithItem(ModBlocks.deppslate_pyroclast_ore);
        blockWithItem(ModBlocks.solisite_ore);
        blockWithItem(ModBlocks.deppslate_solisite_ore);
        blockWithItem(ModBlocks.volcanic_ore);
        blockWithItem(ModBlocks.deppslate_volcanic_ore);
    }

    private void customLamp() {
        getVariantBuilder(ModBlocks.PURPLE_LAMP.get()).forAllStates(state -> {
            if (state.getValue(PurpleLampBlock.CLICKED)) {
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
