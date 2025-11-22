/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL15
 */
import org.lwjgl.opengl.GL15;

public abstract class CSRender {
    public int really$ = -1;
    public boolean created$ = false;

    public void _apparent() {
        if (this.really$ >= 0) {
            GL15.glDeleteBuffers((int)this.really$);
        }
    }
}

