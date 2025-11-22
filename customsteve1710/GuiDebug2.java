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

public class GuiDebug2
extends GuiSubScreen {
    protected List girls$;
    protected GuiDebug weblogs$;
    private String speeds$;

    public GuiDebug2(GuiScreen parent) {
        super(parent);
    }

    public void func_73863_a(int par1, int par2, float par3) {
        this.func_146276_q_();
        this.weblogs$.func_148128_a(par1, par2, par3);
        super.func_73863_a(par1, par2, par3);
    }

    @Override
    public void func_73866_w_() {
        super.func_73866_w_();
        this.weblogs$ = new GuiDebug(this);
    }

    public void a(List text) {
        this.girls$ = text;
    }

    static /* synthetic */ FontRenderer a(GuiDebug2 x0) {
        return x0.field_146289_q;
    }

    static /* synthetic */ FontRenderer b(GuiDebug2 x0) {
        return x0.field_146289_q;
    }
}

