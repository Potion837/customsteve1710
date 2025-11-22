/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.text.TextComponentTranslation
 */
package customsteve;

import customsteve.U;
import customsteve.aB;
import customsteve.aG;
import customsteve.aH;
import customsteve.aQ;
import customsteve.ac;
import customsteve.ac_0;
import customsteve.ai_0;
import customsteve.aj_0;
import customsteve.ak_0;
import customsteve.ap_0;
import customsteve.ar;
import customsteve.as_0;
import customsteve.au;
import customsteve.ax;
import customsteve.ay;
import customsteve.b_0;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import net.minecraft.util.text.TextComponentTranslation;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ad {
    private ac a;
    private U a;
    private ai_0[] a;
    private ArrayList<aH> a;
    private ArrayList<aB> b;
    private ArrayList<ar> c;
    private ArrayList<aQ> d;
    private ArrayList<String> e;
    private ArrayList<String> f;
    private ArrayList<ay> g;
    private ArrayList<au> h;
    private ar a;
    private ar b;
    private ar c;
    private ar d;
    private ar e;
    private ar f;
    private ar g;
    private ar h;
    private ar i;
    private ar j;
    private ar k;
    private ArrayList<ac_0> i;

    public int a(File f2, ac pfi) throws Exception {
        this.a = pfi;
        if (f2 == null || !f2.exists()) {
            return 404;
        }
        if (f2.getName().indexOf(".pmd") == -1) {
            return 401;
        }
        int errorCode = -1;
        this.a = new U(new FileInputStream(f2.getAbsolutePath()));
        this.r();
        this.a(new TextComponentTranslation("Pmd.Load.Begin", new Object[0]).func_150254_d());
        this.r();
        this.a(new TextComponentTranslation("Pmd.Load.Header", new Object[0]).func_150254_d());
        this.r();
        errorCode = this.a();
        if (errorCode != -1) {
            return errorCode;
        }
        this.r();
        this.a(new TextComponentTranslation("Pmd.Load.ModelHead", new Object[0]).func_150254_d());
        this.r();
        this.a();
        this.r();
        this.a(new TextComponentTranslation("Pmd.Load.Vertex", new Object[0]).func_150254_d());
        this.r();
        this.b();
        this.r();
        this.a(new TextComponentTranslation("Pmd.Load.Index", new Object[0]).func_150254_d());
        this.r();
        this.c();
        this.r();
        this.a(new TextComponentTranslation("Pmd.Load.Material", new Object[0]).func_150254_d());
        this.r();
        this.d();
        this.r();
        this.a(new TextComponentTranslation("Pmd.Load.Bone", new Object[0]).func_150254_d());
        this.r();
        this.e();
        this.r();
        this.a(new TextComponentTranslation("Pmd.Load.IK", new Object[0]).func_150254_d());
        this.r();
        this.f();
        this.r();
        this.a(new TextComponentTranslation("Pmd.Load.Face", new Object[0]).func_150254_d());
        this.r();
        this.g();
        this.r();
        this.a(new TextComponentTranslation("Pmd.Load.NamesFace", new Object[0]).func_150254_d());
        this.r();
        this.h();
        this.r();
        this.a(new TextComponentTranslation("Pmd.Load.NamesBoneGroup", new Object[0]).func_150254_d());
        this.r();
        this.i();
        this.r();
        this.a(new TextComponentTranslation("Pmd.Load.NamesBone", new Object[0]).func_150254_d());
        this.r();
        this.j();
        this.r();
        this.a(new TextComponentTranslation("Pmd.Load.EnglishHeader", new Object[0]).func_150254_d());
        boolean Emode = false;
        Emode = this.a.a();
        this.a(Emode ? new TextComponentTranslation("Pmd.Load.EnglishFound", new Object[0]).func_150254_d() : new TextComponentTranslation("Pmd.Load.EnglishNotFound", new Object[0]).func_150254_d());
        this.r();
        if (Emode) {
            this.k();
            this.r();
            this.a(new TextComponentTranslation("Pmd.Load.EnglishBone", new Object[0]).func_150254_d());
            this.r();
            this.l();
            this.r();
            this.a(new TextComponentTranslation("Pmd.Load.EnglishFace", new Object[0]).func_150254_d());
            this.r();
            this.m();
            this.r();
            this.a(new TextComponentTranslation("Pmd.Load.EnglishBoneGroup", new Object[0]).func_150254_d());
            this.r();
            this.n();
            this.r();
        }
        this.a(new TextComponentTranslation("Pmd.Load.Toon", new Object[0]).func_150254_d());
        this.r();
        this.o();
        this.r();
        this.a(new TextComponentTranslation("Pmd.Load.Rigid", new Object[0]).func_150254_d());
        this.r();
        this.p();
        this.r();
        this.a(new TextComponentTranslation("Pmd.Load.Physics", new Object[0]).func_150254_d());
        this.r();
        this.q();
        this.r();
        pfi.c = this.c;
        pfi.e = this.g;
        pfi.h = this.d;
        pfi.g = this.i;
        pfi.f = this.h;
        pfi.a = this.i;
        pfi.b = this.j;
        pfi.d = this.b;
        pfi.c = this.a;
        pfi.e = this.c;
        pfi.f = this.d;
        pfi.g = this.e;
        pfi.h = this.f;
        pfi.i = this.g;
        pfi.j = this.h;
        pfi.k = this.k;
        pfi.i = this.f;
        ((ArrayList)((Object)pfi.a)).add(new ax("none", null, this.a, (ArrayList<aH>)((Object)this.a), this.b));
        this.a.a();
        return -1;
    }

    public int a() throws Exception {
        String verName = this.a.a() + this.a.a() + this.a.a() + "";
        verName = "Pmd";
        float Ver = this.a.a();
        if ((double)Ver != 1.0) {
            return 402;
        }
        this.a(verName + " " + Ver);
        return -1;
    }

    public void a() throws Exception {
        String name = new String(this.a(this.a.a(0, 20)));
        String comment = new String(this.a(this.a.a(0, 256)));
        this.a.a = name;
        this.a.b = comment.replace('\r', ' ').replace('\u3000', ' ');
        this.a("Model name: " + name);
        this.a(comment);
    }

    public void b() throws Exception {
        long Vnum = this.a.a();
        this.a = new ai_0[(int)Vnum];
        int i2 = 0;
        while ((long)i2 < Vnum) {
            float x = this.a.a();
            float y = this.a.a();
            float z = this.a.a();
            float nx = this.a.a();
            float ny = this.a.a();
            float nz = this.a.a();
            float U2 = this.a.a();
            float V2 = this.a.a();
            int b0 = this.a.a();
            int b1 = this.a.a();
            float bw = this.a.a();
            boolean ef = this.a.a();
            as_0 vbw = null;
            int vbwtype = 0;
            if (b1 != 0) {
                vbwtype = 1;
                vbw = new ak_0(b0, b1, bw / 100.0f);
            } else {
                vbw = new aj_0(b0);
            }
            this.a[i2] = new ai_0(x, y, z, nx, ny, nz, U2, V2, vbwtype, vbw, ef);
            ++i2;
        }
        this.a(Vnum + " Vertices read.");
    }

    public void c() throws Exception {
        long Inum = this.a.a();
        int[] indexs = new int[(int)Inum];
        this.a = new ArrayList();
        int i2 = 0;
        while ((long)i2 < Inum) {
            indexs[i2] = this.a.a();
            ++i2;
        }
        this.a(Inum + " indexes read.");
        long Fnum = Inum / 3L;
        aH[] Faces = new aH[(int)Fnum];
        int i3 = 0;
        while ((long)i3 < Fnum) {
            int j2;
            Faces[i3] = new aH();
            Faces[i3].a = (int)new ArrayList();
            Faces[i3].b = new ArrayList();
            for (j2 = 0; j2 < 3; ++j2) {
                Faces[i3].a.add(indexs[i3 * 3 + j2]);
            }
            for (j2 = 0; j2 < 3; ++j2) {
            }
            for (j2 = 0; j2 < 3; ++j2) {
                Faces[i3].b.add(new aG(this.a[indexs[i3 * 3 + j2]].g, this.a[indexs[i3 * 3 + j2]].h));
            }
            ((ArrayList)((Object)this.a)).add(Faces[i3]);
            ++i3;
        }
        this.a(((ArrayList)((Object)this.a)).size() + " Triangle faces read.");
    }

    public void d() throws Exception {
        long Mnum = this.a.a();
        this.b = new ArrayList();
        int i2 = 0;
        while ((long)i2 < Mnum) {
            float dR = this.a.a();
            float dG = this.a.a();
            float dB = this.a.a();
            float dA = this.a.a();
            float S2 = this.a.a();
            float sR = this.a.a();
            float sG = this.a.a();
            float sB = this.a.a();
            float aR = this.a.a();
            float aG2 = this.a.a();
            float aB2 = this.a.a();
            byte toon = this.a.a();
            boolean ef = this.a.a();
            long indices = this.a.a();
            boolean defToon = false;
            String file = new String(this.a(this.a.a(0, 20)));
            this.b.add(new aB(dR, dG, dB, dA, S2, sR, sG, sB, aR, aG2, aB2, 2, defToon, toon, ef, indices, file));
            ++i2;
        }
        this.a(Mnum + " Materials read.");
    }

    public void e() throws IOException {
        int Bnum = this.a.a();
        this.c = new ArrayList();
        this.i = null;
        this.j = null;
        this.a = null;
        for (int i2 = 0; i2 < Bnum; ++i2) {
            int target = -1;
            String name = new String(this.a(this.a.a(0, 20)));
            short parent = this.a.a();
            short child = this.a.a();
            byte type = this.a.a();
            target = this.a.a();
            float x = this.a.a();
            float y = this.a.a();
            float z = this.a.a();
            this.c.add(new ar(name, parent, child, type, target, x, y, z, 0.0f));
            if (name.contains("\u3072\u3056")) {
                this.c.get((int)(this.c.size() - 1)).a = true;
                continue;
            }
            if (name.equals("\u982d") || name.equals("Head")) {
                this.a = this.c.get(this.c.size() - 1);
                continue;
            }
            if (name.equals("\u9996")) {
                this.b = this.c.get(this.c.size() - 1);
                continue;
            }
            if (name.equals("\u4e0a\u534a\u8eab") || name.equals("UpperBody")) {
                this.c = this.c.get(this.c.size() - 1);
                continue;
            }
            if (name.equals("\u4e0a\u534a\u8eab2") || name.equals("UpperBody2")) {
                this.d = this.c.get(this.c.size() - 1);
                continue;
            }
            if (name.equals("\u4e0b\u534a\u8eab") || name.equals("LowerBody")) {
                this.e = this.c.get(this.c.size() - 1);
                continue;
            }
            if (name.equals("\u5de6\u8155")) {
                this.f = this.c.get(this.c.size() - 1);
                continue;
            }
            if (name.equals("\u53f3\u8155")) {
                this.g = this.c.get(this.c.size() - 1);
                continue;
            }
            if (name.equals("Camera")) {
                this.h = this.c.get(this.c.size() - 1);
                continue;
            }
            if (name.equals("\u53f3item")) {
                this.i = this.c.get(this.c.size() - 1);
                continue;
            }
            if (name.equals("\u5de6item")) {
                this.j = this.c.get(this.c.size() - 1);
                continue;
            }
            if (!name.equals("Back")) continue;
            this.k = this.c.get(this.c.size() - 1);
        }
        this.a(Bnum + " Bones read.");
    }

    public void f() throws Exception {
        int IKnum = this.a.a();
        this.g = new ArrayList();
        for (int i2 = 0; i2 < IKnum; ++i2) {
            int index = this.a.a();
            int indexEnd = this.a.a();
            int linksNum = this.a.c();
            int maxNum = this.a.a();
            float value = this.a.a();
            int[] ichilds = new int[linksNum];
            ArrayList<ar> childs = new ArrayList<ar>();
            for (int j2 = 0; j2 < linksNum; ++j2) {
                ichilds[j2] = this.a.a();
            }
            ArrayList<Integer> childID = new ArrayList<Integer>();
            for (int j3 = 0; j3 < ichilds.length; ++j3) {
                childs.add(this.c.get(ichilds[j3]));
                childID.add(ichilds[j3]);
            }
            this.g.add(new ay(this.c.get(index), this.c.get(indexEnd), maxNum, value * 4.0f, childID, childs, index, indexEnd));
        }
        this.a(IKnum + " IK read.");
    }

    public void g() throws Exception {
        int Fnum = this.a.a();
        ArrayList<ai_0> base = null;
        this.d = new ArrayList();
        for (int i2 = 0; i2 < Fnum; ++i2) {
            String name = new String(this.a(this.a.a(0, 20)));
            long verticesNum = this.a.a();
            int type = this.a.c();
            ArrayList<ai_0> vs = new ArrayList<ai_0>();
            ArrayList<ap_0> max = new ArrayList<ap_0>();
            aQ pm = null;
            if (i2 != 0) {
                pm = new aQ(name, null, type, 1, verticesNum);
            }
            int j2 = 0;
            while ((long)j2 < verticesNum) {
                ai_0 targetV;
                long index = this.a.a();
                float x = this.a.a();
                float y = this.a.a();
                float z = this.a.a();
                if (i2 == 0) {
                    targetV = this.a[(int)index];
                    vs.add(targetV);
                } else {
                    ArrayList vertexIndexes = new ArrayList();
                    ArrayList vertexTransforms = new ArrayList();
                    targetV = (ai_0)base.get((int)index);
                    vs.add(targetV);
                    if (targetV.a == null) {
                        targetV.a = (float)new ArrayList();
                    }
                    targetV.a.add(this.d.size());
                    targetV.b = true;
                    if (targetV.b == null) {
                        targetV.b = (float)new ArrayList();
                    }
                    targetV.b.add(new ap_0(x, y, z));
                }
                max.add(new ap_0(x, y, z));
                ++j2;
            }
            if (i2 == 0) {
                base = vs;
                continue;
            }
            pm.c = vs;
            pm.e = max;
            this.d.add(pm);
        }
        this.a(Fnum + " Faces read.");
    }

    public void h() throws Exception {
        int NFnum = this.a.c();
        for (int i2 = 0; i2 < NFnum; ++i2) {
            int n2 = this.a.a();
        }
        this.a(NFnum + " face name read.");
    }

    public void i() throws Exception {
        int NBGnum = this.a.c();
        this.e = new ArrayList();
        for (int i2 = 0; i2 < NBGnum; ++i2) {
            String name = new String(this.a(this.a.a(0, 50)));
            this.e.add(name);
        }
        this.a(NBGnum + " bone group name read.");
    }

    public void j() throws Exception {
        long NBnum = this.a.a();
        int i2 = 0;
        while ((long)i2 < NBnum) {
            int index = this.a.a();
            int n2 = this.a.c();
            ++i2;
        }
        this.a(NBnum + " displayed bone read.");
    }

    public void k() throws Exception {
        String Mname = new String(this.a(this.a.a(0, 20)));
        String comment = new String(this.a(this.a.a(0, 256)));
        this.a("Model name: " + Mname);
        this.a(comment);
    }

    public void l() throws Exception {
        for (int i2 = 0; i2 < this.c.size(); ++i2) {
            String string = new String(this.a(this.a.a(0, 20)));
        }
        this.a(this.c.size() + " Bone english name read.");
    }

    public void m() throws Exception {
        for (int i2 = 0; i2 < this.d.size(); ++i2) {
            String name;
            this.d.get((int)i2).b = name = new String(this.a(this.a.a(0, 20)));
        }
        this.a(this.d.size() + " Face english name read.");
    }

    public void n() throws Exception {
        for (int i2 = 0; i2 < this.e.size(); ++i2) {
            String string = new String(this.a(this.a.a(0, 50)));
        }
        this.a(this.e.size() + " Bone group english name read.");
    }

    public void o() throws Exception {
        this.f = new ArrayList();
        for (int i2 = 0; i2 < 10; ++i2) {
            String file = new String(this.a(this.a.a(0, 100)));
            this.f.add(file);
        }
        this.a("10 Toon texture read.");
    }

    public void p() throws Exception {
        long Rnum = this.a.a();
        this.i = new ArrayList();
        int i2 = 0;
        while ((long)i2 < Rnum) {
            String name = new String(this.a(this.a.a(0, 20)));
            ac_0 rb = new ac_0(name);
            rb.a = this.a.a();
            rb.a = (byte)this.a.c();
            rb.b = (short)this.a.e();
            rb.c = this.a.c();
            rb.a = this.a.a();
            rb.b = this.a.a();
            rb.c = this.a.a();
            rb.d = this.a.a();
            rb.e = this.a.a();
            rb.f = this.a.a();
            rb.g = this.a.a();
            rb.h = this.a.a();
            rb.i = this.a.a();
            rb.j = this.a.a();
            rb.k = this.a.a();
            rb.l = this.a.a();
            rb.m = this.a.a();
            rb.n = this.a.a();
            rb.d = this.a.c();
            ((ArrayList)((Object)this.i)).add(rb);
            if (rb.d == 1 || rb.d == 2) {
                this.c.get((int)rb.a).e = rb.d;
            }
            ++i2;
        }
        this.a(Rnum + " Rigid read.");
    }

    public void q() throws Exception {
        long Pnum = this.a.a();
        this.h = new ArrayList();
        int i2 = 0;
        while ((long)i2 < Pnum) {
            String name = new String(this.a(this.a.a(0, 20)));
            au c2 = new au(name);
            c2.a = this.a.a();
            c2.b = this.a.a();
            c2.a = this.a.a();
            c2.b = this.a.a();
            c2.c = this.a.a();
            c2.d = this.a.a();
            c2.e = this.a.a();
            c2.f = this.a.a();
            c2.g = this.a.a();
            c2.h = this.a.a();
            c2.i = this.a.a();
            c2.j = this.a.a();
            c2.k = this.a.a();
            c2.l = this.a.a();
            c2.m = this.a.a();
            c2.n = this.a.a();
            c2.o = this.a.a();
            c2.p = this.a.a();
            c2.q = this.a.a();
            c2.r = this.a.a();
            c2.s = this.a.a();
            c2.t = this.a.a();
            c2.u = this.a.a();
            c2.v = this.a.a();
            c2.w = this.a.a();
            c2.x = this.a.a();
            this.h.add(c2);
            ++i2;
        }
        this.a(Pnum + " Physics constraint read.");
    }

    public void r() {
        b_0.b();
    }

    public void a(Object s) {
        b_0.b(s);
    }

    private String a(byte[] s) throws UnsupportedEncodingException {
        int l2 = 0;
        for (int i2 = 0; i2 < s.length; ++i2) {
            if (s[i2] != 0) continue;
            l2 = i2;
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

