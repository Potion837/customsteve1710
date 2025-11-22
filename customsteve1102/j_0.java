/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.FontRenderer
 *  net.minecraft.client.gui.GuiButton
 *  org.lwjgl.opengl.GL11
 */
package customsteve;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import org.lwjgl.opengl.GL11;

/*
 * Renamed from customsteve.J
 */
public class j_0
extends GuiButton {
    public boolean a;
    private boolean b = false;

    public j_0(int par1, int par2, int par3, int par4, int par5, String par6Str, boolean checked) {
        super(par1, par2, par3, par4, par5, par6Str);
        this.a = checked;
    }

    public void func_146112_a(Minecraft par1Minecraft, int par2, int par3) {
        if (this.visible) {
            FontRenderer fontrenderer = par1Minecraft.fontRenderer;
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            int l2 = 0xE0E0E0;
            boolean bl = this.hovered = par2 >= this.x && par3 >= this.y && par2 < this.x + this.width && par3 < this.y + this.height;
            if (!this.enabled) {
                l2 = -6250336;
            } else if (this.hovered) {
                l2 = 0xFFFFA0;
            }
            int k2 = this.getHoverState(this.hovered);
            int x1 = this.x + (this.b ? 1 : 0);
            int y1 = this.y + (this.b ? 1 : 0);
            int x2 = this.x + this.width + (this.b ? 1 : 0);
            int y2 = this.y + this.height + (this.b ? 1 : 0);
            j_0.func_73734_a((int)x1, (int)y1, (int)x2, (int)y2, (int)-16777216);
            j_0.func_73734_a((int)(x1 + 1), (int)(y1 + 1), (int)(x2 - 1), (int)(y2 - 1), (int)-8355712);
            j_0.func_73734_a((int)(x1 + 2), (int)(y1 + 2), (int)(x2 - 1), (int)(y2 - 1), (int)-4144960);
            j_0.func_73734_a((int)(x1 + 2), (int)(y1 + 2), (int)(x2 - 2), (int)(y2 - 2), (int)-16777216);
            if (this.b) {
                j_0.func_73734_a((int)(x1 + 6), (int)(y1 + 6), (int)(x2 - 6), (int)(y2 - 6), (int)-8355712);
            } else if (this.a) {
                j_0.func_73734_a((int)(x1 + 6), (int)(y1 + 6), (int)(x2 - 6), (int)(y2 - 6), (int)-1);
            }
            this.mouseDragged(par1Minecraft, par2, par3);
            fontrenderer.drawStringWithShadow(this.displayString, (float)(this.x + this.width + 2), (float)(this.y + (this.height - 8) / 2), l2);
        }
    }

    public boolean mousePressed(Minecraft par1Minecraft, int par2, int par3) {
        boolean b2;
        this.b = b2 = super.mousePressed(par1Minecraft, par2, par3);
        return b2;
    }

    public boolean a() {
        this.a = !this.a;
        return this.a;
    }

    public void mouseReleased(int par1, int par2) {
        this.b = false;
        super.mouseReleased(par1, par2);
    }
}

