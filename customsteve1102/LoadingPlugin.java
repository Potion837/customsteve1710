/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraftforge.fml.relauncher.IFMLLoadingPlugin
 *  net.minecraftforge.fml.relauncher.IFMLLoadingPlugin$Name
 *  net.minecraftforge.fml.relauncher.IFMLLoadingPlugin$TransformerExclusions
 */
package customsteve;

import java.io.File;
import java.util.List;
import java.util.Map;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@IFMLLoadingPlugin.TransformerExclusions(value={"CustomSteve.ASM"})
@IFMLLoadingPlugin.Name(value="customsteve")
public class LoadingPlugin
implements IFMLLoadingPlugin {
    public static File a;
    public static boolean a;

    public String[] getASMTransformerClass() {
        return new String[]{"customsteve.asm.ClassTransformer"};
    }

    public String getModContainerClass() {
        return "customsteve.ModContainer";
    }

    public String getSetupClass() {
        return null;
    }

    public void injectData(Map<String, Object> data) {
        a = (File)data.get("coremodLocation");
        List list = (List)data.get("coremodList");
        for (Object o2 : list) {
            String string = o2.toString();
            if (!string.toLowerCase().contains("shadersmod")) continue;
            a = true;
            break;
        }
    }

    public String getAccessTransformerClass() {
        return null;
    }

    static {
        a = false;
    }
}

