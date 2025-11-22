/*
 * Decompiled with CFR 0.152.
 */
package customsteve;

import customsteve.aQ;
import customsteve.ai_0;
import customsteve.aj_0;
import customsteve.ak_0;
import customsteve.al;
import customsteve.al_0;
import customsteve.am;
import customsteve.an_0;
import customsteve.ap_0;
import customsteve.ar;
import java.util.ArrayList;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class j {
    ArrayList<ar> a = new ArrayList();
    ArrayList<aQ> b = new ArrayList();
    static final String a = "CustomSteve is Copyright (c) 2014 by ici2cc";

    public j(ArrayList<ar> j2, ArrayList<aQ> f2) {
        this.a = j2;
        this.b = f2;
    }

    public void a(ai_0 souV, ai_0 resV, int index, long faceP) {
        float rny;
        float vtx = souV.a;
        float vty = souV.b;
        float vtz = souV.c;
        float vtnx = souV.d;
        float vtny = souV.e;
        float vtnz = souV.f;
        if (resV.b) {
            float vfs = resV.a;
            float vms = resV.b;
            for (int i2 = 0; i2 < vfs.size(); ++i2) {
                float s;
                if ((Integer)vfs.get(i2) >= this.b.size()) continue;
                aQ f2 = this.b.get((Integer)vfs.get(i2));
                ap_0 max = new ap_0((ap_0)vms.get(i2));
                if (f2.u != null && (long)f2.u.size() > faceP) {
                    s = f2.u.get((int)faceP).floatValue();
                    s = !f2.a ? f2.u.get((int)faceP).floatValue() : f2.a;
                    max.b(s);
                    vtx += max.a;
                    vty += max.b;
                    vtz += max.c;
                    continue;
                }
                if (!f2.a) continue;
                s = 0.0f;
                s = f2.a;
                max.b(s);
                vtx += max.a;
                vty += max.b;
                vtz += max.c;
            }
        }
        if (souV.a instanceof aj_0) {
            aj_0 bdef = (aj_0)souV.a;
            ar fb = this.a.get(bdef.a());
            if (fb != null) {
                float rx = 0.0f;
                float ry = 0.0f;
                float rz = 0.0f;
                float rnx = 0.0f;
                float rny2 = 0.0f;
                float rnz = 0.0f;
                float weight = 1.0f;
                al mat = new al();
                fb.a(mat, this.a);
                rx = (mat.a * vtx + mat.b * vty + mat.c * vtz + mat.d) * weight;
                ry = (mat.e * vtx + mat.f * vty + mat.g * vtz + mat.h) * weight;
                rz = (mat.i * vtx + mat.j * vty + mat.k * vtz + mat.l) * weight;
                resV.a = rx;
                resV.b = ry;
                resV.c = rz;
                mat.d(new ap_0(0.0f, 0.0f, 0.0f));
                rnx = (mat.a * vtnx + mat.b * vtny + mat.c * vtnz + mat.d) * weight;
                rny2 = (mat.e * vtnx + mat.f * vtny + mat.g * vtnz + mat.h) * weight;
                rnz = (mat.i * vtnx + mat.j * vtny + mat.k * vtnz + mat.l) * weight;
                resV.d = rnx;
                resV.e = rny2;
                resV.f = rnz;
            }
        } else if (souV.a instanceof ak_0) {
            ak_0 bdef2 = (ak_0)souV.a;
            float rx = 0.0f;
            float ry = 0.0f;
            float rz = 0.0f;
            float rnx = 0.0f;
            rny = 0.0f;
            float rnz = 0.0f;
            float rrtx = 0.0f;
            float rrtnx = 0.0f;
            float rrty = 0.0f;
            float rrtny = 0.0f;
            float rrtz = 0.0f;
            float rrtnz = 0.0f;
            for (int i3 = 0; i3 < 2; ++i3) {
                ar fb = null;
                fb = i3 == 0 ? this.a.get(bdef2.a()) : this.a.get(bdef2.b());
                float weight = 0.0f;
                weight = i3 == 0 ? bdef2.a() : 1.0f - bdef2.a();
                rx = 0.0f;
                ry = 0.0f;
                rz = 0.0f;
                al mat = new al();
                fb.a(mat, this.a);
                rx += (mat.a * vtx + mat.b * vty + mat.c * vtz + mat.d) * weight;
                ry += (mat.e * vtx + mat.f * vty + mat.g * vtz + mat.h) * weight;
                rz += (mat.i * vtx + mat.j * vty + mat.k * vtz + mat.l) * weight;
                mat.d(new ap_0(0.0f, 0.0f, 0.0f));
                rnx = (mat.a * vtnx + mat.b * vtny + mat.c * vtnz + mat.d) * weight;
                rny = (mat.e * vtnx + mat.f * vtny + mat.g * vtnz + mat.h) * weight;
                rnz = (mat.i * vtnx + mat.j * vtny + mat.k * vtnz + mat.l) * weight;
                if (i3 == 0) {
                    rrtnx = rnx;
                    rrtny = rny;
                    rrtnz = rnz;
                    rrtx = rx;
                    rrty = ry;
                    rrtz = rz;
                    continue;
                }
                rnx += rrtnx;
                rny += rrtny;
                rnz += rrtnz;
                rx += rrtx;
                ry += rrty;
                rz += rrtz;
            }
            resV.d = rnx;
            resV.e = rny;
            resV.f = rnz;
            resV.a = rx;
            resV.b = ry;
            resV.c = rz;
        } else if (souV.a instanceof al_0) {
            al_0 bdef4 = (al_0)souV.a;
            float rx = 0.0f;
            float ry = 0.0f;
            float rz = 0.0f;
            float rnx = 0.0f;
            rny = 0.0f;
            float rnz = 0.0f;
            for (int i4 = 0; i4 < 4; ++i4) {
                ar fb = null;
                float weight = 0.0f;
                switch (i4) {
                    case 0: {
                        fb = this.a.get(bdef4.a());
                        weight = bdef4.a();
                        break;
                    }
                    case 1: {
                        fb = this.a.get(bdef4.b());
                        weight = bdef4.b();
                        break;
                    }
                    case 2: {
                        fb = this.a.get(bdef4.c());
                        weight = bdef4.c();
                        break;
                    }
                    case 3: {
                        fb = this.a.get(bdef4.d());
                        weight = bdef4.d();
                    }
                }
                al mat = new al();
                fb.a(mat, this.a);
                rx += (mat.a * vtx + mat.b * vty + mat.c * vtz + mat.d) * weight;
                ry += (mat.e * vtx + mat.f * vty + mat.g * vtz + mat.h) * weight;
                rz += (mat.i * vtx + mat.j * vty + mat.k * vtz + mat.l) * weight;
                mat.d(new ap_0(0.0f, 0.0f, 0.0f));
                rnx += (mat.a * vtnx + mat.b * vtny + mat.c * vtnz + mat.d) * weight;
                rny += (mat.e * vtnx + mat.f * vtny + mat.g * vtnz + mat.h) * weight;
                rnz += (mat.i * vtnx + mat.j * vtny + mat.k * vtnz + mat.l) * weight;
            }
            resV.d = rnx;
            resV.e = rny;
            resV.f = rnz;
            resV.a = rx;
            resV.b = ry;
            resV.c = rz;
        } else if (souV.a instanceof an_0) {
            an_0 sdef = (an_0)souV.a;
            ar b0 = this.a.get(sdef.a());
            ar b1 = this.a.get(sdef.b());
            float weight0 = sdef.a();
            float weight1 = 1.0f - sdef.a();
            al mat0 = new al();
            al mat1 = new al();
            b0.a(mat0, this.a);
            b1.a(mat1, this.a);
            al tempMatrix = mat0.a(weight0).f(mat1.a(weight1));
            ap_0 mv = new ap_0(vtx, vty, vtz);
            ap_0 mnv = new ap_0(souV.d, souV.e, souV.f);
            ap_0 sdefRW0 = sdef.a();
            ap_0 sdefRW1 = sdef.b();
            al m4f0 = new al();
            m4f0.b(b0.g);
            m4f0.a(1.0f, 1.0f, 1.0f);
            al m4f1 = new al();
            m4f1.b(b1.g);
            m4f1.a(1.0f, 1.0f, 1.0f);
            ap_0 vector = m4f0.b(sdefRW0, null);
            ap_0 vector2 = m4f1.b(sdefRW1, null);
            ap_0 vector3 = mat0.a(sdef.c());
            ap_0 vector4 = mat1.a(sdef.c());
            ap_0 vector5 = vector3.l(sdef.c()).b(vector.a(0.5f)).a(weight0).b(vector4.l(sdef.c()).b(vector2.a(0.5f)).a(weight1)).b(sdef.c());
            al matrix = new al();
            matrix.b(new am().b(m4f0.a(), m4f1.a(), weight1));
            al matrixT = new al();
            matrixT.b(new am().b(mat0.a(), mat1.a(), weight1));
            mv = matrixT.b(mv.l(sdef.c()), null).b(vector5);
            tempMatrix.d(new ap_0(0.0f, 0.0f, 0.0f));
            mnv = tempMatrix.a(mnv);
            resV.d = mnv.a;
            resV.e = mnv.b;
            resV.f = mnv.c;
            resV.a = mv.a;
            resV.b = mv.b;
            resV.c = mv.c;
        }
    }
}

