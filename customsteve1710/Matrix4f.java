/*
 * Decompiled with CFR 0.152.
 */
import java.nio.FloatBuffer;
import java.util.logging.Logger;

public final class Matrix4f {
    static final long pictures$ = 1L;
    private static final Logger approve$ = Logger.getLogger(Matrix4f.class.getName());
    public float oriented$;
    public float quality$;
    public float sugar$;
    public float beaches$;
    public float wages$;
    public float ivory$;
    public float truly$;
    public float registry$;
    public float lopez$;
    public float harold$;
    public float boston$;
    public float stated$;
    public float content$;
    public float schedule$;
    public float hilton$;
    public float methods$;
    public static final Matrix4f grows$ = new Matrix4f(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
    public static final Matrix4f croatia$ = new Matrix4f();

    public Matrix4f() {
        this._bikes();
    }

    public Matrix4f(float m00, float m01, float m02, float m03, float m10, float m11, float m12, float m13, float m20, float m21, float m22, float m23, float m30, float m31, float m32, float m33) {
        this.oriented$ = m00;
        this.quality$ = m01;
        this.sugar$ = m02;
        this.beaches$ = m03;
        this.wages$ = m10;
        this.ivory$ = m11;
        this.truly$ = m12;
        this.registry$ = m13;
        this.lopez$ = m20;
        this.harold$ = m21;
        this.boston$ = m22;
        this.stated$ = m23;
        this.content$ = m30;
        this.schedule$ = m31;
        this.hilton$ = m32;
        this.methods$ = m33;
    }

    public Matrix4f(float[] array) {
        this._logitech(array, false);
    }

    public Matrix4f(Matrix4f mat) {
        this._drainage(mat);
    }

    public void _drainage(Matrix4f matrix) {
        if (null == matrix) {
            this._bikes();
        } else {
            this.oriented$ = matrix.oriented$;
            this.quality$ = matrix.quality$;
            this.sugar$ = matrix.sugar$;
            this.beaches$ = matrix.beaches$;
            this.wages$ = matrix.wages$;
            this.ivory$ = matrix.ivory$;
            this.truly$ = matrix.truly$;
            this.registry$ = matrix.registry$;
            this.lopez$ = matrix.lopez$;
            this.harold$ = matrix.harold$;
            this.boston$ = matrix.boston$;
            this.stated$ = matrix.stated$;
            this.content$ = matrix.content$;
            this.schedule$ = matrix.schedule$;
            this.hilton$ = matrix.hilton$;
            this.methods$ = matrix.methods$;
        }
    }

    public void _senegal(float[] matrix) {
        this._manager(matrix, true);
    }

    public float[] _ghost() {
        float[] f2 = new float[16];
        this._manager(f2, false);
        return f2;
    }

    public void _manager(float[] matrix, boolean rowMajor) {
        if (matrix.length != 16) {
            throw new IllegalArgumentException("Array must be of size 16.");
        }
        if (rowMajor) {
            matrix[0] = this.oriented$;
            matrix[1] = this.quality$;
            matrix[2] = this.sugar$;
            matrix[3] = this.beaches$;
            matrix[4] = this.wages$;
            matrix[5] = this.ivory$;
            matrix[6] = this.truly$;
            matrix[7] = this.registry$;
            matrix[8] = this.lopez$;
            matrix[9] = this.harold$;
            matrix[10] = this.boston$;
            matrix[11] = this.stated$;
            matrix[12] = this.content$;
            matrix[13] = this.schedule$;
            matrix[14] = this.hilton$;
            matrix[15] = this.methods$;
        } else {
            matrix[0] = this.oriented$;
            matrix[4] = this.quality$;
            matrix[8] = this.sugar$;
            matrix[12] = this.beaches$;
            matrix[1] = this.wages$;
            matrix[5] = this.ivory$;
            matrix[9] = this.truly$;
            matrix[13] = this.registry$;
            matrix[2] = this.lopez$;
            matrix[6] = this.harold$;
            matrix[10] = this.boston$;
            matrix[14] = this.stated$;
            matrix[3] = this.content$;
            matrix[7] = this.schedule$;
            matrix[11] = this.hilton$;
            matrix[15] = this.methods$;
        }
    }

    public float _organic(int i, int j) {
        switch (i) {
            case 0: {
                switch (j) {
                    case 0: {
                        return this.oriented$;
                    }
                    case 1: {
                        return this.quality$;
                    }
                    case 2: {
                        return this.sugar$;
                    }
                    case 3: {
                        return this.beaches$;
                    }
                }
            }
            case 1: {
                switch (j) {
                    case 0: {
                        return this.wages$;
                    }
                    case 1: {
                        return this.ivory$;
                    }
                    case 2: {
                        return this.truly$;
                    }
                    case 3: {
                        return this.registry$;
                    }
                }
            }
            case 2: {
                switch (j) {
                    case 0: {
                        return this.lopez$;
                    }
                    case 1: {
                        return this.harold$;
                    }
                    case 2: {
                        return this.boston$;
                    }
                    case 3: {
                        return this.stated$;
                    }
                }
            }
            case 3: {
                switch (j) {
                    case 0: {
                        return this.content$;
                    }
                    case 1: {
                        return this.schedule$;
                    }
                    case 2: {
                        return this.hilton$;
                    }
                    case 3: {
                        return this.methods$;
                    }
                }
            }
        }
        approve$.warning("Invalid matrix index.");
        throw new IllegalArgumentException("Invalid indices into matrix.");
    }

    public float[] _billy(int i) {
        return this._serious(i, null);
    }

    public float[] _serious(int i, float[] store) {
        if (store == null) {
            store = new float[4];
        }
        switch (i) {
            case 0: {
                store[0] = this.oriented$;
                store[1] = this.wages$;
                store[2] = this.lopez$;
                store[3] = this.content$;
                break;
            }
            case 1: {
                store[0] = this.quality$;
                store[1] = this.ivory$;
                store[2] = this.harold$;
                store[3] = this.schedule$;
                break;
            }
            case 2: {
                store[0] = this.sugar$;
                store[1] = this.truly$;
                store[2] = this.boston$;
                store[3] = this.hilton$;
                break;
            }
            case 3: {
                store[0] = this.beaches$;
                store[1] = this.registry$;
                store[2] = this.stated$;
                store[3] = this.methods$;
                break;
            }
            default: {
                approve$.warning("Invalid column index.");
                throw new IllegalArgumentException("Invalid column index. " + i);
            }
        }
        return store;
    }

    public void _apollo(int i, float[] column) {
        if (column == null) {
            approve$.warning("Column is null. Ignoring.");
            return;
        }
        switch (i) {
            case 0: {
                this.oriented$ = column[0];
                this.wages$ = column[1];
                this.lopez$ = column[2];
                this.content$ = column[3];
                break;
            }
            case 1: {
                this.quality$ = column[0];
                this.ivory$ = column[1];
                this.harold$ = column[2];
                this.schedule$ = column[3];
                break;
            }
            case 2: {
                this.sugar$ = column[0];
                this.truly$ = column[1];
                this.boston$ = column[2];
                this.hilton$ = column[3];
                break;
            }
            case 3: {
                this.beaches$ = column[0];
                this.registry$ = column[1];
                this.stated$ = column[2];
                this.methods$ = column[3];
                break;
            }
            default: {
                approve$.warning("Invalid column index.");
                throw new IllegalArgumentException("Invalid column index. " + i);
            }
        }
    }

    public void _editor(int i, int j, float value) {
        switch (i) {
            case 0: {
                switch (j) {
                    case 0: {
                        this.oriented$ = value;
                        return;
                    }
                    case 1: {
                        this.quality$ = value;
                        return;
                    }
                    case 2: {
                        this.sugar$ = value;
                        return;
                    }
                    case 3: {
                        this.beaches$ = value;
                        return;
                    }
                }
            }
            case 1: {
                switch (j) {
                    case 0: {
                        this.wages$ = value;
                        return;
                    }
                    case 1: {
                        this.ivory$ = value;
                        return;
                    }
                    case 2: {
                        this.truly$ = value;
                        return;
                    }
                    case 3: {
                        this.registry$ = value;
                        return;
                    }
                }
            }
            case 2: {
                switch (j) {
                    case 0: {
                        this.lopez$ = value;
                        return;
                    }
                    case 1: {
                        this.harold$ = value;
                        return;
                    }
                    case 2: {
                        this.boston$ = value;
                        return;
                    }
                    case 3: {
                        this.stated$ = value;
                        return;
                    }
                }
            }
            case 3: {
                switch (j) {
                    case 0: {
                        this.content$ = value;
                        return;
                    }
                    case 1: {
                        this.schedule$ = value;
                        return;
                    }
                    case 2: {
                        this.hilton$ = value;
                        return;
                    }
                    case 3: {
                        this.methods$ = value;
                        return;
                    }
                }
            }
        }
        approve$.warning("Invalid matrix index.");
        throw new IllegalArgumentException("Invalid indices into matrix.");
    }

    public void _informal(float[][] matrix) {
        if (matrix.length != 4 || matrix[0].length != 4) {
            throw new IllegalArgumentException("Array must be of size 16.");
        }
        this.oriented$ = matrix[0][0];
        this.quality$ = matrix[0][1];
        this.sugar$ = matrix[0][2];
        this.beaches$ = matrix[0][3];
        this.wages$ = matrix[1][0];
        this.ivory$ = matrix[1][1];
        this.truly$ = matrix[1][2];
        this.registry$ = matrix[1][3];
        this.lopez$ = matrix[2][0];
        this.harold$ = matrix[2][1];
        this.boston$ = matrix[2][2];
        this.stated$ = matrix[2][3];
        this.content$ = matrix[3][0];
        this.schedule$ = matrix[3][1];
        this.hilton$ = matrix[3][2];
        this.methods$ = matrix[3][3];
    }

    public void _deutsch(float m00, float m01, float m02, float m03, float m10, float m11, float m12, float m13, float m20, float m21, float m22, float m23, float m30, float m31, float m32, float m33) {
        this.oriented$ = m00;
        this.quality$ = m01;
        this.sugar$ = m02;
        this.beaches$ = m03;
        this.wages$ = m10;
        this.ivory$ = m11;
        this.truly$ = m12;
        this.registry$ = m13;
        this.lopez$ = m20;
        this.harold$ = m21;
        this.boston$ = m22;
        this.stated$ = m23;
        this.content$ = m30;
        this.schedule$ = m31;
        this.hilton$ = m32;
        this.methods$ = m33;
    }

    public Matrix4f _office(Matrix4f matrix) {
        this.oriented$ = matrix.oriented$;
        this.quality$ = matrix.quality$;
        this.sugar$ = matrix.sugar$;
        this.beaches$ = matrix.beaches$;
        this.wages$ = matrix.wages$;
        this.ivory$ = matrix.ivory$;
        this.truly$ = matrix.truly$;
        this.registry$ = matrix.registry$;
        this.lopez$ = matrix.lopez$;
        this.harold$ = matrix.harold$;
        this.boston$ = matrix.boston$;
        this.stated$ = matrix.stated$;
        this.content$ = matrix.content$;
        this.schedule$ = matrix.schedule$;
        this.hilton$ = matrix.hilton$;
        this.methods$ = matrix.methods$;
        return this;
    }

    public void _contacts(float[] matrix) {
        this._logitech(matrix, true);
    }

    public void _logitech(float[] matrix, boolean rowMajor) {
        if (matrix.length != 16) {
            throw new IllegalArgumentException("Array must be of size 16.");
        }
        if (rowMajor) {
            this.oriented$ = matrix[0];
            this.quality$ = matrix[1];
            this.sugar$ = matrix[2];
            this.beaches$ = matrix[3];
            this.wages$ = matrix[4];
            this.ivory$ = matrix[5];
            this.truly$ = matrix[6];
            this.registry$ = matrix[7];
            this.lopez$ = matrix[8];
            this.harold$ = matrix[9];
            this.boston$ = matrix[10];
            this.stated$ = matrix[11];
            this.content$ = matrix[12];
            this.schedule$ = matrix[13];
            this.hilton$ = matrix[14];
            this.methods$ = matrix[15];
        } else {
            this.oriented$ = matrix[0];
            this.quality$ = matrix[4];
            this.sugar$ = matrix[8];
            this.beaches$ = matrix[12];
            this.wages$ = matrix[1];
            this.ivory$ = matrix[5];
            this.truly$ = matrix[9];
            this.registry$ = matrix[13];
            this.lopez$ = matrix[2];
            this.harold$ = matrix[6];
            this.boston$ = matrix[10];
            this.stated$ = matrix[14];
            this.content$ = matrix[3];
            this.schedule$ = matrix[7];
            this.hilton$ = matrix[11];
            this.methods$ = matrix[15];
        }
    }

    public Matrix4f _miller() {
        float[] tmp = new float[16];
        this._manager(tmp, true);
        Matrix4f mat = new Matrix4f(tmp);
        return mat;
    }

    public Matrix4f _utils() {
        float tmp = this.quality$;
        this.quality$ = this.wages$;
        this.wages$ = tmp;
        tmp = this.sugar$;
        this.sugar$ = this.lopez$;
        this.lopez$ = tmp;
        tmp = this.beaches$;
        this.beaches$ = this.content$;
        this.content$ = tmp;
        tmp = this.truly$;
        this.truly$ = this.harold$;
        this.harold$ = tmp;
        tmp = this.registry$;
        this.registry$ = this.schedule$;
        this.schedule$ = tmp;
        tmp = this.stated$;
        this.stated$ = this.hilton$;
        this.hilton$ = tmp;
        return this;
    }

    public void _exposed(float[] f2, boolean columnMajor) {
        if (columnMajor) {
            f2[0] = this.oriented$;
            f2[1] = this.wages$;
            f2[2] = this.lopez$;
            f2[3] = this.content$;
            f2[4] = this.quality$;
            f2[5] = this.ivory$;
            f2[6] = this.harold$;
            f2[7] = this.schedule$;
            f2[8] = this.sugar$;
            f2[9] = this.truly$;
            f2[10] = this.boston$;
            f2[11] = this.hilton$;
            f2[12] = this.beaches$;
            f2[13] = this.registry$;
            f2[14] = this.stated$;
            f2[15] = this.methods$;
        } else {
            f2[0] = this.oriented$;
            f2[1] = this.quality$;
            f2[2] = this.sugar$;
            f2[3] = this.beaches$;
            f2[4] = this.wages$;
            f2[5] = this.ivory$;
            f2[6] = this.truly$;
            f2[7] = this.registry$;
            f2[8] = this.lopez$;
            f2[9] = this.harold$;
            f2[10] = this.boston$;
            f2[11] = this.stated$;
            f2[12] = this.content$;
            f2[13] = this.schedule$;
            f2[14] = this.hilton$;
            f2[15] = this.methods$;
        }
    }

    public Matrix4f _theology(FloatBuffer fb2) {
        return this._parts(fb2, false);
    }

    public Matrix4f _parts(FloatBuffer fb2, boolean columnMajor) {
        if (columnMajor) {
            this.oriented$ = fb2.get();
            this.wages$ = fb2.get();
            this.lopez$ = fb2.get();
            this.content$ = fb2.get();
            this.quality$ = fb2.get();
            this.ivory$ = fb2.get();
            this.harold$ = fb2.get();
            this.schedule$ = fb2.get();
            this.sugar$ = fb2.get();
            this.truly$ = fb2.get();
            this.boston$ = fb2.get();
            this.hilton$ = fb2.get();
            this.beaches$ = fb2.get();
            this.registry$ = fb2.get();
            this.stated$ = fb2.get();
            this.methods$ = fb2.get();
        } else {
            this.oriented$ = fb2.get();
            this.quality$ = fb2.get();
            this.sugar$ = fb2.get();
            this.beaches$ = fb2.get();
            this.wages$ = fb2.get();
            this.ivory$ = fb2.get();
            this.truly$ = fb2.get();
            this.registry$ = fb2.get();
            this.lopez$ = fb2.get();
            this.harold$ = fb2.get();
            this.boston$ = fb2.get();
            this.stated$ = fb2.get();
            this.content$ = fb2.get();
            this.schedule$ = fb2.get();
            this.hilton$ = fb2.get();
            this.methods$ = fb2.get();
        }
        return this;
    }

    public void _bikes() {
        this.beaches$ = 0.0f;
        this.sugar$ = 0.0f;
        this.quality$ = 0.0f;
        this.registry$ = 0.0f;
        this.truly$ = 0.0f;
        this.wages$ = 0.0f;
        this.stated$ = 0.0f;
        this.harold$ = 0.0f;
        this.lopez$ = 0.0f;
        this.hilton$ = 0.0f;
        this.schedule$ = 0.0f;
        this.content$ = 0.0f;
        this.methods$ = 1.0f;
        this.boston$ = 1.0f;
        this.ivory$ = 1.0f;
        this.oriented$ = 1.0f;
    }

    public void _switches(float near, float far, float left, float right, float top, float bottom, boolean parallel) {
        this._bikes();
        if (parallel) {
            this.oriented$ = 2.0f / (right - left);
            this.ivory$ = 2.0f / (top - bottom);
            this.boston$ = -2.0f / (far - near);
            this.methods$ = 1.0f;
            this.beaches$ = -(right + left) / (right - left);
            this.registry$ = -(top + bottom) / (top - bottom);
            this.stated$ = -(far + near) / (far - near);
        } else {
            this.oriented$ = 2.0f * near / (right - left);
            this.ivory$ = 2.0f * near / (top - bottom);
            this.hilton$ = -1.0f;
            this.methods$ = -0.0f;
            this.sugar$ = (right + left) / (right - left);
            this.truly$ = (top + bottom) / (top - bottom);
            this.boston$ = -(far + near) / (far - near);
            this.stated$ = -(2.0f * far * near) / (far - near);
        }
    }

    public void _awesome(float angle, Vector3f axis) {
        Vector3f normAxis = axis._mixer();
        this._valve(angle, normAxis);
    }

    public void _valve(float angle, Vector3f axis) {
        this._santa();
        this.methods$ = 1.0f;
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
        this.oriented$ = fX2 * fOneMinusCos + fCos;
        this.quality$ = fXYM - fZSin;
        this.sugar$ = fXZM + fYSin;
        this.wages$ = fXYM + fZSin;
        this.ivory$ = fY2 * fOneMinusCos + fCos;
        this.truly$ = fYZM - fXSin;
        this.lopez$ = fXZM - fYSin;
        this.harold$ = fYZM + fXSin;
        this.boston$ = fZ2 * fOneMinusCos + fCos;
    }

    public void _publicly(float scalar) {
        this.oriented$ *= scalar;
        this.quality$ *= scalar;
        this.sugar$ *= scalar;
        this.beaches$ *= scalar;
        this.wages$ *= scalar;
        this.ivory$ *= scalar;
        this.truly$ *= scalar;
        this.registry$ *= scalar;
        this.lopez$ *= scalar;
        this.harold$ *= scalar;
        this.boston$ *= scalar;
        this.stated$ *= scalar;
        this.content$ *= scalar;
        this.schedule$ *= scalar;
        this.hilton$ *= scalar;
        this.methods$ *= scalar;
    }

    public Matrix4f _chemical(float scalar) {
        Matrix4f out = new Matrix4f();
        out._office(this);
        out._publicly(scalar);
        return out;
    }

    public Matrix4f _reveals(float scalar, Matrix4f store) {
        store._office(this);
        store._publicly(scalar);
        return store;
    }

    public Matrix4f _composer(Matrix4f in2) {
        return this._guilty(in2, null);
    }

    public Matrix4f _guilty(Matrix4f in2, Matrix4f store) {
        if (store == null) {
            store = new Matrix4f();
        }
        float temp00 = this.oriented$ * in2.oriented$ + this.quality$ * in2.wages$ + this.sugar$ * in2.lopez$ + this.beaches$ * in2.content$;
        float temp01 = this.oriented$ * in2.quality$ + this.quality$ * in2.ivory$ + this.sugar$ * in2.harold$ + this.beaches$ * in2.schedule$;
        float temp02 = this.oriented$ * in2.sugar$ + this.quality$ * in2.truly$ + this.sugar$ * in2.boston$ + this.beaches$ * in2.hilton$;
        float temp03 = this.oriented$ * in2.beaches$ + this.quality$ * in2.registry$ + this.sugar$ * in2.stated$ + this.beaches$ * in2.methods$;
        float temp10 = this.wages$ * in2.oriented$ + this.ivory$ * in2.wages$ + this.truly$ * in2.lopez$ + this.registry$ * in2.content$;
        float temp11 = this.wages$ * in2.quality$ + this.ivory$ * in2.ivory$ + this.truly$ * in2.harold$ + this.registry$ * in2.schedule$;
        float temp12 = this.wages$ * in2.sugar$ + this.ivory$ * in2.truly$ + this.truly$ * in2.boston$ + this.registry$ * in2.hilton$;
        float temp13 = this.wages$ * in2.beaches$ + this.ivory$ * in2.registry$ + this.truly$ * in2.stated$ + this.registry$ * in2.methods$;
        float temp20 = this.lopez$ * in2.oriented$ + this.harold$ * in2.wages$ + this.boston$ * in2.lopez$ + this.stated$ * in2.content$;
        float temp21 = this.lopez$ * in2.quality$ + this.harold$ * in2.ivory$ + this.boston$ * in2.harold$ + this.stated$ * in2.schedule$;
        float temp22 = this.lopez$ * in2.sugar$ + this.harold$ * in2.truly$ + this.boston$ * in2.boston$ + this.stated$ * in2.hilton$;
        float temp23 = this.lopez$ * in2.beaches$ + this.harold$ * in2.registry$ + this.boston$ * in2.stated$ + this.stated$ * in2.methods$;
        float temp30 = this.content$ * in2.oriented$ + this.schedule$ * in2.wages$ + this.hilton$ * in2.lopez$ + this.methods$ * in2.content$;
        float temp31 = this.content$ * in2.quality$ + this.schedule$ * in2.ivory$ + this.hilton$ * in2.harold$ + this.methods$ * in2.schedule$;
        float temp32 = this.content$ * in2.sugar$ + this.schedule$ * in2.truly$ + this.hilton$ * in2.boston$ + this.methods$ * in2.hilton$;
        float temp33 = this.content$ * in2.beaches$ + this.schedule$ * in2.registry$ + this.hilton$ * in2.stated$ + this.methods$ * in2.methods$;
        store.oriented$ = temp00;
        store.quality$ = temp01;
        store.sugar$ = temp02;
        store.beaches$ = temp03;
        store.wages$ = temp10;
        store.ivory$ = temp11;
        store.truly$ = temp12;
        store.registry$ = temp13;
        store.lopez$ = temp20;
        store.harold$ = temp21;
        store.boston$ = temp22;
        store.stated$ = temp23;
        store.content$ = temp30;
        store.schedule$ = temp31;
        store.hilton$ = temp32;
        store.methods$ = temp33;
        return store;
    }

    public Matrix4f _curious(Matrix4f in2) {
        return this._guilty(in2, this);
    }

    public Vector3f _count(Vector3f vec) {
        return this._happen(vec, null);
    }

    public Vector3f _happen(Vector3f vec, Vector3f store) {
        if (store == null) {
            store = new Vector3f();
        }
        float vx = vec.serves$;
        float vy = vec.genius$;
        float vz = vec.superb$;
        store.serves$ = this.oriented$ * vx + this.quality$ * vy + this.sugar$ * vz + this.beaches$;
        store.genius$ = this.wages$ * vx + this.ivory$ * vy + this.truly$ * vz + this.registry$;
        store.superb$ = this.lopez$ * vx + this.harold$ * vy + this.boston$ * vz + this.stated$;
        return store;
    }

    public Vector4f _arranged(Vector4f vec) {
        return this._expand(vec, null);
    }

    public Vector4f _expand(Vector4f vec, Vector4f store) {
        if (null == vec) {
            approve$.warning("Source vector is null, null result returned.");
            return null;
        }
        if (store == null) {
            store = new Vector4f();
        }
        float vx = vec.naked$;
        float vy = vec.current$;
        float vz = vec.token$;
        float vw = vec.includes$;
        store.naked$ = this.oriented$ * vx + this.quality$ * vy + this.sugar$ * vz + this.beaches$ * vw;
        store.current$ = this.wages$ * vx + this.ivory$ * vy + this.truly$ * vz + this.registry$ * vw;
        store.token$ = this.lopez$ * vx + this.harold$ * vy + this.boston$ * vz + this.stated$ * vw;
        store.includes$ = this.content$ * vx + this.schedule$ * vy + this.hilton$ * vz + this.methods$ * vw;
        return store;
    }

    public Vector4f _compact(Vector4f vec) {
        return this._tuition(vec, null);
    }

    public Vector4f _tuition(Vector4f vec, Vector4f store) {
        if (null == vec) {
            approve$.warning("Source vector is null, null result returned.");
            return null;
        }
        if (store == null) {
            store = new Vector4f();
        }
        float vx = vec.naked$;
        float vy = vec.current$;
        float vz = vec.token$;
        float vw = vec.includes$;
        store.naked$ = this.oriented$ * vx + this.wages$ * vy + this.lopez$ * vz + this.content$ * vw;
        store.current$ = this.quality$ * vx + this.ivory$ * vy + this.harold$ * vz + this.schedule$ * vw;
        store.token$ = this.sugar$ * vx + this.truly$ * vy + this.boston$ * vz + this.hilton$ * vw;
        store.includes$ = this.beaches$ * vx + this.registry$ * vy + this.stated$ * vz + this.methods$ * vw;
        return store;
    }

    public Vector3f _circles(Vector3f vec, Vector3f store) {
        if (store == null) {
            store = new Vector3f();
        }
        float vx = vec.serves$;
        float vy = vec.genius$;
        float vz = vec.superb$;
        store.serves$ = this.oriented$ * vx + this.quality$ * vy + this.sugar$ * vz;
        store.genius$ = this.wages$ * vx + this.ivory$ * vy + this.truly$ * vz;
        store.superb$ = this.lopez$ * vx + this.harold$ * vy + this.boston$ * vz;
        return store;
    }

    public Vector3f _amber(Vector3f vec, Vector3f store) {
        if (store == null) {
            store = new Vector3f();
        }
        float vx = vec.serves$;
        float vy = vec.genius$;
        float vz = vec.superb$;
        store.serves$ = this.oriented$ * vx + this.wages$ * vy + this.lopez$ * vz;
        store.genius$ = this.quality$ * vx + this.ivory$ * vy + this.harold$ * vz;
        store.superb$ = this.sugar$ * vx + this.truly$ * vy + this.boston$ * vz;
        return store;
    }

    public float _gateway(Vector3f vec, Vector3f store) {
        float vx = vec.serves$;
        float vy = vec.genius$;
        float vz = vec.superb$;
        store.serves$ = this.oriented$ * vx + this.quality$ * vy + this.sugar$ * vz + this.beaches$;
        store.genius$ = this.wages$ * vx + this.ivory$ * vy + this.truly$ * vz + this.registry$;
        store.superb$ = this.lopez$ * vx + this.harold$ * vy + this.boston$ * vz + this.stated$;
        return this.content$ * vx + this.schedule$ * vy + this.hilton$ * vz + this.methods$;
    }

    public Vector3f _careful(Vector3f vec, Vector3f store) {
        if (null == vec) {
            approve$.warning("Source vector is null, null result returned.");
            return null;
        }
        if (store == null) {
            store = new Vector3f();
        }
        float vx = vec.serves$;
        float vy = vec.genius$;
        float vz = vec.superb$;
        store.serves$ = this.oriented$ * vx + this.wages$ * vy + this.lopez$ * vz + this.content$ * 1.0f;
        store.genius$ = this.quality$ * vx + this.ivory$ * vy + this.harold$ * vz + this.schedule$ * 1.0f;
        store.superb$ = this.sugar$ * vx + this.truly$ * vy + this.boston$ * vz + this.hilton$ * 1.0f;
        return store;
    }

    public Quaternion _throat(Quaternion vec, Quaternion store) {
        if (null == vec) {
            approve$.warning("Source vector is null, null result returned.");
            return null;
        }
        if (store == null) {
            store = new Quaternion();
        }
        float x = this.oriented$ * vec.arrow$ + this.wages$ * vec.valves$ + this.lopez$ * vec.licenses$ + this.content$ * vec.jelsoft$;
        float y = this.quality$ * vec.arrow$ + this.ivory$ * vec.valves$ + this.harold$ * vec.licenses$ + this.schedule$ * vec.jelsoft$;
        float z = this.sugar$ * vec.arrow$ + this.truly$ * vec.valves$ + this.boston$ * vec.licenses$ + this.hilton$ * vec.jelsoft$;
        float w = this.beaches$ * vec.arrow$ + this.registry$ * vec.valves$ + this.stated$ * vec.licenses$ + this.methods$ * vec.jelsoft$;
        store.arrow$ = x;
        store.valves$ = y;
        store.licenses$ = z;
        store.jelsoft$ = w;
        return store;
    }

    public float[] _teams(float[] vec4f) {
        if (null == vec4f || vec4f.length != 4) {
            approve$.warning("invalid array given, must be nonnull and length 4");
            return null;
        }
        float x = vec4f[0];
        float y = vec4f[1];
        float z = vec4f[2];
        float w = vec4f[3];
        vec4f[0] = this.oriented$ * x + this.quality$ * y + this.sugar$ * z + this.beaches$ * w;
        vec4f[1] = this.wages$ * x + this.ivory$ * y + this.truly$ * z + this.registry$ * w;
        vec4f[2] = this.lopez$ * x + this.harold$ * y + this.boston$ * z + this.stated$ * w;
        vec4f[3] = this.content$ * x + this.schedule$ * y + this.hilton$ * z + this.methods$ * w;
        return vec4f;
    }

    public float[] _style(float[] vec4f) {
        if (null == vec4f || vec4f.length != 4) {
            approve$.warning("invalid array given, must be nonnull and length 4");
            return null;
        }
        float x = vec4f[0];
        float y = vec4f[1];
        float z = vec4f[2];
        float w = vec4f[3];
        vec4f[0] = this.oriented$ * x + this.wages$ * y + this.lopez$ * z + this.content$ * w;
        vec4f[1] = this.quality$ * x + this.ivory$ * y + this.harold$ * z + this.schedule$ * w;
        vec4f[2] = this.sugar$ * x + this.truly$ * y + this.boston$ * z + this.hilton$ * w;
        vec4f[3] = this.beaches$ * x + this.registry$ * y + this.stated$ * z + this.methods$ * w;
        return vec4f;
    }

    public Matrix4f _pressing() {
        Matrix3f inv = this._bufing()._south();
        this._subaru(new Quaternion()._attached(inv));
        this._castle(inv._central(this._jerry()._holmes()));
        return this;
    }

    public Matrix4f _powerful() {
        return this._track(null);
    }

    public Matrix4f _track(Matrix4f store) {
        float fB0;
        float fA5;
        float fB1;
        float fA4;
        float fB2;
        float fA3;
        float fB3;
        float fA2;
        float fB4;
        float fA1;
        float fB5;
        float fA0;
        float fDet;
        if (store == null) {
            store = new Matrix4f();
        }
        if (FastMath._videos(fDet = (fA0 = this.oriented$ * this.ivory$ - this.quality$ * this.wages$) * (fB5 = this.boston$ * this.methods$ - this.stated$ * this.hilton$) - (fA1 = this.oriented$ * this.truly$ - this.sugar$ * this.wages$) * (fB4 = this.harold$ * this.methods$ - this.stated$ * this.schedule$) + (fA2 = this.oriented$ * this.registry$ - this.beaches$ * this.wages$) * (fB3 = this.harold$ * this.hilton$ - this.boston$ * this.schedule$) + (fA3 = this.quality$ * this.truly$ - this.sugar$ * this.ivory$) * (fB2 = this.lopez$ * this.methods$ - this.stated$ * this.content$) - (fA4 = this.quality$ * this.registry$ - this.beaches$ * this.ivory$) * (fB1 = this.lopez$ * this.hilton$ - this.boston$ * this.content$) + (fA5 = this.sugar$ * this.registry$ - this.beaches$ * this.truly$) * (fB0 = this.lopez$ * this.schedule$ - this.harold$ * this.content$)) <= 0.0f) {
            throw new ArithmeticException("This matrix cannot be inverted");
        }
        store.oriented$ = this.ivory$ * fB5 - this.truly$ * fB4 + this.registry$ * fB3;
        store.wages$ = -this.wages$ * fB5 + this.truly$ * fB2 - this.registry$ * fB1;
        store.lopez$ = this.wages$ * fB4 - this.ivory$ * fB2 + this.registry$ * fB0;
        store.content$ = -this.wages$ * fB3 + this.ivory$ * fB1 - this.truly$ * fB0;
        store.quality$ = -this.quality$ * fB5 + this.sugar$ * fB4 - this.beaches$ * fB3;
        store.ivory$ = this.oriented$ * fB5 - this.sugar$ * fB2 + this.beaches$ * fB1;
        store.harold$ = -this.oriented$ * fB4 + this.quality$ * fB2 - this.beaches$ * fB0;
        store.schedule$ = this.oriented$ * fB3 - this.quality$ * fB1 + this.sugar$ * fB0;
        store.sugar$ = this.schedule$ * fA5 - this.hilton$ * fA4 + this.methods$ * fA3;
        store.truly$ = -this.content$ * fA5 + this.hilton$ * fA2 - this.methods$ * fA1;
        store.boston$ = this.content$ * fA4 - this.schedule$ * fA2 + this.methods$ * fA0;
        store.hilton$ = -this.content$ * fA3 + this.schedule$ * fA1 - this.hilton$ * fA0;
        store.beaches$ = -this.harold$ * fA5 + this.boston$ * fA4 - this.stated$ * fA3;
        store.registry$ = this.lopez$ * fA5 - this.boston$ * fA2 + this.stated$ * fA1;
        store.stated$ = -this.lopez$ * fA4 + this.harold$ * fA2 - this.stated$ * fA0;
        store.methods$ = this.lopez$ * fA3 - this.harold$ * fA1 + this.boston$ * fA0;
        float fInvDet = 1.0f / fDet;
        store._publicly(fInvDet);
        return store;
    }

    public Matrix4f _viewing() {
        float fA0 = this.oriented$ * this.ivory$ - this.quality$ * this.wages$;
        float fB5 = this.boston$ * this.methods$ - this.stated$ * this.hilton$;
        float fA1 = this.oriented$ * this.truly$ - this.sugar$ * this.wages$;
        float fB4 = this.harold$ * this.methods$ - this.stated$ * this.schedule$;
        float fA2 = this.oriented$ * this.registry$ - this.beaches$ * this.wages$;
        float fB3 = this.harold$ * this.hilton$ - this.boston$ * this.schedule$;
        float fA3 = this.quality$ * this.truly$ - this.sugar$ * this.ivory$;
        float fB2 = this.lopez$ * this.methods$ - this.stated$ * this.content$;
        float fA4 = this.quality$ * this.registry$ - this.beaches$ * this.ivory$;
        float fB1 = this.lopez$ * this.hilton$ - this.boston$ * this.content$;
        float fA5 = this.sugar$ * this.registry$ - this.beaches$ * this.truly$;
        float fB0 = this.lopez$ * this.schedule$ - this.harold$ * this.content$;
        float fDet = fA0 * fB5 - fA1 * fB4 + fA2 * fB3 + fA3 * fB2 - fA4 * fB1 + fA5 * fB0;
        if (FastMath._videos(fDet) <= 0.0f) {
            return this._santa();
        }
        float f00 = this.ivory$ * fB5 - this.truly$ * fB4 + this.registry$ * fB3;
        float f10 = -this.wages$ * fB5 + this.truly$ * fB2 - this.registry$ * fB1;
        float f20 = this.wages$ * fB4 - this.ivory$ * fB2 + this.registry$ * fB0;
        float f30 = -this.wages$ * fB3 + this.ivory$ * fB1 - this.truly$ * fB0;
        float f01 = -this.quality$ * fB5 + this.sugar$ * fB4 - this.beaches$ * fB3;
        float f11 = this.oriented$ * fB5 - this.sugar$ * fB2 + this.beaches$ * fB1;
        float f21 = -this.oriented$ * fB4 + this.quality$ * fB2 - this.beaches$ * fB0;
        float f31 = this.oriented$ * fB3 - this.quality$ * fB1 + this.sugar$ * fB0;
        float f02 = this.schedule$ * fA5 - this.hilton$ * fA4 + this.methods$ * fA3;
        float f12 = -this.content$ * fA5 + this.hilton$ * fA2 - this.methods$ * fA1;
        float f22 = this.content$ * fA4 - this.schedule$ * fA2 + this.methods$ * fA0;
        float f32 = -this.content$ * fA3 + this.schedule$ * fA1 - this.hilton$ * fA0;
        float f03 = -this.harold$ * fA5 + this.boston$ * fA4 - this.stated$ * fA3;
        float f13 = this.lopez$ * fA5 - this.boston$ * fA2 + this.stated$ * fA1;
        float f23 = -this.lopez$ * fA4 + this.harold$ * fA2 - this.stated$ * fA0;
        float f33 = this.lopez$ * fA3 - this.harold$ * fA1 + this.boston$ * fA0;
        this.oriented$ = f00;
        this.quality$ = f01;
        this.sugar$ = f02;
        this.beaches$ = f03;
        this.wages$ = f10;
        this.ivory$ = f11;
        this.truly$ = f12;
        this.registry$ = f13;
        this.lopez$ = f20;
        this.harold$ = f21;
        this.boston$ = f22;
        this.stated$ = f23;
        this.content$ = f30;
        this.schedule$ = f31;
        this.hilton$ = f32;
        this.methods$ = f33;
        float fInvDet = 1.0f / fDet;
        this._publicly(fInvDet);
        return this;
    }

    public Matrix4f _unsigned() {
        return this._roughly(null);
    }

    public void _counties(Vector3f position, Vector3f scale, Matrix3f rotMat) {
        this.oriented$ = scale.serves$ * rotMat.every$;
        this.quality$ = scale.genius$ * rotMat.releases$;
        this.sugar$ = scale.superb$ * rotMat.hearts$;
        this.beaches$ = position.serves$;
        this.wages$ = scale.serves$ * rotMat.clone$;
        this.ivory$ = scale.genius$ * rotMat.ultram$;
        this.truly$ = scale.superb$ * rotMat.affect$;
        this.registry$ = position.genius$;
        this.lopez$ = scale.serves$ * rotMat.customs$;
        this.harold$ = scale.genius$ * rotMat.speakers$;
        this.boston$ = scale.superb$ * rotMat.light$;
        this.stated$ = position.superb$;
        this.content$ = 0.0f;
        this.schedule$ = 0.0f;
        this.hilton$ = 0.0f;
        this.methods$ = 1.0f;
    }

    public Matrix4f _roughly(Matrix4f store) {
        if (store == null) {
            store = new Matrix4f();
        }
        float fA0 = this.oriented$ * this.ivory$ - this.quality$ * this.wages$;
        float fA1 = this.oriented$ * this.truly$ - this.sugar$ * this.wages$;
        float fA2 = this.oriented$ * this.registry$ - this.beaches$ * this.wages$;
        float fA3 = this.quality$ * this.truly$ - this.sugar$ * this.ivory$;
        float fA4 = this.quality$ * this.registry$ - this.beaches$ * this.ivory$;
        float fA5 = this.sugar$ * this.registry$ - this.beaches$ * this.truly$;
        float fB0 = this.lopez$ * this.schedule$ - this.harold$ * this.content$;
        float fB1 = this.lopez$ * this.hilton$ - this.boston$ * this.content$;
        float fB2 = this.lopez$ * this.methods$ - this.stated$ * this.content$;
        float fB3 = this.harold$ * this.hilton$ - this.boston$ * this.schedule$;
        float fB4 = this.harold$ * this.methods$ - this.stated$ * this.schedule$;
        float fB5 = this.boston$ * this.methods$ - this.stated$ * this.hilton$;
        store.oriented$ = this.ivory$ * fB5 - this.truly$ * fB4 + this.registry$ * fB3;
        store.wages$ = -this.wages$ * fB5 + this.truly$ * fB2 - this.registry$ * fB1;
        store.lopez$ = this.wages$ * fB4 - this.ivory$ * fB2 + this.registry$ * fB0;
        store.content$ = -this.wages$ * fB3 + this.ivory$ * fB1 - this.truly$ * fB0;
        store.quality$ = -this.quality$ * fB5 + this.sugar$ * fB4 - this.beaches$ * fB3;
        store.ivory$ = this.oriented$ * fB5 - this.sugar$ * fB2 + this.beaches$ * fB1;
        store.harold$ = -this.oriented$ * fB4 + this.quality$ * fB2 - this.beaches$ * fB0;
        store.schedule$ = this.oriented$ * fB3 - this.quality$ * fB1 + this.sugar$ * fB0;
        store.sugar$ = this.schedule$ * fA5 - this.hilton$ * fA4 + this.methods$ * fA3;
        store.truly$ = -this.content$ * fA5 + this.hilton$ * fA2 - this.methods$ * fA1;
        store.boston$ = this.content$ * fA4 - this.schedule$ * fA2 + this.methods$ * fA0;
        store.hilton$ = -this.content$ * fA3 + this.schedule$ * fA1 - this.hilton$ * fA0;
        store.beaches$ = -this.harold$ * fA5 + this.boston$ * fA4 - this.stated$ * fA3;
        store.registry$ = this.lopez$ * fA5 - this.boston$ * fA2 + this.stated$ * fA1;
        store.stated$ = -this.lopez$ * fA4 + this.harold$ * fA2 - this.stated$ * fA0;
        store.methods$ = this.lopez$ * fA3 - this.harold$ * fA1 + this.boston$ * fA0;
        return store;
    }

    public float _presents() {
        float fA0 = this.oriented$ * this.ivory$ - this.quality$ * this.wages$;
        float fA1 = this.oriented$ * this.truly$ - this.sugar$ * this.wages$;
        float fA2 = this.oriented$ * this.registry$ - this.beaches$ * this.wages$;
        float fA3 = this.quality$ * this.truly$ - this.sugar$ * this.ivory$;
        float fA4 = this.quality$ * this.registry$ - this.beaches$ * this.ivory$;
        float fA5 = this.sugar$ * this.registry$ - this.beaches$ * this.truly$;
        float fB0 = this.lopez$ * this.schedule$ - this.harold$ * this.content$;
        float fB1 = this.lopez$ * this.hilton$ - this.boston$ * this.content$;
        float fB2 = this.lopez$ * this.methods$ - this.stated$ * this.content$;
        float fB3 = this.harold$ * this.hilton$ - this.boston$ * this.schedule$;
        float fB4 = this.harold$ * this.methods$ - this.stated$ * this.schedule$;
        float fB5 = this.boston$ * this.methods$ - this.stated$ * this.hilton$;
        float fDet = fA0 * fB5 - fA1 * fB4 + fA2 * fB3 + fA3 * fB2 - fA4 * fB1 + fA5 * fB0;
        return fDet;
    }

    public Matrix4f _santa() {
        this.beaches$ = 0.0f;
        this.sugar$ = 0.0f;
        this.quality$ = 0.0f;
        this.oriented$ = 0.0f;
        this.registry$ = 0.0f;
        this.truly$ = 0.0f;
        this.ivory$ = 0.0f;
        this.wages$ = 0.0f;
        this.stated$ = 0.0f;
        this.boston$ = 0.0f;
        this.harold$ = 0.0f;
        this.lopez$ = 0.0f;
        this.methods$ = 0.0f;
        this.hilton$ = 0.0f;
        this.schedule$ = 0.0f;
        this.content$ = 0.0f;
        return this;
    }

    public Matrix4f _brakes(Matrix4f mat) {
        Matrix4f result = new Matrix4f();
        result.oriented$ = this.oriented$ + mat.oriented$;
        result.quality$ = this.quality$ + mat.quality$;
        result.sugar$ = this.sugar$ + mat.sugar$;
        result.beaches$ = this.beaches$ + mat.beaches$;
        result.wages$ = this.wages$ + mat.wages$;
        result.ivory$ = this.ivory$ + mat.ivory$;
        result.truly$ = this.truly$ + mat.truly$;
        result.registry$ = this.registry$ + mat.registry$;
        result.lopez$ = this.lopez$ + mat.lopez$;
        result.harold$ = this.harold$ + mat.harold$;
        result.boston$ = this.boston$ + mat.boston$;
        result.stated$ = this.stated$ + mat.stated$;
        result.content$ = this.content$ + mat.content$;
        result.schedule$ = this.schedule$ + mat.schedule$;
        result.hilton$ = this.hilton$ + mat.hilton$;
        result.methods$ = this.methods$ + mat.methods$;
        return result;
    }

    public void _thank(Matrix4f mat) {
        this.oriented$ += mat.oriented$;
        this.quality$ += mat.quality$;
        this.sugar$ += mat.sugar$;
        this.beaches$ += mat.beaches$;
        this.wages$ += mat.wages$;
        this.ivory$ += mat.ivory$;
        this.truly$ += mat.truly$;
        this.registry$ += mat.registry$;
        this.lopez$ += mat.lopez$;
        this.harold$ += mat.harold$;
        this.boston$ += mat.boston$;
        this.stated$ += mat.stated$;
        this.content$ += mat.content$;
        this.schedule$ += mat.schedule$;
        this.hilton$ += mat.hilton$;
        this.methods$ += mat.methods$;
    }

    public Vector3f _jerry() {
        return new Vector3f(this.beaches$, this.registry$, this.stated$);
    }

    public void _solve(Vector3f vector) {
        vector._alleged(this.beaches$, this.registry$, this.stated$);
    }

    public Quaternion _strictly() {
        Quaternion quat = new Quaternion();
        quat._attached(this._bufing());
        return quat;
    }

    public void _courses(Quaternion q) {
        q._attached(this._bufing());
    }

    public Matrix3f _bufing() {
        return new Matrix3f(this.oriented$, this.quality$, this.sugar$, this.wages$, this.ivory$, this.truly$, this.lopez$, this.harold$, this.boston$);
    }

    public void _sweet(Matrix3f m3f) {
        this.oriented$ = m3f.every$;
        this.quality$ = m3f.releases$;
        this.sugar$ = m3f.hearts$;
        this.wages$ = m3f.clone$;
        this.ivory$ = m3f.ultram$;
        this.truly$ = m3f.affect$;
        this.lopez$ = m3f.customs$;
        this.harold$ = m3f.speakers$;
        this.boston$ = m3f.light$;
    }

    public void _appendix(Matrix3f mat) {
        mat.every$ = this.oriented$;
        mat.releases$ = this.quality$;
        mat.hearts$ = this.sugar$;
        mat.clone$ = this.wages$;
        mat.ultram$ = this.ivory$;
        mat.affect$ = this.truly$;
        mat.customs$ = this.lopez$;
        mat.speakers$ = this.harold$;
        mat.light$ = this.boston$;
    }

    public Vector3f _capture() {
        Vector3f result = new Vector3f();
        this._phillips(result);
        return result;
    }

    public void _phillips(Vector3f vector) {
        float scaleX = (float)Math.sqrt(this.oriented$ * this.oriented$ + this.wages$ * this.wages$ + this.lopez$ * this.lopez$);
        float scaleY = (float)Math.sqrt(this.quality$ * this.quality$ + this.ivory$ * this.ivory$ + this.harold$ * this.harold$);
        float scaleZ = (float)Math.sqrt(this.sugar$ * this.sugar$ + this.truly$ * this.truly$ + this.boston$ * this.boston$);
        vector._alleged(scaleX, scaleY, scaleZ);
    }

    public void _optimum(float x, float y, float z) {
        this.oriented$ *= x;
        this.ivory$ *= y;
        this.boston$ *= z;
    }

    public void _brighton(Vector3f scale) {
        this.oriented$ *= scale.serves$;
        this.ivory$ *= scale.genius$;
        this.boston$ *= scale.superb$;
    }

    public void _cliff(float[] translation) {
        if (translation.length != 3) {
            throw new IllegalArgumentException("Translation size must be 3.");
        }
        this.beaches$ = translation[0];
        this.registry$ = translation[1];
        this.stated$ = translation[2];
    }

    public void _ukraine(float x, float y, float z) {
        this.beaches$ = x;
        this.registry$ = y;
        this.stated$ = z;
    }

    public void _castle(Vector3f translation) {
        this.beaches$ = translation.serves$;
        this.registry$ = translation.genius$;
        this.stated$ = translation.superb$;
    }

    public void _sunrise(float[] translation) {
        if (translation.length != 3) {
            throw new IllegalArgumentException("Translation size must be 3.");
        }
        this.beaches$ = -translation[0];
        this.registry$ = -translation[1];
        this.stated$ = -translation[2];
    }

    public void _keyword(Vector3f angles) {
        float angle = angles.superb$ * ((float)Math.PI / 180);
        float sy = FastMath._booth(angle);
        float cy = FastMath._country(angle);
        angle = angles.genius$ * ((float)Math.PI / 180);
        float sp = FastMath._booth(angle);
        float cp = FastMath._country(angle);
        angle = angles.serves$ * ((float)Math.PI / 180);
        float sr = FastMath._booth(angle);
        float cr = FastMath._country(angle);
        this.oriented$ = cp * cy;
        this.wages$ = cp * sy;
        this.lopez$ = -sp;
        this.quality$ = sr * sp * cy + cr * -sy;
        this.ivory$ = sr * sp * sy + cr * cy;
        this.harold$ = sr * cp;
        this.sugar$ = cr * sp * cy + -sr * -sy;
        this.truly$ = cr * sp * sy + -sr * cy;
        this.boston$ = cr * cp;
        this.beaches$ = 0.0f;
        this.registry$ = 0.0f;
        this.stated$ = 0.0f;
    }

    public void _subaru(Quaternion quat) {
        quat._leeds(this);
    }

    public void _marks(float[] angles) {
        if (angles.length != 3) {
            throw new IllegalArgumentException("Angles must be of size 3.");
        }
        double cr = FastMath._country(angles[0]);
        double sr = FastMath._booth(angles[0]);
        double cp = FastMath._country(angles[1]);
        double sp = FastMath._booth(angles[1]);
        double cy = FastMath._country(angles[2]);
        double sy = FastMath._booth(angles[2]);
        this.oriented$ = (float)(cp * cy);
        this.wages$ = (float)(cp * sy);
        this.lopez$ = (float)(-sp);
        double srsp = sr * sp;
        double crsp = cr * sp;
        this.quality$ = (float)(srsp * cy - cr * sy);
        this.ivory$ = (float)(srsp * sy + cr * cy);
        this.harold$ = (float)(sr * cp);
        this.sugar$ = (float)(crsp * cy + sr * sy);
        this.truly$ = (float)(crsp * sy - sr * cy);
        this.boston$ = (float)(cr * cp);
    }

    public void _failure(float[] angles) {
        if (angles.length != 3) {
            throw new IllegalArgumentException("Angles must be of size 3.");
        }
        float[] vec = new float[]{angles[0] * 57.295776f, angles[1] * 57.295776f, angles[2] * 57.295776f};
        this._marks(vec);
    }

    public void _albums(float[] vec) {
        if (vec.length != 3) {
            throw new IllegalArgumentException("vec must be of size 3.");
        }
        vec[0] = vec[0] - this.beaches$;
        vec[1] = vec[1] - this.registry$;
        vec[2] = vec[2] - this.stated$;
    }

    public void _sight(Vector3f data) {
        data.serves$ -= this.beaches$;
        data.genius$ -= this.registry$;
        data.superb$ -= this.stated$;
    }

    public void _implied(Vector3f data) {
        data.serves$ += this.beaches$;
        data.genius$ += this.registry$;
        data.superb$ += this.stated$;
    }

    public void _studying(Vector3f vec) {
        float vx = vec.serves$;
        float vy = vec.genius$;
        float vz = vec.superb$;
        vec.serves$ = vx * this.oriented$ + vy * this.wages$ + vz * this.lopez$;
        vec.genius$ = vx * this.quality$ + vy * this.ivory$ + vz * this.harold$;
        vec.superb$ = vx * this.sugar$ + vy * this.truly$ + vz * this.boston$;
    }

    public void _discuss(Vector3f vec) {
        float vx = vec.serves$;
        float vy = vec.genius$;
        float vz = vec.superb$;
        vec.serves$ = vx * this.oriented$ + vy * this.quality$ + vz * this.sugar$;
        vec.genius$ = vx * this.wages$ + vy * this.ivory$ + vz * this.truly$;
        vec.superb$ = vx * this.lopez$ + vy * this.harold$ + vz * this.boston$;
    }

    public String toString() {
        StringBuilder result = new StringBuilder("Matrix4f\n[\n");
        result.append(" ");
        result.append(this.oriented$);
        result.append("  ");
        result.append(this.quality$);
        result.append("  ");
        result.append(this.sugar$);
        result.append("  ");
        result.append(this.beaches$);
        result.append(" \n");
        result.append(" ");
        result.append(this.wages$);
        result.append("  ");
        result.append(this.ivory$);
        result.append("  ");
        result.append(this.truly$);
        result.append("  ");
        result.append(this.registry$);
        result.append(" \n");
        result.append(" ");
        result.append(this.lopez$);
        result.append("  ");
        result.append(this.harold$);
        result.append("  ");
        result.append(this.boston$);
        result.append("  ");
        result.append(this.stated$);
        result.append(" \n");
        result.append(" ");
        result.append(this.content$);
        result.append("  ");
        result.append(this.schedule$);
        result.append("  ");
        result.append(this.hilton$);
        result.append("  ");
        result.append(this.methods$);
        result.append(" \n]");
        return result.toString();
    }

    public int hashCode() {
        int hash = 37;
        hash = 37 * hash + Float.floatToIntBits(this.oriented$);
        hash = 37 * hash + Float.floatToIntBits(this.quality$);
        hash = 37 * hash + Float.floatToIntBits(this.sugar$);
        hash = 37 * hash + Float.floatToIntBits(this.beaches$);
        hash = 37 * hash + Float.floatToIntBits(this.wages$);
        hash = 37 * hash + Float.floatToIntBits(this.ivory$);
        hash = 37 * hash + Float.floatToIntBits(this.truly$);
        hash = 37 * hash + Float.floatToIntBits(this.registry$);
        hash = 37 * hash + Float.floatToIntBits(this.lopez$);
        hash = 37 * hash + Float.floatToIntBits(this.harold$);
        hash = 37 * hash + Float.floatToIntBits(this.boston$);
        hash = 37 * hash + Float.floatToIntBits(this.stated$);
        hash = 37 * hash + Float.floatToIntBits(this.content$);
        hash = 37 * hash + Float.floatToIntBits(this.schedule$);
        hash = 37 * hash + Float.floatToIntBits(this.hilton$);
        hash = 37 * hash + Float.floatToIntBits(this.methods$);
        return hash;
    }

    public boolean equals(Object o) {
        if (!(o instanceof Matrix4f) || o == null) {
            return false;
        }
        if (this == o) {
            return true;
        }
        Matrix4f comp = (Matrix4f)o;
        if (Float.compare(this.oriented$, comp.oriented$) != 0) {
            return false;
        }
        if (Float.compare(this.quality$, comp.quality$) != 0) {
            return false;
        }
        if (Float.compare(this.sugar$, comp.sugar$) != 0) {
            return false;
        }
        if (Float.compare(this.beaches$, comp.beaches$) != 0) {
            return false;
        }
        if (Float.compare(this.wages$, comp.wages$) != 0) {
            return false;
        }
        if (Float.compare(this.ivory$, comp.ivory$) != 0) {
            return false;
        }
        if (Float.compare(this.truly$, comp.truly$) != 0) {
            return false;
        }
        if (Float.compare(this.registry$, comp.registry$) != 0) {
            return false;
        }
        if (Float.compare(this.lopez$, comp.lopez$) != 0) {
            return false;
        }
        if (Float.compare(this.harold$, comp.harold$) != 0) {
            return false;
        }
        if (Float.compare(this.boston$, comp.boston$) != 0) {
            return false;
        }
        if (Float.compare(this.stated$, comp.stated$) != 0) {
            return false;
        }
        if (Float.compare(this.content$, comp.content$) != 0) {
            return false;
        }
        if (Float.compare(this.schedule$, comp.schedule$) != 0) {
            return false;
        }
        if (Float.compare(this.hilton$, comp.hilton$) != 0) {
            return false;
        }
        return Float.compare(this.methods$, comp.methods$) == 0;
    }

    public boolean _johnson() {
        return this.oriented$ == 1.0f && this.quality$ == 0.0f && this.sugar$ == 0.0f && this.beaches$ == 0.0f && this.wages$ == 0.0f && this.ivory$ == 1.0f && this.truly$ == 0.0f && this.registry$ == 0.0f && this.lopez$ == 0.0f && this.harold$ == 0.0f && this.boston$ == 1.0f && this.stated$ == 0.0f && this.content$ == 0.0f && this.schedule$ == 0.0f && this.hilton$ == 0.0f && this.methods$ == 1.0f;
    }

    public Matrix4f _becomes(Matrix4f src, Matrix4f dest) {
        if (dest == null) {
            dest = new Matrix4f();
        }
        dest.oriented$ = -src.oriented$;
        dest.quality$ = -src.quality$;
        dest.sugar$ = -src.sugar$;
        dest.beaches$ = -src.beaches$;
        dest.wages$ = -src.wages$;
        dest.ivory$ = -src.ivory$;
        dest.truly$ = -src.truly$;
        dest.registry$ = -src.registry$;
        dest.lopez$ = -src.lopez$;
        dest.harold$ = -src.harold$;
        dest.boston$ = -src.boston$;
        dest.stated$ = -src.stated$;
        dest.content$ = -src.content$;
        dest.schedule$ = -src.schedule$;
        dest.hilton$ = -src.hilton$;
        dest.methods$ = -src.methods$;
        return dest;
    }

    public void _feeds(Vector3f scale) {
        this.oriented$ *= scale._beads();
        this.wages$ *= scale._beads();
        this.lopez$ *= scale._beads();
        this.content$ *= scale._beads();
        this.quality$ *= scale._hungry();
        this.ivory$ *= scale._hungry();
        this.harold$ *= scale._hungry();
        this.schedule$ *= scale._hungry();
        this.sugar$ *= scale._april();
        this.truly$ *= scale._april();
        this.boston$ *= scale._april();
        this.hilton$ *= scale._april();
    }

    static boolean _banking(Matrix4f mat) {
        if ((double)Math.abs(mat.oriented$ - 1.0f) > 1.0E-4) {
            return false;
        }
        if ((double)Math.abs(mat.ivory$ - 1.0f) > 1.0E-4) {
            return false;
        }
        if ((double)Math.abs(mat.boston$ - 1.0f) > 1.0E-4) {
            return false;
        }
        if ((double)Math.abs(mat.methods$ - 1.0f) > 1.0E-4) {
            return false;
        }
        if ((double)Math.abs(mat.quality$) > 1.0E-4) {
            return false;
        }
        if ((double)Math.abs(mat.sugar$) > 1.0E-4) {
            return false;
        }
        if ((double)Math.abs(mat.beaches$) > 1.0E-4) {
            return false;
        }
        if ((double)Math.abs(mat.wages$) > 1.0E-4) {
            return false;
        }
        if ((double)Math.abs(mat.truly$) > 1.0E-4) {
            return false;
        }
        if ((double)Math.abs(mat.registry$) > 1.0E-4) {
            return false;
        }
        if ((double)Math.abs(mat.lopez$) > 1.0E-4) {
            return false;
        }
        if ((double)Math.abs(mat.harold$) > 1.0E-4) {
            return false;
        }
        if ((double)Math.abs(mat.stated$) > 1.0E-4) {
            return false;
        }
        if ((double)Math.abs(mat.content$) > 1.0E-4) {
            return false;
        }
        if ((double)Math.abs(mat.schedule$) > 1.0E-4) {
            return false;
        }
        return !((double)Math.abs(mat.hilton$) > 1.0E-4);
    }

    public void _creative(Quaternion rotation) {
        Vector3f axis = new Vector3f();
        float angle = rotation._visits(axis);
        Matrix4f matrix4f = new Matrix4f();
        matrix4f._awesome(angle, axis);
        this._curious(matrix4f);
    }

    public Matrix4f _egypt() {
        try {
            return (Matrix4f)super.clone();
        }
        catch (CloneNotSupportedException e2) {
            throw new AssertionError();
        }
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return this._egypt();
    }
}

