package net.Jon.constructpro.item;

import net.Jon.constructpro.ConstructPro;
import net.Jon.constructpro.item.custom.ChiselItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

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
    public static final RegistryObject<Item> Chisel = ITEMS.register("chisel",
            () -> new ChiselItem(new Item.Properties().durability(32)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
