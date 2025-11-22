/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.client.Minecraft
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.MathHelper
 *  net.minecraft.util.MovingObjectPosition
 *  net.minecraft.util.Vec3
 *  net.minecraft.world.IBlockAccess
 *  net.minecraftforge.client.ForgeHooksClient
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.util.glu.Project
 */
import java.nio.FloatBuffer;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.client.ForgeHooksClient;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.Project;

public class Camera {
    public static Camera adaptor$ = new Camera();
    public static Vector3f harder$ = new Vector3f();
    public static Quaternion carter$ = new Quaternion();
    public static float numerous$ = 0.0f;
    private Minecraft margaret$ = Minecraft.func_71410_x();
    private float thats$ = 4.0f;
    private float plays$;
    private float local$;
    private float weights$;
    private float chain$;
    private float finding$;
    private float sharp$;
    private float replied$;
    private float supplier$;
    private float dressed$;
    private float factor$;
    private float grill$;
    private float waves$;
    private float genre$;
    private float valid$;

    public void _mailman(float par1, int par2) {
        float f2;
        this.valid$ = this.margaret$.field_71474_y.field_151451_c * 16;
        GL11.glMatrixMode((int)5889);
        GL11.glLoadIdentity();
        float f1 = 0.07f;
        if (this.margaret$.field_71474_y.field_74337_g) {
            GL11.glTranslatef((float)((float)(-(par2 * 2 - 1)) * f1), (float)0.0f, (float)0.0f);
        }
        Project.gluPerspective((float)Minecraft.func_71410_x().field_71474_y.field_74334_X, (float)((float)this.margaret$.field_71443_c / (float)this.margaret$.field_71440_d), (float)(0.07f * Config.child$.genius$), (float)(this.valid$ * 2.0f));
        if (this.margaret$.field_71442_b.func_78747_a()) {
            f2 = 0.6666667f;
            GL11.glScalef((float)1.0f, (float)f2, (float)1.0f);
        }
        GL11.glMatrixMode((int)5888);
        GL11.glLoadIdentity();
        if (this.margaret$.field_71474_y.field_74337_g) {
            GL11.glTranslatef((float)((float)(par2 * 2 - 1) * 0.1f), (float)0.0f, (float)0.0f);
        }
        f2 = this.margaret$.field_71439_g.field_71080_cy + (this.margaret$.field_71439_g.field_71086_bY - this.margaret$.field_71439_g.field_71080_cy) * par1;
        this._ireland(par1);
    }

    public void _concert(float par1, int par2) {
        float f2;
        this.valid$ = this.margaret$.field_71474_y.field_151451_c * 16;
        GL11.glMatrixMode((int)5889);
        GL11.glLoadIdentity();
        float f1 = 0.07f;
        if (this.margaret$.field_71474_y.field_74337_g) {
            GL11.glTranslatef((float)((float)(-(par2 * 2 - 1)) * f1), (float)0.0f, (float)0.0f);
        }
        if (CSmanager.cellular$.glossary$.monica$.size() <= (CSmanager.cellular$.positive$ != 0 ? CSmanager.cellular$.positive$ : CSmanager.cellular$.trucks$.a())) {
            return;
        }
        CameraKeyFrame k = (CameraKeyFrame)CSmanager.cellular$.glossary$.monica$.get(CSmanager.cellular$.positive$ != 0 ? CSmanager.cellular$.positive$ : CSmanager.cellular$.trucks$.a());
        Project.gluPerspective((float)k.outlook$, (float)((float)this.margaret$.field_71443_c / (float)this.margaret$.field_71440_d), (float)(0.07f * Config.child$.genius$), (float)(this.valid$ * 2.0f));
        if (this.margaret$.field_71442_b.func_78747_a()) {
            f2 = 0.6666667f;
            GL11.glScalef((float)1.0f, (float)f2, (float)1.0f);
        }
        GL11.glMatrixMode((int)5888);
        GL11.glLoadIdentity();
        if (this.margaret$.field_71474_y.field_74337_g) {
            GL11.glTranslatef((float)((float)(par2 * 2 - 1) * 0.1f), (float)0.0f, (float)0.0f);
        }
        f2 = this.margaret$.field_71439_g.field_71080_cy + (this.margaret$.field_71439_g.field_71086_bY - this.margaret$.field_71439_g.field_71080_cy) * par1;
        this._thanks(par1);
    }

    public void _empty(float par1, int par2) {
        float f2;
        this.valid$ = this.margaret$.field_71474_y.field_151451_c * 16;
        GL11.glMatrixMode((int)5889);
        GL11.glLoadIdentity();
        float f1 = 0.07f;
        if (this.margaret$.field_71474_y.field_74337_g) {
            GL11.glTranslatef((float)((float)(-(par2 * 2 - 1)) * f1), (float)0.0f, (float)0.0f);
        }
        Project.gluPerspective((float)(Config.italian$ == -1 ? Minecraft.func_71410_x().field_71474_y.field_74334_X : (float)Config.italian$), (float)((float)this.margaret$.field_71443_c / (float)this.margaret$.field_71440_d), (float)(0.07f * Config.child$.genius$), (float)(this.valid$ * 2.0f));
        if (this.margaret$.field_71442_b.func_78747_a()) {
            f2 = 0.6666667f;
            GL11.glScalef((float)1.0f, (float)f2, (float)1.0f);
        }
        GL11.glMatrixMode((int)5888);
        GL11.glLoadIdentity();
        if (this.margaret$.field_71474_y.field_74337_g) {
            GL11.glTranslatef((float)((float)(par2 * 2 - 1) * 0.1f), (float)0.0f, (float)0.0f);
        }
        f2 = this.margaret$.field_71439_g.field_71080_cy + (this.margaret$.field_71439_g.field_71086_bY - this.margaret$.field_71439_g.field_71080_cy) * par1;
        this._mitchell(par1);
    }

    public void _needle(float par1, int par2) {
        GL11.glMatrixMode((int)5889);
        GL11.glLoadIdentity();
        float f1 = 0.07f;
        if (this.margaret$.field_71474_y.field_74337_g) {
            GL11.glTranslatef((float)((float)(-(par2 * 2 - 1)) * f1), (float)0.0f, (float)0.0f);
        }
        Project.gluPerspective((float)Minecraft.func_71410_x().field_71474_y.field_74334_X, (float)((float)this.margaret$.field_71443_c / (float)this.margaret$.field_71440_d), (float)0.05f, (float)((float)(256 >> this.margaret$.field_71474_y.field_151451_c) * 2.0f));
        if (this.margaret$.field_71442_b.func_78747_a()) {
            float f2 = 0.6666667f;
            GL11.glScalef((float)1.0f, (float)f2, (float)1.0f);
        }
        GL11.glMatrixMode((int)5888);
        GL11.glLoadIdentity();
        if (this.margaret$.field_71474_y.field_74337_g) {
            GL11.glTranslatef((float)((float)(par2 * 2 - 1) * 0.1f), (float)0.0f, (float)0.0f);
        }
        this._mitchell(par1);
    }

    private void _ireland(float par1) {
        EntityLivingBase entitylivingbase = this.margaret$.field_71451_h;
        float f1 = entitylivingbase.field_70129_M - 1.62f;
        double d0 = entitylivingbase.field_70169_q + (entitylivingbase.field_70165_t - entitylivingbase.field_70169_q) * (double)par1;
        double d1 = entitylivingbase.field_70167_r + (entitylivingbase.field_70163_u - entitylivingbase.field_70167_r) * (double)par1 - (double)f1;
        double d2 = entitylivingbase.field_70166_s + (entitylivingbase.field_70161_v - entitylivingbase.field_70166_s) * (double)par1;
        if (entitylivingbase.func_70608_bn()) {
            int z;
            int y;
            int x;
            Block block = entitylivingbase.field_70170_p.func_147439_a(MathHelper.func_76128_c((double)entitylivingbase.field_70165_t), MathHelper.func_76128_c((double)entitylivingbase.field_70163_u), MathHelper.func_76128_c((double)entitylivingbase.field_70161_v));
            if (block.isBed((IBlockAccess)entitylivingbase.field_70170_p, x = MathHelper.func_76128_c((double)entitylivingbase.field_70165_t), y = MathHelper.func_76128_c((double)entitylivingbase.field_70163_u), z = MathHelper.func_76128_c((double)entitylivingbase.field_70161_v), entitylivingbase)) {
                int j = block.getBedDirection((IBlockAccess)entitylivingbase.field_70170_p, x, y, z);
                f1 = (float)((double)f1 + 1.0);
                GL11.glLoadIdentity();
                GL11.glTranslatef((float)0.0f, (float)1.2f, (float)-2.0f);
                if (!this.margaret$.field_71474_y.field_74325_U) {
                    ForgeHooksClient.orientBedCamera((Minecraft)this.margaret$, (EntityLivingBase)entitylivingbase);
                    switch (j) {
                        case 0: {
                            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                            GL11.glRotatef((float)180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                            GL11.glRotatef((float)25.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                            break;
                        }
                        case 1: {
                            GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                            GL11.glRotatef((float)180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                            GL11.glRotatef((float)25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                            break;
                        }
                        case 2: {
                            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                            GL11.glRotatef((float)180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                            GL11.glRotatef((float)-25.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                            break;
                        }
                        case 3: {
                            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                            GL11.glRotatef((float)180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                            GL11.glRotatef((float)-25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                        }
                    }
                }
            }
        } else {
            boolean isfly;
            float x = 0.0f;
            float y = 1.62f;
            float z = -(4.0f * Config._calling());
            Double dx = x;
            Double dy = y;
            Double dz = z;
            boolean bl2 = isfly = entitylivingbase instanceof EntityPlayer ? ((EntityPlayer)entitylivingbase).field_71075_bZ.field_75100_b : false;
            if (CSmanager.cellular$.trucks$ != null && CSmanager.cellular$.trucks$.medline$) {
                y += 0.1f;
            }
            if (isfly || entitylivingbase.func_70093_af() || entitylivingbase.func_70115_ae()) {
                // empty if block
            }
            Vector3f pos = new Vector3f(x, y, z)._solution(Config.child$);
            dx = pos.serves$;
            dy = pos.genius$;
            dz = -((double)pos.superb$);
            float f6 = entitylivingbase.field_70177_z + Config.aurora$;
            float f2 = entitylivingbase.field_70125_A;
            if (Config.child$.serves$ == Config.child$.genius$ && Config.child$.genius$ == Config.child$.superb$ && Config.child$.superb$ == 1.0f) {
                if (this.margaret$.field_71474_y.field_74320_O == 2) {
                    f2 += 180.0f;
                }
                double d3 = (double)(-MathHelper.func_76126_a((float)(f6 / 180.0f * (float)Math.PI)) * MathHelper.func_76134_b((float)(f2 / 180.0f * (float)Math.PI))) * dz;
                double d4 = (double)(MathHelper.func_76134_b((float)(f6 / 180.0f * (float)Math.PI)) * MathHelper.func_76134_b((float)(f2 / 180.0f * (float)Math.PI))) * dz;
                double d5 = (double)(-MathHelper.func_76126_a((float)(f2 / 180.0f * (float)Math.PI))) * dz;
                for (int k = 0; k < 8; ++k) {
                    double d6;
                    MovingObjectPosition movingobjectposition;
                    float f3 = (k & 1) * 2 - 1;
                    float f4 = (k >> 1 & 1) * 2 - 1;
                    float f5 = (k >> 2 & 1) * 2 - 1;
                    if ((movingobjectposition = this.margaret$.field_71441_e.func_72933_a(Vec3.func_72443_a((double)(d0 + (double)(f3 *= 0.1f)), (double)(d1 + (double)(f4 *= 0.1f)), (double)(d2 + (double)(f5 *= 0.1f))), Vec3.func_72443_a((double)(d0 - d3 + (double)f3 + (double)f5), (double)(d1 - d5 + (double)f4), (double)(d2 - d4 + (double)f5)))) == null || !((d6 = movingobjectposition.field_72307_f.func_72438_d(Vec3.func_72443_a((double)d0, (double)d1, (double)d2))) < dz)) continue;
                    dz = d6;
                }
            }
            dz = -dz.doubleValue();
            GL11.glRotatef((float)(entitylivingbase.field_70125_A - f2), (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)(entitylivingbase.field_70177_z - f6), (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glTranslated((double)0.0, (double)0.0, (double)dz);
            GL11.glRotatef((float)(f6 - entitylivingbase.field_70177_z), (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)(f2 - entitylivingbase.field_70125_A), (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)(entitylivingbase.field_70127_C + (entitylivingbase.field_70125_A - entitylivingbase.field_70127_C) * par1), (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)(entitylivingbase.field_70126_B + (entitylivingbase.field_70177_z - entitylivingbase.field_70126_B) * par1 + 180.0f), (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glTranslated((double)0.0, (double)(1.62 - dy), (double)0.0);
        }
        d0 = entitylivingbase.field_70169_q + (entitylivingbase.field_70165_t - entitylivingbase.field_70169_q) * (double)par1;
        d1 = entitylivingbase.field_70167_r + (entitylivingbase.field_70163_u - entitylivingbase.field_70167_r) * (double)par1 - (double)f1;
        d2 = entitylivingbase.field_70166_s + (entitylivingbase.field_70161_v - entitylivingbase.field_70166_s) * (double)par1;
    }

    private void _thanks(float par1) {
        EntityLivingBase entitylivingbase = this.margaret$.field_71451_h;
        float f1 = entitylivingbase.field_70129_M - 1.62f;
        double d0 = entitylivingbase.field_70169_q + (entitylivingbase.field_70165_t - entitylivingbase.field_70169_q) * (double)par1;
        double d1 = entitylivingbase.field_70167_r + (entitylivingbase.field_70163_u - entitylivingbase.field_70167_r) * (double)par1 - (double)f1;
        double d2 = entitylivingbase.field_70166_s + (entitylivingbase.field_70161_v - entitylivingbase.field_70166_s) * (double)par1;
        if (Config.elect$ && Config.standard$ != null && Config.italia$ != CSmanager.cellular$.trucks$) {
            GL11.glTranslated((double)(-(entitylivingbase.field_70165_t - (double)Config.standard$.serves$)), (double)(-(entitylivingbase.field_70163_u - (double)1.62f - (double)Config.standard$.genius$)), (double)(-(entitylivingbase.field_70161_v - (double)Config.standard$.superb$)));
        }
        if (entitylivingbase.func_70608_bn()) {
            f1 = (float)((double)f1 + 1.0);
            GL11.glTranslatef((float)0.0f, (float)0.3f, (float)0.0f);
            if (!this.margaret$.field_71474_y.field_74325_U) {
                GL11.glRotatef((float)(entitylivingbase.field_70126_B + (entitylivingbase.field_70177_z - entitylivingbase.field_70126_B) * par1 + 180.0f), (float)0.0f, (float)-1.0f, (float)0.0f);
                GL11.glRotatef((float)(entitylivingbase.field_70127_C + (entitylivingbase.field_70125_A - entitylivingbase.field_70127_C) * par1), (float)-1.0f, (float)0.0f, (float)0.0f);
            }
        }
        if (!this.margaret$.field_71474_y.field_74325_U) {
            CSplayer csp;
            if (this.margaret$.field_71474_y.field_74320_O > 0) {
                // empty if block
            }
            if ((csp = CSmanager.cellular$.trucks$) == null || csp.a != null) {
                // empty if block
            }
            float scale = 1.0f;
            VmdFileInfo vfi = CSmanager.cellular$.glossary$;
            if (vfi.monica$.size() <= (CSmanager.cellular$.positive$ != 0 ? CSmanager.cellular$.positive$ : CSmanager.cellular$.trucks$.a())) {
                return;
            }
            CameraKeyFrame k = (CameraKeyFrame)vfi.monica$.get(CSmanager.cellular$.positive$ != 0 ? CSmanager.cellular$.positive$ : CSmanager.cellular$.trucks$.a());
            float[] yrp1 = k.clubs$._always(null);
            float pitch = yrp1[2] / ((float)Math.PI * 2) * 360.0f;
            float roll = yrp1[1] / ((float)Math.PI * 2) * 360.0f;
            float yaw = yrp1[0] / ((float)Math.PI * 2) * 360.0f;
            Matrix4f m = new Matrix4f();
            m._counties(new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(1.0f, 1.0f, 1.0f), k.clubs$._agenda(new Matrix3f()));
            float[] r = new float[16];
            m._manager(r, false);
            FloatBuffer matrix = BufferUtils.createFloatBuffer((int)16);
            for (int i = 0; i < r.length; ++i) {
                matrix.put(r[i]);
            }
            matrix.rewind();
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)(k.england$ / 10.0f * Config.child$.superb$));
            if (numerous$ >= 360.0f) {
                numerous$ = 0.0f;
            }
            numerous$ += 1.0f;
            float prevYaw = entitylivingbase.field_70177_z;
            float prevPitch = entitylivingbase.field_70125_A;
            GL11.glRotatef((float)yaw, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)pitch, (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)roll, (float)0.0f, (float)1.0f, (float)0.0f);
            float yFix = 0.0f;
            if (!entitylivingbase.func_70115_ae() || entitylivingbase.field_70154_o != null) {
                // empty if block
            }
            GL11.glTranslatef((float)(-(k.stage$.serves$ / 10.0f * Config.child$.serves$)), (float)(1.62f - k.stage$.genius$ / 10.0f * Config.child$.genius$ - yFix), (float)(k.stage$.superb$ / 10.0f * Config.child$.superb$));
            if (Config.elect$ && Config.standard$ != null && Config.italia$ != CSmanager.cellular$.trucks$) {
                GL11.glRotatef((float)Config.anatomy$, (float)0.0f, (float)1.0f, (float)0.0f);
            } else {
                GL11.glRotatef((float)(entitylivingbase.field_70761_aq + (entitylivingbase.field_70761_aq - entitylivingbase.field_70760_ar) * par1), (float)0.0f, (float)1.0f, (float)0.0f);
            }
        }
        d0 = entitylivingbase.field_70169_q + (entitylivingbase.field_70165_t - entitylivingbase.field_70169_q) * (double)par1;
        d1 = entitylivingbase.field_70167_r + (entitylivingbase.field_70163_u - entitylivingbase.field_70167_r) * (double)par1 - (double)f1;
        d2 = entitylivingbase.field_70166_s + (entitylivingbase.field_70161_v - entitylivingbase.field_70166_s) * (double)par1;
    }

    private void _mitchell(float par1) {
        EntityLivingBase entitylivingbase = this.margaret$.field_71451_h;
        CSplayer csp = CSmanager.cellular$.trucks$;
        float f1 = entitylivingbase.field_70129_M - 1.62f;
        double d0 = entitylivingbase.field_70169_q + (entitylivingbase.field_70165_t - entitylivingbase.field_70169_q) * (double)par1;
        double d1 = entitylivingbase.field_70167_r + (entitylivingbase.field_70163_u - entitylivingbase.field_70167_r) * (double)par1 - (double)f1;
        double d2 = entitylivingbase.field_70166_s + (entitylivingbase.field_70161_v - entitylivingbase.field_70166_s) * (double)par1;
        GL11.glRotatef((float)(this.genre$ + (this.waves$ - this.genre$) * par1), (float)0.0f, (float)0.0f, (float)1.0f);
        if (entitylivingbase.func_70608_bn()) {
            int z;
            int y;
            int x;
            Block block = entitylivingbase.field_70170_p.func_147439_a(MathHelper.func_76128_c((double)entitylivingbase.field_70165_t), MathHelper.func_76128_c((double)entitylivingbase.field_70163_u), MathHelper.func_76128_c((double)entitylivingbase.field_70161_v));
            if (block.isBed((IBlockAccess)entitylivingbase.field_70170_p, x = MathHelper.func_76128_c((double)entitylivingbase.field_70165_t), y = MathHelper.func_76128_c((double)entitylivingbase.field_70163_u), z = MathHelper.func_76128_c((double)entitylivingbase.field_70161_v), entitylivingbase)) {
                int j = block.getBedDirection((IBlockAccess)entitylivingbase.field_70170_p, x, y, z);
                f1 = (float)((double)f1 + 1.0);
                GL11.glLoadIdentity();
                GL11.glTranslatef((float)0.0f, (float)1.2f, (float)-2.0f);
                if (!this.margaret$.field_71474_y.field_74325_U) {
                    ForgeHooksClient.orientBedCamera((Minecraft)this.margaret$, (EntityLivingBase)entitylivingbase);
                    switch (j) {
                        case 0: {
                            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                            GL11.glRotatef((float)180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                            GL11.glRotatef((float)25.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                            break;
                        }
                        case 1: {
                            GL11.glRotatef((float)90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                            GL11.glRotatef((float)180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                            GL11.glRotatef((float)25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                            break;
                        }
                        case 2: {
                            GL11.glRotatef((float)-90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                            GL11.glRotatef((float)180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                            GL11.glRotatef((float)-25.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                            break;
                        }
                        case 3: {
                            GL11.glRotatef((float)-90.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                            GL11.glRotatef((float)180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                            GL11.glRotatef((float)-25.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                        }
                    }
                }
            }
        } else if (!this.margaret$.field_71474_y.field_74325_U) {
            if (this.margaret$.field_71474_y.field_74320_O > 0) {
                GL11.glRotatef((float)(entitylivingbase.field_70127_C + (entitylivingbase.field_70125_A - entitylivingbase.field_70127_C) * par1), (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)(entitylivingbase.field_70126_B + (entitylivingbase.field_70177_z - entitylivingbase.field_70126_B) * par1 + 180.0f), (float)0.0f, (float)1.0f, (float)0.0f);
            }
            if (csp == null && csp.a == null) {
                return;
            }
            if (csp.a.suffered$ != null && this.margaret$.field_71474_y.field_74320_O == 0) {
                Matrix4f m = new Matrix4f();
                m._bikes();
                float[] ang = new float[3];
                if (csp.a.suffered$.safely$[csp.wildlife$] == null) {
                    return;
                }
                Quaternion angq = csp.a.suffered$.shaved$[csp.wildlife$];
                Vector3f headPos = new Vector3f(csp.a.suffered$.safely$[csp.wildlife$]);
                if (angq == null) {
                    return;
                }
                angq._always(ang);
                float max = entitylivingbase.field_70126_B + (entitylivingbase.field_70177_z - entitylivingbase.field_70126_B) * par1 - (entitylivingbase.field_70761_aq + ang[1] / ((float)Math.PI * 2) * 360.0f);
                float roll = 0.0f;
                float yaw = entitylivingbase.field_70126_B + (entitylivingbase.field_70177_z - entitylivingbase.field_70126_B) * par1;
                int maxAngle = 15;
                if (max > (float)maxAngle) {
                    yaw = entitylivingbase.field_70761_aq + ang[1] / ((float)Math.PI * 2) * 360.0f + (float)maxAngle;
                } else if (max < (float)(-maxAngle)) {
                    yaw = entitylivingbase.field_70761_aq + ang[1] / ((float)Math.PI * 2) * 360.0f - (float)maxAngle;
                }
                float pitch = entitylivingbase.field_70127_C + (entitylivingbase.field_70125_A - entitylivingbase.field_70127_C) * par1;
                if (Config.stickers$ && csp != null && csp.a != null) {
                    GL11.glRotatef((float)csp.a.bookings$, (float)1.0f, (float)0.0f, (float)0.0f);
                    GL11.glRotatef((float)(entitylivingbase.field_70126_B + (entitylivingbase.field_70177_z - entitylivingbase.field_70126_B) * par1 + 180.0f), (float)0.0f, (float)1.0f, (float)0.0f);
                } else {
                    GL11.glRotatef((float)(entitylivingbase.field_70127_C + (entitylivingbase.field_70125_A - entitylivingbase.field_70127_C) * par1), (float)1.0f, (float)0.0f, (float)0.0f);
                    GL11.glRotatef((float)(entitylivingbase.field_70126_B + (entitylivingbase.field_70177_z - entitylivingbase.field_70126_B) * par1 + 180.0f), (float)0.0f, (float)1.0f, (float)0.0f);
                }
                headPos._cookies(Config.child$);
                headPos = new Quaternion()._between(0.0f, (entitylivingbase.field_70177_z + 180.0f) / 360.0f * ((float)Math.PI * 2), 0.0f)._align(headPos);
                GL11.glTranslatef((float)(headPos.serves$ / 10.0f), (float)(1.62f - headPos.genius$ / 10.0f), (float)(0.0f - headPos.superb$ / 10.0f));
            }
        }
        d0 = entitylivingbase.field_70169_q + (entitylivingbase.field_70165_t - entitylivingbase.field_70169_q) * (double)par1;
        d1 = entitylivingbase.field_70167_r + (entitylivingbase.field_70163_u - entitylivingbase.field_70167_r) * (double)par1 - (double)f1;
        d2 = entitylivingbase.field_70166_s + (entitylivingbase.field_70161_v - entitylivingbase.field_70166_s) * (double)par1;
    }
}

