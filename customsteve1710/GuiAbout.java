/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.GuiSlot
 *  net.minecraft.client.renderer.Tessellator
 */
import net.minecraft.client.gui.GuiSlot;
import net.minecraft.client.renderer.Tessellator;

class GuiAbout
extends GuiSlot {
    final GuiAbout2 ignored$;

    public GuiAbout(GuiAbout2 parent) {
        super(parent.field_146297_k, parent.field_146294_l, parent.field_146295_m, (int)((double)parent.field_146295_m * 0.2), (int)((double)parent.field_146295_m * 0.8), GuiAbout2.a((GuiAbout2)parent).field_78288_b + 1);
        this.ignored$ = parent;
    }

    protected int func_148127_b() {
        return this.ignored$.phrases$.size();
    }

    protected boolean func_148131_a(int i) {
        return false;
    }

    protected void func_148123_a() {
    }

    protected int func_148137_d() {
        return this.ignored$.field_146294_l - 10;
    }

    protected void a(Tessellator tess) {
    }

    protected void func_148144_a(int var1, boolean var2, int var3, int var4) {
    }

    protected void func_148126_a(int var1, int var2, int var3, int var4, Tessellator var5, int var6, int var7) {
        GuiAbout2.b(this.ignored$).func_78276_b((String)this.ignored$.phrases$.get(var1), (int)((double)this.ignored$.field_146294_l * 0.1), var3, 0xFFFFFF);
    }
}

