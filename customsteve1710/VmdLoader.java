/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

class VmdLoader
implements Comparator {
    final /* synthetic */ VmdLoader4 explorer$;

    VmdLoader(VmdLoader4 this$0) {
        this.explorer$ = this$0;
    }

    public int _modern(KeyFrame2 arg0, KeyFrame2 arg1) {
        return arg0.donated$.compareTo(arg1.donated$);
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this._modern((KeyFrame2)object, (KeyFrame2)object2);
    }
}

