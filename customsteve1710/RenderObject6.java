/*
 * Decompiled with CFR 0.152.
 */
import java.util.TimerTask;

class RenderObject6
extends TimerTask {
    private RenderObject hunter$;
    final /* synthetic */ RenderObject outer$;

    public RenderObject6(RenderObject renderObject, RenderObject obj) {
        this.outer$ = renderObject;
        this.hunter$ = obj;
    }

    @Override
    public void run() {
        RenderObject._largely(this.hunter$);
        int compensateValue = 1;
        int perStep = 1;
        int fixValue = 0;
        this.hunter$.gasoline$.writeLock().lock();
        if (Math.abs(this.hunter$.mumbai$) >= compensateValue) {
            fixValue = this.hunter$.mumbai$ < 0 ? -perStep : perStep;
            this.hunter$.mumbai$ = this.hunter$.mumbai$ + (this.hunter$.mumbai$ < 0 ? perStep : -perStep);
        }
        this.hunter$.gasoline$.writeLock().unlock();
        if (fixValue != 0) {
            RenderObject2 renderObject2 = this.hunter$.proceeds$;
            RenderObject2._bruce(renderObject2, RenderObject2._grave(renderObject2) + (fixValue < 0 ? 0 : fixValue + 1));
        } else {
            RenderObject2._auctions(this.hunter$.proceeds$);
        }
        if (RenderObject2._grave(this.hunter$.proceeds$) <= 0) {
            RenderObject2._bruce(this.hunter$.proceeds$, 0);
        }
        RenderObject2._futures(this.hunter$.proceeds$);
    }
}

