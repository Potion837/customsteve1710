/*
 * Decompiled with CFR 0.152.
 */
package customsteve;

import customsteve.ak;
import customsteve.al;
import customsteve.am;
import customsteve.ap_0;
import customsteve.f_0;
import java.util.ArrayList;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from customsteve.az
 */
public class az_0 {
    public String a;
    public String b;
    public float[] a;
    public float[] b;
    public ArrayList<Integer> a;
    public f_0[] a;
    public f_0[] b;
    public al a;
    private ap_0 f;
    private am e;
    private ap_0 g;
    public ap_0 a;
    public am a;
    public ap_0 b;
    public ap_0 c;
    public am b;
    public ap_0 d;
    public am c;
    private int a = 1;
    public ap_0 e;
    public am d;
    private ap_0 h;

    public az_0(String name, String p2, float[] rot, float[] trans, f_0[] rotF, f_0[] transF) {
        this.b = new ap_0(1.0f, 1.0f, 1.0f);
        this.c = new ap_0();
        this.b = new am();
        this.d = new ap_0();
        this.c = new am();
        this.h = new ap_0(1.0f, 1.0f, 1.0f);
        this.a = rotF;
        this.b = transF;
        this.a = new ArrayList();
        this.e = new ap_0(trans[0], trans[1], trans[2]);
        this.a = new ap_0(this.e);
        this.d = new am(rot);
        this.a = new am(this.d);
        this.c = new ap_0(this.a);
        this.b = new am(this.d);
        this.a = name;
        this.b = p2;
        this.a = rot;
        this.b = trans;
    }

    void a() {
        this.e.a(this.a);
        this.d.a(this.a);
        this.h.a(this.b);
        if (this.f == null) {
            this.f = new ap_0();
            this.e = new am();
            this.g = new ap_0();
        }
        this.f.a(this.c);
        this.f.b();
        this.e.a(this.b);
        this.e.d();
        this.g.a(ap_0.f);
    }

    public void a(al outTransform, boolean wtf) {
        am tmp1 = new am(0.0f, 0.0f, 0.0f, 0.0f);
        ap_0 tmp2 = new ap_0(0.0f, 0.0f, 0.0f);
        ap_0 tmp3 = new ap_0(0.0f, 0.0f, 0.0f);
        ap_0 scale = this.d.c(this.g, tmp3);
        am rotate = this.b.a(this.e, tmp1);
        ap_0 translate = this.c.a(rotate.a(scale.c(this.f, tmp2), tmp2), tmp2);
        outTransform.a();
        outTransform.a(translate, scale, rotate.a(new ak()));
    }

    public final void a(ArrayList<az_0> js, ArrayList<Integer> doneParent) {
        az_0 parent = this.a(js);
        if (parent != null) {
            if (doneParent.indexOf(parent.a(js)) != -1) {
                parent.b.a(this.a, this.b);
                parent.d.c(this.b, this.d);
                parent.b.a(this.a, this.c);
                this.c.h(parent.b);
                this.c.c(parent.c);
                doneParent.add(this.a(js));
                if (((ArrayList)((Object)parent.a)).indexOf(this.a(js)) == -1) {
                    ((ArrayList)((Object)parent.a)).add(this.a(js));
                }
            } else {
                parent.a(js, doneParent);
                doneParent.add(parent.a(js));
                parent.b.a(this.a, this.b);
                parent.d.c(this.b, this.d);
                parent.b.a(this.a, this.c);
                this.c.h(parent.b);
                this.c.c(parent.c);
            }
        } else {
            this.b.a(this.a);
            this.c.a(this.a);
            this.d.a(this.b);
            doneParent.add(this.a(js));
        }
        if (this.f == null) {
            this.a();
        }
    }

    public int a(ArrayList<az_0> js) {
        int id = 0;
        for (int i2 = 0; i2 < js.size(); ++i2) {
            if (!js.get((int)i2).a.equals(this.a)) continue;
            id = i2;
            break;
        }
        return id;
    }

    public az_0 a(ArrayList<az_0> js) {
        az_0 parent = null;
        for (int i2 = 0; i2 < js.size(); ++i2) {
            if (!js.get((int)i2).a.equals(this.b)) continue;
            parent = js.get(i2);
            break;
        }
        return parent;
    }
}

