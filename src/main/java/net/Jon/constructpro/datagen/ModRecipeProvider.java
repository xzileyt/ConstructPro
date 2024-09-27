package net.Jon.constructpro.datagen;

import net.Jon.constructpro.ConstructPro;
import net.Jon.constructpro.block.ModBlocks;
import net.Jon.constructpro.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
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

        oreSmelting(pRecipeOutput, MITHRIL_SMELTABLES, RecipeCategory.MISC, ModItems.mithril_ingot.get(), 0.25f,200,"mithril");
        oreBlasting(pRecipeOutput, MITHRIL_SMELTABLES, RecipeCategory.MISC, ModItems.mithril_ingot.get(), 0.25f,100,"mithril");

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

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.CELESTIAL_PICKAXE.get())
                .pattern("MMM")
                .pattern(" S ")
                .pattern(" S ")
                .define('M', ModItems.CELESTIAL.get()) // Replace with your desired material
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.CELESTIAL.get()), has(ModItems.CELESTIAL.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.CELESTIAL_AXE.get())
                .pattern("MM ")
                .pattern("MS ")
                .pattern(" S ")
                .define('M', ModItems.CELESTIAL.get()) // Replace with your desired material
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.CELESTIAL.get()), has(ModItems.CELESTIAL.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.CELESTIAL_SHOVEL.get())
                .pattern(" M ")
                .pattern(" S ")
                .pattern(" S ")
                .define('M', ModItems.CELESTIAL.get()) // Replace with your desired material
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.CELESTIAL.get()), has(ModItems.CELESTIAL.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.CELESTIAL_HOE.get())
                .pattern("MM ")
                .pattern(" S ")
                .pattern(" S ")
                .define('M', ModItems.CELESTIAL.get()) // Replace with your desired material
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.CELESTIAL.get()), has(ModItems.CELESTIAL.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.CELESTIAL_SWORD.get())
                .pattern(" M ")
                .pattern(" M ")
                .pattern(" S ")
                .define('M', ModItems.CELESTIAL.get()) // Replace with your desired material
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.CELESTIAL.get()), has(ModItems.CELESTIAL.get()))
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
