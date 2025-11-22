/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 */
import net.minecraft.client.Minecraft;

public class Config {
    public static boolean struct$ = true;
    public static boolean crucial$ = false;
    public static boolean point$ = false;
    public static boolean globe$ = false;
    public static boolean leaves$ = false;
    public static boolean maybe$ = false;
    public static boolean villas$ = false;
    public static boolean seating$ = false;
    public static Vector3f sounds$ = new Vector3f(5.0f, 10.0f, -5.0f);
    public static boolean remarks$ = false;
    public static boolean ensures$ = false;
    public static boolean everyday$ = false;
    public static boolean framed$ = false;
    public static boolean scored$ = true;
    public static boolean prairie$ = false;
    public static boolean songs$ = false;
    public static boolean delaware$ = true;
    public static boolean brake$ = true;
    public static int price$ = 1;
    public static boolean baghdad$ = false;
    public static boolean wagner$ = true;
    public static final String season$ = "UTF-8";
    public static int opera$ = 100;
    public static int prague$ = 4;
    public static String gadgets$ = "";
    public static Vector3f child$ = new Vector3f(1.0f, 1.0f, 1.0f);
    public static float celebs$ = 1.0f;
    public static float jamaica$ = 0.0f;
    public static float timeline$ = 0.0f;
    public static long gentle$ = 0L;
    public static long routes$ = 0L;
    public static long craft$ = 0L;
    public static float ranges$ = 0.5f;
    public static float tests$ = 1.0f;
    public static float tricks$ = 2.0f;
    public static float semester$ = 0.3f;
    public static float aurora$ = 0.0f;
    public static float email$ = 60.0f;
    public static float candles$ = -1.0f;
    public static float kinase$ = 0.0f;
    public static int receive$ = 1;
    public static int assigned$ = 0;
    public static int italian$ = -1;
    public static boolean editing$ = false;
    public static boolean judgment$ = false;
    public static boolean planet$ = true;
    public static boolean causes$ = true;
    public static boolean stickers$ = true;
    public static boolean permit$ = false;
    public static boolean taught$ = true;
    public static boolean elect$ = false;
    public static CSplayer italia$ = null;
    public static Vector3f standard$;
    public static float anatomy$;
    public static int pipes$;
    public static int missing$;
    public static int terminal$;
    public static int filter$;
    public static final boolean webster$ = true;

    public static void _edges() {
        remarks$ = false;
        ensures$ = false;
    }

    public static void _murder(Object s) {
        Config._lightbox("[CustomSteve] Error:" + s);
    }

    public static void _grams() {
        if (struct$) {
            System.out.println("------------------------------");
        }
    }

    public static void _lightbox(Object s) {
        if (struct$) {
            System.out.println(s + "");
        }
    }

    public static float _calling() {
        if (Minecraft.func_71410_x().field_71474_y.field_74320_O != 1) {
            return 1.0f;
        }
        if (candles$ > 0.0f) {
            return candles$;
        }
        return tests$;
    }

    public static float _critical() {
        if (Minecraft.func_71410_x().field_71474_y.field_74320_O != 1) {
            return 0.0f;
        }
        if (kinase$ != 0.0f) {
            return kinase$;
        }
        return aurora$;
    }

    static {
        pipes$ = 200;
        missing$ = 0;
        terminal$ = 0;
        filter$ = 2;
    }
}

