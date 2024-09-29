package net.Jon.constructpro.block;

import net.Jon.constructpro.ConstructPro;
import net.Jon.constructpro.block.custom.PurpleLampBlock;
import net.Jon.constructpro.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;



import java.util.function.Supplier;


public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ConstructPro.MOD_ID);

    // Blocks
    public static final RegistryObject<Block> celestial_block = registerBlock("celestial_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> crimson_quartz_block = registerBlock("crimson_quartz_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> fossilize_amber_block = registerBlock("fossilize_amber_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> mithril_block = registerBlock("mithril_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops()));

    // Building blocks
    public static final RegistryObject<Block> lavenderwood_planks = registerBlock("lavenderwood_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<StairBlock> LAVENDER_STAIRS = registerBlock("lavenderwood_stairs",
            () -> new StairBlock(ModBlocks.lavenderwood_planks.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<PressurePlateBlock> LAVENDERWOOD_PRESSURE_PLATE = registerBlock("lavenderwood_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<ButtonBlock> LAVENDERWOOD_BUTTON = registerBlock("lavenderwood_button",
            () -> new ButtonBlock(BlockSetType.OAK,1, BlockBehaviour.Properties.of().strength(3f)
                    .requiresCorrectToolForDrops().noCollission()));

    public static final RegistryObject<FenceBlock> LAVENDERWOOD_FENCE = registerBlock("lavenderwood_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<FenceGateBlock> LAVENDERWOOD_FENCE_GATE = registerBlock("lavenderwood_fence_gate",
            () -> new FenceGateBlock(WoodType.OAK, BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<WallBlock> LAVENDERWOOD_WALL = registerBlock("lavenderwood_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<DoorBlock> LAVENDERWOOD_DOOR = registerBlock("lavenderwood_door",
            () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().noOcclusion()));

    public static final RegistryObject<TrapDoorBlock> LAVENDERWOOD_TRAPDOOR = registerBlock("lavenderwood_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().noOcclusion()));

    public static final RegistryObject<SlabBlock> LAVENDERWOOD_SLAB = registerBlock("lavenderwood_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BLACK_TUFF = registerBlock("black_tuff",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BLUE_MUSHROOM_BLOCK = registerBlock("blue_mushroom_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BROWN_MUSHROOM_BLOCK = registerBlock("brown_mushroom_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CYAN_MUSHROOM_BLOCK = registerBlock("cyan_mushroom_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> GREEN_MUSHROOM_BLOCK = registerBlock("green_mushroom_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> LIGHT_BLUE_MUSHROOM_BLOCK = registerBlock("light_blue_mushroom_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> LIME_MUSHROOM_BLOCK = registerBlock("lime_mushroom_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> ORANGE_MUSHROOM_BLOCK = registerBlock("orange_mushroom_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> PINK_MUSHROOM_BLOCK = registerBlock("pink_mushroom_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> PURPLE_MUSHROOM_BLOCK = registerBlock("purple_mushroom_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> YELLOW_MUSHROOM_BLOCK = registerBlock("yellow_mushroom_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COPPER_ANDESITE = registerBlock("copper_andesite",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> GREEN_TUFF = registerBlock("green_tuff",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> DARK_CALCITE = registerBlock("dark_calcite",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops()));


    // Light Blocks
    public static final RegistryObject<Block> PURPLE_LAMP = registerBlock("purple_lamp",
            () -> new PurpleLampBlock(BlockBehaviour.Properties.of().strength(3f)
                    .lightLevel(state -> state.getValue(PurpleLampBlock.CLICKED) ? 15 : 0)));

    public static final RegistryObject<Block> GREEN_GEM_BLOCK = registerBlock("green_gem_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.3f)
                    .lightLevel(state -> 15)
                    .noOcclusion()
                    .sound(SoundType.AMETHYST)));

    public static final RegistryObject<Block> ORANGE_GEM_BLOCK = registerBlock("orange_gem_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.3f)
                    .lightLevel(state -> 15)
                    .noOcclusion()
                    .sound(SoundType.AMETHYST)));

    public static final RegistryObject<Block> PURPLE_GEM_BLOCK = registerBlock("purple_gem_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.3f)
                    .lightLevel(state -> 15)
                    .noOcclusion()
                    .sound(SoundType.AMETHYST)));

    public static final RegistryObject<Block> YELLOW_GEM_BLOCK = registerBlock("yellow_gem_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.3f)
                    .lightLevel(state -> 15)
                    .noOcclusion()
                    .sound(SoundType.AMETHYST)));

    public static final RegistryObject<Block> RED_GEM_BLOCK = registerBlock("red_gem_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.3f)
                    .lightLevel(state -> 15)
                    .noOcclusion()
                    .sound(SoundType.AMETHYST)));

    public static final RegistryObject<Block> TEAL_GEM_BLOCK = registerBlock("teal_gem_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.3f)
                    .lightLevel(state -> 15)
                    .noOcclusion()
                    .sound(SoundType.AMETHYST)));






    // Ores
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

    public static final RegistryObject<Block> raw_mithril_block = registerBlock("raw_mithril_block",
            () -> new DropExperienceBlock((UniformInt.of(1,7)),BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> mithril_ore = registerBlock("mithril_ore",
            () -> new DropExperienceBlock((UniformInt.of(1,7)),BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> deepslate_mithril_ore = registerBlock("deepslate_mithril_ore",
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