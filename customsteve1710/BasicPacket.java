/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 *  net.minecraft.network.PacketBuffer
 */
import com.google.common.base.Charsets;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;

public abstract class BasicPacket {
    public abstract void _asking(PacketBuffer var1) throws IOException;

    public abstract void _lookup(ByteBuf var1) throws IOException;

    public abstract void _brief(ChannelHandlerContext var1, ByteBuf var2);

    public abstract void _johns(ChannelHandlerContext var1, ByteBuf var2);

    public void _despite(String s, ByteBuf var1) {
        if (s == null) {
            s = "";
        }
        byte[] bytes = s.getBytes(Charsets.UTF_8);
        var1.writeInt(bytes.length);
        var1.writeBytes(bytes);
    }

    public String _dynamics(ByteBuf var1) {
        int index = var1.readInt();
        String result = new String(var1.readBytes(index).array(), Charsets.UTF_8);
        return result;
    }
}

