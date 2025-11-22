/*
 * Decompiled with CFR 0.152.
 */
package customsteve;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class U {
    private BufferedInputStream a;
    private BufferedReader a;

    public U(InputStream in) {
        this.a = new BufferedInputStream(in);
        this.a = new BufferedReader(new InputStreamReader(in));
    }

    public final int a() throws IOException {
        return this.a.read() & 0xFF | (this.a.read() & 0xFF) << 8;
    }

    public final long a() throws IOException {
        return (long)(this.a.read() & 0xFF | (this.a.read() & 0xFF) << 8 | (this.a.read() & 0xFF) << 16) | (long)(this.a.read() & 0xFF) << 24;
    }

    public final int b() throws IOException {
        return this.a.read() & 0xFF | (this.a.read() & 0xFF) << 8 | (this.a.read() & 0xFF) << 16;
    }

    public final boolean a() throws IOException {
        return this.a.read() != 0;
    }

    public final byte a() throws IOException {
        return (byte)this.a.read();
    }

    public final int c() throws IOException {
        return this.a.read();
    }

    public final int d() throws IOException {
        return this.a.read() & 0xFF | (this.a.read() & 0xFF) << 8;
    }

    public final String a() throws IOException {
        return Integer.toBinaryString(this.c()) + Integer.toBinaryString(this.c());
    }

    public final int e() throws IOException {
        byte b0 = (byte)(this.a.read() & 0xFF);
        byte b1 = (byte)(this.a.read() & 0xFF);
        return ((b1 & 0xFF) << 8) + (b0 & 0xFF);
    }

    public final short a() throws IOException {
        return (short)(this.a.read() & 0xFF | (this.a.read() & 0xFF) << 8);
    }

    public final short b() throws IOException {
        return (short)this.a();
    }

    public final char a() throws IOException {
        return (char)this.a();
    }

    public final int f() throws IOException {
        return this.a.read() & 0xFF | (this.a.read() & 0xFF) << 8 | (this.a.read() & 0xFF) << 16 | (this.a.read() & 0xFF) << 24;
    }

    public final long b() throws IOException {
        return (long)(this.a.read() & 0xFF) | (long)(this.a.read() & 0xFF) << 8 | (long)(this.a.read() & 0xFF) << 16 | (long)(this.a.read() & 0xFF) << 24 | (long)(this.a.read() & 0xFF) << 32 | (long)(this.a.read() & 0xFF) << 40 | (long)(this.a.read() & 0xFF) << 48 | (long)(this.a.read() & 0xFF) << 56;
    }

    public final float a() throws IOException {
        return Float.intBitsToFloat(this.f());
    }

    public final double a() throws IOException {
        return Double.longBitsToDouble(this.b());
    }

    public final void a(byte[] b2) throws IOException {
        this.a.read(b2, 0, b2.length);
    }

    public final void a(byte[] b2, int off, int len) throws IOException {
        this.a.read(b2, off, len);
    }

    public final byte[] a(int off, int len) throws IOException {
        byte[] b2 = new byte[len - off];
        this.a.read(b2, off, len);
        return b2;
    }

    public final int a(int n2) throws IOException {
        return (int)this.a.skip(n2);
    }

    public final String b() throws IOException {
        return this.a.readLine();
    }

    public final String c() throws IOException {
        throw new IOException("Unsupported operation");
    }

    public final void a() throws IOException {
        this.a.close();
    }

    public final int g() throws IOException {
        return this.a.available();
    }
}

