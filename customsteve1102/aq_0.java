/*
 * Decompiled with CFR 0.152.
 */
package customsteve;

import customsteve.aj;
import java.util.logging.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from customsteve.aq
 */
public final class aq_0 {
    static final long a = 1L;
    private static final Logger a = Logger.getLogger(aq_0.class.getName());
    public static final aq_0 a = new aq_0(0.0f, 0.0f, 0.0f, 0.0f);
    public static final aq_0 b = new aq_0(Float.NaN, Float.NaN, Float.NaN, Float.NaN);
    public static final aq_0 c = new aq_0(1.0f, 0.0f, 0.0f, 0.0f);
    public static final aq_0 d = new aq_0(0.0f, 1.0f, 0.0f, 0.0f);
    public static final aq_0 e = new aq_0(0.0f, 0.0f, 1.0f, 0.0f);
    public static final aq_0 f = new aq_0(0.0f, 0.0f, 0.0f, 1.0f);
    public static final aq_0 g = new aq_0(1.0f, 1.0f, 1.0f, 1.0f);
    public static final aq_0 h = new aq_0(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final aq_0 i = new aq_0(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public float a;
    public float b;
    public float c;
    public float d;

    public aq_0() {
        this.d = 0.0f;
        this.c = 0.0f;
        this.b = 0.0f;
        this.a = 0.0f;
    }

    public aq_0(float x, float y, float z, float w2) {
        this.a = x;
        this.b = y;
        this.c = z;
        this.d = w2;
    }

    public aq_0(aq_0 copy) {
        this.a(copy);
    }

    public aq_0 a(float x, float y, float z, float w2) {
        this.a = x;
        this.b = y;
        this.c = z;
        this.d = w2;
        return this;
    }

    public aq_0 a(aq_0 vect) {
        this.a = vect.a;
        this.b = vect.b;
        this.c = vect.c;
        this.d = vect.d;
        return this;
    }

    public aq_0 b(aq_0 vec) {
        if (null == vec) {
            a.warning("Provided vector is null, null returned.");
            return null;
        }
        return new aq_0(this.a + vec.a, this.b + vec.b, this.c + vec.c, this.d + vec.d);
    }

    public aq_0 a(aq_0 vec, aq_0 result) {
        result.a = this.a + vec.a;
        result.b = this.b + vec.b;
        result.c = this.c + vec.c;
        result.d = this.d + vec.d;
        return result;
    }

    public aq_0 c(aq_0 vec) {
        if (null == vec) {
            a.warning("Provided vector is null, null returned.");
            return null;
        }
        this.a += vec.a;
        this.b += vec.b;
        this.c += vec.c;
        this.d += vec.d;
        return this;
    }

    public aq_0 b(float addX, float addY, float addZ, float addW) {
        return new aq_0(this.a + addX, this.b + addY, this.c + addZ, this.d + addW);
    }

    public aq_0 c(float addX, float addY, float addZ, float addW) {
        this.a += addX;
        this.b += addY;
        this.c += addZ;
        this.d += addW;
        return this;
    }

    public aq_0 a(float scalar, aq_0 add) {
        this.a = this.a * scalar + add.a;
        this.b = this.b * scalar + add.b;
        this.c = this.c * scalar + add.c;
        this.d = this.d * scalar + add.d;
        return this;
    }

    public aq_0 a(float scalar, aq_0 mult, aq_0 add) {
        this.a = mult.a * scalar + add.a;
        this.b = mult.b * scalar + add.b;
        this.c = mult.c * scalar + add.c;
        this.d = mult.d * scalar + add.d;
        return this;
    }

    public float a(aq_0 vec) {
        if (null == vec) {
            a.warning("Provided vector is null, 0 returned.");
            return 0.0f;
        }
        return this.a * vec.a + this.b * vec.b + this.c * vec.c + this.d * vec.d;
    }

    public aq_0 d(aq_0 other) {
        float n2 = this.a(other);
        float d2 = other.b();
        return new aq_0(other).d().b(n2 / d2);
    }

    public boolean a() {
        float len = this.a();
        return 0.99f < len && len < 1.01f;
    }

    public float a() {
        return aj.n(this.b());
    }

    public float b() {
        return this.a * this.a + this.b * this.b + this.c * this.c + this.d * this.d;
    }

    public float b(aq_0 v) {
        double dx = this.a - v.a;
        double dy = this.b - v.b;
        double dz = this.c - v.c;
        double dw = this.d - v.d;
        return (float)(dx * dx + dy * dy + dz * dz + dw * dw);
    }

    public float c(aq_0 v) {
        return aj.n(this.b(v));
    }

    public aq_0 a(float scalar) {
        return new aq_0(this.a * scalar, this.b * scalar, this.c * scalar, this.d * scalar);
    }

    public aq_0 b(float scalar, aq_0 product) {
        if (null == product) {
            product = new aq_0();
        }
        product.a = this.a * scalar;
        product.b = this.b * scalar;
        product.c = this.c * scalar;
        product.d = this.d * scalar;
        return product;
    }

    public aq_0 b(float scalar) {
        this.a *= scalar;
        this.b *= scalar;
        this.c *= scalar;
        this.d *= scalar;
        return this;
    }

    public aq_0 e(aq_0 vec) {
        if (null == vec) {
            a.warning("Provided vector is null, null returned.");
            return null;
        }
        this.a *= vec.a;
        this.b *= vec.b;
        this.c *= vec.c;
        this.d *= vec.d;
        return this;
    }

    public aq_0 d(float x, float y, float z, float w2) {
        this.a *= x;
        this.b *= y;
        this.c *= z;
        this.d *= w2;
        return this;
    }

    public aq_0 f(aq_0 vec) {
        if (null == vec) {
            a.warning("Provided vector is null, null returned.");
            return null;
        }
        return this.b(vec, null);
    }

    public aq_0 b(aq_0 vec, aq_0 store) {
        if (null == vec) {
            a.warning("Provided vector is null, null returned.");
            return null;
        }
        if (store == null) {
            store = new aq_0();
        }
        return store.a(this.a * vec.a, this.b * vec.b, this.c * vec.c, this.d * vec.d);
    }

    public aq_0 c(float scalar) {
        scalar = 1.0f / scalar;
        return new aq_0(this.a * scalar, this.b * scalar, this.c * scalar, this.d * scalar);
    }

    public aq_0 d(float scalar) {
        scalar = 1.0f / scalar;
        this.a *= scalar;
        this.b *= scalar;
        this.c *= scalar;
        this.d *= scalar;
        return this;
    }

    public aq_0 g(aq_0 scalar) {
        return new aq_0(this.a / scalar.a, this.b / scalar.b, this.c / scalar.c, this.d / scalar.d);
    }

    public aq_0 h(aq_0 scalar) {
        this.a /= scalar.a;
        this.b /= scalar.b;
        this.c /= scalar.c;
        this.d /= scalar.d;
        return this;
    }

    public aq_0 a() {
        return new aq_0(-this.a, -this.b, -this.c, -this.d);
    }

    public aq_0 b() {
        this.a = -this.a;
        this.b = -this.b;
        this.c = -this.c;
        this.d = -this.d;
        return this;
    }

    public aq_0 i(aq_0 vec) {
        return new aq_0(this.a - vec.a, this.b - vec.b, this.c - vec.c, this.d - vec.d);
    }

    public aq_0 j(aq_0 vec) {
        if (null == vec) {
            a.warning("Provided vector is null, null returned.");
            return null;
        }
        this.a -= vec.a;
        this.b -= vec.b;
        this.c -= vec.c;
        this.d -= vec.d;
        return this;
    }

    public aq_0 c(aq_0 vec, aq_0 result) {
        if (result == null) {
            result = new aq_0();
        }
        result.a = this.a - vec.a;
        result.b = this.b - vec.b;
        result.c = this.c - vec.c;
        result.d = this.d - vec.d;
        return result;
    }

    public aq_0 e(float subtractX, float subtractY, float subtractZ, float subtractW) {
        return new aq_0(this.a - subtractX, this.b - subtractY, this.c - subtractZ, this.d - subtractW);
    }

    public aq_0 f(float subtractX, float subtractY, float subtractZ, float subtractW) {
        this.a -= subtractX;
        this.b -= subtractY;
        this.c -= subtractZ;
        this.d -= subtractW;
        return this;
    }

    public aq_0 c() {
        float length = this.a * this.a + this.b * this.b + this.c * this.c + this.d * this.d;
        if (length != 1.0f && length != 0.0f) {
            length = 1.0f / aj.n(length);
            return new aq_0(this.a * length, this.b * length, this.c * length, this.d * length);
        }
        return this.f();
    }

    public aq_0 d() {
        float length = this.a * this.a + this.b * this.b + this.c * this.c + this.d * this.d;
        if (length != 1.0f && length != 0.0f) {
            length = 1.0f / aj.n(length);
            this.a *= length;
            this.b *= length;
            this.c *= length;
            this.d *= length;
        }
        return this;
    }

    public aq_0 k(aq_0 other) {
        this.a = other.a > this.a ? other.a : this.a;
        this.b = other.b > this.b ? other.b : this.b;
        this.c = other.c > this.c ? other.c : this.c;
        this.d = other.d > this.d ? other.d : this.d;
        return this;
    }

    public aq_0 l(aq_0 other) {
        this.a = other.a < this.a ? other.a : this.a;
        this.b = other.b < this.b ? other.b : this.b;
        this.c = other.c < this.c ? other.c : this.c;
        this.d = other.d < this.d ? other.d : this.d;
        return this;
    }

    public aq_0 e() {
        this.d = 0.0f;
        this.c = 0.0f;
        this.b = 0.0f;
        this.a = 0.0f;
        return this;
    }

    public float d(aq_0 otherVector) {
        float dotProduct = this.a(otherVector);
        float angle = aj.a(dotProduct);
        return angle;
    }

    public aq_0 a(aq_0 finalVec, float changeAmnt) {
        this.a = (1.0f - changeAmnt) * this.a + changeAmnt * finalVec.a;
        this.b = (1.0f - changeAmnt) * this.b + changeAmnt * finalVec.b;
        this.c = (1.0f - changeAmnt) * this.c + changeAmnt * finalVec.c;
        this.d = (1.0f - changeAmnt) * this.d + changeAmnt * finalVec.d;
        return this;
    }

    public aq_0 a(aq_0 beginVec, aq_0 finalVec, float changeAmnt) {
        this.a = (1.0f - changeAmnt) * beginVec.a + changeAmnt * finalVec.a;
        this.b = (1.0f - changeAmnt) * beginVec.b + changeAmnt * finalVec.b;
        this.c = (1.0f - changeAmnt) * beginVec.c + changeAmnt * finalVec.c;
        this.d = (1.0f - changeAmnt) * beginVec.d + changeAmnt * finalVec.d;
        return this;
    }

    public static boolean a(aq_0 vector) {
        if (vector == null) {
            return false;
        }
        if (Float.isNaN(vector.a) || Float.isNaN(vector.b) || Float.isNaN(vector.c) || Float.isNaN(vector.d)) {
            return false;
        }
        return !Float.isInfinite(vector.a) && !Float.isInfinite(vector.b) && !Float.isInfinite(vector.c) && !Float.isInfinite(vector.d);
    }

    public aq_0 f() {
        try {
            return (aq_0)super.clone();
        }
        catch (CloneNotSupportedException e2) {
            throw new AssertionError();
        }
    }

    public float[] a(float[] floats) {
        if (floats == null) {
            floats = new float[]{this.a, this.b, this.c, this.d};
        }
        return floats;
    }

    public aq_0 a(float[] xyzw) {
        if (xyzw != null && xyzw.length > 3) {
            this.a = xyzw[0];
            this.b = xyzw[1];
            this.c = xyzw[2];
            this.d = xyzw[3];
        }
        return this;
    }

    public boolean equals(Object o2) {
        if (!(o2 instanceof aq_0)) {
            return false;
        }
        if (this == o2) {
            return true;
        }
        aq_0 comp = (aq_0)o2;
        if (Float.compare(this.a, comp.a) != 0) {
            return false;
        }
        if (Float.compare(this.b, comp.b) != 0) {
            return false;
        }
        if (Float.compare(this.c, comp.c) != 0) {
            return false;
        }
        return Float.compare(this.d, comp.d) == 0;
    }

    public int hashCode() {
        int hash = 37;
        hash += 37 * hash + Float.floatToIntBits(this.a);
        hash += 37 * hash + Float.floatToIntBits(this.b);
        hash += 37 * hash + Float.floatToIntBits(this.c);
        hash += 37 * hash + Float.floatToIntBits(this.d);
        return hash;
    }

    public String toString() {
        return "(" + this.a + ", " + this.b + ", " + this.c + ", " + this.d + ")";
    }

    public float c() {
        return this.a;
    }

    public aq_0 e(float x) {
        this.a = x;
        return this;
    }

    public float d() {
        return this.b;
    }

    public aq_0 f(float y) {
        this.b = y;
        return this;
    }

    public float e() {
        return this.c;
    }

    public aq_0 g(float z) {
        this.c = z;
        return this;
    }

    public float f() {
        return this.d;
    }

    public aq_0 h(float w2) {
        this.d = w2;
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
            case 3: {
                return this.d;
            }
        }
        throw new IllegalArgumentException("index must be either 0, 1, 2 or 3");
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
            case 3: {
                this.d = value;
                return;
            }
        }
        throw new IllegalArgumentException("index must be either 0, 1, 2 or 3");
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return this.f();
    }
}

