package net.Jon.constructpro.datagen;

import net.Jon.constructpro.ConstructPro;
import net.Jon.constructpro.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ConstructPro.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.Celestial.get());
        basicItem(ModItems.CrimsonQuartz.get());
        basicItem(ModItems.Molten.get());
        basicItem(ModItems.starlite.get());
        basicItem(ModItems.FossilizedAmber.get());

        basicItem(ModItems.Chisel.get());
        basicItem(ModItems.TROWEL.get());
        basicItem(ModItems.GEO_ANALYZER.get());

        basicItem(ModItems.ETERNAL_STEAK.get());
    }
}