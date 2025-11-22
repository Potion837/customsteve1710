/*
 * Decompiled with CFR 0.152.
 */
package customsteve;

import customsteve.ac;
import customsteve.ai_0;
import customsteve.ax;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class Z {
    ac a;
    private BufferedOutputStream a;
    private BufferedWriter a;

    public Z(ac pfi) {
        this.a = pfi;
    }

    public void a(File tar) throws Exception {
        if (!tar.exists()) {
            tar.createNewFile();
        } else {
            tar.delete();
            tar.createNewFile();
        }
        this.a = new BufferedOutputStream(new FileOutputStream(tar.getAbsolutePath()));
        this.a = new BufferedWriter(new OutputStreamWriter(this.a));
        this.a(1.0f);
        this.a(this.a.a);
        this.a(this.a.b);
        long vsl = ((ax)((ArrayList)((Object)this.a.a)).get((int)0)).a.length;
        ai_0[] vs = ((ax)((ArrayList)((Object)this.a.a)).get((int)0)).a;
        this.a(vsl);
        int i2 = 0;
        while ((long)i2 < vsl) {
            this.a(vs[i2].a);
            this.a(vs[i2].b);
            this.a(vs[i2].c);
            this.a(vs[i2].d);
            this.a(vs[i2].e);
            this.a(vs[i2].f);
            this.a(vs[i2].g);
            this.a(vs[i2].h);
            ++i2;
        }
        this.a.flush();
        this.a.close();
    }

    private void a(float f2) throws IOException {
        byte[] result = new byte[4];
        int i2 = Float.floatToIntBits(f2);
        result[0] = (byte)(i2 >> 24 & 0xFF);
        result[1] = (byte)(i2 >> 16 & 0xFF);
        result[2] = (byte)(i2 >> 8 & 0xFF);
        result[3] = (byte)(i2 & 0xFF);
        this.a.write(result);
    }

    private void a(int i2) throws IOException {
        byte[] result = new byte[]{(byte)(i2 >> 24 & 0xFF), (byte)(i2 >> 16 & 0xFF), (byte)(i2 >> 8 & 0xFF), (byte)(i2 & 0xFF)};
        this.a.write(result);
    }

    private void a(short s) throws IOException {
        byte[] result = new byte[2];
        result[1] = (byte)(s >> 8 & 0xFF);
        result[0] = (byte)(s & 0xFF);
        this.a.write(result);
    }

    private void a(float[] fs) throws IOException {
        for (int i2 = 0; i2 < fs.length; ++i2) {
            this.a(fs[i2]);
        }
    }

    private void a(String set) throws IOException {
        if (set == null) {
            return;
        }
        this.a.write(set.getBytes());
    }

    private void a(byte b2) throws IOException {
        this.a.write(b2);
    }

    private void a(long l2) throws IOException {
        int i2 = (int)l2;
        byte[] result = new byte[]{(byte)(i2 >> 24 & 0xFF), (byte)(i2 >> 16 & 0xFF), (byte)(i2 >> 8 & 0xFF), (byte)(i2 & 0xFF)};
        this.a.write(result);
    }
}

