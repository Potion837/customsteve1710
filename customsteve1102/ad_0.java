/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.texture.TextureUtil
 *  net.minecraft.util.ResourceLocation
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package customsteve;

import customsteve.ModContainer;
import customsteve.a_0;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from customsteve.aD
 */
@SideOnly(value=Side.CLIENT)
public class ad_0 {
    protected final ResourceLocation a;
    public int a;
    public boolean a;
    public int b;
    public boolean b = false;
    private BufferedImage a = null;

    public ad_0(ResourceLocation par1ResourceLocation) {
        this.a = par1ResourceLocation;
    }

    public void a() {
        this.b = 0;
        this.b = false;
    }

    public void b() {
        TextureUtil.deleteTexture((int)this.a);
        if (this.a != null) {
            this.a.flush();
            this.a = null;
        }
    }

    public void c() throws IOException {
        InputStream inputstream = null;
        try {
            File file = new File(ModContainer.b + "/" + this.a.getPath());
            inputstream = new FileInputStream(file);
            this.a = ImageIO.read(inputstream);
        }
        catch (IOException e2) {
            a_0.instance.a("Can't load texture: " + this.a.getPath());
            throw e2;
        }
        finally {
            if (inputstream != null) {
                inputstream.close();
            }
        }
        this.a = true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void d() throws IOException {
        InputStream inputstream = null;
        try {
            File file = new File(ModContainer.b + "/" + this.a.getPath());
            inputstream = new FileInputStream(file);
            if (this.a == null) {
                this.a = ImageIO.read(inputstream);
            }
            boolean flag = false;
            boolean flag1 = false;
            if (this.a == -1) {
                this.a = TextureUtil.glGenTextures();
            }
            TextureUtil.uploadTextureImageAllocate((int)this.a, (BufferedImage)this.a, (boolean)flag, (boolean)flag1);
        }
        finally {
            if (inputstream != null) {
                inputstream.close();
            }
        }
    }

    private InputStream a(File file) {
        return null;
    }

    public int a() throws IOException {
        if (this.a) {
            this.a = false;
            this.d();
        } else if (this.a == -1) {
            this.a = TextureUtil.glGenTextures();
        }
        return this.a;
    }
}

