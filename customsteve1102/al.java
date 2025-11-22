/*
 * Decompiled with CFR 0.152.
 */
package customsteve;

import customsteve.aj;
import customsteve.ak;
import customsteve.am;
import customsteve.ap_0;
import customsteve.aq_0;
import java.nio.FloatBuffer;
import java.util.logging.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class al {
    static final long a = 1L;
    private static final Logger a = Logger.getLogger(al.class.getName());
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public static final al a = new al(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
    public static final al b = new al();

    public al() {
        this.a();
    }

    public al(float m00, float m01, float m02, float m03, float m10, float m11, float m12, float m13, float m20, float m21, float m22, float m23, float m30, float m31, float m32, float m33) {
        this.a = m00;
        this.b = m01;
        this.c = m02;
        this.d = m03;
        this.e = m10;
        this.f = m11;
        this.g = m12;
        this.h = m13;
        this.i = m20;
        this.j = m21;
        this.k = m22;
        this.l = m23;
        this.m = m30;
        this.n = m31;
        this.o = m32;
        this.p = m33;
    }

    public al(float[] array) {
        this.b(array, false);
    }

    public al(al mat) {
        this.a(mat);
    }

    public void a(al matrix) {
        if (null == matrix) {
            this.a();
        } else {
            this.a = matrix.a;
            this.b = matrix.b;
            this.c = matrix.c;
            this.d = matrix.d;
            this.e = matrix.e;
            this.f = matrix.f;
            this.g = matrix.g;
            this.h = matrix.h;
            this.i = matrix.i;
            this.j = matrix.j;
            this.k = matrix.k;
            this.l = matrix.l;
            this.m = matrix.m;
            this.n = matrix.n;
            this.o = matrix.o;
            this.p = matrix.p;
        }
    }

    public void a(float[] matrix) {
        this.a(matrix, true);
    }

    public float[] a() {
        float[] f2 = new float[16];
        this.a(f2, false);
        return f2;
    }

    public void a(float[] matrix, boolean rowMajor) {
        if (matrix.length != 16) {
            throw new IllegalArgumentException("Array must be of size 16.");
        }
        if (rowMajor) {
            matrix[0] = this.a;
            matrix[1] = this.b;
            matrix[2] = this.c;
            matrix[3] = this.d;
            matrix[4] = this.e;
            matrix[5] = this.f;
            matrix[6] = this.g;
            matrix[7] = this.h;
            matrix[8] = this.i;
            matrix[9] = this.j;
            matrix[10] = this.k;
            matrix[11] = this.l;
            matrix[12] = this.m;
            matrix[13] = this.n;
            matrix[14] = this.o;
            matrix[15] = this.p;
        } else {
            matrix[0] = this.a;
            matrix[4] = this.b;
            matrix[8] = this.c;
            matrix[12] = this.d;
            matrix[1] = this.e;
            matrix[5] = this.f;
            matrix[9] = this.g;
            matrix[13] = this.h;
            matrix[2] = this.i;
            matrix[6] = this.j;
            matrix[10] = this.k;
            matrix[14] = this.l;
            matrix[3] = this.m;
            matrix[7] = this.n;
            matrix[11] = this.o;
            matrix[15] = this.p;
        }
    }

    public float a(int i2, int j2) {
        switch (i2) {
            case 0: {
                switch (j2) {
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
            }
            case 1: {
                switch (j2) {
                    case 0: {
                        return this.e;
                    }
                    case 1: {
                        return this.f;
                    }
                    case 2: {
                        return this.g;
                    }
                    case 3: {
                        return this.h;
                    }
                }
            }
            case 2: {
                switch (j2) {
                    case 0: {
                        return this.i;
                    }
                    case 1: {
                        return this.j;
                    }
                    case 2: {
                        return this.k;
                    }
                    case 3: {
                        return this.l;
                    }
                }
            }
            case 3: {
                switch (j2) {
                    case 0: {
                        return this.m;
                    }
                    case 1: {
                        return this.n;
                    }
                    case 2: {
                        return this.o;
                    }
                    case 3: {
                        return this.p;
                    }
                }
            }
        }
        a.warning("Invalid matrix index.");
        throw new IllegalArgumentException("Invalid indices into matrix.");
    }

    public float[] a(int i2) {
        return this.a(i2, (float[])null);
    }

    public float[] a(int i2, float[] store) {
        if (store == null) {
            store = new float[4];
        }
        switch (i2) {
            case 0: {
                store[0] = this.a;
                store[1] = this.e;
                store[2] = this.i;
                store[3] = this.m;
                break;
            }
            case 1: {
                store[0] = this.b;
                store[1] = this.f;
                store[2] = this.j;
                store[3] = this.n;
                break;
            }
            case 2: {
                store[0] = this.c;
                store[1] = this.g;
                store[2] = this.k;
                store[3] = this.o;
                break;
            }
            case 3: {
                store[0] = this.d;
                store[1] = this.h;
                store[2] = this.l;
                store[3] = this.p;
                break;
            }
            default: {
                a.warning("Invalid column index.");
                throw new IllegalArgumentException("Invalid column index. " + i2);
            }
        }
        return store;
    }

    public void a(int i2, float[] column) {
        if (column == null) {
            a.warning("Column is null. Ignoring.");
            return;
        }
        switch (i2) {
            case 0: {
                this.a = column[0];
                this.e = column[1];
                this.i = column[2];
                this.m = column[3];
                break;
            }
            case 1: {
                this.b = column[0];
                this.f = column[1];
                this.j = column[2];
                this.n = column[3];
                break;
            }
            case 2: {
                this.c = column[0];
                this.g = column[1];
                this.k = column[2];
                this.o = column[3];
                break;
            }
            case 3: {
                this.d = column[0];
                this.h = column[1];
                this.l = column[2];
                this.p = column[3];
                break;
            }
            default: {
                a.warning("Invalid column index.");
                throw new IllegalArgumentException("Invalid column index. " + i2);
            }
        }
    }

    public void a(int i2, int j2, float value) {
        switch (i2) {
            case 0: {
                switch (j2) {
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
            }
            case 1: {
                switch (j2) {
                    case 0: {
                        this.e = value;
                        return;
                    }
                    case 1: {
                        this.f = value;
                        return;
                    }
                    case 2: {
                        this.g = value;
                        return;
                    }
                    case 3: {
                        this.h = value;
                        return;
                    }
                }
            }
            case 2: {
                switch (j2) {
                    case 0: {
                        this.i = value;
                        return;
                    }
                    case 1: {
                        this.j = value;
                        return;
                    }
                    case 2: {
                        this.k = value;
                        return;
                    }
                    case 3: {
                        this.l = value;
                        return;
                    }
                }
            }
            case 3: {
                switch (j2) {
                    case 0: {
                        this.m = value;
                        return;
                    }
                    case 1: {
                        this.n = value;
                        return;
                    }
                    case 2: {
                        this.o = value;
                        return;
                    }
                    case 3: {
                        this.p = value;
                        return;
                    }
                }
            }
        }
        a.warning("Invalid matrix index.");
        throw new IllegalArgumentException("Invalid indices into matrix.");
    }

    public void a(float[][] matrix) {
        if (matrix.length != 4 || matrix[0].length != 4) {
            throw new IllegalArgumentException("Array must be of size 16.");
        }
        this.a = matrix[0][0];
        this.b = matrix[0][1];
        this.c = matrix[0][2];
        this.d = matrix[0][3];
        this.e = matrix[1][0];
        this.f = matrix[1][1];
        this.g = matrix[1][2];
        this.h = matrix[1][3];
        this.i = matrix[2][0];
        this.j = matrix[2][1];
        this.k = matrix[2][2];
        this.l = matrix[2][3];
        this.m = matrix[3][0];
        this.n = matrix[3][1];
        this.o = matrix[3][2];
        this.p = matrix[3][3];
    }

    public void a(float m00, float m01, float m02, float m03, float m10, float m11, float m12, float m13, float m20, float m21, float m22, float m23, float m30, float m31, float m32, float m33) {
        this.a = m00;
        this.b = m01;
        this.c = m02;
        this.d = m03;
        this.e = m10;
        this.f = m11;
        this.g = m12;
        this.h = m13;
        this.i = m20;
        this.j = m21;
        this.k = m22;
        this.l = m23;
        this.m = m30;
        this.n = m31;
        this.o = m32;
        this.p = m33;
    }

    public al a(al matrix) {
        this.a = matrix.a;
        this.b = matrix.b;
        this.c = matrix.c;
        this.d = matrix.d;
        this.e = matrix.e;
        this.f = matrix.f;
        this.g = matrix.g;
        this.h = matrix.h;
        this.i = matrix.i;
        this.j = matrix.j;
        this.k = matrix.k;
        this.l = matrix.l;
        this.m = matrix.m;
        this.n = matrix.n;
        this.o = matrix.o;
        this.p = matrix.p;
        return this;
    }

    public void b(float[] matrix) {
        this.b(matrix, true);
    }

    public void b(float[] matrix, boolean rowMajor) {
        if (matrix.length != 16) {
            throw new IllegalArgumentException("Array must be of size 16.");
        }
        if (rowMajor) {
            this.a = matrix[0];
            this.b = matrix[1];
            this.c = matrix[2];
            this.d = matrix[3];
            this.e = matrix[4];
            this.f = matrix[5];
            this.g = matrix[6];
            this.h = matrix[7];
            this.i = matrix[8];
            this.j = matrix[9];
            this.k = matrix[10];
            this.l = matrix[11];
            this.m = matrix[12];
            this.n = matrix[13];
            this.o = matrix[14];
            this.p = matrix[15];
        } else {
            this.a = matrix[0];
            this.b = matrix[4];
            this.c = matrix[8];
            this.d = matrix[12];
            this.e = matrix[1];
            this.f = matrix[5];
            this.g = matrix[9];
            this.h = matrix[13];
            this.i = matrix[2];
            this.j = matrix[6];
            this.k = matrix[10];
            this.l = matrix[14];
            this.m = matrix[3];
            this.n = matrix[7];
            this.o = matrix[11];
            this.p = matrix[15];
        }
    }

    public al a() {
        float[] tmp = new float[16];
        this.a(tmp, true);
        al mat = new al(tmp);
        return mat;
    }

    public al b() {
        float tmp = this.b;
        this.b = this.e;
        this.e = tmp;
        tmp = this.c;
        this.c = this.i;
        this.i = tmp;
        tmp = this.d;
        this.d = this.m;
        this.m = tmp;
        tmp = this.g;
        this.g = this.j;
        this.j = tmp;
        tmp = this.h;
        this.h = this.n;
        this.n = tmp;
        tmp = this.l;
        this.l = this.o;
        this.o = tmp;
        return this;
    }

    public void c(float[] f2, boolean columnMajor) {
        if (columnMajor) {
            f2[0] = this.a;
            f2[1] = this.e;
            f2[2] = this.i;
            f2[3] = this.m;
            f2[4] = this.b;
            f2[5] = this.f;
            f2[6] = this.j;
            f2[7] = this.n;
            f2[8] = this.c;
            f2[9] = this.g;
            f2[10] = this.k;
            f2[11] = this.o;
            f2[12] = this.d;
            f2[13] = this.h;
            f2[14] = this.l;
            f2[15] = this.p;
        } else {
            f2[0] = this.a;
            f2[1] = this.b;
            f2[2] = this.c;
            f2[3] = this.d;
            f2[4] = this.e;
            f2[5] = this.f;
            f2[6] = this.g;
            f2[7] = this.h;
            f2[8] = this.i;
            f2[9] = this.j;
            f2[10] = this.k;
            f2[11] = this.l;
            f2[12] = this.m;
            f2[13] = this.n;
            f2[14] = this.o;
            f2[15] = this.p;
        }
    }

    public al a(FloatBuffer fb) {
        return this.a(fb, false);
    }

    public al a(FloatBuffer fb, boolean columnMajor) {
        if (columnMajor) {
            this.a = fb.get();
            this.e = fb.get();
            this.i = fb.get();
            this.m = fb.get();
            this.b = fb.get();
            this.f = fb.get();
            this.j = fb.get();
            this.n = fb.get();
            this.c = fb.get();
            this.g = fb.get();
            this.k = fb.get();
            this.o = fb.get();
            this.d = fb.get();
            this.h = fb.get();
            this.l = fb.get();
            this.p = fb.get();
        } else {
            this.a = fb.get();
            this.b = fb.get();
            this.c = fb.get();
            this.d = fb.get();
            this.e = fb.get();
            this.f = fb.get();
            this.g = fb.get();
            this.h = fb.get();
            this.i = fb.get();
            this.j = fb.get();
            this.k = fb.get();
            this.l = fb.get();
            this.m = fb.get();
            this.n = fb.get();
            this.o = fb.get();
            this.p = fb.get();
        }
        return this;
    }

    public void a() {
        this.d = 0.0f;
        this.c = 0.0f;
        this.b = 0.0f;
        this.h = 0.0f;
        this.g = 0.0f;
        this.e = 0.0f;
        this.l = 0.0f;
        this.j = 0.0f;
        this.i = 0.0f;
        this.o = 0.0f;
        this.n = 0.0f;
        this.m = 0.0f;
        this.p = 1.0f;
        this.k = 1.0f;
        this.f = 1.0f;
        this.a = 1.0f;
    }

    public void a(float near, float far, float left, float right, float top, float bottom, boolean parallel) {
        this.a();
        if (parallel) {
            this.a = 2.0f / (right - left);
            this.f = 2.0f / (top - bottom);
            this.k = -2.0f / (far - near);
            this.p = 1.0f;
            this.d = -(right + left) / (right - left);
            this.h = -(top + bottom) / (top - bottom);
            this.l = -(far + near) / (far - near);
        } else {
            this.a = 2.0f * near / (right - left);
            this.f = 2.0f * near / (top - bottom);
            this.o = -1.0f;
            this.p = -0.0f;
            this.c = (right + left) / (right - left);
            this.g = (top + bottom) / (top - bottom);
            this.k = -(far + near) / (far - near);
            this.l = -(2.0f * far * near) / (far - near);
        }
    }

    public void a(float angle, ap_0 axis) {
        ap_0 normAxis = axis.c();
        this.b(angle, normAxis);
    }

    public void b(float angle, ap_0 axis) {
        this.g();
        this.p = 1.0f;
        float fCos = aj.e(angle);
        float fSin = aj.f(angle);
        float fOneMinusCos = 1.0f - fCos;
        float fX2 = axis.a * axis.a;
        float fY2 = axis.b * axis.b;
        float fZ2 = axis.c * axis.c;
        float fXYM = axis.a * axis.b * fOneMinusCos;
        float fXZM = axis.a * axis.c * fOneMinusCos;
        float fYZM = axis.b * axis.c * fOneMinusCos;
        float fXSin = axis.a * fSin;
        float fYSin = axis.b * fSin;
        float fZSin = axis.c * fSin;
        this.a = fX2 * fOneMinusCos + fCos;
        this.b = fXYM - fZSin;
        this.c = fXZM + fYSin;
        this.e = fXYM + fZSin;
        this.f = fY2 * fOneMinusCos + fCos;
        this.g = fYZM - fXSin;
        this.i = fXZM - fYSin;
        this.j = fYZM + fXSin;
        this.k = fZ2 * fOneMinusCos + fCos;
    }

    public void a(float scalar) {
        this.a *= scalar;
        this.b *= scalar;
        this.c *= scalar;
        this.d *= scalar;
        this.e *= scalar;
        this.f *= scalar;
        this.g *= scalar;
        this.h *= scalar;
        this.i *= scalar;
        this.j *= scalar;
        this.k *= scalar;
        this.l *= scalar;
        this.m *= scalar;
        this.n *= scalar;
        this.o *= scalar;
        this.p *= scalar;
    }

    public al a(float scalar) {
        al out = new al();
        out.a(this);
        out.a(scalar);
        return out;
    }

    public al a(float scalar, al store) {
        store.a(this);
        store.a(scalar);
        return store;
    }

    public al b(al in2) {
        return this.a(in2, null);
    }

    public al a(al in2, al store) {
        if (store == null) {
            store = new al();
        }
        float temp00 = this.a * in2.a + this.b * in2.e + this.c * in2.i + this.d * in2.m;
        float temp01 = this.a * in2.b + this.b * in2.f + this.c * in2.j + this.d * in2.n;
        float temp02 = this.a * in2.c + this.b * in2.g + this.c * in2.k + this.d * in2.o;
        float temp03 = this.a * in2.d + this.b * in2.h + this.c * in2.l + this.d * in2.p;
        float temp10 = this.e * in2.a + this.f * in2.e + this.g * in2.i + this.h * in2.m;
        float temp11 = this.e * in2.b + this.f * in2.f + this.g * in2.j + this.h * in2.n;
        float temp12 = this.e * in2.c + this.f * in2.g + this.g * in2.k + this.h * in2.o;
        float temp13 = this.e * in2.d + this.f * in2.h + this.g * in2.l + this.h * in2.p;
        float temp20 = this.i * in2.a + this.j * in2.e + this.k * in2.i + this.l * in2.m;
        float temp21 = this.i * in2.b + this.j * in2.f + this.k * in2.j + this.l * in2.n;
        float temp22 = this.i * in2.c + this.j * in2.g + this.k * in2.k + this.l * in2.o;
        float temp23 = this.i * in2.d + this.j * in2.h + this.k * in2.l + this.l * in2.p;
        float temp30 = this.m * in2.a + this.n * in2.e + this.o * in2.i + this.p * in2.m;
        float temp31 = this.m * in2.b + this.n * in2.f + this.o * in2.j + this.p * in2.n;
        float temp32 = this.m * in2.c + this.n * in2.g + this.o * in2.k + this.p * in2.o;
        float temp33 = this.m * in2.d + this.n * in2.h + this.o * in2.l + this.p * in2.p;
        store.a = temp00;
        store.b = temp01;
        store.c = temp02;
        store.d = temp03;
        store.e = temp10;
        store.f = temp11;
        store.g = temp12;
        store.h = temp13;
        store.i = temp20;
        store.j = temp21;
        store.k = temp22;
        store.l = temp23;
        store.m = temp30;
        store.n = temp31;
        store.o = temp32;
        store.p = temp33;
        return store;
    }

    public al c(al in2) {
        return this.a(in2, this);
    }

    public ap_0 a(ap_0 vec) {
        return this.a(vec, null);
    }

    public ap_0 a(ap_0 vec, ap_0 store) {
        if (store == null) {
            store = new ap_0();
        }
        float vx = vec.a;
        float vy = vec.b;
        float vz = vec.c;
        store.a = this.a * vx + this.b * vy + this.c * vz + this.d;
        store.b = this.e * vx + this.f * vy + this.g * vz + this.h;
        store.c = this.i * vx + this.j * vy + this.k * vz + this.l;
        return store;
    }

    public aq_0 a(aq_0 vec) {
        return this.a(vec, null);
    }

    public aq_0 a(aq_0 vec, aq_0 store) {
        if (null == vec) {
            a.warning("Source vector is null, null result returned.");
            return null;
        }
        if (store == null) {
            store = new aq_0();
        }
        float vx = vec.a;
        float vy = vec.b;
        float vz = vec.c;
        float vw = vec.d;
        store.a = this.a * vx + this.b * vy + this.c * vz + this.d * vw;
        store.b = this.e * vx + this.f * vy + this.g * vz + this.h * vw;
        store.c = this.i * vx + this.j * vy + this.k * vz + this.l * vw;
        store.d = this.m * vx + this.n * vy + this.o * vz + this.p * vw;
        return store;
    }

    public aq_0 b(aq_0 vec) {
        return this.b(vec, null);
    }

    public aq_0 b(aq_0 vec, aq_0 store) {
        if (null == vec) {
            a.warning("Source vector is null, null result returned.");
            return null;
        }
        if (store == null) {
            store = new aq_0();
        }
        float vx = vec.a;
        float vy = vec.b;
        float vz = vec.c;
        float vw = vec.d;
        store.a = this.a * vx + this.e * vy + this.i * vz + this.m * vw;
        store.b = this.b * vx + this.f * vy + this.j * vz + this.n * vw;
        store.c = this.c * vx + this.g * vy + this.k * vz + this.o * vw;
        store.d = this.d * vx + this.h * vy + this.l * vz + this.p * vw;
        return store;
    }

    public ap_0 b(ap_0 vec, ap_0 store) {
        if (store == null) {
            store = new ap_0();
        }
        float vx = vec.a;
        float vy = vec.b;
        float vz = vec.c;
        store.a = this.a * vx + this.b * vy + this.c * vz;
        store.b = this.e * vx + this.f * vy + this.g * vz;
        store.c = this.i * vx + this.j * vy + this.k * vz;
        return store;
    }

    public ap_0 c(ap_0 vec, ap_0 store) {
        if (store == null) {
            store = new ap_0();
        }
        float vx = vec.a;
        float vy = vec.b;
        float vz = vec.c;
        store.a = this.a * vx + this.e * vy + this.i * vz;
        store.b = this.b * vx + this.f * vy + this.j * vz;
        store.c = this.c * vx + this.g * vy + this.k * vz;
        return store;
    }

    public float a(ap_0 vec, ap_0 store) {
        float vx = vec.a;
        float vy = vec.b;
        float vz = vec.c;
        store.a = this.a * vx + this.b * vy + this.c * vz + this.d;
        store.b = this.e * vx + this.f * vy + this.g * vz + this.h;
        store.c = this.i * vx + this.j * vy + this.k * vz + this.l;
        return this.m * vx + this.n * vy + this.o * vz + this.p;
    }

    public ap_0 d(ap_0 vec, ap_0 store) {
        if (null == vec) {
            a.warning("Source vector is null, null result returned.");
            return null;
        }
        if (store == null) {
            store = new ap_0();
        }
        float vx = vec.a;
        float vy = vec.b;
        float vz = vec.c;
        store.a = this.a * vx + this.e * vy + this.i * vz + this.m * 1.0f;
        store.b = this.b * vx + this.f * vy + this.j * vz + this.n * 1.0f;
        store.c = this.c * vx + this.g * vy + this.k * vz + this.o * 1.0f;
        return store;
    }

    public am a(am vec, am store) {
        if (null == vec) {
            a.warning("Source vector is null, null result returned.");
            return null;
        }
        if (store == null) {
            store = new am();
        }
        float x = this.a * vec.a + this.e * vec.b + this.i * vec.c + this.m * vec.d;
        float y = this.b * vec.a + this.f * vec.b + this.j * vec.c + this.n * vec.d;
        float z = this.c * vec.a + this.g * vec.b + this.k * vec.c + this.o * vec.d;
        float w2 = this.d * vec.a + this.h * vec.b + this.l * vec.c + this.p * vec.d;
        store.a = x;
        store.b = y;
        store.c = z;
        store.d = w2;
        return store;
    }

    public float[] a(float[] vec4f) {
        if (null == vec4f || vec4f.length != 4) {
            a.warning("invalid array given, must be nonnull and length 4");
            return null;
        }
        float x = vec4f[0];
        float y = vec4f[1];
        float z = vec4f[2];
        float w2 = vec4f[3];
        vec4f[0] = this.a * x + this.b * y + this.c * z + this.d * w2;
        vec4f[1] = this.e * x + this.f * y + this.g * z + this.h * w2;
        vec4f[2] = this.i * x + this.j * y + this.k * z + this.l * w2;
        vec4f[3] = this.m * x + this.n * y + this.o * z + this.p * w2;
        return vec4f;
    }

    public float[] b(float[] vec4f) {
        if (null == vec4f || vec4f.length != 4) {
            a.warning("invalid array given, must be nonnull and length 4");
            return null;
        }
        float x = vec4f[0];
        float y = vec4f[1];
        float z = vec4f[2];
        float w2 = vec4f[3];
        vec4f[0] = this.a * x + this.e * y + this.i * z + this.m * w2;
        vec4f[1] = this.b * x + this.f * y + this.j * z + this.n * w2;
        vec4f[2] = this.c * x + this.g * y + this.k * z + this.o * w2;
        vec4f[3] = this.d * x + this.h * y + this.l * z + this.p * w2;
        return vec4f;
    }

    public al c() {
        ak inv = this.a().g();
        this.b(new am().a(inv));
        this.d(inv.a(this.a().a()));
        return this;
    }

    public al d() {
        return this.d((al)null);
    }

    public al d(al store) {
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
            store = new al();
        }
        if (aj.h(fDet = (fA0 = this.a * this.f - this.b * this.e) * (fB5 = this.k * this.p - this.l * this.o) - (fA1 = this.a * this.g - this.c * this.e) * (fB4 = this.j * this.p - this.l * this.n) + (fA2 = this.a * this.h - this.d * this.e) * (fB3 = this.j * this.o - this.k * this.n) + (fA3 = this.b * this.g - this.c * this.f) * (fB2 = this.i * this.p - this.l * this.m) - (fA4 = this.b * this.h - this.d * this.f) * (fB1 = this.i * this.o - this.k * this.m) + (fA5 = this.c * this.h - this.d * this.g) * (fB0 = this.i * this.n - this.j * this.m)) <= 0.0f) {
            throw new ArithmeticException("This matrix cannot be inverted");
        }
        store.a = this.f * fB5 - this.g * fB4 + this.h * fB3;
        store.e = -this.e * fB5 + this.g * fB2 - this.h * fB1;
        store.i = this.e * fB4 - this.f * fB2 + this.h * fB0;
        store.m = -this.e * fB3 + this.f * fB1 - this.g * fB0;
        store.b = -this.b * fB5 + this.c * fB4 - this.d * fB3;
        store.f = this.a * fB5 - this.c * fB2 + this.d * fB1;
        store.j = -this.a * fB4 + this.b * fB2 - this.d * fB0;
        store.n = this.a * fB3 - this.b * fB1 + this.c * fB0;
        store.c = this.n * fA5 - this.o * fA4 + this.p * fA3;
        store.g = -this.m * fA5 + this.o * fA2 - this.p * fA1;
        store.k = this.m * fA4 - this.n * fA2 + this.p * fA0;
        store.o = -this.m * fA3 + this.n * fA1 - this.o * fA0;
        store.d = -this.j * fA5 + this.k * fA4 - this.l * fA3;
        store.h = this.i * fA5 - this.k * fA2 + this.l * fA1;
        store.l = -this.i * fA4 + this.j * fA2 - this.l * fA0;
        store.p = this.i * fA3 - this.j * fA1 + this.k * fA0;
        float fInvDet = 1.0f / fDet;
        store.a(fInvDet);
        return store;
    }

    public al e() {
        float fA0 = this.a * this.f - this.b * this.e;
        float fB5 = this.k * this.p - this.l * this.o;
        float fA1 = this.a * this.g - this.c * this.e;
        float fB4 = this.j * this.p - this.l * this.n;
        float fA2 = this.a * this.h - this.d * this.e;
        float fB3 = this.j * this.o - this.k * this.n;
        float fA3 = this.b * this.g - this.c * this.f;
        float fB2 = this.i * this.p - this.l * this.m;
        float fA4 = this.b * this.h - this.d * this.f;
        float fB1 = this.i * this.o - this.k * this.m;
        float fA5 = this.c * this.h - this.d * this.g;
        float fB0 = this.i * this.n - this.j * this.m;
        float fDet = fA0 * fB5 - fA1 * fB4 + fA2 * fB3 + fA3 * fB2 - fA4 * fB1 + fA5 * fB0;
        if (aj.h(fDet) <= 0.0f) {
            return this.g();
        }
        float f00 = this.f * fB5 - this.g * fB4 + this.h * fB3;
        float f10 = -this.e * fB5 + this.g * fB2 - this.h * fB1;
        float f20 = this.e * fB4 - this.f * fB2 + this.h * fB0;
        float f30 = -this.e * fB3 + this.f * fB1 - this.g * fB0;
        float f01 = -this.b * fB5 + this.c * fB4 - this.d * fB3;
        float f11 = this.a * fB5 - this.c * fB2 + this.d * fB1;
        float f21 = -this.a * fB4 + this.b * fB2 - this.d * fB0;
        float f31 = this.a * fB3 - this.b * fB1 + this.c * fB0;
        float f02 = this.n * fA5 - this.o * fA4 + this.p * fA3;
        float f12 = -this.m * fA5 + this.o * fA2 - this.p * fA1;
        float f22 = this.m * fA4 - this.n * fA2 + this.p * fA0;
        float f32 = -this.m * fA3 + this.n * fA1 - this.o * fA0;
        float f03 = -this.j * fA5 + this.k * fA4 - this.l * fA3;
        float f13 = this.i * fA5 - this.k * fA2 + this.l * fA1;
        float f23 = -this.i * fA4 + this.j * fA2 - this.l * fA0;
        float f33 = this.i * fA3 - this.j * fA1 + this.k * fA0;
        this.a = f00;
        this.b = f01;
        this.c = f02;
        this.d = f03;
        this.e = f10;
        this.f = f11;
        this.g = f12;
        this.h = f13;
        this.i = f20;
        this.j = f21;
        this.k = f22;
        this.l = f23;
        this.m = f30;
        this.n = f31;
        this.o = f32;
        this.p = f33;
        float fInvDet = 1.0f / fDet;
        this.a(fInvDet);
        return this;
    }

    public al f() {
        return this.e((al)null);
    }

    public void a(ap_0 position, ap_0 scale, ak rotMat) {
        this.a = scale.a * rotMat.a;
        this.b = scale.b * rotMat.b;
        this.c = scale.c * rotMat.c;
        this.d = position.a;
        this.e = scale.a * rotMat.d;
        this.f = scale.b * rotMat.e;
        this.g = scale.c * rotMat.f;
        this.h = position.b;
        this.i = scale.a * rotMat.g;
        this.j = scale.b * rotMat.h;
        this.k = scale.c * rotMat.i;
        this.l = position.c;
        this.m = 0.0f;
        this.n = 0.0f;
        this.o = 0.0f;
        this.p = 1.0f;
    }

    public al e(al store) {
        if (store == null) {
            store = new al();
        }
        float fA0 = this.a * this.f - this.b * this.e;
        float fA1 = this.a * this.g - this.c * this.e;
        float fA2 = this.a * this.h - this.d * this.e;
        float fA3 = this.b * this.g - this.c * this.f;
        float fA4 = this.b * this.h - this.d * this.f;
        float fA5 = this.c * this.h - this.d * this.g;
        float fB0 = this.i * this.n - this.j * this.m;
        float fB1 = this.i * this.o - this.k * this.m;
        float fB2 = this.i * this.p - this.l * this.m;
        float fB3 = this.j * this.o - this.k * this.n;
        float fB4 = this.j * this.p - this.l * this.n;
        float fB5 = this.k * this.p - this.l * this.o;
        store.a = this.f * fB5 - this.g * fB4 + this.h * fB3;
        store.e = -this.e * fB5 + this.g * fB2 - this.h * fB1;
        store.i = this.e * fB4 - this.f * fB2 + this.h * fB0;
        store.m = -this.e * fB3 + this.f * fB1 - this.g * fB0;
        store.b = -this.b * fB5 + this.c * fB4 - this.d * fB3;
        store.f = this.a * fB5 - this.c * fB2 + this.d * fB1;
        store.j = -this.a * fB4 + this.b * fB2 - this.d * fB0;
        store.n = this.a * fB3 - this.b * fB1 + this.c * fB0;
        store.c = this.n * fA5 - this.o * fA4 + this.p * fA3;
        store.g = -this.m * fA5 + this.o * fA2 - this.p * fA1;
        store.k = this.m * fA4 - this.n * fA2 + this.p * fA0;
        store.o = -this.m * fA3 + this.n * fA1 - this.o * fA0;
        store.d = -this.j * fA5 + this.k * fA4 - this.l * fA3;
        store.h = this.i * fA5 - this.k * fA2 + this.l * fA1;
        store.l = -this.i * fA4 + this.j * fA2 - this.l * fA0;
        store.p = this.i * fA3 - this.j * fA1 + this.k * fA0;
        return store;
    }

    public float a() {
        float fA0 = this.a * this.f - this.b * this.e;
        float fA1 = this.a * this.g - this.c * this.e;
        float fA2 = this.a * this.h - this.d * this.e;
        float fA3 = this.b * this.g - this.c * this.f;
        float fA4 = this.b * this.h - this.d * this.f;
        float fA5 = this.c * this.h - this.d * this.g;
        float fB0 = this.i * this.n - this.j * this.m;
        float fB1 = this.i * this.o - this.k * this.m;
        float fB2 = this.i * this.p - this.l * this.m;
        float fB3 = this.j * this.o - this.k * this.n;
        float fB4 = this.j * this.p - this.l * this.n;
        float fB5 = this.k * this.p - this.l * this.o;
        float fDet = fA0 * fB5 - fA1 * fB4 + fA2 * fB3 + fA3 * fB2 - fA4 * fB1 + fA5 * fB0;
        return fDet;
    }

    public al g() {
        this.d = 0.0f;
        this.c = 0.0f;
        this.b = 0.0f;
        this.a = 0.0f;
        this.h = 0.0f;
        this.g = 0.0f;
        this.f = 0.0f;
        this.e = 0.0f;
        this.l = 0.0f;
        this.k = 0.0f;
        this.j = 0.0f;
        this.i = 0.0f;
        this.p = 0.0f;
        this.o = 0.0f;
        this.n = 0.0f;
        this.m = 0.0f;
        return this;
    }

    public al f(al mat) {
        al result = new al();
        result.a = this.a + mat.a;
        result.b = this.b + mat.b;
        result.c = this.c + mat.c;
        result.d = this.d + mat.d;
        result.e = this.e + mat.e;
        result.f = this.f + mat.f;
        result.g = this.g + mat.g;
        result.h = this.h + mat.h;
        result.i = this.i + mat.i;
        result.j = this.j + mat.j;
        result.k = this.k + mat.k;
        result.l = this.l + mat.l;
        result.m = this.m + mat.m;
        result.n = this.n + mat.n;
        result.o = this.o + mat.o;
        result.p = this.p + mat.p;
        return result;
    }

    public void b(al mat) {
        this.a += mat.a;
        this.b += mat.b;
        this.c += mat.c;
        this.d += mat.d;
        this.e += mat.e;
        this.f += mat.f;
        this.g += mat.g;
        this.h += mat.h;
        this.i += mat.i;
        this.j += mat.j;
        this.k += mat.k;
        this.l += mat.l;
        this.m += mat.m;
        this.n += mat.n;
        this.o += mat.o;
        this.p += mat.p;
    }

    public ap_0 a() {
        return new ap_0(this.d, this.h, this.l);
    }

    public void a(ap_0 vector) {
        vector.a(this.d, this.h, this.l);
    }

    public am a() {
        am quat = new am();
        quat.a(this.a());
        return quat;
    }

    public void a(am q2) {
        q2.a(this.a());
    }

    public ak a() {
        return new ak(this.a, this.b, this.c, this.e, this.f, this.g, this.i, this.j, this.k);
    }

    public void a(ak m3f) {
        this.a = m3f.a;
        this.b = m3f.b;
        this.c = m3f.c;
        this.e = m3f.d;
        this.f = m3f.e;
        this.g = m3f.f;
        this.i = m3f.g;
        this.j = m3f.h;
        this.k = m3f.i;
    }

    public void b(ak mat) {
        mat.a = this.a;
        mat.b = this.b;
        mat.c = this.c;
        mat.d = this.e;
        mat.e = this.f;
        mat.f = this.g;
        mat.g = this.i;
        mat.h = this.j;
        mat.i = this.k;
    }

    public ap_0 b() {
        ap_0 result = new ap_0();
        this.b(result);
        return result;
    }

    public void b(ap_0 vector) {
        float scaleX = (float)Math.sqrt(this.a * this.a + this.e * this.e + this.i * this.i);
        float scaleY = (float)Math.sqrt(this.b * this.b + this.f * this.f + this.j * this.j);
        float scaleZ = (float)Math.sqrt(this.c * this.c + this.g * this.g + this.k * this.k);
        vector.a(scaleX, scaleY, scaleZ);
    }

    public void a(float x, float y, float z) {
        this.a *= x;
        this.f *= y;
        this.k *= z;
    }

    public void c(ap_0 scale) {
        this.a *= scale.a;
        this.f *= scale.b;
        this.k *= scale.c;
    }

    public void c(float[] translation) {
        if (translation.length != 3) {
            throw new IllegalArgumentException("Translation size must be 3.");
        }
        this.d = translation[0];
        this.h = translation[1];
        this.l = translation[2];
    }

    public void b(float x, float y, float z) {
        this.d = x;
        this.h = y;
        this.l = z;
    }

    public void d(ap_0 translation) {
        this.d = translation.a;
        this.h = translation.b;
        this.l = translation.c;
    }

    public void d(float[] translation) {
        if (translation.length != 3) {
            throw new IllegalArgumentException("Translation size must be 3.");
        }
        this.d = -translation[0];
        this.h = -translation[1];
        this.l = -translation[2];
    }

    public void e(ap_0 angles) {
        float angle = angles.c * ((float)Math.PI / 180);
        float sy = aj.f(angle);
        float cy = aj.e(angle);
        angle = angles.b * ((float)Math.PI / 180);
        float sp = aj.f(angle);
        float cp = aj.e(angle);
        angle = angles.a * ((float)Math.PI / 180);
        float sr = aj.f(angle);
        float cr = aj.e(angle);
        this.a = cp * cy;
        this.e = cp * sy;
        this.i = -sp;
        this.b = sr * sp * cy + cr * -sy;
        this.f = sr * sp * sy + cr * cy;
        this.j = sr * cp;
        this.c = cr * sp * cy + -sr * -sy;
        this.g = cr * sp * sy + -sr * cy;
        this.k = cr * cp;
        this.d = 0.0f;
        this.h = 0.0f;
        this.l = 0.0f;
    }

    public void b(am quat) {
        quat.a(this);
    }

    public void e(float[] angles) {
        if (angles.length != 3) {
            throw new IllegalArgumentException("Angles must be of size 3.");
        }
        double cr = aj.e(angles[0]);
        double sr = aj.f(angles[0]);
        double cp = aj.e(angles[1]);
        double sp = aj.f(angles[1]);
        double cy = aj.e(angles[2]);
        double sy = aj.f(angles[2]);
        this.a = (float)(cp * cy);
        this.e = (float)(cp * sy);
        this.i = (float)(-sp);
        double srsp = sr * sp;
        double crsp = cr * sp;
        this.b = (float)(srsp * cy - cr * sy);
        this.f = (float)(srsp * sy + cr * cy);
        this.j = (float)(sr * cp);
        this.c = (float)(crsp * cy + sr * sy);
        this.g = (float)(crsp * sy - sr * cy);
        this.k = (float)(cr * cp);
    }

    public void f(float[] angles) {
        if (angles.length != 3) {
            throw new IllegalArgumentException("Angles must be of size 3.");
        }
        float[] vec = new float[]{angles[0] * 57.295776f, angles[1] * 57.295776f, angles[2] * 57.295776f};
        this.e(vec);
    }

    public void g(float[] vec) {
        if (vec.length != 3) {
            throw new IllegalArgumentException("vec must be of size 3.");
        }
        vec[0] = vec[0] - this.d;
        vec[1] = vec[1] - this.h;
        vec[2] = vec[2] - this.l;
    }

    public void f(ap_0 data) {
        data.a -= this.d;
        data.b -= this.h;
        data.c -= this.l;
    }

    public void g(ap_0 data) {
        data.a += this.d;
        data.b += this.h;
        data.c += this.l;
    }

    public void h(ap_0 vec) {
        float vx = vec.a;
        float vy = vec.b;
        float vz = vec.c;
        vec.a = vx * this.a + vy * this.e + vz * this.i;
        vec.b = vx * this.b + vy * this.f + vz * this.j;
        vec.c = vx * this.c + vy * this.g + vz * this.k;
    }

    public void i(ap_0 vec) {
        float vx = vec.a;
        float vy = vec.b;
        float vz = vec.c;
        vec.a = vx * this.a + vy * this.b + vz * this.c;
        vec.b = vx * this.e + vy * this.f + vz * this.g;
        vec.c = vx * this.i + vy * this.j + vz * this.k;
    }

    public String toString() {
        StringBuilder result = new StringBuilder("Matrix4f\n[\n");
        result.append(" ");
        result.append(this.a);
        result.append("  ");
        result.append(this.b);
        result.append("  ");
        result.append(this.c);
        result.append("  ");
        result.append(this.d);
        result.append(" \n");
        result.append(" ");
        result.append(this.e);
        result.append("  ");
        result.append(this.f);
        result.append("  ");
        result.append(this.g);
        result.append("  ");
        result.append(this.h);
        result.append(" \n");
        result.append(" ");
        result.append(this.i);
        result.append("  ");
        result.append(this.j);
        result.append("  ");
        result.append(this.k);
        result.append("  ");
        result.append(this.l);
        result.append(" \n");
        result.append(" ");
        result.append(this.m);
        result.append("  ");
        result.append(this.n);
        result.append("  ");
        result.append(this.o);
        result.append("  ");
        result.append(this.p);
        result.append(" \n]");
        return result.toString();
    }

    public int hashCode() {
        int hash = 37;
        hash = 37 * hash + Float.floatToIntBits(this.a);
        hash = 37 * hash + Float.floatToIntBits(this.b);
        hash = 37 * hash + Float.floatToIntBits(this.c);
        hash = 37 * hash + Float.floatToIntBits(this.d);
        hash = 37 * hash + Float.floatToIntBits(this.e);
        hash = 37 * hash + Float.floatToIntBits(this.f);
        hash = 37 * hash + Float.floatToIntBits(this.g);
        hash = 37 * hash + Float.floatToIntBits(this.h);
        hash = 37 * hash + Float.floatToIntBits(this.i);
        hash = 37 * hash + Float.floatToIntBits(this.j);
        hash = 37 * hash + Float.floatToIntBits(this.k);
        hash = 37 * hash + Float.floatToIntBits(this.l);
        hash = 37 * hash + Float.floatToIntBits(this.m);
        hash = 37 * hash + Float.floatToIntBits(this.n);
        hash = 37 * hash + Float.floatToIntBits(this.o);
        hash = 37 * hash + Float.floatToIntBits(this.p);
        return hash;
    }

    public boolean equals(Object o2) {
        if (!(o2 instanceof al) || o2 == null) {
            return false;
        }
        if (this == o2) {
            return true;
        }
        al comp = (al)o2;
        if (Float.compare(this.a, comp.a) != 0) {
            return false;
        }
        if (Float.compare(this.b, comp.b) != 0) {
            return false;
        }
        if (Float.compare(this.c, comp.c) != 0) {
            return false;
        }
        if (Float.compare(this.d, comp.d) != 0) {
            return false;
        }
        if (Float.compare(this.e, comp.e) != 0) {
            return false;
        }
        if (Float.compare(this.f, comp.f) != 0) {
            return false;
        }
        if (Float.compare(this.g, comp.g) != 0) {
            return false;
        }
        if (Float.compare(this.h, comp.h) != 0) {
            return false;
        }
        if (Float.compare(this.i, comp.i) != 0) {
            return false;
        }
        if (Float.compare(this.j, comp.j) != 0) {
            return false;
        }
        if (Float.compare(this.k, comp.k) != 0) {
            return false;
        }
        if (Float.compare(this.l, comp.l) != 0) {
            return false;
        }
        if (Float.compare(this.m, comp.m) != 0) {
            return false;
        }
        if (Float.compare(this.n, comp.n) != 0) {
            return false;
        }
        if (Float.compare(this.o, comp.o) != 0) {
            return false;
        }
        return Float.compare(this.p, comp.p) == 0;
    }

    public boolean a() {
        return this.a == 1.0f && this.b == 0.0f && this.c == 0.0f && this.d == 0.0f && this.e == 0.0f && this.f == 1.0f && this.g == 0.0f && this.h == 0.0f && this.i == 0.0f && this.j == 0.0f && this.k == 1.0f && this.l == 0.0f && this.m == 0.0f && this.n == 0.0f && this.o == 0.0f && this.p == 1.0f;
    }

    public al b(al src, al dest) {
        if (dest == null) {
            dest = new al();
        }
        dest.a = -src.a;
        dest.b = -src.b;
        dest.c = -src.c;
        dest.d = -src.d;
        dest.e = -src.e;
        dest.f = -src.f;
        dest.g = -src.g;
        dest.h = -src.h;
        dest.i = -src.i;
        dest.j = -src.j;
        dest.k = -src.k;
        dest.l = -src.l;
        dest.m = -src.m;
        dest.n = -src.n;
        dest.o = -src.o;
        dest.p = -src.p;
        return dest;
    }

    public void j(ap_0 scale) {
        this.a *= scale.c();
        this.e *= scale.c();
        this.i *= scale.c();
        this.m *= scale.c();
        this.b *= scale.d();
        this.f *= scale.d();
        this.j *= scale.d();
        this.n *= scale.d();
        this.c *= scale.e();
        this.g *= scale.e();
        this.k *= scale.e();
        this.o *= scale.e();
    }

    static boolean a(al mat) {
        if ((double)Math.abs(mat.a - 1.0f) > 1.0E-4) {
            return false;
        }
        if ((double)Math.abs(mat.f - 1.0f) > 1.0E-4) {
            return false;
        }
        if ((double)Math.abs(mat.k - 1.0f) > 1.0E-4) {
            return false;
        }
        if ((double)Math.abs(mat.p - 1.0f) > 1.0E-4) {
            return false;
        }
        if ((double)Math.abs(mat.b) > 1.0E-4) {
            return false;
        }
        if ((double)Math.abs(mat.c) > 1.0E-4) {
            return false;
        }
        if ((double)Math.abs(mat.d) > 1.0E-4) {
            return false;
        }
        if ((double)Math.abs(mat.e) > 1.0E-4) {
            return false;
        }
        if ((double)Math.abs(mat.g) > 1.0E-4) {
            return false;
        }
        if ((double)Math.abs(mat.h) > 1.0E-4) {
            return false;
        }
        if ((double)Math.abs(mat.i) > 1.0E-4) {
            return false;
        }
        if ((double)Math.abs(mat.j) > 1.0E-4) {
            return false;
        }
        if ((double)Math.abs(mat.l) > 1.0E-4) {
            return false;
        }
        if ((double)Math.abs(mat.m) > 1.0E-4) {
            return false;
        }
        if ((double)Math.abs(mat.n) > 1.0E-4) {
            return false;
        }
        return !((double)Math.abs(mat.o) > 1.0E-4);
    }

    public void c(am rotation) {
        ap_0 axis = new ap_0();
        float angle = rotation.a(axis);
        al matrix4f = new al();
        matrix4f.a(angle, axis);
        this.c(matrix4f);
    }

    public al h() {
        try {
            return (al)super.clone();
        }
        catch (CloneNotSupportedException e2) {
            throw new AssertionError();
        }
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return this.h();
    }
}

