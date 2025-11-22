/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.multiplayer.WorldClient
 *  net.minecraft.client.renderer.OpenGlHelper
 *  net.minecraft.client.renderer.texture.DynamicTexture
 *  net.minecraft.util.ResourceLocation
 *  net.minecraftforge.client.IRenderHandler
 *  org.lwjgl.opengl.GL11
 */
package customsteve;

import java.util.Random;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IRenderHandler;
import org.lwjgl.opengl.GL11;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class be
extends IRenderHandler {
    private static final ResourceLocation a = new ResourceLocation("textures/environment/rain.png");
    private static final ResourceLocation b = new ResourceLocation("textures/environment/snow.png");
    private static boolean a = false;
    private float[] a;
    private float[] b;
    private final DynamicTexture a;
    private final int[] a;
    private final ResourceLocation c;
    private Minecraft a;
    private Random a;
    private int a;

    public be(boolean rainORsnow) {
        a = rainORsnow;
        this.a = new Random();
        this.a = new DynamicTexture(16, 16);
        this.c = Minecraft.getMinecraft().getTextureManager().getDynamicTextureLocation("lightMap", this.a);
        this.a = this.a.getTextureData();
    }

    public void render(float p_78474_1_, WorldClient worldclient, Minecraft mc) {
    }

    public void a(double p_78483_1_) {
        OpenGlHelper.setActiveTexture((int)OpenGlHelper.lightmapTexUnit);
        GL11.glDisable((int)3553);
        OpenGlHelper.setActiveTexture((int)OpenGlHelper.defaultTexUnit);
    }

    public void b(double p_78463_1_) {
        OpenGlHelper.setActiveTexture((int)OpenGlHelper.lightmapTexUnit);
        GL11.glMatrixMode((int)5890);
        GL11.glLoadIdentity();
        float f2 = 0.00390625f;
        GL11.glScalef((float)f2, (float)f2, (float)f2);
        GL11.glTranslatef((float)8.0f, (float)8.0f, (float)8.0f);
        GL11.glMatrixMode((int)5888);
        this.a.getTextureManager().bindTexture(this.c);
        GL11.glTexParameteri((int)3553, (int)10241, (int)9729);
        GL11.glTexParameteri((int)3553, (int)10240, (int)9729);
        GL11.glTexParameteri((int)3553, (int)10241, (int)9729);
        GL11.glTexParameteri((int)3553, (int)10240, (int)9729);
        GL11.glTexParameteri((int)3553, (int)10242, (int)10496);
        GL11.glTexParameteri((int)3553, (int)10243, (int)10496);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glEnable((int)3553);
        OpenGlHelper.setActiveTexture((int)OpenGlHelper.defaultTexUnit);
    }
}

