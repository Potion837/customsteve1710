/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  customsteve.D
 *  net.minecraft.client.Minecraft
 *  org.lwjgl.opengl.ARBUniformBufferObject
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL15
 *  org.lwjgl.opengl.GL20
 *  org.lwjgl.opengl.GL30
 *  org.lwjgl.opengl.GL31
 *  org.lwjgl.util.glu.GLU
 */
package customsteve;

import customsteve.D;
import customsteve.E;
import customsteve.ModContainer;
import customsteve.aB;
import customsteve.aH;
import customsteve.aQ;
import customsteve.aZ;
import customsteve.ac;
import customsteve.ai_0;
import customsteve.al;
import customsteve.ap_0;
import customsteve.ax;
import customsteve.b_0;
import customsteve.ba;
import customsteve.bc;
import customsteve.d_0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.ARBUniformBufferObject;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;
import org.lwjgl.opengl.GL31;
import org.lwjgl.util.glu.GLU;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ba
extends aZ {
    public static boolean a = false;
    private static final int b = 0;
    private static final int c = 1;
    private static final int d = 2;
    private static final int e = 3;
    private static final int f = 4;
    private static final int g = 5;
    private static final int h = 6;
    private static final int i = 7;
    private static final int j = 8;
    private static final int k = 9;
    private FloatBuffer a = ByteBuffer.allocateDirect(16).order(ByteOrder.nativeOrder()).asFloatBuffer();

    @Override
    public d_0 a() {
        String shaderName = E.a;
        String vs = ModContainer.b + "/CustomSteve/shaders/uberShader.vert";
        String fs = ModContainer.b + "/CustomSteve/shaders/uberShader.frag";
        String gs = ModContainer.b + "/CustomSteve/shaders/uberShader.geom";
        ArrayList<String> defines = new ArrayList<String>();
        boolean shadow = false;
        float bias = 0.0f;
        b_0.b("createPrimaryShader");
        defines.add("MAX_BONE_NUM 700");
        if (E.b && shaderName != null && !shaderName.equals("(none)") && !shaderName.equals("(internal)")) {
            shadow = true;
            if (shaderName.toLowerCase().indexOf("seus") != -1) {
                defines.add("SEUS");
                b_0.b("define SEUS.");
                if (shaderName.toLowerCase().indexOf("11") != -1) {
                    defines.add("SEUS110");
                    b_0.b("define SEUS110.");
                } else if (shaderName.toLowerCase().indexOf("10.2") != -1) {
                    defines.add("SEUS102");
                    b_0.b("define SEUS102.");
                }
            } else {
                defines.add("C13");
                b_0.b("define C13.");
            }
        }
        return new d_0.d(this, vs, fs, gs, d_0.c.b, defines.toArray(new String[defines.size()])){
            private int q;
            private int r;
            private int s;
            private int t;
            private int u;
            private int v;
            private int w;
            final /* synthetic */ ba a;
            {
                this.a = this$0;
                super(vs, fs, gs, version, macros);
            }

            protected void c(int id) {
                GL20.glBindAttribLocation((int)id, (int)0, (CharSequence)"vPosition");
                GL20.glBindAttribLocation((int)id, (int)1, (CharSequence)"vNormal");
                GL20.glBindAttribLocation((int)id, (int)2, (CharSequence)"vUV");
                GL20.glBindAttribLocation((int)id, (int)3, (CharSequence)"boneWeightType");
                GL20.glBindAttribLocation((int)id, (int)4, (CharSequence)"iBone");
                GL20.glBindAttribLocation((int)id, (int)5, (CharSequence)"fBoneWeight");
                GL20.glBindAttribLocation((int)id, (int)6, (CharSequence)"sdefC");
                GL20.glBindAttribLocation((int)id, (int)7, (CharSequence)"sdefR0");
                GL20.glBindAttribLocation((int)id, (int)8, (CharSequence)"sdefR1");
                GL20.glBindAttribLocation((int)id, (int)9, (CharSequence)"vFace");
            }

            protected void d(int id) {
                super.d(id);
                this.q = GL20.glGetUniformLocation((int)id, (CharSequence)"glColor");
                this.r = GL20.glGetUniformLocation((int)id, (CharSequence)"pureColor");
                this.s = GL20.glGetUniformLocation((int)id, (CharSequence)"enableLight");
                this.t = GL20.glGetUniformLocation((int)id, (CharSequence)"enableSpecular");
                this.u = GL20.glGetUniformLocation((int)id, (CharSequence)"lightValue");
                this.v = GL20.glGetUniformLocation((int)id, (CharSequence)"specularValue");
                this.w = GL31.glGetUniformBlockIndex((int)id, (CharSequence)"BoneMatrixArray");
            }

            public void a(String path, aB material, ac pfi, boolean light, boolean specular, boolean load) {
                super.a(path, material, pfi, light, specular, load);
                GL20.glUniform4f((int)this.v, (float)material.g, (float)material.h, (float)material.i, (float)(material.f / 128.0f));
                GL20.glUniform4f((int)this.q, (float)material.a, (float)material.b, (float)material.c, (float)material.e);
                GL20.glUniform1i((int)this.r, (int)(material.b == null || !load ? 1 : 0));
                GL20.glUniform1f((int)this.p, (float)b_0.d);
                GL20.glUniform1i((int)this.s, (int)(light ? 1 : 0));
                if (light) {
                    GL20.glUniform4f((int)this.u, (float)0.0043137255f, (float)1.0f, (float)1.0f, (float)1.0f);
                }
                GL20.glUniform1i((int)this.t, (int)(specular ? 1 : 0));
            }

            public void a(String path, aB material, ac pfi, boolean light, float lightValue, boolean specular, boolean load) {
                super.a(path, material, pfi, light, lightValue, specular, load);
                GL20.glUniform4f((int)this.v, (float)material.g, (float)material.h, (float)material.i, (float)(material.f / 128.0f));
                GL20.glUniform4f((int)this.q, (float)material.a, (float)material.b, (float)material.c, (float)material.e);
                GL20.glUniform1i((int)this.r, (int)(material.b == null ? 1 : 0));
                GL20.glUniform1f((int)this.p, (float)b_0.d);
                GL20.glUniform1i((int)this.s, (int)(light ? 1 : 0));
                if (light) {
                    GL20.glUniform4f((int)this.u, (float)0.0043137255f, (float)(lightValue / 255.0f), (float)(lightValue / 255.0f), (float)1.0f);
                }
                GL20.glUniform1i((int)this.t, (int)(specular ? 1 : 0));
            }

            public void a(int uboId) {
                ARBUniformBufferObject.glBindBufferBase((int)35345, (int)this.w, (int)uboId);
            }
        };
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public d_0 b() {
        String shaderName = E.a;
        String vs = ModContainer.b + "/CustomSteve/shaders/uberShader.vert";
        String fs = ModContainer.b + "/CustomSteve/shaders/uberShader.frag";
        String gs = ModContainer.b + "/CustomSteve/shaders/uberShader.geom";
        ArrayList<String> defines = new ArrayList<String>();
        boolean shadow = false;
        float bias = 0.0f;
        defines.add("MAX_BONE_NUM 700");
        return new d_0.d(this, vs, fs, gs, d_0.c.b, defines.toArray(new String[defines.size()])){
            private int q;
            private int r;
            private int s;
            final /* synthetic */ ba a;
            {
                this.a = this$0;
                super(vs, fs, gs, version, macros);
            }

            protected void c(int id) {
                GL20.glBindAttribLocation((int)id, (int)0, (CharSequence)"vPosition");
                GL20.glBindAttribLocation((int)id, (int)1, (CharSequence)"vNormal");
                GL20.glBindAttribLocation((int)id, (int)2, (CharSequence)"vUV");
                GL20.glBindAttribLocation((int)id, (int)3, (CharSequence)"boneWeightType");
                GL20.glBindAttribLocation((int)id, (int)4, (CharSequence)"iBone");
                GL20.glBindAttribLocation((int)id, (int)5, (CharSequence)"fBoneWeight");
                GL20.glBindAttribLocation((int)id, (int)6, (CharSequence)"sdefC");
                GL20.glBindAttribLocation((int)id, (int)7, (CharSequence)"sdefR0");
                GL20.glBindAttribLocation((int)id, (int)8, (CharSequence)"sdefR1");
                GL20.glBindAttribLocation((int)id, (int)9, (CharSequence)"vFace");
            }

            protected void d(int id) {
                super.d(id);
                this.q = GL20.glGetUniformLocation((int)id, (CharSequence)"glColor");
                this.r = GL20.glGetUniformLocation((int)id, (CharSequence)"pureColor");
                this.s = GL31.glGetUniformBlockIndex((int)id, (CharSequence)"BoneMatrixArray");
            }

            public void a(String path, aB material, ac pfi, boolean light, boolean specular, boolean load) {
                super.a(path, material, pfi, light, specular, load);
                GL20.glUniform4f((int)this.q, (float)material.a, (float)material.b, (float)material.c, (float)material.e);
                GL20.glUniform1i((int)this.r, (int)(material.b == null ? 1 : 0));
                GL20.glUniform1f((int)this.p, (float)b_0.d);
            }

            public void a(String path, aB material, ac pfi, boolean light, float lightValue, boolean specular, boolean load) {
                super.a(path, material, pfi, light, lightValue, specular, load);
                GL20.glUniform4f((int)this.q, (float)material.a, (float)material.b, (float)material.c, (float)material.e);
                GL20.glUniform1i((int)this.r, (int)(material.b == null ? 1 : 0));
                GL20.glUniform1f((int)this.p, (float)b_0.d);
            }

            public void a(double lightX, double lightY, double lightZ) {
                super.a(lightX, lightY, lightZ);
                GL20.glUniform1i((int)this.n, (int)0);
            }

            public void a(int uboId) {
                ARBUniformBufferObject.glBindBufferBase((int)35345, (int)this.s, (int)uboId);
            }
        };
    }

    @Override
    public boolean b() {
        return true;
    }

    @Override
    public d_0 c() {
        String shaderName = E.a;
        String vs = ModContainer.b + "/CustomSteve/shaders/uberShader.vert";
        String fs = ModContainer.b + "/CustomSteve/shaders/uberShader.frag";
        ArrayList<String> defines = new ArrayList<String>();
        boolean shadow = false;
        float bias = 0.0f;
        defines.add("SHADOW_SHADER");
        defines.add("MAX_BONE_NUM 700");
        if (shaderName.toLowerCase().indexOf("seus") != -1) {
            defines.add("SEUS");
            if (shaderName.toLowerCase().indexOf("11") != -1) {
                defines.add("SEUS110");
            } else if (shaderName.toLowerCase().indexOf("10.2") != -1) {
                defines.add("SEUS102");
            }
        } else {
            defines.add("C13");
        }
        if (shaderName.toLowerCase().indexOf("seus") != -1) {
            if (shaderName.toLowerCase().indexOf("10.2") != -1) {
                defines.add("SHADOW_MAP_BIAS 0.8");
            } else {
                defines.add("SHADOW_MAP_BIAS 0.9");
            }
        } else if (shaderName.toLowerCase().indexOf("airloocke") != -1) {
            defines.add("SHADOW_MAP_BIAS 0.9");
        } else if (shaderName.toLowerCase().indexOf("mrmeepz") != -1 || shaderName.toLowerCase().indexOf("robobo") != -1 || shaderName.toLowerCase().indexOf("trilitons") != -1) {
            defines.add("SHADOW_MAP_BIAS 0.6");
        } else {
            defines.add("SHADOW_MAP_BIAS 0.85");
        }
        return new d_0.a(this, vs, fs, d_0.c.b, defines.toArray(new String[defines.size()])){
            private int f;
            final /* synthetic */ ba a;
            {
                this.a = this$0;
                super(vs, fs, version, macros);
            }

            public void a(double lightX, double lightY, double lightZ) {
            }

            public void b(int spaType) {
            }

            public void a(String path, aB material, ac pfi, boolean light, boolean specular, boolean load) {
            }

            protected void c(int id) {
                GL20.glBindAttribLocation((int)id, (int)0, (CharSequence)"vPosition");
                GL20.glBindAttribLocation((int)id, (int)1, (CharSequence)"vNormal");
                GL20.glBindAttribLocation((int)id, (int)2, (CharSequence)"vUV");
                GL20.glBindAttribLocation((int)id, (int)3, (CharSequence)"boneWeightType");
                GL20.glBindAttribLocation((int)id, (int)4, (CharSequence)"iBone");
                GL20.glBindAttribLocation((int)id, (int)5, (CharSequence)"fBoneWeight");
                GL20.glBindAttribLocation((int)id, (int)6, (CharSequence)"sdefC");
                GL20.glBindAttribLocation((int)id, (int)7, (CharSequence)"sdefR0");
                GL20.glBindAttribLocation((int)id, (int)8, (CharSequence)"sdefR1");
                GL20.glBindAttribLocation((int)id, (int)9, (CharSequence)"vFace");
            }

            protected void d(int id) {
                this.f = GL31.glGetUniformBlockIndex((int)id, (CharSequence)"BoneMatrixArray");
            }

            public void a(String path, aB material, ac pfi, boolean light, float lightValue, boolean specular, boolean load) {
            }

            public void a(int artificialLight, int environmentalLight) {
            }

            public void a(int uboId) {
                ARBUniformBufferObject.glBindBufferBase((int)35345, (int)this.f, (int)uboId);
            }
        };
    }

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
        a handle = new a(ro.a, indexes, ro);
        return handle;
    }

    @Override
    public void a(aZ.a renderHandle) {
        a handle = (a)renderHandle;
        handle.a();
    }

    @Override
    public void a(String path, aZ.a renderHandle, ArrayList<al> boneBuffer, long faceP, boolean update, boolean light, float lightValue, boolean specular) {
        if (E.a.c) {
            this.a(path, boneBuffer, faceP, renderHandle);
            return;
        }
        a handle = (a)renderHandle;
        E sp = E.a;
        if (update) {
            this.a(boneBuffer, handle);
            sp.a((int)handle.a);
            GL15.glBindBuffer((int)34962, (int)handle.c);
            this.a(GL15.glMapBuffer((int)34962, (int)35001, null), handle, faceP);
            GL15.glUnmapBuffer((int)34962);
            GL15.glBindBuffer((int)34962, (int)0);
            handle.a = (ac)false;
        } else {
            sp.a((int)handle.a);
        }
        GL11.glEnableClientState((int)32884);
        GL30.glBindVertexArray((int)handle.b);
        ac model = handle.a;
        ai_0[] ms = ((ax)((ArrayList)((Object)model.a)).get((int)0)).b;
        int j2 = 0;
        boolean enableCullFace = GL11.glGetBoolean((int)2884);
        int loaded = 0;
        for (int i2 = 0; i2 < ms.size(); ++i2) {
            aB m2 = (aB)ms.get(i2);
            boolean cull = false;
            if (!enableCullFace && (m2.g || m2.f && Minecraft.getMinecraft().gameSettings.thirdPersonView == 0)) {
                GL11.glEnable((int)2884);
                cull = true;
            }
            int count = (int)m2.a;
            if (m2.e != 0.0f) {
                m2.d = path;
                if (!m2.a && loaded < b_0.d) {
                    m2.a = true;
                    ++loaded;
                }
                boolean load = m2.a;
                sp.a().a(path, m2, handle.a, m2.d, m2.e, load);
                if (m2.d || light) {
                    sp.a().a(255, 255);
                    a = true;
                } else if (a) {
                    sp.a().a(D.a[0], D.a[1]);
                    a = false;
                }
                GL11.glDrawElements((int)4, (int)count, (int)5125, (long)(j2 * 4));
            } else {
                m2.b();
            }
            j2 += count;
            if (!cull) continue;
            cull = false;
            if (enableCullFace) continue;
            GL11.glDisable((int)2884);
        }
        GL15.glBindBuffer((int)35882, (int)0);
        GL30.glBindVertexArray((int)0);
        GL11.glDisableClientState((int)32884);
    }

    private void a(String path, ArrayList<al> boneBuffer, long faceP, aZ.a renderHandle) {
        a handle = (a)renderHandle;
        E sp = E.a;
        if (boneBuffer != null && handle.a != false) {
            this.a(boneBuffer, handle);
            sp.a((int)handle.a);
            GL15.glBindBuffer((int)34962, (int)handle.c);
            this.a(GL15.glMapBuffer((int)34962, (int)35001, null), handle, faceP);
            GL15.glUnmapBuffer((int)34962);
            GL15.glBindBuffer((int)34962, (int)0);
        } else {
            sp.a((int)handle.a);
        }
        GL11.glEnableClientState((int)32884);
        GL30.glBindVertexArray((int)handle.b);
        ac model = handle.a;
        ai_0[] ms = ((ax)((ArrayList)((Object)model.a)).get((int)0)).b;
        int j2 = 0;
        for (int i2 = 0; i2 < ms.size(); ++i2) {
            aB m2 = (aB)ms.get(i2);
            int count = (int)m2.a;
            if (m2.e != 0.0f) {
                GL11.glDrawElements((int)4, (int)count, (int)5125, (long)(j2 * 4));
            }
            j2 += count;
        }
        GL15.glBindBuffer((int)35882, (int)0);
        GL30.glBindVertexArray((int)0);
        GL11.glDisableClientState((int)32884);
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

    private void a(ByteBuffer buffer, a handle, long faceP) {
        FloatBuffer floatBuffer = buffer.asFloatBuffer();
        floatBuffer.rewind();
        ai_0[] vertexBuffer = ((ax)((ArrayList)((Object)handle.a.a)).get((int)0)).c;
        ArrayList<aQ> faces = handle.a.h;
        int index = 0;
        for (ai_0 vertex : vertexBuffer) {
            float vtx = 0.0f;
            float vty = 0.0f;
            float vtz = 0.0f;
            if (vertex.b) {
                float vfs = vertex.a;
                float vms = vertex.b;
                for (int j2 = 0; j2 < vfs.size(); ++j2) {
                    float s;
                    aQ f2 = faces.get((Integer)vfs.get(j2));
                    ap_0 max = new ap_0((ap_0)vms.get(j2));
                    if (max == null || faceP == -1L) continue;
                    if (f2.u != null && f2.u.size() != 0) {
                        if (faceP < (long)f2.u.size()) {
                            s = 0.0f;
                            s = !f2.a ? f2.u.get((int)faceP).floatValue() : f2.a;
                            max.b(s);
                            vtx += max.a;
                            vty += max.b;
                            vtz += max.c;
                            continue;
                        }
                        s = 0.0f;
                        s = !f2.a ? f2.u.get(f2.u.size() - 1).floatValue() : f2.a;
                        max.b(s);
                        vtx += max.a;
                        vty += max.b;
                        vtz += max.c;
                        continue;
                    }
                    if (!f2.a) continue;
                    s = 0.0f;
                    s = f2.a;
                    max.b(s);
                    vtx += max.a;
                    vty += max.b;
                    vtz += max.c;
                }
            }
            floatBuffer.put(vtx).put(vty).put(vtz);
            ++index;
        }
        floatBuffer.rewind();
    }
}

