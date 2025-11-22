/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 */
package customsteve;

import customsteve.ap_0;
import customsteve.k;
import net.minecraft.client.Minecraft;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from customsteve.b
 */
public class b_0 {
    public static boolean a = true;
    public static boolean b = false;
    public static boolean c = false;
    public static boolean d = false;
    public static boolean e = false;
    public static boolean f = false;
    public static boolean g = false;
    public static boolean h = false;
    public static ap_0 a = new ap_0(5.0f, 10.0f, -5.0f);
    public static boolean i = false;
    public static boolean j = false;
    public static boolean k = false;
    public static boolean l = false;
    public static boolean m = true;
    public static boolean n = false;
    public static boolean o = false;
    public static boolean p = true;
    public static boolean q = true;
    public static int a = 1;
    public static boolean r = false;
    public static boolean s = true;
    public static final String a = "UTF-8";
    public static int b = 100;
    public static int c = 4;
    public static String b = "";
    public static ap_0 b = new ap_0(1.0f, 1.0f, 1.0f);
    public static float a = 1.0f;
    public static float b = 0.0f;
    public static float c = 0.0f;
    public static long a = 0L;
    public static long b = 0L;
    public static long c = 0L;
    public static float d = 0.5f;
    public static float e = 1.0f;
    public static float f = 2.0f;
    public static float g = 0.3f;
    public static float h = 0.0f;
    public static float i = 60.0f;
    public static float j = -1.0f;
    public static float k = 0.0f;
    public static int d = 1;
    public static int e = 0;
    public static int f = -1;
    public static boolean t = false;
    public static boolean u = false;
    public static boolean v = true;
    public static boolean w = false;
    public static boolean x = true;
    public static boolean y = false;
    public static boolean z = true;
    public static boolean A = false;
    public static k a = null;
    public static ap_0 c;
    public static float l;
    public static int g;
    public static int h;
    public static int i;
    public static boolean B;
    public static final boolean C = false;
    public static int j;
    public static boolean D;

    public static void a() {
        i = false;
        j = false;
    }

    public static void a(Object s) {
        b_0.b("[CustomSteve] Error:" + s);
    }

    public static void b() {
        if (a) {
            System.out.println("------------------------------");
        }
    }

    public static void b(Object s) {
        if (a) {
            System.out.println(s + "");
        }
    }

    public static float a() {
        if (Minecraft.getMinecraft().gameSettings.thirdPersonView != 1) {
            return 1.0f;
        }
        if (j > 0.0f) {
            return j;
        }
        return e;
    }

    public static float b() {
        if (Minecraft.getMinecraft().gameSettings.thirdPersonView != 1) {
            return 0.0f;
        }
        if (k != 0.0f) {
            return k;
        }
        return h;
    }

    static {
        g = 200;
        h = 0;
        i = 0;
        B = false;
        j = 2;
        D = false;
    }
}

