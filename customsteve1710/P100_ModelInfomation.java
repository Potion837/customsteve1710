/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 *  net.minecraft.network.PacketBuffer
 */
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import java.io.IOException;
import java.util.ArrayList;
import net.minecraft.network.PacketBuffer;

public class P100_ModelInfomation
extends BasicPacket {
    public ArrayList cluster$ = new ArrayList();
    public ByteBuf patrick$ = null;

    public P100_ModelInfomation(ByteBuf cspMPlist) {
        this.patrick$ = cspMPlist;
    }

    public P100_ModelInfomation(ArrayList buffers) {
        this.cluster$ = buffers;
    }

    public void a(PacketBuffer var1) throws IOException {
        var1.writeInt(this.cluster$.size());
        for (int i = 0; i < this.cluster$.size(); ++i) {
            var1.writeBytes((ByteBuf)this.cluster$.get(i));
        }
    }

    public void a(ByteBuf var1) throws IOException {
    }

    public void a(ChannelHandlerContext ctx, ByteBuf buf) {
        try {
            this.a((PacketBuffer)buf);
        }
        catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    public void b(ChannelHandlerContext ctx, ByteBuf buf) {
    }
}

