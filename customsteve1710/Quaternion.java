/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.logging.Logger;

public final class Quaternion {
    static final long voting$ = 1L;
    private static final Logger loops$ = Logger.getLogger(Quaternion.class.getName());
    public static final Quaternion tonight$ = new Quaternion();
    public static final Quaternion mothers$ = new Quaternion();
    public static final Quaternion party$ = new Quaternion(0.0f, 0.0f, 0.0f, 0.0f);
    protected float arrow$;
    protected float valves$;
    protected float licenses$;
    protected float jelsoft$;

    public Quaternion() {
        this.arrow$ = 0.0f;
        this.valves$ = 0.0f;
        this.licenses$ = 0.0f;
        this.jelsoft$ = 1.0f;
    }

    public Quaternion(float x, float y, float z, float w) {
        this.arrow$ = x;
        this.valves$ = y;
        this.licenses$ = z;
        this.jelsoft$ = w;
    }

    public float _magnet() {
        return this.arrow$;
    }

    public float _strain() {
        return this.valves$;
    }

    public float _median() {
        return this.licenses$;
    }

    public float _their() {
        return this.jelsoft$;
    }

    public Quaternion _polar(float x, float y, float z, float w) {
        this.arrow$ = x;
        this.valves$ = y;
        this.licenses$ = z;
        this.jelsoft$ = w;
        return this;
    }

    public Quaternion _folks(Quaternion q) {
        this.arrow$ = q.arrow$;
        this.valves$ = q.valves$;
        this.licenses$ = q.licenses$;
        this.jelsoft$ = q.jelsoft$;
        return this;
    }

    public Quaternion(float[] angles) {
        this._guardian(angles);
    }

    public Quaternion(Quaternion q1, Quaternion q2, float interp) {
        this._calendar(q1, q2, interp);
    }

    public Quaternion(Quaternion q) {
        this.arrow$ = q.arrow$;
        this.valves$ = q.valves$;
        this.licenses$ = q.licenses$;
        this.jelsoft$ = q.jelsoft$;
    }

    public void _looks() {
        this.licenses$ = 0.0f;
        this.valves$ = 0.0f;
        this.arrow$ = 0.0f;
        this.jelsoft$ = 1.0f;
    }

    public boolean _charming() {
        return this.arrow$ == 0.0f && this.valves$ == 0.0f && this.licenses$ == 0.0f && this.jelsoft$ == 1.0f;
    }

    public Quaternion _guardian(float[] angles) {
        if (angles.length != 3) {
            throw new IllegalArgumentException("Angles array must have three elements");
        }
        return this._between(angles[0], angles[1], angles[2]);
    }

    public void _tigers(float heading, float attitude, float bank) {
        float c1 = FastMath._country(heading / 2.0f);
        float s1 = FastMath._booth(heading / 2.0f);
        float c2 = FastMath._country(attitude / 2.0f);
        float s2 = FastMath._booth(attitude / 2.0f);
        float c3 = FastMath._country(bank / 2.0f);
        float s3 = FastMath._booth(bank / 2.0f);
        float c1c2 = c1 * c2;
        float s1s2 = s1 * s2;
        this.jelsoft$ = c1c2 * c3 - s1s2 * s3;
        this.arrow$ = c1c2 * s3 + s1s2 * c3;
        this.valves$ = s1 * c2 * c3 + c1 * s2 * s3;
        this.licenses$ = c1 * s2 * c3 - s1 * c2 * s3;
    }

    public final Quaternion _imposed(double heading, double attitude, double bank) {
        double c1 = Math.cos(heading);
        double s1 = Math.sin(heading);
        double c2 = Math.cos(attitude);
        double s2 = Math.sin(attitude);
        double c3 = Math.cos(bank);
        double s3 = Math.sin(bank);
        this.jelsoft$ = (float)(Math.sqrt(1.0 + c1 * c2 + c1 * c3 - s1 * s2 * s3 + c2 * c3) / 2.0);
        double w4 = 4.0 * (double)this.jelsoft$;
        this.arrow$ = (float)((c2 * s3 + c1 * s3 + s1 * s2 * c3) / w4);
        this.valves$ = (float)((s1 * c2 + s1 * c3 + c1 * s2 * s3) / w4);
        this.licenses$ = (float)((-s1 * s3 + c1 * s2 * c3 + s2) / w4);
        this._network();
        return this;
    }

    public Quaternion _between(float xAngle, float yAngle, float zAngle) {
        float angle = zAngle * 0.5f;
        float sinZ = FastMath._booth(angle);
        float cosZ = FastMath._country(angle);
        angle = yAngle * 0.5f;
        float sinY = FastMath._booth(angle);
        float cosY = FastMath._country(angle);
        angle = xAngle * 0.5f;
        float sinX = FastMath._booth(angle);
        float cosX = FastMath._country(angle);
        float cosYXcosZ = cosY * cosZ;
        float sinYXsinZ = sinY * sinZ;
        float cosYXsinZ = cosY * sinZ;
        float sinYXcosZ = sinY * cosZ;
        this.jelsoft$ = cosYXcosZ * cosX - sinYXsinZ * sinX;
        this.arrow$ = cosYXcosZ * sinX + sinYXsinZ * cosX;
        this.valves$ = sinYXcosZ * cosX + cosYXsinZ * sinX;
        this.licenses$ = cosYXsinZ * cosX - sinYXcosZ * sinX;
        this._network();
        return this;
    }

    public float[] _variety() {
        float yaw = FastMath._brunette(2.0f * (this.arrow$ * this.valves$ + this.licenses$ * this.jelsoft$), this.arrow$ * this.arrow$ - this.valves$ * this.valves$ - this.licenses$ * this.licenses$ + this.jelsoft$ * this.jelsoft$) * 57.3f;
        float pitch = FastMath._latina(-2.0f * (this.valves$ * this.jelsoft$ + 2.0f * this.arrow$ * this.licenses$)) * 57.3f;
        float roll = FastMath._brunette(2.0f * (this.valves$ * this.licenses$ + 2.0f * this.arrow$ * this.jelsoft$), this.arrow$ * this.arrow$ + this.valves$ * this.valves$ + this.licenses$ * this.licenses$ + this.jelsoft$ * this.jelsoft$) * 57.3f;
        return new float[]{yaw, roll, pitch};
    }

    public float[] _always(float[] angles) {
        if (angles == null) {
            angles = new float[3];
        } else if (angles.length != 3) {
            throw new IllegalArgumentException("Angles array must have three elements");
        }
        float sqw = this.jelsoft$ * this.jelsoft$;
        float sqx = this.arrow$ * this.arrow$;
        float sqy = this.valves$ * this.valves$;
        float sqz = this.licenses$ * this.licenses$;
        float unit = sqx + sqy + sqz + sqw;
        float test = this.arrow$ * this.valves$ + this.licenses$ * this.jelsoft$;
        if ((double)test > 0.499 * (double)unit) {
            angles[1] = 2.0f * FastMath._brunette(this.arrow$, this.jelsoft$);
            angles[2] = 1.5707964f;
            angles[0] = 0.0f;
        } else if ((double)test < -0.499 * (double)unit) {
            angles[1] = -2.0f * FastMath._brunette(this.arrow$, this.jelsoft$);
            angles[2] = -1.5707964f;
            angles[0] = 0.0f;
        } else {
            angles[1] = FastMath._brunette(2.0f * this.valves$ * this.jelsoft$ - 2.0f * this.arrow$ * this.licenses$, sqx - sqy - sqz + sqw);
            angles[2] = FastMath._latina(2.0f * test / unit);
            angles[0] = FastMath._brunette(2.0f * this.arrow$ * this.jelsoft$ - 2.0f * this.valves$ * this.licenses$, -sqx + sqy - sqz + sqw);
        }
        return angles;
    }

    public String _tiffany() {
        float[] ang = this._always(null);
        return (double)ang[0] * 57.29577951308232 + "," + (double)ang[1] * 57.29577951308232 + "," + (double)ang[2] * 57.29577951308232;
    }

    public Quaternion _attached(Matrix3f matrix) {
        return this._genes(matrix.every$, matrix.releases$, matrix.hearts$, matrix.clone$, matrix.ultram$, matrix.affect$, matrix.customs$, matrix.speakers$, matrix.light$);
    }

    public void _carnival() {
        float[] angs = this._always(null);
        System.out.println("y:" + (double)(angs[0] * 180.0f) / Math.PI + "  r" + (double)(angs[1] * 180.0f) / Math.PI + "  p:" + (double)(angs[2] * 180.0f) / Math.PI);
    }

    public Quaternion _genes(float m00, float m01, float m02, float m10, float m11, float m12, float m20, float m21, float m22) {
        float t = m00 + m11 + m22;
        if (t >= 0.0f) {
            float s = FastMath._runtime(t + 1.0f);
            this.jelsoft$ = 0.5f * s;
            s = 0.5f / s;
            this.arrow$ = (m21 - m12) * s;
            this.valves$ = (m02 - m20) * s;
            this.licenses$ = (m10 - m01) * s;
        } else if (m00 > m11 && m00 > m22) {
            float s = FastMath._runtime(1.0f + m00 - m11 - m22);
            this.arrow$ = s * 0.5f;
            s = 0.5f / s;
            this.valves$ = (m10 + m01) * s;
            this.licenses$ = (m02 + m20) * s;
            this.jelsoft$ = (m21 - m12) * s;
        } else if (m11 > m22) {
            float s = FastMath._runtime(1.0f + m11 - m00 - m22);
            this.valves$ = s * 0.5f;
            s = 0.5f / s;
            this.arrow$ = (m10 + m01) * s;
            this.licenses$ = (m21 + m12) * s;
            this.jelsoft$ = (m02 - m20) * s;
        } else {
            float s = FastMath._runtime(1.0f + m22 - m00 - m11);
            this.licenses$ = s * 0.5f;
            s = 0.5f / s;
            this.arrow$ = (m02 + m20) * s;
            this.valves$ = (m21 + m12) * s;
            this.jelsoft$ = (m10 - m01) * s;
        }
        return this;
    }

    public Matrix3f _equal() {
        Matrix3f matrix = new Matrix3f();
        return this._agenda(matrix);
    }

    public Matrix3f _agenda(Matrix3f result) {
        float norm = this._jason();
        float s = norm == 1.0f ? 2.0f : (norm > 0.0f ? 2.0f / norm : 0.0f);
        float xs = this.arrow$ * s;
        float ys = this.valves$ * s;
        float zs = this.licenses$ * s;
        float xx = this.arrow$ * xs;
        float xy = this.arrow$ * ys;
        float xz = this.arrow$ * zs;
        float xw = this.jelsoft$ * xs;
        float yy = this.valves$ * ys;
        float yz = this.valves$ * zs;
        float yw = this.jelsoft$ * ys;
        float zz = this.licenses$ * zs;
        float zw = this.jelsoft$ * zs;
        result.every$ = 1.0f - (yy + zz);
        result.releases$ = xy - zw;
        result.hearts$ = xz + yw;
        result.clone$ = xy + zw;
        result.ultram$ = 1.0f - (xx + zz);
        result.affect$ = yz - xw;
        result.customs$ = xz - yw;
        result.speakers$ = yz + xw;
        result.light$ = 1.0f - (xx + yy);
        return result;
    }

    public Matrix4f _leeds(Matrix4f result) {
        float norm = this._jason();
        float s = norm == 1.0f ? 2.0f : (norm > 0.0f ? 2.0f / norm : 0.0f);
        float xs = this.arrow$ * s;
        float ys = this.valves$ * s;
        float zs = this.licenses$ * s;
        float xx = this.arrow$ * xs;
        float xy = this.arrow$ * ys;
        float xz = this.arrow$ * zs;
        float xw = this.jelsoft$ * xs;
        float yy = this.valves$ * ys;
        float yz = this.valves$ * zs;
        float yw = this.jelsoft$ * ys;
        float zz = this.licenses$ * zs;
        float zw = this.jelsoft$ * zs;
        result.oriented$ = 1.0f - (yy + zz);
        result.quality$ = xy - zw;
        result.sugar$ = xz + yw;
        result.wages$ = xy + zw;
        result.ivory$ = 1.0f - (xx + zz);
        result.truly$ = yz - xw;
        result.lopez$ = xz - yw;
        result.harold$ = yz + xw;
        result.boston$ = 1.0f - (xx + yy);
        return result;
    }

    public Vector3f _reports(int i) {
        return this._tires(i, null);
    }

    public Vector3f _tires(int i, Vector3f store) {
        float norm;
        if (store == null) {
            store = new Vector3f();
        }
        if ((norm = this._jason()) != 1.0f) {
            norm = FastMath._shops(norm);
        }
        float xx = this.arrow$ * this.arrow$ * norm;
        float xy = this.arrow$ * this.valves$ * norm;
        float xz = this.arrow$ * this.licenses$ * norm;
        float xw = this.arrow$ * this.jelsoft$ * norm;
        float yy = this.valves$ * this.valves$ * norm;
        float yz = this.valves$ * this.licenses$ * norm;
        float yw = this.valves$ * this.jelsoft$ * norm;
        float zz = this.licenses$ * this.licenses$ * norm;
        float zw = this.licenses$ * this.jelsoft$ * norm;
        switch (i) {
            case 0: {
                store.serves$ = 1.0f - 2.0f * (yy + zz);
                store.genius$ = 2.0f * (xy + zw);
                store.superb$ = 2.0f * (xz - yw);
                break;
            }
            case 1: {
                store.serves$ = 2.0f * (xy - zw);
                store.genius$ = 1.0f - 2.0f * (xx + zz);
                store.superb$ = 2.0f * (yz + xw);
                break;
            }
            case 2: {
                store.serves$ = 2.0f * (xz + yw);
                store.genius$ = 2.0f * (yz - xw);
                store.superb$ = 1.0f - 2.0f * (xx + yy);
                break;
            }
            default: {
                loops$.warning("Invalid column index.");
                throw new IllegalArgumentException("Invalid column index. " + i);
            }
        }
        return store;
    }

    public Quaternion _micro(float angle, Vector3f axis) {
        Vector3f normAxis = axis._mixer();
        this._poems(angle, normAxis);
        return this;
    }

    public Quaternion _poems(float angle, Vector3f axis) {
        if (axis.serves$ == 0.0f && axis.genius$ == 0.0f && axis.superb$ == 0.0f) {
            this._looks();
        } else {
            float halfAngle = 0.5f * angle;
            float sin = FastMath._booth(halfAngle);
            this.jelsoft$ = FastMath._country(halfAngle);
            this.arrow$ = sin * axis.serves$;
            this.valves$ = sin * axis.genius$;
            this.licenses$ = sin * axis.superb$;
        }
        return this;
    }

    public float _visits(Vector3f axisStore) {
        float angle;
        float sqrLength = this.arrow$ * this.arrow$ + this.valves$ * this.valves$ + this.licenses$ * this.licenses$;
        if (sqrLength == 0.0f) {
            angle = 0.0f;
            if (axisStore != null) {
                axisStore.serves$ = 1.0f;
                axisStore.genius$ = 0.0f;
                axisStore.superb$ = 0.0f;
            }
        } else {
            angle = 2.0f * FastMath._coding(this.jelsoft$);
            if (axisStore != null) {
                float invLength = 1.0f / FastMath._runtime(sqrLength);
                axisStore.serves$ = this.arrow$ * invLength;
                axisStore.genius$ = this.valves$ * invLength;
                axisStore.superb$ = this.licenses$ * invLength;
            }
        }
        return angle;
    }

    public Quaternion _resist(Quaternion result, Quaternion begin, Quaternion end, double t) {
        double qr = begin.arrow$ * end.arrow$ + begin.valves$ * end.valves$ + begin.licenses$ * end.licenses$ + begin.jelsoft$ * end.jelsoft$;
        double ss = 1.0 - qr * qr;
        if (qr < 0.0) {
            qr = -qr;
            double sp = Math.sqrt(ss);
            double ph = Math.acos(qr);
            double pt = ph * t;
            double t1 = Math.sin(pt) / sp;
            double t0 = Math.sin(ph - pt) / sp;
            if (Double.isNaN(t0) || Double.isNaN(t1)) {
                result.arrow$ = begin.arrow$;
                result.valves$ = begin.valves$;
                result.licenses$ = begin.licenses$;
                result.jelsoft$ = begin.jelsoft$;
            } else {
                result.arrow$ = (float)((double)begin.arrow$ * t0 - (double)end.arrow$ * t1);
                result.valves$ = (float)((double)begin.valves$ * t0 - (double)end.valves$ * t1);
                result.licenses$ = (float)((double)begin.licenses$ * t0 - (double)end.licenses$ * t1);
                result.jelsoft$ = (float)((double)begin.jelsoft$ * t0 - (double)end.jelsoft$ * t1);
            }
        } else {
            double sp = Math.sqrt(ss);
            double ph = Math.acos(qr);
            double pt = ph * t;
            double t1 = Math.sin(pt) / sp;
            double t0 = Math.sin(ph - pt) / sp;
            if (Double.isNaN(t0) || Double.isNaN(t1)) {
                result.arrow$ = begin.arrow$;
                result.valves$ = begin.valves$;
                result.licenses$ = begin.licenses$;
                result.jelsoft$ = begin.jelsoft$;
            } else {
                result.arrow$ = (float)((double)begin.arrow$ * t0 + (double)end.arrow$ * t1);
                result.valves$ = (float)((double)begin.valves$ * t0 + (double)end.valves$ * t1);
                result.licenses$ = (float)((double)begin.licenses$ * t0 + (double)end.licenses$ * t1);
                result.jelsoft$ = (float)((double)begin.jelsoft$ * t0 + (double)end.jelsoft$ * t1);
            }
        }
        return result;
    }

    public Quaternion _requests(Quaternion qa, Quaternion qb, double t) {
        Quaternion qm = new Quaternion();
        double cosHalfTheta = qa.jelsoft$ * qb.jelsoft$ + qa.arrow$ * qb.arrow$ + qa.valves$ * qb.valves$ + qa.licenses$ * qb.licenses$;
        if (Math.abs(cosHalfTheta) >= 1.0) {
            qm.jelsoft$ = qa.jelsoft$;
            qm.arrow$ = qa.arrow$;
            qm.valves$ = qa.valves$;
            qm.licenses$ = qa.licenses$;
            return qm;
        }
        float halfTheta = (float)Math.acos(cosHalfTheta);
        float sinHalfTheta = (float)Math.sqrt(1.0 - cosHalfTheta * cosHalfTheta);
        if ((double)Math.abs(sinHalfTheta) < 0.001) {
            qm.jelsoft$ = qa.jelsoft$ * 0.5f + qb.jelsoft$ * 0.5f;
            qm.arrow$ = qa.arrow$ * 0.5f + qb.arrow$ * 0.5f;
            qm.valves$ = qa.valves$ * 0.5f + qb.valves$ * 0.5f;
            qm.licenses$ = qa.licenses$ * 0.5f + qb.licenses$ * 0.5f;
            return qm;
        }
        float ratioA = (float)(Math.sin((1.0 - t) * (double)halfTheta) / (double)sinHalfTheta);
        float ratioB = (float)(Math.sin(t * (double)halfTheta) / (double)sinHalfTheta);
        this.jelsoft$ = qa.jelsoft$ * ratioA + qb.jelsoft$ * ratioB;
        this.arrow$ = qa.arrow$ * ratioA + qb.arrow$ * ratioB;
        this.valves$ = qa.valves$ * ratioA + qb.valves$ * ratioB;
        this.licenses$ = qa.licenses$ * ratioA + qb.licenses$ * ratioB;
        return this;
    }

    public Quaternion _casinos(Quaternion q1, Quaternion q2, float t) {
        if (q1.arrow$ == q2.arrow$ && q1.valves$ == q2.valves$ && q1.licenses$ == q2.licenses$ && q1.jelsoft$ == q2.jelsoft$) {
            this._folks(q1);
            return this;
        }
        float result = q1.arrow$ * q2.arrow$ + q1.valves$ * q2.valves$ + q1.licenses$ * q2.licenses$ + q1.jelsoft$ * q2.jelsoft$;
        float scale0 = 1.0f - t;
        float scale1 = t;
        if (1.0f - result > 0.1f) {
            float theta = FastMath._coding(result);
            float invSinTheta = 1.0f / FastMath._booth(theta);
            scale0 = FastMath._booth((1.0f - t) * theta) * invSinTheta;
            scale1 = FastMath._booth(t * theta) * invSinTheta;
        }
        this.arrow$ = scale0 * q1.arrow$ + scale1 * q2.arrow$;
        this.valves$ = scale0 * q1.valves$ + scale1 * q2.valves$;
        this.licenses$ = scale0 * q1.licenses$ + scale1 * q2.licenses$;
        this.jelsoft$ = scale0 * q1.jelsoft$ + scale1 * q2.jelsoft$;
        return this;
    }

    public Quaternion _calendar(Quaternion q1, Quaternion q2, float t) {
        if (q1.arrow$ == q2.arrow$ && q1.valves$ == q2.valves$ && q1.licenses$ == q2.licenses$ && q1.jelsoft$ == q2.jelsoft$) {
            this._folks(q1);
            return this;
        }
        float result = q1.arrow$ * q2.arrow$ + q1.valves$ * q2.valves$ + q1.licenses$ * q2.licenses$ + q1.jelsoft$ * q2.jelsoft$;
        if (result < 0.0f) {
            q2.arrow$ = -q2.arrow$;
            q2.valves$ = -q2.valves$;
            q2.licenses$ = -q2.licenses$;
            q2.jelsoft$ = -q2.jelsoft$;
            result = -result;
        }
        float scale0 = 1.0f - t;
        float scale1 = t;
        if (1.0f - result > 0.1f) {
            float theta = FastMath._coding(result);
            float invSinTheta = 1.0f / FastMath._booth(theta);
            scale0 = FastMath._booth((1.0f - t) * theta) * invSinTheta;
            scale1 = FastMath._booth(t * theta) * invSinTheta;
        }
        this.arrow$ = scale0 * q1.arrow$ + scale1 * q2.arrow$;
        this.valves$ = scale0 * q1.valves$ + scale1 * q2.valves$;
        this.licenses$ = scale0 * q1.licenses$ + scale1 * q2.licenses$;
        this.jelsoft$ = scale0 * q1.jelsoft$ + scale1 * q2.jelsoft$;
        return this;
    }

    public void _stress(Quaternion q2, float changeAmnt) {
        if (this.arrow$ == q2.arrow$ && this.valves$ == q2.valves$ && this.licenses$ == q2.licenses$ && this.jelsoft$ == q2.jelsoft$) {
            return;
        }
        float result = this.arrow$ * q2.arrow$ + this.valves$ * q2.valves$ + this.licenses$ * q2.licenses$ + this.jelsoft$ * q2.jelsoft$;
        if (result < 0.0f) {
            q2.arrow$ = -q2.arrow$;
            q2.valves$ = -q2.valves$;
            q2.licenses$ = -q2.licenses$;
            q2.jelsoft$ = -q2.jelsoft$;
            result = -result;
        }
        float scale0 = 1.0f - changeAmnt;
        float scale1 = changeAmnt;
        if (1.0f - result > 0.1f) {
            float theta = FastMath._coding(result);
            float invSinTheta = 1.0f / FastMath._booth(theta);
            scale0 = FastMath._booth((1.0f - changeAmnt) * theta) * invSinTheta;
            scale1 = FastMath._booth(changeAmnt * theta) * invSinTheta;
        }
        this.arrow$ = scale0 * this.arrow$ + scale1 * q2.arrow$;
        this.valves$ = scale0 * this.valves$ + scale1 * q2.valves$;
        this.licenses$ = scale0 * this.licenses$ + scale1 * q2.licenses$;
        this.jelsoft$ = scale0 * this.jelsoft$ + scale1 * q2.jelsoft$;
    }

    public void _offers(Quaternion q2, float blend) {
        float dot = this._textbook(q2);
        float blendI = 1.0f - blend;
        if (dot < 0.0f) {
            this.arrow$ = blendI * this.arrow$ - blend * q2.arrow$;
            this.valves$ = blendI * this.valves$ - blend * q2.valves$;
            this.licenses$ = blendI * this.licenses$ - blend * q2.licenses$;
            this.jelsoft$ = blendI * this.jelsoft$ - blend * q2.jelsoft$;
        } else {
            this.arrow$ = blendI * this.arrow$ + blend * q2.arrow$;
            this.valves$ = blendI * this.valves$ + blend * q2.valves$;
            this.licenses$ = blendI * this.licenses$ + blend * q2.licenses$;
            this.jelsoft$ = blendI * this.jelsoft$ + blend * q2.jelsoft$;
        }
        if (Double.isNaN(this.arrow$) && Double.isNaN(this.valves$) && Double.isNaN(this.licenses$) && Double.isNaN(this.jelsoft$)) {
            this._looks();
        }
        this._network();
    }

    public Quaternion _subtle(Quaternion q) {
        return new Quaternion(this.arrow$ + q.arrow$, this.valves$ + q.valves$, this.licenses$ + q.licenses$, this.jelsoft$ + q.jelsoft$);
    }

    public Quaternion _davidson(Quaternion q) {
        this.arrow$ += q.arrow$;
        this.valves$ += q.valves$;
        this.licenses$ += q.licenses$;
        this.jelsoft$ += q.jelsoft$;
        return this;
    }

    public Quaternion _madonna(Quaternion q) {
        return new Quaternion(this.arrow$ - q.arrow$, this.valves$ - q.valves$, this.licenses$ - q.licenses$, this.jelsoft$ - q.jelsoft$);
    }

    public Quaternion _cabinet(Quaternion q) {
        this.arrow$ -= q.arrow$;
        this.valves$ -= q.valves$;
        this.licenses$ -= q.licenses$;
        this.jelsoft$ -= q.jelsoft$;
        return this;
    }

    public Quaternion _generic(Quaternion q) {
        return this._fighter(q, null);
    }

    public Quaternion _fighter(Quaternion q, Quaternion res) {
        if (res == null) {
            res = new Quaternion();
        }
        float qw = q.jelsoft$;
        float qx = q.arrow$;
        float qy = q.valves$;
        float qz = q.licenses$;
        res.arrow$ = this.arrow$ * qw + this.valves$ * qz - this.licenses$ * qy + this.jelsoft$ * qx;
        res.valves$ = -this.arrow$ * qz + this.valves$ * qw + this.licenses$ * qx + this.jelsoft$ * qy;
        res.licenses$ = this.arrow$ * qy - this.valves$ * qx + this.licenses$ * qw + this.jelsoft$ * qz;
        res.jelsoft$ = -this.arrow$ * qx - this.valves$ * qy - this.licenses$ * qz + this.jelsoft$ * qw;
        return res;
    }

    public void _expects(Matrix3f matrix) {
        float oldX = this.arrow$;
        float oldY = this.valves$;
        float oldZ = this.licenses$;
        float oldW = this.jelsoft$;
        this._attached(matrix);
        float tempX = this.arrow$;
        float tempY = this.valves$;
        float tempZ = this.licenses$;
        float tempW = this.jelsoft$;
        this.arrow$ = oldX * tempW + oldY * tempZ - oldZ * tempY + oldW * tempX;
        this.valves$ = -oldX * tempZ + oldY * tempW + oldZ * tempX + oldW * tempY;
        this.licenses$ = oldX * tempY - oldY * tempX + oldZ * tempW + oldW * tempZ;
        this.jelsoft$ = -oldX * tempX - oldY * tempY - oldZ * tempZ + oldW * tempW;
    }

    public Quaternion _gender(Vector3f[] axis) {
        if (axis.length != 3) {
            throw new IllegalArgumentException("Axis array must have three elements");
        }
        return this._jersey(axis[0], axis[1], axis[2]);
    }

    public Quaternion _jersey(Vector3f xAxis, Vector3f yAxis, Vector3f zAxis) {
        return this._genes(xAxis.serves$, yAxis.serves$, zAxis.serves$, xAxis.genius$, yAxis.genius$, zAxis.genius$, xAxis.superb$, yAxis.superb$, zAxis.superb$);
    }

    public void _venue(Vector3f[] axis) {
        Matrix3f tempMat = this._equal();
        axis[0] = tempMat._selected(0, axis[0]);
        axis[1] = tempMat._selected(1, axis[1]);
        axis[2] = tempMat._selected(2, axis[2]);
    }

    public Vector3f _align(Vector3f v) {
        return this._mistakes(v, null);
    }

    public Vector3f _negative(Vector3f v) {
        float tempX = this.jelsoft$ * this.jelsoft$ * v.serves$ + 2.0f * this.valves$ * this.jelsoft$ * v.superb$ - 2.0f * this.licenses$ * this.jelsoft$ * v.genius$ + this.arrow$ * this.arrow$ * v.serves$ + 2.0f * this.valves$ * this.arrow$ * v.genius$ + 2.0f * this.licenses$ * this.arrow$ * v.superb$ - this.licenses$ * this.licenses$ * v.serves$ - this.valves$ * this.valves$ * v.serves$;
        float tempY = 2.0f * this.arrow$ * this.valves$ * v.serves$ + this.valves$ * this.valves$ * v.genius$ + 2.0f * this.licenses$ * this.valves$ * v.superb$ + 2.0f * this.jelsoft$ * this.licenses$ * v.serves$ - this.licenses$ * this.licenses$ * v.genius$ + this.jelsoft$ * this.jelsoft$ * v.genius$ - 2.0f * this.arrow$ * this.jelsoft$ * v.superb$ - this.arrow$ * this.arrow$ * v.genius$;
        v.superb$ = 2.0f * this.arrow$ * this.licenses$ * v.serves$ + 2.0f * this.valves$ * this.licenses$ * v.genius$ + this.licenses$ * this.licenses$ * v.superb$ - 2.0f * this.jelsoft$ * this.valves$ * v.serves$ - this.valves$ * this.valves$ * v.superb$ + 2.0f * this.jelsoft$ * this.arrow$ * v.genius$ - this.arrow$ * this.arrow$ * v.superb$ + this.jelsoft$ * this.jelsoft$ * v.superb$;
        v.serves$ = tempX;
        v.genius$ = tempY;
        return v;
    }

    public Quaternion _welcome(Quaternion q) {
        float x1 = this.arrow$ * q.jelsoft$ + this.valves$ * q.licenses$ - this.licenses$ * q.valves$ + this.jelsoft$ * q.arrow$;
        float y1 = -this.arrow$ * q.licenses$ + this.valves$ * q.jelsoft$ + this.licenses$ * q.arrow$ + this.jelsoft$ * q.valves$;
        float z1 = this.arrow$ * q.valves$ - this.valves$ * q.arrow$ + this.licenses$ * q.jelsoft$ + this.jelsoft$ * q.licenses$;
        this.jelsoft$ = -this.arrow$ * q.arrow$ - this.valves$ * q.valves$ - this.licenses$ * q.licenses$ + this.jelsoft$ * q.jelsoft$;
        this.arrow$ = x1;
        this.valves$ = y1;
        this.licenses$ = z1;
        return this;
    }

    public Quaternion _through(float qx, float qy, float qz, float qw) {
        float x1 = this.arrow$ * qw + this.valves$ * qz - this.licenses$ * qy + this.jelsoft$ * qx;
        float y1 = -this.arrow$ * qz + this.valves$ * qw + this.licenses$ * qx + this.jelsoft$ * qy;
        float z1 = this.arrow$ * qy - this.valves$ * qx + this.licenses$ * qw + this.jelsoft$ * qz;
        this.jelsoft$ = -this.arrow$ * qx - this.valves$ * qy - this.licenses$ * qz + this.jelsoft$ * qw;
        this.arrow$ = x1;
        this.valves$ = y1;
        this.licenses$ = z1;
        return this;
    }

    public Vector3f _mistakes(Vector3f v, Vector3f store) {
        if (store == null) {
            store = new Vector3f();
        }
        if (v.serves$ == 0.0f && v.genius$ == 0.0f && v.superb$ == 0.0f) {
            store._alleged(0.0f, 0.0f, 0.0f);
        } else {
            float vx = v.serves$;
            float vy = v.genius$;
            float vz = v.superb$;
            store.serves$ = this.jelsoft$ * this.jelsoft$ * vx + 2.0f * this.valves$ * this.jelsoft$ * vz - 2.0f * this.licenses$ * this.jelsoft$ * vy + this.arrow$ * this.arrow$ * vx + 2.0f * this.valves$ * this.arrow$ * vy + 2.0f * this.licenses$ * this.arrow$ * vz - this.licenses$ * this.licenses$ * vx - this.valves$ * this.valves$ * vx;
            store.genius$ = 2.0f * this.arrow$ * this.valves$ * vx + this.valves$ * this.valves$ * vy + 2.0f * this.licenses$ * this.valves$ * vz + 2.0f * this.jelsoft$ * this.licenses$ * vx - this.licenses$ * this.licenses$ * vy + this.jelsoft$ * this.jelsoft$ * vy - 2.0f * this.arrow$ * this.jelsoft$ * vz - this.arrow$ * this.arrow$ * vy;
            store.superb$ = 2.0f * this.arrow$ * this.licenses$ * vx + 2.0f * this.valves$ * this.licenses$ * vy + this.licenses$ * this.licenses$ * vz - 2.0f * this.jelsoft$ * this.valves$ * vx - this.valves$ * this.valves$ * vz + 2.0f * this.jelsoft$ * this.arrow$ * vy - this.arrow$ * this.arrow$ * vz + this.jelsoft$ * this.jelsoft$ * vz;
        }
        return store;
    }

    public Quaternion _toxic(float scalar) {
        return new Quaternion(scalar * this.arrow$, scalar * this.valves$, scalar * this.licenses$, scalar * this.jelsoft$);
    }

    public Quaternion _features(float scalar) {
        this.jelsoft$ *= scalar;
        this.arrow$ *= scalar;
        this.valves$ *= scalar;
        this.licenses$ *= scalar;
        return this;
    }

    public float _textbook(Quaternion q) {
        return this.jelsoft$ * q.jelsoft$ + this.arrow$ * q.arrow$ + this.valves$ * q.valves$ + this.licenses$ * q.licenses$;
    }

    public float _jason() {
        return this.jelsoft$ * this.jelsoft$ + this.arrow$ * this.arrow$ + this.valves$ * this.valves$ + this.licenses$ * this.licenses$;
    }

    public Quaternion _network() {
        float n = FastMath._shops(this._jason());
        this.arrow$ *= n;
        this.valves$ *= n;
        this.licenses$ *= n;
        this.jelsoft$ *= n;
        return this;
    }

    public Quaternion _filling() {
        float norm = this._jason();
        if ((double)norm > 0.0) {
            float invNorm = 1.0f / norm;
            return new Quaternion(-this.arrow$ * invNorm, -this.valves$ * invNorm, -this.licenses$ * invNorm, this.jelsoft$ * invNorm);
        }
        return null;
    }

    public Quaternion _polymer() {
        return new Quaternion(-this.arrow$, -this.valves$, -this.licenses$, this.jelsoft$);
    }

    public Quaternion _equally() {
        float norm = this._jason();
        if ((double)norm > 0.0) {
            float invNorm = 1.0f / norm;
            this.arrow$ *= -invNorm;
            this.valves$ *= -invNorm;
            this.licenses$ *= -invNorm;
            this.jelsoft$ *= invNorm;
        }
        return this;
    }

    public void _guards() {
        this.arrow$ *= -1.0f;
        this.valves$ *= -1.0f;
        this.licenses$ *= -1.0f;
        this.jelsoft$ *= -1.0f;
    }

    public String toString() {
        return "(" + this.arrow$ + ", " + this.valves$ + ", " + this.licenses$ + ", " + this.jelsoft$ + ")";
    }

    public boolean equals(Object o) {
        if (!(o instanceof Quaternion)) {
            return false;
        }
        if (this == o) {
            return true;
        }
        Quaternion comp = (Quaternion)o;
        if (Float.compare(this._meals(this.arrow$), this._meals(comp.arrow$)) != 0) {
            return false;
        }
        if (Float.compare(this._meals(this.valves$), this._meals(comp.valves$)) != 0) {
            return false;
        }
        if (Float.compare(this._meals(this.licenses$), this._meals(comp.licenses$)) != 0) {
            return false;
        }
        return Float.compare(this._meals(this.jelsoft$), this._meals(comp.jelsoft$)) == 0;
    }

    public float _meals(float s) {
        if (s == 0.0f) {
            return 0.0f;
        }
        return s;
    }

    public int hashCode() {
        int hash = 37;
        hash = 37 * hash + Float.floatToIntBits(this.arrow$);
        hash = 37 * hash + Float.floatToIntBits(this.valves$);
        hash = 37 * hash + Float.floatToIntBits(this.licenses$);
        hash = 37 * hash + Float.floatToIntBits(this.jelsoft$);
        return hash;
    }

    public void _adaptive(ObjectInput in) throws IOException {
        this.arrow$ = in.readFloat();
        this.valves$ = in.readFloat();
        this.licenses$ = in.readFloat();
        this.jelsoft$ = in.readFloat();
    }

    public void _contact(ObjectOutput out) throws IOException {
        out.writeFloat(this.arrow$);
        out.writeFloat(this.valves$);
        out.writeFloat(this.licenses$);
        out.writeFloat(this.jelsoft$);
    }

    public Quaternion _reject() {
        return this._decrease(null);
    }

    public Quaternion _decrease(Quaternion store) {
        if (store == null) {
            store = new Quaternion();
        }
        Vector3f axis = new Vector3f();
        float angle = this._visits(axis);
        store._micro((float)Math.PI + angle, axis);
        return store;
    }

    public Quaternion _sender() {
        return this._decrease(this);
    }

    public Quaternion _kerry() {
        try {
            return (Quaternion)super.clone();
        }
        catch (CloneNotSupportedException e2) {
            throw new AssertionError();
        }
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return this._kerry();
    }

    static {
        mothers$._jersey(Vector3f.museums$, Vector3f.seminar$, Vector3f.gained$);
    }
}

