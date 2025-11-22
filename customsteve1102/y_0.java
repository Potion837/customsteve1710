/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.entity.AbstractClientPlayer
 *  net.minecraftforge.client.event.RenderPlayerEvent$Pre
 *  net.minecraftforge.common.MinecraftForge
 *  net.minecraftforge.fml.common.eventhandler.EventPriority
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package customsteve;

import customsteve.p_0;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/*
 * Renamed from customsteve.y
 */
@SideOnly(value=Side.CLIENT)
public class y_0 {
    public y_0() {
        MinecraftForge.EVENT_BUS.register((Object)this);
    }

    @SubscribeEvent(priority=EventPriority.HIGHEST)
    public void a(RenderPlayerEvent.Pre event) {
        event.setCanceled(p_0.a((AbstractClientPlayer)event.getEntityPlayer(), 0.0, 0.0, 0.0, 0.0f, 0.0f));
    }
}

