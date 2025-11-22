/*
 * Decompiled with CFR 0.152.
 */
class CSmanager5
implements Runnable {
    private int dealers$ = Config.filter$ == 0 ? 30 : 60;
    private int powers$ = 0;
    private long clock$ = (long)(Double.valueOf(1000.0) / Double.valueOf(this.dealers$) * 1000000.0);
    final /* synthetic */ CSmanager security$;

    private CSmanager5(CSmanager cSmanager) {
        this.security$ = cSmanager;
    }

    public Thread _concept() {
        return Thread.currentThread();
    }

    @Override
    public void run() {
        while (this.powers$ < 2) {
            long StartTime = System.nanoTime();
            CSmanager.cellular$.followed$ = true;
            while (System.nanoTime() - StartTime < this.clock$) {
                System.nanoTime();
            }
        }
    }

    public void _further(int i) {
        this.powers$ = i;
    }

    /* synthetic */ CSmanager5(CSmanager x0, CSmanager7 x1) {
        this(x0);
    }
}

