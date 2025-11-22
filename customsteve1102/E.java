/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.OpenGlHelper
 *  net.minecraft.util.ResourceLocation
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL15
 *  org.lwjgl.opengl.GL20
 */
package customsteve;

import customsteve.aZ;
import customsteve.a_0;
import customsteve.ad_0;
import customsteve.d_0;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class E {
    public static boolean a = false;
    public static E a;
    private int g;
    private d_0 a;
    private d_0 b;
    private d_0 c;
    private d_0 d;
    public static int a;
    public static int b;
    public static int c;
    public static int d;
    public static int e;
    public static int f;
    public static boolean b;
    public static String a;
    private Field a;
    private Field b;
    private Field c;
    private Field d;
    private Field e;
    public boolean c = false;
    public boolean d = false;
    public boolean e = false;
    public boolean f = false;
    public boolean g = false;
    public boolean h = false;

    public E() {
        try {
            Class<?> shaders = Class.forName("shadersmod.client.Shaders");
            this.a = shaders.getField("isShadowPass");
            this.a.setAccessible(true);
            this.c = shaders.getField("isRenderingSky");
            this.c.setAccessible(true);
            this.d = shaders.getField("isCompositeRendered");
            this.d.setAccessible(true);
            this.b = shaders.getField("isRenderingDfb");
            this.b.setAccessible(true);
            this.e = shaders.getField("activeProgram");
            this.e.setAccessible(true);
            System.out.println("CS:Uses shadersmod");
            b = true;
        }
        catch (ClassNotFoundException classNotFoundException) {
            this.a = null;
            this.e = null;
            b = false;
        }
        catch (Exception e2) {
            e2.printStackTrace();
            this.a = null;
            this.e = null;
            b = false;
        }
        a = GL11.glGetInteger((int)3379);
        b = GL11.glGetInteger((int)34930);
        if (f > b) {
            c = b - 4;
            d = b - 3;
            e = b - 2;
            f = b - 1;
        }
        this.b();
        this.h = true;
    }

    public static void a(String shaderName) {
        a = shaderName;
        if (a != null) {
            a.a();
        }
    }

    protected void a() {
        if (this.h) {
            this.b();
        }
    }

    public void a(int uboId) {
        GL15.glBindBuffer((int)35345, (int)uboId);
        this.a.a(uboId);
    }

    /*
     * Unable to fully structure code
     */
    public void a(double lightX, double lightY, double lightZ) {
        block6: {
            block5: {
                block4: {
                    this.g = GL11.glGetInteger((int)35725);
                    try {
                        this.c = E.b != false ? (Boolean)this.a.get(null) : false;
                        this.d = E.b != false ? (Boolean)this.b.get(null) : false;
                        this.e = E.b != false ? (Boolean)this.c.get(null) : false;
                        v0 = this.f = E.b != false ? (Boolean)this.d.get(null) : false;
                        this.g = E.b ? (Integer)this.e.get(null) > 0 : true;
                    }
                    catch (Exception e) {
                        e.printStackTrace();
                    }
                    if (!this.c) break block4;
                    if (E.a != null) break block5;
                }
                if (this.g) ** GOTO lbl-1000
                if (E.a == null) lbl-1000:
                // 2 sources

                {
                    this.a = this.b;
                } else {
                    this.a = this.c;
                }
                break block6;
            }
            this.a = this.d;
        }
        GL20.glUseProgram((int)this.a.a());
        this.a.a(lightX, lightY, lightZ);
    }

    public d_0 a() {
        return this.a;
    }

    public d_0 b() {
        return this.c;
    }

    public int a() {
        GL20.glUseProgram((int)this.g);
        return this.g;
    }

    public boolean a() {
        try {
            this.c = b ? (Boolean)this.a.get(null) : false;
        }
        catch (IllegalArgumentException e2) {
            e2.printStackTrace();
        }
        catch (IllegalAccessException e3) {
            e3.printStackTrace();
        }
        return this.c;
    }

    private void b() {
        if (this.b != null) {
            this.b.a();
        }
        if (this.c != null) {
            this.c.a();
        }
        if (this.d != null) {
            this.d.a();
        }
        this.d = null;
        this.c = null;
        this.b = null;
        aZ render = aZ.a();
        this.b = render.a();
        if (b) {
            if (a != null) {
                if (render.a()) {
                    this.c = render.b();
                }
                if (render.b()) {
                    this.d = render.c();
                }
            }
        }
        OpenGlHelper.setActiveTexture((int)(OpenGlHelper.defaultTexUnit + e));
        OpenGlHelper.setActiveTexture((int)OpenGlHelper.defaultTexUnit);
    }

    private void a(StringBuilder source, String path) {
        try {
            String line;
            BufferedReader reader = new BufferedReader(new FileReader(path));
            while ((line = reader.readLine()) != null) {
                source.append(line + "\n");
            }
            reader.close();
        }
        catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void b(int toonid) {
        OpenGlHelper.setActiveTexture((int)(OpenGlHelper.defaultTexUnit + e));
        if (toonid < 0) {
            toonid = 0;
        }
        if (toonid < a_0.a.length) {
            this.a(a_0.a[toonid]);
            GL11.glTexParameteri((int)3553, (int)10241, (int)9728);
            GL11.glTexParameteri((int)3553, (int)10240, (int)9728);
            GL11.glTexParameteri((int)3553, (int)10242, (int)10496);
            GL11.glTexParameteri((int)3553, (int)10243, (int)10496);
        }
        OpenGlHelper.setActiveTexture((int)OpenGlHelper.defaultTexUnit);
    }

    public void a(ResourceLocation par1ResourceLocation) {
        a_0 csm = a_0.instance;
        ad_0 texture = (ad_0)csm.a.get(par1ResourceLocation);
        if (texture == null) {
            return;
        }
        try {
            GL11.glBindTexture((int)3553, (int)texture.a());
        }
        catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    static {
        a = -1;
        b = -1;
        c = 16;
        d = 17;
        e = 18;
        f = 19;
        a = "(none)";
    }
}

