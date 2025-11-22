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

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class P201_AnimationStatus
extends BasicPacket {
    public String approx$ = "";
    public String ebony$ = "";
    public String examined$ = "";
    public int cyber$ = -1;
    public int seasons$ = -1;
    public long ceramic$ = 0L;
    public boolean making$ = false;
    public String combat$ = "";

    public P201_AnimationStatus(String username, String vmd, String MD5, int oper) {
        this.approx$ = username;
        this.ebony$ = vmd;
        this.examined$ = MD5;
        this.cyber$ = oper;
    }

    public P201_AnimationStatus(ByteBuf buf) throws IOException {
        this.a(buf);
    }

    public P201_AnimationStatus3 a() {
        switch (this.seasons$) {
            case 0: {
                return P201_AnimationStatus3.columns$;
            }
            case 1: {
                return P201_AnimationStatus3.cents$;
            }
            case 2: {
                return P201_AnimationStatus3.attacked$;
            }
            case 3: {
                return P201_AnimationStatus3.endif$;
            }
            case 4: {
                return P201_AnimationStatus3.anime$;
            }
        }
        return null;
    }

    public P201_AnimationStatus2 a() {
        switch (this.cyber$) {
            case 0: {
                return P201_AnimationStatus2.counter$;
            }
            case 1: {
                return P201_AnimationStatus2.trust$;
            }
            case 2: {
                return P201_AnimationStatus2.producer$;
            }
        }
        return null;
    }

    public void a(PacketBuffer var1) throws IOException {
        this.a(this.approx$, (ByteBuf)var1);
        this.a(this.ebony$, (ByteBuf)var1);
        this.a(this.examined$, (ByteBuf)var1);
        var1.writeInt(this.cyber$);
        var1.writeInt(this.seasons$);
        var1.writeBoolean(this.making$);
        this.a(this.combat$, (ByteBuf)var1);
    }

    public void a(ByteBuf var1) throws IOException {
        this.approx$ = this.a(var1);
        this.ebony$ = this.a(var1);
        this.examined$ = this.a(var1);
        this.cyber$ = var1.readInt();
        this.seasons$ = var1.readInt();
        this.making$ = var1.readBoolean();
        this.combat$ = this.a(var1);
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

