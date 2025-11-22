/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 */
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import net.minecraft.client.Minecraft;

public class AnimationPlayer {
    private int repeat$ = Config.filter$ == 0 ? 30 : 60;
    private long letting$;
    private ArrayList inspired$ = new ArrayList();
    private ArrayList dense$ = new ArrayList();
    private boolean names$ = false;
    public static int admit$ = 0;
    private Timer coaches$ = null;
    private Timer rhythm$ = null;
    private AnimationPlayer2 empire$ = null;

    public AnimationPlayer(int rate) {
        this.repeat$ = rate;
        this.letting$ = (long)(Double.valueOf(1000.0) / Double.valueOf(this.repeat$) * 1000000.0);
    }

    public void _trails(RenderObject ro) {
        this._shame(ro);
    }

    private void _shame(RenderObject ro) {
        int j;
        ro._canvas(ro);
        int lp = 0;
        int up = 0;
        if (ro.proceeds$.bringing$ || ro.chicago$.devel$ == null) {
            return;
        }
        if (ro.proceeds$.wales$) {
            lp = CSmanager.cellular$.positive$;
            if (!Config.remarks$ && (long)CSmanager.cellular$.positive$ > ro.chicago$.devel$.bible$ && Config.seating$ && CSmanager.cellular$.soccer$.equals(ModContainer.dealing$.highways$) && ro.chicago$.loans$.equals(ModContainer.dealing$.highways$)) {
                P201_AnimationStatus packet = null;
                packet = new P201_AnimationStatus(ModContainer.dealing$.highways$, "", "", P201_AnimationStatus2.producer$._wrist());
                packet.seasons$ = P201_AnimationStatus3.cents$._loved();
                Config.remarks$ = true;
                ModContainer.array$.a(Minecraft.func_71410_x().field_71439_g.field_71174_a.func_147298_b(), packet);
                Config.elect$ = false;
                Config.italia$ = null;
            }
        } else {
            if (ro.proceeds$.register$) {
                CSplayer2 cfr_ignored_0 = ro.chicago$.turned$;
                if (ro.chicago$.turned$ == CSplayer2.bryant$) {
                    this._lenses();
                }
                lp = 0;
                ro._mills(0);
                ro.proceeds$.register$ = false;
                ro._proudly();
            } else {
                if ((long)ro._contains() > ro.chicago$.devel$.bible$) {
                    if (ro.chicago$.graduate$ == CSplayer4.nobody$) {
                        ro.chicago$.graduate$ = CSplayer4.alumni$;
                        ro.chicago$.template$ = 0;
                    }
                    if (ro.proceeds$.remove$) {
                        ro._mills((int)ro.chicago$.devel$.earned$);
                        ro._proudly();
                    } else if (ro.proceeds$.single$ && ro.chicago$.define$ == null) {
                        ro.proceeds$.single$ = false;
                        ro.proceeds$.warriors$ = false;
                        ro.proceeds$.quizzes$ = true;
                    }
                }
                lp = ro._contains();
            }
            if (ro.proceeds$.visible$) {
                up = 0;
                ro._legends(0);
                ro.proceeds$.visible$ = false;
            } else {
                if (!ro.proceeds$.warriors$ && ro.chicago$.define$ != null && ro.proceeds$.single$ && (long)ro._gamecube() > ro.chicago$.define$.bible$) {
                    if (ro.proceeds$.meetings$) {
                        ro._legends((int)ro.chicago$.define$.earned$);
                        ro._proudly();
                    } else {
                        ro.proceeds$.single$ = false;
                        ro.proceeds$.quizzes$ = true;
                        ro.chicago$.surveys$ = true;
                    }
                }
                up = ro._gamecube();
            }
        }
        if (ro.proceeds$.bringing$) {
            return;
        }
        PmdFileInfo pfi = ro._charms();
        if (pfi == null) {
            return;
        }
        for (int j2 = 0; j2 < pfi.pointer$.size(); ++j2) {
            KeyFrame2 f2;
            Bone b2 = (Bone)pfi.pointer$.get(j2);
            if (j2 == 144) {
                // empty if block
            }
            if (b2 == null) continue;
            if (!ro.chicago$.routines$ && ro._gamecube() == 0) {
                b2.flights$ = new Quaternion();
                b2.andrews$ = new Vector3f();
                b2.sussex$ = new Vector3f();
                b2.caring$ = false;
            }
            KeyFrame2 keyFrame2 = f2 = b2.coaching$ != null && b2.coaching$.size() > lp ? (KeyFrame2)b2.coaching$.get(lp) : null;
            if (f2 != null && (!Config.point$ || Config.point$ && b2.config$ == 0)) {
                b2.promise$._folks(f2.tones$);
                b2.momentum$._folks(f2.tones$);
                if (b2.aimed$ != 4) {
                    b2.clicks$._shoot(b2.roommate$._approval(f2.consoles$));
                    b2.electron$._shoot(f2.consoles$);
                    b2.consider$._shoot(b2.roommate$._approval(f2.consoles$));
                }
            }
            if (ro.chicago$.surveys$) {
                b2.caring$ = false;
                b2.fence$ = null;
                b2.bradley$ = null;
                continue;
            }
            if (b2.fence$ == null || b2.fence$.size() <= up || (f2 = (KeyFrame2)b2.fence$.get(up)) == null || Config.point$ && (!Config.point$ || b2.config$ == 2)) continue;
            b2.flights$._folks(f2.tones$);
            b2.indiana$._folks(f2.tones$);
            if (b2.aimed$ != 4) {
                b2.andrews$._shoot(b2.roommate$._approval(f2.consoles$));
                b2.sussex$._shoot(f2.consoles$);
                b2.pushing$._shoot(b2.roommate$._approval(f2.consoles$));
            }
            b2.caring$ = true;
        }
        if (ro.chicago$.define$ != null) {
            // empty if block
        }
        if (ro.chicago$.surveys$) {
            ro.agents$._brunei();
            ro.chicago$.surveys$ = false;
            ro.chicago$.define$ = null;
            ro.chicago$.remind$ = null;
            ro.chicago$.pacific$ = true;
        }
        if (ro.chicago$.turned$ != CSplayer2.bryant$ && ro.proceeds$.quizzes$ && pfi.hydrogen$ != null && pfi.produce$ != null) {
            pfi.suspect$ = pfi.waste$;
            pfi.bookings$ = pfi.cadillac$;
            if (!pfi.hydrogen$.caring$) {
                pfi.hydrogen$.promise$._folks(pfi.hydrogen$.momentum$._generic(pfi.diffs$));
                pfi.produce$.promise$._folks(pfi.address$._generic(pfi.produce$.momentum$));
            } else if (ro.chicago$.graduate$ == CSplayer4.chips$ || ro.chicago$.a() < ro.chicago$.quote$ && ro.chicago$.democrat$) {
                pfi.hydrogen$.flights$._folks(pfi.hydrogen$.promise$);
                pfi.honest$.flights$._folks(pfi.honest$.promise$);
                pfi.produce$.flights$._folks(pfi.produce$.promise$);
                pfi.bottles$.flights$._folks(pfi.produce$.promise$);
                if (ro.chicago$.graduate$ != CSplayer4.chips$ && ro.chicago$.democrat$ && ro.chicago$.a() >= ro.chicago$.quote$ - 1) {
                    ro.chicago$.democrat$ = false;
                }
            } else {
                if (pfi.visited$.bradley$ == null) {
                    pfi.visited$.bradley$ = new Quaternion();
                }
                if (pfi.discrete$.bradley$ == null) {
                    pfi.discrete$.bradley$ = new Quaternion();
                }
                pfi.visited$.bradley$._folks(pfi.services$);
                pfi.discrete$.bradley$._folks(pfi.imagine$);
                pfi.hydrogen$.flights$._folks(pfi.hydrogen$.indiana$._generic(pfi.diffs$));
                pfi.produce$.flights$._folks(pfi.address$._generic(pfi.produce$.indiana$));
                pfi.feeling$.promise$._folks(pfi.tourist$._generic(pfi.feeling$.momentum$));
            }
        }
        ArrayList doneFather = new ArrayList();
        for (j = 0; j < pfi.pointer$.size(); ++j) {
            ((Bone)pfi.pointer$.get(j))._script(pfi, doneFather);
        }
        for (j = 0; j < pfi.linda$.size(); ++j) {
            try {
                ((IK)pfi.linda$.get(j))._saudi(pfi);
                continue;
            }
            catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        doneFather = new ArrayList();
        for (j = 0; j < pfi.pointer$.size(); ++j) {
            ((Bone)pfi.pointer$.get(j))._script(pfi, doneFather);
        }
        doneFather = new ArrayList();
        if (Config.permit$) {
            for (j = 0; j < ro.plane$.size(); ++j) {
                Bone b3;
                int k;
                WeaponFileInfo wfi = (WeaponFileInfo)ro.plane$.get(j);
                Bone effect = (Bone)wfi.c.get(0);
                if (wfi.blogs$ != null) {
                    effect.clicks$._shoot(wfi.blogs$.rankings$);
                    effect.promise$._folks(wfi.blogs$.sciences$);
                    wfi.envelope$ = true;
                }
                for (k = 1; k < wfi.c.size(); ++k) {
                    KeyFrame2 f3;
                    b3 = (Bone)wfi.c.get(k);
                    if (b3.fence$ == null || b3.fence$.size() <= up || (f3 = (KeyFrame2)b3.fence$.get(up)) == null || b3.config$ == 2) continue;
                    b3.clicks$._shoot(b3.roommate$._approval(f3.consoles$));
                    b3.consider$._shoot(b3.roommate$._approval(f3.consoles$));
                    b3.promise$._folks(f3.tones$);
                    b3.momentum$._folks(f3.tones$);
                    b3.flights$._folks(f3.tones$);
                    b3.indiana$._folks(f3.tones$);
                }
                for (k = 0; k < wfi.c.size(); ++k) {
                    b3 = (Bone)wfi.c.get(k);
                    b3._script(wfi, doneFather);
                }
            }
        }
        ro.objects$ = ro.chicago$.define$ != null ? (long)up : (long)lp;
    }

    public void _lecture(PmdFileInfo pfi, int nbuffer) {
        for (Bone b2 : pfi.pointer$) {
            Matrix4f m4f = new Matrix4f();
            b2._milan(m4f, pfi.pointer$);
            b2.catalog$[nbuffer] = m4f;
            b2.safely$[nbuffer] = new Vector3f(b2.rankings$);
            b2.shaved$[nbuffer] = new Quaternion(b2.sciences$);
        }
    }

    public void _updates() {
        RenderObject ro;
        long PhysicsTime = System.nanoTime();
        ArrayList removeList = new ArrayList();
        if (this.names$) {
            CSmanager.cellular$._navigate();
            CSmanager.cellular$.december$._savings();
            for (int i = 0; i < this.inspired$.size(); ++i) {
                ro = (RenderObject)this.inspired$.get(i);
                if (ro.survey$ != -1 || ro.proceeds$.bringing$) continue;
                CSmanager.cellular$.december$._contests(ro.agents$, ro.chicago$.owners$);
            }
            this.names$ = false;
        }
        for (int j = 0; j < this.inspired$.size(); ++j) {
            ro = (RenderObject)this.inspired$.get(j);
            CSplayer csp = ((RenderObject)this.inspired$.get((int)j)).chicago$;
            if (!csp.contest$ || csp.a.bringing$ || csp.a == null) continue;
            csp.contest$ = false;
            if (!Config.point$ || csp.n != -1) continue;
            CSmanager.cellular$.december$._contests(csp.a, csp.owners$);
        }
        if (Config.leaves$) {
            // empty if block
        }
        CSmanager.cellular$._tiger();
        Config.routes$ = new BigDecimal((double)(System.nanoTime() - PhysicsTime) * 1.0E-6).setScale(0, 4).longValue();
    }

    public void _locks() {
        if (!Config.maybe$) {
            block0: for (int i = 0; i < this.inspired$.size(); ++i) {
                RenderObject ro = (RenderObject)this.inspired$.get(i);
                if (ro.proceeds$.bringing$) continue;
                long up = ro._gamecube() - 1;
                long lp = ro._contains() - 1;
                if (up < 0L) {
                    up = 0L;
                }
                if (lp < 0L) {
                    lp = 0L;
                }
                long faceP = 0L;
                faceP = ro.chicago$.define$ != null && ro.chicago$.define$.heart$ ? up : lp;
                int nbuffer = ro.chicago$.wildlife$;
                nbuffer = nbuffer != 2 ? ++nbuffer : 0;
                for (int j = 0; j < 2; ++j) {
                    if (!ro.chicago$.prophet$[nbuffer]) {
                        ro.chicago$.father$[nbuffer].writeLock().lock();
                        this._lecture(ro.agents$, nbuffer);
                        if (Config.permit$) {
                            for (int k = 0; k < ro.plane$.size(); ++k) {
                                WeaponFileInfo wfi = (WeaponFileInfo)ro.plane$.get(k);
                                this._lecture(wfi, nbuffer);
                            }
                        }
                        ro.chicago$.pizza$[nbuffer] = (int)lp;
                        ro.chicago$.hoped$[nbuffer] = faceP;
                        ro.chicago$.prophet$[nbuffer] = true;
                        ro.chicago$.father$[nbuffer].writeLock().unlock();
                        continue block0;
                    }
                    if (nbuffer != 2) {
                        ++nbuffer;
                        continue;
                    }
                    nbuffer = 0;
                }
            }
        }
    }

    public void _random() {
        long softCALCtime = System.nanoTime();
        for (int i = 0; i < this.inspired$.size(); ++i) {
            RenderObject ro = (RenderObject)this.inspired$.get(i);
            if (!ro.chicago$.a.bringing$ && ro.agents$ != null && ro.agents$.belongs$.size() > 0) {
                ro._golden(true, ro.objects$);
            }
            if (ro.chicago$.smaller$ == null) continue;
            ro.chicago$.smaller$.created$ = true;
        }
        Config.craft$ = new BigDecimal((double)(System.nanoTime() - softCALCtime) * 1.0E-6).setScale(0, 4).longValue();
    }

    public void _rolls() {
        if (this.coaches$ == null) {
            this.coaches$ = new Timer();
            AnimationPlayer3 obj = new AnimationPlayer3(this, this);
            Thread t = new Thread(obj);
            t.setName("CSmod AP-Thread");
            t.start();
            if (this.rhythm$ == null) {
                this.rhythm$ = new Timer();
            }
            this.empire$ = new AnimationPlayer2(this, obj, t);
            this.rhythm$.schedule((TimerTask)this.empire$, 0L, 100L);
        }
    }

    public void _champion() {
        if (this.coaches$ == null) {
            return;
        }
        this.coaches$.cancel();
        this.coaches$.purge();
        this.inspired$.clear();
        if (this.rhythm$ == null) {
            return;
        }
        this.empire$._focal();
        this.rhythm$.cancel();
        this.rhythm$.purge();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean _articles(RenderObject oldro, RenderObject ro) {
        try {
            this.inspired$.set(this.inspired$.indexOf(oldro), ro);
        }
        catch (Exception e2) {
            e2.printStackTrace();
        }
        return true;
    }

    public boolean _decimal(RenderObject ro) {
        try {
            this.inspired$.add(ro);
        }
        catch (Exception e2) {
            e2.printStackTrace();
        }
        return true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean _discs(RenderObject ro) {
        boolean result = false;
        try {
            result = this.dense$.add(ro);
        }
        catch (Exception e2) {
            e2.printStackTrace();
        }
        return result;
    }

    public void _lenses() {
        this.names$ = true;
    }

    public int _guitar() {
        return this.repeat$;
    }

    public boolean _clause(int i) {
        this.repeat$ = i;
        return true;
    }

    static /* synthetic */ ArrayList _necklace(AnimationPlayer x0) {
        return x0.dense$;
    }

    static /* synthetic */ ArrayList _yearly(AnimationPlayer x0) {
        return x0.inspired$;
    }

    static /* synthetic */ void _longest(AnimationPlayer x0, RenderObject x1) {
        x0._shame(x1);
    }

    static /* synthetic */ long _capable(AnimationPlayer x0) {
        return x0.letting$;
    }
}

