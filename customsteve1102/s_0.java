/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.settings.KeyBinding
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraftforge.common.MinecraftForge
 *  net.minecraftforge.fml.client.FMLClientHandler
 *  net.minecraftforge.fml.client.registry.ClientRegistry
 *  net.minecraftforge.fml.common.eventhandler.Event$Result
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.InputEvent$KeyInputEvent
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 *  org.lwjgl.input.Keyboard
 */
package customsteve;

import customsteve.ModContainer;
import customsteve.O;
import customsteve.a_0;
import customsteve.ac;
import customsteve.ax_0;
import customsteve.b_0;
import customsteve.bc;
import customsteve.i;
import customsteve.k;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.input.Keyboard;

/*
 * Renamed from customsteve.s
 * Duplicate member names - consider using --renamedupmembers true
 */
@SideOnly(value=Side.CLIENT)
public class s_0 {
    public static boolean a = true;
    public static boolean b = false;
    public static int a = 0;
    public static final KeyBinding a = new KeyBinding("key.ShowMainScreen", 37, "key.title");
    public static final KeyBinding b = new KeyBinding("key.ToggleAutoReload", 16, "key.title");
    public static final KeyBinding c = new KeyBinding("key.ToggleAnimationState", 48, "key.title");
    public static final KeyBinding d = new KeyBinding("key.Kick", 33, "key.title");
    public static final KeyBinding e = new KeyBinding("key.FarCamera", 23, "key.title");
    public static final KeyBinding f = new KeyBinding("key.NearCamera", 26, "key.title");
    public static final KeyBinding g = new KeyBinding("key.LeftCamera", 36, "key.title");
    public static final KeyBinding h = new KeyBinding("key.RightCamera", 38, "key.title");
    public static final KeyBinding i = new KeyBinding("key.QuickMotion", 29, "key.title");

    public s_0() {
        ClientRegistry.registerKeyBinding((KeyBinding)a);
        ClientRegistry.registerKeyBinding((KeyBinding)b);
        ClientRegistry.registerKeyBinding((KeyBinding)c);
        ClientRegistry.registerKeyBinding((KeyBinding)d);
        ClientRegistry.registerKeyBinding((KeyBinding)e);
        ClientRegistry.registerKeyBinding((KeyBinding)f);
        ClientRegistry.registerKeyBinding((KeyBinding)g);
        ClientRegistry.registerKeyBinding((KeyBinding)h);
        ClientRegistry.registerKeyBinding((KeyBinding)i);
        MinecraftForge.EVENT_BUS.register((Object)this);
    }

    @SubscribeEvent
    public void a(InputEvent.KeyInputEvent event) {
        if (Keyboard.getEventKey() == i.getKeyCode()) {
            b = Keyboard.getEventKeyState();
        } else if (b && !Keyboard.getEventKeyState()) {
            if (!b_0.m) {
                return;
            }
            switch (Keyboard.getEventKey()) {
                case 2: 
                case 3: 
                case 4: 
                case 5: 
                case 6: 
                case 7: 
                case 8: 
                case 9: 
                case 10: 
                case 11: {
                    int motion = Keyboard.getEventKey() - 1;
                    if (motion == 10) {
                        motion = 0;
                    }
                    i qm = a_0.instance.a.a[motion == 0 ? 9 : motion - 1];
                    if (a_0.instance.a != null && !((bc.a)((Object)a_0.instance.a.a)).f) {
                        k csp = a_0.instance.a;
                        if (((bc.a)((Object)csp.a)).g && (((bc.a)((Object)csp.a)).a || ((bc.a)((Object)csp.a)).b)) {
                            int iterF;
                            int interFreams = 10;
                            int n2 = iterF = b_0.j == 2 ? interFreams * 2 : interFreams;
                            if (qm.f) {
                                csp.b = iterF;
                            } else {
                                csp.b = 0;
                                iterF = 0;
                            }
                            if (((bc.a)((Object)csp.a)).b) {
                                ((bc.a)((Object)csp.a)).b = false;
                                csp.a[1] = true;
                            } else {
                                ((bc.a)((Object)csp.a)).a = false;
                            }
                            if (((bc.a)((Object)csp.a)).c) {
                                ((ac)((Object)csp.a)).a = true;
                            }
                            ((bc.a)((Object)csp.a)).g = false;
                            ((bc.a)((Object)csp.a)).h = false;
                            ((bc.a)((Object)csp.a)).c = true;
                        } else {
                            int iterF;
                            boolean upper = qm.b;
                            if (csp.j) {
                                csp.j = false;
                                ((ac)((Object)csp.a)).a = true;
                                ((ac)((Object)csp.a)).a();
                                csp.d();
                                if (!upper) {
                                    csp.a[1] = true;
                                }
                            }
                            ((bc.a)((Object)csp.a)).c = qm.d;
                            if (((bc.a)((Object)csp.a)).c) {
                                ((ac)((Object)csp.a)).a = !qm.e;
                            }
                            csp.i = !qm.c;
                            String path = "CustomSteve/Animations/" + csp.b() + "/" + motion + ".vmd";
                            if (upper) {
                                ((bc.a)((Object)csp.a)).b = qm.a;
                            } else {
                                ((bc.a)((Object)csp.a)).a = qm.a;
                            }
                            int interFreams = 10;
                            int n3 = iterF = b_0.j == 2 ? interFreams * 2 : interFreams;
                            if (qm.f) {
                                csp.b = iterF;
                            } else {
                                csp.b = 0;
                                iterF = 0;
                            }
                            csp.c(path, upper ? 1 : 0);
                            csp.b((int)(upper ? 1 : 0)).b = csp.b((int)(upper ? 1 : 0)).b + (b_0.j == 2 ? (long)(qm.a * 2) : (long)qm.a);
                            csp.a(upper ? 1 : 0);
                            if (!upper) {
                                ((bc.a)((Object)csp.a)).h = true;
                            }
                            ((bc.a)((Object)csp.a)).g = true;
                        }
                    }
                    event.setResult(Event.Result.DENY);
                    break;
                }
            }
        }
        if (Minecraft.getMinecraft().currentScreen == null && a.isPressed()) {
            GuiScreen currentScreen = FMLClientHandler.instance().getClient().currentScreen;
            FMLClientHandler.instance().displayGuiScreen((EntityPlayer)FMLClientHandler.instance().getClient().player, new O(null).a());
        } else if (b.isPressed() && b_0.c) {
            if (!b_0.m) {
                return;
            }
            a_0.instance.a.f();
        } else if (c.isPressed()) {
            if (!b_0.m) {
                return;
            }
            if (a_0.instance.a != null) {
                a_0.instance.a.a();
                ax_0 packet = new ax_0();
                packet.a = b_0.m;
                packet.b = a_0.instance.a.j;
                ModContainer.a.a(Minecraft.getMinecraft().player.connection.getNetworkManager(), packet);
            }
        } else if (d.isPressed() && a_0.instance.a != null && a_0.instance.a.a == k.c.a && !((bc.a)((Object)a_0.instance.a.a)).f && Minecraft.getMinecraft().player != null) {
            if (!b_0.m) {
                return;
            }
            a_0.instance.a.d = 0;
            a_0.instance.a.e = 0;
            Minecraft.getMinecraft().player.field_70761_aq = Minecraft.getMinecraft().player.field_70177_z;
            Minecraft.getMinecraft().player.field_70760_ar = Minecraft.getMinecraft().player.field_70177_z;
        }
    }
}

