/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  custombuki.b
 *  net.minecraft.block.Block
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.audio.SoundHandler
 *  net.minecraft.client.entity.AbstractClientPlayer
 *  net.minecraft.client.renderer.OpenGlHelper
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.ChatComponentTranslation
 *  net.minecraft.util.IChatComponent
 *  net.minecraft.util.MathHelper
 *  net.minecraft.util.StatCollector
 *  net.minecraft.world.EnumSkyBlock
 *  net.minecraft.world.IBlockAccess
 *  net.minecraft.world.chunk.Chunk
 *  org.lwjgl.opengl.GL11
 */
import custombuki.b;
import java.io.File;
import java.util.Map;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.SoundHandler;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.MathHelper;
import net.minecraft.util.StatCollector;
import net.minecraft.world.EnumSkyBlock;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.chunk.Chunk;
import org.lwjgl.opengl.GL11;

public class EventFactory {
    public static boolean _hockey() {
        return true;
    }

    public static boolean _teach() {
        Minecraft mc = Minecraft.func_71410_x();
        if (mc.field_71451_h != mc.field_71439_g) {
            mc.field_71439_g.field_70155_l = 99999.0;
            mc.field_71439_g.field_70158_ak = true;
            return false;
        }
        if (CSmanager.cellular$.trucks$ != null && CSmanager.cellular$.trucks$.a != null) {
            if (mc.field_71474_y.field_74320_O == 0) {
                if (CSmanager.cellular$.followed$) {
                    for (Map.Entry e2 : CSmanager.cellular$._meter().entrySet()) {
                        CSplayer csp = (CSplayer)e2.getValue();
                        csp.prophet$[csp.wildlife$] = false;
                        csp.wildlife$ = csp.wildlife$ == 2 ? 0 : ++csp.wildlife$;
                        if (csp.smaller$ == null) continue;
                        csp.smaller$.created$ = true;
                    }
                    CSmanager.cellular$.followed$ = false;
                }
                if (!Config.baghdad$ || CSmanager.cellular$.trucks$ != null && CSmanager.cellular$.trucks$.a != null && CSmanager.cellular$.trucks$.a.suffered$ == null) {
                    return false;
                }
                Camera.adaptor$._empty(0.0f, 0);
                if (LoadingPlugin.agencies$) {
                    // empty if block
                }
                return true;
            }
            if (mc.field_71439_g.func_70608_bn()) {
                Camera.adaptor$._mailman(0.0f, 0);
                if (LoadingPlugin.agencies$) {
                    // empty if block
                }
                return true;
            }
            if (mc.field_71474_y.field_74320_O == 1) {
                if (CSmanager.cellular$.glossary$ != null) {
                    if (CSmanager.cellular$.glossary$.bible$ > (long)(CSmanager.cellular$.positive$ != 0 ? CSmanager.cellular$.positive$ : CSmanager.cellular$.trucks$.a() - CSmanager.cellular$.trucks$.a.concern$)) {
                        Camera.adaptor$._concert(0.0f, 0);
                        if (LoadingPlugin.agencies$) {
                            // empty if block
                        }
                        return true;
                    }
                    CSmanager.cellular$.glossary$ = null;
                } else {
                    Camera.adaptor$._mailman(0.0f, 0);
                    if (LoadingPlugin.agencies$) {
                        // empty if block
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean _lebanon() {
        Minecraft mc = Minecraft.func_71410_x();
        EventFactory._julian((Entity)mc.field_71451_h, 0.0f);
        if (!Config.baghdad$ || !Config.scored$) {
            return false;
        }
        if (mc.field_71451_h != mc.field_71439_g) {
            mc.field_71451_h.func_82142_c(true);
            return false;
        }
        CSplayer csp = CSmanager.cellular$.trucks$;
        if (mc.field_71474_y.field_74320_O == 0 && csp != null && csp.a != null && csp.a.suffered$ != null) {
            GL11.glEnable((int)2929);
            if (!Config.maybe$) {
                Hooks._spanking(mc.field_71451_h, 0.0, 0.0, 0.0, 0.0f);
            } else {
                Chunk chunk;
                Minecraft.func_71410_x().field_71460_t.func_78463_b(1.0);
                EntityLivingBase entity = mc.field_71451_h;
                int artificialLight = 0;
                int environmentalLight = 15;
                int x = (int)entity.field_70165_t;
                int y = (int)entity.field_70163_u;
                int z = (int)entity.field_70161_v;
                if (Minecraft.func_71410_x().field_71441_e != null && !(chunk = Minecraft.func_71410_x().field_71441_e.func_72938_d(x, z)).func_76621_g()) {
                    if (chunk.func_76587_i().length <= y >> 4) {
                        y = chunk.func_76587_i().length - 1;
                        y <<= 4;
                    }
                    artificialLight = chunk.func_76614_a(EnumSkyBlock.Block, x & 0xF, y, z & 0xF);
                    artificialLight <<= 4;
                    environmentalLight = chunk.func_76614_a(EnumSkyBlock.Sky, x & 0xF, y, z & 0xF);
                    environmentalLight <<= 4;
                }
                OpenGlHelper.func_77475_a((int)OpenGlHelper.field_77476_b, (float)artificialLight, (float)environmentalLight);
                Hooks._suits(entity, 0.0, 0.0, 0.0, 0.0f);
                Minecraft.func_71410_x().field_71460_t.func_78483_a(1.0);
            }
            try {
                ModContainer.assumed$.invoke(null, new Object[0]);
            }
            catch (Exception e2) {
                e2.printStackTrace();
            }
            return true;
        }
        return false;
    }

    public static boolean _oxide() {
        if (ShaderProgram.stack$ && ShaderProgram.japanese$ != null) {
            return true;
        }
        Minecraft mc = Minecraft.func_71410_x();
        EventFactory._julian((Entity)mc.field_71451_h, 0.0f);
        if (!Config.baghdad$ || !Config.scored$) {
            return true;
        }
        if (Config.scored$) {
            CrosshairsHelper._unwrap();
        }
        if (mc.field_71451_h != mc.field_71439_g) {
            mc.field_71451_h.func_82142_c(false);
            return false;
        }
        CSplayer csp = CSmanager.cellular$.trucks$;
        if (mc.field_71474_y.field_74320_O == 0 && csp != null && csp.a != null && csp.a.suffered$ != null) {
            GL11.glEnable((int)2929);
            if (!Config.maybe$) {
                Chunk chunk;
                Minecraft.func_71410_x().field_71460_t.func_78463_b(1.0);
                EntityLivingBase entity = mc.field_71451_h;
                int artificialLight = 0;
                int environmentalLight = 15;
                int x = (int)entity.field_70165_t;
                int y = (int)entity.field_70163_u;
                int z = (int)entity.field_70161_v;
                if (Minecraft.func_71410_x().field_71441_e != null && !(chunk = Minecraft.func_71410_x().field_71441_e.func_72938_d(x, z)).func_76621_g()) {
                    if (chunk.func_76587_i().length <= y >> 4) {
                        y = chunk.func_76587_i().length - 1;
                        y <<= 4;
                    }
                    artificialLight = chunk.func_76614_a(EnumSkyBlock.Block, x & 0xF, y, z & 0xF);
                    artificialLight <<= 4;
                    environmentalLight = chunk.func_76614_a(EnumSkyBlock.Sky, x & 0xF, y, z & 0xF);
                    environmentalLight <<= 4;
                }
                OpenGlHelper.func_77475_a((int)OpenGlHelper.field_77476_b, (float)artificialLight, (float)environmentalLight);
                Hooks._spanking(mc.field_71451_h, 0.0, 0.0, 0.0, 0.0f);
                Minecraft.func_71410_x().field_71460_t.func_78483_a(1.0);
            } else {
                Chunk chunk;
                Minecraft.func_71410_x().field_71460_t.func_78463_b(1.0);
                EntityLivingBase entity = mc.field_71451_h;
                int artificialLight = 0;
                int environmentalLight = 15;
                int x = (int)entity.field_70165_t;
                int y = (int)entity.field_70163_u;
                int z = (int)entity.field_70161_v;
                if (Minecraft.func_71410_x().field_71441_e != null && !(chunk = Minecraft.func_71410_x().field_71441_e.func_72938_d(x, z)).func_76621_g()) {
                    if (chunk.func_76587_i().length <= y >> 4) {
                        y = chunk.func_76587_i().length - 1;
                        y <<= 4;
                    }
                    artificialLight = chunk.func_76614_a(EnumSkyBlock.Block, x & 0xF, y, z & 0xF);
                    artificialLight <<= 4;
                    environmentalLight = chunk.func_76614_a(EnumSkyBlock.Sky, x & 0xF, y, z & 0xF);
                    environmentalLight <<= 4;
                }
                OpenGlHelper.func_77475_a((int)OpenGlHelper.field_77476_b, (float)artificialLight, (float)environmentalLight);
                Hooks._suits(entity, 0.0, 0.0, 0.0, 0.0f);
            }
            GL11.glDisable((int)2896);
            GL11.glCullFace((int)1029);
            return false;
        }
        return true;
    }

    public static void _julian(Entity entity, float par9) {
        CSplayer csp = null;
        if (entity.func_70005_c_() != null) {
            csp = CSmanager.cellular$._stanley(entity.func_70005_c_());
        }
        if (csp == null || csp.a == null) {
            return;
        }
        EntityLivingBase par1EntityLivingBase = (EntityLivingBase)entity;
        float f2 = csp.a(par1EntityLivingBase.field_70760_ar, par1EntityLivingBase.field_70761_aq, par9);
        float f3 = csp.a(par1EntityLivingBase.field_70758_at, par1EntityLivingBase.field_70759_as, par9);
        float maxLBangleP = 15.0f;
        float maxLBangleY = 15.0f;
        if (csp == CSmanager.cellular$.trucks$ && Minecraft.func_71410_x().field_71474_y.field_74320_O == 0) {
            float renderYaw = f2;
            f2 = csp.a(par1EntityLivingBase.field_70126_B, par1EntityLivingBase.field_70177_z, par9);
            f3 = csp.a(par1EntityLivingBase.field_70758_at, par1EntityLivingBase.field_70759_as, par9);
            if (par1EntityLivingBase.func_70115_ae() && par1EntityLivingBase.field_70154_o instanceof EntityLivingBase) {
                EntityLivingBase entitylivingbase1 = (EntityLivingBase)par1EntityLivingBase.field_70154_o;
                f2 = csp.a(entitylivingbase1.field_70760_ar, entitylivingbase1.field_70761_aq, par9);
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
            float f5 = par1EntityLivingBase.field_70127_C + (par1EntityLivingBase.field_70125_A - par1EntityLivingBase.field_70127_C) * par9;
            csp.a.waste$ = f2;
            csp.a.cadillac$ = f5;
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
            if (csp.a.steel$) {
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
            if (csp.a.steel$ && csp.a.hydrogen$ != null) {
                csp.a.diffs$._micro((float)Math.PI * 2 * (headYaw / 360.0f), new Vector3f(0.0f, 1.0f, 0.0f))._welcome(new Quaternion()._micro(-((float)Math.PI * 2 * (headPitch / 360.0f)), new Vector3f(1.0f, 0.0f, 0.0f)));
                if (csp.a.produce$ != null) {
                    csp.a.address$._micro((float)Math.PI * 2 * (leftYaw / 360.0f), new Vector3f(0.0f, 1.0f, 0.0f))._welcome(new Quaternion()._micro(-((float)Math.PI * 2 * (leftPitch / 360.0f)), new Vector3f(1.0f, 0.0f, 0.0f)));
                }
            } else if (csp != null && csp.a != null && csp.a.produce$ != null && csp.a.feeling$ != null && csp.a.hydrogen$ != null) {
                csp.a.diffs$._micro((float)Math.PI * 2 * (headYaw / 360.0f), new Vector3f(0.0f, 1.0f, 0.0f))._welcome(new Quaternion()._micro(-((float)Math.PI * 2 * (leftPitch / 360.0f)), new Vector3f(1.0f, 0.0f, 0.0f)));
                csp.a.address$._micro((float)Math.PI * 2 * (leftYaw / 360.0f), new Vector3f(0.0f, 1.0f, 0.0f))._welcome(new Quaternion()._micro(-((float)Math.PI * 2 * (headPitch / 360.0f)), new Vector3f(1.0f, 0.0f, 0.0f)));
                csp.a.tourist$._micro((float)Math.PI * 2 * (leftYaw < 0.0f ? -1.0f : 1.0f * Math.min(Math.abs(leftYaw), maxLBangleY)) / 360.0f, new Vector3f(0.0f, 1.0f, 0.0f))._welcome(new Quaternion()._micro(-((float)Math.PI * 2 * ((headPitch < -maxLBangleP ? -maxLBangleP : (headPitch > maxLBangleP ? maxLBangleP : headPitch)) / 360.0f)), new Vector3f(1.0f, 0.0f, 0.0f)));
                if (csp.a.discrete$ != null && csp.a.visited$ != null) {
                    csp.a.imagine$._micro(-((float)Math.PI * 2 * ((leftPitch < 0.0f ? leftPitch : 0.0f) / 360.0f)), new Vector3f(1.0f, 0.0f, 0.0f));
                    csp.a.services$._micro(-((float)Math.PI * 2 * ((leftPitch < 0.0f ? leftPitch : 0.0f) / 360.0f)), new Vector3f(1.0f, 0.0f, 0.0f));
                }
            }
        } else {
            if (par1EntityLivingBase.func_70115_ae() && par1EntityLivingBase.field_70154_o instanceof EntityLivingBase) {
                EntityLivingBase entitylivingbase1 = (EntityLivingBase)par1EntityLivingBase.field_70154_o;
                f2 = csp.a(entitylivingbase1.field_70760_ar, entitylivingbase1.field_70761_aq, par9);
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
            float f5 = par1EntityLivingBase.field_70127_C + (par1EntityLivingBase.field_70125_A - par1EntityLivingBase.field_70127_C) * par9;
            float headYaw = f3 - f2;
            float headPitch = f5;
            float yawLimit = 30.0f;
            float leftYaw = 0.0f;
            float pitchLimit = 60.0f;
            float eyeLimit = 0.0f;
            float leftPitch = 0.0f;
            if (csp.medline$) {
                yawLimit = 0.0f;
            }
            if (csp.a.steel$) {
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
            csp.deeper$ = -f2;
            csp.frame$ = leftYaw;
            if (headPitch > pitchLimit) {
                if (headPitch > pitchLimit + eyeLimit) {
                    leftPitch = headPitch - eyeLimit - pitchLimit;
                }
                headPitch = pitchLimit;
            } else if (headPitch < -pitchLimit - eyeLimit) {
                leftPitch = headPitch + pitchLimit + eyeLimit;
                headPitch = -pitchLimit - eyeLimit;
            }
            if (csp.a.steel$ && csp.a.hydrogen$ != null) {
                csp.a.diffs$._micro((float)Math.PI * 2 * (headYaw / 360.0f), new Vector3f(0.0f, 1.0f, 0.0f))._welcome(new Quaternion()._micro(-((float)Math.PI * 2 * (headPitch / 360.0f)), new Vector3f(1.0f, 0.0f, 0.0f)));
                if (csp.a.produce$ != null) {
                    csp.a.address$._micro((float)Math.PI * 2 * (leftYaw / 360.0f), new Vector3f(0.0f, 1.0f, 0.0f))._welcome(new Quaternion()._micro(-((float)Math.PI * 2 * (leftPitch / 360.0f)), new Vector3f(1.0f, 0.0f, 0.0f)));
                }
            } else if (csp != null && csp.a != null && csp.a.produce$ != null && csp.a.feeling$ != null && csp.a.hydrogen$ != null) {
                csp.a.diffs$._micro((float)Math.PI * 2 * (headYaw / 360.0f), new Vector3f(0.0f, 1.0f, 0.0f))._welcome(new Quaternion()._micro(-((float)Math.PI * 2 * (leftPitch / 360.0f)), new Vector3f(1.0f, 0.0f, 0.0f)));
                csp.a.address$._micro((float)Math.PI * 2 * (leftYaw / 360.0f), new Vector3f(0.0f, 1.0f, 0.0f))._welcome(new Quaternion()._micro(-((float)Math.PI * 2 * (headPitch / 360.0f)), new Vector3f(1.0f, 0.0f, 0.0f)));
                csp.a.tourist$._micro((float)Math.PI * 2 * ((leftYaw < 0.0f ? -1.0f : 1.0f * Math.min(Math.abs(leftYaw), maxLBangleY)) / 360.0f), new Vector3f(0.0f, 1.0f, 0.0f))._welcome(new Quaternion()._micro(-((float)Math.PI * 2 * ((headPitch < -maxLBangleP ? -maxLBangleP : (headPitch > maxLBangleP ? maxLBangleP : headPitch)) / 360.0f)), new Vector3f(1.0f, 0.0f, 0.0f)));
                if (csp.a.discrete$ != null && csp.a.visited$ != null) {
                    csp.a.imagine$._micro(-((float)Math.PI * 2 * ((leftPitch < 0.0f ? leftPitch : 0.0f) / 360.0f)), new Vector3f(1.0f, 0.0f, 0.0f));
                    csp.a.services$._micro(-((float)Math.PI * 2 * ((leftPitch < 0.0f ? leftPitch : 0.0f) / 360.0f)), new Vector3f(1.0f, 0.0f, 0.0f));
                }
            }
        }
    }

    public static boolean _asked(AbstractClientPlayer par1AbstractClientPlayer, double par2, double par4, double par6, float par8, float par9) {
        if (Minecraft.func_71410_x().field_71439_g == par1AbstractClientPlayer && !Config.scored$) {
            return false;
        }
        String senderName = par1AbstractClientPlayer.func_70005_c_();
        if (senderName != null && (senderName.equals(ModContainer.dealing$.highways$) || CSmanager.cellular$._expenses(senderName))) {
            CSplayer csp = CSmanager.cellular$._reload(senderName, false);
            if (Config.elect$ && Config.italia$ == csp && Config.italia$ != null && Config.standard$ == null) {
                Config.standard$ = new Vector3f((float)par1AbstractClientPlayer.field_70165_t, (float)par1AbstractClientPlayer.field_70163_u, (float)par1AbstractClientPlayer.field_70161_v);
                Config.anatomy$ = par1AbstractClientPlayer.field_70761_aq;
            }
            if (CSmanager.cellular$.roland$.size() >= 0) {
                par1AbstractClientPlayer.field_70155_l = 99999.0;
                par1AbstractClientPlayer.field_70158_ak = true;
            }
            if (Config.scored$) {
                CrosshairsHelper._unwrap();
            }
            if (!Config.maybe$) {
                if (Minecraft.func_71410_x().field_71474_y.field_74320_O != 0 && CSmanager.cellular$.followed$) {
                    for (Map.Entry e2 : CSmanager.cellular$._meter().entrySet()) {
                        CSplayer cspe = (CSplayer)e2.getValue();
                        if (cspe.a.bringing$) continue;
                        cspe.prophet$[cspe.wildlife$] = false;
                        cspe.wildlife$ = cspe.wildlife$ == 2 ? 0 : ++cspe.wildlife$;
                        if (cspe.smaller$ == null) continue;
                        cspe.smaller$.created$ = true;
                    }
                    CSmanager.cellular$.followed$ = false;
                }
                Hooks._spanking((EntityLivingBase)par1AbstractClientPlayer, par2, par4, par6, par9);
            } else {
                Hooks._suits((EntityLivingBase)par1AbstractClientPlayer, par2, par4, par6, par9);
            }
            return true;
        }
        return false;
    }

    public static void _fioricet(EntityPlayer ep) {
        CSplayer csp;
        EventFactory._niger();
        if (ep != null && (csp = CSmanager.cellular$._stanley(ep.getDisplayName())) != null) {
            csp.a(ep);
        }
    }

    public static int _crystal(IBlockAccess world, Block block, int x, int y, int z) {
        if (!Config.causes$) {
            return block.getLightValue(world, x, y, z);
        }
        if (Config.permit$) {
            return b.a((IBlockAccess)world, (Block)block, (int)x, (int)y, (int)z);
        }
        return block.getLightValue(world, x, y, z);
    }

    public static void _niger() {
        block24: for (int i = 0; i < CSmanager.cellular$.laden$.size(); ++i) {
            CSplayerMP player;
            BasicPacket packet;
            if (Minecraft.func_71410_x().func_71356_B()) {
                return;
            }
            BasicPacket msg = (BasicPacket)CSmanager.cellular$.laden$.get(i);
            String className = msg.getClass().getCanonicalName();
            if (className.equals(P100_ModelInfomation.class.getCanonicalName())) {
                P100_ModelInfomation mi = (P100_ModelInfomation)msg;
                int index = mi.patrick$.readInt();
                for (int j = 0; j < index; ++j) {
                    CSmanager.cellular$.browsing$.add(new CSplayerMP(mi.patrick$));
                }
                continue;
            }
            if (className.equals(P200_ModelInfomationUpdate2.class.getCanonicalName())) {
                packet = (P200_ModelInfomationUpdate2)msg;
                CSplayerMP cspMP = new CSplayerMP(((P200_ModelInfomationUpdate2)packet).stored$);
                boolean isSelf = false;
                if (ModContainer.dealing$.highways$.equals(cspMP.lucas$)) {
                    isSelf = true;
                }
                if (isSelf) continue;
                block3 : switch (((P200_ModelInfomationUpdate2)packet).phpbb$) {
                    case boats$: {
                        CSmanager.cellular$.browsing$.add(cspMP);
                        break;
                    }
                    case prisoner$: {
                        for (int j = 0; j < CSmanager.cellular$.browsing$.size(); ++j) {
                            if (!((CSplayerMP)CSmanager.cellular$.browsing$.get((int)j)).lucas$.equals(cspMP.lucas$)) continue;
                            CSmanager.cellular$._audience(CSmanager.cellular$._stanley(cspMP.lucas$));
                            CSmanager.cellular$.browsing$.remove(j);
                            break block3;
                        }
                        continue block24;
                    }
                    case weird$: {
                        for (int j = 0; j < CSmanager.cellular$.browsing$.size(); ++j) {
                            if (!((CSplayerMP)CSmanager.cellular$.browsing$.get((int)j)).lucas$.equals(cspMP.lucas$)) continue;
                            CSmanager.cellular$.browsing$.set(j, cspMP);
                            CSplayer csp = CSmanager.cellular$._stanley(cspMP.lucas$);
                            if (csp == null) continue block24;
                            Vector3f loc = new Vector3f(csp.owners$);
                            CSplayer rcscp = new CSplayer(cspMP.lucas$, cspMP.trinidad$);
                            rcscp.things$ = "";
                            rcscp.tourism$ = "";
                            try {
                                rcscp.things$ = cspMP.trinidad$.substring(0, rcscp.reminder$.length() - 4) + "/";
                                rcscp.tourism$ = rcscp.reminder$.substring(0, rcscp.reminder$.length() - 4) + "/";
                            }
                            catch (StringIndexOutOfBoundsException e2) {
                                e2.printStackTrace();
                            }
                            CSmanager.cellular$._tunes(csp, rcscp, true);
                            break block3;
                        }
                        continue block24;
                    }
                }
                continue;
            }
            if (className.equals(P201_AnimationStatus.class.getCanonicalName())) {
                packet = (P201_AnimationStatus)msg;
                boolean isGuest = Config.villas$;
                boolean isSelf = ((P201_AnimationStatus)packet).approx$.equals(ModContainer.dealing$.highways$);
                block8 : switch (((P201_AnimationStatus)packet).a()) {
                    case counter$: {
                        CSplayer csp = CSmanager.cellular$._stanley(((P201_AnimationStatus)packet).approx$);
                        if (csp == null) break;
                        String path = "CustomSteve/Animations/" + csp.b() + "/";
                        csp.a.remove$ = false;
                        csp.pacific$ = true;
                        csp.a.quizzes$ = false;
                        csp.c(((P201_AnimationStatus)packet).ebony$, false);
                        csp.a(false);
                        csp.a.warriors$ = true;
                        if (!isSelf || !((P201_AnimationStatus)packet).making$) continue block24;
                        try {
                            SoundHandler sndManager = Minecraft.func_71410_x().func_147118_V();
                            int mode = 0;
                            sndManager.func_147690_c();
                            CSmanager.picked$.stop("CustomSteveBGM");
                            CSmanager.picked$.newStreamingSource(false, "CustomSteveBGM", new File(ModContainer.outreach$ + "/CustomSteve/BGM/" + ((P201_AnimationStatus)packet).combat$).toURI().toURL(), Config.gadgets$, false, 0.0f, 0.0f, 0.0f, mode, 16.0f);
                            CSmanager.picked$.setVolume("CustomSteveBGM", 1.0f);
                            CSmanager.picked$.play("CustomSteveBGM");
                            Config.framed$ = true;
                        }
                        catch (Exception e1) {
                            e1.printStackTrace();
                        }
                        break;
                    }
                    case trust$: {
                        CSplayer csp1 = CSmanager.cellular$._stanley(((P201_AnimationStatus)packet).approx$);
                        if (isSelf || csp1 == null) break;
                        csp1.a.quizzes$ = true;
                        csp1.a.remove$ = false;
                        csp1.a.warriors$ = false;
                        csp1.inquire$ = null;
                        csp1.c(csp1.a.mutual$ + 1);
                        break;
                    }
                    case producer$: {
                        switch (((P201_AnimationStatus)packet).a()) {
                            case columns$: {
                                if (isSelf && CSmanager.cellular$.trucks$ != null) {
                                    CSmanager.cellular$.trucks$.a.wales$ = true;
                                    RenderObject4 cfr_ignored_0 = CSmanager.cellular$.trucks$.a.course$;
                                    CSmanager.cellular$.trucks$.a.course$ = RenderObject4.coral$;
                                } else if (CSmanager.cellular$.trucks$ != null) {
                                    RenderObject4 cfr_ignored_1 = CSmanager.cellular$.trucks$.a.course$;
                                    CSmanager.cellular$.trucks$.a.course$ = RenderObject4.bless$;
                                }
                                CSmanager.cellular$.roland$.add(CSmanager.cellular$._index(((P201_AnimationStatus)packet).approx$));
                                CSmanager.cellular$.soccer$ = ((P201_AnimationStatus)packet).approx$;
                                String ss = StatCollector.func_74838_a((String)"Network.SyncPlay.Begin").replace("%s%", ((P201_AnimationStatus)packet).approx$);
                                Minecraft.func_71410_x().field_71439_g.func_145747_a((IChatComponent)new ChatComponentTranslation(ss, new Object[]{StatCollector.func_74838_a((String)ss).length() + 1}));
                                CSmanager.cellular$._internal(30, true);
                                break block8;
                            }
                            case attacked$: {
                                String ss3 = StatCollector.func_74838_a((String)"Network.SyncPlay.Cancel").replace("%s%", ((P201_AnimationStatus)packet).approx$);
                                Minecraft.func_71410_x().field_71439_g.func_145747_a((IChatComponent)new ChatComponentTranslation(ss3, new Object[]{StatCollector.func_74838_a((String)ss3).length() + 1}));
                                CSmanager.cellular$._slight();
                                CSmanager.cellular$.positive$ = 0;
                                for (int j = 0; j < CSmanager.cellular$.roland$.size(); ++j) {
                                    CSplayer csp2 = CSmanager.cellular$._stanley(((CSplayerMP)CSmanager.cellular$.roland$.get((int)j)).lucas$);
                                    if (csp2 == null) continue;
                                    RenderObject4 cfr_ignored_2 = csp2.a.course$;
                                    csp2.a.course$ = RenderObject4.cameras$;
                                    csp2.a.wales$ = false;
                                }
                                CSmanager.cellular$.roland$.clear();
                                CSmanager.cellular$.soccer$ = "";
                                if (CSmanager.cellular$.trucks$ == null) break;
                                RenderObject4 cfr_ignored_3 = CSmanager.cellular$.trucks$.a.course$;
                                CSmanager.cellular$.trucks$.a.course$ = RenderObject4.cameras$;
                                break block8;
                            }
                            case cents$: {
                                CSplayer csp3;
                                String ss4 = StatCollector.func_74838_a((String)"Network.SyncPlay.End").replace("%s%", ((P201_AnimationStatus)packet).approx$);
                                Minecraft.func_71410_x().field_71439_g.func_145747_a((IChatComponent)new ChatComponentTranslation(ss4, new Object[]{StatCollector.func_74838_a((String)ss4).length() + 1}));
                                CSmanager.cellular$._slight();
                                CSmanager.cellular$._small();
                                CSmanager.cellular$.positive$ = 0;
                                for (int j = 0; j < CSmanager.cellular$.roland$.size(); ++j) {
                                    csp3 = CSmanager.cellular$._stanley(((CSplayerMP)CSmanager.cellular$.roland$.get((int)j)).lucas$);
                                    if (csp3 == null) continue;
                                    csp3.a.warriors$ = false;
                                    csp3.a.quizzes$ = true;
                                    if (((P201_AnimationStatus)packet).making$) {
                                        try {
                                            CSmanager.cellular$.updating$ = null;
                                            SoundHandler sndManager = Minecraft.func_71410_x().func_147118_V();
                                            boolean mode = false;
                                            sndManager.func_147690_c();
                                            CSmanager.picked$.stop("CustomSteveBGM");
                                        }
                                        catch (Exception e1) {
                                            e1.printStackTrace();
                                        }
                                    }
                                    RenderObject4 cfr_ignored_4 = csp3.a.course$;
                                    csp3.a.course$ = RenderObject4.cameras$;
                                    csp3.a.wales$ = false;
                                    csp3.a.remove$ = false;
                                    csp3.listings$ = false;
                                }
                                CSmanager.cellular$.roland$.clear();
                                CSmanager.cellular$.soccer$ = "";
                                if (CSmanager.cellular$.trucks$ == null) break;
                                RenderObject4 cfr_ignored_5 = CSmanager.cellular$.trucks$.a.course$;
                                CSmanager.cellular$.trucks$.a.course$ = RenderObject4.cameras$;
                                break block8;
                            }
                            case endif$: {
                                if (isSelf) {
                                    CSmanager.cellular$.trucks$.a.wales$ = true;
                                    RenderObject4 cfr_ignored_6 = CSmanager.cellular$.trucks$.a.course$;
                                    CSmanager.cellular$.trucks$.a.course$ = RenderObject4.funds$;
                                } else {
                                    String ss1 = StatCollector.func_74838_a((String)"Network.SyncPlay.Join").replace("%s%", ((P201_AnimationStatus)packet).approx$);
                                    Minecraft.func_71410_x().field_71439_g.func_145747_a((IChatComponent)new ChatComponentTranslation(ss1, new Object[]{StatCollector.func_74838_a((String)ss1).length() + 1}));
                                }
                                CSmanager.cellular$.roland$.add(CSmanager.cellular$._index(((P201_AnimationStatus)packet).approx$));
                                break block8;
                            }
                            case montreal$: {
                                break block8;
                            }
                            case anime$: {
                                CSplayer csp3;
                                if (CSmanager.cellular$.trucks$ != null) {
                                    RenderObject4 cfr_ignored_7 = CSmanager.cellular$.trucks$.a.course$;
                                    CSmanager.cellular$.trucks$.a.course$ = RenderObject4.piece$;
                                }
                                for (int j = 0; j < CSmanager.cellular$.roland$.size(); ++j) {
                                    csp3 = CSmanager.cellular$._stanley(((CSplayerMP)CSmanager.cellular$.roland$.get((int)j)).lucas$);
                                    if (csp3 == null) continue;
                                    csp3.a.quizzes$ = false;
                                    if (!Config.taught$ || !csp3.loans$.equals(((P201_AnimationStatus)packet).approx$)) continue;
                                    Config.standard$ = null;
                                    Config.anatomy$ = -1.0f;
                                    Config.italia$ = csp3;
                                    Config.elect$ = true;
                                }
                                CSmanager.cellular$._internal(15, true);
                                String ss2 = StatCollector.func_74838_a((String)"Network.SyncPlay.Sync").replace("%s%", ((P201_AnimationStatus)packet).approx$);
                                Minecraft.func_71410_x().field_71439_g.func_145747_a((IChatComponent)new ChatComponentTranslation(ss2, new Object[]{StatCollector.func_74838_a((String)ss2).length() + 1}));
                                CSmanager.cellular$._puppy(((P201_AnimationStatus)packet).ebony$);
                                if (!((P201_AnimationStatus)packet).making$ || ((P201_AnimationStatus)packet).combat$ == null || ((P201_AnimationStatus)packet).combat$.isEmpty()) break;
                                CSmanager.cellular$.updating$ = ((P201_AnimationStatus)packet).combat$;
                                break block8;
                            }
                        }
                        break;
                    }
                }
                continue;
            }
            if (!className.equals(P202_PlayerInfomationUpdate.class.getCanonicalName())) continue;
            packet = (P202_PlayerInfomationUpdate)msg;
            if (((P202_PlayerInfomationUpdate)packet).explain$.equals(CSmanager.cellular$.trucks$.loans$) || (player = CSmanager.cellular$._index(((P202_PlayerInfomationUpdate)packet).explain$)) == null) continue;
            CSplayer csp = CSmanager.cellular$._stanley(player.lucas$);
            if (((P202_PlayerInfomationUpdate)packet).ferrari$ != player.backing$) {
                player.backing$ = ((P202_PlayerInfomationUpdate)packet).ferrari$;
                if (player.backing$) {
                    if (CSmanager.cellular$.trucks$ != null) {
                        CSmanager.cellular$._audience(csp);
                    }
                } else if (Minecraft.func_71410_x().field_71439_g != null) {
                    csp = CSmanager.cellular$._reload(((P202_PlayerInfomationUpdate)packet).explain$, false);
                }
            }
            if (csp == null) continue;
            csp.a();
        }
        CSmanager.cellular$.laden$.clear();
    }
}

