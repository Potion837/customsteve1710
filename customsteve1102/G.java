/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.FontRenderer
 *  net.minecraft.client.gui.GuiScreen
 */
package customsteve;

import customsteve.G;
import customsteve.S;
import java.util.List;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiScreen;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class G
extends S {
    protected List<String> a;
    protected a a;
    private String a;

    public G(GuiScreen parent, String text) {
        super(parent);
        this.a = text;
    }

    public G(GuiScreen parent, List<String> texts) {
        super(parent);
        this.a = texts;
    }

    public void drawScreen(int par1, int par2, float par3) {
        this.drawDefaultBackground();
        this.a.drawScreen(par1, par2, par3);
        super.drawScreen(par1, par2, par3);
    }

    @Override
    public void initGui() {
        super.initGui();
        if (this.a != null) {
            this.a = G.a(this.a);
            this.a = this.fontRenderer.listFormattedStringToWidth(this.a, (int)((double)this.width * 0.8));
        }
        this.a = new a(this);
    }

    private static String a(String par1Str) {
        while (par1Str != null && par1Str.endsWith("\n")) {
            par1Str = par1Str.substring(0, par1Str.length() - 1);
        }
        return par1Str;
    }

    static /* synthetic */ FontRenderer a(G x0) {
        return x0.fontRenderer;
    }

    static /* synthetic */ FontRenderer b(G x0) {
        return x0.fontRenderer;
    }
}

