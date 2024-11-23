package net.dovahkiinforged;

import net.dovahkiinforged.commons.constant.ModConstant;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DovahkiinForged implements ModInitializer {
    public static final String MOD_ID = ModConstant.MOD_ID;
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing {}.", MOD_ID);
        Items.initialize();
        Blocks.initialize();
        ItemGroups.initialize();
    }
}