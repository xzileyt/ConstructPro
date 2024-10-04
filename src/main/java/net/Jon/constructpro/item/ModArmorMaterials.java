package net.Jon.constructpro.item;

import net.Jon.constructpro.ConstructPro;
import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ModArmorMaterials {
    // Armors
    public static final Holder<ArmorMaterial> CELESTIAL_ARMOR_MATERIAL = register("celestial", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.LEGGINGS, 7);
                attribute.put(ArmorItem.Type.CHESTPLATE, 9);
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 15, 4f, 0.1f, () -> ModItems.CELESTIAL.get());

    public static final Holder<ArmorMaterial> MOLTEN_ARMOR_MATERIAL = register("molten", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 3);
                attribute.put(ArmorItem.Type.LEGGINGS, 6);
                attribute.put(ArmorItem.Type.CHESTPLATE, 8);
                attribute.put(ArmorItem.Type.HELMET, 3);
                attribute.put(ArmorItem.Type.BODY, 11);
            }), 15, 4f, 0.1f, () -> ModItems.Molten.get());

    public static final Holder<ArmorMaterial> VOOLCANIC_ARMOR_MATERIAL = register("volcanic", Util.make(new EnumMap<>(ArmorItem.Type.class),
            attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.LEGGINGS, 9);
                attribute.put(ArmorItem.Type.CHESTPLATE, 10);
                attribute.put(ArmorItem.Type.HELMET, 6);
                attribute.put(ArmorItem.Type.BODY, 15);
            }), 25, 5f, 0.2f, () -> ModItems.volcanic_ingot.get());



    private static Holder<ArmorMaterial> register(String name, EnumMap<ArmorItem.Type, Integer> typeProtection,
                                                  int enchantability, float toughness, float knockbackResistance,
                                                  Supplier<Item> ingredientItem) {
        ResourceLocation location = ResourceLocation.fromNamespaceAndPath(ConstructPro.MOD_ID, name);
        Holder<SoundEvent> equipSound = SoundEvents.ARMOR_EQUIP_NETHERITE;
        Supplier<Ingredient> ingredient = () -> Ingredient.of(ingredientItem.get());
        List<ArmorMaterial.Layer> layers = List.of(new ArmorMaterial.Layer(location));

        EnumMap<ArmorItem.Type, Integer> typeMap = new EnumMap<>(ArmorItem.Type.class);
        for (ArmorItem.Type type : ArmorItem.Type.values()) {
            typeMap.put(type, typeProtection.get(type));
        }

        return Registry.registerForHolder(BuiltInRegistries.ARMOR_MATERIAL, location,
                new ArmorMaterial(typeProtection, enchantability, equipSound, ingredient, layers, toughness, knockbackResistance));
    }
}