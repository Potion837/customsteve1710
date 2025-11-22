/*
 * Decompiled with CFR 0.152.
 */
package customsteve;

import customsteve.aa_0;
import customsteve.ac;
import customsteve.ak;
import customsteve.al;
import customsteve.am;
import customsteve.ap_0;
import customsteve.b_0;
import java.util.ArrayList;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ar {
    public String a;
    public int a;
    int b;
    public int c;
    public int d;
    public float a;
    public float b;
    public float c;
    public float d;
    public ArrayList<aa_0>[] a;
    public int e;
    public boolean a;
    public al a;
    public ArrayList<Integer> a;
    public al b;
    public ap_0 a;
    public am a;
    public ap_0 b;
    public am b;
    public am c;
    public am d;
    public am e;
    public ap_0 c;
    public am f;
    public ap_0 d = -1.0f;
    public ap_0 e = 0;
    public am g;
    public ap_0 f;
    public ap_0 g;
    public am h;
    public ap_0 h;
    public ap_0 i;
    public am i;
    public ap_0 j;
    public am j;
    public ap_0 k;
    public am k = null;
    public am l;
    public am m;
    public ap_0 l;
    public ap_0 m;
    public ap_0 n;
    public ap_0 o;
    public boolean b = false;
    public al[] a;
    public ap_0[] a;
    public am[] a = new al();
    public ap_0 p;
    public am n;

    public ar(ar b2) {
        this.c = new ap_0();
        this.f = new am();
        this.d = new ap_0(1.0f, 1.0f, 1.0f);
        this.e = new ap_0();
        this.g = new am();
        this.f = new ap_0(1.0f, 1.0f, 1.0f);
        this.h = new ap_0(1.0f, 1.0f, 1.0f);
        this.j = new ap_0(1.0f, 1.0f, 1.0f);
        this.j = new am();
        this.k = new ap_0();
        this.l = new am();
        this.m = new am();
        this.l = new ap_0();
        this.m = new ap_0();
        this.n = new ap_0();
        this.o = new ap_0();
        this.a = new al[3];
        this.a = new ap_0[3];
        this.a = new am[3];
        this.a = new String(b2.a);
        this.a = b2.a;
        this.b = b2.b;
        this.c = b2.c;
        this.d = b2.d;
        this.a = b2.a;
        this.b = b2.b;
        this.c = b2.c;
        this.e = b2.e;
        if (this.a != null) {
            for (int i2 = 0; i2 < ((String)this.a).length; ++i2) {
                b2.a[i2] = new ArrayList(this.a[i2]);
            }
        }
        this.a = new ArrayList(b2.a);
        this.b = new al(b2.b);
        if (b2.a != null) {
            this.a = new ap_0(b2.a);
        }
        if (b2.a != null) {
            this.a = new am(b2.a);
        }
        if (b2.b != null) {
            this.b = new ap_0(b2.b);
        }
        this.c = new ap_0(b2.c);
        this.f = new am(b2.f);
        this.d = new ap_0(b2.d);
        this.e = new ap_0(b2.e);
        this.g = new am(b2.g);
        this.f = new ap_0(b2.f);
        this.g = new ap_0(b2.g);
        this.h = new am(b2.h);
        this.h = new ap_0(b2.h);
        this.i = new ap_0(b2.i);
        this.i = new am(b2.i);
        this.j = new ap_0(b2.j);
        this.d = b2.d;
        this.k = b2.k;
    }

    public ar(String name, int parent, int child, int type, int target, float x, float y, float z, float effectFactor) {
        this.c = new ap_0();
        this.f = new am();
        this.d = new ap_0(1.0f, 1.0f, 1.0f);
        this.e = new ap_0();
        this.g = new am();
        this.f = new ap_0(1.0f, 1.0f, 1.0f);
        this.h = new ap_0(1.0f, 1.0f, 1.0f);
        this.j = new ap_0(1.0f, 1.0f, 1.0f);
        this.j = new am();
        this.k = new ap_0();
        this.l = new am();
        this.m = new am();
        this.l = new ap_0();
        this.m = new ap_0();
        this.n = new ap_0();
        this.o = new ap_0();
        this.a = new al[3];
        this.a = new ap_0[3];
        this.a = new am[3];
        this.a = name;
        this.a = parent;
        this.b = child;
        this.c = type;
        this.d = target;
        this.a = x;
        this.b = y;
        this.c = z;
        this.d = effectFactor;
        this.a = new ArrayList();
        this.i = new ap_0(x, y, z);
        this.g = new ap_0(this.i);
        this.c = new ap_0(this.g);
        this.i = new am();
        this.h = new am();
        this.f = new am(this.h);
        this.e = new ap_0(this.c);
        this.g = new am(this.h);
        this.c = new am();
        this.d = new am();
        this.e = new am();
        this.b = new am();
    }

    public void a(ar b2) {
        this.a = new String(b2.a);
        this.a = b2.a;
        this.b = b2.b;
        this.c = b2.c;
        this.d = b2.d;
        this.a = b2.a;
        this.b = b2.b;
        this.c = b2.c;
        this.e = b2.e;
        if (this.a != null) {
            for (int i2 = 0; i2 < ((String)this.a).length; ++i2) {
                b2.a[i2] = new ArrayList(this.a[i2]);
            }
        }
        this.a = new ArrayList(b2.a);
        this.b = new al(b2.b);
        if (b2.a != null) {
            this.a = new ap_0(b2.a);
        }
        if (b2.a != null) {
            this.a = new am(b2.a);
        }
        if (b2.b != null) {
            this.b = new ap_0(b2.b);
        }
        this.c = new ap_0(b2.c);
        this.f = new am(b2.f);
        this.d = new ap_0(b2.d);
        this.e = new ap_0(b2.e);
        this.g = new am(b2.g);
        this.f = new ap_0(b2.f);
        this.g = new ap_0(b2.g);
        this.h = new am(b2.h);
        this.h = new ap_0(b2.h);
        this.i = new ap_0(b2.i);
        this.i = new am(b2.i);
        this.j = new ap_0(b2.j);
        this.d = b2.d;
        this.k = this.k;
    }

    public ap_0 a(ArrayList<ar> bs) {
        ar parent = this.a(bs);
        if (parent != null) {
            return this.c.l(parent.c);
        }
        return null;
    }

    public final void a(ac pfi, ArrayList<Integer> doneParent) {
        ArrayList<ar> bs = pfi.c;
        ar parent = this.a(bs);
        if (parent != null) {
            ar target;
            am parent_worldRot = parent.g;
            am targetRot = new am();
            if (this.d > -1 && pfi.c.size() > this.d && (target = pfi.c.get(this.d)) != null) {
                targetRot = new am();
                targetRot.b(this.b ? target.l : target.f, this.d);
                targetRot.a();
            }
            if (doneParent.indexOf(parent.a(bs)) != -1) {
                if (this.k != null) {
                    if (this.b) {
                        ap_0 v3 = new ap_0();
                        this.m.a(v3);
                        this.k.a(parent_worldRot.f(this.m), this.g);
                    } else {
                        this.k.a(parent_worldRot.f(this.f), this.g);
                    }
                    this.g.g(targetRot);
                } else {
                    parent_worldRot.a(this.b ? this.l : this.f, this.g);
                    this.g.g(targetRot);
                }
                parent.f.c(this.d, this.f);
                parent.g.a(this.b ? this.l : this.c, this.e);
                this.e.h(parent.d);
                this.e.c(parent.e);
                doneParent.add(this.a(bs));
                if (((ArrayList)((Object)parent.a)).indexOf(this.a(bs)) == -1) {
                    ((ArrayList)((Object)parent.a)).add(this.a(bs));
                }
            } else {
                parent.a(pfi, doneParent);
                doneParent.add(parent.a(bs));
                parent_worldRot.a(this.b ? this.l : this.f, this.g);
                this.g.g(targetRot);
                parent.f.c(this.d, this.f);
                parent.g.a(this.b ? this.l : this.c, this.e);
                this.e.h(parent.d);
                this.e.c(parent.e);
            }
        } else {
            this.g.a(this.b ? this.l : this.f);
            this.e.a(this.b ? this.l : this.c);
            this.f.a(this.d);
            doneParent.add(this.a(bs));
        }
        if (this.a == null) {
            this.a();
        }
    }

    public void a(al outTransform, ArrayList<ar> bs) {
        am tmp1 = new am(0.0f, 0.0f, 0.0f, 1.0f);
        ap_0 tmp2 = new ap_0(0.0f, 0.0f, 0.0f);
        ap_0 tmp3 = new ap_0(0.0f, 0.0f, 0.0f);
        ap_0 scale = this.f.c(this.b, tmp3);
        am rotate = this.g.a(this.a, tmp1);
        ap_0 translate = this.e.a(rotate.a(scale.c(this.a, tmp2), tmp2), tmp2);
        if (this.a.equals("\u982d")) {
            // empty if block
        }
        if (this.e == 1) {
            // empty if block
        }
        if (b_0.c) {
            if (this.e == 1) {
                if (this.n == null) {
                    return;
                }
                rotate = this.n.a(this.a, tmp1);
                translate = this.p.a(rotate.a(scale.c(this.a, tmp2), tmp2), tmp2);
            } else if (this.e == 2) {
                if (this.n == null) {
                    return;
                }
                rotate = this.n.a(this.a, tmp1);
                ar parent = this.a(bs);
                translate = parent != null && parent.e == 2 && parent.p != null ? this.p.a(rotate.a(scale.c(this.a, tmp2), tmp2), tmp2) : this.e.a(rotate.a(scale.c(this.a, tmp2), tmp2), tmp2);
            }
        }
        outTransform.a();
        outTransform.a(translate, scale, rotate.a(new ak()));
    }

    public void a() {
        this.g.a(this.c);
        this.h.a(this.f);
        this.h.a(this.d);
        if (this.a == null) {
            this.a = new ap_0();
            this.a = new am();
            this.b = new ap_0();
        }
        this.a.a(this.e);
        this.a.b();
        this.a.a(this.g);
        this.a.d();
        this.b.a(ap_0.f);
    }

    public int a(ArrayList<ar> bs) {
        int id = 0;
        for (int i2 = 0; i2 < bs.size(); ++i2) {
            if (!bs.get((int)i2).a.equals(this.a)) continue;
            id = i2;
            break;
        }
        return id;
    }

    public ar a(ArrayList<ar> bs) {
        ar parent = null;
        for (int i2 = 0; i2 < bs.size(); ++i2) {
            if (this.a != i2 || bs.get(i2) == null) continue;
            parent = bs.get(i2);
            break;
        }
        return parent;
    }
}

