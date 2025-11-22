/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class Geometry {
    public String examples$;
    public Vertex[] issues$;
    public Vertex[] relative$;
    public Vertex[] domestic$;
    public ArrayList signup$;
    public int homes$;
    public ArrayList found$;

    public Geometry(String ID, Vertex[] vn, Vertex[] v, ArrayList f2, int m) {
        this.homes$ = m;
        this.examples$ = ID;
        this.relative$ = vn;
        this.domestic$ = v;
        this.issues$ = new Vertex[v.length];
        for (int i = 0; i < v.length; ++i) {
            this.issues$[i] = new Vertex(v[i]);
        }
        this.signup$ = f2;
    }

    public Geometry(String ID, Vertex[] vn, Vertex[] v, ArrayList f2, ArrayList m) {
        this.found$ = m;
        this.examples$ = ID;
        this.relative$ = vn;
        this.domestic$ = v;
        this.issues$ = new Vertex[v.length];
        for (int i = 0; i < v.length; ++i) {
            this.issues$[i] = new Vertex(v[i]);
        }
        this.signup$ = f2;
    }

    public void _large() {
        int faceNum = this.signup$.size();
        TriangleFace[] faces = new TriangleFace[faceNum];
        for (int i = 0; i < faceNum; ++i) {
            faces[i] = new TriangleFace();
            faces[i].honduras$ = ((TriangleFace)this.signup$.get((int)i)).honduras$;
            for (int j = 0; j < 3; ++j) {
            }
            faces[i].played$ = ((TriangleFace)this.signup$.get((int)i)).played$;
        }
    }
}

