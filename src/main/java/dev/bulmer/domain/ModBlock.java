package dev.bulmer.domain;

import dev.bulmer.DovahkiinForged;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.io.Serializable;

public enum ModBlock implements Serializable {
    MALACHITE_ORE(BlockType.ORE, "malachite_ore", 3),
    MOONSTONE_ORE(BlockType.ORE, "moonstone_ore", 3),
    RAW_MALACHITE_BLOCK(BlockType.BLOCK, "raw_malachite_block", 3),
    RAW_MOONSTONE_BLOCK(BlockType.BLOCK, "raw_moonstone_block", 3),
    MALACHITE_BLOCK(BlockType.BLOCK, "malachite_block", 1.5f),
    MOONSTONE_BLOCK(BlockType.BLOCK, "moonstone_block", 1.5f);

    private final Identifier id;
    private final RegistryKey<Block> key;
    private final String name;
    private final float hardness;
    private final AbstractBlock.Settings settings;
    private final Item.Settings itemSettings;
    private final RegistryKey<Item> itemKey;

    ModBlock(final String type, final String name, final float hardness) {
        this.id = Identifier.of(DovahkiinForged.MOD_ID, name);
        this.key = RegistryKey.of(RegistryKeys.BLOCK, id);

        this.name = name;
        this.hardness = hardness;

        AbstractBlock.Settings blockSettings;
        switch (type) {
            case BlockType.ORE:
                blockSettings = AbstractBlock.Settings
                        .copy(Blocks.IRON_ORE)
                        .hardness(hardness)
                        .registryKey(key);
                break;
            case BlockType.BLOCK:
            default:
                blockSettings = AbstractBlock.Settings
                        .copy(Blocks.STONE)
                        .hardness(hardness)
                        .registryKey(key);
                break;
        }

        this.itemKey = RegistryKey.of(RegistryKeys.ITEM, id);
        Item.Settings itemSettings = new Item.Settings()
                .useBlockPrefixedTranslationKey()
                .registryKey(itemKey);

        this.settings = blockSettings;
        this.itemSettings = itemSettings;
    }

    // getters
    public String getName() { return name; }
    public AbstractBlock.Settings getSettings() { return settings; }
    public Item.Settings getItemSettings() { return itemSettings; }
    public float getHardness() { return hardness; }
    public Identifier getId() { return id; }
    public RegistryKey<Block> getKey() { return key; }
    public RegistryKey<Item> getItemKey() { return itemKey; }

    private static final class BlockType {
        public static final String BLOCK = "BLOCK";
        public static final String ORE = "ORE";
    }

}
