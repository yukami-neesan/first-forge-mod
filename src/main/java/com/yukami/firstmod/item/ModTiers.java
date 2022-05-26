package com.yukami.firstmod.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier TUNGSTEN = new ForgeTier(3, 3000, 1.5f, 2f, 22, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ModItems.TUNGSTEN_INGOT.get()));
}
