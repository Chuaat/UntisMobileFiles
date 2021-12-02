// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.crashlytics.internal.settings;

import b3.f;
import b3.e;
import com.google.firebase.crashlytics.internal.common.r;
import b3.d;
import b3.c;
import org.json.JSONException;
import org.json.JSONObject;

class b implements h
{
    private static b3.b c(final JSONObject jsonObject) throws JSONException {
        return new b3.b(jsonObject.getString("status"), jsonObject.getString("url"), jsonObject.getString("reports_url"), jsonObject.getString("ndk_reports_url"), jsonObject.optBoolean("update_required", false));
    }
    
    private static c d(final JSONObject jsonObject) {
        return new c(jsonObject.optBoolean("collect_reports", true), jsonObject.optBoolean("collect_anrs", false));
    }
    
    private static d e(final JSONObject jsonObject) {
        return new d(jsonObject.optInt("max_custom_exception_events", 8), 4);
    }
    
    static e f(final r r) {
        final JSONObject jsonObject = new JSONObject();
        return new f(g(r, 3600L, jsonObject), null, e(jsonObject), d(jsonObject), 0, 3600);
    }
    
    private static long g(final r r, long optLong, final JSONObject jsonObject) {
        if (jsonObject.has("expires_at")) {
            optLong = jsonObject.optLong("expires_at");
        }
        else {
            optLong = r.a() + optLong * 1000L;
        }
        return optLong;
    }
    
    private JSONObject h(final b3.b b) throws JSONException {
        return new JSONObject().put("status", (Object)b.a).put("url", (Object)b.b).put("reports_url", (Object)b.c).put("ndk_reports_url", (Object)b.d).put("update_required", b.g);
    }
    
    private JSONObject i(final c c) throws JSONException {
        return new JSONObject().put("collect_reports", c.a);
    }
    
    private JSONObject j(final d d) throws JSONException {
        return new JSONObject().put("max_custom_exception_events", d.a).put("max_complete_sessions_count", d.b);
    }
    
    @Override
    public f a(final r r, final JSONObject jsonObject) throws JSONException {
        final int optInt = jsonObject.optInt("settings_version", 0);
        final int optInt2 = jsonObject.optInt("cache_duration", 3600);
        return new f(g(r, optInt2, jsonObject), c(jsonObject.getJSONObject("app")), e(jsonObject.getJSONObject("session")), d(jsonObject.getJSONObject("features")), optInt, optInt2);
    }
    
    @Override
    public JSONObject b(final f f) throws JSONException {
        return new JSONObject().put("expires_at", f.d).put("cache_duration", f.f).put("settings_version", f.e).put("features", (Object)this.i(f.c)).put("app", (Object)this.h(f.a)).put("session", (Object)this.j(f.b));
    }
}
