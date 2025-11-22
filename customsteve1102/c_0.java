/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.vecmath.Matrix4f
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.AbstractClientPlayer
 *  net.minecraft.client.gui.FontRenderer
 *  net.minecraft.client.gui.Gui
 *  net.minecraft.client.renderer.OpenGlHelper
 *  net.minecraft.client.renderer.RenderHelper
 *  net.minecraft.client.renderer.Tessellator
 *  net.minecraft.client.renderer.VertexBuffer
 *  net.minecraft.client.renderer.block.model.IBakedModel
 *  net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType
 *  net.minecraft.client.renderer.block.model.ItemTransformVec3f
 *  net.minecraft.client.renderer.entity.Render
 *  net.minecraft.client.renderer.entity.RenderPlayer
 *  net.minecraft.client.renderer.entity.layers.LayerElytra
 *  net.minecraft.client.renderer.texture.TextureManager
 *  net.minecraft.client.renderer.vertex.DefaultVertexFormats
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.passive.EntityHorse
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Items
 *  net.minecraft.item.EnumAction
 *  net.minecraft.item.ItemBlock
 *  net.minecraft.item.ItemBow
 *  net.minecraft.item.ItemElytra
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.world.IBlockAccess
 *  net.minecraft.world.World
 *  net.minecraftforge.client.model.IPerspectiveAwareModel
 *  org.apache.commons.lang3.tuple.Pair
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.opengl.ARBMultitexture
 *  org.lwjgl.opengl.GL11
 */
package customsteve;

import customsteve.E;
import customsteve.LoadingPlugin;
import customsteve.aB;
import customsteve.aH;
import customsteve.aQ;
import customsteve.aZ;
import customsteve.a_0;
import customsteve.ac;
import customsteve.ac_0;
import customsteve.ad_0;
import customsteve.ag_0;
import customsteve.ai_0;
import customsteve.ak;
import customsteve.al;
import customsteve.am;
import customsteve.ap_0;
import customsteve.aq_0;
import customsteve.ar;
import customsteve.ax;
import customsteve.b_0;
import customsteve.ba;
import customsteve.bc;
import customsteve.bd;
import customsteve.k;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import javax.vecmath.Matrix4f;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.VertexBuffer;
import net.minecraft.client.renderer.block.model.IBakedModel;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.block.model.ItemTransformVec3f;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.client.renderer.entity.layers.LayerElytra;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemElytra;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.model.IPerspectiveAwareModel;
import org.apache.commons.lang3.tuple.Pair;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.ARBMultitexture;
import org.lwjgl.opengl.GL11;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from customsteve.c
 */
public class c_0 {
    private static float a = 0.0f;
    private static int a = 0;
    private static ResourceLocation a = new ResourceLocation("textures/misc/enchanted_item_glint.png");
    private static FloatBuffer a = ByteBuffer.allocateDirect(64).order(ByteOrder.nativeOrder()).asFloatBuffer();
    private static FloatBuffer b = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
    private static FloatBuffer c = BufferUtils.createFloatBuffer((int)64);
    private static int b = 0;
    private static float b = 9.0f;
    private static float c = 0.0f;
    private static int c = 0;
    public static boolean a = true;

    public static void a(EntityLivingBase par1, double par2, double par4, double par6, float par9) {
        TextureManager texturemanager;
        block34: {
            block27: {
                ItemStack armor2;
                boolean updated;
                k csp;
                double sourcePar4;
                Minecraft mc;
                block31: {
                    block32: {
                        block33: {
                            block28: {
                                block29: {
                                    block30: {
                                        mc = Minecraft.getMinecraft();
                                        a_0.instance.a();
                                        boolean noCamera = a_0.instance.a != null && a_0.instance.a.a != null && ((ac)((Object)a_0.instance.a.a)).j == null;
                                        GL11.glEnable((int)2929);
                                        GL11.glDepthFunc((int)515);
                                        GL11.glDepthMask((boolean)true);
                                        GL11.glEnable((int)3042);
                                        GL11.glBlendFunc((int)770, (int)771);
                                        sourcePar4 = par4;
                                        par4 = 0.0;
                                        String username = par1.func_70005_c_();
                                        csp = a_0.instance.a(username);
                                        updated = false;
                                        if (csp.a != null) {
                                            updated = csp.a.a;
                                        }
                                        int lastCurrentPointer = 0;
                                        if (csp != null) {
                                            lastCurrentPointer = csp.c();
                                        }
                                        texturemanager = mc.getTextureManager();
                                        texturemanager.bindTexture(Gui.OPTIONS_BACKGROUND);
                                        texturemanager.getTexture(Gui.OPTIONS_BACKGROUND).setBlurMipmap(false, false);
                                        if (csp.l != -1) {
                                            if (!par1.func_98034_c((EntityPlayer)Minecraft.getMinecraft().player)) {
                                                float f2 = c_0.a(par1, par2, par4, par6, par9);
                                                c_0.a();
                                                GL11.glPopMatrix();
                                                c_0.a((Entity)par1, par1.func_70005_c_(), par2, par4, par6, 64);
                                                c_0.a((Entity)par1, "CustomSteve", par2, par4 - (double)0.3f, par6, 64, -1, 0.25f);
                                                c_0.a((Entity)par1, "Object", par2, par4 - (double)0.55f, par6, 64, -1, 0.25f);
                                                c_0.a((Entity)par1, "Sound", par2, par4 - 1.0, par6, 64, -1, 1.0f);
                                                c_0.a((Entity)par1, "Only", par2, par4 - 1.25, par6, 64, -1, 1.0f);
                                                c_0.a((Entity)par1, "Error:" + (int)(csp.l ? 1 : 0), par2, par4 - (double)1.7f, par6, 64, c_0.a(255, 0, 0, 0), 0.25f);
                                            }
                                            return;
                                        }
                                        if (((bc.a)((Object)csp.a)).f) break block27;
                                        if (par1.isPlayerSleeping()) {
                                            int j2;
                                            BlockPos blockpos = new BlockPos((Entity)par1);
                                            IBlockState iblockstate = mc.world.func_180495_p(blockpos);
                                            int x = MathHelper.floor((double)par1.field_70165_t);
                                            int y = MathHelper.floor((double)par1.field_70163_u);
                                            int z = MathHelper.floor((double)par1.field_70161_v);
                                            c = j2 = iblockstate.getBlock().getBedDirection(iblockstate, (IBlockAccess)mc.world, blockpos).getHorizontalIndex();
                                            c = j2 * 90;
                                        }
                                        if (Minecraft.getMinecraft().gameSettings.thirdPersonView != 0 || csp != a_0.instance.a) break block28;
                                        GL11.glDisable((int)2884);
                                        GL11.glCullFace((int)1028);
                                        if (E.a == null) break block29;
                                        if (E.a == null) break block30;
                                        if (E.a.equals("(none)")) break block29;
                                    }
                                    if (!E.a.c) break block31;
                                }
                                b = 0;
                                break block31;
                            }
                            GL11.glDisable((int)2884);
                            if (E.a == null) break block32;
                            if (E.a == null) break block33;
                            if (E.a.equals("(none)")) break block32;
                        }
                        if (!E.a.c) break block31;
                    }
                    b = 1;
                }
                ((ac)((Object)csp.a)).a = par1;
                if (!b_0.f && csp.a == null) {
                    csp.a = aZ.a().a(csp);
                }
                E sp = E.a;
                float f2 = c_0.a(par1, par2, par4, par6, par9);
                long BeginTime = System.nanoTime();
                sp.a(par1.field_70165_t, par1.field_70163_u + (double)par1.func_70047_e(), par1.field_70161_v);
                int nBuffer = csp.g;
                csp.a[nBuffer].writeLock().lock();
                ArrayList<al> boneBuffer = new ArrayList<al>();
                for (ar b2 : ((ac)((Object)csp.a)).c) {
                    boneBuffer.add(b2.a[nBuffer]);
                }
                long faceP = csp.a[csp.g];
                csp.a[nBuffer].writeLock().unlock();
                if (updated) {
                    c_0.a(par1, csp);
                    if (!E.a.c) {
                        c_0.a(csp, faceP);
                    }
                }
                if (!par1.func_98034_c((EntityPlayer)Minecraft.getMinecraft().player)) {
                    aZ.a().a("/CustomSteve/textures/" + csp.a(), csp.a, boneBuffer, a_0.instance.a != 0 ? (long)a_0.instance.a : faceP, csp.b[csp.g] && csp.a.a, false, 0.0f, false);
                }
                if (b_0.y && ((ArrayList)((Object)csp.a)).size() > 0) {
                    for (int i2 = 0; i2 < ((ArrayList)((Object)csp.a)).size(); ++i2) {
                        ag_0 wfi = (ag_0)((ArrayList)((Object)csp.a)).get(i2);
                        ba.a handle = (ba.a)((ag_0)((ArrayList)((Object)csp.a)).get((int)i2)).a;
                        ArrayList<al> amm4f = null;
                        if (!updated) continue;
                        amm4f = new ArrayList<al>();
                        for (int j3 = 0; j3 < handle.a.c.size(); ++j3) {
                            ar b3 = handle.a.c.get(j3);
                            amm4f.add(b3.a[csp.g]);
                        }
                    }
                }
                GL11.glPopMatrix();
                int oldProgram = sp.a();
                OpenGlHelper.setActiveTexture((int)OpenGlHelper.defaultTexUnit);
                ap_0 vec3 = new ap_0((float)par2, (float)par4, (float)par6);
                al m4f = new al();
                m4f.d(vec3);
                c_0.a(par1, par2, par4, par6, par9);
                GL11.glDisable((int)2896);
                ItemStack itemstack1 = ((AbstractClientPlayer)par1).field_71071_by.getCurrentItem();
                GL11.glEnable((int)2896);
                GL11.glEnable((int)3553);
                GL11.glPopMatrix();
                RenderHelper.enableStandardItemLighting();
                if (b_0.o) {
                    c_0.a(par1, par2, par4, par6, par9);
                    c_0.a(csp, vec3);
                    GL11.glPopMatrix();
                }
                GL11.glEnable((int)3553);
                GL11.glEnable((int)2884);
                GL11.glCullFace((int)1029);
                GL11.glCullFace((int)1028);
                GL11.glCullFace((int)1029);
                if (csp.k && ((ac)((Object)csp.a)).a != null) {
                    if (par1.getHeldItemMainhand() != null) {
                        c_0.a(csp, par1, par1.getHeldItemMainhand(), 0, par9, 0.0f, f2, vec3, true);
                    }
                    if (par1.getHeldItemOffhand() != null) {
                        c_0.a(csp, par1, par1.getHeldItemOffhand(), 0, par9, 0.0f, f2, vec3, false);
                    }
                }
                if ((armor2 = ((AbstractClientPlayer)par1).field_71071_by.armorInventory[2]) != null && armor2.getItem() instanceof ItemElytra) {
                    c_0.a(csp, par1, 0, par9, 0.0f, f2, vec3, false);
                }
                GL11.glDisable((int)3042);
                if (Minecraft.isGuiEnabled() && par1 != mc.player && !par1.func_98034_c((EntityPlayer)Minecraft.getMinecraft().player) && par1.func_184188_bt().isEmpty()) {
                    c_0.a((Entity)par1, par1.func_70005_c_(), par2, sourcePar4, par6, 64);
                }
                break block34;
            }
            if (!par1.func_98034_c((EntityPlayer)Minecraft.getMinecraft().player)) {
                float f2 = c_0.a(par1, par2, par4, par6, par9);
                c_0.a();
                GL11.glPopMatrix();
                c_0.a((Entity)par1, par1.func_70005_c_(), par2, par4, par6, 64);
                c_0.a((Entity)par1, "CustomSteve", par2, par4 - (double)0.3f, par6, 64, -1, 0.25f);
                c_0.a((Entity)par1, "Object", par2, par4 - (double)0.55f, par6, 64, -1, 0.25f);
                c_0.a((Entity)par1, "Sound", par2, par4 - 1.0, par6, 64, -1, 1.0f);
                c_0.a((Entity)par1, "Only", par2, par4 - 1.25, par6, 64, -1, 1.0f);
                c_0.a((Entity)par1, "loading...", par2, par4 - (double)1.7f, par6, 64, c_0.a(0, 255, 0, 0), 0.25f);
            }
        }
        texturemanager.bindTexture(Gui.OPTIONS_BACKGROUND);
        texturemanager.getTexture(Gui.OPTIONS_BACKGROUND).setBlurMipmap(false, false);
    }

    public static void a(k csp, EntityLivingBase par1EntityLivingBase, int par3, float par9, float s, float a2, ap_0 vec3, boolean main) {
        ap_0 pos;
        am q2;
        Minecraft mc = Minecraft.getMinecraft();
        GL11.glPushMatrix();
        ar b2 = ((ac)((Object)csp.a)).k;
        if (b2 == null) {
            GL11.glPopMatrix();
            return;
        }
        if (csp.i || !main) {
            if (b2.a[csp.g] == null) {
                return;
            }
            q2 = b2.a[csp.g].b();
            pos = b2.a[csp.g];
        } else {
            if (b2.a[csp.g] == null) {
                return;
            }
            q2 = b2.a[csp.g].b();
            pos = b2.a[csp.g];
        }
        if (q2 == null || pos == null) {
            GL11.glPopMatrix();
            return;
        }
        q2.a(q2.a(), q2.b(), -q2.c(), q2.d());
        al m2 = new al();
        m2.a();
        m2.a(new ap_0(0.0f, 0.0f, 0.0f), new ap_0(1.0f, 1.0f, 1.0f), q2.a(new ak()));
        float[] r2 = new float[16];
        m2.a(r2, false);
        FloatBuffer matrix = BufferUtils.createFloatBuffer((int)16);
        for (int i2 = 0; i2 < r2.length; ++i2) {
            matrix.put(r2[i2]);
        }
        matrix.rewind();
        if (vec3.b < 0.0f) {
            GL11.glTranslatef((float)vec3.a, (float)(-Math.abs(vec3.b)), (float)vec3.c);
        } else {
            GL11.glTranslatef((float)vec3.a, (float)vec3.b, (float)vec3.c);
        }
        GL11.glRotatef((float)(-a2), (float)0.0f, (float)1.0f, (float)0.0f);
        if (par1EntityLivingBase.isElytraFlying()) {
            float f2 = (float)par1EntityLivingBase.getTicksElytraFlying() + par9;
            float f1 = MathHelper.clamp((float)(f2 * f2 / 100.0f), (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)(f1 * (-90.0f - par1EntityLivingBase.field_70125_A)), (float)-1.0f, (float)0.0f, (float)0.0f);
        }
        if (b_0.b != null) {
            GL11.glScalef((float)b_0.b.a, (float)b_0.b.b, (float)b_0.b.c);
        }
        if (csp.i) {
            GL11.glTranslatef((float)(0.0f + pos.a / 10.0f), (float)(pos.b / 10.0f), (float)(0.0f + -(pos.c / 10.0f)));
        } else {
            GL11.glTranslatef((float)(0.0f + pos.a / 10.0f), (float)(pos.b / 10.0f), (float)(0.0f + -(pos.c / 10.0f)));
        }
        GL11.glMultMatrix((FloatBuffer)matrix);
        TextureManager texturemanager = mc.getTextureManager();
        GL11.glBindTexture((int)3553, (int)-1);
        texturemanager.bindTexture(Gui.OPTIONS_BACKGROUND);
        texturemanager.getTexture(Gui.OPTIONS_BACKGROUND).setBlurMipmap(false, false);
        GL11.glRotatef((float)180.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        GL11.glTranslated((double)0.0, (double)-0.1f, (double)-0.125);
        Render renderObject = mc.getRenderManager().getEntityRenderObject((Entity)par1EntityLivingBase);
        if (renderObject != null && renderObject instanceof RenderPlayer) {
            RenderPlayer rp = (RenderPlayer)renderObject;
            LayerElytra le = new LayerElytra(rp);
            float size = 0.0325f;
            if (par1EntityLivingBase.isElytraFlying()) {
                size = 0.0525f;
            }
            le.func_177141_a((AbstractClientPlayer)par1EntityLivingBase, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, size);
        }
        GL11.glPopMatrix();
        texturemanager.bindTexture(Gui.OPTIONS_BACKGROUND);
        texturemanager.getTexture(Gui.OPTIONS_BACKGROUND).setBlurMipmap(false, false);
    }

    public static void a(k csp, EntityLivingBase par1EntityLivingBase, ItemStack par2ItemStack, int par3, float par9, float s, float a2, ap_0 vec3, boolean main) {
        ap_0 pos;
        am q2;
        boolean usingBow;
        Minecraft mc = Minecraft.getMinecraft();
        GL11.glPushMatrix();
        ItemStack equippedItemMain = par1EntityLivingBase.getHeldItemMainhand();
        ItemStack equippedItemOff = par1EntityLivingBase.getHeldItemOffhand();
        ItemStack itemInUse = par1EntityLivingBase.getActiveItemStack();
        EnumAction mainEA = null;
        EnumAction offEA = null;
        boolean isUsingItem = par2ItemStack == itemInUse;
        boolean bl = usingBow = itemInUse != null && itemInUse.getItem() instanceof ItemBow;
        if (equippedItemOff != null) {
            offEA = equippedItemOff.getItem().getItemUseAction(equippedItemOff);
        }
        if (equippedItemMain != null) {
            mainEA = equippedItemMain.getItem().getItemUseAction(equippedItemMain);
        }
        boolean dual = b_0.D;
        if (mainEA == EnumAction.BLOCK || offEA == EnumAction.BLOCK) {
            dual = true;
        } else if (mainEA == EnumAction.EAT || mainEA == EnumAction.DRINK || offEA != null && (offEA == EnumAction.EAT || offEA == EnumAction.DRINK)) {
            dual = true;
        } else if (equippedItemMain != null && equippedItemOff != null && equippedItemMain.getItem().isFull3D() && equippedItemOff.getItem().isFull3D()) {
            dual = true;
        }
        ar b2 = null;
        if (csp.i) {
            b2 = ((ac)((Object)csp.a)).k;
        } else {
            b2 = ((ac)((Object)csp.a)).a;
            if (dual) {
                if (usingBow) {
                    if (isUsingItem) {
                        b2 = ((ac)((Object)csp.a)).a;
                        main = true;
                    } else {
                        b2 = ((ac)((Object)csp.a)).k;
                        if (main) {
                            main = !main;
                        }
                    }
                } else {
                    b2 = main ? ((ac)((Object)csp.a)).a : ((ac)((Object)csp.a)).b;
                }
            } else if (usingBow) {
                if (isUsingItem) {
                    b2 = ((ac)((Object)csp.a)).a;
                    main = true;
                } else {
                    b2 = ((ac)((Object)csp.a)).k;
                    if (main) {
                        main = !main;
                    }
                }
            } else if (!main) {
                b2 = isUsingItem && usingBow ? ((ac)((Object)csp.a)).a : ((ac)((Object)csp.a)).k;
            }
        }
        if (b2 == null) {
            GL11.glPopMatrix();
            return;
        }
        if (csp.i || !main) {
            if (b2.a[csp.g] == null) {
                return;
            }
            q2 = b2.a[csp.g].b();
            pos = b2.a[csp.g];
        } else {
            if (b2.a[csp.g] == null) {
                return;
            }
            q2 = b2.a[csp.g].b();
            pos = b2.a[csp.g];
        }
        if (q2 == null || pos == null) {
            GL11.glPopMatrix();
            return;
        }
        q2.a(q2.a(), q2.b(), -q2.c(), q2.d());
        al m2 = new al();
        m2.a();
        m2.a(new ap_0(0.0f, 0.0f, 0.0f), new ap_0(1.0f, 1.0f, 1.0f), q2.a(new ak()));
        float[] r2 = new float[16];
        m2.a(r2, false);
        FloatBuffer matrix = BufferUtils.createFloatBuffer((int)16);
        for (int i2 = 0; i2 < r2.length; ++i2) {
            matrix.put(r2[i2]);
        }
        matrix.rewind();
        if (vec3.b < 0.0f) {
            GL11.glTranslatef((float)vec3.a, (float)(-Math.abs(vec3.b)), (float)vec3.c);
        } else {
            GL11.glTranslatef((float)vec3.a, (float)vec3.b, (float)vec3.c);
        }
        GL11.glRotatef((float)(-a2), (float)0.0f, (float)1.0f, (float)0.0f);
        if (par1EntityLivingBase.isElytraFlying()) {
            float f2 = (float)par1EntityLivingBase.getTicksElytraFlying() + par9;
            float f1 = MathHelper.clamp((float)(f2 * f2 / 100.0f), (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)(f1 * (-90.0f - par1EntityLivingBase.field_70125_A)), (float)-1.0f, (float)0.0f, (float)0.0f);
        }
        if (b_0.b != null) {
            GL11.glScalef((float)b_0.b.a, (float)b_0.b.b, (float)b_0.b.c);
        }
        if (csp.i) {
            GL11.glTranslatef((float)(0.0f + pos.a / 10.0f), (float)(pos.b / 10.0f), (float)(0.0f + -(pos.c / 10.0f)));
        } else {
            GL11.glTranslatef((float)(0.0f + pos.a / 10.0f), (float)(pos.b / 10.0f), (float)(0.0f + -(pos.c / 10.0f)));
        }
        GL11.glMultMatrix((FloatBuffer)matrix);
        TextureManager texturemanager = mc.getTextureManager();
        GL11.glBindTexture((int)3553, (int)-1);
        texturemanager.bindTexture(Gui.OPTIONS_BACKGROUND);
        texturemanager.getTexture(Gui.OPTIONS_BACKGROUND).setBlurMipmap(false, false);
        IBakedModel ibakedmodel = mc.getRenderItem().getItemModelWithOverrides(par2ItemStack, (World)null, (EntityLivingBase)null);
        if (ibakedmodel instanceof IPerspectiveAwareModel) {
            Pair pair = ((IPerspectiveAwareModel)ibakedmodel).handlePerspective(ItemCameraTransforms.TransformType.THIRD_PERSON_RIGHT_HAND);
            if (pair.getRight() != null) {
                Matrix4f m4f = new Matrix4f((Matrix4f)pair.getRight());
                double scale = m4f.getScale();
                scale = par2ItemStack.getItem() instanceof ItemBow || par2ItemStack.getItem().isFull3D() ? 0.625 : (par2ItemStack.getItem() instanceof ItemBlock ? (scale *= 0.625) : (scale *= 0.625));
                GL11.glScaled((double)scale, (double)scale, (double)scale);
            }
        } else {
            ItemTransformVec3f transformVec3f = ibakedmodel.getItemCameraTransforms().getTransform(ItemCameraTransforms.TransformType.THIRD_PERSON_RIGHT_HAND);
            double fix = 1.0;
            fix = par2ItemStack.getItem() == Items.SHIELD ? 0.625 : 0.625;
            GL11.glScaled((double)((double)transformVec3f.scale.x * fix), (double)((double)transformVec3f.scale.y * fix), (double)((double)transformVec3f.scale.z * fix));
        }
        if (par2ItemStack.getItem() instanceof ItemBow || par2ItemStack.getItem().isFull3D()) {
            if (csp.i || !dual && !main) {
                if (main) {
                    GL11.glRotatef((float)-90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                } else {
                    GL11.glRotatef((float)-180.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                    GL11.glRotatef((float)180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                    GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                }
            } else {
                GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)180.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                if (par2ItemStack.getItem() instanceof ItemBow) {
                    GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                }
            }
        } else if (!csp.i && par2ItemStack.getItem() != Items.SHIELD) {
            GL11.glRotatef((float)-180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        }
        if (par1EntityLivingBase.getHeldItemMainhand() != null && par1EntityLivingBase.getHeldItemOffhand() != null && csp.i) {
            boolean mainIsBlock = par1EntityLivingBase.getHeldItemMainhand().getItem() instanceof ItemBlock;
            boolean offIsBlock = par1EntityLivingBase.getHeldItemOffhand().getItem() instanceof ItemBlock;
            if (mainIsBlock && !offIsBlock) {
                if (main) {
                    GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-0.55f);
                }
            } else if (offIsBlock && !mainIsBlock) {
                if (!main) {
                    GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-0.55f);
                }
            } else if (offIsBlock && mainIsBlock) {
                if (!main) {
                    GL11.glTranslatef((float)0.0f, (float)-1.0f, (float)0.0f);
                }
            } else if (!main) {
                GL11.glTranslatef((float)0.0f, (float)0.0f, (float)0.05f);
            }
        }
        if (par2ItemStack.getItem() == Items.BANNER) {
            GL11.glRotated((double)180.0, (double)0.0, (double)1.0, (double)0.0);
        }
        if (par2ItemStack.getItem() == Items.SHIELD) {
            if (csp.i || dual && itemInUse != null && itemInUse.getItem() instanceof ItemBow) {
                GL11.glRotated((double)180.0, (double)0.0, (double)1.0, (double)0.0);
                GL11.glTranslated((double)0.5, (double)0.5, (double)0.75);
            } else {
                GL11.glTranslated((double)0.5, (double)0.5, (double)0.5);
            }
        }
        mc.getRenderItem().renderItem(par2ItemStack, par1EntityLivingBase, ItemCameraTransforms.TransformType.NONE, false);
        GL11.glPopMatrix();
    }

    public static float a(EntityLivingBase par1, double par2, double par4, double par6, float par9) {
        float f3 = c_0.a(par1.prevRotationYawHead, par1.rotationYawHead, par9);
        float f2 = c_0.a(par1.prevRenderYawOffset, par1.renderYawOffset, par9);
        if (par1.isPlayerSleeping()) {
            f2 = c;
        }
        GL11.glPushMatrix();
        if (b_0.A && b_0.c != null) {
            f2 = b_0.l;
            GL11.glTranslated((double)(-par1.field_70165_t), (double)0.0, (double)(-par1.field_70161_v));
            GL11.glTranslated((double)b_0.c.a, (double)0.0, (double)b_0.c.c);
        }
        float Scalef = 0.1f;
        GL11.glMatrixMode((int)5888);
        GL11.glScalef((float)Scalef, (float)Scalef, (float)(-Scalef));
        if (par1.isPlayerSleeping()) {
            float fixX = 0.0f;
            float fixY = 0.0f;
            float fixZ = 0.0f;
            switch (c) {
                case 0: {
                    fixZ = b;
                    break;
                }
                case 1: {
                    fixX = b;
                    break;
                }
                case 2: {
                    fixZ = -b;
                    break;
                }
                case 3: {
                    fixX = -b;
                }
            }
            if (par4 < 0.0) {
                GL11.glTranslatef((float)(fixX + (float)(par2 * 10.0)), (float)(fixY + (float)(-(Math.abs(par4) * 10.0))), (float)(fixZ - (float)(par6 * 10.0)));
            } else {
                GL11.glTranslatef((float)(fixX + (float)(par2 * 10.0)), (float)(fixY + (float)(par4 * 10.0)), (float)(fixZ - (float)(par6 * 10.0)));
            }
        } else {
            float fixY = 0.0f;
            if (par1.func_70093_af()) {
                // empty if block
            }
            if (par1.func_184218_aH()) {
                // empty if block
            }
            if (par4 < 0.0) {
                GL11.glTranslatef((float)((float)(par2 * 10.0)), (float)((float)(-(Math.abs(par4) * 10.0)) + fixY), (float)(-((float)(par6 * 10.0))));
            } else {
                GL11.glTranslatef((float)((float)(par2 * 10.0)), (float)((float)(par4 * 10.0 + (double)fixY)), (float)(-((float)(par6 * 10.0))));
            }
        }
        if (par1.func_184218_aH() && par1 instanceof EntityLivingBase) {
            try {
                EntityLivingBase entitylivingbase1 = (EntityLivingBase)par1.func_184187_bx();
                f2 = c_0.a(entitylivingbase1.prevRenderYawOffset, entitylivingbase1.renderYawOffset, par9);
                float f4 = MathHelper.wrapDegrees((float)(f3 - f2));
                if (f4 < -85.0f) {
                    f4 = -85.0f;
                }
                if (f4 >= 85.0f) {
                    f4 = 85.0f;
                }
                f2 = f3 - f4;
                if (f4 * f4 > 2500.0f) {
                    f2 += f4 * 0.2f;
                }
            }
            catch (ClassCastException entitylivingbase1) {
                // empty catch block
            }
        }
        if (!LoadingPlugin.a || E.a.c) {
            if (Minecraft.getMinecraft().gameSettings.thirdPersonView == 0) {
                f2 = c_0.a(par1.field_70126_B, par1.field_70177_z, par9);
                if (par1.isPlayerSleeping()) {
                    f2 = c;
                }
                GL11.glRotatef((float)f2, (float)0.0f, (float)1.0f, (float)0.0f);
            } else {
                GL11.glRotatef((float)f2, (float)0.0f, (float)1.0f, (float)0.0f);
            }
        } else if (b == 0) {
            f2 = c_0.a(par1.field_70126_B, par1.field_70177_z, par9);
            if (par1.isPlayerSleeping()) {
                f2 = c;
            }
            GL11.glRotatef((float)f2, (float)0.0f, (float)1.0f, (float)0.0f);
        } else {
            GL11.glRotatef((float)f2, (float)0.0f, (float)1.0f, (float)0.0f);
        }
        if (par1.isElytraFlying()) {
            float f4 = (float)par1.getTicksElytraFlying() + par9;
            float f1 = MathHelper.clamp((float)(f4 * f4 / 100.0f), (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)(f1 * (-90.0f - par1.field_70125_A)), (float)1.0f, (float)0.0f, (float)0.0f);
        }
        if (par1.func_184218_aH() && par1.func_184187_bx() != null) {
            if (par1.func_184187_bx() instanceof EntityHorse) {
                // empty if block
            }
            if (f2 > 180.0f) {
                // empty if block
            }
        }
        if (b_0.b != null) {
            GL11.glScalef((float)b_0.b.a, (float)b_0.b.b, (float)b_0.b.c);
        }
        return f2;
    }

    public static void b(EntityLivingBase par1, double par2, double par4, double par6, float par9) {
        String username = par1.func_70005_c_();
        k csp = a_0.instance.a(username);
        double sourcePar4 = par4;
        par4 -= (double)par1.renderYawOffset;
        int lastCurrentPointer = 0;
        if (csp != null) {
            lastCurrentPointer = csp.c();
        }
        GL11.glPushMatrix();
        if (b_0.p) {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)-1.0f);
            GL11.glCullFace((int)1028);
        }
        if (((bc.a)((Object)csp.a)).f) {
            return;
        }
        ARBMultitexture.glActiveTextureARB((int)33984);
        if (b_0.q) {
            ARBMultitexture.glActiveTextureARB((int)33986);
            GL11.glEnable((int)3553);
            ARBMultitexture.glActiveTextureARB((int)33984);
        }
        if (b_0.q) {
            ARBMultitexture.glActiveTextureARB((int)33986);
            GL11.glEnable((int)3553);
            GL11.glTexGeni((int)8192, (int)9472, (int)9218);
            GL11.glTexGeni((int)8193, (int)9472, (int)9218);
            GL11.glDisable((int)3553);
            ARBMultitexture.glActiveTextureARB((int)33984);
        }
        GL11.glPopMatrix();
        c_0.a(par1, par2, par4, par6, par9);
        int p2 = 0;
        for (aB aB2 : ((ax)((ArrayList)((Object)((ac)((Object)csp.a)).a)).get((int)0)).b) {
            if (aB2.a > 0) {
                GL11.glMaterial((int)1032, (int)5634, (FloatBuffer)c_0.a(aB2.m, aB2.n, aB2.o, aB2.e));
                GL11.glMaterial((int)1032, (int)4610, (FloatBuffer)c_0.a(aB2.g, aB2.h, aB2.i, aB2.e));
            } else {
                GL11.glMaterial((int)1032, (int)4608, (FloatBuffer)c_0.a(aB2.j, aB2.k, aB2.l, aB2.e));
                GL11.glMaterial((int)1032, (int)4609, (FloatBuffer)c_0.a(aB2.a, aB2.b, aB2.c, aB2.e));
                GL11.glMaterial((int)1032, (int)4610, (FloatBuffer)c_0.a(aB2.g, aB2.h, aB2.i, aB2.e));
            }
            GL11.glMaterialf((int)1032, (int)5633, (float)aB2.f);
            if (aB2.e < 1.0f) {
                GL11.glDisable((int)2884);
            } else {
                GL11.glEnable((int)2884);
            }
            ARBMultitexture.glActiveTextureARB((int)33984);
            if (!aB2.a()) {
                GL11.glDisable((int)3553);
            } else {
                GL11.glEnable((int)3553);
            }
            if (b_0.q && aB2.a > -1) {
                ARBMultitexture.glActiveTextureARB((int)33986);
                aB2.a((ac)((Object)csp.a));
                GL11.glEnable((int)3168);
                GL11.glEnable((int)3169);
                GL11.glTexParameteri((int)3553, (int)10242, (int)33071);
                GL11.glTexParameteri((int)3553, (int)10243, (int)33071);
            }
            if (b_0.q) {
                if (aB2.c != null) {
                    ARBMultitexture.glActiveTextureARB((int)33986);
                    GL11.glEnable((int)3553);
                    if (aB2.b == 2) {
                        GL11.glTexEnvi((int)8960, (int)8704, (int)260);
                    } else {
                        GL11.glTexEnvi((int)8960, (int)8704, (int)8448);
                    }
                    GL11.glEnable((int)3168);
                    GL11.glEnable((int)3169);
                } else {
                    ARBMultitexture.glActiveTextureARB((int)33986);
                    GL11.glDisable((int)3553);
                }
            }
            GL11.glBegin((int)4);
            if (aB2.a == null) {
                aB2.a(p2, (ArrayList<aH>)((Object)((ax)((ArrayList)((Object)((ac)((Object)csp.a)).a)).get((int)0)).a));
            }
            for (aH f2 : aB2.a) {
                f2.a();
            }
            GL11.glEnd();
            p2 = (int)((long)p2 + aB2.a / 3L);
        }
        if (b_0.q) {
            if (b_0.q) {
                ARBMultitexture.glActiveTextureARB((int)33986);
                GL11.glDisable((int)3168);
                GL11.glDisable((int)3169);
            }
            ARBMultitexture.glActiveTextureARB((int)33984);
        } else if (b_0.q) {
            ARBMultitexture.glActiveTextureARB((int)33986);
            GL11.glDisable((int)3168);
            GL11.glDisable((int)3169);
            ARBMultitexture.glActiveTextureARB((int)33984);
        }
        if (b_0.q) {
            ARBMultitexture.glActiveTextureARB((int)33986);
            GL11.glDisable((int)3553);
        }
        if (b_0.q) {
            ARBMultitexture.glActiveTextureARB((int)33986);
            GL11.glDisable((int)3553);
        }
        ARBMultitexture.glActiveTextureARB((int)33984);
        GL11.glDisable((int)3553);
        GL11.glEnable((int)2884);
        if (b_0.p) {
            GL11.glCullFace((int)1029);
        }
        GL11.glPopMatrix();
    }

    public static void c(EntityLivingBase par1, double par2, double par4, double par6, float par9) {
        boolean adr = true;
        GL11.glEnable((int)2929);
        GL11.glDepthFunc((int)515);
        GL11.glDepthMask((boolean)true);
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        String username = par1.func_70005_c_();
        k csp = a_0.instance.a(username);
        double sourcePar4 = par4;
        par4 -= (double)par1.renderYawOffset;
        int lastCurrentPointer = 0;
        if (csp != null) {
            lastCurrentPointer = csp.c();
        }
        if (csp == null || csp.l != -1) {
            if (!par1.func_98034_c((EntityPlayer)Minecraft.getMinecraft().player)) {
                float f2 = c_0.a(par1, par2, par4, par6, par9);
                c_0.a();
                GL11.glPopMatrix();
                c_0.a((Entity)par1, par1.func_70005_c_(), par2, par4, par6, 64);
                c_0.a((Entity)par1, "CustomSteve", par2, par4 - (double)0.3f, par6, 64, -1, 0.25f);
                c_0.a((Entity)par1, "Object", par2, par4 - (double)0.55f, par6, 64, -1, 0.25f);
                c_0.a((Entity)par1, "Sound", par2, par4 - 1.0, par6, 64, -1, 1.0f);
                c_0.a((Entity)par1, "Only", par2, par4 - 1.25, par6, 64, -1, 1.0f);
                c_0.a((Entity)par1, "Error:" + (int)(csp.l ? 1 : 0), par2, par4 - (double)1.7f, par6, 64, c_0.a(255, 0, 0, 0), 0.25f);
            }
            return;
        }
        if (!((bc.a)((Object)csp.a)).f) {
            if (csp.a != null && csp.a.a) {
                c_0.a(par1, csp);
                c_0.a(csp, (long)csp.a);
            }
            ((ac)((Object)csp.a)).a = par1;
            float f2 = c_0.a(par1, par2, par4, par6, par9);
            GL11.glDisable((int)2884);
            GL11.glCullFace((int)1028);
            GL11.glDisable((int)2896);
            GL11.glShadeModel((int)7425);
            if (b_0.f && csp.a == null) {
                csp.a = aZ.a().a(csp);
            }
            aZ.a().a(csp.a(), csp.a, null, 0L, csp.b[csp.g], false, 0.0f, false);
            GL11.glPopMatrix();
            GL11.glEnable((int)2896);
            GL11.glShadeModel((int)7424);
            GL11.glEnable((int)2884);
            GL11.glCullFace((int)1029);
            GL11.glDisable((int)3042);
            RenderHelper.enableStandardItemLighting();
            ap_0 vec3 = new ap_0((float)par2, (float)par4, (float)par6);
            if (b_0.o) {
                c_0.a(par1, par2, par4, par6, par9);
                c_0.a(csp, vec3);
                GL11.glPopMatrix();
            }
        } else if (!par1.func_98034_c((EntityPlayer)Minecraft.getMinecraft().player)) {
            float f2 = c_0.a(par1, par2, par4, par6, par9);
            c_0.a();
            GL11.glPopMatrix();
            c_0.a((Entity)par1, par1.func_70005_c_(), par2, par4, par6, 64);
            c_0.a((Entity)par1, "CustomSteve", par2, par4 - (double)0.3f, par6, 64, -1, 0.25f);
            c_0.a((Entity)par1, "Object", par2, par4 - (double)0.55f, par6, 64, -1, 0.25f);
            c_0.a((Entity)par1, "Sound", par2, par4 - 1.0, par6, 64, -1, 1.0f);
            c_0.a((Entity)par1, "Only", par2, par4 - 1.25, par6, 64, -1, 1.0f);
            c_0.a((Entity)par1, "loading...", par2, par4 - (double)1.7f, par6, 64, c_0.a(0, 255, 0, 0), 0.25f);
        }
    }

    public static void d(EntityLivingBase par1, double par2, double par4, double par6, float par9) {
        boolean adr = true;
        GL11.glEnable((int)2929);
        GL11.glDepthFunc((int)515);
        GL11.glDepthMask((boolean)true);
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        String username = par1.func_70005_c_();
        k csp = a_0.instance.a(username);
        double sourcePar4 = par4;
        int lastCurrentPointer = 0;
        if (csp != null) {
            lastCurrentPointer = csp.c();
        }
        if (csp == null || csp.l != -1) {
            if (!par1.func_98034_c((EntityPlayer)Minecraft.getMinecraft().player)) {
                float f2 = c_0.a(par1, par2, par4, par6, par9);
                c_0.a();
                GL11.glPopMatrix();
                c_0.a((Entity)par1, par1.func_70005_c_(), par2, par4, par6, 64);
                c_0.a((Entity)par1, "CustomSteve", par2, par4 - (double)0.3f, par6, 64, -1, 0.25f);
                c_0.a((Entity)par1, "Object", par2, par4 - (double)0.55f, par6, 64, -1, 0.25f);
                c_0.a((Entity)par1, "Sound", par2, par4 - 1.0, par6, 64, -1, 1.0f);
                c_0.a((Entity)par1, "Only", par2, par4 - 1.25, par6, 64, -1, 1.0f);
                c_0.a((Entity)par1, "Error:" + (int)(csp.l ? 1 : 0), par2, par4 - (double)1.7f, par6, 64, c_0.a(255, 0, 0, 0), 0.25f);
            }
            return;
        }
        if (!((bc.a)((Object)csp.a)).f) {
            ((ac)((Object)csp.a)).a = par1;
            float f2 = c_0.a(par1, par2, par4, par6, par9);
            GL11.glDisable((int)2884);
            GL11.glDisable((int)2896);
            GL11.glShadeModel((int)7425);
            a.clear();
            a.put(FloatBuffer.wrap(new float[]{0.5f, 0.5f, 0.5f, 1.0f}));
            a.flip();
            a.clear();
            int p2 = 0;
            boolean mp = false;
            ai_0[] ms = ((ax)((ArrayList)((Object)((ac)((Object)csp.a)).a)).get((int)0)).b;
            if (adr) {
                ARBMultitexture.glActiveTextureARB((int)33986);
                GL11.glEnable((int)3553);
                ARBMultitexture.glActiveTextureARB((int)33987);
                GL11.glEnable((int)3553);
            }
            for (aB aB2 : ms) {
                aB2.d = csp.a();
                ARBMultitexture.glActiveTextureARB((int)33984);
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)aB2.e);
                if (aB2.b == null) {
                    GL11.glBindTexture((int)3553, (int)-1);
                    GL11.glDisable((int)3553);
                    GL11.glColor4f((float)aB2.a, (float)aB2.b, (float)aB2.c, (float)aB2.e);
                } else if (!aB2.a()) {
                    GL11.glDisable((int)3553);
                } else {
                    GL11.glEnable((int)3553);
                }
                if (adr && aB2.a > -1) {
                    ARBMultitexture.glActiveTextureARB((int)33986);
                    aB2.a((ac)((Object)csp.a));
                    GL11.glTexEnvf((int)8960, (int)34161, (float)260.0f);
                    GL11.glTexParameteri((int)3553, (int)10242, (int)33071);
                    GL11.glTexParameteri((int)3553, (int)10243, (int)33071);
                    if (aB2.c != null) {
                        // empty if block
                    }
                }
                if (adr && aB2.c != null) {
                    ARBMultitexture.glActiveTextureARB((int)33987);
                    GL11.glEnable((int)3553);
                    aB2.a();
                    GL11.glTexEnvf((int)8960, (int)8704, (float)260.0f);
                }
                GL11.glMaterialf((int)1032, (int)5633, (float)aB2.f);
                a.put(FloatBuffer.wrap(new float[0]));
                if (aB2.a > 0) {
                    GL11.glMaterial((int)1032, (int)5634, (FloatBuffer)c_0.a(aB2.m, aB2.n, aB2.o, aB2.e));
                    GL11.glMaterial((int)1032, (int)4610, (FloatBuffer)c_0.a(aB2.g, aB2.h, aB2.i, aB2.e));
                } else {
                    GL11.glMaterial((int)1032, (int)4608, (FloatBuffer)c_0.a(aB2.j, aB2.k, aB2.l, aB2.e));
                    GL11.glMaterial((int)1032, (int)4609, (FloatBuffer)c_0.a(aB2.a, aB2.b, aB2.c, aB2.e));
                    GL11.glMaterial((int)1032, (int)4610, (FloatBuffer)c_0.a(aB2.g, aB2.h, aB2.i, aB2.e));
                }
                if (aB2.a > 0 || aB2.c != null) {
                    ARBMultitexture.glActiveTextureARB((int)33984);
                }
                GL11.glBegin((int)4);
                if (aB2.a == null) {
                    aB2.a(p2, (ArrayList<aH>)((Object)((ax)((ArrayList)((Object)((ac)((Object)csp.a)).a)).get((int)0)).a));
                }
                for (aH f3 : aB2.a) {
                    f3.a();
                }
                GL11.glEnd();
                if (adr && aB2.c != null) {
                    ARBMultitexture.glActiveTextureARB((int)33987);
                    GL11.glDisable((int)3553);
                }
                if (!adr || aB2.a > 0) {
                    // empty if block
                }
                p2 = (int)((long)p2 + aB2.a / 3L);
            }
            GL11.glEnable((int)3553);
            OpenGlHelper.setActiveTexture((int)OpenGlHelper.defaultTexUnit);
            GL11.glCullFace((int)1029);
            GL11.glEnable((int)2884);
            GL11.glPopMatrix();
            ARBMultitexture.glActiveTextureARB((int)33984);
            GL11.glTexEnvi((int)8960, (int)8704, (int)8448);
            GL11.glBindTexture((int)3553, (int)-1);
            ARBMultitexture.glActiveTextureARB((int)33986);
            GL11.glTexEnvi((int)8960, (int)8704, (int)8448);
            GL11.glBindTexture((int)3553, (int)-1);
            ARBMultitexture.glActiveTextureARB((int)33987);
            GL11.glBindTexture((int)3553, (int)-1);
            GL11.glDisable((int)3168);
            GL11.glDisable((int)3169);
            ARBMultitexture.glActiveTextureARB((int)33984);
            GL11.glDisable((int)3042);
            RenderHelper.enableStandardItemLighting();
            ap_0 vec3 = new ap_0((float)par2, (float)par4, (float)par6);
            if (b_0.o) {
                c_0.a(par1, par2, par4, par6, par9);
                c_0.a(csp, vec3);
                GL11.glPopMatrix();
            }
            GL11.glDepthMask((boolean)true);
        } else if (!par1.func_98034_c((EntityPlayer)Minecraft.getMinecraft().player)) {
            float f2 = c_0.a(par1, par2, par4, par6, par9);
            c_0.a();
            GL11.glPopMatrix();
            c_0.a((Entity)par1, par1.func_70005_c_(), par2, par4, par6, 64);
            c_0.a((Entity)par1, "CustomSteve", par2, par4 - (double)0.3f, par6, 64, -1, 0.25f);
            c_0.a((Entity)par1, "Object", par2, par4 - (double)0.55f, par6, 64, -1, 0.25f);
            c_0.a((Entity)par1, "Sound", par2, par4 - 1.0, par6, 64, -1, 1.0f);
            c_0.a((Entity)par1, "Only", par2, par4 - 1.25, par6, 64, -1, 1.0f);
            c_0.a((Entity)par1, "loading...", par2, par4 - (double)1.7f, par6, 64, c_0.a(0, 255, 0, 0), 0.25f);
        }
    }

    private static float a(float par1, float par2, float par3) {
        float f3;
        for (f3 = par2 - par1; f3 < -180.0f; f3 += 360.0f) {
        }
        while (f3 >= 180.0f) {
            f3 -= 360.0f;
        }
        return par1 + par3 * f3;
    }

    protected static void a(Entity par1, String par2, double par3, double par5, double par7, int par9, int RGBA, float A2) {
        if (Minecraft.getMinecraft().getRenderManager().renderViewEntity == null) {
            return;
        }
        double d3 = par1.getDistanceSq(Minecraft.getMinecraft().getRenderManager().renderViewEntity);
        if (d3 <= (double)(par9 * par9)) {
            FontRenderer fontrenderer = Minecraft.getMinecraft().getRenderManager().getFontRenderer();
            float f2 = 1.6f;
            float f1 = 0.016666668f * f2;
            GL11.glPushMatrix();
            GL11.glTranslatef((float)((float)par3 + 0.0f), (float)((float)par5 + par1.height + 0.5f), (float)((float)par7));
            GL11.glNormal3f((float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)(-Minecraft.getMinecraft().getRenderManager().playerViewY), (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)Minecraft.getMinecraft().getRenderManager().playerViewX, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)(-f1), (float)(-f1), (float)f1);
            GL11.glDisable((int)2896);
            GL11.glDepthMask((boolean)false);
            GL11.glDisable((int)2929);
            GL11.glEnable((int)3042);
            OpenGlHelper.glBlendFunc((int)770, (int)771, (int)1, (int)0);
            Tessellator tessellator = Tessellator.getInstance();
            VertexBuffer vb = tessellator.func_178180_c();
            int b0 = 0;
            GL11.glDisable((int)3553);
            vb.func_181668_a(7, DefaultVertexFormats.POSITION_COLOR);
            int j2 = fontrenderer.getStringWidth(par2) / 2;
            vb.func_181669_b(0, 0, 0, (int)A2);
            vb.func_181662_b((double)(-j2 - 1), (double)(-1 + b0), 0.0);
            vb.func_181662_b((double)(-j2 - 1), (double)(8 + b0), 0.0);
            vb.func_181662_b((double)(j2 + 1), (double)(8 + b0), 0.0);
            vb.func_181662_b((double)(j2 + 1), (double)(-1 + b0), 0.0);
            tessellator.draw();
            GL11.glEnable((int)3553);
            fontrenderer.drawString(par2, -fontrenderer.getStringWidth(par2) / 2, b0, 0x20FFFFFF);
            GL11.glEnable((int)2929);
            GL11.glDepthMask((boolean)true);
            fontrenderer.drawString(par2, -fontrenderer.getStringWidth(par2) / 2, b0, RGBA);
            GL11.glEnable((int)2896);
            GL11.glDisable((int)3042);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glPopMatrix();
        }
    }

    protected static void a(Entity par1, String par2, double par3, double par5, double par7, int par9) {
        if (Minecraft.getMinecraft().getRenderManager().renderViewEntity == null) {
            return;
        }
        double d3 = par1.getDistanceSq(Minecraft.getMinecraft().getRenderManager().renderViewEntity);
        if (d3 <= (double)(par9 * par9)) {
            FontRenderer fontrenderer = Minecraft.getMinecraft().getRenderManager().getFontRenderer();
            float f2 = 1.6f;
            float f1 = 0.016666668f * f2;
            GL11.glPushMatrix();
            GL11.glTranslatef((float)((float)par3 + 0.0f), (float)((float)par5 + par1.height + 0.5f), (float)((float)par7));
            GL11.glNormal3f((float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)(-Minecraft.getMinecraft().getRenderManager().playerViewY), (float)0.0f, (float)1.0f, (float)0.0f);
            if (Minecraft.getMinecraft().gameSettings.thirdPersonView == 2) {
                GL11.glRotatef((float)Minecraft.getMinecraft().getRenderManager().playerViewX, (float)-1.0f, (float)0.0f, (float)0.0f);
            } else {
                GL11.glRotatef((float)Minecraft.getMinecraft().getRenderManager().playerViewX, (float)1.0f, (float)0.0f, (float)0.0f);
            }
            GL11.glScalef((float)(-f1), (float)(-f1), (float)f1);
            GL11.glDisable((int)2896);
            GL11.glDepthMask((boolean)false);
            GL11.glDisable((int)2929);
            GL11.glEnable((int)3042);
            OpenGlHelper.glBlendFunc((int)770, (int)771, (int)1, (int)0);
            Tessellator tessellator = Tessellator.getInstance();
            VertexBuffer vb = tessellator.func_178180_c();
            int b0 = 0;
            GL11.glDisable((int)3553);
            vb.func_181668_a(7, DefaultVertexFormats.POSITION_COLOR);
            int j2 = fontrenderer.getStringWidth(par2) / 2;
            vb.func_181666_a(0.0f, 0.0f, 0.0f, 0.25f);
            vb.func_181662_b((double)(-j2 - 1), (double)(-1 + b0), 0.0);
            vb.func_181662_b((double)(-j2 - 1), (double)(8 + b0), 0.0);
            vb.func_181662_b((double)(j2 + 1), (double)(8 + b0), 0.0);
            vb.func_181662_b((double)(j2 + 1), (double)(-1 + b0), 0.0);
            tessellator.draw();
            GL11.glEnable((int)3553);
            fontrenderer.drawString(par2, -fontrenderer.getStringWidth(par2) / 2, b0, 0x20FFFFFF);
            GL11.glEnable((int)2929);
            GL11.glDepthMask((boolean)true);
            fontrenderer.drawString(par2, -fontrenderer.getStringWidth(par2) / 2, b0, -1);
            GL11.glEnable((int)2896);
            GL11.glDisable((int)3042);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glPopMatrix();
        }
    }

    public static int[] a(int par4) {
        int[] result = new int[]{par4 >> 16 & 0xFF, par4 >> 8 & 0xFF, par4 & 0xFF, par4 >> 24 & 0xFF};
        return result;
    }

    public static int a(int r2, int g2, int b2, int a2) {
        r2 = (r2 & 0xFF) << 16;
        g2 = (g2 & 0xFF) << 8;
        a2 = (a2 & 0xFF) << 24;
        return r2 + g2 + (b2 &= 0xFF) + a2;
    }

    public static void a(float s, al transform, float random) {
        GL11.glColor3f((float)127.0f, (float)127.0f, (float)127.0f);
        GL11.glBegin((int)7);
        ap_0 randomV = new am().a(random, 0.0f, 0.0f).a(new ap_0(0.0f, -s, -s));
        ap_0 vec3 = transform.a(randomV);
        GL11.glTexCoord2d((double)0.0, (double)0.0);
        GL11.glVertex3f((float)vec3.a, (float)vec3.b, (float)vec3.c);
        randomV = new am().a(random, 0.0f, 0.0f).a(new ap_0(0.0f, s, -s));
        vec3 = transform.a(randomV);
        GL11.glTexCoord2d((double)0.0, (double)1.0);
        GL11.glVertex3f((float)vec3.a, (float)vec3.b, (float)vec3.c);
        randomV = new am().a(random, 0.0f, 0.0f).a(new ap_0(0.0f, s, s));
        vec3 = transform.a(randomV);
        GL11.glTexCoord2d((double)1.0, (double)1.0);
        GL11.glVertex3f((float)vec3.a, (float)vec3.b, (float)vec3.c);
        randomV = new am().a(random, 0.0f, 0.0f).a(new ap_0(0.0f, -s, s));
        vec3 = transform.a(randomV);
        GL11.glTexCoord2d((double)1.0, (double)0.0);
        GL11.glVertex3f((float)vec3.a, (float)vec3.b, (float)vec3.c);
        GL11.glEnd();
    }

    public static void b(float s, al transform, float random) {
        GL11.glColor3f((float)127.0f, (float)127.0f, (float)127.0f);
        GL11.glBegin((int)7);
        ap_0 randomV = new am().a(0.0f, 0.0f, random).a(new ap_0(-s, -s, 0.0f));
        ap_0 vec3 = transform.a(randomV);
        GL11.glTexCoord2d((double)0.0, (double)0.0);
        GL11.glVertex3f((float)vec3.a, (float)vec3.b, (float)vec3.c);
        randomV = new am().a(0.0f, 0.0f, random).a(new ap_0(-s, s, 0.0f));
        vec3 = transform.a(randomV);
        GL11.glTexCoord2d((double)0.0, (double)1.0);
        GL11.glVertex3f((float)vec3.a, (float)vec3.b, (float)vec3.c);
        randomV = new am().a(0.0f, 0.0f, random).a(new ap_0(s, s, 0.0f));
        vec3 = transform.a(randomV);
        GL11.glTexCoord2d((double)1.0, (double)1.0);
        GL11.glVertex3f((float)vec3.a, (float)vec3.b, (float)vec3.c);
        randomV = new am().a(0.0f, 0.0f, random).a(new ap_0(s, -s, 0.0f));
        vec3 = transform.a(randomV);
        GL11.glTexCoord2d((double)1.0, (double)0.0);
        GL11.glVertex3f((float)vec3.a, (float)vec3.b, (float)vec3.c);
        GL11.glEnd();
    }

    public static void a(float s) {
        GL11.glColor3f((float)0.0f, (float)255.0f, (float)0.0f);
        float x = -s;
        float y = 0.1f;
        float z = -s;
        GL11.glBegin((int)1);
        GL11.glVertex3f((float)(0.0f + x), (float)(0.0f + y), (float)(0.0f + z));
        GL11.glVertex3f((float)(2.0f + x), (float)(0.0f + y), (float)(0.0f + z));
        GL11.glEnd();
        GL11.glBegin((int)1);
        GL11.glVertex3f((float)(0.0f + x), (float)(0.0f + y), (float)(0.0f + z));
        GL11.glVertex3f((float)(0.0f + x), (float)(2.0f + y), (float)(0.0f + z));
        GL11.glEnd();
        GL11.glBegin((int)1);
        GL11.glVertex3f((float)(0.0f + x), (float)(0.0f + y), (float)(0.0f + z));
        GL11.glVertex3f((float)(0.0f + x), (float)(0.0f + y), (float)(2.0f + z));
        GL11.glEnd();
        x = -s;
        y = s + 0.1f;
        z = -s;
        GL11.glBegin((int)1);
        GL11.glVertex3f((float)(0.0f + x), (float)(0.0f + y), (float)(0.0f + z));
        GL11.glVertex3f((float)(2.0f + x), (float)(0.0f + y), (float)(0.0f + z));
        GL11.glEnd();
        GL11.glBegin((int)1);
        GL11.glVertex3f((float)(0.0f + x), (float)(0.0f + y), (float)(0.0f + z));
        GL11.glVertex3f((float)(0.0f + x), (float)(-2.0f + y), (float)(0.0f + z));
        GL11.glEnd();
        GL11.glBegin((int)1);
        GL11.glVertex3f((float)(0.0f + x), (float)(0.0f + y), (float)(0.0f + z));
        GL11.glVertex3f((float)(0.0f + x), (float)(0.0f + y), (float)(2.0f + z));
        GL11.glEnd();
        x = s;
        y = 0.1f;
        z = s;
        GL11.glBegin((int)1);
        GL11.glVertex3f((float)(0.0f + x), (float)(0.0f + y), (float)(0.0f + z));
        GL11.glVertex3f((float)(-2.0f + x), (float)(0.0f + y), (float)(0.0f + z));
        GL11.glEnd();
        GL11.glBegin((int)1);
        GL11.glVertex3f((float)(0.0f + x), (float)(0.0f + y), (float)(0.0f + z));
        GL11.glVertex3f((float)(0.0f + x), (float)(2.0f + y), (float)(0.0f + z));
        GL11.glEnd();
        GL11.glBegin((int)1);
        GL11.glVertex3f((float)(0.0f + x), (float)(0.0f + y), (float)(0.0f + z));
        GL11.glVertex3f((float)(0.0f + x), (float)(0.0f + y), (float)(-2.0f + z));
        GL11.glEnd();
        x = s;
        y = s + 0.1f;
        z = s;
        GL11.glBegin((int)1);
        GL11.glVertex3f((float)(0.0f + x), (float)(0.0f + y), (float)(0.0f + z));
        GL11.glVertex3f((float)(-2.0f + x), (float)(0.0f + y), (float)(0.0f + z));
        GL11.glEnd();
        GL11.glBegin((int)1);
        GL11.glVertex3f((float)(0.0f + x), (float)(0.0f + y), (float)(0.0f + z));
        GL11.glVertex3f((float)(0.0f + x), (float)(-2.0f + y), (float)(0.0f + z));
        GL11.glEnd();
        GL11.glBegin((int)1);
        GL11.glVertex3f((float)(0.0f + x), (float)(0.0f + y), (float)(0.0f + z));
        GL11.glVertex3f((float)(0.0f + x), (float)(0.0f + y), (float)(-2.0f + z));
        GL11.glEnd();
        x = -s;
        y = 0.1f;
        z = s;
        GL11.glBegin((int)1);
        GL11.glVertex3f((float)(0.0f + x), (float)(0.0f + y), (float)(0.0f + z));
        GL11.glVertex3f((float)(2.0f + x), (float)(0.0f + y), (float)(0.0f + z));
        GL11.glEnd();
        GL11.glBegin((int)1);
        GL11.glVertex3f((float)(0.0f + x), (float)(0.0f + y), (float)(0.0f + z));
        GL11.glVertex3f((float)(0.0f + x), (float)(2.0f + y), (float)(0.0f + z));
        GL11.glEnd();
        GL11.glBegin((int)1);
        GL11.glVertex3f((float)(0.0f + x), (float)(0.0f + y), (float)(0.0f + z));
        GL11.glVertex3f((float)(0.0f + x), (float)(0.0f + y), (float)(-2.0f + z));
        GL11.glEnd();
        x = -s;
        y = s + 0.1f;
        z = s;
        GL11.glBegin((int)1);
        GL11.glVertex3f((float)(0.0f + x), (float)(0.0f + y), (float)(0.0f + z));
        GL11.glVertex3f((float)(2.0f + x), (float)(0.0f + y), (float)(0.0f + z));
        GL11.glEnd();
        GL11.glBegin((int)1);
        GL11.glVertex3f((float)(0.0f + x), (float)(0.0f + y), (float)(0.0f + z));
        GL11.glVertex3f((float)(0.0f + x), (float)(-2.0f + y), (float)(0.0f + z));
        GL11.glEnd();
        GL11.glBegin((int)1);
        GL11.glVertex3f((float)(0.0f + x), (float)(0.0f + y), (float)(0.0f + z));
        GL11.glVertex3f((float)(0.0f + x), (float)(0.0f + y), (float)(-2.0f + z));
        GL11.glEnd();
        x = s;
        y = 0.1f;
        z = -s;
        GL11.glBegin((int)1);
        GL11.glVertex3f((float)(0.0f + x), (float)(0.0f + y), (float)(0.0f + z));
        GL11.glVertex3f((float)(-2.0f + x), (float)(0.0f + y), (float)(0.0f + z));
        GL11.glEnd();
        GL11.glBegin((int)1);
        GL11.glVertex3f((float)(0.0f + x), (float)(0.0f + y), (float)(0.0f + z));
        GL11.glVertex3f((float)(0.0f + x), (float)(2.0f + y), (float)(0.0f + z));
        GL11.glEnd();
        GL11.glBegin((int)1);
        GL11.glVertex3f((float)(0.0f + x), (float)(0.0f + y), (float)(0.0f + z));
        GL11.glVertex3f((float)(0.0f + x), (float)(0.0f + y), (float)(2.0f + z));
        GL11.glEnd();
        x = s;
        y = s + 0.1f;
        z = -s;
        GL11.glBegin((int)1);
        GL11.glVertex3f((float)(0.0f + x), (float)(0.0f + y), (float)(0.0f + z));
        GL11.glVertex3f((float)(-2.0f + x), (float)(0.0f + y), (float)(0.0f + z));
        GL11.glEnd();
        GL11.glBegin((int)1);
        GL11.glVertex3f((float)(0.0f + x), (float)(0.0f + y), (float)(0.0f + z));
        GL11.glVertex3f((float)(0.0f + x), (float)(-2.0f + y), (float)(0.0f + z));
        GL11.glEnd();
        GL11.glBegin((int)1);
        GL11.glVertex3f((float)(0.0f + x), (float)(0.0f + y), (float)(0.0f + z));
        GL11.glVertex3f((float)(0.0f + x), (float)(0.0f + y), (float)(2.0f + z));
        GL11.glEnd();
    }

    public static void a() {
        GL11.glColor3f((float)0.0f, (float)255.0f, (float)0.0f);
        float x = -5.0f;
        float y = 0.1f;
        float z = -5.0f;
        GL11.glBegin((int)1);
        GL11.glVertex3f((float)(0.0f + x), (float)(0.0f + y), (float)(0.0f + z));
        GL11.glVertex3f((float)(2.0f + x), (float)(0.0f + y), (float)(0.0f + z));
        GL11.glEnd();
        GL11.glBegin((int)1);
        GL11.glVertex3f((float)(0.0f + x), (float)(0.0f + y), (float)(0.0f + z));
        GL11.glVertex3f((float)(0.0f + x), (float)(2.0f + y), (float)(0.0f + z));
        GL11.glEnd();
        GL11.glBegin((int)1);
        GL11.glVertex3f((float)(0.0f + x), (float)(0.0f + y), (float)(0.0f + z));
        GL11.glVertex3f((float)(0.0f + x), (float)(0.0f + y), (float)(2.0f + z));
        GL11.glEnd();
        x = -5.0f;
        y = 20.1f;
        z = -5.0f;
        GL11.glBegin((int)1);
        GL11.glVertex3f((float)(0.0f + x), (float)(0.0f + y), (float)(0.0f + z));
        GL11.glVertex3f((float)(2.0f + x), (float)(0.0f + y), (float)(0.0f + z));
        GL11.glEnd();
        GL11.glBegin((int)1);
        GL11.glVertex3f((float)(0.0f + x), (float)(0.0f + y), (float)(0.0f + z));
        GL11.glVertex3f((float)(0.0f + x), (float)(-2.0f + y), (float)(0.0f + z));
        GL11.glEnd();
        GL11.glBegin((int)1);
        GL11.glVertex3f((float)(0.0f + x), (float)(0.0f + y), (float)(0.0f + z));
        GL11.glVertex3f((float)(0.0f + x), (float)(0.0f + y), (float)(2.0f + z));
        GL11.glEnd();
        x = 5.0f;
        y = 0.1f;
        z = 5.0f;
        GL11.glBegin((int)1);
        GL11.glVertex3f((float)(0.0f + x), (float)(0.0f + y), (float)(0.0f + z));
        GL11.glVertex3f((float)(-2.0f + x), (float)(0.0f + y), (float)(0.0f + z));
        GL11.glEnd();
        GL11.glBegin((int)1);
        GL11.glVertex3f((float)(0.0f + x), (float)(0.0f + y), (float)(0.0f + z));
        GL11.glVertex3f((float)(0.0f + x), (float)(2.0f + y), (float)(0.0f + z));
        GL11.glEnd();
        GL11.glBegin((int)1);
        GL11.glVertex3f((float)(0.0f + x), (float)(0.0f + y), (float)(0.0f + z));
        GL11.glVertex3f((float)(0.0f + x), (float)(0.0f + y), (float)(-2.0f + z));
        GL11.glEnd();
        x = 5.0f;
        y = 20.1f;
        z = 5.0f;
        GL11.glBegin((int)1);
        GL11.glVertex3f((float)(0.0f + x), (float)(0.0f + y), (float)(0.0f + z));
        GL11.glVertex3f((float)(-2.0f + x), (float)(0.0f + y), (float)(0.0f + z));
        GL11.glEnd();
        GL11.glBegin((int)1);
        GL11.glVertex3f((float)(0.0f + x), (float)(0.0f + y), (float)(0.0f + z));
        GL11.glVertex3f((float)(0.0f + x), (float)(-2.0f + y), (float)(0.0f + z));
        GL11.glEnd();
        GL11.glBegin((int)1);
        GL11.glVertex3f((float)(0.0f + x), (float)(0.0f + y), (float)(0.0f + z));
        GL11.glVertex3f((float)(0.0f + x), (float)(0.0f + y), (float)(-2.0f + z));
        GL11.glEnd();
        x = -5.0f;
        y = 0.1f;
        z = 5.0f;
        GL11.glBegin((int)1);
        GL11.glVertex3f((float)(0.0f + x), (float)(0.0f + y), (float)(0.0f + z));
        GL11.glVertex3f((float)(2.0f + x), (float)(0.0f + y), (float)(0.0f + z));
        GL11.glEnd();
        GL11.glBegin((int)1);
        GL11.glVertex3f((float)(0.0f + x), (float)(0.0f + y), (float)(0.0f + z));
        GL11.glVertex3f((float)(0.0f + x), (float)(2.0f + y), (float)(0.0f + z));
        GL11.glEnd();
        GL11.glBegin((int)1);
        GL11.glVertex3f((float)(0.0f + x), (float)(0.0f + y), (float)(0.0f + z));
        GL11.glVertex3f((float)(0.0f + x), (float)(0.0f + y), (float)(-2.0f + z));
        GL11.glEnd();
        x = -5.0f;
        y = 20.1f;
        z = 5.0f;
        GL11.glBegin((int)1);
        GL11.glVertex3f((float)(0.0f + x), (float)(0.0f + y), (float)(0.0f + z));
        GL11.glVertex3f((float)(2.0f + x), (float)(0.0f + y), (float)(0.0f + z));
        GL11.glEnd();
        GL11.glBegin((int)1);
        GL11.glVertex3f((float)(0.0f + x), (float)(0.0f + y), (float)(0.0f + z));
        GL11.glVertex3f((float)(0.0f + x), (float)(-2.0f + y), (float)(0.0f + z));
        GL11.glEnd();
        GL11.glBegin((int)1);
        GL11.glVertex3f((float)(0.0f + x), (float)(0.0f + y), (float)(0.0f + z));
        GL11.glVertex3f((float)(0.0f + x), (float)(0.0f + y), (float)(-2.0f + z));
        GL11.glEnd();
        x = 5.0f;
        y = 0.1f;
        z = -5.0f;
        GL11.glBegin((int)1);
        GL11.glVertex3f((float)(0.0f + x), (float)(0.0f + y), (float)(0.0f + z));
        GL11.glVertex3f((float)(-2.0f + x), (float)(0.0f + y), (float)(0.0f + z));
        GL11.glEnd();
        GL11.glBegin((int)1);
        GL11.glVertex3f((float)(0.0f + x), (float)(0.0f + y), (float)(0.0f + z));
        GL11.glVertex3f((float)(0.0f + x), (float)(2.0f + y), (float)(0.0f + z));
        GL11.glEnd();
        GL11.glBegin((int)1);
        GL11.glVertex3f((float)(0.0f + x), (float)(0.0f + y), (float)(0.0f + z));
        GL11.glVertex3f((float)(0.0f + x), (float)(0.0f + y), (float)(2.0f + z));
        GL11.glEnd();
        x = 5.0f;
        y = 20.1f;
        z = -5.0f;
        GL11.glBegin((int)1);
        GL11.glVertex3f((float)(0.0f + x), (float)(0.0f + y), (float)(0.0f + z));
        GL11.glVertex3f((float)(-2.0f + x), (float)(0.0f + y), (float)(0.0f + z));
        GL11.glEnd();
        GL11.glBegin((int)1);
        GL11.glVertex3f((float)(0.0f + x), (float)(0.0f + y), (float)(0.0f + z));
        GL11.glVertex3f((float)(0.0f + x), (float)(-2.0f + y), (float)(0.0f + z));
        GL11.glEnd();
        GL11.glBegin((int)1);
        GL11.glVertex3f((float)(0.0f + x), (float)(0.0f + y), (float)(0.0f + z));
        GL11.glVertex3f((float)(0.0f + x), (float)(0.0f + y), (float)(2.0f + z));
        GL11.glEnd();
    }

    public static void a(ap_0 min, ap_0 max, al trans, int colorInteger) {
        aq_0 color = c_0.a(colorInteger);
        c_0.a(trans.a(new ap_0(min.a, min.b, min.c)), trans.a(new ap_0(max.a, min.b, min.c)), color);
        c_0.a(trans.a(new ap_0(max.a, min.b, min.c)), trans.a(new ap_0(max.a, max.b, min.c)), color);
        c_0.a(trans.a(new ap_0(max.a, max.b, min.c)), trans.a(new ap_0(min.a, max.b, min.c)), color);
        c_0.a(trans.a(new ap_0(min.a, max.b, min.c)), trans.a(new ap_0(min.a, min.b, min.c)), color);
        c_0.a(trans.a(new ap_0(min.a, min.b, min.c)), trans.a(new ap_0(min.a, min.b, max.c)), color);
        c_0.a(trans.a(new ap_0(max.a, min.b, min.c)), trans.a(new ap_0(max.a, min.b, max.c)), color);
        c_0.a(trans.a(new ap_0(max.a, max.b, min.c)), trans.a(new ap_0(max.a, max.b, max.c)), color);
        c_0.a(trans.a(new ap_0(min.a, max.b, min.c)), trans.a(new ap_0(min.a, max.b, max.c)), color);
        c_0.a(trans.a(new ap_0(min.a, min.b, max.c)), trans.a(new ap_0(max.a, min.b, max.c)), color);
        c_0.a(trans.a(new ap_0(max.a, min.b, max.c)), trans.a(new ap_0(max.a, max.b, max.c)), color);
        c_0.a(trans.a(new ap_0(max.a, max.b, max.c)), trans.a(new ap_0(min.a, max.b, max.c)), color);
        c_0.a(trans.a(new ap_0(min.a, max.b, max.c)), trans.a(new ap_0(min.a, min.b, max.c)), color);
    }

    public static void a(al transform, float radius, int colorInteger) {
        aq_0 color = c_0.a(colorInteger);
        ap_0 center = transform.a();
        ap_0 up = transform.a().a(1);
        ap_0 axis = transform.a().a(0);
        float minTh = -1.5707964f;
        float maxTh = 1.5707964f;
        float minPs = -1.5707964f;
        float maxPs = 1.5707964f;
        float stepDegrees = 30.0f;
        c_0.a(center, up, axis, radius, minTh, maxTh, minPs, maxPs, color, stepDegrees, false);
        c_0.a(center, up, axis.a(), radius, minTh, maxTh, minPs, maxPs, color, stepDegrees, false);
    }

    public static void a(float radius, float halfHeight, int upAxis, al transform, int colorInteger) {
        aq_0 color = c_0.a(colorInteger);
        int stepDegrees = 30;
        ap_0 capStart = new ap_0(0.0f, 0.0f, 0.0f);
        capStart.a(upAxis, -halfHeight);
        ap_0 capEnd = new ap_0(0.0f, 0.0f, 0.0f);
        capEnd.a(upAxis, halfHeight);
        al childTransform = new al(transform);
        childTransform.d(transform.a(capStart));
        ap_0 center = childTransform.a();
        ap_0 up = childTransform.a().a((upAxis + 1) % 3);
        ap_0 axis = childTransform.a().a(upAxis).a();
        float minTh = -1.5707964f;
        float maxTh = 1.5707964f;
        float minPs = -1.5707964f;
        float maxPs = 1.5707964f;
        c_0.a(center, up, axis, radius, minTh, maxTh, minPs, maxPs, color, stepDegrees, false);
        childTransform = transform;
        childTransform.d(transform.a(capEnd));
        center = childTransform.a();
        up = childTransform.a().a((upAxis + 1) % 3);
        axis = childTransform.a().a(upAxis);
        minTh = -1.5707964f;
        maxTh = 1.5707964f;
        minPs = -1.5707964f;
        maxPs = 1.5707964f;
        c_0.a(center, up, axis, radius, minTh, maxTh, minPs, maxPs, color, stepDegrees, false);
        ap_0 start = transform.a();
        for (int i2 = 0; i2 < 360; i2 += stepDegrees) {
            capStart.a(upAxis, -halfHeight);
            capEnd.a(upAxis, halfHeight);
            capEnd.a((upAxis + 1) % 3, (float)Math.sin((float)i2 * ((float)Math.PI / 180)) * radius);
            capStart.a((upAxis + 1) % 3, (float)Math.sin((float)i2 * ((float)Math.PI / 180)) * radius);
            capEnd.a((upAxis + 2) % 3, (float)Math.cos((float)i2 * ((float)Math.PI / 180)) * radius);
            capStart.a((upAxis + 2) % 3, (float)Math.cos((float)i2 * ((float)Math.PI / 180)) * radius);
            capStart.a(upAxis, capStart.a(upAxis) - halfHeight);
            capEnd.a(upAxis, capEnd.a(upAxis) - halfHeight);
            c_0.a(transform.a(capStart), transform.a(capEnd), color);
        }
    }

    public static void a(int size, int yFix) {
        GL11.glDisable((int)3553);
        GL11.glDisable((int)3008);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)0.01f);
        GL11.glBegin((int)7);
        float[] vertex_list = new float[]{-0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, -0.5f, 0.5f, -0.5f, 0.5f, 0.5f, -0.5f, -0.5f, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f};
        int[] index_list = new int[]{0, 2, 3, 1, 0, 4, 6, 2, 0, 1, 5, 4, 4, 5, 7, 6, 1, 3, 7, 5, 2, 6, 7, 3};
        for (int i2 = 0; i2 < 6; ++i2) {
            for (int j2 = 0; j2 < 4; ++j2) {
                GL11.glVertex3f((float)(vertex_list[index_list[i2 * 4 + j2] * 3 + 0] * (float)size), (float)(vertex_list[index_list[i2 * 4 + j2] * 3 + 1] * (float)size + (float)yFix), (float)(vertex_list[index_list[i2 * 4 + j2] * 3 + 2] * (float)size));
            }
        }
        GL11.glEnd();
        GL11.glEnable((int)3008);
        GL11.glEnable((int)3553);
    }

    public static void a(k csp, ap_0 trans) {
        ArrayList<ac_0> rbs = csp.a().g;
        GL11.glDisable((int)3553);
        GL11.glDisable((int)2896);
        for (ac_0 rb : rbs) {
            al transform = new al();
            if (rb.d == 1) {
                // empty if block
            }
            transform.d(rb.a);
            transform.b(rb.a);
            float[] RGBA = new float[4];
            RGBA[3] = 255.0f;
            bd.a(rb.a).a(RGBA);
            switch (rb.c) {
                case 0: {
                    c_0.a(transform, rb.a, c_0.a((int)RGBA[0], (int)RGBA[1], (int)RGBA[2], (int)RGBA[3]));
                    break;
                }
                case 1: {
                    ap_0 xyz = new ap_0(rb.a, rb.b, rb.c);
                    c_0.a(xyz.a(), xyz, transform, c_0.a((int)RGBA[0], (int)RGBA[1], (int)RGBA[2], (int)RGBA[3]));
                    break;
                }
                case 2: {
                    c_0.a(rb.a, rb.b / 2.0f, 1, transform, c_0.a((int)RGBA[0], (int)RGBA[1], (int)RGBA[2], (int)RGBA[3]));
                }
            }
        }
        GL11.glEnable((int)2896);
        GL11.glEnable((int)3553);
    }

    public static void a(ap_0 center, ap_0 up, ap_0 axis, float radius, float minTh, float maxTh, float minPs, float maxPs, aq_0 color, float stepDegrees, boolean drawCenter) {
        int n_hor;
        ap_0[] pvA = new ap_0[74];
        ap_0[] pvB = new ap_0[74];
        ap_0 npole = center.b(up.a(radius));
        ap_0 spole = center.l(up.a(radius));
        ap_0 arcStart = new ap_0();
        float step = stepDegrees * ((float)Math.PI / 180);
        ap_0 kv = up;
        ap_0 iv = axis;
        ap_0 jv = kv.d(iv);
        boolean drawN = false;
        boolean drawS = false;
        if (minTh <= -1.5707964f) {
            minTh = -1.5707964f + step;
            drawN = true;
        }
        if (maxTh >= 1.5707964f) {
            maxTh = 1.5707964f - step;
            drawS = true;
        }
        if (minTh > maxTh) {
            minTh = -1.5707964f + step;
            maxTh = 1.5707964f - step;
            drawS = true;
            drawN = true;
        }
        if ((n_hor = (int)((maxTh - minTh) / step) + 1) < 2) {
            n_hor = 2;
        }
        float step_h = (maxTh - minTh) / (float)(n_hor - 1);
        boolean isClosed = false;
        if (minPs > maxPs) {
            minPs = (float)(-Math.PI + (double)step);
            maxPs = (float)Math.PI;
            isClosed = true;
        } else {
            isClosed = maxPs - minPs >= (float)Math.PI * 2;
        }
        int n_vert = (int)((maxPs - minPs) / step) + 1;
        if (n_vert < 2) {
            n_vert = 2;
        }
        float step_v = (maxPs - minPs) / (float)(n_vert - 1);
        for (int i2 = 0; i2 < n_hor; ++i2) {
            float th = minTh + (float)i2 * step_h;
            float sth = (float)((double)radius * Math.sin(th));
            float cth = (float)((double)radius * Math.cos(th));
            for (int j2 = 0; j2 < n_vert; ++j2) {
                float psi = minPs + (float)j2 * step_v;
                float sps = (float)Math.sin(psi);
                float cps = (float)Math.cos(psi);
                pvB[j2] = center.b(iv.a(cth * cps)).b(jv.a(cth * sps)).b(kv.a(sth));
                if (i2 > 0) {
                    c_0.a(pvA[j2], pvB[j2], color);
                } else if (drawS) {
                    c_0.a(spole, pvB[j2], color);
                }
                if (j2 > 0) {
                    c_0.a(pvB[j2 - 1], pvB[j2], color);
                } else {
                    arcStart = pvB[j2];
                }
                if (i2 == n_hor - 1 && drawN) {
                    c_0.a(npole, pvB[j2], color);
                }
                if (!drawCenter) continue;
                if (isClosed) {
                    if (j2 != n_vert - 1) continue;
                    c_0.a(arcStart, pvB[j2], color);
                    continue;
                }
                if (i2 == 0 && i2 != n_hor - 1 || j2 == 0 && j2 != n_vert - 1) continue;
                c_0.a(center, pvB[j2], color);
            }
            ap_0[] pT = (ap_0[])pvA.clone();
            pvA = (ap_0[])pvB.clone();
            pvB = (ap_0[])pT.clone();
        }
    }

    public static FloatBuffer a(float a1, float a2, float a3, float a4) {
        a.clear();
        a.put(FloatBuffer.wrap(new float[]{a1, a2, a3, a4}));
        a.flip();
        return a;
    }

    public static void a(ap_0 from, ap_0 to, aq_0 color) {
        c_0.a(from, to, color, color);
    }

    public static void a(ap_0 from, ap_0 to, aq_0 fromColor, aq_0 toColor) {
        GL11.glBegin((int)1);
        GL11.glColor4f((float)fromColor.c(), (float)fromColor.d(), (float)fromColor.e(), (float)fromColor.f());
        GL11.glVertex3d((double)from.c(), (double)from.d(), (double)from.e());
        GL11.glColor4f((float)toColor.c(), (float)toColor.d(), (float)toColor.e(), (float)fromColor.f());
        GL11.glVertex3d((double)to.c(), (double)to.d(), (double)to.e());
        GL11.glEnd();
    }

    public static aq_0 a(int color) {
        int[] rgba = c_0.a(color);
        aq_0 result = new aq_0((float)rgba[0] / 255.0f, (float)rgba[1] / 255.0f, (float)rgba[2] / 255.0f, (float)rgba[3] / 255.0f);
        return result;
    }

    public static void a(ResourceLocation par1ResourceLocation) {
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

    public static void a(EntityLivingBase par1, k csp) {
        boolean boots;
        boolean helmet = ((AbstractClientPlayer)par1).field_71071_by.armorInventory[3] != null;
        boolean chestplate = ((AbstractClientPlayer)par1).field_71071_by.armorInventory[2] != null;
        boolean leggings = ((AbstractClientPlayer)par1).field_71071_by.armorInventory[1] != null;
        boolean bl = boots = ((AbstractClientPlayer)par1).field_71071_by.armorInventory[0] != null;
        if (((ac)((Object)csp.a)).a != null) {
            float f2 = ((ac)((Object)csp.a)).a.a = helmet ? 1.0f : 0.0f;
        }
        if (((ac)((Object)csp.a)).b != null) {
            float f3 = ((ac)((Object)csp.a)).b.a = chestplate ? 1.0f : 0.0f;
        }
        if (((ac)((Object)csp.a)).c != null) {
            float f4 = ((ac)((Object)csp.a)).c.a = leggings ? 1.0f : 0.0f;
        }
        if (((ac)((Object)csp.a)).d != null) {
            ((ac)((Object)csp.a)).d.a = boots ? 1.0f : 0.0f;
        }
    }

    public static void a(k csp, long faceP) {
        int index = 0;
        for (aB aB2 : ((ax)((ArrayList)((Object)((ac)((Object)csp.a)).a)).get((int)0)).b) {
            for (aQ pm : ((ac)((Object)csp.a)).h) {
                int indexP;
                if (pm.a) {
                    if (pm.b == 8) {
                        indexP = 0;
                        for (int matI : pm.j) {
                            if (matI == index) {
                                aB2.e = pm.k.get(indexP) == 1 ? aB2.d + pm.l.get(indexP)[3] * pm.a : (aB2.e *= pm.l.get(indexP)[3] * pm.a);
                                if (aB2.e < 0.0f) {
                                    aB2.e = 0.0f;
                                }
                            }
                            ++indexP;
                        }
                        continue;
                    }
                    if (pm.b != 0) continue;
                    for (int i2 = 0; i2 < ((ArrayList)((Object)pm.a)).size(); ++i2) {
                        aQ spm = ((ac)((Object)csp.a)).h.get((Integer)((ArrayList)((Object)pm.a)).get(i2));
                        spm.a = pm.a == 1.0f;
                        spm.a = ((Float)((ArrayList)((Object)pm.b)).get(i2)).floatValue();
                    }
                    continue;
                }
                if (pm.b != 8) continue;
                if (pm.u != null && (long)pm.u.size() > faceP) {
                    indexP = 0;
                    for (int matI : pm.j) {
                        if (matI == index) {
                            if (pm.k.get(indexP) == 1) {
                                aB2.e = aB2.d + pm.l.get(indexP)[3] * pm.u.get((int)faceP).floatValue();
                            } else {
                                float amnt = pm.u.get((int)faceP).floatValue();
                                aB2.e = (1.0f - amnt) * aB2.d + amnt * pm.l.get(indexP)[3];
                            }
                        }
                        ++indexP;
                    }
                    continue;
                }
                if (pm.a == 0.0f) continue;
                indexP = 0;
                for (int matI : pm.j) {
                    if (matI == index) {
                        aB2.e = aB2.d;
                    }
                    ++indexP;
                }
                pm.a = 0.0f;
            }
            ++index;
        }
    }
}

