/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.item.Item
 */
package customsteve;

import customsteve.aB;
import customsteve.aQ;
import customsteve.ac_0;
import customsteve.ag_0;
import customsteve.ai_0;
import customsteve.am;
import customsteve.ar;
import customsteve.au;
import customsteve.ax;
import customsteve.ay;
import customsteve.az_0;
import customsteve.jni.CS_Bullet;
import java.util.ArrayList;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ac {
    public String a;
    public String b;
    public ArrayList<ax> a;
    public ArrayList<az_0> b;
    public ArrayList<ar> c;
    public ArrayList<ar> d;
    public ArrayList<ay> e;
    public ArrayList<au> f;
    public ArrayList<ac_0> g;
    public ArrayList<aQ> h;
    public ArrayList<String> i;
    public aQ a;
    public aQ b;
    public aQ c;
    public aQ d;
    public ar a;
    public ar b;
    public ar c;
    public ar d;
    public ar e;
    public ar f;
    public ar g;
    public ar h;
    public ar i;
    public ar j;
    public ar k;
    public ar l;
    public CS_Bullet a;
    public EntityLivingBase a;
    public int a;
    public int b;
    public boolean a;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public float a;
    public float b;
    public float c;
    public float d;
    public am a = true;
    public am b = 0;
    public am c = 75;
    public am d = -25;
    public am e = new ArrayList();
    public am f;
    public am g = 0;
    public am h = 0;

    public ac() {
        this.a = new am(0.0f, 0.0f, 0.0f, 1.0f);
        this.b = new am(0.0f, 0.0f, 0.0f, 1.0f);
        this.c = new am(0.0f, 0.0f, 0.0f, 1.0f);
        this.d = new am(0.0f, 0.0f, 0.0f, 1.0f);
        this.e = new am(0.0f, 0.0f, 0.0f, 1.0f);
        this.f = new am(0.0f, 0.0f, 0.0f, 1.0f);
        this.g = new am(0.0f, 0.0f, 0.0f, 1.0f);
        this.h = new am(0.0f, 0.0f, 0.0f, 1.0f);
    }

    public void a() {
        this.a.a();
        this.b.a();
        this.c.a();
        this.e.a();
        this.f.a();
    }

    public void a(boolean sb) {
        if (this.a != sb) {
            this.a = sb;
            this.c.a();
            this.e.a();
            this.f.a();
            this.g.a();
            this.h.a();
        }
    }

    public ag_0 a(Item item, String pmdFileName, String textureFolderName) {
        int i2;
        ag_0 newpfi = new ag_0(item, pmdFileName, textureFolderName);
        newpfi.a = this.a;
        newpfi.b = this.b;
        newpfi.a = this.a;
        newpfi.b = this.b;
        newpfi.c = new ArrayList();
        for (i2 = 0; i2 < this.c.size(); ++i2) {
            ar b2 = this.c.get(i2);
            ((ArrayList)((Object)newpfi.c)).add(new ar(b2));
        }
        newpfi.e = new ArrayList();
        for (i2 = 0; i2 < this.e.size(); ++i2) {
            ay ik = this.e.get(i2);
            ArrayList<ar> childs = new ArrayList<ar>();
            for (int j2 = 0; j2 < ((ArrayList)((Object)ik.b)).size(); ++j2) {
                childs.add((ar)((ArrayList)((Object)newpfi.c)).get((Integer)((ArrayList)((Object)ik.b)).get(j2)));
            }
            newpfi.e.add(new ay(ik, (ar)((ArrayList)((Object)newpfi.c)).get(ik.a), (ar)((ArrayList)((Object)newpfi.c)).get(ik.b), childs));
        }
        newpfi.h = this.h;
        newpfi.f = this.f;
        newpfi.g = this.g;
        newpfi.i = this.i;
        return newpfi;
    }

    public void b() {
        if (this.a != null && ((ArrayList)((Object)this.a)).size() > 0) {
            ai_0[] mats = ((ax)((ArrayList)((Object)this.a)).get((int)0)).b;
            for (int i2 = 0; i2 < mats.size(); ++i2) {
                ((aB)mats.get(i2)).c();
            }
        }
    }

    public ay a(ar b2) {
        for (int i2 = 0; i2 < this.e.size(); ++i2) {
            for (int j2 = 0; j2 < ((ArrayList)((Object)this.e.get((int)i2).a)).size(); ++j2) {
                if (!((ar)((ArrayList)((Object)this.e.get((int)i2).a)).get((int)j2)).a.equals(b2.a)) continue;
                return this.e.get(i2);
            }
        }
        return null;
    }

    public boolean a(ar b2) {
        for (int i2 = 0; i2 < this.e.size(); ++i2) {
            for (int j2 = 0; j2 < ((ArrayList)((Object)this.e.get((int)i2).a)).size(); ++j2) {
                if (!this.e.get((int)i2).b.a.equals(b2.a)) continue;
                return true;
            }
        }
        return false;
    }

    public boolean b(ar b2) {
        for (int i2 = 0; i2 < this.e.size(); ++i2) {
            for (int j2 = 0; j2 < ((ArrayList)((Object)this.e.get((int)i2).a)).size(); ++j2) {
                if (!((ar)((ArrayList)((Object)this.e.get((int)i2).a)).get((int)j2)).a.equals(b2.a) && !this.e.get((int)i2).a.a.equals(b2.a)) continue;
                return true;
            }
        }
        return false;
    }
}

