/*
 * Decompiled with CFR 0.152.
 */
public class CameraKeyFrame {
    public long impose$ = -1L;
    public float england$ = -1.0f;
    public Vector3f stage$ = new Vector3f();
    public Vector3f fotos$ = new Vector3f();
    public Quaternion clubs$ = new Quaternion();
    public byte[] codes$ = new byte[24];
    public float outlook$ = -1.0f;
    public boolean heather$ = false;

    public CameraKeyFrame() {
    }

    public CameraKeyFrame(CameraKeyFrame ckf) {
        this.impose$ = ckf.impose$;
        this.england$ = ckf.england$;
        this.stage$ = ckf.stage$;
        this.fotos$ = ckf.fotos$;
        for (int i = 0; i < this.codes$.length; ++i) {
            this.codes$[i] = ckf.codes$[i];
        }
        this.outlook$ = ckf.outlook$;
        this.heather$ = ckf.heather$;
    }

    public byte[][] _floyd() {
        byte[] bazierX = new byte[4];
        byte[] bazierY = new byte[4];
        byte[] bazierZ = new byte[4];
        byte[] bazierR = new byte[4];
        byte[] bazierD = new byte[4];
        byte[] bazierV = new byte[4];
        bazierX[0] = this.codes$[0];
        bazierX[1] = this.codes$[1];
        bazierX[2] = this.codes$[2];
        bazierX[3] = this.codes$[3];
        bazierY[0] = this.codes$[4];
        bazierY[1] = this.codes$[5];
        bazierY[2] = this.codes$[6];
        bazierY[3] = this.codes$[7];
        bazierZ[0] = this.codes$[8];
        bazierZ[1] = this.codes$[9];
        bazierZ[2] = this.codes$[10];
        bazierZ[3] = this.codes$[11];
        bazierR[0] = this.codes$[12];
        bazierR[1] = this.codes$[13];
        bazierR[2] = this.codes$[14];
        bazierR[3] = this.codes$[15];
        bazierD[0] = this.codes$[16];
        bazierD[1] = this.codes$[17];
        bazierD[2] = this.codes$[18];
        bazierD[3] = this.codes$[19];
        bazierV[0] = this.codes$[20];
        bazierV[1] = this.codes$[21];
        bazierV[2] = this.codes$[22];
        bazierV[3] = this.codes$[23];
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

