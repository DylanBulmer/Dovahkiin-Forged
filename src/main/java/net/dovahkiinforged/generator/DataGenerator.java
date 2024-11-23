package net.dovahkiinforged.generator;

import net.dovahkiinforged.generator.provider.LootTableProvider;
import net.dovahkiinforged.generator.provider.ModelProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class DataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator generator) {
        // creating the data generator pack
        FabricDataGenerator.Pack pack = generator.createPack();

        // adding the providers
        pack.addProvider(LootTableProvider::new);
        pack.addProvider(ModelProvider::new);
    }
}
