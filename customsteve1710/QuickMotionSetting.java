/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class QuickMotionSetting {
    public boolean screens$ = false;
    public boolean hometown$ = false;
    public boolean plugin$ = false;
    public boolean silly$ = false;
    public boolean nights$ = false;
    public boolean raised$ = false;
    public int locally$ = 0;

    public void _enormous(JsonObject json) {
        this.screens$ = json.get("LoopAnimation").getAsBoolean();
        this.hometown$ = json.get("UpperBody").getAsBoolean();
        this.plugin$ = json.get("Item").getAsBoolean();
        this.silly$ = json.get("FreeView").getAsBoolean();
        this.nights$ = json.get("BodyControl").getAsBoolean();
        this.raised$ = json.get("ANimationTrans").getAsBoolean();
        this.locally$ = json.get("FromFrame").getAsInt();
    }

    public void _fridge(JsonArray list) {
        JsonObject json = new JsonObject();
        json.addProperty("LoopAnimation", Boolean.valueOf(this.screens$));
        json.addProperty("UpperBody", Boolean.valueOf(this.hometown$));
        json.addProperty("Item", Boolean.valueOf(this.plugin$));
        json.addProperty("FreeView", Boolean.valueOf(this.silly$));
        json.addProperty("BodyControl", Boolean.valueOf(this.nights$));
        json.addProperty("ANimationTrans", Boolean.valueOf(this.raised$));
        json.addProperty("FromFrame", (Number)this.locally$);
        list.add((JsonElement)json);
    }
}

