package net.rupyber_studios.improved_end.sounds;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.rupyber_studios.improved_end.ImprovedEnd;

public class ModSounds {
    //Discs
    public static SoundEvent TWO_WORLDS_COLLIDE = registerSoundEvent("two_worlds_collide");
    public static SoundEvent NEVER_FORGIVE = registerSoundEvent("never_forgive");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(ImprovedEnd.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }

    public static void registerSounds() {
        System.out.println("Registering ModSounds for " + ImprovedEnd.MOD_ID);
    }
}
