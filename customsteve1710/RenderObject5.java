/*
 * Decompiled with CFR 0.152.
 */
import java.util.TimerTask;

class RenderObject5
extends TimerTask {
    private RenderObject7 fantasy$;
    private Thread strike$;
    final /* synthetic */ RenderObject meant$;

    public RenderObject5(RenderObject renderObject, RenderObject7 o, Thread t) {
        this.meant$ = renderObject;
        this.fantasy$ = o;
        this.strike$ = t;
    }

    public void _operate() {
        this.fantasy$._killing(3);
    }

    @Override
    public void run() {
        Config.jamaica$ = Config.timeline$;
        Config.timeline$ = 0.0f;
        this.meant$.gasoline$.writeLock().lock();
        this.meant$.mumbai$ = this.meant$.mumbai$ + ((Config.filter$ == 0 ? 30 : 60) - RenderObject._solid(this.meant$));
        this.meant$.cheese$ = this.meant$.cheese$ + ((Config.filter$ == 0 ? 30 : 60) - RenderObject._solid(this.meant$));
        this.meant$.gasoline$.writeLock().unlock();
        RenderObject._enlarge(this.meant$, 0);
        this.strike$.interrupt();
    }
}

