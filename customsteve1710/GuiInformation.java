/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.GuiScreen
 */
import net.minecraft.client.gui.GuiScreen;

public class GuiInformation
extends GuiSubScreen {
    private PmdFileInfo monroe$;

    public GuiInformation(GuiScreen parent) {
        super(parent);
    }

    public void func_73863_a(int par1, int par2, float par3) {
        this.func_146276_q_();
        super.func_73863_a(par1, par2, par3);
        this.field_146289_q.func_78276_b(this.monroe$.menus$, (int)((double)this.field_146294_l * 0.05), (int)((double)this.field_146295_m * 0.1), 0xFFFFFF);
        this.field_146289_q.func_78279_b(this.monroe$.column$, (int)((double)this.field_146294_l * 0.05), (int)((double)this.field_146295_m * 0.2), (int)((double)this.field_146294_l * 0.8), 0xFFFFFF);
    }

    public void a(PmdFileInfo model) {
        this.monroe$ = model;
    }

    @Override
    public void func_73866_w_() {
        super.func_73866_w_();
    }

    @Override
    public void func_146281_b() {
        this.a.func_146281_b();
        super.func_146281_b();
    }
}

