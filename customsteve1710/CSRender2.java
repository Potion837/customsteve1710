/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL15
 */
import java.nio.FloatBuffer;
import java.util.ArrayList;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL15;

public abstract class CSRender2 {
    public static final int gossip$ = 700;
    private static final int holders$;
    private static CSRender2 helpful$;
    private static final FloatBuffer bonus$;

    public abstract Shader5 _acrylic();

    public boolean _flying() {
        return false;
    }

    public Shader5 _beneath() {
        throw new UnsupportedOperationException();
    }

    public boolean _scenes() {
        return false;
    }

    public Shader5 _ascii() {
        throw new UnsupportedOperationException();
    }

    public abstract CSRender _merger(RenderObject var1);

    public abstract void _higher(CSRender var1);

    public abstract void _rwanda(String var1, CSRender var2, ArrayList var3, long var4, boolean var6, boolean var7, float var8, boolean var9);

    protected void _overcome(ArrayList Bones, CSRender handle) {
        bonus$.clear();
        float[] tmpArray = new float[12];
        for (Matrix4f bone : Bones) {
            Matrix4f offset = bone;
            if (offset == null) continue;
            tmpArray[0] = offset.oriented$;
            tmpArray[1] = offset.quality$;
            tmpArray[2] = offset.sugar$;
            tmpArray[3] = offset.beaches$;
            tmpArray[4] = offset.wages$;
            tmpArray[5] = offset.ivory$;
            tmpArray[6] = offset.truly$;
            tmpArray[7] = offset.registry$;
            tmpArray[8] = offset.lopez$;
            tmpArray[9] = offset.harold$;
            tmpArray[10] = offset.boston$;
            tmpArray[11] = offset.stated$;
            bonus$.put(tmpArray);
        }
        if (handle.really$ < 0) {
            handle.really$ = GL15.glGenBuffers();
            GL15.glBindBuffer((int)35345, (int)handle.really$);
            GL15.glBufferData((int)35345, (long)33600L, (int)35040);
        } else {
            GL15.glBindBuffer((int)35345, (int)handle.really$);
        }
        GL15.glBufferSubData((int)35345, (long)0L, (FloatBuffer)((FloatBuffer)bonus$.flip()));
    }

    public static synchronized CSRender2 _outline() {
        if (helpful$ == null) {
            if (!Config.maybe$) {
                if (holders$ >= 32) {
                    helpful$ = new CSRenderHW324();
                } else {
                    Config._murder("not support GLVERSION!");
                }
            } else {
                helpful$ = new CSRenderSW322();
            }
        }
        return helpful$;
    }

    static {
        bonus$ = BufferUtils.createFloatBuffer((int)8400);
        String version = GL11.glGetString((int)7938);
        int major = Integer.valueOf(Character.toString(version.charAt(0)));
        int minor = Integer.valueOf(Character.toString(version.charAt(2)));
        holders$ = major * 10 + minor;
    }
}

