/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class Joint {
    public String films$;
    public String quiet$;
    public float[] candle$;
    public float[] hotels$;
    public ArrayList relation$;
    public KeyFrame[] memory$;
    public KeyFrame[] meetup$;
    public Matrix4f plastic$;
    private Vector3f named$;
    private Quaternion listen$;
    private Vector3f lying$;
    public Vector3f prefers$ = new Vector3f();
    public Quaternion images$ = new Quaternion();
    public Vector3f source$ = new Vector3f(1.0f, 1.0f, 1.0f);
    public Vector3f scotland$ = new Vector3f();
    public Quaternion inbox$ = new Quaternion();
    public Vector3f started$ = new Vector3f();
    public Quaternion michigan$ = new Quaternion();
    private int problem$ = 1;
    public Vector3f securely$;
    public Quaternion cleanup$;
    private Vector3f minds$ = new Vector3f(1.0f, 1.0f, 1.0f);

    public Joint(String name, String p, float[] rot, float[] trans, KeyFrame[] rotF, KeyFrame[] transF) {
        this.memory$ = rotF;
        this.meetup$ = transF;
        this.relation$ = new ArrayList();
        this.securely$ = new Vector3f(trans[0], trans[1], trans[2]);
        this.prefers$ = new Vector3f(this.securely$);
        this.cleanup$ = new Quaternion(rot);
        this.images$ = new Quaternion(this.cleanup$);
        this.scotland$ = new Vector3f(this.prefers$);
        this.inbox$ = new Quaternion(this.cleanup$);
        this.films$ = name;
        this.quiet$ = p;
        this.candle$ = rot;
        this.hotels$ = trans;
    }

    void _ceremony() {
        this.securely$._shoot(this.prefers$);
        this.cleanup$._folks(this.images$);
        this.minds$._shoot(this.source$);
        if (this.named$ == null) {
            this.named$ = new Vector3f();
            this.listen$ = new Quaternion();
            this.lying$ = new Vector3f();
        }
        this.named$._shoot(this.scotland$);
        this.named$._bought();
        this.listen$._folks(this.inbox$);
        this.listen$._equally();
        this.lying$._shoot(Vector3f.airline$);
    }

    public void _getting(Matrix4f outTransform, boolean wtf) {
        Quaternion tmp1 = new Quaternion(0.0f, 0.0f, 0.0f, 0.0f);
        Vector3f tmp2 = new Vector3f(0.0f, 0.0f, 0.0f);
        Vector3f tmp3 = new Vector3f(0.0f, 0.0f, 0.0f);
        Vector3f scale = this.started$._avenue(this.lying$, tmp3);
        Quaternion rotate = this.inbox$._fighter(this.listen$, tmp1);
        Vector3f translate = this.scotland$._english(rotate._mistakes(scale._avenue(this.named$, tmp2), tmp2), tmp2);
        outTransform._bikes();
        outTransform._counties(translate, scale, rotate._agenda(new Matrix3f()));
    }

    public final void _tommy(ArrayList js, ArrayList doneParent) {
        Joint parent = this._orders(js);
        if (parent != null) {
            if (doneParent.indexOf(parent._thunder(js)) != -1) {
                parent.inbox$._fighter(this.images$, this.inbox$);
                parent.started$._avenue(this.source$, this.started$);
                parent.inbox$._mistakes(this.prefers$, this.scotland$);
                this.scotland$._cookies(parent.source$);
                this.scotland$._kinda(parent.scotland$);
                doneParent.add(this._thunder(js));
                if (parent.relation$.indexOf(this._thunder(js)) == -1) {
                    parent.relation$.add(this._thunder(js));
                }
            } else {
                parent._tommy(js, doneParent);
                doneParent.add(parent._thunder(js));
                parent.inbox$._fighter(this.images$, this.inbox$);
                parent.started$._avenue(this.source$, this.started$);
                parent.inbox$._mistakes(this.prefers$, this.scotland$);
                this.scotland$._cookies(parent.source$);
                this.scotland$._kinda(parent.scotland$);
            }
        } else {
            this.inbox$._folks(this.images$);
            this.scotland$._shoot(this.prefers$);
            this.started$._shoot(this.source$);
            doneParent.add(this._thunder(js));
        }
        if (this.named$ == null) {
            this._ceremony();
        }
    }

    public int _thunder(ArrayList js) {
        int id = 0;
        for (int i = 0; i < js.size(); ++i) {
            if (!((Joint)js.get((int)i)).films$.equals(this.films$)) continue;
            id = i;
            break;
        }
        return id;
    }

    public Joint _orders(ArrayList js) {
        Joint parent = null;
        for (int i = 0; i < js.size(); ++i) {
            if (!((Joint)js.get((int)i)).films$.equals(this.quiet$)) continue;
            parent = (Joint)js.get(i);
            break;
        }
        return parent;
    }
}

