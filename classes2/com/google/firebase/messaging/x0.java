// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.messaging;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.concurrent.TimeUnit;
import android.content.SharedPreferences$Editor;
import java.io.IOException;
import android.util.Log;
import java.io.File;
import androidx.core.content.d;
import android.content.Context;
import android.content.SharedPreferences;

class x0
{
    final SharedPreferences a;
    final Context b;
    
    public x0(final Context b) {
        this.b = b;
        this.a = b.getSharedPreferences("com.google.android.gms.appid", 0);
        this.a("com.google.android.gms.appid-no-backup");
    }
    
    private void a(String str) {
        final File file = new File(d.m(this.b), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile() && !this.f()) {
                Log.i("FirebaseMessaging", "App restored, clearing state");
                this.c();
            }
        }
        catch (IOException ex) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                str = String.valueOf(ex.getMessage());
                if (str.length() != 0) {
                    str = "Error creating file in no backup dir: ".concat(str);
                }
                else {
                    str = new String("Error creating file in no backup dir: ");
                }
                Log.d("FirebaseMessaging", str);
            }
        }
    }
    
    private String b(final String s, final String s2) {
        final StringBuilder sb = new StringBuilder(String.valueOf(s).length() + 5 + String.valueOf(s2).length());
        sb.append(s);
        sb.append("|T|");
        sb.append(s2);
        sb.append("|*");
        return sb.toString();
    }
    
    public void c() {
        synchronized (this) {
            this.a.edit().clear().commit();
        }
    }
    
    public void d(final String s, String b) {
        synchronized (this) {
            b = this.b(s, b);
            final SharedPreferences$Editor edit = this.a.edit();
            edit.remove(b);
            edit.commit();
        }
    }
    
    public a e(final String s, final String s2) {
        synchronized (this) {
            return x0.a.c(this.a.getString(this.b(s, s2), (String)null));
        }
    }
    
    public boolean f() {
        synchronized (this) {
            return this.a.getAll().isEmpty();
        }
    }
    
    public void g(final String s, final String s2, String a, final String s3) {
        synchronized (this) {
            a = x0.a.a(a, s3, System.currentTimeMillis());
            if (a == null) {
                return;
            }
            final SharedPreferences$Editor edit = this.a.edit();
            edit.putString(this.b(s, s2), a);
            edit.commit();
        }
    }
    
    static class a
    {
        private static final long d;
        final String a;
        final String b;
        final long c;
        
        static {
            d = TimeUnit.DAYS.toMillis(7L);
        }
        
        private a(final String a, final String b, final long c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        static String a(String string, String value, final long n) {
            try {
                final JSONObject jsonObject = new JSONObject();
                jsonObject.put("token", (Object)string);
                jsonObject.put("appVersion", (Object)value);
                jsonObject.put("timestamp", n);
                string = jsonObject.toString();
                return string;
            }
            catch (JSONException obj) {
                value = String.valueOf(obj);
                final StringBuilder sb = new StringBuilder(value.length() + 24);
                sb.append("Failed to encode token: ");
                sb.append(value);
                Log.w("FirebaseMessaging", sb.toString());
                return null;
            }
        }
        
        static a c(final String s) {
            if (TextUtils.isEmpty((CharSequence)s)) {
                return null;
            }
            if (s.startsWith("{")) {
                try {
                    final JSONObject jsonObject = new JSONObject(s);
                    return new a(jsonObject.getString("token"), jsonObject.getString("appVersion"), jsonObject.getLong("timestamp"));
                }
                catch (JSONException obj) {
                    final String value = String.valueOf(obj);
                    final StringBuilder sb = new StringBuilder(value.length() + 23);
                    sb.append("Failed to parse token: ");
                    sb.append(value);
                    Log.w("FirebaseMessaging", sb.toString());
                    return null;
                }
            }
            return new a(s, null, 0L);
        }
        
        boolean b(final String s) {
            return System.currentTimeMillis() > this.c + x0.a.d || !s.equals(this.b);
        }
    }
}
