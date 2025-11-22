/*
 * Decompiled with CFR 0.152.
 */
public class Names2 {
    String sexual$;
    String direct$;

    public Names2(String fn, String cn) {
        this.sexual$ = fn;
        this.direct$ = cn;
    }

    public boolean _founded(String obj) {
        return this.sexual$.equals(obj) || this.direct$.equals(obj);
    }

    public String _agent() {
        return this.sexual$;
    }

    public String _layout() {
        return this.direct$;
    }
}

