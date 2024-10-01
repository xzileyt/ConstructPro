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
import net.Jon.constructpro.block.custom.BlueGlowstoneBlock;
import net.Jon.constructpro.block.custom.CyanGlowstoneBlock;
import net.Jon.constructpro.block.custom.GreenGlowstoneBlock;
import net.Jon.constructpro.block.custom.LightBlueGlowstoneBlock;
import net.Jon.constructpro.block.custom.PurpleGlowstoneBlock;
import net.Jon.constructpro.block.custom.RedGlowstoneBlock;


import java.util.function.Supplier;


public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ConstructPro.MOD_ID);

    // Ore Blocks
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

    public static final RegistryObject<Block> aetherium_block = registerBlock("aetherium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops()
                    .sound(SoundType.NETHERITE_BLOCK)));

    public static final RegistryObject<Block> glacialite_block = registerBlock("glacialite_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> necroite_block = registerBlock("necroite_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> pyroclast_block = registerBlock("pyroclast_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> solisite_block = registerBlock("solisite_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> volcanic_block = registerBlock("volcanic_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops()
                    .sound(SoundType.NETHERITE_BLOCK)));




    // Wood Building blocks
    // Lavenderwood
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

    // Amberwood
    public static final RegistryObject<Block> amberwood_planks = registerBlock("amberwood_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<StairBlock> amberwood_STAIRS = registerBlock("amberwood_stairs",
            () -> new StairBlock(ModBlocks.amberwood_planks.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<PressurePlateBlock> amberwood_PRESSURE_PLATE = registerBlock("amberwood_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<ButtonBlock> amberwood_BUTTON = registerBlock("amberwood_button",
            () -> new ButtonBlock(BlockSetType.OAK,1, BlockBehaviour.Properties.of().strength(3f)
                    .requiresCorrectToolForDrops().noCollission()));

    public static final RegistryObject<FenceBlock> amberwood_FENCE = registerBlock("amberwood_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<FenceGateBlock> amberwood_FENCE_GATE = registerBlock("amberwood_fence_gate",
            () -> new FenceGateBlock(WoodType.OAK, BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<WallBlock> amberwood_WALL = registerBlock("amberwood_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<DoorBlock> amberwood_DOOR = registerBlock("amberwood_door",
            () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().noOcclusion()));

    public static final RegistryObject<TrapDoorBlock> amberwood_TRAPDOOR = registerBlock("amberwood_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().noOcclusion()));

    public static final RegistryObject<SlabBlock> amberwood_SLAB = registerBlock("amberwood_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));

    // ashwood
    public static final RegistryObject<Block> ashwood_planks = registerBlock("ashwood_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<StairBlock> ashwood_STAIRS = registerBlock("ashwood_stairs",
            () -> new StairBlock(ModBlocks.ashwood_planks.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<PressurePlateBlock> ashwood_PRESSURE_PLATE = registerBlock("ashwood_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<ButtonBlock> ashwood_BUTTON = registerBlock("ashwood_button",
            () -> new ButtonBlock(BlockSetType.OAK,1, BlockBehaviour.Properties.of().strength(3f)
                    .requiresCorrectToolForDrops().noCollission()));

    public static final RegistryObject<FenceBlock> ashwood_FENCE = registerBlock("ashwood_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<FenceGateBlock> ashwood_FENCE_GATE = registerBlock("ashwood_fence_gate",
            () -> new FenceGateBlock(WoodType.OAK, BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<WallBlock> ashwood_WALL = registerBlock("ashwood_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<DoorBlock> ashwood_DOOR = registerBlock("ashwood_door",
            () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().noOcclusion()));

    public static final RegistryObject<TrapDoorBlock> ashwood_TRAPDOOR = registerBlock("ashwood_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().noOcclusion()));

    public static final RegistryObject<SlabBlock> ashwood_SLAB = registerBlock("ashwood_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));

    // lumenwood
    public static final RegistryObject<Block> lumenwood_planks = registerBlock("lumenwood_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<StairBlock> lumenwood_STAIRS = registerBlock("lumenwood_stairs",
            () -> new StairBlock(ModBlocks.lumenwood_planks.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<PressurePlateBlock> lumenwood_PRESSURE_PLATE = registerBlock("lumenwood_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<ButtonBlock> lumenwood_BUTTON = registerBlock("lumenwood_button",
            () -> new ButtonBlock(BlockSetType.OAK,1, BlockBehaviour.Properties.of().strength(3f)
                    .requiresCorrectToolForDrops().noCollission()));

    public static final RegistryObject<FenceBlock> lumenwood_FENCE = registerBlock("lumenwood_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<FenceGateBlock> lumenwood_FENCE_GATE = registerBlock("lumenwood_fence_gate",
            () -> new FenceGateBlock(WoodType.OAK, BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<WallBlock> lumenwood_WALL = registerBlock("lumenwood_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<DoorBlock> lumenwood_DOOR = registerBlock("lumenwood_door",
            () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().noOcclusion()));

    public static final RegistryObject<TrapDoorBlock> lumenwood_TRAPDOOR = registerBlock("lumenwood_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().noOcclusion()));

    public static final RegistryObject<SlabBlock> lumenwood_SLAB = registerBlock("lumenwood_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));

    // ebonywood
    public static final RegistryObject<Block> ebonywood_planks = registerBlock("ebonywood_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<StairBlock> ebonywood_STAIRS = registerBlock("ebonywood_stairs",
            () -> new StairBlock(ModBlocks.ebonywood_planks.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<PressurePlateBlock> ebonywood_PRESSURE_PLATE = registerBlock("ebonywood_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<ButtonBlock> ebonywood_BUTTON = registerBlock("ebonywood_button",
            () -> new ButtonBlock(BlockSetType.OAK,1, BlockBehaviour.Properties.of().strength(3f)
                    .requiresCorrectToolForDrops().noCollission()));

    public static final RegistryObject<FenceBlock> ebonywood_FENCE = registerBlock("ebonywood_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<FenceGateBlock> ebonywood_FENCE_GATE = registerBlock("ebonywood_fence_gate",
            () -> new FenceGateBlock(WoodType.OAK, BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<WallBlock> ebonywood_WALL = registerBlock("ebonywood_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<DoorBlock> ebonywood_DOOR = registerBlock("ebonywood_door",
            () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().noOcclusion()));

    public static final RegistryObject<TrapDoorBlock> ebonywood_TRAPDOOR = registerBlock("ebonywood_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().noOcclusion()));

    public static final RegistryObject<SlabBlock> ebonywood_SLAB = registerBlock("ebonywood_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));

    // charwood
    public static final RegistryObject<Block> charwood_planks = registerBlock("charwood_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<StairBlock> charwood_STAIRS = registerBlock("charwood_stairs",
            () -> new StairBlock(ModBlocks.charwood_planks.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<PressurePlateBlock> charwood_PRESSURE_PLATE = registerBlock("charwood_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<ButtonBlock> charwood_BUTTON = registerBlock("charwood_button",
            () -> new ButtonBlock(BlockSetType.OAK,1, BlockBehaviour.Properties.of().strength(3f)
                    .requiresCorrectToolForDrops().noCollission()));

    public static final RegistryObject<FenceBlock> charwood_FENCE = registerBlock("charwood_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<FenceGateBlock> charwood_FENCE_GATE = registerBlock("charwood_fence_gate",
            () -> new FenceGateBlock(WoodType.OAK, BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<WallBlock> charwood_WALL = registerBlock("charwood_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<DoorBlock> charwood_DOOR = registerBlock("charwood_door",
            () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().noOcclusion()));

    public static final RegistryObject<TrapDoorBlock> charwood_TRAPDOOR = registerBlock("charwood_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().noOcclusion()));

    public static final RegistryObject<SlabBlock> charwood_SLAB = registerBlock("charwood_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));

    // moonwood
    public static final RegistryObject<Block> moonwood_planks = registerBlock("moonwood_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<StairBlock> moonwood_STAIRS = registerBlock("moonwood_stairs",
            () -> new StairBlock(ModBlocks.moonwood_planks.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<PressurePlateBlock> moonwood_PRESSURE_PLATE = registerBlock("moonwood_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<ButtonBlock> moonwood_BUTTON = registerBlock("moonwood_button",
            () -> new ButtonBlock(BlockSetType.OAK,1, BlockBehaviour.Properties.of().strength(3f)
                    .requiresCorrectToolForDrops().noCollission()));

    public static final RegistryObject<FenceBlock> moonwood_FENCE = registerBlock("moonwood_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<FenceGateBlock> moonwood_FENCE_GATE = registerBlock("moonwood_fence_gate",
            () -> new FenceGateBlock(WoodType.OAK, BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<WallBlock> moonwood_WALL = registerBlock("moonwood_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<DoorBlock> moonwood_DOOR = registerBlock("moonwood_door",
            () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().noOcclusion()));

    public static final RegistryObject<TrapDoorBlock> moonwood_TRAPDOOR = registerBlock("moonwood_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().noOcclusion()));

    public static final RegistryObject<SlabBlock> moonwood_SLAB = registerBlock("moonwood_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops()));

    // Building blocks
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

    public static final RegistryObject<Block> BLUE_COBBLESTONE = registerBlock("blue_cobblestone",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> GREEN_COBBLESTONE = registerBlock("green_cobblestone",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> LIGHT_BLUE_COBBLESTONE = registerBlock("light_blue_cobblestone",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> ORANGE_COBBLESTONE = registerBlock("orange_cobblestone",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> PINK_COBBLESTONE = registerBlock("pink_cobblestone",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> PURPLE_COBBLESTONE = registerBlock("purple_cobblestone",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RED_COBBLESTONE = registerBlock("red_cobblestone",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> YELLOW_COBBLESTONE = registerBlock("yellow_cobblestone",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BLUE_CALCITE = registerBlock("blue_calcite",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> GREEN_CALCITE = registerBlock("green_calcite",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> ORANGE_CALCITE = registerBlock("orange_calcite",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> PINK_CALCITE = registerBlock("pink_calcite",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> PURPLE_CALCITE = registerBlock("purple_calcite",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RED_CALCITE = registerBlock("red_calcite",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> TEAL_CALCITE = registerBlock("teal_calcite",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> YELLOW_CALCITE = registerBlock("yellow_calcite",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> GREEN_TUFF_BRICKS = registerBlock("green_tuff_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> LIGHT_BLUE_TUFF_BRICKS = registerBlock("light_blue_tuff_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> ORANGE_TUFF_BRICKS = registerBlock("orange_tuff_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> PINK_TUFF_BRICKS = registerBlock("pink_tuff_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> PURPLE_TUFF_BRICKS = registerBlock("purple_tuff_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RED_TUFF_BRICKS = registerBlock("red_tuff_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> WHITE_TUFF_BRICKS = registerBlock("white_tuff_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> YELLOW_TUFF_BRICKS = registerBlock("yellow_tuff_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BLUE_ENDSTONE = registerBlock("blue_endstone",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3.0f, 9.0f)
                    .requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> GREEN_ENDSTONE = registerBlock("green_endstone",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3.0f, 9.0f)
                    .requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> ORANGE_ENDSTONE = registerBlock("orange_endstone",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3.0f, 9.0f)
                    .requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> PINK_ENDSTONE = registerBlock("pink_endstone",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3.0f, 9.0f)
                    .requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> PURPLE_ENDSTONE = registerBlock("purple_endstone",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3.0f, 9.0f)
                    .requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RED_ENDSTONE = registerBlock("red_endstone",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3.0f, 9.0f)
                    .requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> YELLOW_ENDSTONE = registerBlock("yellow_endstone",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3.0f, 9.0f)
                    .requiresCorrectToolForDrops()));


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

    public static final RegistryObject<Block> BLUE_GLOWSTONE = registerBlock("blue_glowstone",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.5f)
                    .lightLevel(state -> 15)
                    .noOcclusion()
                    .sound(SoundType.GLASS)));

    public static final RegistryObject<Block> CYAN_GLOWSTONE = registerBlock("cyan_glowstone",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.5f)
                    .lightLevel(state -> 15)
                    .noOcclusion()
                    .sound(SoundType.GLASS)));

    public static final RegistryObject<Block> GREEN_GLOWSTONE = registerBlock("green_glowstone",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.5f)
                    .lightLevel(state -> 15)
                    .noOcclusion()
                    .sound(SoundType.GLASS)));

    public static final RegistryObject<Block> LIGHT_BLUE_GLOWSTONE = registerBlock("light_blue_glowstone",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.5f)
                    .lightLevel(state -> 15)
                    .noOcclusion()
                    .sound(SoundType.GLASS)));

    public static final RegistryObject<Block> PURPLE_GLOWSTONE = registerBlock("purple_glowstone",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.5f)
                    .lightLevel(state -> 15)
                    .noOcclusion()
                    .sound(SoundType.GLASS)));

    public static final RegistryObject<Block> RED_GLOWSTONE = registerBlock("red_glowstone",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.5f)
                    .lightLevel(state -> 15)
                    .noOcclusion()
                    .sound(SoundType.GLASS)));



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

    public static final RegistryObject<Block> aetherium_ore = registerBlock("aetherium_ore",
            () -> new DropExperienceBlock((UniformInt.of(1,1)),BlockBehaviour.Properties.of()
                    .strength(5f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST_CLUSTER)));
    public static final RegistryObject<Block> deppslate_aetherium_ore = registerBlock("deepslate_aetherium_ore",
            () -> new DropExperienceBlock((UniformInt.of(1,1)),BlockBehaviour.Properties.of()
                    .strength(5f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST_CLUSTER)));

    public static final RegistryObject<Block> glacialite_ore = registerBlock("glacialite_ore",
            () -> new DropExperienceBlock((UniformInt.of(1,2)),BlockBehaviour.Properties.of()
                    .strength(5f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST_CLUSTER)));
    public static final RegistryObject<Block> deppslate_glacialite_ore = registerBlock("deepslate_glacialite_ore",
            () -> new DropExperienceBlock((UniformInt.of(1,2)),BlockBehaviour.Properties.of()
                    .strength(5f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST_CLUSTER)));

    public static final RegistryObject<Block> pyroclast_ore = registerBlock("pyroclast_ore",
            () -> new DropExperienceBlock((UniformInt.of(1,2)),BlockBehaviour.Properties.of()
                    .strength(5f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST_CLUSTER)));
    public static final RegistryObject<Block> deppslate_pyroclast_ore = registerBlock("deepslate_pyroclast_ore",
            () -> new DropExperienceBlock((UniformInt.of(1,2)),BlockBehaviour.Properties.of()
                    .strength(5f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST_CLUSTER)));

    public static final RegistryObject<Block> necroite_ore = registerBlock("necroite_ore",
            () -> new DropExperienceBlock((UniformInt.of(1,2)),BlockBehaviour.Properties.of()
                    .strength(5f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST_CLUSTER)));
    public static final RegistryObject<Block> deppslate_necroite_ore = registerBlock("deepslate_necroite_ore",
            () -> new DropExperienceBlock((UniformInt.of(1,2)),BlockBehaviour.Properties.of()
                    .strength(5f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST_CLUSTER)));

    public static final RegistryObject<Block> solisite_ore = registerBlock("solisite_ore",
            () -> new DropExperienceBlock((UniformInt.of(1,2)),BlockBehaviour.Properties.of()
                    .strength(5f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST_CLUSTER)));
    public static final RegistryObject<Block> deppslate_solisite_ore = registerBlock("deepslate_solisite_ore",
            () -> new DropExperienceBlock((UniformInt.of(1,2)),BlockBehaviour.Properties.of()
                    .strength(5f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST_CLUSTER)));

    public static final RegistryObject<Block> volcanic_ore = registerBlock("volcanic_ore",
            () -> new DropExperienceBlock((UniformInt.of(1,1)),BlockBehaviour.Properties.of()
                    .strength(5f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST_CLUSTER)));
    public static final RegistryObject<Block> deppslate_volcanic_ore = registerBlock("deepslate_volcanic_ore",
            () -> new DropExperienceBlock((UniformInt.of(1,1)),BlockBehaviour.Properties.of()
                    .strength(5f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST_CLUSTER)));

    public static final RegistryObject<Block> raw_pyroclast_block = registerBlock("raw_pyroclast_block",
            () -> new DropExperienceBlock((UniformInt.of(1,7)),BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> raw_volcanic_block = registerBlock("raw_volcanic_block",
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