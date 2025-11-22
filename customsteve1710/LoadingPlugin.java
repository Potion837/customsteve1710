/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.relauncher.IFMLLoadingPlugin
 *  cpw.mods.fml.relauncher.IFMLLoadingPlugin$Name
 *  cpw.mods.fml.relauncher.IFMLLoadingPlugin$TransformerExclusions
 */
import cpw.mods.fml.relauncher.IFMLLoadingPlugin;
import java.io.File;
import java.util.List;
import java.util.Map;

@IFMLLoadingPlugin.TransformerExclusions(value={"CustomSteve.ASM"})
@IFMLLoadingPlugin.Name(value="customsteve")
public class LoadingPlugin
implements IFMLLoadingPlugin {
    public static File protest$;
    public static boolean agencies$;

    public String[] getASMTransformerClass() {
        return new String[]{"customsteve.asm.ClassTransformer"};
    }

    public String getModContainerClass() {
        return "customsteve.ModContainer";
    }

    public String getSetupClass() {
        return null;
    }

    public void injectData(Map data) {
        protest$ = (File)data.get("coremodLocation");
        List list = (List)data.get("coremodList");
        for (Object o : list) {
            String string = o.toString();
            if (!string.toLowerCase().contains("shadersmod")) continue;
            agencies$ = true;
            break;
        }
    }

    public String getAccessTransformerClass() {
        return null;
    }

    static {
        agencies$ = false;
    }
}

