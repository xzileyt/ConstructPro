package net.Jon.constructpro;

import com.mojang.logging.LogUtils;
import net.Jon.constructpro.block.ModBlocks;
import net.Jon.constructpro.component.ModDataComponentTypes;
import net.Jon.constructpro.item.ModCreativeModeTabs;
import net.Jon.constructpro.item.ModItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;


@Mod(ConstructPro.MOD_ID)
public class ConstructPro {
    public static final String MOD_ID = "constructpro";
    public static final Logger LOGGER = LogUtils.getLogger();

    public ConstructPro() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);

        ModCreativeModeTabs.register(modEventBus);
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModDataComponentTypes.register(modEventBus);

        // Register armor materials


        modEventBus.addListener(this::addCreative);
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void log(String message) {
        System.out.println("[ConstructPro] " + message);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        // Common setup code
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        // Add items to creative tabs
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.CrimsonQuartz);
            event.accept(ModItems.FossilizedAmber);
            event.accept(ModItems.CELESTIAL);
            event.accept(ModItems.Molten);
            event.accept(ModItems.raw_mithril_ore);
            event.accept(ModItems.mithril_ingot);
            event.accept(ModItems.aetherium_ingot);
            event.accept(ModItems.raw_aetherium_ore);
            event.accept(ModItems.glacialite_ingot);
            event.accept(ModItems.raw_glacialite_ore);
            event.accept(ModItems.necroite_ingot);
            event.accept(ModItems.raw_necroite_ore);
            event.accept(ModItems.pyroclast_ingot);
            event.accept(ModItems.raw_pyroclast_ore);
            event.accept(ModItems.solisite_ingot);
            event.accept(ModItems.raw_solisite_ore);
            event.accept(ModItems.volcanic_ingot);
            event.accept(ModItems.raw_volcanic_ore);
            event.accept(ModItems.volcanic_scrap);
            event.accept(ModItems.STARLITE);
        }
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(ModBlocks.celestial_block);
            event.accept(ModBlocks.crimson_quartz_block);
            event.accept(ModBlocks.fossilize_amber_block);
            event.accept(ModBlocks.mithril_block);
            event.accept(ModBlocks.lavenderwood_planks);
            event.accept(ModBlocks.LAVENDER_STAIRS);
            event.accept(ModBlocks.LAVENDERWOOD_BUTTON);
            event.accept(ModBlocks.LAVENDERWOOD_SLAB);
            event.accept(ModBlocks.LAVENDERWOOD_DOOR);
            event.accept(ModBlocks.LAVENDERWOOD_FENCE);
            event.accept(ModBlocks.LAVENDERWOOD_FENCE_GATE);
            event.accept(ModBlocks.LAVENDERWOOD_TRAPDOOR);
            event.accept(ModBlocks.LAVENDERWOOD_PRESSURE_PLATE);
            event.accept(ModBlocks.LAVENDERWOOD_WALL);
            event.accept(ModBlocks.PURPLE_LAMP);
            event.accept(ModBlocks.BLACK_TUFF);
            event.accept(ModBlocks.BLUE_MUSHROOM_BLOCK);
            event.accept(ModBlocks.BROWN_MUSHROOM_BLOCK);
            event.accept(ModBlocks.CYAN_MUSHROOM_BLOCK);
            event.accept(ModBlocks.GREEN_MUSHROOM_BLOCK);
            event.accept(ModBlocks.LIGHT_BLUE_MUSHROOM_BLOCK);
            event.accept(ModBlocks.LIME_MUSHROOM_BLOCK);
            event.accept(ModBlocks.ORANGE_MUSHROOM_BLOCK);
            event.accept(ModBlocks.PINK_MUSHROOM_BLOCK);
            event.accept(ModBlocks.PURPLE_MUSHROOM_BLOCK);
            event.accept(ModBlocks.YELLOW_MUSHROOM_BLOCK);
            event.accept(ModBlocks.GREEN_TUFF);
            event.accept(ModBlocks.DARK_CALCITE);
            event.accept(ModBlocks.COPPER_ANDESITE);
            event.accept(ModBlocks.GREEN_GEM_BLOCK);
            event.accept(ModBlocks.ORANGE_GEM_BLOCK);
            event.accept(ModBlocks.PURPLE_GEM_BLOCK);
            event.accept(ModBlocks.RED_GEM_BLOCK);
            event.accept(ModBlocks.TEAL_GEM_BLOCK);
            event.accept(ModBlocks.YELLOW_GEM_BLOCK);
            event.accept(ModBlocks.BLUE_GLOWSTONE);
            event.accept(ModBlocks.CYAN_GLOWSTONE);
            event.accept(ModBlocks.GREEN_GLOWSTONE);
            event.accept(ModBlocks.LIGHT_BLUE_GLOWSTONE);
            event.accept(ModBlocks.PURPLE_GLOWSTONE);
            event.accept(ModBlocks.RED_GLOWSTONE);
            event.accept(ModBlocks.raw_pyroclast_block);
            event.accept(ModBlocks.raw_volcanic_block);
            event.accept(ModBlocks.aetherium_block);
            event.accept(ModBlocks.deppslate_aetherium_ore);
            event.accept(ModBlocks.aetherium_ore);
            event.accept(ModBlocks.glacialite_block);
            event.accept(ModBlocks.deppslate_glacialite_ore);
            event.accept(ModBlocks.glacialite_ore);
            event.accept(ModBlocks.necroite_block);
            event.accept(ModBlocks.deppslate_necroite_ore);
            event.accept(ModBlocks.necroite_ore);
            event.accept(ModBlocks.pyroclast_block);
            event.accept(ModBlocks.deppslate_pyroclast_ore);
            event.accept(ModBlocks.pyroclast_ore);
            event.accept(ModBlocks.solisite_block);
            event.accept(ModBlocks.deppslate_solisite_ore);
            event.accept(ModBlocks.solisite_ore);
            event.accept(ModBlocks.volcanic_block);
            event.accept(ModBlocks.deppslate_volcanic_ore);
            event.accept(ModBlocks.volcanic_ore);
            event.accept(ModBlocks.raw_pyroclast_block);
            event.accept(ModBlocks.raw_volcanic_block);
            event.accept(ModBlocks.amberwood_planks);
            event.accept(ModBlocks.amberwood_STAIRS);
            event.accept(ModBlocks.amberwood_BUTTON);
            event.accept(ModBlocks.amberwood_SLAB);
            event.accept(ModBlocks.amberwood_DOOR);
            event.accept(ModBlocks.amberwood_FENCE);
            event.accept(ModBlocks.amberwood_FENCE_GATE);
            event.accept(ModBlocks.amberwood_TRAPDOOR);
            event.accept(ModBlocks.amberwood_PRESSURE_PLATE);
            event.accept(ModBlocks.amberwood_WALL);
            event.accept(ModBlocks.ashwood_planks);
            event.accept(ModBlocks.ashwood_STAIRS);
            event.accept(ModBlocks.ashwood_BUTTON);
            event.accept(ModBlocks.ashwood_SLAB);
            event.accept(ModBlocks.ashwood_DOOR);
            event.accept(ModBlocks.ashwood_FENCE);
            event.accept(ModBlocks.ashwood_FENCE_GATE);
            event.accept(ModBlocks.ashwood_TRAPDOOR);
            event.accept(ModBlocks.ashwood_PRESSURE_PLATE);
            event.accept(ModBlocks.ashwood_WALL);
            event.accept(ModBlocks.lumenwood_planks);
            event.accept(ModBlocks.lumenwood_STAIRS);
            event.accept(ModBlocks.lumenwood_BUTTON);
            event.accept(ModBlocks.lumenwood_SLAB);
            event.accept(ModBlocks.lumenwood_DOOR);
            event.accept(ModBlocks.lumenwood_FENCE);
            event.accept(ModBlocks.lumenwood_FENCE_GATE);
            event.accept(ModBlocks.lumenwood_TRAPDOOR);
            event.accept(ModBlocks.lumenwood_PRESSURE_PLATE);
            event.accept(ModBlocks.lumenwood_WALL);
            event.accept(ModBlocks.ebonywood_planks);
            event.accept(ModBlocks.ebonywood_STAIRS);
            event.accept(ModBlocks.ebonywood_BUTTON);
            event.accept(ModBlocks.ebonywood_SLAB);
            event.accept(ModBlocks.ebonywood_DOOR);
            event.accept(ModBlocks.ebonywood_FENCE);
            event.accept(ModBlocks.ebonywood_FENCE_GATE);
            event.accept(ModBlocks.ebonywood_TRAPDOOR);
            event.accept(ModBlocks.ebonywood_PRESSURE_PLATE);
            event.accept(ModBlocks.ebonywood_WALL);
            event.accept(ModBlocks.charwood_planks);
            event.accept(ModBlocks.charwood_STAIRS);
            event.accept(ModBlocks.charwood_BUTTON);
            event.accept(ModBlocks.charwood_SLAB);
            event.accept(ModBlocks.charwood_DOOR);
            event.accept(ModBlocks.charwood_FENCE);
            event.accept(ModBlocks.charwood_FENCE_GATE);
            event.accept(ModBlocks.charwood_TRAPDOOR);
            event.accept(ModBlocks.charwood_PRESSURE_PLATE);
            event.accept(ModBlocks.charwood_WALL);
            event.accept(ModBlocks.moonwood_planks);
            event.accept(ModBlocks.moonwood_STAIRS);
            event.accept(ModBlocks.moonwood_BUTTON);
            event.accept(ModBlocks.moonwood_SLAB);
            event.accept(ModBlocks.moonwood_DOOR);
            event.accept(ModBlocks.moonwood_FENCE);
            event.accept(ModBlocks.moonwood_FENCE_GATE);
            event.accept(ModBlocks.moonwood_TRAPDOOR);
            event.accept(ModBlocks.moonwood_PRESSURE_PLATE);
            event.accept(ModBlocks.moonwood_WALL);
            event.accept(ModBlocks.BLUE_COBBLESTONE);
            event.accept(ModBlocks.GREEN_COBBLESTONE);
            event.accept(ModBlocks.LIGHT_BLUE_COBBLESTONE);
            event.accept(ModBlocks.ORANGE_COBBLESTONE);
            event.accept(ModBlocks.PINK_COBBLESTONE);
            event.accept(ModBlocks.PURPLE_COBBLESTONE);
            event.accept(ModBlocks.RED_COBBLESTONE);
            event.accept(ModBlocks.YELLOW_COBBLESTONE);
            event.accept(ModBlocks.BLUE_CALCITE);
            event.accept(ModBlocks.GREEN_CALCITE);
            event.accept(ModBlocks.ORANGE_CALCITE);
            event.accept(ModBlocks.PINK_CALCITE);
            event.accept(ModBlocks.PURPLE_CALCITE);
            event.accept(ModBlocks.RED_CALCITE);
            event.accept(ModBlocks.TEAL_CALCITE);
            event.accept(ModBlocks.YELLOW_CALCITE);
            event.accept(ModBlocks.GREEN_TUFF_BRICKS);
            event.accept(ModBlocks.LIGHT_BLUE_TUFF_BRICKS);
            event.accept(ModBlocks.ORANGE_TUFF_BRICKS);
            event.accept(ModBlocks.PINK_TUFF_BRICKS);
            event.accept(ModBlocks.PURPLE_TUFF_BRICKS);
            event.accept(ModBlocks.RED_TUFF_BRICKS);
            event.accept(ModBlocks.WHITE_TUFF_BRICKS);
            event.accept(ModBlocks.YELLOW_TUFF_BRICKS);
            event.accept(ModBlocks.BLUE_ENDSTONE);
            event.accept(ModBlocks.GREEN_ENDSTONE);
            event.accept(ModBlocks.ORANGE_ENDSTONE);
            event.accept(ModBlocks.PINK_ENDSTONE);
            event.accept(ModBlocks.PURPLE_ENDSTONE);
            event.accept(ModBlocks.RED_ENDSTONE);
            event.accept(ModBlocks.YELLOW_ENDSTONE);
            event.accept(ModBlocks.AMBERWOOD_HORIZONTAL_PLANKS);
            event.accept(ModBlocks.AMBERWWOOD_VERTICAL_PLANKS);
            event.accept(ModBlocks.ASHWOOD_HORIZONTAL_PLANKS);
            event.accept(ModBlocks.ASHWOOD_VERTICAL_PLANKS);
            event.accept(ModBlocks.CHARWOOD_HORIZONTAL_PLANKS);
            event.accept(ModBlocks.CHARWOOD_VERTICAL_PLANKS);
            event.accept(ModBlocks.EBONYWOOD_HORIZONTAL_PLANKS);
            event.accept(ModBlocks.EBONYWOOD_VERTICAL_PLANKS);
            event.accept(ModBlocks.LAVENDERWOOD_HORIZONTAL_PLANKS);
            event.accept(ModBlocks.LAVENDERWOOD_VERTICAL_PLANKS);
            event.accept(ModBlocks.LUMENWOOD_HORIZONTAL_PLANKS);
            event.accept(ModBlocks.LUMENWOOD_VERTICAL_PLANKS);
            event.accept(ModBlocks.MOONWOOD_HORIZONTAL_PLANKS);
            event.accept(ModBlocks.MOONWOOD_VERTICAL_PLANKS);
            event.accept(ModBlocks.STELLAR_SLATE_ANDESITE);
            event.accept(ModBlocks.STELLAR_SLATE_COBBLED_DEEPSLATE);
            event.accept(ModBlocks.STELLAR_SLATE_COBBLESTONE);
            event.accept(ModBlocks.STELLAR_SLATE_DEEPSLATE_BRICKS);
            event.accept(ModBlocks.STELLAR_SLATE_STONE);
            event.accept(ModBlocks.STELLAR_SLATE_STONE_BRICKS);
            event.accept(ModBlocks.BLUE_AMETHYST);
            event.accept(ModBlocks.GREEN_AMETHYST);
            event.accept(ModBlocks.LIGHT_BLUE_AMETHYST);
            event.accept(ModBlocks.ORANGE_AMETHYST);
            event.accept(ModBlocks.PINK_AMETHYST);
            event.accept(ModBlocks.RED_AMETHYST);
            event.accept(ModBlocks.YELLOW_AMETHYST);
            event.accept(ModBlocks.OVERGROWN_STONE);
            event.accept(ModBlocks.SNOW_STONE);
            event.accept(ModBlocks.SNOW_STONE_BRICKS);
            event.accept(ModBlocks.LIMESTONE);
            event.accept(ModBlocks.LIMESTONE_ANDESITE);
            event.accept(ModBlocks.LIMESTONE_BRICKS);
            event.accept(ModBlocks.LIMESTONE_COBBLED);
            event.accept(ModBlocks.LIMESTONE_POLISHED_ANDESITE);
            event.accept(ModBlocks.MULCH_DIRT);
            event.accept(ModBlocks.ROCKY_MOSS);
            event.accept(ModBlocks.PLASTER_BLOCK);
            event.accept(ModBlocks.PLASTER_BRICKS);
            event.accept(ModBlocks.BRICKS_WHITE_GROUT);
            event.accept(ModBlocks.BLUE_BRICKS);
            event.accept(ModBlocks.GREEN_BRICKS);
            event.accept(ModBlocks.LIGHT_BLUE_BRICKS);
            event.accept(ModBlocks.LIME_GREEN_BRICKS);
            event.accept(ModBlocks.ORANGE_BRICKS);
            event.accept(ModBlocks.PINK_BRICKS);
            event.accept(ModBlocks.PURPLE_BRICKS);
            event.accept(ModBlocks.RED_BRICKS);
            event.accept(ModBlocks.YELLOW_BRICKS);
            event.accept(ModBlocks.GILDED_STONE);
            event.accept(ModBlocks.GILDED_STONE_BRICKS);
            event.accept(ModBlocks.LAVENDERWOOD_LOG);
        }
        if (event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
            event.accept(ModBlocks.celestial_ore);
            event.accept(ModBlocks.celestial_deepslate_ore);
            event.accept(ModBlocks.molten_ore);
            event.accept(ModBlocks.fossilized_amber_ore);
            event.accept(ModBlocks.crimson_quartz_ore);
            event.accept(ModBlocks.starlite_ore);
            event.accept(ModBlocks.starlite_deepslate_ore);
            event.accept(ModBlocks.raw_mithril_block.get());
            event.accept(ModBlocks.mithril_ore.get());
            event.accept(ModBlocks.deepslate_mithril_ore.get());
        }
        if (event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(ModItems.Chisel.get());
            event.accept(ModItems.GEO_ANALYZER.get());
            event.accept(ModItems.TROWEL.get());
            event.accept(ModItems.TERRAINFLATTENINGTOOL.get());
            event.accept(ModItems.TerrainSmoother.get());
            event.accept(ModItems.CELESTIAL_SWORD.get());
            event.accept(ModItems.CELESTIAL_PICKAXE.get());
            event.accept(ModItems.CELESTIAL_AXE.get());
            event.accept(ModItems.CELESTIAL_SHOVEL.get());
            event.accept(ModItems.CELESTIAL_HOE.get());
            event.accept(ModItems.CELESTIAL_HAMMER.get());
            event.accept(ModItems.MOLTEN_SWORD.get());
            event.accept(ModItems.MOLTEN_PICKAXE.get());
            event.accept(ModItems.MOLTEN_AXE.get());
            event.accept(ModItems.MOLTEN_SHOVEL.get());
            event.accept(ModItems.MOLTEN_HOE.get());
            event.accept(ModItems.MEASUREMENT_TOOL.get());
            event.accept(ModItems.TIMBER_AXE.get());
            event.accept(ModItems.VOLCANIC_SWORD.get());
            event.accept(ModItems.VOLCANIC_PICKAXE.get());
            event.accept(ModItems.VOLCANIC_AXE.get());
            event.accept(ModItems.VOLCANIC_SHOVEL.get());
            event.accept(ModItems.VOLCANIC_HOE.get());
            event.accept(ModItems.Hazard_Alert.get());
            event.accept(ModItems.STARLITE_SWORD.get());
            event.accept(ModItems.STARLITE_PICKAXE.get());
            event.accept(ModItems.STARLITE_AXE.get());
            event.accept(ModItems.STARLITE_SHOVEL.get());
            event.accept(ModItems.STARLITE_HOE.get());
        }
        if (event.getTabKey() == CreativeModeTabs.COMBAT) {
            event.accept(ModItems.CELESTIAL_HELMET.get());
            event.accept(ModItems.CELESTIAL_CHESTPLATE.get());
            event.accept(ModItems.CELESTIAL_LEGGINGS.get());
            event.accept(ModItems.CELESTIAL_BOOTS.get());
            event.accept(ModItems.MOLTEN_HELMET.get());
            event.accept(ModItems.MOLTEN_CHESTPLATE.get());
            event.accept(ModItems.MOLTEN_LEGGINGS.get());
            event.accept(ModItems.MOLTEN_BOOTS.get());
            event.accept(ModItems.VOLCANIC_HELMET.get());
            event.accept(ModItems.VOLCANIC_CHESTPLATE.get());
            event.accept(ModItems.VOLCANIC_LEGGINGS.get());
            event.accept(ModItems.VOLCANIC_BOOTS.get());
            event.accept(ModItems.FOSSILIZED_AMBER_HELMET.get());
            event.accept(ModItems.FOSSILIZED_AMBER_CHESTPLATE.get());
            event.accept(ModItems.FOSSILIZED_AMBER_LEGGINGS.get());
            event.accept(ModItems.FOSSILIZED_AMBER_BOOTS.get());
        }
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // Server starting logic
    }

    @Mod.EventBusSubscriber(modid = ConstructPro.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            // Client setup code
        }
    }
}
