// 
// Decompiled by Procyon v0.5.36
// 

package com.auth0.android.jwt;

import com.google.gson.JsonParseException;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import com.google.gson.JsonDeserializationContext;
import java.lang.reflect.Type;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Date;
import com.google.gson.JsonObject;
import com.google.gson.JsonDeserializer;

class g implements JsonDeserializer<h>
{
    private Date b(final JsonObject jsonObject, final String s) {
        if (!jsonObject.has(s)) {
            return null;
        }
        return new Date(jsonObject.get(s).getAsLong() * 1000L);
    }
    
    private String c(final JsonObject jsonObject, final String s) {
        if (!jsonObject.has(s)) {
            return null;
        }
        return jsonObject.get(s).getAsString();
    }
    
    private List<String> d(final JsonObject jsonObject, final String s) {
        List<String> list = Collections.emptyList();
        if (jsonObject.has(s)) {
            final JsonElement value = jsonObject.get(s);
            if (value.isJsonArray()) {
                final JsonArray asJsonArray = value.getAsJsonArray();
                final ArrayList list2 = new ArrayList<String>(asJsonArray.size());
                int n = 0;
                while (true) {
                    list = (List<String>)list2;
                    if (n >= asJsonArray.size()) {
                        break;
                    }
                    list2.add(asJsonArray.get(n).getAsString());
                    ++n;
                }
            }
            else {
                list = Collections.singletonList(value.getAsString());
            }
        }
        return list;
    }
    
    public h a(final JsonElement jsonElement, final Type type, final JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        if (!jsonElement.isJsonNull() && jsonElement.isJsonObject()) {
            final JsonObject asJsonObject = jsonElement.getAsJsonObject();
            final String c = this.c(asJsonObject, "iss");
            final String c2 = this.c(asJsonObject, "sub");
            final Date b = this.b(asJsonObject, "exp");
            final Date b2 = this.b(asJsonObject, "nbf");
            final Date b3 = this.b(asJsonObject, "iat");
            final String c3 = this.c(asJsonObject, "jti");
            final List<String> d = this.d(asJsonObject, "aud");
            final HashMap<Object, d> hashMap = new HashMap<Object, d>();
            for (final Map.Entry<Object, V> entry : asJsonObject.entrySet()) {
                hashMap.put(entry.getKey(), new d((JsonElement)entry.getValue()));
            }
            return new h(c, c2, b, b2, b3, c3, d, (Map<String, c>)hashMap);
        }
        throw new e("The token's payload had an invalid JSON format.");
    }
}
