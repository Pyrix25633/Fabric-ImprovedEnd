package net.rupyber_studios.improved_end;

import net.fabricmc.api.ModInitializer;
import net.rupyber_studios.improved_end.block.ModBlocks;
import net.rupyber_studios.improved_end.item.ModItems;
import net.rupyber_studios.improved_end.sounds.ModSounds;
import net.rupyber_studios.improved_end.util.ModRegistries;
import net.rupyber_studios.improved_end.world.structure.ModStructures;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import software.bernie.geckolib3.GeckoLib;

public class ImprovedEnd implements ModInitializer {
    // This logger is used to write text to the console and the log file.
    // It is considered best practice to use your mod id as the logger's name.
    // That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LogManager.getLogger("improved_end");

    public static final String MOD_ID = "improved_end";

    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        ModSounds.registerSounds();

        ModBlocks.registerModBlocks();

        ModItems.registerModItems();

        GeckoLib.initialize();

        ModRegistries.registerAttributes();

        ModStructures.registerStructureFeatures();

        LOGGER.info("Hello Fabric world!");
    }
}
