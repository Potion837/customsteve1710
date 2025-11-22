/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.GuiButton
 *  net.minecraft.client.gui.GuiScreen
 */
package customsteve;

import customsteve.i_0;
import customsteve.t_0;
import java.io.IOException;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class S
extends GuiScreen {
    protected final GuiScreen a;
    protected static final int a = 0;

    public S(GuiScreen parent) {
        this.a = parent;
    }

    protected void actionPerformed(GuiButton par1GuiButton) {
        switch (par1GuiButton.id) {
            case 0: {
                i_0.a(this.a);
            }
        }
    }

    public void initGui() {
        this.buttonList.add(new GuiButton(0, (int)((double)this.width * 0.82), (int)((double)this.height * 0.035), (int)((double)this.width * 0.1), 20, "\u2190"));
    }

    public boolean doesGuiPauseGame() {
        return true;
    }

    protected void keyTyped(char par1, int par2) throws IOException {
        super.keyTyped(par1, par2);
        if (par2 == t_0.a.getKeyCode()) {
            this.mc.displayGuiScreen((GuiScreen)null);
            this.mc.setIngameFocus();
            t_0.a = false;
        }
    }

    public void onGuiClosed() {
        if (this.a != null) {
            this.a.onGuiClosed();
        }
    }
}

