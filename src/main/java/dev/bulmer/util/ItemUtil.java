package dev.bulmer.util;

import net.minecraft.item.Item;

public final class ItemUtil {
    public static Item.Settings buildDaggerSettings() {
        return new Item.Settings().maxCount(1).maxDamage(3).useCooldown(0.5f);
    }
    public static Item.Settings buildSwordSettings() {
        return new Item.Settings().maxCount(1).maxDamage(5).useCooldown(1f);
    }
}
