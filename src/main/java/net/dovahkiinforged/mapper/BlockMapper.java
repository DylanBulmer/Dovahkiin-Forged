package net.dovahkiinforged.mapper;

import net.dovahkiinforged.commons.constant.ModConstant;
import net.dovahkiinforged.commons.block.ModBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public final class BlockMapper {

    public static Identifier mapId(final ModBlock item) {
        return Identifier.of(ModConstant.MOD_ID, item.getName());
    }

    public static RegistryKey<Block> mapKey(final ModBlock block) {
        Identifier id = mapId(block);
        return RegistryKey.of(RegistryKeys.BLOCK, id);
    }

    public static AbstractBlock.Settings map(final ModBlock block) {
        ModBlock.Traits traits = block.getTraits();
        AbstractBlock.Settings settings = AbstractBlock.Settings.create();

        settings.hardness(traits.getHardness());
        settings.resistance(traits.getResistance());

        if (traits.isBurnable()) { settings.burnable(); }
        if (traits.isLiquid()) { settings.liquid(); }

        // IMPORTANT
        // We need to add the registration key explicitly to avoid warnings/errors from fabric
        settings.registryKey(mapKey(block));

        return settings;
    }

}
