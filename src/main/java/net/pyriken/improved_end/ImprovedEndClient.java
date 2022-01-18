package net.pyriken.improved_end;

import net.fabricmc.api.ClientModInitializer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ImprovedEndClient implements ClientModInitializer {
    public static final Logger LOGGER = LogManager.getLogger("improve_end");

    public static final String MOD_ID = "improved_end";

    @Override
    public void onInitializeClient() {
        LOGGER.info("Hello Fabric world!");
    }
}
