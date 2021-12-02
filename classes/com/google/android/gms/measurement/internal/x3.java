// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import java.util.Iterator;
import android.content.SharedPreferences$Editor;
import androidx.annotation.c1;
import org.json.JSONObject;
import org.json.JSONException;
import org.json.JSONArray;
import com.google.android.gms.common.internal.x;
import android.os.Bundle;

public final class x3
{
    private final String a;
    private final Bundle b;
    private Bundle c;
    final /* synthetic */ c4 d;
    
    public x3(final c4 d, final String s, final Bundle bundle) {
        this.d = d;
        x.g("default_event_parameters");
        this.a = "default_event_parameters";
        this.b = new Bundle();
    }
    
    @c1
    public final Bundle a() {
        if (this.c == null) {
            final String string = this.d.l().getString(this.a, (String)null);
            if (string != null) {
                try {
                    final Bundle c = new Bundle();
                    final JSONArray jsonArray = new JSONArray(string);
                    for (int i = 0; i < jsonArray.length(); ++i) {
                        try {
                            final JSONObject jsonObject = jsonArray.getJSONObject(i);
                            final String string2 = jsonObject.getString("n");
                            final String string3 = jsonObject.getString("t");
                            final int hashCode = string3.hashCode();
                            int n = 0;
                            Label_0172: {
                                if (hashCode != 100) {
                                    if (hashCode != 108) {
                                        if (hashCode == 115) {
                                            if (string3.equals("s")) {
                                                n = 0;
                                                break Label_0172;
                                            }
                                        }
                                    }
                                    else if (string3.equals("l")) {
                                        n = 2;
                                        break Label_0172;
                                    }
                                }
                                else if (string3.equals("d")) {
                                    n = 1;
                                    break Label_0172;
                                }
                                n = -1;
                            }
                            if (n != 0) {
                                if (n != 1) {
                                    if (n != 2) {
                                        this.d.a.c().o().b("Unrecognized persisted bundle type. Type", string3);
                                    }
                                    else {
                                        c.putLong(string2, Long.parseLong(jsonObject.getString("v")));
                                    }
                                }
                                else {
                                    c.putDouble(string2, Double.parseDouble(jsonObject.getString("v")));
                                }
                            }
                            else {
                                c.putString(string2, jsonObject.getString("v"));
                            }
                        }
                        catch (JSONException | NumberFormatException ex) {
                            this.d.a.c().o().a("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.c = c;
                }
                catch (JSONException ex2) {
                    this.d.a.c().o().a("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (this.c == null) {
                this.c = this.b;
            }
        }
        return this.c;
    }
    
    @c1
    public final void b(final Bundle bundle) {
        Bundle c = bundle;
        if (bundle == null) {
            c = new Bundle();
        }
        final SharedPreferences$Editor edit = this.d.l().edit();
        if (c.size() == 0) {
            edit.remove(this.a);
        }
        else {
            final String a = this.a;
            final JSONArray jsonArray = new JSONArray();
            for (final String s : c.keySet()) {
                final Object value = c.get(s);
                if (value != null) {
                    try {
                        final JSONObject jsonObject = new JSONObject();
                        jsonObject.put("n", (Object)s);
                        jsonObject.put("v", (Object)String.valueOf(value));
                        String s2;
                        if (value instanceof String) {
                            s2 = "s";
                        }
                        else if (value instanceof Long) {
                            s2 = "l";
                        }
                        else {
                            if (!(value instanceof Double)) {
                                this.d.a.c().o().b("Cannot serialize bundle value to SharedPreferences. Type", value.getClass());
                                continue;
                            }
                            s2 = "d";
                        }
                        jsonObject.put("t", (Object)s2);
                        jsonArray.put((Object)jsonObject);
                    }
                    catch (JSONException ex) {
                        this.d.a.c().o().b("Cannot serialize bundle value to SharedPreferences", ex);
                    }
                }
            }
            edit.putString(a, jsonArray.toString());
        }
        edit.apply();
        this.c = c;
    }
}
