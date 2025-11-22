/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
package customsteve;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class i {
    public boolean a;
    public boolean b = false;
    public boolean c = false;
    public boolean d = false;
    public boolean e = false;
    public boolean f = false;
    public int a = 0;

    public void a(JsonObject json) {
        this.a = json.get("LoopAnimation").getAsBoolean();
        this.b = json.get("UpperBody").getAsBoolean();
        this.c = json.get("Item").getAsBoolean();
        this.d = json.get("FreeView").getAsBoolean();
        this.e = json.get("BodyControl").getAsBoolean();
        this.f = json.get("ANimationTrans").getAsBoolean();
        this.a = json.get("FromFrame").getAsInt();
    }

    public void a(JsonArray list) {
        JsonObject json = new JsonObject();
        json.addProperty("LoopAnimation", Boolean.valueOf(this.a));
        json.addProperty("UpperBody", Boolean.valueOf(this.b));
        json.addProperty("Item", Boolean.valueOf(this.c));
        json.addProperty("FreeView", Boolean.valueOf(this.d));
        json.addProperty("BodyControl", Boolean.valueOf(this.e));
        json.addProperty("ANimationTrans", Boolean.valueOf(this.f));
        json.addProperty("FromFrame", (Number)this.a);
        list.add((JsonElement)json);
    }
}

