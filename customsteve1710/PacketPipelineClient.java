/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.common.network.NetworkRegistry
 *  cpw.mods.fml.common.network.internal.FMLProxyPacket
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.Unpooled
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelHandler$Sharable
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.MessageToMessageCodec
 *  io.netty.util.concurrent.GenericFutureListener
 *  net.minecraft.client.Minecraft
 *  net.minecraft.network.NetworkManager
 *  net.minecraft.network.Packet
 *  net.minecraft.network.PacketBuffer
 *  net.minecraft.util.ChatComponentTranslation
 *  net.minecraft.util.IChatComponent
 *  net.minecraft.util.StatCollector
 */
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.internal.FMLProxyPacket;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageCodec;
import io.netty.util.concurrent.GenericFutureListener;
import java.util.Collections;
import java.util.EnumMap;
import java.util.LinkedList;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.StatCollector;

@ChannelHandler.Sharable
public class PacketPipelineClient
extends MessageToMessageCodec {
    private EnumMap enter$;
    private LinkedList jesse$ = new LinkedList();
    private boolean remain$ = false;

    public boolean a(Class clazz) {
        if (this.jesse$.size() > 256) {
            return false;
        }
        if (this.jesse$.contains(clazz)) {
            return false;
        }
        if (this.remain$) {
            return false;
        }
        this.jesse$.add(clazz);
        return true;
    }

    protected FMLProxyPacket a(BasicPacket msg) throws Exception {
        Class<?> clazz = msg.getClass();
        if (!this.jesse$.contains(msg.getClass())) {
            // empty if block
        }
        byte index = (byte)this.jesse$.indexOf(clazz);
        PacketBuffer buf = new PacketBuffer(Unpooled.buffer());
        buf.writeByte((int)index);
        msg._brief(null, (ByteBuf)buf);
        FMLProxyPacket proxyPacket = new FMLProxyPacket(buf.copy(), "CustomSteve");
        return proxyPacket;
    }

    protected void a(ChannelHandlerContext ctx, BasicPacket msg, List out) throws Exception {
        Class<?> clazz = msg.getClass();
        if (!this.jesse$.contains(msg.getClass())) {
            // empty if block
        }
        byte index = (byte)this.jesse$.indexOf(clazz);
        PacketBuffer buf = new PacketBuffer(Unpooled.buffer());
        buf.writeByte((int)index);
        msg._brief(ctx, (ByteBuf)buf);
        FMLProxyPacket proxyPacket = new FMLProxyPacket(buf.copy(), "CustomSteve");
        out.add(proxyPacket);
    }

    protected void a(ChannelHandlerContext ctx, FMLProxyPacket msg, List out) throws Exception {
        if (Minecraft.func_71410_x().func_71356_B()) {
            return;
        }
        Config.seating$ = true;
        Config._edges();
        String className = ((Class)this.jesse$.get(msg.payload().readByte())).getCanonicalName();
        if (className.equals(P400_Error.class.getCanonicalName())) {
            P400_Error packet = new P400_Error(msg.payload());
            switch (packet.breeding$) {
                case 100: {
                    Config.villas$ = true;
                    break;
                }
                case 101: {
                    Minecraft.func_71410_x().field_71439_g.func_145747_a((IChatComponent)new ChatComponentTranslation("Net.ModelInfomation.UpdateFiled", new Object[]{StatCollector.func_74838_a((String)"Net.ModelInfomation.UpdateFiled").length() + 1}));
                    Config.villas$ = true;
                    break;
                }
                case 102: {
                    Minecraft.func_71410_x().field_71439_g.func_145747_a((IChatComponent)new ChatComponentTranslation("Net.AnimationStatus.UpdateFiled", new Object[]{StatCollector.func_74838_a((String)"Net.AnimationStatus.UpdateFiled").length() + 1}));
                    break;
                }
                case 103: {
                    Minecraft.func_71410_x().field_71439_g.func_145747_a((IChatComponent)new ChatComponentTranslation("Net.ModelInfomation.TooBig", new Object[]{StatCollector.func_74838_a((String)"Net.ModelInfomation.TooBig").length() + 1}));
                    Config.villas$ = true;
                }
            }
        } else if (className.equals(P100_ModelInfomation.class.getCanonicalName())) {
            CSmanager.cellular$.laden$.add(new P100_ModelInfomation(msg.payload().copy()));
        } else if (className.equals(P200_ModelInfomationUpdate2.class.getCanonicalName())) {
            ByteBuf buf = msg.payload().copy();
            P200_ModelInfomationUpdate2 packet = new P200_ModelInfomationUpdate2(buf, buf.readInt());
            CSmanager.cellular$.laden$.add(packet);
        } else if (className.equals(P201_AnimationStatus.class.getCanonicalName())) {
            CSmanager.cellular$.laden$.add(new P201_AnimationStatus(msg.payload()));
        } else if (className.equals(P202_PlayerInfomationUpdate.class.getCanonicalName())) {
            CSmanager.cellular$.laden$.add(new P202_PlayerInfomationUpdate(msg.payload()));
        }
    }

    public void a() {
        this.enter$ = NetworkRegistry.INSTANCE.newChannel("CustomSteve", new ChannelHandler[]{this});
    }

    public void b() {
        if (this.remain$) {
            return;
        }
        this.remain$ = true;
        Collections.sort(this.jesse$, new PacketPipelineClient2(this));
    }

    public boolean a(NetworkManager manager, BasicPacket msg) {
        boolean sent = false;
        if (msg instanceof P000_Login) {
            try {
                manager.func_150725_a((Packet)this.a(msg), new GenericFutureListener[0]);
            }
            catch (Exception e2) {
                sent = false;
                e2.printStackTrace();
            }
        } else if (Config.seating$) {
            sent = true;
            boolean send = true;
            if (msg instanceof P201_AnimationStatus) {
                if (Config.villas$) {
                    send = false;
                }
            } else if (msg instanceof P202_PlayerInfomationUpdate && Config.villas$) {
                send = false;
            }
            if (!Config.villas$) {
                try {
                    manager.func_150725_a((Packet)this.a(msg), new GenericFutureListener[0]);
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
        this.a(channelHandlerContext, (FMLProxyPacket)object, list);
    }

    protected /* synthetic */ void encode(ChannelHandlerContext channelHandlerContext, Object object, List list) throws Exception {
        this.a(channelHandlerContext, (BasicPacket)object, list);
    }
}

