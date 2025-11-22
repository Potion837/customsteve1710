/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.audio.SoundHandler
 *  net.minecraftforge.common.MinecraftForge
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.network.FMLNetworkEvent$ClientConnectedToServerEvent
 *  net.minecraftforge.fml.common.network.FMLNetworkEvent$ClientCustomPacketEvent
 *  net.minecraftforge.fml.common.network.FMLNetworkEvent$ClientDisconnectionFromServerEvent
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package customsteve;

import customsteve.ModContainer;
import customsteve.aT;
import customsteve.a_0;
import customsteve.b_0;
import customsteve.bc;
import customsteve.k;
import customsteve.l;
import java.io.IOException;
import java.util.ArrayList;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.SoundHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.FMLNetworkEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/*
 * Renamed from customsteve.v
 */
@SideOnly(value=Side.CLIENT)
public class v_0 {
    public v_0() {
        MinecraftForge.EVENT_BUS.register((Object)this);
    }

    @SubscribeEvent
    public void a(FMLNetworkEvent.ClientCustomPacketEvent event) {
    }

    @SubscribeEvent
    public void a(FMLNetworkEvent.ClientConnectedToServerEvent event) {
        if (Minecraft.getMinecraft().isSingleplayer()) {
            return;
        }
        aT packet = null;
        if (b_0.m) {
            k csp = a_0.instance.a(ModContainer.a.c, false);
            try {
                packet = new aT(a_0.instance.a.a, a_0.instance.a(ModContainer.b + "/" + "CustomSteve/models/" + a_0.instance.a.a + "/"), b_0.b.a((float[])null));
            }
            catch (IOException e2) {
                e2.printStackTrace();
            }
        } else {
            packet = new aT();
        }
        ModContainer.a.a(event.getManager(), packet);
    }

    @SubscribeEvent
    public void a(FMLNetworkEvent.ClientDisconnectionFromServerEvent event) {
        b_0.g = false;
        b_0.h = false;
        a_0.instance.h();
        a_0.instance.g();
        a_0.instance.a = 0;
        for (int i2 = 0; i2 < ((ArrayList)((Object)a_0.instance.a)).size(); ++i2) {
            k csp = a_0.instance.a(((l)((ArrayList)((Object)a_0.instance.a)).get((int)i2)).a);
            if (csp == null) continue;
            bc.d cfr_ignored_0 = ((bc.a)((Object)csp.a)).a;
            ((bc.a)((Object)csp.a)).a = bc.d.a;
            ((bc.a)((Object)csp.a)).e = false;
            ((bc.a)((Object)csp.a)).a = false;
            csp.g = false;
            csp.c("CustomSteve\\Animations\\" + csp.b() + "stand.vmd", 0);
        }
        if (b_0.l) {
            b_0.l = false;
            try {
                SoundHandler sndManager = Minecraft.getMinecraft().getSoundHandler();
                boolean mode = false;
                sndManager.stopSounds();
                a_0.sndSystem.stop("CustomSteveBGM");
            }
            catch (Exception e1) {
                e1.printStackTrace();
            }
        }
        ((ArrayList)((Object)a_0.instance.a)).clear();
        a_0.instance.a = "";
        if (a_0.instance.a != null) {
            bc.d cfr_ignored_1 = ((bc.a)((Object)a_0.instance.a.a)).a;
            ((bc.a)((Object)a_0.instance.a.a)).a = bc.d.a;
        }
    }
}

