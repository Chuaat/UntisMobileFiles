// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.crashlytics.internal.analytics;

import com.google.firebase.crashlytics.internal.f;
import org.json.JSONException;
import java.util.Iterator;
import org.json.JSONObject;
import android.os.Bundle;
import androidx.annotation.j0;
import androidx.annotation.k0;
import z2.a;

public class d implements b, z2.b
{
    private static final String b = "name";
    private static final String c = "parameters";
    private static final String d = "$A$:";
    @k0
    private a a;
    
    @j0
    private static String b(@j0 final String s, @j0 final Bundle bundle) throws JSONException {
        final JSONObject jsonObject = new JSONObject();
        final JSONObject jsonObject2 = new JSONObject();
        for (final String s2 : bundle.keySet()) {
            jsonObject2.put(s2, bundle.get(s2));
        }
        jsonObject.put("name", (Object)s);
        jsonObject.put("parameters", (Object)jsonObject2);
        return jsonObject.toString();
    }
    
    @Override
    public void S(@j0 final String s, @j0 final Bundle bundle) {
        final a a = this.a;
        if (a != null) {
            try {
                final StringBuilder sb = new StringBuilder();
                sb.append("$A$:");
                sb.append(b(s, bundle));
                a.a(sb.toString());
            }
            catch (JSONException ex) {
                f.f().m("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }
    
    @Override
    public void a(@k0 final a a) {
        this.a = a;
        f.f().b("Registered Firebase Analytics event receiver for breadcrumbs");
    }
}
