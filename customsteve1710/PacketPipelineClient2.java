/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

class PacketPipelineClient2
implements Comparator {
    final /* synthetic */ PacketPipelineClient resorts$;

    PacketPipelineClient2(PacketPipelineClient this$0) {
        this.resorts$ = this$0;
    }

    public int _appeared(Class clazz0, Class clazz1) {
        int index = String.CASE_INSENSITIVE_ORDER.compare(clazz0.getCanonicalName(), clazz1.getCanonicalName());
        if (index == 0) {
            index = clazz0.getCanonicalName().compareTo(clazz1.getCanonicalName());
        }
        return index;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this._appeared((Class)object, (Class)object2);
    }
}

