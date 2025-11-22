/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.monster.EntityCreeper
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.util.SoundCategory
 *  net.minecraft.util.SoundEvent
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3d
 *  net.minecraftforge.event.entity.player.PlayerInteractEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$Phase
 *  net.minecraftforge.fml.common.gameevent.TickEvent$PlayerTickEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$Type
 *  net.minecraftforge.fml.relauncher.Side
 */
package customsteve;

import customsteve.a_0;
import customsteve.am;
import customsteve.ap_0;
import customsteve.b_0;
import customsteve.k;
import customsteve.p_0;
import customsteve.s_0;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.relauncher.Side;

/*
 * Renamed from customsteve.x
 */
public class x_0 {
    @SubscribeEvent
    public void a(TickEvent.PlayerTickEvent event) {
        if (event.type == TickEvent.Type.PLAYER) {
            if (event.side == Side.CLIENT) {
                if (event.phase == TickEvent.Phase.END) {
                    p_0.a(event.player);
                }
                if (event.side == Side.CLIENT && event.phase == TickEvent.Phase.START) {
                    if (s_0.e.isPressed()) {
                        if ((b_0.e += 0.01f) > b_0.f) {
                            b_0.e = b_0.f;
                        }
                    } else if (s_0.f.isPressed()) {
                        if ((b_0.e -= 0.01f) < b_0.g) {
                            b_0.e = b_0.g;
                        }
                    } else if (s_0.g.isPressed()) {
                        if ((b_0.h += 0.1f) > b_0.i) {
                            b_0.h = b_0.i;
                        }
                    } else if (s_0.h.isPressed() && (b_0.h -= 0.1f) < -b_0.i) {
                        b_0.h = -b_0.i;
                    }
                }
                if (a_0.instance.a != null && a_0.instance.a.a == k.c.i) {
                    Minecraft.getMinecraft().player.field_70761_aq = Minecraft.getMinecraft().player.field_70177_z;
                    Minecraft.getMinecraft().player.field_70760_ar = Minecraft.getMinecraft().player.field_70177_z;
                }
            } else if (Minecraft.getMinecraft().player != null && a_0.instance.a != null) {
                if (a_0.instance.a.a == k.c.i && a_0.instance.a.b() <= 3) {
                    event.player.field_70172_ad = 20;
                }
                if (a_0.instance.a.a == k.c.i) {
                    int p2 = a_0.instance.a.b();
                    if (p2 > 10 && p2 % 2 == 0 && p2 < 25) {
                        this.a(event.player, false);
                    }
                    if (a_0.instance.a.b() > 15 && a_0.instance.a.e > -1) {
                        event.player.field_70170_p.playSound(event.player, new BlockPos(event.player.field_70165_t, event.player.field_70163_u, event.player.field_70161_v), new SoundEvent(new ResourceLocation("customsteve:shout1")), SoundCategory.PLAYERS, 1.0f, 1.0f);
                        a_0.instance.a.e = -1;
                    }
                }
            }
        }
    }

    public void a(EntityPlayer player, boolean fixP) {
        float range = 1.5f;
        ap_0 boxSize = new ap_0(range, 2.6f, range);
        ap_0 offset = new ap_0(0.0f, 0.0f, 0.0f);
        ap_0 center = new ap_0(0.0f, 1.32f, 0.7f);
        if (fixP) {
            if ((double)player.field_70125_A < -45.0) {
                if ((double)player.field_70125_A < -85.0) {
                    center.b = 2.2f;
                    center.c = -0.3f;
                } else {
                    center.b += 0.5f;
                }
            } else if ((double)player.field_70125_A > 45.0) {
                if ((double)player.field_70125_A > 85.0) {
                    center.b = 0.3f;
                    center.c = 0.5f;
                } else {
                    center.b -= 0.5f;
                }
            }
        }
        am qua4 = new am();
        qua4.a(0.0f, -(player.field_70177_z / 180.0f * (float)Math.PI), 0.0f);
        center = qua4.a(center);
        Vec3d vec31 = new Vec3d((double)(-boxSize.a + center.a), (double)(-boxSize.b + center.b), (double)(-boxSize.c + center.c)).add(player.field_70165_t, player.field_70163_u - 1.62, player.field_70161_v);
        Vec3d vec3 = new Vec3d((double)(boxSize.a + center.a), (double)(boxSize.b + center.b), (double)(boxSize.c + center.c)).add(player.field_70165_t, player.field_70163_u - 1.62, player.field_70161_v);
        AxisAlignedBB hitBox = new AxisAlignedBB(vec3.x, vec3.y, vec3.z, vec31.x, vec31.y, vec31.z);
        List list = player.field_70170_p.getEntitiesWithinAABBExcludingEntity((Entity)player, hitBox);
        for (int i2 = 0; i2 < list.size(); ++i2) {
            if (!(list.get(i2) instanceof EntityLivingBase)) continue;
            EntityLivingBase elb = (EntityLivingBase)list.get(i2);
            boolean lastHit = false;
            if (!lastHit && elb.attackEntityFrom(DamageSource.causePlayerDamage((EntityPlayer)player), 1.0f)) {
                elb.field_70170_p.playSound(null, new BlockPos(elb.field_70165_t, elb.field_70163_u, elb.field_70161_v), new SoundEvent(new ResourceLocation("customsteve:bullet_hit2")), SoundCategory.PLAYERS, 1.0f, 1.0f);
            }
            double d1 = player.field_70165_t - elb.field_70165_t;
            double d0 = player.field_70161_v - elb.field_70161_v;
            while (d1 * d1 + d0 * d0 < 1.0E-4) {
                d1 = (Math.random() - Math.random()) * 0.01;
                d0 = (Math.random() - Math.random()) * 0.01;
            }
            b_0.b(d0);
            elb.attackedAtYaw = (float)(Math.atan2(d0, d1) * 180.0 / Math.PI) - player.field_70177_z;
            elb.knockBack((Entity)player, 0.5f, d1, d0);
            if (!(elb instanceof EntityCreeper)) continue;
            elb.knockBack((Entity)player, 0.5f, d1, d0);
            elb.knockBack((Entity)player, 0.5f, d1, d0);
        }
    }

    @SubscribeEvent
    public void a(PlayerInteractEvent evt) {
    }
}

