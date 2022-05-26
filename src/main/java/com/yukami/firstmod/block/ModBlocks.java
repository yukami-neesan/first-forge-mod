package com.yukami.firstmod.block;

import com.yukami.firstmod.FirstMod;
import com.yukami.firstmod.block.custom.SpeedyBlock;
import com.yukami.firstmod.item.ModCreativeTab;
import com.yukami.firstmod.item.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, FirstMod.MOD_ID);
    /*Block list:
    - Tungsten:
        - Ore
        - Raw ore
        - Wall
        - Door
        - Block
        - Slab
        - Stair
        - Trapdoor
     */

    public static final RegistryObject<DoorBlock> TUNGSTEN_DOOR = registerBlock("tungsten_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.METAL).strength(7f).noOcclusion().explosionResistance(7f).requiresCorrectToolForDrops()), ModCreativeTab.MAGIC_TAB);

    public static final RegistryObject<Block> TUNGSTEN_ORE = registerBlock("tungsten_ore", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(7f).explosionResistance(6f).requiresCorrectToolForDrops()), ModCreativeTab.MAGIC_TAB);
    public static final RegistryObject<Block> TUNGSTEN_BLOCK = registerBlock("tungsten_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(7f).explosionResistance(7f).requiresCorrectToolForDrops()), ModCreativeTab.MAGIC_TAB);

    public static final RegistryObject<StairBlock> TUNGSTEN_STAIRS = registerBlock("tungsten_stairs", () -> new StairBlock(() -> ModBlocks.TUNGSTEN_BLOCK.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.METAL).strength(7f).explosionResistance(7f).requiresCorrectToolForDrops()), ModCreativeTab.MAGIC_TAB);

    public static final RegistryObject<SlabBlock> TUNGSTEN_SLAB = registerBlock("tungsten_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.METAL).strength(7f).explosionResistance(7f).requiresCorrectToolForDrops()), ModCreativeTab.MAGIC_TAB);

    public static final RegistryObject<WallBlock> TUNGSTEN_WALL = registerBlock("tungsten_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.METAL).strength(7f).explosionResistance(7f).requiresCorrectToolForDrops()), ModCreativeTab.MAGIC_TAB);

    public static final RegistryObject<Block> RAW_TUNGSTEN_BLOCK = registerBlock("raw_tungsten_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(7f).explosionResistance(7f).requiresCorrectToolForDrops()), ModCreativeTab.MAGIC_TAB);

    public static final RegistryObject<TrapDoorBlock> TUNGSTEN_TRAPDOOR = registerBlock("tungsten_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(7f).explosionResistance(7f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeTab.MAGIC_TAB);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab, String tooltip){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab, tooltip);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab, String tooltip){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)){
            @Override
            public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
                pTooltip.add(new TranslatableComponent(tooltip));
            }
        });
    }
    public static void  register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
