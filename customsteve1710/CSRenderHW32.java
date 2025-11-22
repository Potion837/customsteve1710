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

class CSRenderHW32
extends Shader3 {
    private int freely$;
    private int eastern$;
    private int location$;
    final /* synthetic */ CSRenderHW324 spencer$;

    CSRenderHW32(CSRenderHW324 this$0, String vs, String fs, String gs, Shader4 version, String ... macros) {
        this.spencer$ = this$0;
        super(vs, fs, gs, version, macros);
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
        super.d(id);
        this.freely$ = GL20.glGetUniformLocation((int)id, (CharSequence)"glColor");
        this.eastern$ = GL20.glGetUniformLocation((int)id, (CharSequence)"pureColor");
        this.location$ = GL31.glGetUniformBlockIndex((int)id, (CharSequence)"BoneMatrixArray");
    }

    @Override
    public void a(String path, Material material, PmdFileInfo pfi, boolean light, boolean specular, boolean load) {
        super.a(path, material, pfi, light, specular, load);
        GL20.glUniform4f((int)this.freely$, (float)material.silver$, (float)material.latitude$, (float)material.depend$, (float)material.glory$);
        GL20.glUniform1i((int)this.eastern$, (int)(material.texas$ == null ? 1 : 0));
        GL20.glUniform1f((int)this.p, (float)Config.ranges$);
    }

    @Override
    public void a(String path, Material material, PmdFileInfo pfi, boolean light, float lightValue, boolean specular, boolean load) {
        super.a(path, material, pfi, light, lightValue, specular, load);
        GL20.glUniform4f((int)this.freely$, (float)material.silver$, (float)material.latitude$, (float)material.depend$, (float)material.glory$);
        GL20.glUniform1i((int)this.eastern$, (int)(material.texas$ == null ? 1 : 0));
        GL20.glUniform1f((int)this.p, (float)Config.ranges$);
    }

    @Override
    public void a(double lightX, double lightY, double lightZ) {
        super.a(lightX, lightY, lightZ);
        GL20.glUniform1i((int)this.n, (int)0);
    }

    public void a(int uboId) {
        ARBUniformBufferObject.glBindBufferBase((int)35345, (int)this.location$, (int)uboId);
    }
}

