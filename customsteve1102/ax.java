/*
 * Decompiled with CFR 0.152.
 */
package customsteve;

import customsteve.aB;
import customsteve.aH;
import customsteve.ai_0;
import java.util.ArrayList;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ax {
    public String a;
    public ai_0[] a;
    public ai_0[] b;
    public ai_0[] c;
    public ArrayList<aH> a;
    public int a;
    public ArrayList<aB> b;

    public ax(String ID, ai_0[] vn, ai_0[] v, ArrayList<aH> f2, int m2) {
        this.a = m2;
        this.a = ID;
        this.b = vn;
        this.c = v;
        this.a = new ai_0[v.length];
        for (int i2 = 0; i2 < v.length; ++i2) {
            this.a[i2] = new ai_0(v[i2]);
        }
        this.a = f2;
    }

    public ax(String ID, ai_0[] vn, ai_0[] v, ArrayList<aH> f2, ArrayList<aB> m2) {
        this.b = m2;
        this.a = ID;
        this.b = vn;
        this.c = v;
        this.a = new ai_0[v.length];
        for (int i2 = 0; i2 < v.length; ++i2) {
            this.a[i2] = new ai_0(v[i2]);
        }
        this.a = f2;
    }

    public void a() {
        int faceNum = ((ArrayList)((Object)this.a)).size();
        aH[] faces = new aH[faceNum];
        for (int i2 = 0; i2 < faceNum; ++i2) {
            faces[i2] = new aH();
            faces[i2].b = ((aH)((ArrayList)((Object)this.a)).get((int)i2)).b;
            for (int j2 = 0; j2 < 3; ++j2) {
            }
            faces[i2].a = ((aH)((ArrayList)((Object)this.a)).get((int)i2)).a;
        }
    }
}

