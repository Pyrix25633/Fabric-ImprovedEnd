package net.rupyber_studios.improved_end;

import net.fabricmc.api.ClientModInitializer;

import net.rupyber_studios.improved_end.block.ModBlocks;
import net.rupyber_studios.improved_end.item.ModItems;
import net.rupyber_studios.improved_end.sounds.ModSounds;
import net.rupyber_studios.improved_end.util.ModRegistries;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ImprovedEndClient implements ClientModInitializer {
    public static final Logger LOGGER = LogManager.getLogger("improve_end");

    public static final String MOD_ID = "improved_end";

    @Override
    public void onInitializeClient() {
        ModSounds.registerSounds();

        ModBlocks.registerModBlocks();

        ModRegistries.cutoutBlocks();

        ModItems.registerModItems();

        LOGGER.info("Hello Fabric world!");
    }
}
