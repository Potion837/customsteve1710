/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.Tessellator
 *  net.minecraft.util.math.Vec3d
 *  org.lwjgl.opengl.ARBMultitexture
 *  org.lwjgl.opengl.GL11
 */
package customsteve;

import customsteve.aG;
import customsteve.ai_0;
import customsteve.ao;
import customsteve.ap_0;
import java.util.ArrayList;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.ARBMultitexture;
import org.lwjgl.opengl.GL11;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class aH {
    public int a;
    public boolean a;
    public ArrayList<Integer> a = false;
    public ArrayList<aG> b;
    private ArrayList<ai_0> c;

    public void a(ai_0[] vb) {
        this.c = new ArrayList();
        for (int i2 = 0; i2 < this.a.size(); ++i2) {
            int index = (Integer)this.a.get(i2);
            this.c.add(vb[index]);
        }
    }

    public ai_0 a(ArrayList<ai_0> vertexBuffer) {
        Vec3d v1 = new Vec3d((double)(vertexBuffer.get((int)1).a - vertexBuffer.get((int)0).a), (double)(vertexBuffer.get((int)1).b - vertexBuffer.get((int)0).b), (double)(vertexBuffer.get((int)1).c - vertexBuffer.get((int)0).c));
        Vec3d v2 = new Vec3d((double)(vertexBuffer.get((int)2).a - vertexBuffer.get((int)0).a), (double)(vertexBuffer.get((int)2).b - vertexBuffer.get((int)0).b), (double)(vertexBuffer.get((int)2).c - vertexBuffer.get((int)0).c));
        Vec3d normalVector = null;
        normalVector = v1.crossProduct(v2).normalize();
        return new ai_0((float)normalVector.x, (float)normalVector.y, (float)normalVector.z);
    }

    public void a() {
        for (ai_0 v : this.c) {
            GL11.glNormal3f((float)v.d, (float)v.e, (float)v.f);
            float f2 = 0.5f * (1.0f - new ap_0(5.0f, 10.0f, -5.0f).a(v.d, v.e, v.f));
            ao spaCoord = new ao(v.d, v.e).b(new ao(1.0f, 1.0f)).a(0.5f);
            ARBMultitexture.glMultiTexCoord2fARB((int)33984, (float)v.g, (float)v.h);
            ARBMultitexture.glMultiTexCoord2fARB((int)33986, (float)0.0f, (float)f2);
            ARBMultitexture.glMultiTexCoord2fARB((int)33987, (float)spaCoord.a, (float)spaCoord.b);
            GL11.glVertex3f((float)v.a, (float)v.b, (float)v.c);
        }
    }

    public void a(ap_0[][] vertexBuffer, Tessellator tessellator, ap_0 viewTrans) {
        this.a(vertexBuffer, tessellator, 5.0E-4f, viewTrans);
    }

    public void a(ap_0[][] vertexBuffer, Tessellator tessellator, float textureOffset, ap_0 viewTrans) {
        for (int i2 = 0; i2 < this.a.size(); ++i2) {
            int index = (Integer)this.a.get(i2);
            ap_0 v = vertexBuffer[index][0];
            ap_0 nv = vertexBuffer[index][1];
            if (v == null) {
                return;
            }
            GL11.glNormal3f((float)nv.a, (float)nv.b, (float)nv.c);
            if (this.b != null && this.b.size() > 0) {
                GL11.glTexCoord2f((float)this.b.get((int)i2).a, (float)this.b.get((int)i2).b);
                GL11.glVertex3f((float)v.a, (float)v.b, (float)v.c);
                continue;
            }
            GL11.glVertex3f((float)v.a, (float)v.b, (float)v.c);
        }
    }
}

