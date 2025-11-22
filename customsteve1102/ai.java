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
import customsteve.aP;
import customsteve.aQ;
import customsteve.ac;
import customsteve.ac_0;
import customsteve.af_0;
import customsteve.ai_0;
import customsteve.aj_0;
import customsteve.ak_0;
import customsteve.al_0;
import customsteve.am;
import customsteve.am_0;
import customsteve.an_0;
import customsteve.ao_0;
import customsteve.ap_0;
import customsteve.aq_0;
import customsteve.ar;
import customsteve.ar_0;
import customsteve.as_0;
import customsteve.au;
import customsteve.ax;
import customsteve.ay;
import customsteve.b_0;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import net.minecraft.util.text.TextComponentTranslation;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ai {
    private U a;
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 4;
    public static final int d = 8;
    public static final int e = 16;
    public static final int f = 32;
    public static final int g = 256;
    public static final int h = 512;
    public static final int i = 1024;
    public static final int j = 2048;
    public static final int k = 4096;
    public static final int l = 8192;
    int m;
    int n;
    int o;
    int p;
    int q;
    int r;
    int s;
    int t;
    String a;
    String b;
    String c;
    String d;
    ar_0[] a;
    ai_0[] a;
    ArrayList<aH> a;
    ArrayList<String> b;
    ArrayList<af_0> c;
    ArrayList<aB> d;
    ArrayList<ao_0> e;
    ArrayList<ar> f;
    ArrayList<aP> g;
    ArrayList<ay> h;
    ar a;
    ar b;
    ar c;
    ar d;
    ar e;
    ar f;
    ar g;
    ar h;
    ar i;
    ar j;
    ar k;
    ar l;
    ArrayList<aQ> i;
    ArrayList<am_0> j;
    ArrayList<ac_0> k;
    ArrayList<au> l;

    public int a(File f2, ac pfi) throws Exception {
        if (f2 == null || !f2.exists()) {
            return 404;
        }
        if (f2.getName().indexOf(".pmx") == -1) {
            return 401;
        }
        int errorCode = -1;
        this.a = new U(new FileInputStream(f2.getAbsolutePath()));
        this.a();
        this.a(new TextComponentTranslation("Pmx.Load.Begin", new Object[0]).func_150254_d());
        this.a();
        this.a(new TextComponentTranslation("Pmx.Load.Header", new Object[0]).func_150254_d());
        this.a();
        errorCode = this.a();
        if (errorCode != -1) {
            return errorCode;
        }
        this.a();
        this.a(new TextComponentTranslation("Pmx.Load.ModelInfo", new Object[0]).func_150254_d());
        this.a();
        this.b();
        this.a();
        this.a(new TextComponentTranslation("Pmx.Load.Vertex", new Object[0]).func_150254_d());
        this.a();
        this.c();
        this.m();
        this.a();
        this.a(new TextComponentTranslation("Pmx.Load.Index", new Object[0]).func_150254_d());
        this.a();
        this.d();
        this.a();
        this.a(new TextComponentTranslation("Pmx.Load.Material", new Object[0]).func_150254_d());
        this.a();
        this.e();
        this.a();
        this.a(new TextComponentTranslation("Pmx.Load.Texture", new Object[0]).func_150254_d());
        this.a();
        this.f();
        this.a();
        this.a(new TextComponentTranslation("Pmx.Load.Bone", new Object[0]).func_150254_d());
        this.a();
        this.g();
        this.l();
        this.o();
        this.a();
        this.a(new TextComponentTranslation("Pmx.Load.Morph", new Object[0]).func_150254_d());
        this.a();
        this.h();
        this.a();
        this.a(new TextComponentTranslation("Pmx.Load.DisplaySlot", new Object[0]).func_150254_d());
        this.a();
        this.i();
        this.a();
        this.a(new TextComponentTranslation("Pmx.Load.RigidBody", new Object[0]).func_150254_d());
        this.a();
        this.j();
        this.a();
        this.a(new TextComponentTranslation("Pmx.Load.Joint", new Object[0]).func_150254_d());
        this.a();
        this.k();
        this.a();
        this.n();
        this.p();
        pfi.c = (ArrayList<ar>)this.f;
        pfi.e = (ArrayList<ay>)this.h;
        pfi.h = (ArrayList<aQ>)this.i;
        pfi.g = (ArrayList<ac_0>)this.k;
        pfi.f = (ArrayList<au>)this.l;
        pfi.a = this.i;
        pfi.b = this.j;
        pfi.c = this.a;
        pfi.d = this.b;
        pfi.e = this.c;
        pfi.f = this.d;
        pfi.g = this.e;
        pfi.h = this.f;
        pfi.i = this.g;
        pfi.j = this.h;
        pfi.k = this.k;
        pfi.l = this.l;
        pfi.i = (ArrayList<String>)this.b;
        ((ArrayList)((Object)pfi.a)).add(new ax("none", null, this.a, (ArrayList<aH>)((Object)this.a), (ArrayList<aB>)this.d));
        pfi.h = (ArrayList<aQ>)this.i;
        for (aQ pm : pfi.h) {
            if (pm.a.equals("Helmet")) {
                pfi.a = pm;
                pm.a = true;
                continue;
            }
            if (pm.a.equals("Chestplate")) {
                pfi.b = pm;
                pm.a = true;
                continue;
            }
            if (pm.a.equals("Leggings")) {
                pfi.c = pm;
                pm.a = true;
                continue;
            }
            if (!pm.a.equals("Boots")) continue;
            pfi.d = pm;
            pm.a = true;
        }
        this.a.a();
        return -1;
    }

    private int a() throws Exception {
        String verName = this.a.a() + this.a.a() + this.a.a() + this.a.a() + "";
        verName = "Pmx ";
        float Ver = this.a.a();
        if ((double)Ver != 2.0 && (double)Ver != 2.1) {
            return 402;
        }
        this.a(verName + Ver);
        char flag = this.a.a();
        this.a("flag: " + flag);
        this.m = this.a.a();
        this.a("Encoding: " + (this.m == 1 ? "UTF-8" : "UTF-16LE"));
        this.n = this.a.a();
        this.a("Appendix UV: " + this.n);
        this.o = this.a.a();
        this.a("Vertex Index Size: " + this.a(this.o));
        this.p = this.a.a();
        this.a("Texture Index Size: " + this.a(this.p));
        this.q = this.a.a();
        this.a("Material Index Size: " + this.a(this.q));
        this.r = this.a.a();
        this.a("Bone Index Size: " + this.a(this.r));
        this.s = this.a.a();
        this.a("Morph Index Size: " + this.a(this.s));
        this.t = this.a.a();
        this.a("Rigid Body Index Size: " + this.a(this.t));
        return -1;
    }

    private void b() throws Exception {
        this.a = this.a();
        this.a("Model Name: " + this.a);
        this.b = this.a();
        this.a("English Model Name: " + this.b);
        this.c = this.a();
        this.a("Comment: " + this.c);
        this.d = this.a();
        this.a("CommentE: " + this.c);
    }

    private void c() throws Exception {
        long Vnum = this.a.a();
        this.a = new ar_0[(int)Vnum];
        int i2 = 0;
        while ((long)i2 < Vnum) {
            Object appendixUV = null;
            as_0 weight = null;
            if (this.n > 0) {
                appendixUV = new float[this.n][];
            }
            float x = this.a.a();
            float y = this.a.a();
            float z = this.a.a();
            float nx = this.a.a();
            float ny = this.a.a();
            float nz = this.a.a();
            float U2 = this.a.a();
            float V2 = this.a.a();
            if (appendixUV != null) {
                for (int j2 = 0; j2 < this.n; ++j2) {
                    appendixUV[j2] = new float[]{this.a.a(), this.a.a(), this.a.a(), this.a.a()};
                }
            }
            byte weightType = this.a.a();
            switch (weightType) {
                case 0: {
                    weight = new aj_0(this.a(this.r));
                    break;
                }
                case 1: {
                    weight = new ak_0(this.a(this.r), this.a(this.r), this.a.a());
                    break;
                }
                case 2: {
                    weight = new al_0(this.a(this.r), this.a(this.r), this.a(this.r), this.a(this.r), this.a.a(), this.a.a(), this.a.a(), this.a.a());
                    break;
                }
                case 3: {
                    weight = new an_0(this.a(this.r), this.a(this.r), this.a.a(), this.a(), this.a(), this.a());
                    break;
                }
            }
            float edgeScale = this.a.a();
            this.a[i2] = new ar_0(x, y, z, nx, ny, nz, U2, V2, (float[][])appendixUV, weightType, weight, edgeScale);
            ++i2;
        }
        this.a(Vnum + " Vertices read.");
    }

    private void d() throws Exception {
        int Inum = this.a.f();
        int[] indexs = new int[Inum];
        this.a = new ArrayList();
        for (int i2 = 0; i2 < Inum; ++i2) {
            indexs[i2] = this.a(this.o);
        }
        this.a(Inum + " indexes read.");
        long Fnum = Inum / 3;
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

    private void e() throws Exception {
        int Mnum = this.a.f();
        this.b = (int)new ArrayList();
        for (int i2 = 0; i2 < Mnum; ++i2) {
            this.b.add(this.a());
        }
        this.a(Mnum + " Materials read.");
    }

    private void f() throws Exception {
        int Tnum = (int)this.a.a();
        this.c = (int)new ArrayList();
        for (int i2 = 0; i2 < Tnum; ++i2) {
            String name = this.a();
            String nameE = this.a();
            float[] diffuse = new float[]{this.a.a(), this.a.a(), this.a.a(), this.a.a()};
            float[] specular = new float[]{this.a.a(), this.a.a(), this.a.a()};
            float specularNum = this.a.a();
            float[] ambient = new float[]{this.a.a(), this.a.a(), this.a.a()};
            char drawingModeFlag = this.a.a();
            float[] edgeColor = new float[]{this.a.a(), this.a.a(), this.a.a(), this.a.a()};
            float edgeSize = this.a.a();
            int textureIndex = this.a(this.p);
            int sphereIndex = this.a(this.p);
            char sphereMode = this.a.a();
            boolean defToon = this.a.a() == 1;
            int toonIndex = defToon ? this.a.a() : this.a(this.p);
            String memo = this.a();
            int fromFaceNumber = this.a.f();
            this.c.add(new af_0(name, nameE, diffuse, specular, specularNum, ambient, drawingModeFlag, edgeColor, edgeSize, textureIndex, sphereIndex, sphereMode, defToon, toonIndex, memo, fromFaceNumber));
        }
        this.a(Tnum + " Textures read.");
    }

    private void g() throws Exception {
        long Bnum = this.a.a();
        this.e = (int)new ArrayList();
        this.g = (int)new ArrayList();
        int i2 = 0;
        while ((long)i2 < Bnum) {
            int tailId = -1;
            ap_0 tailPos = null;
            int effectId = -1;
            float effectFactor = -1.0f;
            boolean ER = false;
            boolean ET = false;
            ap_0 fixedAxis = null;
            ap_0 localXVector = null;
            ap_0 localZVector = null;
            int externalKey = -1;
            String name = this.a();
            String nameE = this.a();
            float[] pos = new float[]{this.a.a(), this.a.a(), this.a.a()};
            int parent = this.a(this.r);
            int layer = this.a.f();
            int flag = this.a.d();
            if ((flag & 1) != 0) {
                tailId = this.a(this.r);
            } else {
                tailPos = this.a();
            }
            if ((flag & 0x100) != 0 || (flag & 0x200) != 0) {
                if ((flag & 0x100) != 0) {
                    ER = true;
                }
                if ((flag & 0x200) != 0) {
                    ET = true;
                }
                effectId = this.a(this.r);
                effectFactor = this.a.a();
            }
            if ((flag & 0x400) != 0) {
                fixedAxis = this.a();
            }
            if ((flag & 0x800) != 0) {
                localXVector = this.a();
                localZVector = this.a();
            }
            if ((flag & 0x2000) != 0) {
                externalKey = this.a.f();
            }
            if ((flag & 0x20) != 0) {
                this.g.add(this.a(i2));
            }
            ao_0 pb = new ao_0(name, nameE, pos, parent, layer, flag, tailId, tailPos, effectId, effectFactor, fixedAxis, localXVector, localZVector, externalKey);
            pb.a = ER;
            pb.b = ET;
            this.e.add(pb);
            ++i2;
        }
        this.a(Bnum + " Bones read.");
    }

    private void h() throws Exception {
        long Mnum = this.a.a();
        this.i = (int)new ArrayList();
        int i2 = 0;
        while ((long)i2 < Mnum) {
            ArrayList<Integer> morphIndexes = null;
            ArrayList<Float> morphScales = null;
            ArrayList<Integer> vertexIndexes = null;
            ArrayList<ap_0> vertexTransforms = null;
            ArrayList<Integer> boneIndexes = null;
            ArrayList<ap_0> boneTransforms = null;
            ArrayList<am> boneRotations = null;
            ArrayList<aq_0> UVoffsets = null;
            ArrayList<Integer> textureIndexes = null;
            ArrayList<Byte> textureCalcModes = null;
            ArrayList<float[]> textureDiffuses = null;
            ArrayList<float[]> textureSpeculars = null;
            ArrayList<Float> textureSpecularCoefficients = null;
            ArrayList<float[]> textureAmbients = null;
            ArrayList<float[]> textureEdgeColor = null;
            ArrayList<Float> textureEdgeSize = null;
            ArrayList<float[]> textureCoefficients = null;
            ArrayList<float[]> sphereTextureCoefficients = null;
            ArrayList<float[]> toonTextureCoefficients = null;
            String name = this.a();
            String nameE = this.a();
            byte type = this.a.a();
            byte morphType = this.a.a();
            int offset_size = this.a.f();
            aQ pm = new aQ(name, nameE, type, morphType, offset_size);
            this.i.add(pm);
            switch (morphType) {
                case 0: {
                    if (morphIndexes == null) {
                        morphIndexes = new ArrayList<Integer>();
                    }
                    if (morphScales == null) {
                        morphScales = new ArrayList<Float>();
                    }
                    for (int j2 = 0; j2 < offset_size; ++j2) {
                        morphIndexes.add(this.a(this.s));
                        morphScales.add(Float.valueOf(this.a.a()));
                    }
                    pm.a = morphIndexes;
                    pm.b = morphScales;
                    break;
                }
                case 1: {
                    int j3;
                    if (vertexIndexes == null) {
                        vertexIndexes = new ArrayList<Integer>();
                    }
                    if (vertexTransforms == null) {
                        vertexTransforms = new ArrayList<ap_0>();
                    }
                    ArrayList<ai_0> vs = new ArrayList<ai_0>();
                    for (j3 = 0; j3 < offset_size; ++j3) {
                        vertexIndexes.add(this.a(this.o));
                        vertexTransforms.add(this.a());
                        ai_0 targetV = this.a[(Integer)vertexIndexes.get(vertexIndexes.size() - 1)];
                        vs.add(targetV);
                        if (targetV.a == null) {
                            targetV.a = (float)new ArrayList();
                        }
                        targetV.a.add(i2);
                        targetV.b = true;
                        if (targetV.b == null) {
                            targetV.b = (float)new ArrayList();
                        }
                        targetV.b.add(vertexTransforms.get(vertexTransforms.size() - 1));
                    }
                    pm.d = vertexIndexes;
                    pm.e = vertexTransforms;
                    pm.c = vs;
                    break;
                }
                case 2: {
                    int j3;
                    if (boneIndexes == null) {
                        boneIndexes = new ArrayList<Integer>();
                    }
                    if (boneTransforms == null) {
                        boneTransforms = new ArrayList<ap_0>();
                    }
                    if (boneRotations == null) {
                        boneRotations = new ArrayList<am>();
                    }
                    for (j3 = 0; j3 < offset_size; ++j3) {
                        boneIndexes.add(this.a(this.r));
                        boneTransforms.add(this.a());
                        boneRotations.add(new am(this.a.a(), this.a.a(), this.a.a(), this.a.a()));
                    }
                    pm.f = boneIndexes;
                    pm.g = boneTransforms;
                    pm.h = boneRotations;
                    break;
                }
                case 3: {
                    int j3;
                    if (vertexIndexes == null) {
                        vertexIndexes = new ArrayList();
                    }
                    if (UVoffsets == null) {
                        UVoffsets = new ArrayList<aq_0>();
                    }
                    for (j3 = 0; j3 < offset_size; ++j3) {
                        vertexIndexes.add(this.a(this.o));
                        UVoffsets.add(new aq_0(this.a.a(), this.a.a(), this.a.a(), this.a.a()));
                    }
                    pm.d = vertexIndexes;
                    pm.i = UVoffsets;
                    break;
                }
                case 4: {
                    break;
                }
                case 5: {
                    break;
                }
                case 6: {
                    break;
                }
                case 7: {
                    break;
                }
                case 8: {
                    int j3;
                    if (textureIndexes == null) {
                        textureIndexes = new ArrayList<Integer>();
                    }
                    if (textureCalcModes == null) {
                        textureCalcModes = new ArrayList<Byte>();
                    }
                    if (textureDiffuses == null) {
                        textureDiffuses = new ArrayList<float[]>();
                    }
                    if (textureSpeculars == null) {
                        textureSpeculars = new ArrayList<float[]>();
                    }
                    if (textureSpecularCoefficients == null) {
                        textureSpecularCoefficients = new ArrayList<Float>();
                    }
                    if (textureAmbients == null) {
                        textureAmbients = new ArrayList<float[]>();
                    }
                    if (textureEdgeColor == null) {
                        textureEdgeColor = new ArrayList<float[]>();
                    }
                    if (textureEdgeSize == null) {
                        textureEdgeSize = new ArrayList<Float>();
                    }
                    if (textureCoefficients == null) {
                        textureCoefficients = new ArrayList<float[]>();
                    }
                    if (sphereTextureCoefficients == null) {
                        sphereTextureCoefficients = new ArrayList<float[]>();
                    }
                    if (toonTextureCoefficients == null) {
                        toonTextureCoefficients = new ArrayList<float[]>();
                    }
                    for (j3 = 0; j3 < offset_size; ++j3) {
                        textureIndexes.add(this.a(this.p));
                        textureCalcModes.add(this.a.a());
                        textureDiffuses.add(new float[]{this.a.a(), this.a.a(), this.a.a(), this.a.a()});
                        textureSpeculars.add(new float[]{this.a.a(), this.a.a(), this.a.a()});
                        textureSpecularCoefficients.add(Float.valueOf(this.a.a()));
                        textureAmbients.add(new float[]{this.a.a(), this.a.a(), this.a.a()});
                        textureEdgeColor.add(new float[]{this.a.a(), this.a.a(), this.a.a(), this.a.a()});
                        textureEdgeSize.add(Float.valueOf(this.a.a()));
                        textureCoefficients.add(new float[]{this.a.a(), this.a.a(), this.a.a(), this.a.a()});
                        sphereTextureCoefficients.add(new float[]{this.a.a(), this.a.a(), this.a.a(), this.a.a()});
                        toonTextureCoefficients.add(new float[]{this.a.a(), this.a.a(), this.a.a(), this.a.a()});
                    }
                    pm.j = textureIndexes;
                    pm.k = textureCalcModes;
                    pm.l = textureDiffuses;
                    pm.m = textureSpeculars;
                    pm.n = textureSpecularCoefficients;
                    pm.o = textureAmbients;
                    pm.p = textureEdgeColor;
                    pm.q = textureEdgeSize;
                    pm.r = textureCoefficients;
                    pm.s = sphereTextureCoefficients;
                    pm.t = toonTextureCoefficients;
                    break;
                }
            }
            ++i2;
        }
        this.a(Mnum + " Morphs read.");
    }

    private void i() throws Exception {
        int Snum = this.a.f();
        this.j = (int)new ArrayList();
        for (int i2 = 0; i2 < Snum; ++i2) {
            String name = this.a();
            String nameE = this.a();
            byte special = this.a.a();
            am_0 ds = new am_0(name, nameE, special);
            this.j.add(ds);
            int displayCount = this.a.f();
            for (int j2 = 0; j2 < displayCount; ++j2) {
                byte displayType = this.a.a();
                if (displayType == 0) {
                    ((ArrayList)((Object)ds.a)).add(new Object[]{(int)displayType, this.a(this.r)});
                    continue;
                }
                ((ArrayList)((Object)ds.a)).add(new Object[]{(int)displayType, this.a(this.s)});
            }
        }
        this.a(Snum + " Display Slots read.");
    }

    private void j() throws Exception {
        long Rnum = this.a.a();
        this.k = (int)new ArrayList();
        int i2 = 0;
        while ((long)i2 < Rnum) {
            String name = this.a();
            String nameE = this.a();
            ac_0 rb = new ac_0(name);
            rb.a = this.a(this.r);
            rb.a = (byte)this.a.c();
            rb.b = this.a.e();
            rb.c = this.a.c();
            rb.a = this.a.a();
            rb.b = this.a.a();
            rb.c = this.a.a();
            rb.d = this.a.a();
            rb.e = this.a.a();
            rb.f = this.a.a();
            ar b2 = null;
            try {
                b2 = (ar)this.f.get(rb.a);
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                // empty catch block
            }
            if (b2 != null) {
                rb.d -= b2.a;
                rb.e -= b2.b;
                rb.f -= b2.c;
            }
            rb.g = this.a.a();
            rb.h = this.a.a();
            rb.i = this.a.a();
            rb.j = this.a.a();
            rb.k = this.a.a();
            rb.l = this.a.a();
            rb.m = this.a.a();
            rb.n = this.a.a();
            rb.d = this.a.c();
            this.k.add(rb);
            if (b2 != null && (rb.d == 1 || rb.d == 2)) {
                b2.e = rb.d;
            }
            ++i2;
        }
        this.a(Rnum + " Rigid bodies read.");
    }

    private void k() throws Exception {
        long Pnum = this.a.a();
        this.l = (int)new ArrayList();
        int i2 = 0;
        while ((long)i2 < Pnum) {
            String name = this.a();
            String nameE = this.a();
            if (this.a.a() == 0) {
                au c2 = new au(name);
                c2.a = this.a(this.t);
                c2.b = this.a(this.t);
                c2.a = this.a.a();
                c2.b = this.a.a();
                c2.c = this.a.a();
                c2.d = this.a.a();
                c2.e = this.a.a();
                c2.f = this.a.a();
                if (c2.e > 1.570785f || c2.e < -1.570785f) {
                    // empty if block
                }
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
                this.l.add(c2);
            }
            ++i2;
        }
        this.a(Pnum + " Joint read.");
    }

    private aP a(int endId) throws Exception {
        int targetId = this.a(this.r);
        int loop = this.a.f();
        float limitRadius = this.a.a();
        int count = this.a.f();
        ArrayList<Integer> childsId = new ArrayList<Integer>();
        ArrayList<Boolean> childLimits = new ArrayList<Boolean>();
        ArrayList<ap_0> childLimitsMin = new ArrayList<ap_0>();
        ArrayList<ap_0> childLimitsMax = new ArrayList<ap_0>();
        for (int i2 = 0; i2 < count; ++i2) {
            int linkedId = this.a(this.r);
            byte limit = this.a.a();
            ap_0 limitMin = null;
            ap_0 limitMax = null;
            if (limit == 1) {
                limitMin = this.a();
                limitMax = this.a();
            }
            childsId.add(linkedId);
            childLimits.add(limit == 1);
            childLimitsMin.add(limitMin);
            childLimitsMax.add(limitMax);
        }
        return new aP(endId, targetId, loop, limitRadius, childsId, childLimits, childLimitsMin, childLimitsMax);
    }

    private void l() {
        for (int i2 = 0; i2 < this.g.size(); ++i2) {
            aP pik = (aP)this.g.get(i2);
            pik.a = (ao_0)this.e.get(pik.a);
            pik.b = (ao_0)this.e.get(pik.b);
            pik.e = new ArrayList();
            for (int j2 = 0; j2 < pik.a.size(); ++j2) {
                pik.e.add((ao_0)this.e.get((Integer)pik.a.get(j2)));
            }
        }
        this.a(this.g.size() + " IK read.");
    }

    private void m() {
        this.a = new ai_0[this.a.length];
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            ar_0 xv = this.a[i2];
            int b0 = -1;
            int b1 = -1;
            Object bw = null;
            if (xv.a instanceof an_0) {
                an_0 sdef = (an_0)xv.a;
                ap_0 sdefRWv = sdef.d().a(sdef.a()).b(sdef.e().a(1.0f - sdef.a()));
                ap_0 sdefRW0 = sdef.d().l(sdefRWv);
                ap_0 sdefRW1 = sdef.e().l(sdefRWv);
                sdef.a(sdefRW0);
                sdef.b(sdefRW1);
            }
            this.a[i2] = new ai_0(xv.a, xv.b, xv.c, xv.d, xv.e, xv.f, xv.g, xv.h, xv.a, xv.a, false);
        }
    }

    private void n() {
        this.d = (int)new ArrayList();
        for (int i2 = 0; i2 < this.c.size(); ++i2) {
            af_0 t = (af_0)this.c.get(i2);
            String mat = null;
            mat = t.b < 0 || t.b == this.b.size() ? null : (String)this.b.get(t.b);
            if (t.c != -1 && t.c != this.b.size()) {
                mat = mat + "*" + (String)this.b.get(t.c);
            }
            aB material = new aB(t.a[0], t.a[1], t.a[2], t.a[3], 0.0f, t.b[0], t.b[1], t.b[2], t.c[0], t.c[1], t.c[2], t.d, t.a, t.e, false, t.f, mat);
            material.f = t.a;
            if (t.c.indexOf("/spe") > -1) {
                material.e = true;
            }
            if (t.c.indexOf("/light") > -1) {
                material.d = true;
            }
            if (t.c.indexOf("/cull") > -1) {
                material.g = true;
            }
            if (t.c.indexOf("/fpvCull") > -1) {
                material.f = true;
            }
            this.d.add(material);
        }
    }

    private void o() {
        this.f = (int)new ArrayList();
        for (int i2 = 0; i2 < this.e.size(); ++i2) {
            ao_0 b2 = (ao_0)this.e.get(i2);
            int type = b2.b;
            if (b2.a) {
                type = 5;
            }
            if ((b2.c & 2) >> 1 == 1 && (b2.c & 4) >> 2 == 1) {
                type = 1;
            }
            if ((b2.c & 0x20) >> 5 == 1 || (b2.c & 0x80) >> 7 == 1) {
                type = 2;
            }
            ar pmdB = new ar(b2.a, b2.a, 0, type, b2.e, b2.a[0], b2.a[1], b2.a[2], b2.a);
            this.f.add(pmdB);
            String name = b2.a;
            if (name.contains("\u3072\u3056")) {
                ((ar)this.f.get((int)(this.f.size() - 1))).a = true;
                continue;
            }
            if (name.equals("\u982d") || name.equals("Head")) {
                this.a = (ar)this.f.get(this.f.size() - 1);
                continue;
            }
            if (name.equals("\u9996")) {
                this.b = (ar)this.f.get(this.f.size() - 1);
                continue;
            }
            if (name.equals("\u4e0a\u534a\u8eab") || name.equals("UpperBody")) {
                this.c = (ar)this.f.get(this.f.size() - 1);
                continue;
            }
            if (name.equals("\u4e0a\u534a\u8eab2") || name.equals("UpperBody2")) {
                this.d = (ar)this.f.get(this.f.size() - 1);
                continue;
            }
            if (name.equals("\u4e0b\u534a\u8eab") || name.equals("LowerBody")) {
                this.e = (ar)this.f.get(this.f.size() - 1);
                continue;
            }
            if (name.equals("\u5de6\u8155")) {
                this.f = (ar)this.f.get(this.f.size() - 1);
                continue;
            }
            if (name.equals("\u53f3\u8155")) {
                this.g = (ar)this.f.get(this.f.size() - 1);
                continue;
            }
            if (name.equals("Camera")) {
                this.h = (ar)this.f.get(this.f.size() - 1);
                continue;
            }
            if (name.equals("\u53f3item")) {
                this.i = (ar)this.f.get(this.f.size() - 1);
                continue;
            }
            if (name.equals("\u5de6item")) {
                this.j = (ar)this.f.get(this.f.size() - 1);
                continue;
            }
            if (name.equals("Back")) {
                this.k = (ar)this.f.get(this.f.size() - 1);
                continue;
            }
            if (!name.equals("\u30b0\u30ea\u30c3\u30d7")) continue;
            this.l = (ar)this.f.get(this.f.size() - 1);
        }
    }

    private void p() {
        this.h = (int)new ArrayList();
        for (int i2 = 0; i2 < this.g.size(); ++i2) {
            aP k2 = (aP)this.g.get(i2);
            ArrayList<ar> b2 = new ArrayList<ar>();
            for (int j2 = 0; j2 < k2.a.size(); ++j2) {
                b2.add((ar)this.f.get((Integer)k2.a.get(j2)));
            }
            ay pmdik = new ay((ar)this.f.get(k2.a), (ar)this.f.get(k2.b), k2.c, k2.a, (ArrayList)k2.a, b2, k2.a, k2.b);
            pmdik.c = k2.b;
            pmdik.e = k2.d;
            pmdik.d = (ArrayList<ap_0>)k2.c;
            this.h.add(pmdik);
        }
    }

    private ap_0 a() throws Exception {
        return new ap_0(this.a.a(), this.a.a(), this.a.a());
    }

    private int a(int type) throws Exception {
        switch (type) {
            case 1: {
                int ubyte = this.a.c();
                return ubyte == 255 ? -1 : ubyte;
            }
            case 2: {
                return this.a.a();
            }
            case 4: {
                return this.a.f();
            }
        }
        return -1;
    }

    private String a() throws Exception {
        String sa = new String(this.a.a(0, this.a.f()), this.m == 1 ? "UTF-8" : "UTF-16LE");
        return new String(sa.getBytes(this.m == 1 ? "UTF-8" : "UTF-16LE"), this.m == 1 ? "UTF-8" : "UTF-16LE");
    }

    private String a(int type) {
        switch (type) {
            case 1: {
                return "Byte";
            }
            case 2: {
                return "Short";
            }
            case 4: {
                return "Int";
            }
        }
        return "UNKNOW";
    }

    public void a() {
        b_0.b();
    }

    public void a(Object s) {
        b_0.b(s);
    }
}

