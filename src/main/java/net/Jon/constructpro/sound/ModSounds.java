package net.Jon.constructpro.sound;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.Jon.constructpro.ConstructPro;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, ConstructPro.MOD_ID);

    // Register the sound event using the helper method
    public static final RegistryObject<SoundEvent> TIME_SHIFTER_SOUND = SOUNDS.register("clock_use",
            () -> SoundEvent.createVariableRangeEvent(ResourceLocation.tryParse("minecraft:item.clock.use")));
}
