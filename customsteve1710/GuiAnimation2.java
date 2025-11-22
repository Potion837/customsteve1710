/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.audio.SoundHandler
 *  net.minecraft.client.gui.GuiButton
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.gui.GuiTextField
 *  net.minecraft.util.StatCollector
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.opengl.GL11
 */
import java.io.File;
import java.util.ArrayList;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.SoundHandler;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.util.StatCollector;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class GuiAnimation2
extends GuiBaseScreen {
    protected static final int oxford$ = 0;
    protected static final int statute$ = 1;
    protected static final int somerset$ = 2;
    protected static final int online$ = 10;
    protected static final int edmonton$ = 11;
    protected static final int mineral$ = 20;
    protected static final int cylinder$ = 21;
    protected static final int autumn$ = 22;
    protected static final int aerial$ = 30;
    protected static final int nearly$ = 31;
    protected GuiCheckBox asylum$;
    protected GuiCheckBox judges$;
    protected GuiCheckBox entire$;
    protected GuiCheckBox bring$;
    protected GuiCheckBox judicial$;
    protected GuiTextField stylish$;
    protected GuiTextField above$;
    private GuiSlotList buried$;
    private GuiAbout2 graph$;

    public GuiAnimation2(GuiScreen parent) {
        super(parent);
    }

    @Override
    public void func_73863_a(int par1, int par2, float par3) {
        super.func_73863_a(par1, par2, par3);
        GL11.glDisable((int)2929);
        if (b) {
            GuiButton b2;
            Config.taught$ = this.entire$.choice$;
            String[] aniName = this.buried$.a();
            if (aniName == null || aniName[0].isEmpty() || Config.remarks$) {
                b2 = this.a(10);
                b2.field_146124_l = false;
                b2 = this.a(11);
                b2.field_146124_l = false;
            } else {
                b2 = this.a(10);
                b2.field_146124_l = true;
                b2 = this.a(11);
                b2.field_146124_l = true;
            }
            if (Config.seating$ && !Config.villas$) {
                b2 = this.a(11);
                b2.field_146125_m = true;
            } else {
                b2 = this.a(11);
                b2.field_146125_m = false;
            }
            GuiButton syncButton = this.a(11);
            GuiButton b3 = null;
            switch (CSmanager.cellular$.trucks$.a.course$) {
                case funds$: {
                    syncButton.field_146126_j = StatCollector.func_74838_a((String)"Gui.Animation.Waiting") + "...(" + CSmanager.cellular$.optimal$.dispatch$ + ")";
                    b3 = this.a(10);
                    b3.field_146124_l = false;
                    b3 = this.a(20);
                    b3.field_146124_l = false;
                    b3 = this.a(11);
                    b3.field_146124_l = false;
                    b3 = this.a(21);
                    b3.field_146124_l = false;
                    break;
                }
                case coral$: {
                    syncButton.field_146126_j = StatCollector.func_74838_a((String)"Gui.Animation.Cancel") + " (" + CSmanager.cellular$.optimal$.dispatch$ + ")";
                    b3 = this.a(10);
                    b3.field_146124_l = false;
                    b3 = this.a(20);
                    b3.field_146124_l = false;
                    b3 = this.a(11);
                    b3.field_146124_l = true;
                    b3 = this.a(21);
                    b3.field_146124_l = false;
                    break;
                }
                case cameras$: {
                    syncButton.field_146126_j = StatCollector.func_74838_a((String)"Gui.Animation.SyncPlay");
                    if (aniName == null || aniName[0].isEmpty()) break;
                    b3 = this.a(10);
                    b3.field_146124_l = true;
                    b3 = this.a(20);
                    b3.field_146124_l = true;
                    b3 = this.a(11);
                    b3.field_146124_l = true;
                    b3 = this.a(21);
                    b3.field_146124_l = true;
                    break;
                }
                case piece$: {
                    if (CSmanager.cellular$.trucks$.a.wales$) {
                        b3 = this.a(10);
                        b3.field_146124_l = false;
                        b3 = this.a(20);
                        b3.field_146124_l = false;
                    } else {
                        b3 = this.a(10);
                        b3.field_146124_l = true;
                        b3 = this.a(20);
                        b3.field_146124_l = true;
                    }
                    b3 = this.a(11);
                    b3.field_146124_l = false;
                    b3 = this.a(21);
                    b3.field_146124_l = false;
                    if (CSmanager.cellular$.optimal$ != null && CSmanager.cellular$.optimal$.dispatch$ != 0) {
                        syncButton.field_146126_j = StatCollector.func_74838_a((String)"Gui.Animation.Syncing") + "(" + CSmanager.cellular$.optimal$.dispatch$ + ")";
                        break;
                    }
                    syncButton.field_146126_j = StatCollector.func_74838_a((String)"Gui.Animation.Playing") + "...";
                    break;
                }
                case bless$: {
                    if (CSmanager.cellular$.optimal$ != null) {
                        syncButton.field_146126_j = StatCollector.func_74838_a((String)"Gui.Animation.Join") + " (" + CSmanager.cellular$.optimal$.dispatch$ + ")";
                    }
                    b3 = this.a(11);
                    b3.field_146124_l = true;
                    b3 = this.a(21);
                    b3.field_146124_l = false;
                    if (aniName == null || aniName[0].isEmpty()) break;
                    b3 = this.a(10);
                    b3.field_146124_l = true;
                    b3 = this.a(20);
                    b3.field_146124_l = true;
                    break;
                }
            }
            if (CSmanager.cellular$.trucks$.a.warriors$) {
                b3 = this.a(10);
                b3.field_146124_l = true;
                b3 = this.a(21);
                b3.field_146124_l = false;
                b3 = this.a(20);
                b3.field_146124_l = false;
            }
            if (Config.remarks$ || Config.ensures$) {
                b3 = this.a(11);
                b3.field_146124_l = false;
                b3 = this.a(10);
                b3.field_146124_l = false;
                b3 = this.a(20);
                b3.field_146124_l = false;
                b3 = this.a(21);
                b3.field_146124_l = false;
                if (Config.remarks$) {
                    b3 = this.a(11);
                    b3.field_146126_j = StatCollector.func_74838_a((String)"Gui.Animation.Sending") + "...";
                } else if (Config.ensures$) {
                    b3 = this.a(10);
                    b3.field_146126_j = StatCollector.func_74838_a((String)"Gui.Animation.Sending") + "...";
                }
            } else if (CSmanager.cellular$.trucks$.a.warriors$) {
                b3 = this.a(10);
                b3.field_146126_j = StatCollector.func_74838_a((String)"Gui.Animation.Stop");
            } else {
                b3 = this.a(10);
                b3.field_146126_j = StatCollector.func_74838_a((String)"Gui.Animation.Play");
            }
            this.buried$.a(par1, par2, par3, n == 3 ? -16777216 : -1);
            GL11.glDisable((int)2896);
            CSplayer csp = CSmanager.cellular$.trucks$;
            String ani = "";
            int nowP = 0;
            int maxK = 0;
            if (csp != null && csp.devel$ != null) {
                ani = csp.devel$.facing$;
                nowP = csp.a.wales$ ? CSmanager.cellular$.positive$ : csp.pizza$[csp.wildlife$];
                maxK = (int)csp.devel$.bible$;
            }
            this.func_73731_b(this.field_146289_q, "Animation: " + ani, (int)((double)this.field_146294_l * 0.04), (int)((double)this.field_146295_m * 0.08), 0xFFFFFF);
            this.func_73731_b(this.field_146289_q, "FreamStatus: " + nowP + "/" + maxK, (int)((double)this.field_146294_l * 0.04), (int)((double)this.field_146295_m * 0.12), 0xFFFFFF);
            this.func_73731_b(this.field_146289_q, "LostFrames: " + csp.l, (int)((double)this.field_146294_l * 0.04), (int)((double)this.field_146295_m * 0.16), 0xFFFFFF);
        }
        GL11.glEnable((int)2929);
    }

    protected void func_146284_a(GuiButton par1GuiButton) {
        this.a = true;
        switch (par1GuiButton.field_146127_k) {
            case 0: {
                this.field_146297_k.func_147108_a(this.a);
                break;
            }
            case 1: {
                if (this.graph$ == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(StatCollector.func_74838_a((String)"Gui.Animation.HelpTitle")).append('\n');
                    sb.append(StatCollector.func_74838_a((String)"Gui.Animation.Help1")).append('\n');
                    sb.append(StatCollector.func_74838_a((String)"Gui.Animation.Help2")).append('\n');
                    sb.append(StatCollector.func_74838_a((String)"Gui.Animation.Help3")).append('\n');
                    sb.append(StatCollector.func_74838_a((String)"Gui.Animation.Help4"));
                    this.graph$ = new GuiAbout2((GuiScreen)this, sb.toString());
                }
                GuiAnimation2.a(this.graph$);
                break;
            }
            case 2: {
                CSmanager.cellular$._school();
                break;
            }
            case 10: {
                String[] aniName = this.buried$.a();
                CSplayer csp = CSmanager.cellular$.trucks$;
                if (csp == null) break;
                if (csp.a.warriors$) {
                    P201_AnimationStatus packet = new P201_AnimationStatus(ModContainer.dealing$.highways$, "", "", P201_AnimationStatus2.trust$._wrist());
                    Config.ensures$ = ModContainer.array$.a(Minecraft.func_71410_x().field_71439_g.field_71174_a.func_147298_b(), packet);
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
                    csp.a.quizzes$ = true;
                    csp.a.remove$ = false;
                    csp.a.warriors$ = false;
                    csp.inquire$ = null;
                    CSmanager.cellular$.glossary$ = null;
                    csp.c(csp.a.mutual$ + 1);
                    break;
                }
                Hooks.petite$ = false;
                if (aniName == null || aniName[0].isEmpty()) break;
                if (Config.seating$ && !Config.villas$) {
                    if (this.asylum$.choice$) {
                        return;
                    }
                    P201_AnimationStatus packet = new P201_AnimationStatus(ModContainer.dealing$.highways$, aniName[1], CSmanager.cellular$._mixed(aniName[1]), P201_AnimationStatus2.counter$._wrist());
                    if (Config.everyday$) {
                        packet.making$ = true;
                        packet.combat$ = Config.gadgets$;
                    }
                    Config.ensures$ = ModContainer.array$.a(Minecraft.func_71410_x().field_71439_g.field_71174_a.func_147298_b(), packet);
                    break;
                }
                csp.a.remove$ = false;
                if (this.asylum$.choice$) {
                    csp.a.remove$ = true;
                }
                csp.a.quizzes$ = false;
                csp.pacific$ = true;
                if (Config.everyday$) {
                    // empty if block
                }
                csp.c(aniName[1], false);
                CSmanager.cellular$.glossary$ = CSmanager.cellular$._handle(aniName[1].replace(".vmd", "") + "_Camera.vmd");
                if (!new FrameStackHelper()._reaches(csp.a, CSmanager.cellular$.glossary$)) {
                    CSmanager.cellular$.glossary$ = null;
                }
                if (Config.everyday$) {
                    csp.a(false);
                }
                csp.a.warriors$ = true;
                if (!Config.everyday$) break;
                try {
                    SoundHandler sndManager = Minecraft.func_71410_x().func_147118_V();
                    int mode = 0;
                    sndManager.func_147690_c();
                    CSmanager.picked$.stop("CustomSteveBGM");
                    CSmanager.picked$.newStreamingSource(true, "CustomSteveBGM", new File(ModContainer.outreach$ + "/CustomSteve/BGM/" + Config.gadgets$).toURI().toURL(), Config.gadgets$, false, 0.0f, 0.0f, 0.0f, mode, 16.0f);
                    CSmanager.picked$.setVolume("CustomSteveBGM", 1.0f);
                    Config.framed$ = true;
                }
                catch (Exception e1) {
                    e1.printStackTrace();
                }
                CSmanager.picked$.play("CustomSteveBGM");
                break;
            }
            case 11: {
                String[] aniName1 = this.buried$.a();
                switch (CSmanager.cellular$.trucks$.a.course$) {
                    case funds$: {
                        break;
                    }
                    case coral$: {
                        P201_AnimationStatus packet = new P201_AnimationStatus(ModContainer.dealing$.highways$, "", "", P201_AnimationStatus2.producer$._wrist());
                        packet.seasons$ = P201_AnimationStatus3.attacked$._loved();
                        Config.remarks$ = ModContainer.array$.a(Minecraft.func_71410_x().field_71439_g.field_71174_a.func_147298_b(), packet);
                        break;
                    }
                    case cameras$: {
                        if (aniName1 == null || aniName1[0].isEmpty()) break;
                        P201_AnimationStatus packet1 = new P201_AnimationStatus(ModContainer.dealing$.highways$, aniName1[1], CSmanager.cellular$._mixed(ModContainer.outreach$ + aniName1[1]), P201_AnimationStatus2.producer$._wrist());
                        packet1.seasons$ = P201_AnimationStatus3.columns$._loved();
                        if (Config.everyday$ && Config.gadgets$ != null && !Config.gadgets$.isEmpty()) {
                            packet1.making$ = true;
                            packet1.combat$ = Config.gadgets$;
                        }
                        Config.remarks$ = ModContainer.array$.a(Minecraft.func_71410_x().field_71439_g.field_71174_a.func_147298_b(), packet1);
                        break;
                    }
                    case piece$: {
                        break;
                    }
                    case bless$: {
                        P201_AnimationStatus packet2 = new P201_AnimationStatus(ModContainer.dealing$.highways$, "", "", P201_AnimationStatus2.producer$._wrist());
                        packet2.seasons$ = P201_AnimationStatus3.endif$._loved();
                        Config.remarks$ = ModContainer.array$.a(Minecraft.func_71410_x().field_71439_g.field_71174_a.func_147298_b(), packet2);
                        break;
                    }
                }
                break;
            }
            case 21: {
                this.judges$.a();
                Config.everyday$ = !Config.everyday$;
                break;
            }
            case 20: {
                this.asylum$.a();
                CSmanager.cellular$.trucks$.a.remove$ = !CSmanager.cellular$.trucks$.a.remove$;
                break;
            }
            case 22: {
                this.entire$.a();
                Config.taught$ = this.entire$.choice$;
                break;
            }
            case 30: {
                this.stylish$.func_146184_c(this.bring$.a());
                break;
            }
            case 31: {
                this.above$.func_146184_c(this.judicial$.a());
            }
        }
    }

    @Override
    protected void func_73864_a(int par1, int par2, int par3) {
        if (b && !this.a && par1 >= this.buried$.entering$ && par2 >= this.buried$.revised$ && par2 <= this.buried$.simon$) {
            this.buried$.a(par1, par2, par3 + 1);
            this.a = false;
            return;
        }
        super.func_73864_a(par1, par2, par3);
    }

    @Override
    protected void func_73869_a(char par1, int par2) {
        super.func_73869_a(par1, par2);
    }

    @Override
    protected void func_146286_b(int par1, int par2, int par3) {
        if (par3 != -1) {
            this.buried$.b(par1, par2, par3 + 1);
        }
        super.func_146286_b(par1, par2, par3);
    }

    @Override
    protected void a(int mX, int mY, int d2) {
        if (d2 != 0) {
            if (b && mX >= this.buried$.entering$ && mY >= this.buried$.revised$ && mY <= this.buried$.simon$) {
                if (d2 != 0) {
                    if (d2 > 0) {
                        d2 = -1;
                    } else if (d2 < 0) {
                        d2 = 1;
                    }
                    this.buried$.decide$ += (float)(d2 * this.buried$.bizarre$ / 2);
                }
            } else {
                super.a(mX, mY, d2);
            }
        }
    }

    public void func_73866_w_() {
        super.func_73866_w_();
        Keyboard.enableRepeatEvents((boolean)true);
        this.field_146292_n.add(new GuiButton(0, (int)((double)this.field_146294_l * 0.89), (int)((double)this.field_146295_m * 0.035), (int)((double)this.field_146294_l * 0.05), 20, "\u2190"));
        this.field_146292_n.add(new GuiButton(1, (int)((double)this.field_146294_l * 0.82), (int)((double)this.field_146295_m * 0.035), (int)((double)this.field_146294_l * 0.05), 20, "?"));
        this.field_146292_n.add(new GuiButton(2, (int)((double)this.field_146294_l * 0.75), (int)((double)this.field_146295_m * 0.035), (int)((double)this.field_146294_l * 0.05), 20, "R"));
        this.judges$ = new GuiCheckBox(21, (int)((double)this.field_146294_l * 0.75), (int)((double)this.field_146295_m * 0.66), 20, 20, StatCollector.func_74838_a((String)"Gui.Animation.BGM"), Config.everyday$);
        this.field_146292_n.add(this.judges$);
        this.asylum$ = new GuiCheckBox(20, (int)((double)this.field_146294_l * 0.87), (int)((double)this.field_146295_m * 0.66), 20, 20, StatCollector.func_74838_a((String)"Gui.Animation.Loop"), CSmanager.cellular$.trucks$.a.remove$);
        this.field_146292_n.add(this.asylum$);
        this.entire$ = new GuiCheckBox(22, (int)((double)this.field_146294_l * 0.87), (int)((double)this.field_146295_m * 0.72), 20, 20, StatCollector.func_74838_a((String)"Gui.Animation.Lock"), Config.taught$);
        this.field_146292_n.add(this.entire$);
        this.field_146292_n.add(new GuiButton(10, (int)((double)this.field_146294_l * 0.75), (int)((double)this.field_146295_m * 0.78), (int)((double)this.field_146294_l * 0.246), 20, StatCollector.func_74838_a((String)"Gui.Animation.Play")));
        this.field_146292_n.add(new GuiButton(11, (int)((double)this.field_146294_l * 0.75), (int)((double)this.field_146295_m * 0.86), (int)((double)this.field_146294_l * 0.246), 20, StatCollector.func_74838_a((String)"Gui.Animation.SyncPlay")));
        CSplayer csp = CSmanager.cellular$.trucks$;
        if (csp != null) {
            String path = "CustomSteve/Animations/";
            ArrayList list = CSmanager.cellular$._syracuse(path, ".vmd", 0, "(p)");
            path = "CustomSteve/Animations/" + csp.b();
            list.addAll(CSmanager.cellular$._syracuse(path, ".vmd", 0, ""));
            this.buried$ = new GuiSlotList(this, this.field_146297_k, (int)((double)this.field_146294_l * 0.23), (int)((double)this.field_146295_m * 0.5), (int)((double)this.field_146294_l * 0.75), (int)((double)this.field_146295_m * 0.15), 12, list);
        }
    }
}

