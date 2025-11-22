/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.Tessellator
 *  net.minecraftforge.client.model.obj.Vertex
 */
import java.util.ArrayList;
import net.minecraft.client.renderer.Tessellator;

public class Vertex {
    public float writes$;
    public float shower$;
    public float colors$;
    public float sudan$;
    public float applying$;
    public float quantity$;
    public float poker$;
    public float entirely$;
    public int crest$;
    public BoneWeight forecast$;
    public boolean mariah$;
    public byte cohen$;
    public boolean embassy$ = false;
    public ArrayList passion$;
    public ArrayList phase$;

    public Vertex(float x, float y) {
        this(x, y, 0.0f);
    }

    public Vertex(Vertex v) {
        this.writes$ = v.writes$;
        this.shower$ = v.shower$;
        this.colors$ = v.colors$;
        this.sudan$ = v.sudan$;
        this.applying$ = v.applying$;
        this.quantity$ = v.quantity$;
        this.poker$ = v.poker$;
        this.entirely$ = v.entirely$;
        this.crest$ = v.crest$;
        this.forecast$ = v.forecast$;
        this.mariah$ = v.mariah$;
        this.embassy$ = v.embassy$;
        if (v.passion$ != null) {
            this.passion$ = new ArrayList(v.passion$);
        }
        if (v.phase$ != null) {
            this.phase$ = new ArrayList(v.phase$);
        }
    }

    public Vertex(float x, float y, float z) {
        this.writes$ = x;
        this.shower$ = y;
        this.colors$ = z;
    }

    public Vertex(float x, float y, float z, float nx, float ny, float nz, float U, float V, int weightType, BoneWeight boneWeight, boolean ef) {
        this.crest$ = -1;
        this.writes$ = x;
        this.shower$ = y;
        this.colors$ = z;
        this.sudan$ = nx;
        this.applying$ = ny;
        this.quantity$ = nz;
        this.poker$ = U;
        this.entirely$ = V;
        this.crest$ = weightType;
        this.forecast$ = boneWeight;
        this.mariah$ = ef;
    }

    public void _annually(Tessellator tessellator, float textureOffset) {
        textureOffset = 0.005f;
        tessellator.func_78375_b(this.sudan$, this.applying$, this.quantity$);
        float offsetU = textureOffset;
        float offsetV = textureOffset;
        tessellator.func_78374_a((double)this.writes$, (double)this.shower$, (double)this.colors$, (double)(this.poker$ + offsetU), (double)(this.entirely$ + offsetV));
    }

    public net.minecraftforge.client.model.obj.Vertex _insider() {
        return new net.minecraftforge.client.model.obj.Vertex(this.writes$, this.shower$, this.colors$);
    }
}

