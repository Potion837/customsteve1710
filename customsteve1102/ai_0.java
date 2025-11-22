/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.Tessellator
 */
package customsteve;

import customsteve.ap_0;
import customsteve.as_0;
import java.util.ArrayList;
import net.minecraft.client.renderer.Tessellator;

/*
 * Renamed from customsteve.aI
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ai_0 {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public int a;
    public as_0 a;
    public boolean a;
    public byte a;
    public boolean b;
    public ArrayList<Integer> a;
    public ArrayList<ap_0> b = false;

    public ai_0(float x, float y) {
        this(x, y, 0.0f);
    }

    public ai_0(ai_0 v) {
        this.a = v.a;
        this.b = v.b;
        this.c = v.c;
        this.d = v.d;
        this.e = v.e;
        this.f = v.f;
        this.g = v.g;
        this.h = v.h;
        this.a = v.a;
        this.a = v.a;
        this.a = v.a;
        this.b = v.b;
        if (v.a != null) {
            this.a = (float)new ArrayList(v.a);
        }
        if (v.b != null) {
            this.b = (float)new ArrayList(v.b);
        }
    }

    public ai_0(float x, float y, float z) {
        this.a = x;
        this.b = y;
        this.c = z;
    }

    public ai_0(float x, float y, float z, float nx, float ny, float nz, float U2, float V2, int weightType, as_0 boneWeight, boolean ef) {
        this.a = -1;
        this.a = x;
        this.b = y;
        this.c = z;
        this.d = nx;
        this.e = ny;
        this.f = nz;
        this.g = U2;
        this.h = V2;
        this.a = weightType;
        this.a = boneWeight;
        this.a = ef;
    }

    public void a(Tessellator tessellator, float textureOffset) {
    }
}

