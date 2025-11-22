/*
 * Decompiled with CFR 0.152.
 */
class RenderObject3
implements Runnable {
    private Vertex[] taxation$ = null;
    private Vertex[] percent$ = null;
    private int treaty$ = 0;
    private int legacy$ = 0;
    private VmdHelper storm$;
    private boolean modems$;
    private boolean grenada$;
    private boolean nudist$;
    private long offense$;
    final /* synthetic */ RenderObject barbie$;

    public RenderObject3(RenderObject renderObject, Vertex[] vertices_S, Vertex[] vertices, int begin, int end, long faceP) {
        this.barbie$ = renderObject;
        this.storm$ = new VmdHelper(this.barbie$.agents$.pointer$, this.barbie$.agents$.highs$);
        this.modems$ = false;
        this.grenada$ = false;
        this.nudist$ = false;
        this.offense$ = 0L;
        this.percent$ = vertices;
        this.taxation$ = vertices_S;
        this.treaty$ = begin;
        this.legacy$ = end;
        this.offense$ = faceP;
        this.grenada$ = true;
    }

    @Override
    public void run() {
        while (true) {
            if (this.grenada$) {
                for (int i = this.treaty$; i < this.legacy$; ++i) {
                    if (this.nudist$) {
                        this.nudist$ = false;
                        this.grenada$ = false;
                        break;
                    }
                    this.storm$._relates(this.taxation$[i], this.percent$[i], i, this.offense$);
                }
                this.modems$ = true;
                this.grenada$ = false;
            }
            try {
                Thread.sleep(1L);
                continue;
            }
            catch (InterruptedException e2) {
                e2.printStackTrace();
                continue;
            }
            break;
        }
    }

    public boolean _uploaded() {
        return this.modems$;
    }

    public void _adapters(Vertex[] vertices_S, Vertex[] vertices, int begin, int end, long faceP) {
        this.modems$ = false;
        this.percent$ = vertices;
        this.taxation$ = vertices_S;
        this.treaty$ = begin;
        this.legacy$ = end;
        this.offense$ = faceP;
        this.grenada$ = true;
    }

    public void _stupid() {
        this.nudist$ = true;
    }
}

