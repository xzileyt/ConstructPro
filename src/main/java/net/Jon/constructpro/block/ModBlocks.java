package net.Jon.constructpro.block;

import net.Jon.constructpro.ConstructPro;
import net.Jon.constructpro.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;


public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ConstructPro.MOD_ID);

    public static final RegistryObject<Block> celestial_block = registerBlock("celestial_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> crimson_quartz_block = registerBlock("crimson_quartz_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> fossilize_amber_block = registerBlock("fossilize_amber_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> crimson_quartz_ore = registerBlock("crimson_quartz_ore",
            () -> new DropExperienceBlock((UniformInt.of(2,4)),BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> starlite_ore = registerBlock("starlite_ore",
            () -> new DropExperienceBlock((UniformInt.of(1,1)),BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST_CLUSTER)));

    public static final RegistryObject<Block> starlite_deepslate_ore = registerBlock("starlite_deepslate_ore",
            () -> new DropExperienceBlock((UniformInt.of(1,1)),BlockBehaviour.Properties.of()
                    .strength(5f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST_CLUSTER)));

    public static final RegistryObject<Block> celestial_ore = registerBlock("celestial_ore",
            () -> new DropExperienceBlock((UniformInt.of(1,3)),BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> celestial_deepslate_ore = registerBlock("celestial_deepslate_ore",
            () -> new DropExperienceBlock((UniformInt.of(1,4)),BlockBehaviour.Properties.of()
                    .strength(5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> molten_ore = registerBlock("molten_ore",
            () -> new DropExperienceBlock((UniformInt.of(2,5)),BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> fossilized_amber_ore = registerBlock("fossilized_amber_ore",
            () -> new DropExperienceBlock((UniformInt.of(1,7)),BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops()));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
