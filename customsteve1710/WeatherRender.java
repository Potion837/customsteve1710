/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.multiplayer.WorldClient
 *  net.minecraft.client.renderer.OpenGlHelper
 *  net.minecraft.client.renderer.Tessellator
 *  net.minecraft.client.renderer.texture.DynamicTexture
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.util.MathHelper
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.world.biome.BiomeGenBase
 *  net.minecraftforge.client.IRenderHandler
 *  org.lwjgl.opengl.GL11
 */
import java.util.Random;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.client.IRenderHandler;
import org.lwjgl.opengl.GL11;

public class WeatherRender
extends IRenderHandler {
    private static final ResourceLocation vehicles$ = new ResourceLocation("textures/environment/rain.png");
    private static final ResourceLocation unique$ = new ResourceLocation("textures/environment/snow.png");
    private static boolean compile$ = false;
    private float[] needs$;
    private float[] newport$;
    private final DynamicTexture grace$;
    private final int[] groove$;
    private final ResourceLocation officers$;
    private Minecraft greeting$;
    private Random object$;
    private int kings$;

    public WeatherRender(boolean rainORsnow) {
        compile$ = rainORsnow;
        this.object$ = new Random();
        this.grace$ = new DynamicTexture(16, 16);
        this.officers$ = Minecraft.func_71410_x().func_110434_K().func_110578_a("lightMap", this.grace$);
        this.groove$ = this.grace$.func_110565_c();
    }

    public void render(float p_78474_1_, WorldClient worldclient, Minecraft mc) {
        this.greeting$ = mc;
        ++this.kings$;
        float f1 = 1.0f;
        if (f1 > 0.0f) {
            if (this.needs$ == null) {
                this.needs$ = new float[1024];
                this.newport$ = new float[1024];
                for (int i = 0; i < 32; ++i) {
                    for (int j = 0; j < 32; ++j) {
                        float f2 = j - 16;
                        float f3 = i - 16;
                        float f4 = MathHelper.func_76129_c((float)(f2 * f2 + f3 * f3));
                        this.needs$[i << 5 | j] = -f3 / f4;
                        this.newport$[i << 5 | j] = f2 / f4;
                    }
                }
            }
            EntityLivingBase entitylivingbase = this.greeting$.field_71451_h;
            int k2 = MathHelper.func_76128_c((double)entitylivingbase.field_70165_t);
            int l2 = MathHelper.func_76128_c((double)entitylivingbase.field_70163_u);
            int i3 = MathHelper.func_76128_c((double)entitylivingbase.field_70161_v);
            Tessellator tessellator = Tessellator.field_78398_a;
            GL11.glDisable((int)2884);
            GL11.glNormal3f((float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glEnable((int)3042);
            OpenGlHelper.func_148821_a((int)770, (int)771, (int)1, (int)0);
            GL11.glAlphaFunc((int)516, (float)0.1f);
            double d0 = entitylivingbase.field_70142_S + (entitylivingbase.field_70165_t - entitylivingbase.field_70142_S) * (double)p_78474_1_;
            double d1 = entitylivingbase.field_70137_T + (entitylivingbase.field_70163_u - entitylivingbase.field_70137_T) * (double)p_78474_1_;
            double d2 = entitylivingbase.field_70136_U + (entitylivingbase.field_70161_v - entitylivingbase.field_70136_U) * (double)p_78474_1_;
            int k = MathHelper.func_76128_c((double)d1);
            int b0 = 5;
            if (this.greeting$.field_71474_y.field_74347_j) {
                b0 = 10;
            }
            boolean flag = false;
            int b1 = -1;
            float f5 = (float)this.kings$ + p_78474_1_;
            if (this.greeting$.field_71474_y.field_74347_j) {
                b0 = 10;
            }
            b0 = 10;
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            flag = false;
            for (int l = i3 - b0; l <= i3 + b0; ++l) {
                for (int i1 = k2 - b0; i1 <= k2 + b0; ++i1) {
                    double d4;
                    float f10;
                    int j1 = (l - i3 + 16) * 32 + i1 - k2 + 16;
                    float f6 = this.needs$[j1] * 0.5f;
                    float f7 = this.newport$[j1] * 0.5f;
                    BiomeGenBase biomegenbase = worldclient.func_72807_a(i1, l);
                    if (biomegenbase.func_76738_d() || !biomegenbase.func_76746_c()) {
                        // empty if block
                    }
                    int k1 = worldclient.func_72874_g(i1, l);
                    int l1 = l2 - b0;
                    int i2 = l2 + b0;
                    if (l1 < k1) {
                        l1 = k1;
                    }
                    if (i2 < k1) {
                        i2 = k1;
                    }
                    float f8 = 1.0f;
                    int j2 = k1;
                    if (k1 < k) {
                        j2 = k;
                    }
                    if (l1 == i2) continue;
                    this.object$.setSeed(i1 * i1 * 3121 + i1 * 45238971 ^ l * l * 418711 + l * 13761);
                    float f9 = biomegenbase.func_150564_a(i1, l1, l);
                    if (worldclient.func_72959_q().func_76939_a(f9, k1) >= 0.15f && compile$) {
                        if (b1 != 0) {
                            if (b1 >= 0) {
                                tessellator.func_78381_a();
                            }
                            b1 = 0;
                            this.greeting$.func_110434_K().func_110577_a(vehicles$);
                            tessellator.func_78382_b();
                        }
                        f10 = ((float)(this.kings$ + i1 * i1 * 3121 + i1 * 45238971 + l * l * 418711 + l * 13761 & 0x1F) + p_78474_1_) / 32.0f * (3.0f + this.object$.nextFloat());
                        double d3 = (double)((float)i1 + 0.5f) - entitylivingbase.field_70165_t;
                        d4 = (double)((float)l + 0.5f) - entitylivingbase.field_70161_v;
                        float f12 = MathHelper.func_76133_a((double)(d3 * d3 + d4 * d4)) / (float)b0;
                        float f13 = 1.0f;
                        tessellator.func_78380_c(worldclient.func_72802_i(i1, j2, l, 0));
                        tessellator.func_78369_a(f13, f13, f13, ((1.0f - f12 * f12) * 0.5f + 0.5f) * f1);
                        tessellator.func_78373_b(-d0 * 1.0, -d1 * 1.0, -d2 * 1.0);
                        tessellator.func_78374_a((double)((float)i1 - f6) + 0.5, (double)l1, (double)((float)l - f7) + 0.5, (double)(0.0f * f8), (double)((float)l1 * f8 / 4.0f + f10 * f8));
                        tessellator.func_78374_a((double)((float)i1 + f6) + 0.5, (double)l1, (double)((float)l + f7) + 0.5, (double)(1.0f * f8), (double)((float)l1 * f8 / 4.0f + f10 * f8));
                        tessellator.func_78374_a((double)((float)i1 + f6) + 0.5, (double)i2, (double)((float)l + f7) + 0.5, (double)(1.0f * f8), (double)((float)i2 * f8 / 4.0f + f10 * f8));
                        tessellator.func_78374_a((double)((float)i1 - f6) + 0.5, (double)i2, (double)((float)l - f7) + 0.5, (double)(0.0f * f8), (double)((float)i2 * f8 / 4.0f + f10 * f8));
                        tessellator.func_78373_b(0.0, 0.0, 0.0);
                        continue;
                    }
                    if (b1 != 1) {
                        if (b1 >= 0) {
                            tessellator.func_78381_a();
                        }
                        b1 = 1;
                        this.greeting$.func_110434_K().func_110577_a(unique$);
                        tessellator.func_78382_b();
                    }
                    f10 = ((float)(this.kings$ & 0x1FF) + p_78474_1_) / 512.0f;
                    float f16 = this.object$.nextFloat() + f5 * 0.01f * (float)this.object$.nextGaussian();
                    float f11 = this.object$.nextFloat() + f5 * (float)this.object$.nextGaussian() * 0.001f;
                    d4 = (double)((float)i1 + 0.5f) - entitylivingbase.field_70165_t;
                    double d5 = (double)((float)l + 0.5f) - entitylivingbase.field_70161_v;
                    float f14 = MathHelper.func_76133_a((double)(d4 * d4 + d5 * d5)) / (float)b0;
                    float f15 = 1.0f;
                    tessellator.func_78380_c((worldclient.func_72802_i(i1, j2, l, 0) * 3 + 0xF000F0) / 4);
                    tessellator.func_78369_a(f15, f15, f15, ((1.0f - f14 * f14) * 0.3f + 0.5f) * f1);
                    tessellator.func_78373_b(-d0 * 1.0, -d1 * 1.0, -d2 * 1.0);
                    tessellator.func_78374_a((double)((float)i1 - f6) + 0.5, (double)l1, (double)((float)l - f7) + 0.5, (double)(0.0f * f8 + f16), (double)((float)l1 * f8 / 4.0f + f10 * f8 + f11));
                    tessellator.func_78374_a((double)((float)i1 + f6) + 0.5, (double)l1, (double)((float)l + f7) + 0.5, (double)(1.0f * f8 + f16), (double)((float)l1 * f8 / 4.0f + f10 * f8 + f11));
                    tessellator.func_78374_a((double)((float)i1 + f6) + 0.5, (double)i2, (double)((float)l + f7) + 0.5, (double)(1.0f * f8 + f16), (double)((float)i2 * f8 / 4.0f + f10 * f8 + f11));
                    tessellator.func_78374_a((double)((float)i1 - f6) + 0.5, (double)i2, (double)((float)l - f7) + 0.5, (double)(0.0f * f8 + f16), (double)((float)i2 * f8 / 4.0f + f10 * f8 + f11));
                    tessellator.func_78373_b(0.0, 0.0, 0.0);
                }
            }
            if (b1 >= 0) {
                tessellator.func_78381_a();
            }
            GL11.glEnable((int)2884);
            GL11.glDisable((int)3042);
            GL11.glAlphaFunc((int)516, (float)0.1f);
            this.a(p_78474_1_);
        }
    }

    public void a(double p_78483_1_) {
        OpenGlHelper.func_77473_a((int)OpenGlHelper.field_77476_b);
        GL11.glDisable((int)3553);
        OpenGlHelper.func_77473_a((int)OpenGlHelper.field_77478_a);
    }

    public void b(double p_78463_1_) {
        OpenGlHelper.func_77473_a((int)OpenGlHelper.field_77476_b);
        GL11.glMatrixMode((int)5890);
        GL11.glLoadIdentity();
        float f2 = 0.00390625f;
        GL11.glScalef((float)f2, (float)f2, (float)f2);
        GL11.glTranslatef((float)8.0f, (float)8.0f, (float)8.0f);
        GL11.glMatrixMode((int)5888);
        this.greeting$.func_110434_K().func_110577_a(this.officers$);
        GL11.glTexParameteri((int)3553, (int)10241, (int)9729);
        GL11.glTexParameteri((int)3553, (int)10240, (int)9729);
        GL11.glTexParameteri((int)3553, (int)10241, (int)9729);
        GL11.glTexParameteri((int)3553, (int)10240, (int)9729);
        GL11.glTexParameteri((int)3553, (int)10242, (int)10496);
        GL11.glTexParameteri((int)3553, (int)10243, (int)10496);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glEnable((int)3553);
        OpenGlHelper.func_77473_a((int)OpenGlHelper.field_77478_a);
    }
}

