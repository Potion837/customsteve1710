/*
 * Decompiled with CFR 0.152.
 */
package customsteve;

import java.util.logging.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from customsteve.ap
 */
public final class ap_0 {
    static final long a = 1L;
    private static final Logger a = Logger.getLogger(ap_0.class.getName());
    public static final ap_0 a = new ap_0(0.0f, 0.0f, 0.0f);
    public static final ap_0 b = new ap_0(Float.NaN, Float.NaN, Float.NaN);
    public static final ap_0 c = new ap_0(1.0f, 0.0f, 0.0f);
    public static final ap_0 d = new ap_0(0.0f, 1.0f, 0.0f);
    public static final ap_0 e = new ap_0(0.0f, 0.0f, 1.0f);
    public static final ap_0 f = new ap_0(1.0f, 1.0f, 1.0f);
    public static final ap_0 g = new ap_0(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final ap_0 h = new ap_0(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public float a;
    public float b;
    public float c;

    public ap_0() {
        this.c = 0.0f;
        this.b = 0.0f;
        this.a = 0.0f;
    }

    public ap_0(float x, float y, float z) {
        this.a = x;
        this.b = y;
        this.c = z;
    }

    public ap_0(ap_0 copy) {
        this.a(copy);
    }

    public ap_0 a(float x, float y, float z) {
        this.a = x;
        this.b = y;
        this.c = z;
        return this;
    }

    public ap_0 a(ap_0 vect) {
        this.a = vect.a;
        this.b = vect.b;
        this.c = vect.c;
        return this;
    }

    public ap_0 b(ap_0 vec) {
        if (null == vec) {
            a.warning("Provided vector is null, null returned.");
            return null;
        }
        return new ap_0(this.a + vec.a, this.b + vec.b, this.c + vec.c);
    }

    public ap_0 a(ap_0 vec, ap_0 result) {
        result.a = this.a + vec.a;
        result.b = this.b + vec.b;
        result.c = this.c + vec.c;
        return result;
    }

    public ap_0 c(ap_0 vec) {
        if (null == vec) {
            a.warning("Provided vector is null, null returned.");
            return null;
        }
        this.a += vec.a;
        this.b += vec.b;
        this.c += vec.c;
        return this;
    }

    public ap_0 b(float addX, float addY, float addZ) {
        return new ap_0(this.a + addX, this.b + addY, this.c + addZ);
    }

    public ap_0 c(float addX, float addY, float addZ) {
        this.a += addX;
        this.b += addY;
        this.c += addZ;
        return this;
    }

    public ap_0 a(float scalar, ap_0 add) {
        this.a = this.a * scalar + add.a;
        this.b = this.b * scalar + add.b;
        this.c = this.c * scalar + add.c;
        return this;
    }

    public ap_0 a(float scalar, ap_0 mult, ap_0 add) {
        this.a = mult.a * scalar + add.a;
        this.b = mult.b * scalar + add.b;
        this.c = mult.c * scalar + add.c;
        return this;
    }

    public float a(ap_0 vec) {
        if (null == vec) {
            a.warning("Provided vector is null, 0 returned.");
            return 0.0f;
        }
        return this.a * vec.a + this.b * vec.b + this.c * vec.c;
    }

    public float a(float x1, float y1, float z1) {
        return this.a * x1 + this.b * y1 + this.c * z1;
    }

    public ap_0 d(ap_0 v) {
        return this.b(v, null);
    }

    public ap_0 b(ap_0 v, ap_0 result) {
        return this.a(v.a, v.b, v.c, result);
    }

    public ap_0 a(float otherX, float otherY, float otherZ, ap_0 result) {
        if (result == null) {
            result = new ap_0();
        }
        float resX = this.b * otherZ - this.c * otherY;
        float resY = this.c * otherX - this.a * otherZ;
        float resZ = this.a * otherY - this.b * otherX;
        result.a(resX, resY, resZ);
        return result;
    }

    public ap_0 e(ap_0 v) {
        return this.d(v.a, v.b, v.c);
    }

    public ap_0 d(float otherX, float otherY, float otherZ) {
        float tempx = this.b * otherZ - this.c * otherY;
        float tempy = this.c * otherX - this.a * otherZ;
        this.c = this.a * otherY - this.b * otherX;
        this.a = tempx;
        this.b = tempy;
        return this;
    }

    public ap_0 f(ap_0 other) {
        float n2 = this.a(other);
        float d2 = other.b();
        return new ap_0(other).d().b(n2 / d2);
    }

    public ap_0 g(ap_0 other) {
        float n2 = this.a(other);
        float d2 = other.b();
        return this.a(other).d().b(n2 / d2);
    }

    public boolean a() {
        float len = this.a();
        return 0.99f < len && len < 1.01f;
    }

    public float a() {
        return (float)Math.sqrt(this.b());
    }

    public float b() {
        return this.a * this.a + this.b * this.b + this.c * this.c;
    }

    public float b(ap_0 v) {
        double dx = this.a - v.a;
        double dy = this.b - v.b;
        double dz = this.c - v.c;
        return (float)(dx * dx + dy * dy + dz * dz);
    }

    public float c(ap_0 v) {
        return (float)Math.sqrt(this.b(v));
    }

    public ap_0 a(float scalar) {
        return new ap_0(this.a * scalar, this.b * scalar, this.c * scalar);
    }

    public ap_0 b(float scalar, ap_0 product) {
        if (null == product) {
            product = new ap_0();
        }
        product.a = this.a * scalar;
        product.b = this.b * scalar;
        product.c = this.c * scalar;
        return product;
    }

    public ap_0 b(float scalar) {
        this.a *= scalar;
        this.b *= scalar;
        this.c *= scalar;
        return this;
    }

    public ap_0 h(ap_0 vec) {
        if (null == vec) {
            a.warning("Provided vector is null, null returned.");
            return null;
        }
        this.a *= vec.a;
        this.b *= vec.b;
        this.c *= vec.c;
        return this;
    }

    public ap_0 e(float x, float y, float z) {
        this.a *= x;
        this.b *= y;
        this.c *= z;
        return this;
    }

    public ap_0 i(ap_0 vec) {
        if (null == vec) {
            a.warning("Provided vector is null, null returned.");
            return null;
        }
        return this.c(vec, null);
    }

    public ap_0 c(ap_0 vec, ap_0 store) {
        if (null == vec) {
            a.warning("Provided vector is null, null returned.");
            return null;
        }
        if (store == null) {
            store = new ap_0();
        }
        return store.a(this.a * vec.a, this.b * vec.b, this.c * vec.c);
    }

    public ap_0 c(float scalar) {
        scalar = 1.0f / scalar;
        return new ap_0(this.a * scalar, this.b * scalar, this.c * scalar);
    }

    public ap_0 d(float scalar) {
        scalar = 1.0f / scalar;
        this.a *= scalar;
        this.b *= scalar;
        this.c *= scalar;
        return this;
    }

    public ap_0 j(ap_0 scalar) {
        return new ap_0(this.a / scalar.a, this.b / scalar.b, this.c / scalar.c);
    }

    public ap_0 k(ap_0 scalar) {
        this.a /= scalar.a;
        this.b /= scalar.b;
        this.c /= scalar.c;
        return this;
    }

    public ap_0 a() {
        return new ap_0(-this.a, -this.b, -this.c);
    }

    public ap_0 b() {
        this.a = -this.a;
        this.b = -this.b;
        this.c = -this.c;
        return this;
    }

    public ap_0 l(ap_0 vec) {
        return new ap_0(this.a - vec.a, this.b - vec.b, this.c - vec.c);
    }

    public ap_0 m(ap_0 vec) {
        if (null == vec) {
            a.warning("Provided vector is null, null returned.");
            return null;
        }
        this.a -= vec.a;
        this.b -= vec.b;
        this.c -= vec.c;
        return this;
    }

    public ap_0 d(ap_0 vec, ap_0 result) {
        if (result == null) {
            result = new ap_0();
        }
        result.a = this.a - vec.a;
        result.b = this.b - vec.b;
        result.c = this.c - vec.c;
        return result;
    }

    public ap_0 f(float subtractX, float subtractY, float subtractZ) {
        return new ap_0(this.a - subtractX, this.b - subtractY, this.c - subtractZ);
    }

    public ap_0 g(float subtractX, float subtractY, float subtractZ) {
        this.a -= subtractX;
        this.b -= subtractY;
        this.c -= subtractZ;
        return this;
    }

    public ap_0 c() {
        float length = this.a * this.a + this.b * this.b + this.c * this.c;
        if (length != 1.0f && length != 0.0f) {
            length = 1.0f / (float)Math.sqrt(length);
            return new ap_0(this.a * length, this.b * length, this.c * length);
        }
        return new ap_0(this);
    }

    public ap_0 d() {
        float length = this.a * this.a + this.b * this.b + this.c * this.c;
        if (length != 1.0f && length != 0.0f) {
            length = 1.0f / (float)Math.sqrt(length);
            this.a *= length;
            this.b *= length;
            this.c *= length;
        }
        return this;
    }

    public ap_0 n(ap_0 other) {
        this.a = other.a > this.a ? other.a : this.a;
        this.b = other.b > this.b ? other.b : this.b;
        this.c = other.c > this.c ? other.c : this.c;
        return this;
    }

    public ap_0 o(ap_0 other) {
        this.a = other.a < this.a ? other.a : this.a;
        this.b = other.b < this.b ? other.b : this.b;
        this.c = other.c < this.c ? other.c : this.c;
        return this;
    }

    public ap_0 e() {
        this.c = 0.0f;
        this.b = 0.0f;
        this.a = 0.0f;
        return this;
    }

    public float d(ap_0 otherVector) {
        float dotProduct = this.a(otherVector);
        float angle = (float)Math.acos(dotProduct);
        return angle;
    }

    public ap_0 a(ap_0 finalVec, float changeAmnt) {
        this.a = (1.0f - changeAmnt) * this.a + changeAmnt * finalVec.a;
        this.b = (1.0f - changeAmnt) * this.b + changeAmnt * finalVec.b;
        this.c = (1.0f - changeAmnt) * this.c + changeAmnt * finalVec.c;
        return this;
    }

    public ap_0 a(ap_0 beginVec, ap_0 finalVec, float changeAmnt) {
        this.a = (1.0f - changeAmnt) * beginVec.a + changeAmnt * finalVec.a;
        this.b = (1.0f - changeAmnt) * beginVec.b + changeAmnt * finalVec.b;
        this.c = (1.0f - changeAmnt) * beginVec.c + changeAmnt * finalVec.c;
        return this;
    }

    public static boolean a(ap_0 vector) {
        if (vector == null) {
            return false;
        }
        if (Float.isNaN(vector.a) || Float.isNaN(vector.b) || Float.isNaN(vector.c)) {
            return false;
        }
        return !Float.isInfinite(vector.a) && !Float.isInfinite(vector.b) && !Float.isInfinite(vector.c);
    }

    public static void a(ap_0 u2, ap_0 v, ap_0 w2) {
        w2.d();
        ap_0.b(u2, v, w2);
    }

    public static void b(ap_0 u2, ap_0 v, ap_0 w2) {
        if (Math.abs(w2.a) >= Math.abs(w2.b)) {
            float fInvLength = (float)(1.0 / Math.sqrt(w2.a * w2.a + w2.c * w2.c));
            u2.a = -w2.c * fInvLength;
            u2.b = 0.0f;
            u2.c = w2.a * fInvLength;
            v.a = w2.b * u2.c;
            v.b = w2.c * u2.a - w2.a * u2.c;
            v.c = -w2.b * u2.a;
        } else {
            float fInvLength = (float)(1.0 / Math.sqrt(w2.b * w2.b + w2.c * w2.c));
            u2.a = 0.0f;
            u2.b = w2.c * fInvLength;
            u2.c = -w2.b * fInvLength;
            v.a = w2.b * u2.c - w2.c * u2.b;
            v.b = -w2.a * u2.c;
            v.c = w2.a * u2.b;
        }
    }

    public ap_0 f() {
        try {
            return (ap_0)super.clone();
        }
        catch (CloneNotSupportedException e2) {
            throw new AssertionError();
        }
    }

    public float[] a(float[] floats) {
        if (floats == null) {
            floats = new float[]{this.a, this.b, this.c};
        }
        return floats;
    }

    public boolean equals(Object o2) {
        if (!(o2 instanceof ap_0)) {
            return false;
        }
        if (this == o2) {
            return true;
        }
        ap_0 comp = (ap_0)o2;
        if (Float.compare(this.a, comp.a) != 0) {
            return false;
        }
        if (Float.compare(this.b, comp.b) != 0) {
            return false;
        }
        return Float.compare(this.c, comp.c) == 0;
    }

    public int hashCode() {
        int hash = 37;
        hash += 37 * hash + Float.floatToIntBits(this.a);
        hash += 37 * hash + Float.floatToIntBits(this.b);
        hash += 37 * hash + Float.floatToIntBits(this.c);
        return hash;
    }

    public String toString() {
        return "(" + this.a + ", " + this.b + ", " + this.c + ")";
    }

    public float c() {
        return this.a;
    }

    public ap_0 e(float x) {
        this.a = x;
        return this;
    }

    public float d() {
        return this.b;
    }

    public ap_0 f(float y) {
        this.b = y;
        return this;
    }

    public float e() {
        return this.c;
    }

    public ap_0 g(float z) {
        this.c = z;
        return this;
    }

    public float a(int index) {
        switch (index) {
            case 0: {
                return this.a;
            }
            case 1: {
                return this.b;
            }
            case 2: {
                return this.c;
            }
        }
        throw new IllegalArgumentException("index must be either 0, 1 or 2");
    }

    public void a(int index, float value) {
        switch (index) {
            case 0: {
                this.a = value;
                return;
            }
            case 1: {
                this.b = value;
                return;
            }
            case 2: {
                this.c = value;
                return;
            }
        }
        throw new IllegalArgumentException("index must be either 0, 1 or 2");
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return this.f();
    }
}

