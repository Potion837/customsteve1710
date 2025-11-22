/*
 * Decompiled with CFR 0.152.
 */
package customsteve.asm;

import customsteve.asm.e;
import java.util.HashMap;
import java.util.Map;

public class i
implements e {
    Map<String, e.a> a = new HashMap<String, e.a>();

    public i() {
        this.a.put("RenderPlayer.doRender", new e.a("doRender", "a"));
        this.a.put("AbstractClientPlayer", new e.a("net/minecraft/client/entity/AbstractClientPlayer", "bkz"));
        this.a.put("EntityPlayer.addMovementStat", new e.a("addMovementStat", "k"));
        this.a.put("EntityPlayer.onUpdate", new e.a("onUpdate", ""));
        this.a.put("SoundManager", new e.a("net/minecraft/client/audio/SoundManager", "bsw"));
        this.a.put("SoundManager.sndSystem", new e.a("sndSystem", "e"));
        this.a.put("SoundManager.stopAllSounds", new e.a("stopAllSounds", "c"));
        this.a.put("SoundManager.SoundSystemStarterThread", new e.a("net/minecraft/client/audio/SoundManager$SoundSystemStarterThread", "bta"));
        this.a.put("EntityPlayer", new e.a("net/minecraft/entity/player/EntityPlayer", "xl"));
        this.a.put("EntityRenderer", new e.a("net/minecraft/client/renderer/EntityRenderer", "bll"));
        this.a.put("EntityRenderer.renderWorld", new e.a("renderWorld", "a"));
        this.a.put("EntityRenderer.renderHand", new e.a("renderHand", "b"));
        this.a.put("EntityRenderer.setupCameraTransform", new e.a("setupCameraTransform", ""));
        this.a.put("RenderGlobal.renderEntities", new e.a("renderEntities", "a"));
        this.a.put("EntityLivingBase", new e.a("net/minecraft/entity/EntityLivingBase", "rh"));
        this.a.put("ICamera", new e.a("net/minecraft/client/renderer/culling/ICamera", "bmn"));
        this.a.put("Entity", new e.a("net/minecraft/entity/Entity", "qn"));
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

