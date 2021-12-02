// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.remoteconfig.internal;

import org.json.JSONObject;
import android.os.Bundle;
import androidx.annotation.j0;
import com.google.firebase.analytics.connector.a;

public class t
{
    public static final String b = "fp";
    public static final String c = "_fpc";
    public static final String d = "_fpid";
    public static final String e = "_fpct";
    static final String f = "personalizationId";
    private final a a;
    
    public t(@j0 final a a) {
        this.a = a;
    }
    
    public void a(@j0 final String s, @j0 final g g) {
        final JSONObject f = g.f();
        if (f.length() < 1) {
            return;
        }
        final JSONObject d = g.d();
        if (d.length() < 1) {
            return;
        }
        final JSONObject optJSONObject = f.optJSONObject(s);
        if (optJSONObject == null) {
            return;
        }
        final Bundle bundle = new Bundle();
        bundle.putString("_fpid", optJSONObject.optString("personalizationId"));
        bundle.putString("_fpct", d.optString(s));
        this.a.c("fp", "_fpc", bundle);
    }
}
