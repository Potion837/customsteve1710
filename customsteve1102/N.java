/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.GuiScreen
 */
package customsteve;

import customsteve.S;
import customsteve.ac;
import net.minecraft.client.gui.GuiScreen;

public class N
extends S {
    private ac a;

    public N(GuiScreen parent) {
        super(parent);
    }

    public void drawScreen(int par1, int par2, float par3) {
        this.drawDefaultBackground();
        super.drawScreen(par1, par2, par3);
        this.fontRenderer.drawString(this.a.a, (int)((double)this.width * 0.05), (int)((double)this.height * 0.1), 0xFFFFFF);
        this.fontRenderer.drawSplitString(this.a.b, (int)((double)this.width * 0.05), (int)((double)this.height * 0.2), (int)((double)this.width * 0.8), 0xFFFFFF);
    }

    public void a(ac model) {
        this.a = model;
    }

    @Override
    public void initGui() {
        super.initGui();
    }

    @Override
    public void onGuiClosed() {
        this.a.onGuiClosed();
        super.onGuiClosed();
    }
}

