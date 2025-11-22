/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class CSwriter {
    PmdFileInfo clinton$;
    private BufferedOutputStream southern$;
    private BufferedWriter hints$;

    public CSwriter(PmdFileInfo pfi) {
        this.clinton$ = pfi;
    }

    public void _leather(File tar) throws Exception {
        if (!tar.exists()) {
            tar.createNewFile();
        } else {
            tar.delete();
            tar.createNewFile();
        }
        this.southern$ = new BufferedOutputStream(new FileOutputStream(tar.getAbsolutePath()));
        this.hints$ = new BufferedWriter(new OutputStreamWriter(this.southern$));
        this._relating(1.0f);
        this._coming(this.clinton$.menus$);
        this._coming(this.clinton$.column$);
        long vsl = ((Geometry)this.clinton$.belongs$.get((int)0)).issues$.length;
        Vertex[] vs = ((Geometry)this.clinton$.belongs$.get((int)0)).issues$;
        this._canada(vsl);
        int i = 0;
        while ((long)i < vsl) {
            this._relating(vs[i].writes$);
            this._relating(vs[i].shower$);
            this._relating(vs[i].colors$);
            this._relating(vs[i].sudan$);
            this._relating(vs[i].applying$);
            this._relating(vs[i].quantity$);
            this._relating(vs[i].poker$);
            this._relating(vs[i].entirely$);
            ++i;
        }
        this.southern$.flush();
        this.southern$.close();
    }

    private void _relating(float f2) throws IOException {
        byte[] result = new byte[4];
        int i = Float.floatToIntBits(f2);
        result[0] = (byte)(i >> 24 & 0xFF);
        result[1] = (byte)(i >> 16 & 0xFF);
        result[2] = (byte)(i >> 8 & 0xFF);
        result[3] = (byte)(i & 0xFF);
        this.southern$.write(result);
    }

    private void _blessed(int i) throws IOException {
        byte[] result = new byte[]{(byte)(i >> 24 & 0xFF), (byte)(i >> 16 & 0xFF), (byte)(i >> 8 & 0xFF), (byte)(i & 0xFF)};
        this.southern$.write(result);
    }

    private void _invision(short s) throws IOException {
        byte[] result = new byte[2];
        result[1] = (byte)(s >> 8 & 0xFF);
        result[0] = (byte)(s & 0xFF);
        this.southern$.write(result);
    }

    private void _chair(float[] fs) throws IOException {
        for (int i = 0; i < fs.length; ++i) {
            this._relating(fs[i]);
        }
    }

    private void _coming(String set) throws IOException {
        if (set == null) {
            return;
        }
        this.southern$.write(set.getBytes());
    }

    private void _loaded(byte b2) throws IOException {
        this.southern$.write(b2);
    }

    private void _canada(long l) throws IOException {
        int i = (int)l;
        byte[] result = new byte[]{(byte)(i >> 24 & 0xFF), (byte)(i >> 16 & 0xFF), (byte)(i >> 8 & 0xFF), (byte)(i & 0xFF)};
        this.southern$.write(result);
    }
}

