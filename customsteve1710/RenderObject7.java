/*
 * Decompiled with CFR 0.152.
 */
import java.math.BigDecimal;

class RenderObject7
implements Runnable {
    private int controls$ = Config.filter$ == 0 ? 34 : 17;
    private int handheld$ = 0;
    public RenderObject forbes$;
    final /* synthetic */ RenderObject learned$;

    public RenderObject7(RenderObject renderObject, RenderObject ro) {
        this.learned$ = renderObject;
        this.forbes$ = ro;
    }

    public Thread _styles() {
        return Thread.currentThread();
    }

    @Override
    public void run() {
        while (this.handheld$ < 2) {
            long StartTime = System.nanoTime();
            RenderObject._solving(this.forbes$);
            RenderObject._fallen(this.forbes$);
            try {
                long calc_ms = new BigDecimal((double)(System.nanoTime() - StartTime) * 1.0E-6).setScale(0, 4).longValue();
                long delay_ms = (long)this.controls$ - calc_ms;
                if (delay_ms < 1L) {
                    delay_ms = 1L;
                }
                Thread.sleep(delay_ms);
            }
            catch (InterruptedException e2) {
                Thread.currentThread();
                Thread.interrupted();
            }
        }
    }

    public void _killing(int i) {
        this.handheld$ = i;
    }
}

