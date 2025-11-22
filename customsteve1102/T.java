/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.renderer.GLAllocation
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.monster.EntityMob
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.RayTraceResult
 *  net.minecraft.util.math.RayTraceResult$Type
 *  net.minecraft.util.math.Vec3d
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.util.glu.GLU
 *  org.lwjgl.util.vector.Vector2f
 */
package customsteve;

import customsteve.a_0;
import customsteve.ac;
import customsteve.bc;
import customsteve.k;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.GLU;
import org.lwjgl.util.vector.Vector2f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class T {
    public static Vec3d a = null;
    public static boolean a = false;
    public static boolean b = false;
    public static boolean c = false;
    public static Vector2f a = null;

    public static void a() {
        k csp = a_0.instance.a;
        if (csp != null && !((bc.a)((Object)csp.a)).f && ((ac)((Object)csp.a)).j != null) {
            Minecraft mc = Minecraft.getMinecraft();
            T.a(1.0f);
            if (a != null && mc.player != null) {
                a = new Vec3d(T.a.x - mc.player.field_70165_t, T.a.y - mc.player.field_70163_u, T.a.z - mc.player.field_70161_v);
            }
            T.b();
        }
    }

    public static void b() {
        if (a != null) {
            a = T.a((float)T.a.x, (float)T.a.y, (float)T.a.z);
            a = null;
        }
    }

    public static Vector2f a(float x, float y, float z) {
        FloatBuffer screen_coords = GLAllocation.createDirectFloatBuffer((int)3);
        IntBuffer viewport = GLAllocation.createDirectIntBuffer((int)16);
        FloatBuffer modelview = GLAllocation.createDirectFloatBuffer((int)16);
        FloatBuffer projection = GLAllocation.createDirectFloatBuffer((int)16);
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

    public static void a(float tick) {
        Minecraft mc = Minecraft.getMinecraft();
        if (mc.getRenderViewEntity().getEntityBoundingBox() == null) {
            return;
        }
        a = null;
        b = false;
        c = false;
        k csp = a_0.instance.a;
        if (csp != null && !((bc.a)((Object)csp.a)).f && ((ac)((Object)csp.a)).j != null && mc.getRenderViewEntity() != null && mc.world != null && mc.gameSettings.thirdPersonView == 1) {
            double reachDistance = mc.playerController.getBlockReachDistance();
            RayTraceResult rtr = mc.getRenderViewEntity().rayTrace(reachDistance, tick);
            double blockDist = 0.0;
            if (rtr != null) {
                a = rtr.hitVec;
                blockDist = rtr.hitVec.distanceTo(new Vec3d(mc.getRenderViewEntity().posX, mc.getRenderViewEntity().posY, mc.getRenderViewEntity().posZ));
                a = blockDist <= (double)mc.playerController.getBlockReachDistance();
            } else {
                a = null;
            }
            if (rtr != null && rtr.typeOfHit != null) {
                RayTraceResult.Type cfr_ignored_0 = rtr.typeOfHit;
                if (rtr.typeOfHit == RayTraceResult.Type.MISS) {
                    a = null;
                }
            }
            Vec3d renderViewPos = mc.getRenderViewEntity().getPositionEyes(tick);
            Vec3d sightVector = mc.getRenderViewEntity().getLook(tick);
            Vec3d sightRay = renderViewPos.add(sightVector.x * reachDistance, sightVector.y * reachDistance, sightVector.z * reachDistance);
            List entityList = mc.world.func_72839_b(mc.getRenderViewEntity(), mc.getRenderViewEntity().getEntityBoundingBox().expand(sightVector.x * reachDistance, sightVector.y * reachDistance, sightVector.z * reachDistance).grow(1.0, 1.0, 1.0));
            for (int i2 = 0; i2 < entityList.size(); ++i2) {
                double entityDist;
                Entity ent = (Entity)entityList.get(i2);
                if (!ent.canBeCollidedWith()) continue;
                float collisionSize = ent.getCollisionBorderSize();
                AxisAlignedBB aabb = ent.getEntityBoundingBox().grow((double)collisionSize, (double)collisionSize, (double)collisionSize);
                RayTraceResult potentialIntercept = aabb.calculateIntercept(renderViewPos, sightRay);
                if (potentialIntercept == null || !((entityDist = potentialIntercept.hitVec.distanceTo(new Vec3d(mc.getRenderViewEntity().posX, mc.getRenderViewEntity().posY, mc.getRenderViewEntity().posZ))) < blockDist)) continue;
                a = potentialIntercept.hitVec;
                if (entityDist <= (double)mc.playerController.getBlockReachDistance()) {
                    a = true;
                    b = true;
                    if (!(ent instanceof EntityMob)) continue;
                    c = true;
                    continue;
                }
                a = false;
            }
        }
    }

    public static Entity a(float tick) {
        Minecraft mc = Minecraft.getMinecraft();
        a = null;
        b = false;
        c = false;
        k csp = a_0.instance.a;
        if (csp != null && !((bc.a)((Object)csp.a)).f && ((ac)((Object)csp.a)).j != null && mc.getRenderViewEntity() != null && mc.world != null && mc.gameSettings.thirdPersonView == 1) {
            double reachDistance = mc.playerController.getBlockReachDistance();
            RayTraceResult rtr = mc.getRenderViewEntity().rayTrace(reachDistance, tick);
            double blockDist = 0.0;
            if (rtr != null) {
                a = rtr.hitVec;
                blockDist = rtr.hitVec.distanceTo(new Vec3d(mc.getRenderViewEntity().posX, mc.getRenderViewEntity().posY, mc.getRenderViewEntity().posZ));
                a = blockDist <= (double)mc.playerController.getBlockReachDistance();
            } else {
                a = null;
            }
            if (rtr != null && rtr.typeOfHit != null) {
                RayTraceResult.Type cfr_ignored_0 = rtr.typeOfHit;
                if (rtr.typeOfHit == RayTraceResult.Type.MISS) {
                    a = null;
                }
            }
            Vec3d renderViewPos = mc.getRenderViewEntity().getPositionEyes(tick);
            Vec3d sightVector = mc.getRenderViewEntity().getLook(tick);
            Vec3d sightRay = renderViewPos.add(sightVector.x * reachDistance, sightVector.y * reachDistance, sightVector.z * reachDistance);
            List entityList = mc.world.func_72839_b(mc.getRenderViewEntity(), mc.getRenderViewEntity().getEntityBoundingBox().expand(sightVector.x * reachDistance, sightVector.y * reachDistance, sightVector.z * reachDistance).grow(1.0, 1.0, 1.0));
            for (int i2 = 0; i2 < entityList.size(); ++i2) {
                double entityDist;
                Entity ent = (Entity)entityList.get(i2);
                if (!ent.canBeCollidedWith()) continue;
                float collisionSize = ent.getCollisionBorderSize();
                AxisAlignedBB aabb = ent.getEntityBoundingBox().grow((double)collisionSize, (double)collisionSize, (double)collisionSize);
                RayTraceResult potentialIntercept = aabb.calculateIntercept(renderViewPos, sightRay);
                if (potentialIntercept == null || !((entityDist = potentialIntercept.hitVec.distanceTo(new Vec3d(mc.getRenderViewEntity().posX, mc.getRenderViewEntity().posY, mc.getRenderViewEntity().posZ))) < blockDist)) continue;
                a = potentialIntercept.hitVec;
                if (entityDist <= (double)mc.playerController.getBlockReachDistance()) {
                    a = true;
                    b = true;
                    if (ent instanceof EntityMob) {
                        c = true;
                    }
                    return ent;
                }
                a = false;
            }
        }
        return null;
    }
}

