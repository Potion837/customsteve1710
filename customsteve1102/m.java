/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.client.Minecraft
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.RayTraceResult
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.IBlockAccess
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.util.glu.Project
 */
package customsteve;

import customsteve.ModContainer;
import customsteve.a_0;
import customsteve.ac;
import customsteve.ae;
import customsteve.ak;
import customsteve.al;
import customsteve.am;
import customsteve.ap_0;
import customsteve.at_0;
import customsteve.b_0;
import customsteve.k;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.IBlockAccess;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.Project;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class m {
    public static m a = new m();
    public static ap_0 a = new ap_0();
    public static am a = new am();
    public static int a = -1;
    public static float a = 0.0f;
    private Minecraft a = Minecraft.getMinecraft();
    private float b = 4.0f;
    private float c;
    private float d;
    private float e;
    private float f;
    private float g;
    private float h;
    private float i;
    private float j;
    private float k;
    private float l;
    private float m;
    private float n;
    private float o;
    private float p;

    public void a(float par1, int par2) {
        GL11.glMatrixMode((int)5888);
        GL11.glLoadIdentity();
        this.a(par1);
    }

    public void b(float par1, int par2) {
        GL11.glMatrixMode((int)5888);
        GL11.glLoadIdentity();
        this.b(par1);
    }

    public void c(float par1, int par2) {
        GL11.glMatrixMode((int)5888);
        GL11.glLoadIdentity();
        if (this.a.gameSettings.anaglyph) {
            GL11.glTranslatef((float)((float)(par2 * 2 - 1) * 0.1f), (float)0.0f, (float)0.0f);
        }
        this.c(par1);
    }

    public void d(float par1, int par2) {
        GL11.glMatrixMode((int)5889);
        GL11.glLoadIdentity();
        float f1 = 0.07f;
        if (this.a.gameSettings.anaglyph) {
            GL11.glTranslatef((float)((float)(-(par2 * 2 - 1)) * f1), (float)0.0f, (float)0.0f);
        }
        Project.gluPerspective((float)Minecraft.getMinecraft().gameSettings.fovSetting, (float)((float)this.a.displayWidth / (float)this.a.displayHeight), (float)0.05f, (float)((float)(256 >> this.a.gameSettings.renderDistanceChunks) * 2.0f));
        GL11.glMatrixMode((int)5888);
        GL11.glLoadIdentity();
        if (this.a.gameSettings.anaglyph) {
            GL11.glTranslatef((float)((float)(par2 * 2 - 1) * 0.1f), (float)0.0f, (float)0.0f);
        }
        this.c(par1);
    }

    private void a(float par1) {
        EntityLivingBase entitylivingbase = (EntityLivingBase)this.a.getRenderViewEntity();
        float f1 = -1.62f;
        double d0 = entitylivingbase.field_70169_q + (entitylivingbase.field_70165_t - entitylivingbase.field_70169_q) * (double)par1;
        double d1 = entitylivingbase.field_70167_r + (entitylivingbase.field_70163_u - entitylivingbase.field_70167_r) * (double)par1 - (double)f1;
        double d2 = entitylivingbase.field_70166_s + (entitylivingbase.field_70161_v - entitylivingbase.field_70166_s) * (double)par1;
        if (entitylivingbase.isPlayerSleeping()) {
            IBlockState blockstate = entitylivingbase.field_70170_p.getBlockState(new BlockPos(MathHelper.floor((double)entitylivingbase.field_70165_t), MathHelper.floor((double)entitylivingbase.field_70163_u), MathHelper.floor((double)entitylivingbase.field_70161_v)));
            int x = MathHelper.floor((double)entitylivingbase.field_70165_t);
            int y = MathHelper.floor((double)entitylivingbase.field_70163_u);
            int z = MathHelper.floor((double)entitylivingbase.field_70161_v);
            if (blockstate.getBlock().isBed(blockstate, (IBlockAccess)entitylivingbase.field_70170_p, new BlockPos(x, y, z), (Entity)entitylivingbase)) {
                EnumFacing facing = blockstate.getBlock().getBedDirection(blockstate, (IBlockAccess)entitylivingbase.field_70170_p, new BlockPos(x, y, z));
                f1 = (float)((double)f1 + 1.0);
                GL11.glLoadIdentity();
                GL11.glTranslatef((float)0.0f, (float)1.0f, (float)-2.3f);
                b_0.b(facing);
                if (!this.a.gameSettings.debugCamEnable) {
                    switch (facing) {
                        case SOUTH: {
                            GL11.glRotatef((float)180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                            GL11.glRotatef((float)-60.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                            break;
                        }
                        case NORTH: {
                            GL11.glRotatef((float)60.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                            break;
                        }
                        case WEST: {
                            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                            GL11.glRotatef((float)-60.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                            break;
                        }
                        case EAST: {
                            GL11.glRotatef((float)90.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                            GL11.glRotatef((float)60.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                        }
                    }
                }
            }
        } else {
            float x = 0.0f;
            float y = -1.62f;
            float z = -(4.0f * b_0.a());
            Double dx = x;
            Double dy = y;
            Double dz = z;
            boolean isfly = entitylivingbase instanceof EntityPlayer ? ((EntityPlayer)entitylivingbase).capabilities.isFlying : false;
            ap_0 pos = new ap_0(x, y, z).i(b_0.b);
            dx = pos.a;
            dy = pos.b;
            dz = -((double)pos.c);
            float f6 = entitylivingbase.field_70177_z + b_0.h;
            float f2 = entitylivingbase.field_70125_A;
            if (b_0.b.a == b_0.b.b && b_0.b.b == b_0.b.c && b_0.b.c == 1.0f) {
                if (this.a.gameSettings.thirdPersonView == 2) {
                    f2 += 180.0f;
                }
                double d3 = (double)(-MathHelper.sin((float)(f6 / 180.0f * (float)Math.PI)) * MathHelper.cos((float)(f2 / 180.0f * (float)Math.PI))) * dz;
                double d4 = (double)(MathHelper.cos((float)(f6 / 180.0f * (float)Math.PI)) * MathHelper.cos((float)(f2 / 180.0f * (float)Math.PI))) * dz;
                double d5 = (double)(-MathHelper.sin((float)(f2 / 180.0f * (float)Math.PI))) * dz;
                for (int k2 = 0; k2 < 8; ++k2) {
                    double d6;
                    RayTraceResult raytraceresult;
                    float f3 = (k2 & 1) * 2 - 1;
                    float f4 = (k2 >> 1 & 1) * 2 - 1;
                    float f5 = (k2 >> 2 & 1) * 2 - 1;
                    if ((raytraceresult = this.a.world.func_72933_a(new Vec3d(d0 + (double)(f3 *= 0.1f), d1 + (double)(f4 *= 0.1f), d2 + (double)(f5 *= 0.1f)), new Vec3d(d0 - d3 + (double)f3 + (double)f5, d1 - d5 + (double)f4, d2 - d4 + (double)f5))) == null || !((d6 = raytraceresult.hitVec.distanceTo(new Vec3d(d0, d1, d2))) < dz)) continue;
                    dz = d6;
                }
            }
            dz = -dz.doubleValue();
            if (this.a.gameSettings.thirdPersonView == 2) {
                f2 += 180.0f;
            }
            GL11.glRotatef((float)(entitylivingbase.field_70125_A - f2), (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)(entitylivingbase.field_70177_z - f6), (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glTranslated((double)0.0, (double)0.0, (double)dz);
            GL11.glRotatef((float)(f6 - entitylivingbase.field_70177_z), (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)(f2 - entitylivingbase.field_70125_A), (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)(entitylivingbase.field_70127_C + (entitylivingbase.field_70125_A - entitylivingbase.field_70127_C) * par1), (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)(entitylivingbase.field_70126_B + (entitylivingbase.field_70177_z - entitylivingbase.field_70126_B) * par1 + 180.0f), (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glTranslated((double)0.0, (double)dy, (double)0.0);
        }
        d0 = entitylivingbase.field_70169_q + (entitylivingbase.field_70165_t - entitylivingbase.field_70169_q) * (double)par1;
        d1 = entitylivingbase.field_70167_r + (entitylivingbase.field_70163_u - entitylivingbase.field_70167_r) * (double)par1 - (double)f1;
        d2 = entitylivingbase.field_70166_s + (entitylivingbase.field_70161_v - entitylivingbase.field_70166_s) * (double)par1;
    }

    private void b(float par1) {
        EntityLivingBase entitylivingbase = (EntityLivingBase)this.a.getRenderViewEntity();
        float f1 = 0.0f;
        double d0 = entitylivingbase.field_70169_q + (entitylivingbase.field_70165_t - entitylivingbase.field_70169_q) * (double)par1;
        double d1 = entitylivingbase.field_70167_r + (entitylivingbase.field_70163_u - entitylivingbase.field_70167_r) * (double)par1 - (double)f1;
        double d2 = entitylivingbase.field_70166_s + (entitylivingbase.field_70161_v - entitylivingbase.field_70166_s) * (double)par1;
        if (b_0.A && b_0.c != null && b_0.a != a_0.instance.a) {
            GL11.glTranslated((double)(-(entitylivingbase.field_70165_t - (double)b_0.c.a)), (double)(-(entitylivingbase.field_70163_u - (double)1.62f - (double)b_0.c.b)), (double)(-(entitylivingbase.field_70161_v - (double)b_0.c.c)));
        }
        if (entitylivingbase.isPlayerSleeping()) {
            f1 = (float)((double)f1 + 1.0);
            GL11.glTranslatef((float)0.0f, (float)0.3f, (float)0.0f);
            if (!this.a.gameSettings.debugCamEnable) {
                GL11.glRotatef((float)(entitylivingbase.field_70126_B + (entitylivingbase.field_70177_z - entitylivingbase.field_70126_B) * par1 + 180.0f), (float)0.0f, (float)-1.0f, (float)0.0f);
                GL11.glRotatef((float)(entitylivingbase.field_70127_C + (entitylivingbase.field_70125_A - entitylivingbase.field_70127_C) * par1), (float)-1.0f, (float)0.0f, (float)0.0f);
            }
        }
        if (!this.a.gameSettings.debugCamEnable) {
            k csp;
            if (this.a.gameSettings.thirdPersonView > 0) {
                // empty if block
            }
            if ((csp = a_0.instance.a) == null || csp.a != null) {
                // empty if block
            }
            float scale = 1.0f;
            ae vfi = a_0.instance.a;
            if (((ArrayList)((Object)vfi.c)).size() <= (a_0.instance.a != 0 ? a_0.instance.a : a_0.instance.a.b())) {
                return;
            }
            try {
                ModContainer.b.setBoolean(Minecraft.getMinecraft().renderGlobal, true);
            }
            catch (IllegalArgumentException e2) {
                e2.printStackTrace();
            }
            catch (IllegalAccessException e3) {
                e3.printStackTrace();
            }
            at_0 k2 = (at_0)((ArrayList)((Object)vfi.c)).get(a_0.instance.a != 0 ? a_0.instance.a : a_0.instance.a.b());
            float[] yrp1 = k2.a.a((float[])null);
            float pitch = yrp1[2] / ((float)Math.PI * 2) * 360.0f;
            float roll = yrp1[1] / ((float)Math.PI * 2) * 360.0f;
            float yaw = yrp1[0] / ((float)Math.PI * 2) * 360.0f;
            al m2 = new al();
            m2.a(new ap_0(0.0f, 0.0f, 0.0f), new ap_0(1.0f, 1.0f, 1.0f), k2.a.a(new ak()));
            float[] r2 = new float[16];
            m2.a(r2, false);
            FloatBuffer matrix = BufferUtils.createFloatBuffer((int)16);
            for (int i2 = 0; i2 < r2.length; ++i2) {
                matrix.put(r2[i2]);
            }
            matrix.rewind();
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)(k2.a / 10.0f * b_0.b.c));
            if (a >= 360.0f) {
                a = 0.0f;
            }
            a += 1.0f;
            float prevYaw = entitylivingbase.field_70177_z;
            float prevPitch = entitylivingbase.field_70125_A;
            GL11.glRotatef((float)yaw, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)pitch, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)roll, (float)0.0f, (float)1.0f, (float)0.0f);
            float yFix = 0.0f;
            if (!entitylivingbase.func_184218_aH() || entitylivingbase.func_184187_bx() != null) {
                // empty if block
            }
            GL11.glTranslatef((float)(-(k2.a.a / 10.0f * b_0.b.a)), (float)(-(k2.a.b / 10.0f * b_0.b.b) - yFix), (float)(k2.a.c / 10.0f * b_0.b.c));
            if (b_0.A && b_0.c != null && b_0.a != a_0.instance.a) {
                GL11.glRotatef((float)b_0.l, (float)0.0f, (float)1.0f, (float)0.0f);
            } else {
                GL11.glRotatef((float)(entitylivingbase.renderYawOffset + (entitylivingbase.renderYawOffset - entitylivingbase.prevRenderYawOffset) * par1), (float)0.0f, (float)1.0f, (float)0.0f);
            }
        }
        d0 = entitylivingbase.field_70169_q + (entitylivingbase.field_70165_t - entitylivingbase.field_70169_q) * (double)par1;
        d1 = entitylivingbase.field_70167_r + (entitylivingbase.field_70163_u - entitylivingbase.field_70167_r) * (double)par1 - (double)f1;
        d2 = entitylivingbase.field_70166_s + (entitylivingbase.field_70161_v - entitylivingbase.field_70166_s) * (double)par1;
    }

    private void c(float par1) {
        EntityLivingBase entitylivingbase = (EntityLivingBase)this.a.getRenderViewEntity();
        k csp = a_0.instance.a;
        float f1 = 0.0f;
        double d0 = entitylivingbase.field_70169_q + (entitylivingbase.field_70165_t - entitylivingbase.field_70169_q) * (double)par1;
        double d1 = entitylivingbase.field_70167_r + (entitylivingbase.field_70163_u - entitylivingbase.field_70167_r) * (double)par1 - (double)f1;
        double d2 = entitylivingbase.field_70166_s + (entitylivingbase.field_70161_v - entitylivingbase.field_70166_s) * (double)par1;
        GL11.glRotatef((float)(this.o + (this.n - this.o) * par1), (float)0.0f, (float)0.0f, (float)1.0f);
        if (entitylivingbase.isPlayerSleeping()) {
            // empty if block
        }
        if (!this.a.gameSettings.debugCamEnable) {
            if (this.a.gameSettings.thirdPersonView > 0) {
                GL11.glRotatef((float)(entitylivingbase.field_70127_C + (entitylivingbase.field_70125_A - entitylivingbase.field_70127_C) * par1), (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)(entitylivingbase.field_70126_B + (entitylivingbase.field_70177_z - entitylivingbase.field_70126_B) * par1 + 180.0f), (float)0.0f, (float)1.0f, (float)0.0f);
            }
            if (csp == null && csp.a == null) {
                return;
            }
            if (((ac)((Object)csp.a)).j != null && this.a.gameSettings.thirdPersonView == 0) {
                al m2 = new al();
                m2.a();
                float[] ang = new float[3];
                am angq = ((ac)((Object)csp.a)).j.a[csp.g];
                ap_0 headPos = ((ac)((Object)csp.a)).j.a[csp.g];
                if (headPos == null) {
                    return;
                }
                headPos = new ap_0(headPos);
                if (angq == null) {
                    return;
                }
                angq.a(ang);
                float max = entitylivingbase.field_70126_B + (entitylivingbase.field_70177_z - entitylivingbase.field_70126_B) * par1 - (entitylivingbase.renderYawOffset + ang[1] / ((float)Math.PI * 2) * 360.0f);
                float roll = 0.0f;
                float yaw = entitylivingbase.field_70126_B + (entitylivingbase.field_70177_z - entitylivingbase.field_70126_B) * par1;
                int maxAngle = 15;
                if (max > (float)maxAngle) {
                    yaw = entitylivingbase.renderYawOffset + ang[1] / ((float)Math.PI * 2) * 360.0f + (float)maxAngle;
                } else if (max < (float)(-maxAngle)) {
                    yaw = entitylivingbase.renderYawOffset + ang[1] / ((float)Math.PI * 2) * 360.0f - (float)maxAngle;
                }
                float pitch = entitylivingbase.field_70127_C + (entitylivingbase.field_70125_A - entitylivingbase.field_70127_C) * par1;
                if (b_0.x && csp != null && csp.a != null) {
                    GL11.glRotatef((float)((ac)((Object)csp.a)).d, (float)1.0f, (float)0.0f, (float)0.0f);
                    GL11.glRotatef((float)(entitylivingbase.field_70126_B + (entitylivingbase.field_70177_z - entitylivingbase.field_70126_B) * par1 + 180.0f), (float)0.0f, (float)1.0f, (float)0.0f);
                } else {
                    GL11.glRotatef((float)(entitylivingbase.field_70127_C + (entitylivingbase.field_70125_A - entitylivingbase.field_70127_C) * par1), (float)1.0f, (float)0.0f, (float)0.0f);
                    GL11.glRotatef((float)(entitylivingbase.field_70126_B + (entitylivingbase.field_70177_z - entitylivingbase.field_70126_B) * par1 + 180.0f), (float)0.0f, (float)1.0f, (float)0.0f);
                }
                headPos.h(b_0.b);
                headPos = new am().a(0.0f, (entitylivingbase.field_70177_z + 180.0f) / 360.0f * ((float)Math.PI * 2), 0.0f).a(headPos);
                GL11.glTranslatef((float)(headPos.a / 10.0f), (float)(-(headPos.b / 10.0f)), (float)(0.0f - headPos.c / 10.0f));
            }
        }
        d0 = entitylivingbase.field_70169_q + (entitylivingbase.field_70165_t - entitylivingbase.field_70169_q) * (double)par1;
        d1 = entitylivingbase.field_70167_r + (entitylivingbase.field_70163_u - entitylivingbase.field_70167_r) * (double)par1 - (double)f1;
        d2 = entitylivingbase.field_70166_s + (entitylivingbase.field_70161_v - entitylivingbase.field_70166_s) * (double)par1;
    }
}

