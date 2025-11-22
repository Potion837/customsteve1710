/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.client.FMLClientHandler
 *  cpw.mods.fml.client.registry.ClientRegistry
 *  cpw.mods.fml.common.FMLCommonHandler
 *  cpw.mods.fml.common.eventhandler.Event$Result
 *  cpw.mods.fml.common.eventhandler.EventBus
 *  cpw.mods.fml.common.eventhandler.SubscribeEvent
 *  cpw.mods.fml.common.gameevent.InputEvent$KeyInputEvent
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.settings.KeyBinding
 *  net.minecraft.entity.player.EntityPlayer
 *  org.lwjgl.input.Keyboard
 */
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.Event;
import cpw.mods.fml.common.eventhandler.EventBus;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.EntityPlayer;
import org.lwjgl.input.Keyboard;

@SideOnly(value=Side.CLIENT)
public class KeyHandler {
    public static boolean phones$ = true;
    public static boolean xhtml$ = false;
    public static int purple$ = 0;
    public static final KeyBinding dropped$ = new KeyBinding("key.ShowMainScreen", 37, "key.title");
    public static final KeyBinding cosmetic$ = new KeyBinding("key.ToggleAutoReload", 16, "key.title");
    public static final KeyBinding camping$ = new KeyBinding("key.ToggleAnimationState", 48, "key.title");
    public static final KeyBinding sword$ = new KeyBinding("key.Kick", 33, "key.title");
    public static final KeyBinding theta$ = new KeyBinding("key.FarCamera", 23, "key.title");
    public static final KeyBinding vincent$ = new KeyBinding("key.NearCamera", 26, "key.title");
    public static final KeyBinding burning$ = new KeyBinding("key.LeftCamera", 36, "key.title");
    public static final KeyBinding clara$ = new KeyBinding("key.RightCamera", 38, "key.title");
    public static final KeyBinding breaking$ = new KeyBinding("key.QuickMotion", 29, "key.title");

    public KeyHandler() {
        ClientRegistry.registerKeyBinding((KeyBinding)dropped$);
        ClientRegistry.registerKeyBinding((KeyBinding)cosmetic$);
        ClientRegistry.registerKeyBinding((KeyBinding)sword$);
        ClientRegistry.registerKeyBinding((KeyBinding)theta$);
        ClientRegistry.registerKeyBinding((KeyBinding)vincent$);
        ClientRegistry.registerKeyBinding((KeyBinding)burning$);
        ClientRegistry.registerKeyBinding((KeyBinding)clara$);
        ClientRegistry.registerKeyBinding((KeyBinding)breaking$);
        EventBus funBus = FMLCommonHandler.instance().bus();
        funBus.register((Object)this);
    }

    @SubscribeEvent
    public void _brush(InputEvent.KeyInputEvent event) {
        if (xhtml$ && Keyboard.getEventKeyState()) {
            if (!Config.scored$) {
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
                    QuickMotionSetting qm = CSmanager.cellular$.trucks$.expected$[motion == 0 ? 9 : motion - 1];
                    if (CSmanager.cellular$.trucks$ != null && !CSmanager.cellular$.trucks$.a.bringing$) {
                        CSplayer csp = CSmanager.cellular$.trucks$;
                        if (csp.a.single$) {
                            int interFreams;
                            Config._lightbox("\u505c\u6b62?");
                            int iterF = interFreams = 10;
                            if (qm.raised$) {
                                csp.begun$ = iterF;
                            } else {
                                csp.begun$ = 0;
                                iterF = 0;
                            }
                            if (CSmanager.cities$ != null && CSmanager.cities$.hometown$) {
                                csp.surveys$ = true;
                            }
                            if (csp.a.meetings$) {
                                csp.a.meetings$ = false;
                                csp.surveys$ = true;
                            } else {
                                csp.a.remove$ = false;
                            }
                            if (csp.a.quizzes$) {
                                csp.a.steel$ = true;
                            }
                            csp.a.single$ = false;
                            csp.a.warriors$ = false;
                            csp.a.quizzes$ = true;
                        } else {
                            int iterF;
                            boolean upper = qm.hometown$;
                            if (csp.medline$) {
                                csp.medline$ = false;
                                csp.a.steel$ = true;
                                csp.a._brunei();
                                csp.d();
                                if (!upper) {
                                    csp.surveys$ = true;
                                }
                            }
                            csp.a.quizzes$ = qm.silly$;
                            if (csp.a.quizzes$) {
                                csp.a.steel$ = !qm.nights$;
                            }
                            csp.pacific$ = !qm.plugin$;
                            String path = "CustomSteve/Animations/" + csp.b() + "/" + motion + ".vmd";
                            if (upper) {
                                csp.a.meetings$ = qm.screens$;
                            } else {
                                csp.a.remove$ = qm.screens$;
                            }
                            int interFreams = 10;
                            int n = iterF = Config.filter$ == 2 ? interFreams * 2 : interFreams;
                            if (qm.raised$) {
                                csp.begun$ = iterF;
                            } else {
                                csp.begun$ = 0;
                                iterF = 0;
                            }
                            csp.c(path, upper);
                            csp.a.cottage$ = iterF + (Config.filter$ == 2 ? qm.locally$ * 2 : qm.locally$);
                            csp.a(upper);
                            if (!upper) {
                                csp.a.warriors$ = true;
                            }
                            csp.a.single$ = true;
                            CSmanager.cities$ = qm;
                        }
                    }
                    event.setResult(Event.Result.DENY);
                    break;
                }
            }
        } else if (Keyboard.getEventKey() == breaking$.func_151463_i()) {
            Config._lightbox("CTRL!");
            xhtml$ = Keyboard.getEventKeyState();
        } else {
            xhtml$ = false;
        }
        if (Minecraft.func_71410_x().field_71462_r == null && dropped$.func_151468_f()) {
            GuiScreen currentScreen = FMLClientHandler.instance().getClient().field_71462_r;
            FMLClientHandler.instance().displayGuiScreen((EntityPlayer)FMLClientHandler.instance().getClient().field_71439_g, new GuiMainScreen(null).a());
        } else if (cosmetic$.func_151468_f() && Config.point$) {
            if (!Config.scored$) {
                return;
            }
            CSmanager.cellular$.keith$._lenses();
        } else if (camping$.func_151468_f()) {
            if (!Config.scored$) {
                return;
            }
            if (CSmanager.cellular$.trucks$ != null) {
                CSmanager.cellular$.trucks$.a();
                P202_PlayerInfomationUpdate packet = new P202_PlayerInfomationUpdate();
                packet.ferrari$ = Config.scored$;
                packet.betting$ = CSmanager.cellular$.trucks$.medline$;
                ModContainer.array$.a(Minecraft.func_71410_x().field_71439_g.field_71174_a.func_147298_b(), packet);
            }
        } else if (sword$.func_151468_f() && CSmanager.cellular$.trucks$ != null && CSmanager.cellular$.trucks$.graduate$ == CSplayer4.alumni$ && !CSmanager.cellular$.trucks$.a.bringing$ && Minecraft.func_71410_x().field_71439_g != null) {
            if (!Config.scored$) {
                return;
            }
            CSmanager.cellular$.trucks$.eugene$ = 0;
            CSmanager.cellular$.trucks$.world$ = 0;
            Minecraft.func_71410_x().field_71439_g.field_70761_aq = Minecraft.func_71410_x().field_71439_g.field_70177_z;
            Minecraft.func_71410_x().field_71439_g.field_70760_ar = Minecraft.func_71410_x().field_71439_g.field_70177_z;
        }
    }
}

