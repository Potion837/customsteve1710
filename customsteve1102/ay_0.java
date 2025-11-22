/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 *  net.minecraft.network.PacketBuffer
 */
package customsteve;

import customsteve.aS;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;

/*
 * Renamed from customsteve.aY
 */
public class ay_0
extends aS {
    public int a = -1;

    public ay_0(int error) {
        this.a = error;
    }

    public ay_0(ByteBuf buf) throws IOException {
        this.a(buf);
    }

    @Override
    public void a(PacketBuffer var1) throws IOException {
        var1.writeInt(this.a);
    }

    @Override
    public void a(ByteBuf var1) throws IOException {
        this.a = var1.readInt();
    }

    @Override
    public void a(ChannelHandlerContext ctx, ByteBuf buf) {
        try {
            this.a((PacketBuffer)buf);
        }
        catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    @Override
    public void b(ChannelHandlerContext ctx, ByteBuf buf) {
    }
}

