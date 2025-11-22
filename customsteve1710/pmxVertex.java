/*
 * Decompiled with CFR 0.152.
 */
public class pmxVertex {
    public float freeware$;
    public float reward$;
    public float beach$;
    public float performs$;
    public float reached$;
    public float spend$;
    public float types$;
    public float adobe$;
    public float[][] pleasant$;
    public int salmon$;
    public BoneWeight claire$;
    public float logos$;

    public pmxVertex(float x, float y, float z, float nx, float ny, float nz, float U, float V, float[][] appendixUV, int weightType, BoneWeight bw, float edgeScale) {
        this.freeware$ = x;
        this.reward$ = y;
        this.beach$ = z;
        this.performs$ = nx;
        this.reached$ = ny;
        this.spend$ = nz;
        this.types$ = U;
        this.adobe$ = V;
        this.pleasant$ = appendixUV;
        this.salmon$ = weightType;
        this.logos$ = edgeScale;
        this.claire$ = bw;
    }

    public pmxVertex(pmxVertex v) {
        this.freeware$ = v.freeware$;
        this.reward$ = v.reward$;
        this.beach$ = v.beach$;
        this.performs$ = v.performs$;
        this.reached$ = v.reached$;
        this.spend$ = v.spend$;
        this.types$ = v.types$;
        this.adobe$ = v.adobe$;
        this.pleasant$ = v.pleasant$;
        this.salmon$ = v.salmon$;
        this.claire$ = v.claire$;
        this.logos$ = v.logos$;
    }
}

