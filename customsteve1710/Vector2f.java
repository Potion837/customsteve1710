/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.logging.Logger;

public final class Vector2f {
    static final long worship$ = 1L;
    private static final Logger cheap$ = Logger.getLogger(Vector2f.class.getName());
    public static final Vector2f drawings$ = new Vector2f(0.0f, 0.0f);
    public static final Vector2f kills$ = new Vector2f(1.0f, 1.0f);
    public float removing$;
    public float writings$;

    public Vector2f(float x, float y) {
        this.removing$ = x;
        this.writings$ = y;
    }

    public Vector2f() {
        this.writings$ = 0.0f;
        this.removing$ = 0.0f;
    }

    public Vector2f(Vector2f vector2f) {
        this.removing$ = vector2f.removing$;
        this.writings$ = vector2f.writings$;
    }

    public Vector2f _deals(float x, float y) {
        this.removing$ = x;
        this.writings$ = y;
        return this;
    }

    public Vector2f _epson(Vector2f vec) {
        this.removing$ = vec.removing$;
        this.writings$ = vec.writings$;
        return this;
    }

    public Vector2f _shopping(Vector2f vec) {
        if (null == vec) {
            cheap$.warning("Provided vector is null, null returned.");
            return null;
        }
        return new Vector2f(this.removing$ + vec.removing$, this.writings$ + vec.writings$);
    }

    public Vector2f _finish(Vector2f vec) {
        if (null == vec) {
            cheap$.warning("Provided vector is null, null returned.");
            return null;
        }
        this.removing$ += vec.removing$;
        this.writings$ += vec.writings$;
        return this;
    }

    public Vector2f _victoria(float addX, float addY) {
        this.removing$ += addX;
        this.writings$ += addY;
        return this;
    }

    public Vector2f _wagon(Vector2f vec, Vector2f result) {
        if (null == vec) {
            cheap$.warning("Provided vector is null, null returned.");
            return null;
        }
        if (result == null) {
            result = new Vector2f();
        }
        result.removing$ = this.removing$ + vec.removing$;
        result.writings$ = this.writings$ + vec.writings$;
        return result;
    }

    public float _video(Vector2f vec) {
        if (null == vec) {
            cheap$.warning("Provided vector is null, 0 returned.");
            return 0.0f;
        }
        return this.removing$ * vec.removing$ + this.writings$ * vec.writings$;
    }

    public Vector3f _twiki(Vector2f v) {
        return new Vector3f(0.0f, 0.0f, this._adware(v));
    }

    public float _adware(Vector2f v) {
        return this.removing$ * v.writings$ - this.writings$ * v.removing$;
    }

    public Vector2f _strength(Vector2f finalVec, float changeAmnt) {
        this.removing$ = (1.0f - changeAmnt) * this.removing$ + changeAmnt * finalVec.removing$;
        this.writings$ = (1.0f - changeAmnt) * this.writings$ + changeAmnt * finalVec.writings$;
        return this;
    }

    public Vector2f _diverse(Vector2f beginVec, Vector2f finalVec, float changeAmnt) {
        this.removing$ = (1.0f - changeAmnt) * beginVec.removing$ + changeAmnt * finalVec.removing$;
        this.writings$ = (1.0f - changeAmnt) * beginVec.writings$ + changeAmnt * finalVec.writings$;
        return this;
    }

    public static boolean _richmond(Vector2f vector) {
        if (vector == null) {
            return false;
        }
        if (Float.isNaN(vector.removing$) || Float.isNaN(vector.writings$)) {
            return false;
        }
        return !Float.isInfinite(vector.removing$) && !Float.isInfinite(vector.writings$);
    }

    public float _deadline() {
        return FastMath._runtime(this._homeless());
    }

    public float _homeless() {
        return this.removing$ * this.removing$ + this.writings$ * this.writings$;
    }

    public float _morris(Vector2f v) {
        double dx = this.removing$ - v.removing$;
        double dy = this.writings$ - v.writings$;
        return (float)(dx * dx + dy * dy);
    }

    public float _elegant(float otherX, float otherY) {
        double dx = this.removing$ - otherX;
        double dy = this.writings$ - otherY;
        return (float)(dx * dx + dy * dy);
    }

    public float _cornell(Vector2f v) {
        return FastMath._runtime(this._morris(v));
    }

    public Vector2f _result(float scalar) {
        return new Vector2f(this.removing$ * scalar, this.writings$ * scalar);
    }

    public Vector2f _october(float scalar) {
        this.removing$ *= scalar;
        this.writings$ *= scalar;
        return this;
    }

    public Vector2f _allen(Vector2f vec) {
        if (null == vec) {
            cheap$.warning("Provided vector is null, null returned.");
            return null;
        }
        this.removing$ *= vec.removing$;
        this.writings$ *= vec.writings$;
        return this;
    }

    public Vector2f _exhaust(float scalar, Vector2f product) {
        if (null == product) {
            product = new Vector2f();
        }
        product.removing$ = this.removing$ * scalar;
        product.writings$ = this.writings$ * scalar;
        return product;
    }

    public Vector2f _string(float scalar) {
        return new Vector2f(this.removing$ / scalar, this.writings$ / scalar);
    }

    public Vector2f _ended(float scalar) {
        this.removing$ /= scalar;
        this.writings$ /= scalar;
        return this;
    }

    public Vector2f _entries() {
        return new Vector2f(-this.removing$, -this.writings$);
    }

    public Vector2f _presence() {
        this.removing$ = -this.removing$;
        this.writings$ = -this.writings$;
        return this;
    }

    public Vector2f _seeker(Vector2f vec) {
        return this._elliott(vec, null);
    }

    public Vector2f _elliott(Vector2f vec, Vector2f store) {
        if (store == null) {
            store = new Vector2f();
        }
        store.removing$ = this.removing$ - vec.removing$;
        store.writings$ = this.writings$ - vec.writings$;
        return store;
    }

    public Vector2f _bryan(float valX, float valY) {
        return new Vector2f(this.removing$ - valX, this.writings$ - valY);
    }

    public Vector2f _fraction(Vector2f vec) {
        if (null == vec) {
            cheap$.warning("Provided vector is null, null returned.");
            return null;
        }
        this.removing$ -= vec.removing$;
        this.writings$ -= vec.writings$;
        return this;
    }

    public Vector2f _planned(float valX, float valY) {
        this.removing$ -= valX;
        this.writings$ -= valY;
        return this;
    }

    public Vector2f _exhibit() {
        float length = this._deadline();
        if (length != 0.0f) {
            return this._string(length);
        }
        return this._string(1.0f);
    }

    public Vector2f _niagara() {
        float length = this._deadline();
        if (length != 0.0f) {
            return this._ended(length);
        }
        return this._ended(1.0f);
    }

    public float _washing(Vector2f otherVector) {
        float dotProduct = this._video(otherVector);
        float angle = FastMath._coding(dotProduct);
        return angle;
    }

    public float _export(Vector2f otherVector) {
        float angle = FastMath._brunette(otherVector.writings$, otherVector.removing$) - FastMath._brunette(this.writings$, this.removing$);
        return angle;
    }

    public float _passive() {
        return this.removing$;
    }

    public Vector2f _coupon(float x) {
        this.removing$ = x;
        return this;
    }

    public float _welfare() {
        return this.writings$;
    }

    public Vector2f _midnight(float y) {
        this.writings$ = y;
        return this;
    }

    public float _meyer() {
        return FastMath._brunette(this.writings$, this.removing$);
    }

    public Vector2f _sentence() {
        this.writings$ = 0.0f;
        this.removing$ = 0.0f;
        return this;
    }

    public int hashCode() {
        int hash = 37;
        hash += 37 * hash + Float.floatToIntBits(this.removing$);
        hash += 37 * hash + Float.floatToIntBits(this.writings$);
        return hash;
    }

    public Vector2f _charging() {
        try {
            return (Vector2f)super.clone();
        }
        catch (CloneNotSupportedException e2) {
            throw new AssertionError();
        }
    }

    public float[] _saves(float[] floats) {
        if (floats == null) {
            floats = new float[]{this.removing$, this.writings$};
        }
        return floats;
    }

    public boolean equals(Object o) {
        if (!(o instanceof Vector2f)) {
            return false;
        }
        if (this == o) {
            return true;
        }
        Vector2f comp = (Vector2f)o;
        if (Float.compare(this.removing$, comp.removing$) != 0) {
            return false;
        }
        return Float.compare(this.writings$, comp.writings$) == 0;
    }

    public String toString() {
        return "(" + this.removing$ + ", " + this.writings$ + ")";
    }

    public void _reviewer(ObjectInput in) throws IOException, ClassNotFoundException {
        this.removing$ = in.readFloat();
        this.writings$ = in.readFloat();
    }

    public void _insulin(ObjectOutput out) throws IOException {
        out.writeFloat(this.removing$);
        out.writeFloat(this.writings$);
    }

    public void _varied(float angle, boolean cw) {
        if (cw) {
            angle = -angle;
        }
        float newX = FastMath._country(angle) * this.removing$ - FastMath._booth(angle) * this.writings$;
        float newY = FastMath._booth(angle) * this.removing$ + FastMath._country(angle) * this.writings$;
        this.removing$ = newX;
        this.writings$ = newY;
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return this._charging();
    }
}

