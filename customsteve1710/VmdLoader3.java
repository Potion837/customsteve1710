/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

class VmdLoader3
implements Comparator {
    final /* synthetic */ VmdLoader4 discover$;

    VmdLoader3(VmdLoader4 this$0) {
        this.discover$ = this$0;
    }

    public int _talked(FaceKeyFrame arg0, FaceKeyFrame arg1) {
        return arg0.claims$.compareTo(arg1.claims$);
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this._talked((FaceKeyFrame)object, (FaceKeyFrame)object2);
    }
}

