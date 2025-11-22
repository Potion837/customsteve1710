/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.Unpooled
 *  net.minecraft.entity.player.EntityPlayerMP
 *  net.minecraft.network.PacketBuffer
 */
import com.google.common.base.Charsets;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.network.PacketBuffer;

public class CSplayerMP {
    public String lucas$ = "";
    public String units$ = "";
    public String trinidad$ = "";
    public boolean austria$ = true;
    public boolean backing$ = true;
    public float[] rendered$ = new float[]{1.0f, 1.0f, 1.0f};
    public EntityPlayerMP plenty$ = null;

    public CSplayerMP(String uname, boolean isGuest) {
        this.lucas$ = uname;
        this.austria$ = isGuest;
    }

    public CSplayerMP(ByteBuf buf) {
        this._failing(buf);
    }

    public ByteBuf _wicked() {
        PacketBuffer buf = new PacketBuffer(Unpooled.buffer());
        this._reuters(this.lucas$, (ByteBuf)buf);
        if (this.units$ == null) {
            this.units$ = "";
        }
        this._reuters(this.units$, (ByteBuf)buf);
        this._reuters(this.trinidad$, (ByteBuf)buf);
        buf.writeBoolean(this.austria$);
        buf.writeBoolean(this.backing$);
        buf.writeFloat(this.rendered$[0]);
        buf.writeFloat(this.rendered$[1]);
        buf.writeFloat(this.rendered$[2]);
        return buf;
    }

    private void _failing(ByteBuf buf) {
        this.lucas$ = this._hardwood(buf);
        this.units$ = this._hardwood(buf);
        this.trinidad$ = this._hardwood(buf);
        this.austria$ = buf.readBoolean();
        this.backing$ = buf.readBoolean();
        this.rendered$[0] = buf.readFloat();
        this.rendered$[1] = buf.readFloat();
        this.rendered$[2] = buf.readFloat();
    }

    public void _reuters(String s, ByteBuf var1) {
        byte[] bytes = s.getBytes(Charsets.UTF_8);
        var1.writeInt(bytes.length);
        var1.writeBytes(bytes);
    }

    public String _hardwood(ByteBuf var1) {
        int index = var1.readInt();
        String result = new String(var1.readBytes(index).array(), Charsets.UTF_8);
        return result;
    }
}

