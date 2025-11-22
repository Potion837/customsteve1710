/*
 * Decompiled with CFR 0.152.
 */
package customsteve;

import customsteve.ac;
import customsteve.ac_0;
import customsteve.am;
import customsteve.ar;
import customsteve.au;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

/*
 * Renamed from customsteve.W
 * Duplicate member names - consider using --renamedupmembers true
 */
public class w_0 {
    ac a;
    private BufferedOutputStream a;
    private BufferedWriter a;

    public w_0(ac pfi) {
        this.a = pfi;
    }

    public void a(File tar) throws Exception {
        int i2;
        if (!tar.exists()) {
            tar.createNewFile();
        } else {
            tar.delete();
            tar.createNewFile();
        }
        this.a = new BufferedOutputStream(new FileOutputStream(tar.getAbsolutePath()));
        this.a = new BufferedWriter(new OutputStreamWriter(this.a));
        ArrayList<ac_0> rbs = this.a.g;
        ArrayList<au> css = this.a.f;
        this.a((long)rbs.size());
        for (i2 = 0; i2 < rbs.size(); ++i2) {
            ac_0 rb = rbs.get(i2);
            this.a(rb.c);
            this.a(rb.a);
            this.a(rb.b);
            this.a(rb.c);
            ar b2 = null;
            try {
                b2 = this.a.c.get(rb.a);
            }
            catch (Exception exception) {
                // empty catch block
            }
            if (b2 != null) {
                this.a(b2.i.b((float)rb.d, (float)rb.e, (float)rb.f).a);
                this.a(b2.i.b((float)rb.d, (float)rb.e, (float)rb.f).b);
                this.a(b2.i.b((float)rb.d, (float)rb.e, (float)rb.f).c);
            } else {
                this.a(rb.d);
                this.a(rb.e);
                this.a(rb.f);
            }
            am q2 = new am();
            q2.a(-rb.h, rb.i, -rb.g);
            q2.a();
            am cq = new am(q2.b(), q2.c(), q2.a(), q2.d());
            float[] angles = cq.a((float[])null);
            this.a(rb.g);
            this.a(rb.h);
            this.a(rb.i);
            this.a(rb.j);
            this.a(rb.k);
            this.a(rb.l);
            this.a(rb.m);
            this.a(rb.n);
            this.a(rb.d);
            int test = -1;
            this.a(rb.a);
            this.a(rb.b);
        }
        this.a((long)css.size());
        for (i2 = 0; i2 < css.size(); ++i2) {
            au cs = css.get(i2);
            this.a((int)cs.a);
            this.a((int)cs.b);
            this.a(cs.a);
            this.a(cs.b);
            this.a(cs.c);
            this.a(cs.d);
            this.a(cs.e);
            this.a(cs.f);
            this.a(cs.g);
            this.a(cs.h);
            this.a(cs.i);
            this.a(cs.j);
            this.a(cs.k);
            this.a(cs.l);
            this.a(cs.n);
            this.a(cs.o);
            this.a(cs.m);
            this.a(cs.q);
            this.a(cs.r);
            this.a(cs.p);
            this.a(cs.s);
            this.a(cs.t);
            this.a(cs.u);
            this.a(cs.v);
            this.a(cs.w);
            this.a(cs.x);
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

    private void a(byte b2) throws IOException {
        this.a.write(b2);
    }

    private void a(long l2) throws IOException {
        int i2 = (int)l2;
        byte[] result = new byte[]{(byte)(i2 >> 24 & 0xFF), (byte)(i2 >> 16 & 0xFF), (byte)(i2 >> 8 & 0xFF), (byte)(i2 & 0xFF)};
        this.a.write(result);
    }
}

