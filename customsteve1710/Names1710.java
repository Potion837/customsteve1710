/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;

public class Names1710
implements Names {
    Map hours$ = new HashMap();

    public Names1710() {
        this.hours$.put("RenderPlayer.doRender", new Names2("doRender", "a"));
        this.hours$.put("AbstractClientPlayer", new Names2("net/minecraft/client/entity/AbstractClientPlayer", "blg"));
        this.hours$.put("EntityPlayer.addMovementStat", new Names2("addMovementStat", "k"));
        this.hours$.put("EntityPlayer.onUpdate", new Names2("onUpdate", ""));
        this.hours$.put("SoundManager", new Names2("net/minecraft/client/audio/SoundManager", "btj"));
        this.hours$.put("SoundManager.sndSystem", new Names2("sndSystem", "e"));
        this.hours$.put("SoundManager.stopAllSounds", new Names2("stopAllSounds", "c"));
        this.hours$.put("SoundManager.SoundSystemStarterThread", new Names2("net/minecraft/client/audio/SoundManager$SoundSystemStarterThread", "btn"));
        this.hours$.put("EntityPlayer", new Names2("net/minecraft/entity/player/EntityPlayer", "xl"));
        this.hours$.put("EntityRenderer", new Names2("net/minecraft/client/renderer/EntityRenderer", "bll"));
        this.hours$.put("EntityRenderer.renderWorld", new Names2("renderWorld", "a"));
        this.hours$.put("EntityRenderer.orientCamera", new Names2("orientCamera", "h"));
        this.hours$.put("EntityRenderer.renderHand", new Names2("renderHand", "b"));
        this.hours$.put("EntityRenderer.setupCameraTransform", new Names2("setupCameraTransform", "a"));
        this.hours$.put("RenderGlobal.renderEntities", new Names2("renderEntities", "a"));
        this.hours$.put("EntityLivingBase", new Names2("net/minecraft/entity/EntityLivingBase", "rh"));
        this.hours$.put("ICamera", new Names2("net/minecraft/client/renderer/culling/ICamera", "bmn"));
        this.hours$.put("Entity", new Names2("net/minecraft/entity/Entity", "qn"));
        this.hours$.put("Block", new Names2("net/minecraft/block/Block", "aji"));
        this.hours$.put("IBlockAccess", new Names2("net/minecraft/world/IBlockAccess", "ahl"));
        this.hours$.put("Block.computeLightValue", new Names2("computeLightValue", "a"));
    }

    public Names2 a(String name) {
        return (Names2)this.hours$.get(name);
    }

    public String a(boolean isConfusion, String name) {
        Names2 c = (Names2)this.hours$.get(name);
        if (c == null) {
            return null;
        }
        return isConfusion ? c._layout() : c._agent();
    }
}

