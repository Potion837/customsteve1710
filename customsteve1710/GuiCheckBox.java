/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.FontRenderer
 *  net.minecraft.client.gui.GuiButton
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import org.lwjgl.opengl.GL11;

public class GuiCheckBox
extends GuiButton {
    public boolean choice$;
    private boolean stays$ = false;

    public GuiCheckBox(int par1, int par2, int par3, int par4, int par5, String par6Str, boolean checked) {
        super(par1, par2, par3, par4, par5, par6Str);
        this.choice$ = checked;
    }

    public void func_146112_a(Minecraft par1Minecraft, int par2, int par3) {
        if (this.field_146125_m) {
            FontRenderer fontrenderer = par1Minecraft.field_71466_p;
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            int l = 0xE0E0E0;
            boolean bl2 = this.field_146123_n = par2 >= this.field_146128_h && par3 >= this.field_146129_i && par2 < this.field_146128_h + this.field_146120_f && par3 < this.field_146129_i + this.field_146121_g;
            if (!this.field_146124_l) {
                l = -6250336;
            } else if (this.field_146123_n) {
                l = 0xFFFFA0;
            }
            int k = this.func_146114_a(this.field_146123_n);
            int x1 = this.field_146128_h + (this.stays$ ? 1 : 0);
            int y1 = this.field_146129_i + (this.stays$ ? 1 : 0);
            int x2 = this.field_146128_h + this.field_146120_f + (this.stays$ ? 1 : 0);
            int y2 = this.field_146129_i + this.field_146121_g + (this.stays$ ? 1 : 0);
            GuiCheckBox.func_73734_a((int)x1, (int)y1, (int)x2, (int)y2, (int)-16777216);
            GuiCheckBox.func_73734_a((int)(x1 + 1), (int)(y1 + 1), (int)(x2 - 1), (int)(y2 - 1), (int)-8355712);
            GuiCheckBox.func_73734_a((int)(x1 + 2), (int)(y1 + 2), (int)(x2 - 1), (int)(y2 - 1), (int)-4144960);
            GuiCheckBox.func_73734_a((int)(x1 + 2), (int)(y1 + 2), (int)(x2 - 2), (int)(y2 - 2), (int)-16777216);
            if (this.stays$) {
                GuiCheckBox.func_73734_a((int)(x1 + 6), (int)(y1 + 6), (int)(x2 - 6), (int)(y2 - 6), (int)-8355712);
            } else if (this.choice$) {
                GuiCheckBox.func_73734_a((int)(x1 + 6), (int)(y1 + 6), (int)(x2 - 6), (int)(y2 - 6), (int)-1);
            }
            this.func_146119_b(par1Minecraft, par2, par3);
            fontrenderer.func_78261_a(this.field_146126_j, this.field_146128_h + this.field_146120_f + 2, this.field_146129_i + (this.field_146121_g - 8) / 2, l);
        }
    }

    public boolean func_146116_c(Minecraft par1Minecraft, int par2, int par3) {
        boolean b2;
        this.stays$ = b2 = super.func_146116_c(par1Minecraft, par2, par3);
        return b2;
    }

    public boolean a() {
        this.choice$ = !this.choice$;
        return this.choice$;
    }

    public void func_146118_a(int par1, int par2) {
        this.stays$ = false;
        super.func_146118_a(par1, par2);
    }
}

