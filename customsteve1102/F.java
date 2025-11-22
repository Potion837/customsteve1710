/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.util.glu.Project
 */
package customsteve;

import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.Project;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class F
extends Enum<F> {
    public static final /* enum */ F a = new F();
    public static final /* enum */ F b = new F();
    private static final /* synthetic */ F[] a;

    public static F[] values() {
        return (F[])a.clone();
    }

    public static F valueOf(String name) {
        return Enum.valueOf(F.class, name);
    }

    public void a(int startX, int startY, int x, int y, float yaw, float pitch, float scale) {
        switch (this) {
            case a: {
                GL11.glTranslatef((float)(startX + x), (float)(startY + y), (float)0.0f);
                GL11.glRotatef((float)180.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glRotatef((float)(-pitch), (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)(-yaw), (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScalef((float)(-scale), (float)scale, (float)scale);
                break;
            }
            case b: {
                GL11.glClear((int)256);
                GL11.glLoadIdentity();
                GL11.glTranslatef((float)x, (float)(-((float)y)), (float)-100.0f);
                GL11.glRotatef((float)yaw, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)pitch, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScalef((float)scale, (float)scale, (float)scale);
            }
        }
    }

    public void a(int width, int height) {
        GL11.glMatrixMode((int)5889);
        GL11.glPushMatrix();
        GL11.glLoadIdentity();
        switch (this) {
            case a: {
                GL11.glRotatef((float)180.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScalef((float)-1.0f, (float)1.0f, (float)1.0f);
                GL11.glOrtho((double)0.0, (double)width, (double)0.0, (double)height, (double)1000.0, (double)6000.0);
                break;
            }
            case b: {
                Project.gluPerspective((float)70.0f, (float)((float)width / (float)height), (float)0.05f, (float)1000.0f);
            }
        }
        GL11.glMatrixMode((int)5888);
    }

    public void a() {
        switch (this) {
            case a: {
                break;
            }
        }
        GL11.glMatrixMode((int)5889);
        GL11.glPopMatrix();
        GL11.glMatrixMode((int)5888);
    }

    static {
        a = new F[]{a, b};
    }
}

