/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.TimerTask;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class CSplayer3
extends TimerTask {
    private CSplayer minister$;
    private Vector3f chambers$;
    private String cultures$ = null;
    final /* synthetic */ CSplayer stanford$;

    public CSplayer3(CSplayer cSplayer, CSplayer csp, Vector3f loc, String PMDfilePath) {
        this.stanford$ = cSplayer;
        this.minister$ = csp;
        this.chambers$ = loc;
        this.cultures$ = PMDfilePath;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void run() {
        try {
            if (this.minister$.loans$ != null && !this.minister$.loans$.isEmpty()) {
                int i;
                this.stanford$.a = new PmdFileInfo();
                this.minister$.n = CSplayer.a(this.stanford$, ModContainer.outreach$ + "/" + "CustomSteve/models/" + this.cultures$, this.stanford$.a);
                if (this.minister$.n != -1) {
                    if (this.minister$.n == 404) {
                        throw new FormatException(ModContainer.outreach$ + "/" + "CustomSteve/models/" + this.cultures$ + " file not exists!");
                    }
                    return;
                }
                ArrayList doneFather = new ArrayList();
                VmdHelper vh = new VmdHelper(this.stanford$.a.pointer$, this.stanford$.a.highs$);
                for (int i2 = 0; i2 < this.stanford$.a.pointer$.size(); ++i2) {
                    ((Bone)this.stanford$.a.pointer$.get(i2))._script(this.stanford$.a, doneFather);
                }
                ArrayList<Vector3f> vecs = new ArrayList<Vector3f>();
                for (i = 0; i < this.stanford$.a.pointer$.size(); ++i) {
                    if (((Bone)this.stanford$.a.pointer$.get((int)i)).aimed$ == 4) {
                        vecs.add(((Bone)this.stanford$.a.pointer$.get(i))._counting(this.stanford$.a.pointer$));
                        continue;
                    }
                    vecs.add(((Bone)this.stanford$.a.pointer$.get(i))._counting(this.stanford$.a.pointer$));
                }
                for (i = 0; i < this.stanford$.a.pointer$.size(); ++i) {
                    if (vecs.get(i) == null) continue;
                    ((Bone)this.stanford$.a.pointer$.get((int)i)).clicks$._shoot((Vector3f)vecs.get(i));
                    ((Bone)this.stanford$.a.pointer$.get((int)i)).using$ = null;
                }
                doneFather = new ArrayList();
                for (i = 0; i < this.stanford$.a.pointer$.size(); ++i) {
                    ((Bone)this.stanford$.a.pointer$.get(i))._script(this.stanford$.a, doneFather);
                }
                doneFather = new ArrayList();
                for (i = 0; i < this.stanford$.a.pointer$.size(); ++i) {
                    ((Bone)this.stanford$.a.pointer$.get(i))._script(this.stanford$.a, doneFather);
                }
                ArrayList res = new ArrayList();
                ((Geometry)this.stanford$.a.belongs$.get(0))._large();
                ArrayList ms = ((Geometry)this.stanford$.a.belongs$.get((int)0)).found$;
                for (int i3 = 0; i3 < ms.size(); ++i3) {
                    Material m = (Material)ms.get(i3);
                    m._salem("/CustomSteve/textures/" + this.minister$.a());
                }
                this.minister$.owners$._shoot(this.chambers$);
                this.minister$.h();
                if (!Config.point$) {
                    // empty if block
                }
            }
        }
        catch (Exception e2) {
            e2.printStackTrace();
        }
        this.minister$.father$[0] = new ReentrantReadWriteLock();
        this.minister$.father$[1] = new ReentrantReadWriteLock();
        this.minister$.father$[2] = new ReentrantReadWriteLock();
        this.minister$.a.bringing$ = false;
        CSmanager.cellular$.keith$._lenses();
        this.cancel();
    }
}

