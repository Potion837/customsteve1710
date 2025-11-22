/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.item.Item
 */
package customsteve;

import customsteve.aH;
import customsteve.ac;
import customsteve.ag_0;
import customsteve.ai_0;
import customsteve.ar;
import customsteve.ax;
import customsteve.b_0;
import customsteve.bc;
import customsteve.j;
import customsteve.k;
import java.util.ArrayList;
import java.util.Timer;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import net.minecraft.item.Item;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class bc {
    private int a;
    private int b;
    private int[] a;
    public ac a;
    public ArrayList<ag_0> a;
    private Timer a;
    private Timer b;
    private int c;
    public long a;
    public a a;
    ArrayList<b> b = null;
    ArrayList<Thread> c = 0;
    public k a;
    public int l = -1;
    public int m = 0;
    public int n = 0;
    public ReadWriteLock a = new a(this);

    public bc() {
        this.b = (int)null;
        this.c = (int)null;
        this.a = new ReentrantReadWriteLock();
    }

    public boolean a(Item item) {
        for (int i2 = 0; i2 < this.a.size(); ++i2) {
            if (((ag_0)this.a.get((int)i2)).a != item) continue;
            return true;
        }
        return false;
    }

    public boolean a(ag_0 model) {
        if (this.a.indexOf(model) != -1) {
            return false;
        }
        for (int i2 = 0; i2 < ((ArrayList)((Object)model.c)).size(); ++i2) {
            this.a.d.add((ar)((ArrayList)((Object)model.c)).get(i2));
        }
        this.a.add(model);
        return false;
    }

    public boolean b(ag_0 model) {
        int index = this.a.indexOf(model);
        if (index > -1) {
            for (int i2 = 0; i2 < ((ArrayList)((Object)model.c)).size(); ++i2) {
                this.a.d.remove(((ArrayList)((Object)model.c)).get(i2));
            }
            this.a.remove(index);
        }
        return false;
    }

    public void a(int i2, int layer) {
        ((a)this.a).a[layer] = i2;
        this.a[layer] = i2;
    }

    public int a(int layer) {
        return this.a.a[layer];
    }

    public int b() {
        return this.a(0);
    }

    public void h() {
        this.a(false, 0L);
        this.a(false, 0L);
        for (int i2 = 0; i2 < ((ArrayList)((Object)((ax)((ArrayList)((Object)((ac)((Object)this.a.a)).a)).get((int)0)).a)).size(); ++i2) {
            aH f2 = (aH)((ArrayList)((Object)((ax)((ArrayList)((Object)((ac)((Object)this.a.a)).a)).get((int)0)).a)).get(i2);
            f2.a(((ax)((ArrayList)((Object)this.a.a)).get((int)0)).c);
        }
    }

    public void a(boolean sync, long faceP) {
        block10: {
            j vh;
            block9: {
                boolean point = false;
                vh = new j(this.a.c, this.a.h);
                if (!b_0.n || b_0.c <= 1) break block9;
                int avg = 0;
                int rem = 0;
                int last = 0;
                int timeOut = 1000;
                avg = ((ax)((ArrayList)((Object)this.a.a)).get((int)0)).c.length / b_0.c;
                rem = ((ax)((ArrayList)((Object)this.a.a)).get((int)0)).c.length % b_0.c;
                if (avg <= 0) break block10;
                if (this.c == null && this.b == null) {
                    this.b = (int)new ArrayList();
                    this.c = (int)new ArrayList();
                }
                for (int i2 = 0; i2 < b_0.c; ++i2) {
                    int end = last + avg;
                    if (i2 + 1 == b_0.c) {
                        end = last + rem + avg;
                    }
                    if (this.b.size() < b_0.c) {
                        b ct = new b(this, ((ax)((ArrayList)((Object)this.a.a)).get((int)0)).a, ((ax)((ArrayList)((Object)this.a.a)).get((int)0)).c, last, end, faceP);
                        Thread t = new Thread(ct);
                        t.setName("CSmod CT-Thread-" + i2);
                        t.start();
                        this.b.add(ct);
                        this.c.add(t);
                    } else {
                        ((b)this.b.get(i2)).a(((ax)((ArrayList)((Object)this.a.a)).get((int)0)).a, ((ax)((ArrayList)((Object)this.a.a)).get((int)0)).c, last, end, faceP);
                    }
                    if (i2 + 1 == b_0.c) {
                        last += avg + rem;
                        continue;
                    }
                    last += avg;
                }
                boolean wait = true;
                while (wait) {
                    wait = false;
                    for (int i3 = 0; i3 < this.b.size(); ++i3) {
                        if (((b)this.b.get(i3)).a()) continue;
                        wait = true;
                    }
                }
                break block10;
            }
            for (int i4 = 0; i4 < ((ax)((ArrayList)((Object)this.a.a)).get((int)0)).c.length; ++i4) {
                ai_0 v = ((ax)((ArrayList)((Object)this.a.a)).get((int)0)).c[i4];
                vh.a(((ax)((ArrayList)((Object)this.a.a)).get((int)0)).a[i4], v, i4, faceP);
            }
        }
    }

    public int c() {
        return this.c;
    }

    public void i() {
        this.n = 0;
        this.m = 0;
    }

    public ac a() {
        return this.a;
    }

    static /* synthetic */ int[] a(bc x0) {
        return x0.a;
    }
}

