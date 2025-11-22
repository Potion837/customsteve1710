/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  customsteve.aW
 *  net.minecraft.client.Minecraft
 */
package customsteve;

import customsteve.ModContainer;
import customsteve.aS;
import customsteve.aW;
import customsteve.a_0;
import customsteve.aa_0;
import customsteve.ac;
import customsteve.ag_0;
import customsteve.al;
import customsteve.am;
import customsteve.ap_0;
import customsteve.ar;
import customsteve.aw_0;
import customsteve.b_0;
import customsteve.bc;
import customsteve.e_0;
import customsteve.k;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Timer;
import net.minecraft.client.Minecraft;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from customsteve.e
 */
public class e_0 {
    private ArrayList<bc> a;
    private ArrayList<bc> b;
    private boolean a;
    public static int a = 0;
    private Timer a;
    private Timer b = null;
    private a a = null;

    public e_0() {
        this.b = new ArrayList();
    }

    public void a(bc ro) {
        this.b(ro);
    }

    private void b(bc ro) {
        int j2;
        int[] localPointer = new int[3];
        if (ro.a.f || ro.a.b(0) == null) {
            return;
        }
        if (ro.a.e) {
            localPointer[0] = a_0.instance.a;
            if (!b_0.i && (long)a_0.instance.a > ro.a.b((int)0).a && b_0.h && a_0.instance.a.equals(ModContainer.a.c) && ro.a.e.equals(ModContainer.a.c)) {
                aW packet = null;
                packet = new aW(ModContainer.a.c, "", "", aw_0.a.c.a());
                packet.b = aw_0.b.b.a();
                b_0.i = true;
                ModContainer.a.a(Minecraft.getMinecraft().player.connection.getNetworkManager(), (aS)packet);
                b_0.A = false;
                b_0.a = null;
            }
        } else {
            for (int i2 = 0; i2 < ro.a.a.length; ++i2) {
                if (ro.a.a[i2]) {
                    localPointer[i2] = 0;
                    ro.a(0, i2);
                    ro.a.a[i2] = false;
                    if (i2 != 0) continue;
                    k.a cfr_ignored_0 = ro.a.a;
                    if (ro.a.a == k.a.f) {
                        this.f();
                    }
                    ro.i();
                    continue;
                }
                if (ro.a.b(i2) == null) continue;
                if ((long)ro.a(i2) > ro.a.b((int)i2).a && ro.a.b(i2) != null) {
                    if (i2 == 0 && ro.a.a) {
                        ro.a((int)ro.a.b((int)i2).b, i2);
                        ro.i();
                    } else if (!ro.a.h && ro.a.g && i2 != 0 && ro.a.b) {
                        ro.a((int)ro.a.b((int)i2).b, i2);
                        ro.i();
                    } else if (ro.a.g && i2 != 2) {
                        if (i2 == 1 && !ro.a.h) {
                            ro.a.g = false;
                            ro.a.c = true;
                            ro.a.a[1] = true;
                        } else {
                            ro.a.c = true;
                            ro.a.h = false;
                        }
                    }
                    if (i2 == 0 && ro.a.a == k.c.b) {
                        ro.a.a = k.c.a;
                        ro.a.h = 0;
                    }
                }
                localPointer[i2] = ro.a(i2);
            }
        }
        if (ro.a.f) {
            return;
        }
        ac pfi = ro.a();
        if (pfi == null) {
            return;
        }
        for (int j3 = 0; j3 < pfi.c.size(); ++j3) {
            int p2;
            aa_0 f2;
            ar b2 = pfi.c.get(j3);
            if (b2 == null) continue;
            if (b2.a[0] != null && ((ArrayList)((Object)b2.a[0])).size() > localPointer[0] && (f2 = (aa_0)((ArrayList)((Object)b2.a[0])).get(localPointer[0])) != null && (!b_0.c || b_0.c && b2.e == 0)) {
                b2.f.a(f2.a);
                b2.j.a(f2.a);
                if (b2.c != 4) {
                    b2.c.a(b2.g.b(f2.a));
                    b2.k.a(b2.g.b(f2.a));
                    b2.n.a(f2.a);
                }
            }
            for (int k2 = 1; k2 < ro.a.a().length; ++k2) {
                if (ro.a.e || ro.a.a() != k2 || localPointer[k2] != 0) continue;
                b2.l = new am();
                b2.l = new ap_0();
                b2.m = new ap_0();
                b2.b = false;
            }
            f2 = null;
            if (ro.a.a[1]) {
                b2.b = false;
                b2.a[1] = null;
                b2.k = null;
            } else if (b2.a[1] != null && ((ArrayList)((Object)b2.a[1])).size() != 0) {
                p2 = localPointer[1];
                if (((ArrayList)((Object)b2.a[1])).size() <= p2 && (p2 = ((ArrayList)((Object)b2.a[1])).size() - 1) < 0) {
                    p2 = 0;
                }
                f2 = (aa_0)((ArrayList)((Object)b2.a[1])).get(p2);
            }
            if (ro.a.a[2]) {
                b2.b = false;
                b2.a[2] = null;
                b2.k = null;
            } else if (b2.a[2] != null && ((ArrayList)((Object)b2.a[2])).size() != 0) {
                p2 = localPointer[2];
                if (((ArrayList)((Object)b2.a[2])).size() <= p2 && (p2 = ((ArrayList)((Object)b2.a[2])).size() - 1) < 0) {
                    p2 = 0;
                }
                if (f2 == null || f2 != null && ro.a.a() == 2) {
                    f2 = (aa_0)((ArrayList)((Object)b2.a[2])).get(p2);
                }
            }
            if (f2 == null || b_0.c && (!b_0.c || b2.e == 2)) continue;
            b2.l.a(f2.a);
            b2.m.a(f2.a);
            if (b2.c != 4) {
                b2.l.a(b2.g.b(f2.a));
                b2.m.a(f2.a);
                b2.o.a(b2.g.b(f2.a));
            }
            b2.b = true;
        }
        for (int i3 = 1; i3 < ro.a.a().length; ++i3) {
            if (!ro.a.a[i3]) continue;
            if (i3 == 1) {
                ro.a.a();
                ro.a.i = true;
                ((ac)((Object)ro.a.a)).a = true;
            }
            ro.a.a[i3] = false;
            ro.a.a()[i3] = null;
            ro.a.b()[i3] = null;
        }
        if (ro.a.a != k.a.f && ro.a.c && pfi.c != null && pfi.e != null) {
            pfi.c = pfi.a;
            pfi.d = pfi.b;
            if (!pfi.c.b) {
                pfi.c.f.a(pfi.c.j.f(pfi.d));
                pfi.e.f.a(pfi.a.f(pfi.e.j));
            } else if (ro.a.a == k.c.i || ro.a.b() < ro.a.k && ro.a.o) {
                pfi.c.l.a(pfi.c.f);
                pfi.d.l.a(pfi.d.f);
                pfi.e.l.a(pfi.e.f);
                pfi.f.l.a(pfi.e.f);
                if (ro.a.a != k.c.i && ro.a.o && ro.a.b() >= ro.a.k - 1) {
                    ro.a.o = false;
                }
            } else {
                if (pfi.h.k == null) {
                    pfi.h.k = new am();
                }
                if (pfi.i.k == null) {
                    pfi.i.k = new am();
                }
                pfi.h.k.a(pfi.e);
                pfi.i.k.a(pfi.f);
                pfi.c.l.a(pfi.c.m.f(pfi.d));
                pfi.e.l.a(pfi.a.f(pfi.e.m));
                pfi.g.f.a(pfi.c.f(pfi.g.j));
            }
        }
        ArrayList<Integer> doneFather = new ArrayList<Integer>();
        for (j2 = 0; j2 < pfi.c.size(); ++j2) {
            pfi.c.get(j2).a(pfi, doneFather);
        }
        for (j2 = 0; j2 < pfi.e.size(); ++j2) {
            try {
                pfi.e.get(j2).a(pfi);
                continue;
            }
            catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        doneFather = new ArrayList();
        for (j2 = 0; j2 < pfi.c.size(); ++j2) {
            pfi.c.get(j2).a(pfi, doneFather);
        }
        ro.a = ro.a.a() != -1 ? (long)localPointer[ro.a.a()] : (long)localPointer[0];
    }

    public void a(ac pfi, int nbuffer) {
        for (ar b2 : pfi.c) {
            al m4f = new al();
            b2.a(m4f, pfi.c);
            b2.a[nbuffer] = m4f;
            b2.a[nbuffer] = new ap_0(b2.e);
            b2.a[nbuffer] = new am(b2.g);
        }
    }

    public void a() {
        bc ro;
        long PhysicsTime = System.nanoTime();
        ArrayList removeList = new ArrayList();
        if (this.a) {
            a_0.instance.c();
            a_0.instance.a.a();
            for (int i2 = 0; i2 < this.a.size(); ++i2) {
                ro = this.a.get(i2);
                if (ro.l != -1 || ro.a.f) continue;
                a_0.instance.a.a(ro.a, ro.a.a);
            }
            this.a = false;
        }
        for (int j2 = 0; j2 < this.a.size(); ++j2) {
            ro = this.a.get(j2);
            k csp = this.a.get((int)j2).a;
            if (!csp.c || ((bc.a)((Object)csp.a)).f || csp.a == null) continue;
            csp.c = false;
            if (!b_0.c || csp.l != -1) continue;
            a_0.instance.a.a((ac)((Object)csp.a), csp.a);
        }
        if (b_0.e) {
            // empty if block
        }
        a_0.instance.b();
        b_0.b = new BigDecimal((double)(System.nanoTime() - PhysicsTime) * 1.0E-6).setScale(0, 4).longValue();
    }

    public void b() {
        if (!b_0.f) {
            block0: for (int i2 = 0; i2 < this.a.size(); ++i2) {
                bc ro = this.a.get(i2);
                if (ro.a.f) continue;
                long up = ro.a(ro.a.a()) - 1;
                long lp = ro.a(0) - 1;
                if (up < 0L) {
                    up = 0L;
                }
                if (lp < 0L) {
                    lp = 0L;
                }
                long faceP = 0L;
                faceP = !ro.a.j ? lp : up;
                int nbuffer = ro.a.g;
                nbuffer = nbuffer != 2 ? ++nbuffer : 0;
                for (int j2 = 0; j2 < 2; ++j2) {
                    if (!ro.a.b[nbuffer]) {
                        ro.a.a[nbuffer].writeLock().lock();
                        this.a(ro.a, nbuffer);
                        if (b_0.y) {
                            for (int k2 = 0; k2 < ro.a.size(); ++k2) {
                                ag_0 wfi = (ag_0)ro.a.get(k2);
                                this.a(wfi, nbuffer);
                            }
                        }
                        ro.a.a[nbuffer] = (int)lp;
                        ro.a.a[nbuffer] = faceP;
                        ro.a.b[nbuffer] = true;
                        ro.a.a[nbuffer].writeLock().unlock();
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

    public void c() {
        long softCALCtime = System.nanoTime();
        for (int i2 = 0; i2 < this.a.size(); ++i2) {
            bc ro = this.a.get(i2);
            if (!((bc.a)((Object)ro.a.a)).f && ro.a != null && ((ArrayList)((Object)ro.a.a)).size() > 0) {
                ro.a(true, ro.a);
            }
            if (ro.a.a == null) continue;
            ro.a.a.a = true;
        }
        b_0.c = new BigDecimal((double)(System.nanoTime() - softCALCtime) * 1.0E-6).setScale(0, 4).longValue();
    }

    public void d() {
        if (this.a == null) {
            this.a = new Timer();
            b obj = new b(this, this);
            Thread t = new Thread(obj);
            t.setName("CSmod AP-Thread");
            t.start();
        }
    }

    public void e() {
        if (this.a == null) {
            return;
        }
        this.a.cancel();
        this.a.purge();
        this.a.clear();
        if (this.b == null) {
            return;
        }
        this.a.a();
        this.b.cancel();
        this.b.purge();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean a(bc oldro, bc ro) {
        try {
            this.a.set(this.a.indexOf(oldro), ro);
        }
        catch (Exception e2) {
            e2.printStackTrace();
        }
        return true;
    }

    public boolean a(bc ro) {
        try {
            this.a.add(ro);
        }
        catch (Exception e2) {
            e2.printStackTrace();
        }
        return true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean b(bc ro) {
        boolean result = false;
        try {
            result = this.b.add(ro);
        }
        catch (Exception e2) {
            e2.printStackTrace();
        }
        return result;
    }

    public void f() {
        this.a = true;
    }

    static /* synthetic */ ArrayList a(e_0 x0) {
        return x0.b;
    }

    static /* synthetic */ ArrayList b(e_0 x0) {
        return x0.a;
    }

    static /* synthetic */ void a(e_0 x0, bc x1) {
        x0.b(x1);
    }
}

