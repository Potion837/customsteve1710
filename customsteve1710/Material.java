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
import java.io.IOException;
import java.util.ArrayList;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.util.ResourceLocation;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.lwjgl.opengl.GL11;

public class Material {
    public float silver$;
    public float latitude$;
    public float depend$;
    public float painted$;
    public float glory$;
    public float sticks$ = 0.0f;
    public float mouse$;
    public float episode$;
    public float sorted$;
    public float toward$;
    public float basin$;
    public float rough$;
    public float dialogue$;
    public float bronze$;
    public float giant$;
    public int ought$ = -1;
    public boolean storage$ = false;
    public boolean replace$;
    public boolean minority$;
    public long collins$;
    public String lincoln$;
    public String texas$;
    public int myers$;
    public String rings$;
    public String tracks$ = null;
    public ResourceLocation loading$ = null;
    public ResourceLocation tribute$ = null;
    public ResourceLocation breaks$ = null;
    public ArrayList adding$ = null;
    public String collar$ = null;
    public String circular$ = null;
    public int board$ = -1;
    public boolean petition$ = false;
    public boolean authors$ = false;
    public boolean bikini$ = false;

    public Material(String name, String englishName, float dR, float dG, float dB, float dA, float S, float sR, float sG, float sB, float aR, float aG, float aB, int spa, boolean defToon, int toon, boolean ef, long indices, String file) {
        this.minority$ = defToon;
        this.collar$ = name;
        this.circular$ = englishName;
        this.silver$ = dR;
        this.latitude$ = dG;
        this.depend$ = dB;
        this.painted$ = dA;
        this.sticks$ = S;
        this.mouse$ = sR;
        this.episode$ = sG;
        this.sorted$ = sB;
        this.toward$ = aR;
        this.basin$ = aG;
        this.rough$ = aB;
        this.dialogue$ = (aR + dR) / 2.0f;
        this.bronze$ = (aG + dG) / 2.0f;
        this.giant$ = (aB + dB) / 2.0f;
        this.myers$ = spa;
        this.ought$ = toon;
        this.replace$ = ef;
        this.collins$ = indices;
        this.lincoln$ = file;
        if (file != null && !file.isEmpty()) {
            String[] strings = file.split("\\*");
            this.texas$ = strings[0];
            if (strings.length > 1) {
                this.rings$ = strings[1];
            }
            this.texas$ = this.texas$.replace(".dds", ".png");
            this.texas$ = this.texas$.replace(".jpg", ".png");
            this.texas$ = this.texas$.replace(".JPG", ".png");
            this.texas$ = this.texas$.replace(".DDS", ".png");
            if (this.texas$.equals("null")) {
                this.texas$ = null;
            }
        }
        this.glory$ = this.painted$;
    }

    public Material(float dR, float dG, float dB, float dA, float S, float sR, float sG, float sB, float aR, float aG, float aB, int spa, boolean defToon, int toon, boolean ef, long indices, String file) {
        this.glory$ = this.painted$;
        this.minority$ = defToon;
        this.silver$ = dR;
        this.latitude$ = dG;
        this.depend$ = dB;
        this.painted$ = dA;
        this.sticks$ = S;
        this.mouse$ = sR;
        this.episode$ = sG;
        this.sorted$ = sB;
        this.toward$ = aR;
        this.basin$ = aG;
        this.rough$ = aB;
        this.dialogue$ = (aR + dR) / 2.0f;
        this.bronze$ = (aG + dG) / 2.0f;
        this.giant$ = (aB + dB) / 2.0f;
        this.myers$ = spa;
        this.ought$ = toon;
        this.replace$ = ef;
        this.collins$ = indices;
        this.lincoln$ = file;
        if (file != null && !file.isEmpty()) {
            String[] strings = file.split("\\*");
            this.texas$ = strings[0];
            if (strings.length > 1) {
                this.rings$ = strings[1];
            }
            this.texas$ = this.texas$.replace(".dds", ".png");
            this.texas$ = this.texas$.replace(".DDS", ".png");
            this.texas$ = this.texas$.replace(".jpg", ".png");
            this.texas$ = this.texas$.replace(".JPG", ".png");
            if (this.texas$.equals("null")) {
                this.texas$ = null;
            }
        }
        this.glory$ = this.painted$;
    }

    public void _oliver(int p, ArrayList faces) {
        this.adding$ = new ArrayList();
        int j = p;
        while ((long)j < (long)p + this.collins$ / 3L) {
            TriangleFace f2 = (TriangleFace)faces.get(j);
            this.adding$.add(f2);
            ++j;
        }
    }

    public void _distant() {
        if (this.loading$ == null) {
            this.loading$ = new ResourceLocation(this.tracks$ + "/" + this.rings$);
        }
        this._liberty(this.loading$);
    }

    public boolean _backup(PmdFileInfo pfi) {
        if (this.board$ == -1) {
            this.board$ = 0;
            if (this.ought$ > -1) {
                String tFileName = null;
                if (this.ought$ < pfi.favorite$.size()) {
                    tFileName = (String)pfi.favorite$.get(this.ought$);
                }
                if (this.minority$) {
                    this.board$ = 1;
                    this.breaks$ = CSmanager.checks$[this.ought$ + 1];
                } else if (tFileName != null) {
                    this.breaks$ = new ResourceLocation(this.tracks$ + "/" + tFileName);
                    this._donation(this.breaks$);
                }
            }
        }
        this._liberty(this.breaks$);
        return true;
    }

    public boolean _romantic() {
        if (this.texas$ != null && !this.texas$.equals("")) {
            if (this.tribute$ == null) {
                this.tribute$ = new ResourceLocation(this.tracks$ + "/" + this.texas$);
            }
        } else {
            return false;
        }
        this._liberty(this.tribute$);
        return true;
    }

    public boolean _salem(String path) {
        if (this.rings$ != null) {
            if (this.loading$ == null) {
                this.loading$ = new ResourceLocation(path + "/" + this.rings$);
            }
            this._donation(this.loading$);
        }
        if (this.texas$ != null && !this.texas$.equals("")) {
            if (this.tribute$ == null) {
                this.tribute$ = new ResourceLocation(path + "/" + this.texas$);
            }
        } else {
            return false;
        }
        this._donation(this.tribute$);
        return true;
    }

    public void _donation(ResourceLocation par1ResourceLocation) {
        CSmanager csm = CSmanager.cellular$;
        SimpleTexture texture = (SimpleTexture)csm.beings$.get(par1ResourceLocation);
        if (texture == null) {
            String fileType = par1ResourceLocation.func_110623_a().toLowerCase();
            texture = fileType.indexOf(".tga") != -1 ? new TGATexture(par1ResourceLocation) : new SimpleTexture(par1ResourceLocation);
            this._receptor(par1ResourceLocation, texture);
        }
    }

    public boolean _marco(String path) {
        if (this.rings$ != null) {
            OpenGlHelper.func_77473_a((int)(OpenGlHelper.field_77478_a + ShaderProgram.titten$));
            if (this.loading$ == null) {
                this.loading$ = new ResourceLocation(path + "/" + this.rings$);
            }
            this._liberty(this.loading$);
            OpenGlHelper.func_77473_a((int)OpenGlHelper.field_77478_a);
            ShaderProgram.wonder$._rapid()._replies(this.myers$);
        } else {
            ShaderProgram.wonder$._rapid()._replies(0);
        }
        if (this.texas$ != null && !this.texas$.equals("")) {
            if (this.tribute$ == null) {
                this.tribute$ = new ResourceLocation(path + "/" + this.texas$);
            }
        } else {
            return false;
        }
        this._liberty(this.tribute$);
        return true;
    }

    public boolean _healthy(String path) {
        if (this.rings$ != null) {
            OpenGlHelper.func_77473_a((int)(OpenGlHelper.field_77478_a + ShaderProgram.titten$));
            if (this.loading$ == null) {
                this.loading$ = new ResourceLocation(path + "/" + this.rings$);
            }
            this._liberty(this.loading$);
            OpenGlHelper.func_77473_a((int)OpenGlHelper.field_77478_a);
            ShaderProgram.wonder$._rapid()._replies(this.myers$);
        } else {
            ShaderProgram.wonder$._rapid()._replies(0);
        }
        if (this.texas$ != null && !this.texas$.equals("")) {
            if (this.tribute$ == null) {
                this.tribute$ = new ResourceLocation(path + "/" + this.texas$);
            }
        } else {
            return false;
        }
        this._liberty(this.tribute$);
        return true;
    }

    public void _viewer() {
        SimpleTexture texture;
        CSmanager csm = CSmanager.cellular$;
        if (this.rings$ != null && this.loading$ != null && (texture = (SimpleTexture)csm.beings$.get(this.loading$)) != null) {
            texture._athletic();
        }
        if (this.texas$ != null && !this.texas$.equals("") && this.tribute$ != null && (texture = (SimpleTexture)csm.beings$.get(this.tribute$)) != null) {
            texture._athletic();
        }
    }

    public void _liberty(ResourceLocation par1ResourceLocation) {
        CSmanager csm = CSmanager.cellular$;
        SimpleTexture texture = (SimpleTexture)csm.beings$.get(par1ResourceLocation);
        if (texture == null) {
            String fileType = par1ResourceLocation.func_110623_a().toLowerCase();
            texture = fileType.indexOf(".tga") != -1 ? new TGATexture(par1ResourceLocation) : new SimpleTexture(par1ResourceLocation);
            this._levels(par1ResourceLocation, texture);
        }
        try {
            texture._athletic();
            GL11.glBindTexture((int)3553, (int)texture._bradford());
        }
        catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    public boolean _receptor(ResourceLocation par1ResourceLocation, SimpleTexture par2TextureObject) {
        boolean flag = true;
        try {
            par2TextureObject._chairman();
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
        CSmanager.cellular$.beings$.put(par1ResourceLocation, par2TextureObject);
        return flag;
    }

    public boolean _levels(ResourceLocation par1ResourceLocation, SimpleTexture par2TextureObject) {
        boolean flag = true;
        try {
            par2TextureObject._blast();
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
        CSmanager.cellular$.beings$.put(par1ResourceLocation, par2TextureObject);
        return flag;
    }

    public void _blogger() {
        SimpleTexture o;
        if (this.tribute$ != null && (o = (SimpleTexture)CSmanager.cellular$.beings$.get(this.tribute$)) != null) {
            o.david$ = true;
        }
        if (this.loading$ != null && (o = (SimpleTexture)CSmanager.cellular$.beings$.get(this.loading$)) != null) {
            o.david$ = true;
        }
    }
}

