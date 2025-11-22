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
import java.util.ArrayList;
import net.minecraft.network.PacketBuffer;

/*
 * Renamed from customsteve.aU
 * Duplicate member names - consider using --renamedupmembers true
 */
public class au_0
extends aS {
    public ArrayList<ByteBuf> a;
    public ByteBuf a = null;

    public au_0(ByteBuf cspMPlist) {
        this.a = cspMPlist;
    }

    public au_0(ArrayList buffers) {
        this.a = buffers;
    }

    @Override
    public void a(PacketBuffer var1) throws IOException {
        var1.writeInt(this.a.size());
        for (int i2 = 0; i2 < this.a.size(); ++i2) {
            var1.writeBytes(this.a.get(i2));
        }
    }

    @Override
    public void a(ByteBuf var1) throws IOException {
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

