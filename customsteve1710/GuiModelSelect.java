/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.GuiButton
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.gui.GuiTextField
 *  net.minecraft.util.StatCollector
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.opengl.GL11
 */
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.util.StatCollector;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class GuiModelSelect
extends GuiBaseScreen {
    private static boolean faces$ = false;
    protected static final int sigma$ = 0;
    protected static final int portrait$ = 1;
    protected static final int returns$ = 2;
    protected static final int pursuant$ = 11;
    protected static final int tariff$ = 20;
    protected GuiButton abroad$;
    protected GuiCheckBox holly$;
    protected GuiTextField render$;
    private GuiInformation stayed$;
    private GuiSlotList distinct$;
    private GuiAbout2 increase$;
    private String coupons$ = null;
    private String saying$;
    private String sheet$;
    private String mixing$;
    private boolean tribune$ = false;
    private static String thumb$;

    public GuiModelSelect(GuiScreen parent) {
        super(parent);
    }

    @Override
    public void func_73863_a(int par1, int par2, float par3) {
        super.func_73863_a(par1, par2, par3);
        GL11.glDisable((int)2929);
        if (b) {
            if (!this.sheet$.equals(ModContainer.dealing$.talking$) || !this.mixing$.equals(ModContainer.dealing$.method$)) {
                this.func_73732_a(this.field_146289_q, thumb$, (int)((double)this.field_146294_l * 0.5), (int)((double)this.field_146295_m * 0.05), 0xFFFFFF);
            }
            this.distinct$.a(par1, par2, par3, n == 3 ? -16777216 : -1);
            GL11.glDisable((int)2896);
            this.render$.func_146194_f();
        }
        GL11.glEnable((int)2929);
    }

    protected void func_146284_a(GuiButton par1GuiButton) {
        this.a = true;
        switch (par1GuiButton.field_146127_k) {
            case 0: {
                if (this.sheet$ != null) {
                    if (faces$) {
                        faces$ = false;
                        GuiModelSelect.a(this.sheet$, this.mixing$);
                    }
                }
                PhysicsInfoExport pie = new PhysicsInfoExport(CSmanager.cellular$.trucks$.a);
                try {
                    pie._billing(new File("e:\\info.phys"));
                }
                catch (Exception e1) {
                    e1.printStackTrace();
                }
                GuiModelSelect.a(this.a);
                break;
            }
            case 1: {
                if (this.increase$ == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(StatCollector.func_74838_a((String)"Gui.Model.HelpTitle")).append('\n');
                    sb.append(StatCollector.func_74838_a((String)"Gui.Model.Help1")).append('\n');
                    sb.append(StatCollector.func_74838_a((String)"Gui.Model.Help2")).append('\n');
                    sb.append(StatCollector.func_74838_a((String)"Gui.Model.Help3")).append('\n');
                    sb.append(StatCollector.func_74838_a((String)"Gui.Model.Help4"));
                    this.increase$ = new GuiAbout2((GuiScreen)this, sb.toString());
                }
                GuiModelSelect.a(this.increase$);
                break;
            }
            case 2: {
                if (this.stayed$ == null) {
                    this.stayed$ = new GuiInformation(this);
                }
                this.stayed$.a(CSmanager.cellular$.trucks$.a);
                GuiModelSelect.a(this.stayed$);
                break;
            }
            case 11: {
                String modelName = this.distinct$.a()[0];
                if (modelName == null) {
                    modelName = ModContainer.dealing$.talking$;
                }
                if (!this.sheet$.equals(ModContainer.dealing$.talking$) || !this.mixing$.equals(ModContainer.dealing$.method$)) {
                    CSplayerMP cspMP;
                    faces$ = false;
                    if (Config.seating$ && !Config.villas$ && (cspMP = new CSplayerMP(CSmanager.cellular$.trucks$.loans$, Config.villas$)) != null) {
                        try {
                            cspMP.trinidad$ = modelName;
                            cspMP.rendered$ = new float[]{1.0f, 1.0f, 1.0f};
                            cspMP.units$ = CSmanager.cellular$._mixed(ModContainer.outreach$ + "/" + "CustomSteve/models/" + modelName + "/");
                            P200_ModelInfomationUpdate2 packet = new P200_ModelInfomationUpdate2(cspMP._wicked(), P200_ModelInfomationUpdate.weird$);
                            ModContainer.array$.a(Minecraft.func_71410_x().field_71439_g.field_71174_a.func_147298_b(), packet);
                        }
                        catch (IOException e2) {
                            e2.printStackTrace();
                        }
                    }
                }
                this.sheet$ = modelName;
                this.mixing$ = this.render$.func_146179_b();
                this.tribune$ = this.holly$.choice$;
                this.abroad$.field_146124_l = false;
                break;
            }
            case 20: {
                this.render$.func_146184_c(this.holly$.a());
                if (this.holly$.choice$) break;
                this.coupons$ = this.render$.func_146179_b();
                this.render$.func_146180_a(this.saying$);
                String modelName2 = this.distinct$.a()[0];
                if (modelName2 == null) {
                    modelName2 = ModContainer.dealing$.talking$;
                }
                if (this.render$.func_146179_b().equals(this.coupons$)) break;
                this.abroad$.field_146124_l = true;
                GuiModelSelect.a(modelName2, this.render$.func_146179_b());
            }
        }
    }

    public static void a(String model, String texture) {
        CSplayer csp = CSmanager.cellular$.trucks$;
        Vector3f loc = new Vector3f(csp.owners$);
        CSplayer rcscp = new CSplayer(CSmanager.cellular$.trucks$.loans$, model);
        if (!ModContainer.dealing$.talking$.equals(model)) {
            faces$ = true;
        }
        ModContainer.dealing$.talking$ = model;
        ModContainer.dealing$.method$ = texture;
        rcscp.things$ = texture;
        rcscp.tourism$ = rcscp.reminder$.substring(0, rcscp.reminder$.length() - 4) + "/";
        CSmanager.cellular$._tunes(CSmanager.cellular$.trucks$, rcscp, false);
        CSmanager.cellular$.trucks$ = rcscp;
    }

    @Override
    protected void func_73864_a(int par1, int par2, int par3) {
        if (b) {
            if (!this.a && par1 >= this.distinct$.entering$ && par2 >= this.distinct$.revised$ && par2 <= this.distinct$.simon$) {
                String textureName;
                this.distinct$.a(par1, par2, par3 + 1);
                String modelName = this.distinct$.a()[0];
                if (modelName == null) {
                    modelName = this.sheet$;
                    textureName = this.mixing$;
                    this.saying$ = this.mixing$;
                    this.abroad$.field_146124_l = false;
                    this.holly$.choice$ = this.tribune$;
                } else {
                    this.saying$ = textureName = modelName.substring(0, modelName.lastIndexOf(46));
                }
                if (!modelName.equals(ModContainer.dealing$.talking$)) {
                    if (!this.holly$.choice$) {
                        this.render$.func_146180_a(textureName);
                    }
                    GuiModelSelect.a(modelName, this.render$.func_146179_b());
                    this.abroad$.field_146124_l = true;
                }
                this.a = false;
                return;
            }
            boolean b2 = this.render$.func_146206_l();
            this.render$.func_146192_a(par1, par2, par3);
            if (this.render$.func_146206_l()) {
                this.coupons$ = this.render$.func_146179_b();
                this.a = true;
            } else if (b2 && !this.render$.func_146206_l() && this.coupons$ != null && !this.coupons$.equals(this.render$.func_146179_b())) {
                String modelName = this.distinct$.a()[0];
                if (modelName == null) {
                    modelName = this.sheet$;
                }
                this.abroad$.field_146124_l = true;
                GuiModelSelect.a(modelName, this.render$.func_146179_b());
            }
        }
        super.func_73864_a(par1, par2, par3);
    }

    @Override
    protected void func_73869_a(char par1, int par2) {
        if (this.render$.func_146201_a(par1, par2)) {
            return;
        }
        super.func_73869_a(par1, par2);
    }

    @Override
    protected void func_146286_b(int par1, int par2, int par3) {
        if (par3 != -1) {
            this.distinct$.b(par1, par2, par3 + 1);
        }
        super.func_146286_b(par1, par2, par3);
    }

    @Override
    protected void a(int mX, int mY, int d2) {
        if (d2 != 0) {
            if (b && mX >= this.distinct$.entering$ && mY >= this.distinct$.revised$ && mY <= this.distinct$.simon$) {
                if (d2 != 0) {
                    if (d2 > 0) {
                        d2 = -1;
                    } else if (d2 < 0) {
                        d2 = 1;
                    }
                    this.distinct$.decide$ += (float)(d2 * this.distinct$.bizarre$ / 2);
                }
            } else {
                super.a(mX, mY, d2);
            }
        }
    }

    @Override
    public void func_146281_b() {
        if (this.sheet$ != null) {
            if (faces$) {
                faces$ = false;
                GuiModelSelect.a(this.sheet$, this.mixing$);
            }
        }
        super.func_146281_b();
    }

    public void func_73866_w_() {
        super.func_73866_w_();
        Keyboard.enableRepeatEvents((boolean)true);
        this.field_146292_n.add(new GuiButton(0, (int)((double)this.field_146294_l * 0.89), (int)((double)this.field_146295_m * 0.035), (int)((double)this.field_146294_l * 0.05), 20, "\u2190"));
        this.field_146292_n.add(new GuiButton(1, (int)((double)this.field_146294_l * 0.82), (int)((double)this.field_146295_m * 0.035), (int)((double)this.field_146294_l * 0.05), 20, "?"));
        this.field_146292_n.add(new GuiButton(2, (int)((double)this.field_146294_l * 0.75), (int)((double)this.field_146295_m * 0.035), (int)((double)this.field_146294_l * 0.05), 20, "i"));
        this.abroad$ = new GuiButton(11, (int)((double)this.field_146294_l * 0.87), (int)((double)this.field_146295_m * 0.9), (int)((double)this.field_146294_l * 0.12), 20, StatCollector.func_74838_a((String)"Gui.Model.Select"));
        this.field_146292_n.add(this.abroad$);
        this.abroad$.field_146124_l = false;
        this.holly$ = new GuiCheckBox(20, (int)((double)this.field_146294_l * 0.7), (int)((double)this.field_146295_m * 0.68), 20, 20, StatCollector.func_74838_a((String)"Gui.Model.Custom"), false);
        this.field_146292_n.add(this.holly$);
        this.render$ = new GuiTextField(this.field_146289_q, (int)((double)this.field_146294_l * 0.7), (int)((double)this.field_146295_m * 0.79), (int)((double)this.field_146294_l * 0.29), 20);
        this.render$.func_146203_f(64);
        this.render$.func_146195_b(false);
        this.render$.func_146184_c(false);
        ArrayList arrayList = CSmanager.cellular$._offered(ModContainer.outreach$ + "/CustomSteve/models", ".pmd", ".pmx");
        String modelName = "";
        try {
            modelName = ModContainer.dealing$.talking$.substring(0, ModContainer.dealing$.talking$.length() - 4);
        }
        catch (StringIndexOutOfBoundsException e2) {
            e2.printStackTrace();
        }
        int i = -1;
        for (int j = 0; j < arrayList.size(); ++j) {
            if (!((String[])arrayList.get(j))[0].equals(ModContainer.dealing$.talking$)) continue;
            i = j;
            break;
        }
        this.distinct$ = new GuiSlotList(this, this.field_146297_k, (int)((double)this.field_146294_l * 0.23), (int)((double)this.field_146295_m * 0.5), (int)((double)this.field_146294_l * 0.75), (int)((double)this.field_146295_m * 0.15), 12, CSmanager.cellular$._offered(ModContainer.outreach$ + "/" + "CustomSteve/models", ".pmd", ".pmx"));
        if (i != -1) {
            this.distinct$.a(i);
        }
        this.render$.func_146180_a(ModContainer.dealing$.method$);
        this.saying$ = modelName;
        if (!modelName.equals(ModContainer.dealing$.method$)) {
            // empty if block
        }
        this.sheet$ = ModContainer.dealing$.talking$;
        this.mixing$ = ModContainer.dealing$.method$;
        thumb$ = StatCollector.func_74838_a((String)"Gui.Model.Preview");
    }
}

