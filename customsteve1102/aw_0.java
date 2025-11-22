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
import customsteve.aw_0;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from customsteve.aW
 */
public class aw_0
extends aS {
    public String a;
    public String b;
    public String c = "";
    public int a;
    public int b = -1;
    public long a;
    public boolean a = false;
    public String d = "";

    public aw_0(String username, String vmd, String MD5, int oper) {
        this.a = username;
        this.b = vmd;
        this.c = MD5;
        this.a = oper;
    }

    public aw_0(ByteBuf buf) throws IOException {
        this.a(buf);
    }

    public b a() {
        switch (this.b) {
            case 0: {
                return customsteve.aW$b.a;
            }
            case 1: {
                return customsteve.aW$b.b;
            }
            case 2: {
                return customsteve.aW$b.c;
            }
            case 3: {
                return customsteve.aW$b.d;
            }
            case 4: {
                return customsteve.aW$b.e;
            }
        }
        return null;
    }

    public a a() {
        switch (this.a) {
            case 0: {
                return customsteve.aW$a.a;
            }
            case 1: {
                return customsteve.aW$a.b;
            }
            case 2: {
                return customsteve.aW$a.c;
            }
        }
        return null;
    }

    @Override
    public void a(PacketBuffer var1) throws IOException {
        this.a(this.a, (ByteBuf)var1);
        this.a(this.b, (ByteBuf)var1);
        this.a(this.c, (ByteBuf)var1);
        var1.writeInt(this.a);
        var1.writeInt(this.b);
        var1.writeBoolean(this.a);
        this.a(this.d, (ByteBuf)var1);
    }

    @Override
    public void a(ByteBuf var1) throws IOException {
        this.a = this.a(var1);
        this.b = this.a(var1);
        this.c = this.a(var1);
        this.a = var1.readInt();
        this.b = var1.readInt();
        this.a = var1.readBoolean();
        this.d = this.a(var1);
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

