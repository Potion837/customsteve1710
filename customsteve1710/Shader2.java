/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.opengl.ARBUniformBufferObject
 *  org.lwjgl.opengl.GL20
 */
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.ARBUniformBufferObject;
import org.lwjgl.opengl.GL20;

public abstract class Shader2
extends Shader5 {
    public int blues$;

    public Shader2(String vs, String fs, Shader4 version, String ... macros) {
        this(vs, fs, null, version, macros);
    }

    public Shader2(String vs, String fs, String gs, Shader4 version, String ... macros) {
        if (vs == null) {
            throw new NullPointerException("VertexShader can't be null!");
        }
        if (fs == null) {
            throw new NullPointerException("FragmentShader can't be null!");
        }
        this.a = GL20.glCreateProgram();
        this.b = this.a(Shader.historic$, vs, version, gs != null, macros);
        this.d = gs == null ? -1 : this.a(Shader.health$, gs, version, true, macros);
        this.c = this.a(Shader.space$, fs, version, gs != null, macros);
        GL20.glAttachShader((int)this.a, (int)this.b);
        if (this.d != -1) {
            GL20.glAttachShader((int)this.a, (int)this.d);
        }
        GL20.glAttachShader((int)this.a, (int)this.c);
        this.c(this.a);
        GL20.glLinkProgram((int)this.a);
        if (GL20.glGetProgrami((int)this.a, (int)35714) == 0) {
            System.err.println("Program link error!");
            IntBuffer length = BufferUtils.createIntBuffer((int)1);
            GL20.glGetProgram((int)this.a, (int)35716, (IntBuffer)length);
            length.rewind();
            ByteBuffer buffer = BufferUtils.createByteBuffer((int)(length.get() + 1));
            length.rewind();
            GL20.glGetProgramInfoLog((int)this.a, (IntBuffer)length, (ByteBuffer)buffer);
            buffer.rewind();
            byte[] result = new byte[buffer.limit()];
            buffer.get(result);
            char[] string = new char[result.length];
            for (int i = 0; i < string.length; ++i) {
                string[i] = (char)result[i];
            }
            System.err.println(String.valueOf(string));
        }
        this.blues$ = ARBUniformBufferObject.glGetUniformBlockIndex((int)this.a, (CharSequence)"BoneMatrixArray");
        this.d(this.a);
    }

    protected abstract void c(int var1);

    protected abstract void d(int var1);

    public void a() {
        GL20.glDetachShader((int)this.a, (int)this.b);
        GL20.glDetachShader((int)this.a, (int)this.c);
        if (this.d != -1) {
            GL20.glDetachShader((int)this.a, (int)this.d);
            GL20.glDeleteShader((int)this.d);
        }
        GL20.glDeleteShader((int)this.b);
        GL20.glDeleteShader((int)this.c);
        GL20.glDeleteProgram((int)this.a);
        this.c = -1;
        this.d = -1;
        this.b = -1;
        this.a = -1;
    }

    protected int a(Shader type, String file, Shader4 version, boolean enableGeomShader, String ... marcos) {
        int shaderId = GL20.glCreateShader((int)type._broken());
        try {
            String source = this.a(new File(file), version, enableGeomShader, marcos);
            GL20.glShaderSource((int)shaderId, (CharSequence)source);
        }
        catch (Exception e2) {
            e2.printStackTrace();
        }
        GL20.glCompileShader((int)shaderId);
        if (GL20.glGetShaderi((int)shaderId, (int)35713) == 0) {
            System.err.println(type.toString() + " shader load error!");
            this.e(shaderId);
        }
        return shaderId;
    }

    protected final void e(int shader) {
        IntBuffer length = BufferUtils.createIntBuffer((int)1);
        GL20.glGetShader((int)shader, (int)35716, (IntBuffer)length);
        length.rewind();
        ByteBuffer buffer = BufferUtils.createByteBuffer((int)(length.get() + 1));
        length.rewind();
        GL20.glGetShaderInfoLog((int)shader, (IntBuffer)length, (ByteBuffer)buffer);
        buffer.rewind();
        byte[] result = new byte[buffer.limit()];
        buffer.get(result);
        char[] string = new char[result.length];
        for (int i = 0; i < string.length; ++i) {
            string[i] = (char)result[i];
        }
        System.err.println(String.valueOf(string));
    }
}

