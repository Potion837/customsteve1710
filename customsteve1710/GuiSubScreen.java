/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.GuiButton
 *  net.minecraft.client.gui.GuiScreen
 */
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;

public abstract class GuiSubScreen
extends GuiScreen {
    protected final GuiScreen finite$;
    protected static final int topic$ = 0;

    public GuiSubScreen(GuiScreen parent) {
        this.finite$ = parent;
    }

    protected void func_146284_a(GuiButton par1GuiButton) {
        switch (par1GuiButton.field_146127_k) {
            case 0: {
                GuiBaseScreen.a(this.finite$);
            }
        }
    }

    public void func_73866_w_() {
        this.field_146292_n.add(new GuiButton(0, (int)((double)this.field_146294_l * 0.82), (int)((double)this.field_146295_m * 0.035), (int)((double)this.field_146294_l * 0.1), 20, "\u2190"));
    }

    public boolean func_73868_f() {
        return true;
    }

    protected void func_73869_a(char par1, int par2) {
        super.func_73869_a(par1, par2);
        if (par2 == KeyInputHandler.a.func_151463_i()) {
            this.field_146297_k.func_147108_a((GuiScreen)null);
            this.field_146297_k.func_71381_h();
            KeyInputHandler.a = false;
        }
    }

    public void func_146281_b() {
        if (this.finite$ != null) {
            this.finite$.func_146281_b();
        }
    }
}

