package com.walls17.redstone_augmented.init;

import com.walls17.redstone_augmented.blocks.cardboard.cardboard_item;
import com.walls17.redstone_augmented.blocks.pulse_decliner.pulse_decliner_item;
import com.walls17.redstone_augmented.items.bone_glue;
import com.walls17.redstone_augmented.items.wrench;
import com.walls17.redstone_augmented.redstone_augmented;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class redstone_augmented_items {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, redstone_augmented.MOD_ID);

    //items
    public static final RegistryObject<Item> WRENCH = ITEMS.register("wrench", wrench::new);
    public static final RegistryObject<Item> BONE_GLUE = ITEMS.register("bone_glue", bone_glue::new);
    //item blocks
    public static final RegistryObject<Item> CARDBOARD_ITEM = ITEMS.register("cardboard", () -> new cardboard_item(redstone_augmented_blocks.CARDBOARD.get()));
    public static final RegistryObject<Item> PULSE_DECLINER_ITEM = ITEMS.register("pulse_decliner", () -> new pulse_decliner_item(redstone_augmented_blocks.CARDBOARD.get()));
}
