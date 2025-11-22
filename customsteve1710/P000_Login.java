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
import net.minecraft.network.PacketBuffer;

public class P000_Login
extends BasicPacket {
    public String larry$ = "";
    public String level$ = "";
    public boolean potter$ = true;
    public float[] windows$ = new float[]{1.0f, 1.0f, 1.0f};

    public P000_Login() {
    }

    public P000_Login(String model, String MD5, float[] scale) throws IOException {
        this.larry$ = model;
        this.level$ = MD5;
        this.windows$ = scale;
    }

    public P000_Login(ByteBuf buf) throws IOException {
        this.a(buf);
    }

    public void a(PacketBuffer var1) throws IOException {
        if (this.larry$ == null) {
            this.larry$ = "";
        }
        this.a(this.larry$, (ByteBuf)var1);
        if (this.level$ == null) {
            this.level$ = "";
        }
        this.a(this.level$, (ByteBuf)var1);
        var1.writeBoolean(this.potter$);
        if (this.windows$ == null) {
            this.windows$ = new float[]{1.0f, 1.0f, 1.0f};
        }
        var1.writeFloat(this.windows$[0]);
        var1.writeFloat(this.windows$[1]);
        var1.writeFloat(this.windows$[2]);
    }

    public void a(ByteBuf var1) throws IOException {
        this.larry$ = this.a(var1);
        this.level$ = this.a(var1);
        this.potter$ = var1.readBoolean();
        float[] f2 = new float[]{var1.readFloat(), var1.readFloat(), var1.readFloat()};
        this.windows$ = f2;
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

