/*
 * Decompiled with CFR 0.152.
 */
package customsteve;

import customsteve.aQ;
import customsteve.aa_0;
import customsteve.ac;
import customsteve.ae;
import customsteve.ag_0;
import customsteve.am;
import customsteve.ap_0;
import customsteve.ar;
import customsteve.at_0;
import customsteve.av_0;
import customsteve.b_0;
import customsteve.k;
import java.util.ArrayList;
import java.util.Iterator;

public class aw {
    public boolean a(ac pfi, ae vfi) {
        if (vfi == null || vfi == ae.a) {
            return false;
        }
        String kf = vfi.b;
        ArrayList<at_0> add = new ArrayList<at_0>();
        for (int j2 = 0; j2 < ((ArrayList)((Object)kf)).size(); ++j2) {
            at_0 k2 = (at_0)((ArrayList)((Object)kf)).get(j2);
            if (k2 == null) continue;
            if (k2 != null && k2.a != 0L) {
                at_0 last = (at_0)add.get(add.size() > 0 ? add.size() - 1 : 0);
                byte[][] bazier = k2.a();
                byte[] bazierX = new byte[4];
                byte[] bazierY = new byte[4];
                byte[] bazierZ = new byte[4];
                byte[] bazierR = new byte[4];
                byte[] bazierD = new byte[4];
                byte[] bazierV = new byte[4];
                bazierX = bazier[0];
                bazierY = bazier[1];
                bazierZ = bazier[2];
                bazierR = bazier[3];
                bazierD = bazier[4];
                bazierV = bazier[5];
                ap_0 begin = last.b;
                ap_0 end = k2.b;
                float delta = k2.a - last.a;
                int s = (int)last.a;
                int l2 = s + 1;
                while ((long)l2 < k2.a + 1L) {
                    at_0 nk = new at_0();
                    float amnt = (float)(l2 - s) / delta;
                    begin = last.b;
                    float baz = this.b(bazierR, amnt, true);
                    ap_0 el = end.l(last.b);
                    ap_0 elba = last.b.b(el.a(baz));
                    ap_0 rVec = new ap_0(elba.a < 0.0f ? -1.0f : 1.0f, elba.b < 0.0f ? -1.0f : 1.0f, elba.c < 0.0f ? -1.0f : 1.0f);
                    nk.b = new ap_0(elba);
                    elba.a = this.a(elba.a);
                    elba.b = this.a(elba.b);
                    elba.c = this.a(elba.c);
                    elba.h(rVec);
                    nk.a.a();
                    nk.a.a(elba.a, elba.b, elba.c);
                    nk.a = l2;
                    nk.a = new ap_0(k2.a);
                    nk.a = k2.a;
                    nk.b = k2.b;
                    add.add(nk);
                    ++l2;
                }
                ap_0 beginT = new ap_0(last.a);
                ap_0 endT = new ap_0(k2.a);
                delta = k2.a - last.a;
                int l3 = s + 1;
                while ((long)l3 < k2.a + 1L) {
                    float amnt = (float)(l3 - s) / delta;
                    at_0 nowk = (at_0)add.get(l3);
                    nowk.a = last.a + (k2.a - last.a) * this.b(bazierD, amnt, true);
                    nowk.b = last.b + (k2.b - last.b) * this.b(bazierV, amnt, true);
                    nowk.a.a = last.a.a + (k2.a.a - last.a.a) * this.b(bazierX, amnt, true);
                    nowk.a.b = last.a.b + (k2.a.b - last.a.b) * this.b(bazierY, amnt, true);
                    nowk.a.c = last.a.c + (k2.a.c - last.a.c) * this.b(bazierZ, amnt, true);
                    nowk.a = new ap_0(nowk.a.a, nowk.a.b, nowk.a.c);
                    ++l3;
                }
                continue;
            }
            add.add(new at_0(k2));
        }
        vfi.c = new ArrayList(add);
        return true;
    }

    public boolean a(k csp, ae vfi, int layer) {
        if (vfi == null || vfi == ae.a) {
            return false;
        }
        av_0[] fkf = vfi.a;
        aa_0[] kf = vfi.a;
        this.a(csp, kf, layer);
        if (layer == 0 && csp.a()[1] == null && csp.a()[2] == null || layer == csp.a() || layer == csp.c) {
            this.a(csp, fkf);
            csp.c = csp.c != -1 ? -1 : layer;
        }
        return true;
    }

    public ae a(k csp, ae b2, int interFrame, int layer) {
        ae result = new ae();
        int boneSize = ((ac)((Object)csp.a)).c.size();
        ArrayList<String> upperBones = new ArrayList<String>();
        if (layer != 0) {
            if (b2.a == null) {
                for (aa_0 bkf : b2.a) {
                    String s;
                    boolean isEquals = false;
                    Iterator iterator = upperBones.iterator();
                    while (iterator.hasNext() && !(isEquals = (s = (String)iterator.next()).equals(bkf.a))) {
                    }
                    if (isEquals) continue;
                    upperBones.add(bkf.a);
                }
                b2.a = upperBones;
                boneSize = upperBones.size();
            } else {
                boneSize = ((ArrayList)((Object)b2.a)).size();
            }
        }
        aa_0[] kf = new aa_0[boneSize + b2.a.length];
        int p2 = 0;
        if (csp.a(layer) != null) {
            // empty if block
        }
        if (csp.o) {
            ((ac)((Object)csp.a)).c.m.a(((ac)((Object)csp.a)).c.f);
            ((ac)((Object)csp.a)).d.m.a(((ac)((Object)csp.a)).d.f);
            ((ac)((Object)csp.a)).e.m.a(((ac)((Object)csp.a)).e.f);
            ((ac)((Object)csp.a)).f.m.a(((ac)((Object)csp.a)).e.f);
        }
        for (ar bone : ((ac)((Object)csp.a)).c) {
            String bname;
            Iterator iterator;
            ap_0 loc = new ap_0();
            if (bone.c != 4) {
                // empty if block
            }
            am rot = bone.j;
            boolean isUpperBone = false;
            if (layer != 0) {
                iterator = ((ArrayList)((Object)b2.a)).iterator();
                while (iterator.hasNext() && !(isUpperBone = (bname = (String)iterator.next()).equals(bone.a))) {
                }
            } else if (csp.a(layer) != null && csp.a((int)layer).a != null) {
                iterator = ((ArrayList)((Object)csp.a((int)layer).a)).iterator();
                while (iterator.hasNext() && !(isUpperBone = (bname = (String)iterator.next()).equals(bone.a))) {
                }
            }
            if (isUpperBone && layer != 0 && (csp.a(1) != null || csp.a(2) != null)) {
                rot = bone.m;
                loc = bone.m;
                kf[p2] = new aa_0(bone.a, 0L, loc.a, loc.b, loc.c, rot.a(), rot.b(), rot.c(), rot.d(), null);
                ++p2;
                continue;
            }
            if (loc == null || rot == null || layer != 0) continue;
            loc = bone.n;
            kf[p2] = new aa_0(bone.a, 0L, loc.a, loc.b, loc.c, rot.a(), rot.b(), rot.c(), rot.d(), null);
            ++p2;
        }
        for (aa_0 k2 : b2.a) {
            aa_0 newK = new aa_0(k2);
            newK.a = (long)(1 + interFrame) + newK.a;
            kf[p2] = newK;
            ++p2;
        }
        result.b = b2.b;
        result.a = b2.a;
        result.a = (long)(1 + interFrame) + b2.a;
        result.c = b2.c;
        result.a = kf;
        result.b = 1 + interFrame;
        if (result.a != null) {
            result.a = b2.a;
            return result;
        }
        return null;
    }

    public ae a(ae a2, int interFrame1, ae b2, int interFrame2, ae c2) {
        return null;
    }

    public void a(k csp, av_0[] fkf) {
        int i2;
        ap_0 pfi = csp.a;
        ArrayList<aQ> mg = new ArrayList<aQ>(((ac)((Object)pfi)).h);
        if (b_0.y) {
            for (i2 = 0; i2 < ((ArrayList)((Object)csp.a)).size(); ++i2) {
                ag_0 wfi = (ag_0)((ArrayList)((Object)csp.a)).get(i2);
                for (int j2 = 0; j2 < wfi.h.size(); ++j2) {
                    mg.add((aQ)wfi.h.get(j2));
                }
            }
        }
        for (i2 = 0; i2 < mg.size(); ++i2) {
            aQ f2 = mg.get(i2);
            if (f2 == null) continue;
            ArrayList<Float> add = new ArrayList<Float>();
            ArrayList<Long> times = new ArrayList<Long>();
            for (int j3 = 0; j3 < fkf.length; ++j3) {
                av_0 fk = fkf[j3];
                if (!fk.a.equals(f2.a)) continue;
                boolean ignore = false;
                for (int h2 = 0; h2 < times.size(); ++h2) {
                    if (((Long)times.get(h2)).intValue() != fk.a.intValue()) continue;
                    ignore = true;
                    break;
                }
                if (ignore) continue;
                if (add.size() > 0 && fk != null && fk.a != 0L) {
                    float begin = ((Float)add.get(add.size() - 1)).floatValue();
                    float end = fk.a;
                    long last = (Long)times.get(times.size() - 1);
                    float delta = fk.a - last;
                    long s = last;
                    for (long l2 = s + 1L; l2 < fk.a + 1L; ++l2) {
                        float amnt = (float)(l2 - s) / delta;
                        add.add(Float.valueOf((1.0f - amnt) * begin + amnt * end));
                        times.add(fk.a);
                    }
                    continue;
                }
                add.add(Float.valueOf(fk.a));
                times.add(fk.a);
            }
            f2.u = new ArrayList(add);
        }
        this.a((ac)((Object)pfi), fkf);
    }

    public void a(ac pfi, av_0[] fkf) {
        if (pfi.h != null) {
            block3: for (int i2 = 0; i2 < pfi.h.size(); ++i2) {
                aQ pm = pfi.h.get(i2);
                switch (pm.b) {
                    case 0: {
                        ArrayList<Float> add = new ArrayList<Float>();
                        ArrayList<Long> times = new ArrayList<Long>();
                        for (int j2 = 0; j2 < fkf.length; ++j2) {
                            av_0 fk = fkf[j2];
                            if (!fk.a.equals(pm.a)) continue;
                            boolean ignore = false;
                            for (int h2 = 0; h2 < times.size(); ++h2) {
                                if (((Long)times.get(h2)).intValue() != fk.a.intValue()) continue;
                                ignore = true;
                                break;
                            }
                            if (ignore) continue;
                            if (add.size() > 0 && fk != null && fk.a != 0L) {
                                float begin = ((Float)add.get(add.size() - 1)).floatValue();
                                float end = fk.a;
                                long last = (Long)times.get(times.size() - 1);
                                float delta = fk.a - last;
                                long s = last;
                                for (long l2 = s + 1L; l2 < fk.a + 1L; ++l2) {
                                    float amnt = (float)(l2 - s) / delta;
                                    add.add(Float.valueOf((1.0f - amnt) * begin + amnt * end));
                                    times.add(fk.a);
                                }
                                continue;
                            }
                            add.add(Float.valueOf(fk.a));
                            times.add(fk.a);
                        }
                        for (int m2 = 0; m2 < ((ArrayList)((Object)pm.a)).size(); ++m2) {
                            int ss;
                            aQ f2 = pfi.h.get((Integer)((ArrayList)((Object)pm.a)).get(m2));
                            float vmScale = ((Float)((ArrayList)((Object)pm.b)).get(m2)).floatValue();
                            ArrayList<Float> vmScales = new ArrayList<Float>();
                            for (ss = 0; ss < add.size(); ++ss) {
                                vmScales.add(Float.valueOf(((Float)add.get(ss)).floatValue() * vmScale));
                                if (((Float)vmScales.get(ss)).floatValue() != 0.0f) continue;
                                vmScales.set(ss, Float.valueOf(0.0f));
                            }
                            if (f2.u != null) {
                                for (ss = 0; ss < vmScales.size(); ++ss) {
                                    if (f2.u.size() > ss) {
                                        f2.u.set(ss, Float.valueOf(f2.u.get(ss).floatValue() + ((Float)vmScales.get(ss)).floatValue()));
                                        continue;
                                    }
                                    f2.u.add((Float)vmScales.get(ss));
                                }
                                if (f2.u.size() <= vmScales.size() || vmScales.size() <= 0) continue;
                                float last = ((Float)vmScales.get(vmScales.size() - 1)).floatValue();
                                for (int ss2 = vmScales.size() - 1; ss2 < f2.u.size(); ++ss2) {
                                    float src = f2.u.get(ss2).floatValue();
                                    f2.u.set(ss2, Float.valueOf(src + last > 1.0f ? 1.0f : src + last));
                                }
                                continue;
                            }
                            f2.u = new ArrayList(vmScales);
                        }
                        continue block3;
                    }
                }
            }
        }
    }

    private float a(byte[] ip, float x, boolean isCam) {
        float tt;
        float v;
        float x1 = (float)ip[0] / 127.0f;
        float x2 = (float)ip[1] / 127.0f;
        float y1 = (float)ip[2] / 127.0f;
        float y2 = (float)ip[3] / 127.0f;
        if (!isCam) {
            x1 = (float)ip[0] / 127.0f;
            x2 = (float)ip[2] / 127.0f;
            y1 = (float)ip[1] / 127.0f;
            y2 = (float)ip[3] / 127.0f;
        }
        float t = x;
        while (!((v = this.b(t, x1, x2) - x) * v < 1.0E-4f) && (tt = this.c(t, x1, x2)) != 0.0f) {
            t -= v / tt;
        }
        return this.b(t, y1, y2);
    }

    private float b(byte[] ip, float x, boolean isCam) {
        float tt;
        float v;
        float x1 = (float)ip[0] / 127.0f;
        float x2 = (float)ip[1] / 127.0f;
        float y1 = (float)ip[2] / 127.0f;
        float y2 = (float)ip[3] / 127.0f;
        if (!isCam) {
            x1 = (float)ip[0] / 127.0f;
            x2 = (float)ip[2] / 127.0f;
            y1 = (float)ip[1] / 127.0f;
            y2 = (float)ip[3] / 127.0f;
        }
        float t = x;
        while (!((v = this.b(t, x1, x2) - x) * v < 1.0E-4f) && (tt = this.c(t, x1, x2)) != 0.0f) {
            t -= v / tt;
        }
        return this.b(t, y1, y2);
    }

    private float b(float t, float p1, float p2) {
        return (1.0f + 3.0f * p1 - 3.0f * p2) * t * t * t + (3.0f * p2 - 6.0f * p1) * t * t + 3.0f * p1 * t;
    }

    private float c(float t, float p1, float p2) {
        return (3.0f + 9.0f * p1 - 9.0f * p2) * t * t + (6.0f * p2 - 12.0f * p1) * t + 3.0f * p1;
    }

    float a(float t, float p1, float p2) {
        return 3.0f * ((1.0f - t) * (1.0f - t)) * t * p1 + 3.0f * (1.0f - t) * (t * t) * p2 + t * t * t;
    }

    float a(float X2, float x1, float y1, float x2, float y2) {
        x1 /= 127.0f;
        x2 /= 127.0f;
        y1 /= 127.0f;
        y2 /= 127.0f;
        float y0 = 0.0f;
        float x0 = 0.0f;
        float y3 = 1.0f;
        float x3 = 1.0f;
        float lowTGuess = 0.0f;
        float dividingT = 0.5f;
        float highTGuess = 1.0f;
        for (int i2 = 0; i2 < 100; ++i2) {
            float lowXCalc = X2 - this.a(lowTGuess, x1, x2);
            float divideXCalc = X2 - this.a(dividingT, x1, x2);
            if ((double)Math.abs(divideXCalc) < 1.0E-4) break;
            if (lowXCalc * divideXCalc < 0.0f) {
                highTGuess = dividingT;
                dividingT = (dividingT + lowTGuess) / 2.0f;
                continue;
            }
            lowTGuess = dividingT;
            dividingT = (highTGuess + dividingT) / 2.0f;
        }
        return this.a(dividingT, y1, y2);
    }

    private float a(byte[] ip, float t) {
        float xa = (float)ip[0] / 127.0f;
        float xb = (float)ip[1] / 127.0f;
        float ya = (float)ip[2] / 127.0f;
        float yb = (float)ip[3] / 127.0f;
        float min = 0.0f;
        float max = 1.0f;
        float ct = t;
        while (true) {
            float x13;
            float x22;
            float x12;
            float x11;
            float x21;
            float x3;
            if ((double)Math.abs((x3 = (x21 = (x11 = xa * ct) + ((x12 = xa + (xb - xa) * ct) - x11) * ct) + ((x22 = x12 + ((x13 = xb + (1.0f - xb) * ct) - x12) * ct) - x21) * ct) - t) < 1.0E-4) {
                float y11 = ya * ct;
                float y12 = ya + (yb - ya) * ct;
                float y13 = yb + (1.0f - yb) * ct;
                float y21 = y11 + (y12 - y11) * ct;
                float y22 = y12 + (y13 - y12) * ct;
                float y3 = y21 + (y22 - y21) * ct;
                return y3;
            }
            if (x3 < t) {
                min = ct;
            } else {
                max = ct;
            }
            ct = min * 0.5f + max * 0.5f;
        }
    }

    public float a(float num) {
        float realNum = (num = Math.abs(num)) * 57.29578f;
        if (realNum > 180.0f) {
            float ang;
            int zc = (int)(realNum / 180.0f);
            float yu = realNum % 180.0f;
            if (zc % 2 != 0) {
                ang = 180.0f - yu;
                ang = -ang;
            } else {
                ang = yu;
            }
            return (float)(Math.PI / 180 * (double)ang);
        }
        return num;
    }

    public void a(k csp, aa_0[] kf, int layer) {
        int i2;
        ap_0 pfi = csp.a;
        ArrayList<ar> bs = new ArrayList<ar>(((ac)((Object)pfi)).c);
        if (b_0.y) {
            for (i2 = 0; i2 < ((ArrayList)((Object)csp.a)).size(); ++i2) {
                ag_0 wfi = (ag_0)((ArrayList)((Object)csp.a)).get(i2);
                for (int j2 = 1; j2 < ((ArrayList)((Object)wfi.c)).size(); ++j2) {
                    bs.add((ar)((ArrayList)((Object)wfi.c)).get(j2));
                }
            }
        }
        for (i2 = 0; i2 < bs.size(); ++i2) {
            ar b2 = bs.get(i2);
            ArrayList<aa_0> add = new ArrayList<aa_0>();
            Object keyFrameStack = null;
            keyFrameStack = b2.a[layer];
            if (keyFrameStack != null) {
                ((ArrayList)keyFrameStack).clear();
            }
            for (int j3 = 0; j3 < kf.length; ++j3) {
                aa_0 k2 = kf[j3];
                if (k2 == null || !k2.a.equals(b2.a)) continue;
                if (k2 != null && k2.a != 0L && add.size() > 0) {
                    aa_0 last = (aa_0)add.get(add.size() > 0 ? add.size() - 1 : 0);
                    byte[][] bazier = k2.a();
                    byte[] bazierX = new byte[4];
                    byte[] bazierY = new byte[4];
                    byte[] bazierZ = new byte[4];
                    byte[] bazierR = new byte[4];
                    bazierX = bazier[0];
                    bazierY = bazier[1];
                    bazierZ = bazier[2];
                    bazierR = bazier[3];
                    am begin = new am(last.a);
                    am end = new am(k2.a);
                    float delta = k2.a - last.a;
                    int s = last.a.intValue();
                    int l2 = s + 1;
                    while ((long)l2 < k2.a + 1L) {
                        float amnt = (float)(l2 - s) / delta;
                        amnt = this.b(bazierR, amnt, false);
                        begin = new am(last.a);
                        begin.b(k2.a, amnt);
                        begin.a();
                        add.add(new aa_0(k2.a, k2.a, k2.a, k2.b, k2.c, begin.a(), begin.b(), begin.c(), begin.d(), k2.a));
                        ++l2;
                    }
                    ap_0 beginT = new ap_0(last.a);
                    ap_0 endT = new ap_0(k2.a);
                    delta = k2.a - last.a;
                    int l3 = s + 1;
                    while ((long)l3 < k2.a + 1L) {
                        float amnt = (float)(l3 - s) / delta;
                        if (add.size() >= l3 + 1) {
                            aa_0 nk = (aa_0)add.get(l3);
                            nk.a = last.a.a + (k2.a.a - last.a.a) * this.b(bazierX, amnt, false);
                            nk.b = last.a.b + (k2.a.b - last.a.b) * this.b(bazierY, amnt, false);
                            nk.c = last.a.c + (k2.a.c - last.a.c) * this.b(bazierZ, amnt, false);
                            nk.a = new ap_0(nk.a, nk.b, nk.c);
                            if (i2 == 112) {
                                // empty if block
                            }
                        }
                        ++l3;
                    }
                    continue;
                }
                add.add(new aa_0(k2));
            }
            b2.a[layer] = keyFrameStack = new ArrayList(add);
        }
    }
}

