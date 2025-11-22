/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;

public class Names164
implements Names {
    Map worst$ = new HashMap();

    public Names164() {
        this.worst$.put("RenderPlayer.func_130009_a", new Names2("func_130009_a", "a"));
        this.worst$.put("AbstractClientPlayer", new Names2("net/minecraft/client/entity/AbstractClientPlayer", "beu"));
        this.worst$.put("EntityPlayer.addMovementStat", new Names2("addMovementStat", "j"));
        this.worst$.put("EntityPlayer", new Names2("net/minecraft/entity/player/EntityPlayer", "uf"));
        this.worst$.put("EntityRenderer", new Names2("net/minecraft/client/renderer/EntityRenderer", "bfe"));
        this.worst$.put("EntityRenderer.renderWorld", new Names2("renderWorld", "a"));
        this.worst$.put("EntityRenderer.renderHand", new Names2("renderHand", "b"));
        this.worst$.put("RenderGlobal.renderEntities", new Names2("renderEntities", "a"));
        this.worst$.put("Vec3", new Names2("net/minecraft/util/Vec3", "atc"));
        this.worst$.put("ICamera", new Names2("net/minecraft/client/renderer/culling/ICamera", "bft"));
        this.worst$.put("Entity", new Names2("net/minecraft/entity/Entity", "nn"));
    }

    public Names2 a(String name) {
        return (Names2)this.worst$.get(name);
    }

    public String a(boolean isConfusion, String name) {
        Names2 c = (Names2)this.worst$.get(name);
        if (c == null) {
            return null;
        }
        return isConfusion ? c._layout() : c._agent();
    }
}

