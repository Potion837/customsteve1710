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
package customsteve;

import com.google.common.base.Charsets;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.network.PacketBuffer;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class l {
    public String a;
    public String b;
    public String c = "";
    public boolean a;
    public boolean b = true;
    public float[] a;
    public EntityPlayerMP a = null;

    public l(String uname, boolean isGuest) {
        this.a = uname;
        this.a = isGuest;
    }

    public l(ByteBuf buf) {
        this.a(buf);
    }

    public ByteBuf a() {
        PacketBuffer buf = new PacketBuffer(Unpooled.buffer());
        this.a(this.a, (ByteBuf)buf);
        if (this.b == null) {
            this.b = "";
        }
        this.a(this.b, (ByteBuf)buf);
        this.a(this.c, (ByteBuf)buf);
        buf.writeBoolean(this.a);
        buf.writeBoolean(this.b);
        buf.writeFloat(this.a[0]);
        buf.writeFloat(this.a[1]);
        buf.writeFloat(this.a[2]);
        return buf;
    }

    private void a(ByteBuf buf) {
        this.a = this.a(buf);
        this.b = this.a(buf);
        this.c = this.a(buf);
        this.a = buf.readBoolean();
        this.b = buf.readBoolean();
        this.a[0] = buf.readFloat();
        this.a[1] = buf.readFloat();
        this.a[2] = buf.readFloat();
    }

    public void a(String s, ByteBuf var1) {
        byte[] bytes = s.getBytes(Charsets.UTF_8);
        var1.writeInt(bytes.length);
        var1.writeBytes(bytes);
    }

    public String a(ByteBuf var1) {
        int index = var1.readInt();
        String result = new String(var1.readBytes(index).array(), Charsets.UTF_8);
        return result;
    }
}

