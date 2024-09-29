package net.Jon.constructpro.block.custom;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class LightBlueGlowstoneBlock extends Block {
    public LightBlueGlowstoneBlock() {
        super(BlockBehaviour.Properties.of() // Define properties without using Material
                .lightLevel((state) -> 15) // Set light level to 15
                .strength(0.3f, 1.0f) // Set hardness and resistance
                .noOcclusion()); // Optional: no occlusion like glowstone
    }
}
