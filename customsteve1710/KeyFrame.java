/*
 * Decompiled with CFR 0.152.
 */
public class KeyFrame {
    public float ideas$;
    public float opinions$;
    public float display$;
    public float piano$;

    public KeyFrame() {
        this.piano$ = 0.0f;
        this.display$ = 0.0f;
        this.opinions$ = 0.0f;
        this.ideas$ = 0.0f;
    }

    public KeyFrame(float t, float x, float y, float z) {
        this.ideas$ = t;
        this.opinions$ = x;
        this.display$ = y;
        this.piano$ = z;
    }
}

