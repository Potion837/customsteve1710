/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.GuiButton
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.util.text.TextComponentTranslation
 *  net.minecraftforge.client.event.GuiOpenEvent
 *  net.minecraftforge.common.MinecraftForge
 *  net.minecraftforge.fml.common.eventhandler.Event
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.GL11
 */
package customsteve;

import customsteve.G;
import customsteve.a_0;
import customsteve.b_0;
import java.text.DecimalFormat;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.Event;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

/*
 * Renamed from customsteve.Q
 * Duplicate member names - consider using --renamedupmembers true
 */
public class q_0
extends GuiScreen {
    protected static final int a = 0;
    protected static final int b = 1;
    private GuiScreen a;
    private G a;
    private static int c;

    public q_0(GuiScreen parent) {
        this.a = parent;
    }

    public void initGui() {
        super.initGui();
        Keyboard.enableRepeatEvents((boolean)true);
        this.buttonList.add(new GuiButton(0, (int)((double)this.width * 0.89), (int)((double)this.height * 0.035), (int)((double)this.width * 0.05), 20, "\u2190"));
        this.buttonList.add(new GuiButton(1, (int)((double)this.width * 0.82), (int)((double)this.height * 0.035), (int)((double)this.width * 0.05), 20, "?"));
    }

    protected void actionPerformed(GuiButton par1GuiButton) {
        switch (par1GuiButton.id) {
            case 0: {
                try {
                    a_0.instance.d();
                }
                catch (Exception e2) {
                    e2.printStackTrace();
                }
                q_0.a(this.a);
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
                q_0.a(this.a);
            }
        }
    }

    public void drawScreen(int par1, int par2, float par3) {
        this.a();
        super.drawScreen(par1, par2, par3);
        DecimalFormat df = new DecimalFormat("#.##");
        this.func_73731_b(this.fontRenderer, "\u8d44\u6e90\u7ba1\u7406\u5668", (int)((double)this.width * 0.04), this.height * 0, 0xFFFF00);
        this.func_73731_b(this.fontRenderer, "\u4f7f\u7528\u5185\u5b58: \u8ba1\u7b97\u4e2d...", (int)((double)this.width * 0.04), (int)((double)this.height * 0.04), b_0.h ? 65280 : 0xFFFF00);
        this.func_73731_b(this.fontRenderer, "\u7f13\u5b58\u6a21\u578b: " + a_0.instance.b() + " \u4e2a", (int)((double)this.width * 0.04), (int)((double)this.height * 0.08), b_0.h ? 65280 : 0xFFFF00);
        this.func_73731_b(this.fontRenderer, "\u7f13\u5b58\u52a8\u4f5c: " + a_0.instance.a() + " \u4e2a", (int)((double)this.width * 0.04), (int)((double)this.height * 0.12), b_0.h ? 65280 : 0xFFFF00);
        this.func_73731_b(this.fontRenderer, "\u7cfb\u7edf\u9519\u8bef: 2 \u6761", (int)((double)this.width * 0.04), (int)((double)this.height * 0.16), b_0.h ? 65280 : 0xFFFF00);
    }

    public void a() {
        this.func_73733_a(-1, -1, 1, 1, 0, 0);
        c = 0xFFFFFF;
        this.a(field_110325_k);
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
}

