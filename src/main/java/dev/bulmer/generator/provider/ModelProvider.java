package dev.bulmer.generator.provider;

import dev.bulmer.Blocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

public class ModelProvider extends FabricModelProvider {

    public ModelProvider(FabricDataOutput fabricDataOutput) {
        super(fabricDataOutput);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockGenerator) {
        blockGenerator.registerSimpleCubeAll(Blocks.MALACHITE_ORE);
        blockGenerator.registerSimpleCubeAll(Blocks.MOONSTONE_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemGenerator) {

    }

}
