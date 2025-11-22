/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  custombuki.aa
 *  custombuki.av
 *  customsteve.do
 *  net.minecraft.block.Block
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.AbstractClientPlayer
 *  net.minecraft.client.gui.FontRenderer
 *  net.minecraft.client.gui.Gui
 *  net.minecraft.client.renderer.OpenGlHelper
 *  net.minecraft.client.renderer.RenderBlocks
 *  net.minecraft.client.renderer.RenderHelper
 *  net.minecraft.client.renderer.Tessellator
 *  net.minecraft.client.renderer.entity.RenderManager
 *  net.minecraft.client.renderer.texture.TextureManager
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.passive.EntityHorse
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.EnumAction
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemBlock
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.IIcon
 *  net.minecraft.util.MathHelper
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.world.IBlockAccess
 *  net.minecraftforge.client.ForgeHooksClient
 *  net.minecraftforge.client.IItemRenderer
 *  net.minecraftforge.client.IItemRenderer$ItemRenderType
 *  net.minecraftforge.client.IItemRenderer$ItemRendererHelper
 *  net.minecraftforge.client.MinecraftForgeClient
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.opengl.ARBMultitexture
 *  org.lwjgl.opengl.GL11
 */
import custombuki.aa;
import custombuki.av;
import customsteve.do;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.client.ForgeHooksClient;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.ARBMultitexture;
import org.lwjgl.opengl.GL11;

public class Hooks {
    private static float proved$ = 0.0f;
    private static int attract$ = 0;
    private static ResourceLocation faced$ = new ResourceLocation("textures/misc/enchanted_item_glint.png");
    private static FloatBuffer restore$ = ByteBuffer.allocateDirect(64).order(ByteOrder.nativeOrder()).asFloatBuffer();
    private static FloatBuffer heath$ = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
    private static FloatBuffer moves$ = BufferUtils.createFloatBuffer((int)64);
    private static int gifts$ = 0;
    private static float denver$ = 9.0f;
    private static float strikes$ = 0.0f;
    private static int garbage$ = 0;
    public static boolean petite$ = true;

    public static void _spanking(EntityLivingBase par1, double par2, double par4, double par6, float par9) {
        int lostFrame;
        CSmanager.cellular$._pubmed();
        boolean noCamera = CSmanager.cellular$.trucks$ != null && CSmanager.cellular$.trucks$.a != null && CSmanager.cellular$.trucks$.a.suffered$ == null;
        GL11.glEnable((int)2929);
        GL11.glDepthFunc((int)515);
        GL11.glDepthMask((boolean)true);
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        double sourcePar4 = par4;
        par4 -= (double)par1.field_70129_M;
        String username = par1.func_70005_c_();
        CSplayer csp = CSmanager.cellular$._stanley(username);
        boolean updated = false;
        if (csp.smaller$ != null) {
            updated = csp.smaller$.created$;
        }
        int lastCurrentPointer = 0;
        if (csp != null) {
            lastCurrentPointer = csp.c();
        }
        if ((lostFrame = lastCurrentPointer - csp.k) > 1) {
            csp.l += lostFrame;
        }
        csp.k = lastCurrentPointer;
        Minecraft.func_71410_x().func_110434_K().func_110577_a(Gui.field_110325_k);
        if (csp.n != -1) {
            if (!par1.func_98034_c((EntityPlayer)Minecraft.func_71410_x().field_71439_g)) {
                float f2 = Hooks._twice(par1, par2, par4, par6, par9);
                Hooks._submit();
                GL11.glPopMatrix();
                Hooks._impact((Entity)par1, par1.func_70005_c_(), par2, par4, par6, 64);
                Hooks._moldova((Entity)par1, "CustomSteve", par2, par4 - (double)0.3f, par6, 64, -1, 0.25f);
                Hooks._moldova((Entity)par1, "Object", par2, par4 - (double)0.55f, par6, 64, -1, 0.25f);
                Hooks._moldova((Entity)par1, "Sound", par2, par4 - 1.0, par6, 64, -1, 1.0f);
                Hooks._moldova((Entity)par1, "Only", par2, par4 - 1.25, par6, 64, -1, 1.0f);
                Hooks._moldova((Entity)par1, "Error:" + csp.n, par2, par4 - (double)1.7f, par6, 64, Hooks._lycos(255, 0, 0, 0), 0.25f);
            }
            return;
        }
        if (!csp.a.bringing$) {
            int z;
            int y;
            int x;
            Block block;
            if (par1.func_70608_bn() && (block = par1.field_70170_p.func_147439_a(MathHelper.func_76128_c((double)par1.field_70165_t), MathHelper.func_76128_c((double)par1.field_70163_u), MathHelper.func_76128_c((double)par1.field_70161_v))).isBed((IBlockAccess)par1.field_70170_p, x = MathHelper.func_76128_c((double)par1.field_70165_t), y = MathHelper.func_76128_c((double)par1.field_70163_u), z = MathHelper.func_76128_c((double)par1.field_70161_v), par1)) {
                int j;
                garbage$ = j = block.getBedDirection((IBlockAccess)par1.field_70170_p, x, y, z);
                strikes$ = j * 90;
            }
            if (Minecraft.func_71410_x().field_71474_y.field_74320_O == 0 && csp == CSmanager.cellular$.trucks$) {
                GL11.glEnable((int)2884);
                GL11.glCullFace((int)1028);
                if (ShaderProgram.wonder$.enabling$) {
                    gifts$ = 0;
                }
            } else {
                GL11.glDisable((int)2884);
                if (ShaderProgram.wonder$.enabling$) {
                    gifts$ = 1;
                }
            }
            if (!petite$) {
                // empty if block
            }
            csp.a.thursday$ = par1;
            if (!Config.maybe$ && csp.smaller$ == null) {
                csp.smaller$ = CSRender2._outline()._merger(csp);
            }
            ShaderProgram sp = ShaderProgram.wonder$;
            float f2 = Hooks._twice(par1, par2, par4, par6, par9);
            long BeginTime = System.nanoTime();
            sp._hundred(par1.field_70165_t, par1.field_70163_u, par1.field_70161_v);
            int nBuffer = csp.wildlife$;
            csp.father$[nBuffer].writeLock().lock();
            ArrayList<Matrix4f> boneBuffer = new ArrayList<Matrix4f>();
            for (Bone b2 : csp.a.pointer$) {
                boneBuffer.add(b2.catalog$[nBuffer]);
            }
            long faceP = csp.hoped$[csp.wildlife$];
            csp.father$[nBuffer].writeLock().unlock();
            if (updated) {
                Hooks._closure(par1, csp);
                if (!ShaderProgram.wonder$.enabling$) {
                    Hooks._faculty(csp, faceP);
                }
            }
            if (!par1.func_98034_c((EntityPlayer)Minecraft.func_71410_x().field_71439_g)) {
                CSRender2._outline()._rwanda("/CustomSteve/textures/" + csp.a(), csp.smaller$, boneBuffer, CSmanager.cellular$.positive$ != 0 ? (long)CSmanager.cellular$.positive$ : faceP, csp.prophet$[csp.wildlife$] && csp.smaller$.created$, false, 0.0f, false);
            }
            if (Config.permit$ && csp.a.size() > 0) {
                for (int i = 0; i < csp.a.size(); ++i) {
                    WeaponFileInfo wfi = (WeaponFileInfo)csp.a.get(i);
                    CSRenderHW325 handle = (CSRenderHW325)((WeaponFileInfo)csp.a.get((int)i)).cindy$;
                    ArrayList<Matrix4f> amm4f = null;
                    if (updated) {
                        amm4f = new ArrayList<Matrix4f>();
                        for (int j = 0; j < handle.infinite$.pointer$.size(); ++j) {
                            Bone b3 = (Bone)handle.infinite$.pointer$.get(j);
                            amm4f.add(b3.catalog$[csp.wildlife$]);
                        }
                    }
                    if (!wfi.envelope$) continue;
                    CSRender2._outline()._rwanda(wfi.rebel$, handle, amm4f, CSmanager.cellular$.positive$ != 0 ? (long)CSmanager.cellular$.positive$ : faceP, updated, false, 0.0f, false);
                }
            }
            GL11.glPopMatrix();
            int oldProgram = sp._analyzes();
            OpenGlHelper.func_77473_a((int)OpenGlHelper.field_77478_a);
            Vector3f vec3 = new Vector3f((float)par2, (float)par4, (float)par6);
            Matrix4f m4f = new Matrix4f();
            m4f._castle(vec3);
            Hooks._twice(par1, par2, par4, par6, par9);
            GL11.glDisable((int)2896);
            ItemStack itemstack1 = ((AbstractClientPlayer)par1).field_71071_by.func_70448_g();
            if (Config.permit$) {
                av.a((CSplayer)csp, (ItemStack)itemstack1, (int)oldProgram, (boolean)updated, (Vector3f)vec3);
            }
            GL11.glEnable((int)2896);
            GL11.glEnable((int)3553);
            GL11.glPopMatrix();
            RenderHelper.func_74519_b();
            if (Config.songs$) {
                Hooks._twice(par1, par2, par4, par6, par9);
                Hooks._dallas(csp, vec3);
                GL11.glPopMatrix();
            }
            GL11.glEnable((int)3553);
            GL11.glEnable((int)2884);
            GL11.glCullFace((int)1029);
            GL11.glCullFace((int)1028);
            GL11.glCullFace((int)1029);
            if (!(par1.func_70694_bm() == null || !csp.freeze$ || csp.a.phantom$ == null || Config.permit$ && par1.func_70694_bm().func_77973_b() instanceof aa)) {
                Hooks._tension(csp, (AbstractClientPlayer)par1, par9, f2, vec3);
            }
            GL11.glDisable((int)3042);
            if (Minecraft.func_71382_s() && par1 != RenderManager.field_78727_a.field_78734_h && !par1.func_98034_c((EntityPlayer)Minecraft.func_71410_x().field_71439_g) && par1.field_70153_n == null) {
                Hooks._impact((Entity)par1, par1.func_70005_c_(), par2, sourcePar4, par6, 64);
            }
        } else if (!par1.func_98034_c((EntityPlayer)Minecraft.func_71410_x().field_71439_g)) {
            float f2 = Hooks._twice(par1, par2, par4, par6, par9);
            Hooks._submit();
            GL11.glPopMatrix();
            Hooks._impact((Entity)par1, par1.func_70005_c_(), par2, par4, par6, 64);
            Hooks._moldova((Entity)par1, "CustomSteve", par2, par4 - (double)0.3f, par6, 64, -1, 0.25f);
            Hooks._moldova((Entity)par1, "Object", par2, par4 - (double)0.55f, par6, 64, -1, 0.25f);
            Hooks._moldova((Entity)par1, "Sound", par2, par4 - 1.0, par6, 64, -1, 1.0f);
            Hooks._moldova((Entity)par1, "Only", par2, par4 - 1.25, par6, 64, -1, 1.0f);
            Hooks._moldova((Entity)par1, "loading...", par2, par4 - (double)1.7f, par6, 64, Hooks._lycos(0, 255, 0, 0), 0.25f);
        }
        Minecraft.func_71410_x().func_110434_K().func_110577_a(Gui.field_110325_k);
    }

    public static void _stuffed(CSplayer csp, EntityLivingBase par1EntityLivingBase, ItemStack par2ItemStack, int par3, IItemRenderer.ItemRenderType type, float par9, float s, float a2, Vector3f vec3) {
        Vector3f pos;
        Quaternion q;
        Minecraft mc = Minecraft.func_71410_x();
        RenderBlocks renderBlocksInstance = new RenderBlocks();
        GL11.glPushMatrix();
        Bone b2 = null;
        b2 = csp.pacific$ ? csp.a.markets$ : csp.a.phantom$;
        if (b2 == null) {
            GL11.glPopMatrix();
            return;
        }
        if (csp.pacific$) {
            if (b2.shaved$[csp.wildlife$] == null) {
                return;
            }
            q = b2.shaved$[csp.wildlife$]._filling();
            pos = b2.safely$[csp.wildlife$];
        } else {
            if (b2.shaved$[csp.wildlife$] == null) {
                return;
            }
            q = b2.shaved$[csp.wildlife$]._filling();
            pos = b2.safely$[csp.wildlife$];
        }
        if (q == null || pos == null) {
            GL11.glPopMatrix();
            return;
        }
        q._polar(q._magnet(), q._strain(), -q._median(), q._their());
        Matrix4f m = new Matrix4f();
        m._bikes();
        m._counties(new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(1.0f, 1.0f, 1.0f), q._agenda(new Matrix3f()));
        float[] r = new float[16];
        m._manager(r, false);
        FloatBuffer matrix = BufferUtils.createFloatBuffer((int)16);
        for (int i = 0; i < r.length; ++i) {
            matrix.put(r[i]);
        }
        matrix.rewind();
        IItemRenderer customRenderer = MinecraftForgeClient.getItemRenderer((ItemStack)par2ItemStack, (IItemRenderer.ItemRenderType)type);
        if (customRenderer == null) {
            if (vec3.genius$ < 0.0f) {
                GL11.glTranslatef((float)vec3.serves$, (float)(-Math.abs(vec3.genius$)), (float)vec3.superb$);
            } else {
                GL11.glTranslatef((float)vec3.serves$, (float)vec3.genius$, (float)vec3.superb$);
            }
            GL11.glRotatef((float)(-a2), (float)0.0f, (float)1.0f, (float)0.0f);
            if (Config.child$ != null) {
                GL11.glScalef((float)Config.child$.serves$, (float)Config.child$.genius$, (float)Config.child$.superb$);
            }
            if (csp.pacific$) {
                GL11.glTranslatef((float)(0.0f + pos.serves$ / 10.0f), (float)(pos.genius$ / 10.0f), (float)(0.0f + -(pos.superb$ / 10.0f)));
            } else {
                GL11.glTranslatef((float)(0.0f + pos.serves$ / 10.0f), (float)(pos.genius$ / 10.0f), (float)(0.0f + -(pos.superb$ / 10.0f)));
            }
            GL11.glMultMatrix((FloatBuffer)matrix);
        }
        if (Item.func_150891_b((Item)par2ItemStack.func_77973_b()) == 261) {
            GL11.glRotatef((float)180.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        }
        TextureManager texturemanager = mc.func_110434_K();
        Block block = null;
        if (par2ItemStack.func_77973_b() instanceof ItemBlock) {
            block = Block.func_149634_a((Item)par2ItemStack.func_77973_b());
        }
        if (customRenderer != null) {
            texturemanager.func_110577_a(texturemanager.func_130087_a(par2ItemStack.func_94608_d()));
            if (vec3.genius$ < 0.0f) {
                GL11.glTranslatef((float)vec3.serves$, (float)(-Math.abs(vec3.genius$)), (float)vec3.superb$);
            } else {
                GL11.glTranslatef((float)vec3.serves$, (float)vec3.genius$, (float)vec3.superb$);
            }
            GL11.glRotatef((float)(-a2), (float)0.0f, (float)1.0f, (float)0.0f);
            if (Config.child$ != null) {
                GL11.glScalef((float)Config.child$.serves$, (float)Config.child$.genius$, (float)Config.child$.superb$);
            }
            GL11.glTranslatef((float)(0.0f + pos.serves$ / 10.0f), (float)(pos.genius$ / 10.0f), (float)(0.0f + -(pos.superb$ / 10.0f)));
            GL11.glMultMatrix((FloatBuffer)matrix);
            if (block != null) {
                s = 0.25f;
                GL11.glScalef((float)s, (float)s, (float)s);
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            } else {
                float scale = 0.65f;
                scale = !par2ItemStack.func_77973_b().func_77662_d() ? (scale *= 0.4f) : (scale *= 0.65f);
                GL11.glScalef((float)scale, (float)scale, (float)scale);
                if (!csp.pacific$) {
                    GL11.glRotatef((float)90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                    if (!par2ItemStack.func_77973_b().func_77629_n_()) {
                        GL11.glRotatef((float)180.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                        GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                    } else {
                        GL11.glTranslatef((float)0.0f, (float)0.125f, (float)0.0f);
                    }
                } else {
                    GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                    GL11.glRotatef((float)180.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                }
            }
            GL11.glTranslatef((float)0.9375f, (float)0.0625f, (float)0.0f);
            GL11.glTranslatef((float)-0.5f, (float)-0.5f, (float)0.03125f);
            GL11.glRotatef((float)-335.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)-50.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            ForgeHooksClient.renderEquippedItem((IItemRenderer.ItemRenderType)type, (IItemRenderer)customRenderer, (RenderBlocks)renderBlocksInstance, (EntityLivingBase)par1EntityLivingBase, (ItemStack)par2ItemStack);
        } else if (block != null && par2ItemStack.func_94608_d() == 0 && RenderBlocks.func_147739_a((int)block.func_149645_b())) {
            GL11.glRotatef((float)90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            s = 0.25f;
            GL11.glScalef((float)s, (float)s, (float)s);
            texturemanager.func_110577_a(texturemanager.func_130087_a(0));
            renderBlocksInstance.func_147800_a(block, par2ItemStack.func_77960_j(), 1.0f);
        } else {
            GL11.glScaled((double)s, (double)s, (double)s);
            IIcon icon = par1EntityLivingBase.func_70620_b(par2ItemStack, par3);
            if (icon == null) {
                GL11.glPopMatrix();
                return;
            }
            texturemanager.func_110577_a(texturemanager.func_130087_a(par2ItemStack.func_94608_d()));
            Tessellator tessellator = Tessellator.field_78398_a;
            float f2 = icon.func_94209_e();
            float f1 = icon.func_94212_f();
            float f22 = icon.func_94206_g();
            float f3 = icon.func_94210_h();
            float f4 = 0.0f;
            float f5 = 0.3f;
            GL11.glEnable((int)32826);
            float f6 = 1.5f;
            if (!csp.pacific$) {
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                if (Item.func_150891_b((Item)par2ItemStack.func_77973_b()) != 261 && par2ItemStack.func_77973_b().func_77662_d()) {
                    if (!par2ItemStack.func_77973_b().func_77629_n_()) {
                        GL11.glRotatef((float)180.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                        GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                    } else {
                        GL11.glTranslatef((float)0.0f, (float)0.125f, (float)0.0f);
                    }
                }
            } else if (Item.func_150891_b((Item)par2ItemStack.func_77973_b()) != 261 && par2ItemStack.func_77973_b().func_77662_d()) {
                GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glRotatef((float)180.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            }
            GL11.glTranslatef((float)-0.5f, (float)-0.5f, (float)0.03125f);
            Hooks._canyon(tessellator, f1, f22, f2, f3, icon.func_94211_a(), icon.func_94216_b(), 0.0625f);
            if (par2ItemStack.hasEffect(par3)) {
                GL11.glDepthFunc((int)514);
                GL11.glDisable((int)2896);
                texturemanager.func_110577_a(faced$);
                GL11.glEnable((int)3042);
                GL11.glBlendFunc((int)768, (int)1);
                float f7 = 0.76f;
                GL11.glColor4f((float)(0.5f * f7), (float)(0.25f * f7), (float)(0.8f * f7), (float)1.0f);
                GL11.glMatrixMode((int)5890);
                GL11.glPushMatrix();
                float f8 = 0.125f;
                GL11.glScalef((float)f8, (float)f8, (float)f8);
                float f9 = (float)(Minecraft.func_71386_F() % 3000L) / 3000.0f * 8.0f;
                GL11.glTranslatef((float)f9, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)-50.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                Hooks._canyon(tessellator, 0.0f, 0.0f, 1.0f, 1.0f, 256, 256, 0.0625f);
                GL11.glPopMatrix();
                GL11.glPushMatrix();
                GL11.glScalef((float)f8, (float)f8, (float)f8);
                f9 = (float)(Minecraft.func_71386_F() % 4873L) / 4873.0f * 8.0f;
                GL11.glTranslatef((float)(-f9), (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)10.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                Hooks._canyon(tessellator, 0.0f, 0.0f, 1.0f, 1.0f, 256, 256, 0.0625f);
                GL11.glPopMatrix();
                GL11.glMatrixMode((int)5888);
                GL11.glDisable((int)3042);
                GL11.glEnable((int)2896);
                GL11.glDepthFunc((int)515);
            }
            GL11.glDisable((int)32826);
        }
        GL11.glPopMatrix();
    }

    public static void _tension(CSplayer csp, AbstractClientPlayer par1AbstractClientPlayer, float par9, float f2, Vector3f vec3) {
        ItemStack itemstack1 = par1AbstractClientPlayer.field_71071_by.func_70448_g();
        if (itemstack1 != null) {
            float f11;
            IItemRenderer customRenderer;
            GL11.glPushMatrix();
            if (par1AbstractClientPlayer.field_71104_cf != null) {
                itemstack1 = new ItemStack(Item.func_150899_d((int)280));
            }
            EnumAction enumaction = null;
            if (par1AbstractClientPlayer.func_71052_bv() > 0) {
                enumaction = itemstack1.func_77975_n();
            }
            boolean is3D = (customRenderer = MinecraftForgeClient.getItemRenderer((ItemStack)itemstack1, (IItemRenderer.ItemRenderType)IItemRenderer.ItemRenderType.EQUIPPED)) != null && customRenderer.shouldUseRenderHelper(IItemRenderer.ItemRenderType.EQUIPPED, itemstack1, IItemRenderer.ItemRendererHelper.BLOCK_3D);
            boolean isBlock = itemstack1.func_94608_d() == 0;
            Block block = null;
            if (itemstack1.func_77973_b() instanceof ItemBlock) {
                block = Block.func_149634_a((Item)itemstack1.func_77973_b());
            }
            if (customRenderer != null) {
                // empty if block
            }
            if (is3D || isBlock && RenderBlocks.func_147739_a((int)block.func_149645_b())) {
                f11 = 0.5f;
                f11 *= 0.75f;
            } else if (Item.func_150891_b((Item)itemstack1.func_77973_b()) == 261) {
                f11 = 0.625f;
            } else if (itemstack1.func_77973_b().func_77662_d()) {
                f11 = 0.625f;
                if (itemstack1.func_77973_b().func_77629_n_()) {
                    // empty if block
                }
                if (par1AbstractClientPlayer.func_71052_bv() > 0 && enumaction == EnumAction.block) {
                    // empty if block
                }
            } else {
                f11 = 0.375f;
            }
            float fixX = 0.0f;
            float fixY = 0.0f;
            float fixZ = 0.0f;
            if (par1AbstractClientPlayer.func_70608_bn()) {
                switch (garbage$) {
                    case 0: {
                        fixZ = -denver$ / 10.0f;
                        break;
                    }
                    case 1: {
                        fixX = denver$ / 10.0f;
                        break;
                    }
                    case 2: {
                        fixZ = denver$ / 10.0f;
                        break;
                    }
                    case 3: {
                        fixX = -denver$ / 10.0f;
                    }
                }
            }
            GL11.glTranslatef((float)fixX, (float)fixY, (float)fixZ);
            float f6 = 0.0f;
            if (itemstack1.func_77973_b().func_77623_v()) {
                for (int j = 0; j < itemstack1.func_77973_b().getRenderPasses(itemstack1.func_77960_j()); ++j) {
                    int k = itemstack1.func_77973_b().func_82790_a(itemstack1, j);
                    float f13 = (float)(k >> 16 & 0xFF) / 255.0f;
                    float f12 = (float)(k >> 8 & 0xFF) / 255.0f;
                    f6 = (float)(k & 0xFF) / 255.0f;
                    GL11.glColor4f((float)f13, (float)f12, (float)f6, (float)1.0f);
                    Hooks._stuffed(csp, (EntityLivingBase)par1AbstractClientPlayer, itemstack1, j, IItemRenderer.ItemRenderType.EQUIPPED_FIRST_PERSON, par9, f11, f2, vec3);
                }
            } else {
                int j = itemstack1.func_77973_b().func_82790_a(itemstack1, 0);
                float f14 = (float)(j >> 16 & 0xFF) / 255.0f;
                float f13 = (float)(j >> 8 & 0xFF) / 255.0f;
                float f12 = (float)(j & 0xFF) / 255.0f;
                GL11.glColor4f((float)f14, (float)f13, (float)f12, (float)1.0f);
                Hooks._stuffed(csp, (EntityLivingBase)par1AbstractClientPlayer, itemstack1, 0, IItemRenderer.ItemRenderType.EQUIPPED_FIRST_PERSON, par9, f11, f2, vec3);
            }
            GL11.glPopMatrix();
        }
    }

    public static float _twice(EntityLivingBase par1, double par2, double par4, double par6, float par9) {
        float f3 = Hooks._surfaces(par1.field_70758_at, par1.field_70759_as, par9);
        float f2 = Hooks._surfaces(par1.field_70760_ar, par1.field_70761_aq, par9);
        if (par1.func_70608_bn()) {
            f2 = strikes$;
        }
        GL11.glPushMatrix();
        if (Config.elect$ && Config.standard$ != null) {
            f2 = Config.anatomy$;
            GL11.glTranslated((double)(-par1.field_70165_t), (double)0.0, (double)(-par1.field_70161_v));
            GL11.glTranslated((double)Config.standard$.serves$, (double)0.0, (double)Config.standard$.superb$);
        }
        float Scalef = 0.1f;
        GL11.glMatrixMode((int)5888);
        GL11.glScalef((float)Scalef, (float)Scalef, (float)(-Scalef));
        if (par1.func_70608_bn()) {
            float fixX = 0.0f;
            float fixY = 0.0f;
            float fixZ = 0.0f;
            switch (garbage$) {
                case 0: {
                    fixZ = denver$;
                    break;
                }
                case 1: {
                    fixX = denver$;
                    break;
                }
                case 2: {
                    fixZ = -denver$;
                    break;
                }
                case 3: {
                    fixX = -denver$;
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
            if (!par1.func_70115_ae() || par1.field_70154_o != null) {
                // empty if block
            }
            if (par4 < 0.0) {
                GL11.glTranslatef((float)((float)(par2 * 10.0)), (float)((float)(-(Math.abs(par4) * 10.0)) + fixY), (float)(-((float)(par6 * 10.0))));
            } else {
                GL11.glTranslatef((float)((float)(par2 * 10.0)), (float)((float)(par4 * 10.0 + (double)fixY)), (float)(-((float)(par6 * 10.0))));
            }
        }
        if (par1.func_70115_ae() && par1 instanceof EntityLivingBase) {
            try {
                EntityLivingBase entitylivingbase1 = (EntityLivingBase)par1.field_70154_o;
                f2 = Hooks._surfaces(entitylivingbase1.field_70760_ar, entitylivingbase1.field_70761_aq, par9);
                float f4 = MathHelper.func_76142_g((float)(f3 - f2));
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
            catch (ClassCastException classCastException) {
                // empty catch block
            }
        }
        if (!LoadingPlugin.agencies$ || ShaderProgram.japanese$ == null || ShaderProgram.wonder$ != null && ShaderProgram.wonder$.enabling$) {
            if (Minecraft.func_71410_x().field_71474_y.field_74320_O == 0) {
                f2 = Hooks._surfaces(par1.field_70126_B, par1.field_70177_z, par9);
                if (par1.func_70608_bn()) {
                    f2 = strikes$;
                }
                GL11.glRotatef((float)f2, (float)0.0f, (float)1.0f, (float)0.0f);
            } else {
                GL11.glRotatef((float)f2, (float)0.0f, (float)1.0f, (float)0.0f);
            }
        } else if (gifts$ == 0) {
            f2 = Hooks._surfaces(par1.field_70126_B, par1.field_70177_z, par9);
            if (par1.func_70608_bn()) {
                f2 = strikes$;
            }
            GL11.glRotatef((float)f2, (float)0.0f, (float)1.0f, (float)0.0f);
        } else {
            GL11.glRotatef((float)f2, (float)0.0f, (float)1.0f, (float)0.0f);
        }
        if (par1.func_70115_ae() && par1.field_70154_o != null) {
            if (par1.field_70154_o instanceof EntityHorse) {
                // empty if block
            }
            if (f2 > 180.0f) {
                // empty if block
            }
        }
        if (Config.child$ != null) {
            GL11.glScalef((float)Config.child$.serves$, (float)Config.child$.genius$, (float)Config.child$.superb$);
        }
        return f2;
    }

    public static void _lowest(EntityLivingBase par1, double par2, double par4, double par6, float par9) {
        String username = par1.func_70005_c_();
        CSplayer csp = CSmanager.cellular$._stanley(username);
        double sourcePar4 = par4;
        par4 -= (double)par1.field_70129_M;
        int lastCurrentPointer = 0;
        if (csp != null) {
            lastCurrentPointer = csp.c();
        }
        GL11.glPushMatrix();
        if (Config.delaware$) {
            GL11.glScalef((float)1.0f, (float)1.0f, (float)-1.0f);
            GL11.glCullFace((int)1028);
        }
        if (csp.a.bringing$) {
            return;
        }
        ARBMultitexture.glActiveTextureARB((int)33984);
        if (Config.brake$) {
            ARBMultitexture.glActiveTextureARB((int)33986);
            GL11.glEnable((int)3553);
            ARBMultitexture.glActiveTextureARB((int)33984);
        }
        if (Config.brake$) {
            ARBMultitexture.glActiveTextureARB((int)33986);
            GL11.glEnable((int)3553);
            GL11.glTexGeni((int)8192, (int)9472, (int)9218);
            GL11.glTexGeni((int)8193, (int)9472, (int)9218);
            GL11.glDisable((int)3553);
            ARBMultitexture.glActiveTextureARB((int)33984);
        }
        GL11.glPopMatrix();
        Hooks._twice(par1, par2, par4, par6, par9);
        int p = 0;
        for (Material m : ((Geometry)csp.a.belongs$.get((int)0)).found$) {
            if (m.ought$ > 0) {
                GL11.glMaterial((int)1032, (int)5634, (FloatBuffer)Hooks._entity(m.dialogue$, m.bronze$, m.giant$, m.glory$));
                GL11.glMaterial((int)1032, (int)4610, (FloatBuffer)Hooks._entity(m.mouse$, m.episode$, m.sorted$, m.glory$));
            } else {
                GL11.glMaterial((int)1032, (int)4608, (FloatBuffer)Hooks._entity(m.toward$, m.basin$, m.rough$, m.glory$));
                GL11.glMaterial((int)1032, (int)4609, (FloatBuffer)Hooks._entity(m.silver$, m.latitude$, m.depend$, m.glory$));
                GL11.glMaterial((int)1032, (int)4610, (FloatBuffer)Hooks._entity(m.mouse$, m.episode$, m.sorted$, m.glory$));
            }
            GL11.glMaterialf((int)1032, (int)5633, (float)m.sticks$);
            if (m.glory$ < 1.0f) {
                GL11.glDisable((int)2884);
            } else {
                GL11.glEnable((int)2884);
            }
            ARBMultitexture.glActiveTextureARB((int)33984);
            if (!m._romantic()) {
                GL11.glDisable((int)3553);
            } else {
                GL11.glEnable((int)3553);
            }
            if (Config.brake$ && m.ought$ > -1) {
                ARBMultitexture.glActiveTextureARB((int)33986);
                m._backup(csp.a);
                GL11.glEnable((int)3168);
                GL11.glEnable((int)3169);
                GL11.glTexParameteri((int)3553, (int)10242, (int)33071);
                GL11.glTexParameteri((int)3553, (int)10243, (int)33071);
            }
            if (Config.brake$) {
                if (m.rings$ != null) {
                    ARBMultitexture.glActiveTextureARB((int)33986);
                    GL11.glEnable((int)3553);
                    if (m.myers$ == 2) {
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
            if (m.adding$ == null) {
                m._oliver(p, ((Geometry)csp.a.belongs$.get((int)0)).signup$);
            }
            for (TriangleFace f2 : m.adding$) {
                f2._seemed();
            }
            GL11.glEnd();
            p = (int)((long)p + m.collins$ / 3L);
        }
        if (Config.brake$) {
            if (Config.brake$) {
                ARBMultitexture.glActiveTextureARB((int)33986);
                GL11.glDisable((int)3168);
                GL11.glDisable((int)3169);
            }
            ARBMultitexture.glActiveTextureARB((int)33984);
        } else if (Config.brake$) {
            ARBMultitexture.glActiveTextureARB((int)33986);
            GL11.glDisable((int)3168);
            GL11.glDisable((int)3169);
            ARBMultitexture.glActiveTextureARB((int)33984);
        }
        if (Config.brake$) {
            ARBMultitexture.glActiveTextureARB((int)33986);
            GL11.glDisable((int)3553);
        }
        if (Config.brake$) {
            ARBMultitexture.glActiveTextureARB((int)33986);
            GL11.glDisable((int)3553);
        }
        ARBMultitexture.glActiveTextureARB((int)33984);
        GL11.glDisable((int)3553);
        GL11.glEnable((int)2884);
        if (Config.delaware$) {
            GL11.glCullFace((int)1029);
        }
        GL11.glPopMatrix();
    }

    public static void _suits(EntityLivingBase par1, double par2, double par4, double par6, float par9) {
        int lostFrame;
        boolean adr = true;
        GL11.glEnable((int)2929);
        GL11.glDepthFunc((int)515);
        GL11.glDepthMask((boolean)true);
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        String username = par1.func_70005_c_();
        CSplayer csp = CSmanager.cellular$._stanley(username);
        double sourcePar4 = par4;
        par4 -= (double)par1.field_70129_M;
        int lastCurrentPointer = 0;
        if (csp != null) {
            lastCurrentPointer = csp.c();
        }
        if ((lostFrame = lastCurrentPointer - csp.k) > 1) {
            csp.l += lostFrame;
        }
        csp.k = lastCurrentPointer;
        if (csp == null || csp.n != -1) {
            if (!par1.func_98034_c((EntityPlayer)Minecraft.func_71410_x().field_71439_g)) {
                float f2 = Hooks._twice(par1, par2, par4, par6, par9);
                Hooks._submit();
                GL11.glPopMatrix();
                Hooks._impact((Entity)par1, par1.func_70005_c_(), par2, par4, par6, 64);
                Hooks._moldova((Entity)par1, "CustomSteve", par2, par4 - (double)0.3f, par6, 64, -1, 0.25f);
                Hooks._moldova((Entity)par1, "Object", par2, par4 - (double)0.55f, par6, 64, -1, 0.25f);
                Hooks._moldova((Entity)par1, "Sound", par2, par4 - 1.0, par6, 64, -1, 1.0f);
                Hooks._moldova((Entity)par1, "Only", par2, par4 - 1.25, par6, 64, -1, 1.0f);
                Hooks._moldova((Entity)par1, "Error:" + csp.n, par2, par4 - (double)1.7f, par6, 64, Hooks._lycos(255, 0, 0, 0), 0.25f);
            }
            return;
        }
        if (!csp.a.bringing$) {
            if (csp.smaller$ != null && csp.smaller$.created$) {
                Hooks._closure(par1, csp);
                Hooks._faculty(csp, csp.a);
            }
            csp.a.thursday$ = par1;
            float f2 = Hooks._twice(par1, par2, par4, par6, par9);
            GL11.glDisable((int)2884);
            GL11.glCullFace((int)1028);
            GL11.glDisable((int)2896);
            GL11.glShadeModel((int)7425);
            if (Config.maybe$ && csp.smaller$ == null) {
                csp.smaller$ = CSRender2._outline()._merger(csp);
            }
            CSRender2._outline()._rwanda(csp.a(), csp.smaller$, null, 0L, csp.prophet$[csp.wildlife$], false, 0.0f, false);
            GL11.glPopMatrix();
            GL11.glEnable((int)2896);
            GL11.glShadeModel((int)7424);
            GL11.glEnable((int)2884);
            GL11.glCullFace((int)1029);
            GL11.glDisable((int)3042);
            RenderHelper.func_74519_b();
            Vector3f vec3 = new Vector3f((float)par2, (float)par4, (float)par6);
            if (Config.songs$) {
                Hooks._twice(par1, par2, par4, par6, par9);
                Hooks._dallas(csp, vec3);
                GL11.glPopMatrix();
            }
            if (csp.freeze$ && csp.a.phantom$ != null && par1.func_70694_bm() != null) {
                Hooks._tension(csp, (AbstractClientPlayer)par1, par9, f2, vec3);
            }
            if (Minecraft.func_71382_s() && par1 != RenderManager.field_78727_a.field_78734_h && !par1.func_98034_c((EntityPlayer)Minecraft.func_71410_x().field_71439_g) && par1.field_70153_n == null) {
                Hooks._impact((Entity)par1, par1.func_70005_c_(), par2, sourcePar4, par6, 64);
            }
        } else if (!par1.func_98034_c((EntityPlayer)Minecraft.func_71410_x().field_71439_g)) {
            float f2 = Hooks._twice(par1, par2, par4, par6, par9);
            Hooks._submit();
            GL11.glPopMatrix();
            Hooks._impact((Entity)par1, par1.func_70005_c_(), par2, par4, par6, 64);
            Hooks._moldova((Entity)par1, "CustomSteve", par2, par4 - (double)0.3f, par6, 64, -1, 0.25f);
            Hooks._moldova((Entity)par1, "Object", par2, par4 - (double)0.55f, par6, 64, -1, 0.25f);
            Hooks._moldova((Entity)par1, "Sound", par2, par4 - 1.0, par6, 64, -1, 1.0f);
            Hooks._moldova((Entity)par1, "Only", par2, par4 - 1.25, par6, 64, -1, 1.0f);
            Hooks._moldova((Entity)par1, "loading...", par2, par4 - (double)1.7f, par6, 64, Hooks._lycos(0, 255, 0, 0), 0.25f);
        }
    }

    public static void _clouds(EntityLivingBase par1, double par2, double par4, double par6, float par9) {
        int lostFrame;
        boolean adr = true;
        GL11.glEnable((int)2929);
        GL11.glDepthFunc((int)515);
        GL11.glDepthMask((boolean)true);
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        String username = par1.func_70005_c_();
        CSplayer csp = CSmanager.cellular$._stanley(username);
        double sourcePar4 = par4;
        par4 -= (double)par1.field_70129_M;
        int lastCurrentPointer = 0;
        if (csp != null) {
            lastCurrentPointer = csp.c();
        }
        if ((lostFrame = lastCurrentPointer - csp.k) > 1) {
            csp.l += lostFrame;
        }
        csp.k = lastCurrentPointer;
        if (csp == null || csp.n != -1) {
            if (!par1.func_98034_c((EntityPlayer)Minecraft.func_71410_x().field_71439_g)) {
                float f2 = Hooks._twice(par1, par2, par4, par6, par9);
                Hooks._submit();
                GL11.glPopMatrix();
                Hooks._impact((Entity)par1, par1.func_70005_c_(), par2, par4, par6, 64);
                Hooks._moldova((Entity)par1, "CustomSteve", par2, par4 - (double)0.3f, par6, 64, -1, 0.25f);
                Hooks._moldova((Entity)par1, "Object", par2, par4 - (double)0.55f, par6, 64, -1, 0.25f);
                Hooks._moldova((Entity)par1, "Sound", par2, par4 - 1.0, par6, 64, -1, 1.0f);
                Hooks._moldova((Entity)par1, "Only", par2, par4 - 1.25, par6, 64, -1, 1.0f);
                Hooks._moldova((Entity)par1, "Error:" + csp.n, par2, par4 - (double)1.7f, par6, 64, Hooks._lycos(255, 0, 0, 0), 0.25f);
            }
            return;
        }
        if (!csp.a.bringing$) {
            csp.a.thursday$ = par1;
            float f2 = Hooks._twice(par1, par2, par4, par6, par9);
            GL11.glDisable((int)2884);
            GL11.glDisable((int)2896);
            GL11.glShadeModel((int)7425);
            restore$.clear();
            restore$.put(FloatBuffer.wrap(new float[]{0.5f, 0.5f, 0.5f, 1.0f}));
            restore$.flip();
            restore$.clear();
            int p = 0;
            boolean mp = false;
            ArrayList ms = ((Geometry)csp.a.belongs$.get((int)0)).found$;
            if (adr) {
                ARBMultitexture.glActiveTextureARB((int)33986);
                GL11.glEnable((int)3553);
                ARBMultitexture.glActiveTextureARB((int)33987);
                GL11.glEnable((int)3553);
            }
            for (Material m : ms) {
                m.tracks$ = csp.a();
                ARBMultitexture.glActiveTextureARB((int)33984);
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)m.glory$);
                if (m.texas$ == null) {
                    GL11.glBindTexture((int)3553, (int)-1);
                    GL11.glDisable((int)3553);
                    GL11.glColor4f((float)m.silver$, (float)m.latitude$, (float)m.depend$, (float)m.glory$);
                } else if (!m._romantic()) {
                    GL11.glDisable((int)3553);
                } else {
                    GL11.glEnable((int)3553);
                }
                if (adr && m.ought$ > -1) {
                    ARBMultitexture.glActiveTextureARB((int)33986);
                    m._backup(csp.a);
                    GL11.glTexEnvf((int)8960, (int)34161, (float)260.0f);
                    GL11.glTexParameteri((int)3553, (int)10242, (int)33071);
                    GL11.glTexParameteri((int)3553, (int)10243, (int)33071);
                    if (m.rings$ != null) {
                        // empty if block
                    }
                }
                if (adr && m.rings$ != null) {
                    ARBMultitexture.glActiveTextureARB((int)33987);
                    GL11.glEnable((int)3553);
                    m._distant();
                    GL11.glTexEnvf((int)8960, (int)8704, (float)260.0f);
                }
                GL11.glMaterialf((int)1032, (int)5633, (float)m.sticks$);
                restore$.put(FloatBuffer.wrap(new float[0]));
                if (m.ought$ > 0) {
                    GL11.glMaterial((int)1032, (int)5634, (FloatBuffer)Hooks._entity(m.dialogue$, m.bronze$, m.giant$, m.glory$));
                    GL11.glMaterial((int)1032, (int)4610, (FloatBuffer)Hooks._entity(m.mouse$, m.episode$, m.sorted$, m.glory$));
                } else {
                    GL11.glMaterial((int)1032, (int)4608, (FloatBuffer)Hooks._entity(m.toward$, m.basin$, m.rough$, m.glory$));
                    GL11.glMaterial((int)1032, (int)4609, (FloatBuffer)Hooks._entity(m.silver$, m.latitude$, m.depend$, m.glory$));
                    GL11.glMaterial((int)1032, (int)4610, (FloatBuffer)Hooks._entity(m.mouse$, m.episode$, m.sorted$, m.glory$));
                }
                if (m.ought$ > 0 || m.rings$ != null) {
                    ARBMultitexture.glActiveTextureARB((int)33984);
                }
                GL11.glBegin((int)4);
                if (m.adding$ == null) {
                    m._oliver(p, ((Geometry)csp.a.belongs$.get((int)0)).signup$);
                }
                for (TriangleFace f3 : m.adding$) {
                    f3._seemed();
                }
                GL11.glEnd();
                if (adr && m.rings$ != null) {
                    ARBMultitexture.glActiveTextureARB((int)33987);
                    GL11.glDisable((int)3553);
                }
                if (!adr || m.ought$ > 0) {
                    // empty if block
                }
                p = (int)((long)p + m.collins$ / 3L);
            }
            GL11.glEnable((int)3553);
            OpenGlHelper.func_77473_a((int)OpenGlHelper.field_77478_a);
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
            RenderHelper.func_74519_b();
            Vector3f vec3 = new Vector3f((float)par2, (float)par4, (float)par6);
            if (Config.songs$) {
                Hooks._twice(par1, par2, par4, par6, par9);
                Hooks._dallas(csp, vec3);
                GL11.glPopMatrix();
            }
            if (csp.freeze$ && csp.a.phantom$ != null && par1.func_70694_bm() != null) {
                Hooks._tension(csp, (AbstractClientPlayer)par1, par9, f2, vec3);
            }
            if (Minecraft.func_71382_s() && par1 != RenderManager.field_78727_a.field_78734_h && !par1.func_98034_c((EntityPlayer)Minecraft.func_71410_x().field_71439_g) && par1.field_70153_n == null) {
                Hooks._impact((Entity)par1, par1.func_70005_c_(), par2, sourcePar4, par6, 64);
            }
            GL11.glDepthMask((boolean)true);
        } else if (!par1.func_98034_c((EntityPlayer)Minecraft.func_71410_x().field_71439_g)) {
            float f2 = Hooks._twice(par1, par2, par4, par6, par9);
            Hooks._submit();
            GL11.glPopMatrix();
            Hooks._impact((Entity)par1, par1.func_70005_c_(), par2, par4, par6, 64);
            Hooks._moldova((Entity)par1, "CustomSteve", par2, par4 - (double)0.3f, par6, 64, -1, 0.25f);
            Hooks._moldova((Entity)par1, "Object", par2, par4 - (double)0.55f, par6, 64, -1, 0.25f);
            Hooks._moldova((Entity)par1, "Sound", par2, par4 - 1.0, par6, 64, -1, 1.0f);
            Hooks._moldova((Entity)par1, "Only", par2, par4 - 1.25, par6, 64, -1, 1.0f);
            Hooks._moldova((Entity)par1, "loading...", par2, par4 - (double)1.7f, par6, 64, Hooks._lycos(0, 255, 0, 0), 0.25f);
        }
    }

    public static float _surfaces(float par1, float par2, float par3) {
        float f3;
        for (f3 = par2 - par1; f3 < -180.0f; f3 += 360.0f) {
        }
        while (f3 >= 180.0f) {
            f3 -= 360.0f;
        }
        return par1 + par3 * f3;
    }

    public static void _canyon(Tessellator par0Tessellator, float par1, float par2, float par3, float par4, int par5, int par6, float par7) {
        float f9;
        float f8;
        float f7;
        int k;
        par0Tessellator.func_78382_b();
        par0Tessellator.func_78375_b(0.0f, 0.0f, 1.0f);
        par0Tessellator.func_78374_a(0.0, 0.0, 0.0, (double)par1, (double)par4);
        par0Tessellator.func_78374_a(1.0, 0.0, 0.0, (double)par3, (double)par4);
        par0Tessellator.func_78374_a(1.0, 1.0, 0.0, (double)par3, (double)par2);
        par0Tessellator.func_78374_a(0.0, 1.0, 0.0, (double)par1, (double)par2);
        par0Tessellator.func_78381_a();
        par0Tessellator.func_78382_b();
        par0Tessellator.func_78375_b(0.0f, 0.0f, -1.0f);
        par0Tessellator.func_78374_a(0.0, 1.0, (double)(0.0f - par7), (double)par1, (double)par2);
        par0Tessellator.func_78374_a(1.0, 1.0, (double)(0.0f - par7), (double)par3, (double)par2);
        par0Tessellator.func_78374_a(1.0, 0.0, (double)(0.0f - par7), (double)par3, (double)par4);
        par0Tessellator.func_78374_a(0.0, 0.0, (double)(0.0f - par7), (double)par1, (double)par4);
        par0Tessellator.func_78381_a();
        float f5 = 0.5f * (par1 - par3) / (float)par5;
        float f6 = 0.5f * (par4 - par2) / (float)par6;
        par0Tessellator.func_78382_b();
        par0Tessellator.func_78375_b(-1.0f, 0.0f, 0.0f);
        for (k = 0; k < par5; ++k) {
            f7 = (float)k / (float)par5;
            f8 = par1 + (par3 - par1) * f7 - f5;
            par0Tessellator.func_78374_a((double)f7, 0.0, (double)(0.0f - par7), (double)f8, (double)par4);
            par0Tessellator.func_78374_a((double)f7, 0.0, 0.0, (double)f8, (double)par4);
            par0Tessellator.func_78374_a((double)f7, 1.0, 0.0, (double)f8, (double)par2);
            par0Tessellator.func_78374_a((double)f7, 1.0, (double)(0.0f - par7), (double)f8, (double)par2);
        }
        par0Tessellator.func_78381_a();
        par0Tessellator.func_78382_b();
        par0Tessellator.func_78375_b(1.0f, 0.0f, 0.0f);
        for (k = 0; k < par5; ++k) {
            f7 = (float)k / (float)par5;
            f8 = par1 + (par3 - par1) * f7 - f5;
            f9 = f7 + 1.0f / (float)par5;
            par0Tessellator.func_78374_a((double)f9, 1.0, (double)(0.0f - par7), (double)f8, (double)par2);
            par0Tessellator.func_78374_a((double)f9, 1.0, 0.0, (double)f8, (double)par2);
            par0Tessellator.func_78374_a((double)f9, 0.0, 0.0, (double)f8, (double)par4);
            par0Tessellator.func_78374_a((double)f9, 0.0, (double)(0.0f - par7), (double)f8, (double)par4);
        }
        par0Tessellator.func_78381_a();
        par0Tessellator.func_78382_b();
        par0Tessellator.func_78375_b(0.0f, 1.0f, 0.0f);
        for (k = 0; k < par6; ++k) {
            f7 = (float)k / (float)par6;
            f8 = par4 + (par2 - par4) * f7 - f6;
            f9 = f7 + 1.0f / (float)par6;
            par0Tessellator.func_78374_a(0.0, (double)f9, 0.0, (double)par1, (double)f8);
            par0Tessellator.func_78374_a(1.0, (double)f9, 0.0, (double)par3, (double)f8);
            par0Tessellator.func_78374_a(1.0, (double)f9, (double)(0.0f - par7), (double)par3, (double)f8);
            par0Tessellator.func_78374_a(0.0, (double)f9, (double)(0.0f - par7), (double)par1, (double)f8);
        }
        par0Tessellator.func_78381_a();
        par0Tessellator.func_78382_b();
        par0Tessellator.func_78375_b(0.0f, -1.0f, 0.0f);
        for (k = 0; k < par6; ++k) {
            f7 = (float)k / (float)par6;
            f8 = par4 + (par2 - par4) * f7 - f6;
            par0Tessellator.func_78374_a(1.0, (double)f7, 0.0, (double)par3, (double)f8);
            par0Tessellator.func_78374_a(0.0, (double)f7, 0.0, (double)par1, (double)f8);
            par0Tessellator.func_78374_a(0.0, (double)f7, (double)(0.0f - par7), (double)par1, (double)f8);
            par0Tessellator.func_78374_a(1.0, (double)f7, (double)(0.0f - par7), (double)par3, (double)f8);
        }
        par0Tessellator.func_78381_a();
    }

    protected static void _moldova(Entity par1, String par2, double par3, double par5, double par7, int par9, int RGBA, float A) {
        if (RenderManager.field_78727_a.field_78734_h == null) {
            return;
        }
        double d3 = par1.func_70068_e((Entity)RenderManager.field_78727_a.field_78734_h);
        if (d3 <= (double)(par9 * par9)) {
            FontRenderer fontrenderer = RenderManager.field_78727_a.func_78716_a();
            float f2 = 1.6f;
            float f1 = 0.016666668f * f2;
            GL11.glPushMatrix();
            GL11.glTranslatef((float)((float)par3 + 0.0f), (float)((float)par5 + par1.field_70131_O + 0.5f), (float)((float)par7));
            GL11.glNormal3f((float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)(-RenderManager.field_78727_a.field_78735_i), (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)RenderManager.field_78727_a.field_78732_j, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)(-f1), (float)(-f1), (float)f1);
            GL11.glDisable((int)2896);
            GL11.glDepthMask((boolean)false);
            GL11.glDisable((int)2929);
            GL11.glEnable((int)3042);
            OpenGlHelper.func_148821_a((int)770, (int)771, (int)1, (int)0);
            Tessellator tessellator = Tessellator.field_78398_a;
            int b0 = 0;
            GL11.glDisable((int)3553);
            tessellator.func_78382_b();
            int j = fontrenderer.func_78256_a(par2) / 2;
            tessellator.func_78369_a(0.0f, 0.0f, 0.0f, A);
            tessellator.func_78377_a((double)(-j - 1), (double)(-1 + b0), 0.0);
            tessellator.func_78377_a((double)(-j - 1), (double)(8 + b0), 0.0);
            tessellator.func_78377_a((double)(j + 1), (double)(8 + b0), 0.0);
            tessellator.func_78377_a((double)(j + 1), (double)(-1 + b0), 0.0);
            tessellator.func_78381_a();
            GL11.glEnable((int)3553);
            fontrenderer.func_78276_b(par2, -fontrenderer.func_78256_a(par2) / 2, b0, 0x20FFFFFF);
            GL11.glEnable((int)2929);
            GL11.glDepthMask((boolean)true);
            fontrenderer.func_78276_b(par2, -fontrenderer.func_78256_a(par2) / 2, b0, RGBA);
            GL11.glEnable((int)2896);
            GL11.glDisable((int)3042);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glPopMatrix();
        }
    }

    protected static void _impact(Entity par1, String par2, double par3, double par5, double par7, int par9) {
        if (RenderManager.field_78727_a.field_78734_h == null) {
            return;
        }
        double d3 = par1.func_70068_e((Entity)RenderManager.field_78727_a.field_78734_h);
        if (d3 <= (double)(par9 * par9)) {
            FontRenderer fontrenderer = RenderManager.field_78727_a.func_78716_a();
            float f2 = 1.6f;
            float f1 = 0.016666668f * f2;
            GL11.glPushMatrix();
            GL11.glTranslatef((float)((float)par3 + 0.0f), (float)((float)par5 + par1.field_70131_O + 0.5f), (float)((float)par7));
            GL11.glNormal3f((float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)(-RenderManager.field_78727_a.field_78735_i), (float)0.0f, (float)1.0f, (float)0.0f);
            if (Minecraft.func_71410_x().field_71474_y.field_74320_O == 2) {
                GL11.glRotatef((float)RenderManager.field_78727_a.field_78732_j, (float)-1.0f, (float)0.0f, (float)0.0f);
            } else {
                GL11.glRotatef((float)RenderManager.field_78727_a.field_78732_j, (float)1.0f, (float)0.0f, (float)0.0f);
            }
            GL11.glScalef((float)(-f1), (float)(-f1), (float)f1);
            GL11.glDisable((int)2896);
            GL11.glDepthMask((boolean)false);
            GL11.glDisable((int)2929);
            GL11.glEnable((int)3042);
            OpenGlHelper.func_148821_a((int)770, (int)771, (int)1, (int)0);
            Tessellator tessellator = Tessellator.field_78398_a;
            int b0 = 0;
            GL11.glDisable((int)3553);
            tessellator.func_78382_b();
            int j = fontrenderer.func_78256_a(par2) / 2;
            tessellator.func_78369_a(0.0f, 0.0f, 0.0f, 0.25f);
            tessellator.func_78377_a((double)(-j - 1), (double)(-1 + b0), 0.0);
            tessellator.func_78377_a((double)(-j - 1), (double)(8 + b0), 0.0);
            tessellator.func_78377_a((double)(j + 1), (double)(8 + b0), 0.0);
            tessellator.func_78377_a((double)(j + 1), (double)(-1 + b0), 0.0);
            tessellator.func_78381_a();
            GL11.glEnable((int)3553);
            fontrenderer.func_78276_b(par2, -fontrenderer.func_78256_a(par2) / 2, b0, 0x20FFFFFF);
            GL11.glEnable((int)2929);
            GL11.glDepthMask((boolean)true);
            fontrenderer.func_78276_b(par2, -fontrenderer.func_78256_a(par2) / 2, b0, -1);
            GL11.glEnable((int)2896);
            GL11.glDisable((int)3042);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glPopMatrix();
        }
    }

    public static int[] _cited(int par4) {
        int[] result = new int[]{par4 >> 16 & 0xFF, par4 >> 8 & 0xFF, par4 & 0xFF, par4 >> 24 & 0xFF};
        return result;
    }

    public static int _lycos(int r, int g, int b2, int a2) {
        r = (r & 0xFF) << 16;
        g = (g & 0xFF) << 8;
        a2 = (a2 & 0xFF) << 24;
        return r + g + (b2 &= 0xFF) + a2;
    }

    public static void _image(float s, Matrix4f transform, float random) {
        GL11.glColor3f((float)127.0f, (float)127.0f, (float)127.0f);
        GL11.glBegin((int)7);
        Vector3f randomV = new Quaternion()._between(random, 0.0f, 0.0f)._align(new Vector3f(0.0f, -s, -s));
        Vector3f vec3 = transform._count(randomV);
        GL11.glTexCoord2d((double)0.0, (double)0.0);
        GL11.glVertex3f((float)vec3.serves$, (float)vec3.genius$, (float)vec3.superb$);
        randomV = new Quaternion()._between(random, 0.0f, 0.0f)._align(new Vector3f(0.0f, s, -s));
        vec3 = transform._count(randomV);
        GL11.glTexCoord2d((double)0.0, (double)1.0);
        GL11.glVertex3f((float)vec3.serves$, (float)vec3.genius$, (float)vec3.superb$);
        randomV = new Quaternion()._between(random, 0.0f, 0.0f)._align(new Vector3f(0.0f, s, s));
        vec3 = transform._count(randomV);
        GL11.glTexCoord2d((double)1.0, (double)1.0);
        GL11.glVertex3f((float)vec3.serves$, (float)vec3.genius$, (float)vec3.superb$);
        randomV = new Quaternion()._between(random, 0.0f, 0.0f)._align(new Vector3f(0.0f, -s, s));
        vec3 = transform._count(randomV);
        GL11.glTexCoord2d((double)1.0, (double)0.0);
        GL11.glVertex3f((float)vec3.serves$, (float)vec3.genius$, (float)vec3.superb$);
        GL11.glEnd();
    }

    public static void _ignore(float s, Matrix4f transform, float random) {
        GL11.glColor3f((float)127.0f, (float)127.0f, (float)127.0f);
        GL11.glBegin((int)7);
        Vector3f randomV = new Quaternion()._between(0.0f, 0.0f, random)._align(new Vector3f(-s, -s, 0.0f));
        Vector3f vec3 = transform._count(randomV);
        GL11.glTexCoord2d((double)0.0, (double)0.0);
        GL11.glVertex3f((float)vec3.serves$, (float)vec3.genius$, (float)vec3.superb$);
        randomV = new Quaternion()._between(0.0f, 0.0f, random)._align(new Vector3f(-s, s, 0.0f));
        vec3 = transform._count(randomV);
        GL11.glTexCoord2d((double)0.0, (double)1.0);
        GL11.glVertex3f((float)vec3.serves$, (float)vec3.genius$, (float)vec3.superb$);
        randomV = new Quaternion()._between(0.0f, 0.0f, random)._align(new Vector3f(s, s, 0.0f));
        vec3 = transform._count(randomV);
        GL11.glTexCoord2d((double)1.0, (double)1.0);
        GL11.glVertex3f((float)vec3.serves$, (float)vec3.genius$, (float)vec3.superb$);
        randomV = new Quaternion()._between(0.0f, 0.0f, random)._align(new Vector3f(s, -s, 0.0f));
        vec3 = transform._count(randomV);
        GL11.glTexCoord2d((double)1.0, (double)0.0);
        GL11.glVertex3f((float)vec3.serves$, (float)vec3.genius$, (float)vec3.superb$);
        GL11.glEnd();
    }

    public static void _marriage(float s) {
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

    public static void _submit() {
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

    public static void _mailing(Vector3f min, Vector3f max, Matrix4f trans, int colorInteger) {
        Vector4f color = Hooks._nikon(colorInteger);
        Hooks._lender(trans._count(new Vector3f(min.serves$, min.genius$, min.superb$)), trans._count(new Vector3f(max.serves$, min.genius$, min.superb$)), color);
        Hooks._lender(trans._count(new Vector3f(max.serves$, min.genius$, min.superb$)), trans._count(new Vector3f(max.serves$, max.genius$, min.superb$)), color);
        Hooks._lender(trans._count(new Vector3f(max.serves$, max.genius$, min.superb$)), trans._count(new Vector3f(min.serves$, max.genius$, min.superb$)), color);
        Hooks._lender(trans._count(new Vector3f(min.serves$, max.genius$, min.superb$)), trans._count(new Vector3f(min.serves$, min.genius$, min.superb$)), color);
        Hooks._lender(trans._count(new Vector3f(min.serves$, min.genius$, min.superb$)), trans._count(new Vector3f(min.serves$, min.genius$, max.superb$)), color);
        Hooks._lender(trans._count(new Vector3f(max.serves$, min.genius$, min.superb$)), trans._count(new Vector3f(max.serves$, min.genius$, max.superb$)), color);
        Hooks._lender(trans._count(new Vector3f(max.serves$, max.genius$, min.superb$)), trans._count(new Vector3f(max.serves$, max.genius$, max.superb$)), color);
        Hooks._lender(trans._count(new Vector3f(min.serves$, max.genius$, min.superb$)), trans._count(new Vector3f(min.serves$, max.genius$, max.superb$)), color);
        Hooks._lender(trans._count(new Vector3f(min.serves$, min.genius$, max.superb$)), trans._count(new Vector3f(max.serves$, min.genius$, max.superb$)), color);
        Hooks._lender(trans._count(new Vector3f(max.serves$, min.genius$, max.superb$)), trans._count(new Vector3f(max.serves$, max.genius$, max.superb$)), color);
        Hooks._lender(trans._count(new Vector3f(max.serves$, max.genius$, max.superb$)), trans._count(new Vector3f(min.serves$, max.genius$, max.superb$)), color);
        Hooks._lender(trans._count(new Vector3f(min.serves$, max.genius$, max.superb$)), trans._count(new Vector3f(min.serves$, min.genius$, max.superb$)), color);
    }

    public static void _months(Matrix4f transform, float radius, int colorInteger) {
        Vector4f color = Hooks._nikon(colorInteger);
        Vector3f center = transform._jerry();
        Vector3f up = transform._bufing()._donna(1);
        Vector3f axis = transform._bufing()._donna(0);
        float minTh = -1.5707964f;
        float maxTh = 1.5707964f;
        float minPs = -1.5707964f;
        float maxPs = 1.5707964f;
        float stepDegrees = 30.0f;
        Hooks._toilet(center, up, axis, radius, minTh, maxTh, minPs, maxPs, color, stepDegrees, false);
        Hooks._toilet(center, up, axis._holmes(), radius, minTh, maxTh, minPs, maxPs, color, stepDegrees, false);
    }

    public static void _bhutan(float radius, float halfHeight, int upAxis, Matrix4f transform, int colorInteger) {
        Vector4f color = Hooks._nikon(colorInteger);
        int stepDegrees = 30;
        Vector3f capStart = new Vector3f(0.0f, 0.0f, 0.0f);
        capStart._shipment(upAxis, -halfHeight);
        Vector3f capEnd = new Vector3f(0.0f, 0.0f, 0.0f);
        capEnd._shipment(upAxis, halfHeight);
        Matrix4f childTransform = new Matrix4f(transform);
        childTransform._castle(transform._count(capStart));
        Vector3f center = childTransform._jerry();
        Vector3f up = childTransform._bufing()._donna((upAxis + 1) % 3);
        Vector3f axis = childTransform._bufing()._donna(upAxis)._holmes();
        float minTh = -1.5707964f;
        float maxTh = 1.5707964f;
        float minPs = -1.5707964f;
        float maxPs = 1.5707964f;
        Hooks._toilet(center, up, axis, radius, minTh, maxTh, minPs, maxPs, color, stepDegrees, false);
        childTransform = transform;
        childTransform._castle(transform._count(capEnd));
        center = childTransform._jerry();
        up = childTransform._bufing()._donna((upAxis + 1) % 3);
        axis = childTransform._bufing()._donna(upAxis);
        minTh = -1.5707964f;
        maxTh = 1.5707964f;
        minPs = -1.5707964f;
        maxPs = 1.5707964f;
        Hooks._toilet(center, up, axis, radius, minTh, maxTh, minPs, maxPs, color, stepDegrees, false);
        Vector3f start = transform._jerry();
        for (int i = 0; i < 360; i += stepDegrees) {
            capStart._shipment(upAxis, -halfHeight);
            capEnd._shipment(upAxis, halfHeight);
            capEnd._shipment((upAxis + 1) % 3, (float)Math.sin((float)i * ((float)Math.PI / 180)) * radius);
            capStart._shipment((upAxis + 1) % 3, (float)Math.sin((float)i * ((float)Math.PI / 180)) * radius);
            capEnd._shipment((upAxis + 2) % 3, (float)Math.cos((float)i * ((float)Math.PI / 180)) * radius);
            capStart._shipment((upAxis + 2) % 3, (float)Math.cos((float)i * ((float)Math.PI / 180)) * radius);
            capStart._shipment(upAxis, capStart._judge(upAxis) - halfHeight);
            capEnd._shipment(upAxis, capEnd._judge(upAxis) - halfHeight);
            Hooks._lender(transform._count(capStart), transform._count(capEnd), color);
        }
    }

    public static void _trying(int size, int yFix) {
        GL11.glDisable((int)3553);
        GL11.glDisable((int)3008);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)0.01f);
        GL11.glBegin((int)7);
        float[] vertex_list = new float[]{-0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, -0.5f, 0.5f, -0.5f, 0.5f, 0.5f, -0.5f, -0.5f, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f};
        int[] index_list = new int[]{0, 2, 3, 1, 0, 4, 6, 2, 0, 1, 5, 4, 4, 5, 7, 6, 1, 3, 7, 5, 2, 6, 7, 3};
        for (int i = 0; i < 6; ++i) {
            for (int j = 0; j < 4; ++j) {
                GL11.glVertex3f((float)(vertex_list[index_list[i * 4 + j] * 3 + 0] * (float)size), (float)(vertex_list[index_list[i * 4 + j] * 3 + 1] * (float)size + (float)yFix), (float)(vertex_list[index_list[i * 4 + j] * 3 + 2] * (float)size));
            }
        }
        GL11.glEnd();
        GL11.glEnable((int)3008);
        GL11.glEnable((int)3553);
    }

    public static void _dallas(CSplayer csp, Vector3f trans) {
        ArrayList rbs = csp.a().adopt$;
        GL11.glDisable((int)3553);
        GL11.glDisable((int)2896);
        for (RigidBody rb : rbs) {
            Matrix4f transform = new Matrix4f();
            if (rb.studio$ == 1) {
                // empty if block
            }
            transform._castle(rb.escape$);
            transform._subaru(rb.owner$);
            float[] RGBA = new float[4];
            RGBA[3] = 255.0f;
            RigidBodyColors._terrace(rb.beaver$)._rooms(RGBA);
            switch (rb.lucia$) {
                case 0: {
                    Hooks._months(transform, rb.naples$, Hooks._lycos((int)RGBA[0], (int)RGBA[1], (int)RGBA[2], (int)RGBA[3]));
                    break;
                }
                case 1: {
                    Vector3f xyz = new Vector3f(rb.naples$, rb.filing$, rb.sorts$);
                    Hooks._mailing(xyz._holmes(), xyz, transform, Hooks._lycos((int)RGBA[0], (int)RGBA[1], (int)RGBA[2], (int)RGBA[3]));
                    break;
                }
                case 2: {
                    Hooks._bhutan(rb.naples$, rb.filing$ / 2.0f, 1, transform, Hooks._lycos((int)RGBA[0], (int)RGBA[1], (int)RGBA[2], (int)RGBA[3]));
                }
            }
        }
        GL11.glEnable((int)2896);
        GL11.glEnable((int)3553);
    }

    public static void _toilet(Vector3f center, Vector3f up, Vector3f axis, float radius, float minTh, float maxTh, float minPs, float maxPs, Vector4f color, float stepDegrees, boolean drawCenter) {
        int n_hor;
        Vector3f[] pvA = new Vector3f[74];
        Vector3f[] pvB = new Vector3f[74];
        Vector3f npole = center._approval(up._survival(radius));
        Vector3f spole = center._based(up._survival(radius));
        Vector3f arcStart = new Vector3f();
        float step = stepDegrees * ((float)Math.PI / 180);
        Vector3f kv = up;
        Vector3f iv = axis;
        Vector3f jv = kv._issued(iv);
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
        for (int i = 0; i < n_hor; ++i) {
            float th = minTh + (float)i * step_h;
            float sth = (float)((double)radius * Math.sin(th));
            float cth = (float)((double)radius * Math.cos(th));
            for (int j = 0; j < n_vert; ++j) {
                float psi = minPs + (float)j * step_v;
                float sps = (float)Math.sin(psi);
                float cps = (float)Math.cos(psi);
                pvB[j] = center._approval(iv._survival(cth * cps))._approval(jv._survival(cth * sps))._approval(kv._survival(sth));
                if (i > 0) {
                    Hooks._lender(pvA[j], pvB[j], color);
                } else if (drawS) {
                    Hooks._lender(spole, pvB[j], color);
                }
                if (j > 0) {
                    Hooks._lender(pvB[j - 1], pvB[j], color);
                } else {
                    arcStart = pvB[j];
                }
                if (i == n_hor - 1 && drawN) {
                    Hooks._lender(npole, pvB[j], color);
                }
                if (!drawCenter) continue;
                if (isClosed) {
                    if (j != n_vert - 1) continue;
                    Hooks._lender(arcStart, pvB[j], color);
                    continue;
                }
                if (i == 0 && i != n_hor - 1 || j == 0 && j != n_vert - 1) continue;
                Hooks._lender(center, pvB[j], color);
            }
            do[] pT = (do[])pvA.clone();
            pvA = (do[])pvB.clone();
            pvB = (do[])pT.clone();
        }
    }

    public static FloatBuffer _entity(float a1, float a2, float a3, float a4) {
        restore$.clear();
        restore$.put(FloatBuffer.wrap(new float[]{a1, a2, a3, a4}));
        restore$.flip();
        return restore$;
    }

    public static void _lender(Vector3f from, Vector3f to, Vector4f color) {
        Hooks._beatles(from, to, color, color);
    }

    public static void _beatles(Vector3f from, Vector3f to, Vector4f fromColor, Vector4f toColor) {
        GL11.glBegin((int)1);
        GL11.glColor4f((float)fromColor._planner(), (float)fromColor._giving(), (float)fromColor._doing(), (float)fromColor._weblog());
        GL11.glVertex3d((double)from._beads(), (double)from._hungry(), (double)from._april());
        GL11.glColor4f((float)toColor._planner(), (float)toColor._giving(), (float)toColor._doing(), (float)fromColor._weblog());
        GL11.glVertex3d((double)to._beads(), (double)to._hungry(), (double)to._april());
        GL11.glEnd();
    }

    public static Vector4f _nikon(int color) {
        int[] rgba = Hooks._cited(color);
        Vector4f result = new Vector4f((float)rgba[0] / 255.0f, (float)rgba[1] / 255.0f, (float)rgba[2] / 255.0f, (float)rgba[3] / 255.0f);
        return result;
    }

    public static void _jacket(ResourceLocation par1ResourceLocation) {
        CSmanager csm = CSmanager.cellular$;
        SimpleTexture texture = (SimpleTexture)csm.beings$.get(par1ResourceLocation);
        if (texture == null) {
            return;
        }
        try {
            GL11.glBindTexture((int)3553, (int)texture._bradford());
        }
        catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    public static void _closure(EntityLivingBase par1, CSplayer csp) {
        boolean boots;
        boolean helmet = ((AbstractClientPlayer)par1).field_71071_by.field_70460_b[3] != null;
        boolean chestplate = ((AbstractClientPlayer)par1).field_71071_by.field_70460_b[2] != null;
        boolean leggings = ((AbstractClientPlayer)par1).field_71071_by.field_70460_b[1] != null;
        boolean bl2 = boots = ((AbstractClientPlayer)par1).field_71071_by.field_70460_b[0] != null;
        if (csp.a.runner$ != null) {
            float f2 = csp.a.runner$.stood$ = helmet ? 1.0f : 0.0f;
        }
        if (csp.a.briefs$ != null) {
            float f3 = csp.a.briefs$.stood$ = chestplate ? 1.0f : 0.0f;
        }
        if (csp.a.clicking$ != null) {
            float f4 = csp.a.clicking$.stood$ = leggings ? 1.0f : 0.0f;
        }
        if (csp.a.toyota$ != null) {
            csp.a.toyota$.stood$ = boots ? 1.0f : 0.0f;
        }
    }

    public static void _faculty(CSplayer csp, long faceP) {
        int index = 0;
        for (Material mat : ((Geometry)csp.a.belongs$.get((int)0)).found$) {
            for (pmxMorph pm : csp.a.highs$) {
                int matI;
                Iterator iterator;
                int indexP;
                if (pm.strange$) {
                    if (pm.crash$ == 8) {
                        indexP = 0;
                        iterator = pm.covering$.iterator();
                        while (iterator.hasNext()) {
                            matI = (Integer)iterator.next();
                            if (matI == index) {
                                mat.glory$ = (Byte)pm.patent$.get(indexP) == 1 ? mat.painted$ + ((float[])pm.views$.get(indexP))[3] * pm.stood$ : (mat.glory$ *= ((float[])pm.views$.get(indexP))[3] * pm.stood$);
                                if (mat.glory$ < 0.0f) {
                                    mat.glory$ = 0.0f;
                                }
                            }
                            ++indexP;
                        }
                        continue;
                    }
                    if (pm.crash$ != 0) continue;
                    for (int i = 0; i < pm.released$.size(); ++i) {
                        pmxMorph spm = (pmxMorph)csp.a.highs$.get((Integer)pm.released$.get(i));
                        spm.strange$ = pm.stood$ == 1.0f;
                        spm.stood$ = ((Float)pm.nintendo$.get(i)).floatValue();
                    }
                    continue;
                }
                if (pm.crash$ != 8) continue;
                if (pm.locator$ != null && (long)pm.locator$.size() > faceP) {
                    indexP = 0;
                    iterator = pm.covering$.iterator();
                    while (iterator.hasNext()) {
                        matI = (Integer)iterator.next();
                        if (matI == index) {
                            if ((Byte)pm.patent$.get(indexP) == 1) {
                                mat.glory$ = mat.painted$ + ((float[])pm.views$.get(indexP))[3] * ((Float)pm.locator$.get((int)faceP)).floatValue();
                            } else {
                                float amnt = ((Float)pm.locator$.get((int)faceP)).floatValue();
                                mat.glory$ = (1.0f - amnt) * mat.painted$ + amnt * ((float[])pm.views$.get(indexP))[3];
                            }
                        }
                        ++indexP;
                    }
                    continue;
                }
                if (pm.stood$ == 0.0f) continue;
                indexP = 0;
                iterator = pm.covering$.iterator();
                while (iterator.hasNext()) {
                    matI = (Integer)iterator.next();
                    if (matI == index) {
                        mat.glory$ = mat.painted$;
                    }
                    ++indexP;
                }
                pm.stood$ = 0.0f;
            }
            ++index;
        }
    }
}

