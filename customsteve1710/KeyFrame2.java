/*
 * Decompiled with CFR 0.152.
 */
public class KeyFrame2 {
    public String peeing$;
    public Long donated$;
    public float surgery$;
    public float addition$;
    public float begin$;
    public float walls$;
    public float prime$;
    public float belarus$;
    public float changed$;
    public byte[] movie$ = new byte[64];
    public Quaternion tones$;
    public Vector3f consoles$;
    private int syntax$ = 0;
    private int sporting$ = 16;
    private int might$ = 32;
    private int harris$ = 48;
    private int turtle$ = 4;
    private int cologne$ = 20;
    private int points$ = 36;
    private int periods$ = 52;
    private int newton$ = 8;
    private int driver$ = 24;
    private int combines$ = 40;
    private int charter$ = 56;
    private int shore$ = 12;
    private int trainer$ = 28;
    private int olympus$ = 44;
    private int awarded$ = 60;

    public KeyFrame2(String name, long frameNum, float x, float y, float z, float qx, float qy, float qz, float qw, byte[] inter) {
        this.peeing$ = new String(name);
        this.donated$ = new Long(frameNum);
        this.surgery$ = x;
        this.addition$ = y;
        this.begin$ = z;
        this.walls$ = qx;
        this.prime$ = qy;
        this.belarus$ = qz;
        this.changed$ = qw;
        int p = 0;
        if (inter != null) {
            byte[] byArray = inter;
            int n = byArray.length;
            for (int i = 0; i < n; ++i) {
                byte i2;
                this.movie$[p] = i2 = byArray[i];
                ++p;
            }
        }
        this.tones$ = new Quaternion(qx, qy, qz, qw);
        this.tones$._network();
        this.consoles$ = new Vector3f(x, y, z);
    }

    public KeyFrame2(KeyFrame2 k) {
        this.peeing$ = new String(k.peeing$);
        this.donated$ = new Long(k.donated$);
        this.surgery$ = k.surgery$;
        this.addition$ = k.addition$;
        this.begin$ = k.begin$;
        this.walls$ = k.walls$;
        this.prime$ = k.prime$;
        this.belarus$ = k.belarus$;
        this.changed$ = k.changed$;
        int p = 0;
        byte[] byArray = k.movie$;
        int n = byArray.length;
        for (int i = 0; i < n; ++i) {
            byte inter;
            this.movie$[p] = inter = byArray[i];
            ++p;
        }
        this.tones$ = new Quaternion(this.walls$, this.prime$, this.belarus$, this.changed$);
        this.tones$._network();
        this.consoles$ = new Vector3f(this.surgery$, this.addition$, this.begin$);
    }

    public byte[][] _european() {
        byte[] bazierX = new byte[4];
        byte[] bazierY = new byte[4];
        byte[] bazierZ = new byte[4];
        byte[] bazierR = new byte[4];
        bazierX[0] = this.movie$[this.syntax$];
        bazierX[1] = this.movie$[this.turtle$];
        bazierX[2] = this.movie$[this.newton$];
        bazierX[3] = this.movie$[this.shore$];
        bazierY[0] = this.movie$[this.sporting$];
        bazierY[1] = this.movie$[this.cologne$];
        bazierY[2] = this.movie$[this.driver$];
        bazierY[3] = this.movie$[this.trainer$];
        bazierZ[0] = this.movie$[this.might$];
        bazierZ[1] = this.movie$[this.points$];
        bazierZ[2] = this.movie$[this.combines$];
        bazierZ[3] = this.movie$[this.olympus$];
        bazierR[0] = this.movie$[this.harris$];
        bazierR[1] = this.movie$[this.periods$];
        bazierR[2] = this.movie$[this.charter$];
        bazierR[3] = this.movie$[this.awarded$];
        byte[][] result = new byte[4][4];
        result[0] = bazierX;
        result[1] = bazierY;
        result[2] = bazierZ;
        result[3] = bazierR;
        return result;
    }
}

