/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;

public class CS_Bullet {
    public static final int feels$ = 1;
    public static final int fetish$ = 16;
    public static boolean income$ = true;
    boolean daisy$ = true;

    public CS_Bullet() {
        StringBuilder sb = new StringBuilder();
        sb.append(ModContainer.outreach$);
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
            income$ = false;
            Config.point$ = false;
        }
    }

    public void _savings() {
        if (this.daisy$) {
            this.Init();
        }
        this.daisy$ = false;
        for (int i = 0; i < 2; ++i) {
        }
    }

    public void _contests(PmdFileInfo pfi, Vector3f loc) {
        int i;
        for (i = 0; i < pfi.adopt$.size(); ++i) {
            ((RigidBody)pfi.adopt$.get((int)i)).american$ = this._genome((RigidBody)pfi.adopt$.get(i), pfi, loc);
        }
        for (i = 0; i < pfi.dressing$.size(); ++i) {
            this._peterson((Constraint)pfi.dressing$.get(i), pfi);
        }
    }

    public void _obtained(PmdFileInfo pfi, Vector3f loc) {
        this._access(pfi, loc);
    }

    public void _treated() {
        ++Config.terminal$;
        for (int i = 0; i < 1; ++i) {
            this._chevy(Config.filter$ == 0 ? 0.033333335f : 0.016666668f, 100);
        }
    }

    public void _train(PmdFileInfo pfi, Vector3f loc) {
        for (int i = 0; i < pfi.adopt$.size(); ++i) {
            Vector3f vec3;
            Quaternion qua;
            Matrix4f ma;
            Bone b2;
            RigidBody rb;
            if (((RigidBody)pfi.adopt$.get((int)i)).studio$ != 0) {
                rb = (RigidBody)pfi.adopt$.get(i);
                b2 = null;
                try {
                    b2 = (Bone)pfi.pointer$.get(rb.frequent$);
                }
                catch (Exception exception) {
                    // empty catch block
                }
                float[] matrix = new float[16];
                this._actions(((RigidBody)pfi.adopt$.get((int)i)).american$, matrix, new float[]{rb.nothing$, rb.pleasure$, rb.matching$}, new float[]{rb.refuse$, rb.heating$, rb.brands$});
                Vector3f trans = new Vector3f();
                ma = new Matrix4f();
                ma._bikes();
                ma._logitech(matrix, false);
                qua = ma._strictly();
                vec3 = ma._jerry();
                Quaternion q = new Quaternion(qua);
                trans = new Vector3f(vec3);
                if (b2 != null) {
                    if (b2.alien$ == null) {
                        return;
                    }
                    b2.alien$._folks(q);
                    if (rb.studio$ == 2) {
                        // empty if block
                    }
                    b2.exact$._shoot(trans._based(loc));
                }
            }
            if (!Config.songs$) continue;
            rb = (RigidBody)pfi.adopt$.get(i);
            b2 = null;
            try {
                if (pfi.pointer$.size() > rb.frequent$) {
                    b2 = (Bone)pfi.pointer$.get(rb.frequent$);
                }
            }
            catch (Exception matrix) {
                // empty catch block
            }
            float rx = rb.refuse$;
            if (rb.brands$ / 3.14157f * 180.0f > 90.0f || rb.brands$ / 3.14157f * 180.0f < -90.0f) {
                rx = -rb.refuse$;
            }
            Matrix4f rigidbodyToBone = new Matrix4f();
            rigidbodyToBone._castle(new Vector3f(rb.nothing$, rb.pleasure$, rb.matching$));
            rigidbodyToBone._subaru(new Quaternion()._between(rx, rb.heating$, rb.brands$));
            ma = new Matrix4f();
            if (b2 != null) {
                if (rb.studio$ > 0) {
                    ma._subaru(b2.alien$);
                    if (rb.studio$ == 2) {
                        // empty if block
                    }
                    ma._castle(b2.exact$);
                } else {
                    ma._subaru(b2.sciences$);
                    ma._castle(b2.rankings$);
                }
                ma._curious(rigidbodyToBone);
            } else {
                float[] matrix = new float[16];
                this._actions(((RigidBody)pfi.adopt$.get((int)i)).american$, matrix, new float[]{0.0f, 0.0f, 0.0f}, new float[]{rb.refuse$, rb.heating$, rb.brands$});
                Vector3f trans = new Vector3f();
                Matrix4f matrix4f = new Matrix4f();
                matrix4f._bikes();
                matrix4f._logitech(matrix, false);
                ma = matrix4f;
            }
            qua = ma._strictly();
            vec3 = ma._jerry();
            rb.owner$._folks(qua);
            rb.escape$._shoot(vec3._based(loc));
        }
    }

    public int _genome(RigidBody rb, PmdFileInfo pfi, Vector3f loc) {
        Bone b2 = null;
        try {
            b2 = (Bone)pfi.pointer$.get(rb.frequent$);
        }
        catch (Exception exception) {
            // empty catch block
        }
        Matrix4f ma = new Matrix4f();
        ma._bikes();
        if (b2 != null) {
            ma._subaru(b2.sciences$);
            Vector3f trans = b2.rankings$;
            ma._castle(trans._approval(loc));
            b2.exact$ = new Vector3f();
            b2.alien$ = new Quaternion();
            rb.escape$._shoot(b2.pencil$);
            rb.escape$._kinda(new Vector3f(rb.nothing$, rb.pleasure$, rb.matching$));
            return this.AddRigidBody(rb.studio$, rb.lucia$, rb.naples$, rb.filing$, rb.sorts$, new float[]{rb.nothing$, rb.pleasure$, rb.matching$}, new float[]{rb.refuse$, rb.heating$, rb.brands$}, new float[]{b2.humor$, b2.electric$, b2.missile$}, ma._ghost(), rb.waters$, rb.travel$, rb.formerly$, rb.scary$, rb.arabic$, rb.beaver$, rb.hotel$);
        }
        return this.AddRigidBody(rb.studio$, rb.lucia$, rb.naples$, rb.filing$, rb.sorts$, new float[]{rb.nothing$, rb.pleasure$, rb.matching$}, new float[]{rb.refuse$, rb.heating$, rb.brands$}, new float[]{0.0f, 0.0f, 0.0f}, ma._ghost(), rb.waters$, rb.travel$, rb.formerly$, rb.scary$, rb.arabic$, rb.beaver$, rb.hotel$);
    }

    public int _peterson(Constraint c2, PmdFileInfo pfi) {
        if ((long)pfi.adopt$.size() < c2.butter$ || (long)pfi.adopt$.size() < c2.zealand$) {
            return -1;
        }
        int rb1 = ((RigidBody)pfi.adopt$.get((int)((int)c2.butter$))).american$;
        int rb2 = ((RigidBody)pfi.adopt$.get((int)((int)c2.zealand$))).american$;
        return this.AddJoint(rb1, rb2, new float[]{c2.sunset$, c2.gallery$, c2.serve$}, new float[]{c2.military$, c2.claimed$, c2.viewers$}, new float[]{c2.crimes$, c2.wishes$, c2.visit$}, new float[]{c2.forth$, c2.animated$, c2.except$}, new float[]{c2.mobile$, c2.avatar$, c2.lamps$}, new float[]{c2.compiled$, c2.retain$, c2.lifetime$}, new float[]{c2.spirits$, c2.vegas$, c2.clients$}, new float[]{c2.klein$, c2.porter$, c2.student$});
    }

    public void _chevy(float step, int max) {
        this.StepSimulation(step, max);
    }

    public void _access(PmdFileInfo pfi, Vector3f loc) {
        for (int i = 0; i < pfi.adopt$.size(); ++i) {
            RigidBody rb = (RigidBody)pfi.adopt$.get(i);
            if (!Config.point$ || rb.frequent$ >= pfi.pointer$.size() || rb.frequent$ < 0 || rb.studio$ != 0) continue;
            Bone b2 = (Bone)pfi.pointer$.get(rb.frequent$);
            Matrix4f ma = new Matrix4f();
            ma._bikes();
            ma._subaru(((Bone)pfi.pointer$.get((int)rb.frequent$)).sciences$);
            Vector3f trans = ((Bone)pfi.pointer$.get((int)rb.frequent$)).rankings$;
            ma._castle(trans._approval(loc));
            this._grants(rb.american$, ma._ghost(), new float[]{rb.nothing$, rb.pleasure$, rb.matching$}, new float[]{rb.refuse$, rb.heating$, rb.brands$});
        }
    }

    public void _grants(int rb, float[] matrix, float[] pos, float[] rot) {
        this.SetBoneMatrix(rb, matrix, pos, rot);
    }

    public void _actions(int rb, float[] matrix, float[] pos, float[] rot) {
        this.GetBoneMatrix(rb, matrix, pos, rot);
    }

    public void _hewlett(PmdFileInfo pfi) {
        this.Clear();
    }

    public void _costa(Vector3f vec3) {
    }

    private native void Init();

    private native void Clear();

    private native void StepSimulation(float var1, int var2);

    private native float GetBoneMatrix(int var1, float[] var2, float[] var3, float[] var4);

    private native float SetBoneMatrix(int var1, float[] var2, float[] var3, float[] var4);

    private native int AddRigidBody(int var1, int var2, float var3, float var4, float var5, float[] var6, float[] var7, float[] var8, float[] var9, float var10, float var11, float var12, float var13, float var14, byte var15, int var16);

    private native int AddJoint(int var1, int var2, float[] var3, float[] var4, float[] var5, float[] var6, float[] var7, float[] var8, float[] var9, float[] var10);
}

