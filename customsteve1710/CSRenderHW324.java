/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL15
 *  org.lwjgl.opengl.GL30
 *  org.lwjgl.util.glu.GLU
 */
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL30;
import org.lwjgl.util.glu.GLU;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class CSRenderHW324
extends CSRender2 {
    public static boolean planning$ = false;
    private static final int lovely$ = 0;
    private static final int bridges$ = 1;
    private static final int packing$ = 2;
    private static final int slope$ = 3;
    private static final int confirm$ = 4;
    private static final int dated$ = 5;
    private static final int teaches$ = 6;
    private static final int malaysia$ = 7;
    private static final int lyrics$ = 8;
    private static final int watched$ = 9;
    private FloatBuffer scenic$ = ByteBuffer.allocateDirect(16).order(ByteOrder.nativeOrder()).asFloatBuffer();

    public Shader5 a() {
        String shaderName = ShaderProgram.japanese$;
        String vs = ModContainer.outreach$ + "/CustomSteve/shaders/uberShader.vert";
        String fs = ModContainer.outreach$ + "/CustomSteve/shaders/uberShader.frag";
        String gs = ModContainer.outreach$ + "/CustomSteve/shaders/uberShader.geom";
        ArrayList<String> defines = new ArrayList<String>();
        boolean shadow = false;
        float bias = 0.0f;
        Config._lightbox("for shaderPack:" + shaderName + " createPrimaryShader.");
        defines.add("MAX_BONE_NUM 700");
        if (ShaderProgram.stack$ && shaderName != null && !shaderName.equals("(none)") && !shaderName.equals("(internal)")) {
            shadow = true;
            if (shaderName.toLowerCase().indexOf("seus") != -1) {
                defines.add("SEUS");
                Config._lightbox("define SEUS.");
                if (shaderName.toLowerCase().indexOf("11") != -1) {
                    defines.add("SEUS110");
                    Config._lightbox("define SEUS110.");
                } else if (shaderName.toLowerCase().indexOf("10.2") != -1) {
                    defines.add("SEUS102");
                    Config._lightbox("define SEUS102.");
                }
            } else {
                defines.add("C13");
                Config._lightbox("define C13.");
            }
        }
        return new CSRenderHW323(this, vs, fs, gs, Shader4.explains$, defines.toArray(new String[defines.size()]));
    }

    public boolean a() {
        return true;
    }

    public Shader5 b() {
        String shaderName = ShaderProgram.japanese$;
        String vs = ModContainer.outreach$ + "/CustomSteve/shaders/uberShader.vert";
        String fs = ModContainer.outreach$ + "/CustomSteve/shaders/uberShader.frag";
        String gs = ModContainer.outreach$ + "/CustomSteve/shaders/uberShader.geom";
        ArrayList<String> defines = new ArrayList<String>();
        boolean shadow = false;
        float bias = 0.0f;
        Config._lightbox("createSecondShader");
        defines.add("MAX_BONE_NUM 700");
        return new CSRenderHW32(this, vs, fs, gs, Shader4.explains$, defines.toArray(new String[defines.size()]));
    }

    public boolean b() {
        return true;
    }

    public Shader5 c() {
        String shaderName = ShaderProgram.japanese$;
        String vs = ModContainer.outreach$ + "/CustomSteve/shaders/uberShader.vert";
        String fs = ModContainer.outreach$ + "/CustomSteve/shaders/uberShader.frag";
        ArrayList<String> defines = new ArrayList<String>();
        boolean shadow = false;
        float bias = 0.0f;
        Config._lightbox("createShadowShader");
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
        return new CSRenderHW322(this, vs, fs, Shader4.explains$, defines.toArray(new String[defines.size()]));
    }

    public CSRender a(RenderObject ro) {
        PmdFileInfo model = ro.agents$;
        if (model.belongs$.size() <= 0) {
            return null;
        }
        int[] indexes = new int[((Geometry)model.belongs$.get((int)0)).signup$.size() * 3];
        int p = 0;
        for (TriangleFace face : ((Geometry)model.belongs$.get((int)0)).signup$) {
            indexes[p++] = (Integer)face.browse$.get(0);
            indexes[p++] = (Integer)face.browse$.get(1);
            indexes[p++] = (Integer)face.browse$.get(2);
        }
        CSRenderHW325 handle = new CSRenderHW325(ro.agents$, indexes, ro);
        return handle;
    }

    public void a(CSRender renderHandle) {
        CSRenderHW325 handle = (CSRenderHW325)renderHandle;
        handle.a();
    }

    public void a(String path, CSRender renderHandle, ArrayList boneBuffer, long faceP, boolean update, boolean light, float lightValue, boolean specular) {
        if (ShaderProgram.wonder$.enabling$) {
            this.a(path, boneBuffer, faceP, renderHandle);
            return;
        }
        CSRenderHW325 handle = (CSRenderHW325)renderHandle;
        ShaderProgram sp = ShaderProgram.wonder$;
        if (update) {
            this.a(boneBuffer, handle);
            sp._friend(handle.a);
            GL15.glBindBuffer((int)34962, (int)handle.trees$);
            this.a(GL15.glMapBuffer((int)34962, (int)35001, null), handle, faceP);
            GL15.glUnmapBuffer((int)34962);
            GL15.glBindBuffer((int)34962, (int)0);
            handle.a = false;
        } else {
            sp._friend(handle.a);
        }
        GL11.glEnableClientState((int)32884);
        GL30.glBindVertexArray((int)handle.parent$);
        PmdFileInfo model = handle.infinite$;
        ArrayList ms = ((Geometry)model.belongs$.get((int)0)).found$;
        int j = 0;
        boolean enableCullFace = GL11.glGetBoolean((int)2884);
        int loaded = 0;
        for (int i = 0; i < ms.size(); ++i) {
            Material m = (Material)ms.get(i);
            boolean notCull = false;
            if (enableCullFace && m.bikini$) {
                notCull = true;
                GL11.glDisable((int)2884);
            }
            int count = (int)m.collins$;
            if (m.glory$ != 0.0f) {
                m.tracks$ = path;
                if (!m.storage$ && loaded < Config.receive$) {
                    m.storage$ = true;
                    ++loaded;
                }
                boolean load = m.storage$;
                sp._rapid()._freight(path, m, handle.infinite$, m.petition$, m.authors$, load);
                if (m.petition$ || light) {
                    sp._rapid()._greatest(255, 255);
                    planning$ = true;
                } else if (planning$) {
                    sp._rapid()._greatest(Shader5.steve$[0], Shader5.steve$[1]);
                    planning$ = false;
                }
                GL11.glDrawElements((int)4, (int)count, (int)5125, (long)(j * 4));
            } else {
                m._viewer();
            }
            j += count;
            if (!notCull) continue;
            notCull = false;
            if (!enableCullFace) continue;
            GL11.glEnable((int)2884);
        }
        GL15.glBindBuffer((int)35882, (int)0);
        GL30.glBindVertexArray((int)0);
        GL11.glDisableClientState((int)32884);
    }

    private void a(String path, ArrayList boneBuffer, long faceP, CSRender renderHandle) {
        CSRenderHW325 handle = (CSRenderHW325)renderHandle;
        ShaderProgram sp = ShaderProgram.wonder$;
        if (boneBuffer != null && handle.a) {
            this.a(boneBuffer, handle);
            sp._friend(handle.a);
            GL15.glBindBuffer((int)34962, (int)handle.trees$);
            this.a(GL15.glMapBuffer((int)34962, (int)35001, null), handle, faceP);
            GL15.glUnmapBuffer((int)34962);
            GL15.glBindBuffer((int)34962, (int)0);
        } else {
            sp._friend(handle.a);
        }
        GL11.glEnableClientState((int)32884);
        GL30.glBindVertexArray((int)handle.parent$);
        PmdFileInfo model = handle.infinite$;
        ArrayList ms = ((Geometry)model.belongs$.get((int)0)).found$;
        int j = 0;
        for (int i = 0; i < ms.size(); ++i) {
            Material m = (Material)ms.get(i);
            int count = (int)m.collins$;
            if (m.glory$ != 0.0f) {
                GL11.glDrawElements((int)4, (int)count, (int)5125, (long)(j * 4));
            }
            j += count;
        }
        GL15.glBindBuffer((int)35882, (int)0);
        GL30.glBindVertexArray((int)0);
        GL11.glDisableClientState((int)32884);
    }

    private FloatBuffer a(float a1, float a2, float a3, float a4) {
        this.scenic$.clear();
        this.scenic$.put(FloatBuffer.wrap(new float[]{a1, a2, a3, a4}));
        this.scenic$.flip();
        return this.scenic$;
    }

    private void a() {
        int i = GL11.glGetError();
        while (i != 0) {
            System.err.println(GLU.gluErrorString((int)i));
            i = GL11.glGetError();
        }
    }

    private void a(ByteBuffer buffer, CSRenderHW325 handle, long faceP) {
        FloatBuffer floatBuffer = buffer.asFloatBuffer();
        floatBuffer.rewind();
        Vertex[] vertexBuffer = ((Geometry)handle.infinite$.belongs$.get((int)0)).domestic$;
        ArrayList faces = handle.infinite$.highs$;
        int index = 0;
        for (Vertex vertex : vertexBuffer) {
            float vtx = 0.0f;
            float vty = 0.0f;
            float vtz = 0.0f;
            if (vertex.embassy$) {
                ArrayList vfs = vertex.passion$;
                ArrayList vms = vertex.phase$;
                for (int j = 0; j < vfs.size(); ++j) {
                    float s;
                    pmxMorph f2 = (pmxMorph)faces.get((Integer)vfs.get(j));
                    Vector3f max = new Vector3f((Vector3f)vms.get(j));
                    if (max == null || faceP == -1L) continue;
                    if (f2.locator$ != null && f2.locator$.size() != 0) {
                        if (faceP < (long)f2.locator$.size()) {
                            s = 0.0f;
                            s = !f2.strange$ ? ((Float)f2.locator$.get((int)faceP)).floatValue() : f2.stood$;
                            max._licence(s);
                            vtx += max.serves$;
                            vty += max.genius$;
                            vtz += max.superb$;
                            continue;
                        }
                        s = 0.0f;
                        s = !f2.strange$ ? ((Float)f2.locator$.get(f2.locator$.size() - 1)).floatValue() : f2.stood$;
                        max._licence(s);
                        vtx += max.serves$;
                        vty += max.genius$;
                        vtz += max.superb$;
                        continue;
                    }
                    if (!f2.strange$) continue;
                    s = 0.0f;
                    s = f2.stood$;
                    max._licence(s);
                    vtx += max.serves$;
                    vty += max.genius$;
                    vtz += max.superb$;
                }
            }
            floatBuffer.put(vtx).put(vty).put(vtz);
            ++index;
        }
        floatBuffer.rewind();
    }
}

