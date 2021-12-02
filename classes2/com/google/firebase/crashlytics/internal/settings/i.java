// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.crashlytics.internal.settings;

import b3.f;
import com.google.firebase.crashlytics.internal.common.r;
import b3.d;
import b3.c;
import org.json.JSONException;
import java.util.Locale;
import b3.b;
import org.json.JSONObject;

class i implements h
{
    private static final String a = "https://update.crashlytics.com/spi/v1/platforms/android/apps";
    private static final String b = "https://update.crashlytics.com/spi/v1/platforms/android/apps/%s";
    private static final String c = "https://reports.crashlytics.com/spi/v1/platforms/android/apps/%s/reports";
    private static final String d = "https://reports.crashlytics.com/sdk-api/v1/platforms/android/apps/%s/minidumps";
    
    private static b c(final JSONObject jsonObject, final JSONObject jsonObject2) throws JSONException {
        final String string = jsonObject2.getString("status");
        final boolean equals = "new".equals(string);
        final String string2 = jsonObject.getString("bundle_id");
        final String string3 = jsonObject.getString("org_id");
        String format;
        if (equals) {
            format = "https://update.crashlytics.com/spi/v1/platforms/android/apps";
        }
        else {
            format = String.format(Locale.US, "https://update.crashlytics.com/spi/v1/platforms/android/apps/%s", string2);
        }
        final Locale us = Locale.US;
        return new b(string, format, String.format(us, "https://reports.crashlytics.com/spi/v1/platforms/android/apps/%s/reports", string2), String.format(us, "https://reports.crashlytics.com/sdk-api/v1/platforms/android/apps/%s/minidumps", string2), string2, string3, jsonObject2.optBoolean("update_required", false), jsonObject2.optInt("report_upload_variant", 0), jsonObject2.optInt("native_report_upload_variant", 0));
    }
    
    private static c d(final JSONObject jsonObject) {
        return new c(jsonObject.optBoolean("collect_reports", true), jsonObject.optBoolean("collect_anrs", false));
    }
    
    private static d e() {
        return new d(8, 4);
    }
    
    private static long f(final r r, long optLong, final JSONObject jsonObject) {
        if (jsonObject.has("expires_at")) {
            optLong = jsonObject.optLong("expires_at");
        }
        else {
            optLong = r.a() + optLong * 1000L;
        }
        return optLong;
    }
    
    private JSONObject g(final b b) throws JSONException {
        return new JSONObject().put("status", (Object)b.a).put("update_required", b.g).put("report_upload_variant", b.h).put("native_report_upload_variant", b.i);
    }
    
    private JSONObject h(final b b) throws JSONException {
        return new JSONObject().put("bundle_id", (Object)b.e).put("org_id", (Object)b.f);
    }
    
    private JSONObject i(final c c) throws JSONException {
        return new JSONObject().put("collect_reports", c.a);
    }
    
    @Override
    public f a(final r r, final JSONObject jsonObject) throws JSONException {
        final int optInt = jsonObject.optInt("settings_version", 0);
        final int optInt2 = jsonObject.optInt("cache_duration", 3600);
        return new f(f(r, optInt2, jsonObject), c(jsonObject.getJSONObject("fabric"), jsonObject.getJSONObject("app")), e(), d(jsonObject.getJSONObject("features")), optInt, optInt2);
    }
    
    @Override
    public JSONObject b(final f f) throws JSONException {
        return new JSONObject().put("expires_at", f.d).put("cache_duration", f.f).put("settings_version", f.e).put("features", (Object)this.i(f.c)).put("app", (Object)this.g(f.a)).put("fabric", (Object)this.h(f.a));
    }
}
