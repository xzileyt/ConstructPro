package net.Jon.constructpro.block.custom;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class RedGlowstoneBlock extends Block {
    public RedGlowstoneBlock() {
        super(BlockBehaviour.Properties.of()
                .lightLevel((state) -> 15)
                .strength(0.3f, 1.0f)
                .noOcclusion());
    }
}
