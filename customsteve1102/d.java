/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.Unpooled
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelHandler$Sharable
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.MessageToMessageCodec
 *  net.minecraft.client.Minecraft
 *  net.minecraft.network.NetworkManager
 *  net.minecraft.network.Packet
 *  net.minecraft.network.PacketBuffer
 *  net.minecraft.util.text.ITextComponent
 *  net.minecraft.util.text.TextComponentTranslation
 *  net.minecraftforge.fml.common.network.FMLEmbeddedChannel
 *  net.minecraftforge.fml.common.network.NetworkRegistry
 *  net.minecraftforge.fml.common.network.internal.FMLProxyPacket
 *  net.minecraftforge.fml.relauncher.Side
 */
package customsteve;

import customsteve.aS;
import customsteve.aT;
import customsteve.aV;
import customsteve.a_0;
import customsteve.au_0;
import customsteve.aw_0;
import customsteve.ax_0;
import customsteve.ay_0;
import customsteve.b_0;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageCodec;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.LinkedList;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraftforge.fml.common.network.FMLEmbeddedChannel;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.internal.FMLProxyPacket;
import net.minecraftforge.fml.relauncher.Side;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@ChannelHandler.Sharable
public class d
extends MessageToMessageCodec<FMLProxyPacket, aS> {
    private EnumMap<Side, FMLEmbeddedChannel> a;
    private LinkedList<Class<? extends aS>> a;
    private boolean a = false;

    public boolean a(Class<? extends aS> clazz) {
        if (((LinkedList)((Object)this.a)).size() > 256) {
            return false;
        }
        if (((LinkedList)((Object)this.a)).contains(clazz)) {
            return false;
        }
        if (this.a) {
            return false;
        }
        ((LinkedList)((Object)this.a)).add(clazz);
        return true;
    }

    protected FMLProxyPacket a(aS msg) throws Exception {
        Class<?> clazz = msg.getClass();
        if (!((LinkedList)((Object)this.a)).contains(msg.getClass())) {
            // empty if block
        }
        byte index = (byte)((LinkedList)((Object)this.a)).indexOf(clazz);
        PacketBuffer buf = new PacketBuffer(Unpooled.buffer());
        buf.writeByte((int)index);
        msg.a((ChannelHandlerContext)null, (ByteBuf)buf);
        FMLProxyPacket proxyPacket = new FMLProxyPacket((PacketBuffer)buf.copy(), "CustomSteve");
        return proxyPacket;
    }

    protected void a(ChannelHandlerContext ctx, aS msg, List<Object> out) throws Exception {
        Class<?> clazz = msg.getClass();
        if (!((LinkedList)((Object)this.a)).contains(msg.getClass())) {
            // empty if block
        }
        byte index = (byte)((LinkedList)((Object)this.a)).indexOf(clazz);
        PacketBuffer buf = new PacketBuffer(Unpooled.buffer());
        buf.writeByte((int)index);
        msg.a(ctx, (ByteBuf)buf);
        FMLProxyPacket proxyPacket = new FMLProxyPacket((PacketBuffer)buf.copy(), "CustomSteve");
        out.add(proxyPacket);
    }

    protected void a(ChannelHandlerContext ctx, FMLProxyPacket msg, List<Object> out) throws Exception {
        if (Minecraft.getMinecraft().isSingleplayer()) {
            return;
        }
        b_0.h = true;
        b_0.a();
        String className = ((Class)((LinkedList)((Object)this.a)).get(msg.payload().readByte())).getCanonicalName();
        if (className.equals(ay_0.class.getCanonicalName())) {
            ay_0 packet = new ay_0(msg.payload());
            switch (packet.a) {
                case 100: {
                    b_0.g = true;
                    break;
                }
                case 101: {
                    Minecraft.getMinecraft().player.sendMessage((ITextComponent)new TextComponentTranslation("Net.ModelInfomation.UpdateFiled", new Object[]{0}));
                    b_0.g = true;
                    break;
                }
                case 102: {
                    Minecraft.getMinecraft().player.sendMessage((ITextComponent)new TextComponentTranslation("Net.AnimationStatus.UpdateFiled", new Object[]{0}));
                    break;
                }
                case 103: {
                    Minecraft.getMinecraft().player.sendMessage((ITextComponent)new TextComponentTranslation("Net.ModelInfomation.TooBig", new Object[]{0}));
                    b_0.g = true;
                }
            }
        } else if (className.equals(au_0.class.getCanonicalName())) {
            a_0.instance.c.add(new au_0(msg.payload().copy()));
        } else if (className.equals(aV.class.getCanonicalName())) {
            ByteBuf buf = msg.payload().copy();
            aV packet = new aV(buf, buf.readInt());
            a_0.instance.c.add(packet);
        } else if (className.equals(aw_0.class.getCanonicalName())) {
            a_0.instance.c.add(new aw_0(msg.payload()));
        } else if (className.equals(ax_0.class.getCanonicalName())) {
            a_0.instance.c.add(new ax_0(msg.payload()));
        }
    }

    public void a() {
        this.a = NetworkRegistry.INSTANCE.newChannel("CustomSteve", new ChannelHandler[]{this});
    }

    public void b() {
        if (this.a) {
            return;
        }
        this.a = true;
        Collections.sort(this.a, new Comparator<Class<? extends aS>>(this){
            final /* synthetic */ d a;
            {
                this.a = this$0;
            }

            public int a(Class<? extends aS> clazz0, Class<? extends aS> clazz1) {
                int index = String.CASE_INSENSITIVE_ORDER.compare(clazz0.getCanonicalName(), clazz1.getCanonicalName());
                if (index == 0) {
                    index = clazz0.getCanonicalName().compareTo(clazz1.getCanonicalName());
                }
                return index;
            }

            public /* synthetic */ int compare(Object object, Object object2) {
                return this.a((Class)object, (Class)object2);
            }
        });
    }

    public boolean a(NetworkManager manager, aS msg) {
        boolean sent = false;
        if (msg instanceof aT) {
            try {
                manager.sendPacket((Packet)this.a(msg));
            }
            catch (Exception e2) {
                sent = false;
                e2.printStackTrace();
            }
        } else if (b_0.h) {
            sent = true;
            boolean send = true;
            if (msg instanceof aw_0) {
                if (b_0.g) {
                    send = false;
                }
            } else if (msg instanceof ax_0 && b_0.g) {
                send = false;
            }
            if (!b_0.g) {
                try {
                    manager.sendPacket((Packet)this.a(msg));
                }
                catch (Exception e3) {
                    sent = false;
                    e3.printStackTrace();
                }
            }
        }
        return sent;
    }

    protected /* synthetic */ void decode(ChannelHandlerContext channelHandlerContext, Object object, List list) throws Exception {
        this.a(channelHandlerContext, (FMLProxyPacket)object, (List<Object>)list);
    }

    protected /* synthetic */ void encode(ChannelHandlerContext channelHandlerContext, Object object, List list) throws Exception {
        this.a(channelHandlerContext, (aS)object, (List<Object>)list);
    }
}

