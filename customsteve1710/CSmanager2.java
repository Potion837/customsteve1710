/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.audio.SoundHandler
 */
import java.io.File;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.SoundHandler;

class CSmanager2
implements Runnable {
    private int derby$ = Config.filter$ == 0 ? 34 : 16;
    private int closed$ = 0;
    final /* synthetic */ CSmanager swift$;

    private CSmanager2(CSmanager cSmanager) {
        this.swift$ = cSmanager;
    }

    public Thread _never() {
        return Thread.currentThread();
    }

    @Override
    public void run() {
        while (this.closed$ < 2) {
            long StartTime = System.nanoTime();
            if (CSmanager.cellular$.optimal$ != null && CSmanager.cellular$.optimal$.dispatch$ > 0) {
                CSmanager.cellular$.positive$ = 0;
            } else {
                if (CSmanager.cellular$.positive$ == 0) {
                    for (int j = 0; j < CSmanager.cellular$.roland$.size(); ++j) {
                        CSplayer csp3 = CSmanager.cellular$._stanley(((CSplayerMP)CSmanager.cellular$.roland$.get((int)j)).lucas$);
                        if (csp3 == null) continue;
                        csp3.a.warriors$ = true;
                        csp3.a.quizzes$ = false;
                    }
                    if (CSmanager.cellular$.updating$ != null) {
                        try {
                            SoundHandler sndManager = Minecraft.func_71410_x().func_147118_V();
                            int mode = 0;
                            sndManager.func_147690_c();
                            CSmanager.picked$.stop("CustomSteveBGM");
                            CSmanager.picked$.newStreamingSource(false, "CustomSteveBGM", new File(ModContainer.outreach$ + "/CustomSteve/BGM/" + CSmanager.cellular$.updating$).toURI().toURL(), Config.gadgets$, false, 0.0f, 0.0f, 0.0f, mode, 16.0f);
                            CSmanager.picked$.setVolume("CustomSteveBGM", 1.0f);
                            CSmanager.picked$.play("CustomSteveBGM");
                            Config.framed$ = true;
                        }
                        catch (MalformedURLException e2) {
                            e2.printStackTrace();
                        }
                    }
                }
                ++CSmanager.cellular$.positive$;
            }
            try {
                long calc_ms = new BigDecimal((double)(System.nanoTime() - StartTime) * 1.0E-6).setScale(0, 4).longValue();
                long delay_ms = (long)this.derby$ - calc_ms;
                if (delay_ms < 1L) {
                    delay_ms = 1L;
                }
                Thread.sleep(delay_ms);
            }
            catch (InterruptedException e3) {
                Thread.currentThread();
                Thread.interrupted();
            }
        }
    }

    public void _gerald(int i) {
        this.closed$ = i;
    }

    /* synthetic */ CSmanager2(CSmanager x0, CSmanager7 x1) {
        this(x0);
    }
}

