package com.yukami.firstmod.item;

import com.yukami.firstmod.FirstMod;
import com.yukami.firstmod.item.custom.CoalCokeItem;
import com.yukami.firstmod.item.custom.EnlighteningRod;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FirstMod.MOD_ID);

    public static final RegistryObject<Item> ENLIGHTEN_ROD = ITEMS.register("enlightening_rod", () -> new EnlighteningRod(new Item.Properties().tab(ModCreativeTab.MAGIC_TAB).stacksTo(1).fireResistant()));

    public static final RegistryObject<Item> GOD_APPLE = ITEMS.register("god_apple", () -> new Item(new Item.Properties().tab(ModCreativeTab.MAGIC_TAB).stacksTo(16).fireResistant().food(ModFoods.GOD_APPLE)));
    public static final RegistryObject<Item> TUNGSTEN_INGOT = ITEMS.register("tungsten_ingot", () -> new Item(new Item.Properties().tab(ModCreativeTab.MAGIC_TAB)));

    public static final RegistryObject<Item> TUNGSTEN_ORE = ITEMS.register("raw_tungsten", () -> new Item(new Item.Properties().tab(ModCreativeTab.MAGIC_TAB)));

    public static final RegistryObject<Item> TUNGSTEN_SWORD = ITEMS.register("tungsten_sword", () -> new SwordItem(ModTiers.TUNGSTEN, 2, 3f, new Item.Properties().tab(ModCreativeTab.MAGIC_TAB)));
    public static final RegistryObject<Item> TUNGSTEN_PICKAXE = ITEMS.register("tungsten_pickaxe", () -> new SwordItem(ModTiers.TUNGSTEN, 2, 3f, new Item.Properties().tab(ModCreativeTab.MAGIC_TAB)));
    public static final RegistryObject<Item> TUNGSTEN_AXE = ITEMS.register("tungsten_axe", () -> new SwordItem(ModTiers.TUNGSTEN, 2, 3f, new Item.Properties().tab(ModCreativeTab.MAGIC_TAB)));
    public static final RegistryObject<Item> TUNGSTEN_HOE = ITEMS.register("tungsten_hoe", () -> new SwordItem(ModTiers.TUNGSTEN, 2, 3f, new Item.Properties().tab(ModCreativeTab.MAGIC_TAB)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
