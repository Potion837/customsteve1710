/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.common.eventhandler.SubscribeEvent
 *  cpw.mods.fml.common.gameevent.TickEvent$Phase
 *  cpw.mods.fml.common.gameevent.TickEvent$PlayerTickEvent
 *  cpw.mods.fml.common.gameevent.TickEvent$Type
 *  cpw.mods.fml.relauncher.Side
 *  net.minecraft.client.Minecraft
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.monster.EntityCreeper
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.AxisAlignedBB
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.Vec3
 *  net.minecraftforge.event.entity.player.PlayerInteractEvent
 */
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.relauncher.Side;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Vec3;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

public class PlayerUpdateTickHandler {
    @SubscribeEvent
    public void _nokia(TickEvent.PlayerTickEvent event) {
        if (event.type == TickEvent.Type.PLAYER) {
            if (event.side == Side.CLIENT) {
                if (event.phase == TickEvent.Phase.END) {
                    EventFactory._fioricet(event.player);
                }
                if (event.side == Side.CLIENT && event.phase == TickEvent.Phase.START) {
                    if (KeyHandler.theta$.func_151470_d()) {
                        if ((Config.tests$ += 0.01f) > Config.tricks$) {
                            Config.tests$ = Config.tricks$;
                        }
                    } else if (KeyHandler.vincent$.func_151470_d()) {
                        if ((Config.tests$ -= 0.01f) < Config.semester$) {
                            Config.tests$ = Config.semester$;
                        }
                    } else if (KeyHandler.burning$.func_151470_d()) {
                        if ((Config.aurora$ += 0.1f) > Config.email$) {
                            Config.aurora$ = Config.email$;
                        }
                    } else if (KeyHandler.clara$.func_151470_d() && (Config.aurora$ -= 0.1f) < -Config.email$) {
                        Config.aurora$ = -Config.email$;
                    }
                }
                if (CSmanager.cellular$.trucks$ != null && CSmanager.cellular$.trucks$.graduate$ == CSplayer4.chips$) {
                    Minecraft.func_71410_x().field_71439_g.field_70761_aq = Minecraft.func_71410_x().field_71439_g.field_70177_z;
                    Minecraft.func_71410_x().field_71439_g.field_70760_ar = Minecraft.func_71410_x().field_71439_g.field_70177_z;
                }
            } else if (Minecraft.func_71410_x().field_71439_g != null && CSmanager.cellular$.trucks$ != null) {
                if (CSmanager.cellular$.trucks$.graduate$ == CSplayer4.chips$ && CSmanager.cellular$.trucks$.a() <= 3) {
                    event.player.field_70172_ad = 20;
                }
                if (CSmanager.cellular$.trucks$.graduate$ == CSplayer4.chips$) {
                    int p = CSmanager.cellular$.trucks$.a();
                    if (p > 10 && p % 2 == 0 && p < 25) {
                        this._recently(event.player, false);
                    }
                    if (CSmanager.cellular$.trucks$.a() > 15 && CSmanager.cellular$.trucks$.world$ > -1) {
                        event.player.field_70170_p.func_72956_a((Entity)event.player, "customsteve:shout1", 1.0f, 1.0f);
                        CSmanager.cellular$.trucks$.world$ = -1;
                    }
                }
            }
        }
    }

    public void _recently(EntityPlayer player, boolean fixP) {
        AxisAlignedBB hitBox = AxisAlignedBB.func_72330_a((double)0.0, (double)0.0, (double)0.0, (double)0.0, (double)0.0, (double)0.0);
        float range = 1.5f;
        Vector3f boxSize = new Vector3f(range, 2.6f, range);
        Vector3f offset = new Vector3f(0.0f, 0.0f, 0.0f);
        Vector3f center = new Vector3f(0.0f, 1.32f, 0.7f);
        if (fixP) {
            if ((double)player.field_70125_A < -45.0) {
                if ((double)player.field_70125_A < -85.0) {
                    center.genius$ = 2.2f;
                    center.superb$ = -0.3f;
                } else {
                    center.genius$ += 0.5f;
                }
            } else if ((double)player.field_70125_A > 45.0) {
                if ((double)player.field_70125_A > 85.0) {
                    center.genius$ = 0.3f;
                    center.superb$ = 0.5f;
                } else {
                    center.genius$ -= 0.5f;
                }
            }
        }
        Quaternion qua4 = new Quaternion();
        qua4._between(0.0f, -(player.field_70177_z / 180.0f * (float)Math.PI), 0.0f);
        center = qua4._align(center);
        Vec3 vec31 = Vec3.func_72443_a((double)(-boxSize.serves$ + center.serves$), (double)(-boxSize.genius$ + center.genius$), (double)(-boxSize.superb$ + center.superb$)).func_72441_c(player.field_70165_t, player.field_70163_u - 1.62, player.field_70161_v);
        Vec3 vec3 = Vec3.func_72443_a((double)(boxSize.serves$ + center.serves$), (double)(boxSize.genius$ + center.genius$), (double)(boxSize.superb$ + center.superb$)).func_72441_c(player.field_70165_t, player.field_70163_u - 1.62, player.field_70161_v);
        hitBox.field_72336_d = vec3.field_72450_a;
        hitBox.field_72337_e = vec3.field_72448_b;
        hitBox.field_72334_f = vec3.field_72449_c;
        hitBox.field_72340_a = vec31.field_72450_a;
        hitBox.field_72338_b = vec31.field_72448_b;
        hitBox.field_72339_c = vec31.field_72449_c;
        List list = player.field_70170_p.func_94576_a((Entity)player, hitBox, null);
        for (int i = 0; i < list.size(); ++i) {
            if (!(list.get(i) instanceof EntityLivingBase)) continue;
            EntityLivingBase elb = (EntityLivingBase)list.get(i);
            boolean lastHit = false;
            if (!lastHit && elb.func_70097_a(DamageSource.func_76365_a((EntityPlayer)player), 1.0f)) {
                player.field_70170_p.func_72956_a((Entity)elb, "customsteve:hit1", 1.0f, 1.0f);
            }
            double d1 = player.field_70165_t - elb.field_70165_t;
            double d0 = player.field_70161_v - elb.field_70161_v;
            while (d1 * d1 + d0 * d0 < 1.0E-4) {
                d1 = (Math.random() - Math.random()) * 0.01;
                d0 = (Math.random() - Math.random()) * 0.01;
            }
            elb.field_70739_aP = (float)(Math.atan2(d0, d1) * 180.0 / Math.PI) - player.field_70177_z;
            elb.func_70653_a((Entity)player, 0.0f, d1, d0);
            if (!(elb instanceof EntityCreeper)) continue;
            elb.func_70653_a((Entity)player, 0.0f, d1, d0);
            elb.func_70653_a((Entity)player, 0.0f, d1, d0);
        }
    }

    @SubscribeEvent
    public void _valuable(PlayerInteractEvent evt) {
    }
}

