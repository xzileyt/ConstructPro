package net.Jon.constructpro.datagen;

import net.Jon.constructpro.ConstructPro;
import net.Jon.constructpro.item.ModItems;
import net.Jon.constructpro.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> completableFuture,
                              CompletableFuture<TagLookup<Block>> lookupCompletableFuture, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, completableFuture, lookupCompletableFuture, ConstructPro.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.CELESTIAL_HELMET.get())
                .add(ModItems.CELESTIAL_CHESTPLATE.get())
                .add(ModItems.CELESTIAL_LEGGINGS.get())
                .add(ModItems.CELESTIAL_BOOTS.get())
                .add(ModItems.MOLTEN_HELMET.get())
                .add(ModItems.MOLTEN_CHESTPLATE.get())
                .add(ModItems.MOLTEN_LEGGINGS.get())
                .add(ModItems.MOLTEN_BOOTS.get())
                .add(ModItems.VOLCANIC_HELMET.get())
                .add(ModItems.VOLCANIC_CHESTPLATE.get())
                .add(ModItems.VOLCANIC_LEGGINGS.get())
                .add(ModItems.VOLCANIC_BOOTS.get())
                .add(ModItems.FOSSILIZED_AMBER_HELMET.get())
                .add(ModItems.FOSSILIZED_AMBER_CHESTPLATE.get())
                .add(ModItems.FOSSILIZED_AMBER_LEGGINGS.get())
                .add(ModItems.FOSSILIZED_AMBER_BOOTS.get());


    }
}