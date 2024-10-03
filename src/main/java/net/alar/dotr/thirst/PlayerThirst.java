package net.alar.dotr.thirst;

import net.minecraft.nbt.CompoundTag;

public class PlayerThirst {
    private int thirst;
    private final int MAX_THIRST = 10;
    private final int MIN_THIRST = 0;

    public int getThirst() {
        return thirst;
    }

    public void addThirst(int amount) {
        thirst = Math.min(MAX_THIRST, thirst + amount);
    }

    public void subThirst(int amount) {
        thirst = Math.max(MIN_THIRST, thirst - amount);
    }

    public void copyFrom(PlayerThirst other) {
        this.thirst = other.thirst;
    }

    public void saveNBTdata(CompoundTag nbt) {
        nbt.putInt("thirst", thirst);
    }

    public void loadNBTdata(CompoundTag nbt) {
        thirst = nbt.getInt("thirst");
    }
}
