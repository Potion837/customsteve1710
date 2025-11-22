/*
 * Decompiled with CFR 0.152.
 */
package customsteve;

import customsteve.aB;
import customsteve.ac;
import customsteve.d_0;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from customsteve.D
 */
public abstract class d_0 {
    public static int[] a = new int[]{1, 1};
    protected int a = -1;
    protected int b = -1;
    protected int c = -1;
    protected int d = -1;

    public abstract void a(double var1, double var3, double var5);

    public abstract void a(int var1, int var2);

    public abstract void a(int var1);

    public abstract void a(String var1, aB var2, ac var3, boolean var4, boolean var5, boolean var6);

    public abstract void a(String var1, aB var2, ac var3, boolean var4, float var5, boolean var6, boolean var7);

    public abstract void b(int var1);

    public abstract void a();

    public int a() {
        return this.a;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final String a(File file) throws IOException {
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

    protected String a(File file, c version, boolean enableGeomShader, String ... marcos) throws Exception {
        String source = this.a(file);
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
        return sb.toString();
    }
}

