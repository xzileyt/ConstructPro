package net.Jon.constructpro.datagen;

import net.Jon.constructpro.ConstructPro;
import net.Jon.constructpro.block.ModBlocks;
import net.Jon.constructpro.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ConstructPro.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        // Ores
        basicItem(ModItems.CELESTIAL.get());
        basicItem(ModItems.CrimsonQuartz.get());
        basicItem(ModItems.Molten.get());
        basicItem(ModItems.starlite.get());
        basicItem(ModItems.FossilizedAmber.get());
        basicItem(ModItems.raw_mithril_ore.get());
        basicItem(ModItems.mithril_ingot.get());
        basicItem(ModItems.aetherium_ingot.get());
        basicItem(ModItems.raw_aetherium_ore.get());
        basicItem(ModItems.glacialite_ingot.get());
        basicItem(ModItems.raw_glacialite_ore.get());
        basicItem(ModItems.necroite_ingot.get());
        basicItem(ModItems.raw_necroite_ore.get());
        basicItem(ModItems.pyroclast_ingot.get());
        basicItem(ModItems.raw_pyroclast_ore.get());
        basicItem(ModItems.solisite_ingot.get());
        basicItem(ModItems.raw_solisite_ore.get());
        basicItem(ModItems.volcanic_ingot.get());
        basicItem(ModItems.raw_volcanic_ore.get());

        // Building blocks
        buttonItem(ModBlocks.LAVENDERWOOD_BUTTON, ModBlocks.lavenderwood_planks);
        fenceItem(ModBlocks.LAVENDERWOOD_FENCE, ModBlocks.lavenderwood_planks);
        wallItem(ModBlocks.LAVENDERWOOD_WALL, ModBlocks.lavenderwood_planks);
        simpleBlockItem(ModBlocks.LAVENDERWOOD_DOOR);

        buttonItem(ModBlocks.amberwood_BUTTON, ModBlocks.amberwood_planks);
        fenceItem(ModBlocks.amberwood_FENCE, ModBlocks.amberwood_planks);
        wallItem(ModBlocks.amberwood_WALL, ModBlocks.amberwood_planks);
        simpleBlockItem(ModBlocks.amberwood_DOOR);

        buttonItem(ModBlocks.ashwood_BUTTON, ModBlocks.ashwood_planks);
        fenceItem(ModBlocks.ashwood_FENCE, ModBlocks.ashwood_planks);
        wallItem(ModBlocks.ashwood_WALL, ModBlocks.ashwood_planks);
        simpleBlockItem(ModBlocks.ashwood_DOOR);

        buttonItem(ModBlocks.lumenwood_BUTTON, ModBlocks.lumenwood_planks);
        fenceItem(ModBlocks.lumenwood_FENCE, ModBlocks.lumenwood_planks);
        wallItem(ModBlocks.lumenwood_WALL, ModBlocks.lumenwood_planks);
        simpleBlockItem(ModBlocks.lumenwood_DOOR);

        buttonItem(ModBlocks.ebonywood_BUTTON, ModBlocks.ebonywood_planks);
        fenceItem(ModBlocks.ebonywood_FENCE, ModBlocks.ebonywood_planks);
        wallItem(ModBlocks.ebonywood_WALL, ModBlocks.ebonywood_planks);
        simpleBlockItem(ModBlocks.ebonywood_DOOR);

        buttonItem(ModBlocks.charwood_BUTTON, ModBlocks.charwood_planks);
        fenceItem(ModBlocks.charwood_FENCE, ModBlocks.charwood_planks);
        wallItem(ModBlocks.charwood_WALL, ModBlocks.charwood_planks);
        simpleBlockItem(ModBlocks.charwood_DOOR);

        buttonItem(ModBlocks.moonwood_BUTTON, ModBlocks.moonwood_planks);
        fenceItem(ModBlocks.moonwood_FENCE, ModBlocks.moonwood_planks);
        wallItem(ModBlocks.moonwood_WALL, ModBlocks.moonwood_planks);
        simpleBlockItem(ModBlocks.moonwood_DOOR);
        
        // Wood logs


        // Tools
        basicItem(ModItems.Chisel.get());
        basicItem(ModItems.TROWEL.get());
        basicItem(ModItems.GEO_ANALYZER.get());
        basicItem(ModItems.TerrainLeveler.get());
        basicItem(ModItems.TerrainSmoother.get());
        basicItem(ModItems.MEASUREMENT_TOOL.get());

        handheldItem(ModItems.CELESTIAL_SWORD);
        handheldItem(ModItems.CELESTIAL_PICKAXE);
        handheldItem(ModItems.CELESTIAL_AXE);
        handheldItem(ModItems.CELESTIAL_SHOVEL);
        handheldItem(ModItems.CELESTIAL_HOE);
        handheldItem(ModItems.CELESTIAL_HAMMER);
        handheldItem(ModItems.MOLTEN_SWORD);
        handheldItem(ModItems.MOLTEN_PICKAXE);
        handheldItem(ModItems.MOLTEN_AXE);
        handheldItem(ModItems.MOLTEN_SHOVEL);
        handheldItem(ModItems.MOLTEN_HOE);

        // Food items
        basicItem(ModItems.ETERNAL_STEAK.get());
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(ConstructPro.MOD_ID,"item/" + item.getId().getPath()));
    }

    public void buttonItem(RegistryObject<? extends Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture", ResourceLocation.fromNamespaceAndPath(ConstructPro.MOD_ID,
                        "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void fenceItem(RegistryObject<? extends Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture", ResourceLocation.fromNamespaceAndPath(ConstructPro.MOD_ID,
                        "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void wallItem(RegistryObject<? extends Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall", ResourceLocation.fromNamespaceAndPath(ConstructPro.MOD_ID,
                        "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<? extends Block> item){
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(ConstructPro.MOD_ID, "item/" + item.getId().getPath()));
    }
}
