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
                        output.accept(ModItems.TerrainLeveler.get());
                        output.accept(ModItems.TerrainSmoother.get());
                        output.accept(ModItems.MEASUREMENT_TOOL.get());

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

                        // Combat items


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

                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
