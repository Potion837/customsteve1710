/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.GuiButton
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.gui.GuiTextField
 *  net.minecraft.util.ChatComponentTranslation
 *  net.minecraft.util.IChatComponent
 *  net.minecraft.util.StatCollector
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.StatCollector;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class GuiConfig
extends GuiBaseScreen {
    protected static final int stopped$ = 0;
    protected static final int musician$ = 1;
    protected static final int striking$ = 10;
    protected static final int deleted$ = 11;
    protected static final int grain$ = 12;
    protected static final int pulling$ = 13;
    protected static final int worldcat$ = 14;
    protected static final int fruits$ = 15;
    protected GuiCheckBox perform$;
    protected GuiCheckBox refused$;
    protected GuiCheckBox disks$;
    protected GuiTextField cause$;
    protected GuiTextField circuit$;
    protected GuiTextField violin$;
    private GuiAbout2 volume$;

    public GuiConfig(GuiScreen parent) {
        super(parent);
    }

    @Override
    public void func_73863_a(int par1, int par2, float par3) {
        super.func_73863_a(par1, par2, par3);
        GL11.glDisable((int)2929);
        if (b) {
            GL11.glDisable((int)2896);
            this.func_73731_b(this.field_146289_q, StatCollector.func_74838_a((String)"Gui.Config.SizeTitle"), (int)((double)this.field_146294_l * 0.79), (int)((double)this.field_146295_m * 0.12), 0xFFFFFF);
            this.func_73731_b(this.field_146289_q, StatCollector.func_74838_a((String)"Gui.Config.SpeedTitle"), (int)((double)this.field_146294_l * 0.79), (int)((double)this.field_146295_m * 0.25), 0xFFFFFF);
            this.func_73731_b(this.field_146289_q, StatCollector.func_74838_a((String)"Gui.Config.BGMtitle"), (int)((double)this.field_146294_l * 0.79), (int)((double)this.field_146295_m * 0.38), 0xFFFFFF);
            this.cause$.func_146194_f();
            this.circuit$.func_146194_f();
            this.violin$.func_146194_f();
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
                break;
            }
            case 10: {
                this.b();
                break;
            }
            case 15: {
                Config.baghdad$ = !Config.baghdad$;
                this.a((int)15).field_146126_j = Config.baghdad$ ? StatCollector.func_74838_a((String)"Gui.Config.drawFirstPersonOff") : StatCollector.func_74838_a((String)"Gui.Config.drawFirstPersonOn");
                break;
            }
            case 14: {
                if (++Config.price$ > 2) {
                    Config.price$ = 0;
                }
                this.a((int)14).field_146126_j = Config.price$ == 0 ? StatCollector.func_74838_a((String)"Gui.Config.AutoSwitchOff") : (Config.price$ == 1 ? StatCollector.func_74838_a((String)"Gui.Config.AutoSwitch1") : StatCollector.func_74838_a((String)"Gui.Config.AutoSwitch2"));
                break;
            }
            case 11: {
                Config.leaves$ = !Config.leaves$;
                this.a((int)11).field_146126_j = Config.leaves$ ? StatCollector.func_74838_a((String)"Gui.Config.ReloadTurnOff") : StatCollector.func_74838_a((String)"Gui.Config.ReloadTurnOn");
                break;
            }
            case 13: {
                this.a();
                break;
            }
            case 12: {
                String status;
                String[] s;
                if (this.cause$.func_146179_b() != null && !this.cause$.func_146179_b().equals("") && (s = (status = this.cause$.func_146179_b()).split(","))[0] != null && !s[0].equals("")) {
                    Config.child$ = s.length > 2 && s[1] != null && s[2] != null && !s[1].equals("") && s[2] != null && !s[2].equals("") ? new Vector3f(Float.parseFloat(s[0]), Float.parseFloat(s[1]), Float.parseFloat(s[2])) : new Vector3f(Float.parseFloat(s[0]), Float.parseFloat(s[0]), Float.parseFloat(s[0]));
                }
                if (this.circuit$.func_146179_b() != null && !this.circuit$.func_146179_b().equals("")) {
                    try {
                        Config.celebs$ = Float.parseFloat(this.circuit$.func_146179_b());
                    }
                    catch (Exception e2) {
                        Config.celebs$ = 1.0f;
                        e2.printStackTrace();
                    }
                }
                Config.gadgets$ = this.violin$.func_146179_b();
                ModContainer.athletes$.saveMyConfig();
                this.field_146297_k.field_71439_g.func_145747_a((IChatComponent)new ChatComponentTranslation("Gui.Config.Saved", new Object[]{StatCollector.func_74838_a((String)"Gui.Config.Saved").length() + 1}));
                this.field_146297_k.func_147108_a(this.a);
            }
        }
    }

    @Override
    protected void func_73864_a(int par1, int par2, int par3) {
        if (b) {
            this.cause$.func_146192_a(par1, par2, par3);
            this.circuit$.func_146192_a(par1, par2, par3);
            this.violin$.func_146192_a(par1, par2, par3);
        }
        super.func_73864_a(par1, par2, par3);
    }

    @Override
    protected void func_73869_a(char par1, int par2) {
        if (this.cause$.func_146206_l() || this.circuit$.func_146206_l()) {
            if (par2 == 203 || par2 == 205 || par2 == 211 || par2 == 14 || par2 == 52 || par2 == 51 || par1 >= '0' && par1 <= '9') {
                this.cause$.func_146201_a(par1, par2);
            }
            if (par2 == 203 || par2 == 205 || par2 == 211 || par2 == 14 || par2 == 52 || par1 >= '0' && par1 <= '9') {
                this.circuit$.func_146201_a(par1, par2);
            }
        }
        this.violin$.func_146201_a(par1, par2);
        if (!(this.cause$.func_146206_l() || this.circuit$.func_146206_l() || this.violin$.func_146206_l())) {
            super.func_73869_a(par1, par2);
        }
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
        String model = ModContainer.dealing$.talking$;
        String texture = ModContainer.dealing$.method$;
        ModContainer.athletes$.loadMyConfig();
        this.a((int)10).field_146124_l = CS_Bullet.income$;
        this.a((int)11).field_146124_l = Config.globe$;
        this.a((int)10).field_146126_j = Config.globe$ ? StatCollector.func_74838_a((String)"Gui.Config.PhysicsTurnOff") : StatCollector.func_74838_a((String)"Gui.Config.PhysicsTurnOn");
        this.a((int)11).field_146126_j = Config.leaves$ ? StatCollector.func_74838_a((String)"Gui.Config.ReloadTurnOff") : StatCollector.func_74838_a((String)"Gui.Config.ReloadTurnOn");
        this.a((int)14).field_146126_j = Config.price$ == 0 ? StatCollector.func_74838_a((String)"Gui.Config.AutoSwitchOff") : (Config.price$ == 1 ? StatCollector.func_74838_a((String)"Gui.Config.AutoSwitch1") : StatCollector.func_74838_a((String)"Gui.Config.AutoSwitch2"));
        String string = this.a((int)15).field_146126_j = Config.baghdad$ ? StatCollector.func_74838_a((String)"Gui.Config.drawFirstPersonOff") : StatCollector.func_74838_a((String)"Gui.Config.drawFirstPersonOn");
        if (!model.equals(ModContainer.dealing$.talking$) || !texture.equals(ModContainer.dealing$.method$)) {
            GuiModelSelect.a(ModContainer.dealing$.talking$, ModContainer.dealing$.method$);
        }
        if (Config.globe$) {
            if (Config.globe$ != Config.point$) {
                this.b();
                Config.point$ = true;
            }
            Config.globe$ = false;
        } else if (Config.globe$ != Config.point$) {
            this.b();
            Config.point$ = false;
        }
        this.field_146297_k.field_71439_g.func_145747_a((IChatComponent)new ChatComponentTranslation("Gui.Config.Loaded", new Object[]{StatCollector.func_74838_a((String)"Gui.Config.Loaded").length() + 1}));
    }

    public void b() {
        if (!Config.point$) {
            CSmanager.cellular$.keith$._lenses();
        } else {
            Config.routes$ = 0L;
            CSplayer csp = CSmanager.cellular$.trucks$;
            if (csp != null) {
                // empty if block
            }
        }
        Config.point$ = !Config.point$;
        this.a((int)10).field_146126_j = Config.point$ ? StatCollector.func_74838_a((String)"Gui.Config.PhysicsTurnOff") : StatCollector.func_74838_a((String)"Gui.Config.PhysicsTurnOn");
        this.a((int)11).field_146124_l = Config.point$;
        if (!Config.point$) {
            Config.leaves$ = false;
            this.a((int)11).field_146126_j = StatCollector.func_74838_a((String)"Gui.Config.ReloadTurnOn");
        }
    }

    public void func_73866_w_() {
        super.func_73866_w_();
        Keyboard.enableRepeatEvents((boolean)true);
        this.cause$ = new GuiTextField(this.field_146289_q, (int)((double)this.field_146294_l * 0.79), (int)((double)this.field_146295_m * 0.16), (int)((double)this.field_146294_l * 0.2), 20);
        this.cause$.func_146203_f(128);
        this.cause$.func_146195_b(false);
        this.cause$.func_146184_c(true);
        if (Config.child$ != null) {
            this.cause$.func_146180_a(Config.child$.serves$ + "," + Config.child$.genius$ + "," + Config.child$.superb$);
        } else {
            this.cause$.func_146180_a("1.0,1.0,1.0");
        }
        this.circuit$ = new GuiTextField(this.field_146289_q, (int)((double)this.field_146294_l * 0.79), (int)((double)this.field_146295_m * 0.29), (int)((double)this.field_146294_l * 0.2), 20);
        this.circuit$.func_146203_f(128);
        this.circuit$.func_146195_b(false);
        this.circuit$.func_146184_c(true);
        if (Config.celebs$ > 0.0f) {
            this.circuit$.func_146180_a(Config.celebs$ + "");
        } else {
            this.circuit$.func_146180_a("1.0");
        }
        this.violin$ = new GuiTextField(this.field_146289_q, (int)((double)this.field_146294_l * 0.79), (int)((double)this.field_146295_m * 0.42), (int)((double)this.field_146294_l * 0.2), 20);
        this.violin$.func_146203_f(128);
        this.violin$.func_146195_b(false);
        this.violin$.func_146184_c(true);
        this.violin$.func_146180_a(Config.gadgets$);
        this.field_146292_n.add(new GuiButton(0, (int)((double)this.field_146294_l * 0.89), (int)((double)this.field_146295_m * 0.035), (int)((double)this.field_146294_l * 0.05), 20, "\u2190"));
        this.field_146292_n.add(new GuiButton(1, (int)((double)this.field_146294_l * 0.82), (int)((double)this.field_146295_m * 0.035), (int)((double)this.field_146294_l * 0.05), 20, "?"));
        this.field_146292_n.add(new GuiButton(10, (int)((double)this.field_146294_l * 0.8), (int)((double)this.field_146295_m * 0.51), (int)((double)this.field_146294_l * 0.18), 20, Config.point$ || Config.globe$ ? StatCollector.func_74838_a((String)"Gui.Config.PhysicsTurnOff") : StatCollector.func_74838_a((String)"Gui.Config.PhysicsTurnOn")));
        this.field_146292_n.add(new GuiButton(11, (int)((double)this.field_146294_l * 0.8), (int)((double)this.field_146295_m * 0.58), (int)((double)this.field_146294_l * 0.18), 20, Config.leaves$ ? StatCollector.func_74838_a((String)"Gui.Config.ReloadTurnOff") : StatCollector.func_74838_a((String)"Gui.Config.ReloadTurnOn")));
        this.field_146292_n.add(new GuiButton(14, (int)((double)this.field_146294_l * 0.8), (int)((double)this.field_146295_m * 0.65), (int)((double)this.field_146294_l * 0.18), 20, Config.price$ == 0 ? StatCollector.func_74838_a((String)"Gui.Config.AutoSwitchOff") : (Config.price$ == 1 ? StatCollector.func_74838_a((String)"Gui.Config.AutoSwitch1") : StatCollector.func_74838_a((String)"Gui.Config.AutoSwitch2"))));
        this.field_146292_n.add(new GuiButton(15, (int)((double)this.field_146294_l * 0.8), (int)((double)this.field_146295_m * 0.72), (int)((double)this.field_146294_l * 0.18), 20, Config.baghdad$ ? StatCollector.func_74838_a((String)"Gui.Config.drawFirstPersonOff") : StatCollector.func_74838_a((String)"Gui.Config.drawFirstPersonOn")));
        this.field_146292_n.add(new GuiButton(12, (int)((double)this.field_146294_l * 0.79), (int)((double)this.field_146295_m * 0.82), (int)((double)this.field_146294_l * 0.1), 20, StatCollector.func_74838_a((String)"Gui.Config.SaveSetting")));
        this.field_146292_n.add(new GuiButton(13, (int)((double)this.field_146294_l * 0.89), (int)((double)this.field_146295_m * 0.82), (int)((double)this.field_146294_l * 0.1), 20, StatCollector.func_74838_a((String)"Gui.Config.LoadSetting")));
        this.a((int)11).field_146124_l = Config.point$;
        CSplayer csp = CSmanager.cellular$.trucks$;
        if (csp != null) {
            // empty if block
        }
    }
}

