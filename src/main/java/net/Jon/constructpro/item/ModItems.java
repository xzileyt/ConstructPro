package net.Jon.constructpro.item;

import net.Jon.constructpro.ConstructPro;
import net.Jon.constructpro.item.custom.*;
import net.Jon.constructpro.util.ModTags;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Properties;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ConstructPro.MOD_ID);

    // Ore
    public static final RegistryObject<Item> starlite = ITEMS.register("starlite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CrimsonQuartz = ITEMS.register("crimsonquartz",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FossilizedAmber = ITEMS.register("fossilizedamber",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CELESTIAL = ITEMS.register("celestial",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Molten = ITEMS.register("molten",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> raw_mithril_ore = ITEMS.register("raw_mithril_ore",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> mithril_ingot = ITEMS.register("mithril_ingot",
            () -> new Item(new Item.Properties()));

    // Tools
    public static final RegistryObject<Item> Chisel = ITEMS.register("chisel",
            () -> new ChiselItem(new Item.Properties().durability(32)));
    public static final RegistryObject<Item> TROWEL = ITEMS.register("trowel",
            () -> new TrowelItem(new Item.Properties().stacksTo(1).durability(250)));
    public static final RegistryObject<Item> GEO_ANALYZER = ITEMS.register("geoanalyzer",
            () -> new GeoAnalyzer(new Item.Properties()));
    public static final RegistryObject<Item> TerrainLeveler = ITEMS.register("terrain_leveler",
            () -> new TerrainLeveler(new Item.Properties()));
    public static final RegistryObject<Item> TerrainSmoother = ITEMS.register("terrain_smoother",
            () -> new ItemLandSmoother(new Item.Properties()));
    public static final RegistryObject<Item> MEASUREMENT_TOOL = ITEMS.register("measurement_tool",
            () -> new MeasurementTool(new Item.Properties()));

    // Celestial tools
    public static final RegistryObject<Item> CELESTIAL_SWORD = ITEMS.register("celestial_sword",
            () -> new SwordItem(ModToolTiers.CELESTIAL, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.CELESTIAL, 3, -2.4f))));
    public static final RegistryObject<Item> CELESTIAL_PICKAXE = ITEMS.register("celestial_pickaxe",
            () -> new PickaxeItem(ModToolTiers.CELESTIAL, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.CELESTIAL, 1, -2.8f))));
    public static final RegistryObject<Item> CELESTIAL_SHOVEL = ITEMS.register("celestial_shovel",
            () -> new ShovelItem(ModToolTiers.CELESTIAL, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.CELESTIAL, 1.5f, -3.0f))));
    public static final RegistryObject<Item> CELESTIAL_AXE = ITEMS.register("celestial_axe",
            () -> new AxeItem(ModToolTiers.CELESTIAL, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.CELESTIAL, 6, -3.2f))));
    public static final RegistryObject<Item> CELESTIAL_HOE = ITEMS.register("celestial_hoe",
            () -> new HoeItem(ModToolTiers.CELESTIAL, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.CELESTIAL, 0, -3.0f))));
    public static final RegistryObject<Item> CELESTIAL_HAMMER = ITEMS.register("celestial_hammer",
            () -> new HammerItem(ModToolTiers.CELESTIAL, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.CELESTIAL, 7, -3.5f))));

    // Molten tools
    public static final RegistryObject<Item> MOLTEN_SWORD = ITEMS.register("molten_sword",
            () -> new SwordItem(ModToolTiers.Molten, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.Molten, 4, -2.2f))));
    public static final RegistryObject<Item> MOLTEN_PICKAXE = ITEMS.register("molten_pickaxe",
            () -> new PickaxeItem(ModToolTiers.Molten, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.Molten, 2, -2.4f))));
    public static final RegistryObject<Item> MOLTEN_AXE = ITEMS.register("molten_axe",
            () -> new AxeItem(ModToolTiers.Molten, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.Molten, 7, -3f))));
    public static final RegistryObject<Item> MOLTEN_SHOVEL = ITEMS.register("molten_shovel",
            () -> new ShovelItem(ModToolTiers.Molten, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.Molten, 1.7f, -2.8f))));
    public static final RegistryObject<Item> MOLTEN_HOE = ITEMS.register("molten_hoe",
            () -> new HoeItem(ModToolTiers.Molten, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.Molten, 1, -2.7f))));


    // Armor





    // Food items
    public static final RegistryObject<Item> ETERNAL_STEAK = ITEMS.register("eternal_steak",
            () -> new EternalSteakItem(new Item.Properties().stacksTo(1).food(
                    new FoodProperties.Builder()
                            .nutrition(8) // Same as regular steak
                            .saturationModifier(0.8F) // Same as regular steak
                            .build())));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}