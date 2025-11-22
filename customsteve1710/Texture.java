/*
 * Decompiled with CFR 0.152.
 */
public class Texture {
    String benefit$;
    String russian$;
    public float[] designs$;
    public float[] harrison$;
    public float suitable$;
    public float[] state$;
    int amanda$;
    float[] teaching$;
    float herein$;
    public int deaths$;
    public int dryer$;
    public int mistress$;
    public int roberts$;
    public boolean eternal$;
    public String plaza$;
    public int beverly$;

    public Texture(String name, String nameE, float[] diffuse, float[] specular, float specularNum, float[] ambient, int drawingModeFlag, float[] edgeColor, float edgeSize, int textureIndex, int sphereIndex, int sphereMode, boolean defToon, int toonIndex, String memo, int fromFaceNumber) {
        this.eternal$ = defToon;
        this.benefit$ = name;
        this.russian$ = nameE;
        this.designs$ = diffuse;
        this.harrison$ = specular;
        this.suitable$ = specularNum;
        this.state$ = ambient;
        this.amanda$ = drawingModeFlag;
        this.teaching$ = edgeColor;
        this.herein$ = edgeSize;
        this.deaths$ = textureIndex;
        this.dryer$ = sphereIndex;
        this.mistress$ = sphereMode;
        this.roberts$ = toonIndex;
        this.plaza$ = memo;
        this.beverly$ = fromFaceNumber;
    }
}

