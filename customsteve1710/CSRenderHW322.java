/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.ARBUniformBufferObject
 *  org.lwjgl.opengl.GL20
 *  org.lwjgl.opengl.GL31
 */
import org.lwjgl.opengl.ARBUniformBufferObject;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL31;

class CSRenderHW322
extends Shader2 {
    private int custody$;
    final /* synthetic */ CSRenderHW324 surgical$;

    CSRenderHW322(CSRenderHW324 this$0, String vs, String fs, Shader4 version, String ... macros) {
        this.surgical$ = this$0;
        super(vs, fs, version, macros);
    }

    public void a(double lightX, double lightY, double lightZ) {
    }

    public void b(int spaType) {
    }

    public void a(String path, Material material, PmdFileInfo pfi, boolean light, boolean specular, boolean load) {
    }

    @Override
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

    @Override
    protected void d(int id) {
        this.custody$ = GL31.glGetUniformBlockIndex((int)id, (CharSequence)"BoneMatrixArray");
    }

    public void a(String path, Material material, PmdFileInfo pfi, boolean light, float lightValue, boolean specular, boolean load) {
    }

    public void a(int artificialLight, int environmentalLight) {
    }

    public void a(int uboId) {
        ARBUniformBufferObject.glBindBufferBase((int)35345, (int)this.custody$, (int)uboId);
    }
}

