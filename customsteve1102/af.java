/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.text.TextComponentTranslation
 */
package customsteve;

import customsteve.U;
import customsteve.V;
import customsteve.a_0;
import customsteve.aa_0;
import customsteve.ae;
import customsteve.ap_0;
import customsteve.at_0;
import customsteve.av_0;
import customsteve.b_0;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import net.minecraft.util.text.TextComponentTranslation;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class af {
    private ae a;
    private U a;
    private aa_0[] a;
    private ArrayList<aa_0> a;
    private ArrayList<av_0> b;
    private av_0[] a;
    private ArrayList<at_0> c = null;
    private long a;

    public ae a(File f2) throws Exception {
        int i2;
        this.a = new ae();
        this.a = null;
        this.a = null;
        if (f2 == null || !f2.exists()) {
            a_0.instance.a("Can't load animation: /CustomSteve/animations/" + f2.getParentFile().getName() + "/" + f2.getName());
            throw new V(f2.getAbsolutePath() + "   file not exists!");
        }
        if (f2.getName().indexOf(".vmd") == -1) {
            throw new V("not MMD format");
        }
        this.a = new U(new FileInputStream(f2.getAbsolutePath()));
        af.e();
        af.a(new TextComponentTranslation("Vmd.Load.Begin", new Object[0]).func_150254_d());
        af.a("File name:" + f2.getName());
        af.e();
        af.a(new TextComponentTranslation("Vmd.Load.Header", new Object[0]).func_150254_d());
        af.e();
        this.a(this.a);
        af.e();
        af.a(new TextComponentTranslation("Vmd.Load.KeyFrame", new Object[0]).func_150254_d());
        af.e();
        this.b();
        af.e();
        af.a(new TextComponentTranslation("Vmd.Load.FaceKeyFrame", new Object[0]).func_150254_d());
        af.e();
        this.c();
        af.e();
        af.a(new TextComponentTranslation("Vmd.Load.CameraKeyFrame", new Object[0]).func_150254_d());
        af.e();
        this.d();
        af.e();
        this.a = new ArrayList();
        for (i2 = 0; i2 < this.a.length; ++i2) {
            ((ArrayList)((Object)this.a)).add(this.a[i2]);
        }
        for (i2 = 0; i2 < this.a.length; ++i2) {
            this.b.add(this.a[i2]);
        }
        this.a();
        for (i2 = 0; i2 < ((ArrayList)((Object)this.a)).size(); ++i2) {
            this.a[i2] = (aa_0)((ArrayList)((Object)this.a)).get(i2);
        }
        for (i2 = 0; i2 < this.b.size(); ++i2) {
            this.a[i2] = this.b.get(i2);
        }
        this.a.a = this.a;
        this.a.a = this.a;
        this.a.b = f2.getName();
        this.a.a = this.a;
        this.a.b = this.c;
        this.a.a();
        return this.a;
    }

    public void a() {
        ae list = this.a;
        Collections.sort(list, new Comparator<aa_0>(this){
            final /* synthetic */ af a;
            {
                this.a = this$0;
            }

            public int a(aa_0 arg0, aa_0 arg1) {
                return arg0.a.compareTo(arg1.a);
            }

            public /* synthetic */ int compare(Object object, Object object2) {
                return this.a((aa_0)object, (aa_0)object2);
            }
        });
        this.a = new ArrayList(list);
        ArrayList<av_0> flist = this.b;
        Collections.sort(flist, new Comparator<av_0>(this){
            final /* synthetic */ af a;
            {
                this.a = this$0;
            }

            public int a(av_0 arg0, av_0 arg1) {
                return arg0.a.compareTo(arg1.a);
            }

            public /* synthetic */ int compare(Object object, Object object2) {
                return this.a((av_0)object, (av_0)object2);
            }
        });
        this.b = new ArrayList<av_0>(flist);
    }

    public void a(ae vmdFileInfo) throws Exception {
        String modelName = null;
        String version = new String(af.a(this.a.a(0, 30)));
        if (version.equals("Vocaloid Motion Data 0002")) {
            modelName = new String(af.a(this.a.a(0, 20)));
        } else if (version.equals("Vocaloid Motion Data file")) {
            modelName = new String(af.a(this.a.a(0, 10)));
        } else {
            throw new IOException("Invalid VMD file - Wrong file head:" + version);
        }
        af.a("File version: " + version);
        af.a("Model name: " + modelName);
        vmdFileInfo.a = modelName;
        vmdFileInfo.c = version;
    }

    public void b() throws Exception {
        long Knum = this.a.a();
        byte[][] linear = new byte[(int)Knum][64];
        this.a = new aa_0[(int)Knum];
        int i2 = 0;
        while ((long)i2 < Knum) {
            String boneName = new String(af.a(this.a.a(0, 15)));
            long frameNum = this.a.a();
            float x = this.a.a();
            float y = this.a.a();
            float z = this.a.a();
            float qx = this.a.a();
            float qy = this.a.a();
            float qz = this.a.a();
            float qw = this.a.a();
            for (int j2 = 0; j2 < 64; ++j2) {
                linear[i2][j2] = this.a.a();
            }
            if (b_0.j == 2) {
                frameNum *= 2L;
            }
            if (this.a < frameNum) {
                this.a = (int)frameNum;
            }
            this.a[i2] = new aa_0(boneName, frameNum, x, y, z, qx, qy, qz, qw, linear[i2]);
            ++i2;
        }
        af.a(Knum + " KeyFrames read.");
    }

    public void c() throws Exception {
        long Fnum = this.a.a();
        this.a = new av_0[(int)Fnum];
        this.b = new ArrayList();
        int i2 = 0;
        while ((long)i2 < Fnum) {
            String name = new String(af.a(this.a.a(0, 15)));
            long frameNum = this.a.a();
            if (b_0.j == 2) {
                frameNum *= 2L;
            }
            if (this.a < frameNum) {
                this.a = (int)frameNum;
            }
            float scale = this.a.a();
            this.a[i2] = new av_0(name, frameNum, scale);
            if (name.equals("\u3042")) {
                // empty if block
            }
            ++i2;
        }
        af.a(Fnum + " FaceKeyFrames read.");
    }

    public void d() throws Exception {
        long Fnum = this.a.a();
        if (Fnum > 0L) {
            this.c = new ArrayList();
            int i2 = 0;
            while ((long)i2 < Fnum) {
                at_0 ckf = new at_0();
                ckf.a = this.a.a();
                ckf.a = this.a.a();
                ckf.a = new ap_0(this.a.a(), this.a.a(), this.a.a());
                ckf.b = new ap_0();
                float x = 0.0f;
                float y = 0.0f;
                float z = 0.0f;
                x = this.a.a();
                y = this.a.a();
                z = this.a.a();
                ckf.b.a(-x, -y, z);
                ckf.a = this.a.a(0, 24);
                ckf.b = this.a.a();
                ckf.a = this.a.a();
                if (b_0.j == 2) {
                    ckf.a *= 2L;
                }
                this.c.add(ckf);
                if (ckf.a > this.a) {
                    this.a = ckf.a;
                }
                ++i2;
            }
            Collections.sort(this.c, new Comparator<at_0>(this){
                final /* synthetic */ af a;
                {
                    this.a = this$0;
                }

                public int a(at_0 m0, at_0 m1) {
                    return (int)m0.a - (int)m1.a;
                }

                public /* synthetic */ int compare(Object object, Object object2) {
                    return this.a((at_0)object, (at_0)object2);
                }
            });
            af.a(Fnum + " CameraKeyFrames read.");
        } else {
            this.c = null;
        }
    }

    public static void e() {
        b_0.b();
    }

    public static void a(Object s) {
        b_0.b(s);
    }

    private static String a(byte[] s) throws UnsupportedEncodingException {
        int l2 = 0;
        for (int i2 = 0; i2 < s.length; ++i2) {
            if (s[i2] == 0) {
                l2 = i2;
                break;
            }
            if (i2 + 1 != s.length || s[i2] == 0) continue;
            l2 = s.length;
            break;
        }
        byte[] bytes = new byte[l2];
        for (int i3 = 0; i3 < l2; ++i3) {
            bytes[i3] = s[i3];
        }
        String sa = new String(bytes, "shift-jis");
        return new String(sa.getBytes("utf-8"), "utf-8");
    }
}

