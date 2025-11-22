/*
 * Decompiled with CFR 0.152.
 */
public class pmxBone {
    public String matthew$;
    public String either$;
    public float[] villages$;
    public int traveler$;
    public int notes$;
    public int woman$;
    public int indians$;
    Vector3f verify$;
    public int absent$;
    public float shuttle$;
    public boolean flood$ = false;
    public boolean lesser$ = false;
    Vector3f nancy$;
    Vector3f mounting$;
    Vector3f stroke$;
    int planets$;

    public pmxBone(String name, String nameE, float[] pos, int parent, int layer, int bitflag, int tailId, Vector3f tailPos, int effectId, float effectFactor, Vector3f fixedAxis, Vector3f localXVector, Vector3f localZVector, int externalKey) {
        this.matthew$ = name;
        this.either$ = nameE;
        this.villages$ = pos;
        this.traveler$ = parent;
        this.notes$ = layer;
        this.woman$ = bitflag;
        this.indians$ = tailId;
        this.verify$ = tailPos;
        this.absent$ = effectId;
        this.shuttle$ = effectFactor;
        this.nancy$ = fixedAxis;
        this.mounting$ = localXVector;
        this.stroke$ = localZVector;
        this.planets$ = externalKey;
    }
}

