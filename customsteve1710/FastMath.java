/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public final class FastMath {
    public static final double guide$ = 2.220446049250313E-16;
    public static final float colleges$ = 1.1920929E-7f;
    public static final float proud$ = 1.0E-4f;
    public static final float national$ = 0.33333334f;
    public static final float sandra$ = (float)Math.PI;
    public static final float ocean$ = (float)Math.PI * 2;
    public static final float dairy$ = 1.5707964f;
    public static final float synopsis$ = 0.7853982f;
    public static final float marina$ = 0.31830987f;
    public static final float himself$ = 0.15915494f;
    public static final float organize$ = (float)Math.PI / 180;
    public static final float realtor$ = 57.295776f;
    public static final Random setup$ = new Random(System.currentTimeMillis());
    public static final float robert$ = (float)Math.PI / 180;

    private FastMath() {
    }

    public static boolean _charged(int number) {
        return number > 0 && (number & number - 1) == 0;
    }

    public static int _novel(int number) {
        return (int)Math.pow(2.0, Math.ceil(Math.log(number) / Math.log(2.0)));
    }

    public static float _stand(float scale, float startValue, float endValue) {
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

    public static Vector3f _injury(float scale, Vector3f startValue, Vector3f endValue, Vector3f store) {
        if (store == null) {
            store = new Vector3f();
        }
        store.serves$ = FastMath._stand(scale, startValue.serves$, endValue.serves$);
        store.genius$ = FastMath._stand(scale, startValue.genius$, endValue.genius$);
        store.superb$ = FastMath._stand(scale, startValue.superb$, endValue.superb$);
        return store;
    }

    public static Vector3f _copied(float scale, Vector3f startValue, Vector3f endValue) {
        return FastMath._injury(scale, startValue, endValue, null);
    }

    public static float _walter(float scale, float startValue, float endValue) {
        return (1.0f - scale) * startValue + scale * endValue;
    }

    public static Vector3f _surface(float scale, Vector3f startValue, Vector3f endValue, Vector3f store) {
        if (store == null) {
            store = new Vector3f();
        }
        store.serves$ = FastMath._walter(scale, startValue.serves$, endValue.serves$);
        store.genius$ = FastMath._walter(scale, startValue.genius$, endValue.genius$);
        store.superb$ = FastMath._walter(scale, startValue.superb$, endValue.superb$);
        return store;
    }

    public static Vector3f _battery(float scale, Vector3f startValue, Vector3f endValue) {
        return FastMath._surface(scale, startValue, endValue, null);
    }

    public static float _vermont(float u, float T, float p0, float p1, float p2, float p3) {
        float c1 = p1;
        float c2 = -1.0f * T * p0 + T * p2;
        float c3 = 2.0f * T * p0 + (T - 3.0f) * p1 + (3.0f - 2.0f * T) * p2 + -T * p3;
        float c4 = -T * p0 + (2.0f - T) * p1 + (T - 2.0f) * p2 + T * p3;
        return ((c4 * u + c3) * u + c2) * u + c1;
    }

    public static Vector3f _payroll(float u, float T, Vector3f p0, Vector3f p1, Vector3f p2, Vector3f p3, Vector3f store) {
        if (store == null) {
            store = new Vector3f();
        }
        store.serves$ = FastMath._vermont(u, T, p0.serves$, p1.serves$, p2.serves$, p3.serves$);
        store.genius$ = FastMath._vermont(u, T, p0.genius$, p1.genius$, p2.genius$, p3.genius$);
        store.superb$ = FastMath._vermont(u, T, p0.superb$, p1.superb$, p2.superb$, p3.superb$);
        return store;
    }

    public static Vector3f _stunning(float u, float T, Vector3f p0, Vector3f p1, Vector3f p2, Vector3f p3) {
        return FastMath._payroll(u, T, p0, p1, p2, p3, null);
    }

    public static float _bottle(float u, float p0, float p1, float p2, float p3) {
        float oneMinusU = 1.0f - u;
        float oneMinusU2 = oneMinusU * oneMinusU;
        float u2 = u * u;
        return p0 * oneMinusU2 * oneMinusU + 3.0f * p1 * u * oneMinusU2 + 3.0f * p2 * u2 * oneMinusU + p3 * u2 * u;
    }

    public static Vector3f _fifteen(float u, Vector3f p0, Vector3f p1, Vector3f p2, Vector3f p3, Vector3f store) {
        if (store == null) {
            store = new Vector3f();
        }
        store.serves$ = FastMath._bottle(u, p0.serves$, p1.serves$, p2.serves$, p3.serves$);
        store.genius$ = FastMath._bottle(u, p0.genius$, p1.genius$, p2.genius$, p3.genius$);
        store.superb$ = FastMath._bottle(u, p0.superb$, p1.superb$, p2.superb$, p3.superb$);
        return store;
    }

    public static Vector3f _carrying(float u, Vector3f p0, Vector3f p1, Vector3f p2, Vector3f p3) {
        return FastMath._fifteen(u, p0, p1, p2, p3, null);
    }

    public static float _format(Vector3f p0, Vector3f p1, Vector3f p2, Vector3f p3, float startRange, float endRange, float curveTension) {
        float l2;
        float l1;
        float len;
        float epsilon = 0.001f;
        float middleValue = (startRange + endRange) * 0.5f;
        Vector3f start = p1._minimal();
        if (startRange != 0.0f) {
            FastMath._payroll(startRange, curveTension, p0, p1, p2, p3, start);
        }
        Vector3f end = p2._minimal();
        if (endRange != 1.0f) {
            FastMath._payroll(endRange, curveTension, p0, p1, p2, p3, end);
        }
        Vector3f middle = FastMath._stunning(middleValue, curveTension, p0, p1, p2, p3);
        float l = end._based(start)._commands();
        if (l + epsilon < (len = (l1 = middle._based(start)._commands()) + (l2 = end._based(middle)._commands()))) {
            l1 = FastMath._format(p0, p1, p2, p3, startRange, middleValue, curveTension);
            l2 = FastMath._format(p0, p1, p2, p3, middleValue, endRange, curveTension);
        }
        l = l1 + l2;
        return l;
    }

    public static float _spies(Vector3f p0, Vector3f p1, Vector3f p2, Vector3f p3) {
        float delta = 0.02f;
        float result = 0.0f;
        Vector3f v1 = p0._minimal();
        Vector3f v2 = new Vector3f();
        for (float t = 0.0f; t <= 1.0f; t += delta) {
            FastMath._fifteen(t, p0, p1, p2, p3, v2);
            result += v1._designed(v2)._commands();
            v1._shoot(v2);
        }
        return result;
    }

    public static float _coding(float fValue) {
        if (-1.0f < fValue) {
            if (fValue < 1.0f) {
                return (float)Math.acos(fValue);
            }
            return 0.0f;
        }
        return (float)Math.PI;
    }

    public static float _latina(float fValue) {
        if (-1.0f < fValue) {
            if (fValue < 1.0f) {
                return (float)Math.asin(fValue);
            }
            return 1.5707964f;
        }
        return -1.5707964f;
    }

    public static float _fraud(float fValue) {
        return (float)Math.atan(fValue);
    }

    public static float _brunette(float fY, float fX) {
        return (float)Math.atan2(fY, fX);
    }

    public static float _aware(float fValue) {
        return (float)Math.ceil(fValue);
    }

    public static float _country(float v) {
        return (float)Math.cos(v);
    }

    public static float _booth(float v) {
        return (float)Math.sin(v);
    }

    public static float _calls(float fValue) {
        return (float)Math.exp(fValue);
    }

    public static float _videos(float fValue) {
        if (fValue < 0.0f) {
            return -fValue;
        }
        return fValue;
    }

    public static float _ancient(float fValue) {
        return (float)Math.floor(fValue);
    }

    public static float _shops(float fValue) {
        return (float)(1.0 / Math.sqrt(fValue));
    }

    public static float _sonic(float x) {
        float xhalf = 0.5f * x;
        int i = Float.floatToIntBits(x);
        i = 1597463174 - (i >> 1);
        x = Float.intBitsToFloat(i);
        x *= 1.5f - xhalf * x * x;
        return x;
    }

    public static float _thomson(float fValue) {
        return (float)Math.log(fValue);
    }

    public static float _arrived(float value, float base) {
        return (float)(Math.log(value) / Math.log(base));
    }

    public static float _theme(float fBase, float fExponent) {
        return (float)Math.pow(fBase, fExponent);
    }

    public static float _genetics(float fValue) {
        return fValue * fValue;
    }

    public static float _runtime(float fValue) {
        return (float)Math.sqrt(fValue);
    }

    public static float _appeal(float fValue) {
        return (float)Math.tan(fValue);
    }

    public static int _podcast(int iValue) {
        if (iValue > 0) {
            return 1;
        }
        if (iValue < 0) {
            return -1;
        }
        return 0;
    }

    public static float _stops(float fValue) {
        return Math.signum(fValue);
    }

    public static int _scales(Vector2f p0, Vector2f p1, Vector2f p2) {
        float dx1 = p1.removing$ - p0.removing$;
        float dy2 = p2.writings$ - p0.writings$;
        float dy1 = p1.writings$ - p0.writings$;
        float dx2 = p2.removing$ - p0.removing$;
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

    public static int _invest(Vector2f t0, Vector2f t1, Vector2f t2, Vector2f p) {
        int val1 = FastMath._scales(t0, t1, p);
        if (val1 == 0) {
            return 1;
        }
        int val2 = FastMath._scales(t1, t2, p);
        if (val2 == 0) {
            return 1;
        }
        if (val2 != val1) {
            return 0;
        }
        int val3 = FastMath._scales(t2, t0, p);
        if (val3 == 0) {
            return 1;
        }
        if (val3 != val1) {
            return 0;
        }
        return val3;
    }

    public static Vector3f _listed(Vector3f v1, Vector3f v2, Vector3f v3) {
        Vector3f a1 = v1._based(v2);
        Vector3f a2 = v3._based(v2);
        return a2._knight(a1)._press();
    }

    public static float _training(double m00, double m01, double m02, double m03, double m10, double m11, double m12, double m13, double m20, double m21, double m22, double m23, double m30, double m31, double m32, double m33) {
        double det01 = m20 * m31 - m21 * m30;
        double det02 = m20 * m32 - m22 * m30;
        double det03 = m20 * m33 - m23 * m30;
        double det12 = m21 * m32 - m22 * m31;
        double det13 = m21 * m33 - m23 * m31;
        double det23 = m22 * m33 - m23 * m32;
        return (float)(m00 * (m11 * det23 - m12 * det13 + m13 * det12) - m01 * (m10 * det23 - m12 * det03 + m13 * det02) + m02 * (m10 * det13 - m11 * det03 + m13 * det01) - m03 * (m10 * det12 - m11 * det02 + m12 * det01));
    }

    public static float _trans() {
        return setup$.nextFloat();
    }

    public static int _doors(int min, int max) {
        return (int)(FastMath._trans() * (float)(max - min + 1)) + min;
    }

    public static int _extend() {
        return setup$.nextInt();
    }

    public static Vector3f _heater(Vector3f sphereCoords, Vector3f store) {
        if (store == null) {
            store = new Vector3f();
        }
        store.genius$ = sphereCoords.serves$ * FastMath._booth(sphereCoords.superb$);
        float a2 = sphereCoords.serves$ * FastMath._country(sphereCoords.superb$);
        store.serves$ = a2 * FastMath._country(sphereCoords.genius$);
        store.superb$ = a2 * FastMath._booth(sphereCoords.genius$);
        return store;
    }

    public static Vector3f _belong(Vector3f cartCoords, Vector3f store) {
        float x;
        if (store == null) {
            store = new Vector3f();
        }
        if ((x = cartCoords.serves$) == 0.0f) {
            x = 1.1920929E-7f;
        }
        store.serves$ = FastMath._runtime(x * x + cartCoords.genius$ * cartCoords.genius$ + cartCoords.superb$ * cartCoords.superb$);
        store.genius$ = FastMath._fraud(cartCoords.superb$ / x);
        if (x < 0.0f) {
            store.genius$ += (float)Math.PI;
        }
        store.superb$ = FastMath._latina(cartCoords.genius$ / store.serves$);
        return store;
    }

    public static Vector3f _verde(Vector3f sphereCoords, Vector3f store) {
        if (store == null) {
            store = new Vector3f();
        }
        store.superb$ = sphereCoords.serves$ * FastMath._booth(sphereCoords.superb$);
        float a2 = sphereCoords.serves$ * FastMath._country(sphereCoords.superb$);
        store.serves$ = a2 * FastMath._country(sphereCoords.genius$);
        store.genius$ = a2 * FastMath._booth(sphereCoords.genius$);
        return store;
    }

    public static Vector3f _lenders(Vector3f cartCoords, Vector3f store) {
        float x;
        if (store == null) {
            store = new Vector3f();
        }
        if ((x = cartCoords.serves$) == 0.0f) {
            x = 1.1920929E-7f;
        }
        store.serves$ = FastMath._runtime(x * x + cartCoords.genius$ * cartCoords.genius$ + cartCoords.superb$ * cartCoords.superb$);
        store.superb$ = FastMath._fraud(cartCoords.superb$ / x);
        if (x < 0.0f) {
            store.superb$ += (float)Math.PI;
        }
        store.genius$ = FastMath._latina(cartCoords.genius$ / store.serves$);
        return store;
    }

    public static float _joined(float val, float min, float max) {
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

    public static float _situated(float x, float y) {
        if (y >= 0.0f && x <= 0.0f) {
            return -x;
        }
        if (y < 0.0f && x >= 0.0f) {
            return -x;
        }
        return x;
    }

    public static float _bracket(float input, float min, float max) {
        return input < min ? min : (input > max ? max : input);
    }

    public static float _response(float input) {
        return FastMath._bracket(input, 0.0f, 1.0f);
    }

    public static float _pentium(short half) {
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

    public static short _railway(float flt) {
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

