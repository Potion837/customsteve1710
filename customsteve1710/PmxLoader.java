/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.StatCollector
 */
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import net.minecraft.util.StatCollector;

public class PmxLoader {
    private ByteInputhelper excess$;
    public static final int trades$ = 1;
    public static final int clothing$ = 2;
    public static final int rating$ = 4;
    public static final int slides$ = 8;
    public static final int mazda$ = 16;
    public static final int charlie$ = 32;
    public static final int extreme$ = 256;
    public static final int editions$ = 512;
    public static final int touring$ = 1024;
    public static final int mount$ = 2048;
    public static final int exchange$ = 4096;
    public static final int campaign$ = 8192;
    int gilbert$;
    int realm$;
    int hanging$;
    int multi$;
    int yield$;
    int nicholas$;
    int custom$;
    int hygiene$;
    String superior$;
    String chester$;
    String credits$;
    String sought$;
    pmxVertex[] hostels$;
    Vertex[] receiver$;
    ArrayList taste$;
    ArrayList before$;
    ArrayList centers$;
    ArrayList yukon$;
    ArrayList passes$;
    ArrayList rural$;
    ArrayList emily$;
    ArrayList socks$;
    Bone missouri$;
    Bone reserve$;
    Bone mexico$;
    Bone asthma$;
    Bone greater$;
    Bone bridal$;
    Bone property$;
    Bone logic$;
    Bone featured$;
    Bone color$;
    Bone involves$;
    ArrayList priced$;
    ArrayList mercury$;
    ArrayList takes$;
    ArrayList crazy$;

    public int _marking(File f2, PmdFileInfo pfi) throws Exception {
        if (f2 == null || !f2.exists()) {
            return 404;
        }
        if (f2.getName().indexOf(".pmx") == -1) {
            return 401;
        }
        int errorCode = -1;
        this.excess$ = new ByteInputhelper(new FileInputStream(f2.getAbsolutePath()));
        this._nature();
        this._apply(StatCollector.func_74838_a((String)"Pmx.Load.Begin"));
        this._nature();
        this._apply(StatCollector.func_74838_a((String)"Pmx.Load.Header"));
        this._nature();
        errorCode = this._defects();
        if (errorCode != -1) {
            return errorCode;
        }
        this._nature();
        this._apply(StatCollector.func_74838_a((String)"Pmx.Load.ModelInfo"));
        this._nature();
        this._hearing();
        this._nature();
        this._apply(StatCollector.func_74838_a((String)"Pmx.Load.Vertex"));
        this._nature();
        this._monetary();
        this._calgary();
        this._nature();
        this._apply(StatCollector.func_74838_a((String)"Pmx.Load.Index"));
        this._nature();
        this._ecology();
        this._nature();
        this._apply(StatCollector.func_74838_a((String)"Pmx.Load.Material"));
        this._nature();
        this._strap();
        this._nature();
        this._apply(StatCollector.func_74838_a((String)"Pmx.Load.Texture"));
        this._nature();
        this._banner();
        this._nature();
        this._apply(StatCollector.func_74838_a((String)"Pmx.Load.Bone"));
        this._nature();
        this._lawrence();
        this._fields();
        this._document();
        this._nature();
        this._apply(StatCollector.func_74838_a((String)"Pmx.Load.Morph"));
        this._nature();
        this._unity();
        this._nature();
        this._apply(StatCollector.func_74838_a((String)"Pmx.Load.DisplaySlot"));
        this._nature();
        this._garcia();
        this._nature();
        this._apply(StatCollector.func_74838_a((String)"Pmx.Load.RigidBody"));
        this._nature();
        this._insight();
        this._nature();
        this._apply(StatCollector.func_74838_a((String)"Pmx.Load.Joint"));
        this._nature();
        this._tutorial();
        this._nature();
        this._extra();
        this._guests();
        pfi.pointer$ = this.rural$;
        pfi.linda$ = this.socks$;
        pfi.highs$ = this.priced$;
        pfi.adopt$ = this.takes$;
        pfi.dressing$ = this.crazy$;
        pfi.phantom$ = this.featured$;
        pfi.hydrogen$ = this.missouri$;
        pfi.honest$ = this.reserve$;
        pfi.produce$ = this.mexico$;
        pfi.bottles$ = this.asthma$;
        pfi.feeling$ = this.greater$;
        pfi.visited$ = this.bridal$;
        pfi.discrete$ = this.property$;
        pfi.suffered$ = this.logic$;
        pfi.markets$ = this.color$;
        pfi.hawaii$ = this.involves$;
        pfi.favorite$ = this.before$;
        pfi.belongs$.add(new Geometry("none", null, this.receiver$, this.taste$, this.yukon$));
        pfi.highs$ = this.priced$;
        for (pmxMorph pm : pfi.highs$) {
            if (pm.johnston$.equals("Helmet")) {
                pfi.runner$ = pm;
                pm.strange$ = true;
                continue;
            }
            if (pm.johnston$.equals("Chestplate")) {
                pfi.briefs$ = pm;
                pm.strange$ = true;
                continue;
            }
            if (pm.johnston$.equals("Leggings")) {
                pfi.clicking$ = pm;
                pm.strange$ = true;
                continue;
            }
            if (!pm.johnston$.equals("Boots")) continue;
            pfi.toyota$ = pm;
            pm.strange$ = true;
        }
        this.excess$._atomic();
        return -1;
    }

    private int _defects() throws Exception {
        String verName = this.excess$._beijing() + this.excess$._beijing() + this.excess$._beijing() + this.excess$._beijing() + "";
        verName = "Pmx ";
        float Ver = this.excess$._topics();
        if ((double)Ver != 2.0 && (double)Ver != 2.1) {
            return 402;
        }
        this._apply(verName + Ver);
        char flag = this.excess$._canal();
        this._apply("flag: " + flag);
        this.gilbert$ = this.excess$._canal();
        this._apply("Encoding: " + (this.gilbert$ == 1 ? "UTF-8" : "UTF-16LE"));
        this.realm$ = this.excess$._canal();
        this._apply("Appendix UV: " + this.realm$);
        this.hanging$ = this.excess$._canal();
        this._apply("Vertex Index Size: " + this._bishop(this.hanging$));
        this.multi$ = this.excess$._canal();
        this._apply("Texture Index Size: " + this._bishop(this.multi$));
        this.yield$ = this.excess$._canal();
        this._apply("Material Index Size: " + this._bishop(this.yield$));
        this.nicholas$ = this.excess$._canal();
        this._apply("Bone Index Size: " + this._bishop(this.nicholas$));
        this.custom$ = this.excess$._canal();
        this._apply("Morph Index Size: " + this._bishop(this.custom$));
        this.hygiene$ = this.excess$._canal();
        this._apply("Rigid Body Index Size: " + this._bishop(this.hygiene$));
        return -1;
    }

    private void _hearing() throws Exception {
        this.superior$ = this._venues();
        this._apply("Model Name: " + this.superior$);
        this.chester$ = this._venues();
        this._apply("English Model Name: " + this.chester$);
        this.credits$ = this._venues();
        this._apply("Comment: " + this.credits$);
        this.sought$ = this._venues();
        this._apply("CommentE: " + this.credits$);
    }

    private void _monetary() throws Exception {
        long Vnum = this.excess$._murphy();
        this.hostels$ = new pmxVertex[(int)Vnum];
        int i = 0;
        while ((long)i < Vnum) {
            Object appendixUV = null;
            BoneWeight weight = null;
            if (this.realm$ > 0) {
                appendixUV = new float[this.realm$][];
            }
            float x = this.excess$._topics();
            float y = this.excess$._topics();
            float z = this.excess$._topics();
            float nx = this.excess$._topics();
            float ny = this.excess$._topics();
            float nz = this.excess$._topics();
            float U = this.excess$._topics();
            float V = this.excess$._topics();
            if (appendixUV != null) {
                for (int j = 0; j < this.realm$; ++j) {
                    appendixUV[j] = new float[]{this.excess$._topics(), this.excess$._topics(), this.excess$._topics(), this.excess$._topics()};
                }
            }
            byte weightType = this.excess$._beijing();
            switch (weightType) {
                case 0: {
                    weight = new BDEF(this._utilize(this.nicholas$));
                    break;
                }
                case 1: {
                    weight = new BDEF2(this._utilize(this.nicholas$), this._utilize(this.nicholas$), this.excess$._topics());
                    break;
                }
                case 2: {
                    weight = new BDEF4(this._utilize(this.nicholas$), this._utilize(this.nicholas$), this._utilize(this.nicholas$), this._utilize(this.nicholas$), this.excess$._topics(), this.excess$._topics(), this.excess$._topics(), this.excess$._topics());
                    break;
                }
                case 3: {
                    weight = new SDEF(this._utilize(this.nicholas$), this._utilize(this.nicholas$), this.excess$._topics(), this._leading(), this._leading(), this._leading());
                    break;
                }
            }
            float edgeScale = this.excess$._topics();
            this.hostels$[i] = new pmxVertex(x, y, z, nx, ny, nz, U, V, (float[][])appendixUV, weightType, weight, edgeScale);
            ++i;
        }
        this._apply(Vnum + " Vertices read.");
    }

    private void _ecology() throws Exception {
        int Inum = this.excess$._allied();
        int[] indexs = new int[Inum];
        this.taste$ = new ArrayList();
        for (int i = 0; i < Inum; ++i) {
            indexs[i] = this._utilize(this.hanging$);
        }
        this._apply(Inum + " indexes read.");
        long Fnum = Inum / 3;
        TriangleFace[] Faces = new TriangleFace[(int)Fnum];
        int i = 0;
        while ((long)i < Fnum) {
            int j;
            Faces[i] = new TriangleFace();
            Faces[i].browse$ = new ArrayList();
            Faces[i].honduras$ = new ArrayList();
            for (j = 0; j < 3; ++j) {
                Faces[i].browse$.add(indexs[i * 3 + j]);
            }
            for (j = 0; j < 3; ++j) {
            }
            for (j = 0; j < 3; ++j) {
                Faces[i].honduras$.add(new TextureCoordinate(this.hostels$[indexs[i * 3 + j]].types$, this.hostels$[indexs[i * 3 + j]].adobe$));
            }
            this.taste$.add(Faces[i]);
            ++i;
        }
        this._apply(this.taste$.size() + " Triangle faces read.");
    }

    private void _strap() throws Exception {
        int Mnum = this.excess$._allied();
        this.before$ = new ArrayList();
        for (int i = 0; i < Mnum; ++i) {
            this.before$.add(this._venues());
        }
        this._apply(Mnum + " Materials read.");
    }

    private void _banner() throws Exception {
        int Tnum = (int)this.excess$._murphy();
        this.centers$ = new ArrayList();
        for (int i = 0; i < Tnum; ++i) {
            String name = this._venues();
            String nameE = this._venues();
            float[] diffuse = new float[]{this.excess$._topics(), this.excess$._topics(), this.excess$._topics(), this.excess$._topics()};
            float[] specular = new float[]{this.excess$._topics(), this.excess$._topics(), this.excess$._topics()};
            float specularNum = this.excess$._topics();
            float[] ambient = new float[]{this.excess$._topics(), this.excess$._topics(), this.excess$._topics()};
            char drawingModeFlag = this.excess$._canal();
            float[] edgeColor = new float[]{this.excess$._topics(), this.excess$._topics(), this.excess$._topics(), this.excess$._topics()};
            float edgeSize = this.excess$._topics();
            int textureIndex = this._utilize(this.multi$);
            int sphereIndex = this._utilize(this.multi$);
            char sphereMode = this.excess$._canal();
            boolean defToon = this.excess$._beijing() == 1;
            int toonIndex = defToon ? this.excess$._beijing() : this._utilize(this.multi$);
            String memo = this._venues();
            int fromFaceNumber = this.excess$._allied();
            this.centers$.add(new Texture(name, nameE, diffuse, specular, specularNum, ambient, drawingModeFlag, edgeColor, edgeSize, textureIndex, sphereIndex, sphereMode, defToon, toonIndex, memo, fromFaceNumber));
        }
        this._apply(Tnum + " Textures read.");
    }

    private void _lawrence() throws Exception {
        long Bnum = this.excess$._murphy();
        this.passes$ = new ArrayList();
        this.emily$ = new ArrayList();
        int i = 0;
        while ((long)i < Bnum) {
            int tailId = -1;
            Vector3f tailPos = null;
            int effectId = -1;
            float effectFactor = -1.0f;
            boolean ER = false;
            boolean ET = false;
            Vector3f fixedAxis = null;
            Vector3f localXVector = null;
            Vector3f localZVector = null;
            int externalKey = -1;
            String name = this._venues();
            String nameE = this._venues();
            float[] pos = new float[]{this.excess$._topics(), this.excess$._topics(), this.excess$._topics()};
            int parent = this._utilize(this.nicholas$);
            int layer = this.excess$._allied();
            int flag = this.excess$._meeting();
            if ((flag & 1) != 0) {
                tailId = this._utilize(this.nicholas$);
            } else {
                tailPos = this._leading();
            }
            if ((flag & 0x100) != 0 || (flag & 0x200) != 0) {
                if ((flag & 0x100) != 0) {
                    ER = true;
                }
                if ((flag & 0x200) != 0) {
                    ET = true;
                }
                effectId = this._utilize(this.nicholas$);
                effectFactor = this.excess$._topics();
            }
            if ((flag & 0x400) != 0) {
                fixedAxis = this._leading();
            }
            if ((flag & 0x800) != 0) {
                localXVector = this._leading();
                localZVector = this._leading();
            }
            if ((flag & 0x2000) != 0) {
                externalKey = this.excess$._allied();
            }
            if ((flag & 0x20) != 0) {
                this.emily$.add(this._quite(i));
            }
            pmxBone pb = new pmxBone(name, nameE, pos, parent, layer, flag, tailId, tailPos, effectId, effectFactor, fixedAxis, localXVector, localZVector, externalKey);
            pb.flood$ = ER;
            pb.lesser$ = ET;
            this.passes$.add(pb);
            ++i;
        }
        this._apply(Bnum + " Bones read.");
    }

    private void _unity() throws Exception {
        long Mnum = this.excess$._murphy();
        this.priced$ = new ArrayList();
        int i = 0;
        while ((long)i < Mnum) {
            ArrayList<Integer> morphIndexes = null;
            ArrayList<Float> morphScales = null;
            ArrayList<Integer> vertexIndexes = null;
            ArrayList<Vector3f> vertexTransforms = null;
            ArrayList<Integer> boneIndexes = null;
            ArrayList<Vector3f> boneTransforms = null;
            ArrayList<Quaternion> boneRotations = null;
            ArrayList<Vector4f> UVoffsets = null;
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
            String name = this._venues();
            String nameE = this._venues();
            byte type = this.excess$._beijing();
            byte morphType = this.excess$._beijing();
            int offset_size = this.excess$._allied();
            pmxMorph pm = new pmxMorph(name, nameE, type, morphType, offset_size);
            this.priced$.add(pm);
            switch (morphType) {
                case 0: {
                    if (morphIndexes == null) {
                        morphIndexes = new ArrayList<Integer>();
                    }
                    if (morphScales == null) {
                        morphScales = new ArrayList<Float>();
                    }
                    for (int j = 0; j < offset_size; ++j) {
                        morphIndexes.add(this._utilize(this.custom$));
                        morphScales.add(Float.valueOf(this.excess$._topics()));
                    }
                    pm.released$ = morphIndexes;
                    pm.nintendo$ = morphScales;
                    break;
                }
                case 1: {
                    int j;
                    if (vertexIndexes == null) {
                        vertexIndexes = new ArrayList<Integer>();
                    }
                    if (vertexTransforms == null) {
                        vertexTransforms = new ArrayList<Vector3f>();
                    }
                    ArrayList<Vertex> vs = new ArrayList<Vertex>();
                    for (j = 0; j < offset_size; ++j) {
                        vertexIndexes.add(this._utilize(this.hanging$));
                        vertexTransforms.add(this._leading());
                        Vertex targetV = this.receiver$[(Integer)vertexIndexes.get(vertexIndexes.size() - 1)];
                        vs.add(targetV);
                        if (targetV.passion$ == null) {
                            targetV.passion$ = new ArrayList();
                        }
                        targetV.passion$.add(i);
                        targetV.embassy$ = true;
                        if (targetV.phase$ == null) {
                            targetV.phase$ = new ArrayList();
                        }
                        targetV.phase$.add(vertexTransforms.get(vertexTransforms.size() - 1));
                    }
                    pm.cloth$ = vertexIndexes;
                    pm.lesson$ = vertexTransforms;
                    pm.deborah$ = vs;
                    break;
                }
                case 2: {
                    int j;
                    if (boneIndexes == null) {
                        boneIndexes = new ArrayList<Integer>();
                    }
                    if (boneTransforms == null) {
                        boneTransforms = new ArrayList<Vector3f>();
                    }
                    if (boneRotations == null) {
                        boneRotations = new ArrayList<Quaternion>();
                    }
                    for (j = 0; j < offset_size; ++j) {
                        boneIndexes.add(this._utilize(this.nicholas$));
                        boneTransforms.add(this._leading());
                        boneRotations.add(new Quaternion(this.excess$._topics(), this.excess$._topics(), this.excess$._topics(), this.excess$._topics()));
                    }
                    pm.weapons$ = boneIndexes;
                    pm.lobby$ = boneTransforms;
                    pm.ensure$ = boneRotations;
                    break;
                }
                case 3: {
                    int j;
                    if (vertexIndexes == null) {
                        vertexIndexes = new ArrayList();
                    }
                    if (UVoffsets == null) {
                        UVoffsets = new ArrayList<Vector4f>();
                    }
                    for (j = 0; j < offset_size; ++j) {
                        vertexIndexes.add(this._utilize(this.hanging$));
                        UVoffsets.add(new Vector4f(this.excess$._topics(), this.excess$._topics(), this.excess$._topics(), this.excess$._topics()));
                    }
                    pm.cloth$ = vertexIndexes;
                    pm.easily$ = UVoffsets;
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
                    int j;
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
                    for (j = 0; j < offset_size; ++j) {
                        textureIndexes.add(this._utilize(this.multi$));
                        textureCalcModes.add(this.excess$._beijing());
                        textureDiffuses.add(new float[]{this.excess$._topics(), this.excess$._topics(), this.excess$._topics(), this.excess$._topics()});
                        textureSpeculars.add(new float[]{this.excess$._topics(), this.excess$._topics(), this.excess$._topics()});
                        textureSpecularCoefficients.add(Float.valueOf(this.excess$._topics()));
                        textureAmbients.add(new float[]{this.excess$._topics(), this.excess$._topics(), this.excess$._topics()});
                        textureEdgeColor.add(new float[]{this.excess$._topics(), this.excess$._topics(), this.excess$._topics(), this.excess$._topics()});
                        textureEdgeSize.add(Float.valueOf(this.excess$._topics()));
                        textureCoefficients.add(new float[]{this.excess$._topics(), this.excess$._topics(), this.excess$._topics(), this.excess$._topics()});
                        sphereTextureCoefficients.add(new float[]{this.excess$._topics(), this.excess$._topics(), this.excess$._topics(), this.excess$._topics()});
                        toonTextureCoefficients.add(new float[]{this.excess$._topics(), this.excess$._topics(), this.excess$._topics(), this.excess$._topics()});
                    }
                    pm.covering$ = textureIndexes;
                    pm.patent$ = textureCalcModes;
                    pm.views$ = textureDiffuses;
                    pm.deserve$ = textureSpeculars;
                    pm.brazil$ = textureSpecularCoefficients;
                    pm.packet$ = textureAmbients;
                    pm.pockets$ = textureEdgeColor;
                    pm.posters$ = textureEdgeSize;
                    pm.pension$ = textureCoefficients;
                    pm.cheaper$ = sphereTextureCoefficients;
                    pm.domain$ = toonTextureCoefficients;
                    break;
                }
            }
            ++i;
        }
        this._apply(Mnum + " Morphs read.");
    }

    private void _garcia() throws Exception {
        int Snum = this.excess$._allied();
        this.mercury$ = new ArrayList();
        for (int i = 0; i < Snum; ++i) {
            String name = this._venues();
            String nameE = this._venues();
            byte special = this.excess$._beijing();
            DisplaySlot ds = new DisplaySlot(name, nameE, special);
            this.mercury$.add(ds);
            int displayCount = this.excess$._allied();
            for (int j = 0; j < displayCount; ++j) {
                byte displayType = this.excess$._beijing();
                if (displayType == 0) {
                    ds.hourly$.add(new Object[]{(int)displayType, this._utilize(this.nicholas$)});
                    continue;
                }
                ds.hourly$.add(new Object[]{(int)displayType, this._utilize(this.custom$)});
            }
        }
        this._apply(Snum + " Display Slots read.");
    }

    private void _insight() throws Exception {
        long Rnum = this.excess$._murphy();
        this.takes$ = new ArrayList();
        int i = 0;
        while ((long)i < Rnum) {
            String name = this._venues();
            String nameE = this._venues();
            RigidBody rb = new RigidBody(name);
            rb.frequent$ = this._utilize(this.nicholas$);
            rb.beaver$ = (byte)this.excess$._supports();
            rb.hotel$ = this.excess$._diary();
            rb.lucia$ = this.excess$._supports();
            rb.naples$ = this.excess$._topics();
            rb.filing$ = this.excess$._topics();
            rb.sorts$ = this.excess$._topics();
            rb.nothing$ = this.excess$._topics();
            rb.pleasure$ = this.excess$._topics();
            rb.matching$ = this.excess$._topics();
            Bone b2 = null;
            try {
                b2 = (Bone)this.rural$.get(rb.frequent$);
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                // empty catch block
            }
            if (b2 != null) {
                rb.nothing$ -= b2.humor$;
                rb.pleasure$ -= b2.electric$;
                rb.matching$ -= b2.missile$;
            }
            rb.refuse$ = this.excess$._topics();
            rb.heating$ = this.excess$._topics();
            rb.brands$ = this.excess$._topics();
            rb.waters$ = this.excess$._topics();
            rb.travel$ = this.excess$._topics();
            rb.formerly$ = this.excess$._topics();
            rb.scary$ = this.excess$._topics();
            rb.arabic$ = this.excess$._topics();
            rb.studio$ = this.excess$._supports();
            this.takes$.add(rb);
            if (b2 != null && (rb.studio$ == 1 || rb.studio$ == 2)) {
                b2.config$ = rb.studio$;
            }
            ++i;
        }
        this._apply(Rnum + " Rigid bodies read.");
    }

    private void _tutorial() throws Exception {
        long Pnum = this.excess$._murphy();
        this.crazy$ = new ArrayList();
        int i = 0;
        while ((long)i < Pnum) {
            String name = this._venues();
            String nameE = this._venues();
            if (this.excess$._beijing() == 0) {
                Constraint c2 = new Constraint(name);
                c2.butter$ = this._utilize(this.hygiene$);
                c2.zealand$ = this._utilize(this.hygiene$);
                c2.sunset$ = this.excess$._topics();
                c2.gallery$ = this.excess$._topics();
                c2.serve$ = this.excess$._topics();
                c2.military$ = this.excess$._topics();
                c2.claimed$ = this.excess$._topics();
                c2.viewers$ = this.excess$._topics();
                if (c2.claimed$ > 1.570785f || c2.claimed$ < -1.570785f) {
                    // empty if block
                }
                c2.crimes$ = this.excess$._topics();
                c2.wishes$ = this.excess$._topics();
                c2.visit$ = this.excess$._topics();
                c2.forth$ = this.excess$._topics();
                c2.animated$ = this.excess$._topics();
                c2.except$ = this.excess$._topics();
                c2.mobile$ = this.excess$._topics();
                c2.avatar$ = this.excess$._topics();
                c2.lamps$ = this.excess$._topics();
                c2.compiled$ = this.excess$._topics();
                c2.retain$ = this.excess$._topics();
                c2.lifetime$ = this.excess$._topics();
                c2.spirits$ = this.excess$._topics();
                c2.vegas$ = this.excess$._topics();
                c2.clients$ = this.excess$._topics();
                c2.klein$ = this.excess$._topics();
                c2.porter$ = this.excess$._topics();
                c2.student$ = this.excess$._topics();
                this.crazy$.add(c2);
            }
            ++i;
        }
        this._apply(Pnum + " Joint read.");
    }

    private pmxIK _quite(int endId) throws Exception {
        int targetId = this._utilize(this.nicholas$);
        int loop = this.excess$._allied();
        float limitRadius = this.excess$._topics();
        int count = this.excess$._allied();
        ArrayList<Integer> childsId = new ArrayList<Integer>();
        ArrayList<Boolean> childLimits = new ArrayList<Boolean>();
        ArrayList<Vector3f> childLimitsMin = new ArrayList<Vector3f>();
        ArrayList<Vector3f> childLimitsMax = new ArrayList<Vector3f>();
        for (int i = 0; i < count; ++i) {
            int linkedId = this._utilize(this.nicholas$);
            byte limit = this.excess$._beijing();
            Vector3f limitMin = null;
            Vector3f limitMax = null;
            if (limit == 1) {
                limitMin = this._leading();
                limitMax = this._leading();
            }
            childsId.add(linkedId);
            childLimits.add(limit == 1);
            childLimitsMin.add(limitMin);
            childLimitsMax.add(limitMax);
        }
        return new pmxIK(endId, targetId, loop, limitRadius, childsId, childLimits, childLimitsMin, childLimitsMax);
    }

    private void _fields() {
        for (int i = 0; i < this.emily$.size(); ++i) {
            pmxIK pik = (pmxIK)this.emily$.get(i);
            pik.exciting$ = (pmxBone)this.passes$.get(pik.early$);
            pik.denial$ = (pmxBone)this.passes$.get(pik.primary$);
            pik.stores$ = new ArrayList();
            for (int j = 0; j < pik.rewards$.size(); ++j) {
                pik.stores$.add(this.passes$.get((Integer)pik.rewards$.get(j)));
            }
        }
        this._apply(this.emily$.size() + " IK read.");
    }

    private void _calgary() {
        this.receiver$ = new Vertex[this.hostels$.length];
        for (int i = 0; i < this.hostels$.length; ++i) {
            pmxVertex xv = this.hostels$[i];
            int b0 = -1;
            int b1 = -1;
            Object bw = null;
            if (xv.claire$ instanceof SDEF) {
                SDEF sdef = (SDEF)xv.claire$;
                Vector3f sdefRWv = sdef.d()._survival(sdef.a())._approval(sdef.e()._survival(1.0f - sdef.a()));
                Vector3f sdefRW0 = sdef.d()._based(sdefRWv);
                Vector3f sdefRW1 = sdef.e()._based(sdefRWv);
                sdef.a(sdefRW0);
                sdef.b(sdefRW1);
            }
            this.receiver$[i] = new Vertex(xv.freeware$, xv.reward$, xv.beach$, xv.performs$, xv.reached$, xv.spend$, xv.types$, xv.adobe$, xv.salmon$, xv.claire$, false);
        }
    }

    private void _extra() {
        this.yukon$ = new ArrayList();
        for (int i = 0; i < this.centers$.size(); ++i) {
            Texture t = (Texture)this.centers$.get(i);
            String mat = null;
            mat = t.deaths$ < 0 || t.deaths$ == this.before$.size() ? null : (String)this.before$.get(t.deaths$);
            if (t.dryer$ != -1 && t.dryer$ != this.before$.size()) {
                mat = mat + "*" + (String)this.before$.get(t.dryer$);
            }
            Material material = new Material(t.designs$[0], t.designs$[1], t.designs$[2], t.designs$[3], 0.0f, t.harrison$[0], t.harrison$[1], t.harrison$[2], t.state$[0], t.state$[1], t.state$[2], t.mistress$, t.eternal$, t.roberts$, false, t.beverly$, mat);
            material.sticks$ = t.suitable$;
            if (t.plaza$.indexOf("/spe") > -1) {
                material.authors$ = true;
            }
            if (t.plaza$.indexOf("/light") > -1) {
                material.petition$ = true;
            }
            if (t.plaza$.indexOf("/notCull") > -1) {
                material.bikini$ = true;
            }
            this.yukon$.add(material);
        }
    }

    private void _document() {
        this.rural$ = new ArrayList();
        for (int i = 0; i < this.passes$.size(); ++i) {
            pmxBone b2 = (pmxBone)this.passes$.get(i);
            int type = b2.notes$;
            if (b2.flood$) {
                type = 5;
            }
            if ((b2.woman$ & 2) >> 1 == 1 && (b2.woman$ & 4) >> 2 == 1) {
                type = 1;
            }
            if ((b2.woman$ & 0x20) >> 5 == 1 || (b2.woman$ & 0x80) >> 7 == 1) {
                type = 2;
            }
            Bone pmdB = new Bone(b2.matthew$, b2.traveler$, 0, type, b2.absent$, b2.villages$[0], b2.villages$[1], b2.villages$[2], b2.shuttle$);
            this.rural$.add(pmdB);
            String name = b2.matthew$;
            if (name.contains("\u3072\u3056")) {
                ((Bone)this.rural$.get((int)(this.rural$.size() - 1))).visual$ = true;
                continue;
            }
            if (name.equals("\u982d") || name.equals("Head")) {
                this.missouri$ = (Bone)this.rural$.get(this.rural$.size() - 1);
                continue;
            }
            if (name.equals("\u9996")) {
                this.reserve$ = (Bone)this.rural$.get(this.rural$.size() - 1);
                continue;
            }
            if (name.equals("\u4e0a\u534a\u8eab") || name.equals("UpperBody")) {
                this.mexico$ = (Bone)this.rural$.get(this.rural$.size() - 1);
                continue;
            }
            if (name.equals("\u4e0a\u534a\u8eab2") || name.equals("UpperBody2")) {
                this.asthma$ = (Bone)this.rural$.get(this.rural$.size() - 1);
                continue;
            }
            if (name.equals("\u4e0b\u534a\u8eab") || name.equals("LowerBody")) {
                this.greater$ = (Bone)this.rural$.get(this.rural$.size() - 1);
                continue;
            }
            if (name.equals("\u5de6\u8155")) {
                this.bridal$ = (Bone)this.rural$.get(this.rural$.size() - 1);
                continue;
            }
            if (name.equals("\u53f3\u8155")) {
                this.property$ = (Bone)this.rural$.get(this.rural$.size() - 1);
                continue;
            }
            if (name.equals("Camera")) {
                this.logic$ = (Bone)this.rural$.get(this.rural$.size() - 1);
                continue;
            }
            if (name.equals("itemR")) {
                this.featured$ = (Bone)this.rural$.get(this.rural$.size() - 1);
                continue;
            }
            if (name.equals("Back")) {
                this.color$ = (Bone)this.rural$.get(this.rural$.size() - 1);
                continue;
            }
            if (!name.equals("\u30b0\u30ea\u30c3\u30d7")) continue;
            this.involves$ = (Bone)this.rural$.get(this.rural$.size() - 1);
        }
    }

    private void _guests() {
        this.socks$ = new ArrayList();
        for (int i = 0; i < this.emily$.size(); ++i) {
            pmxIK k = (pmxIK)this.emily$.get(i);
            ArrayList b2 = new ArrayList();
            for (int j = 0; j < k.rewards$.size(); ++j) {
                b2.add(this.rural$.get((Integer)k.rewards$.get(j)));
            }
            IK pmdik = new IK((Bone)this.rural$.get(k.early$), (Bone)this.rural$.get(k.primary$), k.americas$, k.samuel$, k.rewards$, b2, k.early$, k.primary$);
            pmdik.rugby$ = k.amounts$;
            pmdik.marble$ = k.movement$;
            pmdik.romance$ = k.absence$;
            this.socks$.add(pmdik);
        }
    }

    private Vector3f _leading() throws Exception {
        return new Vector3f(this.excess$._topics(), this.excess$._topics(), this.excess$._topics());
    }

    private int _utilize(int type) throws Exception {
        switch (type) {
            case 1: {
                int ubyte = this.excess$._supports();
                return ubyte == 255 ? -1 : ubyte;
            }
            case 2: {
                return this.excess$._delta();
            }
            case 4: {
                return this.excess$._allied();
            }
        }
        return -1;
    }

    private String _venues() throws Exception {
        String sa = new String(this.excess$._salvador(0, this.excess$._allied()), this.gilbert$ == 1 ? "UTF-8" : "UTF-16LE");
        return new String(sa.getBytes(this.gilbert$ == 1 ? "UTF-8" : "UTF-16LE"), this.gilbert$ == 1 ? "UTF-8" : "UTF-16LE");
    }

    private String _bishop(int type) {
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

    public void _nature() {
        if (Config.struct$) {
            System.out.println("------------------------------");
        }
    }

    public void _apply(Object s) {
        if (Config.struct$) {
            System.out.println(s + "");
        }
    }
}

