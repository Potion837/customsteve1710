/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.renderer.OpenGlHelper
 *  net.minecraft.util.MathHelper
 *  net.minecraft.world.EnumSkyBlock
 *  net.minecraft.world.chunk.Chunk
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL20
 */
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.util.MathHelper;
import net.minecraft.world.EnumSkyBlock;
import net.minecraft.world.chunk.Chunk;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;

public abstract class Shader3
extends Shader2 {
    public int trailer$;
    public int loads$;
    public int combine$;
    public int hardware$;
    public int usually$;
    public int history$;
    public int pixel$;
    public int bacteria$;
    public int located$;
    public int carolina$;
    public int guard$;

    public Shader3(String vs, String fs, Shader4 version, String ... macros) {
        super(vs, fs, version, macros);
    }

    public Shader3(String vs, String fs, String gs, Shader4 version, String ... macros) {
        super(vs, fs, gs, version, macros);
    }

    public void a(int artificialLight, int environmentalLight) {
        GL20.glUniform2f((int)this.usually$, (float)MathHelper.func_76131_a((float)((float)artificialLight / 255.0f), (float)0.078431375f, (float)0.92156863f), (float)MathHelper.func_76131_a((float)((float)environmentalLight / 255.0f), (float)0.078431375f, (float)0.92156863f));
    }

    public void a(double lightX, double lightY, double lightZ) {
        GL20.glUniform1i((int)this.trailer$, (int)0);
        GL20.glUniform1i((int)this.loads$, (int)1);
        GL20.glUniform1i((int)this.combine$, (int)ShaderProgram.rounds$);
        GL20.glUniform1i((int)this.hardware$, (int)ShaderProgram.titten$);
        GL20.glUniform3f((int)this.carolina$, (float)5.0f, (float)10.0f, (float)5.0f);
        GL20.glUniform1i((int)this.located$, (int)1);
        int x = MathHelper.func_76128_c((double)lightX);
        int y = MathHelper.func_76128_c((double)lightY);
        int z = MathHelper.func_76128_c((double)lightZ);
        int artificialLight = 0;
        int environmentalLight = 15;
        if (ShaderProgram.bahrain$) {
            artificialLight = 240;
            environmentalLight <<= 4;
        } else if (Minecraft.func_71410_x().field_71441_e != null) {
            Chunk chunk = Minecraft.func_71410_x().field_71441_e.func_72938_d(x, z);
            if (y > 255) {
                y = 255;
            }
            if (y < 0) {
                y = 0;
            }
            if (!chunk.func_76621_g()) {
                artificialLight = chunk.func_76614_a(EnumSkyBlock.Block, x & 0xF, y, z & 0xF);
                artificialLight <<= 4;
                environmentalLight = chunk.func_76614_a(EnumSkyBlock.Sky, x & 0xF, y, z & 0xF);
                environmentalLight <<= 4;
            }
        }
        GL20.glUniform2f((int)this.usually$, (float)MathHelper.func_76131_a((float)((float)artificialLight / 255.0f), (float)0.078431375f, (float)0.92156863f), (float)MathHelper.func_76131_a((float)((float)environmentalLight / 255.0f), (float)0.078431375f, (float)0.92156863f));
        Shader3.a[0] = artificialLight;
        Shader3.a[1] = environmentalLight;
    }

    @Override
    protected void d(int id) {
        this.trailer$ = GL20.glGetUniformLocation((int)id, (CharSequence)"mainTexture");
        this.loads$ = GL20.glGetUniformLocation((int)id, (CharSequence)"lightmapTexture");
        this.combine$ = GL20.glGetUniformLocation((int)id, (CharSequence)"toonTexture");
        this.hardware$ = GL20.glGetUniformLocation((int)id, (CharSequence)"spaTexture");
        this.usually$ = GL20.glGetUniformLocation((int)id, (CharSequence)"lightmapCoord");
        this.history$ = GL20.glGetUniformLocation((int)id, (CharSequence)"pureColor");
        this.pixel$ = GL20.glGetUniformLocation((int)id, (CharSequence)"enableToon");
        this.bacteria$ = GL20.glGetUniformLocation((int)id, (CharSequence)"enableSpa");
        this.located$ = GL20.glGetUniformLocation((int)id, (CharSequence)"enableLightmap");
        this.carolina$ = GL20.glGetUniformLocation((int)id, (CharSequence)"lightDir");
        this.guard$ = GL20.glGetUniformLocation((int)id, (CharSequence)"edgeScale");
    }

    public void b(int spaType) {
        GL20.glUniform1i((int)this.bacteria$, (int)spaType);
    }

    public void a(String path, Material material, PmdFileInfo pfi, boolean light, boolean specular, boolean load) {
        if (material.texas$ == null) {
            GL20.glUniform1i((int)this.history$, (int)1);
        } else {
            GL20.glUniform1i((int)this.history$, (int)0);
            if (load) {
                material._healthy(path);
            }
        }
        if (load && material.ought$ > -1) {
            OpenGlHelper.func_77473_a((int)(OpenGlHelper.field_77478_a + ShaderProgram.rounds$));
            material._backup(pfi);
            GL11.glTexParameteri((int)3553, (int)10241, (int)9728);
            GL11.glTexParameteri((int)3553, (int)10240, (int)9728);
            GL11.glTexParameteri((int)3553, (int)10242, (int)10496);
            GL11.glTexParameteri((int)3553, (int)10243, (int)10496);
            OpenGlHelper.func_77473_a((int)OpenGlHelper.field_77478_a);
        }
        GL20.glUniform1i((int)this.pixel$, (int)(material.ought$ > -1 ? 1 : 0));
    }

    public void a(String path, Material material, PmdFileInfo pfi, boolean light, float lightValue, boolean specular, boolean load) {
        if (material.texas$ == null) {
            GL20.glUniform1i((int)this.history$, (int)1);
        } else {
            GL20.glUniform1i((int)this.history$, (int)0);
            material._marco(path);
        }
        if (material.ought$ > -1) {
            OpenGlHelper.func_77473_a((int)(OpenGlHelper.field_77478_a + ShaderProgram.rounds$));
            material._backup(pfi);
            GL11.glTexParameteri((int)3553, (int)10241, (int)9728);
            GL11.glTexParameteri((int)3553, (int)10240, (int)9728);
            GL11.glTexParameteri((int)3553, (int)10242, (int)10496);
            GL11.glTexParameteri((int)3553, (int)10243, (int)10496);
            OpenGlHelper.func_77473_a((int)OpenGlHelper.field_77478_a);
        }
        GL20.glUniform1i((int)this.pixel$, (int)(material.ought$ > -1 ? 1 : 0));
    }
}

