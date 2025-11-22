/*
 * Decompiled with CFR 0.152.
 */
import java.util.TimerTask;

class CSmanager4
extends TimerTask {
    private CSmanager2 versions$;
    private Thread snapshot$;
    final /* synthetic */ CSmanager declare$;

    public CSmanager4(CSmanager cSmanager, CSmanager2 o, Thread t) {
        this.declare$ = cSmanager;
        this.versions$ = o;
        this.snapshot$ = t;
    }

    public void _prior() {
        this.versions$._gerald(3);
    }

    @Override
    public void run() {
        this.snapshot$.interrupt();
    }
}

