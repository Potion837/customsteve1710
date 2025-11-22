/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;

public class FrameStackHelper {
    public boolean _reaches(PmdFileInfo pfi, VmdFileInfo vfi) {
        if (vfi == null || vfi == VmdFileInfo.adelaide$) {
            return false;
        }
        ArrayList kf = vfi.prints$;
        ArrayList<CameraKeyFrame> add = new ArrayList<CameraKeyFrame>();
        for (int j = 0; j < kf.size(); ++j) {
            CameraKeyFrame k = (CameraKeyFrame)kf.get(j);
            if (k == null) continue;
            if (k != null && k.impose$ != 0L) {
                CameraKeyFrame last = (CameraKeyFrame)add.get(add.size() > 0 ? add.size() - 1 : 0);
                byte[][] bazier = k._floyd();
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
                Vector3f begin = last.fotos$;
                Vector3f end = k.fotos$;
                float delta = k.impose$ - last.impose$;
                int s = (int)last.impose$;
                int l = s + 1;
                while ((long)l < k.impose$ + 1L) {
                    CameraKeyFrame nk = new CameraKeyFrame();
                    float amnt = (float)(l - s) / delta;
                    begin = last.fotos$;
                    float baz = this._tulsa(bazierR, amnt, true);
                    Vector3f el = end._based(last.fotos$);
                    Vector3f elba = last.fotos$._approval(el._survival(baz));
                    Vector3f rVec = new Vector3f(elba.serves$ < 0.0f ? -1.0f : 1.0f, elba.genius$ < 0.0f ? -1.0f : 1.0f, elba.superb$ < 0.0f ? -1.0f : 1.0f);
                    nk.fotos$ = new Vector3f(elba);
                    elba.serves$ = this._handmade(elba.serves$);
                    elba.genius$ = this._handmade(elba.genius$);
                    elba.superb$ = this._handmade(elba.superb$);
                    elba._cookies(rVec);
                    nk.clubs$._looks();
                    nk.clubs$._between(elba.serves$, elba.genius$, elba.superb$);
                    nk.impose$ = l;
                    nk.stage$ = new Vector3f(k.stage$);
                    nk.england$ = k.england$;
                    nk.outlook$ = k.outlook$;
                    add.add(nk);
                    ++l;
                }
                Vector3f beginT = new Vector3f(last.stage$);
                Vector3f endT = new Vector3f(k.stage$);
                delta = k.impose$ - last.impose$;
                int l2 = s + 1;
                while ((long)l2 < k.impose$ + 1L) {
                    float amnt = (float)(l2 - s) / delta;
                    CameraKeyFrame nowk = (CameraKeyFrame)add.get(l2);
                    nowk.england$ = last.england$ + (k.england$ - last.england$) * this._tulsa(bazierD, amnt, true);
                    nowk.outlook$ = last.outlook$ + (k.outlook$ - last.outlook$) * this._tulsa(bazierV, amnt, true);
                    nowk.stage$.serves$ = last.stage$.serves$ + (k.stage$.serves$ - last.stage$.serves$) * this._tulsa(bazierX, amnt, true);
                    nowk.stage$.genius$ = last.stage$.genius$ + (k.stage$.genius$ - last.stage$.genius$) * this._tulsa(bazierY, amnt, true);
                    nowk.stage$.superb$ = last.stage$.superb$ + (k.stage$.superb$ - last.stage$.superb$) * this._tulsa(bazierZ, amnt, true);
                    nowk.stage$ = new Vector3f(nowk.stage$.serves$, nowk.stage$.genius$, nowk.stage$.superb$);
                    ++l2;
                }
                continue;
            }
            add.add(new CameraKeyFrame(k));
        }
        vfi.monica$ = new ArrayList(add);
        return true;
    }

    public boolean _reduced(CSplayer csp, VmdFileInfo vfi, boolean isUpperBody) {
        if (vfi == null || vfi == VmdFileInfo.adelaide$) {
            return false;
        }
        FaceKeyFrame[] fkf = vfi.symphony$;
        KeyFrame2[] kf = vfi.intimate$;
        this._bullet(csp, kf, isUpperBody);
        if (isUpperBody && vfi.heart$ || !isUpperBody && (csp.define$ == null || csp.define$ != null && !csp.define$.heart$)) {
            this._harper(csp, fkf);
        }
        return true;
    }

    public VmdFileInfo _control(CSplayer csp, VmdFileInfo b2, int interFrame, boolean isUpperBody) {
        VmdFileInfo result = new VmdFileInfo();
        int boneSize = csp.a.pointer$.size();
        ArrayList<String> upperBones = new ArrayList<String>();
        if (isUpperBody) {
            if (b2.probably$ == null) {
                for (KeyFrame2 bkf : b2.intimate$) {
                    String s;
                    boolean isEquals = false;
                    Iterator iterator = upperBones.iterator();
                    while (iterator.hasNext() && !(isEquals = (s = (String)iterator.next()).equals(bkf.peeing$))) {
                    }
                    if (isEquals) continue;
                    upperBones.add(bkf.peeing$);
                }
                b2.probably$ = upperBones;
                boneSize = upperBones.size();
            } else {
                boneSize = b2.probably$.size();
            }
        }
        KeyFrame2[] kf = new KeyFrame2[boneSize + b2.intimate$.length];
        int p = 0;
        if (csp.outputs$ != null) {
            // empty if block
        }
        if (csp.democrat$) {
            csp.a.hydrogen$.indiana$._folks(csp.a.hydrogen$.promise$);
            csp.a.honest$.indiana$._folks(csp.a.honest$.promise$);
            csp.a.produce$.indiana$._folks(csp.a.produce$.promise$);
            csp.a.bottles$.indiana$._folks(csp.a.produce$.promise$);
        }
        for (Bone bone : csp.a.pointer$) {
            String bname;
            Iterator iterator;
            Vector3f loc = new Vector3f();
            if (bone.aimed$ != 4) {
                // empty if block
            }
            Quaternion rot = bone.momentum$;
            boolean isUpperBone = false;
            if (isUpperBody) {
                iterator = b2.probably$.iterator();
                while (iterator.hasNext() && !(isUpperBone = (bname = (String)iterator.next()).equals(bone.heavy$))) {
                }
            } else if (csp.remind$ != null && csp.remind$.probably$ != null) {
                iterator = csp.remind$.probably$.iterator();
                while (iterator.hasNext() && !(isUpperBone = (bname = (String)iterator.next()).equals(bone.heavy$))) {
                }
            }
            if (csp.remind$ != null && isUpperBone && isUpperBody) {
                rot = bone.indiana$;
                loc = bone.sussex$;
                kf[p] = new KeyFrame2(bone.heavy$, 0L, loc.serves$, loc.genius$, loc.superb$, rot._magnet(), rot._strain(), rot._median(), rot._their(), null);
                ++p;
                continue;
            }
            if (loc == null || rot == null || isUpperBody) continue;
            loc = bone.electron$;
            kf[p] = new KeyFrame2(bone.heavy$, 0L, loc.serves$, loc.genius$, loc.superb$, rot._magnet(), rot._strain(), rot._median(), rot._their(), null);
            ++p;
        }
        for (KeyFrame2 k : b2.intimate$) {
            KeyFrame2 newK = new KeyFrame2(k);
            newK.donated$ = (long)(1 + interFrame) + newK.donated$;
            kf[p] = newK;
            ++p;
        }
        result.facing$ = b2.facing$;
        result.genres$ = b2.genres$;
        result.bible$ = (long)(1 + interFrame) + b2.bible$;
        result.vacation$ = b2.vacation$;
        result.intimate$ = kf;
        result.earned$ = 1 + interFrame;
        if (result.intimate$ != null) {
            result.symphony$ = b2.symphony$;
            result.heart$ = b2.heart$;
            return result;
        }
        return null;
    }

    public VmdFileInfo _msgstr(VmdFileInfo a2, int interFrame1, VmdFileInfo b2, int interFrame2, VmdFileInfo c2) {
        return null;
    }

    public void _harper(CSplayer csp, FaceKeyFrame[] fkf) {
        int i;
        PmdFileInfo pfi = csp.a;
        ArrayList mg = new ArrayList(pfi.highs$);
        if (Config.permit$) {
            for (i = 0; i < csp.a.size(); ++i) {
                WeaponFileInfo wfi = (WeaponFileInfo)csp.a.get(i);
                for (int j = 0; j < wfi.h.size(); ++j) {
                    mg.add(wfi.h.get(j));
                }
            }
        }
        for (i = 0; i < mg.size(); ++i) {
            pmxMorph f2 = (pmxMorph)mg.get(i);
            if (f2 == null) continue;
            ArrayList<Float> add = new ArrayList<Float>();
            ArrayList<Long> times = new ArrayList<Long>();
            for (int j = 0; j < fkf.length; ++j) {
                FaceKeyFrame fk = fkf[j];
                if (!fk.chuck$.equals(f2.johnston$)) continue;
                boolean ignore = false;
                for (int h = 0; h < times.size(); ++h) {
                    if (((Long)times.get(h)).intValue() != fk.claims$.intValue()) continue;
                    ignore = true;
                    break;
                }
                if (ignore) continue;
                if (add.size() > 0 && fk != null && fk.claims$ != 0L) {
                    float begin = ((Float)add.get(add.size() - 1)).floatValue();
                    float end = fk.powered$;
                    long last = (Long)times.get(times.size() - 1);
                    float delta = fk.claims$ - last;
                    long s = last;
                    for (long l = s + 1L; l < fk.claims$ + 1L; ++l) {
                        float amnt = (float)(l - s) / delta;
                        add.add(Float.valueOf((1.0f - amnt) * begin + amnt * end));
                        times.add(fk.claims$);
                    }
                    continue;
                }
                add.add(Float.valueOf(fk.powered$));
                times.add(fk.claims$);
            }
            f2.locator$ = new ArrayList(add);
        }
        this._members(pfi, fkf);
    }

    public void _members(PmdFileInfo pfi, FaceKeyFrame[] fkf) {
        if (pfi.highs$ != null) {
            block3: for (int i = 0; i < pfi.highs$.size(); ++i) {
                pmxMorph pm = (pmxMorph)pfi.highs$.get(i);
                switch (pm.crash$) {
                    case 0: {
                        ArrayList<Float> add = new ArrayList<Float>();
                        ArrayList<Long> times = new ArrayList<Long>();
                        for (int j = 0; j < fkf.length; ++j) {
                            FaceKeyFrame fk = fkf[j];
                            if (!fk.chuck$.equals(pm.johnston$)) continue;
                            boolean ignore = false;
                            for (int h = 0; h < times.size(); ++h) {
                                if (((Long)times.get(h)).intValue() != fk.claims$.intValue()) continue;
                                ignore = true;
                                break;
                            }
                            if (ignore) continue;
                            if (add.size() > 0 && fk != null && fk.claims$ != 0L) {
                                float begin = ((Float)add.get(add.size() - 1)).floatValue();
                                float end = fk.powered$;
                                long last = (Long)times.get(times.size() - 1);
                                float delta = fk.claims$ - last;
                                long s = last;
                                for (long l = s + 1L; l < fk.claims$ + 1L; ++l) {
                                    float amnt = (float)(l - s) / delta;
                                    add.add(Float.valueOf((1.0f - amnt) * begin + amnt * end));
                                    times.add(fk.claims$);
                                }
                                continue;
                            }
                            add.add(Float.valueOf(fk.powered$));
                            times.add(fk.claims$);
                        }
                        for (int m = 0; m < pm.released$.size(); ++m) {
                            int ss;
                            pmxMorph f2 = (pmxMorph)pfi.highs$.get((Integer)pm.released$.get(m));
                            float vmScale = ((Float)pm.nintendo$.get(m)).floatValue();
                            ArrayList<Float> vmScales = new ArrayList<Float>();
                            for (ss = 0; ss < add.size(); ++ss) {
                                vmScales.add(Float.valueOf(((Float)add.get(ss)).floatValue() * vmScale));
                                if (((Float)vmScales.get(ss)).floatValue() != 0.0f) continue;
                                vmScales.set(ss, Float.valueOf(0.0f));
                            }
                            if (f2.locator$ != null) {
                                for (ss = 0; ss < vmScales.size(); ++ss) {
                                    if (f2.locator$.size() > ss) {
                                        f2.locator$.set(ss, Float.valueOf(((Float)f2.locator$.get(ss)).floatValue() + ((Float)vmScales.get(ss)).floatValue()));
                                        continue;
                                    }
                                    f2.locator$.add(vmScales.get(ss));
                                }
                                if (f2.locator$.size() <= vmScales.size() || vmScales.size() <= 0) continue;
                                float last = ((Float)vmScales.get(vmScales.size() - 1)).floatValue();
                                for (int ss2 = vmScales.size() - 1; ss2 < f2.locator$.size(); ++ss2) {
                                    float src = ((Float)f2.locator$.get(ss2)).floatValue();
                                    f2.locator$.set(ss2, Float.valueOf(src + last > 1.0f ? 1.0f : src + last));
                                }
                                continue;
                            }
                            f2.locator$ = new ArrayList(vmScales);
                        }
                        continue block3;
                    }
                }
            }
        }
    }

    private float _windsor(byte[] ip, float x, boolean isCam) {
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
        while (!((v = this._speaks(t, x1, x2) - x) * v < 1.0E-4f) && (tt = this._reverse(t, x1, x2)) != 0.0f) {
            t -= v / tt;
        }
        return this._speaks(t, y1, y2);
    }

    private float _tulsa(byte[] ip, float x, boolean isCam) {
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
        while (!((v = this._speaks(t, x1, x2) - x) * v < 1.0E-4f) && (tt = this._reverse(t, x1, x2)) != 0.0f) {
            t -= v / tt;
        }
        return this._speaks(t, y1, y2);
    }

    private float _speaks(float t, float p1, float p2) {
        return (1.0f + 3.0f * p1 - 3.0f * p2) * t * t * t + (3.0f * p2 - 6.0f * p1) * t * t + 3.0f * p1 * t;
    }

    private float _reverse(float t, float p1, float p2) {
        return (3.0f + 9.0f * p1 - 9.0f * p2) * t * t + (6.0f * p2 - 12.0f * p1) * t + 3.0f * p1;
    }

    float _stranger(float t, float p1, float p2) {
        return 3.0f * ((1.0f - t) * (1.0f - t)) * t * p1 + 3.0f * (1.0f - t) * (t * t) * p2 + t * t * t;
    }

    float _select(float X, float x1, float y1, float x2, float y2) {
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
        for (int i = 0; i < 100; ++i) {
            float lowXCalc = X - this._stranger(lowTGuess, x1, x2);
            float divideXCalc = X - this._stranger(dividingT, x1, x2);
            if ((double)Math.abs(divideXCalc) < 1.0E-4) break;
            if (lowXCalc * divideXCalc < 0.0f) {
                highTGuess = dividingT;
                dividingT = (dividingT + lowTGuess) / 2.0f;
                continue;
            }
            lowTGuess = dividingT;
            dividingT = (highTGuess + dividingT) / 2.0f;
        }
        return this._stranger(dividingT, y1, y2);
    }

    private float _jeffrey(byte[] ip, float t) {
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

    public float _handmade(float num) {
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

    public void _bullet(CSplayer csp, KeyFrame2[] kf, boolean isUpperBody) {
        int i;
        PmdFileInfo pfi = csp.a;
        ArrayList bs = new ArrayList(pfi.pointer$);
        if (Config.permit$) {
            for (i = 0; i < csp.a.size(); ++i) {
                WeaponFileInfo wfi = (WeaponFileInfo)csp.a.get(i);
                for (int j = 1; j < wfi.c.size(); ++j) {
                    bs.add(wfi.c.get(j));
                }
            }
        }
        for (i = 0; i < bs.size(); ++i) {
            Bone b2 = (Bone)bs.get(i);
            ArrayList<KeyFrame2> add = new ArrayList<KeyFrame2>();
            ArrayList keyFrameStack = null;
            keyFrameStack = isUpperBody ? b2.fence$ : b2.coaching$;
            if (keyFrameStack != null) {
                keyFrameStack.clear();
            }
            for (int j = 0; j < kf.length; ++j) {
                KeyFrame2 k = kf[j];
                if (k == null || !k.peeing$.equals(b2.heavy$)) continue;
                if (k != null && k.donated$ != 0L && add.size() > 0) {
                    KeyFrame2 last = (KeyFrame2)add.get(add.size() > 0 ? add.size() - 1 : 0);
                    byte[][] bazier = k._european();
                    byte[] bazierX = new byte[4];
                    byte[] bazierY = new byte[4];
                    byte[] bazierZ = new byte[4];
                    byte[] bazierR = new byte[4];
                    bazierX = bazier[0];
                    bazierY = bazier[1];
                    bazierZ = bazier[2];
                    bazierR = bazier[3];
                    Quaternion begin = new Quaternion(last.tones$);
                    Quaternion end = new Quaternion(k.tones$);
                    float delta = k.donated$ - last.donated$;
                    int s = last.donated$.intValue();
                    int l = s + 1;
                    while ((long)l < k.donated$ + 1L) {
                        float amnt = (float)(l - s) / delta;
                        amnt = this._tulsa(bazierR, amnt, false);
                        begin = new Quaternion(last.tones$);
                        begin._offers(k.tones$, amnt);
                        begin._network();
                        add.add(new KeyFrame2(k.peeing$, k.donated$, k.surgery$, k.addition$, k.begin$, begin._magnet(), begin._strain(), begin._median(), begin._their(), k.movie$));
                        ++l;
                    }
                    Vector3f beginT = new Vector3f(last.consoles$);
                    Vector3f endT = new Vector3f(k.consoles$);
                    delta = k.donated$ - last.donated$;
                    int l2 = s + 1;
                    while ((long)l2 < k.donated$ + 1L) {
                        float amnt = (float)(l2 - s) / delta;
                        if (add.size() >= l2 + 1) {
                            KeyFrame2 nk = (KeyFrame2)add.get(l2);
                            nk.surgery$ = last.consoles$.serves$ + (k.consoles$.serves$ - last.consoles$.serves$) * this._tulsa(bazierX, amnt, false);
                            nk.addition$ = last.consoles$.genius$ + (k.consoles$.genius$ - last.consoles$.genius$) * this._tulsa(bazierY, amnt, false);
                            nk.begin$ = last.consoles$.superb$ + (k.consoles$.superb$ - last.consoles$.superb$) * this._tulsa(bazierZ, amnt, false);
                            nk.consoles$ = new Vector3f(nk.surgery$, nk.addition$, nk.begin$);
                            if (i == 112) {
                                // empty if block
                            }
                        }
                        ++l2;
                    }
                    continue;
                }
                add.add(new KeyFrame2(k));
            }
            keyFrameStack = new ArrayList(add);
            if (isUpperBody) {
                b2.fence$ = keyFrameStack;
                continue;
            }
            b2.coaching$ = keyFrameStack;
        }
    }
}

