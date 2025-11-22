/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.launchwrapper.IClassTransformer
 */
package customsteve.asm;

import customsteve.asm.b;
import customsteve.asm.c;
import customsteve.asm.d;
import customsteve.asm.e;
import customsteve.asm.f;
import customsteve.asm.l;
import customsteve.asm.m;
import customsteve.asm.n;
import customsteve.asm.o;
import customsteve.asm.p;
import customsteve.b_0;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.launchwrapper.IClassTransformer;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ClassTransformer
implements IClassTransformer {
    private Map<String, d> a = new HashMap<String, d>();
    private static e a = new f();

    public ClassTransformer() {
        this.a.put("net.minecraft.client.renderer.entity.RenderPlayer", new l());
        this.a.put("net.minecraft.client.audio.SoundManager", new o());
        this.a.put("net.minecraft.client.entity.EntityPlayerSP", new b());
        this.a.put("net.minecraft.client.renderer.EntityRenderer", new c());
        if (b_0.w) {
            this.a.put("net.minecraft.world.World", new p());
        }
        this.a.put("shadersmod.client.Shaders", new m());
        this.a.put("shadersmod.client.ShadersRender", new n());
    }

    public byte[] transform(String cname, String name, byte[] bytes) {
        for (Map.Entry<String, d> e2 : this.a.entrySet()) {
            if (!e2.getKey().equals(name)) continue;
            return e2.getValue().a(!cname.equals(name), cname, a, bytes);
        }
        return bytes;
    }
}

