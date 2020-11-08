package com.walls17.redstone_augmented.blocks.pulse_decliner;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

    public class pulse_decliner_item extends BlockItem {
        public pulse_decliner_item(Block block) {
            super(block, new Item.Properties().group(ItemGroup.REDSTONE));
        }
    }
