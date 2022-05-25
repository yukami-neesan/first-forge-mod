package com.yukami.firstmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeTab {
    public static final CreativeModeTab MAGIC_TAB = new CreativeModeTab("magictab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ENLIGHTEN_ROD.get());
        }
    };
}
