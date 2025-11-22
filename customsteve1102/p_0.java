/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  customsteve.aW
 *  net.minecraft.block.Block
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.audio.SoundHandler
 *  net.minecraft.client.entity.AbstractClientPlayer
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.client.renderer.OpenGlHelper
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.text.ITextComponent
 *  net.minecraft.util.text.TextComponentTranslation
 *  net.minecraft.world.EnumSkyBlock
 *  net.minecraft.world.IBlockAccess
 *  net.minecraft.world.chunk.Chunk
 *  org.lwjgl.opengl.GL11
 */
package customsteve;

import customsteve.E;
import customsteve.LoadingPlugin;
import customsteve.ModContainer;
import customsteve.T;
import customsteve.aS;
import customsteve.aV;
import customsteve.aW;
import customsteve.a_0;
import customsteve.ac;
import customsteve.am;
import customsteve.ap_0;
import customsteve.au_0;
import customsteve.ax_0;
import customsteve.b_0;
import customsteve.bc;
import customsteve.c_0;
import customsteve.k;
import customsteve.l;
import customsteve.m;
import customsteve.n_0;
import java.io.File;
import java.util.ArrayList;
import java.util.Map;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.SoundHandler;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.EnumSkyBlock;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.chunk.Chunk;
import org.lwjgl.opengl.GL11;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from customsteve.p
 */
public class p_0 {
    public static Entity a;

    public static boolean a() {
        return true;
    }

    public static void a() {
        Minecraft mc = Minecraft.getMinecraft();
        Entity entity = a = mc.getRenderViewEntity() instanceof n_0 ? a : mc.getRenderViewEntity();
        if (a != null) {
            if (a_0.a == null) {
                if (p_0.a.world != null) {
                    a_0.a = new n_0(p_0.a.world);
                }
            } else {
                n_0 cam = a_0.a;
                cam.field_70177_z = mc.player.field_70177_z;
                cam.field_70126_B = mc.player.field_70126_B;
                cam.rotationYawHead = mc.player.field_70759_as;
                cam.prevRotationYawHead = mc.player.field_70758_at;
                cam.field_70125_A = mc.player.field_70125_A;
                cam.field_70127_C = mc.player.field_70127_C;
                cam.field_70165_t = mc.player.field_70165_t;
                cam.field_70163_u = mc.player.field_70163_u;
                cam.field_70161_v = mc.player.field_70161_v;
                cam.field_70169_q = mc.player.field_70169_q;
                cam.field_70167_r = mc.player.field_70167_r;
                cam.field_70166_s = mc.player.field_70166_s;
                cam.field_70142_S = mc.player.field_70142_S;
                cam.field_70137_T = mc.player.field_70137_T;
                cam.field_70136_U = mc.player.field_70136_U;
                mc.setRenderViewEntity((Entity)a_0.a);
            }
        }
    }

    public static void b() {
        Minecraft mc = Minecraft.getMinecraft();
        if (a != null) {
            mc.setRenderViewEntity(a);
        }
    }

    public static boolean b() {
        Minecraft mc = Minecraft.getMinecraft();
        if (mc.getRenderViewEntity() != mc.player) {
            EntityPlayerSP cfr_ignored_0 = mc.player;
            EntityPlayerSP.func_184227_b((double)99999.0);
            mc.player.field_70158_ak = true;
            return false;
        }
        if (a_0.instance.a != null && a_0.instance.a.a != null) {
            if (mc.gameSettings.thirdPersonView == 0) {
                if (a_0.instance.a) {
                    for (Map.Entry<String, k> e2 : a_0.instance.a().entrySet()) {
                        k csp = e2.getValue();
                        csp.b[csp.g] = false;
                        csp.g = csp.g == 2 ? 0 : ++csp.g;
                        if (csp.a == null) continue;
                        csp.a.a = true;
                    }
                    a_0.instance.a = false;
                }
                if (!b_0.m || !b_0.r || a_0.instance.a != null && a_0.instance.a.a != null && ((ac)((Object)a_0.instance.a.a)).j == null) {
                    return false;
                }
                m.a.c(0.0f, 0);
                if (LoadingPlugin.a) {
                    // empty if block
                }
                return true;
            }
            if (mc.player.func_70608_bn()) {
                m.a.a(0.0f, 0);
                return true;
            }
            if (mc.gameSettings.thirdPersonView == 1) {
                if (a_0.instance.a != null) {
                    if (a_0.instance.a.a > (long)(a_0.instance.a != 0 ? a_0.instance.a : a_0.instance.a.b() - 0)) {
                        m.a.b(0.0f, 0);
                        if (!LoadingPlugin.a || LoadingPlugin.a) {
                            // empty if block
                        }
                        return false;
                    }
                    a_0.instance.a = null;
                } else {
                    m.a.a(0.0f, 0);
                    if (LoadingPlugin.a) {
                        // empty if block
                    }
                    return false;
                }
            }
        }
        return false;
    }

    public static boolean c() {
        Minecraft mc = Minecraft.getMinecraft();
        p_0.a((Entity)(mc.getRenderViewEntity() instanceof n_0 ? mc.player : mc.getRenderViewEntity()), 0.0f);
        if (!b_0.r || !b_0.m) {
            return false;
        }
        if (mc.getRenderViewEntity() != mc.player) {
            mc.getRenderViewEntity().setInvisible(true);
            return false;
        }
        k csp = a_0.instance.a;
        if (mc.gameSettings.thirdPersonView == 0 && csp != null && csp.a != null && ((ac)((Object)csp.a)).j != null) {
            GL11.glEnable((int)2929);
            if (!b_0.f) {
                c_0.a((EntityLivingBase)mc.getRenderViewEntity(), 0.0, 0.0, 0.0, 0.0f);
            } else {
                Chunk chunk;
                Minecraft.getMinecraft().entityRenderer.enableLightmap();
                EntityLivingBase entity = (EntityLivingBase)mc.getRenderViewEntity();
                int artificialLight = 0;
                int environmentalLight = 15;
                int x = (int)entity.field_70165_t;
                int y = (int)entity.field_70163_u;
                int z = (int)entity.field_70161_v;
                if (Minecraft.getMinecraft().world != null && !(chunk = Minecraft.getMinecraft().world.func_175726_f(new BlockPos(x, 0, z))).isEmpty()) {
                    if (chunk.getBlockStorageArray().length <= y >> 4) {
                        y = chunk.getBlockStorageArray().length - 1;
                        y <<= 4;
                    }
                    artificialLight = chunk.getLightFor(EnumSkyBlock.BLOCK, new BlockPos((double)(x & 0xF), (double)((float)y + entity.func_70047_e()), (double)(z & 0xF)));
                    artificialLight <<= 4;
                    environmentalLight = chunk.getLightFor(EnumSkyBlock.SKY, new BlockPos((double)(x & 0xF), (double)((float)y + entity.func_70047_e()), (double)(z & 0xF)));
                    environmentalLight <<= 4;
                }
                OpenGlHelper.setLightmapTextureCoords((int)OpenGlHelper.lightmapTexUnit, (float)artificialLight, (float)environmentalLight);
                c_0.c(entity, 0.0, 0.0, 0.0, 0.0f);
                Minecraft.getMinecraft().entityRenderer.disableLightmap();
            }
            try {
                ModContainer.b.invoke(null, new Object[0]);
            }
            catch (Exception e2) {
                e2.printStackTrace();
            }
            return true;
        }
        return false;
    }

    public static boolean d() {
        Minecraft mc;
        block13: {
            block14: {
                if (!E.b) break block13;
                if (E.a == null) break block14;
                if (E.a.equals("(none)")) break block13;
            }
            return true;
        }
        p_0.a((Entity)((mc = Minecraft.getMinecraft()).getRenderViewEntity() instanceof n_0 ? mc.player : mc.getRenderViewEntity()), 0.0f);
        if (!b_0.r || !b_0.m) {
            return true;
        }
        if (b_0.m) {
            T.a();
        }
        if (mc.getRenderViewEntity() != mc.player) {
            mc.getRenderViewEntity().setInvisible(false);
            return false;
        }
        k csp = a_0.instance.a;
        if (mc.gameSettings.thirdPersonView == 0 && csp != null && csp.a != null && ((ac)((Object)csp.a)).j != null) {
            GL11.glEnable((int)2929);
            if (!b_0.f) {
                Chunk chunk;
                Minecraft.getMinecraft().entityRenderer.enableLightmap();
                EntityLivingBase entity = (EntityLivingBase)mc.getRenderViewEntity();
                int artificialLight = 0;
                int environmentalLight = 15;
                int x = (int)entity.field_70165_t;
                int y = (int)entity.field_70163_u;
                int z = (int)entity.field_70161_v;
                if (Minecraft.getMinecraft().world != null && !(chunk = Minecraft.getMinecraft().world.func_175726_f(new BlockPos(x, 0, z))).isEmpty()) {
                    if (chunk.getBlockStorageArray().length <= y >> 4) {
                        y = chunk.getBlockStorageArray().length - 1;
                        y <<= 4;
                    }
                    artificialLight = chunk.getLightFor(EnumSkyBlock.BLOCK, new BlockPos((double)(x & 0xF), (double)((float)y + entity.func_70047_e()), (double)(z & 0xF)));
                    artificialLight <<= 4;
                    environmentalLight = chunk.getLightFor(EnumSkyBlock.SKY, new BlockPos((double)(x & 0xF), (double)((float)y + entity.func_70047_e()), (double)(z & 0xF)));
                    environmentalLight <<= 4;
                }
                OpenGlHelper.setLightmapTextureCoords((int)OpenGlHelper.lightmapTexUnit, (float)artificialLight, (float)environmentalLight);
                c_0.a((EntityLivingBase)mc.getRenderViewEntity(), 0.0, 0.0, 0.0, 0.0f);
                Minecraft.getMinecraft().entityRenderer.disableLightmap();
            } else {
                Chunk chunk;
                Minecraft.getMinecraft().entityRenderer.enableLightmap();
                EntityLivingBase entity = (EntityLivingBase)mc.getRenderViewEntity();
                int artificialLight = 0;
                int environmentalLight = 15;
                int x = (int)entity.field_70165_t;
                int y = (int)entity.field_70163_u;
                int z = (int)entity.field_70161_v;
                if (Minecraft.getMinecraft().world != null && !(chunk = Minecraft.getMinecraft().world.func_175726_f(new BlockPos(x, 0, z))).isEmpty()) {
                    if (chunk.getBlockStorageArray().length <= y >> 4) {
                        y = chunk.getBlockStorageArray().length - 1;
                        y <<= 4;
                    }
                    artificialLight = chunk.getLightFor(EnumSkyBlock.BLOCK, new BlockPos((double)(x & 0xF), (double)((float)y + entity.func_70047_e()), (double)(z & 0xF)));
                    artificialLight <<= 4;
                    environmentalLight = chunk.getLightFor(EnumSkyBlock.SKY, new BlockPos((double)(x & 0xF), (double)((float)y + entity.func_70047_e()), (double)(z & 0xF)));
                    environmentalLight <<= 4;
                }
                OpenGlHelper.setLightmapTextureCoords((int)OpenGlHelper.lightmapTexUnit, (float)artificialLight, (float)environmentalLight);
                c_0.c(entity, 0.0, 0.0, 0.0, 0.0f);
            }
            GL11.glDisable((int)2896);
            GL11.glCullFace((int)1029);
            return false;
        }
        return true;
    }

    public static void a(Entity entity, float par9) {
        k csp = null;
        if (entity.getName() != null) {
            csp = a_0.instance.a(entity.getName());
        }
        if (csp == null || csp.a == null) {
            return;
        }
        EntityLivingBase par1EntityLivingBase = (EntityLivingBase)entity;
        float f2 = csp.a(par1EntityLivingBase.prevRenderYawOffset, par1EntityLivingBase.renderYawOffset, par9);
        float f3 = csp.a(par1EntityLivingBase.prevRotationYawHead, par1EntityLivingBase.rotationYawHead, par9);
        float maxLBangleP = 15.0f;
        float maxLBangleY = 15.0f;
        if (csp == a_0.instance.a && Minecraft.getMinecraft().gameSettings.thirdPersonView == 0) {
            float renderYaw = f2;
            f2 = csp.a(par1EntityLivingBase.field_70126_B, par1EntityLivingBase.field_70177_z, par9);
            f3 = csp.a(par1EntityLivingBase.prevRotationYawHead, par1EntityLivingBase.rotationYawHead, par9);
            if (par1EntityLivingBase.func_184218_aH() && par1EntityLivingBase.func_184187_bx() instanceof EntityLivingBase) {
                EntityLivingBase entitylivingbase1 = (EntityLivingBase)par1EntityLivingBase.func_184187_bx();
                f2 = csp.a(entitylivingbase1.prevRenderYawOffset, entitylivingbase1.renderYawOffset, par9);
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
            float f5 = par1EntityLivingBase.field_70127_C + (par1EntityLivingBase.field_70125_A - par1EntityLivingBase.field_70127_C) * par9;
            ((ac)((Object)csp.a)).a = f2;
            ((ac)((Object)csp.a)).b = f5;
            while (f2 > 180.0f) {
                f2 -= 360.0f;
            }
            while (f2 < -180.0f) {
                f2 += 360.0f;
            }
            float headYaw = 0.0f;
            float headPitch = f5;
            float leftYaw = f2;
            float pitchLimit = 60.0f;
            float eyeLimit = 0.0f;
            float leftPitch = 0.0f;
            if (((ac)((Object)csp.a)).a) {
                pitchLimit = 30.0f;
                eyeLimit = 50.0f;
            }
            if (headPitch > pitchLimit) {
                if (headPitch > pitchLimit + eyeLimit) {
                    leftPitch = headPitch - eyeLimit - pitchLimit;
                }
                headPitch = pitchLimit;
            } else if (headPitch < -pitchLimit - eyeLimit) {
                leftPitch = headPitch + pitchLimit + eyeLimit;
                headPitch = -pitchLimit - eyeLimit;
            }
            headYaw = 0.0f;
            leftYaw = 0.0f;
            if (((ac)((Object)csp.a)).a && ((ac)((Object)csp.a)).c != null) {
                ((ac)((Object)csp.a)).d.a((float)Math.PI * 2 * (headYaw / 360.0f), new ap_0(0.0f, 1.0f, 0.0f)).g(new am().a(-((float)Math.PI * 2 * (headPitch / 360.0f)), new ap_0(1.0f, 0.0f, 0.0f)));
                if (((ac)((Object)csp.a)).e != null) {
                    ((ac)((Object)csp.a)).a.a((float)Math.PI * 2 * (leftYaw / 360.0f), new ap_0(0.0f, 1.0f, 0.0f)).g(new am().a(-((float)Math.PI * 2 * (leftPitch / 360.0f)), new ap_0(1.0f, 0.0f, 0.0f)));
                }
            } else if (csp != null && csp.a != null && ((ac)((Object)csp.a)).e != null && ((ac)((Object)csp.a)).g != null && ((ac)((Object)csp.a)).c != null) {
                ((ac)((Object)csp.a)).d.a((float)Math.PI * 2 * (headYaw / 360.0f), new ap_0(0.0f, 1.0f, 0.0f)).g(new am().a(-((float)Math.PI * 2 * (leftPitch / 360.0f)), new ap_0(1.0f, 0.0f, 0.0f)));
                ((ac)((Object)csp.a)).a.a((float)Math.PI * 2 * (leftYaw / 360.0f), new ap_0(0.0f, 1.0f, 0.0f)).g(new am().a(-((float)Math.PI * 2 * (headPitch / 360.0f)), new ap_0(1.0f, 0.0f, 0.0f)));
                ((ac)((Object)csp.a)).c.a((float)Math.PI * 2 * (leftYaw < 0.0f ? -1.0f : 1.0f * Math.min(Math.abs(leftYaw), maxLBangleY)) / 360.0f, new ap_0(0.0f, 1.0f, 0.0f)).g(new am().a(-((float)Math.PI * 2 * ((headPitch < -maxLBangleP ? -maxLBangleP : (headPitch > maxLBangleP ? maxLBangleP : headPitch)) / 360.0f)), new ap_0(1.0f, 0.0f, 0.0f)));
                if (((ac)((Object)csp.a)).i != null && ((ac)((Object)csp.a)).h != null) {
                    ((ac)((Object)csp.a)).f.a(-((float)Math.PI * 2 * ((leftPitch < 0.0f ? leftPitch : 0.0f) / 360.0f)), new ap_0(1.0f, 0.0f, 0.0f));
                    ((ac)((Object)csp.a)).e.a(-((float)Math.PI * 2 * ((leftPitch < 0.0f ? leftPitch : 0.0f) / 360.0f)), new ap_0(1.0f, 0.0f, 0.0f));
                }
            }
        } else {
            if (par1EntityLivingBase.func_184218_aH() && par1EntityLivingBase.func_184187_bx() instanceof EntityLivingBase) {
                EntityLivingBase entitylivingbase1 = (EntityLivingBase)par1EntityLivingBase.func_184187_bx();
                f2 = csp.a(entitylivingbase1.prevRenderYawOffset, entitylivingbase1.renderYawOffset, par9);
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
            float f5 = par1EntityLivingBase.field_70127_C + (par1EntityLivingBase.field_70125_A - par1EntityLivingBase.field_70127_C) * par9;
            float headYaw = f3 - f2;
            float headPitch = f5;
            float yawLimit = 30.0f;
            float leftYaw = 0.0f;
            float pitchLimit = 60.0f;
            float eyeLimit = 0.0f;
            float leftPitch = 0.0f;
            if (csp.j) {
                yawLimit = 0.0f;
            }
            if (((ac)((Object)csp.a)).a) {
                pitchLimit = 30.0f;
                eyeLimit = 50.0f;
            }
            if (headYaw > yawLimit) {
                leftYaw = headYaw - yawLimit;
                headYaw = yawLimit;
            } else if (headYaw < -yawLimit) {
                leftYaw = headYaw + yawLimit;
                headYaw = -yawLimit;
            }
            csp.a = -f2;
            csp.b = leftYaw;
            if (headPitch > pitchLimit) {
                if (headPitch > pitchLimit + eyeLimit) {
                    leftPitch = headPitch - eyeLimit - pitchLimit;
                }
                headPitch = pitchLimit;
            } else if (headPitch < -pitchLimit - eyeLimit) {
                leftPitch = headPitch + pitchLimit + eyeLimit;
                headPitch = -pitchLimit - eyeLimit;
            }
            if (((ac)((Object)csp.a)).a && ((ac)((Object)csp.a)).c != null) {
                ((ac)((Object)csp.a)).d.a((float)Math.PI * 2 * (headYaw / 360.0f), new ap_0(0.0f, 1.0f, 0.0f)).g(new am().a(-((float)Math.PI * 2 * (headPitch / 360.0f)), new ap_0(1.0f, 0.0f, 0.0f)));
                if (((ac)((Object)csp.a)).e != null) {
                    ((ac)((Object)csp.a)).a.a((float)Math.PI * 2 * (leftYaw / 360.0f), new ap_0(0.0f, 1.0f, 0.0f)).g(new am().a(-((float)Math.PI * 2 * (leftPitch / 360.0f)), new ap_0(1.0f, 0.0f, 0.0f)));
                }
            } else if (csp != null && csp.a != null && ((ac)((Object)csp.a)).e != null && ((ac)((Object)csp.a)).g != null && ((ac)((Object)csp.a)).c != null) {
                ((ac)((Object)csp.a)).d.a((float)Math.PI * 2 * (headYaw / 360.0f), new ap_0(0.0f, 1.0f, 0.0f)).g(new am().a(-((float)Math.PI * 2 * (leftPitch / 360.0f)), new ap_0(1.0f, 0.0f, 0.0f)));
                ((ac)((Object)csp.a)).a.a((float)Math.PI * 2 * (leftYaw / 360.0f), new ap_0(0.0f, 1.0f, 0.0f)).g(new am().a(-((float)Math.PI * 2 * (headPitch / 360.0f)), new ap_0(1.0f, 0.0f, 0.0f)));
                ((ac)((Object)csp.a)).c.a((float)Math.PI * 2 * ((leftYaw < 0.0f ? -1.0f : 1.0f * Math.min(Math.abs(leftYaw), maxLBangleY)) / 360.0f), new ap_0(0.0f, 1.0f, 0.0f)).g(new am().a(-((float)Math.PI * 2 * ((headPitch < -maxLBangleP ? -maxLBangleP : (headPitch > maxLBangleP ? maxLBangleP : headPitch)) / 360.0f)), new ap_0(1.0f, 0.0f, 0.0f)));
                if (((ac)((Object)csp.a)).i != null && ((ac)((Object)csp.a)).h != null) {
                    ((ac)((Object)csp.a)).f.a(-((float)Math.PI * 2 * ((leftPitch < 0.0f ? leftPitch : 0.0f) / 360.0f)), new ap_0(1.0f, 0.0f, 0.0f));
                    ((ac)((Object)csp.a)).e.a(-((float)Math.PI * 2 * ((leftPitch < 0.0f ? leftPitch : 0.0f) / 360.0f)), new ap_0(1.0f, 0.0f, 0.0f));
                }
            }
        }
    }

    public static boolean a(AbstractClientPlayer par1AbstractClientPlayer, double par2, double par4, double par6, float par8, float par9) {
        if (Minecraft.getMinecraft().player == par1AbstractClientPlayer && !b_0.m) {
            return false;
        }
        String senderName = par1AbstractClientPlayer.func_70005_c_();
        if (senderName != null && (senderName.equals(ModContainer.a.c) || a_0.instance.b(senderName))) {
            k csp = a_0.instance.a(senderName, false);
            if (b_0.A && b_0.a == csp && b_0.a != null && b_0.c == null) {
                b_0.c = new ap_0((float)par1AbstractClientPlayer.field_70165_t, (float)par1AbstractClientPlayer.field_70163_u, (float)par1AbstractClientPlayer.field_70161_v);
                b_0.l = par1AbstractClientPlayer.field_70761_aq;
            }
            if (((ArrayList)((Object)a_0.instance.a)).size() >= 0) {
                AbstractClientPlayer.func_184227_b((double)99999.0);
                par1AbstractClientPlayer.field_70158_ak = true;
            }
            if (b_0.m) {
                T.a();
            }
            if (!b_0.f) {
                if (Minecraft.getMinecraft().gameSettings.thirdPersonView != 0 && a_0.instance.a) {
                    for (Map.Entry<String, k> e2 : a_0.instance.a().entrySet()) {
                        k cspe = e2.getValue();
                        if (((bc.a)((Object)cspe.a)).f) continue;
                        cspe.b[cspe.g] = false;
                        cspe.g = cspe.g == 2 ? 0 : ++cspe.g;
                        if (cspe.a == null) continue;
                        cspe.a.a = true;
                    }
                    a_0.instance.a = false;
                }
                c_0.a((EntityLivingBase)par1AbstractClientPlayer, par2, par4, par6, par9);
            } else {
                c_0.c((EntityLivingBase)par1AbstractClientPlayer, par2, par4, par6, par9);
            }
            return true;
        }
        return false;
    }

    public static void a(EntityPlayer ep) {
        k csp;
        p_0.c();
        if (ep != null && (csp = a_0.instance.a(ep.getName())) != null) {
            csp.a(ep);
        }
    }

    public static int a(IBlockAccess world, Block block, int x, int y, int z) {
        BlockPos pos = new BlockPos(x, y, z);
        if (!b_0.w) {
            return block.getLightValue(world.getBlockState(pos), world, pos);
        }
        return block.getLightValue(world.getBlockState(pos), world, pos);
    }

    public static void c() {
        block24: for (int i2 = 0; i2 < a_0.instance.c.size(); ++i2) {
            l player;
            aS packet;
            if (Minecraft.getMinecraft().isSingleplayer()) {
                return;
            }
            aS msg = (aS)a_0.instance.c.get(i2);
            String className = msg.getClass().getCanonicalName();
            if (className.equals(au_0.class.getCanonicalName())) {
                au_0 mi = (au_0)msg;
                int index = mi.a.readInt();
                for (int j2 = 0; j2 < index; ++j2) {
                    a_0.instance.b.add(new l(mi.a));
                }
                continue;
            }
            if (className.equals(aV.class.getCanonicalName())) {
                packet = (aV)msg;
                l cspMP = new l(packet.a);
                boolean isSelf = false;
                if (ModContainer.a.c.equals(cspMP.a)) {
                    isSelf = true;
                }
                if (isSelf) continue;
                block3 : switch (packet.a) {
                    case a: {
                        a_0.instance.b.add(cspMP);
                        break;
                    }
                    case b: {
                        for (int j3 = 0; j3 < a_0.instance.b.size(); ++j3) {
                            if (!a_0.instance.b.get((int)j3).a.equals(cspMP.a)) continue;
                            a_0.instance.a(a_0.instance.a(cspMP.a));
                            a_0.instance.b.remove(j3);
                            break block3;
                        }
                        continue block24;
                    }
                    case c: {
                        for (int j4 = 0; j4 < a_0.instance.b.size(); ++j4) {
                            if (!a_0.instance.b.get((int)j4).a.equals(cspMP.a)) continue;
                            a_0.instance.b.set(j4, cspMP);
                            k csp = a_0.instance.a(cspMP.a);
                            if (csp == null) continue block24;
                            ap_0 loc = new ap_0(csp.a);
                            k rcscp = new k(cspMP.a, cspMP.c);
                            rcscp.b = "";
                            rcscp.c = "";
                            try {
                                rcscp.b = cspMP.c.substring(0, rcscp.a.length() - 4) + "/";
                                rcscp.c = rcscp.a.substring(0, rcscp.a.length() - 4) + "/";
                            }
                            catch (StringIndexOutOfBoundsException e2) {
                                e2.printStackTrace();
                            }
                            a_0.instance.a(csp, rcscp, true);
                            break block3;
                        }
                        continue block24;
                    }
                }
                continue;
            }
            if (className.equals(aW.class.getCanonicalName())) {
                packet = (aW)msg;
                boolean isGuest = b_0.g;
                boolean isSelf = ((aW)packet).a.equals(ModContainer.a.c);
                block8 : switch (packet.a()) {
                    case a: {
                        k csp = a_0.instance.a(((aW)packet).a);
                        if (csp == null) break;
                        String path = "CustomSteve/Animations/" + csp.b() + "/";
                        ((bc.a)((Object)csp.a)).a = false;
                        csp.i = true;
                        ((bc.a)((Object)csp.a)).c = false;
                        csp.c(((aW)packet).b, 0);
                        csp.a(0);
                        ((bc.a)((Object)csp.a)).h = true;
                        if (!isSelf || !((aW)packet).a) continue block24;
                        try {
                            SoundHandler sndManager = Minecraft.getMinecraft().getSoundHandler();
                            int mode = 0;
                            sndManager.stopSounds();
                            a_0.sndSystem.stop("CustomSteveBGM");
                            a_0.sndSystem.newStreamingSource(false, "CustomSteveBGM", new File(ModContainer.b + "/CustomSteve/BGM/" + ((aW)packet).d).toURI().toURL(), b_0.b, false, 0.0f, 0.0f, 0.0f, mode, 16.0f);
                            a_0.sndSystem.setVolume("CustomSteveBGM", 1.0f);
                            a_0.sndSystem.play("CustomSteveBGM");
                            b_0.l = true;
                        }
                        catch (Exception e1) {
                            e1.printStackTrace();
                        }
                        break;
                    }
                    case b: {
                        k csp1 = a_0.instance.a(((aW)packet).a);
                        if (isSelf || csp1 == null) break;
                        ((bc.a)((Object)csp1.a)).c = true;
                        ((bc.a)((Object)csp1.a)).a = false;
                        ((bc.a)((Object)csp1.a)).h = false;
                        csp1.g = null;
                        csp1.a(0, ((ac)((Object)csp1.a)).b + 1);
                        break;
                    }
                    case c: {
                        switch (packet.a()) {
                            case a: {
                                if (isSelf && a_0.instance.a != null) {
                                    ((bc.a)((Object)a_0.instance.a.a)).e = true;
                                    bc.d cfr_ignored_0 = ((bc.a)((Object)a_0.instance.a.a)).a;
                                    ((bc.a)((Object)a_0.instance.a.a)).a = bc.d.b;
                                } else if (a_0.instance.a != null) {
                                    bc.d cfr_ignored_1 = ((bc.a)((Object)a_0.instance.a.a)).a;
                                    ((bc.a)((Object)a_0.instance.a.a)).a = bc.d.c;
                                }
                                ((ArrayList)((Object)a_0.instance.a)).add(a_0.instance.a(((aW)packet).a));
                                a_0.instance.a = ((aW)packet).a;
                                String ss = new TextComponentTranslation("Network.SyncPlay.Begin", new Object[]{0}).func_150254_d().replace("%s%", ((aW)packet).a);
                                Minecraft.getMinecraft().player.sendMessage((ITextComponent)new TextComponentTranslation(ss, new Object[]{0}));
                                a_0.instance.a(30, true);
                                break block8;
                            }
                            case c: {
                                String ss3 = new TextComponentTranslation("Network.SyncPlay.Cancel", new Object[]{0}).func_150254_d().replace("%s%", ((aW)packet).a);
                                Minecraft.getMinecraft().player.sendMessage((ITextComponent)new TextComponentTranslation(ss3, new Object[]{0}));
                                a_0.instance.h();
                                a_0.instance.a = 0;
                                for (int j5 = 0; j5 < ((ArrayList)((Object)a_0.instance.a)).size(); ++j5) {
                                    k csp2 = a_0.instance.a(((l)((ArrayList)((Object)a_0.instance.a)).get((int)j5)).a);
                                    if (csp2 == null) continue;
                                    bc.d cfr_ignored_2 = ((bc.a)((Object)csp2.a)).a;
                                    ((bc.a)((Object)csp2.a)).a = bc.d.a;
                                    ((bc.a)((Object)csp2.a)).e = false;
                                }
                                ((ArrayList)((Object)a_0.instance.a)).clear();
                                a_0.instance.a = "";
                                if (a_0.instance.a == null) break;
                                bc.d cfr_ignored_3 = ((bc.a)((Object)a_0.instance.a.a)).a;
                                ((bc.a)((Object)a_0.instance.a.a)).a = bc.d.a;
                                break block8;
                            }
                            case b: {
                                k csp3;
                                String ss4 = new TextComponentTranslation("Network.SyncPlay.End", new Object[]{0}).func_150254_d().replace("%s%", ((aW)packet).a);
                                Minecraft.getMinecraft().player.sendMessage((ITextComponent)new TextComponentTranslation(ss4, new Object[]{0}));
                                a_0.instance.h();
                                a_0.instance.g();
                                a_0.instance.a = 0;
                                for (int j6 = 0; j6 < ((ArrayList)((Object)a_0.instance.a)).size(); ++j6) {
                                    csp3 = a_0.instance.a(((l)((ArrayList)((Object)a_0.instance.a)).get((int)j6)).a);
                                    if (csp3 == null) continue;
                                    ((bc.a)((Object)csp3.a)).h = false;
                                    ((bc.a)((Object)csp3.a)).c = true;
                                    if (((aW)packet).a) {
                                        try {
                                            a_0.instance.b = null;
                                            SoundHandler sndManager = Minecraft.getMinecraft().getSoundHandler();
                                            boolean mode = false;
                                            sndManager.stopSounds();
                                            a_0.sndSystem.stop("CustomSteveBGM");
                                        }
                                        catch (Exception e1) {
                                            e1.printStackTrace();
                                        }
                                    }
                                    bc.d cfr_ignored_4 = ((bc.a)((Object)csp3.a)).a;
                                    ((bc.a)((Object)csp3.a)).a = bc.d.a;
                                    ((bc.a)((Object)csp3.a)).e = false;
                                    ((bc.a)((Object)csp3.a)).a = false;
                                    csp3.g = false;
                                }
                                ((ArrayList)((Object)a_0.instance.a)).clear();
                                a_0.instance.a = "";
                                if (a_0.instance.a == null) break;
                                bc.d cfr_ignored_5 = ((bc.a)((Object)a_0.instance.a.a)).a;
                                ((bc.a)((Object)a_0.instance.a.a)).a = bc.d.a;
                                break block8;
                            }
                            case d: {
                                if (isSelf) {
                                    ((bc.a)((Object)a_0.instance.a.a)).e = true;
                                    bc.d cfr_ignored_6 = ((bc.a)((Object)a_0.instance.a.a)).a;
                                    ((bc.a)((Object)a_0.instance.a.a)).a = bc.d.d;
                                } else {
                                    String ss1 = new TextComponentTranslation("Network.SyncPlay.Join", new Object[]{0}).func_150254_d().replace("%s%", ((aW)packet).a);
                                    Minecraft.getMinecraft().player.sendMessage((ITextComponent)new TextComponentTranslation(ss1, new Object[]{0}));
                                }
                                ((ArrayList)((Object)a_0.instance.a)).add(a_0.instance.a(((aW)packet).a));
                                break block8;
                            }
                            case f: {
                                break block8;
                            }
                            case e: {
                                k csp3;
                                if (a_0.instance.a != null) {
                                    bc.d cfr_ignored_7 = ((bc.a)((Object)a_0.instance.a.a)).a;
                                    ((bc.a)((Object)a_0.instance.a.a)).a = bc.d.e;
                                }
                                for (int j7 = 0; j7 < ((ArrayList)((Object)a_0.instance.a)).size(); ++j7) {
                                    csp3 = a_0.instance.a(((l)((ArrayList)((Object)a_0.instance.a)).get((int)j7)).a);
                                    if (csp3 == null) continue;
                                    ((bc.a)((Object)csp3.a)).c = false;
                                    if (!b_0.z || !csp3.e.equals(((aW)packet).a)) continue;
                                    b_0.c = null;
                                    b_0.l = -1.0f;
                                    b_0.a = csp3;
                                    b_0.A = true;
                                }
                                a_0.instance.a(15, true);
                                String ss2 = new TextComponentTranslation("Network.SyncPlay.Sync", new Object[]{0}).func_150254_d().replace("%s%", ((aW)packet).a);
                                Minecraft.getMinecraft().player.sendMessage((ITextComponent)new TextComponentTranslation(ss2, new Object[]{0}));
                                a_0.instance.c(((aW)packet).b);
                                if (!((aW)packet).a || ((aW)packet).d == null || ((aW)packet).d.isEmpty()) break;
                                a_0.instance.b = ((aW)packet).d;
                                break block8;
                            }
                        }
                        break;
                    }
                }
                continue;
            }
            if (!className.equals(ax_0.class.getCanonicalName())) continue;
            packet = (ax_0)msg;
            if (((ax_0)packet).a.equals(a_0.instance.a.e) || (player = a_0.instance.a(((ax_0)packet).a)) == null) continue;
            k csp = a_0.instance.a(player.a);
            if (((ax_0)packet).a != player.b) {
                player.b = ((ax_0)packet).a;
                if (player.b) {
                    if (a_0.instance.a != null) {
                        a_0.instance.a(csp);
                    }
                } else if (Minecraft.getMinecraft().player != null) {
                    csp = a_0.instance.a(((ax_0)packet).a, false);
                }
            }
            if (csp == null) continue;
            csp.a();
        }
        a_0.instance.c.clear();
    }
}

