/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;

public class Names172
implements Names {
    Map broadway$ = new HashMap();

    public Names172() {
        this.broadway$.put("RenderPlayer.doRender", new Names2("doRender", "a"));
        this.broadway$.put("AbstractClientPlayer", new Names2("net/minecraft/client/entity/AbstractClientPlayer", "bkz"));
        this.broadway$.put("EntityPlayer.addMovementStat", new Names2("addMovementStat", "k"));
        this.broadway$.put("EntityPlayer.onUpdate", new Names2("onUpdate", ""));
        this.broadway$.put("SoundManager", new Names2("net/minecraft/client/audio/SoundManager", "bsw"));
        this.broadway$.put("SoundManager.sndSystem", new Names2("sndSystem", "e"));
        this.broadway$.put("SoundManager.stopAllSounds", new Names2("stopAllSounds", "c"));
        this.broadway$.put("SoundManager.SoundSystemStarterThread", new Names2("net/minecraft/client/audio/SoundManager$SoundSystemStarterThread", "bta"));
        this.broadway$.put("EntityPlayer", new Names2("net/minecraft/entity/player/EntityPlayer", "xl"));
        this.broadway$.put("EntityRenderer", new Names2("net/minecraft/client/renderer/EntityRenderer", "bll"));
        this.broadway$.put("EntityRenderer.renderWorld", new Names2("renderWorld", "a"));
        this.broadway$.put("EntityRenderer.renderHand", new Names2("renderHand", "b"));
        this.broadway$.put("EntityRenderer.setupCameraTransform", new Names2("setupCameraTransform", ""));
        this.broadway$.put("RenderGlobal.renderEntities", new Names2("renderEntities", "a"));
        this.broadway$.put("EntityLivingBase", new Names2("net/minecraft/entity/EntityLivingBase", "rh"));
        this.broadway$.put("ICamera", new Names2("net/minecraft/client/renderer/culling/ICamera", "bmn"));
        this.broadway$.put("Entity", new Names2("net/minecraft/entity/Entity", "qn"));
    }

    public Names2 a(String name) {
        return (Names2)this.broadway$.get(name);
    }

    public String a(boolean isConfusion, String name) {
        Names2 c = (Names2)this.broadway$.get(name);
        if (c == null) {
            return null;
        }
        return isConfusion ? c._layout() : c._agent();
    }
}

