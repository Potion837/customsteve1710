/*
 * Decompiled with CFR 0.152.
 */
package customsteve;

import customsteve.aj;
import customsteve.ak;
import customsteve.al;
import customsteve.ap_0;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.logging.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class am {
    static final long a = 1L;
    private static final Logger a = Logger.getLogger(am.class.getName());
    public static final am a = new am();
    public static final am b = new am();
    public static final am c = new am(0.0f, 0.0f, 0.0f, 0.0f);
    protected float a;
    protected float b;
    protected float c;
    protected float d;

    public am() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 1.0f;
    }

    public am(float x, float y, float z, float w2) {
        this.a = x;
        this.b = y;
        this.c = z;
        this.d = w2;
    }

    public float a() {
        return this.a;
    }

    public float b() {
        return this.b;
    }

    public float c() {
        return this.c;
    }

    public float d() {
        return this.d;
    }

    public am a(float x, float y, float z, float w2) {
        this.a = x;
        this.b = y;
        this.c = z;
        this.d = w2;
        return this;
    }

    public am a(am q2) {
        this.a = q2.a;
        this.b = q2.b;
        this.c = q2.c;
        this.d = q2.d;
        return this;
    }

    public am(float[] angles) {
        this.a(angles);
    }

    public am(am q1, am q2, float interp) {
        this.b(q1, q2, interp);
    }

    public am(am q2) {
        this.a = q2.a;
        this.b = q2.b;
        this.c = q2.c;
        this.d = q2.d;
    }

    public void a() {
        this.c = 0.0f;
        this.b = 0.0f;
        this.a = 0.0f;
        this.d = 1.0f;
    }

    public boolean a() {
        return this.a == 0.0f && this.b == 0.0f && this.c == 0.0f && this.d == 1.0f;
    }

    public am a(float[] angles) {
        if (angles.length != 3) {
            throw new IllegalArgumentException("Angles array must have three elements");
        }
        return this.a(angles[0], angles[1], angles[2]);
    }

    public void a(float heading, float attitude, float bank) {
        float c1 = aj.e(heading / 2.0f);
        float s1 = aj.f(heading / 2.0f);
        float c2 = aj.e(attitude / 2.0f);
        float s2 = aj.f(attitude / 2.0f);
        float c3 = aj.e(bank / 2.0f);
        float s3 = aj.f(bank / 2.0f);
        float c1c2 = c1 * c2;
        float s1s2 = s1 * s2;
        this.d = c1c2 * c3 - s1s2 * s3;
        this.a = c1c2 * s3 + s1s2 * c3;
        this.b = s1 * c2 * c3 + c1 * s2 * s3;
        this.c = c1 * s2 * c3 - s1 * c2 * s3;
    }

    public final am a(double heading, double attitude, double bank) {
        double c1 = Math.cos(heading);
        double s1 = Math.sin(heading);
        double c2 = Math.cos(attitude);
        double s2 = Math.sin(attitude);
        double c3 = Math.cos(bank);
        double s3 = Math.sin(bank);
        this.d = (float)(Math.sqrt(1.0 + c1 * c2 + c1 * c3 - s1 * s2 * s3 + c2 * c3) / 2.0);
        double w4 = 4.0 * (double)this.d;
        this.a = (float)((c2 * s3 + c1 * s3 + s1 * s2 * c3) / w4);
        this.b = (float)((s1 * c2 + s1 * c3 + c1 * s2 * s3) / w4);
        this.c = (float)((-s1 * s3 + c1 * s2 * c3 + s2) / w4);
        this.a();
        return this;
    }

    public am a(float xAngle, float yAngle, float zAngle) {
        float angle = zAngle * 0.5f;
        float sinZ = aj.f(angle);
        float cosZ = aj.e(angle);
        angle = yAngle * 0.5f;
        float sinY = aj.f(angle);
        float cosY = aj.e(angle);
        angle = xAngle * 0.5f;
        float sinX = aj.f(angle);
        float cosX = aj.e(angle);
        float cosYXcosZ = cosY * cosZ;
        float sinYXsinZ = sinY * sinZ;
        float cosYXsinZ = cosY * sinZ;
        float sinYXcosZ = sinY * cosZ;
        this.d = cosYXcosZ * cosX - sinYXsinZ * sinX;
        this.a = cosYXcosZ * sinX + sinYXsinZ * cosX;
        this.b = sinYXcosZ * cosX + cosYXsinZ * sinX;
        this.c = cosYXsinZ * cosX - sinYXcosZ * sinX;
        this.a();
        return this;
    }

    public float[] a() {
        float yaw = aj.a(2.0f * (this.a * this.b + this.c * this.d), this.a * this.a - this.b * this.b - this.c * this.c + this.d * this.d) * 57.3f;
        float pitch = aj.b(-2.0f * (this.b * this.d + 2.0f * this.a * this.c)) * 57.3f;
        float roll = aj.a(2.0f * (this.b * this.c + 2.0f * this.a * this.d), this.a * this.a + this.b * this.b + this.c * this.c + this.d * this.d) * 57.3f;
        return new float[]{yaw, roll, pitch};
    }

    public float[] a(float[] angles) {
        if (angles == null) {
            angles = new float[3];
        } else if (angles.length != 3) {
            throw new IllegalArgumentException("Angles array must have three elements");
        }
        float sqw = this.d * this.d;
        float sqx = this.a * this.a;
        float sqy = this.b * this.b;
        float sqz = this.c * this.c;
        float unit = sqx + sqy + sqz + sqw;
        float test = this.a * this.b + this.c * this.d;
        if ((double)test > 0.499 * (double)unit) {
            angles[1] = 2.0f * aj.a(this.a, this.d);
            angles[2] = 1.5707964f;
            angles[0] = 0.0f;
        } else if ((double)test < -0.499 * (double)unit) {
            angles[1] = -2.0f * aj.a(this.a, this.d);
            angles[2] = -1.5707964f;
            angles[0] = 0.0f;
        } else {
            angles[1] = aj.a(2.0f * this.b * this.d - 2.0f * this.a * this.c, sqx - sqy - sqz + sqw);
            angles[2] = aj.b(2.0f * test / unit);
            angles[0] = aj.a(2.0f * this.a * this.d - 2.0f * this.b * this.c, -sqx + sqy - sqz + sqw);
        }
        return angles;
    }

    public String a() {
        float[] ang = this.a((float[])null);
        return (double)ang[0] * 57.29577951308232 + "," + (double)ang[1] * 57.29577951308232 + "," + (double)ang[2] * 57.29577951308232;
    }

    public am a(ak matrix) {
        return this.a(matrix.a, matrix.b, matrix.c, matrix.d, matrix.e, matrix.f, matrix.g, matrix.h, matrix.i);
    }

    public void b() {
        float[] angs = this.a((float[])null);
        System.out.println("y:" + (double)(angs[0] * 180.0f) / Math.PI + "  r" + (double)(angs[1] * 180.0f) / Math.PI + "  p:" + (double)(angs[2] * 180.0f) / Math.PI);
    }

    public am a(float m00, float m01, float m02, float m10, float m11, float m12, float m20, float m21, float m22) {
        float t = m00 + m11 + m22;
        if (t >= 0.0f) {
            float s = aj.n(t + 1.0f);
            this.d = 0.5f * s;
            s = 0.5f / s;
            this.a = (m21 - m12) * s;
            this.b = (m02 - m20) * s;
            this.c = (m10 - m01) * s;
        } else if (m00 > m11 && m00 > m22) {
            float s = aj.n(1.0f + m00 - m11 - m22);
            this.a = s * 0.5f;
            s = 0.5f / s;
            this.b = (m10 + m01) * s;
            this.c = (m02 + m20) * s;
            this.d = (m21 - m12) * s;
        } else if (m11 > m22) {
            float s = aj.n(1.0f + m11 - m00 - m22);
            this.b = s * 0.5f;
            s = 0.5f / s;
            this.a = (m10 + m01) * s;
            this.c = (m21 + m12) * s;
            this.d = (m02 - m20) * s;
        } else {
            float s = aj.n(1.0f + m22 - m00 - m11);
            this.c = s * 0.5f;
            s = 0.5f / s;
            this.a = (m02 + m20) * s;
            this.b = (m21 + m12) * s;
            this.d = (m10 - m01) * s;
        }
        return this;
    }

    public ak a() {
        ak matrix = new ak();
        return this.a(matrix);
    }

    public ak a(ak result) {
        float norm = this.e();
        float s = norm == 1.0f ? 2.0f : (norm > 0.0f ? 2.0f / norm : 0.0f);
        float xs = this.a * s;
        float ys = this.b * s;
        float zs = this.c * s;
        float xx = this.a * xs;
        float xy = this.a * ys;
        float xz = this.a * zs;
        float xw = this.d * xs;
        float yy = this.b * ys;
        float yz = this.b * zs;
        float yw = this.d * ys;
        float zz = this.c * zs;
        float zw = this.d * zs;
        result.a = 1.0f - (yy + zz);
        result.b = xy - zw;
        result.c = xz + yw;
        result.d = xy + zw;
        result.e = 1.0f - (xx + zz);
        result.f = yz - xw;
        result.g = xz - yw;
        result.h = yz + xw;
        result.i = 1.0f - (xx + yy);
        return result;
    }

    public al a(al result) {
        float norm = this.e();
        float s = norm == 1.0f ? 2.0f : (norm > 0.0f ? 2.0f / norm : 0.0f);
        float xs = this.a * s;
        float ys = this.b * s;
        float zs = this.c * s;
        float xx = this.a * xs;
        float xy = this.a * ys;
        float xz = this.a * zs;
        float xw = this.d * xs;
        float yy = this.b * ys;
        float yz = this.b * zs;
        float yw = this.d * ys;
        float zz = this.c * zs;
        float zw = this.d * zs;
        result.a = 1.0f - (yy + zz);
        result.b = xy - zw;
        result.c = xz + yw;
        result.e = xy + zw;
        result.f = 1.0f - (xx + zz);
        result.g = yz - xw;
        result.i = xz - yw;
        result.j = yz + xw;
        result.k = 1.0f - (xx + yy);
        return result;
    }

    public ap_0 a(int i2) {
        return this.a(i2, (ap_0)null);
    }

    public ap_0 a(int i2, ap_0 store) {
        float norm;
        if (store == null) {
            store = new ap_0();
        }
        if ((norm = this.e()) != 1.0f) {
            norm = aj.j(norm);
        }
        float xx = this.a * this.a * norm;
        float xy = this.a * this.b * norm;
        float xz = this.a * this.c * norm;
        float xw = this.a * this.d * norm;
        float yy = this.b * this.b * norm;
        float yz = this.b * this.c * norm;
        float yw = this.b * this.d * norm;
        float zz = this.c * this.c * norm;
        float zw = this.c * this.d * norm;
        switch (i2) {
            case 0: {
                store.a = 1.0f - 2.0f * (yy + zz);
                store.b = 2.0f * (xy + zw);
                store.c = 2.0f * (xz - yw);
                break;
            }
            case 1: {
                store.a = 2.0f * (xy - zw);
                store.b = 1.0f - 2.0f * (xx + zz);
                store.c = 2.0f * (yz + xw);
                break;
            }
            case 2: {
                store.a = 2.0f * (xz + yw);
                store.b = 2.0f * (yz - xw);
                store.c = 1.0f - 2.0f * (xx + yy);
                break;
            }
            default: {
                a.warning("Invalid column index.");
                throw new IllegalArgumentException("Invalid column index. " + i2);
            }
        }
        return store;
    }

    public am a(float angle, ap_0 axis) {
        ap_0 normAxis = axis.c();
        this.b(angle, normAxis);
        return this;
    }

    public am b(float angle, ap_0 axis) {
        if (axis.a == 0.0f && axis.b == 0.0f && axis.c == 0.0f) {
            this.a();
        } else {
            float halfAngle = 0.5f * angle;
            float sin = aj.f(halfAngle);
            this.d = aj.e(halfAngle);
            this.a = sin * axis.a;
            this.b = sin * axis.b;
            this.c = sin * axis.c;
        }
        return this;
    }

    public float a(ap_0 axisStore) {
        float angle;
        float sqrLength = this.a * this.a + this.b * this.b + this.c * this.c;
        if (sqrLength == 0.0f) {
            angle = 0.0f;
            if (axisStore != null) {
                axisStore.a = 1.0f;
                axisStore.b = 0.0f;
                axisStore.c = 0.0f;
            }
        } else {
            angle = 2.0f * aj.a(this.d);
            if (axisStore != null) {
                float invLength = 1.0f / aj.n(sqrLength);
                axisStore.a = this.a * invLength;
                axisStore.b = this.b * invLength;
                axisStore.c = this.c * invLength;
            }
        }
        return angle;
    }

    public am a(am result, am begin, am end, double t) {
        double qr = begin.a * end.a + begin.b * end.b + begin.c * end.c + begin.d * end.d;
        double ss = 1.0 - qr * qr;
        if (qr < 0.0) {
            qr = -qr;
            double sp = Math.sqrt(ss);
            double ph = Math.acos(qr);
            double pt = ph * t;
            double t1 = Math.sin(pt) / sp;
            double t0 = Math.sin(ph - pt) / sp;
            if (Double.isNaN(t0) || Double.isNaN(t1)) {
                result.a = begin.a;
                result.b = begin.b;
                result.c = begin.c;
                result.d = begin.d;
            } else {
                result.a = (float)((double)begin.a * t0 - (double)end.a * t1);
                result.b = (float)((double)begin.b * t0 - (double)end.b * t1);
                result.c = (float)((double)begin.c * t0 - (double)end.c * t1);
                result.d = (float)((double)begin.d * t0 - (double)end.d * t1);
            }
        } else {
            double sp = Math.sqrt(ss);
            double ph = Math.acos(qr);
            double pt = ph * t;
            double t1 = Math.sin(pt) / sp;
            double t0 = Math.sin(ph - pt) / sp;
            if (Double.isNaN(t0) || Double.isNaN(t1)) {
                result.a = begin.a;
                result.b = begin.b;
                result.c = begin.c;
                result.d = begin.d;
            } else {
                result.a = (float)((double)begin.a * t0 + (double)end.a * t1);
                result.b = (float)((double)begin.b * t0 + (double)end.b * t1);
                result.c = (float)((double)begin.c * t0 + (double)end.c * t1);
                result.d = (float)((double)begin.d * t0 + (double)end.d * t1);
            }
        }
        return result;
    }

    public am a(am qa, am qb, double t) {
        am qm = new am();
        double cosHalfTheta = qa.d * qb.d + qa.a * qb.a + qa.b * qb.b + qa.c * qb.c;
        if (Math.abs(cosHalfTheta) >= 1.0) {
            qm.d = qa.d;
            qm.a = qa.a;
            qm.b = qa.b;
            qm.c = qa.c;
            return qm;
        }
        float halfTheta = (float)Math.acos(cosHalfTheta);
        float sinHalfTheta = (float)Math.sqrt(1.0 - cosHalfTheta * cosHalfTheta);
        if ((double)Math.abs(sinHalfTheta) < 0.001) {
            qm.d = qa.d * 0.5f + qb.d * 0.5f;
            qm.a = qa.a * 0.5f + qb.a * 0.5f;
            qm.b = qa.b * 0.5f + qb.b * 0.5f;
            qm.c = qa.c * 0.5f + qb.c * 0.5f;
            return qm;
        }
        float ratioA = (float)(Math.sin((1.0 - t) * (double)halfTheta) / (double)sinHalfTheta);
        float ratioB = (float)(Math.sin(t * (double)halfTheta) / (double)sinHalfTheta);
        this.d = qa.d * ratioA + qb.d * ratioB;
        this.a = qa.a * ratioA + qb.a * ratioB;
        this.b = qa.b * ratioA + qb.b * ratioB;
        this.c = qa.c * ratioA + qb.c * ratioB;
        return this;
    }

    public am a(am q1, am q2, float t) {
        if (q1.a == q2.a && q1.b == q2.b && q1.c == q2.c && q1.d == q2.d) {
            this.a(q1);
            return this;
        }
        float result = q1.a * q2.a + q1.b * q2.b + q1.c * q2.c + q1.d * q2.d;
        float scale0 = 1.0f - t;
        float scale1 = t;
        if (1.0f - result > 0.1f) {
            float theta = aj.a(result);
            float invSinTheta = 1.0f / aj.f(theta);
            scale0 = aj.f((1.0f - t) * theta) * invSinTheta;
            scale1 = aj.f(t * theta) * invSinTheta;
        }
        this.a = scale0 * q1.a + scale1 * q2.a;
        this.b = scale0 * q1.b + scale1 * q2.b;
        this.c = scale0 * q1.c + scale1 * q2.c;
        this.d = scale0 * q1.d + scale1 * q2.d;
        return this;
    }

    public am b(am q1, am q2, float t) {
        if (q1.a == q2.a && q1.b == q2.b && q1.c == q2.c && q1.d == q2.d) {
            this.a(q1);
            return this;
        }
        float result = q1.a * q2.a + q1.b * q2.b + q1.c * q2.c + q1.d * q2.d;
        if (result < 0.0f) {
            q2.a = -q2.a;
            q2.b = -q2.b;
            q2.c = -q2.c;
            q2.d = -q2.d;
            result = -result;
        }
        float scale0 = 1.0f - t;
        float scale1 = t;
        if (1.0f - result > 0.1f) {
            float theta = aj.a(result);
            float invSinTheta = 1.0f / aj.f(theta);
            scale0 = aj.f((1.0f - t) * theta) * invSinTheta;
            scale1 = aj.f(t * theta) * invSinTheta;
        }
        this.a = scale0 * q1.a + scale1 * q2.a;
        this.b = scale0 * q1.b + scale1 * q2.b;
        this.c = scale0 * q1.c + scale1 * q2.c;
        this.d = scale0 * q1.d + scale1 * q2.d;
        return this;
    }

    public void a(am q2, float changeAmnt) {
        if (this.a == q2.a && this.b == q2.b && this.c == q2.c && this.d == q2.d) {
            return;
        }
        float result = this.a * q2.a + this.b * q2.b + this.c * q2.c + this.d * q2.d;
        if (result < 0.0f) {
            q2.a = -q2.a;
            q2.b = -q2.b;
            q2.c = -q2.c;
            q2.d = -q2.d;
            result = -result;
        }
        float scale0 = 1.0f - changeAmnt;
        float scale1 = changeAmnt;
        if (1.0f - result > 0.1f) {
            float theta = aj.a(result);
            float invSinTheta = 1.0f / aj.f(theta);
            scale0 = aj.f((1.0f - changeAmnt) * theta) * invSinTheta;
            scale1 = aj.f(changeAmnt * theta) * invSinTheta;
        }
        this.a = scale0 * this.a + scale1 * q2.a;
        this.b = scale0 * this.b + scale1 * q2.b;
        this.c = scale0 * this.c + scale1 * q2.c;
        this.d = scale0 * this.d + scale1 * q2.d;
    }

    public void b(am q2, float blend) {
        float dot = this.a(q2);
        float blendI = 1.0f - blend;
        if (dot < 0.0f) {
            this.a = blendI * this.a - blend * q2.a;
            this.b = blendI * this.b - blend * q2.b;
            this.c = blendI * this.c - blend * q2.c;
            this.d = blendI * this.d - blend * q2.d;
        } else {
            this.a = blendI * this.a + blend * q2.a;
            this.b = blendI * this.b + blend * q2.b;
            this.c = blendI * this.c + blend * q2.c;
            this.d = blendI * this.d + blend * q2.d;
        }
        if (Double.isNaN(this.a) && Double.isNaN(this.b) && Double.isNaN(this.c) && Double.isNaN(this.d)) {
            this.a();
        }
        this.a();
    }

    public am b(am q2) {
        return new am(this.a + q2.a, this.b + q2.b, this.c + q2.c, this.d + q2.d);
    }

    public am c(am q2) {
        this.a += q2.a;
        this.b += q2.b;
        this.c += q2.c;
        this.d += q2.d;
        return this;
    }

    public am d(am q2) {
        return new am(this.a - q2.a, this.b - q2.b, this.c - q2.c, this.d - q2.d);
    }

    public am e(am q2) {
        this.a -= q2.a;
        this.b -= q2.b;
        this.c -= q2.c;
        this.d -= q2.d;
        return this;
    }

    public am f(am q2) {
        return this.a(q2, null);
    }

    public am a(am q2, am res) {
        if (res == null) {
            res = new am();
        }
        float qw = q2.d;
        float qx = q2.a;
        float qy = q2.b;
        float qz = q2.c;
        res.a = this.a * qw + this.b * qz - this.c * qy + this.d * qx;
        res.b = -this.a * qz + this.b * qw + this.c * qx + this.d * qy;
        res.c = this.a * qy - this.b * qx + this.c * qw + this.d * qz;
        res.d = -this.a * qx - this.b * qy - this.c * qz + this.d * qw;
        return res;
    }

    public void a(ak matrix) {
        float oldX = this.a;
        float oldY = this.b;
        float oldZ = this.c;
        float oldW = this.d;
        this.a(matrix);
        float tempX = this.a;
        float tempY = this.b;
        float tempZ = this.c;
        float tempW = this.d;
        this.a = oldX * tempW + oldY * tempZ - oldZ * tempY + oldW * tempX;
        this.b = -oldX * tempZ + oldY * tempW + oldZ * tempX + oldW * tempY;
        this.c = oldX * tempY - oldY * tempX + oldZ * tempW + oldW * tempZ;
        this.d = -oldX * tempX - oldY * tempY - oldZ * tempZ + oldW * tempW;
    }

    public am a(ap_0[] axis) {
        if (axis.length != 3) {
            throw new IllegalArgumentException("Axis array must have three elements");
        }
        return this.a(axis[0], axis[1], axis[2]);
    }

    public am a(ap_0 xAxis, ap_0 yAxis, ap_0 zAxis) {
        return this.a(xAxis.a, yAxis.a, zAxis.a, xAxis.b, yAxis.b, zAxis.b, xAxis.c, yAxis.c, zAxis.c);
    }

    public void a(ap_0[] axis) {
        ak tempMat = this.a();
        axis[0] = tempMat.a(0, axis[0]);
        axis[1] = tempMat.a(1, axis[1]);
        axis[2] = tempMat.a(2, axis[2]);
    }

    public ap_0 a(ap_0 v) {
        return this.a(v, null);
    }

    public ap_0 b(ap_0 v) {
        float tempX = this.d * this.d * v.a + 2.0f * this.b * this.d * v.c - 2.0f * this.c * this.d * v.b + this.a * this.a * v.a + 2.0f * this.b * this.a * v.b + 2.0f * this.c * this.a * v.c - this.c * this.c * v.a - this.b * this.b * v.a;
        float tempY = 2.0f * this.a * this.b * v.a + this.b * this.b * v.b + 2.0f * this.c * this.b * v.c + 2.0f * this.d * this.c * v.a - this.c * this.c * v.b + this.d * this.d * v.b - 2.0f * this.a * this.d * v.c - this.a * this.a * v.b;
        v.c = 2.0f * this.a * this.c * v.a + 2.0f * this.b * this.c * v.b + this.c * this.c * v.c - 2.0f * this.d * this.b * v.a - this.b * this.b * v.c + 2.0f * this.d * this.a * v.b - this.a * this.a * v.c + this.d * this.d * v.c;
        v.a = tempX;
        v.b = tempY;
        return v;
    }

    public am g(am q2) {
        float x1 = this.a * q2.d + this.b * q2.c - this.c * q2.b + this.d * q2.a;
        float y1 = -this.a * q2.c + this.b * q2.d + this.c * q2.a + this.d * q2.b;
        float z1 = this.a * q2.b - this.b * q2.a + this.c * q2.d + this.d * q2.c;
        this.d = -this.a * q2.a - this.b * q2.b - this.c * q2.c + this.d * q2.d;
        this.a = x1;
        this.b = y1;
        this.c = z1;
        return this;
    }

    public am b(float qx, float qy, float qz, float qw) {
        float x1 = this.a * qw + this.b * qz - this.c * qy + this.d * qx;
        float y1 = -this.a * qz + this.b * qw + this.c * qx + this.d * qy;
        float z1 = this.a * qy - this.b * qx + this.c * qw + this.d * qz;
        this.d = -this.a * qx - this.b * qy - this.c * qz + this.d * qw;
        this.a = x1;
        this.b = y1;
        this.c = z1;
        return this;
    }

    public ap_0 a(ap_0 v, ap_0 store) {
        if (store == null) {
            store = new ap_0();
        }
        if (v.a == 0.0f && v.b == 0.0f && v.c == 0.0f) {
            store.a(0.0f, 0.0f, 0.0f);
        } else {
            float vx = v.a;
            float vy = v.b;
            float vz = v.c;
            store.a = this.d * this.d * vx + 2.0f * this.b * this.d * vz - 2.0f * this.c * this.d * vy + this.a * this.a * vx + 2.0f * this.b * this.a * vy + 2.0f * this.c * this.a * vz - this.c * this.c * vx - this.b * this.b * vx;
            store.b = 2.0f * this.a * this.b * vx + this.b * this.b * vy + 2.0f * this.c * this.b * vz + 2.0f * this.d * this.c * vx - this.c * this.c * vy + this.d * this.d * vy - 2.0f * this.a * this.d * vz - this.a * this.a * vy;
            store.c = 2.0f * this.a * this.c * vx + 2.0f * this.b * this.c * vy + this.c * this.c * vz - 2.0f * this.d * this.b * vx - this.b * this.b * vz + 2.0f * this.d * this.a * vy - this.a * this.a * vz + this.d * this.d * vz;
        }
        return store;
    }

    public am a(float scalar) {
        return new am(scalar * this.a, scalar * this.b, scalar * this.c, scalar * this.d);
    }

    public am b(float scalar) {
        this.d *= scalar;
        this.a *= scalar;
        this.b *= scalar;
        this.c *= scalar;
        return this;
    }

    public float a(am q2) {
        return this.d * q2.d + this.a * q2.a + this.b * q2.b + this.c * q2.c;
    }

    public float e() {
        return this.d * this.d + this.a * this.a + this.b * this.b + this.c * this.c;
    }

    public am a() {
        float n2 = aj.j(this.e());
        this.a *= n2;
        this.b *= n2;
        this.c *= n2;
        this.d *= n2;
        return this;
    }

    public am b() {
        float norm = this.e();
        if ((double)norm > 0.0) {
            float invNorm = 1.0f / norm;
            return new am(-this.a * invNorm, -this.b * invNorm, -this.c * invNorm, this.d * invNorm);
        }
        return null;
    }

    public am c() {
        return new am(-this.a, -this.b, -this.c, this.d);
    }

    public am d() {
        float norm = this.e();
        if ((double)norm > 0.0) {
            float invNorm = 1.0f / norm;
            this.a *= -invNorm;
            this.b *= -invNorm;
            this.c *= -invNorm;
            this.d *= invNorm;
        }
        return this;
    }

    public void c() {
        this.a *= -1.0f;
        this.b *= -1.0f;
        this.c *= -1.0f;
        this.d *= -1.0f;
    }

    public String toString() {
        return "(" + this.a + ", " + this.b + ", " + this.c + ", " + this.d + ")";
    }

    public boolean equals(Object o2) {
        if (!(o2 instanceof am)) {
            return false;
        }
        if (this == o2) {
            return true;
        }
        am comp = (am)o2;
        if (Float.compare(this.a(this.a), this.a(comp.a)) != 0) {
            return false;
        }
        if (Float.compare(this.a(this.b), this.a(comp.b)) != 0) {
            return false;
        }
        if (Float.compare(this.a(this.c), this.a(comp.c)) != 0) {
            return false;
        }
        return Float.compare(this.a(this.d), this.a(comp.d)) == 0;
    }

    public float a(float s) {
        if (s == 0.0f) {
            return 0.0f;
        }
        return s;
    }

    public int hashCode() {
        int hash = 37;
        hash = 37 * hash + Float.floatToIntBits(this.a);
        hash = 37 * hash + Float.floatToIntBits(this.b);
        hash = 37 * hash + Float.floatToIntBits(this.c);
        hash = 37 * hash + Float.floatToIntBits(this.d);
        return hash;
    }

    public void a(ObjectInput in) throws IOException {
        this.a = in.readFloat();
        this.b = in.readFloat();
        this.c = in.readFloat();
        this.d = in.readFloat();
    }

    public void a(ObjectOutput out) throws IOException {
        out.writeFloat(this.a);
        out.writeFloat(this.b);
        out.writeFloat(this.c);
        out.writeFloat(this.d);
    }

    public am e() {
        return this.h(null);
    }

    public am h(am store) {
        if (store == null) {
            store = new am();
        }
        ap_0 axis = new ap_0();
        float angle = this.a(axis);
        store.a((float)Math.PI + angle, axis);
        return store;
    }

    public am f() {
        return this.h(this);
    }

    public am g() {
        try {
            return (am)super.clone();
        }
        catch (CloneNotSupportedException e2) {
            throw new AssertionError();
        }
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return this.g();
    }

    static {
        b.a(ap_0.c, ap_0.d, ap_0.e);
    }
}

