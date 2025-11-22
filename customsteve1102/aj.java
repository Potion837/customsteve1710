/*
 * Decompiled with CFR 0.152.
 */
package customsteve;

import customsteve.ao;
import customsteve.ap_0;
import java.util.Random;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class aj {
    public static final double a = 2.220446049250313E-16;
    public static final float a = 1.1920929E-7f;
    public static final float b = 1.0E-4f;
    public static final float c = 0.33333334f;
    public static final float d = (float)Math.PI;
    public static final float e = (float)Math.PI * 2;
    public static final float f = 1.5707964f;
    public static final float g = 0.7853982f;
    public static final float h = 0.31830987f;
    public static final float i = 0.15915494f;
    public static final float j = (float)Math.PI / 180;
    public static final float k = 57.295776f;
    public static final Random a = new Random(System.currentTimeMillis());
    public static final float l = (float)Math.PI / 180;

    private aj() {
    }

    public static boolean a(int number) {
        return number > 0 && (number & number - 1) == 0;
    }

    public static int a(int number) {
        return (int)Math.pow(2.0, Math.ceil(Math.log(number) / Math.log(2.0)));
    }

    public static float a(float scale, float startValue, float endValue) {
        if (startValue == endValue) {
            return startValue;
        }
        if (scale <= 0.0f) {
            return startValue;
        }
        if (scale >= 1.0f) {
            return endValue;
        }
        return (1.0f - scale) * startValue + scale * endValue;
    }

    public static ap_0 a(float scale, ap_0 startValue, ap_0 endValue, ap_0 store) {
        if (store == null) {
            store = new ap_0();
        }
        store.a = aj.a(scale, startValue.a, endValue.a);
        store.b = aj.a(scale, startValue.b, endValue.b);
        store.c = aj.a(scale, startValue.c, endValue.c);
        return store;
    }

    public static ap_0 a(float scale, ap_0 startValue, ap_0 endValue) {
        return aj.a(scale, startValue, endValue, null);
    }

    public static float b(float scale, float startValue, float endValue) {
        return (1.0f - scale) * startValue + scale * endValue;
    }

    public static ap_0 b(float scale, ap_0 startValue, ap_0 endValue, ap_0 store) {
        if (store == null) {
            store = new ap_0();
        }
        store.a = aj.b(scale, startValue.a, endValue.a);
        store.b = aj.b(scale, startValue.b, endValue.b);
        store.c = aj.b(scale, startValue.c, endValue.c);
        return store;
    }

    public static ap_0 b(float scale, ap_0 startValue, ap_0 endValue) {
        return aj.b(scale, startValue, endValue, null);
    }

    public static float a(float u2, float T2, float p0, float p1, float p2, float p3) {
        float c1 = p1;
        float c2 = -1.0f * T2 * p0 + T2 * p2;
        float c3 = 2.0f * T2 * p0 + (T2 - 3.0f) * p1 + (3.0f - 2.0f * T2) * p2 + -T2 * p3;
        float c4 = -T2 * p0 + (2.0f - T2) * p1 + (T2 - 2.0f) * p2 + T2 * p3;
        return ((c4 * u2 + c3) * u2 + c2) * u2 + c1;
    }

    public static ap_0 a(float u2, float T2, ap_0 p0, ap_0 p1, ap_0 p2, ap_0 p3, ap_0 store) {
        if (store == null) {
            store = new ap_0();
        }
        store.a = aj.a(u2, T2, p0.a, p1.a, p2.a, p3.a);
        store.b = aj.a(u2, T2, p0.b, p1.b, p2.b, p3.b);
        store.c = aj.a(u2, T2, p0.c, p1.c, p2.c, p3.c);
        return store;
    }

    public static ap_0 a(float u2, float T2, ap_0 p0, ap_0 p1, ap_0 p2, ap_0 p3) {
        return aj.a(u2, T2, p0, p1, p2, p3, null);
    }

    public static float a(float u2, float p0, float p1, float p2, float p3) {
        float oneMinusU = 1.0f - u2;
        float oneMinusU2 = oneMinusU * oneMinusU;
        float u22 = u2 * u2;
        return p0 * oneMinusU2 * oneMinusU + 3.0f * p1 * u2 * oneMinusU2 + 3.0f * p2 * u22 * oneMinusU + p3 * u22 * u2;
    }

    public static ap_0 a(float u2, ap_0 p0, ap_0 p1, ap_0 p2, ap_0 p3, ap_0 store) {
        if (store == null) {
            store = new ap_0();
        }
        store.a = aj.a(u2, p0.a, p1.a, p2.a, p3.a);
        store.b = aj.a(u2, p0.b, p1.b, p2.b, p3.b);
        store.c = aj.a(u2, p0.c, p1.c, p2.c, p3.c);
        return store;
    }

    public static ap_0 a(float u2, ap_0 p0, ap_0 p1, ap_0 p2, ap_0 p3) {
        return aj.a(u2, p0, p1, p2, p3, null);
    }

    public static float a(ap_0 p0, ap_0 p1, ap_0 p2, ap_0 p3, float startRange, float endRange, float curveTension) {
        float l2;
        float l1;
        float len;
        float epsilon = 0.001f;
        float middleValue = (startRange + endRange) * 0.5f;
        ap_0 start = p1.f();
        if (startRange != 0.0f) {
            aj.a(startRange, curveTension, p0, p1, p2, p3, start);
        }
        ap_0 end = p2.f();
        if (endRange != 1.0f) {
            aj.a(endRange, curveTension, p0, p1, p2, p3, end);
        }
        ap_0 middle = aj.a(middleValue, curveTension, p0, p1, p2, p3);
        float l3 = end.l(start).a();
        if (l3 + epsilon < (len = (l1 = middle.l(start).a()) + (l2 = end.l(middle).a()))) {
            l1 = aj.a(p0, p1, p2, p3, startRange, middleValue, curveTension);
            l2 = aj.a(p0, p1, p2, p3, middleValue, endRange, curveTension);
        }
        l3 = l1 + l2;
        return l3;
    }

    public static float a(ap_0 p0, ap_0 p1, ap_0 p2, ap_0 p3) {
        float delta = 0.02f;
        float result = 0.0f;
        ap_0 v1 = p0.f();
        ap_0 v2 = new ap_0();
        for (float t = 0.0f; t <= 1.0f; t += delta) {
            aj.a(t, p0, p1, p2, p3, v2);
            result += v1.m(v2).a();
            v1.a(v2);
        }
        return result;
    }

    public static float a(float fValue) {
        if (-1.0f < fValue) {
            if (fValue < 1.0f) {
                return (float)Math.acos(fValue);
            }
            return 0.0f;
        }
        return (float)Math.PI;
    }

    public static float b(float fValue) {
        if (-1.0f < fValue) {
            if (fValue < 1.0f) {
                return (float)Math.asin(fValue);
            }
            return 1.5707964f;
        }
        return -1.5707964f;
    }

    public static float c(float fValue) {
        return (float)Math.atan(fValue);
    }

    public static float a(float fY, float fX) {
        return (float)Math.atan2(fY, fX);
    }

    public static float d(float fValue) {
        return (float)Math.ceil(fValue);
    }

    public static float e(float v) {
        return (float)Math.cos(v);
    }

    public static float f(float v) {
        return (float)Math.sin(v);
    }

    public static float g(float fValue) {
        return (float)Math.exp(fValue);
    }

    public static float h(float fValue) {
        if (fValue < 0.0f) {
            return -fValue;
        }
        return fValue;
    }

    public static float i(float fValue) {
        return (float)Math.floor(fValue);
    }

    public static float j(float fValue) {
        return (float)(1.0 / Math.sqrt(fValue));
    }

    public static float k(float x) {
        float xhalf = 0.5f * x;
        int i2 = Float.floatToIntBits(x);
        i2 = 1597463174 - (i2 >> 1);
        x = Float.intBitsToFloat(i2);
        x *= 1.5f - xhalf * x * x;
        return x;
    }

    public static float l(float fValue) {
        return (float)Math.log(fValue);
    }

    public static float b(float value, float base) {
        return (float)(Math.log(value) / Math.log(base));
    }

    public static float c(float fBase, float fExponent) {
        return (float)Math.pow(fBase, fExponent);
    }

    public static float m(float fValue) {
        return fValue * fValue;
    }

    public static float n(float fValue) {
        return (float)Math.sqrt(fValue);
    }

    public static float o(float fValue) {
        return (float)Math.tan(fValue);
    }

    public static int b(int iValue) {
        if (iValue > 0) {
            return 1;
        }
        if (iValue < 0) {
            return -1;
        }
        return 0;
    }

    public static float p(float fValue) {
        return Math.signum(fValue);
    }

    public static int a(ao p0, ao p1, ao p2) {
        float dx1 = p1.a - p0.a;
        float dy2 = p2.b - p0.b;
        float dy1 = p1.b - p0.b;
        float dx2 = p2.a - p0.a;
        if (dx1 * dy2 > dy1 * dx2) {
            return 1;
        }
        if (dx1 * dy2 < dy1 * dx2) {
            return -1;
        }
        if (dx1 * dx2 < 0.0f || dy1 * dy2 < 0.0f) {
            return -1;
        }
        if (dx1 * dx1 + dy1 * dy1 < dx2 * dx2 + dy2 * dy2) {
            return 1;
        }
        return 0;
    }

    public static int a(ao t0, ao t1, ao t2, ao p2) {
        int val1 = aj.a(t0, t1, p2);
        if (val1 == 0) {
            return 1;
        }
        int val2 = aj.a(t1, t2, p2);
        if (val2 == 0) {
            return 1;
        }
        if (val2 != val1) {
            return 0;
        }
        int val3 = aj.a(t2, t0, p2);
        if (val3 == 0) {
            return 1;
        }
        if (val3 != val1) {
            return 0;
        }
        return val3;
    }

    public static ap_0 a(ap_0 v1, ap_0 v2, ap_0 v3) {
        ap_0 a1 = v1.l(v2);
        ap_0 a2 = v3.l(v2);
        return a2.e(a1).d();
    }

    public static float a(double m00, double m01, double m02, double m03, double m10, double m11, double m12, double m13, double m20, double m21, double m22, double m23, double m30, double m31, double m32, double m33) {
        double det01 = m20 * m31 - m21 * m30;
        double det02 = m20 * m32 - m22 * m30;
        double det03 = m20 * m33 - m23 * m30;
        double det12 = m21 * m32 - m22 * m31;
        double det13 = m21 * m33 - m23 * m31;
        double det23 = m22 * m33 - m23 * m32;
        return (float)(m00 * (m11 * det23 - m12 * det13 + m13 * det12) - m01 * (m10 * det23 - m12 * det03 + m13 * det02) + m02 * (m10 * det13 - m11 * det03 + m13 * det01) - m03 * (m10 * det12 - m11 * det02 + m12 * det01));
    }

    public static float a() {
        return a.nextFloat();
    }

    public static int a(int min, int max) {
        return (int)(aj.a() * (float)(max - min + 1)) + min;
    }

    public static int a() {
        return a.nextInt();
    }

    public static ap_0 a(ap_0 sphereCoords, ap_0 store) {
        if (store == null) {
            store = new ap_0();
        }
        store.b = sphereCoords.a * aj.f(sphereCoords.c);
        float a2 = sphereCoords.a * aj.e(sphereCoords.c);
        store.a = a2 * aj.e(sphereCoords.b);
        store.c = a2 * aj.f(sphereCoords.b);
        return store;
    }

    public static ap_0 b(ap_0 cartCoords, ap_0 store) {
        float x;
        if (store == null) {
            store = new ap_0();
        }
        if ((x = cartCoords.a) == 0.0f) {
            x = 1.1920929E-7f;
        }
        store.a = aj.n(x * x + cartCoords.b * cartCoords.b + cartCoords.c * cartCoords.c);
        store.b = aj.c(cartCoords.c / x);
        if (x < 0.0f) {
            store.b += (float)Math.PI;
        }
        store.c = aj.b(cartCoords.b / store.a);
        return store;
    }

    public static ap_0 c(ap_0 sphereCoords, ap_0 store) {
        if (store == null) {
            store = new ap_0();
        }
        store.c = sphereCoords.a * aj.f(sphereCoords.c);
        float a2 = sphereCoords.a * aj.e(sphereCoords.c);
        store.a = a2 * aj.e(sphereCoords.b);
        store.b = a2 * aj.f(sphereCoords.b);
        return store;
    }

    public static ap_0 d(ap_0 cartCoords, ap_0 store) {
        float x;
        if (store == null) {
            store = new ap_0();
        }
        if ((x = cartCoords.a) == 0.0f) {
            x = 1.1920929E-7f;
        }
        store.a = aj.n(x * x + cartCoords.b * cartCoords.b + cartCoords.c * cartCoords.c);
        store.c = aj.c(cartCoords.c / x);
        if (x < 0.0f) {
            store.c += (float)Math.PI;
        }
        store.b = aj.b(cartCoords.b / store.a);
        return store;
    }

    public static float c(float val, float min, float max) {
        if (Float.isInfinite(val) || Float.isNaN(val)) {
            return 0.0f;
        }
        float range = max - min;
        while (val > max) {
            val -= range;
        }
        while (val < min) {
            val += range;
        }
        return val;
    }

    public static float d(float x, float y) {
        if (y >= 0.0f && x <= 0.0f) {
            return -x;
        }
        if (y < 0.0f && x >= 0.0f) {
            return -x;
        }
        return x;
    }

    public static float d(float input, float min, float max) {
        return input < min ? min : (input > max ? max : input);
    }

    public static float q(float input) {
        return aj.d(input, 0.0f, 1.0f);
    }

    public static float a(short half) {
        switch (half) {
            case 0: {
                return 0.0f;
            }
            case 32768: {
                return -0.0f;
            }
            case 31744: {
                return Float.POSITIVE_INFINITY;
            }
            case 64512: {
                return Float.NEGATIVE_INFINITY;
            }
        }
        return Float.intBitsToFloat((half & 0x8000) << 16 | (half & 0x7C00) + 114688 << 13 | (half & 0x3FF) << 13);
    }

    public static short a(float flt) {
        if (Float.isNaN(flt)) {
            throw new UnsupportedOperationException("NaN to half conversion not supported!");
        }
        if (flt == Float.POSITIVE_INFINITY) {
            return 31744;
        }
        if (flt == Float.NEGATIVE_INFINITY) {
            return -1024;
        }
        if (flt == 0.0f) {
            return 0;
        }
        if (flt == -0.0f) {
            return Short.MIN_VALUE;
        }
        if (flt > 65504.0f) {
            return 31743;
        }
        if (flt < -65504.0f) {
            return -1025;
        }
        if (flt > 0.0f && flt < 5.96046E-8f) {
            return 1;
        }
        if (flt < 0.0f && flt > -5.96046E-8f) {
            return -32767;
        }
        int f2 = Float.floatToIntBits(flt);
        return (short)(f2 >> 16 & 0x8000 | (f2 & 0x7F800000) - 0x38000000 >> 13 & 0x7C00 | f2 >> 13 & 0x3FF);
    }
}

