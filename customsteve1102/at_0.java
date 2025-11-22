/*
 * Decompiled with CFR 0.152.
 */
package customsteve;

import customsteve.am;
import customsteve.ap_0;

/*
 * Renamed from customsteve.at
 * Duplicate member names - consider using --renamedupmembers true
 */
public class at_0 {
    public long a;
    public float a;
    public ap_0 a;
    public ap_0 b;
    public am a;
    public byte[] a;
    public float b = -1.0f;
    public boolean a = false;

    public at_0() {
        this.b = new ap_0();
        this.a = new am();
        this.a = new byte[24];
    }

    public at_0(at_0 ckf) {
        this.b = new ap_0();
        this.a = new am();
        this.a = new byte[24];
        this.a = ckf.a;
        this.a = ckf.a;
        this.a = ckf.a;
        this.b = ckf.b;
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            this.a[i2] = ckf.a[i2];
        }
        this.b = ckf.b;
        this.a = ckf.a;
    }

    public byte[][] a() {
        byte[] bazierX = new byte[4];
        byte[] bazierY = new byte[4];
        byte[] bazierZ = new byte[4];
        byte[] bazierR = new byte[4];
        byte[] bazierD = new byte[4];
        byte[] bazierV = new byte[4];
        bazierX[0] = this.a[0];
        bazierX[1] = this.a[1];
        bazierX[2] = this.a[2];
        bazierX[3] = this.a[3];
        bazierY[0] = this.a[4];
        bazierY[1] = this.a[5];
        bazierY[2] = this.a[6];
        bazierY[3] = this.a[7];
        bazierZ[0] = this.a[8];
        bazierZ[1] = this.a[9];
        bazierZ[2] = this.a[10];
        bazierZ[3] = this.a[11];
        bazierR[0] = this.a[12];
        bazierR[1] = this.a[13];
        bazierR[2] = this.a[14];
        bazierR[3] = this.a[15];
        bazierD[0] = this.a[16];
        bazierD[1] = this.a[17];
        bazierD[2] = this.a[18];
        bazierD[3] = this.a[19];
        bazierV[0] = this.a[20];
        bazierV[1] = this.a[21];
        bazierV[2] = this.a[22];
        bazierV[3] = this.a[23];
        byte[][] result = new byte[6][4];
        result[0] = bazierX;
        result[1] = bazierY;
        result[2] = bazierZ;
        result[3] = bazierR;
        result[4] = bazierD;
        result[5] = bazierV;
        return result;
    }
}

