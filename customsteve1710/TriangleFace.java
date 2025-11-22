/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.Tessellator
 *  net.minecraft.util.Vec3
 *  org.lwjgl.opengl.ARBMultitexture
 *  org.lwjgl.opengl.GL11
 */
import java.util.ArrayList;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.Vec3;
import org.lwjgl.opengl.ARBMultitexture;
import org.lwjgl.opengl.GL11;

public class TriangleFace {
    public int played$ = -1;
    public boolean backed$ = false;
    public ArrayList browse$;
    public ArrayList honduras$;
    private ArrayList defeat$;

    public void _concerns(Vertex[] vb) {
        this.defeat$ = new ArrayList();
        for (int i = 0; i < this.browse$.size(); ++i) {
            int index = (Integer)this.browse$.get(i);
            this.defeat$.add(vb[index]);
        }
    }

    public Vertex _clear(ArrayList vertexBuffer) {
        Vec3 v1 = Vec3.func_72443_a((double)(((Vertex)vertexBuffer.get((int)1)).writes$ - ((Vertex)vertexBuffer.get((int)0)).writes$), (double)(((Vertex)vertexBuffer.get((int)1)).shower$ - ((Vertex)vertexBuffer.get((int)0)).shower$), (double)(((Vertex)vertexBuffer.get((int)1)).colors$ - ((Vertex)vertexBuffer.get((int)0)).colors$));
        Vec3 v2 = Vec3.func_72443_a((double)(((Vertex)vertexBuffer.get((int)2)).writes$ - ((Vertex)vertexBuffer.get((int)0)).writes$), (double)(((Vertex)vertexBuffer.get((int)2)).shower$ - ((Vertex)vertexBuffer.get((int)0)).shower$), (double)(((Vertex)vertexBuffer.get((int)2)).colors$ - ((Vertex)vertexBuffer.get((int)0)).colors$));
        Vec3 normalVector = null;
        normalVector = v1.func_72431_c(v2).func_72432_b();
        return new Vertex((float)normalVector.field_72450_a, (float)normalVector.field_72448_b, (float)normalVector.field_72449_c);
    }

    public void _seemed() {
        for (Vertex v : this.defeat$) {
            GL11.glNormal3f((float)v.sudan$, (float)v.applying$, (float)v.quantity$);
            float f2 = 0.5f * (1.0f - new Vector3f(5.0f, 10.0f, -5.0f)._intel(v.sudan$, v.applying$, v.quantity$));
            Vector2f spaCoord = new Vector2f(v.sudan$, v.applying$)._shopping(new Vector2f(1.0f, 1.0f))._result(0.5f);
            ARBMultitexture.glMultiTexCoord2fARB((int)33984, (float)v.poker$, (float)v.entirely$);
            ARBMultitexture.glMultiTexCoord2fARB((int)33986, (float)0.0f, (float)f2);
            ARBMultitexture.glMultiTexCoord2fARB((int)33987, (float)spaCoord.removing$, (float)spaCoord.writings$);
            GL11.glVertex3f((float)v.writes$, (float)v.shower$, (float)v.colors$);
        }
    }

    public void _survive(Vector3f[][] vertexBuffer, Tessellator tessellator, Vector3f viewTrans) {
        this._europe(vertexBuffer, tessellator, 5.0E-4f, viewTrans);
    }

    public void _europe(Vector3f[][] vertexBuffer, Tessellator tessellator, float textureOffset, Vector3f viewTrans) {
        for (int i = 0; i < this.browse$.size(); ++i) {
            int index = (Integer)this.browse$.get(i);
            Vector3f v = vertexBuffer[index][0];
            Vector3f nv = vertexBuffer[index][1];
            if (v == null) {
                return;
            }
            GL11.glNormal3f((float)nv.serves$, (float)nv.genius$, (float)nv.superb$);
            if (this.honduras$ != null && this.honduras$.size() > 0) {
                GL11.glTexCoord2f((float)((TextureCoordinate)this.honduras$.get((int)i)).simple$, (float)((TextureCoordinate)this.honduras$.get((int)i)).wisdom$);
                GL11.glVertex3f((float)v.serves$, (float)v.genius$, (float)v.superb$);
                continue;
            }
            GL11.glVertex3f((float)v.serves$, (float)v.genius$, (float)v.superb$);
        }
    }
}

