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
 * Duplicate member names - consider using --renamedupmembers true
 */
public class aT
extends aS {
    public String a;
    public String b = "";
    public boolean a;
    public float[] a = new float[]{1.0f, 1.0f, 1.0f};

    public aT() {
    }

    public aT(String model, String MD5, float[] scale) throws IOException {
        this.a = model;
        this.b = MD5;
        this.a = scale;
    }

    public aT(ByteBuf buf) throws IOException {
        this.a(buf);
    }

    @Override
    public void a(PacketBuffer var1) throws IOException {
        if (this.a == null) {
            this.a = "";
        }
        this.a(this.a, (ByteBuf)var1);
        if (this.b == null) {
            this.b = "";
        }
        this.a(this.b, (ByteBuf)var1);
        var1.writeBoolean(this.a);
        if (this.a == null) {
            this.a = new float[]{1.0f, 1.0f, 1.0f};
        }
        var1.writeFloat(this.a[0]);
        var1.writeFloat(this.a[1]);
        var1.writeFloat(this.a[2]);
    }

    @Override
    public void a(ByteBuf var1) throws IOException {
        this.a = this.a(var1);
        this.b = this.a(var1);
        this.a = var1.readBoolean();
        float[] f2 = new float[]{var1.readFloat(), var1.readFloat(), var1.readFloat()};
        this.a = f2;
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

