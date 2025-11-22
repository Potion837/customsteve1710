/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.renderer.GLAllocation
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.monster.EntityMob
 *  net.minecraft.util.AxisAlignedBB
 *  net.minecraft.util.MovingObjectPosition
 *  net.minecraft.util.MovingObjectPosition$MovingObjectType
 *  net.minecraft.util.Vec3
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.util.glu.GLU
 *  org.lwjgl.util.vector.Vector2f
 */
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.GLU;
import org.lwjgl.util.vector.Vector2f;

public class CrosshairsHelper {
    public static Vec3 lodge$ = null;
    public static boolean pressed$ = false;
    public static boolean chrysler$ = false;
    public static boolean brass$ = false;
    public static Vector2f policies$ = null;

    public static void _unwrap() {
        CSplayer csp = CSmanager.cellular$.trucks$;
        if (csp != null && !csp.a.bringing$ && csp.a.suffered$ != null) {
            Minecraft mc = Minecraft.func_71410_x();
            CrosshairsHelper._pretty(1.0f);
            if (lodge$ != null && mc.field_71439_g != null) {
                lodge$ = Vec3.func_72443_a((double)mc.field_71439_g.field_70165_t, (double)mc.field_71439_g.field_70163_u, (double)mc.field_71439_g.field_70161_v).func_72444_a(lodge$);
            }
            CrosshairsHelper._tribes();
        }
    }

    public static void _tribes() {
        if (lodge$ != null) {
            policies$ = CrosshairsHelper._waiting((float)CrosshairsHelper.lodge$.field_72450_a, (float)CrosshairsHelper.lodge$.field_72448_b, (float)CrosshairsHelper.lodge$.field_72449_c);
            lodge$ = null;
        }
    }

    public static Vector2f _waiting(float x, float y, float z) {
        FloatBuffer screen_coords = GLAllocation.func_74529_h((int)3);
        IntBuffer viewport = GLAllocation.func_74527_f((int)16);
        FloatBuffer modelview = GLAllocation.func_74529_h((int)16);
        FloatBuffer projection = GLAllocation.func_74529_h((int)16);
        screen_coords.clear();
        modelview.clear();
        projection.clear();
        viewport.clear();
        GL11.glGetFloat((int)2982, (FloatBuffer)modelview);
        GL11.glGetFloat((int)2983, (FloatBuffer)projection);
        GL11.glGetInteger((int)2978, (IntBuffer)viewport);
        boolean ret = GLU.gluProject((float)x, (float)y, (float)z, (FloatBuffer)modelview, (FloatBuffer)projection, (IntBuffer)viewport, (FloatBuffer)screen_coords);
        if (ret) {
            return new Vector2f(screen_coords.get(0), screen_coords.get(1));
        }
        return null;
    }

    public static void _pretty(float tick) {
        Minecraft mc = Minecraft.func_71410_x();
        policies$ = null;
        chrysler$ = false;
        brass$ = false;
        CSplayer csp = CSmanager.cellular$.trucks$;
        if (csp != null && !csp.a.bringing$ && csp.a.suffered$ != null && mc.field_71451_h != null && mc.field_71441_e != null) {
            double reachDistance = mc.field_71442_b.func_78757_d();
            MovingObjectPosition mop = mc.field_71451_h.func_70614_a(reachDistance, tick);
            double blockDist = 0.0;
            if (mop != null) {
                lodge$ = mop.field_72307_f;
                blockDist = mop.field_72307_f.func_72438_d(Vec3.func_72443_a((double)mc.field_71451_h.field_70165_t, (double)mc.field_71451_h.field_70163_u, (double)mc.field_71451_h.field_70161_v));
                pressed$ = blockDist <= (double)mc.field_71442_b.func_78757_d();
            } else {
                lodge$ = null;
            }
            if (mop != null && mop.field_72313_a != null) {
                MovingObjectPosition.MovingObjectType cfr_ignored_0 = mop.field_72313_a;
                if (mop.field_72313_a == MovingObjectPosition.MovingObjectType.MISS) {
                    lodge$ = null;
                }
            }
            Vec3 renderViewPos = mc.field_71451_h.func_70666_h(tick);
            Vec3 sightVector = mc.field_71451_h.func_70676_i(tick);
            Vec3 sightRay = renderViewPos.func_72441_c(sightVector.field_72450_a * reachDistance, sightVector.field_72448_b * reachDistance, sightVector.field_72449_c * reachDistance);
            List entityList = mc.field_71441_e.func_72839_b((Entity)mc.field_71451_h, mc.field_71451_h.field_70121_D.func_72321_a(sightVector.field_72450_a * reachDistance, sightVector.field_72448_b * reachDistance, sightVector.field_72449_c * reachDistance).func_72314_b(1.0, 1.0, 1.0));
            for (int i = 0; i < entityList.size(); ++i) {
                double entityDist;
                float collisionSize;
                AxisAlignedBB aabb;
                MovingObjectPosition potentialIntercept;
                Entity ent = (Entity)entityList.get(i);
                if (!ent.func_70067_L() || (potentialIntercept = (aabb = ent.field_70121_D.func_72314_b((double)(collisionSize = ent.func_70111_Y()), (double)collisionSize, (double)collisionSize)).func_72327_a(renderViewPos, sightRay)) == null || !((entityDist = potentialIntercept.field_72307_f.func_72438_d(Vec3.func_72443_a((double)mc.field_71451_h.field_70165_t, (double)mc.field_71451_h.field_70163_u, (double)mc.field_71451_h.field_70161_v))) < blockDist)) continue;
                lodge$ = potentialIntercept.field_72307_f;
                if (entityDist <= (double)mc.field_71442_b.func_78757_d()) {
                    pressed$ = true;
                    chrysler$ = true;
                    if (!(ent instanceof EntityMob)) continue;
                    brass$ = true;
                    continue;
                }
                pressed$ = false;
            }
        }
    }

    public static Entity _hamburg(float tick) {
        Minecraft mc = Minecraft.func_71410_x();
        policies$ = null;
        chrysler$ = false;
        brass$ = false;
        CSplayer csp = CSmanager.cellular$.trucks$;
        if (csp != null && !csp.a.bringing$ && csp.a.suffered$ != null && mc.field_71451_h != null && mc.field_71441_e != null) {
            double reachDistance = mc.field_71442_b.func_78757_d();
            MovingObjectPosition mop = mc.field_71451_h.func_70614_a(reachDistance, tick);
            double blockDist = 0.0;
            if (mop != null) {
                lodge$ = mop.field_72307_f;
                blockDist = mop.field_72307_f.func_72438_d(Vec3.func_72443_a((double)mc.field_71451_h.field_70165_t, (double)mc.field_71451_h.field_70163_u, (double)mc.field_71451_h.field_70161_v));
                pressed$ = blockDist <= (double)mc.field_71442_b.func_78757_d();
            } else {
                lodge$ = null;
            }
            if (mop != null && mop.field_72313_a != null) {
                MovingObjectPosition.MovingObjectType cfr_ignored_0 = mop.field_72313_a;
                if (mop.field_72313_a == MovingObjectPosition.MovingObjectType.MISS) {
                    lodge$ = null;
                }
            }
            Vec3 renderViewPos = mc.field_71451_h.func_70666_h(tick);
            Vec3 sightVector = mc.field_71451_h.func_70676_i(tick);
            Vec3 sightRay = renderViewPos.func_72441_c(sightVector.field_72450_a * reachDistance, sightVector.field_72448_b * reachDistance, sightVector.field_72449_c * reachDistance);
            List entityList = mc.field_71441_e.func_72839_b((Entity)mc.field_71451_h, mc.field_71451_h.field_70121_D.func_72321_a(sightVector.field_72450_a * reachDistance, sightVector.field_72448_b * reachDistance, sightVector.field_72449_c * reachDistance).func_72314_b(1.0, 1.0, 1.0));
            for (int i = 0; i < entityList.size(); ++i) {
                double entityDist;
                float collisionSize;
                AxisAlignedBB aabb;
                MovingObjectPosition potentialIntercept;
                Entity ent = (Entity)entityList.get(i);
                if (!ent.func_70067_L() || (potentialIntercept = (aabb = ent.field_70121_D.func_72314_b((double)(collisionSize = ent.func_70111_Y()), (double)collisionSize, (double)collisionSize)).func_72327_a(renderViewPos, sightRay)) == null || !((entityDist = potentialIntercept.field_72307_f.func_72438_d(Vec3.func_72443_a((double)mc.field_71451_h.field_70165_t, (double)mc.field_71451_h.field_70163_u, (double)mc.field_71451_h.field_70161_v))) < blockDist)) continue;
                lodge$ = potentialIntercept.field_72307_f;
                if (entityDist <= (double)mc.field_71442_b.func_78757_d()) {
                    pressed$ = true;
                    chrysler$ = true;
                    if (ent instanceof EntityMob) {
                        brass$ = true;
                    }
                    return ent;
                }
                pressed$ = false;
            }
        }
        return null;
    }
}

