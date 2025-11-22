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
import net.minecraft.util.StatCollector;

public class PmdLoader {
    private PmdFileInfo pasta$;
    private ByteInputhelper ranking$;
    private Vertex[] swimming$;
    private ArrayList craig$;
    private ArrayList trouble$;
    private ArrayList council$;
    private ArrayList shared$;
    private ArrayList damages$;
    private ArrayList dream$;
    private ArrayList antonio$;
    private ArrayList holdem$;
    private Bone provider$;
    private Bone indie$;
    private Bone pearl$;
    private Bone three$;
    private Bone thumbs$;
    private Bone randy$;
    private Bone arrested$;
    private Bone funky$;
    private Bone restrict$;
    private Bone defence$;
    private ArrayList counters$;

    public int _magic(File f2, PmdFileInfo pfi) throws Exception {
        this.pasta$ = pfi;
        if (f2 == null || !f2.exists()) {
            return 404;
        }
        if (f2.getName().indexOf(".pmd") == -1) {
            return 401;
        }
        int errorCode = -1;
        this.ranking$ = new ByteInputhelper(new FileInputStream(f2.getAbsolutePath()));
        this._stolen();
        this._killed(StatCollector.func_74838_a((String)"Pmd.Load.Begin"));
        this._stolen();
        this._killed(StatCollector.func_74838_a((String)"Pmd.Load.Header"));
        this._stolen();
        errorCode = this._accounts();
        if (errorCode != -1) {
            return errorCode;
        }
        this._stolen();
        this._killed(StatCollector.func_74838_a((String)"Pmd.Load.ModelHead"));
        this._stolen();
        this._comments();
        this._stolen();
        this._killed(StatCollector.func_74838_a((String)"Pmd.Load.Vertex"));
        this._stolen();
        this._thong();
        this._stolen();
        this._killed(StatCollector.func_74838_a((String)"Pmd.Load.Index"));
        this._stolen();
        this._figure();
        this._stolen();
        this._killed(StatCollector.func_74838_a((String)"Pmd.Load.Material"));
        this._stolen();
        this._sailing();
        this._stolen();
        this._killed(StatCollector.func_74838_a((String)"Pmd.Load.Bone"));
        this._stolen();
        this._oriental();
        this._stolen();
        this._killed(StatCollector.func_74838_a((String)"Pmd.Load.IK"));
        this._stolen();
        this._chile();
        this._stolen();
        this._killed(StatCollector.func_74838_a((String)"Pmd.Load.Face"));
        this._stolen();
        this._kelly();
        this._stolen();
        this._killed(StatCollector.func_74838_a((String)"Pmd.Load.NamesFace"));
        this._stolen();
        this._advisory();
        this._stolen();
        this._killed(StatCollector.func_74838_a((String)"Pmd.Load.NamesBoneGroup"));
        this._stolen();
        this._telecom();
        this._stolen();
        this._killed(StatCollector.func_74838_a((String)"Pmd.Load.NamesBone"));
        this._stolen();
        this._anaheim();
        this._stolen();
        this._killed(StatCollector.func_74838_a((String)"Pmd.Load.EnglishHeader"));
        boolean Emode = false;
        Emode = this.ranking$._smoke();
        this._killed(Emode ? StatCollector.func_74838_a((String)"Pmd.Load.EnglishFound") : StatCollector.func_74838_a((String)"Pmd.Load.EnglishNotFound"));
        this._stolen();
        if (Emode) {
            this._manitoba();
            this._stolen();
            this._killed(StatCollector.func_74838_a((String)"Pmd.Load.EnglishBone"));
            this._stolen();
            this._civic();
            this._stolen();
            this._killed(StatCollector.func_74838_a((String)"Pmd.Load.EnglishFace"));
            this._stolen();
            this._brand();
            this._stolen();
            this._killed(StatCollector.func_74838_a((String)"Pmd.Load.EnglishBoneGroup"));
            this._stolen();
            this._emphasis();
            this._stolen();
        }
        this._killed(StatCollector.func_74838_a((String)"Pmd.Load.Toon"));
        this._stolen();
        this._phone();
        this._stolen();
        this._killed(StatCollector.func_74838_a((String)"Pmd.Load.Rigid"));
        this._stolen();
        this._prevent();
        this._stolen();
        this._killed(StatCollector.func_74838_a((String)"Pmd.Load.Physics"));
        this._stolen();
        this._gregory();
        this._stolen();
        pfi.pointer$ = this.council$;
        pfi.linda$ = this.antonio$;
        pfi.highs$ = this.shared$;
        pfi.adopt$ = this.counters$;
        pfi.dressing$ = this.holdem$;
        pfi.phantom$ = this.restrict$;
        pfi.honest$ = this.indie$;
        pfi.hydrogen$ = this.provider$;
        pfi.produce$ = this.pearl$;
        pfi.bottles$ = this.three$;
        pfi.feeling$ = this.thumbs$;
        pfi.visited$ = this.randy$;
        pfi.discrete$ = this.arrested$;
        pfi.suffered$ = this.funky$;
        pfi.markets$ = this.defence$;
        pfi.favorite$ = this.dream$;
        pfi.belongs$.add(new Geometry("none", null, this.swimming$, this.craig$, this.trouble$));
        this.ranking$._atomic();
        return -1;
    }

    public int _accounts() throws Exception {
        String verName = this.ranking$._beijing() + this.ranking$._beijing() + this.ranking$._beijing() + "";
        verName = "Pmd";
        float Ver = this.ranking$._topics();
        if ((double)Ver != 1.0) {
            return 402;
        }
        this._killed(verName + " " + Ver);
        return -1;
    }

    public void _comments() throws Exception {
        String name = new String(this._pumps(this.ranking$._salvador(0, 20)));
        String comment = new String(this._pumps(this.ranking$._salvador(0, 256)));
        this.pasta$.menus$ = name;
        this.pasta$.column$ = comment.replace('\r', ' ').replace('\u3000', ' ');
        this._killed("Model name: " + name);
        this._killed(comment);
    }

    public void _thong() throws Exception {
        long Vnum = this.ranking$._murphy();
        this.swimming$ = new Vertex[(int)Vnum];
        int i = 0;
        while ((long)i < Vnum) {
            float x = this.ranking$._topics();
            float y = this.ranking$._topics();
            float z = this.ranking$._topics();
            float nx = this.ranking$._topics();
            float ny = this.ranking$._topics();
            float nz = this.ranking$._topics();
            float U = this.ranking$._topics();
            float V = this.ranking$._topics();
            int b0 = this.ranking$._delta();
            int b1 = this.ranking$._delta();
            float bw = this.ranking$._beijing();
            boolean ef = this.ranking$._smoke();
            BoneWeight vbw = null;
            int vbwtype = 0;
            if (b1 != 0) {
                vbwtype = 1;
                vbw = new BDEF2(b0, b1, bw / 100.0f);
            } else {
                vbw = new BDEF(b0);
            }
            this.swimming$[i] = new Vertex(x, y, z, nx, ny, nz, U, V, vbwtype, vbw, ef);
            ++i;
        }
        this._killed(Vnum + " Vertices read.");
    }

    public void _figure() throws Exception {
        long Inum = this.ranking$._murphy();
        int[] indexs = new int[(int)Inum];
        this.craig$ = new ArrayList();
        int i = 0;
        while ((long)i < Inum) {
            indexs[i] = this.ranking$._delta();
            ++i;
        }
        this._killed(Inum + " indexes read.");
        long Fnum = Inum / 3L;
        TriangleFace[] Faces = new TriangleFace[(int)Fnum];
        int i2 = 0;
        while ((long)i2 < Fnum) {
            int j;
            Faces[i2] = new TriangleFace();
            Faces[i2].browse$ = new ArrayList();
            Faces[i2].honduras$ = new ArrayList();
            for (j = 0; j < 3; ++j) {
                Faces[i2].browse$.add(indexs[i2 * 3 + j]);
            }
            for (j = 0; j < 3; ++j) {
            }
            for (j = 0; j < 3; ++j) {
                Faces[i2].honduras$.add(new TextureCoordinate(this.swimming$[indexs[i2 * 3 + j]].poker$, this.swimming$[indexs[i2 * 3 + j]].entirely$));
            }
            this.craig$.add(Faces[i2]);
            ++i2;
        }
        this._killed(this.craig$.size() + " Triangle faces read.");
    }

    public void _sailing() throws Exception {
        long Mnum = this.ranking$._murphy();
        this.trouble$ = new ArrayList();
        int i = 0;
        while ((long)i < Mnum) {
            float dR = this.ranking$._topics();
            float dG = this.ranking$._topics();
            float dB = this.ranking$._topics();
            float dA = this.ranking$._topics();
            float S = this.ranking$._topics();
            float sR = this.ranking$._topics();
            float sG = this.ranking$._topics();
            float sB = this.ranking$._topics();
            float aR = this.ranking$._topics();
            float aG = this.ranking$._topics();
            float aB = this.ranking$._topics();
            byte toon = this.ranking$._beijing();
            boolean ef = this.ranking$._smoke();
            long indices = this.ranking$._murphy();
            boolean defToon = false;
            String file = new String(this._pumps(this.ranking$._salvador(0, 20)));
            this.trouble$.add(new Material(dR, dG, dB, dA, S, sR, sG, sB, aR, aG, aB, 2, defToon, toon, ef, indices, file));
            ++i;
        }
        this._killed(Mnum + " Materials read.");
    }

    public void _oriental() throws IOException {
        int Bnum = this.ranking$._delta();
        this.council$ = new ArrayList();
        this.restrict$ = null;
        this.provider$ = null;
        for (int i = 0; i < Bnum; ++i) {
            int target = -1;
            String name = new String(this._pumps(this.ranking$._salvador(0, 20)));
            short parent = this.ranking$._handled();
            short child = this.ranking$._handled();
            byte type = this.ranking$._beijing();
            target = this.ranking$._handled();
            float x = this.ranking$._topics();
            float y = this.ranking$._topics();
            float z = this.ranking$._topics();
            this.council$.add(new Bone(name, parent, child, type, target, x, y, z, 0.0f));
            if (name.contains("\u3072\u3056")) {
                ((Bone)this.council$.get((int)(this.council$.size() - 1))).visual$ = true;
                continue;
            }
            if (name.equals("\u982d") || name.equals("Head")) {
                this.provider$ = (Bone)this.council$.get(this.council$.size() - 1);
                continue;
            }
            if (name.equals("\u9996")) {
                this.indie$ = (Bone)this.council$.get(this.council$.size() - 1);
                continue;
            }
            if (name.equals("\u4e0a\u534a\u8eab") || name.equals("UpperBody")) {
                this.pearl$ = (Bone)this.council$.get(this.council$.size() - 1);
                continue;
            }
            if (name.equals("\u4e0a\u534a\u8eab2") || name.equals("UpperBody2")) {
                this.three$ = (Bone)this.council$.get(this.council$.size() - 1);
                continue;
            }
            if (name.equals("\u4e0b\u534a\u8eab") || name.equals("LowerBody")) {
                this.thumbs$ = (Bone)this.council$.get(this.council$.size() - 1);
                continue;
            }
            if (name.equals("\u5de6\u8155")) {
                this.randy$ = (Bone)this.council$.get(this.council$.size() - 1);
                continue;
            }
            if (name.equals("\u53f3\u8155")) {
                this.arrested$ = (Bone)this.council$.get(this.council$.size() - 1);
                continue;
            }
            if (name.equals("Camera")) {
                this.funky$ = (Bone)this.council$.get(this.council$.size() - 1);
                continue;
            }
            if (name.equals("itemR")) {
                this.restrict$ = (Bone)this.council$.get(this.council$.size() - 1);
                continue;
            }
            if (!name.equals("Back")) continue;
            this.defence$ = (Bone)this.council$.get(this.council$.size() - 1);
        }
        this._killed(Bnum + " Bones read.");
    }

    public void _chile() throws Exception {
        int IKnum = this.ranking$._delta();
        this.antonio$ = new ArrayList();
        for (int i = 0; i < IKnum; ++i) {
            int index = this.ranking$._delta();
            int indexEnd = this.ranking$._delta();
            int linksNum = this.ranking$._supports();
            int maxNum = this.ranking$._delta();
            float value = this.ranking$._topics();
            int[] ichilds = new int[linksNum];
            ArrayList childs = new ArrayList();
            for (int j = 0; j < linksNum; ++j) {
                ichilds[j] = this.ranking$._delta();
            }
            ArrayList<Integer> childID = new ArrayList<Integer>();
            for (int j = 0; j < ichilds.length; ++j) {
                childs.add(this.council$.get(ichilds[j]));
                childID.add(ichilds[j]);
            }
            this.antonio$.add(new IK((Bone)this.council$.get(index), (Bone)this.council$.get(indexEnd), maxNum, value * 4.0f, childID, childs, index, indexEnd));
        }
        this._killed(IKnum + " IK read.");
    }

    public void _kelly() throws Exception {
        int Fnum = this.ranking$._delta();
        ArrayList<Vertex> base = null;
        this.shared$ = new ArrayList();
        for (int i = 0; i < Fnum; ++i) {
            String name = new String(this._pumps(this.ranking$._salvador(0, 20)));
            long verticesNum = this.ranking$._murphy();
            int type = this.ranking$._supports();
            ArrayList<Vertex> vs = new ArrayList<Vertex>();
            ArrayList<Vector3f> max = new ArrayList<Vector3f>();
            pmxMorph pm = null;
            if (i != 0) {
                pm = new pmxMorph(name, null, type, 1, verticesNum);
            }
            int j = 0;
            while ((long)j < verticesNum) {
                Vertex targetV;
                long index = this.ranking$._murphy();
                float x = this.ranking$._topics();
                float y = this.ranking$._topics();
                float z = this.ranking$._topics();
                if (i == 0) {
                    targetV = this.swimming$[(int)index];
                    vs.add(targetV);
                } else {
                    ArrayList vertexIndexes = new ArrayList();
                    ArrayList vertexTransforms = new ArrayList();
                    targetV = (Vertex)base.get((int)index);
                    vs.add(targetV);
                    if (targetV.passion$ == null) {
                        targetV.passion$ = new ArrayList();
                    }
                    targetV.passion$.add(this.shared$.size());
                    targetV.embassy$ = true;
                    if (targetV.phase$ == null) {
                        targetV.phase$ = new ArrayList();
                    }
                    targetV.phase$.add(new Vector3f(x, y, z));
                }
                max.add(new Vector3f(x, y, z));
                ++j;
            }
            if (i == 0) {
                base = vs;
                continue;
            }
            pm.deborah$ = vs;
            pm.lesson$ = max;
            this.shared$.add(pm);
        }
        this._killed(Fnum + " Faces read.");
    }

    public void _advisory() throws Exception {
        int NFnum = this.ranking$._supports();
        for (int i = 0; i < NFnum; ++i) {
            int n = this.ranking$._delta();
        }
        this._killed(NFnum + " face name read.");
    }

    public void _telecom() throws Exception {
        int NBGnum = this.ranking$._supports();
        this.damages$ = new ArrayList();
        for (int i = 0; i < NBGnum; ++i) {
            String name = new String(this._pumps(this.ranking$._salvador(0, 50)));
            this.damages$.add(name);
        }
        this._killed(NBGnum + " bone group name read.");
    }

    public void _anaheim() throws Exception {
        long NBnum = this.ranking$._murphy();
        int i = 0;
        while ((long)i < NBnum) {
            int index = this.ranking$._delta();
            int n = this.ranking$._supports();
            ++i;
        }
        this._killed(NBnum + " displayed bone read.");
    }

    public void _manitoba() throws Exception {
        String Mname = new String(this._pumps(this.ranking$._salvador(0, 20)));
        String comment = new String(this._pumps(this.ranking$._salvador(0, 256)));
        this._killed("Model name: " + Mname);
        this._killed(comment);
    }

    public void _civic() throws Exception {
        for (int i = 0; i < this.council$.size(); ++i) {
            String string = new String(this._pumps(this.ranking$._salvador(0, 20)));
        }
        this._killed(this.council$.size() + " Bone english name read.");
    }

    public void _brand() throws Exception {
        for (int i = 0; i < this.shared$.size(); ++i) {
            String name;
            ((pmxMorph)this.shared$.get((int)i)).mapping$ = name = new String(this._pumps(this.ranking$._salvador(0, 20)));
        }
        this._killed(this.shared$.size() + " Face english name read.");
    }

    public void _emphasis() throws Exception {
        for (int i = 0; i < this.damages$.size(); ++i) {
            String string = new String(this._pumps(this.ranking$._salvador(0, 50)));
        }
        this._killed(this.damages$.size() + " Bone group english name read.");
    }

    public void _phone() throws Exception {
        this.dream$ = new ArrayList();
        for (int i = 0; i < 10; ++i) {
            String file = new String(this._pumps(this.ranking$._salvador(0, 100)));
            this.dream$.add(file);
        }
        this._killed("10 Toon texture read.");
    }

    public void _prevent() throws Exception {
        long Rnum = this.ranking$._murphy();
        this.counters$ = new ArrayList();
        int i = 0;
        while ((long)i < Rnum) {
            String name = new String(this._pumps(this.ranking$._salvador(0, 20)));
            RigidBody rb = new RigidBody(name);
            rb.frequent$ = this.ranking$._delta();
            rb.beaver$ = (byte)this.ranking$._supports();
            rb.hotel$ = (short)this.ranking$._diary();
            rb.lucia$ = this.ranking$._supports();
            rb.naples$ = this.ranking$._topics();
            rb.filing$ = this.ranking$._topics();
            rb.sorts$ = this.ranking$._topics();
            rb.nothing$ = this.ranking$._topics();
            rb.pleasure$ = this.ranking$._topics();
            rb.matching$ = this.ranking$._topics();
            rb.refuse$ = this.ranking$._topics();
            rb.heating$ = this.ranking$._topics();
            rb.brands$ = this.ranking$._topics();
            rb.waters$ = this.ranking$._topics();
            rb.travel$ = this.ranking$._topics();
            rb.formerly$ = this.ranking$._topics();
            rb.scary$ = this.ranking$._topics();
            rb.arabic$ = this.ranking$._topics();
            rb.studio$ = this.ranking$._supports();
            this.counters$.add(rb);
            if (rb.studio$ == 1 || rb.studio$ == 2) {
                ((Bone)this.council$.get((int)rb.frequent$)).config$ = rb.studio$;
            }
            ++i;
        }
        this._killed(Rnum + " Rigid read.");
    }

    public void _gregory() throws Exception {
        long Pnum = this.ranking$._murphy();
        this.holdem$ = new ArrayList();
        int i = 0;
        while ((long)i < Pnum) {
            String name = new String(this._pumps(this.ranking$._salvador(0, 20)));
            Constraint c2 = new Constraint(name);
            c2.butter$ = this.ranking$._murphy();
            c2.zealand$ = this.ranking$._murphy();
            c2.sunset$ = this.ranking$._topics();
            c2.gallery$ = this.ranking$._topics();
            c2.serve$ = this.ranking$._topics();
            c2.military$ = this.ranking$._topics();
            c2.claimed$ = this.ranking$._topics();
            c2.viewers$ = this.ranking$._topics();
            c2.crimes$ = this.ranking$._topics();
            c2.wishes$ = this.ranking$._topics();
            c2.visit$ = this.ranking$._topics();
            c2.forth$ = this.ranking$._topics();
            c2.animated$ = this.ranking$._topics();
            c2.except$ = this.ranking$._topics();
            c2.mobile$ = this.ranking$._topics();
            c2.avatar$ = this.ranking$._topics();
            c2.lamps$ = this.ranking$._topics();
            c2.compiled$ = this.ranking$._topics();
            c2.retain$ = this.ranking$._topics();
            c2.lifetime$ = this.ranking$._topics();
            c2.spirits$ = this.ranking$._topics();
            c2.vegas$ = this.ranking$._topics();
            c2.clients$ = this.ranking$._topics();
            c2.klein$ = this.ranking$._topics();
            c2.porter$ = this.ranking$._topics();
            c2.student$ = this.ranking$._topics();
            this.holdem$.add(c2);
            ++i;
        }
        this._killed(Pnum + " Physics constraint read.");
    }

    public void _stolen() {
        if (Config.struct$) {
            System.out.println("------------------------------");
        }
    }

    public void _killed(Object s) {
        if (Config.struct$) {
            System.out.println(s + "");
        }
    }

    private String _pumps(byte[] s) throws UnsupportedEncodingException {
        int l = 0;
        for (int i = 0; i < s.length; ++i) {
            if (s[i] != 0) continue;
            l = i;
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

