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
package customsteve;

import customsteve.aB;
import customsteve.aH;
import customsteve.aZ;
import customsteve.ac;
import customsteve.ai_0;
import customsteve.al;
import customsteve.ao;
import customsteve.ax;
import customsteve.b_0;
import customsteve.bb;
import customsteve.bc;
import customsteve.d_0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.ARBMultitexture;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL15;
import org.lwjgl.util.glu.GLU;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class bb
extends aZ {
    private static final int b = 0;
    private static final int c = 1;
    private static final int d = 2;
    private static int e;
    private static int f;
    private FloatBuffer a = ByteBuffer.allocateDirect(16).order(ByteOrder.nativeOrder()).asFloatBuffer();

    @Override
    public aZ.a a(bc ro) {
        ac model = ro.a;
        int[] indexes = new int[((ArrayList)((Object)((ax)((ArrayList)((Object)model.a)).get((int)0)).a)).size() * 3];
        int p2 = 0;
        Iterator iterator = ((ArrayList)((Object)((ax)((ArrayList)((Object)model.a)).get((int)0)).a)).iterator();
        while (iterator.hasNext()) {
            aH face = (aH)iterator.next();
            indexes[p2++] = (Integer)face.a.get(0);
            indexes[p2++] = (Integer)face.a.get(1);
            indexes[p2++] = (Integer)face.a.get(2);
        }
        a handle = new a(model, indexes, ro);
        return handle;
    }

    @Override
    public void a(aZ.a renderHandle) {
        a handle = (a)renderHandle;
        handle.a();
    }

    @Override
    public void a(String path, aZ.a renderHandle, ArrayList<al> boneBuffer, long faceP, boolean bufferUpdated, boolean light, float lightValue, boolean specular) {
        ai_0[] vertexs;
        a handle = (a)renderHandle;
        boolean fullLight = true;
        if (handle.a != false && (vertexs = ((ax)((ArrayList)((Object)handle.a.a)).get((int)0)).c) != null) {
            FloatBuffer vertexBuffer = BufferUtils.createFloatBuffer((int)(vertexs.length * 3));
            FloatBuffer normalBuffer = BufferUtils.createFloatBuffer((int)(vertexs.length * 3));
            FloatBuffer toonBuffer = null;
            FloatBuffer sphereBuffer = null;
            if (b_0.q) {
                toonBuffer = BufferUtils.createFloatBuffer((int)(vertexs.length * 2));
                sphereBuffer = BufferUtils.createFloatBuffer((int)(vertexs.length * 2));
            }
            for (ai_0 v : vertexs) {
                if (v == null) continue;
                vertexBuffer.put(v.a).put(v.b).put(v.c);
                normalBuffer.put(v.d).put(v.e).put(v.f);
                if (!b_0.q) continue;
                float f2 = 0.5f * (1.0f - b_0.a.a(v.d, v.e, v.f));
                toonBuffer.put(0.0f).put(f2);
                ao spaCoord = new ao(v.d, v.e).b(new ao(1.0f, 1.0f)).a(0.5f);
                sphereBuffer.put(spaCoord.a).put(spaCoord.b);
            }
            vertexBuffer.rewind();
            normalBuffer.rewind();
            GL15.glBindBuffer((int)34962, (int)handle.c);
            GL15.glBufferData((int)34962, (FloatBuffer)vertexBuffer, (int)35044);
            GL15.glBindBuffer((int)34962, (int)handle.e);
            GL15.glBufferData((int)34962, (FloatBuffer)normalBuffer, (int)35044);
            vertexBuffer = null;
            normalBuffer = null;
            if (b_0.q) {
                toonBuffer.rewind();
                sphereBuffer.rewind();
                GL15.glBindBuffer((int)34962, (int)handle.f);
                GL15.glBufferData((int)34962, (FloatBuffer)toonBuffer, (int)35044);
                GL15.glBindBuffer((int)34962, (int)handle.g);
                GL15.glBufferData((int)34962, (FloatBuffer)sphereBuffer, (int)35044);
                toonBuffer = null;
                sphereBuffer = null;
            }
            handle.a = (ac)false;
        }
        if (b_0.q) {
            ARBMultitexture.glActiveTextureARB((int)33984);
            ARBMultitexture.glClientActiveTextureARB((int)33984);
            GL11.glEnableClientState((int)32888);
            GL15.glBindBuffer((int)34962, (int)handle.d);
            GL11.glTexCoordPointer((int)2, (int)5126, (int)this.a(2), (long)0L);
            ARBMultitexture.glActiveTextureARB((int)33986);
            ARBMultitexture.glClientActiveTextureARB((int)33986);
            GL11.glEnableClientState((int)32888);
            GL15.glBindBuffer((int)34962, (int)handle.f);
            GL11.glTexCoordPointer((int)2, (int)5126, (int)this.a(2), (long)0L);
            ARBMultitexture.glActiveTextureARB((int)33987);
            ARBMultitexture.glClientActiveTextureARB((int)33987);
            GL11.glEnableClientState((int)32888);
            GL15.glBindBuffer((int)34962, (int)handle.g);
            GL11.glTexCoordPointer((int)2, (int)5126, (int)this.a(2), (long)0L);
        } else {
            ARBMultitexture.glClientActiveTextureARB((int)33984);
            GL11.glEnableClientState((int)32888);
            GL15.glBindBuffer((int)34962, (int)handle.d);
            GL11.glTexCoordPointer((int)2, (int)5126, (int)this.a(2), (long)0L);
        }
        GL11.glEnableClientState((int)32884);
        GL15.glBindBuffer((int)34962, (int)handle.c);
        GL15.glBindBuffer((int)34963, (int)handle.b);
        GL11.glVertexPointer((int)3, (int)5126, (int)this.a(3), (long)0L);
        GL11.glEnableClientState((int)32885);
        GL15.glBindBuffer((int)34962, (int)handle.e);
        GL11.glNormalPointer((int)5126, (int)this.a(3), (long)0L);
        ac model = handle.a;
        ai_0[] ms = ((ax)((ArrayList)((Object)model.a)).get((int)0)).b;
        int j2 = 0;
        int loaded = 0;
        for (int i2 = 0; i2 < ms.size(); ++i2) {
            aB m2 = (aB)ms.get(i2);
            m2.d = path;
            if (!m2.a && loaded < b_0.d) {
                m2.a = true;
                ++loaded;
            }
            this.b(m2, model);
            int count = (int)m2.a;
            GL11.glDrawElements((int)4, (int)count, (int)5125, (long)(j2 * 4));
            j2 += count;
            this.a(m2, model);
            m2.b();
        }
        GL15.glBindBuffer((int)34962, (int)0);
        GL15.glBindBuffer((int)34963, (int)0);
        GL11.glDisableClientState((int)32884);
        GL11.glDisableClientState((int)32885);
        GL11.glDisableClientState((int)32888);
    }

    private void a(aB m2, ac pfi) {
        if (b_0.q && m2.c != null) {
            ARBMultitexture.glActiveTextureARB((int)33987);
            GL11.glDisable((int)3553);
        }
        if (!b_0.q || m2.a > -1) {
            // empty if block
        }
        ARBMultitexture.glClientActiveTextureARB((int)33984);
        if (b_0.q) {
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

    private void b(aB m2, ac pfi) {
        ARBMultitexture.glActiveTextureARB((int)33984);
        float fixL = 0.2f;
        GL11.glColor4f((float)(m2.a + fixL), (float)(m2.b + fixL), (float)(m2.c + fixL), (float)m2.e);
        if (m2.b == null) {
            GL11.glBindTexture((int)3553, (int)-1);
            GL11.glDisable((int)3553);
        } else if (!m2.a()) {
            GL11.glDisable((int)3553);
        } else {
            GL11.glEnable((int)3553);
        }
        if (b_0.q && m2.a > -1) {
            ARBMultitexture.glActiveTextureARB((int)33986);
            GL11.glEnable((int)3553);
            m2.a(pfi);
            GL11.glTexEnvf((int)8960, (int)34161, (float)260.0f);
            GL11.glTexParameteri((int)3553, (int)10242, (int)33071);
            GL11.glTexParameteri((int)3553, (int)10243, (int)33071);
            if (m2.c != null) {
                // empty if block
            }
        }
        if (b_0.q && m2.c != null) {
            ARBMultitexture.glActiveTextureARB((int)33987);
            GL11.glEnable((int)3553);
            m2.a();
            GL11.glTexEnvf((int)8960, (int)8704, (float)260.0f);
        }
        GL11.glMaterialf((int)1032, (int)5633, (float)m2.f);
        this.a.put(FloatBuffer.wrap(new float[0]));
        if (b_0.q && m2.a > -1) {
            GL11.glMaterial((int)1032, (int)5634, (FloatBuffer)this.a(m2.m, m2.n, m2.o, m2.e));
            GL11.glMaterial((int)1032, (int)4610, (FloatBuffer)this.a(m2.g, m2.h, m2.i, m2.e));
        } else {
            GL11.glMaterial((int)1032, (int)4608, (FloatBuffer)this.a(m2.j, m2.k, m2.l, m2.e));
            GL11.glMaterial((int)1032, (int)4609, (FloatBuffer)this.a(m2.a, m2.b, m2.c, m2.e));
            GL11.glMaterial((int)1032, (int)4610, (FloatBuffer)this.a(m2.g, m2.h, m2.i, m2.e));
        }
        if (m2.a > -1 || m2.c != null) {
            ARBMultitexture.glActiveTextureARB((int)33984);
        }
    }

    private FloatBuffer a(float a1, float a2, float a3, float a4) {
        this.a.clear();
        this.a.put(FloatBuffer.wrap(new float[]{a1, a2, a3, a4}));
        this.a.flip();
        return this.a;
    }

    private void a() {
        int i2 = GL11.glGetError();
        while (i2 != 0) {
            System.err.println(GLU.gluErrorString((int)i2));
            i2 = GL11.glGetError();
        }
    }

    private int a(int floatOrInt) {
        return floatOrInt * 4;
    }

    @Override
    public d_0 a() {
        return null;
    }
}

