package net.dovahkiinforged;

import net.dovahkiinforged.commons.constant.ModConstant;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;

public class ItemGroups {

    private static void register(final String name, final ItemGroup itemGroup) {
        Registry.register(Registries.ITEM_GROUP, name, itemGroup);
    }

    public static void initialize() {
        register("dovahkiin-forged", DOVAHKIIN_FORGED);
    }

    public static final ItemGroup DOVAHKIIN_FORGED = FabricItemGroup.builder()
            .icon(() -> new ItemStack(Items.ELVEN_DAGGER))
            .displayName(Text.translatable(ModConstant.ITEM_GROUP_KEY))
            .entries((ctx, entries) -> {
                Items.ALL_ITEMS.forEach(item -> entries.add(new ItemStack(item)));
                Blocks.ALL_BLOCKS.forEach(block -> entries.add(new ItemStack(block)));
            })
            .build();

}
