package xyz.ankairmc.ankair.server.packet.play;

import xyz.ankairmc.ankair.network.packet.Packet;
import xyz.ankairmc.ankair.network.listener.IPlayListener;
import xyz.ankairmc.ankair.network.PacketBuffer;
import xyz.ankairmc.ankair.server.packet.play.chat.IChatComponent;
import xyz.ankairmc.ankair.server.packet.play.chat.ChatType;

public class C0FPlayChatMessagePacket implements Packet<IPlayListener> {
    private final ChatType type;
    private final IChatComponent component;

    public C0FPlayChatMessagePacket(ChatType type, IChatComponent component) {
        this.type = type;
        this.component = component;
    }

    @Override
    public void write(PacketBuffer data) {
        data.writeUtfString(component.toString());
        data.writeByte(type.id);
    }
}
