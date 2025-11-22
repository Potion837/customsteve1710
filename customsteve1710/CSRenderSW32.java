/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.opengl.GL15
 *  org.lwjgl.opengl.GL30
 */
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL30;

public class CSRenderSW32
extends CSRender {
    public final PmdFileInfo debate$;
    public final RenderObject upcoming$;
    public final int lauren$;
    public final int floors$;
    public final int divide$;
    public final int warcraft$;
    public final int kitty$;
    public final int protect$;

    public CSRenderSW32(PmdFileInfo model, int[] indexes, RenderObject ro) {
        this.debate$ = model;
        this.upcoming$ = ro;
        IntBuffer vbos = BufferUtils.createIntBuffer((int)6);
        GL15.glGenBuffers((IntBuffer)vbos);
        vbos.rewind();
        Vertex[] vertexs = ((Geometry)model.belongs$.get((int)0)).issues$;
        this.lauren$ = vbos.get();
        IntBuffer indexBuffer = BufferUtils.createIntBuffer((int)indexes.length);
        indexBuffer.put(indexes);
        indexBuffer.rewind();
        GL15.glBindBuffer((int)34963, (int)this.lauren$);
        GL15.glBufferData((int)34963, (IntBuffer)indexBuffer, (int)35040);
        GL15.glBindBuffer((int)34963, (int)0);
        indexBuffer = null;
        this.floors$ = vbos.get();
        FloatBuffer vertexBuffer = BufferUtils.createFloatBuffer((int)(vertexs.length * 3));
        this.divide$ = vbos.get();
        FloatBuffer UVBuffer = BufferUtils.createFloatBuffer((int)(vertexs.length * 2));
        this.warcraft$ = vbos.get();
        FloatBuffer normalBuffer = BufferUtils.createFloatBuffer((int)(vertexs.length * 3));
        this.kitty$ = vbos.get();
        FloatBuffer toonBuffer = BufferUtils.createFloatBuffer((int)(vertexs.length * 2));
        this.protect$ = vbos.get();
        FloatBuffer sphereBuffer = BufferUtils.createFloatBuffer((int)(vertexs.length * 2));
        for (Vertex v : vertexs) {
            vertexBuffer.put(v.writes$).put(v.shower$).put(v.colors$);
            normalBuffer.put(v.sudan$).put(v.applying$).put(v.quantity$);
            UVBuffer.put(v.poker$).put(v.entirely$);
            float f2 = 0.5f * (1.0f - Config.sounds$._intel(v.sudan$, v.applying$, v.quantity$));
            toonBuffer.put(0.0f).put(f2);
            Vector2f spaCoord = new Vector2f(v.sudan$, v.applying$)._shopping(new Vector2f(1.0f, 1.0f))._result(0.5f);
            sphereBuffer.put(spaCoord.removing$).put(spaCoord.writings$);
        }
        vertexBuffer.rewind();
        GL15.glBindBuffer((int)34962, (int)this.floors$);
        GL15.glBufferData((int)34962, (FloatBuffer)vertexBuffer, (int)35044);
        vertexBuffer = null;
        normalBuffer.rewind();
        GL15.glBindBuffer((int)34962, (int)this.warcraft$);
        GL15.glBufferData((int)34962, (FloatBuffer)normalBuffer, (int)35044);
        normalBuffer = null;
        UVBuffer.rewind();
        GL15.glBindBuffer((int)34962, (int)this.divide$);
        GL15.glBufferData((int)34962, (FloatBuffer)UVBuffer, (int)35044);
        UVBuffer = null;
        toonBuffer.rewind();
        GL15.glBindBuffer((int)34962, (int)this.kitty$);
        GL15.glBufferData((int)34962, (FloatBuffer)toonBuffer, (int)35044);
        UVBuffer = null;
        sphereBuffer.rewind();
        GL15.glBindBuffer((int)34962, (int)this.protect$);
        GL15.glBufferData((int)34962, (FloatBuffer)sphereBuffer, (int)35044);
        UVBuffer = null;
        GL30.glBindVertexArray((int)0);
        vbos.clear();
        GL15.glBindBuffer((int)34962, (int)0);
    }

    public void a() {
        GL15.glDeleteBuffers((int)this.lauren$);
        GL15.glDeleteBuffers((int)this.floors$);
        GL15.glDeleteBuffers((int)this.warcraft$);
        GL15.glDeleteBuffers((int)this.divide$);
        super._apparent();
    }

    private int a(int floatOrInt) {
        return floatOrInt * 4;
    }
}

