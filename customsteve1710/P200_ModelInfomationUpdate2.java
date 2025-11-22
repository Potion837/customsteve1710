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

public class P200_ModelInfomationUpdate2
extends BasicPacket {
    public ByteBuf stored$ = null;
    public P200_ModelInfomationUpdate phpbb$ = null;

    public P200_ModelInfomationUpdate2(ByteBuf cspMP, P200_ModelInfomationUpdate op) throws IOException {
        this.stored$ = cspMP;
        this.phpbb$ = op;
    }

    public P200_ModelInfomationUpdate2(ByteBuf cspMP, int op) throws IOException {
        this.stored$ = cspMP;
        switch (op) {
            case 0: {
                this.phpbb$ = P200_ModelInfomationUpdate.boats$;
                break;
            }
            case 1: {
                this.phpbb$ = P200_ModelInfomationUpdate.prisoner$;
                break;
            }
            case 2: {
                this.phpbb$ = P200_ModelInfomationUpdate.weird$;
            }
        }
    }

    public void a(PacketBuffer var1) throws IOException {
        var1.writeInt(this.phpbb$._saving());
        var1.writeBytes(this.stored$.copy());
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

