package net.alar.dotr.networking.packet;

import com.google.common.graph.Network;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraftforge.network.NetworkEvent;

import javax.swing.text.html.parser.Entity;
import java.util.function.Supplier;

public class ExampleC2SPacket { // Client -> Server

    public ExampleC2SPacket() {
        // Constructor
    }

    public ExampleC2SPacket(FriendlyByteBuf buf) {
        // Constructor with parameters
    }

    public void toBytes(FriendlyByteBuf buf) {
        // Write data to the buffer
    }

    public boolean handle(Supplier<NetworkEvent.Context> supplier) {
        NetworkEvent.Context context = supplier.get();
        context.enqueueWork(() -> {
            // Here we are in the server thread
            ServerPlayer player = context.getSender();
            ServerLevel world = player.getServer().getLevel(player.getCommandSenderWorld().dimension());

//            EntityType.COW.spawn(world, null, null,
//                    player.blockPosition(), MobSpawnType.COMMAND, true, false);
        });

        return true;
    }
}
