package net.Jon.constructpro;

import com.mojang.logging.LogUtils;
import net.Jon.constructpro.block.ModBlocks;
import net.Jon.constructpro.component.ModDataComponentTypes;
import net.Jon.constructpro.item.ModCreativeModeTabs;
import net.Jon.constructpro.item.ModItems;
// Added this import statement for ModArmorMaterials
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

    private void commonSetup(final FMLCommonSetupEvent event) {
        // Common setup code
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        // Add items to creative tabs
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.starlite);
            event.accept(ModItems.CrimsonQuartz);
            event.accept(ModItems.FossilizedAmber);
            event.accept(ModItems.CELESTIAL);
            event.accept(ModItems.Molten);
            event.accept(ModItems.raw_mithril_ore);
            event.accept(ModItems.mithril_ingot);
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
            event.accept(ModItems.TerrainLeveler.get());
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
