/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.FontRenderer
 *  net.minecraft.client.gui.GuiScreen
 */
import java.util.List;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiScreen;

public class GuiAbout2
extends GuiSubScreen {
    protected List phrases$;
    protected GuiAbout casio$;
    private String looked$;

    public GuiAbout2(GuiScreen parent, String text) {
        super(parent);
        this.looked$ = text;
    }

    public GuiAbout2(GuiScreen parent, List texts) {
        super(parent);
        this.phrases$ = texts;
    }

    public void func_73863_a(int par1, int par2, float par3) {
        this.func_146276_q_();
        this.casio$.func_148128_a(par1, par2, par3);
        super.func_73863_a(par1, par2, par3);
    }

    @Override
    public void func_73866_w_() {
        super.func_73866_w_();
        if (this.looked$ != null) {
            this.looked$ = GuiAbout2.a(this.looked$);
            this.phrases$ = this.field_146289_q.func_78271_c(this.looked$, (int)((double)this.field_146294_l * 0.8));
        }
        this.casio$ = new GuiAbout(this);
    }

    private static String a(String par1Str) {
        while (par1Str != null && par1Str.endsWith("\n")) {
            par1Str = par1Str.substring(0, par1Str.length() - 1);
        }
        return par1Str;
    }

    static /* synthetic */ FontRenderer a(GuiAbout2 x0) {
        return x0.field_146289_q;
    }

    static /* synthetic */ FontRenderer b(GuiAbout2 x0) {
        return x0.field_146289_q;
    }
}

