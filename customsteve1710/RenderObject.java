/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.item.Item
 */
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import net.minecraft.item.Item;

public abstract class RenderObject {
    private int recent$ = 33;
    private int assign$ = 33;
    private int playback$ = 0;
    private int leads$ = 0;
    public PmdFileInfo agents$;
    public ArrayList plane$ = new ArrayList();
    private Timer criminal$ = null;
    private Timer adipex$ = null;
    private RenderObject5 vocal$ = null;
    private int transit$ = 0;
    public int comment$ = 0;
    public int mumbai$ = 0;
    public int cheese$ = 0;
    public ReadWriteLock gasoline$ = new ReentrantReadWriteLock();
    public long objects$ = 0L;
    private int occur$ = 0;
    public RenderObject2 proceeds$ = new RenderObject2(this);
    ArrayList server$ = null;
    ArrayList timing$ = null;
    public CSplayer chicago$;
    public int survey$ = -1;

    public boolean _licking(Item item) {
        for (int i = 0; i < this.plane$.size(); ++i) {
            if (((WeaponFileInfo)this.plane$.get((int)i)).clinics$ != item) continue;
            return true;
        }
        return false;
    }

    public boolean _gather(WeaponFileInfo model) {
        if (this.plane$.indexOf(model) != -1) {
            return false;
        }
        for (int i = 0; i < model.c.size(); ++i) {
            this.agents$.february$.add(model.c.get(i));
        }
        this.plane$.add(model);
        return false;
    }

    public boolean _titans(WeaponFileInfo model) {
        int index = this.plane$.indexOf(model);
        if (index > -1) {
            for (int i = 0; i < model.c.size(); ++i) {
                this.agents$.february$.remove(model.c.get(i));
            }
            this.plane$.remove(index);
        }
        return false;
    }

    public void _blonde(int i) {
        RenderObject2 renderObject2 = this.proceeds$;
        RenderObject2._bruce(renderObject2, RenderObject2._grave(renderObject2) + i);
    }

    public void _photos(int i) {
        RenderObject2 renderObject2 = this.proceeds$;
        RenderObject2._wichita(renderObject2, RenderObject2._farms(renderObject2) + i);
    }

    public void _mills(int i) {
        RenderObject2._bruce(this.proceeds$, i);
        this.leads$ = i;
    }

    public void _legends(int i) {
        RenderObject2._wichita(this.proceeds$, i);
        this.playback$ = i;
    }

    public int _contains() {
        return RenderObject2._grave(this.proceeds$);
    }

    public int _gamecube() {
        return RenderObject2._farms(this.proceeds$);
    }

    public void _amended() {
        this._golden(false, 0L);
        this._golden(false, 0L);
        for (int i = 0; i < ((Geometry)this.chicago$.a.belongs$.get((int)0)).signup$.size(); ++i) {
            TriangleFace f2 = (TriangleFace)((Geometry)this.chicago$.a.belongs$.get((int)0)).signup$.get(i);
            f2._concerns(((Geometry)this.agents$.belongs$.get((int)0)).domestic$);
        }
    }

    public void _golden(boolean sync, long faceP) {
        block10: {
            VmdHelper vh;
            block9: {
                boolean point = false;
                vh = new VmdHelper(this.agents$.pointer$, this.agents$.highs$);
                if (!Config.prairie$ || Config.prague$ <= 1) break block9;
                int avg = 0;
                int rem = 0;
                int last = 0;
                int timeOut = 1000;
                avg = ((Geometry)this.agents$.belongs$.get((int)0)).domestic$.length / Config.prague$;
                rem = ((Geometry)this.agents$.belongs$.get((int)0)).domestic$.length % Config.prague$;
                if (avg <= 0) break block10;
                if (this.timing$ == null && this.server$ == null) {
                    this.server$ = new ArrayList();
                    this.timing$ = new ArrayList();
                }
                for (int i = 0; i < Config.prague$; ++i) {
                    int end = last + avg;
                    if (i + 1 == Config.prague$) {
                        end = last + rem + avg;
                    }
                    if (this.server$.size() < Config.prague$) {
                        RenderObject3 ct = new RenderObject3(this, ((Geometry)this.agents$.belongs$.get((int)0)).issues$, ((Geometry)this.agents$.belongs$.get((int)0)).domestic$, last, end, faceP);
                        Thread t = new Thread(ct);
                        t.setName("CSmod CT-Thread-" + i);
                        t.start();
                        this.server$.add(ct);
                        this.timing$.add(t);
                    } else {
                        ((RenderObject3)this.server$.get(i))._adapters(((Geometry)this.agents$.belongs$.get((int)0)).issues$, ((Geometry)this.agents$.belongs$.get((int)0)).domestic$, last, end, faceP);
                    }
                    if (i + 1 == Config.prague$) {
                        last += avg + rem;
                        continue;
                    }
                    last += avg;
                }
                boolean wait = true;
                while (wait) {
                    wait = false;
                    for (int i = 0; i < this.server$.size(); ++i) {
                        if (((RenderObject3)this.server$.get(i))._uploaded()) continue;
                        wait = true;
                    }
                }
                break block10;
            }
            for (int i = 0; i < ((Geometry)this.agents$.belongs$.get((int)0)).domestic$.length; ++i) {
                Vertex v = ((Geometry)this.agents$.belongs$.get((int)0)).domestic$[i];
                vh._relates(((Geometry)this.agents$.belongs$.get((int)0)).issues$[i], v, i, faceP);
            }
        }
    }

    public int _physics() {
        return this.transit$;
    }

    public void _canvas(RenderObject ro) {
        if (this.criminal$ == null) {
            this.criminal$ = new Timer();
            this.criminal$.schedule((TimerTask)new RenderObject6(this, this), 0L, Config.filter$ == 0 ? 33L : 17L);
            RenderObject7 obj = new RenderObject7(this, ro);
            Thread t = new Thread(obj);
            t.start();
            if (this.adipex$ == null) {
                this.adipex$ = new Timer();
            }
            this.vocal$ = new RenderObject5(this, obj, t);
            this.adipex$.schedule((TimerTask)this.vocal$, 0L, 1000L);
        }
    }

    public void _induced() {
        if (this.criminal$ == null) {
            return;
        }
        this.criminal$.cancel();
        this.criminal$.purge();
        if (this.adipex$ == null) {
            return;
        }
        this.vocal$._operate();
        this.adipex$.cancel();
        this.adipex$.purge();
    }

    public void _anthony(int i) {
    }

    public PmdFileInfo _charms() {
        return this.agents$;
    }

    public void _proudly() {
        this.comment$ = this.proceeds$.concern$;
        this.mumbai$ = 0;
    }

    static /* synthetic */ int _solving(RenderObject x0) {
        return x0.leads$++;
    }

    static /* synthetic */ int _fallen(RenderObject x0) {
        return x0.playback$++;
    }

    static /* synthetic */ int _largely(RenderObject x0) {
        return x0.occur$++;
    }

    static /* synthetic */ int _solid(RenderObject x0) {
        return x0.occur$;
    }

    static /* synthetic */ int _enlarge(RenderObject x0, int x1) {
        x0.occur$ = x1;
        return x0.occur$;
    }
}

