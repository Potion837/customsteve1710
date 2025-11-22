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

class CSRenderHW323
extends Shader3 {
    private int banned$;
    private int pages$;
    private int garlic$;
    private int weekend$;
    private int queries$;
    private int publish$;
    private int centre$;
    final /* synthetic */ CSRenderHW324 subjects$;

    CSRenderHW323(CSRenderHW324 this$0, String vs, String fs, String gs, Shader4 version, String ... macros) {
        this.subjects$ = this$0;
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
        this.banned$ = GL20.glGetUniformLocation((int)id, (CharSequence)"glColor");
        this.pages$ = GL20.glGetUniformLocation((int)id, (CharSequence)"pureColor");
        this.garlic$ = GL20.glGetUniformLocation((int)id, (CharSequence)"enableLight");
        this.weekend$ = GL20.glGetUniformLocation((int)id, (CharSequence)"enableSpecular");
        this.queries$ = GL20.glGetUniformLocation((int)id, (CharSequence)"lightValue");
        this.publish$ = GL20.glGetUniformLocation((int)id, (CharSequence)"specularValue");
        this.centre$ = GL31.glGetUniformBlockIndex((int)id, (CharSequence)"BoneMatrixArray");
    }

    @Override
    public void a(String path, Material material, PmdFileInfo pfi, boolean light, boolean specular, boolean load) {
        super.a(path, material, pfi, light, specular, load);
        GL20.glUniform4f((int)this.publish$, (float)material.mouse$, (float)material.episode$, (float)material.sorted$, (float)(material.sticks$ / 128.0f));
        GL20.glUniform4f((int)this.banned$, (float)material.silver$, (float)material.latitude$, (float)material.depend$, (float)material.glory$);
        GL20.glUniform1i((int)this.pages$, (int)(material.texas$ == null || !load ? 1 : 0));
        GL20.glUniform1f((int)this.p, (float)Config.ranges$);
        GL20.glUniform1i((int)this.garlic$, (int)(light ? 1 : 0));
        if (light) {
            GL20.glUniform4f((int)this.queries$, (float)0.0043137255f, (float)1.0f, (float)1.0f, (float)1.0f);
        }
        GL20.glUniform1i((int)this.weekend$, (int)(specular ? 1 : 0));
    }

    @Override
    public void a(String path, Material material, PmdFileInfo pfi, boolean light, float lightValue, boolean specular, boolean load) {
        super.a(path, material, pfi, light, lightValue, specular, load);
        GL20.glUniform4f((int)this.publish$, (float)material.mouse$, (float)material.episode$, (float)material.sorted$, (float)(material.sticks$ / 128.0f));
        GL20.glUniform4f((int)this.banned$, (float)material.silver$, (float)material.latitude$, (float)material.depend$, (float)material.glory$);
        GL20.glUniform1i((int)this.pages$, (int)(material.texas$ == null ? 1 : 0));
        GL20.glUniform1f((int)this.p, (float)Config.ranges$);
        GL20.glUniform1i((int)this.garlic$, (int)(light ? 1 : 0));
        if (light) {
            GL20.glUniform4f((int)this.queries$, (float)0.0043137255f, (float)(lightValue / 255.0f), (float)(lightValue / 255.0f), (float)1.0f);
        }
        GL20.glUniform1i((int)this.weekend$, (int)(specular ? 1 : 0));
    }

    public void a(int uboId) {
        ARBUniformBufferObject.glBindBufferBase((int)35345, (int)this.centre$, (int)uboId);
    }
}

