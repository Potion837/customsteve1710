/*
 * Decompiled with CFR 0.152.
 */
import java.util.TimerTask;

class CSmanager3
extends TimerTask {
    private CSmanager5 selling$;
    private Thread aging$;
    final /* synthetic */ CSmanager matches$;

    public CSmanager3(CSmanager cSmanager, CSmanager5 o, Thread t) {
        this.matches$ = cSmanager;
        this.selling$ = o;
        this.aging$ = t;
    }

    public void _banks() {
        this.selling$._further(3);
    }

    @Override
    public void run() {
        this.aging$.interrupt();
    }
}

