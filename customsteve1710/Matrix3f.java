/*
 * Decompiled with CFR 0.152.
 */
import java.util.logging.Logger;

public final class Matrix3f {
    static final long suggests$ = 1L;
    private static final Logger stick$ = Logger.getLogger(Matrix3f.class.getName());
    protected float every$;
    protected float releases$;
    protected float hearts$;
    protected float clone$;
    protected float ultram$;
    protected float affect$;
    protected float customs$;
    protected float speakers$;
    protected float light$;
    public static final Matrix3f software$ = new Matrix3f(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
    public static final Matrix3f seconds$ = new Matrix3f();

    public Matrix3f() {
        this._suppose();
    }

    public Matrix3f(float m00, float m01, float m02, float m10, float m11, float m12, float m20, float m21, float m22) {
        this.every$ = m00;
        this.releases$ = m01;
        this.hearts$ = m02;
        this.clone$ = m10;
        this.ultram$ = m11;
        this.affect$ = m12;
        this.customs$ = m20;
        this.speakers$ = m21;
        this.light$ = m22;
    }

    public Matrix3f(Matrix3f mat) {
        this._brook(mat);
    }

    public void _outdoors() {
        this.every$ = FastMath._videos(this.every$);
        this.releases$ = FastMath._videos(this.releases$);
        this.hearts$ = FastMath._videos(this.hearts$);
        this.clone$ = FastMath._videos(this.clone$);
        this.ultram$ = FastMath._videos(this.ultram$);
        this.affect$ = FastMath._videos(this.affect$);
        this.customs$ = FastMath._videos(this.customs$);
        this.speakers$ = FastMath._videos(this.speakers$);
        this.light$ = FastMath._videos(this.light$);
    }

    public Matrix3f _brook(Matrix3f matrix) {
        if (null == matrix) {
            this._suppose();
        } else {
            this.every$ = matrix.every$;
            this.releases$ = matrix.releases$;
            this.hearts$ = matrix.hearts$;
            this.clone$ = matrix.clone$;
            this.ultram$ = matrix.ultram$;
            this.affect$ = matrix.affect$;
            this.customs$ = matrix.customs$;
            this.speakers$ = matrix.speakers$;
            this.light$ = matrix.light$;
        }
        return this;
    }

    public float _enjoyed(int i, int j) {
        switch (i) {
            case 0: {
                switch (j) {
                    case 0: {
                        return this.every$;
                    }
                    case 1: {
                        return this.releases$;
                    }
                    case 2: {
                        return this.hearts$;
                    }
                }
            }
            case 1: {
                switch (j) {
                    case 0: {
                        return this.clone$;
                    }
                    case 1: {
                        return this.ultram$;
                    }
                    case 2: {
                        return this.affect$;
                    }
                }
            }
            case 2: {
                switch (j) {
                    case 0: {
                        return this.customs$;
                    }
                    case 1: {
                        return this.speakers$;
                    }
                    case 2: {
                        return this.light$;
                    }
                }
            }
        }
        stick$.warning("Invalid matrix index.");
        throw new IllegalArgumentException("Invalid indices into matrix.");
    }

    public void _region(float[] data, boolean rowMajor) {
        if (data.length == 9) {
            if (rowMajor) {
                data[0] = this.every$;
                data[1] = this.releases$;
                data[2] = this.hearts$;
                data[3] = this.clone$;
                data[4] = this.ultram$;
                data[5] = this.affect$;
                data[6] = this.customs$;
                data[7] = this.speakers$;
                data[8] = this.light$;
            } else {
                data[0] = this.every$;
                data[1] = this.clone$;
                data[2] = this.customs$;
                data[3] = this.releases$;
                data[4] = this.ultram$;
                data[5] = this.speakers$;
                data[6] = this.hearts$;
                data[7] = this.affect$;
                data[8] = this.light$;
            }
        } else if (data.length == 16) {
            if (rowMajor) {
                data[0] = this.every$;
                data[1] = this.releases$;
                data[2] = this.hearts$;
                data[4] = this.clone$;
                data[5] = this.ultram$;
                data[6] = this.affect$;
                data[8] = this.customs$;
                data[9] = this.speakers$;
                data[10] = this.light$;
            } else {
                data[0] = this.every$;
                data[1] = this.clone$;
                data[2] = this.customs$;
                data[4] = this.releases$;
                data[5] = this.ultram$;
                data[6] = this.speakers$;
                data[8] = this.hearts$;
                data[9] = this.affect$;
                data[10] = this.light$;
            }
        } else {
            throw new IndexOutOfBoundsException("Array size must be 9 or 16 in Matrix3f.get().");
        }
    }

    public Matrix3f _theaters(Matrix3f store) {
        if (store == null) {
            store = new Matrix3f();
        }
        float mag = 1.0f / FastMath._runtime(this.every$ * this.every$ + this.clone$ * this.clone$ + this.customs$ * this.customs$);
        store.every$ = this.every$ * mag;
        store.clone$ = this.clone$ * mag;
        store.customs$ = this.customs$ * mag;
        mag = 1.0f / FastMath._runtime(this.releases$ * this.releases$ + this.ultram$ * this.ultram$ + this.speakers$ * this.speakers$);
        store.releases$ = this.releases$ * mag;
        store.ultram$ = this.ultram$ * mag;
        store.speakers$ = this.speakers$ * mag;
        store.hearts$ = store.clone$ * store.speakers$ - store.ultram$ * store.customs$;
        store.affect$ = store.releases$ * store.customs$ - store.every$ * store.speakers$;
        store.light$ = store.every$ * store.ultram$ - store.releases$ * store.clone$;
        return store;
    }

    public Matrix3f _factory() {
        return this._theaters(this);
    }

    public Vector3f _donna(int i) {
        return this._selected(i, null);
    }

    public Vector3f _selected(int i, Vector3f store) {
        if (store == null) {
            store = new Vector3f();
        }
        switch (i) {
            case 0: {
                store.serves$ = this.every$;
                store.genius$ = this.clone$;
                store.superb$ = this.customs$;
                break;
            }
            case 1: {
                store.serves$ = this.releases$;
                store.genius$ = this.ultram$;
                store.superb$ = this.speakers$;
                break;
            }
            case 2: {
                store.serves$ = this.hearts$;
                store.genius$ = this.affect$;
                store.superb$ = this.light$;
                break;
            }
            default: {
                stick$.warning("Invalid column index.");
                throw new IllegalArgumentException("Invalid column index. " + i);
            }
        }
        return store;
    }

    public Vector3f _copper(int i) {
        return this._position(i, null);
    }

    public Vector3f _position(int i, Vector3f store) {
        if (store == null) {
            store = new Vector3f();
        }
        switch (i) {
            case 0: {
                store.serves$ = this.every$;
                store.genius$ = this.releases$;
                store.superb$ = this.hearts$;
                break;
            }
            case 1: {
                store.serves$ = this.clone$;
                store.genius$ = this.ultram$;
                store.superb$ = this.affect$;
                break;
            }
            case 2: {
                store.serves$ = this.customs$;
                store.genius$ = this.speakers$;
                store.superb$ = this.light$;
                break;
            }
            default: {
                stick$.warning("Invalid row index.");
                throw new IllegalArgumentException("Invalid row index. " + i);
            }
        }
        return store;
    }

    public void _columbus(float[] f2, boolean columnMajor) {
        if (columnMajor) {
            f2[0] = this.every$;
            f2[1] = this.clone$;
            f2[2] = this.customs$;
            f2[3] = this.releases$;
            f2[4] = this.ultram$;
            f2[5] = this.speakers$;
            f2[6] = this.hearts$;
            f2[7] = this.affect$;
            f2[8] = this.light$;
        } else {
            f2[0] = this.every$;
            f2[1] = this.releases$;
            f2[2] = this.hearts$;
            f2[3] = this.clone$;
            f2[4] = this.ultram$;
            f2[5] = this.affect$;
            f2[6] = this.customs$;
            f2[7] = this.speakers$;
            f2[8] = this.light$;
        }
    }

    public Matrix3f _differ(int i, Vector3f column) {
        if (column == null) {
            stick$.warning("Column is null. Ignoring.");
            return this;
        }
        switch (i) {
            case 0: {
                this.every$ = column.serves$;
                this.clone$ = column.genius$;
                this.customs$ = column.superb$;
                break;
            }
            case 1: {
                this.releases$ = column.serves$;
                this.ultram$ = column.genius$;
                this.speakers$ = column.superb$;
                break;
            }
            case 2: {
                this.hearts$ = column.serves$;
                this.affect$ = column.genius$;
                this.light$ = column.superb$;
                break;
            }
            default: {
                stick$.warning("Invalid column index.");
                throw new IllegalArgumentException("Invalid column index. " + i);
            }
        }
        return this;
    }

    public Matrix3f _alaska(int i, Vector3f row) {
        if (row == null) {
            stick$.warning("Row is null. Ignoring.");
            return this;
        }
        switch (i) {
            case 0: {
                this.every$ = row.serves$;
                this.releases$ = row.genius$;
                this.hearts$ = row.superb$;
                break;
            }
            case 1: {
                this.clone$ = row.serves$;
                this.ultram$ = row.genius$;
                this.affect$ = row.superb$;
                break;
            }
            case 2: {
                this.customs$ = row.serves$;
                this.speakers$ = row.genius$;
                this.light$ = row.superb$;
                break;
            }
            default: {
                stick$.warning("Invalid row index.");
                throw new IllegalArgumentException("Invalid row index. " + i);
            }
        }
        return this;
    }

    public Matrix3f _patches(int i, int j, float value) {
        switch (i) {
            case 0: {
                switch (j) {
                    case 0: {
                        this.every$ = value;
                        return this;
                    }
                    case 1: {
                        this.releases$ = value;
                        return this;
                    }
                    case 2: {
                        this.hearts$ = value;
                        return this;
                    }
                }
            }
            case 1: {
                switch (j) {
                    case 0: {
                        this.clone$ = value;
                        return this;
                    }
                    case 1: {
                        this.ultram$ = value;
                        return this;
                    }
                    case 2: {
                        this.affect$ = value;
                        return this;
                    }
                }
            }
            case 2: {
                switch (j) {
                    case 0: {
                        this.customs$ = value;
                        return this;
                    }
                    case 1: {
                        this.speakers$ = value;
                        return this;
                    }
                    case 2: {
                        this.light$ = value;
                        return this;
                    }
                }
            }
        }
        stick$.warning("Invalid matrix index.");
        throw new IllegalArgumentException("Invalid indices into matrix.");
    }

    public Matrix3f _swiss(float[][] matrix) {
        if (matrix.length != 3 || matrix[0].length != 3) {
            throw new IllegalArgumentException("Array must be of size 9.");
        }
        this.every$ = matrix[0][0];
        this.releases$ = matrix[0][1];
        this.hearts$ = matrix[0][2];
        this.clone$ = matrix[1][0];
        this.ultram$ = matrix[1][1];
        this.affect$ = matrix[1][2];
        this.customs$ = matrix[2][0];
        this.speakers$ = matrix[2][1];
        this.light$ = matrix[2][2];
        return this;
    }

    public void _perfect(Vector3f uAxis, Vector3f vAxis, Vector3f wAxis) {
        this.every$ = uAxis.serves$;
        this.clone$ = uAxis.genius$;
        this.customs$ = uAxis.superb$;
        this.releases$ = vAxis.serves$;
        this.ultram$ = vAxis.genius$;
        this.speakers$ = vAxis.superb$;
        this.hearts$ = wAxis.serves$;
        this.affect$ = wAxis.genius$;
        this.light$ = wAxis.superb$;
    }

    public Matrix3f _bidding(float[] matrix) {
        return this._someone(matrix, true);
    }

    public Matrix3f _someone(float[] matrix, boolean rowMajor) {
        if (matrix.length != 9) {
            throw new IllegalArgumentException("Array must be of size 9.");
        }
        if (rowMajor) {
            this.every$ = matrix[0];
            this.releases$ = matrix[1];
            this.hearts$ = matrix[2];
            this.clone$ = matrix[3];
            this.ultram$ = matrix[4];
            this.affect$ = matrix[5];
            this.customs$ = matrix[6];
            this.speakers$ = matrix[7];
            this.light$ = matrix[8];
        } else {
            this.every$ = matrix[0];
            this.releases$ = matrix[3];
            this.hearts$ = matrix[6];
            this.clone$ = matrix[1];
            this.ultram$ = matrix[4];
            this.affect$ = matrix[7];
            this.customs$ = matrix[2];
            this.speakers$ = matrix[5];
            this.light$ = matrix[8];
        }
        return this;
    }

    public Matrix3f _bingo(Quaternion quaternion) {
        return quaternion._agenda(this);
    }

    public void _suppose() {
        this.speakers$ = 0.0f;
        this.customs$ = 0.0f;
        this.affect$ = 0.0f;
        this.clone$ = 0.0f;
        this.hearts$ = 0.0f;
        this.releases$ = 0.0f;
        this.light$ = 1.0f;
        this.ultram$ = 1.0f;
        this.every$ = 1.0f;
    }

    public boolean _sellers() {
        return this.every$ == 1.0f && this.releases$ == 0.0f && this.hearts$ == 0.0f && this.clone$ == 0.0f && this.ultram$ == 1.0f && this.affect$ == 0.0f && this.customs$ == 0.0f && this.speakers$ == 0.0f && this.light$ == 1.0f;
    }

    public void _barrier(float angle, Vector3f axis) {
        Vector3f normAxis = axis._mixer();
        this._potato(angle, normAxis);
    }

    public void _potato(float angle, Vector3f axis) {
        float fCos = FastMath._country(angle);
        float fSin = FastMath._booth(angle);
        float fOneMinusCos = 1.0f - fCos;
        float fX2 = axis.serves$ * axis.serves$;
        float fY2 = axis.genius$ * axis.genius$;
        float fZ2 = axis.superb$ * axis.superb$;
        float fXYM = axis.serves$ * axis.genius$ * fOneMinusCos;
        float fXZM = axis.serves$ * axis.superb$ * fOneMinusCos;
        float fYZM = axis.genius$ * axis.superb$ * fOneMinusCos;
        float fXSin = axis.serves$ * fSin;
        float fYSin = axis.genius$ * fSin;
        float fZSin = axis.superb$ * fSin;
        this.every$ = fX2 * fOneMinusCos + fCos;
        this.releases$ = fXYM - fZSin;
        this.hearts$ = fXZM + fYSin;
        this.clone$ = fXYM + fZSin;
        this.ultram$ = fY2 * fOneMinusCos + fCos;
        this.affect$ = fYZM - fXSin;
        this.customs$ = fXZM - fYSin;
        this.speakers$ = fYZM + fXSin;
        this.light$ = fZ2 * fOneMinusCos + fCos;
    }

    public Matrix3f _prince(Matrix3f mat) {
        return this._treasure(mat, null);
    }

    public Matrix3f _treasure(Matrix3f mat, Matrix3f product) {
        if (product == null) {
            product = new Matrix3f();
        }
        float temp00 = this.every$ * mat.every$ + this.releases$ * mat.clone$ + this.hearts$ * mat.customs$;
        float temp01 = this.every$ * mat.releases$ + this.releases$ * mat.ultram$ + this.hearts$ * mat.speakers$;
        float temp02 = this.every$ * mat.hearts$ + this.releases$ * mat.affect$ + this.hearts$ * mat.light$;
        float temp10 = this.clone$ * mat.every$ + this.ultram$ * mat.clone$ + this.affect$ * mat.customs$;
        float temp11 = this.clone$ * mat.releases$ + this.ultram$ * mat.ultram$ + this.affect$ * mat.speakers$;
        float temp12 = this.clone$ * mat.hearts$ + this.ultram$ * mat.affect$ + this.affect$ * mat.light$;
        float temp20 = this.customs$ * mat.every$ + this.speakers$ * mat.clone$ + this.light$ * mat.customs$;
        float temp21 = this.customs$ * mat.releases$ + this.speakers$ * mat.ultram$ + this.light$ * mat.speakers$;
        float temp22 = this.customs$ * mat.hearts$ + this.speakers$ * mat.affect$ + this.light$ * mat.light$;
        product.every$ = temp00;
        product.releases$ = temp01;
        product.hearts$ = temp02;
        product.clone$ = temp10;
        product.ultram$ = temp11;
        product.affect$ = temp12;
        product.customs$ = temp20;
        product.speakers$ = temp21;
        product.light$ = temp22;
        return product;
    }

    public Vector3f _central(Vector3f vec) {
        return this._counsel(vec, null);
    }

    public Vector3f _counsel(Vector3f vec, Vector3f product) {
        if (null == product) {
            product = new Vector3f();
        }
        float x = vec.serves$;
        float y = vec.genius$;
        float z = vec.superb$;
        product.serves$ = this.every$ * x + this.releases$ * y + this.hearts$ * z;
        product.genius$ = this.clone$ * x + this.ultram$ * y + this.affect$ * z;
        product.superb$ = this.customs$ * x + this.speakers$ * y + this.light$ * z;
        return product;
    }

    public Matrix3f _capital(float scale) {
        this.every$ *= scale;
        this.releases$ *= scale;
        this.hearts$ *= scale;
        this.clone$ *= scale;
        this.ultram$ *= scale;
        this.affect$ *= scale;
        this.customs$ *= scale;
        this.speakers$ *= scale;
        this.light$ *= scale;
        return this;
    }

    public Vector3f _grand(Vector3f vec) {
        if (vec == null) {
            return null;
        }
        float x = vec.serves$;
        float y = vec.genius$;
        vec.serves$ = this.every$ * x + this.releases$ * y + this.hearts$ * vec.superb$;
        vec.genius$ = this.clone$ * x + this.ultram$ * y + this.affect$ * vec.superb$;
        vec.superb$ = this.customs$ * x + this.speakers$ * y + this.light$ * vec.superb$;
        return vec;
    }

    public Matrix3f _skiing(Matrix3f mat) {
        return this._treasure(mat, this);
    }

    public Matrix3f _craps() {
        float tmp = this.releases$;
        this.releases$ = this.clone$;
        this.clone$ = tmp;
        tmp = this.hearts$;
        this.hearts$ = this.customs$;
        this.customs$ = tmp;
        tmp = this.affect$;
        this.affect$ = this.speakers$;
        this.speakers$ = tmp;
        return this;
    }

    public Matrix3f _cruises() {
        return this._luther(null);
    }

    public Matrix3f _luther(Matrix3f store) {
        float det;
        if (store == null) {
            store = new Matrix3f();
        }
        if (FastMath._videos(det = this._romania()) <= 1.1920929E-7f) {
            return store._defense();
        }
        store.every$ = this.ultram$ * this.light$ - this.affect$ * this.speakers$;
        store.releases$ = this.hearts$ * this.speakers$ - this.releases$ * this.light$;
        store.hearts$ = this.releases$ * this.affect$ - this.hearts$ * this.ultram$;
        store.clone$ = this.affect$ * this.customs$ - this.clone$ * this.light$;
        store.ultram$ = this.every$ * this.light$ - this.hearts$ * this.customs$;
        store.affect$ = this.hearts$ * this.clone$ - this.every$ * this.affect$;
        store.customs$ = this.clone$ * this.speakers$ - this.ultram$ * this.customs$;
        store.speakers$ = this.releases$ * this.customs$ - this.every$ * this.speakers$;
        store.light$ = this.every$ * this.ultram$ - this.releases$ * this.clone$;
        store._capital(1.0f / det);
        return store;
    }

    public Matrix3f _seeking() {
        float det = this._romania();
        if (FastMath._videos(det) <= 0.0f) {
            return this._defense();
        }
        float f00 = this.ultram$ * this.light$ - this.affect$ * this.speakers$;
        float f01 = this.hearts$ * this.speakers$ - this.releases$ * this.light$;
        float f02 = this.releases$ * this.affect$ - this.hearts$ * this.ultram$;
        float f10 = this.affect$ * this.customs$ - this.clone$ * this.light$;
        float f11 = this.every$ * this.light$ - this.hearts$ * this.customs$;
        float f12 = this.hearts$ * this.clone$ - this.every$ * this.affect$;
        float f20 = this.clone$ * this.speakers$ - this.ultram$ * this.customs$;
        float f21 = this.releases$ * this.customs$ - this.every$ * this.speakers$;
        float f22 = this.every$ * this.ultram$ - this.releases$ * this.clone$;
        this.every$ = f00;
        this.releases$ = f01;
        this.hearts$ = f02;
        this.clone$ = f10;
        this.ultram$ = f11;
        this.affect$ = f12;
        this.customs$ = f20;
        this.speakers$ = f21;
        this.light$ = f22;
        this._capital(1.0f / det);
        return this;
    }

    public Matrix3f _postage() {
        return this._reliable(null);
    }

    public Matrix3f _reliable(Matrix3f store) {
        if (store == null) {
            store = new Matrix3f();
        }
        store.every$ = this.ultram$ * this.light$ - this.affect$ * this.speakers$;
        store.releases$ = this.hearts$ * this.speakers$ - this.releases$ * this.light$;
        store.hearts$ = this.releases$ * this.affect$ - this.hearts$ * this.ultram$;
        store.clone$ = this.affect$ * this.customs$ - this.clone$ * this.light$;
        store.ultram$ = this.every$ * this.light$ - this.hearts$ * this.customs$;
        store.affect$ = this.hearts$ * this.clone$ - this.every$ * this.affect$;
        store.customs$ = this.clone$ * this.speakers$ - this.ultram$ * this.customs$;
        store.speakers$ = this.releases$ * this.customs$ - this.every$ * this.speakers$;
        store.light$ = this.every$ * this.ultram$ - this.releases$ * this.clone$;
        return store;
    }

    public float _romania() {
        float fCo00 = this.ultram$ * this.light$ - this.affect$ * this.speakers$;
        float fCo10 = this.affect$ * this.customs$ - this.clone$ * this.light$;
        float fCo20 = this.clone$ * this.speakers$ - this.ultram$ * this.customs$;
        float fDet = this.every$ * fCo00 + this.releases$ * fCo10 + this.hearts$ * fCo20;
        return fDet;
    }

    public Matrix3f _defense() {
        this.light$ = 0.0f;
        this.speakers$ = 0.0f;
        this.customs$ = 0.0f;
        this.affect$ = 0.0f;
        this.ultram$ = 0.0f;
        this.clone$ = 0.0f;
        this.hearts$ = 0.0f;
        this.releases$ = 0.0f;
        this.every$ = 0.0f;
        return this;
    }

    public Matrix3f _south() {
        return this._craps();
    }

    public Matrix3f _google() {
        Matrix3f ret = new Matrix3f(this.every$, this.clone$, this.customs$, this.releases$, this.ultram$, this.speakers$, this.hearts$, this.affect$, this.light$);
        return ret;
    }

    public String toString() {
        StringBuilder result = new StringBuilder("Matrix3f\n[\n");
        result.append(" ");
        result.append(this.every$);
        result.append("  ");
        result.append(this.releases$);
        result.append("  ");
        result.append(this.hearts$);
        result.append(" \n");
        result.append(" ");
        result.append(this.clone$);
        result.append("  ");
        result.append(this.ultram$);
        result.append("  ");
        result.append(this.affect$);
        result.append(" \n");
        result.append(" ");
        result.append(this.customs$);
        result.append("  ");
        result.append(this.speakers$);
        result.append("  ");
        result.append(this.light$);
        result.append(" \n]");
        return result.toString();
    }

    public int hashCode() {
        int hash = 37;
        hash = 37 * hash + Float.floatToIntBits(this.every$);
        hash = 37 * hash + Float.floatToIntBits(this.releases$);
        hash = 37 * hash + Float.floatToIntBits(this.hearts$);
        hash = 37 * hash + Float.floatToIntBits(this.clone$);
        hash = 37 * hash + Float.floatToIntBits(this.ultram$);
        hash = 37 * hash + Float.floatToIntBits(this.affect$);
        hash = 37 * hash + Float.floatToIntBits(this.customs$);
        hash = 37 * hash + Float.floatToIntBits(this.speakers$);
        hash = 37 * hash + Float.floatToIntBits(this.light$);
        return hash;
    }

    public boolean equals(Object o) {
        if (!(o instanceof Matrix3f) || o == null) {
            return false;
        }
        if (this == o) {
            return true;
        }
        Matrix3f comp = (Matrix3f)o;
        if (Float.compare(this.every$, comp.every$) != 0) {
            return false;
        }
        if (Float.compare(this.releases$, comp.releases$) != 0) {
            return false;
        }
        if (Float.compare(this.hearts$, comp.hearts$) != 0) {
            return false;
        }
        if (Float.compare(this.clone$, comp.clone$) != 0) {
            return false;
        }
        if (Float.compare(this.ultram$, comp.ultram$) != 0) {
            return false;
        }
        if (Float.compare(this.affect$, comp.affect$) != 0) {
            return false;
        }
        if (Float.compare(this.customs$, comp.customs$) != 0) {
            return false;
        }
        if (Float.compare(this.speakers$, comp.speakers$) != 0) {
            return false;
        }
        return Float.compare(this.light$, comp.light$) == 0;
    }

    public void _forced(Vector3f start, Vector3f end) {
        float f2;
        Vector3f v = new Vector3f();
        start._hartford(end, v);
        float e2 = start._client(end);
        float f3 = f2 = e2 < 0.0f ? -e2 : e2;
        if (f2 > 0.9999f) {
            Vector3f u = new Vector3f();
            Vector3f x = new Vector3f();
            x.serves$ = (double)start.serves$ > 0.0 ? start.serves$ : -start.serves$;
            x.genius$ = (double)start.genius$ > 0.0 ? start.genius$ : -start.genius$;
            float f4 = x.superb$ = (double)start.superb$ > 0.0 ? start.superb$ : -start.superb$;
            if (x.serves$ < x.genius$) {
                if (x.serves$ < x.superb$) {
                    x.serves$ = 1.0f;
                    x.superb$ = 0.0f;
                    x.genius$ = 0.0f;
                } else {
                    x.superb$ = 1.0f;
                    x.genius$ = 0.0f;
                    x.serves$ = 0.0f;
                }
            } else if (x.genius$ < x.superb$) {
                x.genius$ = 1.0f;
                x.superb$ = 0.0f;
                x.serves$ = 0.0f;
            } else {
                x.superb$ = 1.0f;
                x.genius$ = 0.0f;
                x.serves$ = 0.0f;
            }
            u.serves$ = x.serves$ - start.serves$;
            u.genius$ = x.genius$ - start.genius$;
            u.superb$ = x.superb$ - start.superb$;
            v.serves$ = x.serves$ - end.serves$;
            v.genius$ = x.genius$ - end.genius$;
            v.superb$ = x.superb$ - end.superb$;
            float c1 = 2.0f / u._client(u);
            float c2 = 2.0f / v._client(v);
            float c3 = c1 * c2 * u._client(v);
            for (int i = 0; i < 3; ++i) {
                float val;
                for (int j = 0; j < 3; ++j) {
                    val = -c1 * u._judge(i) * u._judge(j) - c2 * v._judge(i) * v._judge(j) + c3 * v._judge(i) * u._judge(j);
                    this._patches(i, j, val);
                }
                val = this._enjoyed(i, i);
                this._patches(i, i, val + 1.0f);
            }
        } else {
            float h = 1.0f / (1.0f + e2);
            float hvx = h * v.serves$;
            float hvz = h * v.superb$;
            float hvxy = hvx * v.genius$;
            float hvxz = hvx * v.superb$;
            float hvyz = hvz * v.genius$;
            this._patches(0, 0, e2 + hvx * v.serves$);
            this._patches(0, 1, hvxy - v.superb$);
            this._patches(0, 2, hvxz + v.genius$);
            this._patches(1, 0, hvxy + v.superb$);
            this._patches(1, 1, e2 + h * v.genius$ * v.genius$);
            this._patches(1, 2, hvyz - v.serves$);
            this._patches(2, 0, hvxz - v.genius$);
            this._patches(2, 1, hvyz + v.serves$);
            this._patches(2, 2, e2 + hvz * v.superb$);
        }
    }

    public void _playlist(Vector3f scale) {
        this.every$ *= scale.serves$;
        this.clone$ *= scale.serves$;
        this.customs$ *= scale.serves$;
        this.releases$ *= scale.genius$;
        this.ultram$ *= scale.genius$;
        this.speakers$ *= scale.genius$;
        this.hearts$ *= scale.superb$;
        this.affect$ *= scale.superb$;
        this.light$ *= scale.superb$;
    }

    static boolean _asbestos(Matrix3f mat) {
        if ((double)Math.abs(mat.every$ - 1.0f) > 1.0E-4) {
            return false;
        }
        if ((double)Math.abs(mat.ultram$ - 1.0f) > 1.0E-4) {
            return false;
        }
        if ((double)Math.abs(mat.light$ - 1.0f) > 1.0E-4) {
            return false;
        }
        if ((double)Math.abs(mat.releases$) > 1.0E-4) {
            return false;
        }
        if ((double)Math.abs(mat.hearts$) > 1.0E-4) {
            return false;
        }
        if ((double)Math.abs(mat.clone$) > 1.0E-4) {
            return false;
        }
        if ((double)Math.abs(mat.affect$) > 1.0E-4) {
            return false;
        }
        if ((double)Math.abs(mat.customs$) > 1.0E-4) {
            return false;
        }
        return !((double)Math.abs(mat.speakers$) > 1.0E-4);
    }

    public Matrix3f _attended() {
        try {
            return (Matrix3f)super.clone();
        }
        catch (CloneNotSupportedException e2) {
            throw new AssertionError();
        }
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return this._attended();
    }
}

