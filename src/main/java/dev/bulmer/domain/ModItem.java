package dev.bulmer.domain;

import dev.bulmer.DovahkiinForged;
import dev.bulmer.util.ItemUtil;
import net.minecraft.block.AbstractBlock;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.io.Serializable;

public enum ModItem implements Serializable {
    ELVEN_DAGGER(ItemType.DAGGER, "elven_dagger"),
    ELVEN_SWORD(ItemType.SWORD, "elven_sword"),
    GLASS_DAGGER(ItemType.DAGGER, "glass_dagger"),
    GLASS_SWORD(ItemType.SWORD, "glass_sword"),
    MALACHITE_NUGGET(ItemType.ITEM, "malachite_nugget"),
    MALACHITE_INGOT(ItemType.ITEM, "malachite_ingot");

    private final Identifier id;
    private final RegistryKey<Item> key;
    private final String name;
    private final Item.Settings settings;

    ModItem(final String type, final String name) {
        this.id = Identifier.of(DovahkiinForged.MOD_ID, name);
        this.key = RegistryKey.of(RegistryKeys.ITEM, id);

        this.name = name;

        AbstractBlock.Settings blockSettings;
        switch (type) {
            case ItemType.DAGGER:
                this.settings = ItemUtil.buildDaggerSettings()
                        .registryKey(key);
                break;
            case ItemType.SWORD:
                this.settings = ItemUtil.buildSwordSettings()
                       .registryKey(key);
               break;
            default:
                this.settings = new Item.Settings();
        }
    }

    // getters
    public String getName() { return name; }
    public Identifier getId() { return id; }
    public RegistryKey<Item> getKey() { return key; }
    public Item.Settings getSettings() { return settings; }

    private static final class ItemType {
        public static final String ITEM = "ITEM";
        public static final String DAGGER = "DAGGER";
        public static final String SWORD = "SWORD";
    }

}
