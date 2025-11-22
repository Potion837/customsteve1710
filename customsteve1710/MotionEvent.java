/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.common.eventhandler.Event
 *  net.minecraft.entity.player.EntityPlayer
 */
import cpw.mods.fml.common.eventhandler.Event;
import net.minecraft.entity.player.EntityPlayer;

public class MotionEvent
extends Event {
    public String damaged$;
    public boolean herself$;
    public MotionEvent2 disposal$;
    public EntityPlayer slave$;
    public CSplayer sharon$;

    public MotionEvent(boolean isUpper, MotionEvent2 type, CSplayer csp, EntityPlayer ep) {
        this.herself$ = isUpper;
        this.disposal$ = type;
        this.slave$ = ep;
        this.sharon$ = csp;
    }
}

