/*
 * Decompiled with CFR 0.152.
 */
package customsteve;

import customsteve.ac;
import customsteve.aj;
import customsteve.am;
import customsteve.ap_0;
import customsteve.ar;
import customsteve.b_0;
import java.util.ArrayList;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ay {
    public ar a;
    public ar b;
    public int a;
    public int b;
    public int c;
    public float a;
    public ArrayList<ar> a;
    public ArrayList<Integer> b;
    public ArrayList<Boolean> c;
    public ArrayList<ap_0> d;
    public ArrayList<ap_0> e;
    private float b = (float)Math.PI * 2;
    private float c = (float)Math.PI;
    private float d;
    private float e;
    private int d = 0;
    private int e = -1;
    private ac a;
    private ap_0[] a;
    public boolean a = false;

    public ay(ay ik, ar target, ar end, ArrayList<ar> childs) {
        this.a = target;
        this.b = end;
        this.a = ik.a;
        this.b = ik.b;
        this.c = ik.c;
        this.a = ik.a;
        this.a = childs;
    }

    public ay(ar self, ar end, int Cnum, float maxA, ArrayList childid, ArrayList<ar> childs, int tid, int eid) {
        this.a = self;
        this.b = end;
        this.c = Cnum;
        this.a = maxA;
        this.b = childid;
        this.a = childs;
        this.a = tid;
        this.b = eid;
    }

    public void a(ar s, ar t) {
        ap_0 dir = t.e.l(s.e);
        dir.d();
        if (dir.equals(new ap_0())) {
            return;
        }
    }

    public void a(ac pfi) {
        int i2;
        this.a = pfi;
        ArrayList<ar> bs = pfi.c;
        this.e = 0.0f;
        this.d = 9999.99f;
        this.e = -1;
        this.d = 0;
        for (i2 = 0; i2 < ((ArrayList)((Object)this.a)).size(); ++i2) {
            ((ar)((ArrayList)((Object)this.a)).get((int)i2)).c.a();
            ((ar)((ArrayList)((Object)this.a)).get((int)i2)).d.a();
            ((ar)((ArrayList)((Object)this.a)).get((int)i2)).f.a(((ar)((ArrayList)((Object)this.a)).get((int)i2)).j);
            ((ar)((ArrayList)((Object)this.a)).get((int)i2)).l.a(((ar)((ArrayList)((Object)this.a)).get((int)i2)).m);
            ((ar)((ArrayList)((Object)this.a)).get(i2)).a(pfi, new ArrayList<Integer>());
        }
        this.b.c.a();
        this.b.d.a();
        this.a.c.a();
        this.a.d.a();
        this.b.a(pfi, new ArrayList<Integer>());
        for (i2 = 0; i2 < this.c; ++i2) {
            int j2;
            for (j2 = 0; j2 < ((ArrayList)((Object)this.a)).size(); ++j2) {
                ++this.e;
                try {
                    if (this.a(i2, j2, this.a, this.b, (ar)((ArrayList)((Object)this.a)).get(j2))) {
                        return;
                    }
                    if (i2 == 4 && j2 != 0) continue;
                }
                catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            if (i2 != this.c - 1) continue;
            for (j2 = 0; j2 < ((ArrayList)((Object)this.a)).size(); ++j2) {
                ar jo = (ar)((ArrayList)((Object)this.a)).get(j2);
                if (b_0.c && ((ar)((ArrayList)((Object)this.a)).get((int)j2)).e != 0) {
                    return;
                }
                jo.b = new am();
            }
            this.b.a(pfi, new ArrayList<Integer>());
            return;
        }
    }

    public void a(int changeBoneID, ar cb, ArrayList bs) {
        ap_0 parentWP;
        am parentWR;
        for (int i2 = ((ArrayList)((Object)this.a)).size() - 1; i2 > -1; --i2) {
            ar jo = (ar)((ArrayList)((Object)this.a)).get(i2);
            ar parent = jo.a(bs);
            parentWR = parent.g;
            parentWP = parent.e;
            parentWR.a(jo.b ? jo.l : jo.f, jo.g);
            parentWR.a(jo.b ? jo.l : jo.c, jo.e);
            jo.e.c(parentWP);
            parentWR = jo.g;
            parentWP = jo.e;
        }
        ar jo = this.b;
        ar parent = jo.a(bs);
        parentWR = parent.g;
        parentWP = parent.e;
        parentWR.a(jo.b ? jo.l : jo.f, jo.g);
        parentWR.a(jo.b ? jo.l : jo.c, jo.e);
        jo.e.c(parentWP);
    }

    private boolean a(int i2, int j2, ar t, ar e2, ar jo) throws Exception {
        float trued;
        ap_0 tp = t.e;
        ArrayList<ar> bs = this.a.c;
        ap_0 end = e2.e.l(jo.e);
        ap_0 target = tp.l(jo.e);
        am inv = jo.g.b().a();
        ap_0 el = inv.a(end);
        ap_0 tl = inv.a(target);
        float d2 = trued = aj.a(tl.c().a(el.c()));
        ap_0 ax2 = tl.c().d(el.c());
        ax2.d();
        d2 = Math.min(d2, this.a * (float)(j2 + 1));
        am rot = new am().a(d2, ax2);
        rot.a();
        ap_0 sC = null;
        if (jo.a) {
            sC = this.a[0];
        }
        if (sC != null) {
            if (i2 == 0) {
                if (this.e == 0) {
                    rot = new am().a(Math.abs(d2), sC);
                }
            } else {
                ax2.f(0.0f);
                ax2.g(0.0f);
                rot = new am().a(Math.abs(d2), ax2);
            }
        }
        rot.d();
        rot.a();
        if (jo.b) {
            jo.l.g(rot);
            jo.l.a();
        } else {
            jo.f.g(rot);
            jo.f.a();
        }
        jo.c.g(rot);
        jo.c.a();
        jo.e.g(rot);
        jo.e.a();
        this.a(j2, jo, bs);
        float dis = tp.c(e2.e);
        if (Math.abs(dis) < Math.abs(this.d)) {
            this.d = Math.abs(dis);
            jo.b.a(jo.f);
        }
        return Math.abs(dis) < 1.0E-8f;
    }

    public void b(ac pfi) {
    }

    public void c(ac pfi) {
        this.a = pfi;
        for (int i2 = 0; i2 < ((ArrayList)((Object)this.a)).size(); ++i2) {
        }
        this.b.a(pfi, new ArrayList<Integer>());
        ar E2 = this.b;
        ar T2 = this.a;
        for (int i3 = 0; i3 < this.c; ++i3) {
            for (int j2 = 0; j2 < ((ArrayList)((Object)this.a)).size(); ++j2) {
                ar J = (ar)((ArrayList)((Object)this.a)).get(j2);
                this.a(J, T2, E2, this.a, i3);
            }
            if (!(T2.e.c(E2.e) < 0.001f)) continue;
            return;
        }
    }

    public void a(ar J, ar T2, ar E2, float limitAngle, int iterNum) {
        ap_0 absJoint2End = E2.e.l(J.e);
        ap_0 absJoint2Target = T2.e.l(J.e);
        am invRotation = J.g.b();
        ap_0 localJoint2End = invRotation.a(absJoint2End);
        ap_0 localJoint2Target = invRotation.a(absJoint2Target);
        float deltaAngle = aj.a(localJoint2End.c().a(localJoint2Target.c()));
        if (Float.isNaN(deltaAngle)) {
            return;
        }
        deltaAngle = this.a(deltaAngle);
        ap_0 rotateAxis = localJoint2End.c().d(localJoint2Target.c());
        am deltaRotation = new am().a(deltaAngle, rotateAxis);
        if (J.a) {
            if (iterNum == 0) {
                deltaRotation = new am().a(Math.abs(deltaAngle), new ap_0(-1.0f, 0.0f, 0.0f));
            } else {
                float[] yrp = new float[3];
                deltaRotation.a(yrp);
                float[] yrp1 = new float[3];
                J.f.a(yrp1);
                float deltaYaw = yrp[0];
                float deltaRoll = yrp[1];
                float deltaPitch = yrp[2];
                float curYaw = yrp1[0];
                float curRoll = yrp1[1];
                float curPitch = yrp1[2];
                if (Float.isNaN(deltaYaw)) {
                    return;
                }
                float x = yrp[2];
                float cx = yrp1[2];
                float MinRot = 0.002f;
                if (x + cx > this.c) {
                    x = this.c - cx;
                }
                if (MinRot > x + cx) {
                    x = MinRot - cx;
                }
                if (Math.abs(x = this.a(x)) < MinRot) {
                    return;
                }
                deltaRotation = new am().a(x, 0.0f, 0.0f);
            }
        }
        J.f.g(deltaRotation);
        this.b.a(this.a, new ArrayList<Integer>());
    }

    public void d(ac pfi) {
        for (int i2 = 0; i2 < ((ArrayList)((Object)this.a)).size(); ++i2) {
            ((ar)((ArrayList)((Object)this.a)).get((int)i2)).f.a(((ar)((ArrayList)((Object)this.a)).get((int)i2)).j);
            ((ar)((ArrayList)((Object)this.a)).get(i2)).a(pfi, new ArrayList<Integer>());
        }
        this.b.a(pfi, new ArrayList<Integer>());
        ar end = this.b;
        ar target = this.a;
        ap_0 EV = new ap_0(end.e);
        for (int i3 = 0; i3 < this.c; ++i3) {
            for (int j2 = 0; j2 < ((ArrayList)((Object)this.a)).size(); ++j2) {
                ar b2 = (ar)((ArrayList)((Object)this.a)).get(j2);
                ap_0 TV = new ap_0(target.e);
                if (b2.a) {
                    float t_dis;
                    float b_dis;
                    if (i3 != 0) continue;
                    ar base = (ar)((ArrayList)((Object)this.a)).get(((ArrayList)((Object)this.a)).size() - 1);
                    ap_0 targetInvs = new ap_0(b2.e);
                    ap_0 effecterInvs = new ap_0(base.e);
                    float e_dis = EV.c(effecterInvs);
                    double angle = Math.acos((e_dis * e_dis - (b_dis = targetInvs.c(effecterInvs)) * b_dis - (t_dis = TV.c(targetInvs)) * t_dis) / (2.0f * b_dis * t_dis));
                    if (Double.isNaN(angle)) continue;
                    ap_0 axis = new ap_0();
                    axis.a(-1.0f, 0.0f, 0.0f);
                    am rot = new am().a((float)angle, axis);
                    b2.f.g(rot);
                    b2.f.a();
                    b2.c.g(rot);
                    b2.c.a();
                    b2.e.g(rot);
                    b2.e.a();
                    b2.a(pfi, new ArrayList<Integer>());
                    continue;
                }
                if (TV.c(EV) < 0.001f) {
                    return;
                }
                ap_0 e2 = EV.l(b2.e);
                ap_0 t = TV.l(b2.e);
                am inv = b2.g.b().a();
                ap_0 el = inv.a(e2);
                ap_0 tl = inv.a(t);
                float d2 = aj.a(tl.c().a(el.c()));
                if (Double.isNaN(d2 *= this.a)) continue;
                ap_0 ax2 = tl.c().d(el.c());
                ax2.d();
                if (Double.isNaN(ax2.a) || Double.isNaN(ax2.b) || Double.isNaN(ax2.c)) continue;
                am rot = new am().a(d2, ax2);
                b2.f.g(rot);
                b2.f.a();
                b2.e.g(rot);
                b2.e.a();
                b2.a(pfi, new ArrayList<Integer>());
            }
        }
    }

    public float a(float value) {
        float limit = this.a;
        if (value < -limit) {
            return -limit;
        }
        if (value > limit) {
            return limit;
        }
        return value;
    }

    public float a(float small, float value, float big) {
        if (value < small) {
            return small;
        }
        if (value > big) {
            return big;
        }
        return value;
    }
}

