/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.common.eventhandler.SubscribeEvent
 *  net.minecraft.client.renderer.OpenGlHelper
 *  net.minecraft.util.ResourceLocation
 *  net.minecraftforge.client.event.RenderWorldEvent$Post
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL15
 *  org.lwjgl.opengl.GL20
 */
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderWorldEvent;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;

public class ShaderProgram {
    public static boolean bahrain$ = false;
    public static ShaderProgram wonder$;
    private int makes$;
    private Shader5 coach$;
    private Shader5 trailers$;
    private Shader5 range$;
    private Shader5 physical$;
    public static int xanax$;
    public static int moments$;
    public static int majority$;
    public static int copying$;
    public static int rounds$;
    public static int titten$;
    public static boolean stack$;
    public static String japanese$;
    private Field basket$;
    private Field episodes$;
    private Field enemy$;
    private Field eating$;
    private Field opposite$;
    public boolean enabling$ = false;
    public boolean racial$ = false;
    public boolean conclude$ = false;
    public boolean belts$ = false;
    public boolean angle$ = false;

    public ShaderProgram() {
        try {
            Class<?> shaders = Class.forName("shadersmod.client.Shaders");
            this.basket$ = shaders.getField("isShadowPass");
            this.basket$.setAccessible(true);
            this.enemy$ = shaders.getField("isRenderingSky");
            this.enemy$.setAccessible(true);
            this.eating$ = shaders.getField("isCompositeRendered");
            this.eating$.setAccessible(true);
            this.episodes$ = shaders.getField("isRenderingDfb");
            this.episodes$.setAccessible(true);
            this.opposite$ = shaders.getField("activeProgram");
            this.opposite$.setAccessible(true);
            System.out.println("CS:Uses shadersmod");
            stack$ = true;
        }
        catch (ClassNotFoundException classNotFoundException) {
            classNotFoundException.printStackTrace();
            this.basket$ = null;
            this.opposite$ = null;
            stack$ = false;
        }
        catch (Exception e2) {
            e2.printStackTrace();
            this.basket$ = null;
            this.opposite$ = null;
            stack$ = false;
        }
        xanax$ = GL11.glGetInteger((int)3379);
        moments$ = GL11.glGetInteger((int)34930);
        if (titten$ > moments$) {
            majority$ = moments$ - 4;
            copying$ = moments$ - 3;
            rounds$ = moments$ - 2;
            titten$ = moments$ - 1;
        }
        this._instance();
    }

    public static void _toddler(String shaderName) {
        Config._lightbox("ShadersMod Reload: " + shaderName);
        japanese$ = shaderName;
        if (wonder$ != null) {
            wonder$._constant();
        }
    }

    protected void _constant() {
        this._instance();
    }

    @SubscribeEvent
    public void _exposure(RenderWorldEvent.Post event) {
    }

    public void _friend(int uboId) {
        GL15.glBindBuffer((int)35345, (int)uboId);
        this.coach$._detect(uboId);
    }

    /*
     * Unable to fully structure code
     */
    public void _hundred(double lightX, double lightY, double lightZ) {
        block6: {
            block5: {
                block4: {
                    this.makes$ = GL11.glGetInteger((int)35725);
                    try {
                        this.enabling$ = ShaderProgram.stack$ != false ? (Boolean)this.basket$.get(null) : false;
                        this.racial$ = ShaderProgram.stack$ != false ? (Boolean)this.episodes$.get(null) : false;
                        this.conclude$ = ShaderProgram.stack$ != false ? (Boolean)this.enemy$.get(null) : false;
                        v0 = this.belts$ = ShaderProgram.stack$ != false ? (Boolean)this.eating$.get(null) : false;
                        this.angle$ = ShaderProgram.stack$ ? (Integer)this.opposite$.get(null) > 0 : true;
                    }
                    catch (Exception e) {
                        e.printStackTrace();
                    }
                    if (!this.enabling$) break block4;
                    if (ShaderProgram.japanese$ != null) break block5;
                }
                if (this.angle$) ** GOTO lbl-1000
                if (ShaderProgram.japanese$ == null) lbl-1000:
                // 2 sources

                {
                    this.coach$ = this.trailers$;
                } else {
                    this.coach$ = this.range$;
                }
                break block6;
            }
            this.coach$ = this.physical$;
        }
        GL20.glUseProgram((int)this.coach$._tattoo());
        this.coach$._advisor(lightX, lightY, lightZ);
    }

    public Shader5 _rapid() {
        return this.coach$;
    }

    public Shader5 _settings() {
        return this.range$;
    }

    public int _analyzes() {
        GL20.glUseProgram((int)this.makes$);
        return this.makes$;
    }

    private void _instance() {
        if (this.trailers$ != null) {
            this.trailers$._floral();
        }
        if (this.range$ != null) {
            this.range$._floral();
        }
        if (this.physical$ != null) {
            this.physical$._floral();
        }
        this.physical$ = null;
        this.range$ = null;
        this.trailers$ = null;
        CSRender2 render = CSRender2._outline();
        this.trailers$ = render._acrylic();
        if (stack$) {
            if (japanese$ != null) {
                if (render._flying()) {
                    this.range$ = render._beneath();
                }
                if (render._scenes()) {
                    this.physical$ = render._ascii();
                }
            }
        }
        OpenGlHelper.func_77473_a((int)(OpenGlHelper.field_77478_a + rounds$));
        OpenGlHelper.func_77473_a((int)OpenGlHelper.field_77478_a);
    }

    private void _length(StringBuilder source, String path) {
        try {
            String line;
            BufferedReader reader = new BufferedReader(new FileReader(path));
            while ((line = reader.readLine()) != null) {
                source.append(line + "\n");
            }
            reader.close();
        }
        catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void _disputes(int toonid) {
        OpenGlHelper.func_77473_a((int)(OpenGlHelper.field_77478_a + rounds$));
        if (toonid < 0) {
            toonid = 0;
        }
        if (toonid < CSmanager.checks$.length) {
            this._watch(CSmanager.checks$[toonid]);
            GL11.glTexParameteri((int)3553, (int)10241, (int)9728);
            GL11.glTexParameteri((int)3553, (int)10240, (int)9728);
            GL11.glTexParameteri((int)3553, (int)10242, (int)10496);
            GL11.glTexParameteri((int)3553, (int)10243, (int)10496);
        }
        OpenGlHelper.func_77473_a((int)OpenGlHelper.field_77478_a);
    }

    public void _watch(ResourceLocation par1ResourceLocation) {
        CSmanager csm = CSmanager.cellular$;
        SimpleTexture texture = (SimpleTexture)csm.beings$.get(par1ResourceLocation);
        if (texture == null) {
            return;
        }
        try {
            GL11.glBindTexture((int)3553, (int)texture._bradford());
        }
        catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    static {
        xanax$ = -1;
        moments$ = -1;
        majority$ = 16;
        copying$ = 17;
        rounds$ = 18;
        titten$ = 19;
        japanese$ = "(none)";
    }
}

