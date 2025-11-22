/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.opengl.GL15
 *  org.lwjgl.opengl.GL20
 *  org.lwjgl.opengl.GL30
 */
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

public class CSRenderHW325
extends CSRender {
    public final PmdFileInfo infinite$;
    public final RenderObject radios$;
    public final int parent$;
    private final int after$;
    private final int hazard$;
    public final int trees$;
    public final int miles$;
    public final int milton$;
    public final int approach$;
    public final int postal$;

    public CSRenderHW325(PmdFileInfo pfi, int[] indexes, RenderObject ro) {
        this.radios$ = ro;
        this.infinite$ = pfi;
        Vertex[] vertexs = ((Geometry)this.infinite$.belongs$.get((int)0)).domestic$;
        IntBuffer vbos = BufferUtils.createIntBuffer((int)7);
        GL15.glGenBuffers((IntBuffer)vbos);
        vbos.rewind();
        this.after$ = vbos.get();
        IntBuffer indexBuffer = BufferUtils.createIntBuffer((int)indexes.length);
        indexBuffer.put(indexes);
        indexBuffer.rewind();
        GL15.glBindBuffer((int)34963, (int)this.after$);
        GL15.glBufferData((int)34963, (IntBuffer)indexBuffer, (int)35040);
        GL15.glBindBuffer((int)34963, (int)0);
        indexBuffer = null;
        this.hazard$ = vbos.get();
        FloatBuffer vertexBuffer = BufferUtils.createFloatBuffer((int)(vertexs.length * 8));
        for (Vertex v : vertexs) {
            vertexBuffer.put(v.writes$).put(v.shower$).put(v.colors$);
            vertexBuffer.put(v.sudan$).put(v.applying$).put(v.quantity$);
            vertexBuffer.put(v.poker$).put(v.entirely$);
        }
        vertexBuffer.rewind();
        GL15.glBindBuffer((int)34962, (int)this.hazard$);
        GL15.glBufferData((int)34962, (FloatBuffer)vertexBuffer, (int)35044);
        vertexBuffer = null;
        this.trees$ = vbos.get();
        FloatBuffer faceBuffer = BufferUtils.createFloatBuffer((int)(vertexs.length * 3));
        GL15.glBindBuffer((int)34962, (int)this.trees$);
        GL15.glBufferData((int)34962, (FloatBuffer)faceBuffer, (int)35048);
        faceBuffer = null;
        this.miles$ = vbos.get();
        FloatBuffer typeBuffer = BufferUtils.createFloatBuffer((int)vertexs.length);
        for (Vertex v : vertexs) {
            typeBuffer.put(v.crest$);
        }
        typeBuffer.rewind();
        GL15.glBindBuffer((int)34962, (int)this.miles$);
        GL15.glBufferData((int)34962, (FloatBuffer)typeBuffer, (int)35044);
        typeBuffer = null;
        this.milton$ = vbos.get();
        IntBuffer idBuffer = BufferUtils.createIntBuffer((int)(vertexs.length * 4));
        block17: for (Vertex v : vertexs) {
            switch (v.crest$) {
                case 0: {
                    BDEF bdef = (BDEF)v.forecast$;
                    idBuffer.put(bdef.a()).put(0).put(0).put(0);
                    continue block17;
                }
                case 1: {
                    BDEF2 bdef2 = (BDEF2)v.forecast$;
                    idBuffer.put(bdef2.a()).put(bdef2.b()).put(0).put(0);
                    continue block17;
                }
                case 2: {
                    BDEF4 bdef4 = (BDEF4)v.forecast$;
                    idBuffer.put(bdef4.a()).put(bdef4.b()).put(bdef4.c()).put(bdef4.d());
                    continue block17;
                }
                case 3: {
                    SDEF sdef = (SDEF)v.forecast$;
                    idBuffer.put(sdef.a()).put(sdef.b()).put(0).put(0);
                }
            }
        }
        idBuffer.rewind();
        GL15.glBindBuffer((int)34962, (int)this.milton$);
        GL15.glBufferData((int)34962, (IntBuffer)idBuffer, (int)35044);
        idBuffer = null;
        this.approach$ = vbos.get();
        FloatBuffer weightBuffer = BufferUtils.createFloatBuffer((int)(vertexs.length * 4));
        block18: for (Vertex v : vertexs) {
            switch (v.crest$) {
                case 0: {
                    BDEF bdef = (BDEF)v.forecast$;
                    weightBuffer.put(1.0f).put(0.0f).put(0.0f).put(0.0f);
                    continue block18;
                }
                case 1: {
                    BDEF2 bdef2 = (BDEF2)v.forecast$;
                    weightBuffer.put(bdef2.a()).put(1.0f - bdef2.a()).put(0.0f).put(0.0f);
                    continue block18;
                }
                case 2: {
                    BDEF4 bdef4 = (BDEF4)v.forecast$;
                    weightBuffer.put(bdef4.a()).put(bdef4.b()).put(bdef4.c()).put(bdef4.d());
                    continue block18;
                }
                case 3: {
                    SDEF sdef = (SDEF)v.forecast$;
                    weightBuffer.put(sdef.a()).put(1.0f - sdef.a()).put(0.0f).put(0.0f);
                }
            }
        }
        weightBuffer.rewind();
        GL15.glBindBuffer((int)34962, (int)this.approach$);
        GL15.glBufferData((int)34962, (FloatBuffer)weightBuffer, (int)35044);
        weightBuffer = null;
        this.postal$ = vbos.get();
        FloatBuffer sdefBuffer = BufferUtils.createFloatBuffer((int)(vertexs.length * 3 * 3 * 3));
        block19: for (Vertex v : vertexs) {
            switch (v.crest$) {
                default: {
                    sdefBuffer.put(0.0f).put(0.0f).put(0.0f);
                    sdefBuffer.put(0.0f).put(0.0f).put(0.0f);
                    sdefBuffer.put(0.0f).put(0.0f).put(0.0f);
                    continue block19;
                }
                case 3: {
                    SDEF sdef = (SDEF)v.forecast$;
                    Vector3f c2 = sdef.c();
                    Vector3f RW0 = sdef.a();
                    Vector3f RW1 = sdef.b();
                    sdefBuffer.put(c2.serves$).put(c2.genius$).put(c2.superb$);
                    sdefBuffer.put(RW0.serves$).put(RW0.genius$).put(RW0.superb$);
                    sdefBuffer.put(RW1.serves$).put(RW1.genius$).put(RW1.superb$);
                }
            }
        }
        sdefBuffer.rewind();
        GL15.glBindBuffer((int)34962, (int)this.postal$);
        GL15.glBufferData((int)34962, (FloatBuffer)sdefBuffer, (int)35044);
        sdefBuffer = null;
        this.parent$ = GL30.glGenVertexArrays();
        GL30.glBindVertexArray((int)this.parent$);
        GL20.glEnableVertexAttribArray((int)0);
        GL20.glEnableVertexAttribArray((int)1);
        GL20.glEnableVertexAttribArray((int)2);
        GL20.glEnableVertexAttribArray((int)9);
        GL20.glEnableVertexAttribArray((int)3);
        GL20.glEnableVertexAttribArray((int)4);
        GL20.glEnableVertexAttribArray((int)5);
        GL20.glEnableVertexAttribArray((int)6);
        GL20.glEnableVertexAttribArray((int)7);
        GL20.glEnableVertexAttribArray((int)8);
        GL15.glBindBuffer((int)34963, (int)this.after$);
        GL15.glBindBuffer((int)34962, (int)this.hazard$);
        GL20.glVertexAttribPointer((int)0, (int)3, (int)5126, (boolean)false, (int)this.a(8), (long)0L);
        GL20.glVertexAttribPointer((int)1, (int)3, (int)5126, (boolean)false, (int)this.a(8), (long)this.a(3));
        GL20.glVertexAttribPointer((int)2, (int)2, (int)5126, (boolean)false, (int)this.a(8), (long)this.a(6));
        GL15.glBindBuffer((int)34962, (int)this.trees$);
        GL20.glVertexAttribPointer((int)9, (int)3, (int)5126, (boolean)false, (int)0, (long)0L);
        GL15.glBindBuffer((int)34962, (int)this.miles$);
        GL20.glVertexAttribPointer((int)3, (int)1, (int)5126, (boolean)false, (int)0, (long)0L);
        GL15.glBindBuffer((int)34962, (int)this.milton$);
        GL30.glVertexAttribIPointer((int)4, (int)4, (int)5124, (int)this.a(4), (long)0L);
        GL15.glBindBuffer((int)34962, (int)this.approach$);
        GL20.glVertexAttribPointer((int)5, (int)4, (int)5126, (boolean)false, (int)this.a(4), (long)0L);
        GL15.glBindBuffer((int)34962, (int)this.postal$);
        GL20.glVertexAttribPointer((int)6, (int)3, (int)5126, (boolean)false, (int)this.a(9), (long)0L);
        GL20.glVertexAttribPointer((int)7, (int)3, (int)5126, (boolean)false, (int)this.a(9), (long)this.a(3));
        GL20.glVertexAttribPointer((int)8, (int)3, (int)5126, (boolean)false, (int)this.a(9), (long)this.a(6));
        GL30.glBindVertexArray((int)0);
        vbos.clear();
        GL15.glBindBuffer((int)34962, (int)0);
    }

    public void a() {
        GL15.glDeleteBuffers((int)this.after$);
        GL15.glDeleteBuffers((int)this.hazard$);
        GL15.glDeleteBuffers((int)this.trees$);
        GL15.glDeleteBuffers((int)this.miles$);
        GL15.glDeleteBuffers((int)this.milton$);
        GL15.glDeleteBuffers((int)this.approach$);
        GL15.glDeleteBuffers((int)this.postal$);
        GL30.glDeleteVertexArrays((int)this.parent$);
        super._apparent();
    }

    private int a(int floatOrInt) {
        return floatOrInt * 4;
    }
}

