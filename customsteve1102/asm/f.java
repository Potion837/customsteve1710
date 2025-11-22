/*
 * Decompiled with CFR 0.152.
 */
package customsteve.asm;

import customsteve.asm.e;
import java.util.HashMap;
import java.util.Map;

public class f
implements e {
    Map<String, e.a> a = new HashMap<String, e.a>();

    public f() {
        this.a.put("RenderPlayer.doRender", new e.a("doRender", "a"));
        this.a.put("AbstractClientPlayer", new e.a("net/minecraft/client/entity/AbstractClientPlayer", "bnk"));
        this.a.put("EntityPlayer.addMovementStat", new e.a("addMovementStat", "l"));
        this.a.put("EntityPlayer.onUpdate", new e.a("onUpdate", "m"));
        this.a.put("EntityPlayerSP.isCurrentViewEntity", new e.a("isCurrentViewEntity", "L"));
        this.a.put("SoundManager", new e.a("net/minecraft/client/audio/SoundManager", "bzu"));
        this.a.put("SoundManager.sndSystem", new e.a("sndSystem", "f"));
        this.a.put("SoundManager.stopAllSounds", new e.a("stopAllSounds", "c"));
        this.a.put("SoundManager.SoundSystemStarterThread", new e.a("net/minecraft/client/audio/SoundManager$SoundSystemStarterThread", "bzu$a"));
        this.a.put("EntityPlayer", new e.a("net/minecraft/entity/player/EntityPlayer", "lu"));
        this.a.put("EntityRenderer", new e.a("net/minecraft/client/renderer/EntityRenderer", "bnz"));
        this.a.put("EntityRenderer.renderWorldPass", new e.a("renderWorldPass", "a"));
        this.a.put("EntityRenderer.getMouseOver", new e.a("getMouseOver", "a"));
        this.a.put("EntityRenderer.orientCamera", new e.a("orientCamera", "f"));
        this.a.put("EntityRenderer.renderHand", new e.a("renderHand", "b"));
        this.a.put("EntityRenderer.setupCameraTransform", new e.a("setupCameraTransform", "a"));
        this.a.put("EntityRenderer.setupFog", new e.a("setupFog", "a"));
        this.a.put("RenderGlobal.renderEntities", new e.a("renderEntities", "a"));
        this.a.put("EntityLivingBase", new e.a("net/minecraft/entity/EntityLivingBase", "sf"));
        this.a.put("ICamera", new e.a("net/minecraft/client/renderer/culling/ICamera", "brf"));
        this.a.put("Entity", new e.a("net/minecraft/entity/Entity", "rw"));
        this.a.put("Block", new e.a("net/minecraft/block/Block", "akf"));
        this.a.put("IBlockAccess", new e.a("net/minecraft/world/IBlockAccess", "aih"));
        this.a.put("World.getRawLight", new e.a("getRawLight", "a"));
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

