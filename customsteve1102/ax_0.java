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
 * Renamed from customsteve.aX
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ax_0
extends aS {
    public boolean[] a;
    public String a;
    public boolean a = true;
    public boolean b = true;

    public ax_0() {
    }

    public ax_0(ByteBuf buf) throws IOException {
        this.a(buf);
    }

    @Override
    public void a(PacketBuffer var1) throws IOException {
        this.a(this.a, (ByteBuf)var1);
        block4: for (int i2 = 0; i2 < this.a.length; ++i2) {
            switch (i2) {
                case 0: {
                    this.a[i2] = this.a;
                    continue block4;
                }
                case 1: {
                    this.a[i2] = this.b;
                }
            }
        }
        for (boolean flag : this.a) {
            var1.writeBoolean(flag);
        }
    }

    @Override
    public void a(ByteBuf var1) throws IOException {
        int i2;
        this.a = this.a(var1);
        for (i2 = 0; i2 < this.a.length; ++i2) {
            this.a[i2] = var1.readBoolean();
        }
        block5: for (i2 = 0; i2 < this.a.length; ++i2) {
            switch (i2) {
                case 0: {
                    this.a = this.a[i2];
                    continue block5;
                }
                case 1: {
                    this.b = this.a[i2];
                }
            }
        }
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

