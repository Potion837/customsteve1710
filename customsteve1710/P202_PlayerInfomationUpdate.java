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

public class P202_PlayerInfomationUpdate
extends BasicPacket {
    public boolean[] cheers$ = new boolean[32];
    public String explain$ = "";
    public boolean ferrari$ = true;
    public boolean betting$ = true;

    public P202_PlayerInfomationUpdate() {
    }

    public P202_PlayerInfomationUpdate(ByteBuf buf) throws IOException {
        this.a(buf);
    }

    public void a(PacketBuffer var1) throws IOException {
        this.a(this.explain$, (ByteBuf)var1);
        block4: for (int i = 0; i < this.cheers$.length; ++i) {
            switch (i) {
                case 0: {
                    this.cheers$[i] = this.ferrari$;
                    continue block4;
                }
                case 1: {
                    this.cheers$[i] = this.betting$;
                }
            }
        }
        for (boolean flag : this.cheers$) {
            var1.writeBoolean(flag);
        }
    }

    public void a(ByteBuf var1) throws IOException {
        int i;
        this.explain$ = this.a(var1);
        for (i = 0; i < this.cheers$.length; ++i) {
            this.cheers$[i] = var1.readBoolean();
        }
        block5: for (i = 0; i < this.cheers$.length; ++i) {
            switch (i) {
                case 0: {
                    this.ferrari$ = this.cheers$[i];
                    continue block5;
                }
                case 1: {
                    this.betting$ = this.cheers$[i];
                }
            }
        }
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

