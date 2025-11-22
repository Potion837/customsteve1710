/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.util.glu.Project
 */
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.Project;

public enum EnumProjection2 {
    dental$,
    advocate$;


    public void _trading(int startX, int startY, int x, int y, float yaw, float pitch, float scale) {
        switch (this) {
            case dental$: {
                GL11.glTranslatef((float)(startX + x), (float)(startY + y), (float)0.0f);
                GL11.glRotatef((float)180.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glRotatef((float)(-pitch), (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)(-yaw), (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glScalef((float)(-scale), (float)scale, (float)scale);
                break;
            }
            case advocate$: {
                GL11.glClear((int)256);
                GL11.glLoadIdentity();
                GL11.glTranslatef((float)x, (float)(-((float)y)), (float)-100.0f);
                GL11.glRotatef((float)yaw, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)pitch, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glScalef((float)scale, (float)scale, (float)scale);
            }
        }
    }

    public void _colin(int width, int height) {
        GL11.glMatrixMode((int)5889);
        GL11.glPushMatrix();
        GL11.glLoadIdentity();
        switch (this) {
            case dental$: {
                GL11.glRotatef((float)180.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScalef((float)-1.0f, (float)1.0f, (float)1.0f);
                GL11.glOrtho((double)0.0, (double)width, (double)0.0, (double)height, (double)1000.0, (double)6000.0);
                break;
            }
            case advocate$: {
                Project.gluPerspective((float)70.0f, (float)((float)width / (float)height), (float)0.05f, (float)1000.0f);
            }
        }
        GL11.glMatrixMode((int)5888);
    }

    public void _saved() {
        switch (this) {
            case dental$: {
                break;
            }
        }
        GL11.glMatrixMode((int)5889);
        GL11.glPopMatrix();
        GL11.glMatrixMode((int)5888);
    }
}

