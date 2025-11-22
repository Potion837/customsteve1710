/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.common.FMLCommonHandler
 *  cpw.mods.fml.common.eventhandler.EventBus
 *  cpw.mods.fml.common.eventhandler.SubscribeEvent
 *  cpw.mods.fml.common.network.FMLNetworkEvent$ClientConnectedToServerEvent
 *  cpw.mods.fml.common.network.FMLNetworkEvent$ClientCustomPacketEvent
 *  cpw.mods.fml.common.network.FMLNetworkEvent$ClientDisconnectionFromServerEvent
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.audio.SoundHandler
 */
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.EventBus;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.network.FMLNetworkEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.io.IOException;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.SoundHandler;

@SideOnly(value=Side.CLIENT)
public class NetWorkHandler {
    public NetWorkHandler() {
        EventBus funBus = FMLCommonHandler.instance().bus();
        funBus.register((Object)this);
    }

    @SubscribeEvent
    public void _write(FMLNetworkEvent.ClientCustomPacketEvent event) {
    }

    @SubscribeEvent
    public void _leonard(FMLNetworkEvent.ClientConnectedToServerEvent event) {
        if (Minecraft.func_71410_x().func_71356_B()) {
            return;
        }
        P000_Login packet = null;
        if (Config.scored$) {
            CSplayer csp = CSmanager.cellular$._reload(ModContainer.dealing$.highways$, false);
            try {
                packet = new P000_Login(CSmanager.cellular$.trucks$.reminder$, CSmanager.cellular$._mixed(ModContainer.outreach$ + "/" + "CustomSteve/models/" + CSmanager.cellular$.trucks$.reminder$ + "/"), Config.child$._rooms(null));
            }
            catch (IOException e2) {
                e2.printStackTrace();
            }
        } else {
            packet = new P000_Login();
        }
        ModContainer.array$.a(event.manager, packet);
    }

    @SubscribeEvent
    public void _research(FMLNetworkEvent.ClientDisconnectionFromServerEvent event) {
        Config.villas$ = false;
        Config.seating$ = false;
        CSmanager.cellular$._slight();
        CSmanager.cellular$._small();
        CSmanager.cellular$.positive$ = 0;
        for (int i = 0; i < CSmanager.cellular$.roland$.size(); ++i) {
            CSplayer csp = CSmanager.cellular$._stanley(((CSplayerMP)CSmanager.cellular$.roland$.get((int)i)).lucas$);
            if (csp == null) continue;
            RenderObject4 cfr_ignored_0 = csp.a.course$;
            csp.a.course$ = RenderObject4.cameras$;
            csp.a.wales$ = false;
            csp.a.remove$ = false;
            csp.listings$ = false;
            csp.c("CustomSteve\\Animations\\" + csp.b() + "stand.vmd", false);
        }
        if (Config.framed$) {
            Config.framed$ = false;
            try {
                SoundHandler sndManager = Minecraft.func_71410_x().func_147118_V();
                boolean mode = false;
                sndManager.func_147690_c();
                CSmanager.picked$.stop("CustomSteveBGM");
            }
            catch (Exception e1) {
                e1.printStackTrace();
            }
        }
        CSmanager.cellular$.roland$.clear();
        CSmanager.cellular$.soccer$ = "";
        if (CSmanager.cellular$.trucks$ != null) {
            RenderObject4 cfr_ignored_1 = CSmanager.cellular$.trucks$.a.course$;
            CSmanager.cellular$.trucks$.a.course$ = RenderObject4.cameras$;
        }
    }
}

