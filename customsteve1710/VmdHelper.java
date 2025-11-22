/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class VmdHelper {
    ArrayList usage$ = new ArrayList();
    ArrayList exceed$ = new ArrayList();
    static final String digital$ = "CustomSteve is Copyright (c) 2014 by ici2cc";

    public VmdHelper(ArrayList j, ArrayList f2) {
        this.usage$ = j;
        this.exceed$ = f2;
    }

    public void _relates(Vertex souV, Vertex resV, int index, long faceP) {
        float rny;
        float vtx = souV.writes$;
        float vty = souV.shower$;
        float vtz = souV.colors$;
        float vtnx = souV.sudan$;
        float vtny = souV.applying$;
        float vtnz = souV.quantity$;
        if (resV.embassy$) {
            ArrayList vfs = resV.passion$;
            ArrayList vms = resV.phase$;
            for (int i = 0; i < vfs.size(); ++i) {
                float s;
                if ((Integer)vfs.get(i) >= this.exceed$.size()) continue;
                pmxMorph f2 = (pmxMorph)this.exceed$.get((Integer)vfs.get(i));
                Vector3f max = new Vector3f((Vector3f)vms.get(i));
                if (f2.locator$ != null && (long)f2.locator$.size() > faceP) {
                    s = ((Float)f2.locator$.get((int)faceP)).floatValue();
                    s = !f2.strange$ ? ((Float)f2.locator$.get((int)faceP)).floatValue() : f2.stood$;
                    max._licence(s);
                    vtx += max.serves$;
                    vty += max.genius$;
                    vtz += max.superb$;
                    continue;
                }
                if (!f2.strange$) continue;
                s = 0.0f;
                s = f2.stood$;
                max._licence(s);
                vtx += max.serves$;
                vty += max.genius$;
                vtz += max.superb$;
            }
        }
        if (souV.forecast$ instanceof BDEF) {
            BDEF bdef = (BDEF)souV.forecast$;
            Bone fb2 = (Bone)this.usage$.get(bdef.a());
            if (fb2 != null) {
                float rx = 0.0f;
                float ry = 0.0f;
                float rz = 0.0f;
                float rnx = 0.0f;
                float rny2 = 0.0f;
                float rnz = 0.0f;
                float weight = 1.0f;
                Matrix4f mat = new Matrix4f();
                fb2._milan(mat, this.usage$);
                rx = (mat.oriented$ * vtx + mat.quality$ * vty + mat.sugar$ * vtz + mat.beaches$) * weight;
                ry = (mat.wages$ * vtx + mat.ivory$ * vty + mat.truly$ * vtz + mat.registry$) * weight;
                rz = (mat.lopez$ * vtx + mat.harold$ * vty + mat.boston$ * vtz + mat.stated$) * weight;
                resV.writes$ = rx;
                resV.shower$ = ry;
                resV.colors$ = rz;
                mat._castle(new Vector3f(0.0f, 0.0f, 0.0f));
                rnx = (mat.oriented$ * vtnx + mat.quality$ * vtny + mat.sugar$ * vtnz + mat.beaches$) * weight;
                rny2 = (mat.wages$ * vtnx + mat.ivory$ * vtny + mat.truly$ * vtnz + mat.registry$) * weight;
                rnz = (mat.lopez$ * vtnx + mat.harold$ * vtny + mat.boston$ * vtnz + mat.stated$) * weight;
                resV.sudan$ = rnx;
                resV.applying$ = rny2;
                resV.quantity$ = rnz;
            }
        } else if (souV.forecast$ instanceof BDEF2) {
            BDEF2 bdef2 = (BDEF2)souV.forecast$;
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
            for (int i = 0; i < 2; ++i) {
                Bone fb3 = null;
                fb3 = i == 0 ? (Bone)this.usage$.get(bdef2.a()) : (Bone)this.usage$.get(bdef2.b());
                float weight = 0.0f;
                weight = i == 0 ? bdef2.a() : 1.0f - bdef2.a();
                rx = 0.0f;
                ry = 0.0f;
                rz = 0.0f;
                Matrix4f mat = new Matrix4f();
                fb3._milan(mat, this.usage$);
                rx += (mat.oriented$ * vtx + mat.quality$ * vty + mat.sugar$ * vtz + mat.beaches$) * weight;
                ry += (mat.wages$ * vtx + mat.ivory$ * vty + mat.truly$ * vtz + mat.registry$) * weight;
                rz += (mat.lopez$ * vtx + mat.harold$ * vty + mat.boston$ * vtz + mat.stated$) * weight;
                mat._castle(new Vector3f(0.0f, 0.0f, 0.0f));
                rnx = (mat.oriented$ * vtnx + mat.quality$ * vtny + mat.sugar$ * vtnz + mat.beaches$) * weight;
                rny = (mat.wages$ * vtnx + mat.ivory$ * vtny + mat.truly$ * vtnz + mat.registry$) * weight;
                rnz = (mat.lopez$ * vtnx + mat.harold$ * vtny + mat.boston$ * vtnz + mat.stated$) * weight;
                if (i == 0) {
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
            resV.sudan$ = rnx;
            resV.applying$ = rny;
            resV.quantity$ = rnz;
            resV.writes$ = rx;
            resV.shower$ = ry;
            resV.colors$ = rz;
        } else if (souV.forecast$ instanceof BDEF4) {
            BDEF4 bdef4 = (BDEF4)souV.forecast$;
            float rx = 0.0f;
            float ry = 0.0f;
            float rz = 0.0f;
            float rnx = 0.0f;
            rny = 0.0f;
            float rnz = 0.0f;
            for (int i = 0; i < 4; ++i) {
                Bone fb4 = null;
                float weight = 0.0f;
                switch (i) {
                    case 0: {
                        fb4 = (Bone)this.usage$.get(bdef4.a());
                        weight = bdef4.a();
                        break;
                    }
                    case 1: {
                        fb4 = (Bone)this.usage$.get(bdef4.b());
                        weight = bdef4.b();
                        break;
                    }
                    case 2: {
                        fb4 = (Bone)this.usage$.get(bdef4.c());
                        weight = bdef4.c();
                        break;
                    }
                    case 3: {
                        fb4 = (Bone)this.usage$.get(bdef4.d());
                        weight = bdef4.d();
                    }
                }
                Matrix4f mat = new Matrix4f();
                fb4._milan(mat, this.usage$);
                rx += (mat.oriented$ * vtx + mat.quality$ * vty + mat.sugar$ * vtz + mat.beaches$) * weight;
                ry += (mat.wages$ * vtx + mat.ivory$ * vty + mat.truly$ * vtz + mat.registry$) * weight;
                rz += (mat.lopez$ * vtx + mat.harold$ * vty + mat.boston$ * vtz + mat.stated$) * weight;
                mat._castle(new Vector3f(0.0f, 0.0f, 0.0f));
                rnx += (mat.oriented$ * vtnx + mat.quality$ * vtny + mat.sugar$ * vtnz + mat.beaches$) * weight;
                rny += (mat.wages$ * vtnx + mat.ivory$ * vtny + mat.truly$ * vtnz + mat.registry$) * weight;
                rnz += (mat.lopez$ * vtnx + mat.harold$ * vtny + mat.boston$ * vtnz + mat.stated$) * weight;
            }
            resV.sudan$ = rnx;
            resV.applying$ = rny;
            resV.quantity$ = rnz;
            resV.writes$ = rx;
            resV.shower$ = ry;
            resV.colors$ = rz;
        } else if (souV.forecast$ instanceof SDEF) {
            SDEF sdef = (SDEF)souV.forecast$;
            Bone b0 = (Bone)this.usage$.get(sdef.a());
            Bone b1 = (Bone)this.usage$.get(sdef.b());
            float weight0 = sdef.a();
            float weight1 = 1.0f - sdef.a();
            Matrix4f mat0 = new Matrix4f();
            Matrix4f mat1 = new Matrix4f();
            b0._milan(mat0, this.usage$);
            b1._milan(mat1, this.usage$);
            Matrix4f tempMatrix = mat0._chemical(weight0)._brakes(mat1._chemical(weight1));
            Vector3f mv = new Vector3f(vtx, vty, vtz);
            Vector3f mnv = new Vector3f(souV.sudan$, souV.applying$, souV.quantity$);
            Vector3f sdefRW0 = sdef.a();
            Vector3f sdefRW1 = sdef.b();
            Matrix4f m4f0 = new Matrix4f();
            m4f0._subaru(b0.sciences$);
            m4f0._optimum(1.0f, 1.0f, 1.0f);
            Matrix4f m4f1 = new Matrix4f();
            m4f1._subaru(b1.sciences$);
            m4f1._optimum(1.0f, 1.0f, 1.0f);
            Vector3f vector = m4f0._circles(sdefRW0, null);
            Vector3f vector2 = m4f1._circles(sdefRW1, null);
            Vector3f vector3 = mat0._count(sdef.c());
            Vector3f vector4 = mat1._count(sdef.c());
            Vector3f vector5 = vector3._based(sdef.c())._approval(vector._survival(0.5f))._survival(weight0)._approval(vector4._based(sdef.c())._approval(vector2._survival(0.5f))._survival(weight1))._approval(sdef.c());
            Matrix4f matrix = new Matrix4f();
            matrix._subaru(new Quaternion()._calendar(m4f0._strictly(), m4f1._strictly(), weight1));
            Matrix4f matrixT = new Matrix4f();
            matrixT._subaru(new Quaternion()._calendar(mat0._strictly(), mat1._strictly(), weight1));
            mv = matrixT._circles(mv._based(sdef.c()), null)._approval(vector5);
            tempMatrix._castle(new Vector3f(0.0f, 0.0f, 0.0f));
            mnv = tempMatrix._count(mnv);
            resV.sudan$ = mnv.serves$;
            resV.applying$ = mnv.genius$;
            resV.quantity$ = mnv.superb$;
            resV.writes$ = mv.serves$;
            resV.shower$ = mv.genius$;
            resV.colors$ = mv.superb$;
        }
    }
}

