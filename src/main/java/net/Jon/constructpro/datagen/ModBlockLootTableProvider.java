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
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider pRegistries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), pRegistries);
    }

    @Override
    protected void generate() {
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

        this.add(ModBlocks.celestial_ore.get(),
                block -> createMultipleOreDrops(ModBlocks.celestial_ore.get(), ModItems.Celestial.get(), 2, 4));
        this.add(ModBlocks.celestial_deepslate_ore.get(),
                block -> createMultipleOreDrops(ModBlocks.celestial_deepslate_ore.get(), ModItems.Celestial.get(), 2, 4));
        this.add(ModBlocks.crimson_quartz_ore.get(),
                block -> createMultipleOreDrops(ModBlocks.crimson_quartz_ore.get(), ModItems.CrimsonQuartz.get(), 2, 3));
        this.add(ModBlocks.fossilized_amber_ore.get(),
                block -> createMultipleOreDrops(ModBlocks.fossilized_amber_ore.get(), ModItems.FossilizedAmber.get(), 2, 4));
        this.add(ModBlocks.molten_ore.get(),
                block -> createMultipleOreDrops(ModBlocks.molten_ore.get(), ModItems.Molten.get(), 1, 2));
        this.add(ModBlocks.starlite_ore.get(),
                block -> createMultipleOreDrops(ModBlocks.starlite_ore.get(), ModItems.starlite.get(), 1, 2));
        this.add(ModBlocks.starlite_deepslate_ore.get(),
                block -> createMultipleOreDrops(ModBlocks.starlite_deepslate_ore.get(), ModItems.starlite.get(), 2, 4));
        this.add(ModBlocks.raw_mithril_block.get(),
                block -> createMultipleOreDrops(ModBlocks.raw_mithril_block.get(), ModItems.raw_mithril_ore.get(), 1, 1));
        this.add(ModBlocks.mithril_ore.get(),
                block -> createMultipleOreDrops(ModBlocks.mithril_ore.get(), ModItems.raw_mithril_ore.get(), 2, 4));
        this.add(ModBlocks.deepslate_mithril_ore.get(),
                block -> createMultipleOreDrops(ModBlocks.deepslate_mithril_ore.get(), ModItems.raw_mithril_ore.get(), 2, 4));
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