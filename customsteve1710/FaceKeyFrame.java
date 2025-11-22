/*
 * Decompiled with CFR 0.152.
 */
public class FaceKeyFrame {
    public String chuck$;
    public Long claims$;
    public float powered$;

    public FaceKeyFrame(String name, long frameNum, float scale) {
        this.chuck$ = name;
        this.claims$ = new Long(frameNum);
        this.powered$ = scale;
    }
}

