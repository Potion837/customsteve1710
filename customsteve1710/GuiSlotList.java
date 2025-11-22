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
import java.util.ArrayList;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.Tessellator;
import org.lwjgl.opengl.GL11;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class GuiSlotList
extends Gui {
    private Minecraft greatly$;
    private GuiScreen social$;
    private ArrayList totals$ = null;
    private int linux$ = -1;
    public int daddy$ = 0;
    private int loving$;
    private int received$;
    int revised$;
    int simon$;
    int smile$;
    int entering$;
    protected final int bizarre$;
    private int genesis$;
    private int ashley$;
    protected int papers$;
    protected int disabled$;
    private boolean yamaha$ = false;
    private float transfer$ = -2.0f;
    private float hoping$;
    float decide$;
    private int chassis$ = -1;
    private long mongolia$;
    private boolean linking$ = true;
    private boolean shape$;
    private int glenn$;

    public GuiSlotList(GuiScreen parentScreen, Minecraft par1Minecraft, int width, int height, int left, int top, int slotHeight, ArrayList list) {
        this.social$ = parentScreen;
        this.greatly$ = par1Minecraft;
        this.loving$ = width;
        this.received$ = height;
        this.revised$ = top;
        this.simon$ = top + height;
        this.bizarre$ = slotHeight;
        this.entering$ = left;
        this.smile$ = left + width;
        if (this.totals$ == null) {
            this.totals$ = list;
        }
    }

    protected int a() {
        return this.totals$.size();
    }

    protected void a(int i, boolean flag) {
        if (!flag && i != this.linux$) {
            this.daddy$ = 0;
            this.linux$ = i;
        }
        if (flag && i == this.linux$ && this.daddy$ == 0) {
            this.daddy$ = 1;
        }
    }

    public void a(int i) {
        this.linux$ = i;
    }

    protected boolean a(int i) {
        return this.linux$ == i;
    }

    protected void a() {
    }

    protected void a(int i, int j, int k, int l) {
        this.greatly$.field_71466_p.func_78261_a(((String[])this.totals$.get(i))[0], j + 3, k, 0xFFFFFF);
    }

    public String[] a() {
        return this.linux$ != -1 ? (String[])this.totals$.get(this.linux$) : null;
    }

    public void a(boolean par1) {
        this.linking$ = par1;
    }

    protected void a(boolean par1, int par2) {
        this.shape$ = par1;
        this.glenn$ = par2;
        if (!par1) {
            this.glenn$ = 0;
        }
    }

    protected int b() {
        return this.a() * this.bizarre$ + this.glenn$;
    }

    protected void a(int par1, int par2, Tessellator par3Tessellator) {
    }

    protected void a(int par1, int par2) {
    }

    protected void b(int par1, int par2) {
    }

    public int a(int par1, int par2) {
        int k = this.entering$;
        int l = this.smile$;
        int i1 = par2 - this.revised$ - this.glenn$ + (int)this.decide$ - 4;
        int j1 = i1 / this.bizarre$;
        return par1 >= k && par1 <= l && j1 >= 0 && i1 >= 0 && j1 < this.a() ? j1 : -1;
    }

    public void c(int par1, int par2) {
        this.genesis$ = par1;
        this.ashley$ = par2;
    }

    private void b() {
        int i = this.c();
        if (i < 0) {
            i /= 2;
        }
        if (this.decide$ < 0.0f) {
            this.decide$ = 0.0f;
        }
        if (this.decide$ > (float)i) {
            this.decide$ = i;
        }
    }

    public int c() {
        return this.b() - (this.simon$ - this.revised$ - 4);
    }

    public void b(int par1) {
        this.decide$ += (float)par1;
        this.b();
        this.transfer$ = -2.0f;
    }

    public void a(GuiButton par1GuiButton) {
        if (par1GuiButton.field_146124_l) {
            if (par1GuiButton.field_146127_k == this.genesis$) {
                this.decide$ -= (float)(this.bizarre$ * 2 / 3);
                this.transfer$ = -2.0f;
                this.b();
            } else if (par1GuiButton.field_146127_k == this.ashley$) {
                this.decide$ += (float)(this.bizarre$ * 2 / 3);
                this.transfer$ = -2.0f;
                this.b();
            }
        }
    }

    public void a(int x, int y, int m) {
        if (m == 2) {
            this.linux$ = -1;
        } else if (m == 1) {
            this.papers$ = x;
            this.disabled$ = y;
            this.yamaha$ = true;
            if (this.transfer$ == -1.0f && x >= this.entering$ && y >= this.revised$ && y <= this.simon$) {
                int k2 = this.entering$;
                int j1 = this.smile$;
                int k1 = y - this.revised$ - this.glenn$ + (int)this.decide$ - 4;
                int l1 = k1 / this.bizarre$;
                if (x >= k2 && x <= j1 && l1 >= 0 && k1 >= 0 && l1 < this.a()) {
                    boolean flag1 = l1 == this.chassis$ && Minecraft.func_71386_F() - this.mongolia$ < 250L;
                    this.a(l1, flag1);
                    this.chassis$ = l1;
                    this.mongolia$ = Minecraft.func_71386_F();
                }
            }
        }
    }

    public void b(int x, int y, int m) {
        if (m == 1) {
            this.yamaha$ = false;
        }
    }

    public void a(int par1, int par2, float par3, int borderColor) {
        int i3;
        int i2;
        int j2;
        int l1;
        int k1;
        int j1;
        int k = this.a();
        int l = this.d();
        int i1 = l + 6;
        if (this.yamaha$) {
            if (this.transfer$ == -1.0f) {
                boolean flag = true;
                if (par1 >= this.entering$ && par2 >= this.revised$ && par2 <= this.simon$) {
                    int k2 = this.entering$;
                    j1 = this.smile$;
                    k1 = par2 - this.revised$ - this.glenn$ + (int)this.decide$ - 4;
                    l1 = k1 / this.bizarre$;
                    if ((par1 < k2 || par1 > j1 || l1 < 0 || k1 < 0 || l1 >= k) && par1 >= k2 && par1 <= j1 && k1 < 0) {
                        this.a(par1 - k2, par2 - this.revised$ + (int)this.decide$ - 4);
                        flag = false;
                    }
                    if (par1 >= l && par1 <= i1) {
                        this.hoping$ = -1.0f;
                        j2 = this.c();
                        if (j2 < 1) {
                            j2 = 1;
                        }
                        if ((i2 = (int)((float)((this.simon$ - this.revised$) * (this.simon$ - this.revised$)) / (float)this.b())) < 32) {
                            i2 = 32;
                        }
                        if (i2 > this.simon$ - this.revised$ - 8) {
                            i2 = this.simon$ - this.revised$ - 8;
                        }
                        this.hoping$ /= (float)(this.simon$ - this.revised$ - i2) / (float)j2;
                    } else {
                        this.hoping$ = 1.0f;
                    }
                    this.transfer$ = flag ? (float)par2 : -2.0f;
                } else {
                    this.transfer$ = -2.0f;
                }
            } else if (this.transfer$ >= 0.0f) {
                this.decide$ -= ((float)par2 - this.transfer$) * this.hoping$;
                this.transfer$ = par2;
            }
        } else {
            this.transfer$ = -1.0f;
        }
        this.b();
        GL11.glDisable((int)2896);
        GL11.glDisable((int)2912);
        Tessellator tessellator = Tessellator.field_78398_a;
        this.a(tessellator);
        j1 = this.entering$;
        k1 = this.revised$ + 4 - (int)this.decide$;
        if (this.shape$) {
            this.a(j1, k1, tessellator);
        }
        for (l1 = 0; l1 < k; ++l1) {
            j2 = k1 + l1 * this.bizarre$ + this.glenn$;
            i2 = this.bizarre$ - 4;
            if (j2 > this.simon$ || j2 + i2 < this.revised$ || j2 + i2 > this.simon$ || j2 < this.revised$) continue;
            if (this.linking$ && this.a(l1)) {
                i3 = this.entering$;
                int j3 = this.smile$;
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
        GuiSlotList.func_73734_a((int)(this.entering$ - 1), (int)(this.revised$ - 1), (int)this.entering$, (int)(this.simon$ + 1), (int)borderColor);
        GuiSlotList.func_73734_a((int)this.smile$, (int)(this.revised$ - 1), (int)(this.smile$ + 7), (int)(this.simon$ + 1), (int)borderColor);
        GuiSlotList.func_73734_a((int)(this.entering$ - 1), (int)(this.revised$ - 1), (int)(this.smile$ + 7), (int)this.revised$, (int)borderColor);
        GuiSlotList.func_73734_a((int)(this.entering$ - 1), (int)this.simon$, (int)(this.smile$ + 7), (int)(this.simon$ + 1), (int)borderColor);
        GL11.glDisable((int)2929);
        int b0 = 4;
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glDisable((int)3008);
        GL11.glShadeModel((int)7425);
        GL11.glDisable((int)3553);
        GL11.glBegin((int)7);
        this.c(0);
        this.a(this.entering$, this.revised$ + b0, 0.0, 0.0, 1.0);
        this.a(this.smile$, this.revised$ + b0, 0.0, 1.0, 1.0);
        this.c(0);
        this.a(this.smile$, this.revised$, 0.0, 1.0, 0.0);
        this.a(this.entering$, this.revised$, 0.0, 0.0, 0.0);
        GL11.glEnd();
        GL11.glBegin((int)7);
        this.c(0);
        this.a(this.entering$, this.simon$, 0.0, 0.0, 1.0);
        this.a(this.smile$, this.simon$, 0.0, 1.0, 1.0);
        this.c(0);
        this.a(this.smile$, this.simon$ - b0, 0.0, 1.0, 0.0);
        this.a(this.entering$, this.simon$ - b0, 0.0, 0.0, 0.0);
        GL11.glEnd();
        j2 = this.c();
        if (j2 > 0) {
            i2 = (this.simon$ - this.revised$) * (this.simon$ - this.revised$) / this.b();
            if (i2 < 32) {
                i2 = 32;
            }
            if (i2 > this.simon$ - this.revised$ - 8) {
                i2 = this.simon$ - this.revised$ - 8;
            }
            if ((i3 = (int)this.decide$ * (this.simon$ - this.revised$ - i2) / j2 + this.revised$) < this.revised$) {
                i3 = this.revised$;
            }
            GL11.glBegin((int)7);
            this.c(0);
            this.a(l, this.simon$, 0.0, 0.0, 1.0);
            this.a(i1, this.simon$, 0.0, 1.0, 1.0);
            this.a(i1, this.revised$, 0.0, 1.0, 0.0);
            this.a(l, this.revised$, 0.0, 0.0, 0.0);
            GL11.glEnd();
            GL11.glBegin((int)7);
            this.c(0x808080);
            this.a(l, i3 + i2, 0.0, 0.0, 1.0);
            this.a(i1, i3 + i2, 0.0, 1.0, 1.0);
            this.a(i1, i3, 0.0, 1.0, 0.0);
            this.a(l, i3, 0.0, 0.0, 0.0);
            GL11.glEnd();
            GL11.glBegin((int)7);
            this.c(0xC0C0C0);
            this.a(l, i3 + i2 - 1, 0.0, 0.0, 1.0);
            this.a(i1 - 1, i3 + i2 - 1, 0.0, 1.0, 1.0);
            this.a(i1 - 1, i3, 0.0, 1.0, 0.0);
            this.a(l, i3, 0.0, 0.0, 0.0);
            GL11.glEnd();
        }
        this.b(par1, par2);
        GL11.glEnable((int)3553);
        GL11.glShadeModel((int)7424);
        GL11.glEnable((int)3008);
        GL11.glDisable((int)3042);
    }

    private void c(int i) {
        int j = i >> 16 & 0xFF;
        int k = i >> 8 & 0xFF;
        int l = i & 0xFF;
        GL11.glColor4f((float)((float)j / 255.0f), (float)((float)k / 255.0f), (float)((float)l / 255.0f), (float)255.0f);
    }

    private void a(double x, double y, double z, double U, double V) {
        GL11.glTexCoord2d((double)U, (double)V);
        GL11.glVertex3d((double)x, (double)y, (double)z);
    }

    protected int d() {
        return this.smile$;
    }

    private void a(Tessellator tess) {
        Gui.func_73734_a((int)this.entering$, (int)this.revised$, (int)this.smile$, (int)this.simon$, (int)0x60000000);
    }
}

