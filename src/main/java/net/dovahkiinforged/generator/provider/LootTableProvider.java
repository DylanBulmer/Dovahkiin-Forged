package net.dovahkiinforged.generator.provider;

import net.dovahkiinforged.Blocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class LootTableProvider extends FabricBlockLootTableProvider {

    public LootTableProvider(FabricDataOutput fabricDataOutput,
                             CompletableFuture<RegistryWrapper.WrapperLookup> lookupCompletableFuture) {
        super(fabricDataOutput, lookupCompletableFuture);
    }

    @Override
    public void generate() {
        // add drops for all blocks.
        Blocks.ALL_BLOCKS.forEach(this::addDrop);
    }
}
