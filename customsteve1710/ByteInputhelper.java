/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ByteInputhelper {
    private BufferedInputStream equation$;
    private BufferedReader amongst$;

    public ByteInputhelper(InputStream in) {
        this.equation$ = new BufferedInputStream(in);
        this.amongst$ = new BufferedReader(new InputStreamReader(in));
    }

    public final int _delta() throws IOException {
        return this.equation$.read() & 0xFF | (this.equation$.read() & 0xFF) << 8;
    }

    public final long _murphy() throws IOException {
        return (long)(this.equation$.read() & 0xFF | (this.equation$.read() & 0xFF) << 8 | (this.equation$.read() & 0xFF) << 16) | (long)(this.equation$.read() & 0xFF) << 24;
    }

    public final int _sullivan() throws IOException {
        return this.equation$.read() & 0xFF | (this.equation$.read() & 0xFF) << 8 | (this.equation$.read() & 0xFF) << 16;
    }

    public final boolean _smoke() throws IOException {
        return this.equation$.read() != 0;
    }

    public final byte _beijing() throws IOException {
        return (byte)this.equation$.read();
    }

    public final int _supports() throws IOException {
        return this.equation$.read();
    }

    public final int _meeting() throws IOException {
        return this.equation$.read() & 0xFF | (this.equation$.read() & 0xFF) << 8;
    }

    public final String _homepage() throws IOException {
        return Integer.toBinaryString(this._supports()) + Integer.toBinaryString(this._supports());
    }

    public final int _diary() throws IOException {
        byte b0 = (byte)(this.equation$.read() & 0xFF);
        byte b1 = (byte)(this.equation$.read() & 0xFF);
        return ((b1 & 0xFF) << 8) + (b0 & 0xFF);
    }

    public final short _handled() throws IOException {
        return (short)(this.equation$.read() & 0xFF | (this.equation$.read() & 0xFF) << 8);
    }

    public final short _minus() throws IOException {
        return (short)this._delta();
    }

    public final char _canal() throws IOException {
        return (char)this._beijing();
    }

    public final int _allied() throws IOException {
        return this.equation$.read() & 0xFF | (this.equation$.read() & 0xFF) << 8 | (this.equation$.read() & 0xFF) << 16 | (this.equation$.read() & 0xFF) << 24;
    }

    public final long _sites() throws IOException {
        return (long)(this.equation$.read() & 0xFF) | (long)(this.equation$.read() & 0xFF) << 8 | (long)(this.equation$.read() & 0xFF) << 16 | (long)(this.equation$.read() & 0xFF) << 24 | (long)(this.equation$.read() & 0xFF) << 32 | (long)(this.equation$.read() & 0xFF) << 40 | (long)(this.equation$.read() & 0xFF) << 48 | (long)(this.equation$.read() & 0xFF) << 56;
    }

    public final float _topics() throws IOException {
        return Float.intBitsToFloat(this._allied());
    }

    public final double _poster() throws IOException {
        return Double.longBitsToDouble(this._sites());
    }

    public final void _earnings(byte[] b2) throws IOException {
        this.equation$.read(b2, 0, b2.length);
    }

    public final void _vital(byte[] b2, int off, int len) throws IOException {
        this.equation$.read(b2, off, len);
    }

    public final byte[] _salvador(int off, int len) throws IOException {
        byte[] b2 = new byte[len - off];
        this.equation$.read(b2, off, len);
        return b2;
    }

    public final int _moment(int n) throws IOException {
        return (int)this.equation$.skip(n);
    }

    public final String _fixed() throws IOException {
        return this.amongst$.readLine();
    }

    public final String _chargers() throws IOException {
        throw new IOException("Unsupported operation");
    }

    public final void _atomic() throws IOException {
        this.equation$.close();
    }

    public final int _brave() throws IOException {
        return this.equation$.available();
    }
}

