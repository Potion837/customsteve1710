/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.GuiButton
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.gui.GuiTextField
 *  net.minecraft.util.text.TextComponentTranslation
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.opengl.GL11
 */
package customsteve;

import customsteve.G;
import customsteve.ModContainer;
import customsteve.N;
import customsteve.aV;
import customsteve.a_0;
import customsteve.ac;
import customsteve.ap_0;
import customsteve.b_0;
import customsteve.i_0;
import customsteve.j_0;
import customsteve.k;
import customsteve.l;
import customsteve.r_0;
import java.io.IOException;
import java.util.ArrayList;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.util.text.TextComponentTranslation;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class P
extends i_0 {
    private static boolean c = false;
    protected static final int a = 0;
    protected static final int b = 1;
    protected static final int c = 2;
    protected static final int d = 11;
    protected static final int e = 20;
    protected GuiButton a;
    protected j_0 a;
    protected GuiTextField a;
    private N a;
    private r_0 a;
    private G a;
    private String a = null;
    private String b;
    private String c;
    private String d;
    private boolean d = false;
    private static String e;

    public P(GuiScreen parent) {
        super(parent);
    }

    @Override
    public void drawScreen(int par1, int par2, float par3) {
        super.drawScreen(par1, par2, par3);
        GL11.glDisable((int)2929);
        if (b != 0) {
            if (!this.c.equals(ModContainer.a.b) || !this.d.equals(ModContainer.a.a)) {
                this.func_73732_a(this.fontRenderer, e, (int)((double)this.width * 0.5), (int)((double)this.height * 0.05), 0xFFFFFF);
            }
            this.a.a(par1, par2, par3, n == 3 ? -16777216 : -1);
            GL11.glDisable((int)2896);
            this.a.drawTextBox();
        }
        GL11.glEnable((int)2929);
    }

    protected void actionPerformed(GuiButton par1GuiButton) {
        this.a = 1;
        switch (par1GuiButton.id) {
            case 0: {
                if (this.c != null) {
                    if (c) {
                        c = false;
                        P.a(this.c, this.d);
                    }
                }
                P.a((GuiScreen)this.a);
                break;
            }
            case 1: {
                if (this.a == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(new TextComponentTranslation("Gui.Model.HelpTitle", new Object[0]).func_150254_d()).append('\n');
                    sb.append(new TextComponentTranslation("Gui.Model.Help1", new Object[0]).func_150254_d()).append('\n');
                    sb.append(new TextComponentTranslation("Gui.Model.Help2", new Object[0]).func_150254_d()).append('\n');
                    sb.append(new TextComponentTranslation("Gui.Model.Help3", new Object[0]).func_150254_d()).append('\n');
                    sb.append(new TextComponentTranslation("Gui.Model.Help4", new Object[0]).func_150254_d());
                    this.a = new G((GuiScreen)this, sb.toString());
                }
                P.a(this.a);
                break;
            }
            case 2: {
                if (this.a == null) {
                    this.a = new N(this);
                }
                this.a.a((ac)((Object)a_0.instance.a.a));
                P.a(this.a);
                break;
            }
            case 11: {
                String modelName = this.a.a()[0];
                if (modelName == null) {
                    modelName = ModContainer.a.b;
                }
                if (!this.c.equals(ModContainer.a.b) || !this.d.equals(ModContainer.a.a)) {
                    l cspMP;
                    c = false;
                    if (b_0.h && !b_0.g && (cspMP = new l(a_0.instance.a.e, b_0.g)) != null) {
                        try {
                            cspMP.c = modelName;
                            cspMP.a = new float[]{1.0f, 1.0f, 1.0f};
                            cspMP.b = a_0.instance.a(ModContainer.b + "/" + "CustomSteve/models/" + modelName + "/");
                            aV packet = new aV(cspMP.a(), aV.a.c);
                            ModContainer.a.a(Minecraft.getMinecraft().player.connection.getNetworkManager(), packet);
                        }
                        catch (IOException e2) {
                            e2.printStackTrace();
                        }
                    }
                }
                this.c = modelName;
                this.d = this.a.getText();
                this.d = this.a.a;
                this.a.enabled = false;
                break;
            }
            case 20: {
                this.a.setEnabled(this.a.a());
                if (this.a.a) break;
                this.a = this.a.getText();
                this.a.setText(this.b);
                String modelName2 = this.a.a()[0];
                if (modelName2 == null) {
                    modelName2 = ModContainer.a.b;
                }
                if (this.a.getText().equals(this.a)) break;
                this.a.enabled = true;
                P.a(modelName2, this.a.getText());
            }
        }
    }

    public static void a(String model, String texture) {
        k csp = a_0.instance.a;
        ap_0 loc = new ap_0(csp.a);
        k rcscp = new k(a_0.instance.a.e, model);
        if (!ModContainer.a.b.equals(model)) {
            c = true;
        }
        ModContainer.a.b = model;
        ModContainer.a.a = texture;
        rcscp.b = texture;
        rcscp.c = rcscp.a.substring(0, rcscp.a.length() - 4) + "/";
        a_0.instance.a(a_0.instance.a, rcscp, false);
        a_0.instance.a = rcscp;
    }

    @Override
    protected void mouseClicked(int par1, int par2, int par3) throws IOException {
        if (b != 0) {
            if (this.a == 0 && par1 >= this.a.e && par2 >= this.a.b && par2 <= this.a.c) {
                String textureName;
                this.a.a(par1, par2, par3 + 1);
                String modelName = this.a.a()[0];
                if (modelName == null) {
                    modelName = this.c;
                    textureName = this.d;
                    this.b = this.d;
                    this.a.enabled = false;
                    this.a.a = this.d;
                } else {
                    this.b = textureName = modelName.substring(0, modelName.lastIndexOf(46));
                }
                if (!modelName.equals(ModContainer.a.b)) {
                    if (!this.a.a) {
                        this.a.setText(textureName);
                    }
                    P.a(modelName, this.a.getText());
                    this.a.enabled = true;
                }
                this.a = 0;
                return;
            }
            boolean b2 = this.a.isFocused();
            this.a.func_146192_a(par1, par2, par3);
            if (this.a.isFocused()) {
                this.a = this.a.getText();
                this.a = 1;
            } else if (b2 && !this.a.isFocused() && this.a != null && !this.a.equals(this.a.getText())) {
                String modelName = this.a.a()[0];
                if (modelName == null) {
                    modelName = this.c;
                }
                this.a.enabled = true;
                P.a(modelName, this.a.getText());
            }
        }
        super.mouseClicked(par1, par2, par3);
    }

    @Override
    protected void keyTyped(char par1, int par2) throws IOException {
        if (this.a.textboxKeyTyped(par1, par2)) {
            return;
        }
        super.keyTyped(par1, par2);
    }

    @Override
    protected void mouseReleased(int par1, int par2, int par3) {
        if (par3 != -1) {
            this.a.b(par1, par2, par3 + 1);
        }
        super.mouseReleased(par1, par2, par3);
    }

    @Override
    protected void a(int mX, int mY, int d2) {
        if (d2 != 0) {
            if (b != 0 && mX >= this.a.e && mY >= this.a.b && mY <= this.a.c) {
                if (d2 != 0) {
                    if (d2 > 0) {
                        d2 = -1;
                    } else if (d2 < 0) {
                        d2 = 1;
                    }
                    this.a.a += (float)(d2 * this.a.f / 2);
                }
            } else {
                super.a(mX, mY, d2);
            }
        }
    }

    @Override
    public void onGuiClosed() {
        if (this.c != null) {
            if (c) {
                c = false;
                P.a(this.c, this.d);
            }
        }
        super.onGuiClosed();
    }

    public void initGui() {
        super.initGui();
        Keyboard.enableRepeatEvents((boolean)true);
        this.buttonList.add(new GuiButton(0, (int)((double)this.width * 0.89), (int)((double)this.height * 0.035), (int)((double)this.width * 0.05), 20, "\u2190"));
        this.buttonList.add(new GuiButton(1, (int)((double)this.width * 0.82), (int)((double)this.height * 0.035), (int)((double)this.width * 0.05), 20, "?"));
        this.buttonList.add(new GuiButton(2, (int)((double)this.width * 0.75), (int)((double)this.height * 0.035), (int)((double)this.width * 0.05), 20, "i"));
        this.a = new GuiButton(11, (int)((double)this.width * 0.87), (int)((double)this.height * 0.9), (int)((double)this.width * 0.12), 20, new TextComponentTranslation("Gui.Model.Select", new Object[0]).func_150254_d());
        this.buttonList.add(this.a);
        this.a.enabled = false;
        this.a = new j_0(20, (int)((double)this.width * 0.7), (int)((double)this.height * 0.68), 20, 20, new TextComponentTranslation("Gui.Model.Custom", new Object[0]).func_150254_d(), false);
        this.buttonList.add(this.a);
        this.a = new GuiTextField(0, this.fontRenderer, (int)((double)this.width * 0.7), (int)((double)this.height * 0.79), (int)((double)this.width * 0.29), 20);
        this.a.setMaxStringLength(64);
        this.a.setFocused(false);
        this.a.setEnabled(false);
        ArrayList<String[]> arrayList = a_0.instance.a(ModContainer.b + "/CustomSteve/models", ".pmd", ".pmx");
        String modelName = "";
        try {
            modelName = ModContainer.a.b.substring(0, ModContainer.a.b.length() - 4);
        }
        catch (StringIndexOutOfBoundsException e2) {
            e2.printStackTrace();
        }
        int i2 = -1;
        for (int j2 = 0; j2 < arrayList.size(); ++j2) {
            if (!arrayList.get(j2)[0].equals(ModContainer.a.b)) continue;
            i2 = j2;
            break;
        }
        this.a = new r_0(this, this.mc, (int)((double)this.width * 0.23), (int)((double)this.height * 0.5), (int)((double)this.width * 0.75), (int)((double)this.height * 0.15), 12, a_0.instance.a(ModContainer.b + "/" + "CustomSteve/models", ".pmd", ".pmx"));
        if (i2 != -1) {
            this.a.a(i2);
        }
        this.a.setText(ModContainer.a.a);
        this.b = modelName;
        if (!modelName.equals(ModContainer.a.a)) {
            // empty if block
        }
        this.c = ModContainer.a.b;
        this.d = ModContainer.a.a;
        e = new TextComponentTranslation("Gui.Model.Preview", new Object[0]).func_150254_d();
    }
}

