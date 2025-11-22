/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.client.gui.GuiButton
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraft.client.renderer.OpenGlHelper
 *  net.minecraft.client.renderer.RenderHelper
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.util.text.TextComponentTranslation
 *  net.minecraftforge.client.event.GuiOpenEvent
 *  net.minecraftforge.common.MinecraftForge
 *  net.minecraftforge.fml.common.eventhandler.Event
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.GL11
 */
package customsteve;

import customsteve.E;
import customsteve.F;
import customsteve.ModContainer;
import customsteve.a_0;
import customsteve.ac;
import customsteve.b_0;
import customsteve.bc;
import customsteve.k;
import customsteve.t_0;
import java.io.IOException;
import java.text.DecimalFormat;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.Event;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from customsteve.I
 */
public abstract class i_0
extends GuiScreen {
    protected final GuiScreen a;
    protected static F a = F.a;
    private static float a = 0.0f;
    private static float b = 0.0f;
    private static float c = 1.0f;
    private static final float d = 0.3f;
    private static final float e = 10.0f;
    private static int a = 0;
    private static int b = 0;
    private int c;
    private int d;
    private int e;
    private int f;
    protected int k = -1;
    protected int l = -1;
    protected int m = 0;
    protected boolean a = false;
    private static boolean c = true;
    protected static boolean b = true;
    protected static int n;
    private static int g;
    private static int h;
    private static int i;
    private static int j;
    private static String a;
    private static String b;
    private static String c;
    private static String d;
    private static String e;
    private static String f;
    private static String g;
    private static String h;

    public i_0(GuiScreen parent) {
        this.a = parent;
    }

    public void drawScreen(int par1, int par2, float par3) {
        this.a();
        this.c = (int)((double)this.width * -0.5 * (double)c);
        this.d = (int)((double)this.width * 0.5 * (double)c);
        this.e = (int)((double)this.height * -0.6 * (double)c);
        this.f = (int)((double)this.height * 0.6 * (double)c);
        this.a(par1, par2, Mouse.getDWheel());
        this.b();
        GL11.glDisable((int)2929);
        if (b) {
            super.drawScreen(par1, par2, par3);
            DecimalFormat df = new DecimalFormat("#.##");
            this.func_73731_b(this.fontRenderer, "FPS:" + df.format(b_0.b) + (b_0.j == 1 ? "(original)" : (b_0.j == 2 ? "(extend)" : "")) + " " + "Calc: " + (b_0.a == 0L ? "<1" : Long.valueOf(b_0.a)) + "ms" + " Physics: " + b_0.b + "ms" + (b_0.f ? (b_0.n ? " MTVT: " : " VT: ") + b_0.c + "ms" : ""), (int)((double)this.width * 0.04), this.height * 0, 0xFFFF00);
            this.func_73731_b(this.fontRenderer, (b_0.h ? "Online" : "Offline") + (b_0.g ? "(Guest)" : "(User)"), (int)((double)this.width * 0.04), (int)((double)this.height * 0.04), b_0.h ? 65280 : 0xFFFF00);
            this.func_73731_b(this.fontRenderer, a, (int)((double)this.width * 0.04), (int)((double)this.height * 0.65), 0xFF0000);
            this.func_73731_b(this.fontRenderer, b, (int)((double)this.width * 0.04), (int)((double)this.height * 0.7), 0xFF0000);
            this.func_73731_b(this.fontRenderer, c, (int)((double)this.width * 0.04), (int)((double)this.height * 0.75), 0xFF0000);
            this.func_73731_b(this.fontRenderer, d, (int)((double)this.width * 0.04), (int)((double)this.height * 0.8), j);
            this.func_73731_b(this.fontRenderer, e, (int)((double)this.width * 0.04), (int)((double)this.height * 0.85), j);
            this.func_73731_b(this.fontRenderer, f, (int)((double)this.width * 0.04), (int)((double)this.height * 0.9), j);
            if (c) {
                this.func_73731_b(this.fontRenderer, g, (int)((double)this.width * 0.04), (int)((double)this.height * 0.95), j);
            } else {
                this.func_73731_b(this.fontRenderer, h, (int)((double)this.width * 0.04), (int)((double)this.height * 0.95), j);
            }
        }
        GL11.glEnable((int)2929);
    }

    private void a() {
        this.func_73733_a(-1, -1, 1, 1, 0, 0);
        j = 0xFFFFFF;
        switch (n) {
            case 0: {
                this.drawDefaultBackground();
                break;
            }
            case 1: {
                this.a(field_110325_k);
                break;
            }
            case 2: {
                this.func_73733_a(0, 0, this.width, this.height, -16777216, -16777216);
                break;
            }
            case 3: {
                this.func_73733_a(0, 0, this.width, this.height, -1, -1);
                j = 0xFF0000;
                break;
            }
        }
    }

    private void a(ResourceLocation texture) {
        GL11.glDisable((int)2896);
        GL11.glDisable((int)2912);
        this.mc.getTextureManager().bindTexture(texture);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        float f2 = 32.0f;
        GL11.glBegin((int)7);
        int j2 = 64;
        int k2 = 64;
        int l2 = 64;
        GL11.glColor4f((float)((float)j2 / 255.0f), (float)((float)k2 / 255.0f), (float)((float)l2 / 255.0f), (float)255.0f);
        GL11.glTexCoord2d((double)0.0, (double)((float)this.height / f2 + 0.0f));
        GL11.glVertex3d((double)0.0, (double)this.height, (double)0.0);
        GL11.glTexCoord2d((double)((float)this.width / f2), (double)((float)this.height / f2 + 0.0f));
        GL11.glVertex3d((double)this.width, (double)this.height, (double)0.0);
        GL11.glTexCoord2d((double)((float)this.width / f2), (double)0.0);
        GL11.glVertex3d((double)this.width, (double)0.0, (double)0.0);
        GL11.glTexCoord2d((double)0.0, (double)0.0);
        GL11.glVertex3d((double)0.0, (double)0.0, (double)0.0);
        GL11.glEnd();
    }

    private void b() {
        if (b_0.m) {
            E.a = true;
            int posX = this.width / 2;
            int posY = (int)((double)this.height * 0.95);
            int scaleRatio = 100;
            GL11.glPushMatrix();
            EntityPlayerSP entity = this.mc.player;
            a.a(posX, posY, a, b, a, b, (float)scaleRatio * c);
            GL11.glEnable((int)2903);
            float f2 = entity.renderYawOffset;
            float f3 = entity.field_70177_z;
            float f4 = entity.field_70125_A;
            float f5 = entity.prevRotationYawHead;
            float f6 = entity.rotationYawHead;
            GL11.glRotatef((float)135.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            RenderHelper.enableStandardItemLighting();
            GL11.glRotatef((float)-135.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            entity.renderYawOffset = 0.0f;
            entity.field_70177_z = 0.0f;
            entity.field_70125_A = 0.0f;
            entity.rotationYawHead = 0.0f;
            entity.prevRotationYawHead = 0.0f;
            Minecraft.getMinecraft().getRenderManager().playerViewY = 180.0f;
            a.a(this.width, this.height);
            k csp = a_0.instance.a((EntityLivingBase)Minecraft.getMinecraft().player, ModContainer.a.c, false);
            if (csp != null && !((bc.a)((Object)csp.a)).f) {
                String path = "CustomSteve/Animations/" + csp.b() + "/";
                ((bc.a)((Object)csp.a)).c = false;
                csp.k = false;
                if (csp.a != null) {
                    if (csp.b() >= ((ac)((Object)csp.a)).b && ((bc.a)((Object)csp.a)).a) {
                        csp.c(csp.f, 0);
                    }
                    csp.b(path + "stand.vmd", 0);
                }
                Minecraft.getMinecraft().getRenderManager().renderEntity((Entity)entity, 0.0, 1.61, 0.0, 0.0f, 1.0f, false);
            }
            a.a();
            entity.renderYawOffset = f2;
            entity.field_70177_z = f3;
            entity.field_70125_A = f4;
            entity.prevRotationYawHead = f5;
            entity.rotationYawHead = f6;
            GL11.glPopMatrix();
            RenderHelper.disableStandardItemLighting();
            GL11.glDisable((int)32826);
            OpenGlHelper.setActiveTexture((int)OpenGlHelper.lightmapTexUnit);
            GL11.glDisable((int)3553);
            OpenGlHelper.setActiveTexture((int)OpenGlHelper.defaultTexUnit);
            E.a = false;
        }
    }

    protected void mouseClicked(int par1, int par2, int par3) throws IOException {
        if (b) {
            super.mouseClicked(par1, par2, par3);
        }
        if (!this.a) {
            this.k = par1;
            this.l = par2;
            this.m |= par3 + 1;
        }
        this.a = false;
    }

    protected void mouseReleased(int par1, int par2, int par3) {
        if (this.m == 0 || par3 == -1) {
            super.mouseReleased(par1, par2, par3);
        } else {
            this.m ^= par3 + 1;
        }
    }

    protected void mouseClickMove(int par1, int par2, int par3, long par4) {
        if (this.m > 0) {
            int dX = par1 - this.k;
            int dY = par2 - this.l;
            this.k = par1;
            this.l = par2;
            switch (this.m) {
                case 2: {
                    this.a(dX, dY);
                    break;
                }
                case 3: {
                    b -= (float)dY;
                }
                case 1: {
                    a += (float)dX;
                }
            }
        }
    }

    public GuiScreen a() {
        a = new TextComponentTranslation("Gui.Main.ShowInterface", new Object[]{0}).func_150254_d();
        b = new TextComponentTranslation("Gui.Main.SmartZoom", new Object[]{0}).func_150254_d();
        c = new TextComponentTranslation("Gui.Main.ChangeBackground", new Object[]{0}).func_150254_d();
        d = new TextComponentTranslation("Gui.Main.HorizontalRotate", new Object[]{0}).func_150254_d();
        e = new TextComponentTranslation("Gui.Main.Move", new Object[]{0}).func_150254_d();
        f = new TextComponentTranslation("Gui.Main.FreeRotate", new Object[]{0}).func_150254_d();
        g = new TextComponentTranslation("Gui.Main.SmartZoomOn", new Object[]{0}).func_150254_d();
        h = new TextComponentTranslation("Gui.Main.SmartZoomOff", new Object[]{0}).func_150254_d();
        this.c = (int)((double)this.width * -0.5);
        this.d = (int)((double)this.width * 0.5);
        this.e = (int)((double)this.height * -0.6);
        this.f = (int)((double)this.height * 0.6);
        a = 0.0f;
        b = 0.0f;
        c = 1.0f;
        a = 0;
        b = 0;
        Mouse.getDWheel();
        EntityPlayerSP entity = Minecraft.getMinecraft().player;
        k csp = a_0.instance.a;
        if (csp != null && !((bc.a)((Object)csp.a)).a && csp.a != null) {
            String path = "CustomSteve/Animations/" + csp.b() + "/";
            ((bc.a)((Object)csp.a)).c = false;
            csp.k = false;
            csp.l = true;
            csp.c(path + "stand.vmd", 0);
            Minecraft.getMinecraft().getRenderManager().renderEntity((Entity)entity, 0.0, 1.61, 0.0, 0.0f, 1.0f, false);
        }
        return this;
    }

    protected void keyTyped(char par1, int par2) throws IOException {
        super.keyTyped(par1, par2);
        if (par2 == t_0.a.getKeyCode()) {
            this.mc.displayGuiScreen((GuiScreen)null);
            this.mc.setIngameFocus();
            t_0.a = false;
        } else if (par2 == g) {
            c = !c;
        } else if (par2 == h) {
            b = !b;
        } else if (par2 == i && ++n == 5) {
            n = 0;
        }
    }

    protected void a(int mX, int mY, int d2) {
        if (d2 != 0) {
            float oldScale = c;
            if ((c = (float)((double)c + (double)d2 / 800.0)) < 0.3f) {
                c = 0.3f;
            } else if (c > 10.0f) {
                c = 10.0f;
            } else {
                a = (int)((float)a * (c / oldScale));
                b = (int)((float)b * (c / oldScale));
                if (c) {
                    if (d2 > 0) {
                        this.a((float)(-(mX - this.width / 2) / 10) * c, (float)(-(mY - this.height / 2) / 10) * c);
                    }
                    if (d2 < 0) {
                        this.a((float)((mX - this.width / 2) / 10) * c, (float)((mY - this.height / 2) / 10) * c);
                    }
                }
            }
            this.a(0, 0);
        }
    }

    private void a(int dX, int dY) {
        b += dY;
        if ((a += dX) > this.d) {
            a = this.d;
        }
        if (a < this.c) {
            a = this.c;
        }
        if (b > this.f) {
            b = this.f;
        }
        if (b < this.e) {
            b = this.e;
        }
    }

    private void a(float dX, float dY) {
        this.a((int)dX, (int)dY);
    }

    public void onGuiClosed() {
        k csp;
        if (this.mc.player != null && (csp = a_0.instance.a) != null) {
            csp.k = true;
            if (!((bc.a)((Object)csp.a)).h) {
                ((bc.a)((Object)csp.a)).c = true;
            }
            csp.l = false;
        }
        if (this.a != null) {
            this.a.onGuiClosed();
        }
    }

    public boolean doesGuiPauseGame() {
        return true;
    }

    public static void a(GuiScreen screen) {
        Mouse.getDWheel();
        GuiOpenEvent event = new GuiOpenEvent(screen);
        if (MinecraftForge.EVENT_BUS.post((Event)event)) {
            return;
        }
        screen = event.getGui();
        Minecraft mc = Minecraft.getMinecraft();
        mc.setIngameNotInFocus();
        ScaledResolution scaledresolution = new ScaledResolution(mc);
        int i2 = scaledresolution.getScaledWidth();
        int j2 = scaledresolution.getScaledHeight();
        screen.setWorldAndResolution(Minecraft.getMinecraft(), i2, j2);
        Minecraft.getMinecraft().skipRenderWorld = false;
        Minecraft.getMinecraft().currentScreen = screen;
    }

    public GuiButton a(int id) {
        for (int i2 = 0; i2 < this.buttonList.size(); ++i2) {
            GuiButton b2 = (GuiButton)this.buttonList.get(i2);
            if (b2.id != id) continue;
            return b2;
        }
        return null;
    }

    static {
        g = 44;
        h = 35;
        i = 22;
    }
}

