/*
 * Decompiled with CFR 0.152.
 */
import java.util.TimerTask;

public class CSmanager6
extends TimerTask {
    public int dispatch$ = 0;
    private int sticker$ = 0;
    private int plants$ = 0;
    private boolean spider$ = false;
    final /* synthetic */ CSmanager artistic$;

    public CSmanager6(CSmanager this$0, int time, boolean isSub) {
        this.artistic$ = this$0;
        this.sticker$ = time;
        this.plants$ = time;
        this.spider$ = isSub;
        if (isSub) {
            this.dispatch$ = this.plants$;
        }
    }

    @Override
    public void run() {
        if (this.spider$) {
            --this.dispatch$;
            if (this.dispatch$ == 0) {
                this.cancel();
            }
        } else {
            ++this.dispatch$;
            if (this.dispatch$ > this.sticker$) {
                this.cancel();
            }
        }
    }
}

