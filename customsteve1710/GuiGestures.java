/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.GuiButton
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.gui.GuiTextField
 *  net.minecraft.util.StatCollector
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.util.StatCollector;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class GuiGestures
extends GuiBaseScreen {
    protected static final int energy$ = 0;
    protected static final int dispute$ = 1;
    protected static final int troops$ = 20;
    protected static final int arena$ = 21;
    protected static final int bloom$ = 22;
    protected static final int zimbabwe$ = 23;
    protected static final int trustee$ = 24;
    protected static final int alerts$ = 25;
    protected static final int horrible$ = 30;
    protected static final int users$ = 31;
    protected static final int assess$ = 32;
    protected static final int miami$ = 33;
    protected GuiTextField manuals$;
    protected GuiCheckBox midlands$;
    protected GuiCheckBox sheets$;
    protected GuiCheckBox itself$;
    protected GuiCheckBox nasdaq$;
    protected GuiCheckBox dating$;
    protected GuiCheckBox python$;
    private GuiSlotList lined$;
    private GuiAbout2 sanyo$;
    private int william$ = 0;

    public GuiGestures(GuiScreen parent) {
        super(parent);
    }

    @Override
    public void func_73863_a(int par1, int par2, float par3) {
        super.func_73863_a(par1, par2, par3);
        GL11.glDisable((int)2929);
        if (b) {
            this.func_73731_b(this.field_146289_q, StatCollector.func_74838_a((String)"Gui.Gesture.Title") + " " + (this.william$ + 1), (int)((double)this.field_146294_l * 0.82), (int)((double)this.field_146295_m * 0.12), 0xFFFFFF);
            this.func_73731_b(this.field_146289_q, StatCollector.func_74838_a((String)"Gui.Gesture.FromFrame"), (int)((double)this.field_146294_l * 0.82), (int)((double)this.field_146295_m * 0.6), 0xFFFFFF);
            this.manuals$.func_146194_f();
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
                if (this.sanyo$ == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(StatCollector.func_74838_a((String)"Gui.Gesture.HelpTitle")).append('\n');
                    sb.append(StatCollector.func_74838_a((String)"Gui.Gesture.Help1")).append('\n');
                    sb.append(StatCollector.func_74838_a((String)"Gui.Gesture.Help2")).append('\n');
                    sb.append(StatCollector.func_74838_a((String)"Gui.Gesture.Help3")).append('\n');
                    sb.append(StatCollector.func_74838_a((String)"Gui.Gesture.Help4")).append('\n');
                    sb.append(StatCollector.func_74838_a((String)"Gui.Gesture.Help5")).append('\n');
                    sb.append(StatCollector.func_74838_a((String)"Gui.Gesture.Help6")).append('\n');
                    sb.append(StatCollector.func_74838_a((String)"Gui.Gesture.Help7")).append('\n');
                    sb.append(StatCollector.func_74838_a((String)"Gui.Gesture.Help8")).append('\n');
                    sb.append(StatCollector.func_74838_a((String)"Gui.Gesture.Help9")).append('\n');
                    sb.append(StatCollector.func_74838_a((String)"Gui.Gesture.Help10")).append('\n');
                    sb.append(StatCollector.func_74838_a((String)"Gui.Gesture.Help11")).append('\n');
                    sb.append(StatCollector.func_74838_a((String)"Gui.Gesture.Help12"));
                    this.sanyo$ = new GuiAbout2((GuiScreen)this, sb.toString());
                }
                GuiGestures.a(this.sanyo$);
                break;
            }
            case 20: {
                this.midlands$.choice$ = !this.midlands$.choice$;
                break;
            }
            case 21: {
                this.sheets$.choice$ = !this.sheets$.choice$;
                break;
            }
            case 22: {
                this.itself$.choice$ = !this.itself$.choice$;
                break;
            }
            case 23: {
                this.nasdaq$.choice$ = !this.nasdaq$.choice$;
                break;
            }
            case 24: {
                this.dating$.choice$ = !this.dating$.choice$;
                break;
            }
            case 25: {
                this.python$.choice$ = !this.python$.choice$;
                break;
            }
            case 30: {
                this.a();
                QuickMotionSetting qm = CSmanager.cellular$.trucks$.expected$[this.william$];
                if (CSmanager.cellular$.trucks$ == null || CSmanager.cellular$.trucks$.a.bringing$) break;
                CSplayer csp = CSmanager.cellular$.trucks$;
                if (csp.a.single$ && csp.a.remove$) {
                    csp.a.remove$ = false;
                    csp.a.single$ = false;
                    csp.a.warriors$ = false;
                    csp.a.quizzes$ = true;
                    break;
                }
                csp.a.quizzes$ = false;
                csp.pacific$ = true;
                String path = "CustomSteve/Animations/" + csp.b() + "/" + (this.william$ + 1 == 10 ? 0 : this.william$ + 1) + ".vmd";
                csp.c(path, false);
                csp.devel$.earned$ = csp.devel$.earned$ + (Config.filter$ == 2 ? (long)(qm.locally$ * 2) : (long)qm.locally$);
                csp.a(false);
                csp.a.remove$ = qm.screens$;
                csp.a.warriors$ = true;
                csp.a.single$ = true;
                break;
            }
            case 31: {
                this.a();
                ++this.william$;
                if (this.william$ > 9) {
                    this.william$ = 0;
                }
                this.b();
                break;
            }
            case 32: {
                this.a();
                try {
                    CSmanager.cellular$.trucks$.g();
                }
                catch (Exception e2) {
                    e2.printStackTrace();
                }
                break;
            }
            case 33: {
                this.a();
                try {
                    CSmanager.cellular$.trucks$.e();
                }
                catch (Exception e3) {
                    e3.printStackTrace();
                }
                this.b();
            }
        }
        this.a();
    }

    @Override
    protected void func_73864_a(int par1, int par2, int par3) {
        super.func_73864_a(par1, par2, par3);
    }

    @Override
    protected void func_73869_a(char par1, int par2) {
        super.func_73869_a(par1, par2);
    }

    @Override
    protected void func_146286_b(int par1, int par2, int par3) {
        super.func_146286_b(par1, par2, par3);
    }

    @Override
    protected void a(int mX, int mY, int d2) {
        super.a(mX, mY, d2);
    }

    public void a() {
        QuickMotionSetting qm = CSmanager.cellular$.trucks$.expected$[this.william$];
        qm.screens$ = this.midlands$.choice$;
        qm.hometown$ = this.sheets$.choice$;
        qm.plugin$ = this.itself$.choice$;
        qm.silly$ = this.nasdaq$.choice$;
        qm.nights$ = this.dating$.choice$;
        qm.raised$ = this.python$.choice$;
        qm.locally$ = Integer.parseInt(this.manuals$.func_146179_b());
    }

    public void b() {
        QuickMotionSetting qm = CSmanager.cellular$.trucks$.expected$[this.william$];
        qm = CSmanager.cellular$.trucks$.expected$[this.william$];
        this.midlands$.choice$ = qm.screens$;
        this.sheets$.choice$ = qm.hometown$;
        this.itself$.choice$ = qm.plugin$;
        this.nasdaq$.choice$ = qm.silly$;
        this.dating$.choice$ = qm.nights$;
        this.python$.choice$ = qm.raised$;
        this.manuals$.func_146180_a(qm.locally$ + "");
    }

    public void func_73866_w_() {
        super.func_73866_w_();
        Keyboard.enableRepeatEvents((boolean)true);
        this.field_146292_n.add(new GuiButton(0, (int)((double)this.field_146294_l * 0.89), (int)((double)this.field_146295_m * 0.035), (int)((double)this.field_146294_l * 0.05), 20, "\u2190"));
        this.field_146292_n.add(new GuiButton(1, (int)((double)this.field_146294_l * 0.82), (int)((double)this.field_146295_m * 0.035), (int)((double)this.field_146294_l * 0.05), 20, "?"));
        float wBegin = 0.82f;
        float hBegin = 0.18f;
        this.midlands$ = new GuiCheckBox(20, (int)((float)this.field_146294_l * wBegin), (int)((float)this.field_146295_m * hBegin), 15, 15, StatCollector.func_74838_a((String)"Gui.Gesture.LoopAnimation"), Config.everyday$);
        this.field_146292_n.add(this.midlands$);
        this.sheets$ = new GuiCheckBox(21, (int)((float)this.field_146294_l * wBegin), (int)((float)this.field_146295_m * (hBegin + 0.07f)), 15, 15, StatCollector.func_74838_a((String)"Gui.Gesture.UpperBody"), Config.everyday$);
        this.field_146292_n.add(this.sheets$);
        this.itself$ = new GuiCheckBox(22, (int)((float)this.field_146294_l * wBegin), (int)((float)this.field_146295_m * (hBegin + 0.14f)), 15, 15, StatCollector.func_74838_a((String)"Gui.Gesture.Item"), Config.everyday$);
        this.field_146292_n.add(this.itself$);
        this.nasdaq$ = new GuiCheckBox(23, (int)((float)this.field_146294_l * wBegin), (int)((float)this.field_146295_m * (hBegin + 0.21f)), 15, 15, StatCollector.func_74838_a((String)"Gui.Gesture.FreeView"), Config.everyday$);
        this.field_146292_n.add(this.nasdaq$);
        this.dating$ = new GuiCheckBox(24, (int)((float)this.field_146294_l * wBegin), (int)((float)this.field_146295_m * (hBegin + 0.28f)), 15, 15, StatCollector.func_74838_a((String)"Gui.Gesture.BodyControl"), Config.everyday$);
        this.field_146292_n.add(this.dating$);
        this.python$ = new GuiCheckBox(25, (int)((float)this.field_146294_l * wBegin), (int)((float)this.field_146295_m * (hBegin + 0.35f)), 15, 15, StatCollector.func_74838_a((String)"Gui.Gesture.AnimationTrans"), Config.everyday$);
        this.field_146292_n.add(this.python$);
        this.manuals$ = new GuiTextField(this.field_146289_q, (int)((double)this.field_146294_l * 0.8245), (int)((double)this.field_146295_m * 0.66), (int)((double)this.field_146294_l * 0.162), 15);
        this.b();
        this.field_146292_n.add(new GuiButton(30, (int)((double)this.field_146294_l * 0.82), (int)((double)this.field_146295_m * 0.73), (int)((float)this.field_146294_l * 0.0889f), 20, StatCollector.func_74838_a((String)"Gui.Gesture.Preview")));
        this.field_146292_n.add(new GuiButton(31, (int)((double)this.field_146294_l * 0.908), (int)((double)this.field_146295_m * 0.73), (int)((float)this.field_146294_l * 0.0889f), 20, StatCollector.func_74838_a((String)"Gui.Gesture.Next")));
        this.field_146292_n.add(new GuiButton(32, (int)((double)this.field_146294_l * 0.82), (int)((double)this.field_146295_m * 0.81), (int)((float)this.field_146294_l * 0.0889f), 20, StatCollector.func_74838_a((String)"Gui.Gesture.Save")));
        this.field_146292_n.add(new GuiButton(33, (int)((double)this.field_146294_l * 0.908), (int)((double)this.field_146295_m * 0.81), (int)((float)this.field_146294_l * 0.0889f), 20, StatCollector.func_74838_a((String)"Gui.Gesture.Load")));
    }

    @Override
    public void func_146281_b() {
        this.a();
        super.func_146281_b();
    }
}

