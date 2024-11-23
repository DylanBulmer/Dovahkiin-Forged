package net.dovahkiinforged;

import net.dovahkiinforged.commons.ModItems;
import net.dovahkiinforged.commons.item.ModItem;
import net.dovahkiinforged.mapper.ItemMapper;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;

import java.util.List;

public class Items {

    public static Item register(ModItem modItem) {
        // Map values from commons library
        RegistryKey<Item> key = ItemMapper.mapKey(modItem);
        Item.Settings settings = ItemMapper.map(modItem);
        // Register the item.
        return Registry.register(Registries.ITEM, key, new Item(settings));
    }

    public static void initialize() {}

    // WEAPONS
    public static final Item ELVEN_DAGGER = register(ModItems.ELVEN_DAGGER);
    public static final Item ELVEN_SWORD = register(ModItems.ELVEN_SWORD);
    public static final Item GLASS_DAGGER = register(ModItems.GLASS_DAGGER);
    public static final Item GLASS_SWORD = register(ModItems.GLASS_SWORD);

    // MATERIALS
    public static final Item MALACHITE_INGOT = register(ModItems.MALACHITE_INGOT);
    public static final Item MALACHITE_NUGGET = register(ModItems.MALACHITE_NUGGET);
    public static final Item MOONSTONE_INGOT = register(ModItems.MOONSTONE_INGOT);
    public static final Item MOONSTONE_NUGGET = register(ModItems.MOONSTONE_NUGGET);
    public static final Item STEEL_INGOT = register(ModItems.STEEL_INGOT);
    public static final Item STEEL_NUGGET = register(ModItems.STEEL_NUGGET);

    public static final List<Item> ALL_ITEMS = List.of(
            ELVEN_DAGGER, ELVEN_SWORD, GLASS_SWORD, GLASS_DAGGER, MALACHITE_INGOT, MALACHITE_NUGGET, MOONSTONE_INGOT,
            MOONSTONE_NUGGET, STEEL_INGOT, STEEL_NUGGET);

}
