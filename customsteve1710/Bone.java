/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class Bone {
    public String heavy$;
    public int disease$;
    int paxil$;
    public int aimed$;
    public int garden$ = -1;
    public float humor$;
    public float electric$;
    public float missile$;
    public float pamela$ = -1.0f;
    public ArrayList coaching$;
    public ArrayList fence$;
    public int config$ = 0;
    public boolean visual$ = false;
    public Matrix4f teens$ = new Matrix4f();
    public ArrayList expired$;
    public Matrix4f studies$;
    public Vector3f using$;
    public Quaternion welsh$;
    public Vector3f clerk$;
    public Quaternion walnut$;
    public Quaternion alliance$;
    public Quaternion beliefs$;
    public Quaternion sorry$;
    public Vector3f clicks$ = new Vector3f();
    public Quaternion promise$ = new Quaternion();
    public Vector3f remember$ = new Vector3f(1.0f, 1.0f, 1.0f);
    public Vector3f rankings$ = new Vector3f();
    public Quaternion sciences$ = new Quaternion();
    public Vector3f tracked$ = new Vector3f(1.0f, 1.0f, 1.0f);
    public Vector3f roommate$;
    public Quaternion alloy$;
    public Vector3f morgan$ = new Vector3f(1.0f, 1.0f, 1.0f);
    public Vector3f pencil$;
    public Quaternion payment$;
    public Vector3f adoption$ = new Vector3f(1.0f, 1.0f, 1.0f);
    public Quaternion momentum$ = new Quaternion();
    public Vector3f consider$ = new Vector3f();
    public Quaternion bradley$ = null;
    public Quaternion flights$ = new Quaternion();
    public Quaternion indiana$ = new Quaternion();
    public Vector3f andrews$ = new Vector3f();
    public Vector3f sussex$ = new Vector3f();
    public Vector3f electron$ = new Vector3f();
    public Vector3f pushing$ = new Vector3f();
    public boolean caring$ = false;
    public Matrix4f[] catalog$ = new Matrix4f[3];
    public Vector3f[] safely$ = new Vector3f[3];
    public Quaternion[] shaved$ = new Quaternion[3];
    public Vector3f exact$;
    public Quaternion alien$;

    public Bone(Bone b2) {
        this.heavy$ = new String(b2.heavy$);
        this.disease$ = b2.disease$;
        this.paxil$ = b2.paxil$;
        this.aimed$ = b2.aimed$;
        this.garden$ = b2.garden$;
        this.humor$ = b2.humor$;
        this.electric$ = b2.electric$;
        this.missile$ = b2.missile$;
        this.config$ = b2.config$;
        if (b2.coaching$ != null) {
            this.coaching$ = new ArrayList(b2.coaching$);
        }
        if (b2.fence$ != null) {
            this.fence$ = new ArrayList(b2.fence$);
        }
        this.expired$ = new ArrayList(b2.expired$);
        this.studies$ = new Matrix4f(b2.studies$);
        if (b2.using$ != null) {
            this.using$ = new Vector3f(b2.using$);
        }
        if (b2.welsh$ != null) {
            this.welsh$ = new Quaternion(b2.welsh$);
        }
        if (b2.clerk$ != null) {
            this.clerk$ = new Vector3f(b2.clerk$);
        }
        this.clicks$ = new Vector3f(b2.clicks$);
        this.promise$ = new Quaternion(b2.promise$);
        this.remember$ = new Vector3f(b2.remember$);
        this.rankings$ = new Vector3f(b2.rankings$);
        this.sciences$ = new Quaternion(b2.sciences$);
        this.tracked$ = new Vector3f(b2.tracked$);
        this.roommate$ = new Vector3f(b2.roommate$);
        this.alloy$ = new Quaternion(b2.alloy$);
        this.morgan$ = new Vector3f(b2.morgan$);
        this.pencil$ = new Vector3f(b2.pencil$);
        this.payment$ = new Quaternion(b2.payment$);
        this.adoption$ = new Vector3f(b2.adoption$);
        this.pamela$ = b2.pamela$;
        this.bradley$ = b2.bradley$;
    }

    public Bone(String name, int parent, int child, int type, int target, float x, float y, float z, float effectFactor) {
        this.heavy$ = name;
        this.disease$ = parent;
        this.paxil$ = child;
        this.aimed$ = type;
        this.garden$ = target;
        this.humor$ = x;
        this.electric$ = y;
        this.missile$ = z;
        this.pamela$ = effectFactor;
        this.expired$ = new ArrayList();
        this.pencil$ = new Vector3f(x, y, z);
        this.roommate$ = new Vector3f(this.pencil$);
        this.clicks$ = new Vector3f(this.roommate$);
        this.payment$ = new Quaternion();
        this.alloy$ = new Quaternion();
        this.promise$ = new Quaternion(this.alloy$);
        this.rankings$ = new Vector3f(this.clicks$);
        this.sciences$ = new Quaternion(this.alloy$);
        this.alliance$ = new Quaternion();
        this.beliefs$ = new Quaternion();
        this.sorry$ = new Quaternion();
        this.walnut$ = new Quaternion();
    }

    public void _trips(Bone b2) {
        this.heavy$ = new String(b2.heavy$);
        this.disease$ = b2.disease$;
        this.paxil$ = b2.paxil$;
        this.aimed$ = b2.aimed$;
        this.garden$ = b2.garden$;
        this.humor$ = b2.humor$;
        this.electric$ = b2.electric$;
        this.missile$ = b2.missile$;
        this.config$ = b2.config$;
        if (b2.coaching$ != null) {
            this.coaching$ = new ArrayList(b2.coaching$);
        }
        if (b2.fence$ != null) {
            this.fence$ = new ArrayList(b2.fence$);
        }
        this.expired$ = new ArrayList(b2.expired$);
        this.studies$ = new Matrix4f(b2.studies$);
        if (b2.using$ != null) {
            this.using$ = new Vector3f(b2.using$);
        }
        if (b2.welsh$ != null) {
            this.welsh$ = new Quaternion(b2.welsh$);
        }
        if (b2.clerk$ != null) {
            this.clerk$ = new Vector3f(b2.clerk$);
        }
        this.clicks$ = new Vector3f(b2.clicks$);
        this.promise$ = new Quaternion(b2.promise$);
        this.remember$ = new Vector3f(b2.remember$);
        this.rankings$ = new Vector3f(b2.rankings$);
        this.sciences$ = new Quaternion(b2.sciences$);
        this.tracked$ = new Vector3f(b2.tracked$);
        this.roommate$ = new Vector3f(b2.roommate$);
        this.alloy$ = new Quaternion(b2.alloy$);
        this.morgan$ = new Vector3f(b2.morgan$);
        this.pencil$ = new Vector3f(b2.pencil$);
        this.payment$ = new Quaternion(b2.payment$);
        this.adoption$ = new Vector3f(b2.adoption$);
        this.pamela$ = b2.pamela$;
        this.bradley$ = this.bradley$;
    }

    public Vector3f _counting(ArrayList bs) {
        Bone parent = this._settle(bs);
        if (parent != null) {
            return this.clicks$._based(parent.clicks$);
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void _script(PmdFileInfo pfi, ArrayList doneParent) {
        block11: {
            ArrayList bs;
            block10: {
                Bone target;
                bs = pfi.pointer$;
                Bone parent = this._settle(bs);
                if (parent == null) break block10;
                Quaternion parent_worldRot = parent.sciences$;
                Quaternion targetRot = new Quaternion();
                if (this.garden$ > -1 && pfi.pointer$.size() > this.garden$ && (target = (Bone)pfi.pointer$.get(this.garden$)) != null) {
                    targetRot = new Quaternion();
                    targetRot._offers(this.caring$ ? target.flights$ : target.promise$, this.pamela$);
                    targetRot._network();
                }
                if (doneParent.indexOf(parent._memphis(bs)) != -1) {
                    if (this.bradley$ != null) {
                        if (this.caring$) {
                            Vector3f v3 = new Vector3f();
                            this.indiana$._visits(v3);
                            this.bradley$._fighter(parent_worldRot._generic(this.indiana$), this.sciences$);
                        } else {
                            this.bradley$._fighter(parent_worldRot._generic(this.promise$), this.sciences$);
                        }
                        this.sciences$._welcome(targetRot);
                    } else {
                        parent_worldRot._fighter(this.caring$ ? this.flights$ : this.promise$, this.sciences$);
                        this.sciences$._welcome(targetRot);
                    }
                    parent.tracked$._avenue(this.remember$, this.tracked$);
                    parent.sciences$._mistakes(this.caring$ ? this.andrews$ : this.clicks$, this.rankings$);
                    this.rankings$._cookies(parent.remember$);
                    this.rankings$._kinda(parent.rankings$);
                    doneParent.add(this._memphis(bs));
                    if (parent.expired$.indexOf(this._memphis(bs)) == -1) {
                        parent.expired$.add(this._memphis(bs));
                    }
                    break block11;
                } else {
                    parent._script(pfi, doneParent);
                    doneParent.add(parent._memphis(bs));
                    parent_worldRot._fighter(this.caring$ ? this.flights$ : this.promise$, this.sciences$);
                    this.sciences$._welcome(targetRot);
                    parent.tracked$._avenue(this.remember$, this.tracked$);
                    parent.sciences$._mistakes(this.caring$ ? this.andrews$ : this.clicks$, this.rankings$);
                    this.rankings$._cookies(parent.remember$);
                    this.rankings$._kinda(parent.rankings$);
                    if (!this.heavy$.equals("\u30b0\u30eb\u30fc\u30d6")) {
                        // empty if block
                    }
                }
                break block11;
            }
            this.sciences$._folks(this.caring$ ? this.flights$ : this.promise$);
            this.rankings$._shoot(this.caring$ ? this.andrews$ : this.clicks$);
            this.tracked$._shoot(this.remember$);
            doneParent.add(this._memphis(bs));
        }
        if (this.using$ == null) {
            this._vintage();
        }
    }

    public void _milan(Matrix4f outTransform, ArrayList bs) {
        Quaternion tmp1 = new Quaternion(0.0f, 0.0f, 0.0f, 1.0f);
        Vector3f tmp2 = new Vector3f(0.0f, 0.0f, 0.0f);
        Vector3f tmp3 = new Vector3f(0.0f, 0.0f, 0.0f);
        Vector3f scale = this.tracked$._avenue(this.clerk$, tmp3);
        Quaternion rotate = this.sciences$._fighter(this.welsh$, tmp1);
        Vector3f translate = this.rankings$._english(rotate._mistakes(scale._avenue(this.using$, tmp2), tmp2), tmp2);
        if (this.config$ == 1) {
            // empty if block
        }
        if (Config.point$) {
            if (this.config$ == 1) {
                if (this.alien$ == null) {
                    return;
                }
                rotate = this.alien$._fighter(this.welsh$, tmp1);
                translate = this.exact$._english(rotate._mistakes(scale._avenue(this.using$, tmp2), tmp2), tmp2);
            } else if (this.config$ == 2) {
                if (this.alien$ == null) {
                    return;
                }
                rotate = this.alien$._fighter(this.welsh$, tmp1);
                Bone parent = this._settle(bs);
                translate = parent != null && parent.config$ == 2 && parent.exact$ != null ? this.exact$._english(rotate._mistakes(scale._avenue(this.using$, tmp2), tmp2), tmp2) : this.rankings$._english(rotate._mistakes(scale._avenue(this.using$, tmp2), tmp2), tmp2);
            }
        }
        outTransform._bikes();
        outTransform._counties(translate, scale, rotate._agenda(new Matrix3f()));
    }

    public void _vintage() {
        this.roommate$._shoot(this.clicks$);
        this.alloy$._folks(this.promise$);
        this.morgan$._shoot(this.remember$);
        if (this.using$ == null) {
            this.using$ = new Vector3f();
            this.welsh$ = new Quaternion();
            this.clerk$ = new Vector3f();
        }
        this.using$._shoot(this.rankings$);
        this.using$._bought();
        this.welsh$._folks(this.sciences$);
        this.welsh$._equally();
        this.clerk$._shoot(Vector3f.airline$);
    }

    public int _memphis(ArrayList bs) {
        int id = 0;
        for (int i = 0; i < bs.size(); ++i) {
            if (!((Bone)bs.get((int)i)).heavy$.equals(this.heavy$)) continue;
            id = i;
            break;
        }
        return id;
    }

    public Bone _settle(ArrayList bs) {
        Bone parent = null;
        for (int i = 0; i < bs.size(); ++i) {
            if (this.disease$ != i || bs.get(i) == null) continue;
            parent = (Bone)bs.get(i);
            break;
        }
        return parent;
    }
}

