/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.common.eventhandler.Event
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.GuiButton
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.util.StatCollector
 *  net.minecraftforge.client.event.GuiOpenEvent
 *  net.minecraftforge.common.MinecraftForge
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.GL11
 */
import cpw.mods.fml.common.eventhandler.Event;
import java.text.DecimalFormat;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.common.MinecraftForge;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class GuiResourceManager
extends GuiScreen {
    protected static final int memories$ = 0;
    protected static final int arrive$ = 1;
    private GuiScreen album$;
    private GuiAbout2 stations$;
    private static int stating$;

    public GuiResourceManager(GuiScreen parent) {
        this.album$ = parent;
    }

    public void func_73866_w_() {
        super.func_73866_w_();
        Keyboard.enableRepeatEvents((boolean)true);
        this.field_146292_n.add(new GuiButton(0, (int)((double)this.field_146294_l * 0.89), (int)((double)this.field_146295_m * 0.035), (int)((double)this.field_146294_l * 0.05), 20, "\u2190"));
        this.field_146292_n.add(new GuiButton(1, (int)((double)this.field_146294_l * 0.82), (int)((double)this.field_146295_m * 0.035), (int)((double)this.field_146294_l * 0.05), 20, "?"));
    }

    protected void func_146284_a(GuiButton par1GuiButton) {
        switch (par1GuiButton.field_146127_k) {
            case 0: {
                try {
                    CSmanager.cellular$._school();
                }
                catch (Exception e2) {
                    e2.printStackTrace();
                }
                GuiResourceManager.a(this.album$);
                break;
            }
            case 1: {
                if (this.stations$ == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(StatCollector.func_74838_a((String)"Gui.Model.HelpTitle")).append('\n');
                    sb.append(StatCollector.func_74838_a((String)"Gui.Model.Help1")).append('\n');
                    sb.append(StatCollector.func_74838_a((String)"Gui.Model.Help2")).append('\n');
                    sb.append(StatCollector.func_74838_a((String)"Gui.Model.Help3")).append('\n');
                    sb.append(StatCollector.func_74838_a((String)"Gui.Model.Help4"));
                    this.stations$ = new GuiAbout2((GuiScreen)this, sb.toString());
                }
                GuiResourceManager.a(this.stations$);
            }
        }
    }

    public void func_73863_a(int par1, int par2, float par3) {
        this.a();
        super.func_73863_a(par1, par2, par3);
        DecimalFormat df = new DecimalFormat("#.##");
        this.func_73731_b(this.field_146289_q, "\u8d44\u6e90\u7ba1\u7406\u5668", (int)((double)this.field_146294_l * 0.04), this.field_146295_m * 0, 0xFFFF00);
        this.func_73731_b(this.field_146289_q, "\u4f7f\u7528\u5185\u5b58: \u8ba1\u7b97\u4e2d...", (int)((double)this.field_146294_l * 0.04), (int)((double)this.field_146295_m * 0.04), Config.seating$ ? 65280 : 0xFFFF00);
        this.func_73731_b(this.field_146289_q, "\u7f13\u5b58\u6a21\u578b: " + CSmanager.cellular$._sponsor() + " \u4e2a", (int)((double)this.field_146294_l * 0.04), (int)((double)this.field_146295_m * 0.08), Config.seating$ ? 65280 : 0xFFFF00);
        this.func_73731_b(this.field_146289_q, "\u7f13\u5b58\u52a8\u4f5c: " + CSmanager.cellular$._flags() + " \u4e2a", (int)((double)this.field_146294_l * 0.04), (int)((double)this.field_146295_m * 0.12), Config.seating$ ? 65280 : 0xFFFF00);
        this.func_73731_b(this.field_146289_q, "\u7cfb\u7edf\u9519\u8bef: 2 \u6761", (int)((double)this.field_146294_l * 0.04), (int)((double)this.field_146295_m * 0.16), Config.seating$ ? 65280 : 0xFFFF00);
    }

    public void a() {
        this.func_73733_a(-1, -1, 1, 1, 0, 0);
        stating$ = 0xFFFFFF;
        this.a(field_110325_k);
    }

    private void a(ResourceLocation texture) {
        GL11.glDisable((int)2896);
        GL11.glDisable((int)2912);
        this.field_146297_k.func_110434_K().func_110577_a(texture);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        float f2 = 32.0f;
        GL11.glBegin((int)7);
        int j = 64;
        int k = 64;
        int l = 64;
        GL11.glColor4f((float)((float)j / 255.0f), (float)((float)k / 255.0f), (float)((float)l / 255.0f), (float)255.0f);
        GL11.glTexCoord2d((double)0.0, (double)((float)this.field_146295_m / f2 + 0.0f));
        GL11.glVertex3d((double)0.0, (double)this.field_146295_m, (double)0.0);
        GL11.glTexCoord2d((double)((float)this.field_146294_l / f2), (double)((float)this.field_146295_m / f2 + 0.0f));
        GL11.glVertex3d((double)this.field_146294_l, (double)this.field_146295_m, (double)0.0);
        GL11.glTexCoord2d((double)((float)this.field_146294_l / f2), (double)0.0);
        GL11.glVertex3d((double)this.field_146294_l, (double)0.0, (double)0.0);
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
        screen = event.gui;
        Minecraft mc = Minecraft.func_71410_x();
        mc.func_71364_i();
        ScaledResolution scaledresolution = new ScaledResolution(mc, mc.field_71443_c, mc.field_71440_d);
        int i = scaledresolution.func_78326_a();
        int j = scaledresolution.func_78328_b();
        screen.func_146280_a(Minecraft.func_71410_x(), i, j);
        Minecraft.func_71410_x().field_71454_w = false;
        Minecraft.func_71410_x().field_71462_r = screen;
    }
}

