// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.remoteconfig.internal;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONArray;
import org.json.JSONObject;
import java.util.Date;

public class g
{
    static final String f = "configs_key";
    static final String g = "fetch_time_key";
    static final String h = "abt_experiments_key";
    static final String i = "personalization_metadata_key";
    private static final Date j;
    private JSONObject a;
    private JSONObject b;
    private Date c;
    private JSONArray d;
    private JSONObject e;
    
    static {
        j = new Date(0L);
    }
    
    private g(final JSONObject b, final Date c, final JSONArray d, final JSONObject e) throws JSONException {
        final JSONObject a = new JSONObject();
        a.put("configs_key", (Object)b);
        a.put("fetch_time_key", c.getTime());
        a.put("abt_experiments_key", (Object)d);
        a.put("personalization_metadata_key", (Object)e);
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.a = a;
    }
    
    static g b(final JSONObject jsonObject) throws JSONException {
        return new g(jsonObject.getJSONObject("configs_key"), new Date(jsonObject.getLong("fetch_time_key")), jsonObject.getJSONArray("abt_experiments_key"), jsonObject.getJSONObject("personalization_metadata_key"));
    }
    
    public static b g() {
        return new b();
    }
    
    public static b h(final g g) {
        return new b(g);
    }
    
    public JSONArray c() {
        return this.d;
    }
    
    public JSONObject d() {
        return this.b;
    }
    
    public Date e() {
        return this.c;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof g && this.a.toString().equals(((g)o).toString()));
    }
    
    public JSONObject f() {
        return this.e;
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public String toString() {
        return this.a.toString();
    }
    
    public static class b
    {
        private JSONObject a;
        private Date b;
        private JSONArray c;
        private JSONObject d;
        
        private b() {
            this.a = new JSONObject();
            this.b = com.google.firebase.remoteconfig.internal.g.j;
            this.c = new JSONArray();
            this.d = new JSONObject();
        }
        
        public b(final g g) {
            this.a = g.d();
            this.b = g.e();
            this.c = g.c();
            this.d = g.f();
        }
        
        public g a() throws JSONException {
            return new g(this.a, this.b, this.c, this.d, null);
        }
        
        public b b(final Map<String, String> map) {
            this.a = new JSONObject((Map)map);
            return this;
        }
        
        public b c(final JSONObject jsonObject) {
            try {
                this.a = new JSONObject(jsonObject.toString());
                return this;
            }
            catch (JSONException ex) {
                return this;
            }
        }
        
        public b d(final JSONArray jsonArray) {
            try {
                this.c = new JSONArray(jsonArray.toString());
                return this;
            }
            catch (JSONException ex) {
                return this;
            }
        }
        
        public b e(final Date b) {
            this.b = b;
            return this;
        }
        
        public b f(final JSONObject jsonObject) {
            try {
                this.d = new JSONObject(jsonObject.toString());
                return this;
            }
            catch (JSONException ex) {
                return this;
            }
        }
    }
}
