/*
 * Decompiled with CFR 0.152.
 */
import java.math.BigDecimal;
import java.util.ArrayList;

class AnimationPlayer3
implements Runnable {
    private AnimationPlayer message$;
    private int patricia$ = 0;
    private int twins$ = 0;
    private int reset$ = 0;
    final /* synthetic */ AnimationPlayer female$;

    public AnimationPlayer3(AnimationPlayer animationPlayer, AnimationPlayer ap) {
        this.female$ = animationPlayer;
        this.message$ = ap;
    }

    @Override
    public void run() {
        while (this.reset$ <= 2) {
            RenderObject ro2;
            int i;
            long StartTime = System.nanoTime();
            long CalcTime = System.nanoTime();
            ArrayList<RenderObject> rmlist = new ArrayList<RenderObject>();
            for (i = 0; i < AnimationPlayer._necklace(this.message$).size(); ++i) {
                ro2 = (RenderObject)AnimationPlayer._yearly(this.message$).get(i);
                if (!ro2.chicago$.minerals$ || ro2.proceeds$.bringing$) continue;
                ro2.chicago$.c();
                rmlist.add(ro2);
            }
            for (RenderObject ro2 : rmlist) {
                AnimationPlayer._necklace(this.message$).remove(ro2);
                AnimationPlayer._yearly(this.message$).remove(ro2);
            }
            for (i = 0; i < AnimationPlayer._yearly(this.message$).size(); ++i) {
                ro2 = (RenderObject)AnimationPlayer._yearly(this.message$).get(i);
                AnimationPlayer._longest(this.message$, ro2);
            }
            Config.gentle$ = new BigDecimal((double)(System.nanoTime() - CalcTime) * 1.0E-6).setScale(0, 4).longValue();
            if (Config.point$) {
                this.message$._updates();
            }
            if (Config.maybe$) {
                this.message$._random();
            } else {
                this.message$._locks();
            }
            Config.timeline$ += 1.0f;
            while (System.nanoTime() - StartTime < AnimationPlayer._capable(this.female$)) {
                System.nanoTime();
            }
        }
    }

    public Thread _analyzed() {
        return Thread.currentThread();
    }

    public int _crops() {
        return this.reset$;
    }

    public void _checking(int i) {
        this.reset$ = i;
    }
}

