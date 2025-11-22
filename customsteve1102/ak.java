/*
 * Decompiled with CFR 0.152.
 */
package customsteve;

import customsteve.aj;
import customsteve.am;
import customsteve.ap_0;
import java.util.logging.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ak {
    static final long a = 1L;
    private static final Logger a = Logger.getLogger(ak.class.getName());
    protected float a;
    protected float b;
    protected float c;
    protected float d;
    protected float e;
    protected float f;
    protected float g;
    protected float h;
    protected float i;
    public static final ak a = new ak(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
    public static final ak b = new ak();

    public ak() {
        this.b();
    }

    public ak(float m00, float m01, float m02, float m10, float m11, float m12, float m20, float m21, float m22) {
        this.a = m00;
        this.b = m01;
        this.c = m02;
        this.d = m10;
        this.e = m11;
        this.f = m12;
        this.g = m20;
        this.h = m21;
        this.i = m22;
    }

    public ak(ak mat) {
        this.a(mat);
    }

    public void a() {
        this.a = aj.h(this.a);
        this.b = aj.h(this.b);
        this.c = aj.h(this.c);
        this.d = aj.h(this.d);
        this.e = aj.h(this.e);
        this.f = aj.h(this.f);
        this.g = aj.h(this.g);
        this.h = aj.h(this.h);
        this.i = aj.h(this.i);
    }

    public ak a(ak matrix) {
        if (null == matrix) {
            this.b();
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
        }
        return this;
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
                }
            }
            case 1: {
                switch (j2) {
                    case 0: {
                        return this.d;
                    }
                    case 1: {
                        return this.e;
                    }
                    case 2: {
                        return this.f;
                    }
                }
            }
            case 2: {
                switch (j2) {
                    case 0: {
                        return this.g;
                    }
                    case 1: {
                        return this.h;
                    }
                    case 2: {
                        return this.i;
                    }
                }
            }
        }
        a.warning("Invalid matrix index.");
        throw new IllegalArgumentException("Invalid indices into matrix.");
    }

    public void a(float[] data, boolean rowMajor) {
        if (data.length == 9) {
            if (rowMajor) {
                data[0] = this.a;
                data[1] = this.b;
                data[2] = this.c;
                data[3] = this.d;
                data[4] = this.e;
                data[5] = this.f;
                data[6] = this.g;
                data[7] = this.h;
                data[8] = this.i;
            } else {
                data[0] = this.a;
                data[1] = this.d;
                data[2] = this.g;
                data[3] = this.b;
                data[4] = this.e;
                data[5] = this.h;
                data[6] = this.c;
                data[7] = this.f;
                data[8] = this.i;
            }
        } else if (data.length == 16) {
            if (rowMajor) {
                data[0] = this.a;
                data[1] = this.b;
                data[2] = this.c;
                data[4] = this.d;
                data[5] = this.e;
                data[6] = this.f;
                data[8] = this.g;
                data[9] = this.h;
                data[10] = this.i;
            } else {
                data[0] = this.a;
                data[1] = this.d;
                data[2] = this.g;
                data[4] = this.b;
                data[5] = this.e;
                data[6] = this.h;
                data[8] = this.c;
                data[9] = this.f;
                data[10] = this.i;
            }
        } else {
            throw new IndexOutOfBoundsException("Array size must be 9 or 16 in Matrix3f.get().");
        }
    }

    public ak b(ak store) {
        if (store == null) {
            store = new ak();
        }
        float mag = 1.0f / aj.n(this.a * this.a + this.d * this.d + this.g * this.g);
        store.a = this.a * mag;
        store.d = this.d * mag;
        store.g = this.g * mag;
        mag = 1.0f / aj.n(this.b * this.b + this.e * this.e + this.h * this.h);
        store.b = this.b * mag;
        store.e = this.e * mag;
        store.h = this.h * mag;
        store.c = store.d * store.h - store.e * store.g;
        store.f = store.b * store.g - store.a * store.h;
        store.i = store.a * store.e - store.b * store.d;
        return store;
    }

    public ak a() {
        return this.b(this);
    }

    public ap_0 a(int i2) {
        return this.a(i2, (ap_0)null);
    }

    public ap_0 a(int i2, ap_0 store) {
        if (store == null) {
            store = new ap_0();
        }
        switch (i2) {
            case 0: {
                store.a = this.a;
                store.b = this.d;
                store.c = this.g;
                break;
            }
            case 1: {
                store.a = this.b;
                store.b = this.e;
                store.c = this.h;
                break;
            }
            case 2: {
                store.a = this.c;
                store.b = this.f;
                store.c = this.i;
                break;
            }
            default: {
                a.warning("Invalid column index.");
                throw new IllegalArgumentException("Invalid column index. " + i2);
            }
        }
        return store;
    }

    public ap_0 b(int i2) {
        return this.b(i2, (ap_0)null);
    }

    public ap_0 b(int i2, ap_0 store) {
        if (store == null) {
            store = new ap_0();
        }
        switch (i2) {
            case 0: {
                store.a = this.a;
                store.b = this.b;
                store.c = this.c;
                break;
            }
            case 1: {
                store.a = this.d;
                store.b = this.e;
                store.c = this.f;
                break;
            }
            case 2: {
                store.a = this.g;
                store.b = this.h;
                store.c = this.i;
                break;
            }
            default: {
                a.warning("Invalid row index.");
                throw new IllegalArgumentException("Invalid row index. " + i2);
            }
        }
        return store;
    }

    public void b(float[] f2, boolean columnMajor) {
        if (columnMajor) {
            f2[0] = this.a;
            f2[1] = this.d;
            f2[2] = this.g;
            f2[3] = this.b;
            f2[4] = this.e;
            f2[5] = this.h;
            f2[6] = this.c;
            f2[7] = this.f;
            f2[8] = this.i;
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
        }
    }

    public ak a(int i2, ap_0 column) {
        if (column == null) {
            a.warning("Column is null. Ignoring.");
            return this;
        }
        switch (i2) {
            case 0: {
                this.a = column.a;
                this.d = column.b;
                this.g = column.c;
                break;
            }
            case 1: {
                this.b = column.a;
                this.e = column.b;
                this.h = column.c;
                break;
            }
            case 2: {
                this.c = column.a;
                this.f = column.b;
                this.i = column.c;
                break;
            }
            default: {
                a.warning("Invalid column index.");
                throw new IllegalArgumentException("Invalid column index. " + i2);
            }
        }
        return this;
    }

    public ak b(int i2, ap_0 row) {
        if (row == null) {
            a.warning("Row is null. Ignoring.");
            return this;
        }
        switch (i2) {
            case 0: {
                this.a = row.a;
                this.b = row.b;
                this.c = row.c;
                break;
            }
            case 1: {
                this.d = row.a;
                this.e = row.b;
                this.f = row.c;
                break;
            }
            case 2: {
                this.g = row.a;
                this.h = row.b;
                this.i = row.c;
                break;
            }
            default: {
                a.warning("Invalid row index.");
                throw new IllegalArgumentException("Invalid row index. " + i2);
            }
        }
        return this;
    }

    public ak a(int i2, int j2, float value) {
        switch (i2) {
            case 0: {
                switch (j2) {
                    case 0: {
                        this.a = value;
                        return this;
                    }
                    case 1: {
                        this.b = value;
                        return this;
                    }
                    case 2: {
                        this.c = value;
                        return this;
                    }
                }
            }
            case 1: {
                switch (j2) {
                    case 0: {
                        this.d = value;
                        return this;
                    }
                    case 1: {
                        this.e = value;
                        return this;
                    }
                    case 2: {
                        this.f = value;
                        return this;
                    }
                }
            }
            case 2: {
                switch (j2) {
                    case 0: {
                        this.g = value;
                        return this;
                    }
                    case 1: {
                        this.h = value;
                        return this;
                    }
                    case 2: {
                        this.i = value;
                        return this;
                    }
                }
            }
        }
        a.warning("Invalid matrix index.");
        throw new IllegalArgumentException("Invalid indices into matrix.");
    }

    public ak a(float[][] matrix) {
        if (matrix.length != 3 || matrix[0].length != 3) {
            throw new IllegalArgumentException("Array must be of size 9.");
        }
        this.a = matrix[0][0];
        this.b = matrix[0][1];
        this.c = matrix[0][2];
        this.d = matrix[1][0];
        this.e = matrix[1][1];
        this.f = matrix[1][2];
        this.g = matrix[2][0];
        this.h = matrix[2][1];
        this.i = matrix[2][2];
        return this;
    }

    public void a(ap_0 uAxis, ap_0 vAxis, ap_0 wAxis) {
        this.a = uAxis.a;
        this.d = uAxis.b;
        this.g = uAxis.c;
        this.b = vAxis.a;
        this.e = vAxis.b;
        this.h = vAxis.c;
        this.c = wAxis.a;
        this.f = wAxis.b;
        this.i = wAxis.c;
    }

    public ak a(float[] matrix) {
        return this.a(matrix, true);
    }

    public ak a(float[] matrix, boolean rowMajor) {
        if (matrix.length != 9) {
            throw new IllegalArgumentException("Array must be of size 9.");
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
        } else {
            this.a = matrix[0];
            this.b = matrix[3];
            this.c = matrix[6];
            this.d = matrix[1];
            this.e = matrix[4];
            this.f = matrix[7];
            this.g = matrix[2];
            this.h = matrix[5];
            this.i = matrix[8];
        }
        return this;
    }

    public ak a(am quaternion) {
        return quaternion.a(this);
    }

    public void b() {
        this.h = 0.0f;
        this.g = 0.0f;
        this.f = 0.0f;
        this.d = 0.0f;
        this.c = 0.0f;
        this.b = 0.0f;
        this.i = 1.0f;
        this.e = 1.0f;
        this.a = 1.0f;
    }

    public boolean a() {
        return this.a == 1.0f && this.b == 0.0f && this.c == 0.0f && this.d == 0.0f && this.e == 1.0f && this.f == 0.0f && this.g == 0.0f && this.h == 0.0f && this.i == 1.0f;
    }

    public void a(float angle, ap_0 axis) {
        ap_0 normAxis = axis.c();
        this.b(angle, normAxis);
    }

    public void b(float angle, ap_0 axis) {
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
        this.d = fXYM + fZSin;
        this.e = fY2 * fOneMinusCos + fCos;
        this.f = fYZM - fXSin;
        this.g = fXZM - fYSin;
        this.h = fYZM + fXSin;
        this.i = fZ2 * fOneMinusCos + fCos;
    }

    public ak c(ak mat) {
        return this.a(mat, null);
    }

    public ak a(ak mat, ak product) {
        if (product == null) {
            product = new ak();
        }
        float temp00 = this.a * mat.a + this.b * mat.d + this.c * mat.g;
        float temp01 = this.a * mat.b + this.b * mat.e + this.c * mat.h;
        float temp02 = this.a * mat.c + this.b * mat.f + this.c * mat.i;
        float temp10 = this.d * mat.a + this.e * mat.d + this.f * mat.g;
        float temp11 = this.d * mat.b + this.e * mat.e + this.f * mat.h;
        float temp12 = this.d * mat.c + this.e * mat.f + this.f * mat.i;
        float temp20 = this.g * mat.a + this.h * mat.d + this.i * mat.g;
        float temp21 = this.g * mat.b + this.h * mat.e + this.i * mat.h;
        float temp22 = this.g * mat.c + this.h * mat.f + this.i * mat.i;
        product.a = temp00;
        product.b = temp01;
        product.c = temp02;
        product.d = temp10;
        product.e = temp11;
        product.f = temp12;
        product.g = temp20;
        product.h = temp21;
        product.i = temp22;
        return product;
    }

    public ap_0 a(ap_0 vec) {
        return this.a(vec, null);
    }

    public ap_0 a(ap_0 vec, ap_0 product) {
        if (null == product) {
            product = new ap_0();
        }
        float x = vec.a;
        float y = vec.b;
        float z = vec.c;
        product.a = this.a * x + this.b * y + this.c * z;
        product.b = this.d * x + this.e * y + this.f * z;
        product.c = this.g * x + this.h * y + this.i * z;
        return product;
    }

    public ak a(float scale) {
        this.a *= scale;
        this.b *= scale;
        this.c *= scale;
        this.d *= scale;
        this.e *= scale;
        this.f *= scale;
        this.g *= scale;
        this.h *= scale;
        this.i *= scale;
        return this;
    }

    public ap_0 b(ap_0 vec) {
        if (vec == null) {
            return null;
        }
        float x = vec.a;
        float y = vec.b;
        vec.a = this.a * x + this.b * y + this.c * vec.c;
        vec.b = this.d * x + this.e * y + this.f * vec.c;
        vec.c = this.g * x + this.h * y + this.i * vec.c;
        return vec;
    }

    public ak d(ak mat) {
        return this.a(mat, this);
    }

    public ak b() {
        float tmp = this.b;
        this.b = this.d;
        this.d = tmp;
        tmp = this.c;
        this.c = this.g;
        this.g = tmp;
        tmp = this.f;
        this.f = this.h;
        this.h = tmp;
        return this;
    }

    public ak c() {
        return this.e(null);
    }

    public ak e(ak store) {
        float det;
        if (store == null) {
            store = new ak();
        }
        if (aj.h(det = this.a()) <= 1.1920929E-7f) {
            return store.f();
        }
        store.a = this.e * this.i - this.f * this.h;
        store.b = this.c * this.h - this.b * this.i;
        store.c = this.b * this.f - this.c * this.e;
        store.d = this.f * this.g - this.d * this.i;
        store.e = this.a * this.i - this.c * this.g;
        store.f = this.c * this.d - this.a * this.f;
        store.g = this.d * this.h - this.e * this.g;
        store.h = this.b * this.g - this.a * this.h;
        store.i = this.a * this.e - this.b * this.d;
        store.a(1.0f / det);
        return store;
    }

    public ak d() {
        float det = this.a();
        if (aj.h(det) <= 0.0f) {
            return this.f();
        }
        float f00 = this.e * this.i - this.f * this.h;
        float f01 = this.c * this.h - this.b * this.i;
        float f02 = this.b * this.f - this.c * this.e;
        float f10 = this.f * this.g - this.d * this.i;
        float f11 = this.a * this.i - this.c * this.g;
        float f12 = this.c * this.d - this.a * this.f;
        float f20 = this.d * this.h - this.e * this.g;
        float f21 = this.b * this.g - this.a * this.h;
        float f22 = this.a * this.e - this.b * this.d;
        this.a = f00;
        this.b = f01;
        this.c = f02;
        this.d = f10;
        this.e = f11;
        this.f = f12;
        this.g = f20;
        this.h = f21;
        this.i = f22;
        this.a(1.0f / det);
        return this;
    }

    public ak e() {
        return this.f(null);
    }

    public ak f(ak store) {
        if (store == null) {
            store = new ak();
        }
        store.a = this.e * this.i - this.f * this.h;
        store.b = this.c * this.h - this.b * this.i;
        store.c = this.b * this.f - this.c * this.e;
        store.d = this.f * this.g - this.d * this.i;
        store.e = this.a * this.i - this.c * this.g;
        store.f = this.c * this.d - this.a * this.f;
        store.g = this.d * this.h - this.e * this.g;
        store.h = this.b * this.g - this.a * this.h;
        store.i = this.a * this.e - this.b * this.d;
        return store;
    }

    public float a() {
        float fCo00 = this.e * this.i - this.f * this.h;
        float fCo10 = this.f * this.g - this.d * this.i;
        float fCo20 = this.d * this.h - this.e * this.g;
        float fDet = this.a * fCo00 + this.b * fCo10 + this.c * fCo20;
        return fDet;
    }

    public ak f() {
        this.i = 0.0f;
        this.h = 0.0f;
        this.g = 0.0f;
        this.f = 0.0f;
        this.e = 0.0f;
        this.d = 0.0f;
        this.c = 0.0f;
        this.b = 0.0f;
        this.a = 0.0f;
        return this;
    }

    public ak g() {
        return this.b();
    }

    public ak h() {
        ak ret = new ak(this.a, this.d, this.g, this.b, this.e, this.h, this.c, this.f, this.i);
        return ret;
    }

    public String toString() {
        StringBuilder result = new StringBuilder("Matrix3f\n[\n");
        result.append(" ");
        result.append(this.a);
        result.append("  ");
        result.append(this.b);
        result.append("  ");
        result.append(this.c);
        result.append(" \n");
        result.append(" ");
        result.append(this.d);
        result.append("  ");
        result.append(this.e);
        result.append("  ");
        result.append(this.f);
        result.append(" \n");
        result.append(" ");
        result.append(this.g);
        result.append("  ");
        result.append(this.h);
        result.append("  ");
        result.append(this.i);
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
        return hash;
    }

    public boolean equals(Object o2) {
        if (!(o2 instanceof ak) || o2 == null) {
            return false;
        }
        if (this == o2) {
            return true;
        }
        ak comp = (ak)o2;
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
        return Float.compare(this.i, comp.i) == 0;
    }

    public void a(ap_0 start, ap_0 end) {
        float f2;
        ap_0 v = new ap_0();
        start.b(end, v);
        float e2 = start.a(end);
        float f3 = f2 = e2 < 0.0f ? -e2 : e2;
        if (f2 > 0.9999f) {
            ap_0 u2 = new ap_0();
            ap_0 x = new ap_0();
            x.a = (double)start.a > 0.0 ? start.a : -start.a;
            x.b = (double)start.b > 0.0 ? start.b : -start.b;
            float f4 = x.c = (double)start.c > 0.0 ? start.c : -start.c;
            if (x.a < x.b) {
                if (x.a < x.c) {
                    x.a = 1.0f;
                    x.c = 0.0f;
                    x.b = 0.0f;
                } else {
                    x.c = 1.0f;
                    x.b = 0.0f;
                    x.a = 0.0f;
                }
            } else if (x.b < x.c) {
                x.b = 1.0f;
                x.c = 0.0f;
                x.a = 0.0f;
            } else {
                x.c = 1.0f;
                x.b = 0.0f;
                x.a = 0.0f;
            }
            u2.a = x.a - start.a;
            u2.b = x.b - start.b;
            u2.c = x.c - start.c;
            v.a = x.a - end.a;
            v.b = x.b - end.b;
            v.c = x.c - end.c;
            float c1 = 2.0f / u2.a(u2);
            float c2 = 2.0f / v.a(v);
            float c3 = c1 * c2 * u2.a(v);
            for (int i2 = 0; i2 < 3; ++i2) {
                float val;
                for (int j2 = 0; j2 < 3; ++j2) {
                    val = -c1 * u2.a(i2) * u2.a(j2) - c2 * v.a(i2) * v.a(j2) + c3 * v.a(i2) * u2.a(j2);
                    this.a(i2, j2, val);
                }
                val = this.a(i2, i2);
                this.a(i2, i2, val + 1.0f);
            }
        } else {
            float h2 = 1.0f / (1.0f + e2);
            float hvx = h2 * v.a;
            float hvz = h2 * v.c;
            float hvxy = hvx * v.b;
            float hvxz = hvx * v.c;
            float hvyz = hvz * v.b;
            this.a(0, 0, e2 + hvx * v.a);
            this.a(0, 1, hvxy - v.c);
            this.a(0, 2, hvxz + v.b);
            this.a(1, 0, hvxy + v.c);
            this.a(1, 1, e2 + h2 * v.b * v.b);
            this.a(1, 2, hvyz - v.a);
            this.a(2, 0, hvxz - v.b);
            this.a(2, 1, hvyz + v.a);
            this.a(2, 2, e2 + hvz * v.c);
        }
    }

    public void a(ap_0 scale) {
        this.a *= scale.a;
        this.d *= scale.a;
        this.g *= scale.a;
        this.b *= scale.b;
        this.e *= scale.b;
        this.h *= scale.b;
        this.c *= scale.c;
        this.f *= scale.c;
        this.i *= scale.c;
    }

    static boolean a(ak mat) {
        if ((double)Math.abs(mat.a - 1.0f) > 1.0E-4) {
            return false;
        }
        if ((double)Math.abs(mat.e - 1.0f) > 1.0E-4) {
            return false;
        }
        if ((double)Math.abs(mat.i - 1.0f) > 1.0E-4) {
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
        if ((double)Math.abs(mat.f) > 1.0E-4) {
            return false;
        }
        if ((double)Math.abs(mat.g) > 1.0E-4) {
            return false;
        }
        return !((double)Math.abs(mat.h) > 1.0E-4);
    }

    public ak i() {
        try {
            return (ak)super.clone();
        }
        catch (CloneNotSupportedException e2) {
            throw new AssertionError();
        }
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return this.i();
    }
}

