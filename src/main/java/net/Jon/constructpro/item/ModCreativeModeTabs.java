package net.Jon.constructpro.item;

import net.Jon.constructpro.block.ModBlocks;
import net.Jon.constructpro.ConstructPro;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ConstructPro.MOD_ID);

    public static final RegistryObject<CreativeModeTab> constructpro_items_tab = CREATIVE_MODE_TABS.register("constructpro_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.Molten.get()))
                    .title(Component.translatable("creativetab.ConstructPro.constructpro_items"))
                    .displayItems((itemDisplayParameters, output) -> {

                        // Ores
                        output.accept(ModItems.CELESTIAL.get());
                        output.accept(ModItems.CrimsonQuartz.get());
                        output.accept(ModItems.Molten.get());
                        output.accept(ModItems.FossilizedAmber.get());
                        output.accept(ModItems.starlite.get());
                        output.accept(ModItems.raw_mithril_ore.get());
                        output.accept(ModItems.mithril_ingot.get());
                        output.accept(ModItems.pyroclast_ingot.get());
                        output.accept(ModItems.raw_pyroclast_ore.get());
                        output.accept(ModItems.aetherium_ingot.get());
                        output.accept(ModItems.raw_aetherium_ore.get());
                        output.accept(ModItems.glacialite_ingot.get());
                        output.accept(ModItems.raw_glacialite_ore.get());
                        output.accept(ModItems.necroite_ingot.get());
                        output.accept(ModItems.raw_necroite_ore.get());
                        output.accept(ModItems.solisite_ingot.get());
                        output.accept(ModItems.raw_solisite_ore.get());
                        output.accept(ModItems.volcanic_ingot.get());
                        output.accept(ModItems.raw_volcanic_ore.get());

                        // Landscaping Tools
                        output.accept(ModItems.Chisel.get());
                        output.accept(ModItems.TROWEL.get());
                        output.accept(ModItems.GEO_ANALYZER.get());
                        output.accept(ModItems.TERRAINFLATTENINGTOOL.get());
                        output.accept(ModItems.TerrainSmoother.get());
                        output.accept(ModItems.MEASUREMENT_TOOL.get());
                        output.accept(ModItems.TIMBER_AXE.get());

                        // Tools
                        output.accept(ModItems.CELESTIAL_SWORD.get());
                        output.accept(ModItems.CELESTIAL_PICKAXE.get());
                        output.accept(ModItems.CELESTIAL_AXE.get());
                        output.accept(ModItems.CELESTIAL_SHOVEL.get());
                        output.accept(ModItems.CELESTIAL_HOE.get());
                        output.accept(ModItems.CELESTIAL_HAMMER.get());
                        output.accept(ModItems.MOLTEN_SWORD.get());
                        output.accept(ModItems.MOLTEN_PICKAXE.get());
                        output.accept(ModItems.MOLTEN_AXE.get());
                        output.accept(ModItems.MOLTEN_SHOVEL.get());
                        output.accept(ModItems.MOLTEN_HOE.get());
                        output.accept(ModItems.VOLCANIC_SWORD.get());
                        output.accept(ModItems.VOLCANIC_PICKAXE.get());
                        output.accept(ModItems.VOLCANIC_AXE.get());
                        output.accept(ModItems.VOLCANIC_SHOVEL.get());
                        output.accept(ModItems.VOLCANIC_HOE.get());

                        // Combat items
                        output.accept(ModItems.CELESTIAL_HELMET.get());
                        output.accept(ModItems.CELESTIAL_CHESTPLATE.get());
                        output.accept(ModItems.CELESTIAL_LEGGINGS.get());
                        output.accept(ModItems.CELESTIAL_BOOTS.get());

                        output.accept(ModItems.MOLTEN_HELMET.get());
                        output.accept(ModItems.MOLTEN_CHESTPLATE.get());
                        output.accept(ModItems.MOLTEN_LEGGINGS.get());
                        output.accept(ModItems.MOLTEN_BOOTS.get());

                        output.accept(ModItems.VOLCANIC_HELMET.get());
                        output.accept(ModItems.VOLCANIC_CHESTPLATE.get());
                        output.accept(ModItems.VOLCANIC_LEGGINGS.get());
                        output.accept(ModItems.VOLCANIC_BOOTS.get());


                        // Food items
                        output.accept(ModItems.ETERNAL_STEAK.get());

                    }).build());


    public static final RegistryObject<CreativeModeTab> constructpro_blocks_tab = CREATIVE_MODE_TABS.register("constructpro_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.celestial_block.get()))
                    .withTabsBefore(constructpro_items_tab.getId())
                    .title(Component.translatable("creativetab.ConstructPro.constructpro_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.celestial_block.get());
                        output.accept(ModBlocks.crimson_quartz_block.get());
                        output.accept(ModBlocks.crimson_quartz_ore.get());
                        output.accept(ModBlocks.fossilize_amber_block.get());
                        output.accept(ModBlocks.starlite_ore.get());
                        output.accept(ModBlocks.starlite_deepslate_ore.get());
                        output.accept(ModBlocks.celestial_ore.get());
                        output.accept(ModBlocks.celestial_deepslate_ore.get());
                        output.accept(ModBlocks.molten_ore.get());
                        output.accept(ModBlocks.fossilized_amber_ore.get());
                        output.accept(ModBlocks.raw_mithril_block.get());
                        output.accept(ModBlocks.mithril_ore.get());
                        output.accept(ModBlocks.deepslate_mithril_ore.get());
                        output.accept(ModBlocks.mithril_block.get());
                        output.accept(ModBlocks.lavenderwood_planks.get());
                        output.accept(ModBlocks.LAVENDER_STAIRS.get());
                        output.accept(ModBlocks.LAVENDERWOOD_SLAB.get());
                        output.accept(ModBlocks.LAVENDERWOOD_TRAPDOOR.get());
                        output.accept(ModBlocks.LAVENDERWOOD_DOOR.get());
                        output.accept(ModBlocks.LAVENDERWOOD_BUTTON.get());
                        output.accept(ModBlocks.LAVENDERWOOD_FENCE.get());
                        output.accept(ModBlocks.LAVENDERWOOD_FENCE_GATE.get());
                        output.accept(ModBlocks.LAVENDERWOOD_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.PURPLE_LAMP.get());
                        output.accept(ModBlocks.BLACK_TUFF.get());
                        output.accept(ModBlocks.BLUE_MUSHROOM_BLOCK.get());
                        output.accept(ModBlocks.BROWN_MUSHROOM_BLOCK.get());
                        output.accept(ModBlocks.CYAN_MUSHROOM_BLOCK.get());
                        output.accept(ModBlocks.GREEN_MUSHROOM_BLOCK.get());
                        output.accept(ModBlocks.LIGHT_BLUE_MUSHROOM_BLOCK.get());
                        output.accept(ModBlocks.LIME_MUSHROOM_BLOCK.get());
                        output.accept(ModBlocks.ORANGE_MUSHROOM_BLOCK.get());
                        output.accept(ModBlocks.PINK_MUSHROOM_BLOCK.get());
                        output.accept(ModBlocks.PURPLE_MUSHROOM_BLOCK.get());
                        output.accept(ModBlocks.YELLOW_MUSHROOM_BLOCK.get());
                        output.accept(ModBlocks.COPPER_ANDESITE.get());
                        output.accept(ModBlocks.GREEN_TUFF.get());
                        output.accept(ModBlocks.DARK_CALCITE.get());
                        output.accept(ModBlocks.GREEN_GEM_BLOCK.get());
                        output.accept(ModBlocks.ORANGE_GEM_BLOCK.get());
                        output.accept(ModBlocks.PURPLE_GEM_BLOCK.get());
                        output.accept(ModBlocks.RED_GEM_BLOCK.get());
                        output.accept(ModBlocks.TEAL_GEM_BLOCK.get());
                        output.accept(ModBlocks.YELLOW_GEM_BLOCK.get());
                        output.accept(ModBlocks.BLUE_GLOWSTONE.get());
                        output.accept(ModBlocks.CYAN_GLOWSTONE.get());
                        output.accept(ModBlocks.GREEN_GLOWSTONE.get());
                        output.accept(ModBlocks.LIGHT_BLUE_GLOWSTONE.get());
                        output.accept(ModBlocks.PURPLE_GLOWSTONE.get());
                        output.accept(ModBlocks.RED_GLOWSTONE.get());
                        output.accept(ModBlocks.aetherium_block.get());
                        output.accept(ModBlocks.aetherium_ore.get());
                        output.accept(ModBlocks.deppslate_aetherium_ore.get());
                        output.accept(ModBlocks.glacialite_block.get());
                        output.accept(ModBlocks.glacialite_ore.get());
                        output.accept(ModBlocks.deppslate_glacialite_ore.get());
                        output.accept(ModBlocks.pyroclast_block.get());
                        output.accept(ModBlocks.pyroclast_ore.get());
                        output.accept(ModBlocks.deppslate_pyroclast_ore.get());
                        output.accept(ModBlocks.necroite_block.get());
                        output.accept(ModBlocks.necroite_ore.get());
                        output.accept(ModBlocks.deppslate_necroite_ore.get());
                        output.accept(ModBlocks.solisite_block.get());
                        output.accept(ModBlocks.solisite_ore.get());
                        output.accept(ModBlocks.deppslate_solisite_ore.get());
                        output.accept(ModBlocks.volcanic_block.get());
                        output.accept(ModBlocks.volcanic_ore.get());
                        output.accept(ModBlocks.deppslate_volcanic_ore.get());
                        output.accept(ModBlocks.raw_pyroclast_block.get());
                        output.accept(ModBlocks.raw_volcanic_block.get());
                        output.accept(ModBlocks.amberwood_planks.get());
                        output.accept(ModBlocks.amberwood_STAIRS.get());
                        output.accept(ModBlocks.amberwood_SLAB.get());
                        output.accept(ModBlocks.amberwood_TRAPDOOR.get());
                        output.accept(ModBlocks.amberwood_DOOR.get());
                        output.accept(ModBlocks.amberwood_BUTTON.get());
                        output.accept(ModBlocks.amberwood_FENCE.get());
                        output.accept(ModBlocks.amberwood_FENCE_GATE.get());
                        output.accept(ModBlocks.amberwood_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.ashwood_planks.get());
                        output.accept(ModBlocks.ashwood_STAIRS.get());
                        output.accept(ModBlocks.ashwood_SLAB.get());
                        output.accept(ModBlocks.ashwood_TRAPDOOR.get());
                        output.accept(ModBlocks.ashwood_DOOR.get());
                        output.accept(ModBlocks.ashwood_BUTTON.get());
                        output.accept(ModBlocks.ashwood_FENCE.get());
                        output.accept(ModBlocks.ashwood_FENCE_GATE.get());
                        output.accept(ModBlocks.ashwood_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.lumenwood_planks.get());
                        output.accept(ModBlocks.lumenwood_STAIRS.get());
                        output.accept(ModBlocks.lumenwood_SLAB.get());
                        output.accept(ModBlocks.lumenwood_TRAPDOOR.get());
                        output.accept(ModBlocks.lumenwood_DOOR.get());
                        output.accept(ModBlocks.lumenwood_BUTTON.get());
                        output.accept(ModBlocks.lumenwood_FENCE.get());
                        output.accept(ModBlocks.lumenwood_FENCE_GATE.get());
                        output.accept(ModBlocks.lumenwood_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.ebonywood_planks.get());
                        output.accept(ModBlocks.ebonywood_STAIRS.get());
                        output.accept(ModBlocks.ebonywood_SLAB.get());
                        output.accept(ModBlocks.ebonywood_TRAPDOOR.get());
                        output.accept(ModBlocks.ebonywood_DOOR.get());
                        output.accept(ModBlocks.ebonywood_BUTTON.get());
                        output.accept(ModBlocks.ebonywood_FENCE.get());
                        output.accept(ModBlocks.ebonywood_FENCE_GATE.get());
                        output.accept(ModBlocks.ebonywood_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.charwood_planks.get());
                        output.accept(ModBlocks.charwood_STAIRS.get());
                        output.accept(ModBlocks.charwood_SLAB.get());
                        output.accept(ModBlocks.charwood_TRAPDOOR.get());
                        output.accept(ModBlocks.charwood_DOOR.get());
                        output.accept(ModBlocks.charwood_BUTTON.get());
                        output.accept(ModBlocks.charwood_FENCE.get());
                        output.accept(ModBlocks.charwood_FENCE_GATE.get());
                        output.accept(ModBlocks.charwood_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.moonwood_planks.get());
                        output.accept(ModBlocks.moonwood_STAIRS.get());
                        output.accept(ModBlocks.moonwood_SLAB.get());
                        output.accept(ModBlocks.moonwood_TRAPDOOR.get());
                        output.accept(ModBlocks.moonwood_DOOR.get());
                        output.accept(ModBlocks.moonwood_BUTTON.get());
                        output.accept(ModBlocks.moonwood_FENCE.get());
                        output.accept(ModBlocks.moonwood_FENCE_GATE.get());
                        output.accept(ModBlocks.moonwood_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.BLUE_COBBLESTONE.get());
                        output.accept(ModBlocks.GREEN_GLOWSTONE.get());
                        output.accept(ModBlocks.LIGHT_BLUE_COBBLESTONE.get());
                        output.accept(ModBlocks.ORANGE_COBBLESTONE.get());
                        output.accept(ModBlocks.PINK_COBBLESTONE.get());
                        output.accept(ModBlocks.PURPLE_COBBLESTONE.get());
                        output.accept(ModBlocks.RED_COBBLESTONE.get());
                        output.accept(ModBlocks.YELLOW_COBBLESTONE.get());
                        output.accept(ModBlocks.BLUE_CALCITE.get());
                        output.accept(ModBlocks.GREEN_CALCITE.get());
                        output.accept(ModBlocks.ORANGE_CALCITE.get());
                        output.accept(ModBlocks.PINK_CALCITE.get());
                        output.accept(ModBlocks.PURPLE_CALCITE.get());
                        output.accept(ModBlocks.RED_CALCITE.get());
                        output.accept(ModBlocks.TEAL_CALCITE.get());
                        output.accept(ModBlocks.YELLOW_CALCITE.get());
                        output.accept(ModBlocks.GREEN_TUFF_BRICKS.get());
                        output.accept(ModBlocks.LIGHT_BLUE_TUFF_BRICKS.get());
                        output.accept(ModBlocks.ORANGE_TUFF_BRICKS.get());
                        output.accept(ModBlocks.PINK_TUFF_BRICKS.get());
                        output.accept(ModBlocks.PURPLE_TUFF_BRICKS.get());
                        output.accept(ModBlocks.RED_TUFF_BRICKS.get());
                        output.accept(ModBlocks.WHITE_TUFF_BRICKS.get());
                        output.accept(ModBlocks.YELLOW_TUFF_BRICKS.get());
                        output.accept(ModBlocks.BLUE_ENDSTONE.get());
                        output.accept(ModBlocks.GREEN_ENDSTONE.get());
                        output.accept(ModBlocks.ORANGE_ENDSTONE.get());
                        output.accept(ModBlocks.PINK_ENDSTONE.get());
                        output.accept(ModBlocks.PURPLE_ENDSTONE.get());
                        output.accept(ModBlocks.RED_ENDSTONE.get());
                        output.accept(ModBlocks.YELLOW_ENDSTONE.get());
                        output.accept(ModBlocks.AMBERWOOD_HORIZONTAL_PLANKS.get());
                        output.accept(ModBlocks.AMBERWWOOD_VERTICAL_PLANKS.get());
                        output.accept(ModBlocks.ASHWOOD_HORIZONTAL_PLANKS.get());
                        output.accept(ModBlocks.ASHWOOD_VERTICAL_PLANKS.get());
                        output.accept(ModBlocks.CHARWOOD_HORIZONTAL_PLANKS.get());
                        output.accept(ModBlocks.CHARWOOD_VERTICAL_PLANKS.get());
                        output.accept(ModBlocks.EBONYWOOD_HORIZONTAL_PLANKS.get());
                        output.accept(ModBlocks.EBONYWOOD_VERTICAL_PLANKS.get());
                        output.accept(ModBlocks.LUMENWOOD_HORIZONTAL_PLANKS.get());
                        output.accept(ModBlocks.LAVENDERWOOD_VERTICAL_PLANKS.get());
                        output.accept(ModBlocks.LUMENWOOD_VERTICAL_PLANKS.get());
                        output.accept(ModBlocks.LUMENWOOD_HORIZONTAL_PLANKS.get());
                        output.accept(ModBlocks.MOONWOOD_HORIZONTAL_PLANKS.get());
                        output.accept(ModBlocks.MOONWOOD_VERTICAL_PLANKS.get());
                        output.accept(ModBlocks.STELLAR_SLATE_ANDESITE.get());
                        output.accept(ModBlocks.STELLAR_SLATE_COBBLED_DEEPSLATE.get());
                        output.accept(ModBlocks.STELLAR_SLATE_COBBLESTONE.get());
                        output.accept(ModBlocks.STELLAR_SLATE_DEEPSLATE_BRICKS.get());
                        output.accept(ModBlocks.STELLAR_SLATE_STONE.get());
                        output.accept(ModBlocks.STELLAR_SLATE_STONE_BRICKS.get());
                        output.accept(ModBlocks.BLUE_AMETHYST.get());
                        output.accept(ModBlocks.GREEN_AMETHYST.get());
                        output.accept(ModBlocks.LIGHT_BLUE_AMETHYST.get());
                        output.accept(ModBlocks.ORANGE_AMETHYST.get());
                        output.accept(ModBlocks.PINK_AMETHYST.get());
                        output.accept(ModBlocks.RED_AMETHYST.get());
                        output.accept(ModBlocks.YELLOW_AMETHYST.get());

                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
