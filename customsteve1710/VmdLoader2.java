/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

class VmdLoader2
implements Comparator {
    final /* synthetic */ VmdLoader4 respond$;

    VmdLoader2(VmdLoader4 this$0) {
        this.respond$ = this$0;
    }

    public int _worth(CameraKeyFrame m0, CameraKeyFrame m1) {
        return (int)m0.impose$ - (int)m1.impose$;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this._worth((CameraKeyFrame)object, (CameraKeyFrame)object2);
    }
}

