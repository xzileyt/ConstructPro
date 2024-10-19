package net.Jon.constructpro.datagen;

import net.Jon.constructpro.ConstructPro;
import net.Jon.constructpro.block.ModBlocks;
import net.Jon.constructpro.item.ModItems;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(pOutput, pRegistries);
    }

    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput) {
        List<ItemLike> MITHRIL_SMELTABLES = List.of(ModItems.raw_mithril_ore.get());
        List<ItemLike> AETHERIUM_SMELTABLES = List.of(ModItems.raw_aetherium_ore.get());
        List<ItemLike> GLACIALITE_SMELTABLES = List.of(ModItems.raw_glacialite_ore.get());
        List<ItemLike> NECROITE_SMELTABLES = List.of(ModItems.raw_necroite_ore.get());
        List<ItemLike> PYROCLAST_SMELTABLES = List.of(ModItems.raw_pyroclast_ore.get());
        List<ItemLike> SOLISITE_SMELTABLES = List.of(ModItems.raw_solisite_ore.get());
        List<ItemLike> VOLCANIC_SMELTABLES = List.of(ModItems.raw_volcanic_ore.get());
        List<ItemLike> VOLCANIC_SCRAP_SMELTABLES = List.of(ModItems.volcanic_scrap.get());


        // Blocks
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.COPPER_ANDESITE.get())
                .requires(Items.COPPER_INGOT)
                .requires(Items.ANDESITE)
                .unlockedBy("has_copper", has(Items.COPPER_INGOT))
                .unlockedBy("has_andesite", has(Items.ANDESITE))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.BLACK_TUFF.get())
                .requires(Items.BLACK_DYE)
                .requires(Items.TUFF)
                .unlockedBy("has_black_dye", has(Items.BLACK_DYE))
                .unlockedBy("has_tuff", has(Items.TUFF))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.GREEN_TUFF.get())
                .requires(Items.GREEN_DYE)
                .requires(Items.TUFF)
                .unlockedBy("has_green_dye", has(Items.GREEN_DYE))
                .unlockedBy("has_tuff", has(Items.TUFF))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.DARK_CALCITE.get())
                .requires(Items.BLACK_DYE)
                .requires(Items.CALCITE)
                .unlockedBy("has_black_dye", has(Items.BLACK_DYE))
                .unlockedBy("has_calcite", has(Items.CALCITE))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.PURPLE_LAMP.get())
                .requires(Items.PURPLE_DYE)
                .requires(Items.REDSTONE_LAMP)
                .unlockedBy("has_purple_dye", has(Items.PURPLE_DYE))
                .unlockedBy("has_redstone_lamp", has(Items.REDSTONE_LAMP))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_GLOWSTONE.get(), 8)
                .pattern("GCG")
                .pattern("CLC")
                .pattern("GCG")
                .define('G', Items.GLOWSTONE_DUST)
                .define('C', Items.BLUE_DYE) // Or use BLUE_DYE
                .define('L', Blocks.GLOWSTONE)
                .unlockedBy("has_glowstone", has(Blocks.GLOWSTONE))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_GLOWSTONE.get(), 8)
                .pattern("GCG")
                .pattern("CLC")
                .pattern("GCG")
                .define('G', Items.GLOWSTONE_DUST)
                .define('C', Items.CYAN_DYE) // Or use BLUE_DYE
                .define('L', Blocks.GLOWSTONE)
                .unlockedBy("has_glowstone", has(Blocks.GLOWSTONE))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_GLOWSTONE.get(), 8)
                .pattern("GCG")
                .pattern("CLC")
                .pattern("GCG")
                .define('G', Items.GLOWSTONE_DUST)
                .define('C', Items.GREEN_DYE) // Or use BLUE_DYE
                .define('L', Blocks.GLOWSTONE)
                .unlockedBy("has_glowstone", has(Blocks.GLOWSTONE))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_GLOWSTONE.get(), 8)
                .pattern("GCG")
                .pattern("CLC")
                .pattern("GCG")
                .define('G', Items.GLOWSTONE_DUST)
                .define('C', Items.LIGHT_BLUE_DYE) // Or use BLUE_DYE
                .define('L', Blocks.GLOWSTONE)
                .unlockedBy("has_glowstone", has(Blocks.GLOWSTONE))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_GLOWSTONE.get(), 8)
                .pattern("GCG")
                .pattern("CLC")
                .pattern("GCG")
                .define('G', Items.GLOWSTONE_DUST)
                .define('C', Items.PURPLE_DYE) // Or use BLUE_DYE
                .define('L', Blocks.GLOWSTONE)
                .unlockedBy("has_glowstone", has(Blocks.GLOWSTONE))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_GLOWSTONE.get(), 8)
                .pattern("GCG")
                .pattern("CLC")
                .pattern("GCG")
                .define('G', Items.GLOWSTONE_DUST)
                .define('C', Items.RED_DYE) // Or use BLUE_DYE
                .define('L', Blocks.GLOWSTONE)
                .unlockedBy("has_glowstone", has(Blocks.GLOWSTONE))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_COBBLESTONE.get())
                .requires(Items.BLUE_DYE)
                .requires(Blocks.COBBLESTONE)
                .unlockedBy("has_blue_dye", has(Items.BLUE_DYE))
                .unlockedBy("has_cobblestone", has(Blocks.COBBLESTONE))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_COBBLESTONE.get())
                .requires(Items.GREEN_DYE)
                .requires(Blocks.COBBLESTONE)
                .unlockedBy("has_green_dye", has(Items.GREEN_DYE))
                .unlockedBy("has_cobblestone", has(Blocks.COBBLESTONE))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_COBBLESTONE.get())
                .requires(Items.LIGHT_BLUE_DYE)
                .requires(Blocks.COBBLESTONE)
                .unlockedBy("has_light_blue_dye", has(Items.LIGHT_BLUE_DYE))
                .unlockedBy("has_cobblestone", has(Blocks.COBBLESTONE))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_COBBLESTONE.get())
                .requires(Items.ORANGE_DYE)
                .requires(Blocks.COBBLESTONE)
                .unlockedBy("has_orange_dye", has(Items.ORANGE_DYE))
                .unlockedBy("has_cobblestone", has(Blocks.COBBLESTONE))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_COBBLESTONE.get())
                .requires(Items.PINK_DYE)
                .requires(Blocks.COBBLESTONE)
                .unlockedBy("has_pink_dye", has(Items.PINK_DYE))
                .unlockedBy("has_cobblestone", has(Blocks.COBBLESTONE))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_COBBLESTONE.get())
                .requires(Items.PURPLE_DYE)
                .requires(Blocks.COBBLESTONE)
                .unlockedBy("has_purple_dye", has(Items.PURPLE_DYE))
                .unlockedBy("has_cobblestone", has(Blocks.COBBLESTONE))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_COBBLESTONE.get())
                .requires(Items.RED_DYE)
                .requires(Blocks.COBBLESTONE)
                .unlockedBy("has_red_dye", has(Items.RED_DYE))
                .unlockedBy("has_cobblestone", has(Blocks.COBBLESTONE))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_COBBLESTONE.get())
                .requires(Items.YELLOW_DYE)
                .requires(Blocks.COBBLESTONE)
                .unlockedBy("has_yellow_dye", has(Items.YELLOW_DYE))
                .unlockedBy("has_cobblestone", has(Blocks.COBBLESTONE))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_CALCITE.get())
                .requires(Items.BLUE_DYE)
                .requires(Blocks.CALCITE)
                .unlockedBy("has_blue_dye", has(Items.BLUE_DYE))
                .unlockedBy("has_calcite", has(Blocks.CALCITE))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_CALCITE.get())
                .requires(Items.GREEN_DYE)
                .requires(Blocks.CALCITE)
                .unlockedBy("has_green_dye", has(Items.GREEN_DYE))
                .unlockedBy("has_calcite", has(Blocks.CALCITE))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_CALCITE.get())
                .requires(Items.ORANGE_DYE)
                .requires(Blocks.CALCITE)
                .unlockedBy("has_orange_dye", has(Items.ORANGE_DYE))
                .unlockedBy("has_calcite", has(Blocks.CALCITE))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_CALCITE.get())
                .requires(Items.PINK_DYE)
                .requires(Blocks.CALCITE)
                .unlockedBy("has_pink_dye", has(Items.PINK_DYE))
                .unlockedBy("has_calcite", has(Blocks.CALCITE))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_CALCITE.get())
                .requires(Items.PURPLE_DYE)
                .requires(Blocks.CALCITE)
                .unlockedBy("has_purple_dye", has(Items.PURPLE_DYE))
                .unlockedBy("has_calcite", has(Blocks.CALCITE))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_CALCITE.get())
                .requires(Items.RED_DYE)
                .requires(Blocks.CALCITE)
                .unlockedBy("has_red_dye", has(Items.RED_DYE))
                .unlockedBy("has_calcite", has(Blocks.CALCITE))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TEAL_CALCITE.get())
                .requires(Items.CYAN_DYE)
                .requires(Blocks.CALCITE)
                .unlockedBy("has_cyan_dye", has(Items.CYAN_DYE))
                .unlockedBy("has_calcite", has(Blocks.CALCITE))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_CALCITE.get())
                .requires(Items.YELLOW_DYE)
                .requires(Blocks.CALCITE)
                .unlockedBy("has_yellow_dye", has(Items.YELLOW_DYE))
                .unlockedBy("has_calcite", has(Blocks.CALCITE))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_TUFF_BRICKS.get())
                .requires(Items.GREEN_DYE)
                .requires(Blocks.TUFF_BRICKS)
                .unlockedBy("has_green_dye", has(Items.GREEN_DYE))
                .unlockedBy("has_tuff_bricks", has(Blocks.TUFF_BRICKS))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_TUFF_BRICKS.get())
                .requires(Items.LIGHT_BLUE_DYE)
                .requires(Blocks.TUFF_BRICKS)
                .unlockedBy("has_light_blue_dye", has(Items.LIGHT_BLUE_DYE))
                .unlockedBy("has_tuff_bricks", has(Blocks.TUFF_BRICKS))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_TUFF_BRICKS.get())
                .requires(Items.ORANGE_DYE)
                .requires(Blocks.TUFF_BRICKS)
                .unlockedBy("has_orange_dye", has(Items.ORANGE_DYE))
                .unlockedBy("has_tuff_bricks", has(Blocks.TUFF_BRICKS))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_TUFF_BRICKS.get())
                .requires(Items.PINK_DYE)
                .requires(Blocks.TUFF_BRICKS)
                .unlockedBy("has_pink_dye", has(Items.PINK_DYE))
                .unlockedBy("has_tuff_bricks", has(Blocks.TUFF_BRICKS))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_TUFF_BRICKS.get())
                .requires(Items.PURPLE_DYE)
                .requires(Blocks.TUFF_BRICKS)
                .unlockedBy("has_purple_dye", has(Items.PURPLE_DYE))
                .unlockedBy("has_tuff_bricks", has(Blocks.TUFF_BRICKS))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_TUFF_BRICKS.get())
                .requires(Items.RED_DYE)
                .requires(Blocks.TUFF_BRICKS)
                .unlockedBy("has_red_dye", has(Items.RED_DYE))
                .unlockedBy("has_tuff_bricks", has(Blocks.TUFF_BRICKS))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_TUFF_BRICKS.get())
                .requires(Items.WHITE_DYE)
                .requires(Blocks.TUFF_BRICKS)
                .unlockedBy("has_white_dye", has(Items.WHITE_DYE))
                .unlockedBy("has_tuff_bricks", has(Blocks.TUFF_BRICKS))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_TUFF_BRICKS.get())
                .requires(Items.YELLOW_DYE)
                .requires(Blocks.TUFF_BRICKS)
                .unlockedBy("has_yellow_dye", has(Items.YELLOW_DYE))
                .unlockedBy("has_tuff_bricks", has(Blocks.TUFF_BRICKS))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_ENDSTONE.get())
                .requires(Items.BLUE_DYE)
                .requires(Blocks.END_STONE)
                .unlockedBy("has_blue_dye", has(Items.BLUE_DYE))
                .unlockedBy("has_end_stone", has(Blocks.END_STONE))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_ENDSTONE.get())
                .requires(Items.GREEN_DYE)
                .requires(Blocks.END_STONE)
                .unlockedBy("has_green_dye", has(Items.GREEN_DYE))
                .unlockedBy("has_end_stone", has(Blocks.END_STONE))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_ENDSTONE.get())
                .requires(Items.ORANGE_DYE)
                .requires(Blocks.END_STONE)
                .unlockedBy("has_orange_dye", has(Items.ORANGE_DYE))
                .unlockedBy("has_end_stone", has(Blocks.END_STONE))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_ENDSTONE.get())
                .requires(Items.PINK_DYE)
                .requires(Blocks.END_STONE)
                .unlockedBy("has_pink_dye", has(Items.PINK_DYE))
                .unlockedBy("has_end_stone", has(Blocks.END_STONE))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_ENDSTONE.get())
                .requires(Items.PURPLE_DYE)
                .requires(Blocks.END_STONE)
            .unlockedBy("has_purple_dye", has(Items.PURPLE_DYE))
                .unlockedBy("has_end_stone", has(Blocks.END_STONE))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_ENDSTONE.get())
                .requires(Items.RED_DYE)
                .requires(Blocks.END_STONE)
                .unlockedBy("has_red_dye", has(Items.RED_DYE))
                .unlockedBy("has_end_stone", has(Blocks.END_STONE))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_ENDSTONE.get())
                .requires(Items.YELLOW_DYE)
                .requires(Blocks.END_STONE)
                .unlockedBy("has_yellow_dye", has(Items.YELLOW_DYE))
                .unlockedBy("has_end_stone", has(Blocks.END_STONE))
                .save(pRecipeOutput);

        
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.AMBERWOOD_HORIZONTAL_PLANKS.get(), 3)  // Outputs 3 horizontal planks
                .define('P', ModBlocks.amberwood_planks.get())  // Uses your custom planks
                .pattern("   ")
                .pattern("P  ")
                .pattern("PP ")  // Horizontal arrangement
                .unlockedBy("has_amberwood_planks", has(ModBlocks.amberwood_planks.get()))  // Unlock condition
                .save(pRecipeOutput);

       
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.AMBERWWOOD_VERTICAL_PLANKS.get(), 3)
                .define('P', ModBlocks.amberwood_planks.get())  // Uses your custom planks
                .pattern("P  ")
                .pattern("P  ")
                .pattern("P  ")
                .unlockedBy("has_amberwood_planks", has(ModBlocks.amberwood_planks.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ASHWOOD_HORIZONTAL_PLANKS.get(), 3)  // Outputs 3 horizontal planks
                .define('P', ModBlocks.ashwood_planks.get())  // Uses your custom planks
                .pattern("   ")
                .pattern("P  ")
                .pattern("PP ")  // Horizontal arrangement
                .unlockedBy("has_ashwood_planks", has(ModBlocks.ashwood_planks.get()))  // Unlock condition
                .save(pRecipeOutput);


        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ASHWOOD_VERTICAL_PLANKS.get(), 3)
                .define('P', ModBlocks.ashwood_planks.get())  // Uses your custom planks
                .pattern("P  ")
                .pattern("P  ")
                .pattern("P  ")
                .unlockedBy("has_ashwood_planks", has(ModBlocks.ashwood_planks.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHARWOOD_HORIZONTAL_PLANKS.get(), 3)  // Outputs 3 horizontal planks
                .define('P', ModBlocks.charwood_planks.get())  // Uses your custom planks
                .pattern("   ")
                .pattern("P  ")
                .pattern("PP ")  // Horizontal arrangement
                .unlockedBy("has_charwood_planks", has(ModBlocks.charwood_planks.get()))  // Unlock condition
                .save(pRecipeOutput);


        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHARWOOD_VERTICAL_PLANKS.get(), 3)
                .define('P', ModBlocks.charwood_planks.get())  // Uses your custom planks
                .pattern("P  ")
                .pattern("P  ")
                .pattern("P  ")
                .unlockedBy("has_charwood_planks", has(ModBlocks.charwood_planks.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.EBONYWOOD_HORIZONTAL_PLANKS.get(), 3)  // Outputs 3 horizontal planks
                .define('P', ModBlocks.ebonywood_planks.get())  // Uses your custom planks
                .pattern("   ")
                .pattern("P  ")
                .pattern("PP ")  // Horizontal arrangement
                .unlockedBy("has_ebonywood_planks", has(ModBlocks.ebonywood_planks.get()))  // Unlock condition
                .save(pRecipeOutput);


        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.EBONYWOOD_VERTICAL_PLANKS.get(), 3)
                .define('P', ModBlocks.ebonywood_planks.get())  // Uses your custom planks
                .pattern("P  ")
                .pattern("P  ")
                .pattern("P  ")
                .unlockedBy("has_ebonywood_planks", has(ModBlocks.ebonywood_planks.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LAVENDERWOOD_HORIZONTAL_PLANKS.get(), 3)  // Outputs 3 horizontal planks
                .define('P', ModBlocks.lavenderwood_planks.get())  // Uses your custom planks
                .pattern("   ")
                .pattern("P  ")
                .pattern("PP ")  // Horizontal arrangement
                .unlockedBy("has_lavenderwood_planks", has(ModBlocks.lavenderwood_planks.get()))  // Unlock condition
                .save(pRecipeOutput);


        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LAVENDERWOOD_VERTICAL_PLANKS.get(), 3)
                .define('P', ModBlocks.lavenderwood_planks.get())  // Uses your custom planks
                .pattern("P  ")
                .pattern("P  ")
                .pattern("P  ")
                .unlockedBy("has_lavenderwood_planks", has(ModBlocks.lavenderwood_planks.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LUMENWOOD_HORIZONTAL_PLANKS.get(), 3)  // Outputs 3 horizontal planks
                .define('P', ModBlocks.lumenwood_planks.get())  // Uses your custom planks
                .pattern("   ")
                .pattern("P  ")
                .pattern("PP ")  // Horizontal arrangement
                .unlockedBy("has_lumenwood_planks", has(ModBlocks.lumenwood_planks.get()))  // Unlock condition
                .save(pRecipeOutput);


        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LUMENWOOD_VERTICAL_PLANKS.get(), 3)
                .define('P', ModBlocks.lumenwood_planks.get())  // Uses your custom planks
                .pattern("P  ")
                .pattern("P  ")
                .pattern("P  ")
                .unlockedBy("has_lumenwood_planks", has(ModBlocks.lumenwood_planks.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOONWOOD_HORIZONTAL_PLANKS.get(), 3)  // Outputs 3 horizontal planks
                .define('P', ModBlocks.moonwood_planks.get())  // Uses your custom planks
                .pattern("   ")
                .pattern("P  ")
                .pattern("PP ")  // Horizontal arrangement
                .unlockedBy("has_moonwood_planks", has(ModBlocks.moonwood_planks.get()))  // Unlock condition
                .save(pRecipeOutput);


        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOONWOOD_VERTICAL_PLANKS.get(), 3)
                .define('P', ModBlocks.moonwood_planks.get())  // Uses your custom planks
                .pattern("P  ")
                .pattern("P  ")
                .pattern("P  ")
                .unlockedBy("has_moonwood_planks", has(ModBlocks.moonwood_planks.get()))
                .save(pRecipeOutput);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GILDED_STONE.get())
                .requires(Blocks.STONE)
                .requires(Items.GOLD_INGOT)
                .unlockedBy("has_stone", has(Blocks.STONE))
                .unlockedBy("has_gold_ingot", has(Items.GOLD_INGOT))
                .save(pRecipeOutput);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GILDED_STONE_BRICKS.get())
                .requires(Blocks.STONE_BRICKS)
                .requires(Items.GOLD_INGOT)
                .unlockedBy("has_stone_bricks", has(Blocks.STONE_BRICKS))
                .unlockedBy("has_gold_ingot", has(Items.GOLD_INGOT))
                .save(pRecipeOutput);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BRICKS_WHITE_GROUT.get())
                .requires(Blocks.BRICKS)
                .requires(Items.WHITE_DYE)
                .unlockedBy("has_bricks", has(Blocks.BRICKS))
                .unlockedBy("has_white_dye", has(Items.WHITE_DYE))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ROCKY_MOSS.get())
                .requires(Blocks.COBBLESTONE)
                .requires(Blocks.MOSS_BLOCK)
                .unlockedBy("has_cobblestone", has(Blocks.COBBLESTONE))
                .unlockedBy("has_moss_block", has(Blocks.MOSS_BLOCK))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_MUSHROOM_BLOCK.get())
                .requires(Blocks.RED_MUSHROOM_BLOCK)
                .requires(Items.BLUE_DYE)
                .unlockedBy("has_red_mushroom_block", has(Blocks.RED_MUSHROOM_BLOCK))
                .unlockedBy("has_blue_dye", has(Items.BLUE_DYE))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_MUSHROOM_BLOCK.get())
                .requires(Blocks.RED_MUSHROOM_BLOCK)
                .requires(Items.BROWN_DYE)
                .unlockedBy("has_red_mushroom_block", has(Blocks.RED_MUSHROOM_BLOCK))
                .unlockedBy("has_brown_dye", has(Items.BROWN_DYE))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_MUSHROOM_BLOCK.get())
                .requires(Blocks.RED_MUSHROOM_BLOCK)
                .requires(Items.CYAN_DYE)
                .unlockedBy("has_red_mushroom_block", has(Blocks.RED_MUSHROOM_BLOCK))
                .unlockedBy("has_cyan_dye", has(Items.CYAN_DYE))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_MUSHROOM_BLOCK.get())
                .requires(Blocks.RED_MUSHROOM_BLOCK)
                .requires(Items.GREEN_DYE)
                .unlockedBy("has_red_mushroom_block", has(Blocks.RED_MUSHROOM_BLOCK))
                .unlockedBy("has_green_dye", has(Items.GREEN_DYE))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_MUSHROOM_BLOCK.get())
                .requires(Blocks.RED_MUSHROOM_BLOCK)
                .requires(Items.LIGHT_BLUE_DYE)
                .unlockedBy("has_red_mushroom_block", has(Blocks.RED_MUSHROOM_BLOCK))
                .unlockedBy("has_light_blue_dye", has(Items.LIGHT_BLUE_DYE))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_MUSHROOM_BLOCK.get())
                .requires(Blocks.RED_MUSHROOM_BLOCK)
                .requires(Items.LIME_DYE)
                .unlockedBy("has_red_mushroom_block", has(Blocks.RED_MUSHROOM_BLOCK))
                .unlockedBy("has_lime_dye", has(Items.LIME_DYE))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_MUSHROOM_BLOCK.get())
                .requires(Blocks.RED_MUSHROOM_BLOCK)
                .requires(Items.ORANGE_DYE)
                .unlockedBy("has_red_mushroom_block", has(Blocks.RED_MUSHROOM_BLOCK))
                .unlockedBy("has_orange_dye", has(Items.ORANGE_DYE))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_MUSHROOM_BLOCK.get())
                .requires(Blocks.RED_MUSHROOM_BLOCK)
                .requires(Items.PINK_DYE)
                .unlockedBy("has_red_mushroom_block", has(Blocks.RED_MUSHROOM_BLOCK))
            .unlockedBy("has_pink_dye", has(Items.PINK_DYE))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_MUSHROOM_BLOCK.get())
                .requires(Blocks.RED_MUSHROOM_BLOCK)
                .requires(Items.PURPLE_DYE)
                .unlockedBy("has_red_mushroom_block", has(Blocks.RED_MUSHROOM_BLOCK))
                .unlockedBy("has_purple_dye", has(Items.PURPLE_DYE))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_MUSHROOM_BLOCK.get())
                .requires(Blocks.RED_MUSHROOM_BLOCK)
                .requires(Items.YELLOW_DYE)
                .unlockedBy("has_red_mushroom_block", has(Blocks.RED_MUSHROOM_BLOCK))
                .unlockedBy("has_yellow_dye", has(Items.YELLOW_DYE))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PLASTER_BLOCK.get(), 2)
                .requires(Blocks.CALCITE)
                .requires(Blocks.DIORITE)
                .unlockedBy("has_calcite", has(Blocks.CALCITE))
                .unlockedBy("has_diorite", has(Blocks.DIORITE))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PLASTER_BRICKS.get(), 3)
                .requires(Blocks.CALCITE)
                .requires(Blocks.DIORITE)
                .requires(Blocks.STONE_BRICKS)
                .unlockedBy("has_calcite", has(Blocks.CALCITE))
                .unlockedBy("has_diorite", has(Blocks.DIORITE))
                .unlockedBy("has_stone_brickss", has(Blocks.STONE_BRICKS))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MULCH_DIRT.get(), 4) // Outputs 4 Mulch Dirt
                .requires(Blocks.DIRT)
                .requires(Items.BONE_MEAL)
                .requires(Blocks.OAK_LEAVES)
                .unlockedBy("has_dirt", has(Blocks.DIRT))
                .unlockedBy("oak_leaves", has(Blocks.OAK_LEAVES))
                .unlockedBy("has_bone_meal", has(Items.BONE_MEAL))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STELLAR_SLATE_ANDESITE.get(), 4)
                .requires(Blocks.ANDESITE)
                .requires(Blocks.STONE)
                .unlockedBy("has_andesite", has(Blocks.ANDESITE))
                .unlockedBy("has_stone", has(Blocks.STONE))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STELLAR_SLATE_COBBLESTONE.get(), 4)
                .requires(Blocks.COBBLESTONE)
                .requires(Blocks.STONE_BRICKS)
                .unlockedBy("has_cobblestone", has(Blocks.COBBLESTONE))
                .unlockedBy("has_stone_bricks", has(Blocks.STONE_BRICKS))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STELLAR_SLATE_COBBLED_DEEPSLATE.get(), 4)
                .requires(Blocks.COBBLED_DEEPSLATE)
                .requires(Blocks.STONE)
                .unlockedBy("has_cobbled_deepslate", has(Blocks.COBBLED_DEEPSLATE))
                .unlockedBy("has_stone", has(Blocks.STONE))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STELLAR_SLATE_DEEPSLATE_BRICKS.get(), 4)
                .requires(Blocks.DEEPSLATE_BRICKS)
                .requires(Blocks.ANDESITE)
                .unlockedBy("has_deepslate_bricks", has(Blocks.DEEPSLATE_BRICKS))
                .unlockedBy("has_andesite", has(Blocks.ANDESITE))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STELLAR_SLATE_STONE.get(), 4)
                .requires(Blocks.STONE)
                .requires(Blocks.COBBLESTONE)
                .unlockedBy("has_stone", has(Blocks.STONE))
                .unlockedBy("has_cobblestone", has(Blocks.COBBLESTONE))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STELLAR_SLATE_STONE_BRICKS.get(), 4)
                .requires(Blocks.STONE_BRICKS)
                .requires(Blocks.DEEPSLATE_BRICKS)
                .unlockedBy("has_stone_bricks", has(Blocks.STONE_BRICKS))
                .unlockedBy("has_deepslate_bricks", has(Blocks.DEEPSLATE_BRICKS))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIMESTONE.get(), 4)
                .requires(Blocks.STONE)
                .requires(Items.QUARTZ)
                .unlockedBy("has_stone", has(Blocks.STONE))
                .unlockedBy("has_quartz", has(Items.QUARTZ))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIMESTONE_BRICKS.get(), 4)
                .pattern("LL ")
                .pattern("LL ")
                .pattern("   ")
                .define('L', ModBlocks.LIMESTONE.get())
                .unlockedBy("has_limestone", has(ModBlocks.LIMESTONE.get()))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIMESTONE_ANDESITE.get(), 4)
                .requires(ModBlocks.LIMESTONE.get())
                .requires(Blocks.ANDESITE)
                .unlockedBy("has_limestone", has(ModBlocks.LIMESTONE.get()))
                .unlockedBy("has_andesite", has(Blocks.ANDESITE))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIMESTONE_COBBLED.get(), 4)
                .requires(ModBlocks.LIMESTONE.get())
                .requires(Blocks.COBBLESTONE)
                .unlockedBy("has_limestone", has(ModBlocks.LIMESTONE.get()))
                .unlockedBy("has_cobblestone", has(Blocks.COBBLESTONE))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIMESTONE_POLISHED_ANDESITE.get(), 4)
                .requires(Blocks.POLISHED_ANDESITE)
                .requires(ModBlocks.LIMESTONE.get())
                .unlockedBy("has_polished_andesite", has(Blocks.POLISHED_ANDESITE))
                .unlockedBy("has_limestone", has(ModBlocks.LIMESTONE.get()))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OVERGROWN_STONE.get(), 4)
                .requires(Blocks.MOSS_BLOCK)
                .requires(Items.STONE)
                .unlockedBy("has_moss_block", has(Blocks.MOSS_BLOCK))
                .unlockedBy("has_stone", has(Blocks.STONE))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SNOW_STONE.get(), 4)
                .requires(Blocks.SNOW_BLOCK)
                .requires(Items.STONE)
                .unlockedBy("has_snow_block", has(Blocks.SNOW_BLOCK))
                .unlockedBy("has_stone", has(Blocks.STONE))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SNOW_STONE_BRICKS.get(), 4)
                .requires(Blocks.SNOW_BLOCK)
                .requires(Items.STONE_BRICKS)
                .unlockedBy("has_snow_block", has(Blocks.SNOW_BLOCK))
                .unlockedBy("has_stone_bricks", has(Blocks.STONE_BRICKS))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_BRICKS.get(),4)
                .requires(Blocks.BRICKS)
                .requires(Items.BLUE_DYE)
                .unlockedBy("has_bricks", has(Blocks.BRICKS))
                .unlockedBy("has_blue_dye", has(Items.BLUE_DYE))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_BRICKS.get(),4)
                .requires(Blocks.BRICKS)
                .requires(Items.GREEN_DYE)
                .unlockedBy("has_bricks", has(Blocks.BRICKS))
                .unlockedBy("has_green_dye", has(Items.GREEN_DYE))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_BRICKS.get(),4)
                .requires(Blocks.BRICKS)
                .requires(Items.LIGHT_BLUE_DYE)
                .unlockedBy("has_bricks", has(Blocks.BRICKS))
                .unlockedBy("has_light_blue_dye", has(Items.LIGHT_BLUE_DYE))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_GREEN_BRICKS.get(),4)
                .requires(Blocks.BRICKS)
                .requires(Items.LIME_DYE)
                .unlockedBy("has_bricks", has(Blocks.BRICKS))
                .unlockedBy("has_lime_dye", has(Items.LIME_DYE))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_BRICKS.get(),4)
                .requires(Blocks.BRICKS)
                .requires(Items.ORANGE_DYE)
                .unlockedBy("has_bricks", has(Blocks.BRICKS))
                .unlockedBy("has_orange_dye", has(Items.ORANGE_DYE))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_BRICKS.get(),4)
                .requires(Blocks.BRICKS)
                .requires(Items.PINK_DYE)
                .unlockedBy("has_bricks", has(Blocks.BRICKS))
                .unlockedBy("has_pink_dye", has(Items.PINK_DYE))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_BRICKS.get(),4)
                .requires(Blocks.BRICKS)
                .requires(Items.PURPLE_DYE)
                .unlockedBy("has_bricks", has(Blocks.BRICKS))
                .unlockedBy("has_purple_dye", has(Items.PURPLE_DYE))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_BRICKS.get(),4)
                .requires(Blocks.BRICKS)
                .requires(Items.RED_DYE)
                .unlockedBy("has_bricks", has(Blocks.BRICKS))
                .unlockedBy("has_red_dye", has(Items.RED_DYE))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_BRICKS.get(),4)
                .requires(Blocks.BRICKS)
                .requires(Items.YELLOW_DYE)
                .unlockedBy("has_bricks", has(Blocks.BRICKS))
                .unlockedBy("has_yellow_dye", has(Items.YELLOW_DYE))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_AMETHYST.get(),4)
                .requires(Blocks.AMETHYST_BLOCK)
                .requires(Items.BLUE_DYE)
                .unlockedBy("has_amethyst_block", has(Blocks.AMETHYST_BLOCK))
                .unlockedBy("has_blue_dye", has(Items.BLUE_DYE))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_AMETHYST.get(),4)
                .requires(Blocks.AMETHYST_BLOCK)
                .requires(Items.GREEN_DYE)
                .unlockedBy("has_amethyst_block", has(Blocks.AMETHYST_BLOCK))
                .unlockedBy("has_green_dye", has(Items.GREEN_DYE))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_AMETHYST.get(),4)
                .requires(Blocks.AMETHYST_BLOCK)
                .requires(Items.LIGHT_BLUE_DYE)
                .unlockedBy("has_amethyst_block", has(Blocks.AMETHYST_BLOCK))
                .unlockedBy("has_light_blue_dye", has(Items.LIGHT_BLUE_DYE))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_AMETHYST.get(),4)
                .requires(Blocks.AMETHYST_BLOCK)
                .requires(Items.ORANGE_DYE)
                .unlockedBy("has_amethyst_block", has(Blocks.AMETHYST_BLOCK))
                .unlockedBy("has_orange_dye", has(Items.ORANGE_DYE))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_AMETHYST.get(),4)
                .requires(Blocks.AMETHYST_BLOCK)
                .requires(Items.PINK_DYE)
                .unlockedBy("has_amethyst_block", has(Blocks.AMETHYST_BLOCK))
                .unlockedBy("has_pink_dye", has(Items.PINK_DYE))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_AMETHYST.get(),4)
                .requires(Blocks.AMETHYST_BLOCK)
                .requires(Items.RED_DYE)
                .unlockedBy("has_amethyst_block", has(Blocks.AMETHYST_BLOCK))
                .unlockedBy("has_red_dye", has(Items.RED_DYE))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_AMETHYST.get(),4)
                .requires(Blocks.AMETHYST_BLOCK)
                .requires(Items.YELLOW_DYE)
                .unlockedBy("has_amethyst_block", has(Blocks.AMETHYST_BLOCK))
                .unlockedBy("has_yellow_dye", has(Items.YELLOW_DYE))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_WARPED_WART_BLOCK.get(),4)
                .requires(Blocks.NETHER_WART_BLOCK)
                .requires(Items.BLUE_DYE)
                .unlockedBy("has_nether_wart_block", has(Blocks.NETHER_WART_BLOCK))
                .unlockedBy("has_blue_dye", has(Items.BLUE_DYE))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_WARPED_WART_BLOCK.get(),4)
                .requires(Blocks.NETHER_WART_BLOCK)
                .requires(Items.GREEN_DYE)
                .unlockedBy("has_nether_wart_block", has(Blocks.NETHER_WART_BLOCK))
                .unlockedBy("has_green_dye", has(Items.GREEN_DYE))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_WARPED_WART_BLOCK.get(),4)
                .requires(Blocks.NETHER_WART_BLOCK)
                .requires(Items.ORANGE_DYE)
                .unlockedBy("has_nether_wart_block", has(Blocks.NETHER_WART_BLOCK))
                .unlockedBy("has_orange_dye", has(Items.ORANGE_DYE))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_WARPED_WART_BLOCK.get(),4)
                .requires(Blocks.NETHER_WART_BLOCK)
                .requires(Items.PINK_DYE)
                .unlockedBy("has_nether_wart_block", has(Blocks.NETHER_WART_BLOCK))
                .unlockedBy("has_pink_dye", has(Items.PINK_DYE))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_WARPED_WART_BLOCK.get(),4)
                .requires(Blocks.NETHER_WART_BLOCK)
                .requires(Items.PURPLE_DYE)
                .unlockedBy("has_nether_wart_block", has(Blocks.NETHER_WART_BLOCK))
                .unlockedBy("has_purple_dye", has(Items.PURPLE_DYE))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_WARPED_WART_BLOCK.get(),4)
                .requires(Blocks.NETHER_WART_BLOCK)
                .requires(Items.YELLOW_DYE)
                .unlockedBy("has_nether_wart_block", has(Blocks.NETHER_WART_BLOCK))
                .unlockedBy("has_yellow_dye", has(Items.YELLOW_DYE))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRY_HAY_BALE.get(),6)
                .pattern("   ")
                .pattern("WWW")
                .pattern("WWW")
                .define('W', Items.WHEAT)
                .unlockedBy("has_wheat", has(Items.WHEAT))
                .save(pRecipeOutput);


        // Wood logs
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.lavenderwood_planks.get(), 4)
                .requires(ModBlocks.LAVENDERWOOD_LOG.get().asItem())
                .unlockedBy("has_lavenderwood_log", has(ModBlocks.LAVENDERWOOD_LOG.get().asItem()))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.amberwood_planks.get(), 4)
                .requires(ModBlocks.AMBERWOOD_LOG.get().asItem())
                .unlockedBy("has_amberwood_log", has(ModBlocks.AMBERWOOD_LOG.get().asItem()))
                .save(pRecipeOutput);


        // Ore items
        // Volcanic ingot craft
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.volcanic_ingot.get(),1)
                .pattern("SBS")
                .pattern("SDS")
                .pattern("SBS")
                .define('S', ModItems.volcanic_scrap.get())
                .define('B', Items.BLAZE_POWDER)
                .define('D', Items.DIAMOND)
                .unlockedBy(getHasName(ModItems.volcanic_scrap.get()), has(ModItems.volcanic_scrap.get()))
                .save(pRecipeOutput, "volcanic_ingot");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STARLITE.get(),1)
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.STARLITE_DUST.get())
                .unlockedBy(getHasName(ModItems.STARLITE_DUST.get()), has(ModItems.STARLITE_DUST.get()))
                .save(pRecipeOutput);

        // Ore blocks
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.celestial_block.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.CELESTIAL.get())
                .unlockedBy(getHasName(ModItems.CELESTIAL.get()), has(ModItems.CELESTIAL.get()))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CELESTIAL.get(), 9)
                .requires(ModBlocks.celestial_block.get())
                .unlockedBy(getHasName(ModBlocks.celestial_block.get()), has(ModBlocks.celestial_block.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.crimson_quartz_block.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.CrimsonQuartz.get())
                .unlockedBy(getHasName(ModItems.CrimsonQuartz.get()), has(ModItems.CrimsonQuartz.get()))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CrimsonQuartz.get(), 9)
                .requires(ModBlocks.crimson_quartz_block.get())
                .unlockedBy(getHasName(ModBlocks.crimson_quartz_block.get()), has(ModBlocks.crimson_quartz_block.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.fossilize_amber_block.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.FossilizedAmber.get())
                .unlockedBy(getHasName(ModItems.FossilizedAmber.get()), has(ModItems.FossilizedAmber.get()))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.FossilizedAmber.get(), 9)
                .requires(ModBlocks.fossilize_amber_block.get())
                .unlockedBy(getHasName(ModBlocks.fossilize_amber_block.get()), has(ModBlocks.fossilize_amber_block.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.mithril_block.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.mithril_ingot.get())
                .unlockedBy(getHasName(ModItems.mithril_ingot.get()), has(ModItems.mithril_ingot.get()))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.mithril_ingot.get(), 9)
                .requires(ModBlocks.mithril_block.get())
                .unlockedBy(getHasName(ModBlocks.mithril_block.get()), has(ModBlocks.mithril_block.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.aetherium_block.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.aetherium_ingot.get())
                .unlockedBy(getHasName(ModItems.aetherium_ingot.get()), has(ModItems.aetherium_ingot.get()))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.aetherium_ingot.get(), 9)
                .requires(ModBlocks.aetherium_block.get())
                .unlockedBy(getHasName(ModBlocks.aetherium_block.get()), has(ModBlocks.aetherium_block.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.glacialite_block.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.glacialite_ingot.get())
                .unlockedBy(getHasName(ModItems.glacialite_ingot.get()), has(ModItems.glacialite_ingot.get()))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.glacialite_ingot.get(), 9)
                .requires(ModBlocks.glacialite_block.get())
                .unlockedBy(getHasName(ModBlocks.glacialite_block.get()), has(ModBlocks.glacialite_block.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.necroite_block.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.necroite_ingot.get())
                .unlockedBy(getHasName(ModItems.necroite_ingot.get()), has(ModItems.necroite_ingot.get()))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.necroite_ingot.get(), 9)
                .requires(ModBlocks.necroite_block.get())
                .unlockedBy(getHasName(ModBlocks.necroite_block.get()), has(ModBlocks.necroite_block.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.pyroclast_block.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.pyroclast_ingot.get())
                .unlockedBy(getHasName(ModItems.pyroclast_ingot.get()), has(ModItems.pyroclast_ingot.get()))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.pyroclast_ingot.get(), 9)
                .requires(ModBlocks.pyroclast_block.get())
                .unlockedBy(getHasName(ModBlocks.pyroclast_block.get()), has(ModBlocks.pyroclast_block.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.solisite_block.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.solisite_ingot.get())
                .unlockedBy(getHasName(ModItems.solisite_ingot.get()), has(ModItems.solisite_ingot.get()))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.solisite_ingot.get(), 9)
                .requires(ModBlocks.solisite_block.get())
                .unlockedBy(getHasName(ModBlocks.solisite_block.get()), has(ModBlocks.solisite_block.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.volcanic_block.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.volcanic_ingot.get())
                .unlockedBy(getHasName(ModItems.volcanic_ingot.get()), has(ModItems.volcanic_ingot.get()))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.volcanic_ingot.get(), 9)
                .requires(ModBlocks.volcanic_block.get())
                .unlockedBy(getHasName(ModBlocks.volcanic_block.get()), has(ModBlocks.volcanic_block.get()))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.raw_mithril_ore.get(), 9)
                .requires(ModBlocks.raw_mithril_block.get())
                .unlockedBy(getHasName(ModBlocks.raw_mithril_block.get()), has(ModBlocks.raw_mithril_block.get()))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.raw_pyroclast_ore.get(), 9)
                .requires(ModBlocks.raw_pyroclast_block.get())
                .unlockedBy(getHasName(ModBlocks.raw_pyroclast_block.get()), has(ModBlocks.raw_pyroclast_block.get()))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.raw_volcanic_ore.get(), 9)
                .requires(ModBlocks.raw_volcanic_block.get())
                .unlockedBy(getHasName(ModBlocks.raw_volcanic_block.get()), has(ModBlocks.raw_volcanic_block.get()))
                .save(pRecipeOutput);

        // Ore smelting
        oreSmelting(pRecipeOutput, MITHRIL_SMELTABLES, RecipeCategory.MISC, ModItems.mithril_ingot.get(), 0.25f,200,"mithril");
        oreBlasting(pRecipeOutput, MITHRIL_SMELTABLES, RecipeCategory.MISC, ModItems.mithril_ingot.get(), 0.25f,100,"mithril");

        oreSmelting(pRecipeOutput, AETHERIUM_SMELTABLES, RecipeCategory.MISC, ModItems.aetherium_ingot.get(), 0.25f,200,"aetherium");
        oreBlasting(pRecipeOutput, AETHERIUM_SMELTABLES, RecipeCategory.MISC, ModItems.aetherium_ingot.get(), 0.25f,100,"aetherium");

        oreSmelting(pRecipeOutput, GLACIALITE_SMELTABLES, RecipeCategory.MISC, ModItems.glacialite_ingot.get(), 0.25f,200,"glacialite");
        oreBlasting(pRecipeOutput, GLACIALITE_SMELTABLES, RecipeCategory.MISC, ModItems.glacialite_ingot.get(), 0.25f,100,"glacialite");

        oreSmelting(pRecipeOutput, NECROITE_SMELTABLES, RecipeCategory.MISC, ModItems.necroite_ingot.get(), 0.25f,200,"necroite");
        oreBlasting(pRecipeOutput, NECROITE_SMELTABLES, RecipeCategory.MISC, ModItems.necroite_ingot.get(), 0.25f,100,"necroite");

        oreSmelting(pRecipeOutput, PYROCLAST_SMELTABLES, RecipeCategory.MISC, ModItems.pyroclast_ingot.get(), 0.25f,200,"pyroclast");
        oreBlasting(pRecipeOutput, PYROCLAST_SMELTABLES, RecipeCategory.MISC, ModItems.pyroclast_ingot.get(), 0.25f,100,"pyroclast");

        oreSmelting(pRecipeOutput, SOLISITE_SMELTABLES, RecipeCategory.MISC, ModItems.solisite_ingot.get(), 0.25f,200,"solisite");
        oreBlasting(pRecipeOutput, SOLISITE_SMELTABLES, RecipeCategory.MISC, ModItems.solisite_ingot.get(), 0.25f,100,"solisite");

        oreSmelting(pRecipeOutput, VOLCANIC_SMELTABLES, RecipeCategory.MISC, ModItems.volcanic_scrap.get(), 0.25f,200,"volcanic");
        oreBlasting(pRecipeOutput, VOLCANIC_SMELTABLES, RecipeCategory.MISC, ModItems.volcanic_scrap.get(), 0.25f,100,"volcanic");

        oreSmelting(pRecipeOutput, VOLCANIC_SCRAP_SMELTABLES, RecipeCategory.MISC, ModItems.raw_volcanic_ore.get(), 0.25f, 200, "volcanic_scrap");
        oreBlasting(pRecipeOutput, VOLCANIC_SCRAP_SMELTABLES, RecipeCategory.MISC, ModItems.raw_volcanic_ore.get(), 0.25f, 200, "volcanic_scrap");

        // Wood blocks
        stairBuilder(ModBlocks.LAVENDER_STAIRS.get(), Ingredient.of(ModBlocks.lavenderwood_planks.get())).group("lavender")
                .unlockedBy(getHasName(ModBlocks.lavenderwood_planks.get()), has(ModBlocks.lavenderwood_planks.get())).save(pRecipeOutput);
        slab(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LAVENDERWOOD_SLAB.get(), ModBlocks.lavenderwood_planks.get());
        buttonBuilder(ModBlocks.LAVENDERWOOD_BUTTON.get(), Ingredient.of(ModBlocks.lavenderwood_planks.get())).group("lavender")
                .unlockedBy(getHasName(ModBlocks.lavenderwood_planks.get()), has(ModBlocks.lavenderwood_planks.get())).save(pRecipeOutput);
        pressurePlate(pRecipeOutput, ModBlocks.LAVENDERWOOD_PRESSURE_PLATE.get(), ModBlocks.lavenderwood_planks.get());
        fenceBuilder(ModBlocks.LAVENDERWOOD_FENCE.get(), Ingredient.of(ModBlocks.lavenderwood_planks.get())).group("lavender")
                .unlockedBy(getHasName(ModBlocks.lavenderwood_planks.get()), has(ModBlocks.lavenderwood_planks.get())).save(pRecipeOutput);
        fenceGateBuilder(ModBlocks.LAVENDERWOOD_FENCE_GATE.get(), Ingredient.of(ModBlocks.lavenderwood_planks.get())).group("lavender")
                .unlockedBy(getHasName(ModBlocks.lavenderwood_planks.get()), has(ModBlocks.lavenderwood_planks.get())).save(pRecipeOutput);
        wall(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LAVENDERWOOD_WALL.get(), ModBlocks.lavenderwood_planks.get());
        doorBuilder(ModBlocks.LAVENDERWOOD_DOOR.get(), Ingredient.of(ModBlocks.lavenderwood_planks.get())).group("lavender")
                .unlockedBy(getHasName(ModBlocks.lavenderwood_planks.get()), has(ModBlocks.lavenderwood_planks.get())).save(pRecipeOutput);
        trapdoorBuilder(ModBlocks.LAVENDERWOOD_TRAPDOOR.get(), Ingredient.of(ModBlocks.lavenderwood_planks.get())).group("lavender")
                .unlockedBy(getHasName(ModBlocks.lavenderwood_planks.get()), has(ModBlocks.lavenderwood_planks.get())).save(pRecipeOutput);

        stairBuilder(ModBlocks.amberwood_STAIRS.get(), Ingredient.of(ModBlocks.amberwood_planks.get())).group("amberwood")
                .unlockedBy(getHasName(ModBlocks.amberwood_planks.get()), has(ModBlocks.amberwood_planks.get())).save(pRecipeOutput);
        slab(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.amberwood_SLAB.get(), ModBlocks.amberwood_planks.get());
        buttonBuilder(ModBlocks.amberwood_BUTTON.get(), Ingredient.of(ModBlocks.amberwood_planks.get())).group("amberwood")
                .unlockedBy(getHasName(ModBlocks.amberwood_planks.get()), has(ModBlocks.amberwood_planks.get())).save(pRecipeOutput);
        pressurePlate(pRecipeOutput, ModBlocks.amberwood_PRESSURE_PLATE.get(), ModBlocks.amberwood_planks.get());
        fenceBuilder(ModBlocks.amberwood_FENCE.get(), Ingredient.of(ModBlocks.amberwood_planks.get())).group("amberwood")
                .unlockedBy(getHasName(ModBlocks.amberwood_planks.get()), has(ModBlocks.amberwood_planks.get())).save(pRecipeOutput);
        fenceGateBuilder(ModBlocks.amberwood_FENCE_GATE.get(), Ingredient.of(ModBlocks.amberwood_planks.get())).group("amberwood")
                .unlockedBy(getHasName(ModBlocks.amberwood_planks.get()), has(ModBlocks.amberwood_planks.get())).save(pRecipeOutput);
        wall(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.amberwood_WALL.get(), ModBlocks.amberwood_planks.get());
        doorBuilder(ModBlocks.amberwood_DOOR.get(), Ingredient.of(ModBlocks.amberwood_planks.get())).group("amberwood")
                .unlockedBy(getHasName(ModBlocks.amberwood_planks.get()), has(ModBlocks.amberwood_planks.get())).save(pRecipeOutput);
        trapdoorBuilder(ModBlocks.amberwood_TRAPDOOR.get(), Ingredient.of(ModBlocks.amberwood_planks.get())).group("amberwood")
                .unlockedBy(getHasName(ModBlocks.amberwood_planks.get()), has(ModBlocks.amberwood_planks.get())).save(pRecipeOutput);

        stairBuilder(ModBlocks.ashwood_STAIRS.get(), Ingredient.of(ModBlocks.ashwood_planks.get())).group("ashwood")
                .unlockedBy(getHasName(ModBlocks.ashwood_planks.get()), has(ModBlocks.ashwood_planks.get())).save(pRecipeOutput);
        slab(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ashwood_SLAB.get(), ModBlocks.ashwood_planks.get());
        buttonBuilder(ModBlocks.ashwood_BUTTON.get(), Ingredient.of(ModBlocks.ashwood_planks.get())).group("ashwood")
                .unlockedBy(getHasName(ModBlocks.ashwood_planks.get()), has(ModBlocks.ashwood_planks.get())).save(pRecipeOutput);
        pressurePlate(pRecipeOutput, ModBlocks.ashwood_PRESSURE_PLATE.get(), ModBlocks.ashwood_planks.get());
        fenceBuilder(ModBlocks.ashwood_FENCE.get(), Ingredient.of(ModBlocks.ashwood_planks.get())).group("ashwood")
                .unlockedBy(getHasName(ModBlocks.ashwood_planks.get()), has(ModBlocks.ashwood_planks.get())).save(pRecipeOutput);
        fenceGateBuilder(ModBlocks.ashwood_FENCE_GATE.get(), Ingredient.of(ModBlocks.ashwood_planks.get())).group("ashwood")
                .unlockedBy(getHasName(ModBlocks.ashwood_planks.get()), has(ModBlocks.ashwood_planks.get())).save(pRecipeOutput);
        wall(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ashwood_WALL.get(), ModBlocks.ashwood_planks.get());
        doorBuilder(ModBlocks.ashwood_DOOR.get(), Ingredient.of(ModBlocks.ashwood_planks.get())).group("ashwood")
                .unlockedBy(getHasName(ModBlocks.ashwood_planks.get()), has(ModBlocks.ashwood_planks.get())).save(pRecipeOutput);
        trapdoorBuilder(ModBlocks.ashwood_TRAPDOOR.get(), Ingredient.of(ModBlocks.ashwood_planks.get())).group("ashwood")
                .unlockedBy(getHasName(ModBlocks.ashwood_planks.get()), has(ModBlocks.ashwood_planks.get())).save(pRecipeOutput);

        stairBuilder(ModBlocks.lumenwood_STAIRS.get(), Ingredient.of(ModBlocks.lumenwood_planks.get())).group("lumenwood")
                .unlockedBy(getHasName(ModBlocks.lumenwood_planks.get()), has(ModBlocks.lumenwood_planks.get())).save(pRecipeOutput);
        slab(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.lumenwood_SLAB.get(), ModBlocks.lumenwood_planks.get());
        buttonBuilder(ModBlocks.lumenwood_BUTTON.get(), Ingredient.of(ModBlocks.lumenwood_planks.get())).group("lumenwood")
                .unlockedBy(getHasName(ModBlocks.lumenwood_planks.get()), has(ModBlocks.lumenwood_planks.get())).save(pRecipeOutput);
        pressurePlate(pRecipeOutput, ModBlocks.lumenwood_PRESSURE_PLATE.get(), ModBlocks.lumenwood_planks.get());
        fenceBuilder(ModBlocks.lumenwood_FENCE.get(), Ingredient.of(ModBlocks.lumenwood_planks.get())).group("lumenwood")
                .unlockedBy(getHasName(ModBlocks.lumenwood_planks.get()), has(ModBlocks.lumenwood_planks.get())).save(pRecipeOutput);
        fenceGateBuilder(ModBlocks.lumenwood_FENCE_GATE.get(), Ingredient.of(ModBlocks.lumenwood_planks.get())).group("lumenwood")
                .unlockedBy(getHasName(ModBlocks.lumenwood_planks.get()), has(ModBlocks.lumenwood_planks.get())).save(pRecipeOutput);
        wall(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.lumenwood_WALL.get(), ModBlocks.lumenwood_planks.get());
        doorBuilder(ModBlocks.lumenwood_DOOR.get(), Ingredient.of(ModBlocks.lumenwood_planks.get())).group("lumenwood")
                .unlockedBy(getHasName(ModBlocks.lumenwood_planks.get()), has(ModBlocks.lumenwood_planks.get())).save(pRecipeOutput);
        trapdoorBuilder(ModBlocks.lumenwood_TRAPDOOR.get(), Ingredient.of(ModBlocks.lumenwood_planks.get())).group("lumenwood")
                .unlockedBy(getHasName(ModBlocks.lumenwood_planks.get()), has(ModBlocks.lumenwood_planks.get())).save(pRecipeOutput);

        stairBuilder(ModBlocks.ebonywood_STAIRS.get(), Ingredient.of(ModBlocks.ebonywood_planks.get())).group("ebonywood")
                .unlockedBy(getHasName(ModBlocks.ebonywood_planks.get()), has(ModBlocks.ebonywood_planks.get())).save(pRecipeOutput);
        slab(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ebonywood_SLAB.get(), ModBlocks.ebonywood_planks.get());
        buttonBuilder(ModBlocks.ebonywood_BUTTON.get(), Ingredient.of(ModBlocks.ebonywood_planks.get())).group("ebonywood")
                .unlockedBy(getHasName(ModBlocks.ebonywood_planks.get()), has(ModBlocks.ebonywood_planks.get())).save(pRecipeOutput);
        pressurePlate(pRecipeOutput, ModBlocks.ebonywood_PRESSURE_PLATE.get(), ModBlocks.ebonywood_planks.get());
        fenceBuilder(ModBlocks.ebonywood_FENCE.get(), Ingredient.of(ModBlocks.ebonywood_planks.get())).group("ebonywood")
                .unlockedBy(getHasName(ModBlocks.ebonywood_planks.get()), has(ModBlocks.ebonywood_planks.get())).save(pRecipeOutput);
        fenceGateBuilder(ModBlocks.ebonywood_FENCE_GATE.get(), Ingredient.of(ModBlocks.ebonywood_planks.get())).group("ebonywood")
                .unlockedBy(getHasName(ModBlocks.ebonywood_planks.get()), has(ModBlocks.ebonywood_planks.get())).save(pRecipeOutput);
        wall(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ebonywood_WALL.get(), ModBlocks.ebonywood_planks.get());
        doorBuilder(ModBlocks.ebonywood_DOOR.get(), Ingredient.of(ModBlocks.ebonywood_planks.get())).group("ebonywood")
                .unlockedBy(getHasName(ModBlocks.ebonywood_planks.get()), has(ModBlocks.ebonywood_planks.get())).save(pRecipeOutput);
        trapdoorBuilder(ModBlocks.ebonywood_TRAPDOOR.get(), Ingredient.of(ModBlocks.ebonywood_planks.get())).group("ebonywood")
                .unlockedBy(getHasName(ModBlocks.ebonywood_planks.get()), has(ModBlocks.ebonywood_planks.get())).save(pRecipeOutput);

        stairBuilder(ModBlocks.charwood_STAIRS.get(), Ingredient.of(ModBlocks.charwood_planks.get())).group("charwood")
                .unlockedBy(getHasName(ModBlocks.charwood_planks.get()), has(ModBlocks.charwood_planks.get())).save(pRecipeOutput);
        slab(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.charwood_SLAB.get(), ModBlocks.charwood_planks.get());
        buttonBuilder(ModBlocks.charwood_BUTTON.get(), Ingredient.of(ModBlocks.charwood_planks.get())).group("charwood")
                .unlockedBy(getHasName(ModBlocks.charwood_planks.get()), has(ModBlocks.charwood_planks.get())).save(pRecipeOutput);
        pressurePlate(pRecipeOutput, ModBlocks.charwood_PRESSURE_PLATE.get(), ModBlocks.charwood_planks.get());
        fenceBuilder(ModBlocks.charwood_FENCE.get(), Ingredient.of(ModBlocks.charwood_planks.get())).group("charwood")
                .unlockedBy(getHasName(ModBlocks.charwood_planks.get()), has(ModBlocks.charwood_planks.get())).save(pRecipeOutput);
        fenceGateBuilder(ModBlocks.charwood_FENCE_GATE.get(), Ingredient.of(ModBlocks.charwood_planks.get())).group("charwood")
                .unlockedBy(getHasName(ModBlocks.charwood_planks.get()), has(ModBlocks.charwood_planks.get())).save(pRecipeOutput);
        wall(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.charwood_WALL.get(), ModBlocks.charwood_planks.get());
        doorBuilder(ModBlocks.charwood_DOOR.get(), Ingredient.of(ModBlocks.charwood_planks.get())).group("charwood")
                .unlockedBy(getHasName(ModBlocks.charwood_planks.get()), has(ModBlocks.charwood_planks.get())).save(pRecipeOutput);
        trapdoorBuilder(ModBlocks.charwood_TRAPDOOR.get(), Ingredient.of(ModBlocks.charwood_planks.get())).group("charwood")
                .unlockedBy(getHasName(ModBlocks.charwood_planks.get()), has(ModBlocks.charwood_planks.get())).save(pRecipeOutput);

        stairBuilder(ModBlocks.moonwood_STAIRS.get(), Ingredient.of(ModBlocks.moonwood_planks.get())).group("moonwood")
                .unlockedBy(getHasName(ModBlocks.moonwood_planks.get()), has(ModBlocks.moonwood_planks.get())).save(pRecipeOutput);
        slab(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.moonwood_SLAB.get(), ModBlocks.moonwood_planks.get());
        buttonBuilder(ModBlocks.moonwood_BUTTON.get(), Ingredient.of(ModBlocks.moonwood_planks.get())).group("moonwood")
                .unlockedBy(getHasName(ModBlocks.moonwood_planks.get()), has(ModBlocks.moonwood_planks.get())).save(pRecipeOutput);
        pressurePlate(pRecipeOutput, ModBlocks.moonwood_PRESSURE_PLATE.get(), ModBlocks.moonwood_planks.get());
        fenceBuilder(ModBlocks.moonwood_FENCE.get(), Ingredient.of(ModBlocks.moonwood_planks.get())).group("moonwood")
                .unlockedBy(getHasName(ModBlocks.moonwood_planks.get()), has(ModBlocks.moonwood_planks.get())).save(pRecipeOutput);
        fenceGateBuilder(ModBlocks.moonwood_FENCE_GATE.get(), Ingredient.of(ModBlocks.moonwood_planks.get())).group("moonwood")
                .unlockedBy(getHasName(ModBlocks.moonwood_planks.get()), has(ModBlocks.moonwood_planks.get())).save(pRecipeOutput);
        wall(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.moonwood_WALL.get(), ModBlocks.moonwood_planks.get());
        doorBuilder(ModBlocks.moonwood_DOOR.get(), Ingredient.of(ModBlocks.moonwood_planks.get())).group("moonwood")
                .unlockedBy(getHasName(ModBlocks.moonwood_planks.get()), has(ModBlocks.moonwood_planks.get())).save(pRecipeOutput);
        trapdoorBuilder(ModBlocks.moonwood_TRAPDOOR.get(), Ingredient.of(ModBlocks.moonwood_planks.get())).group("moonwood")
                .unlockedBy(getHasName(ModBlocks.moonwood_planks.get()), has(ModBlocks.moonwood_planks.get())).save(pRecipeOutput);

        // Armor
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.CELESTIAL_HELMET.get())
                .pattern("MMM")
                .pattern("M M")  // Use 3 spaces for consistency
                .pattern("   ")  // Empty row still needs 3 spaces
                .define('M', ModItems.CELESTIAL.get())
                .unlockedBy("has_celestial", has(ModItems.CELESTIAL.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.CELESTIAL_CHESTPLATE.get())
                .pattern("M M")
                .pattern("MMM")
                .pattern("MMM")
                .define('M', ModItems.CELESTIAL.get())
                .unlockedBy("has_celestial", has(ModItems.CELESTIAL.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.CELESTIAL_LEGGINGS.get())
                .pattern("MMM")
                .pattern("M M")
                .pattern("M M")
                .define('M', ModItems.CELESTIAL.get())
                .unlockedBy("has_celestial", has(ModItems.CELESTIAL.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.CELESTIAL_BOOTS.get())
                .pattern("M M")
                .pattern("M M")
                .pattern("   ")  // 3 spaces for the empty row
                .define('M', ModItems.CELESTIAL.get())
                .unlockedBy("has_celestial", has(ModItems.CELESTIAL.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.FOSSILIZED_AMBER_HELMET.get())
                .pattern("MMM")
                .pattern("M M")  // Use 3 spaces for consistency
                .pattern("   ")  // Empty row still needs 3 spaces
                .define('M', ModItems.FossilizedAmber.get())
                .unlockedBy("has_fossilized_amber", has(ModItems.FossilizedAmber.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.FOSSILIZED_AMBER_CHESTPLATE.get())
                .pattern("M M")
                .pattern("MMM")
                .pattern("MMM")
                .define('M', ModItems.FossilizedAmber.get())
                .unlockedBy("has_fossilized_amber", has(ModItems.FossilizedAmber.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.FOSSILIZED_AMBER_LEGGINGS.get())
                .pattern("MMM")
                .pattern("M M")
                .pattern("M M")
                .define('M', ModItems.FossilizedAmber.get())
                .unlockedBy("has_fossilized_amber", has(ModItems.FossilizedAmber.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.FOSSILIZED_AMBER_BOOTS.get())
                .pattern("M M")
                .pattern("M M")
                .pattern("   ")  // 3 spaces for the empty row
                .define('M', ModItems.FossilizedAmber.get())
                .unlockedBy("has_fossilized_amber", has(ModItems.FossilizedAmber.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.MOLTEN_HELMET.get())
                .pattern("MMM")
                .pattern("M M")  // Use 3 spaces for consistency
                .pattern("   ")  // Empty row still needs 3 spaces
                .define('M', ModItems.Molten.get())
                .unlockedBy("has_molten", has(ModItems.Molten.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.MOLTEN_CHESTPLATE.get())
                .pattern("M M")
                .pattern("MMM")
                .pattern("MMM")
                .define('M', ModItems.Molten.get())
                .unlockedBy("has_molten", has(ModItems.Molten.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.MOLTEN_LEGGINGS.get())
                .pattern("MMM")
                .pattern("M M")
                .pattern("M M")
                .define('M', ModItems.Molten.get())
                .unlockedBy("has_molten", has(ModItems.Molten.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.MOLTEN_BOOTS.get())
                .pattern("M M")
                .pattern("M M")
                .pattern("   ")  // 3 spaces for the empty row
                .define('M', ModItems.Molten.get())
                .unlockedBy("has_molten", has(ModItems.Molten.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.VOLCANIC_HELMET.get())
                .pattern("MMM")
                .pattern("M M")  // Use 3 spaces for consistency
                .pattern("   ")  // Empty row still needs 3 spaces
                .define('M', ModItems.volcanic_ingot.get())
                .unlockedBy("has_volcanic_ingot", has(ModItems.volcanic_ingot.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.VOLCANIC_CHESTPLATE.get())
                .pattern("M M")
                .pattern("MMM")
                .pattern("MMM")
                .define('M', ModItems.volcanic_ingot.get())
                .unlockedBy("has_volcanic_ingot", has(ModItems.volcanic_ingot.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.VOLCANIC_LEGGINGS.get())
                .pattern("MMM")
                .pattern("M M")
                .pattern("M M")
                .define('M', ModItems.volcanic_ingot.get())
                .unlockedBy("has_volcanic_ingot", has(ModItems.volcanic_ingot.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.VOLCANIC_BOOTS.get())
                .pattern("M M")
                .pattern("M M")
                .pattern("   ")  // 3 spaces for the empty row
                .define('M', ModItems.volcanic_ingot.get())
                .unlockedBy("has_volcanic_ingot", has(ModItems.volcanic_ingot.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.STARLITE_HELMET.get())
                .pattern("MMM")
                .pattern("M M")  // Use 3 spaces for consistency
                .pattern("   ")  // Empty row still needs 3 spaces
                .define('M', ModItems.STARLITE.get())
                .unlockedBy("has_starlite_ingot", has(ModItems.STARLITE.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.STARLITE_CHESTPLATE.get())
                .pattern("M M")
                .pattern("MMM")
                .pattern("MMM")
                .define('M', ModItems.STARLITE.get())
                .unlockedBy("has_starlite_ingot", has(ModItems.STARLITE.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.STARLITE_LEGGINGS.get())
                .pattern("MMM")
                .pattern("M M")
                .pattern("M M")
                .define('M', ModItems.STARLITE.get())
                .unlockedBy("has_starlite_ingot", has(ModItems.STARLITE.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.STARLITE_BOOTS.get())
                .pattern("M M")
                .pattern("M M")
                .pattern("   ")  // 3 spaces for the empty row
                .define('M', ModItems.STARLITE.get())
                .unlockedBy("has_starlite_ingot", has(ModItems.STARLITE.get()))
                .save(pRecipeOutput);

        // Mob Armor
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.CELESTIAL_HORSE_ARMOR.get(), 1)
                .pattern("C  ")
                .pattern("CSC")
                .pattern("C C")
                .define('C', ModItems.CELESTIAL.get())
                .define('S', Items.SADDLE)
                .unlockedBy("has_celestial", has(ModItems.CELESTIAL.get()))
                .unlockedBy("has_saddle", has(Items.SADDLE))
                .save(pRecipeOutput);


        // Tools
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.CELESTIAL_PICKAXE.get())
                .pattern("MMM")
                .pattern(" S ")
                .pattern(" S ")
                .define('M', ModItems.CELESTIAL.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.CELESTIAL.get()), has(ModItems.CELESTIAL.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.CELESTIAL_AXE.get())
                .pattern("MM ")
                .pattern("MS ")
                .pattern(" S ")
                .define('M', ModItems.CELESTIAL.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.CELESTIAL.get()), has(ModItems.CELESTIAL.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.CELESTIAL_SHOVEL.get())
                .pattern(" M ")
                .pattern(" S ")
                .pattern(" S ")
                .define('M', ModItems.CELESTIAL.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.CELESTIAL.get()), has(ModItems.CELESTIAL.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.CELESTIAL_HOE.get())
                .pattern("MM ")
                .pattern(" S ")
                .pattern(" S ")
                .define('M', ModItems.CELESTIAL.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.CELESTIAL.get()), has(ModItems.CELESTIAL.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.CELESTIAL_SWORD.get())
                .pattern(" M ")
                .pattern(" M ")
                .pattern(" S ")
                .define('M', ModItems.CELESTIAL.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.CELESTIAL.get()), has(ModItems.CELESTIAL.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.CELESTIAL_HAMMER.get())
                .pattern("MMM")
                .pattern("MMM")
                .pattern(" S ")
                .define('M', ModItems.CELESTIAL.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.CELESTIAL.get()), has(ModItems.CELESTIAL.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.MOLTEN_SWORD.get())
                .pattern(" M ")
                .pattern(" M ")
                .pattern(" S ")
                .define('M', ModItems.Molten.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.Molten.get()), has(ModItems.Molten.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.MOLTEN_PICKAXE.get())
                .pattern("MMM")
                .pattern(" S ")
                .pattern(" S ")
                .define('M', ModItems.Molten.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.Molten.get()), has(ModItems.Molten.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.MOLTEN_AXE.get())
                .pattern("MM ")
                .pattern("MS ")
                .pattern(" S ")
                .define('M', ModItems.Molten.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.Molten.get()), has(ModItems.Molten.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.MOLTEN_SHOVEL.get())
                .pattern(" M ")
                .pattern(" S ")
                .pattern(" S ")
                .define('M', ModItems.Molten.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.Molten.get()), has(ModItems.Molten.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.MOLTEN_HOE.get())
                .pattern("MM ")
                .pattern(" S ")
                .pattern(" S ")
                .define('M', ModItems.Molten.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.Molten.get()), has(ModItems.Molten.get()))
                .save(pRecipeOutput);
        
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.STARLITE_SWORD.get())
                .pattern(" M ")
                .pattern(" M ")
                .pattern(" S ")
                .define('M', ModItems.STARLITE.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.STARLITE.get()), has(ModItems.STARLITE.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.STARLITE_PICKAXE.get())
                .pattern("MMM")
                .pattern(" S ")
                .pattern(" S ")
                .define('M', ModItems.STARLITE.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.STARLITE.get()), has(ModItems.STARLITE.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.STARLITE_AXE.get())
                .pattern("MM ")
                .pattern("MS ")
                .pattern(" S ")
                .define('M', ModItems.STARLITE.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.STARLITE.get()), has(ModItems.STARLITE.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.STARLITE_SHOVEL.get())
                .pattern(" M ")
                .pattern(" S ")
                .pattern(" S ")
                .define('M', ModItems.STARLITE.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.STARLITE.get()), has(ModItems.STARLITE.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.STARLITE_HOE.get())
                .pattern("MM ")
                .pattern(" S ")
                .pattern(" S ")
                .define('M', ModItems.STARLITE.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.STARLITE.get()), has(ModItems.STARLITE.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.VOLCANIC_SWORD.get())
                .pattern(" M ")
                .pattern(" M ")
                .pattern(" S ")
                .define('M', ModItems.volcanic_ingot.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.volcanic_ingot.get()), has(ModItems.volcanic_ingot.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.VOLCANIC_PICKAXE.get())
                .pattern("MMM")
                .pattern(" S ")
                .pattern(" S ")
                .define('M', ModItems.volcanic_ingot.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.volcanic_ingot.get()), has(ModItems.volcanic_ingot.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.VOLCANIC_AXE.get())
                .pattern("MM ")
                .pattern("MS ")
                .pattern(" S ")
                .define('M', ModItems.volcanic_ingot.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.volcanic_ingot.get()), has(ModItems.volcanic_ingot.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.VOLCANIC_SHOVEL.get())
                .pattern(" M ")
                .pattern(" S ")
                .pattern(" S ")
                .define('M', ModItems.volcanic_ingot.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.volcanic_ingot.get()), has(ModItems.volcanic_ingot.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.VOLCANIC_HOE.get())
                .pattern("MM ")
                .pattern(" S ")
                .pattern(" S ")
                .define('M', ModItems.volcanic_ingot.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.volcanic_ingot.get()), has(ModItems.volcanic_ingot.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.Chisel.get())
                .pattern("  M")
                .pattern(" S ")
                .pattern("S  ")
                .define('M', Items.STONE)
                .define('S', Items.STICK)
                .unlockedBy(getHasName(Items.STONE), has(Items.STONE))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.MEASUREMENT_TOOL.get())
                .pattern("III")
                .pattern("GRG")
                .pattern("III")
                .define('I', Items.IRON_INGOT)
                .define('R', Items.REDSTONE)
                .define('G', Items.GOLD_NUGGET)
                .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.Hazard_Alert.get())
                .pattern("GLI")
                .pattern("RDN")
                .pattern("QFQ")
                .define('G', Items.GOLD_INGOT)
                .define('L', Items.LAPIS_LAZULI)
                .define('I', Items.IRON_BLOCK)
                .define('R', Items.REDSTONE)
                .define('D', Items.DIAMOND)
                .define('N', Items.QUARTZ)
                .define('Q', Items.GLOWSTONE_DUST)
                .define('F', Items.FIRE_CHARGE)
                .unlockedBy(getHasName(Items.GOLD_INGOT), has(Items.GOLD_INGOT))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModBlocks.HEIGHT_MARKER.get())
                .pattern("RRR")
                .pattern("RIR")
                .pattern("RRR")
                .define('I', Items.REDSTONE_TORCH)
                .define('R', Blocks.DEEPSLATE)
                .unlockedBy(getHasName(Blocks.DEEPSLATE), has(Blocks.DEEPSLATE))
                .unlockedBy(getHasName(Items.REDSTONE_TORCH), has(Items.REDSTONE_TORCH))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.AETHERIUM_PICKAXE.get())
                .pattern("MMM")
                .pattern(" S ")
                .pattern(" S ")
                .define('M', ModItems.aetherium_ingot.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.aetherium_ingot.get()), has(ModItems.aetherium_ingot.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.AETHERIUM_AXE.get())
                .pattern("MM ")
                .pattern("MS ")
                .pattern(" S ")
                .define('M', ModItems.aetherium_ingot.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.aetherium_ingot.get()), has(ModItems.aetherium_ingot.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.AETHERIUM_SHOVEL.get())
                .pattern(" M ")
                .pattern(" S ")
                .pattern(" S ")
                .define('M', ModItems.aetherium_ingot.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.aetherium_ingot.get()), has(ModItems.aetherium_ingot.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.AETHERIUM_HOE.get())
                .pattern("MM ")
                .pattern(" S ")
                .pattern(" S ")
                .define('M', ModItems.aetherium_ingot.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.aetherium_ingot.get()), has(ModItems.aetherium_ingot.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.TIME_SHIFTER.get())
                .pattern("CEC")
                .pattern("ANA")
                .pattern("LDL")
                .define('C', Items.CLOCK)
                .define('E', Items.ENDER_PEARL)
                .define('A', Items.AMETHYST_SHARD)
                .define('N', Items.NETHER_STAR)
                .define('L', Items.LAPIS_BLOCK)
                .define('D', Items.DIAMOND_BLOCK)
                .unlockedBy("has_nether_star", has(Items.NETHER_STAR))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.GEO_ANALYZER.get())
                .pattern("GGG")
                .pattern("IDI")
                .pattern("GGG")
                .define('G', Items.GLASS) // Assuming you want to use glass as a material
                .define('I', Items.IRON_INGOT) // Assuming you want to use iron ingot as a material
                .define('D', Items.REDSTONE_BLOCK)
                .unlockedBy(getHasName(Items.REDSTONE_BLOCK), has(Items.REDSTONE_BLOCK))
                .save(pRecipeOutput);

        // Items
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.ETERNAL_STEAK.get())
                .pattern("SSS")
                .pattern("SBS")
                .pattern("SSS")
                .define('B', Items.BEEF)
                .define('S', Items.GOLD_BLOCK)
                .unlockedBy(getHasName(Items.COOKED_BEEF), has(Items.COOKED_BEEF))
                .save(pRecipeOutput);

    }
    protected static void oreSmelting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput recipeOutput, RecipeSerializer<T> pCookingSerializer, AbstractCookingRecipe.Factory<T> factory,
                                                                       List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for (ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(recipeOutput, ConstructPro.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}
