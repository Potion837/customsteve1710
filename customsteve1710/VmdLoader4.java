/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.StatCollector
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import net.minecraft.util.StatCollector;

public class VmdLoader4 {
    private VmdFileInfo kruger$;
    private ByteInputhelper victim$;
    private KeyFrame2[] referral$;
    private ArrayList logging$;
    private ArrayList finder$;
    private FaceKeyFrame[] directed$;
    private ArrayList modular$ = null;
    private long keeps$;

    public VmdFileInfo _senior(File f2) throws Exception {
        int i;
        this.kruger$ = new VmdFileInfo();
        this.referral$ = null;
        this.directed$ = null;
        if (f2 == null || !f2.exists()) {
            CSmanager.cellular$._errors("Can't load animation: /CustomSteve/animations/" + f2.getParentFile().getName() + "/" + f2.getName());
            throw new FormatException(f2.getAbsolutePath() + "   file not exists!");
        }
        if (f2.getName().indexOf(".vmd") == -1) {
            throw new FormatException("not MMD format");
        }
        this.victim$ = new ByteInputhelper(new FileInputStream(f2.getAbsolutePath()));
        VmdLoader4._tuner();
        VmdLoader4._yours(StatCollector.func_74838_a((String)"Vmd.Load.Begin"));
        VmdLoader4._yours("File name:" + f2.getName());
        VmdLoader4._tuner();
        VmdLoader4._yours(StatCollector.func_74838_a((String)"Vmd.Load.Header"));
        VmdLoader4._tuner();
        this._clocks(this.kruger$);
        VmdLoader4._tuner();
        VmdLoader4._yours(StatCollector.func_74838_a((String)"Vmd.Load.KeyFrame"));
        VmdLoader4._tuner();
        this._meaning();
        VmdLoader4._tuner();
        VmdLoader4._yours(StatCollector.func_74838_a((String)"Vmd.Load.FaceKeyFrame"));
        VmdLoader4._tuner();
        this._taxes();
        VmdLoader4._tuner();
        VmdLoader4._yours(StatCollector.func_74838_a((String)"Vmd.Load.CameraKeyFrame"));
        VmdLoader4._tuner();
        this._barrel();
        VmdLoader4._tuner();
        this.logging$ = new ArrayList();
        for (i = 0; i < this.referral$.length; ++i) {
            this.logging$.add(this.referral$[i]);
        }
        for (i = 0; i < this.directed$.length; ++i) {
            this.finder$.add(this.directed$[i]);
        }
        this._third();
        for (i = 0; i < this.logging$.size(); ++i) {
            this.referral$[i] = (KeyFrame2)this.logging$.get(i);
        }
        for (i = 0; i < this.finder$.size(); ++i) {
            this.directed$[i] = (FaceKeyFrame)this.finder$.get(i);
        }
        this.kruger$.intimate$ = this.referral$;
        this.kruger$.symphony$ = this.directed$;
        this.kruger$.facing$ = f2.getName();
        this.kruger$.bible$ = this.keeps$;
        this.kruger$.prints$ = this.modular$;
        this.victim$._atomic();
        return this.kruger$;
    }

    public void _third() {
        ArrayList list = this.logging$;
        Collections.sort(list, new VmdLoader(this));
        this.logging$ = new ArrayList(list);
        ArrayList flist = this.finder$;
        Collections.sort(flist, new VmdLoader3(this));
        this.finder$ = new ArrayList(flist);
    }

    public void _clocks(VmdFileInfo vmdFileInfo) throws Exception {
        String modelName = null;
        String version = new String(VmdLoader4._goods(this.victim$._salvador(0, 30)));
        if (version.equals("Vocaloid Motion Data 0002")) {
            modelName = new String(VmdLoader4._goods(this.victim$._salvador(0, 20)));
        } else if (version.equals("Vocaloid Motion Data file")) {
            modelName = new String(VmdLoader4._goods(this.victim$._salvador(0, 10)));
        } else {
            throw new IOException("Invalid VMD file - Wrong file head:" + version);
        }
        VmdLoader4._yours("File version: " + version);
        VmdLoader4._yours("Model name: " + modelName);
        vmdFileInfo.genres$ = modelName;
        vmdFileInfo.vacation$ = version;
    }

    public void _meaning() throws Exception {
        long Knum = this.victim$._murphy();
        byte[][] linear = new byte[(int)Knum][64];
        this.referral$ = new KeyFrame2[(int)Knum];
        int i = 0;
        while ((long)i < Knum) {
            String boneName = new String(VmdLoader4._goods(this.victim$._salvador(0, 15)));
            long frameNum = this.victim$._murphy();
            float x = this.victim$._topics();
            float y = this.victim$._topics();
            float z = this.victim$._topics();
            float qx = this.victim$._topics();
            float qy = this.victim$._topics();
            float qz = this.victim$._topics();
            float qw = this.victim$._topics();
            for (int j = 0; j < 64; ++j) {
                linear[i][j] = this.victim$._beijing();
            }
            if (Config.filter$ == 2) {
                frameNum *= 2L;
            }
            if (this.keeps$ < frameNum) {
                this.keeps$ = (int)frameNum;
            }
            this.referral$[i] = new KeyFrame2(boneName, frameNum, x, y, z, qx, qy, qz, qw, linear[i]);
            ++i;
        }
        VmdLoader4._yours(Knum + " KeyFrames read.");
    }

    public void _taxes() throws Exception {
        long Fnum = this.victim$._murphy();
        this.directed$ = new FaceKeyFrame[(int)Fnum];
        this.finder$ = new ArrayList();
        if (Fnum != 0L) {
            this.kruger$.heart$ = true;
        }
        int i = 0;
        while ((long)i < Fnum) {
            String name = new String(VmdLoader4._goods(this.victim$._salvador(0, 15)));
            long frameNum = this.victim$._murphy();
            if (Config.filter$ == 2) {
                frameNum *= 2L;
            }
            if (this.keeps$ < frameNum) {
                this.keeps$ = (int)frameNum;
            }
            float scale = this.victim$._topics();
            this.directed$[i] = new FaceKeyFrame(name, frameNum, scale);
            if (name.equals("\u3042")) {
                // empty if block
            }
            ++i;
        }
        VmdLoader4._yours(Fnum + " FaceKeyFrames read.");
    }

    public void _barrel() throws Exception {
        long Fnum = this.victim$._murphy();
        if (Fnum > 0L) {
            this.modular$ = new ArrayList();
            int i = 0;
            while ((long)i < Fnum) {
                CameraKeyFrame ckf = new CameraKeyFrame();
                ckf.impose$ = this.victim$._murphy();
                ckf.england$ = this.victim$._topics();
                ckf.stage$ = new Vector3f(this.victim$._topics(), this.victim$._topics(), this.victim$._topics());
                ckf.fotos$ = new Vector3f();
                float x = 0.0f;
                float y = 0.0f;
                float z = 0.0f;
                x = this.victim$._topics();
                y = this.victim$._topics();
                z = this.victim$._topics();
                ckf.fotos$._alleged(-x, -y, z);
                ckf.codes$ = this.victim$._salvador(0, 24);
                ckf.outlook$ = this.victim$._murphy();
                ckf.heather$ = this.victim$._smoke();
                if (Config.filter$ == 2) {
                    ckf.impose$ *= 2L;
                }
                this.modular$.add(ckf);
                if (ckf.impose$ > this.keeps$) {
                    this.keeps$ = ckf.impose$;
                }
                ++i;
            }
            Collections.sort(this.modular$, new VmdLoader2(this));
            VmdLoader4._yours(Fnum + " CameraKeyFrames read.");
        } else {
            this.modular$ = null;
        }
    }

    public static void _tuner() {
        if (Config.struct$) {
            System.out.println("------------------------------");
        }
    }

    public static void _yours(Object s) {
        if (Config.struct$) {
            System.out.println((String)s);
        }
    }

    private static String _goods(byte[] s) throws UnsupportedEncodingException {
        int l = 0;
        for (int i = 0; i < s.length; ++i) {
            if (s[i] == 0) {
                l = i;
                break;
            }
            if (i + 1 != s.length || s[i] == 0) continue;
            l = s.length;
            break;
        }
        byte[] bytes = new byte[l];
        for (int i = 0; i < l; ++i) {
            bytes[i] = s[i];
        }
        String sa = new String(bytes, "shift-jis");
        return new String(sa.getBytes("utf-8"), "utf-8");
    }
}

