/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class CSfileInfo {
    public ArrayList inform$ = new ArrayList();
    public ArrayList retailer$ = new ArrayList();
    public ArrayList agrees$ = new ArrayList();
    public ArrayList ontario$ = new ArrayList();
    public ArrayList allan$ = new ArrayList();
    public ArrayList recorder$;
    public ArrayList number$;
    public CS_Bullet thrown$;
    public KeyFrame2[] angela$;
    public FaceKeyFrame[] credit$;

    public IK _against(Bone b2) {
        for (int i = 0; i < this.ontario$.size(); ++i) {
            for (int j = 0; j < ((IK)this.ontario$.get((int)i)).locked$.size(); ++j) {
                if (!((Bone)((IK)this.ontario$.get((int)i)).locked$.get((int)j)).heavy$.equals(b2.heavy$)) continue;
                return (IK)this.ontario$.get(i);
            }
        }
        return null;
    }

    public boolean _august(Bone b2) {
        for (int i = 0; i < this.ontario$.size(); ++i) {
            for (int j = 0; j < ((IK)this.ontario$.get((int)i)).locked$.size(); ++j) {
                if (!((IK)this.ontario$.get((int)i)).salary$.heavy$.equals(b2.heavy$)) continue;
                return true;
            }
        }
        return false;
    }

    public boolean _dining(Bone b2) {
        for (int i = 0; i < this.ontario$.size(); ++i) {
            for (int j = 0; j < ((IK)this.ontario$.get((int)i)).locked$.size(); ++j) {
                if (!((Bone)((IK)this.ontario$.get((int)i)).locked$.get((int)j)).heavy$.equals(b2.heavy$) && !((IK)this.ontario$.get((int)i)).firmware$.heavy$.equals(b2.heavy$)) continue;
                return true;
            }
        }
        return false;
    }
}

