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

public class P400_Error
extends BasicPacket {
    public int breeding$ = -1;

    public P400_Error(int error) {
        this.breeding$ = error;
    }

    public P400_Error(ByteBuf buf) throws IOException {
        this.a(buf);
    }

    public void a(PacketBuffer var1) throws IOException {
        var1.writeInt(this.breeding$);
    }

    public void a(ByteBuf var1) throws IOException {
        this.breeding$ = var1.readInt();
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

