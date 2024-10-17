package net.Jon.constructpro.util;

import net.Jon.constructpro.ConstructPro;
import net.Jon.constructpro.item.ModItems;
import net.Jon.constructpro.component.ModDataComponentTypes;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;

import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;

public class ModItemProperties {
    public static void addCustomItemProperties() {
        ItemProperties.register(ModItems.Chisel.get(), ResourceLocation.fromNamespaceAndPath(ConstructPro.MOD_ID, "used"),
                (itemStack, clientLevel, livingEntity, i) -> itemStack.get(ModDataComponentTypes.COORDINATES.get()) != null ? 1f : 0f);

    }
}
