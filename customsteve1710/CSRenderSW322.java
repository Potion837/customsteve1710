/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.opengl.ARBMultitexture
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL15
 *  org.lwjgl.util.glu.GLU
 */
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.ARBMultitexture;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL15;
import org.lwjgl.util.glu.GLU;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class CSRenderSW322
extends CSRender2 {
    private static final int previous$ = 0;
    private static final int separate$ = 1;
    private static final int kodak$ = 2;
    private static int antigua$;
    private static int tiles$;
    private FloatBuffer various$ = ByteBuffer.allocateDirect(16).order(ByteOrder.nativeOrder()).asFloatBuffer();

    public CSRender a(RenderObject ro) {
        PmdFileInfo model = ro.agents$;
        int[] indexes = new int[((Geometry)model.belongs$.get((int)0)).signup$.size() * 3];
        int p = 0;
        for (TriangleFace face : ((Geometry)model.belongs$.get((int)0)).signup$) {
            indexes[p++] = (Integer)face.browse$.get(0);
            indexes[p++] = (Integer)face.browse$.get(1);
            indexes[p++] = (Integer)face.browse$.get(2);
        }
        CSRenderSW32 handle = new CSRenderSW32(model, indexes, ro);
        return handle;
    }

    public void a(CSRender renderHandle) {
        CSRenderSW32 handle = (CSRenderSW32)renderHandle;
        handle.a();
    }

    public void a(String path, CSRender renderHandle, ArrayList boneBuffer, long faceP, boolean bufferUpdated, boolean light, float lightValue, boolean specular) {
        Vertex[] vertexs;
        CSRenderSW32 handle = (CSRenderSW32)renderHandle;
        boolean fullLight = true;
        if (handle.a && (vertexs = ((Geometry)handle.debate$.belongs$.get((int)0)).domestic$) != null) {
            FloatBuffer vertexBuffer = BufferUtils.createFloatBuffer((int)(vertexs.length * 3));
            FloatBuffer normalBuffer = BufferUtils.createFloatBuffer((int)(vertexs.length * 3));
            FloatBuffer toonBuffer = null;
            FloatBuffer sphereBuffer = null;
            if (Config.brake$) {
                toonBuffer = BufferUtils.createFloatBuffer((int)(vertexs.length * 2));
                sphereBuffer = BufferUtils.createFloatBuffer((int)(vertexs.length * 2));
            }
            for (Vertex v : vertexs) {
                if (v == null) continue;
                vertexBuffer.put(v.writes$).put(v.shower$).put(v.colors$);
                normalBuffer.put(v.sudan$).put(v.applying$).put(v.quantity$);
                if (!Config.brake$) continue;
                float f2 = 0.5f * (1.0f - Config.sounds$._intel(v.sudan$, v.applying$, v.quantity$));
                toonBuffer.put(0.0f).put(f2);
                Vector2f spaCoord = new Vector2f(v.sudan$, v.applying$)._shopping(new Vector2f(1.0f, 1.0f))._result(0.5f);
                sphereBuffer.put(spaCoord.removing$).put(spaCoord.writings$);
            }
            vertexBuffer.rewind();
            normalBuffer.rewind();
            GL15.glBindBuffer((int)34962, (int)handle.floors$);
            GL15.glBufferData((int)34962, (FloatBuffer)vertexBuffer, (int)35044);
            GL15.glBindBuffer((int)34962, (int)handle.warcraft$);
            GL15.glBufferData((int)34962, (FloatBuffer)normalBuffer, (int)35044);
            vertexBuffer = null;
            normalBuffer = null;
            if (Config.brake$) {
                toonBuffer.rewind();
                sphereBuffer.rewind();
                GL15.glBindBuffer((int)34962, (int)handle.kitty$);
                GL15.glBufferData((int)34962, (FloatBuffer)toonBuffer, (int)35044);
                GL15.glBindBuffer((int)34962, (int)handle.protect$);
                GL15.glBufferData((int)34962, (FloatBuffer)sphereBuffer, (int)35044);
                toonBuffer = null;
                sphereBuffer = null;
            }
            handle.a = false;
        }
        if (Config.brake$) {
            ARBMultitexture.glActiveTextureARB((int)33984);
            ARBMultitexture.glClientActiveTextureARB((int)33984);
            GL11.glEnableClientState((int)32888);
            GL15.glBindBuffer((int)34962, (int)handle.divide$);
            GL11.glTexCoordPointer((int)2, (int)5126, (int)this.a(2), (long)0L);
            ARBMultitexture.glActiveTextureARB((int)33986);
            ARBMultitexture.glClientActiveTextureARB((int)33986);
            GL11.glEnableClientState((int)32888);
            GL15.glBindBuffer((int)34962, (int)handle.kitty$);
            GL11.glTexCoordPointer((int)2, (int)5126, (int)this.a(2), (long)0L);
            ARBMultitexture.glActiveTextureARB((int)33987);
            ARBMultitexture.glClientActiveTextureARB((int)33987);
            GL11.glEnableClientState((int)32888);
            GL15.glBindBuffer((int)34962, (int)handle.protect$);
            GL11.glTexCoordPointer((int)2, (int)5126, (int)this.a(2), (long)0L);
        } else {
            ARBMultitexture.glClientActiveTextureARB((int)33984);
            GL11.glEnableClientState((int)32888);
            GL15.glBindBuffer((int)34962, (int)handle.divide$);
            GL11.glTexCoordPointer((int)2, (int)5126, (int)this.a(2), (long)0L);
        }
        GL11.glEnableClientState((int)32884);
        GL15.glBindBuffer((int)34962, (int)handle.floors$);
        GL15.glBindBuffer((int)34963, (int)handle.lauren$);
        GL11.glVertexPointer((int)3, (int)5126, (int)this.a(3), (long)0L);
        GL11.glEnableClientState((int)32885);
        GL15.glBindBuffer((int)34962, (int)handle.warcraft$);
        GL11.glNormalPointer((int)5126, (int)this.a(3), (long)0L);
        PmdFileInfo model = handle.debate$;
        ArrayList ms = ((Geometry)model.belongs$.get((int)0)).found$;
        int j = 0;
        int loaded = 0;
        for (int i = 0; i < ms.size(); ++i) {
            Material m = (Material)ms.get(i);
            m.tracks$ = path;
            if (!m.storage$ && loaded < Config.receive$) {
                m.storage$ = true;
                ++loaded;
            }
            this.b(m, model);
            int count = (int)m.collins$;
            GL11.glDrawElements((int)4, (int)count, (int)5125, (long)(j * 4));
            j += count;
            this.a(m, model);
            m._viewer();
        }
        GL15.glBindBuffer((int)34962, (int)0);
        GL15.glBindBuffer((int)34963, (int)0);
        GL11.glDisableClientState((int)32884);
        GL11.glDisableClientState((int)32885);
        GL11.glDisableClientState((int)32888);
    }

    private void a(Material m, PmdFileInfo pfi) {
        if (Config.brake$ && m.rings$ != null) {
            ARBMultitexture.glActiveTextureARB((int)33987);
            GL11.glDisable((int)3553);
        }
        if (!Config.brake$ || m.ought$ > -1) {
            // empty if block
        }
        ARBMultitexture.glClientActiveTextureARB((int)33984);
        if (Config.brake$) {
            ARBMultitexture.glActiveTextureARB((int)33984);
            GL11.glTexEnvi((int)8960, (int)8704, (int)8448);
            GL11.glEnableClientState((int)32888);
            GL15.glBindBuffer((int)34962, (int)0);
            GL11.glBindTexture((int)3553, (int)-1);
            ARBMultitexture.glClientActiveTextureARB((int)33986);
            ARBMultitexture.glActiveTextureARB((int)33986);
            GL11.glTexEnvi((int)8960, (int)8704, (int)8448);
            GL11.glEnableClientState((int)32888);
            GL15.glBindBuffer((int)34962, (int)0);
            GL11.glBindTexture((int)3553, (int)-1);
            ARBMultitexture.glClientActiveTextureARB((int)33987);
            ARBMultitexture.glActiveTextureARB((int)33987);
            GL11.glTexEnvi((int)8960, (int)8704, (int)8448);
            GL11.glEnableClientState((int)32888);
            GL15.glBindBuffer((int)34962, (int)0);
            GL11.glBindTexture((int)3553, (int)-1);
            ARBMultitexture.glActiveTextureARB((int)33984);
            ARBMultitexture.glClientActiveTextureARB((int)33984);
        }
    }

    private void b(Material m, PmdFileInfo pfi) {
        ARBMultitexture.glActiveTextureARB((int)33984);
        float fixL = 0.2f;
        GL11.glColor4f((float)(m.silver$ + fixL), (float)(m.latitude$ + fixL), (float)(m.depend$ + fixL), (float)m.glory$);
        if (m.texas$ == null) {
            GL11.glBindTexture((int)3553, (int)-1);
            GL11.glDisable((int)3553);
        } else if (!m._romantic()) {
            GL11.glDisable((int)3553);
        } else {
            GL11.glEnable((int)3553);
        }
        if (Config.brake$ && m.ought$ > -1) {
            ARBMultitexture.glActiveTextureARB((int)33986);
            GL11.glEnable((int)3553);
            m._backup(pfi);
            GL11.glTexEnvf((int)8960, (int)34161, (float)260.0f);
            GL11.glTexParameteri((int)3553, (int)10242, (int)33071);
            GL11.glTexParameteri((int)3553, (int)10243, (int)33071);
            if (m.rings$ != null) {
                // empty if block
            }
        }
        if (Config.brake$ && m.rings$ != null) {
            ARBMultitexture.glActiveTextureARB((int)33987);
            GL11.glEnable((int)3553);
            m._distant();
            GL11.glTexEnvf((int)8960, (int)8704, (float)260.0f);
        }
        GL11.glMaterialf((int)1032, (int)5633, (float)m.sticks$);
        this.various$.put(FloatBuffer.wrap(new float[0]));
        if (Config.brake$ && m.ought$ > -1) {
            GL11.glMaterial((int)1032, (int)5634, (FloatBuffer)this.a(m.dialogue$, m.bronze$, m.giant$, m.glory$));
            GL11.glMaterial((int)1032, (int)4610, (FloatBuffer)this.a(m.mouse$, m.episode$, m.sorted$, m.glory$));
        } else {
            GL11.glMaterial((int)1032, (int)4608, (FloatBuffer)this.a(m.toward$, m.basin$, m.rough$, m.glory$));
            GL11.glMaterial((int)1032, (int)4609, (FloatBuffer)this.a(m.silver$, m.latitude$, m.depend$, m.glory$));
            GL11.glMaterial((int)1032, (int)4610, (FloatBuffer)this.a(m.mouse$, m.episode$, m.sorted$, m.glory$));
        }
        if (m.ought$ > -1 || m.rings$ != null) {
            ARBMultitexture.glActiveTextureARB((int)33984);
        }
    }

    private FloatBuffer a(float a1, float a2, float a3, float a4) {
        this.various$.clear();
        this.various$.put(FloatBuffer.wrap(new float[]{a1, a2, a3, a4}));
        this.various$.flip();
        return this.various$;
    }

    private void a() {
        int i = GL11.glGetError();
        while (i != 0) {
            System.err.println(GLU.gluErrorString((int)i));
            i = GL11.glGetError();
        }
    }

    private int a(int floatOrInt) {
        return floatOrInt * 4;
    }

    public Shader5 a() {
        return null;
    }
}

