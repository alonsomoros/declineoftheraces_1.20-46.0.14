package net.alar.dotr.client;

public class ClientThirstData {
    private static int playerThirst = 0;

    public static int getPlayerThirst() {
        return playerThirst;
    }

    public static void set(int thirst) {
        playerThirst = thirst;
    }
}
