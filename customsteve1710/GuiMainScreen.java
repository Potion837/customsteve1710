/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.GuiButton
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.util.StatCollector
 */
import java.util.ArrayList;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.StatCollector;

public class GuiMainScreen
extends GuiBaseScreen {
    private static final String nowhere$ = "CustomSteve is Copyright 2014 by ici2cc(also ici2cc.com owner\u3002 email:fengxingssdua@yeah.net)";
    private static final int wright$ = 1;
    private static final int jones$ = 2;
    private static final int brochure$ = 3;
    private static final int rubber$ = 10;
    private static final int northern$ = 11;
    private static final int alter$ = 12;
    private static final int sauce$ = 20;
    private static final int colombia$ = 21;
    private static final int towards$ = 22;
    private static final int portal$ = 23;
    private static final int wives$ = 24;
    private static final int cattle$ = 30;
    private static final int amazing$ = 43;
    private static final int women$ = 44;
    private static final int fighting$ = 45;
    private static final int expires$ = 47;
    private static final int belief$ = 48;
    private static final int oregon$ = 49;
    private static final int share$ = 50;
    private static final int tooth$ = 51;
    private static final int shade$ = 52;
    private static final int winning$ = 53;
    private static final int mailed$ = 54;
    private GuiButton argument$;
    private GuiButton economy$;
    private GuiButton jimmy$;
    private GuiButton cases$;
    private GuiButton analyst$;
    private GuiButton politics$;
    private GuiButton complete$;
    private GuiButton spirit$;
    private GuiButton auction$;
    private GuiButton fuzzy$;
    private GuiGestures overseas$;
    private GuiAnimation2 painting$;
    private GuiConfig value$;
    private GuiResourceManager dozen$;
    private GuiDebug2 forward$;
    private GuiModelSelect seattle$;
    private GuiAbout2 directly$;

    public GuiMainScreen(GuiScreen parent) {
        super(parent);
    }

    @Override
    public void func_73863_a(int par1, int par2, float par3) {
        this.fuzzy$.field_146124_l = Config.scored$;
        this.auction$.field_146124_l = Config.scored$;
        super.func_73863_a(par1, par2, par3);
    }

    protected void func_146284_a(GuiButton par1GuiButton) {
        this.a = true;
        switch (par1GuiButton.field_146127_k) {
            case 1: {
                this.field_146297_k.func_147108_a((GuiScreen)null);
                this.field_146297_k.func_71381_h();
                break;
            }
            case 2: {
                if (this.directly$ == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(StatCollector.func_74838_a((String)"Gui.Main.HelpTitle")).append('\n').append('\n');
                    sb.append(StatCollector.func_74838_a((String)"Gui.Main.Help1")).append('\n');
                    sb.append(StatCollector.func_74838_a((String)"Gui.Main.Help2")).append('\n');
                    sb.append(StatCollector.func_74838_a((String)"Gui.Main.Help3")).append('\n').append('\n');
                    sb.append(StatCollector.func_74838_a((String)"Gui.Main.Help10")).append('\n');
                    sb.append(StatCollector.func_74838_a((String)"Gui.Main.Help11")).append('\n');
                    sb.append(StatCollector.func_74838_a((String)"Gui.Main.Help12")).append('\n');
                    sb.append(StatCollector.func_74838_a((String)"Gui.Main.Help13")).append('\n');
                    sb.append(StatCollector.func_74838_a((String)"Gui.Main.Help15")).append('\n');
                    sb.append(StatCollector.func_74838_a((String)"Gui.Main.Help16")).append('\n');
                    sb.append(StatCollector.func_74838_a((String)"Gui.Main.Help17")).append('\n');
                    sb.append(StatCollector.func_74838_a((String)"Gui.Main.Help18")).append('\n');
                    sb.append(StatCollector.func_74838_a((String)"Gui.Main.Help19")).append('\n').append('\n');
                    sb.append(StatCollector.func_74838_a((String)"Gui.Main.Help50")).append('\n');
                    sb.append(StatCollector.func_74838_a((String)"Gui.Main.Help51")).append('\n');
                    sb.append(StatCollector.func_74838_a((String)"Gui.Main.Help52")).append('\n');
                    sb.append(StatCollector.func_74838_a((String)"Gui.Main.Help53")).append('\n');
                    sb.append(StatCollector.func_74838_a((String)"Gui.Main.Help54")).append('\n');
                    sb.append(StatCollector.func_74838_a((String)"Gui.Main.Help55")).append('\n');
                    sb.append(StatCollector.func_74838_a((String)"Gui.Main.Help56")).append('\n');
                    sb.append(StatCollector.func_74838_a((String)"Gui.Main.Help57")).append('\n');
                    sb.append(StatCollector.func_74838_a((String)"Gui.Main.Help58")).append('\n').append('\n');
                    sb.append(StatCollector.func_74838_a((String)"Gui.Main.Help100")).append('\n');
                    sb.append(StatCollector.func_74838_a((String)"Gui.Main.Help101")).append('\n');
                    sb.append(StatCollector.func_74838_a((String)"Gui.Main.Help102")).append('\n');
                    sb.append(StatCollector.func_74838_a((String)"Gui.Main.Help103")).append('\n');
                    sb.append(StatCollector.func_74838_a((String)"Gui.Main.Help104")).append('\n');
                    sb.append(StatCollector.func_74838_a((String)"Gui.Main.Help105")).append('\n');
                    sb.append(StatCollector.func_74838_a((String)"Gui.Main.Help106")).append('\n');
                    sb.append(StatCollector.func_74838_a((String)"Gui.Main.Help107")).append('\n');
                    sb.append(StatCollector.func_74838_a((String)"Gui.Main.Help108")).append('\n');
                    sb.append(StatCollector.func_74838_a((String)"Gui.Main.Help109")).append('\n');
                    sb.append(StatCollector.func_74838_a((String)"Gui.Main.Help110")).append('\n').append('\n');
                    sb.append(StatCollector.func_74838_a((String)"Gui.Main.Help200")).append('\n');
                    sb.append(StatCollector.func_74838_a((String)"Gui.Main.Help201"));
                    this.directly$ = new GuiAbout2((GuiScreen)this, sb.toString());
                }
                GuiMainScreen.a(this.directly$);
                break;
            }
            case 3: {
                this.a();
                P202_PlayerInfomationUpdate packet = new P202_PlayerInfomationUpdate();
                packet.ferrari$ = Config.scored$;
                packet.betting$ = CSmanager.cellular$.trucks$.medline$;
                ModContainer.array$.a(Minecraft.func_71410_x().field_71439_g.field_71174_a.func_147298_b(), packet);
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
                if (this.seattle$ == null) {
                    this.seattle$ = new GuiModelSelect(this);
                }
                GuiMainScreen.a(this.seattle$);
                break;
            }
            case 54: {
                if (this.overseas$ == null) {
                    this.overseas$ = new GuiGestures(this);
                }
                GuiMainScreen.a(this.overseas$);
                break;
            }
            case 45: {
                if (this.painting$ == null) {
                    this.painting$ = new GuiAnimation2(this);
                }
                GuiMainScreen.a(this.painting$);
                break;
            }
            case 48: {
                if (this.dozen$ == null) {
                    this.dozen$ = new GuiResourceManager(this);
                }
                GuiMainScreen.a(this.dozen$);
                break;
            }
            case 49: {
                if (this.forward$ == null) {
                    this.forward$ = new GuiDebug2(this);
                }
                ArrayList arrayList = new ArrayList(CSmanager.cellular$.choose$);
                this.forward$.a(arrayList);
                GuiMainScreen.a(this.forward$);
                break;
            }
            case 47: {
                if (this.value$ == null) {
                    this.value$ = new GuiConfig(this);
                }
                GuiMainScreen.a(this.value$);
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
        if (Config.scored$) {
            if (CSmanager.cellular$.trucks$ != null) {
                for (int i = 0; i < CSmanager.cellular$.browsing$.size(); ++i) {
                    if (!((CSplayerMP)CSmanager.cellular$.browsing$.get((int)i)).lucas$.equals(CSmanager.cellular$.trucks$.loans$)) continue;
                    CSmanager.cellular$.browsing$.remove(i);
                    break;
                }
                CSmanager.cellular$.keith$._lenses();
                CSmanager.cellular$._audience(CSmanager.cellular$.trucks$);
            }
        } else if (Minecraft.func_71410_x().field_71439_g != null) {
            CSplayer cSplayer = CSmanager.cellular$._reload(Minecraft.func_71410_x().field_71439_g.func_70005_c_(), false);
        }
        Config.scored$ = !Config.scored$;
    }

    public void func_73866_w_() {
        super.func_73866_w_();
        this.field_146292_n.add(new GuiButton(1, (int)((double)this.field_146294_l * 0.89), (int)((double)this.field_146295_m * 0.035), (int)((double)this.field_146294_l * 0.05), 20, "X"));
        this.field_146292_n.add(new GuiButton(2, (int)((double)this.field_146294_l * 0.82), (int)((double)this.field_146295_m * 0.035), (int)((double)this.field_146294_l * 0.05), 20, "?"));
        this.cases$ = new GuiButton(3, (int)((double)this.field_146294_l * 0.75), (int)((double)this.field_146295_m * 0.035), (int)((double)this.field_146294_l * 0.05), 20, "E");
        this.field_146292_n.add(this.cases$);
        this.auction$ = new GuiButton(44, (int)((double)this.field_146294_l * 0.8), (int)((double)this.field_146295_m * 0.15), (int)((double)this.field_146294_l * 0.18), 20, StatCollector.func_74838_a((String)"Gui.Main.Model"));
        this.field_146292_n.add(this.auction$);
        this.fuzzy$ = new GuiButton(45, (int)((double)this.field_146294_l * 0.8), (int)((double)this.field_146295_m * 0.25), (int)((double)this.field_146294_l * 0.18), 20, StatCollector.func_74838_a((String)"Gui.Main.Animation"));
        this.field_146292_n.add(this.fuzzy$);
        this.field_146292_n.add(new GuiButton(54, (int)((double)this.field_146294_l * 0.8), (int)((double)this.field_146295_m * 0.35), (int)((double)this.field_146294_l * 0.18), 20, StatCollector.func_74838_a((String)"Gui.Gesture.Title")));
        this.field_146292_n.add(new GuiButton(47, (int)((double)this.field_146294_l * 0.8), (int)((double)this.field_146295_m * 0.45), (int)((double)this.field_146294_l * 0.18), 20, StatCollector.func_74838_a((String)"Gui.Main.Config")));
        this.field_146292_n.add(new GuiButton(49, (int)((double)this.field_146294_l * 0.8), (int)((double)this.field_146295_m * 0.55), (int)((double)this.field_146294_l * 0.18), 20, StatCollector.func_74838_a((String)"Debug")));
    }
}

