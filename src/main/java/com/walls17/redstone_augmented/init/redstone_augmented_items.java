package com.walls17.redstone_augmented.init;

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
    //item blocks

}
