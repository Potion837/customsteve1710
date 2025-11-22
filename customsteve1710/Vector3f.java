/*
 * Decompiled with CFR 0.152.
 */
import java.util.logging.Logger;

public final class Vector3f {
    static final long barbara$ = 1L;
    private static final Logger baker$ = Logger.getLogger(Vector3f.class.getName());
    public static final Vector3f yacht$ = new Vector3f(0.0f, 0.0f, 0.0f);
    public static final Vector3f grass$ = new Vector3f(Float.NaN, Float.NaN, Float.NaN);
    public static final Vector3f museums$ = new Vector3f(1.0f, 0.0f, 0.0f);
    public static final Vector3f seminar$ = new Vector3f(0.0f, 1.0f, 0.0f);
    public static final Vector3f gained$ = new Vector3f(0.0f, 0.0f, 1.0f);
    public static final Vector3f airline$ = new Vector3f(1.0f, 1.0f, 1.0f);
    public static final Vector3f savage$ = new Vector3f(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final Vector3f ordinary$ = new Vector3f(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public float serves$;
    public float genius$;
    public float superb$;

    public Vector3f() {
        this.superb$ = 0.0f;
        this.genius$ = 0.0f;
        this.serves$ = 0.0f;
    }

    public Vector3f(float x, float y, float z) {
        this.serves$ = x;
        this.genius$ = y;
        this.superb$ = z;
    }

    public Vector3f(Vector3f copy) {
        this._shoot(copy);
    }

    public Vector3f _alleged(float x, float y, float z) {
        this.serves$ = x;
        this.genius$ = y;
        this.superb$ = z;
        return this;
    }

    public Vector3f _shoot(Vector3f vect) {
        this.serves$ = vect.serves$;
        this.genius$ = vect.genius$;
        this.superb$ = vect.superb$;
        return this;
    }

    public Vector3f _approval(Vector3f vec) {
        if (null == vec) {
            baker$.warning("Provided vector is null, null returned.");
            return null;
        }
        return new Vector3f(this.serves$ + vec.serves$, this.genius$ + vec.genius$, this.superb$ + vec.superb$);
    }

    public Vector3f _english(Vector3f vec, Vector3f result) {
        result.serves$ = this.serves$ + vec.serves$;
        result.genius$ = this.genius$ + vec.genius$;
        result.superb$ = this.superb$ + vec.superb$;
        return result;
    }

    public Vector3f _kinda(Vector3f vec) {
        if (null == vec) {
            baker$.warning("Provided vector is null, null returned.");
            return null;
        }
        this.serves$ += vec.serves$;
        this.genius$ += vec.genius$;
        this.superb$ += vec.superb$;
        return this;
    }

    public Vector3f _strongly(float addX, float addY, float addZ) {
        return new Vector3f(this.serves$ + addX, this.genius$ + addY, this.superb$ + addZ);
    }

    public Vector3f _enabled(float addX, float addY, float addZ) {
        this.serves$ += addX;
        this.genius$ += addY;
        this.superb$ += addZ;
        return this;
    }

    public Vector3f _zones(float scalar, Vector3f add) {
        this.serves$ = this.serves$ * scalar + add.serves$;
        this.genius$ = this.genius$ * scalar + add.genius$;
        this.superb$ = this.superb$ * scalar + add.superb$;
        return this;
    }

    public Vector3f _notice(float scalar, Vector3f mult, Vector3f add) {
        this.serves$ = mult.serves$ * scalar + add.serves$;
        this.genius$ = mult.genius$ * scalar + add.genius$;
        this.superb$ = mult.superb$ * scalar + add.superb$;
        return this;
    }

    public float _client(Vector3f vec) {
        if (null == vec) {
            baker$.warning("Provided vector is null, 0 returned.");
            return 0.0f;
        }
        return this.serves$ * vec.serves$ + this.genius$ * vec.genius$ + this.superb$ * vec.superb$;
    }

    public float _intel(float x1, float y1, float z1) {
        return this.serves$ * x1 + this.genius$ * y1 + this.superb$ * z1;
    }

    public Vector3f _issued(Vector3f v) {
        return this._hartford(v, null);
    }

    public Vector3f _hartford(Vector3f v, Vector3f result) {
        return this._hotmail(v.serves$, v.genius$, v.superb$, result);
    }

    public Vector3f _hotmail(float otherX, float otherY, float otherZ, Vector3f result) {
        if (result == null) {
            result = new Vector3f();
        }
        float resX = this.genius$ * otherZ - this.superb$ * otherY;
        float resY = this.superb$ * otherX - this.serves$ * otherZ;
        float resZ = this.serves$ * otherY - this.genius$ * otherX;
        result._alleged(resX, resY, resZ);
        return result;
    }

    public Vector3f _knight(Vector3f v) {
        return this._testing(v.serves$, v.genius$, v.superb$);
    }

    public Vector3f _testing(float otherX, float otherY, float otherZ) {
        float tempx = this.genius$ * otherZ - this.superb$ * otherY;
        float tempy = this.superb$ * otherX - this.serves$ * otherZ;
        this.superb$ = this.serves$ * otherY - this.genius$ * otherX;
        this.serves$ = tempx;
        this.genius$ = tempy;
        return this;
    }

    public Vector3f _provides(Vector3f other) {
        float n = this._client(other);
        float d2 = other._thehun();
        return new Vector3f(other)._press()._licence(n / d2);
    }

    public Vector3f _eclipse(Vector3f other) {
        float n = this._client(other);
        float d2 = other._thehun();
        return this._shoot(other)._press()._licence(n / d2);
    }

    public boolean _tight() {
        float len = this._commands();
        return 0.99f < len && len < 1.01f;
    }

    public float _commands() {
        return (float)Math.sqrt(this._thehun());
    }

    public float _thehun() {
        return this.serves$ * this.serves$ + this.genius$ * this.genius$ + this.superb$ * this.superb$;
    }

    public float _multiple(Vector3f v) {
        double dx = this.serves$ - v.serves$;
        double dy = this.genius$ - v.genius$;
        double dz = this.superb$ - v.superb$;
        return (float)(dx * dx + dy * dy + dz * dz);
    }

    public float _another(Vector3f v) {
        return (float)Math.sqrt(this._multiple(v));
    }

    public Vector3f _survival(float scalar) {
        return new Vector3f(this.serves$ * scalar, this.genius$ * scalar, this.superb$ * scalar);
    }

    public Vector3f _verbal(float scalar, Vector3f product) {
        if (null == product) {
            product = new Vector3f();
        }
        product.serves$ = this.serves$ * scalar;
        product.genius$ = this.genius$ * scalar;
        product.superb$ = this.superb$ * scalar;
        return product;
    }

    public Vector3f _licence(float scalar) {
        this.serves$ *= scalar;
        this.genius$ *= scalar;
        this.superb$ *= scalar;
        return this;
    }

    public Vector3f _cookies(Vector3f vec) {
        if (null == vec) {
            baker$.warning("Provided vector is null, null returned.");
            return null;
        }
        this.serves$ *= vec.serves$;
        this.genius$ *= vec.genius$;
        this.superb$ *= vec.superb$;
        return this;
    }

    public Vector3f _diamond(float x, float y, float z) {
        this.serves$ *= x;
        this.genius$ *= y;
        this.superb$ *= z;
        return this;
    }

    public Vector3f _solution(Vector3f vec) {
        if (null == vec) {
            baker$.warning("Provided vector is null, null returned.");
            return null;
        }
        return this._avenue(vec, null);
    }

    public Vector3f _avenue(Vector3f vec, Vector3f store) {
        if (null == vec) {
            baker$.warning("Provided vector is null, null returned.");
            return null;
        }
        if (store == null) {
            store = new Vector3f();
        }
        return store._alleged(this.serves$ * vec.serves$, this.genius$ * vec.genius$, this.superb$ * vec.superb$);
    }

    public Vector3f _secret(float scalar) {
        scalar = 1.0f / scalar;
        return new Vector3f(this.serves$ * scalar, this.genius$ * scalar, this.superb$ * scalar);
    }

    public Vector3f _vitamins(float scalar) {
        scalar = 1.0f / scalar;
        this.serves$ *= scalar;
        this.genius$ *= scalar;
        this.superb$ *= scalar;
        return this;
    }

    public Vector3f _sells(Vector3f scalar) {
        return new Vector3f(this.serves$ / scalar.serves$, this.genius$ / scalar.genius$, this.superb$ / scalar.superb$);
    }

    public Vector3f _fifth(Vector3f scalar) {
        this.serves$ /= scalar.serves$;
        this.genius$ /= scalar.genius$;
        this.superb$ /= scalar.superb$;
        return this;
    }

    public Vector3f _holmes() {
        return new Vector3f(-this.serves$, -this.genius$, -this.superb$);
    }

    public Vector3f _bought() {
        this.serves$ = -this.serves$;
        this.genius$ = -this.genius$;
        this.superb$ = -this.superb$;
        return this;
    }

    public Vector3f _based(Vector3f vec) {
        return new Vector3f(this.serves$ - vec.serves$, this.genius$ - vec.genius$, this.superb$ - vec.superb$);
    }

    public Vector3f _designed(Vector3f vec) {
        if (null == vec) {
            baker$.warning("Provided vector is null, null returned.");
            return null;
        }
        this.serves$ -= vec.serves$;
        this.genius$ -= vec.genius$;
        this.superb$ -= vec.superb$;
        return this;
    }

    public Vector3f _siemens(Vector3f vec, Vector3f result) {
        if (result == null) {
            result = new Vector3f();
        }
        result.serves$ = this.serves$ - vec.serves$;
        result.genius$ = this.genius$ - vec.genius$;
        result.superb$ = this.superb$ - vec.superb$;
        return result;
    }

    public Vector3f _formats(float subtractX, float subtractY, float subtractZ) {
        return new Vector3f(this.serves$ - subtractX, this.genius$ - subtractY, this.superb$ - subtractZ);
    }

    public Vector3f _house(float subtractX, float subtractY, float subtractZ) {
        this.serves$ -= subtractX;
        this.genius$ -= subtractY;
        this.superb$ -= subtractZ;
        return this;
    }

    public Vector3f _mixer() {
        float length = this.serves$ * this.serves$ + this.genius$ * this.genius$ + this.superb$ * this.superb$;
        if (length != 1.0f && length != 0.0f) {
            length = 1.0f / (float)Math.sqrt(length);
            return new Vector3f(this.serves$ * length, this.genius$ * length, this.superb$ * length);
        }
        return new Vector3f(this);
    }

    public Vector3f _press() {
        float length = this.serves$ * this.serves$ + this.genius$ * this.genius$ + this.superb$ * this.superb$;
        if (length != 1.0f && length != 0.0f) {
            length = 1.0f / (float)Math.sqrt(length);
            this.serves$ *= length;
            this.genius$ *= length;
            this.superb$ *= length;
        }
        return this;
    }

    public Vector3f _cutting(Vector3f other) {
        this.serves$ = other.serves$ > this.serves$ ? other.serves$ : this.serves$;
        this.genius$ = other.genius$ > this.genius$ ? other.genius$ : this.genius$;
        this.superb$ = other.superb$ > this.superb$ ? other.superb$ : this.superb$;
        return this;
    }

    public Vector3f _glasses(Vector3f other) {
        this.serves$ = other.serves$ < this.serves$ ? other.serves$ : this.serves$;
        this.genius$ = other.genius$ < this.genius$ ? other.genius$ : this.genius$;
        this.superb$ = other.superb$ < this.superb$ ? other.superb$ : this.superb$;
        return this;
    }

    public Vector3f _expansys() {
        this.superb$ = 0.0f;
        this.genius$ = 0.0f;
        this.serves$ = 0.0f;
        return this;
    }

    public float _tracy(Vector3f otherVector) {
        float dotProduct = this._client(otherVector);
        float angle = (float)Math.acos(dotProduct);
        return angle;
    }

    public Vector3f _aviation(Vector3f finalVec, float changeAmnt) {
        this.serves$ = (1.0f - changeAmnt) * this.serves$ + changeAmnt * finalVec.serves$;
        this.genius$ = (1.0f - changeAmnt) * this.genius$ + changeAmnt * finalVec.genius$;
        this.superb$ = (1.0f - changeAmnt) * this.superb$ + changeAmnt * finalVec.superb$;
        return this;
    }

    public Vector3f _willow(Vector3f beginVec, Vector3f finalVec, float changeAmnt) {
        this.serves$ = (1.0f - changeAmnt) * beginVec.serves$ + changeAmnt * finalVec.serves$;
        this.genius$ = (1.0f - changeAmnt) * beginVec.genius$ + changeAmnt * finalVec.genius$;
        this.superb$ = (1.0f - changeAmnt) * beginVec.superb$ + changeAmnt * finalVec.superb$;
        return this;
    }

    public static boolean _kuwait(Vector3f vector) {
        if (vector == null) {
            return false;
        }
        if (Float.isNaN(vector.serves$) || Float.isNaN(vector.genius$) || Float.isNaN(vector.superb$)) {
            return false;
        }
        return !Float.isInfinite(vector.serves$) && !Float.isInfinite(vector.genius$) && !Float.isInfinite(vector.superb$);
    }

    public static void _exams(Vector3f u, Vector3f v, Vector3f w) {
        w._press();
        Vector3f._category(u, v, w);
    }

    public static void _category(Vector3f u, Vector3f v, Vector3f w) {
        if (Math.abs(w.serves$) >= Math.abs(w.genius$)) {
            float fInvLength = (float)(1.0 / Math.sqrt(w.serves$ * w.serves$ + w.superb$ * w.superb$));
            u.serves$ = -w.superb$ * fInvLength;
            u.genius$ = 0.0f;
            u.superb$ = w.serves$ * fInvLength;
            v.serves$ = w.genius$ * u.superb$;
            v.genius$ = w.superb$ * u.serves$ - w.serves$ * u.superb$;
            v.superb$ = -w.genius$ * u.serves$;
        } else {
            float fInvLength = (float)(1.0 / Math.sqrt(w.genius$ * w.genius$ + w.superb$ * w.superb$));
            u.serves$ = 0.0f;
            u.genius$ = w.superb$ * fInvLength;
            u.superb$ = -w.genius$ * fInvLength;
            v.serves$ = w.genius$ * u.superb$ - w.superb$ * u.genius$;
            v.genius$ = -w.serves$ * u.superb$;
            v.superb$ = w.serves$ * u.genius$;
        }
    }

    public Vector3f _minimal() {
        try {
            return (Vector3f)super.clone();
        }
        catch (CloneNotSupportedException e2) {
            throw new AssertionError();
        }
    }

    public float[] _rooms(float[] floats) {
        if (floats == null) {
            floats = new float[]{this.serves$, this.genius$, this.superb$};
        }
        return floats;
    }

    public boolean equals(Object o) {
        if (!(o instanceof Vector3f)) {
            return false;
        }
        if (this == o) {
            return true;
        }
        Vector3f comp = (Vector3f)o;
        if (Float.compare(this.serves$, comp.serves$) != 0) {
            return false;
        }
        if (Float.compare(this.genius$, comp.genius$) != 0) {
            return false;
        }
        return Float.compare(this.superb$, comp.superb$) == 0;
    }

    public int hashCode() {
        int hash = 37;
        hash += 37 * hash + Float.floatToIntBits(this.serves$);
        hash += 37 * hash + Float.floatToIntBits(this.genius$);
        hash += 37 * hash + Float.floatToIntBits(this.superb$);
        return hash;
    }

    public String toString() {
        return "(" + this.serves$ + ", " + this.genius$ + ", " + this.superb$ + ")";
    }

    public float _beads() {
        return this.serves$;
    }

    public Vector3f _filed(float x) {
        this.serves$ = x;
        return this;
    }

    public float _hungry() {
        return this.genius$;
    }

    public Vector3f _itunes(float y) {
        this.genius$ = y;
        return this;
    }

    public float _april() {
        return this.superb$;
    }

    public Vector3f _assume(float z) {
        this.superb$ = z;
        return this;
    }

    public float _judge(int index) {
        switch (index) {
            case 0: {
                return this.serves$;
            }
            case 1: {
                return this.genius$;
            }
            case 2: {
                return this.superb$;
            }
        }
        throw new IllegalArgumentException("index must be either 0, 1 or 2");
    }

    public void _shipment(int index, float value) {
        switch (index) {
            case 0: {
                this.serves$ = value;
                return;
            }
            case 1: {
                this.genius$ = value;
                return;
            }
            case 2: {
                this.superb$ = value;
                return;
            }
        }
        throw new IllegalArgumentException("index must be either 0, 1 or 2");
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return this._minimal();
    }
}

