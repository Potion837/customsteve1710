/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL15
 */
package customsteve;

import customsteve.aZ;
import customsteve.al;
import customsteve.b_0;
import customsteve.ba;
import customsteve.bb;
import customsteve.bc;
import customsteve.d_0;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL15;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class aZ {
    public static final int a = 700;
    private static final int b;
    private static aZ a;
    private static final FloatBuffer a;

    public abstract d_0 a();

    public boolean a() {
        return false;
    }

    public d_0 b() {
        throw new UnsupportedOperationException();
    }

    public boolean b() {
        return false;
    }

    public d_0 c() {
        throw new UnsupportedOperationException();
    }

    public abstract a a(bc var1);

    public abstract void a(a var1);

    public abstract void a(String var1, a var2, ArrayList<al> var3, long var4, boolean var6, boolean var7, float var8, boolean var9);

    protected void a(ArrayList<al> Bones, a handle) {
        a.clear();
        float[] tmpArray = new float[12];
        for (al bone : Bones) {
            al offset = bone;
            if (offset == null) continue;
            tmpArray[0] = offset.a;
            tmpArray[1] = offset.b;
            tmpArray[2] = offset.c;
            tmpArray[3] = offset.d;
            tmpArray[4] = offset.e;
            tmpArray[5] = offset.f;
            tmpArray[6] = offset.g;
            tmpArray[7] = offset.h;
            tmpArray[8] = offset.i;
            tmpArray[9] = offset.j;
            tmpArray[10] = offset.k;
            tmpArray[11] = offset.l;
            a.put(tmpArray);
        }
        if (handle.a < 0) {
            handle.a = GL15.glGenBuffers();
            GL15.glBindBuffer((int)35345, (int)handle.a);
            GL15.glBufferData((int)35345, (long)33600L, (int)35040);
        } else {
            GL15.glBindBuffer((int)35345, (int)handle.a);
        }
        GL15.glBufferSubData((int)35345, (long)0L, (FloatBuffer)((FloatBuffer)a.flip()));
    }

    public static synchronized aZ a() {
        if (a == null) {
            if (!b_0.f) {
                if (b >= 32) {
                    a = new ba();
                } else {
                    b_0.a("not support GLVERSION!");
                }
            } else {
                a = new bb();
            }
        }
        return a;
    }

    static {
        a = BufferUtils.createFloatBuffer((int)8400);
        String version = GL11.glGetString((int)7938);
        int major = Integer.valueOf(Character.toString(version.charAt(0)));
        int minor = Integer.valueOf(Character.toString(version.charAt(2)));
        b = major * 10 + minor;
    }
}

