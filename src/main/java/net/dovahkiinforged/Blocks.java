package net.dovahkiinforged;

import net.dovahkiinforged.commons.ModBlocks;
import net.dovahkiinforged.commons.block.ModBlock;
import net.dovahkiinforged.mapper.BlockMapper;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;

import java.util.List;

public class Blocks {

    public static Block register(ModBlock modBlock, boolean shouldRegisterItem) {
        // Register the block and its item.
        RegistryKey<Block> key = BlockMapper.mapKey(modBlock);
        AbstractBlock.Settings settings = BlockMapper.map(modBlock);
        Block block = Registry.register(Registries.BLOCK, key, new Block(settings));

        // Sometimes, you may not want to register an item for the modBlock.
        // Eg: if it's a technical modBlock like `minecraft:air` or `minecraft:end_gateway`
        if (shouldRegisterItem) {
            Items.register(block);
        }

        return block;
    }

    public static void initialize() {}

    public static final Block MALACHITE_ORE;
    public static final Block MOONSTONE_ORE;
    public static final Block RAW_MALACHITE_BLOCK;
    public static final Block RAW_MOONSTONE_BLOCK;
    public static final Block MALACHITE_BLOCK;
    public static final Block MOONSTONE_BLOCK;

    static {
        MALACHITE_ORE = register(ModBlocks.MALACHITE_ORE, true);
        MOONSTONE_ORE = register(ModBlocks.MOONSTONE_ORE, true);
        RAW_MALACHITE_BLOCK = register(ModBlocks.RAW_MALACHITE_BLOCK, true);
        RAW_MOONSTONE_BLOCK = register(ModBlocks.RAW_MOONSTONE_BLOCK, true);
        MALACHITE_BLOCK = register(ModBlocks.MALACHITE_BLOCK, true);
        MOONSTONE_BLOCK = register(ModBlocks.MOONSTONE_BLOCK, true);
    }

    public static final List<Block> ALL_BLOCKS = List.of(
            MALACHITE_BLOCK, MOONSTONE_BLOCK, RAW_MALACHITE_BLOCK, RAW_MOONSTONE_BLOCK, MALACHITE_ORE, MOONSTONE_ORE);
}
