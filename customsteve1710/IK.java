/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class IK {
    public Bone firmware$;
    public Bone salary$;
    public int dealtime$;
    public int platform$;
    public int senators$;
    public float iceland$;
    public ArrayList locked$;
    public ArrayList cancer$;
    public ArrayList rugby$;
    public ArrayList romance$;
    public ArrayList marble$;
    private float pride$ = (float)Math.PI * 2;
    private float moscow$ = (float)Math.PI;
    private float click$ = 9999.99f;
    private float argue$ = 0.0f;
    private int ratio$ = 0;
    private int people$ = -1;
    private PmdFileInfo antiques$;
    private Vector3f[] believe$ = new Vector3f[]{new Vector3f(1.0f, 0.0f, 0.0f), new Vector3f(1.0f, 0.0f, 0.0f)};
    public boolean startup$ = false;

    public IK(IK ik, Bone target, Bone end, ArrayList childs) {
        this.firmware$ = target;
        this.salary$ = end;
        this.dealtime$ = ik.dealtime$;
        this.platform$ = ik.platform$;
        this.senators$ = ik.senators$;
        this.iceland$ = ik.iceland$;
        this.locked$ = childs;
    }

    public IK(Bone self, Bone end, int Cnum, float maxA, ArrayList childid, ArrayList childs, int tid, int eid) {
        this.firmware$ = self;
        this.salary$ = end;
        this.senators$ = Cnum;
        this.iceland$ = maxA;
        this.cancer$ = childid;
        this.locked$ = childs;
        this.dealtime$ = tid;
        this.platform$ = eid;
    }

    public void _horizon(Bone s, Bone t) {
        Vector3f dir = t.rankings$._based(s.rankings$);
        dir._press();
        if (dir.equals(new Vector3f())) {
            return;
        }
    }

    public void _saudi(PmdFileInfo pfi) {
        int i;
        this.antiques$ = pfi;
        ArrayList bs = pfi.pointer$;
        this.argue$ = 0.0f;
        this.click$ = 9999.99f;
        this.people$ = -1;
        this.ratio$ = 0;
        for (i = 0; i < this.locked$.size(); ++i) {
            ((Bone)this.locked$.get((int)i)).alliance$._looks();
            ((Bone)this.locked$.get((int)i)).beliefs$._looks();
            ((Bone)this.locked$.get((int)i)).promise$._folks(((Bone)this.locked$.get((int)i)).momentum$);
            ((Bone)this.locked$.get((int)i)).flights$._folks(((Bone)this.locked$.get((int)i)).indiana$);
            ((Bone)this.locked$.get(i))._script(pfi, new ArrayList());
        }
        this.salary$.alliance$._looks();
        this.salary$.beliefs$._looks();
        this.firmware$.alliance$._looks();
        this.firmware$.beliefs$._looks();
        this.salary$._script(pfi, new ArrayList());
        for (i = 0; i < this.senators$; ++i) {
            int j;
            for (j = 0; j < this.locked$.size(); ++j) {
                ++this.people$;
                try {
                    if (this._fixtures(i, j, this.firmware$, this.salary$, (Bone)this.locked$.get(j))) {
                        return;
                    }
                    if (i == 4 && j != 0) continue;
                }
                catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            if (i != this.senators$ - 1) continue;
            for (j = 0; j < this.locked$.size(); ++j) {
                Bone jo = (Bone)this.locked$.get(j);
                if (Config.point$ && ((Bone)this.locked$.get((int)j)).config$ != 0) {
                    return;
                }
                jo.walnut$ = new Quaternion();
            }
            this.salary$._script(pfi, new ArrayList());
            return;
        }
    }

    public void _muslims(int changeBoneID, Bone cb, ArrayList bs) {
        Vector3f parentWP;
        Quaternion parentWR;
        for (int i = this.locked$.size() - 1; i > -1; --i) {
            Bone jo = (Bone)this.locked$.get(i);
            Bone parent = jo._settle(bs);
            parentWR = parent.sciences$;
            parentWP = parent.rankings$;
            parentWR._fighter(jo.caring$ ? jo.flights$ : jo.promise$, jo.sciences$);
            parentWR._mistakes(jo.caring$ ? jo.andrews$ : jo.clicks$, jo.rankings$);
            jo.rankings$._kinda(parentWP);
            parentWR = jo.sciences$;
            parentWP = jo.rankings$;
        }
        Bone jo = this.salary$;
        Bone parent = jo._settle(bs);
        parentWR = parent.sciences$;
        parentWP = parent.rankings$;
        parentWR._fighter(jo.caring$ ? jo.flights$ : jo.promise$, jo.sciences$);
        parentWR._mistakes(jo.caring$ ? jo.andrews$ : jo.clicks$, jo.rankings$);
        jo.rankings$._kinda(parentWP);
    }

    private boolean _fixtures(int i, int j, Bone t, Bone e2, Bone jo) throws Exception {
        float trued;
        Vector3f tp = t.rankings$;
        ArrayList bs = this.antiques$.pointer$;
        Vector3f end = e2.rankings$._based(jo.rankings$);
        Vector3f target = tp._based(jo.rankings$);
        Quaternion inv = jo.sciences$._filling()._network();
        Vector3f el = inv._align(end);
        Vector3f tl = inv._align(target);
        float d2 = trued = FastMath._coding(tl._mixer()._client(el._mixer()));
        Vector3f ax = tl._mixer()._issued(el._mixer());
        ax._press();
        d2 = Math.min(d2, this.iceland$ * (float)(j + 1));
        Quaternion rot = new Quaternion()._micro(d2, ax);
        rot._network();
        Vector3f sC = null;
        if (jo.visual$) {
            sC = this.believe$[0];
        }
        if (sC != null) {
            if (i == 0) {
                if (this.people$ == 0) {
                    rot = new Quaternion()._micro(Math.abs(d2), sC);
                }
            } else {
                ax._itunes(0.0f);
                ax._assume(0.0f);
                rot = new Quaternion()._micro(Math.abs(d2), ax);
            }
        }
        rot._equally();
        rot._network();
        if (jo.caring$) {
            jo.flights$._welcome(rot);
            jo.flights$._network();
        } else {
            jo.promise$._welcome(rot);
            jo.promise$._network();
        }
        jo.alliance$._welcome(rot);
        jo.alliance$._network();
        jo.sorry$._welcome(rot);
        jo.sorry$._network();
        this._muslims(j, jo, bs);
        float dis = tp._another(e2.rankings$);
        if (Math.abs(dis) < Math.abs(this.click$)) {
            this.click$ = Math.abs(dis);
            jo.walnut$._folks(jo.promise$);
        }
        return Math.abs(dis) < 1.0E-8f;
    }

    public void _algeria(PmdFileInfo pfi) {
    }

    public void _assured(PmdFileInfo pfi) {
        this.antiques$ = pfi;
        for (int i = 0; i < this.locked$.size(); ++i) {
        }
        this.salary$._script(pfi, new ArrayList());
        Bone E = this.salary$;
        Bone T = this.firmware$;
        for (int i = 0; i < this.senators$; ++i) {
            for (int j = 0; j < this.locked$.size(); ++j) {
                Bone J = (Bone)this.locked$.get(j);
                this._shorts(J, T, E, this.iceland$, i);
            }
            if (!(T.rankings$._another(E.rankings$) < 0.001f)) continue;
            return;
        }
    }

    public void _shorts(Bone J, Bone T, Bone E, float limitAngle, int iterNum) {
        Vector3f absJoint2End = E.rankings$._based(J.rankings$);
        Vector3f absJoint2Target = T.rankings$._based(J.rankings$);
        Quaternion invRotation = J.sciences$._filling();
        Vector3f localJoint2End = invRotation._align(absJoint2End);
        Vector3f localJoint2Target = invRotation._align(absJoint2Target);
        float deltaAngle = FastMath._coding(localJoint2End._mixer()._client(localJoint2Target._mixer()));
        if (Float.isNaN(deltaAngle)) {
            return;
        }
        deltaAngle = this._coating(deltaAngle);
        Vector3f rotateAxis = localJoint2End._mixer()._issued(localJoint2Target._mixer());
        Quaternion deltaRotation = new Quaternion()._micro(deltaAngle, rotateAxis);
        if (J.visual$) {
            if (iterNum == 0) {
                deltaRotation = new Quaternion()._micro(Math.abs(deltaAngle), new Vector3f(-1.0f, 0.0f, 0.0f));
            } else {
                float[] yrp = new float[3];
                deltaRotation._always(yrp);
                float[] yrp1 = new float[3];
                J.promise$._always(yrp1);
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
                if (x + cx > this.moscow$) {
                    x = this.moscow$ - cx;
                }
                if (MinRot > x + cx) {
                    x = MinRot - cx;
                }
                if (Math.abs(x = this._coating(x)) < MinRot) {
                    return;
                }
                deltaRotation = new Quaternion()._between(x, 0.0f, 0.0f);
            }
        }
        J.promise$._welcome(deltaRotation);
        this.salary$._script(this.antiques$, new ArrayList());
    }

    public void _birds(PmdFileInfo pfi) {
        for (int i = 0; i < this.locked$.size(); ++i) {
            ((Bone)this.locked$.get((int)i)).promise$._folks(((Bone)this.locked$.get((int)i)).momentum$);
            ((Bone)this.locked$.get(i))._script(pfi, new ArrayList());
        }
        this.salary$._script(pfi, new ArrayList());
        Bone end = this.salary$;
        Bone target = this.firmware$;
        Vector3f EV = new Vector3f(end.rankings$);
        for (int i = 0; i < this.senators$; ++i) {
            for (int j = 0; j < this.locked$.size(); ++j) {
                Bone b2 = (Bone)this.locked$.get(j);
                Vector3f TV = new Vector3f(target.rankings$);
                if (b2.visual$) {
                    float t_dis;
                    float b_dis;
                    if (i != 0) continue;
                    Bone base = (Bone)this.locked$.get(this.locked$.size() - 1);
                    Vector3f targetInvs = new Vector3f(b2.rankings$);
                    Vector3f effecterInvs = new Vector3f(base.rankings$);
                    float e_dis = EV._another(effecterInvs);
                    double angle = Math.acos((e_dis * e_dis - (b_dis = targetInvs._another(effecterInvs)) * b_dis - (t_dis = TV._another(targetInvs)) * t_dis) / (2.0f * b_dis * t_dis));
                    if (Double.isNaN(angle)) continue;
                    Vector3f axis = new Vector3f();
                    axis._alleged(-1.0f, 0.0f, 0.0f);
                    Quaternion rot = new Quaternion()._micro((float)angle, axis);
                    b2.promise$._welcome(rot);
                    b2.promise$._network();
                    b2.alliance$._welcome(rot);
                    b2.alliance$._network();
                    b2.sorry$._welcome(rot);
                    b2.sorry$._network();
                    b2._script(pfi, new ArrayList());
                    continue;
                }
                if (TV._another(EV) < 0.001f) {
                    return;
                }
                Vector3f e2 = EV._based(b2.rankings$);
                Vector3f t = TV._based(b2.rankings$);
                Quaternion inv = b2.sciences$._filling()._network();
                Vector3f el = inv._align(e2);
                Vector3f tl = inv._align(t);
                float d2 = FastMath._coding(tl._mixer()._client(el._mixer()));
                if (Double.isNaN(d2 *= this.iceland$)) continue;
                Vector3f ax = tl._mixer()._issued(el._mixer());
                ax._press();
                if (Double.isNaN(ax.serves$) || Double.isNaN(ax.genius$) || Double.isNaN(ax.superb$)) continue;
                Quaternion rot = new Quaternion()._micro(d2, ax);
                b2.promise$._welcome(rot);
                b2.promise$._network();
                b2.sorry$._welcome(rot);
                b2.sorry$._network();
                b2._script(pfi, new ArrayList());
            }
        }
    }

    public float _coating(float value) {
        float limit = this.iceland$;
        if (value < -limit) {
            return -limit;
        }
        if (value > limit) {
            return limit;
        }
        return value;
    }

    public float _metric(float small, float value, float big) {
        if (value < small) {
            return small;
        }
        if (value > big) {
            return big;
        }
        return value;
    }
}

