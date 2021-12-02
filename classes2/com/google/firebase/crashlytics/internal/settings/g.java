// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.crashlytics.internal.settings;

import org.json.JSONException;
import b3.f;
import org.json.JSONObject;
import com.google.firebase.crashlytics.internal.common.r;

public class g
{
    private final r a;
    
    g(final r a) {
        this.a = a;
    }
    
    private static h a(final int n) {
        if (n != 3) {
            return new b();
        }
        return new i();
    }
    
    public f b(final JSONObject jsonObject) throws JSONException {
        return a(jsonObject.getInt("settings_version")).a(this.a, jsonObject);
    }
}
