/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.GuiSlot
 *  net.minecraft.client.renderer.Tessellator
 */
import net.minecraft.client.gui.GuiSlot;
import net.minecraft.client.renderer.Tessellator;

class GuiDebug
extends GuiSlot {
    final GuiDebug2 concepts$;

    public GuiDebug(GuiDebug2 parent) {
        super(parent.field_146297_k, parent.field_146294_l, parent.field_146295_m, 0, parent.field_146295_m, GuiDebug2.a((GuiDebug2)parent).field_78288_b + 1);
        this.concepts$ = parent;
    }

    protected int func_148127_b() {
        return this.concepts$.girls$.size();
    }

    protected boolean func_148131_a(int i) {
        return false;
    }

    protected void func_148123_a() {
    }

    protected int func_148137_d() {
        return this.concepts$.field_146294_l - 10;
    }

    protected void a(Tessellator tess) {
    }

    protected void func_148144_a(int var1, boolean var2, int var3, int var4) {
    }

    protected void func_148126_a(int var1, int var2, int var3, int var4, Tessellator var5, int var6, int var7) {
        GuiDebug2.b(this.concepts$).func_78276_b((String)this.concepts$.girls$.get(var1), (int)((double)this.concepts$.field_146294_l * 0.1), var3, 0xFFFFFF);
    }
}

