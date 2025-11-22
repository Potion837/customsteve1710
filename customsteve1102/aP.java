/*
 * Decompiled with CFR 0.152.
 */
package customsteve;

import customsteve.ac;
import customsteve.ao_0;
import customsteve.ap_0;
import java.util.ArrayList;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class aP {
    public int a;
    public int b;
    public ao_0 a;
    public ao_0 b;
    public int c;
    public float a;
    public ArrayList<Integer> a;
    public ArrayList<Boolean> b;
    public ArrayList<ap_0> c;
    public ArrayList<ap_0> d;
    public ArrayList<ao_0> e;
    private float b = 3.1415925f;
    private float c = 9999.99f;
    private float d;
    private int d = 0;
    private int e = -1;
    private ac a;
    private int[] a;
    private ap_0[] a = new ap_0[]{new ap_0(1.0f, 0.0f, 0.0f), new ap_0(1.0f, 0.0f, 0.0f)};

    public aP(int targetId, int endId, int loop, float maxA, ArrayList childsId, ArrayList childIsLimits, ArrayList childLimitsMin, ArrayList childLimitsMax) {
        this.a = targetId;
        this.b = endId;
        this.c = loop;
        this.a = maxA;
        this.a = (int)childsId;
        this.b = (int)childIsLimits;
        this.c = (int)childLimitsMin;
        this.d = childLimitsMax;
    }
}

