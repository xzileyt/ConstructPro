package net.Jon.constructpro.datagen;

import net.Jon.constructpro.block.ModBlocks;
import net.Jon.constructpro.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider pRegistries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), pRegistries);
    }

    @Override
    protected void generate() {
        // Blocks
        dropSelf(ModBlocks.celestial_block.get());
        dropSelf(ModBlocks.crimson_quartz_block.get());
        dropSelf(ModBlocks.fossilize_amber_block.get());
        dropSelf(ModBlocks.mithril_block.get());
        dropSelf(ModBlocks.lavenderwood_planks.get());
        dropSelf(ModBlocks.LAVENDER_STAIRS.get());
        this.add(ModBlocks.LAVENDERWOOD_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.LAVENDERWOOD_SLAB.get()));
        this.add(ModBlocks.LAVENDERWOOD_DOOR.get(),
                block -> createDoorTable(ModBlocks.LAVENDERWOOD_DOOR.get()));
        dropSelf(ModBlocks.LAVENDERWOOD_TRAPDOOR.get());
        dropSelf(ModBlocks.LAVENDERWOOD_BUTTON.get());
        dropSelf(ModBlocks.LAVENDERWOOD_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.LAVENDERWOOD_FENCE.get());
        dropSelf(ModBlocks.LAVENDERWOOD_FENCE_GATE.get());
        dropSelf(ModBlocks.LAVENDERWOOD_WALL.get());
        dropSelf(ModBlocks.PURPLE_LAMP.get());
        dropSelf(ModBlocks.BLACK_TUFF.get());
        dropSelf(ModBlocks.BLUE_MUSHROOM_BLOCK.get());
        dropSelf(ModBlocks.BROWN_MUSHROOM_BLOCK.get());
        dropSelf(ModBlocks.CYAN_MUSHROOM_BLOCK.get());
        dropSelf(ModBlocks.LIGHT_BLUE_MUSHROOM_BLOCK.get());
        dropSelf(ModBlocks.LIME_MUSHROOM_BLOCK.get());
        dropSelf(ModBlocks.GREEN_MUSHROOM_BLOCK.get());
        dropSelf(ModBlocks.ORANGE_MUSHROOM_BLOCK.get());
        dropSelf(ModBlocks.PINK_MUSHROOM_BLOCK.get());
        dropSelf(ModBlocks.PURPLE_MUSHROOM_BLOCK.get());
        dropSelf(ModBlocks.YELLOW_MUSHROOM_BLOCK.get());
        dropSelf(ModBlocks.DARK_CALCITE.get());
        dropSelf(ModBlocks.GREEN_TUFF.get());
        dropSelf(ModBlocks.COPPER_ANDESITE.get());
        dropSelf(ModBlocks.GREEN_GEM_BLOCK.get());
        dropSelf(ModBlocks.ORANGE_GEM_BLOCK.get());
        dropSelf(ModBlocks.PURPLE_GEM_BLOCK.get());
        dropSelf(ModBlocks.RED_GEM_BLOCK.get());
        dropSelf(ModBlocks.TEAL_GEM_BLOCK.get());
        dropSelf(ModBlocks.YELLOW_GEM_BLOCK.get());
        dropSelf(ModBlocks.BLUE_GLOWSTONE.get());
        dropSelf(ModBlocks.CYAN_GLOWSTONE.get());
        dropSelf(ModBlocks.GREEN_GLOWSTONE.get());
        dropSelf(ModBlocks.LIGHT_BLUE_GLOWSTONE.get());
        dropSelf(ModBlocks.PURPLE_GLOWSTONE.get());
        dropSelf(ModBlocks.RED_GLOWSTONE.get());
        dropSelf(ModBlocks.aetherium_block.get());
        dropSelf(ModBlocks.glacialite_block.get());
        dropSelf(ModBlocks.necroite_block.get());
        dropSelf(ModBlocks.solisite_block.get());
        dropSelf(ModBlocks.volcanic_block.get());
        dropSelf(ModBlocks.pyroclast_block.get());
        dropSelf(ModBlocks.amberwood_planks.get());
        dropSelf(ModBlocks.amberwood_STAIRS.get());
        this.add(ModBlocks.amberwood_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.amberwood_SLAB.get()));
        this.add(ModBlocks.amberwood_DOOR.get(),
                block -> createDoorTable(ModBlocks.amberwood_DOOR.get()));
        dropSelf(ModBlocks.amberwood_TRAPDOOR.get());
        dropSelf(ModBlocks.amberwood_BUTTON.get());
        dropSelf(ModBlocks.amberwood_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.amberwood_FENCE.get());
        dropSelf(ModBlocks.amberwood_FENCE_GATE.get());
        dropSelf(ModBlocks.amberwood_WALL.get());
        dropSelf(ModBlocks.ashwood_planks.get());
        dropSelf(ModBlocks.ashwood_STAIRS.get());
        this.add(ModBlocks.ashwood_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.ashwood_SLAB.get()));
        this.add(ModBlocks.ashwood_DOOR.get(),
                block -> createDoorTable(ModBlocks.ashwood_DOOR.get()));
        dropSelf(ModBlocks.ashwood_TRAPDOOR.get());
        dropSelf(ModBlocks.ashwood_BUTTON.get());
        dropSelf(ModBlocks.ashwood_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.ashwood_FENCE.get());
        dropSelf(ModBlocks.ashwood_FENCE_GATE.get());
        dropSelf(ModBlocks.ashwood_WALL.get());
        dropSelf(ModBlocks.ebonywood_planks.get());
        dropSelf(ModBlocks.ebonywood_STAIRS.get());
        this.add(ModBlocks.ebonywood_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.ebonywood_SLAB.get()));
        this.add(ModBlocks.ebonywood_DOOR.get(),
                block -> createDoorTable(ModBlocks.ebonywood_DOOR.get()));
        dropSelf(ModBlocks.ebonywood_TRAPDOOR.get());
        dropSelf(ModBlocks.ebonywood_BUTTON.get());
        dropSelf(ModBlocks.ebonywood_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.ebonywood_FENCE.get());
        dropSelf(ModBlocks.ebonywood_FENCE_GATE.get());
        dropSelf(ModBlocks.ebonywood_WALL.get());
        dropSelf(ModBlocks.charwood_planks.get());
        dropSelf(ModBlocks.charwood_STAIRS.get());
        this.add(ModBlocks.charwood_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.charwood_SLAB.get()));
        this.add(ModBlocks.charwood_DOOR.get(),
                block -> createDoorTable(ModBlocks.charwood_DOOR.get()));
        dropSelf(ModBlocks.charwood_TRAPDOOR.get());
        dropSelf(ModBlocks.charwood_BUTTON.get());
        dropSelf(ModBlocks.charwood_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.charwood_FENCE.get());
        dropSelf(ModBlocks.charwood_FENCE_GATE.get());
        dropSelf(ModBlocks.charwood_WALL.get());
        dropSelf(ModBlocks.moonwood_planks.get());
        dropSelf(ModBlocks.moonwood_STAIRS.get());
        this.add(ModBlocks.moonwood_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.moonwood_SLAB.get()));
        this.add(ModBlocks.moonwood_DOOR.get(),
                block -> createDoorTable(ModBlocks.moonwood_DOOR.get()));
        dropSelf(ModBlocks.moonwood_TRAPDOOR.get());
        dropSelf(ModBlocks.moonwood_BUTTON.get());
        dropSelf(ModBlocks.moonwood_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.moonwood_FENCE.get());
        dropSelf(ModBlocks.moonwood_FENCE_GATE.get());
        dropSelf(ModBlocks.moonwood_WALL.get());
        dropSelf(ModBlocks.lumenwood_planks.get());
        dropSelf(ModBlocks.lumenwood_STAIRS.get());
        this.add(ModBlocks.lumenwood_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.lumenwood_SLAB.get()));
        this.add(ModBlocks.lumenwood_DOOR.get(),
                block -> createDoorTable(ModBlocks.lumenwood_DOOR.get()));
        dropSelf(ModBlocks.lumenwood_TRAPDOOR.get());
        dropSelf(ModBlocks.lumenwood_BUTTON.get());
        dropSelf(ModBlocks.lumenwood_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.lumenwood_FENCE.get());
        dropSelf(ModBlocks.lumenwood_FENCE_GATE.get());
        dropSelf(ModBlocks.lumenwood_WALL.get());
        dropSelf(ModBlocks.BLUE_COBBLESTONE.get());
        dropSelf(ModBlocks.GREEN_COBBLESTONE.get());
        dropSelf(ModBlocks.LIGHT_BLUE_COBBLESTONE.get());
        dropSelf(ModBlocks.ORANGE_COBBLESTONE.get());
        dropSelf(ModBlocks.PINK_COBBLESTONE.get());
        dropSelf(ModBlocks.PURPLE_COBBLESTONE.get());
        dropSelf(ModBlocks.RED_COBBLESTONE.get());
        dropSelf(ModBlocks.YELLOW_COBBLESTONE.get());
        dropSelf(ModBlocks.BLUE_CALCITE.get());
        dropSelf(ModBlocks.GREEN_CALCITE.get());
        dropSelf(ModBlocks.ORANGE_CALCITE.get());
        dropSelf(ModBlocks.PINK_CALCITE.get());
        dropSelf(ModBlocks.PURPLE_CALCITE.get());
        dropSelf(ModBlocks.RED_CALCITE.get());
        dropSelf(ModBlocks.TEAL_CALCITE.get());
        dropSelf(ModBlocks.YELLOW_CALCITE.get());
        dropSelf(ModBlocks.GREEN_TUFF_BRICKS.get());
        dropSelf(ModBlocks.LIGHT_BLUE_TUFF_BRICKS.get());
        dropSelf(ModBlocks.ORANGE_TUFF_BRICKS.get());
        dropSelf(ModBlocks.PINK_TUFF_BRICKS.get());
        dropSelf(ModBlocks.PURPLE_TUFF_BRICKS.get());
        dropSelf(ModBlocks.RED_TUFF_BRICKS.get());
        dropSelf(ModBlocks.WHITE_TUFF_BRICKS.get());
        dropSelf(ModBlocks.YELLOW_TUFF_BRICKS.get());
        dropSelf(ModBlocks.BLUE_ENDSTONE.get());
        dropSelf(ModBlocks.GREEN_ENDSTONE.get());
        dropSelf(ModBlocks.ORANGE_ENDSTONE.get());
        dropSelf(ModBlocks.PINK_ENDSTONE.get());
        dropSelf(ModBlocks.PURPLE_ENDSTONE.get());
        dropSelf(ModBlocks.RED_ENDSTONE.get());
        dropSelf(ModBlocks.YELLOW_ENDSTONE.get());
        dropSelf(ModBlocks.AMBERWOOD_HORIZONTAL_PLANKS.get());
        dropSelf(ModBlocks.AMBERWWOOD_VERTICAL_PLANKS.get());
        dropSelf(ModBlocks.ASHWOOD_VERTICAL_PLANKS.get());
        dropSelf(ModBlocks.ASHWOOD_HORIZONTAL_PLANKS.get());
        dropSelf(ModBlocks.CHARWOOD_HORIZONTAL_PLANKS.get());
        dropSelf(ModBlocks.CHARWOOD_VERTICAL_PLANKS.get());
        dropSelf(ModBlocks.EBONYWOOD_VERTICAL_PLANKS.get());
        dropSelf(ModBlocks.EBONYWOOD_HORIZONTAL_PLANKS.get());
        dropSelf(ModBlocks.LAVENDERWOOD_VERTICAL_PLANKS.get());
        dropSelf(ModBlocks.LAVENDERWOOD_HORIZONTAL_PLANKS.get());
        dropSelf(ModBlocks.LUMENWOOD_HORIZONTAL_PLANKS.get());
        dropSelf(ModBlocks.LUMENWOOD_VERTICAL_PLANKS.get());
        dropSelf(ModBlocks.MOONWOOD_HORIZONTAL_PLANKS.get());
        dropSelf(ModBlocks.MOONWOOD_VERTICAL_PLANKS.get());
        dropSelf(ModBlocks.STELLAR_SLATE_ANDESITE.get());
        dropSelf(ModBlocks.STELLAR_SLATE_COBBLED_DEEPSLATE.get());
        dropSelf(ModBlocks.STELLAR_SLATE_COBBLESTONE.get());
        dropSelf(ModBlocks.STELLAR_SLATE_DEEPSLATE_BRICKS.get());
        dropSelf(ModBlocks.STELLAR_SLATE_STONE.get());
        dropSelf(ModBlocks.STELLAR_SLATE_STONE_BRICKS.get());
        dropSelf(ModBlocks.BLUE_AMETHYST.get());
        dropSelf(ModBlocks.GREEN_AMETHYST.get());
        dropSelf(ModBlocks.LIGHT_BLUE_AMETHYST.get());
        dropSelf(ModBlocks.ORANGE_AMETHYST.get());
        dropSelf(ModBlocks.PINK_AMETHYST.get());
        dropSelf(ModBlocks.RED_AMETHYST.get());
        dropSelf(ModBlocks.YELLOW_AMETHYST.get());
        dropSelf(ModBlocks.OVERGROWN_STONE.get());
        dropSelf(ModBlocks.SNOW_STONE.get());
        dropSelf(ModBlocks.SNOW_STONE_BRICKS.get());
        dropSelf(ModBlocks.LIMESTONE.get());
        dropSelf(ModBlocks.LIMESTONE_ANDESITE.get());
        dropSelf(ModBlocks.LIMESTONE_BRICKS.get());
        dropSelf(ModBlocks.LIMESTONE_COBBLED.get());
        dropSelf(ModBlocks.LIMESTONE_POLISHED_ANDESITE.get());
        dropSelf(ModBlocks.MULCH_DIRT.get());
        dropSelf(ModBlocks.ROCKY_MOSS.get());
        dropSelf(ModBlocks.PLASTER_BLOCK.get());
        dropSelf(ModBlocks.PLASTER_BRICKS.get());
        dropSelf(ModBlocks.BRICKS_WHITE_GROUT.get());
        dropSelf(ModBlocks.BLUE_BRICKS.get());
        dropSelf(ModBlocks.GREEN_BRICKS.get());
        dropSelf(ModBlocks.LIGHT_BLUE_BRICKS.get());
        dropSelf(ModBlocks.LIME_GREEN_BRICKS.get());
        dropSelf(ModBlocks.ORANGE_BRICKS.get());
        dropSelf(ModBlocks.PINK_BRICKS.get());
        dropSelf(ModBlocks.PURPLE_BRICKS.get());
        dropSelf(ModBlocks.RED_BRICKS.get());
        dropSelf(ModBlocks.YELLOW_BRICKS.get());
        dropSelf(ModBlocks.GILDED_STONE.get());
        dropSelf(ModBlocks.GILDED_STONE_BRICKS.get());
        dropSelf(ModBlocks.LAVENDERWOOD_LOG.get());
        dropSelf(ModBlocks.HEIGHT_MARKER.get());
        dropSelf(ModBlocks.AMBERWOOD_LOG.get());
        dropSelf(ModBlocks.BLUE_WARPED_WART_BLOCK.get());
        dropSelf(ModBlocks.GREEN_WARPED_WART_BLOCK.get());
        dropSelf(ModBlocks.ORANGE_WARPED_WART_BLOCK.get());
        dropSelf(ModBlocks.PINK_WARPED_WART_BLOCK.get());
        dropSelf(ModBlocks.PURPLE_WARPED_WART_BLOCK.get());
        dropSelf(ModBlocks.YELLOW_WARPED_WART_BLOCK.get());
        dropSelf(ModBlocks.DRY_HAY_BALE.get());
        dropSelf(ModBlocks.ASHWOOD_LOG.get());
        dropSelf(ModBlocks.CHARWOOD_LOG.get());
        dropSelf(ModBlocks.LUMENWOOD_LOG.get());
        dropSelf(ModBlocks.EBONYWOOD_LOG.get());
        dropSelf(ModBlocks.MOONWOOD_LOG.get());
        dropSelf(ModBlocks.COMPRESSED_ANDESITE.get());
        dropSelf(ModBlocks.COMPRESSED_CHISELED_STONE_BRICKS.get());
        dropSelf(ModBlocks.COMPRESSED_COBBLED_DEEPSLATE.get());
        dropSelf(ModBlocks.COMPRESSED_COBBLESTONE.get());
        dropSelf(ModBlocks.COMPRESSED_CRACKED_DEEPSLATE_BRICKS.get());
        dropSelf(ModBlocks.COMPRESSED_CRACKED_DEEPSLATE_TILES.get());
        dropSelf(ModBlocks.COMPRESSED_DEEPSLATE.get());
        dropSelf(ModBlocks.COMPRESSED_DEEPSLATE_BRICKS.get());
        dropSelf(ModBlocks.COMPRESSED_DIORITE.get());
        dropSelf(ModBlocks.COMPRESSED_GRANITE.get());
        dropSelf(ModBlocks.COMPRESSED_GRAVEL.get());
        dropSelf(ModBlocks.COMPRESSED_MOSS_BLOCK.get());
        dropSelf(ModBlocks.COMPRESSED_MOSSY_COBBLESTONE.get());
        dropSelf(ModBlocks.COMPRESSED_MOSSY_STONE_BRICKS.get());
        dropSelf(ModBlocks.COMPRESSED_MUD.get());
        dropSelf(ModBlocks.COMPRESSED_MUD_BRICKS.get());
        dropSelf(ModBlocks.COMPRESSED_POLISHED_ANDESITE.get());
        dropSelf(ModBlocks.COMPRESSED_POLISHED_DEEPSLATE.get());
        dropSelf(ModBlocks.COMPRESSED_POLISHED_GRANITE.get());
        dropSelf(ModBlocks.COMPRESSED_POLISHED_DIORITE.get());
        dropSelf(ModBlocks.COMPRESSED_POLISHED_TUFF.get());
        dropSelf(ModBlocks.COMPRESSED_SAND.get());
        dropSelf(ModBlocks.COMPRESSED_STONE.get());
        dropSelf(ModBlocks.COMPRESSED_STONE_BRICKS.get());
        dropSelf(ModBlocks.COMPRESSED_TERRACOTTA.get());
        dropSelf(ModBlocks.COMPRESSED_TUFF.get());


        // Ores
        this.add(ModBlocks.celestial_ore.get(),
                block -> createMultipleOreDrops(ModBlocks.celestial_ore.get(), ModItems.CELESTIAL.get(), 1, 2));
        this.add(ModBlocks.celestial_deepslate_ore.get(),
                block -> createMultipleOreDrops(ModBlocks.celestial_deepslate_ore.get(), ModItems.CELESTIAL.get(), 1, 2));
        this.add(ModBlocks.crimson_quartz_ore.get(),
                block -> createMultipleOreDrops(ModBlocks.crimson_quartz_ore.get(), ModItems.CrimsonQuartz.get(), 1, 2));
        this.add(ModBlocks.fossilized_amber_ore.get(),
                block -> createMultipleOreDrops(ModBlocks.fossilized_amber_ore.get(), ModItems.FossilizedAmber.get(), 1, 2));
        this.add(ModBlocks.molten_ore.get(),
                block -> createMultipleOreDrops(ModBlocks.molten_ore.get(), ModItems.Molten.get(), 1, 2));
        this.add(ModBlocks.starlite_ore.get(),
                block -> createMultipleOreDrops(ModBlocks.starlite_ore.get(), ModItems.STARLITE_DUST.get(), 1, 2));
        this.add(ModBlocks.starlite_deepslate_ore.get(),
                block -> createMultipleOreDrops(ModBlocks.starlite_deepslate_ore.get(), ModItems.STARLITE_DUST.get(), 1, 2));
        this.add(ModBlocks.raw_mithril_block.get(),
                block -> createMultipleOreDrops(ModBlocks.raw_mithril_block.get(), ModItems.raw_mithril_ore.get(), 1, 1));
        this.add(ModBlocks.mithril_ore.get(),
                block -> createMultipleOreDrops(ModBlocks.mithril_ore.get(), ModItems.raw_mithril_ore.get(), 1, 2));
        this.add(ModBlocks.deepslate_mithril_ore.get(),
                block -> createMultipleOreDrops(ModBlocks.deepslate_mithril_ore.get(), ModItems.raw_mithril_ore.get(), 1, 2));
        this.add(ModBlocks.raw_pyroclast_block.get(),
                block -> createMultipleOreDrops(ModBlocks.raw_pyroclast_block.get(), ModItems.raw_pyroclast_ore.get(), 1, 1));
        this.add(ModBlocks.raw_volcanic_block.get(),
                block -> createMultipleOreDrops(ModBlocks.raw_volcanic_block.get(), ModItems.raw_volcanic_ore.get(), 1, 1));
        this.add(ModBlocks.aetherium_ore.get(),
                block -> createMultipleOreDrops(ModBlocks.aetherium_ore.get(), ModItems.raw_aetherium_ore.get(), 1, 2));
        this.add(ModBlocks.deppslate_aetherium_ore.get(),
                block -> createMultipleOreDrops(ModBlocks.deppslate_aetherium_ore.get(), ModItems.raw_aetherium_ore.get(), 1, 2));
        this.add(ModBlocks.glacialite_ore.get(),
                block -> createMultipleOreDrops(ModBlocks.glacialite_ore.get(), ModItems.raw_glacialite_ore.get(), 1, 2));
        this.add(ModBlocks.deppslate_glacialite_ore.get(),
                block -> createMultipleOreDrops(ModBlocks.deppslate_glacialite_ore.get(), ModItems.raw_glacialite_ore.get(), 1, 2));
        this.add(ModBlocks.necroite_ore.get(),
                block -> createMultipleOreDrops(ModBlocks.necroite_ore.get(), ModItems.raw_necroite_ore.get(), 1, 2));
        this.add(ModBlocks.deppslate_necroite_ore.get(),
                block -> createMultipleOreDrops(ModBlocks.deppslate_necroite_ore.get(), ModItems.raw_necroite_ore.get(), 1, 2));
        this.add(ModBlocks.pyroclast_ore.get(),
                block -> createMultipleOreDrops(ModBlocks.pyroclast_ore.get(), ModItems.raw_pyroclast_ore.get(), 1, 2));
        this.add(ModBlocks.deppslate_pyroclast_ore.get(),
                block -> createMultipleOreDrops(ModBlocks.deppslate_pyroclast_ore.get(), ModItems.raw_pyroclast_ore.get(), 1, 2));
        this.add(ModBlocks.solisite_ore.get(),
                block -> createMultipleOreDrops(ModBlocks.solisite_ore.get(), ModItems.raw_solisite_ore.get(), 1, 2));
        this.add(ModBlocks.deppslate_solisite_ore.get(),
                block -> createMultipleOreDrops(ModBlocks.deppslate_solisite_ore.get(), ModItems.raw_solisite_ore.get(), 1, 2));
        this.add(ModBlocks.volcanic_ore.get(),
                block -> createMultipleOreDrops(ModBlocks.volcanic_ore.get(), ModItems.raw_volcanic_ore.get(), 1, 1));
        this.add(ModBlocks.deppslate_volcanic_ore.get(),
                block -> createMultipleOreDrops(ModBlocks.deppslate_volcanic_ore.get(), ModItems.raw_volcanic_ore.get(), 1, 1));
        this.add(ModBlocks.raw_pyroclast_block.get(),
                block -> createMultipleOreDrops(ModBlocks.raw_pyroclast_block.get(), ModItems.raw_pyroclast_ore.get(), 1, 1));
        this.add(ModBlocks.raw_volcanic_block.get(),
                block -> createMultipleOreDrops(ModBlocks.raw_volcanic_block.get(), ModItems.raw_volcanic_ore.get(), 1, 1));
        this.add(ModBlocks.VOLCANIC_DEBRIS.get(),
                block -> createMultipleOreDrops(ModBlocks.VOLCANIC_DEBRIS.get(), ModItems.volcanic_scrap.get(), 1, 1));

    }

    protected LootTable.Builder createMultipleOreDrops(Block pBlock, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(
                pBlock, this.applyExplosionDecay(
                        pBlock, LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                                .apply(ApplyBonusCount.addOreBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))
                )
        );
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}