package net.alar.dotr.util;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.settings.KeyConflictContext;
import org.lwjgl.glfw.GLFW;

public class KeyBinding {
    public static final String KEYBIND_CATEGORY_MOD = "key.category.dotr.tutorial";
    public static final String KEY_DRINK_WATER = "key.dotr.drink_water";

    public static final KeyMapping DRINKING_WATER = new KeyMapping(KEY_DRINK_WATER, KeyConflictContext.IN_GAME, InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_R, KEYBIND_CATEGORY_MOD);
}
