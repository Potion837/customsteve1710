/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.common.eventhandler.Event
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityClientPlayerMP
 *  net.minecraft.client.gui.GuiButton
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraft.client.renderer.OpenGlHelper
 *  net.minecraft.client.renderer.RenderHelper
 *  net.minecraft.client.renderer.entity.RenderManager
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.util.StatCollector
 *  net.minecraftforge.client.event.GuiOpenEvent
 *  net.minecraftforge.common.MinecraftForge
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.GL11
 */
import cpw.mods.fml.common.eventhandler.Event;
import java.text.DecimalFormat;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.common.MinecraftForge;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class GuiBaseScreen
extends GuiScreen {
    protected final GuiScreen lists$;
    protected static EnumProjection2 curtis$ = EnumProjection2.dental$;
    private EntityClientPlayerMP bedford$;
    private static float expanded$ = 0.0f;
    private static float spoke$ = 0.0f;
    private static float garmin$ = 1.0f;
    private static final float universe$ = 0.3f;
    private static final float dylan$ = 10.0f;
    private static int holder$ = 0;
    private static int schools$ = 0;
    private int popular$;
    private int reduces$;
    private int knows$;
    private int exists$;
    protected int filme$ = -1;
    protected int personal$ = -1;
    protected int follow$ = 0;
    protected boolean almost$ = false;
    private static boolean homework$ = true;
    protected static boolean obtain$ = true;
    protected static int brisbane$;
    private static int britney$;
    private static int imaging$;
    private static int governor$;
    private static int makers$;
    private static String voters$;
    private static String brutal$;
    private static String entered$;
    private static String oldest$;
    private static String motels$;
    private static String invite$;
    private static String wheel$;
    private static String fitness$;

    public GuiBaseScreen(GuiScreen parent) {
        this.lists$ = parent;
    }

    public void func_73863_a(int par1, int par2, float par3) {
        this.a();
        this.popular$ = (int)((double)this.field_146294_l * -0.5 * (double)garmin$);
        this.reduces$ = (int)((double)this.field_146294_l * 0.5 * (double)garmin$);
        this.knows$ = (int)((double)this.field_146295_m * -0.6 * (double)garmin$);
        this.exists$ = (int)((double)this.field_146295_m * 0.6 * (double)garmin$);
        this.a(par1, par2, Mouse.getDWheel());
        this.b();
        GL11.glDisable((int)2929);
        if (obtain$) {
            super.func_73863_a(par1, par2, par3);
            DecimalFormat df = new DecimalFormat("#.##");
            this.func_73731_b(this.field_146289_q, "FPS:" + df.format(Config.jamaica$) + (Config.filter$ == 1 ? "(original)" : (Config.filter$ == 2 ? "(extend)" : "")) + " " + "Calc: " + (Config.gentle$ == 0L ? "<1" : Long.valueOf(Config.gentle$)) + "ms" + " Physics: " + Config.routes$ + "ms" + (Config.maybe$ ? (Config.prairie$ ? " MTVT: " : " VT: ") + Config.craft$ + "ms" : ""), (int)((double)this.field_146294_l * 0.04), this.field_146295_m * 0, 0xFFFF00);
            this.func_73731_b(this.field_146289_q, (Config.seating$ ? "Online" : "Offline") + (Config.villas$ ? "(Guest)" : "(User)"), (int)((double)this.field_146294_l * 0.04), (int)((double)this.field_146295_m * 0.04), Config.seating$ ? 65280 : 0xFFFF00);
            this.func_73731_b(this.field_146289_q, voters$, (int)((double)this.field_146294_l * 0.04), (int)((double)this.field_146295_m * 0.65), 0xFF0000);
            this.func_73731_b(this.field_146289_q, brutal$, (int)((double)this.field_146294_l * 0.04), (int)((double)this.field_146295_m * 0.7), 0xFF0000);
            this.func_73731_b(this.field_146289_q, entered$, (int)((double)this.field_146294_l * 0.04), (int)((double)this.field_146295_m * 0.75), 0xFF0000);
            this.func_73731_b(this.field_146289_q, oldest$, (int)((double)this.field_146294_l * 0.04), (int)((double)this.field_146295_m * 0.8), makers$);
            this.func_73731_b(this.field_146289_q, motels$, (int)((double)this.field_146294_l * 0.04), (int)((double)this.field_146295_m * 0.85), makers$);
            this.func_73731_b(this.field_146289_q, invite$, (int)((double)this.field_146294_l * 0.04), (int)((double)this.field_146295_m * 0.9), makers$);
            if (homework$) {
                this.func_73731_b(this.field_146289_q, wheel$, (int)((double)this.field_146294_l * 0.04), (int)((double)this.field_146295_m * 0.95), makers$);
            } else {
                this.func_73731_b(this.field_146289_q, fitness$, (int)((double)this.field_146294_l * 0.04), (int)((double)this.field_146295_m * 0.95), makers$);
            }
        }
        GL11.glEnable((int)2929);
    }

    private void a() {
        this.func_73733_a(-1, -1, 1, 1, 0, 0);
        makers$ = 0xFFFFFF;
        switch (brisbane$) {
            case 0: {
                this.func_146276_q_();
                break;
            }
            case 1: {
                this.a(field_110325_k);
                break;
            }
            case 2: {
                this.func_73733_a(0, 0, this.field_146294_l, this.field_146295_m, -16777216, -16777216);
                break;
            }
            case 3: {
                this.func_73733_a(0, 0, this.field_146294_l, this.field_146295_m, -1, -1);
                makers$ = 0xFF0000;
                break;
            }
        }
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

    private void b() {
        if (Config.scored$) {
            ShaderProgram.bahrain$ = true;
            int posX = this.field_146294_l / 2;
            int posY = (int)((double)this.field_146295_m * 0.95);
            int scaleRatio = 100;
            GL11.glPushMatrix();
            EntityClientPlayerMP entity = this.field_146297_k.field_71439_g;
            curtis$._trading(posX, posY, holder$, schools$, expanded$, spoke$, (float)scaleRatio * garmin$);
            GL11.glEnable((int)2903);
            float f2 = entity.field_70761_aq;
            float f3 = entity.field_70177_z;
            float f4 = entity.field_70125_A;
            float f5 = entity.field_70758_at;
            float f6 = entity.field_70759_as;
            GL11.glRotatef((float)135.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            RenderHelper.func_74519_b();
            GL11.glRotatef((float)-135.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            entity.field_70761_aq = 0.0f;
            entity.field_70177_z = 0.0f;
            entity.field_70125_A = 0.0f;
            entity.field_70759_as = 0.0f;
            entity.field_70758_at = 0.0f;
            RenderManager.field_78727_a.field_78735_i = 180.0f;
            curtis$._colin(this.field_146294_l, this.field_146295_m);
            CSplayer csp = CSmanager.cellular$._events((EntityLivingBase)Minecraft.func_71410_x().field_71439_g, ModContainer.dealing$.highways$, false);
            if (csp != null && !csp.a.bringing$) {
                String path = "CustomSteve/Animations/" + csp.b() + "/";
                csp.a.quizzes$ = false;
                csp.freeze$ = false;
                if (csp.a != null) {
                    if (csp.a() >= csp.a.mutual$ && csp.a.remove$) {
                        csp.c(csp.philips$, false);
                    }
                    csp.b(path + "stand.vmd", false);
                }
                RenderManager.field_78727_a.func_147940_a((Entity)entity, 0.0, 1.61, 0.0, 0.0f, 1.0f);
            }
            curtis$._saved();
            entity.field_70761_aq = f2;
            entity.field_70177_z = f3;
            entity.field_70125_A = f4;
            entity.field_70758_at = f5;
            entity.field_70759_as = f6;
            GL11.glPopMatrix();
            RenderHelper.func_74518_a();
            GL11.glDisable((int)32826);
            OpenGlHelper.func_77473_a((int)OpenGlHelper.field_77476_b);
            GL11.glDisable((int)3553);
            OpenGlHelper.func_77473_a((int)OpenGlHelper.field_77478_a);
            ShaderProgram.bahrain$ = false;
        }
    }

    protected void func_73864_a(int par1, int par2, int par3) {
        if (obtain$) {
            super.func_73864_a(par1, par2, par3);
        }
        if (!this.almost$) {
            this.filme$ = par1;
            this.personal$ = par2;
            this.follow$ |= par3 + 1;
        }
        this.almost$ = false;
    }

    protected void func_146286_b(int par1, int par2, int par3) {
        if (this.follow$ == 0 || par3 == -1) {
            super.func_146286_b(par1, par2, par3);
        } else {
            this.follow$ ^= par3 + 1;
        }
    }

    protected void func_146273_a(int par1, int par2, int par3, long par4) {
        if (this.follow$ > 0) {
            int dX = par1 - this.filme$;
            int dY = par2 - this.personal$;
            this.filme$ = par1;
            this.personal$ = par2;
            switch (this.follow$) {
                case 2: {
                    this.a(dX, dY);
                    break;
                }
                case 3: {
                    spoke$ -= (float)dY;
                }
                case 1: {
                    expanded$ += (float)dX;
                }
            }
        }
    }

    public GuiScreen a() {
        voters$ = StatCollector.func_74838_a((String)"Gui.Main.ShowInterface");
        brutal$ = StatCollector.func_74838_a((String)"Gui.Main.SmartZoom");
        entered$ = StatCollector.func_74838_a((String)"Gui.Main.ChangeBackground");
        oldest$ = StatCollector.func_74838_a((String)"Gui.Main.HorizontalRotate");
        motels$ = StatCollector.func_74838_a((String)"Gui.Main.Move");
        invite$ = StatCollector.func_74838_a((String)"Gui.Main.FreeRotate");
        wheel$ = StatCollector.func_74838_a((String)"Gui.Main.SmartZoomOn");
        fitness$ = StatCollector.func_74838_a((String)"Gui.Main.SmartZoomOff");
        this.popular$ = (int)((double)this.field_146294_l * -0.5);
        this.reduces$ = (int)((double)this.field_146294_l * 0.5);
        this.knows$ = (int)((double)this.field_146295_m * -0.6);
        this.exists$ = (int)((double)this.field_146295_m * 0.6);
        expanded$ = 0.0f;
        spoke$ = 0.0f;
        garmin$ = 1.0f;
        holder$ = 0;
        schools$ = 0;
        Mouse.getDWheel();
        EntityClientPlayerMP entity = Minecraft.func_71410_x().field_71439_g;
        CSplayer csp = CSmanager.cellular$.trucks$;
        if (csp != null && !csp.a.remove$ && csp.a != null) {
            String path = "CustomSteve/Animations/" + csp.b() + "/";
            csp.a.quizzes$ = false;
            csp.freeze$ = false;
            csp.murray$ = true;
            csp.c(path + "stand.vmd", false);
            RenderManager.field_78727_a.func_147940_a((Entity)entity, 0.0, 1.61, 0.0, 0.0f, 1.0f);
        }
        return this;
    }

    protected void func_73869_a(char par1, int par2) {
        super.func_73869_a(par1, par2);
        if (par2 == KeyInputHandler.a.func_151463_i()) {
            this.field_146297_k.func_147108_a((GuiScreen)null);
            this.field_146297_k.func_71381_h();
            KeyInputHandler.a = false;
        } else if (par2 == britney$) {
            homework$ = !homework$;
        } else if (par2 == imaging$) {
            obtain$ = !obtain$;
        } else if (par2 == governor$ && ++brisbane$ == 5) {
            brisbane$ = 0;
        }
    }

    protected void a(int mX, int mY, int d2) {
        if (d2 != 0) {
            float oldScale = garmin$;
            if ((garmin$ = (float)((double)garmin$ + (double)d2 / 800.0)) < 0.3f) {
                garmin$ = 0.3f;
            } else if (garmin$ > 10.0f) {
                garmin$ = 10.0f;
            } else {
                holder$ = (int)((float)holder$ * (garmin$ / oldScale));
                schools$ = (int)((float)schools$ * (garmin$ / oldScale));
                if (homework$) {
                    if (d2 > 0) {
                        this.a((float)(-(mX - this.field_146294_l / 2) / 10) * garmin$, (float)(-(mY - this.field_146295_m / 2) / 10) * garmin$);
                    }
                    if (d2 < 0) {
                        this.a((float)((mX - this.field_146294_l / 2) / 10) * garmin$, (float)((mY - this.field_146295_m / 2) / 10) * garmin$);
                    }
                }
            }
            this.a(0, 0);
        }
    }

    private void a(int dX, int dY) {
        schools$ += dY;
        if ((holder$ += dX) > this.reduces$) {
            holder$ = this.reduces$;
        }
        if (holder$ < this.popular$) {
            holder$ = this.popular$;
        }
        if (schools$ > this.exists$) {
            schools$ = this.exists$;
        }
        if (schools$ < this.knows$) {
            schools$ = this.knows$;
        }
    }

    private void a(float dX, float dY) {
        this.a((int)dX, (int)dY);
    }

    public void func_146281_b() {
        CSplayer csp;
        if (this.field_146297_k.field_71439_g != null && (csp = CSmanager.cellular$.trucks$) != null) {
            csp.freeze$ = true;
            if (!csp.a.warriors$) {
                csp.a.quizzes$ = true;
            }
            csp.murray$ = false;
        }
        if (this.lists$ != null) {
            this.lists$.func_146281_b();
        }
    }

    public boolean func_73868_f() {
        return true;
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

    public GuiButton a(int id) {
        for (int i = 0; i < this.field_146292_n.size(); ++i) {
            GuiButton b2 = (GuiButton)this.field_146292_n.get(i);
            if (b2.field_146127_k != id) continue;
            return b2;
        }
        return null;
    }

    static {
        britney$ = 44;
        imaging$ = 35;
        governor$ = 22;
    }
}

