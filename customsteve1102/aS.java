/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 *  net.minecraft.network.PacketBuffer
 */
package customsteve;

import com.google.common.base.Charsets;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class aS {
    public abstract void a(PacketBuffer var1) throws IOException;

    public abstract void a(ByteBuf var1) throws IOException;

    public abstract void a(ChannelHandlerContext var1, ByteBuf var2);

    public abstract void b(ChannelHandlerContext var1, ByteBuf var2);

    public void a(String s, ByteBuf var1) {
        if (s == null) {
            s = "";
        }
        byte[] bytes = s.getBytes(Charsets.UTF_8);
        var1.writeInt(bytes.length);
        var1.writeBytes(bytes);
    }

    public String a(ByteBuf var1) {
        int index = var1.readInt();
        String result = new String(var1.readBytes(index).array(), Charsets.UTF_8);
        return result;
    }
}

