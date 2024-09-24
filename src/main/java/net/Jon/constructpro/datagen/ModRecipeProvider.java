package net.Jon.constructpro.datagen;

import net.Jon.constructpro.ConstructPro;
import net.Jon.constructpro.block.ModBlocks;
import net.Jon.constructpro.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
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
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.celestial_block.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.Celestial.get())
                .unlockedBy(getHasName(ModItems.Celestial.get()), has(ModItems.Celestial.get()))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.Celestial.get(), 9)
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
    }
}
