/*
 * Decompiled with CFR 0.152.
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class SDEF
extends BoneWeight {
    private int cookie$;
    private int webpage$;
    private float belly$;
    private Vector3f ecuador$;
    private Vector3f focuses$;
    private Vector3f tomorrow$;
    private Vector3f guided$;
    private Vector3f download$;

    public Vector3f a() {
        return this.guided$;
    }

    public void a(Vector3f rW0) {
        this.guided$ = rW0;
    }

    public Vector3f b() {
        return this.download$;
    }

    public void b(Vector3f rW1) {
        this.download$ = rW1;
    }

    public SDEF(int b0, int b1, float w, Vector3f C, Vector3f R0, Vector3f R1) {
        this.cookie$ = b0;
        this.webpage$ = b1;
        this.belly$ = w;
        this.ecuador$ = C;
        this.focuses$ = R0;
        this.tomorrow$ = R1;
    }

    public int a() {
        return this.cookie$;
    }

    public int b() {
        return this.webpage$;
    }

    public float a() {
        return this.belly$;
    }

    public Vector3f c() {
        return this.ecuador$;
    }

    public Vector3f d() {
        return this.focuses$;
    }

    public Vector3f e() {
        return this.tomorrow$;
    }
}

