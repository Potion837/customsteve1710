/*
 * Decompiled with CFR 0.152.
 */
package customsteve;

import customsteve.aj;
import customsteve.ap_0;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.logging.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ao {
    static final long a = 1L;
    private static final Logger a = Logger.getLogger(ao.class.getName());
    public static final ao a = new ao(0.0f, 0.0f);
    public static final ao b = new ao(1.0f, 1.0f);
    public float a;
    public float b;

    public ao(float x, float y) {
        this.a = x;
        this.b = y;
    }

    public ao() {
        this.b = 0.0f;
        this.a = 0.0f;
    }

    public ao(ao vector2f) {
        this.a = vector2f.a;
        this.b = vector2f.b;
    }

    public ao a(float x, float y) {
        this.a = x;
        this.b = y;
        return this;
    }

    public ao a(ao vec) {
        this.a = vec.a;
        this.b = vec.b;
        return this;
    }

    public ao b(ao vec) {
        if (null == vec) {
            a.warning("Provided vector is null, null returned.");
            return null;
        }
        return new ao(this.a + vec.a, this.b + vec.b);
    }

    public ao c(ao vec) {
        if (null == vec) {
            a.warning("Provided vector is null, null returned.");
            return null;
        }
        this.a += vec.a;
        this.b += vec.b;
        return this;
    }

    public ao b(float addX, float addY) {
        this.a += addX;
        this.b += addY;
        return this;
    }

    public ao a(ao vec, ao result) {
        if (null == vec) {
            a.warning("Provided vector is null, null returned.");
            return null;
        }
        if (result == null) {
            result = new ao();
        }
        result.a = this.a + vec.a;
        result.b = this.b + vec.b;
        return result;
    }

    public float a(ao vec) {
        if (null == vec) {
            a.warning("Provided vector is null, 0 returned.");
            return 0.0f;
        }
        return this.a * vec.a + this.b * vec.b;
    }

    public ap_0 a(ao v) {
        return new ap_0(0.0f, 0.0f, this.b(v));
    }

    public float b(ao v) {
        return this.a * v.b - this.b * v.a;
    }

    public ao a(ao finalVec, float changeAmnt) {
        this.a = (1.0f - changeAmnt) * this.a + changeAmnt * finalVec.a;
        this.b = (1.0f - changeAmnt) * this.b + changeAmnt * finalVec.b;
        return this;
    }

    public ao a(ao beginVec, ao finalVec, float changeAmnt) {
        this.a = (1.0f - changeAmnt) * beginVec.a + changeAmnt * finalVec.a;
        this.b = (1.0f - changeAmnt) * beginVec.b + changeAmnt * finalVec.b;
        return this;
    }

    public static boolean a(ao vector) {
        if (vector == null) {
            return false;
        }
        if (Float.isNaN(vector.a) || Float.isNaN(vector.b)) {
            return false;
        }
        return !Float.isInfinite(vector.a) && !Float.isInfinite(vector.b);
    }

    public float a() {
        return aj.n(this.b());
    }

    public float b() {
        return this.a * this.a + this.b * this.b;
    }

    public float c(ao v) {
        double dx = this.a - v.a;
        double dy = this.b - v.b;
        return (float)(dx * dx + dy * dy);
    }

    public float a(float otherX, float otherY) {
        double dx = this.a - otherX;
        double dy = this.b - otherY;
        return (float)(dx * dx + dy * dy);
    }

    public float d(ao v) {
        return aj.n(this.c(v));
    }

    public ao a(float scalar) {
        return new ao(this.a * scalar, this.b * scalar);
    }

    public ao b(float scalar) {
        this.a *= scalar;
        this.b *= scalar;
        return this;
    }

    public ao d(ao vec) {
        if (null == vec) {
            a.warning("Provided vector is null, null returned.");
            return null;
        }
        this.a *= vec.a;
        this.b *= vec.b;
        return this;
    }

    public ao a(float scalar, ao product) {
        if (null == product) {
            product = new ao();
        }
        product.a = this.a * scalar;
        product.b = this.b * scalar;
        return product;
    }

    public ao c(float scalar) {
        return new ao(this.a / scalar, this.b / scalar);
    }

    public ao d(float scalar) {
        this.a /= scalar;
        this.b /= scalar;
        return this;
    }

    public ao a() {
        return new ao(-this.a, -this.b);
    }

    public ao b() {
        this.a = -this.a;
        this.b = -this.b;
        return this;
    }

    public ao e(ao vec) {
        return this.b(vec, null);
    }

    public ao b(ao vec, ao store) {
        if (store == null) {
            store = new ao();
        }
        store.a = this.a - vec.a;
        store.b = this.b - vec.b;
        return store;
    }

    public ao c(float valX, float valY) {
        return new ao(this.a - valX, this.b - valY);
    }

    public ao f(ao vec) {
        if (null == vec) {
            a.warning("Provided vector is null, null returned.");
            return null;
        }
        this.a -= vec.a;
        this.b -= vec.b;
        return this;
    }

    public ao d(float valX, float valY) {
        this.a -= valX;
        this.b -= valY;
        return this;
    }

    public ao c() {
        float length = this.a();
        if (length != 0.0f) {
            return this.c(length);
        }
        return this.c(1.0f);
    }

    public ao d() {
        float length = this.a();
        if (length != 0.0f) {
            return this.d(length);
        }
        return this.d(1.0f);
    }

    public float e(ao otherVector) {
        float dotProduct = this.a(otherVector);
        float angle = aj.a(dotProduct);
        return angle;
    }

    public float f(ao otherVector) {
        float angle = aj.a(otherVector.b, otherVector.a) - aj.a(this.b, this.a);
        return angle;
    }

    public float c() {
        return this.a;
    }

    public ao e(float x) {
        this.a = x;
        return this;
    }

    public float d() {
        return this.b;
    }

    public ao f(float y) {
        this.b = y;
        return this;
    }

    public float e() {
        return aj.a(this.b, this.a);
    }

    public ao e() {
        this.b = 0.0f;
        this.a = 0.0f;
        return this;
    }

    public int hashCode() {
        int hash = 37;
        hash += 37 * hash + Float.floatToIntBits(this.a);
        hash += 37 * hash + Float.floatToIntBits(this.b);
        return hash;
    }

    public ao f() {
        try {
            return (ao)super.clone();
        }
        catch (CloneNotSupportedException e2) {
            throw new AssertionError();
        }
    }

    public float[] a(float[] floats) {
        if (floats == null) {
            floats = new float[]{this.a, this.b};
        }
        return floats;
    }

    public boolean equals(Object o2) {
        if (!(o2 instanceof ao)) {
            return false;
        }
        if (this == o2) {
            return true;
        }
        ao comp = (ao)o2;
        if (Float.compare(this.a, comp.a) != 0) {
            return false;
        }
        return Float.compare(this.b, comp.b) == 0;
    }

    public String toString() {
        return "(" + this.a + ", " + this.b + ")";
    }

    public void a(ObjectInput in) throws IOException, ClassNotFoundException {
        this.a = in.readFloat();
        this.b = in.readFloat();
    }

    public void a(ObjectOutput out) throws IOException {
        out.writeFloat(this.a);
        out.writeFloat(this.b);
    }

    public void a(float angle, boolean cw) {
        if (cw) {
            angle = -angle;
        }
        float newX = aj.e(angle) * this.a - aj.f(angle) * this.b;
        float newY = aj.f(angle) * this.a + aj.e(angle) * this.b;
        this.a = newX;
        this.b = newY;
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return this.f();
    }
}

