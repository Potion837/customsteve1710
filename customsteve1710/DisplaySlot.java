/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class DisplaySlot {
    String edgar$;
    String later$;
    byte framing$;
    public ArrayList hourly$ = new ArrayList();

    public DisplaySlot(String name, String nameE, byte special) {
        this.edgar$ = name;
        this.later$ = nameE;
        this.framing$ = special;
    }
}

