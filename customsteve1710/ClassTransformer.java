/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.launchwrapper.IClassTransformer
 */
import java.util.HashMap;
import java.util.Map;

public class ClassTransformer
implements net.minecraft.launchwrapper.IClassTransformer {
    private Map elder$ = new HashMap();
    private static Names branches$ = new Names1710();

    public ClassTransformer() {
        this.elder$.put("net.minecraft.client.renderer.entity.RenderPlayer", new RenderPlayer());
        this.elder$.put("net.minecraft.client.audio.SoundManager", new SoundManager());
        this.elder$.put("net.minecraft.client.renderer.EntityRenderer", new EntityRenderer());
        if (Config.causes$) {
            this.elder$.put("net.minecraft.world.World", new World());
        }
        this.elder$.put("shadersmod.client.Shaders", new Shaders());
        this.elder$.put("shadersmod.client.ShadersRender", new ShadersRender());
    }

    public byte[] transform(String cname, String name, byte[] bytes) {
        for (Map.Entry e2 : this.elder$.entrySet()) {
            if (!((String)e2.getKey()).equals(name)) continue;
            return ((IClassTransformer)e2.getValue())._assets(!cname.equals(name), cname, branches$, bytes);
        }
        return bytes;
    }
}

