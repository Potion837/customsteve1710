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
import customsteve.aV;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class aV
extends aS {
    public ByteBuf a;
    public a a = null;

    public aV(ByteBuf cspMP, a op) throws IOException {
        this.a = cspMP;
        this.a = op;
    }

    public aV(ByteBuf cspMP, int op) throws IOException {
        this.a = cspMP;
        switch (op) {
            case 0: {
                this.a = customsteve.aV$a.a;
                break;
            }
            case 1: {
                this.a = customsteve.aV$a.b;
                break;
            }
            case 2: {
                this.a = customsteve.aV$a.c;
            }
        }
    }

    @Override
    public void a(PacketBuffer var1) throws IOException {
        var1.writeInt(this.a.a());
        var1.writeBytes(this.a.copy());
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

