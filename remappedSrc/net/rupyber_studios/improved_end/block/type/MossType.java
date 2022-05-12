package net.rupyber_studios.improved_end.block.type;

import net.minecraft.util.StringIdentifiable;

public enum MossType implements StringIdentifiable {
    MOSS(1), WASP_MOSS(2), VOID(0);

    private final String name;
    public final int type;

    MossType(int type) {
        this.name = type == 0 ? "void" : (type == 1 ? "moss" : "wasp_moss");
        this.type = type;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public String asString() {
        return name;
    }
}