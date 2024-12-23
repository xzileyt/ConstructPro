package net.Jon.constructpro.item;

import net.Jon.constructpro.ConstructPro;
import net.Jon.constructpro.block.ModBlocks;
import net.Jon.constructpro.item.custom.*;
import net.Jon.constructpro.util.ModTags;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
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
    public static final RegistryObject<Item> raw_pyroclast_ore = ITEMS.register("raw_pyroclast_ore",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> pyroclast_ingot = ITEMS.register("pyroclast_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> raw_aetherium_ore = ITEMS.register("raw_aetherium_ore",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> aetherium_ingot = ITEMS.register("aetherium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> raw_glacialite_ore = ITEMS.register("raw_glacialite_ore",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> glacialite_ingot = ITEMS.register("glacialite_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> raw_necroite_ore = ITEMS.register("raw_necroite_ore",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> necroite_ingot = ITEMS.register("necroite_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> raw_solisite_ore = ITEMS.register("raw_solisite_ore",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> solisite_ingot = ITEMS.register("solisite_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> volcanic_scrap = ITEMS.register("volcanic_scrap",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> raw_volcanic_ore = ITEMS.register("raw_volcanic_ore",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> volcanic_ingot = ITEMS.register("volcanic_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STARLITE_DUST = ITEMS.register("starlite_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STARLITE = ITEMS.register("starlite",
            () -> new Item(new Item.Properties()));

    // Tools
    public static final RegistryObject<Item> Chisel = ITEMS.register("chisel",
            () -> new ChiselItem(new Item.Properties().stacksTo(1).durability(32)));
    public static final RegistryObject<Item> TROWEL = ITEMS.register("trowel",
            () -> new TrowelItem(new Item.Properties().stacksTo(1).durability(250)));
    public static final RegistryObject<Item> GEO_ANALYZER = ITEMS.register("geoanalyzer",
            () -> new GeoAnalyzer(new Item.Properties().stacksTo(1).durability(255)));
    public static final RegistryObject<Item> TERRAINFLATTENINGTOOL = ITEMS.register("terrainflatteningtool",
            () -> new TerrainFlatteningTool(new Item.Properties().stacksTo(1).durability(2031)));
    public static final RegistryObject<Item> TerrainSmoother = ITEMS.register("terrain_smoother",
            () -> new ItemLandSmoother(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> MEASUREMENT_TOOL = ITEMS.register("measurement_tool",
            () -> new MeasurementTool(new Item.Properties().stacksTo(1).durability(250)));
    public static final RegistryObject<Item> TIMBER_AXE = ITEMS.register("timber_axe",
            () -> new AxeItem(ModToolTiers.Molten, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.Molten, 7, -3.0f))));
    public static final RegistryObject<Item> Hazard_Alert = ITEMS.register("hazard_alert",
            () -> new HazardAlertItem(new Item.Properties().stacksTo(1).durability(255)));
    public static final RegistryObject<Item> PATTERN_STENCIL = ITEMS.register("pattern_stencil",
            () -> new PatternStencil(new Item.Properties().stacksTo(1).durability(500)));
    public static final RegistryObject<Item> TIME_SHIFTER = ITEMS.register("time_shifter",
            () -> new TimeShifter(new Item.Properties().stacksTo(1), 1000));
    public static final RegistryObject<Item> COMPRESSION_TOOL = ITEMS.register("compression_tool",
            () -> new Item(new Item.Properties().stacksTo(1).durability(1500)));
    public static final RegistryObject<Item> BLOCK_POLISHER = ITEMS.register("block_polisher",
            () -> new BlockPolisher(new Item.Properties().stacksTo(1).durability(750)));

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
    public static final RegistryObject<Item> CELESTIAL_BOW = ITEMS.register("celestial_bow",
            () -> new BowItem(new Item.Properties().stacksTo(1).durability(500)));

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

    // Volcanic tools
    public static final RegistryObject<Item> VOLCANIC_SWORD = ITEMS.register("volcanic_sword",
            () -> new SwordItem(ModToolTiers.Volcanic, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.Volcanic, 6, -2.0f)))); // Better attack damage
    public static final RegistryObject<Item> VOLCANIC_PICKAXE = ITEMS.register("volcanic_pickaxe",
            () -> new PickaxeItem(ModToolTiers.Volcanic, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.Volcanic, 3, -2.3f)))); // Better efficiency
    public static final RegistryObject<Item> VOLCANIC_AXE = ITEMS.register("volcanic_axe",
            () -> new AxeItem(ModToolTiers.Volcanic, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.Volcanic, 8, -3.0f)))); // Higher attack damage
    public static final RegistryObject<Item> VOLCANIC_SHOVEL = ITEMS.register("volcanic_shovel",
            () -> new ShovelItem(ModToolTiers.Volcanic, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.Volcanic, 2.5f, -2.5f)))); // Better attack damage and speed
    public static final RegistryObject<Item> VOLCANIC_HOE = ITEMS.register("volcanic_hoe",
            () -> new HoeItem(ModToolTiers.Volcanic, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.Volcanic, 2, -2.6f)))); // Higher attack damage

    // Starlite tools
    public static final RegistryObject<Item> STARLITE_SWORD = ITEMS.register("starlite_sword",
            () -> new SwordItem(ModToolTiers.STARLITE, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.STARLITE, 8, -1.9f))));
    public static final RegistryObject<Item> STARLITE_AXE = ITEMS.register("starlite_axe",
            () -> new AxeItem(ModToolTiers.STARLITE, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.STARLITE, 10, -2.0f))));
    public static final RegistryObject<Item> STARLITE_PICKAXE = ITEMS.register("starlite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.STARLITE, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.STARLITE, 3.5f, -2.3f))));
    public static final RegistryObject<Item> STARLITE_SHOVEL = ITEMS.register("starlite_shovel",
            () -> new ShovelItem(ModToolTiers.STARLITE, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.STARLITE, 3.0f, -2.0f))));
    public static final RegistryObject<Item> STARLITE_HOE = ITEMS.register("starlite_hoe",
            () -> new HoeItem(ModToolTiers.STARLITE, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.STARLITE, 2, -2.0f))));

    // AETHERIUM tools
    public static final RegistryObject<Item> AETHERIUM_SWORD = ITEMS.register("aetherium_sword",
            () -> new SwordItem(ModToolTiers.AETHERIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.AETHERIUM, 8, -1.9f))));
    public static final RegistryObject<Item> AETHERIUM_AXE = ITEMS.register("aetherium_axe",
            () -> new AxeItem(ModToolTiers.AETHERIUM, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.AETHERIUM, 10, -2.0f))));
    public static final RegistryObject<Item> AETHERIUM_PICKAXE = ITEMS.register("aetherium_pickaxe",
            () -> new PickaxeItem(ModToolTiers.AETHERIUM, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.AETHERIUM, 3.5f, -2.3f))));
    public static final RegistryObject<Item> AETHERIUM_SHOVEL = ITEMS.register("aetherium_shovel",
            () -> new ShovelItem(ModToolTiers.AETHERIUM, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.AETHERIUM, 3.0f, -2.0f))));
    public static final RegistryObject<Item> AETHERIUM_HOE = ITEMS.register("aetherium_hoe",
            () -> new HoeItem(ModToolTiers.AETHERIUM, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.AETHERIUM, 2, -2.0f))));

    // SOLISITE tools
    public static final RegistryObject<Item> SOLISITE_SWORD = ITEMS.register("solisite_sword",
            () -> new SwordItem(ModToolTiers.SOLISITE, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.SOLISITE, 8, -1.9f))));
    public static final RegistryObject<Item> SOLISITE_AXE = ITEMS.register("solisite_axe",
            () -> new AxeItem(ModToolTiers.SOLISITE, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.SOLISITE, 10, -2.0f))));
    public static final RegistryObject<Item> SOLISITE_PICKAXE = ITEMS.register("solisite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SOLISITE, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.SOLISITE, 3.5f, -2.3f))));
    public static final RegistryObject<Item> SOLISITE_SHOVEL = ITEMS.register("solisite_shovel",
            () -> new ShovelItem(ModToolTiers.SOLISITE, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.SOLISITE, 3.0f, -2.0f))));
    public static final RegistryObject<Item> SOLISITE_HOE = ITEMS.register("solisite_hoe",
            () -> new HoeItem(ModToolTiers.SOLISITE, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.SOLISITE, 2, -2.0f))));

    
    // Armor
    public static final RegistryObject<Item> FOSSILIZED_AMBER_HELMET = ITEMS.register("fossilized_amber_helmet",
            () -> new ModArmorItem(ModArmorMaterials.FOSSILIZED_AMBER_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(20))));
    public static final RegistryObject<Item> FOSSILIZED_AMBER_CHESTPLATE = ITEMS.register("fossilized_amber_chestplate",
            () -> new ArmorItem(ModArmorMaterials.FOSSILIZED_AMBER_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(20))));
    public static final RegistryObject<Item> FOSSILIZED_AMBER_LEGGINGS = ITEMS.register("fossilized_amber_leggings",
            () -> new ArmorItem(ModArmorMaterials.FOSSILIZED_AMBER_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(20))));
    public static final RegistryObject<Item> FOSSILIZED_AMBER_BOOTS = ITEMS.register("fossilized_amber_boots",
            () -> new ArmorItem(ModArmorMaterials.FOSSILIZED_AMBER_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(20))));

    public static final RegistryObject<Item> CELESTIAL_HELMET = ITEMS.register("celestial_helmet",
            () -> new ModArmorItem(ModArmorMaterials.CELESTIAL_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(33))));
    public static final RegistryObject<Item> CELESTIAL_CHESTPLATE = ITEMS.register("celestial_chestplate",
            () -> new ArmorItem(ModArmorMaterials.CELESTIAL_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(33))));
    public static final RegistryObject<Item> CELESTIAL_LEGGINGS = ITEMS.register("celestial_leggings",
            () -> new ArmorItem(ModArmorMaterials.CELESTIAL_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(33))));
    public static final RegistryObject<Item> CELESTIAL_BOOTS = ITEMS.register("celestial_boots",
            () -> new ArmorItem(ModArmorMaterials.CELESTIAL_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(33))));

    public static final RegistryObject<Item> MOLTEN_HELMET = ITEMS.register("molten_helmet",
            () -> new ModArmorItem(ModArmorMaterials.MOLTEN_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().fireResistant().durability(ArmorItem.Type.HELMET.getDurability(37))));
    public static final RegistryObject<Item> MOLTEN_CHESTPLATE = ITEMS.register("molten_chestplate",
            () -> new ArmorItem(ModArmorMaterials.MOLTEN_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().fireResistant().durability(ArmorItem.Type.CHESTPLATE.getDurability(37))));
    public static final RegistryObject<Item> MOLTEN_LEGGINGS = ITEMS.register("molten_leggings",
            () -> new ArmorItem(ModArmorMaterials.MOLTEN_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().fireResistant().durability(ArmorItem.Type.LEGGINGS.getDurability(37))));
    public static final RegistryObject<Item> MOLTEN_BOOTS = ITEMS.register("molten_boots",
            () -> new ArmorItem(ModArmorMaterials.MOLTEN_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().fireResistant().durability(ArmorItem.Type.BOOTS.getDurability(37))));

    public static final RegistryObject<Item> VOLCANIC_HELMET = ITEMS.register("volcanic_helmet",
            () -> new ModArmorItem(ModArmorMaterials.VOOLCANIC_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().fireResistant().durability(ArmorItem.Type.HELMET.getDurability(55))));
    public static final RegistryObject<Item> VOLCANIC_CHESTPLATE = ITEMS.register("volcanic_chestplate",
            () -> new ArmorItem(ModArmorMaterials.VOOLCANIC_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().fireResistant().durability(ArmorItem.Type.CHESTPLATE.getDurability(55))));
    public static final RegistryObject<Item> VOLCANIC_LEGGINGS = ITEMS.register("volcanic_leggings",
            () -> new ArmorItem(ModArmorMaterials.VOOLCANIC_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().fireResistant().durability(ArmorItem.Type.LEGGINGS.getDurability(55))));
    public static final RegistryObject<Item> VOLCANIC_BOOTS = ITEMS.register("volcanic_boots",
            () -> new ArmorItem(ModArmorMaterials.VOOLCANIC_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().fireResistant().durability(ArmorItem.Type.BOOTS.getDurability(55))));

    public static final RegistryObject<Item> STARLITE_HELMET = ITEMS.register("starlite_helmet",
            () -> new ModArmorItem(ModArmorMaterials.STARLITE_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().fireResistant().durability(ArmorItem.Type.HELMET.getDurability(60))));
    public static final RegistryObject<Item> STARLITE_CHESTPLATE = ITEMS.register("starlite_chestplate",
            () -> new ArmorItem(ModArmorMaterials.STARLITE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().fireResistant().durability(ArmorItem.Type.CHESTPLATE.getDurability(60))));
    public static final RegistryObject<Item> STARLITE_LEGGINGS = ITEMS.register("starlite_leggings",
            () -> new ArmorItem(ModArmorMaterials.STARLITE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().fireResistant().durability(ArmorItem.Type.LEGGINGS.getDurability(60))));
    public static final RegistryObject<Item> STARLITE_BOOTS = ITEMS.register("starlite_boots",
            () -> new ArmorItem(ModArmorMaterials.STARLITE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().fireResistant().durability(ArmorItem.Type.BOOTS.getDurability(60))));

    public static final RegistryObject<Item> AETHERIUM_HELMET = ITEMS.register("aetherium_helmet",
            () -> new ModArmorItem(ModArmorMaterials.AETHERIUM_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().fireResistant().durability(ArmorItem.Type.HELMET.getDurability(25))));
    public static final RegistryObject<Item> AETHERIUM_CHESTPLATE = ITEMS.register("aetherium_chestplate",
            () -> new ArmorItem(ModArmorMaterials.AETHERIUM_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().fireResistant().durability(ArmorItem.Type.CHESTPLATE.getDurability(25))));
    public static final RegistryObject<Item> AETHERIUM_LEGGINGS = ITEMS.register("aetherium_leggings",
            () -> new ArmorItem(ModArmorMaterials.AETHERIUM_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().fireResistant().durability(ArmorItem.Type.LEGGINGS.getDurability(25))));
    public static final RegistryObject<Item> AETHERIUM_BOOTS = ITEMS.register("aetherium_boots",
            () -> new ArmorItem(ModArmorMaterials.AETHERIUM_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().fireResistant().durability(ArmorItem.Type.BOOTS.getDurability(25))));

    public static final RegistryObject<Item> SOLISITE_HELMET = ITEMS.register("solisite_helmet",
            () -> new ModArmorItem(ModArmorMaterials.SOLISITE_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().fireResistant().durability(ArmorItem.Type.HELMET.getDurability(23))));
    public static final RegistryObject<Item> SOLISITE_CHESTPLATE = ITEMS.register("solisite_chestplate",
            () -> new ArmorItem(ModArmorMaterials.SOLISITE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().fireResistant().durability(ArmorItem.Type.CHESTPLATE.getDurability(23))));
    public static final RegistryObject<Item> SOLISITE_LEGGINGS = ITEMS.register("solisite_leggings",
            () -> new ArmorItem(ModArmorMaterials.SOLISITE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().fireResistant().durability(ArmorItem.Type.LEGGINGS.getDurability(23))));
    public static final RegistryObject<Item> SOLISITE_BOOTS = ITEMS.register("solisite_boots",
            () -> new ArmorItem(ModArmorMaterials.SOLISITE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().fireResistant().durability(ArmorItem.Type.BOOTS.getDurability(23))));

    // Mob Armor
    public static final RegistryObject<Item> CELESTIAL_HORSE_ARMOR = ITEMS.register("celestial_horse_armor",
            () -> new AnimalArmorItem(ModArmorMaterials.CELESTIAL_ARMOR_MATERIAL, AnimalArmorItem.BodyType.EQUESTRIAN,
                    false, new Item.Properties().stacksTo(1)));

    // Wood Logs



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