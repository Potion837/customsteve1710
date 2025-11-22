/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.FontRenderer
 *  net.minecraft.client.gui.GuiScreen
 */
package customsteve;

import customsteve.S;
import customsteve.l_0;
import java.util.List;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiScreen;

/*
 * Renamed from customsteve.L
 * Duplicate member names - consider using --renamedupmembers true
 */
public class l_0
extends S {
    protected List<String> a;
    protected a a;
    private String a;

    public l_0(GuiScreen parent) {
        super(parent);
    }

    public void drawScreen(int par1, int par2, float par3) {
        this.drawDefaultBackground();
        this.a.drawScreen(par1, par2, par3);
        super.drawScreen(par1, par2, par3);
    }

    @Override
    public void initGui() {
        super.initGui();
        this.a = new a(this);
    }

    public void a(List<String> text) {
        this.a = text;
    }

    static /* synthetic */ FontRenderer a(l_0 x0) {
        return x0.fontRenderer;
    }

    static /* synthetic */ FontRenderer b(l_0 x0) {
        return x0.fontRenderer;
    }
}

