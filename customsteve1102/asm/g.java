/*
 * Decompiled with CFR 0.152.
 */
package customsteve.asm;

import customsteve.asm.e;
import java.util.HashMap;
import java.util.Map;

public class g
implements e {
    Map<String, e.a> a = new HashMap<String, e.a>();

    public g() {
        this.a.put("RenderPlayer.func_130009_a", new e.a("func_130009_a", "a"));
        this.a.put("AbstractClientPlayer", new e.a("net/minecraft/client/entity/AbstractClientPlayer", "beu"));
        this.a.put("EntityPlayer.addMovementStat", new e.a("addMovementStat", "j"));
        this.a.put("EntityPlayer", new e.a("net/minecraft/entity/player/EntityPlayer", "uf"));
        this.a.put("EntityRenderer", new e.a("net/minecraft/client/renderer/EntityRenderer", "bfe"));
        this.a.put("EntityRenderer.renderWorld", new e.a("renderWorld", "a"));
        this.a.put("EntityRenderer.renderHand", new e.a("renderHand", "b"));
        this.a.put("RenderGlobal.renderEntities", new e.a("renderEntities", "a"));
        this.a.put("Vec3", new e.a("net/minecraft/util/Vec3", "atc"));
        this.a.put("ICamera", new e.a("net/minecraft/client/renderer/culling/ICamera", "bft"));
        this.a.put("Entity", new e.a("net/minecraft/entity/Entity", "nn"));
    }

    @Override
    public e.a a(String name) {
        return this.a.get(name);
    }

    @Override
    public String a(boolean isConfusion, String name) {
        e.a c2 = this.a.get(name);
        if (c2 == null) {
            return null;
        }
        return isConfusion ? c2.b() : c2.a();
    }
}

