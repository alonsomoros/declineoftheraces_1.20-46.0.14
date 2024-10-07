package net.alar.dotr.networking.packet;

import net.alar.dotr.networking.ModMessages;
import net.alar.dotr.thirst.PlayerThirst;
import net.alar.dotr.thirst.PlayerThirstProvider;
import net.minecraft.ChatFormatting;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.network.NetworkEvent;

import java.util.function.Supplier;

public class DrinkWaterC2SPacket { // Client -> Server

    private static final String MESSAGE_DRINK_WATER = "message.dotr.drink_water";
    private static final String MESSAGE_NO_WATER = "message.dotr.no_water";

    public DrinkWaterC2SPacket() {
        // Constructor
    }

    public DrinkWaterC2SPacket(FriendlyByteBuf buf) {
        // Constructor with parameters
    }

    public void toBytes(FriendlyByteBuf buf) {
        // Write data to the buffer
    }

    public boolean handle(Supplier<NetworkEvent.Context> supplier) {
        NetworkEvent.Context context = supplier.get();
        context.enqueueWork(() -> {
            ServerPlayer player = context.getSender();
            ServerLevel level = player.getServer().getLevel(player.getCommandSenderWorld().dimension());

            if (hasWaterAroundThere(player, level, 2)) {
                // Notify the player that he drank water
                player.sendSystemMessage(Component.translatable(MESSAGE_DRINK_WATER).withStyle(ChatFormatting.AQUA));

                // Play the drinking sound
                level.playSound(null, player.getOnPos(),
                        SoundEvents.GENERIC_DRINK, SoundSource.PLAYERS, 0.5F, level.random.nextFloat() * 0.1f + 0.9f);

                // Increase the water level
                player.getCapability(PlayerThirstProvider.PLAYER_THIRST).ifPresent(
                        thirst -> {
                            thirst.addThirst(1);
                            player.sendSystemMessage(
                                    Component.literal("Thirst: " + thirst.getThirst())
                                            .withStyle(ChatFormatting.AQUA));
                            ModMessages.sendToPlayer(new ThirstDataSyncS2CPacket(thirst.getThirst()), player);
                });

                // Output the player's thirst level

            } else {
                // Notify the player that there is no water around
                player.sendSystemMessage(Component.translatable(MESSAGE_NO_WATER).withStyle(ChatFormatting.RED));

                // Output the player's thirst level
                player.getCapability(PlayerThirstProvider.PLAYER_THIRST).ifPresent(
                        thirst -> {
                            player.sendSystemMessage(Component.literal("Thirst: " + thirst.getThirst())
                                    .withStyle(ChatFormatting.AQUA));
                            ModMessages.sendToPlayer(new ThirstDataSyncS2CPacket(thirst.getThirst()), player);
                        });

            }
        });

        return true;
    }

    private boolean hasWaterAroundThere(ServerPlayer player, ServerLevel level, int size) {
        return level.getBlockStates(player.getBoundingBox().inflate(size)).filter(state -> state.is(Blocks.WATER)).toArray().length > 0;
    }
}
