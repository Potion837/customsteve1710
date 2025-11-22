/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public abstract class Shader5 {
    public static int[] steve$ = new int[]{1, 1};
    protected int polished$ = -1;
    protected int senate$ = -1;
    protected int arising$ = -1;
    protected int devices$ = -1;

    public abstract void _advisor(double var1, double var3, double var5);

    public abstract void _greatest(int var1, int var2);

    public abstract void _detect(int var1);

    public abstract void _freight(String var1, Material var2, PmdFileInfo var3, boolean var4, boolean var5, boolean var6);

    public abstract void _wherever(String var1, Material var2, PmdFileInfo var3, boolean var4, float var5, boolean var6, boolean var7);

    public abstract void _replies(int var1);

    public abstract void _floral();

    public int _tattoo() {
        return this.polished$;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final String _newbie(File file) throws IOException {
        StringBuilder source = new StringBuilder();
        BufferedReader reader = null;
        try {
            String line;
            reader = new BufferedReader(new FileReader(file));
            while ((line = reader.readLine()) != null) {
                source.append(line + "\n");
            }
        }
        finally {
            if (reader != null) {
                try {
                    reader.close();
                }
                catch (IOException iOException) {}
            }
        }
        return source.toString();
    }

    protected String _houses(File file, Shader4 version, boolean enableGeomShader, String ... marcos) throws Exception {
        String source = this._newbie(file);
        StringBuilder sb = new StringBuilder();
        sb.append("#version ").append((Object)version);
        if (enableGeomShader) {
            sb.append("\n#extension GL_EXT_gpu_shader4 : enable");
        }
        sb.append("\n#define CUSTOM_STEVE\n");
        for (String s : marcos) {
            sb.append("#define ").append(s).append("\n");
        }
        sb.append("\n").append(source).append("\n");
        Config._lightbox("marcos: " + sb.toString());
        return sb.toString();
    }
}

