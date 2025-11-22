/*
 * Decompiled with CFR 0.152.
 */
package customsteve.jni;

import customsteve.ModContainer;
import customsteve.ac;
import customsteve.ac_0;
import customsteve.al;
import customsteve.am;
import customsteve.ap_0;
import customsteve.ar;
import customsteve.au;
import customsteve.b_0;
import java.io.File;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class CS_Bullet {
    public static final int a = 1;
    public static final int b = 16;
    public static boolean a = true;
    boolean b = true;

    public CS_Bullet() {
        StringBuilder sb = new StringBuilder();
        sb.append(ModContainer.b);
        sb.append(File.separatorChar);
        sb.append("CustomSteve");
        sb.append(File.separatorChar);
        sb.append("natives");
        sb.append(File.separatorChar);
        String os = System.getProperty("os.name").toLowerCase();
        String arch = System.getProperty("os.arch");
        String version = System.getProperty("os.version");
        try {
            if (os.indexOf("win") != -1) {
                if (arch.indexOf("64") != -1) {
                    sb.append("bullet64.dll");
                } else {
                    sb.append("bullet32.dll");
                }
            } else {
                throw new Exception("No available library for your os:" + os + " " + version);
            }
            String path = sb.toString();
            File library = new File(path);
            if (!library.exists()) {
                throw new Exception("An library is available for your os:" + os + " " + version + ". But can't find it:" + path);
            }
            System.load(sb.toString());
        }
        catch (Throwable e2) {
            e2.printStackTrace();
            a = false;
            b_0.c = false;
        }
    }

    public void a() {
        if (this.b) {
            this.Init();
        }
        this.b = false;
        for (int i2 = 0; i2 < 2; ++i2) {
        }
    }

    public void a(ac pfi, ap_0 loc) {
        int i2;
        for (i2 = 0; i2 < pfi.g.size(); ++i2) {
            pfi.g.get((int)i2).e = this.a(pfi.g.get(i2), pfi, loc);
        }
        for (i2 = 0; i2 < pfi.f.size(); ++i2) {
            this.a(pfi.f.get(i2), pfi);
        }
    }

    public void b(ac pfi, ap_0 loc) {
        this.d(pfi, loc);
    }

    public void b() {
        ++b_0.i;
        for (int i2 = 0; i2 < 1; ++i2) {
            this.a(b_0.j == 0 ? 0.033333335f : 0.016666668f, 100);
        }
    }

    public void c(ac pfi, ap_0 loc) {
        for (int i2 = 0; i2 < pfi.g.size(); ++i2) {
            ap_0 vec3;
            am qua;
            al ma;
            ar b2;
            ac_0 rb;
            if (pfi.g.get((int)i2).d != 0) {
                rb = pfi.g.get(i2);
                b2 = null;
                try {
                    b2 = pfi.c.get(rb.a);
                }
                catch (Exception exception) {
                    // empty catch block
                }
                float[] matrix = new float[16];
                this.b(pfi.g.get((int)i2).e, matrix, new float[]{rb.d, rb.e, rb.f}, new float[]{rb.g, rb.h, rb.i});
                ap_0 trans = new ap_0();
                ma = new al();
                ma.a();
                ma.b(matrix, false);
                qua = ma.a();
                vec3 = ma.a();
                am q2 = new am(qua);
                trans = new ap_0(vec3);
                if (b2 != null) {
                    if (b2.n == null) {
                        return;
                    }
                    b2.n.a(q2);
                    if (rb.d == 2) {
                        // empty if block
                    }
                    b2.p.a(trans.l(loc));
                }
            }
            if (!b_0.o) continue;
            rb = pfi.g.get(i2);
            b2 = null;
            try {
                if (pfi.c.size() > rb.a) {
                    b2 = pfi.c.get(rb.a);
                }
            }
            catch (Exception matrix) {
                // empty catch block
            }
            float rx = rb.g;
            if (rb.i / 3.14157f * 180.0f > 90.0f || rb.i / 3.14157f * 180.0f < -90.0f) {
                rx = -rb.g;
            }
            al rigidbodyToBone = new al();
            rigidbodyToBone.d(new ap_0(rb.d, rb.e, rb.f));
            rigidbodyToBone.b(new am().a(rx, rb.h, rb.i));
            ma = new al();
            if (b2 != null) {
                if (rb.d > 0) {
                    ma.b(b2.n);
                    if (rb.d == 2) {
                        // empty if block
                    }
                    ma.d(b2.p);
                } else {
                    ma.b(b2.g);
                    ma.d(b2.e);
                }
                ma.c(rigidbodyToBone);
            } else {
                float[] matrix = new float[16];
                this.b(pfi.g.get((int)i2).e, matrix, new float[]{0.0f, 0.0f, 0.0f}, new float[]{rb.g, rb.h, rb.i});
                ap_0 trans = new ap_0();
                al matrix4f = new al();
                matrix4f.a();
                matrix4f.b(matrix, false);
                ma = matrix4f;
            }
            qua = ma.a();
            vec3 = ma.a();
            rb.a.a(qua);
            rb.a.a(vec3.l(loc));
        }
    }

    public int a(ac_0 rb, ac pfi, ap_0 loc) {
        ar b2 = null;
        try {
            b2 = pfi.c.get(rb.a);
        }
        catch (Exception exception) {
            // empty catch block
        }
        al ma = new al();
        ma.a();
        if (b2 != null) {
            ma.b(b2.g);
            ap_0 trans = b2.e;
            ma.d(trans.b(loc));
            b2.p = new ap_0();
            b2.n = new am();
            rb.a.a(b2.i);
            rb.a.c(new ap_0(rb.d, rb.e, rb.f));
            return this.AddRigidBody(rb.d, rb.c, rb.a, rb.b, rb.c, new float[]{rb.d, rb.e, rb.f}, new float[]{rb.g, rb.h, rb.i}, new float[]{b2.a, b2.b, b2.c}, ma.a(), rb.j, rb.k, rb.l, rb.m, rb.n, rb.a, rb.b);
        }
        return this.AddRigidBody(rb.d, rb.c, rb.a, rb.b, rb.c, new float[]{rb.d, rb.e, rb.f}, new float[]{rb.g, rb.h, rb.i}, new float[]{0.0f, 0.0f, 0.0f}, ma.a(), rb.j, rb.k, rb.l, rb.m, rb.n, rb.a, rb.b);
    }

    public int a(au c2, ac pfi) {
        if ((long)pfi.g.size() < c2.a || (long)pfi.g.size() < c2.b) {
            return -1;
        }
        int rb1 = pfi.g.get((int)((int)c2.a)).e;
        int rb2 = pfi.g.get((int)((int)c2.b)).e;
        return this.AddJoint(rb1, rb2, new float[]{c2.a, c2.b, c2.c}, new float[]{c2.d, c2.e, c2.f}, new float[]{c2.g, c2.h, c2.i}, new float[]{c2.j, c2.k, c2.l}, new float[]{c2.m, c2.n, c2.o}, new float[]{c2.p, c2.q, c2.r}, new float[]{c2.s, c2.t, c2.u}, new float[]{c2.v, c2.w, c2.x});
    }

    public void a(float step, int max) {
        this.StepSimulation(step, max);
    }

    public void d(ac pfi, ap_0 loc) {
        for (int i2 = 0; i2 < pfi.g.size(); ++i2) {
            ac_0 rb = pfi.g.get(i2);
            if (!b_0.c || rb.a >= pfi.c.size() || rb.a < 0 || rb.d != 0) continue;
            ar b2 = pfi.c.get(rb.a);
            al ma = new al();
            ma.a();
            ma.b(pfi.c.get((int)rb.a).g);
            ap_0 trans = pfi.c.get((int)rb.a).e;
            ma.d(trans.b(loc));
            this.a(rb.e, ma.a(), new float[]{rb.d, rb.e, rb.f}, new float[]{rb.g, rb.h, rb.i});
        }
    }

    public void a(int rb, float[] matrix, float[] pos, float[] rot) {
        this.SetBoneMatrix(rb, matrix, pos, rot);
    }

    public void b(int rb, float[] matrix, float[] pos, float[] rot) {
        this.GetBoneMatrix(rb, matrix, pos, rot);
    }

    public void a(ac pfi) {
        this.Clear();
    }

    public void a(ap_0 vec3) {
    }

    private native void Init();

    private native void Clear();

    private native void StepSimulation(float var1, int var2);

    private native float GetBoneMatrix(int var1, float[] var2, float[] var3, float[] var4);

    private native float SetBoneMatrix(int var1, float[] var2, float[] var3, float[] var4);

    private native int AddRigidBody(int var1, int var2, float var3, float var4, float var5, float[] var6, float[] var7, float[] var8, float[] var9, float var10, float var11, float var12, float var13, float var14, byte var15, int var16);

    private native int AddJoint(int var1, int var2, float[] var3, float[] var4, float[] var5, float[] var6, float[] var7, float[] var8, float[] var9, float[] var10);
}

