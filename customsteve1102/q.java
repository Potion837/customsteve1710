/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraftforge.client.event.EntityViewRenderEvent$FOVModifier
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package customsteve;

import customsteve.a_0;
import customsteve.at_0;
import java.util.ArrayList;
import net.minecraftforge.client.event.EntityViewRenderEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class q {
    @SubscribeEvent
    public void a(EntityViewRenderEvent.FOVModifier event) {
        if (a_0.instance.a == null) {
            return;
        }
        if (((ArrayList)((Object)a_0.instance.a.c)).size() <= (a_0.instance.a != 0 ? a_0.instance.a : a_0.instance.a.a(0))) {
            return;
        }
        at_0 k2 = (at_0)((ArrayList)((Object)a_0.instance.a.c)).get(a_0.instance.a != 0 ? a_0.instance.a : a_0.instance.a.a(0));
        event.setFOV(k2.b);
    }
}

