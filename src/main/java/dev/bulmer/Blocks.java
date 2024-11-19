package dev.bulmer;

import dev.bulmer.domain.ModBlock;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class Blocks {
    public static Block register(ModBlock modBlock, boolean shouldRegisterItem) {
        // Register the block and its item.

        // Sometimes, you may not want to register an item for the modBlock.
        // Eg: if it's a technical modBlock like `minecraft:air` or `minecraft:end_gateway`
        if (shouldRegisterItem) {
            Registry.register(Registries.ITEM, modBlock.getItemKey(), new Item(modBlock.getItemSettings()));
        }

        return Registry.register(Registries.BLOCK, modBlock.getKey(), new Block(modBlock.getSettings()));
    }

    public static void initialize() {}

    public static final Block MALACHITE_ORE;
    public static final Block MOONSTONE_ORE;
    public static final Block RAW_MALACHITE_BLOCK;
    public static final Block RAW_MOONSTONE_BLOCK;
    public static final Block MALACHITE_BLOCK;
    public static final Block MOONSTONE_BLOCK;

    static {
        MALACHITE_ORE = register(ModBlock.MALACHITE_ORE, true);
        MOONSTONE_ORE = register(ModBlock.MOONSTONE_ORE, true);
        RAW_MALACHITE_BLOCK = register(ModBlock.RAW_MALACHITE_BLOCK, true);
        RAW_MOONSTONE_BLOCK = register(ModBlock.RAW_MOONSTONE_BLOCK, true);
        MALACHITE_BLOCK = register(ModBlock.MALACHITE_BLOCK, true);
        MOONSTONE_BLOCK = register(ModBlock.MOONSTONE_BLOCK, true);
    }
}
