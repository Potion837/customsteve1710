/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraftforge.fml.common.eventhandler.Event
 */
package customsteve;

import customsteve.k;
import customsteve.u_0;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.eventhandler.Event;

/*
 * Renamed from customsteve.u
 * Duplicate member names - consider using --renamedupmembers true
 */
public class u_0
extends Event {
    public String a;
    public boolean a;
    public a a;
    public EntityPlayer a;
    public k a;

    public u_0(boolean isUpper, a type, k csp, EntityPlayer ep) {
        this.a = isUpper;
        this.a = type;
        this.a = ep;
        this.a = csp;
    }
}

