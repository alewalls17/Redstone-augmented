package com.walls17.redstone_augmented.blocks.cardboard;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class cardboard_item extends BlockItem {
    public cardboard_item(Block block) {
        super(block, new Item.Properties().group(ItemGroup.REDSTONE));
    }
}

