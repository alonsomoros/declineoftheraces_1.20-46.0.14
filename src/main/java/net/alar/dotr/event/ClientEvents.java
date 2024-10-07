package net.alar.dotr.event;

import net.alar.dotr.DOTR;
import net.alar.dotr.client.ThirstHudOverlay;
import net.alar.dotr.networking.ModMessages;
import net.alar.dotr.networking.packet.DrinkWaterC2SPacket;
import net.alar.dotr.networking.packet.ExampleC2SPacket;
import net.alar.dotr.util.KeyBinding;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.event.RegisterGuiOverlaysEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class ClientEvents {

    @Mod.EventBusSubscriber(modid = DOTR.MOD_ID, value = Dist.CLIENT)
    public static class ClientForgeEvents {

        @SubscribeEvent
        public static void onKeyInput(InputEvent.Key event) {
            // Register key bindings here
            if (KeyBinding.DRINKING_WATER.consumeClick()) {
                ModMessages.sendToServer(new DrinkWaterC2SPacket());
            }
        }

    }
    @Mod.EventBusSubscriber(modid = DOTR.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModBusEvents {

        @SubscribeEvent
        public static void onKeyRegister(RegisterKeyMappingsEvent event) {
            // Register key bindings here
            event.register(KeyBinding.DRINKING_WATER);
        }

        @SubscribeEvent
        public static void registerGuiOverlays(RegisterGuiOverlaysEvent event) {
            // Register key bindings here
//            event.registerAboveAll("thirst", ThirstHudOverlay.HUD_THIRST);
        }

    }
}
