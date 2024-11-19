package dev.bulmer;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DovahkiinForged implements ModInitializer {
    public static final String MOD_ID = "dovahkiin-forged";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing {}.", MOD_ID);
        Items.initialize();
        Blocks.initialize();
    }
}