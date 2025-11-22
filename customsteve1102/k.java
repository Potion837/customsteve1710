/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  customsteve.u
 *  net.minecraft.client.Minecraft
 *  net.minecraft.entity.passive.EntityHorse
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.EnumAction
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemBow
 *  net.minecraft.item.ItemStack
 *  net.minecraftforge.common.MinecraftForge
 *  net.minecraftforge.fml.common.eventhandler.Event
 */
package customsteve;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import customsteve.ModContainer;
import customsteve.V;
import customsteve.aZ;
import customsteve.a_0;
import customsteve.ac;
import customsteve.ad;
import customsteve.ae;
import customsteve.ai;
import customsteve.ap_0;
import customsteve.aw;
import customsteve.b_0;
import customsteve.bc;
import customsteve.i;
import customsteve.k;
import customsteve.u;
import customsteve.u_0;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.locks.ReadWriteLock;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.Event;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class k
extends bc {
    public ap_0 a;
    public String a;
    public String b;
    public String c;
    public String d;
    public aZ.a a;
    public String e;
    public boolean a;
    private ae[] a;
    private int o;
    public boolean b;
    public EntityPlayer a;
    public boolean c;
    public boolean d;
    public int a;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public String f;
    public String g;
    private ae[] b;
    public float a;
    public float b;
    private boolean p;
    public int b;
    public boolean i;
    public boolean j;
    public boolean[] a;
    public boolean k;
    public boolean l = false;
    public boolean m = false;
    public boolean n = false;
    public int c = -1;
    private int p = 0;
    private int q;
    private int r = 0;
    private int s = 0;
    private int t = 0;
    private int u = 0;
    private EntityPlayer b;
    public int d = -1;
    public boolean o = false;
    public Item a;
    public a a;
    public c a;
    public int e = -1;
    public boolean[] b = -1;
    public int[] a;
    public long[] a;
    public int f = 0;
    public int g = 0;
    public int h = 0;
    public int i = 0;
    public int j = 0;
    public int k = 5;
    public ReadWriteLock[] a;
    public i[] a = customsteve.k$c.a;
    private boolean q = false;

    public k(String par2Str, String pmdFileName) {
        this.b = new boolean[3];
        this.a = new int[3];
        this.a = new long[3];
        this.a = new ReadWriteLock[3];
        this.a = new i[10];
        this.e = par2Str;
        this.b = new ae[3];
        this.a = new ae[3];
        Minecraft mc = Minecraft.getMinecraft();
        if (mc.player != null && mc.player.func_70005_c_().equals(this.e)) {
            this.a = true;
        }
        this.a = this;
        this.a = pmdFileName;
        try {
            this.e();
        }
        catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void a(EntityPlayer ep) {
        if (this.j) {
            ++this.u;
        }
        if (this.a == null) {
            this.a = ep;
        }
        if (((bc.a)((Object)this.a)).a) {
            // empty if block
        }
        if (!this.l && !((bc.a)((Object)this.a)).h) {
            this.b(ep);
        }
    }

    public boolean a(String path, EntityPlayer var1, ItemStack ei, int layer) {
        boolean main;
        ItemStack itemInUse = var1.func_184607_cu();
        boolean bl = main = layer == 1;
        if (var1.field_70733_aJ > 0.0f && main) {
            this.i = false;
            this.e = true;
            this.o = layer;
            if (ei != null) {
                if (ei.getItem().getItemUseAction(ei) == EnumAction.BLOCK) {
                    this.b = 0;
                    this.c(path + "ShieldWaveRight.vmd", layer);
                } else if (ei.getItem().isFull3D()) {
                    this.b = 0;
                    this.c(path + "StickWaveRight.vmd", layer);
                } else {
                    this.b = 0;
                    this.c(path + "ItemWaveRight.vmd", layer);
                }
            } else {
                this.b = 0;
                this.e = true;
                this.c(path + "BarehandedWaveRight.vmd", layer);
            }
            return true;
        }
        if (ei != null) {
            this.i = false;
            if (ei.getItem().getItemUseAction(ei) == EnumAction.BLOCK && (!main || main && !this.e)) {
                if (itemInUse == ei) {
                    ((ac)((Object)this.a)).a = true;
                    this.o = layer;
                    if (main) {
                        this.c(path + "ShieldParryRight.vmd", layer);
                    } else {
                        this.c(path + "ShieldParryLeft.vmd", layer);
                    }
                } else if (main) {
                    this.c(path + "ShieldHoldRight.vmd", layer);
                } else {
                    this.c(path + "ShieldHoldLeft.vmd", layer);
                }
            } else if (ei.getItem().isFull3D() && !this.e) {
                if (main) {
                    this.c(path + "StickHoldRight.vmd", layer);
                } else {
                    this.c(path + "StickHoldLeft.vmd", layer);
                }
            } else {
                if (itemInUse != null && itemInUse == ei) {
                    if (itemInUse.getItemUseAction() == EnumAction.DRINK) {
                        if (itemInUse == ei) {
                            this.o = layer;
                            if (main) {
                                this.c(path + "DrinkRight.vmd", layer);
                            } else {
                                this.c(path + "DrinkLeft.vmd", layer);
                            }
                        }
                        return false;
                    }
                    if (itemInUse.getItemUseAction() == EnumAction.EAT) {
                        this.o = layer;
                        if (main) {
                            this.c(path + "EatRight.vmd", layer);
                        } else {
                            this.c(path + "EatLeft.vmd", layer);
                        }
                        return false;
                    }
                }
                if (!this.e) {
                    if (main) {
                        this.c(path + "ItemHoldRight.vmd", layer);
                    } else {
                        this.c(path + "ItemHoldLeft.vmd", layer);
                    }
                }
            }
        } else if (!this.e) {
            if (main) {
                this.c(path + "BarehandedRight.vmd", layer);
            } else {
                ((ac)((Object)((k)((Object)this.a)).a)).a = true;
                if (((k)((Object)this.a)).a()[2] != null) {
                    ((k)((Object)this.a)).a[2] = true;
                }
            }
        }
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(String path, EntityPlayer var1) {
        ItemStack equippedItemMain = var1.func_184614_ca();
        ItemStack equippedItemOff = var1.func_184592_cb();
        ItemStack itemInUse = var1.func_184607_cu();
        EnumAction mainEA = null;
        EnumAction offEA = null;
        if (equippedItemOff != null) {
            offEA = equippedItemOff.getItem().getItemUseAction(equippedItemOff);
        }
        if (equippedItemMain != null) {
            mainEA = equippedItemMain.getItem().getItemUseAction(equippedItemMain);
        }
        boolean dual = b_0.D;
        if (mainEA == EnumAction.BLOCK || offEA == EnumAction.BLOCK) {
            dual = true;
        } else if (mainEA == EnumAction.EAT || mainEA == EnumAction.DRINK || offEA != null && (offEA == EnumAction.EAT || offEA == EnumAction.DRINK)) {
            dual = true;
        } else if (equippedItemMain != null && equippedItemOff != null && equippedItemMain.getItem().isFull3D() && equippedItemOff.getItem().isFull3D()) {
            dual = true;
        }
        this.o = 1;
        if (!this.j) {
            if (b_0.a == 0) return true;
            if (!b_0.s || !(var1.field_70733_aJ > 0.0f) && itemInUse == null) return true;
            this.a();
        } else if (b_0.a == 1 && b_0.s && this.u > b_0.b) {
            this.a();
            return true;
        }
        if (var1.field_70733_aJ > 0.0f || itemInUse != null) {
            this.d();
        }
        ((ac)((Object)this.a)).a = false;
        this.f = true;
        this.o = 1;
        float zoom = 0.15f;
        float rot = -35.0f;
        if (dual && (itemInUse == null || !(itemInUse.getItem() instanceof ItemBow))) {
            this.a(path, var1, equippedItemMain, 1);
            this.a(path, var1, equippedItemOff, 2);
            return true;
        } else {
            if (b_0.y) {
                // empty if block
            }
            if (var1.field_70733_aJ > 0.0f) {
                this.i = false;
                this.e = true;
                if (equippedItemMain != null) {
                    if (equippedItemMain.getItem().isFull3D()) {
                        this.c(path + "wavingStick_UP.vmd", 1);
                        return true;
                    } else {
                        this.c(path + "wavingItem_UP.vmd", 1);
                    }
                    return true;
                } else if (this.i == 0) {
                    this.e = true;
                    this.c(path + "punchRight_UP.vmd", 1);
                    return true;
                } else {
                    this.e = true;
                    this.c(path + "punchLeft_UP.vmd", 1);
                }
                return true;
            }
            if (equippedItemOff != null && itemInUse == equippedItemOff) {
                this.i = false;
                if (!(equippedItemOff.getItem() instanceof ItemBow)) return true;
                if (itemInUse != null && equippedItemOff.getItem() instanceof ItemBow) {
                    this.c(path + "useBow_UP.vmd", 1);
                    return false;
                }
                if (this.e) return true;
                this.c(path + "holdBow_UP.vmd", 1);
                return true;
            } else if (equippedItemMain != null) {
                this.i = false;
                if (equippedItemMain.getItem() instanceof ItemBow) {
                    if (itemInUse != null && equippedItemMain.getItem() instanceof ItemBow) {
                        this.c(path + "useBow_UP.vmd", 1);
                        return false;
                    }
                    if (this.e) return true;
                    this.c(path + "holdBow_UP.vmd", 1);
                    return true;
                } else if (equippedItemMain.getItem().isFull3D()) {
                    if (this.e) return true;
                    this.c(path + "holdStick_UP.vmd", 1);
                    return true;
                } else {
                    if (itemInUse != null) {
                        if (itemInUse.getItemUseAction() == EnumAction.DRINK) {
                            this.c(path + "drink.vmd", 1);
                            return false;
                        }
                        if (itemInUse.getItemUseAction() == EnumAction.EAT) {
                            this.c(path + "eat.vmd", 1);
                            return false;
                        }
                    }
                    if (this.e) return true;
                    this.c(path + "holdBlock_UP.vmd", 1);
                }
                return true;
            } else if (var1.func_184187_bx() != null) {
                this.c(path + "riddenByEntity_UP.vmd", 1);
                return true;
            } else {
                if (this.e) return true;
                this.c(path + "barehanded_UP.vmd", 1);
            }
        }
        return true;
    }

    public void b(EntityPlayer var1) {
        if (this.a != customsteve.k$c.a) {
            this.h = 0;
        }
        if (this.a == null) {
            return;
        }
        String path = "CustomSteve/Animations/" + this.c + "/";
        if (this.e && (this.b(1) == null || (long)this.a(1) >= this.b((int)1).a)) {
            ++this.t;
            this.e = false;
            int n2 = this.i = this.i == 0 ? 1 : 0;
            if (this.t > 12) {
                this.f = false;
                this.t = 0;
            }
        }
        double x = var1.field_70165_t - var1.field_70142_S;
        double y = var1.field_70163_u - var1.field_70137_T;
        double z = var1.field_70161_v - var1.field_70136_U;
        if (this.p > 100) {
            this.p = 100;
        }
        float isMoveSpeed = 0.005f;
        if (var1.func_70093_af()) {
            isMoveSpeed = 0.005f;
        }
        if (Math.abs(x) < (double)isMoveSpeed && Math.abs(y) < (double)isMoveSpeed && Math.abs(z) < (double)isMoveSpeed) {
            ++this.p;
        } else {
            if (Math.abs(x) > (double)isMoveSpeed && Math.abs(x) < (double)0.05f || Math.abs(z) > (double)isMoveSpeed && Math.abs(z) < (double)0.05f) {
                ((bc.a)((Object)this.a)).a = 0.2f;
            }
            this.p = 0;
            if (x != 0.0 || z != 0.0) {
                ++this.s;
            }
            boolean shake = false;
            if (y == 0.005208333333328596 || y == -0.005208333333328596 || y == 0.005208333333342807 || y == -0.005208333333342807) {
                shake = true;
            }
            if (y > 0.0 && var1.field_70181_x > -0.078 && !shake) {
                ++this.r;
            }
        }
        if (var1.func_184218_aH()) {
            this.a = customsteve.k$a.e;
            this.a = customsteve.k$c.a;
            this.i = true;
            if (var1.func_184187_bx() instanceof EntityHorse) {
                this.c(path + "horseRiding.vmd", 0);
            } else {
                this.c(path + "riding.vmd", 0);
            }
        } else if (var1.isPlayerSleeping()) {
            if (this.j) {
                this.a();
            }
            this.a = customsteve.k$a.f;
            this.a = customsteve.k$c.a;
            this.i = true;
            ((bc.a)((Object)this.a)).c = true;
            this.b = 0;
            this.c(path + "sleep.vmd", 0);
        } else if (var1.func_184613_cA()) {
            this.a = customsteve.k$a.d;
            this.c(path + "fly.vmd", 0);
            this.a = customsteve.k$c.d;
        } else if (var1.capabilities.isFlying) {
            this.a = customsteve.k$a.d;
            if (this.p > 2) {
                this.i = true;
                this.s = 0;
                this.p = 3;
                if (var1.func_184614_ca() != null) {
                    this.c(path + "fly.vmd", 0);
                } else {
                    this.c(path + "fly.vmd", 0);
                }
                this.a = customsteve.k$c.a;
            } else {
                this.i = true;
                this.c(path + "flying.vmd", 0);
                this.a = customsteve.k$c.d;
            }
        } else if (var1.func_70090_H()) {
            this.a = customsteve.k$a.a;
            this.a = customsteve.k$c.f;
            this.i = true;
            this.c(path + "swim.vmd", 0);
        } else if (var1.func_70093_af()) {
            this.a = customsteve.k$a.c;
            if (this.p > 2) {
                this.a = customsteve.k$c.a;
                this.c(path + "squat_LO.vmd", 0);
            } else if (this.s > 2) {
                this.a = customsteve.k$c.d;
                this.i = true;
                this.e = false;
                this.s = 3;
                this.c(path + "sneaking_LO.vmd", 0);
            }
        } else {
            if (var1.func_70617_f_()) {
                this.a = customsteve.k$a.a;
                this.a = customsteve.k$c.g;
                this.i = true;
                this.e = false;
                this.c(path + "ladder.vmd", 0);
                this.a(path, var1);
                return;
            }
            if (var1.field_70143_R > 4.0f && !var1.field_70122_E) {
                this.a = customsteve.k$a.a;
                this.a = customsteve.k$c.h;
                this.i = true;
                this.e = false;
                this.c(path + "fall.vmd", 0);
                this.a(path, var1);
                return;
            }
            if (this.r > 2) {
                this.a = customsteve.k$a.a;
                this.a = customsteve.k$c.e;
                this.r = 0;
                this.q = 0;
                this.b = 2;
                this.c(path + "jump.vmd", 0);
                this.a(path, var1);
                return;
            }
            if (Math.abs(y) < (double)0.05f) {
                ++this.q;
            }
            if (this.q > 2 && this.s > 2) {
                this.a = customsteve.k$a.b;
                this.s = 3;
                this.q = 3;
                if (var1.func_70051_ag()) {
                    this.a = customsteve.k$c.c;
                    this.c(path + "run.vmd", 0);
                } else {
                    this.a = customsteve.k$c.d;
                    this.c(path + "walk.vmd", 0);
                }
                if (this.j) {
                    this.i = false;
                }
            }
            if (this.p > 2) {
                this.a = customsteve.k$a.b;
                this.s = 0;
                this.p = 3;
                if (this.j) {
                    this.a = customsteve.k$c.a;
                    if (this.a(path, var1)) {
                        if (this.d > -1) {
                            this.a = customsteve.k$a.b;
                            this.a = customsteve.k$c.i;
                            this.b = 3;
                            this.c(path + "kick.vmd", 0);
                        } else {
                            this.c(path + "stand_LO.vmd", 0);
                        }
                    }
                } else if (this.d > -1) {
                    this.a = customsteve.k$a.b;
                    this.a = customsteve.k$c.i;
                    this.b = 3;
                    this.c(path + "kick.vmd", 0);
                } else if (this.h > b_0.g && this.a == customsteve.k$c.a) {
                    if (!this.a || Minecraft.getMinecraft().gameSettings.thirdPersonView != 0) {
                        this.a = customsteve.k$c.b;
                        this.b = 0;
                        if (this.j > 2) {
                            this.j = 0;
                        }
                        switch (this.j) {
                            case 0: {
                                this.c(path + "stand_Idle_1.vmd", 0);
                                break;
                            }
                            case 1: {
                                this.c(path + "stand_Idle_2.vmd", 0);
                                break;
                            }
                            case 2: {
                                this.c(path + "stand_Idle_3.vmd", 0);
                            }
                        }
                        this.a = customsteve.k$c.b;
                        ++this.j;
                    }
                } else if (this.a != customsteve.k$c.b) {
                    this.a = customsteve.k$c.a;
                    if (!((bc.a)((Object)this.a)).g) {
                        ++this.h;
                    }
                    this.c(path + "stand.vmd", 0);
                }
            }
            if (this.d < 0) {
                a_0.instance.a.e = -1;
            }
        }
        this.a(path, var1);
    }

    public float a(float par1, float par2, float par3) {
        float f3;
        for (f3 = par2 - par1; f3 < -180.0f; f3 += 360.0f) {
        }
        while (f3 >= 180.0f) {
            f3 -= 360.0f;
        }
        return par1 + par3 * f3;
    }

    public void a(String path, int layer) {
        this.c(path, layer);
        this.a(layer);
        this.g = true;
    }

    public void b(String path, int layer) {
        if (this.g || ((bc.a)((Object)this.a)).h) {
            return;
        }
        try {
            this.c(path, layer);
            this.a(layer);
        }
        catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static boolean a(boolean isUpper, u_0.a type, k csp, EntityPlayer ep) {
        return MinecraftForge.EVENT_BUS.post((Event)new u(isUpper, type, csp, ep));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(int layer) {
        if (((bc.a)((Object)this.a)).f || this.g == null || this.g || ((bc.a)((Object)this.a)).h) {
            return;
        }
        try {
            ae vfi;
            k csp = this;
            ae vfi_Source = vfi = a_0.instance.a(this.g);
            ae lastAnimation = this.a[layer];
            if (lastAnimation != null && lastAnimation.b != null && lastAnimation.b.equals(vfi.b)) {
                if ((long)csp.a(layer) >= ((k)((Object)csp.a)).b[layer].a) {
                    if (layer == 0) {
                        if (this.a == customsteve.k$c.i) {
                            this.d = -1;
                            this.b = this.k;
                        }
                        this.i();
                    }
                    if (this.a != customsteve.k$c.i) {
                        csp.a((int)csp.b[layer].b, layer);
                    }
                }
            } else {
                ae vfi_mixed;
                if (layer == 0) {
                    if (this.a == customsteve.k$c.i) {
                        this.d = this.d == 0 ? 1 : -1;
                        this.o = true;
                    }
                }
                if ((vfi_mixed = this.a(vfi_Source, layer)) != null) {
                    vfi = vfi_mixed;
                }
                this.b(layer, vfi);
                if (!this.p) {
                    lastAnimation = vfi_mixed != null ? vfi : vfi_Source;
                    csp.a[layer] = lastAnimation;
                    csp.a(0, layer);
                    new aw().a(csp, vfi, layer);
                    ((bc.a)((Object)csp.a)).a[layer] = true;
                    csp.a(0, layer);
                }
            }
        }
        catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void c(String path, int layer) {
        this.g = path;
        this.a(layer);
    }

    public void a(ap_0 loc) {
        String filePath = this.a;
        new Timer().schedule((TimerTask)new b(this, this, loc, filePath), 0L, 100L);
    }

    private int a(String path, ac pfi) throws Exception {
        String name = path.toLowerCase();
        if (name.endsWith(".pmd")) {
            return new ad().a(new File(path), pfi);
        }
        if (name.endsWith(".pmx")) {
            return new ai().a(new File(path), pfi);
        }
        throw new V("Can't load " + path);
    }

    public void a() {
        boolean bl = this.j = !this.j;
        if (!this.j) {
            ((ArrayList)((Object)this.a)).clear();
            this.a = null;
            if (((bc.a)((Object)((k)((Object)this.a)).a)).g) {
                ((bc.a)((Object)((k)((Object)this.a)).a)).g = false;
                ((bc.a)((Object)((k)((Object)this.a)).a)).h = false;
                ((ac)((Object)((k)((Object)this.a)).a)).a = false;
            }
            ((ac)((Object)this.a)).a = true;
            for (int i2 = 0; i2 < this.a.length; ++i2) {
                this.a[i2] = true;
            }
        } else if (((bc.a)((Object)((k)((Object)this.a)).a)).g) {
            ((bc.a)((Object)((k)((Object)this.a)).a)).g = false;
            ((bc.a)((Object)((k)((Object)this.a)).a)).b = false;
        }
        this.d();
    }

    public ae a(ae vfi, int layer) {
        int interFrame = 3;
        if (this.b > -1) {
            interFrame = this.b;
            this.b = -1;
            if (interFrame == 0) {
                return null;
            }
        }
        if (b_0.j == 2) {
            interFrame *= 2;
        }
        if (vfi.a == null || this.a[layer] == null) {
            return null;
        }
        if (this.a[layer].b != null) {
            Iterator iterator = ((ArrayList)((Object)a_0.instance.d)).iterator();
            while (iterator.hasNext()) {
                String[] str = (String[])iterator.next();
                if (!(this.a[layer].b.equals(str[1]) ? vfi.b.equals(str[0]) : this.a[layer].b.equals(str[0]) && vfi.b.equals(str[1]))) continue;
                return null;
            }
        } else {
            return null;
        }
        return new aw().a(this, vfi, interFrame, layer);
    }

    public void b() {
        this.n = true;
    }

    public void c() {
        this.q = true;
        if (this.a != null) {
            ((ac)((Object)this.a)).b();
        }
        ((ArrayList)((Object)this.a)).clear();
        this.a = null;
        this.a = null;
    }

    public boolean a() {
        return this.q;
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.c;
    }

    public void d() {
        this.u = 0;
    }

    public void e() throws Exception {
        File conf = new File(ModContainer.b + "/CustomSteve/models/" + this.a.substring(0, this.a.length() - 4) + ".json");
        if (!conf.exists()) {
            conf.createNewFile();
            this.f();
            return;
        }
        InputStreamReader read = new InputStreamReader((InputStream)new FileInputStream(conf), "UTF-8");
        BufferedReader bufferedReader = new BufferedReader(read);
        StringBuilder sb = new StringBuilder();
        String lineTxt = null;
        while ((lineTxt = bufferedReader.readLine()) != null) {
            sb.append(lineTxt);
        }
        JsonObject json = (JsonObject)new Gson().fromJson(sb.toString(), JsonObject.class);
        JsonArray quickMotion = json.get("QuickMotion").getAsJsonArray();
        for (int i2 = 0; i2 < 10; ++i2) {
            this.a[i2] = new i();
            this.a[i2].a(quickMotion.get(i2).getAsJsonObject());
        }
        read.close();
    }

    public void f() throws Exception {
        this.g();
    }

    public void g() throws Exception {
        File conf = new File(ModContainer.b + "/CustomSteve/models/" + this.a.substring(0, this.a.length() - 4) + ".json");
        OutputStreamWriter writer = new OutputStreamWriter((OutputStream)new FileOutputStream(conf), "UTF-8");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        JsonObject json = new JsonObject();
        JsonArray quickMotion = new JsonArray();
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            i qms = this.a[i2];
            if (qms == null) {
                qms = new i();
            }
            this.a[i2] = qms;
            qms.a(quickMotion);
        }
        json.add("QuickMotion", (JsonElement)quickMotion);
        bufferedWriter.write(json.toString());
        bufferedWriter.flush();
        bufferedWriter.close();
        writer.close();
    }

    public ae a(int layer) {
        return this.a[layer];
    }

    public boolean a(int layer, ae vfi) {
        this.a[layer] = vfi;
        return true;
    }

    public ae b(int layer) {
        return this.b[layer];
    }

    public boolean b(int layer, ae vfi) {
        this.b[layer] = vfi;
        return true;
    }

    public ae[] a() {
        return this.b;
    }

    public ae[] b() {
        return this.a;
    }

    public int a() {
        return this.o;
    }

    static /* synthetic */ int a(k x0, String x1, ac x2) throws Exception {
        return x0.a(x1, x2);
    }
}

