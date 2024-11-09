package xyz.ankairmc.ankair.server.packet.play;

import xyz.ankairmc.ankair.network.packet.Packet;
import xyz.ankairmc.ankair.network.listener.IPlayListener;
import xyz.ankairmc.ankair.network.PacketBuffer;

public class S0EPositionAndLookPacket implements Packet<IPlayListener> {
    @Override
    public void read(PacketBuffer data) {
        Packet.super.read(data);
    }

    @Override
    public void listener(IPlayListener listener) {
        listener.handlePlayerPositionAndLookPacket(this);
    }
}
