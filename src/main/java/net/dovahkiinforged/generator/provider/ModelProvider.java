package net.dovahkiinforged.generator.provider;

import net.dovahkiinforged.Blocks;
import net.dovahkiinforged.Items;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModelProvider extends FabricModelProvider {

    public ModelProvider(FabricDataOutput fabricDataOutput) {
        super(fabricDataOutput);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockGenerator) {
        // generate all block models.
        Blocks.ALL_BLOCKS.forEach(blockGenerator::registerSimpleCubeAll);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemGenerator) {
        // generate all item models.
        Items.ALL_ITEMS.forEach(item -> itemGenerator.register(item, Models.GENERATED));
    }

}
