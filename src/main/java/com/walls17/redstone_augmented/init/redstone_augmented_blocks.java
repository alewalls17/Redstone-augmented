package com.walls17.redstone_augmented.init;

import com.walls17.redstone_augmented.blocks.cardboard.cardboard;
import com.walls17.redstone_augmented.blocks.pulse_decliner.pulse_decliner;
import com.walls17.redstone_augmented.redstone_augmented;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class redstone_augmented_blocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, redstone_augmented.MOD_ID);

    //blocks
    public static final RegistryObject<Block> CARDBOARD = BLOCKS.register("cardboard", cardboard::new);
    public static final RegistryObject<Block> PULSE_DECLINER = BLOCKS.register("pulse_decliner", pulse_decliner::new);

}
