/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.common.eventhandler.EventPriority
 *  cpw.mods.fml.common.eventhandler.SubscribeEvent
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  net.minecraft.client.entity.AbstractClientPlayer
 *  net.minecraftforge.client.event.RenderPlayerEvent$Pre
 *  net.minecraftforge.common.MinecraftForge
 */
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.common.MinecraftForge;

@SideOnly(value=Side.CLIENT)
public class RenderPlayerEventHandler {
    public RenderPlayerEventHandler() {
        MinecraftForge.EVENT_BUS.register((Object)this);
    }

    @SubscribeEvent(priority=EventPriority.HIGHEST)
    public void _delight(RenderPlayerEvent.Pre event) {
        event.setCanceled(EventFactory._asked((AbstractClientPlayer)event.entityPlayer, 0.0, 0.0, 0.0, 0.0f, 0.0f));
    }
}

