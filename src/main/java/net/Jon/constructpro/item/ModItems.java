package net.Jon.constructpro.item;

import net.Jon.constructpro.ConstructPro;
import net.Jon.constructpro.item.custom.ChiselItem;
import net.Jon.constructpro.item.custom.GeoAnalyzer;
import net.Jon.constructpro.item.custom.TrowelItem;
import net.minecraft.network.chat.Component;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ConstructPro.MOD_ID);

    public static final RegistryObject<Item> starlite = ITEMS.register("starlite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CrimsonQuartz = ITEMS.register("crimsonquartz",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FossilizedAmber = ITEMS.register("fossilizedamber",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Celestial = ITEMS.register("celestial",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Molten = ITEMS.register("molten",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> raw_mithril_ore = ITEMS.register("raw_mithril_ore",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> mithril_ingot = ITEMS.register("mithril_ingot",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> Chisel = ITEMS.register("chisel",
            () -> new ChiselItem(new Item.Properties().durability(32)));
    public static final RegistryObject<Item> TROWEL = ITEMS.register("trowel",
            () -> new TrowelItem(new Item.Properties().stacksTo(1).durability(250)));
    public static final RegistryObject<Item> GEO_ANALYZER = ITEMS.register("geoanalyzer",
            () -> new GeoAnalyzer(new Item.Properties()));

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
