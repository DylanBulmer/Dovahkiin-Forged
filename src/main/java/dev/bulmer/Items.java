package dev.bulmer;

import dev.bulmer.domain.ModItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class Items {
    public static Item register(ModItem modItem) {
        // Register the item.
        return Registry.register(Registries.ITEM, modItem.getKey(), new Item(modItem.getSettings()));
    }

    public static void initialize() {}

    public static final Item ELVEN_DAGGER = register(ModItem.ELVEN_DAGGER);
    public static final Item ELVEN_SWORD = register(ModItem.ELVEN_SWORD);
    public static final Item GLASS_DAGGER = register(ModItem.GLASS_DAGGER);
    public static final Item GLASS_SWORD = register(ModItem.GLASS_SWORD);

}
