/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.Gui
 *  net.minecraft.client.gui.GuiButton
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.renderer.Tessellator
 *  org.lwjgl.opengl.GL11
 */
package customsteve;

import java.util.ArrayList;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.Tessellator;
import org.lwjgl.opengl.GL11;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from customsteve.R
 */
public class r_0
extends Gui {
    private Minecraft a;
    private GuiScreen a;
    private ArrayList<String[]> a;
    private int i = -1;
    public int a;
    private int j;
    private int k;
    int b;
    int c;
    int d;
    int e;
    protected final int f;
    private int l;
    private int m;
    protected int g;
    protected int h;
    private boolean a;
    private float b;
    private float c;
    float a;
    private int n = -1;
    private long a = false;
    private boolean b = true;
    private boolean c;
    private int o;

    public r_0(GuiScreen parentScreen, Minecraft par1Minecraft, int width, int height, int left, int top, int slotHeight, ArrayList<String[]> list) {
        this.a = parentScreen;
        this.a = par1Minecraft;
        this.j = width;
        this.k = height;
        this.b = top;
        this.c = top + height;
        this.f = slotHeight;
        this.e = left;
        this.d = left + width;
        if (this.a == null) {
            this.a = list;
        }
    }

    protected int a() {
        return this.a.size();
    }

    protected void a(int i2, boolean flag) {
        if (!flag && i2 != this.i) {
            this.a = 0;
            this.i = i2;
        }
        if (flag && i2 == this.i && this.a == 0) {
            this.a = 1;
        }
    }

    public void a(int i2) {
        this.i = i2;
    }

    protected boolean a(int i2) {
        return this.i == i2;
    }

    protected void a() {
    }

    protected void a(int i2, int j2, int k2, int l2) {
        this.a.fontRenderer.drawStringWithShadow(((String[])this.a.get(i2))[0], (float)(j2 + 3), (float)k2, 0xFFFFFF);
    }

    public String[] a() {
        return this.i != -1 ? (String[])this.a.get(this.i) : null;
    }

    public void a(boolean par1) {
        this.b = par1;
    }

    protected void a(boolean par1, int par2) {
        this.c = par1;
        this.o = par2;
        if (!par1) {
            this.o = 0;
        }
    }

    protected int b() {
        return this.a() * this.f + this.o;
    }

    protected void a(int par1, int par2, Tessellator par3Tessellator) {
    }

    protected void a(int par1, int par2) {
    }

    protected void b(int par1, int par2) {
    }

    public int a(int par1, int par2) {
        int k2 = this.e;
        int l2 = this.d;
        int i1 = par2 - this.b - this.o + (int)this.a - 4;
        int j1 = i1 / this.f;
        return par1 >= k2 && par1 <= l2 && j1 >= 0 && i1 >= 0 && j1 < this.a() ? j1 : -1;
    }

    public void c(int par1, int par2) {
        this.l = par1;
        this.m = par2;
    }

    private void b() {
        int i2 = this.c();
        if (i2 < 0) {
            i2 /= 2;
        }
        if (this.a < 0.0f) {
            this.a = 0.0f;
        }
        if (this.a > (float)i2) {
            this.a = i2;
        }
    }

    public int c() {
        return this.b() - (this.c - this.b - 4);
    }

    public void b(int par1) {
        this.a += (float)par1;
        this.b();
        this.b = -2.0f;
    }

    public void a(GuiButton par1GuiButton) {
        if (par1GuiButton.enabled) {
            if (par1GuiButton.id == this.l) {
                this.a -= (float)(this.f * 2 / 3);
                this.b = -2.0f;
                this.b();
            } else if (par1GuiButton.id == this.m) {
                this.a += (float)(this.f * 2 / 3);
                this.b = -2.0f;
                this.b();
            }
        }
    }

    public void a(int x, int y, int m2) {
        if (m2 == 2) {
            this.i = -1;
        } else if (m2 == 1) {
            this.g = x;
            this.h = y;
            this.a = true;
            if (this.b == -1.0f && x >= this.e && y >= this.b && y <= this.c) {
                int k2 = this.e;
                int j1 = this.d;
                int k1 = y - this.b - this.o + (int)this.a - 4;
                int l1 = k1 / this.f;
                if (x >= k2 && x <= j1 && l1 >= 0 && k1 >= 0 && l1 < this.a()) {
                    boolean flag1 = l1 == this.n && Minecraft.getSystemTime() - this.a < 250L;
                    this.a(l1, flag1);
                    this.n = l1;
                    this.a = Minecraft.getSystemTime();
                }
            }
        }
    }

    public void b(int x, int y, int m2) {
        if (m2 == 1) {
            this.a = false;
        }
    }

    public void a(int par1, int par2, float par3, int borderColor) {
        int i3;
        int i2;
        int j2;
        int l1;
        int k1;
        int j1;
        int k2 = this.a();
        int l2 = this.d();
        int i1 = l2 + 6;
        if (this.a) {
            if (this.b == -1.0f) {
                boolean flag = true;
                if (par1 >= this.e && par2 >= this.b && par2 <= this.c) {
                    int k22 = this.e;
                    j1 = this.d;
                    k1 = par2 - this.b - this.o + (int)this.a - 4;
                    l1 = k1 / this.f;
                    if ((par1 < k22 || par1 > j1 || l1 < 0 || k1 < 0 || l1 >= k2) && par1 >= k22 && par1 <= j1 && k1 < 0) {
                        this.a(par1 - k22, par2 - this.b + (int)this.a - 4);
                        flag = false;
                    }
                    if (par1 >= l2 && par1 <= i1) {
                        this.c = -1.0f;
                        j2 = this.c();
                        if (j2 < 1) {
                            j2 = 1;
                        }
                        if ((i2 = (int)((float)((this.c - this.b) * (this.c - this.b)) / (float)this.b())) < 32) {
                            i2 = 32;
                        }
                        if (i2 > this.c - this.b - 8) {
                            i2 = this.c - this.b - 8;
                        }
                        this.c /= (float)(this.c - this.b - i2) / (float)j2;
                    } else {
                        this.c = 1.0f;
                    }
                    this.b = flag ? (float)par2 : -2.0f;
                } else {
                    this.b = -2.0f;
                }
            } else if (this.b >= 0.0f) {
                this.a -= ((float)par2 - this.b) * this.c;
                this.b = par2;
            }
        } else {
            this.b = -1.0f;
        }
        this.b();
        GL11.glDisable((int)2896);
        GL11.glDisable((int)2912);
        Tessellator tessellator = Tessellator.getInstance();
        this.a(tessellator);
        j1 = this.e;
        k1 = this.b + 4 - (int)this.a;
        if (this.c) {
            this.a(j1, k1, tessellator);
        }
        for (l1 = 0; l1 < k2; ++l1) {
            j2 = k1 + l1 * this.f + this.o;
            i2 = this.f - 4;
            if (j2 > this.c || j2 + i2 < this.b || j2 + i2 > this.c || j2 < this.b) continue;
            if (this.b && this.a(l1)) {
                i3 = this.e;
                int j3 = this.d;
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                GL11.glDisable((int)3553);
                GL11.glBegin((int)7);
                this.c(0x808080);
                this.a(i3, j2 + i2 + 2, 0.0, 0.0, 1.0);
                this.a(j3, j2 + i2 + 2, 0.0, 1.0, 1.0);
                this.a(j3, j2 - 2, 0.0, 1.0, 0.0);
                this.a(i3, j2 - 2, 0.0, 0.0, 0.0);
                this.c(0);
                this.a(i3 + 1, j2 + i2 + 1, 0.0, 0.0, 1.0);
                this.a(j3 - 1, j2 + i2 + 1, 0.0, 1.0, 1.0);
                this.a(j3 - 1, j2 - 1, 0.0, 1.0, 0.0);
                this.a(i3 + 1, j2 - 1, 0.0, 0.0, 0.0);
                GL11.glEnd();
                GL11.glEnable((int)3553);
            }
            this.a(l1, j1, j2, i2);
        }
        r_0.drawRect((int)(this.e - 1), (int)(this.b - 1), (int)this.e, (int)(this.c + 1), (int)borderColor);
        r_0.drawRect((int)this.d, (int)(this.b - 1), (int)(this.d + 7), (int)(this.c + 1), (int)borderColor);
        r_0.drawRect((int)(this.e - 1), (int)(this.b - 1), (int)(this.d + 7), (int)this.b, (int)borderColor);
        r_0.drawRect((int)(this.e - 1), (int)this.c, (int)(this.d + 7), (int)(this.c + 1), (int)borderColor);
        GL11.glDisable((int)2929);
        int b0 = 4;
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glDisable((int)3008);
        GL11.glShadeModel((int)7425);
        GL11.glDisable((int)3553);
        GL11.glBegin((int)7);
        this.c(0);
        this.a(this.e, this.b + b0, 0.0, 0.0, 1.0);
        this.a(this.d, this.b + b0, 0.0, 1.0, 1.0);
        this.c(0);
        this.a(this.d, this.b, 0.0, 1.0, 0.0);
        this.a(this.e, this.b, 0.0, 0.0, 0.0);
        GL11.glEnd();
        GL11.glBegin((int)7);
        this.c(0);
        this.a(this.e, this.c, 0.0, 0.0, 1.0);
        this.a(this.d, this.c, 0.0, 1.0, 1.0);
        this.c(0);
        this.a(this.d, this.c - b0, 0.0, 1.0, 0.0);
        this.a(this.e, this.c - b0, 0.0, 0.0, 0.0);
        GL11.glEnd();
        j2 = this.c();
        if (j2 > 0) {
            i2 = (this.c - this.b) * (this.c - this.b) / this.b();
            if (i2 < 32) {
                i2 = 32;
            }
            if (i2 > this.c - this.b - 8) {
                i2 = this.c - this.b - 8;
            }
            if ((i3 = (int)this.a * (this.c - this.b - i2) / j2 + this.b) < this.b) {
                i3 = this.b;
            }
            GL11.glBegin((int)7);
            this.c(0);
            this.a(l2, this.c, 0.0, 0.0, 1.0);
            this.a(i1, this.c, 0.0, 1.0, 1.0);
            this.a(i1, this.b, 0.0, 1.0, 0.0);
            this.a(l2, this.b, 0.0, 0.0, 0.0);
            GL11.glEnd();
            GL11.glBegin((int)7);
            this.c(0x808080);
            this.a(l2, i3 + i2, 0.0, 0.0, 1.0);
            this.a(i1, i3 + i2, 0.0, 1.0, 1.0);
            this.a(i1, i3, 0.0, 1.0, 0.0);
            this.a(l2, i3, 0.0, 0.0, 0.0);
            GL11.glEnd();
            GL11.glBegin((int)7);
            this.c(0xC0C0C0);
            this.a(l2, i3 + i2 - 1, 0.0, 0.0, 1.0);
            this.a(i1 - 1, i3 + i2 - 1, 0.0, 1.0, 1.0);
            this.a(i1 - 1, i3, 0.0, 1.0, 0.0);
            this.a(l2, i3, 0.0, 0.0, 0.0);
            GL11.glEnd();
        }
        this.b(par1, par2);
        GL11.glEnable((int)3553);
        GL11.glShadeModel((int)7424);
        GL11.glEnable((int)3008);
        GL11.glDisable((int)3042);
    }

    private void c(int i2) {
        int j2 = i2 >> 16 & 0xFF;
        int k2 = i2 >> 8 & 0xFF;
        int l2 = i2 & 0xFF;
        GL11.glColor4f((float)((float)j2 / 255.0f), (float)((float)k2 / 255.0f), (float)((float)l2 / 255.0f), (float)255.0f);
    }

    private void a(double x, double y, double z, double U2, double V2) {
        GL11.glTexCoord2d((double)U2, (double)V2);
        GL11.glVertex3d((double)x, (double)y, (double)z);
    }

    protected int d() {
        return this.d;
    }

    private void a(Tessellator tess) {
        Gui.drawRect((int)this.e, (int)this.b, (int)this.d, (int)this.c, (int)0x60000000);
    }
}

