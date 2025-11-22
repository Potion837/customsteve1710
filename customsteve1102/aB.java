/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.OpenGlHelper
 *  net.minecraft.util.ResourceLocation
 *  org.apache.logging.log4j.Level
 *  org.apache.logging.log4j.LogManager
 *  org.lwjgl.opengl.GL11
 */
package customsteve;

import customsteve.E;
import customsteve.aH;
import customsteve.a_0;
import customsteve.ac;
import customsteve.ad_0;
import customsteve.ae_0;
import java.io.IOException;
import java.util.ArrayList;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.util.ResourceLocation;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.lwjgl.opengl.GL11;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class aB {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public int a;
    public boolean a;
    public boolean b;
    public boolean c;
    public long a;
    public String a;
    public String b;
    public int b;
    public String c;
    public String d;
    public ResourceLocation a;
    public ResourceLocation b = null;
    public ResourceLocation c;
    public ArrayList<aH> a = (float)null;
    public String e;
    public String f;
    public int c = -1;
    public boolean d = false;
    public boolean e = false;
    public boolean f = false;
    public boolean g = false;

    public aB(String name, String englishName, float dR, float dG, float dB, float dA, float S2, float sR, float sG, float sB, float aR, float aG2, float aB2, int spa, boolean defToon, int toon, boolean ef, long indices, String file) {
        this.c = defToon;
        this.e = name;
        this.f = englishName;
        this.a = dR;
        this.b = dG;
        this.c = dB;
        this.d = dA;
        this.f = S2;
        this.g = sR;
        this.h = sG;
        this.i = sB;
        this.j = aR;
        this.k = aG2;
        this.l = aB2;
        this.m = (aR + dR) / 2.0f;
        this.n = (aG2 + dG) / 2.0f;
        this.o = (aB2 + dB) / 2.0f;
        this.b = spa;
        this.a = toon;
        this.b = ef;
        this.a = indices;
        this.a = file;
        if (file != null && !file.isEmpty()) {
            String[] strings = file.split("\\*");
            this.b = strings[0];
            if (strings.length > 1) {
                this.c = strings[1];
            }
            this.b = this.b.replace(".dds", ".png");
            this.b = this.b.replace(".DDS", ".png");
            if (this.b.equals("null")) {
                this.b = null;
            }
        }
        this.e = this.d;
    }

    public aB(float dR, float dG, float dB, float dA, float S2, float sR, float sG, float sB, float aR, float aG2, float aB2, int spa, boolean defToon, int toon, boolean ef, long indices, String file) {
        this.e = this.d;
        this.c = defToon;
        this.a = dR;
        this.b = dG;
        this.c = dB;
        this.d = dA;
        this.f = S2;
        this.g = sR;
        this.h = sG;
        this.i = sB;
        this.j = aR;
        this.k = aG2;
        this.l = aB2;
        this.m = (aR + dR) / 2.0f;
        this.n = (aG2 + dG) / 2.0f;
        this.o = (aB2 + dB) / 2.0f;
        this.b = spa;
        this.a = toon;
        this.b = ef;
        this.a = indices;
        this.a = file;
        if (file != null && !file.isEmpty()) {
            String[] strings = file.split("\\*");
            this.b = strings[0];
            if (strings.length > 1) {
                this.c = strings[1];
            }
            this.b = this.b.replace(".dds", ".png");
            this.b = this.b.replace(".DDS", ".png");
            if (this.b.equals("null")) {
                this.b = null;
            }
        }
        this.e = this.d;
    }

    public void a(int p2, ArrayList<aH> faces) {
        this.a = (float)new ArrayList();
        int j2 = p2;
        while ((long)j2 < (long)p2 + this.a / 3L) {
            aH f2 = faces.get(j2);
            this.a.add(f2);
            ++j2;
        }
    }

    public void a() {
        if (this.a == null) {
            this.a = new ResourceLocation(this.d + "/" + this.c);
        }
        this.b(this.a);
    }

    public boolean a(ac pfi) {
        if (this.c == -1) {
            this.c = 0;
            if (this.a > -1) {
                String tFileName = null;
                if (this.a < pfi.i.size()) {
                    tFileName = pfi.i.get(this.a);
                }
                if (this.c) {
                    this.c = 1;
                    this.c = a_0.a[this.a + 1];
                } else if (tFileName != null) {
                    this.c = new ResourceLocation(this.d + "/" + tFileName);
                    this.a(this.c);
                }
            }
        }
        this.b(this.c);
        return true;
    }

    public boolean a() {
        if (this.b != null && !this.b.equals("")) {
            if (this.b == null) {
                this.b = new ResourceLocation(this.d + "/" + this.b);
            }
        } else {
            return false;
        }
        this.b(this.b);
        return true;
    }

    public boolean a(String path) {
        if (this.c != null) {
            if (this.a == null) {
                this.a = new ResourceLocation(path + "/" + this.c);
            }
            this.a(this.a);
        }
        if (this.b != null && !this.b.equals("")) {
            if (this.b == null) {
                this.b = new ResourceLocation(path + "/" + this.b);
            }
        } else {
            return false;
        }
        this.a(this.b);
        return true;
    }

    public void a(ResourceLocation par1ResourceLocation) {
        a_0 csm = a_0.instance;
        ad_0 texture = (ad_0)csm.a.get(par1ResourceLocation);
        if (texture == null) {
            String fileType = par1ResourceLocation.getPath().toLowerCase();
            texture = fileType.indexOf(".tga") != -1 ? new ae_0(par1ResourceLocation) : new ad_0(par1ResourceLocation);
            this.a(par1ResourceLocation, texture);
        }
    }

    public boolean b(String path) {
        if (this.c != null) {
            OpenGlHelper.setActiveTexture((int)(OpenGlHelper.defaultTexUnit + E.f));
            if (this.a == null) {
                this.a = new ResourceLocation(path + "/" + this.c);
            }
            this.b(this.a);
            OpenGlHelper.setActiveTexture((int)OpenGlHelper.defaultTexUnit);
            E.a.a().b(this.b);
        } else {
            E.a.a().b(0);
        }
        if (this.b != null && !this.b.equals("")) {
            if (this.b == null) {
                this.b = new ResourceLocation(path + "/" + this.b);
            }
        } else {
            return false;
        }
        this.b(this.b);
        return true;
    }

    public boolean c(String path) {
        if (this.c != null) {
            OpenGlHelper.setActiveTexture((int)(OpenGlHelper.defaultTexUnit + E.f));
            if (this.a == null) {
                this.a = new ResourceLocation(path + "/" + this.c);
            }
            this.b(this.a);
            OpenGlHelper.setActiveTexture((int)OpenGlHelper.defaultTexUnit);
            E.a.a().b(this.b);
        } else {
            E.a.a().b(0);
        }
        if (this.b != null && !this.b.equals("")) {
            if (this.b == null) {
                this.b = new ResourceLocation(path + "/" + this.b);
            }
        } else {
            return false;
        }
        this.b(this.b);
        return true;
    }

    public void b() {
        ad_0 texture;
        a_0 csm = a_0.instance;
        if (this.c != null && this.a != null && (texture = (ad_0)csm.a.get(this.a)) != null) {
            texture.a();
        }
        if (this.b != null && !this.b.equals("") && this.b != null && (texture = (ad_0)csm.a.get(this.b)) != null) {
            texture.a();
        }
    }

    public void b(ResourceLocation par1ResourceLocation) {
        a_0 csm = a_0.instance;
        ad_0 texture = (ad_0)csm.a.get(par1ResourceLocation);
        if (texture == null) {
            String fileType = par1ResourceLocation.getPath().toLowerCase();
            texture = fileType.indexOf(".tga") != -1 ? new ae_0(par1ResourceLocation) : new ad_0(par1ResourceLocation);
            this.b(par1ResourceLocation, texture);
        }
        try {
            texture.a();
            GL11.glBindTexture((int)3553, (int)texture.a());
        }
        catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    public boolean a(ResourceLocation par1ResourceLocation, ad_0 par2TextureObject) {
        boolean flag = true;
        try {
            par2TextureObject.c();
        }
        catch (IOException ioexception) {
            LogManager.getLogger().log(Level.WARN, "[IOException]Failed to load texture: " + par1ResourceLocation, (Throwable)ioexception);
            flag = false;
        }
        catch (Throwable throwable) {
            System.out.println("Failed to load texture: " + par1ResourceLocation);
            throwable.printStackTrace();
            return false;
        }
        a_0.instance.a.put(par1ResourceLocation, par2TextureObject);
        return flag;
    }

    public boolean b(ResourceLocation par1ResourceLocation, ad_0 par2TextureObject) {
        boolean flag = true;
        try {
            par2TextureObject.d();
        }
        catch (IOException ioexception) {
            LogManager.getLogger().log(Level.WARN, "[IOException]Failed to load texture: " + par1ResourceLocation, (Throwable)ioexception);
            flag = false;
        }
        catch (Throwable throwable) {
            System.out.println("Failed to load texture: " + par1ResourceLocation);
            throwable.printStackTrace();
            return false;
        }
        a_0.instance.a.put(par1ResourceLocation, par2TextureObject);
        return flag;
    }

    public void c() {
        ad_0 o2;
        if (this.b != null && (o2 = (ad_0)a_0.instance.a.get(this.b)) != null) {
            o2.b = true;
        }
        if (this.a != null && (o2 = (ad_0)a_0.instance.a.get(this.a)) != null) {
            o2.b = true;
        }
    }
}

