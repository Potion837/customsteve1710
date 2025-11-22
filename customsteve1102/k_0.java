/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.GuiButton
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.gui.GuiTextField
 *  net.minecraft.util.text.ITextComponent
 *  net.minecraft.util.text.TextComponentTranslation
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.opengl.GL11
 */
package customsteve;

import customsteve.G;
import customsteve.ModContainer;
import customsteve.P;
import customsteve.a_0;
import customsteve.ap_0;
import customsteve.b_0;
import customsteve.i_0;
import customsteve.j_0;
import customsteve.jni.CS_Bullet;
import customsteve.k;
import java.io.IOException;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

/*
 * Renamed from customsteve.K
 * Duplicate member names - consider using --renamedupmembers true
 */
public class k_0
extends i_0 {
    protected static final int a = 0;
    protected static final int b = 1;
    protected static final int c = 10;
    protected static final int d = 11;
    protected static final int e = 12;
    protected static final int f = 13;
    protected static final int g = 14;
    protected static final int h = 15;
    protected j_0 a;
    protected j_0 b;
    protected j_0 c;
    protected GuiTextField a;
    protected GuiTextField b;
    protected GuiTextField c;
    private G a;

    public k_0(GuiScreen parent) {
        super(parent);
    }

    @Override
    public void drawScreen(int par1, int par2, float par3) {
        super.drawScreen(par1, par2, par3);
        GL11.glDisable((int)2929);
        if (b != 0) {
            GL11.glDisable((int)2896);
            this.func_73731_b(this.fontRenderer, new TextComponentTranslation("Gui.Config.SizeTitle", new Object[0]).func_150254_d(), (int)((double)this.width * 0.79), (int)((double)this.height * 0.12), 0xFFFFFF);
            this.func_73731_b(this.fontRenderer, new TextComponentTranslation("Gui.Config.SpeedTitle", new Object[0]).func_150254_d(), (int)((double)this.width * 0.79), (int)((double)this.height * 0.25), 0xFFFFFF);
            this.func_73731_b(this.fontRenderer, new TextComponentTranslation("Gui.Config.BGMtitle", new Object[0]).func_150254_d(), (int)((double)this.width * 0.79), (int)((double)this.height * 0.38), 0xFFFFFF);
            this.a.drawTextBox();
            this.b.drawTextBox();
            this.c.drawTextBox();
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
                break;
            }
            case 10: {
                this.b();
                break;
            }
            case 15: {
                b_0.r = !b_0.r;
                new TextComponentTranslation("Gui.Config.drawFirstPersonOff", new Object[0]).func_150254_d();
                this.a((int)15).displayString = b_0.r ? new TextComponentTranslation("Gui.Config.drawFirstPersonOff", new Object[0]).func_150254_d() : new TextComponentTranslation("Gui.Config.drawFirstPersonOn", new Object[0]).func_150254_d();
                break;
            }
            case 14: {
                if (++b_0.a > 2) {
                    b_0.a = 0;
                }
                this.a((int)14).displayString = b_0.a == 0 ? new TextComponentTranslation("Gui.Config.AutoSwitchOff", new Object[0]).func_150254_d() : (b_0.a == 1 ? new TextComponentTranslation("Gui.Config.AutoSwitch1", new Object[0]).func_150254_d() : new TextComponentTranslation("Gui.Config.AutoSwitch2", new Object[0]).func_150254_d());
                break;
            }
            case 11: {
                b_0.e = !b_0.e;
                this.a((int)11).displayString = b_0.e ? new TextComponentTranslation("Gui.Config.ReloadTurnOff", new Object[0]).func_150254_d() : new TextComponentTranslation("Gui.Config.ReloadTurnOn", new Object[0]).func_150254_d();
                break;
            }
            case 13: {
                this.a();
                break;
            }
            case 12: {
                String status;
                String[] s;
                if (this.a.getText() != null && !this.a.getText().equals("") && (s = (status = this.a.getText()).split(","))[0] != null && !s[0].equals("")) {
                    b_0.b = s.length > 2 && s[1] != null && s[2] != null && !s[1].equals("") && s[2] != null && !s[2].equals("") ? new ap_0(Float.parseFloat(s[0]), Float.parseFloat(s[1]), Float.parseFloat(s[2])) : new ap_0(Float.parseFloat(s[0]), Float.parseFloat(s[0]), Float.parseFloat(s[0]));
                }
                if (this.b.getText() != null && !this.b.getText().equals("")) {
                    try {
                        b_0.a = Float.parseFloat(this.b.getText());
                    }
                    catch (Exception e2) {
                        b_0.a = 1.0f;
                        e2.printStackTrace();
                    }
                }
                b_0.b = this.c.getText();
                ModContainer.a.saveMyConfig();
                this.mc.player.sendMessage((ITextComponent)new TextComponentTranslation("Gui.Config.Saved", new Object[0]));
                this.mc.displayGuiScreen((GuiScreen)this.a);
            }
        }
    }

    @Override
    protected void mouseClicked(int par1, int par2, int par3) throws IOException {
        if (b != 0) {
            this.a.func_146192_a(par1, par2, par3);
            this.b.func_146192_a(par1, par2, par3);
            this.c.func_146192_a(par1, par2, par3);
        }
        super.mouseClicked(par1, par2, par3);
    }

    @Override
    protected void keyTyped(char par1, int par2) throws IOException {
        if (this.a.isFocused() || this.b.isFocused()) {
            if (par2 == 203 || par2 == 205 || par2 == 211 || par2 == 14 || par2 == 52 || par2 == 51 || par1 >= '0' && par1 <= '9') {
                this.a.textboxKeyTyped(par1, par2);
            }
            if (par2 == 203 || par2 == 205 || par2 == 211 || par2 == 14 || par2 == 52 || par1 >= '0' && par1 <= '9') {
                this.b.textboxKeyTyped(par1, par2);
            }
        }
        this.c.textboxKeyTyped(par1, par2);
        if (!(this.a.isFocused() || this.b.isFocused() || this.c.isFocused())) {
            super.keyTyped(par1, par2);
        }
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
        String model = ModContainer.a.b;
        String texture = ModContainer.a.a;
        ModContainer.a.loadMyConfig();
        this.a((int)10).enabled = CS_Bullet.a;
        this.a((int)11).enabled = b_0.d;
        this.a((int)10).displayString = b_0.d ? new TextComponentTranslation("Gui.Config.PhysicsTurnOff", new Object[0]).func_150254_d() : new TextComponentTranslation("Gui.Config.PhysicsTurnOn", new Object[0]).func_150254_d();
        this.a((int)11).displayString = b_0.e ? new TextComponentTranslation("Gui.Config.ReloadTurnOff", new Object[0]).func_150254_d() : new TextComponentTranslation("Gui.Config.ReloadTurnOn", new Object[0]).func_150254_d();
        this.a((int)14).displayString = b_0.a == 0 ? new TextComponentTranslation("Gui.Config.AutoSwitchOff", new Object[0]).func_150254_d() : (b_0.a == 1 ? new TextComponentTranslation("Gui.Config.AutoSwitch1", new Object[0]).func_150254_d() : new TextComponentTranslation("Gui.Config.AutoSwitch2", new Object[0]).func_150254_d());
        String string = this.a((int)15).displayString = b_0.r ? new TextComponentTranslation("Gui.Config.drawFirstPersonOff", new Object[0]).func_150254_d() : new TextComponentTranslation("Gui.Config.drawFirstPersonOn", new Object[0]).func_150254_d();
        if (!model.equals(ModContainer.a.b) || !texture.equals(ModContainer.a.a)) {
            P.a(ModContainer.a.b, ModContainer.a.a);
        }
        if (b_0.d) {
            if (b_0.d != b_0.c) {
                this.b();
                b_0.c = true;
            }
            b_0.d = false;
        } else if (b_0.d != b_0.c) {
            this.b();
            b_0.c = false;
        }
        this.mc.player.sendMessage((ITextComponent)new TextComponentTranslation("Gui.Config.Loaded", new Object[0]));
    }

    public void b() {
        if (!b_0.c) {
            a_0.instance.a.f();
        } else {
            b_0.b = 0L;
            k csp = a_0.instance.a;
            if (csp != null) {
                // empty if block
            }
        }
        b_0.c = !b_0.c;
        this.a((int)10).displayString = b_0.c ? new TextComponentTranslation("Gui.Config.PhysicsTurnOff", new Object[0]).func_150254_d() : new TextComponentTranslation("Gui.Config.PhysicsTurnOn", new Object[0]).func_150254_d();
        this.a((int)11).enabled = b_0.c;
        if (!b_0.c) {
            b_0.e = false;
            this.a((int)11).displayString = new TextComponentTranslation("Gui.Config.ReloadTurnOn", new Object[0]).func_150254_d();
        }
    }

    public void initGui() {
        super.initGui();
        Keyboard.enableRepeatEvents((boolean)true);
        this.a = new GuiTextField(0, this.fontRenderer, (int)((double)this.width * 0.79), (int)((double)this.height * 0.16), (int)((double)this.width * 0.2), 20);
        this.a.setMaxStringLength(128);
        this.a.setFocused(false);
        this.a.setEnabled(true);
        if (b_0.b != null) {
            this.a.setText(b_0.b.a + "," + b_0.b.b + "," + b_0.b.c);
        } else {
            this.a.setText("1.0,1.0,1.0");
        }
        this.b = new GuiTextField(1, this.fontRenderer, (int)((double)this.width * 0.79), (int)((double)this.height * 0.29), (int)((double)this.width * 0.2), 20);
        this.b.setMaxStringLength(128);
        this.b.setFocused(false);
        this.b.setEnabled(true);
        if (b_0.a > 0.0f) {
            this.b.setText(b_0.a + "");
        } else {
            this.b.setText("1.0");
        }
        this.c = new GuiTextField(2, this.fontRenderer, (int)((double)this.width * 0.79), (int)((double)this.height * 0.42), (int)((double)this.width * 0.2), 20);
        this.c.setMaxStringLength(128);
        this.c.setFocused(false);
        this.c.setEnabled(true);
        this.c.setText(b_0.b);
        this.buttonList.add(new GuiButton(0, (int)((double)this.width * 0.89), (int)((double)this.height * 0.035), (int)((double)this.width * 0.05), 20, "\u2190"));
        this.buttonList.add(new GuiButton(1, (int)((double)this.width * 0.82), (int)((double)this.height * 0.035), (int)((double)this.width * 0.05), 20, "?"));
        this.buttonList.add(new GuiButton(10, (int)((double)this.width * 0.8), (int)((double)this.height * 0.51), (int)((double)this.width * 0.18), 20, b_0.c || b_0.d ? new TextComponentTranslation("Gui.Config.PhysicsTurnOff", new Object[0]).func_150254_d() : new TextComponentTranslation("Gui.Config.PhysicsTurnOn", new Object[0]).func_150254_d()));
        this.buttonList.add(new GuiButton(11, (int)((double)this.width * 0.8), (int)((double)this.height * 0.58), (int)((double)this.width * 0.18), 20, b_0.e ? new TextComponentTranslation("Gui.Config.ReloadTurnOff", new Object[0]).func_150254_d() : new TextComponentTranslation("Gui.Config.ReloadTurnOn", new Object[0]).func_150254_d()));
        this.buttonList.add(new GuiButton(14, (int)((double)this.width * 0.8), (int)((double)this.height * 0.65), (int)((double)this.width * 0.18), 20, b_0.a == 0 ? new TextComponentTranslation("Gui.Config.AutoSwitchOff", new Object[0]).func_150254_d() : (b_0.a == 1 ? new TextComponentTranslation("Gui.Config.AutoSwitch1", new Object[0]).func_150254_d() : new TextComponentTranslation("Gui.Config.AutoSwitch2", new Object[0]).func_150254_d())));
        this.buttonList.add(new GuiButton(15, (int)((double)this.width * 0.8), (int)((double)this.height * 0.72), (int)((double)this.width * 0.18), 20, b_0.r ? new TextComponentTranslation("Gui.Config.drawFirstPersonOff", new Object[0]).func_150254_d() : new TextComponentTranslation("Gui.Config.drawFirstPersonOn", new Object[0]).func_150254_d()));
        this.buttonList.add(new GuiButton(12, (int)((double)this.width * 0.79), (int)((double)this.height * 0.82), (int)((double)this.width * 0.1), 20, new TextComponentTranslation("Gui.Config.SaveSetting", new Object[0]).func_150254_d()));
        this.buttonList.add(new GuiButton(13, (int)((double)this.width * 0.89), (int)((double)this.height * 0.82), (int)((double)this.width * 0.1), 20, new TextComponentTranslation("Gui.Config.LoadSetting", new Object[0]).func_150254_d()));
        this.a((int)11).enabled = b_0.c;
        k csp = a_0.instance.a;
        if (csp != null) {
            // empty if block
        }
    }
}

