package dev.bulmer.generator.provider;

import dev.bulmer.Blocks;
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
        addDrop(Blocks.MALACHITE_ORE);
//        addDrop(Blocks.RAW_MALACHITE_BLOCK);
        addDrop(Blocks.MOONSTONE_ORE);
//        addDrop(Blocks.RAW_MOONSTONE_BLOCK);
    }
}
