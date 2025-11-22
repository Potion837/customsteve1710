/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.GuiButton
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.gui.GuiTextField
 *  net.minecraft.util.text.TextComponentTranslation
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.opengl.GL11
 */
package customsteve;

import customsteve.G;
import customsteve.a_0;
import customsteve.b_0;
import customsteve.bc;
import customsteve.i;
import customsteve.i_0;
import customsteve.j_0;
import customsteve.k;
import customsteve.r_0;
import java.io.IOException;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.util.text.TextComponentTranslation;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

/*
 * Renamed from customsteve.M
 * Duplicate member names - consider using --renamedupmembers true
 */
public class m_0
extends i_0 {
    protected static final int a = 0;
    protected static final int b = 1;
    protected static final int c = 20;
    protected static final int d = 21;
    protected static final int e = 22;
    protected static final int f = 23;
    protected static final int g = 24;
    protected static final int h = 25;
    protected static final int i = 30;
    protected static final int j = 31;
    protected static final int o = 32;
    protected static final int p = 33;
    protected GuiTextField a;
    protected j_0 a;
    protected j_0 b;
    protected j_0 c;
    protected j_0 d;
    protected j_0 e;
    protected j_0 f;
    private r_0 a;
    private G a;
    private int q = 0;

    public m_0(GuiScreen parent) {
        super(parent);
    }

    @Override
    public void drawScreen(int par1, int par2, float par3) {
        super.drawScreen(par1, par2, par3);
        GL11.glDisable((int)2929);
        if (b != 0) {
            this.func_73731_b(this.fontRenderer, new TextComponentTranslation("Gui.Gesture.Title", new Object[0]).func_150254_d() + " " + (this.q + 1), (int)((double)this.width * 0.82), (int)((double)this.height * 0.12), 0xFFFFFF);
            this.func_73731_b(this.fontRenderer, new TextComponentTranslation("Gui.Gesture.FromFrame", new Object[0]).func_150254_d(), (int)((double)this.width * 0.82), (int)((double)this.height * 0.6), 0xFFFFFF);
            this.a.drawTextBox();
        }
        GL11.glEnable((int)2929);
    }

    protected void actionPerformed(GuiButton par1GuiButton) {
        this.a = 1;
        switch (par1GuiButton.id) {
            case 0: {
                this.mc.displayGuiScreen((GuiScreen)this.a);
                break;
            }
            case 1: {
                if (this.a == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(new TextComponentTranslation("Gui.Gesture.HelpTitle", new Object[0]).func_150254_d()).append('\n');
                    sb.append(new TextComponentTranslation("Gui.Gesture.Help1", new Object[0]).func_150254_d()).append('\n');
                    sb.append(new TextComponentTranslation("Gui.Gesture.Help2", new Object[0]).func_150254_d()).append('\n');
                    sb.append(new TextComponentTranslation("Gui.Gesture.Help3", new Object[0]).func_150254_d()).append('\n');
                    sb.append(new TextComponentTranslation("Gui.Gesture.Help4", new Object[0]).func_150254_d()).append('\n');
                    sb.append(new TextComponentTranslation("Gui.Gesture.Help5", new Object[0]).func_150254_d()).append('\n');
                    sb.append(new TextComponentTranslation("Gui.Gesture.Help6", new Object[0]).func_150254_d()).append('\n');
                    sb.append(new TextComponentTranslation("Gui.Gesture.Help7", new Object[0]).func_150254_d()).append('\n');
                    sb.append(new TextComponentTranslation("Gui.Gesture.Help8", new Object[0]).func_150254_d()).append('\n');
                    sb.append(new TextComponentTranslation("Gui.Gesture.Help9", new Object[0]).func_150254_d()).append('\n');
                    sb.append(new TextComponentTranslation("Gui.Gesture.Help10", new Object[0]).func_150254_d()).append('\n');
                    sb.append(new TextComponentTranslation("Gui.Gesture.Help11", new Object[0]).func_150254_d()).append('\n');
                    sb.append(new TextComponentTranslation("Gui.Gesture.Help12", new Object[0]).func_150254_d());
                    this.a = new G((GuiScreen)this, sb.toString());
                }
                m_0.a(this.a);
                break;
            }
            case 20: {
                this.a.a = !this.a.a;
                break;
            }
            case 21: {
                this.b.a = !this.b.a;
                break;
            }
            case 22: {
                this.c.a = !this.c.a;
                break;
            }
            case 23: {
                this.d.a = !this.d.a;
                break;
            }
            case 24: {
                this.e.a = !this.e.a;
                break;
            }
            case 25: {
                this.f.a = !this.f.a;
                break;
            }
            case 30: {
                this.a();
                i qm = a_0.instance.a.a[this.q];
                if (a_0.instance.a == null || ((bc.a)((Object)a_0.instance.a.a)).f) break;
                k csp = a_0.instance.a;
                boolean upper = qm.b;
                if (((bc.a)((Object)csp.a)).g && ((bc.a)((Object)csp.a)).a) {
                    ((bc.a)((Object)csp.a)).a = false;
                    ((bc.a)((Object)csp.a)).g = false;
                    ((bc.a)((Object)csp.a)).h = false;
                    ((bc.a)((Object)csp.a)).c = true;
                    break;
                }
                ((bc.a)((Object)csp.a)).c = false;
                csp.i = true;
                String path = "CustomSteve/Animations/" + csp.b() + "/" + (this.q + 1 == 10 ? 0 : this.q + 1) + ".vmd";
                csp.c(path, 0);
                csp.b((int)0).b = csp.b((int)0).b + (b_0.j == 2 ? (long)(qm.a * 2) : (long)qm.a);
                csp.a(0);
                ((bc.a)((Object)csp.a)).a = qm.a;
                ((bc.a)((Object)csp.a)).h = true;
                ((bc.a)((Object)csp.a)).g = true;
                break;
            }
            case 31: {
                this.a();
                ++this.q;
                if (this.q > 9) {
                    this.q = 0;
                }
                this.b();
                break;
            }
            case 32: {
                this.a();
                try {
                    a_0.instance.a.g();
                }
                catch (Exception e2) {
                    e2.printStackTrace();
                }
                break;
            }
            case 33: {
                this.a();
                try {
                    a_0.instance.a.e();
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
    protected void mouseClicked(int par1, int par2, int par3) throws IOException {
        this.a.func_146192_a(par1, par2, par3);
        super.mouseClicked(par1, par2, par3);
    }

    @Override
    protected void keyTyped(char par1, int par2) throws IOException {
        if ((par1 == '\b' || par1 == '\u007f' || par1 >= '0' && par1 <= '9') && this.a.isFocused()) {
            this.a.textboxKeyTyped(par1, par2);
        }
        super.keyTyped(par1, par2);
    }

    @Override
    protected void mouseReleased(int par1, int par2, int par3) {
        super.mouseReleased(par1, par2, par3);
    }

    @Override
    protected void a(int mX, int mY, int d2) {
        super.a(mX, mY, d2);
    }

    public void a() {
        i qm = a_0.instance.a.a[this.q];
        qm.a = this.a.a;
        qm.b = this.b.a;
        qm.c = this.c.a;
        qm.d = this.d.a;
        qm.e = this.e.a;
        qm.f = this.f.a;
        try {
            qm.a = Integer.parseInt(this.a.getText());
        }
        catch (Exception e2) {
            e2.printStackTrace();
            qm.a = 0;
        }
    }

    public void b() {
        i qm = a_0.instance.a.a[this.q];
        qm = a_0.instance.a.a[this.q];
        this.a.a = qm.a;
        this.b.a = qm.b;
        this.c.a = qm.c;
        this.d.a = qm.d;
        this.e.a = qm.e;
        this.f.a = qm.f;
        this.a.setText(qm.a + "");
    }

    public void initGui() {
        super.initGui();
        Keyboard.enableRepeatEvents((boolean)true);
        this.buttonList.add(new GuiButton(0, (int)((double)this.width * 0.89), (int)((double)this.height * 0.035), (int)((double)this.width * 0.05), 20, "\u2190"));
        this.buttonList.add(new GuiButton(1, (int)((double)this.width * 0.82), (int)((double)this.height * 0.035), (int)((double)this.width * 0.05), 20, "?"));
        float wBegin = 0.82f;
        float hBegin = 0.18f;
        this.a = new j_0(20, (int)((float)this.width * wBegin), (int)((float)this.height * hBegin), 15, 15, new TextComponentTranslation("Gui.Gesture.LoopAnimation", new Object[0]).func_150254_d(), b_0.k);
        this.buttonList.add(this.a);
        this.b = new j_0(21, (int)((float)this.width * wBegin), (int)((float)this.height * (hBegin + 0.07f)), 15, 15, new TextComponentTranslation("Gui.Gesture.UpperBody", new Object[0]).func_150254_d(), b_0.k);
        this.buttonList.add(this.b);
        this.c = new j_0(22, (int)((float)this.width * wBegin), (int)((float)this.height * (hBegin + 0.14f)), 15, 15, new TextComponentTranslation("Gui.Gesture.Item", new Object[0]).func_150254_d(), b_0.k);
        this.buttonList.add(this.c);
        this.d = new j_0(23, (int)((float)this.width * wBegin), (int)((float)this.height * (hBegin + 0.21f)), 15, 15, new TextComponentTranslation("Gui.Gesture.FreeView", new Object[0]).func_150254_d(), b_0.k);
        this.buttonList.add(this.d);
        this.e = new j_0(24, (int)((float)this.width * wBegin), (int)((float)this.height * (hBegin + 0.28f)), 15, 15, new TextComponentTranslation("Gui.Gesture.BodyControl", new Object[0]).func_150254_d(), b_0.k);
        this.buttonList.add(this.e);
        this.f = new j_0(25, (int)((float)this.width * wBegin), (int)((float)this.height * (hBegin + 0.35f)), 15, 15, new TextComponentTranslation("Gui.Gesture.AnimationTrans", new Object[0]).func_150254_d(), b_0.k);
        this.buttonList.add(this.f);
        this.a = new GuiTextField(0, this.fontRenderer, (int)((double)this.width * 0.8245), (int)((double)this.height * 0.66), (int)((double)this.width * 0.162), 15);
        this.b();
        this.buttonList.add(new GuiButton(30, (int)((double)this.width * 0.82), (int)((double)this.height * 0.73), (int)((float)this.width * 0.0889f), 20, new TextComponentTranslation("Gui.Gesture.Preview", new Object[0]).func_150254_d()));
        this.buttonList.add(new GuiButton(31, (int)((double)this.width * 0.908), (int)((double)this.height * 0.73), (int)((float)this.width * 0.0889f), 20, new TextComponentTranslation("Gui.Gesture.Next", new Object[0]).func_150254_d()));
        this.buttonList.add(new GuiButton(32, (int)((double)this.width * 0.82), (int)((double)this.height * 0.81), (int)((float)this.width * 0.0889f), 20, new TextComponentTranslation("Gui.Gesture.Save", new Object[0]).func_150254_d()));
        this.buttonList.add(new GuiButton(33, (int)((double)this.width * 0.908), (int)((double)this.height * 0.81), (int)((float)this.width * 0.0889f), 20, new TextComponentTranslation("Gui.Gesture.Load", new Object[0]).func_150254_d()));
    }

    @Override
    public void onGuiClosed() {
        this.a();
        super.onGuiClosed();
    }
}

