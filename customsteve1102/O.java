/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.GuiButton
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.util.text.TextComponentTranslation
 */
package customsteve;

import customsteve.G;
import customsteve.H;
import customsteve.ModContainer;
import customsteve.P;
import customsteve.a_0;
import customsteve.ax_0;
import customsteve.b_0;
import customsteve.i_0;
import customsteve.k;
import customsteve.k_0;
import customsteve.l_0;
import customsteve.m_0;
import customsteve.q_0;
import java.util.ArrayList;
import java.util.Collection;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.text.TextComponentTranslation;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class O
extends i_0 {
    private static final String a = "CustomSteve is Copyright 2014 by ici2cc(also ici2cc.com owner\u3002 email:fengxingssdua@yeah.net)";
    private static final int a = 1;
    private static final int b = 2;
    private static final int c = 3;
    private static final int d = 4;
    private static final int e = 10;
    private static final int f = 11;
    private static final int g = 12;
    private static final int h = 20;
    private static final int i = 21;
    private static final int j = 22;
    private static final int o = 23;
    private static final int p = 24;
    private static final int q = 30;
    private static final int r = 43;
    private static final int s = 44;
    private static final int t = 45;
    private static final int u = 47;
    private static final int v = 48;
    private static final int w = 49;
    private static final int x = 50;
    private static final int y = 51;
    private static final int z = 52;
    private static final int A = 53;
    private static final int B = 54;
    private GuiButton a;
    private GuiButton b;
    private GuiButton c;
    private GuiButton d;
    private GuiButton e;
    private GuiButton f;
    private GuiButton g;
    private GuiButton h;
    private GuiButton i;
    private GuiButton j;
    private GuiButton k;
    private m_0 a;
    private H a;
    private k_0 a;
    private q_0 a;
    private l_0 a;
    private P a;
    private G a;

    public O(GuiScreen parent) {
        super(parent);
    }

    @Override
    public void drawScreen(int par1, int par2, float par3) {
        this.k.enabled = b_0.m;
        this.j.enabled = b_0.m;
        super.drawScreen(par1, par2, par3);
    }

    protected void actionPerformed(GuiButton par1GuiButton) {
        this.a = (String)true;
        switch (par1GuiButton.id) {
            case 1: {
                this.mc.displayGuiScreen((GuiScreen)null);
                this.mc.setIngameFocus();
                break;
            }
            case 2: {
                if (this.a == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(new TextComponentTranslation("Gui.Main.HelpTitle", new Object[0]).func_150254_d()).append('\n').append('\n');
                    sb.append(new TextComponentTranslation("Gui.Main.Help1", new Object[0]).func_150254_d()).append('\n');
                    sb.append(new TextComponentTranslation("Gui.Main.Help2", new Object[0]).func_150254_d()).append('\n');
                    sb.append(new TextComponentTranslation("Gui.Main.Help3", new Object[0]).func_150254_d()).append('\n').append('\n');
                    sb.append(new TextComponentTranslation("Gui.Main.Help10", new Object[0]).func_150254_d()).append('\n');
                    sb.append(new TextComponentTranslation("Gui.Main.Help11", new Object[0]).func_150254_d()).append('\n');
                    sb.append(new TextComponentTranslation("Gui.Main.Help12", new Object[0]).func_150254_d()).append('\n');
                    sb.append(new TextComponentTranslation("Gui.Main.Help13", new Object[0]).func_150254_d()).append('\n');
                    sb.append(new TextComponentTranslation("Gui.Main.Help15", new Object[0]).func_150254_d()).append('\n');
                    sb.append(new TextComponentTranslation("Gui.Main.Help16", new Object[0]).func_150254_d()).append('\n');
                    sb.append(new TextComponentTranslation("Gui.Main.Help17", new Object[0]).func_150254_d()).append('\n');
                    sb.append(new TextComponentTranslation("Gui.Main.Help18", new Object[0]).func_150254_d()).append('\n');
                    sb.append(new TextComponentTranslation("Gui.Main.Help19", new Object[0]).func_150254_d()).append('\n').append('\n');
                    sb.append(new TextComponentTranslation("Gui.Main.Help50", new Object[0]).func_150254_d()).append('\n');
                    sb.append(new TextComponentTranslation("Gui.Main.Help51", new Object[0]).func_150254_d()).append('\n');
                    sb.append(new TextComponentTranslation("Gui.Main.Help52", new Object[0]).func_150254_d()).append('\n');
                    sb.append(new TextComponentTranslation("Gui.Main.Help53", new Object[0]).func_150254_d()).append('\n');
                    sb.append(new TextComponentTranslation("Gui.Main.Help54", new Object[0]).func_150254_d()).append('\n');
                    sb.append(new TextComponentTranslation("Gui.Main.Help55", new Object[0]).func_150254_d()).append('\n');
                    sb.append(new TextComponentTranslation("Gui.Main.Help56", new Object[0]).func_150254_d()).append('\n');
                    sb.append(new TextComponentTranslation("Gui.Main.Help57", new Object[0]).func_150254_d()).append('\n');
                    sb.append(new TextComponentTranslation("Gui.Main.Help58", new Object[0]).func_150254_d()).append('\n').append('\n');
                    sb.append(new TextComponentTranslation("Gui.Main.Help100", new Object[0]).func_150254_d()).append('\n');
                    sb.append(new TextComponentTranslation("Gui.Main.Help101", new Object[0]).func_150254_d()).append('\n');
                    sb.append(new TextComponentTranslation("Gui.Main.Help102", new Object[0]).func_150254_d()).append('\n');
                    sb.append(new TextComponentTranslation("Gui.Main.Help103", new Object[0]).func_150254_d()).append('\n');
                    sb.append(new TextComponentTranslation("Gui.Main.Help104", new Object[0]).func_150254_d()).append('\n');
                    sb.append(new TextComponentTranslation("Gui.Main.Help105", new Object[0]).func_150254_d()).append('\n');
                    sb.append(new TextComponentTranslation("Gui.Main.Help106", new Object[0]).func_150254_d()).append('\n');
                    sb.append(new TextComponentTranslation("Gui.Main.Help107", new Object[0]).func_150254_d()).append('\n');
                    sb.append(new TextComponentTranslation("Gui.Main.Help108", new Object[0]).func_150254_d()).append('\n');
                    sb.append(new TextComponentTranslation("Gui.Main.Help109", new Object[0]).func_150254_d()).append('\n');
                    sb.append(new TextComponentTranslation("Gui.Main.Help110", new Object[0]).func_150254_d()).append('\n').append('\n');
                    sb.append(new TextComponentTranslation("Gui.Main.Help200", new Object[0]).func_150254_d()).append('\n');
                    sb.append(new TextComponentTranslation("Gui.Main.Help201", new Object[0]).func_150254_d());
                    this.a = new G((GuiScreen)this, sb.toString());
                }
                O.a(this.a);
                break;
            }
            case 3: {
                this.a();
                ax_0 packet = new ax_0();
                packet.a = b_0.m;
                packet.b = a_0.instance.a.j;
                ModContainer.a.a(Minecraft.getMinecraft().player.connection.getNetworkManager(), packet);
                break;
            }
            case 4: {
                this.b();
                break;
            }
            case 10: {
                break;
            }
            case 11: {
                break;
            }
            case 12: {
                break;
            }
            case 20: {
                break;
            }
            case 21: {
                break;
            }
            case 22: {
                break;
            }
            case 23: {
                break;
            }
            case 24: {
                break;
            }
            case 30: {
                break;
            }
            case 43: {
                break;
            }
            case 44: {
                if (this.a == null) {
                    this.a = new P(this);
                }
                O.a(this.a);
                break;
            }
            case 54: {
                if (this.a == null) {
                    this.a = new m_0(this);
                }
                O.a(this.a);
                break;
            }
            case 45: {
                if (this.a == null) {
                    this.a = new H(this);
                }
                O.a(this.a);
                break;
            }
            case 48: {
                if (this.a == null) {
                    this.a = new q_0(this);
                }
                O.a(this.a);
                break;
            }
            case 49: {
                if (this.a == null) {
                    this.a = new l_0(this);
                }
                ArrayList<String> arrayList = new ArrayList<String>((Collection<String>)((Object)a_0.instance.a));
                this.a.a(arrayList);
                O.a(this.a);
                break;
            }
            case 47: {
                if (this.a == null) {
                    this.a = new k_0(this);
                }
                O.a(this.a);
                break;
            }
            case 50: {
                break;
            }
            case 51: {
                break;
            }
            case 52: {
                break;
            }
        }
    }

    private void a() {
        if (b_0.m) {
            if (a_0.instance.a != null) {
                for (int i2 = 0; i2 < a_0.instance.b.size(); ++i2) {
                    if (!a_0.instance.b.get((int)i2).a.equals(a_0.instance.a.e)) continue;
                    a_0.instance.b.remove(i2);
                    break;
                }
                a_0.instance.a.f();
                a_0.instance.a(a_0.instance.a);
            }
        } else if (Minecraft.getMinecraft().player != null) {
            k k2 = a_0.instance.a(Minecraft.getMinecraft().player.func_70005_c_(), false);
        }
        b_0.m = !b_0.m;
    }

    private void b() {
        switch (b_0.j) {
            case 0: {
                b_0.j = 1;
                a_0.instance.b = 60;
                a_0.instance.a = (long)(Double.valueOf(1000.0) / Double.valueOf(a_0.instance.b) * 1000000.0);
                a_0.instance.d();
                break;
            }
            case 1: {
                b_0.j = 2;
                a_0.instance.b = 60;
                a_0.instance.a = (long)(Double.valueOf(1000.0) / Double.valueOf(a_0.instance.b) * 1000000.0);
                a_0.instance.d();
                break;
            }
            default: {
                b_0.j = 0;
                a_0.instance.b = 30;
                a_0.instance.a = (long)(Double.valueOf(1000.0) / Double.valueOf(a_0.instance.b) * 1000000.0);
                a_0.instance.d();
            }
        }
    }

    public void initGui() {
        super.initGui();
        this.buttonList.add(new GuiButton(1, (int)((double)this.width * 0.89), (int)((double)this.height * 0.035), (int)((double)this.width * 0.05), 20, "X"));
        this.buttonList.add(new GuiButton(2, (int)((double)this.width * 0.82), (int)((double)this.height * 0.035), (int)((double)this.width * 0.05), 20, "?"));
        this.e = new GuiButton(3, (int)((double)this.width * 0.75), (int)((double)this.height * 0.035), (int)((double)this.width * 0.05), 20, "E");
        this.buttonList.add(this.e);
        this.a = new GuiButton(4, (int)((double)this.width * 0.68), (int)((double)this.height * 0.035), (int)((double)this.width * 0.05), 20, "F");
        this.buttonList.add(this.a);
        this.j = new GuiButton(44, (int)((double)this.width * 0.8), (int)((double)this.height * 0.15), (int)((double)this.width * 0.18), 20, new TextComponentTranslation("Gui.Main.Model", new Object[0]).func_150254_d());
        this.buttonList.add(this.j);
        this.k = new GuiButton(45, (int)((double)this.width * 0.8), (int)((double)this.height * 0.25), (int)((double)this.width * 0.18), 20, new TextComponentTranslation("Gui.Main.Animation", new Object[0]).func_150254_d());
        this.buttonList.add(this.k);
        this.buttonList.add(new GuiButton(54, (int)((double)this.width * 0.8), (int)((double)this.height * 0.35), (int)((double)this.width * 0.18), 20, new TextComponentTranslation("Gui.Gesture.Title", new Object[0]).func_150254_d()));
        this.buttonList.add(new GuiButton(47, (int)((double)this.width * 0.8), (int)((double)this.height * 0.45), (int)((double)this.width * 0.18), 20, new TextComponentTranslation("Gui.Main.Config", new Object[0]).func_150254_d()));
        this.buttonList.add(new GuiButton(49, (int)((double)this.width * 0.8), (int)((double)this.height * 0.55), (int)((double)this.width * 0.18), 20, new TextComponentTranslation("Debug", new Object[0]).func_150254_d()));
    }
}

