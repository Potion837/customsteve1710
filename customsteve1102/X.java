/*
 * Decompiled with CFR 0.152.
 */
package customsteve;

import customsteve.aQ;
import customsteve.aa_0;
import customsteve.ac_0;
import customsteve.ar;
import customsteve.au;
import customsteve.av_0;
import customsteve.ax;
import customsteve.ay;
import customsteve.az_0;
import customsteve.jni.CS_Bullet;
import java.util.ArrayList;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class X {
    public ArrayList<ax> a;
    public ArrayList<az_0> b;
    public ArrayList<ar> c;
    public ArrayList<ay> d;
    public ArrayList<aQ> e;
    public ArrayList<au> f;
    public ArrayList<ac_0> g;
    public CS_Bullet a;
    public aa_0[] a;
    public av_0[] a = new ArrayList();

    public X() {
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
    }

    public ay a(ar b2) {
        for (int i2 = 0; i2 < this.d.size(); ++i2) {
            for (int j2 = 0; j2 < ((ArrayList)((Object)this.d.get((int)i2).a)).size(); ++j2) {
                if (!((ar)((ArrayList)((Object)this.d.get((int)i2).a)).get((int)j2)).a.equals(b2.a)) continue;
                return this.d.get(i2);
            }
        }
        return null;
    }

    public boolean a(ar b2) {
        for (int i2 = 0; i2 < this.d.size(); ++i2) {
            for (int j2 = 0; j2 < ((ArrayList)((Object)this.d.get((int)i2).a)).size(); ++j2) {
                if (!this.d.get((int)i2).b.a.equals(b2.a)) continue;
                return true;
            }
        }
        return false;
    }

    public boolean b(ar b2) {
        for (int i2 = 0; i2 < this.d.size(); ++i2) {
            for (int j2 = 0; j2 < ((ArrayList)((Object)this.d.get((int)i2).a)).size(); ++j2) {
                if (!((ar)((ArrayList)((Object)this.d.get((int)i2).a)).get((int)j2)).a.equals(b2.a) && !this.d.get((int)i2).a.a.equals(b2.a)) continue;
                return true;
            }
        }
        return false;
    }
}

