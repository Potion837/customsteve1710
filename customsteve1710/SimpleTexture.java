/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  net.minecraft.client.renderer.texture.TextureUtil
 *  net.minecraft.util.ResourceLocation
 */
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.minecraft.util.ResourceLocation;

@SideOnly(value=Side.CLIENT)
public class SimpleTexture {
    protected final ResourceLocation staffing$;
    public int kingston$ = -1;
    public boolean college$ = false;
    public int bowling$ = 0;
    public boolean david$ = false;
    private BufferedImage comply$ = null;

    public SimpleTexture(ResourceLocation par1ResourceLocation) {
        this.staffing$ = par1ResourceLocation;
    }

    public void _athletic() {
        this.bowling$ = 0;
        this.david$ = false;
    }

    public void _ongoing() {
        TextureUtil.func_147942_a((int)this.kingston$);
        if (this.comply$ != null) {
            this.comply$.flush();
            this.comply$ = null;
        }
    }

    public void _chairman() throws IOException {
        InputStream inputstream = null;
        try {
            File file = new File(ModContainer.outreach$ + "/" + this.staffing$.func_110623_a());
            inputstream = new FileInputStream(file);
            this.comply$ = ImageIO.read(inputstream);
        }
        catch (IOException e2) {
            CSmanager.cellular$._errors("Can't load texture: " + this.staffing$.func_110623_a());
            throw e2;
        }
        finally {
            if (inputstream != null) {
                inputstream.close();
            }
        }
        this.college$ = true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void _blast() throws IOException {
        InputStream inputstream = null;
        try {
            File file = new File(ModContainer.outreach$ + "/" + this.staffing$.func_110623_a());
            inputstream = new FileInputStream(file);
            if (this.comply$ == null) {
                this.comply$ = ImageIO.read(inputstream);
            }
            boolean flag = false;
            boolean flag1 = false;
            if (this.kingston$ == -1) {
                this.kingston$ = TextureUtil.func_110996_a();
            }
            TextureUtil.func_110989_a((int)this.kingston$, (BufferedImage)this.comply$, (boolean)flag, (boolean)flag1);
        }
        finally {
            if (inputstream != null) {
                inputstream.close();
            }
        }
    }

    private InputStream _nicole(File file) {
        return null;
    }

    public int _bradford() throws IOException {
        if (this.college$) {
            this.college$ = false;
            this._blast();
        } else if (this.kingston$ == -1) {
            this.kingston$ = TextureUtil.func_110996_a();
        }
        return this.kingston$;
    }
}

