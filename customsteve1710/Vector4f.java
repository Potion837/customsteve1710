/*
 * Decompiled with CFR 0.152.
 */
import java.util.logging.Logger;

public final class Vector4f {
    static final long would$ = 1L;
    private static final Logger podcasts$ = Logger.getLogger(Vector4f.class.getName());
    public static final Vector4f commons$ = new Vector4f(0.0f, 0.0f, 0.0f, 0.0f);
    public static final Vector4f greene$ = new Vector4f(Float.NaN, Float.NaN, Float.NaN, Float.NaN);
    public static final Vector4f hottest$ = new Vector4f(1.0f, 0.0f, 0.0f, 0.0f);
    public static final Vector4f handbook$ = new Vector4f(0.0f, 1.0f, 0.0f, 0.0f);
    public static final Vector4f literacy$ = new Vector4f(0.0f, 0.0f, 1.0f, 0.0f);
    public static final Vector4f scared$ = new Vector4f(0.0f, 0.0f, 0.0f, 1.0f);
    public static final Vector4f deeply$ = new Vector4f(1.0f, 1.0f, 1.0f, 1.0f);
    public static final Vector4f programs$ = new Vector4f(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final Vector4f taken$ = new Vector4f(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public float naked$;
    public float current$;
    public float token$;
    public float includes$;

    public Vector4f() {
        this.includes$ = 0.0f;
        this.token$ = 0.0f;
        this.current$ = 0.0f;
        this.naked$ = 0.0f;
    }

    public Vector4f(float x, float y, float z, float w) {
        this.naked$ = x;
        this.current$ = y;
        this.token$ = z;
        this.includes$ = w;
    }

    public Vector4f(Vector4f copy) {
        this._emperor(copy);
    }

    public Vector4f _unless(float x, float y, float z, float w) {
        this.naked$ = x;
        this.current$ = y;
        this.token$ = z;
        this.includes$ = w;
        return this;
    }

    public Vector4f _emperor(Vector4f vect) {
        this.naked$ = vect.naked$;
        this.current$ = vect.current$;
        this.token$ = vect.token$;
        this.includes$ = vect.includes$;
        return this;
    }

    public Vector4f _kissing(Vector4f vec) {
        if (null == vec) {
            podcasts$.warning("Provided vector is null, null returned.");
            return null;
        }
        return new Vector4f(this.naked$ + vec.naked$, this.current$ + vec.current$, this.token$ + vec.token$, this.includes$ + vec.includes$);
    }

    public Vector4f _knives(Vector4f vec, Vector4f result) {
        result.naked$ = this.naked$ + vec.naked$;
        result.current$ = this.current$ + vec.current$;
        result.token$ = this.token$ + vec.token$;
        result.includes$ = this.includes$ + vec.includes$;
        return result;
    }

    public Vector4f _cache(Vector4f vec) {
        if (null == vec) {
            podcasts$.warning("Provided vector is null, null returned.");
            return null;
        }
        this.naked$ += vec.naked$;
        this.current$ += vec.current$;
        this.token$ += vec.token$;
        this.includes$ += vec.includes$;
        return this;
    }

    public Vector4f _website(float addX, float addY, float addZ, float addW) {
        return new Vector4f(this.naked$ + addX, this.current$ + addY, this.token$ + addZ, this.includes$ + addW);
    }

    public Vector4f _solomon(float addX, float addY, float addZ, float addW) {
        this.naked$ += addX;
        this.current$ += addY;
        this.token$ += addZ;
        this.includes$ += addW;
        return this;
    }

    public Vector4f _desired(float scalar, Vector4f add) {
        this.naked$ = this.naked$ * scalar + add.naked$;
        this.current$ = this.current$ * scalar + add.current$;
        this.token$ = this.token$ * scalar + add.token$;
        this.includes$ = this.includes$ * scalar + add.includes$;
        return this;
    }

    public Vector4f _marriott(float scalar, Vector4f mult, Vector4f add) {
        this.naked$ = mult.naked$ * scalar + add.naked$;
        this.current$ = mult.current$ * scalar + add.current$;
        this.token$ = mult.token$ * scalar + add.token$;
        this.includes$ = mult.includes$ * scalar + add.includes$;
        return this;
    }

    public float _spray(Vector4f vec) {
        if (null == vec) {
            podcasts$.warning("Provided vector is null, 0 returned.");
            return 0.0f;
        }
        return this.naked$ * vec.naked$ + this.current$ * vec.current$ + this.token$ * vec.token$ + this.includes$ * vec.includes$;
    }

    public Vector4f _cassette(Vector4f other) {
        float n = this._spray(other);
        float d2 = other._court();
        return new Vector4f(other)._scanners()._preview(n / d2);
    }

    public boolean _believed() {
        float len = this._funding();
        return 0.99f < len && len < 1.01f;
    }

    public float _funding() {
        return FastMath._runtime(this._court());
    }

    public float _court() {
        return this.naked$ * this.naked$ + this.current$ * this.current$ + this.token$ * this.token$ + this.includes$ * this.includes$;
    }

    public float _hidden(Vector4f v) {
        double dx = this.naked$ - v.naked$;
        double dy = this.current$ - v.current$;
        double dz = this.token$ - v.token$;
        double dw = this.includes$ - v.includes$;
        return (float)(dx * dx + dy * dy + dz * dz + dw * dw);
    }

    public float _singer(Vector4f v) {
        return FastMath._runtime(this._hidden(v));
    }

    public Vector4f _tubes(float scalar) {
        return new Vector4f(this.naked$ * scalar, this.current$ * scalar, this.token$ * scalar, this.includes$ * scalar);
    }

    public Vector4f _blocking(float scalar, Vector4f product) {
        if (null == product) {
            product = new Vector4f();
        }
        product.naked$ = this.naked$ * scalar;
        product.current$ = this.current$ * scalar;
        product.token$ = this.token$ * scalar;
        product.includes$ = this.includes$ * scalar;
        return product;
    }

    public Vector4f _preview(float scalar) {
        this.naked$ *= scalar;
        this.current$ *= scalar;
        this.token$ *= scalar;
        this.includes$ *= scalar;
        return this;
    }

    public Vector4f _texts(Vector4f vec) {
        if (null == vec) {
            podcasts$.warning("Provided vector is null, null returned.");
            return null;
        }
        this.naked$ *= vec.naked$;
        this.current$ *= vec.current$;
        this.token$ *= vec.token$;
        this.includes$ *= vec.includes$;
        return this;
    }

    public Vector4f _reach(float x, float y, float z, float w) {
        this.naked$ *= x;
        this.current$ *= y;
        this.token$ *= z;
        this.includes$ *= w;
        return this;
    }

    public Vector4f _andrea(Vector4f vec) {
        if (null == vec) {
            podcasts$.warning("Provided vector is null, null returned.");
            return null;
        }
        return this._wheels(vec, null);
    }

    public Vector4f _wheels(Vector4f vec, Vector4f store) {
        if (null == vec) {
            podcasts$.warning("Provided vector is null, null returned.");
            return null;
        }
        if (store == null) {
            store = new Vector4f();
        }
        return store._unless(this.naked$ * vec.naked$, this.current$ * vec.current$, this.token$ * vec.token$, this.includes$ * vec.includes$);
    }

    public Vector4f _truth(float scalar) {
        scalar = 1.0f / scalar;
        return new Vector4f(this.naked$ * scalar, this.current$ * scalar, this.token$ * scalar, this.includes$ * scalar);
    }

    public Vector4f _economic(float scalar) {
        scalar = 1.0f / scalar;
        this.naked$ *= scalar;
        this.current$ *= scalar;
        this.token$ *= scalar;
        this.includes$ *= scalar;
        return this;
    }

    public Vector4f _fifty(Vector4f scalar) {
        return new Vector4f(this.naked$ / scalar.naked$, this.current$ / scalar.current$, this.token$ / scalar.token$, this.includes$ / scalar.includes$);
    }

    public Vector4f _forming(Vector4f scalar) {
        this.naked$ /= scalar.naked$;
        this.current$ /= scalar.current$;
        this.token$ /= scalar.token$;
        this.includes$ /= scalar.includes$;
        return this;
    }

    public Vector4f _omega() {
        return new Vector4f(-this.naked$, -this.current$, -this.token$, -this.includes$);
    }

    public Vector4f _taylor() {
        this.naked$ = -this.naked$;
        this.current$ = -this.current$;
        this.token$ = -this.token$;
        this.includes$ = -this.includes$;
        return this;
    }

    public Vector4f _minutes(Vector4f vec) {
        return new Vector4f(this.naked$ - vec.naked$, this.current$ - vec.current$, this.token$ - vec.token$, this.includes$ - vec.includes$);
    }

    public Vector4f _header(Vector4f vec) {
        if (null == vec) {
            podcasts$.warning("Provided vector is null, null returned.");
            return null;
        }
        this.naked$ -= vec.naked$;
        this.current$ -= vec.current$;
        this.token$ -= vec.token$;
        this.includes$ -= vec.includes$;
        return this;
    }

    public Vector4f _abuse(Vector4f vec, Vector4f result) {
        if (result == null) {
            result = new Vector4f();
        }
        result.naked$ = this.naked$ - vec.naked$;
        result.current$ = this.current$ - vec.current$;
        result.token$ = this.token$ - vec.token$;
        result.includes$ = this.includes$ - vec.includes$;
        return result;
    }

    public Vector4f _cardiac(float subtractX, float subtractY, float subtractZ, float subtractW) {
        return new Vector4f(this.naked$ - subtractX, this.current$ - subtractY, this.token$ - subtractZ, this.includes$ - subtractW);
    }

    public Vector4f _manual(float subtractX, float subtractY, float subtractZ, float subtractW) {
        this.naked$ -= subtractX;
        this.current$ -= subtractY;
        this.token$ -= subtractZ;
        this.includes$ -= subtractW;
        return this;
    }

    public Vector4f _tsunami() {
        float length = this.naked$ * this.naked$ + this.current$ * this.current$ + this.token$ * this.token$ + this.includes$ * this.includes$;
        if (length != 1.0f && length != 0.0f) {
            length = 1.0f / FastMath._runtime(length);
            return new Vector4f(this.naked$ * length, this.current$ * length, this.token$ * length, this.includes$ * length);
        }
        return this._models();
    }

    public Vector4f _scanners() {
        float length = this.naked$ * this.naked$ + this.current$ * this.current$ + this.token$ * this.token$ + this.includes$ * this.includes$;
        if (length != 1.0f && length != 0.0f) {
            length = 1.0f / FastMath._runtime(length);
            this.naked$ *= length;
            this.current$ *= length;
            this.token$ *= length;
            this.includes$ *= length;
        }
        return this;
    }

    public Vector4f _colorado(Vector4f other) {
        this.naked$ = other.naked$ > this.naked$ ? other.naked$ : this.naked$;
        this.current$ = other.current$ > this.current$ ? other.current$ : this.current$;
        this.token$ = other.token$ > this.token$ ? other.token$ : this.token$;
        this.includes$ = other.includes$ > this.includes$ ? other.includes$ : this.includes$;
        return this;
    }

    public Vector4f _zambia(Vector4f other) {
        this.naked$ = other.naked$ < this.naked$ ? other.naked$ : this.naked$;
        this.current$ = other.current$ < this.current$ ? other.current$ : this.current$;
        this.token$ = other.token$ < this.token$ ? other.token$ : this.token$;
        this.includes$ = other.includes$ < this.includes$ ? other.includes$ : this.includes$;
        return this;
    }

    public Vector4f _thought() {
        this.includes$ = 0.0f;
        this.token$ = 0.0f;
        this.current$ = 0.0f;
        this.naked$ = 0.0f;
        return this;
    }

    public float _patrol(Vector4f otherVector) {
        float dotProduct = this._spray(otherVector);
        float angle = FastMath._coding(dotProduct);
        return angle;
    }

    public Vector4f _novelty(Vector4f finalVec, float changeAmnt) {
        this.naked$ = (1.0f - changeAmnt) * this.naked$ + changeAmnt * finalVec.naked$;
        this.current$ = (1.0f - changeAmnt) * this.current$ + changeAmnt * finalVec.current$;
        this.token$ = (1.0f - changeAmnt) * this.token$ + changeAmnt * finalVec.token$;
        this.includes$ = (1.0f - changeAmnt) * this.includes$ + changeAmnt * finalVec.includes$;
        return this;
    }

    public Vector4f _stamp(Vector4f beginVec, Vector4f finalVec, float changeAmnt) {
        this.naked$ = (1.0f - changeAmnt) * beginVec.naked$ + changeAmnt * finalVec.naked$;
        this.current$ = (1.0f - changeAmnt) * beginVec.current$ + changeAmnt * finalVec.current$;
        this.token$ = (1.0f - changeAmnt) * beginVec.token$ + changeAmnt * finalVec.token$;
        this.includes$ = (1.0f - changeAmnt) * beginVec.includes$ + changeAmnt * finalVec.includes$;
        return this;
    }

    public static boolean _federal(Vector4f vector) {
        if (vector == null) {
            return false;
        }
        if (Float.isNaN(vector.naked$) || Float.isNaN(vector.current$) || Float.isNaN(vector.token$) || Float.isNaN(vector.includes$)) {
            return false;
        }
        return !Float.isInfinite(vector.naked$) && !Float.isInfinite(vector.current$) && !Float.isInfinite(vector.token$) && !Float.isInfinite(vector.includes$);
    }

    public Vector4f _models() {
        try {
            return (Vector4f)super.clone();
        }
        catch (CloneNotSupportedException e2) {
            throw new AssertionError();
        }
    }

    public float[] _compete(float[] floats) {
        if (floats == null) {
            floats = new float[]{this.naked$, this.current$, this.token$, this.includes$};
        }
        return floats;
    }

    public Vector4f _narrow(float[] xyzw) {
        if (xyzw != null && xyzw.length > 3) {
            this.naked$ = xyzw[0];
            this.current$ = xyzw[1];
            this.token$ = xyzw[2];
            this.includes$ = xyzw[3];
        }
        return this;
    }

    public boolean equals(Object o) {
        if (!(o instanceof Vector4f)) {
            return false;
        }
        if (this == o) {
            return true;
        }
        Vector4f comp = (Vector4f)o;
        if (Float.compare(this.naked$, comp.naked$) != 0) {
            return false;
        }
        if (Float.compare(this.current$, comp.current$) != 0) {
            return false;
        }
        if (Float.compare(this.token$, comp.token$) != 0) {
            return false;
        }
        return Float.compare(this.includes$, comp.includes$) == 0;
    }

    public int hashCode() {
        int hash = 37;
        hash += 37 * hash + Float.floatToIntBits(this.naked$);
        hash += 37 * hash + Float.floatToIntBits(this.current$);
        hash += 37 * hash + Float.floatToIntBits(this.token$);
        hash += 37 * hash + Float.floatToIntBits(this.includes$);
        return hash;
    }

    public String toString() {
        return "(" + this.naked$ + ", " + this.current$ + ", " + this.token$ + ", " + this.includes$ + ")";
    }

    public float _planner() {
        return this.naked$;
    }

    public Vector4f _excluded(float x) {
        this.naked$ = x;
        return this;
    }

    public float _giving() {
        return this.current$;
    }

    public Vector4f _blink(float y) {
        this.current$ = y;
        return this;
    }

    public float _doing() {
        return this.token$;
    }

    public Vector4f _qualify(float z) {
        this.token$ = z;
        return this;
    }

    public float _weblog() {
        return this.includes$;
    }

    public Vector4f _mozilla(float w) {
        this.includes$ = w;
        return this;
    }

    public float _breed(int index) {
        switch (index) {
            case 0: {
                return this.naked$;
            }
            case 1: {
                return this.current$;
            }
            case 2: {
                return this.token$;
            }
            case 3: {
                return this.includes$;
            }
        }
        throw new IllegalArgumentException("index must be either 0, 1, 2 or 3");
    }

    public void _veterans(int index, float value) {
        switch (index) {
            case 0: {
                this.naked$ = value;
                return;
            }
            case 1: {
                this.current$ = value;
                return;
            }
            case 2: {
                this.token$ = value;
                return;
            }
            case 3: {
                this.includes$ = value;
                return;
            }
        }
        throw new IllegalArgumentException("index must be either 0, 1, 2 or 3");
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return this._models();
    }
}

