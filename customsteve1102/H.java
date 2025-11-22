/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  customsteve.a
 *  customsteve.aW
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.audio.SoundHandler
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
import customsteve.a;
import customsteve.aS;
import customsteve.aW;
import customsteve.ac;
import customsteve.aw;
import customsteve.aw_0;
import customsteve.b_0;
import customsteve.bc;
import customsteve.c_0;
import customsteve.i_0;
import customsteve.j_0;
import customsteve.k;
import customsteve.r_0;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.SoundHandler;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.util.text.TextComponentTranslation;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class H
extends i_0 {
    protected static final int a = 0;
    protected static final int b = 1;
    protected static final int c = 2;
    protected static final int d = 10;
    protected static final int e = 11;
    protected static final int f = 20;
    protected static final int g = 21;
    protected static final int h = 22;
    protected static final int i = 30;
    protected static final int j = 31;
    protected j_0 a;
    protected j_0 b;
    protected j_0 c;
    protected j_0 d;
    protected j_0 e;
    protected GuiTextField a;
    protected GuiTextField b;
    private r_0 a;
    private G a;

    public H(GuiScreen parent) {
        super(parent);
    }

    @Override
    public void drawScreen(int par1, int par2, float par3) {
        super.drawScreen(par1, par2, par3);
        GL11.glDisable((int)2929);
        if (b != 0) {
            GuiButton b2;
            b_0.z = this.c.a;
            String[] aniName = this.a.a();
            if (aniName == null || aniName[0].isEmpty() || b_0.i) {
                b2 = this.a(10);
                b2.enabled = false;
                b2 = this.a(11);
                b2.enabled = false;
            } else {
                b2 = this.a(10);
                b2.enabled = true;
                b2 = this.a(11);
                b2.enabled = true;
            }
            if (b_0.h && !b_0.g) {
                b2 = this.a(11);
                b2.visible = true;
            } else {
                b2 = this.a(11);
                b2.visible = false;
            }
            GuiButton syncButton = this.a(11);
            GuiButton b3 = null;
            switch (((bc.a)((Object)((a)customsteve.a.instance).a.a)).a) {
                case d: {
                    syncButton.displayString = new TextComponentTranslation("Gui.Animation.Waiting", new Object[0]).func_150254_d() + "...(" + ((a)customsteve.a.instance).a.a + ")";
                    b3 = this.a(10);
                    b3.enabled = false;
                    b3 = this.a(20);
                    b3.enabled = false;
                    b3 = this.a(11);
                    b3.enabled = false;
                    b3 = this.a(21);
                    b3.enabled = false;
                    break;
                }
                case b: {
                    syncButton.displayString = new TextComponentTranslation("Gui.Animation.Cancel", new Object[0]).func_150254_d() + " (" + ((a)customsteve.a.instance).a.a + ")";
                    b3 = this.a(10);
                    b3.enabled = false;
                    b3 = this.a(20);
                    b3.enabled = false;
                    b3 = this.a(11);
                    b3.enabled = true;
                    b3 = this.a(21);
                    b3.enabled = false;
                    break;
                }
                case a: {
                    syncButton.displayString = new TextComponentTranslation("Gui.Animation.SyncPlay", new Object[0]).func_150254_d();
                    if (aniName == null || aniName[0].isEmpty()) break;
                    b3 = this.a(10);
                    b3.enabled = true;
                    b3 = this.a(20);
                    b3.enabled = true;
                    b3 = this.a(11);
                    b3.enabled = true;
                    b3 = this.a(21);
                    b3.enabled = true;
                    break;
                }
                case e: {
                    if (((bc.a)((Object)((a)customsteve.a.instance).a.a)).e) {
                        b3 = this.a(10);
                        b3.enabled = false;
                        b3 = this.a(20);
                        b3.enabled = false;
                    } else {
                        b3 = this.a(10);
                        b3.enabled = true;
                        b3 = this.a(20);
                        b3.enabled = true;
                    }
                    b3 = this.a(11);
                    b3.enabled = false;
                    b3 = this.a(21);
                    b3.enabled = false;
                    if (((a)customsteve.a.instance).a != null && ((a)customsteve.a.instance).a.a != 0) {
                        syncButton.displayString = new TextComponentTranslation("Gui.Animation.Syncing", new Object[0]).func_150254_d() + "(" + ((a)customsteve.a.instance).a.a + ")";
                        break;
                    }
                    syncButton.displayString = new TextComponentTranslation("Gui.Animation.Playing", new Object[0]).func_150254_d() + "...";
                    break;
                }
                case c: {
                    if (((a)customsteve.a.instance).a != null) {
                        syncButton.displayString = new TextComponentTranslation("Gui.Animation.Join", new Object[0]).func_150254_d() + " (" + ((a)customsteve.a.instance).a.a + ")";
                    }
                    b3 = this.a(11);
                    b3.enabled = true;
                    b3 = this.a(21);
                    b3.enabled = false;
                    if (aniName == null || aniName[0].isEmpty()) break;
                    b3 = this.a(10);
                    b3.enabled = true;
                    b3 = this.a(20);
                    b3.enabled = true;
                    break;
                }
            }
            if (((bc.a)((Object)((a)customsteve.a.instance).a.a)).h) {
                b3 = this.a(10);
                b3.enabled = true;
                b3 = this.a(21);
                b3.enabled = false;
                b3 = this.a(20);
                b3.enabled = false;
            }
            if (b_0.i || b_0.j) {
                b3 = this.a(11);
                b3.enabled = false;
                b3 = this.a(10);
                b3.enabled = false;
                b3 = this.a(20);
                b3.enabled = false;
                b3 = this.a(21);
                b3.enabled = false;
                if (b_0.i) {
                    b3 = this.a(11);
                    b3.displayString = new TextComponentTranslation("Gui.Animation.Sending", new Object[0]).func_150254_d() + "...";
                } else if (b_0.j) {
                    b3 = this.a(10);
                    b3.displayString = new TextComponentTranslation("Gui.Animation.Sending", new Object[0]).func_150254_d() + "...";
                }
            } else if (((bc.a)((Object)((a)customsteve.a.instance).a.a)).h) {
                b3 = this.a(10);
                b3.displayString = new TextComponentTranslation("Gui.Animation.Stop", new Object[0]).func_150254_d();
            } else {
                b3 = this.a(10);
                b3.displayString = new TextComponentTranslation("Gui.Animation.Play", new Object[0]).func_150254_d();
            }
            this.a.a(par1, par2, par3, n == 3 ? -16777216 : -1);
            GL11.glDisable((int)2896);
            k csp = ((a)customsteve.a.instance).a;
            String ani = "";
            int nowP = 0;
            int maxK = 0;
            if (csp != null && csp.b(0) != null) {
                ani = csp.b((int)0).b;
                nowP = ((bc.a)((Object)csp.a)).e ? ((a)customsteve.a.instance).a : csp.a[csp.g];
                maxK = (int)((k)((Object)csp.a)).b((int)0).a;
            }
            this.func_73731_b(this.fontRenderer, "Animation: " + ani, (int)((double)this.width * 0.04), (int)((double)this.height * 0.08), 0xFFFFFF);
            this.func_73731_b(this.fontRenderer, "FrameStatus: " + nowP + "/" + maxK, (int)((double)this.width * 0.04), (int)((double)this.height * 0.12), 0xFFFFFF);
            this.func_73731_b(this.fontRenderer, "LostFrames: " + (int)(csp.n ? 1 : 0), (int)((double)this.width * 0.04), (int)((double)this.height * 0.16), 0xFFFFFF);
            this.func_73731_b(this.fontRenderer, "CorrectFrames: " + (int)(csp.m ? 1 : 0), (int)((double)this.width * 0.04), (int)((double)this.height * 0.2), 0xFFFFFF);
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
                    sb.append(new TextComponentTranslation("Gui.Animation.HelpTitle", new Object[0]).func_150254_d()).append('\n');
                    sb.append(new TextComponentTranslation("Gui.Animation.Help1", new Object[0]).func_150254_d()).append('\n');
                    sb.append(new TextComponentTranslation("Gui.Animation.Help2", new Object[0]).func_150254_d()).append('\n');
                    sb.append(new TextComponentTranslation("Gui.Animation.Help3", new Object[0]).func_150254_d()).append('\n');
                    sb.append(new TextComponentTranslation("Gui.Animation.Help4", new Object[0]).func_150254_d());
                    this.a = new G((GuiScreen)this, sb.toString());
                }
                H.a(this.a);
                break;
            }
            case 2: {
                customsteve.a.instance.d();
                break;
            }
            case 10: {
                String[] aniName = this.a.a();
                k csp = ((a)customsteve.a.instance).a;
                if (csp == null) break;
                if (((bc.a)((Object)csp.a)).h) {
                    aW packet = new aW(ModContainer.a.c, "", "", aw_0.a.b.a());
                    b_0.j = ModContainer.a.a(Minecraft.getMinecraft().player.connection.getNetworkManager(), (aS)packet);
                    if (b_0.l) {
                        b_0.l = false;
                        try {
                            SoundHandler sndManager = Minecraft.getMinecraft().getSoundHandler();
                            boolean mode = false;
                            sndManager.stopSounds();
                            customsteve.a.sndSystem.stop("CustomSteveBGM");
                        }
                        catch (Exception e1) {
                            e1.printStackTrace();
                        }
                    }
                    ((bc.a)((Object)csp.a)).c = true;
                    ((bc.a)((Object)csp.a)).a = false;
                    ((bc.a)((Object)csp.a)).h = false;
                    csp.g = null;
                    ((a)customsteve.a.instance).a = null;
                    csp.a(((ac)((Object)csp.a)).b + 1, 0);
                    break;
                }
                c_0.a = false;
                if (aniName == null || aniName[0].isEmpty()) break;
                if (b_0.h && !b_0.g) {
                    if (this.a.a) {
                        return;
                    }
                    aW packet = new aW(ModContainer.a.c, aniName[1], customsteve.a.instance.a(aniName[1]), aw_0.a.a.a());
                    if (b_0.k) {
                        packet.a = true;
                        packet.d = b_0.b;
                    }
                    b_0.j = ModContainer.a.a(Minecraft.getMinecraft().player.connection.getNetworkManager(), (aS)packet);
                    break;
                }
                ((bc.a)((Object)csp.a)).a = false;
                if (this.a.a) {
                    ((bc.a)((Object)csp.a)).a = true;
                }
                ((bc.a)((Object)csp.a)).c = false;
                csp.i = true;
                if (b_0.k) {
                    // empty if block
                }
                csp.c(aniName[1], 0);
                ((a)customsteve.a.instance).a = customsteve.a.instance.a(aniName[1].replace(".vmd", "") + "_Camera.vmd");
                if (!new aw().a((ac)((Object)csp.a), ((a)customsteve.a.instance).a)) {
                    ((a)customsteve.a.instance).a = null;
                }
                if (b_0.k) {
                    csp.a(0);
                }
                ((bc.a)((Object)csp.a)).h = true;
                if (!b_0.k) break;
                try {
                    SoundHandler sndManager = Minecraft.getMinecraft().getSoundHandler();
                    int mode = 0;
                    sndManager.stopSounds();
                    customsteve.a.sndSystem.stop("CustomSteveBGM");
                    customsteve.a.sndSystem.newStreamingSource(true, "CustomSteveBGM", new File(ModContainer.b + "/CustomSteve/BGM/" + b_0.b).toURI().toURL(), b_0.b, false, 0.0f, 0.0f, 0.0f, mode, 16.0f);
                    customsteve.a.sndSystem.setVolume("CustomSteveBGM", 1.0f);
                    b_0.l = true;
                }
                catch (Exception e1) {
                    e1.printStackTrace();
                }
                customsteve.a.sndSystem.play("CustomSteveBGM");
                break;
            }
            case 11: {
                String[] aniName1 = this.a.a();
                switch (((bc.a)((Object)((a)customsteve.a.instance).a.a)).a) {
                    case d: {
                        break;
                    }
                    case b: {
                        aW packet = new aW(ModContainer.a.c, "", "", aw_0.a.c.a());
                        packet.b = aw_0.b.c.a();
                        b_0.i = ModContainer.a.a(Minecraft.getMinecraft().player.connection.getNetworkManager(), (aS)packet);
                        break;
                    }
                    case a: {
                        if (aniName1 == null || aniName1[0].isEmpty()) break;
                        aW packet1 = new aW(ModContainer.a.c, aniName1[1], customsteve.a.instance.a(ModContainer.b + aniName1[1]), aw_0.a.c.a());
                        packet1.b = aw_0.b.a.a();
                        if (b_0.k && b_0.b != null && !b_0.b.isEmpty()) {
                            packet1.a = true;
                            packet1.d = b_0.b;
                        }
                        b_0.i = ModContainer.a.a(Minecraft.getMinecraft().player.connection.getNetworkManager(), (aS)packet1);
                        break;
                    }
                    case e: {
                        break;
                    }
                    case c: {
                        aW packet2 = new aW(ModContainer.a.c, "", "", aw_0.a.c.a());
                        packet2.b = aw_0.b.d.a();
                        b_0.i = ModContainer.a.a(Minecraft.getMinecraft().player.connection.getNetworkManager(), (aS)packet2);
                        break;
                    }
                }
                break;
            }
            case 21: {
                this.b.a();
                b_0.k = !b_0.k;
                break;
            }
            case 20: {
                this.a.a();
                ((bc.a)((Object)((a)customsteve.a.instance).a.a)).a = !((bc.a)((Object)((a)customsteve.a.instance).a.a)).a;
                break;
            }
            case 22: {
                this.c.a();
                b_0.z = this.c.a;
                break;
            }
            case 30: {
                this.a.setEnabled(this.d.a());
                break;
            }
            case 31: {
                this.b.setEnabled(this.e.a());
            }
        }
    }

    @Override
    protected void mouseClicked(int par1, int par2, int par3) throws IOException {
        if (b != 0 && this.a == 0 && par1 >= this.a.e && par2 >= this.a.b && par2 <= this.a.c) {
            this.a.a(par1, par2, par3 + 1);
            this.a = 0;
            return;
        }
        super.mouseClicked(par1, par2, par3);
    }

    @Override
    protected void keyTyped(char par1, int par2) throws IOException {
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

    public void initGui() {
        super.initGui();
        Keyboard.enableRepeatEvents((boolean)true);
        this.buttonList.add(new GuiButton(0, (int)((double)this.width * 0.89), (int)((double)this.height * 0.035), (int)((double)this.width * 0.05), 20, "\u2190"));
        this.buttonList.add(new GuiButton(1, (int)((double)this.width * 0.82), (int)((double)this.height * 0.035), (int)((double)this.width * 0.05), 20, "?"));
        this.buttonList.add(new GuiButton(2, (int)((double)this.width * 0.75), (int)((double)this.height * 0.035), (int)((double)this.width * 0.05), 20, "R"));
        this.b = new j_0(21, (int)((double)this.width * 0.75), (int)((double)this.height * 0.66), 20, 20, new TextComponentTranslation("Gui.Animation.BGM", new Object[0]).func_150254_d(), b_0.k);
        this.buttonList.add(this.b);
        this.a = new j_0(20, (int)((double)this.width * 0.87), (int)((double)this.height * 0.66), 20, 20, new TextComponentTranslation("Gui.Animation.Loop", new Object[0]).func_150254_d(), ((bc.a)((Object)((a)customsteve.a.instance).a.a)).a);
        this.buttonList.add(this.a);
        this.c = new j_0(22, (int)((double)this.width * 0.87), (int)((double)this.height * 0.72), 20, 20, new TextComponentTranslation("Gui.Animation.Lock", new Object[0]).func_150254_d(), b_0.z);
        this.buttonList.add(this.c);
        this.buttonList.add(new GuiButton(10, (int)((double)this.width * 0.75), (int)((double)this.height * 0.78), (int)((double)this.width * 0.246), 20, new TextComponentTranslation("Gui.Animation.Play", new Object[0]).func_150254_d()));
        this.buttonList.add(new GuiButton(11, (int)((double)this.width * 0.75), (int)((double)this.height * 0.86), (int)((double)this.width * 0.246), 20, new TextComponentTranslation("Gui.Animation.SyncPlay", new Object[0]).func_150254_d()));
        this.c.a = false;
        this.c.visible = false;
        k csp = ((a)customsteve.a.instance).a;
        if (csp != null) {
            String path = "CustomSteve/Animations/";
            ArrayList list = customsteve.a.instance.a(path, ".vmd", 0, "(p)");
            path = "CustomSteve/Animations/" + csp.b();
            list.addAll(customsteve.a.instance.a(path, ".vmd", 0, ""));
            this.a = new r_0(this, this.mc, (int)((double)this.width * 0.23), (int)((double)this.height * 0.5), (int)((double)this.width * 0.75), (int)((double)this.height * 0.15), 12, list);
        }
    }
}

