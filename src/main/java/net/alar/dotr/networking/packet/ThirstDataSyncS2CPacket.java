package net.alar.dotr.networking.packet;

import net.alar.dotr.client.ClientThirstData;
import net.alar.dotr.thirst.PlayerThirstProvider;
import net.minecraft.ChatFormatting;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.network.NetworkEvent;

import java.util.function.Supplier;

public class ThirstDataSyncS2CPacket { // Client -> Server

    private final int thirst;

    public ThirstDataSyncS2CPacket(int thirst) {
        // Constructor
        this.thirst = thirst;
    }

    public ThirstDataSyncS2CPacket(FriendlyByteBuf buf) {
        // Constructor with parameters
        this.thirst = buf.readInt();
    }

    public void toBytes(FriendlyByteBuf buf) {
        // Write data to the buffer
        buf.writeInt(thirst);
    }

    public boolean handle(Supplier<NetworkEvent.Context> supplier) {
        NetworkEvent.Context context = supplier.get();
        context.enqueueWork(() -> {
            // HERE WERE ON THE CLIENT
            ClientThirstData.set(thirst);
        });

        return true;
    }

    private boolean hasWaterAroundThere(ServerPlayer player, ServerLevel level, int size) {
        return level.getBlockStates(player.getBoundingBox().inflate(size)).filter(state -> state.is(Blocks.WATER)).toArray().length > 0;
    }
}
