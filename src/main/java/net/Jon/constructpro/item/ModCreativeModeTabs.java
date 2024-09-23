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
                        output.accept(ModItems.Celestial.get());
                        output.accept(ModItems.CrimsonQuartz.get());
                        output.accept(ModItems.Molten.get());
                        output.accept(ModItems.FossilizedAmber.get());
                        output.accept(ModItems.starlite.get());

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

                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
