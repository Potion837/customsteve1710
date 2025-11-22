/*
 * Decompiled with CFR 0.152.
 */
package customsteve;

import customsteve.am;
import customsteve.ap_0;

/*
 * Renamed from customsteve.aA
 * Duplicate member names - consider using --renamedupmembers true
 */
public class aa_0 {
    public String a;
    public Long a;
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public byte[] a;
    public am a;
    public ap_0 a;
    private int a = 0;
    private int b = 16;
    private int c = 32;
    private int d = 48;
    private int e = 4;
    private int f = 20;
    private int g = 36;
    private int h = 52;
    private int i = 8;
    private int j = 24;
    private int k = 40;
    private int l = 56;
    private int m = 12;
    private int n = 28;
    private int o = 44;
    private int p = 60;

    public aa_0(String name, long frameNum, float x, float y, float z, float qx, float qy, float qz, float qw, byte[] inter) {
        this.a = new String(name);
        this.a = new Long(frameNum);
        this.a = x;
        this.b = y;
        this.c = z;
        this.d = qx;
        this.e = qy;
        this.f = qz;
        this.g = qw;
        int p2 = 0;
        if (inter != null) {
            byte[] byArray = inter;
            int n2 = byArray.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                byte i3;
                this.a[p2] = i3 = byArray[i2];
                ++p2;
            }
        }
        this.a = new am(qx, qy, qz, qw);
        this.a.a();
        this.a = new ap_0(x, y, z);
    }

    public aa_0(aa_0 k2) {
        this.a = new String(k2.a);
        this.a = new Long(k2.a);
        this.a = k2.a;
        this.b = k2.b;
        this.c = k2.c;
        this.d = k2.d;
        this.e = k2.e;
        this.f = k2.f;
        this.g = k2.g;
        int p2 = 0;
        byte[] byArray = k2.a;
        int n2 = byArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            byte inter;
            this.a[p2] = inter = byArray[i2];
            ++p2;
        }
        this.a = new am(this.d, this.e, this.f, this.g);
        this.a.a();
        this.a = new ap_0(this.a, this.b, this.c);
    }

    public byte[][] a() {
        byte[] bazierX = new byte[4];
        byte[] bazierY = new byte[4];
        byte[] bazierZ = new byte[4];
        byte[] bazierR = new byte[4];
        bazierX[0] = this.a[this.a];
        bazierX[1] = this.a[this.e];
        bazierX[2] = this.a[this.i];
        bazierX[3] = this.a[this.m];
        bazierY[0] = this.a[this.b];
        bazierY[1] = this.a[this.f];
        bazierY[2] = this.a[this.j];
        bazierY[3] = this.a[this.n];
        bazierZ[0] = this.a[this.c];
        bazierZ[1] = this.a[this.g];
        bazierZ[2] = this.a[this.k];
        bazierZ[3] = this.a[this.o];
        bazierR[0] = this.a[this.d];
        bazierR[1] = this.a[this.h];
        bazierR[2] = this.a[this.l];
        bazierR[3] = this.a[this.p];
        byte[][] result = new byte[4][4];
        result[0] = bazierX;
        result[1] = bazierY;
        result[2] = bazierZ;
        result[3] = bazierR;
        return result;
    }
}

