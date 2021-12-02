// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.installations.local;

import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.security.KeyFactory;
import org.json.JSONException;
import org.json.JSONObject;
import java.security.NoSuchAlgorithmException;
import android.util.Log;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.PublicKey;
import com.google.firebase.e;
import androidx.annotation.b1;
import androidx.annotation.k0;
import androidx.annotation.j0;
import androidx.annotation.w;
import android.content.SharedPreferences;

public class b
{
    private static final String c = "com.google.android.gms.appid";
    private static final String d = "|S||P|";
    private static final String e = "|S|id";
    private static final String f = "|T|";
    private static final String g = "|";
    private static final String h = "token";
    private static final String i = "{";
    private static final String[] j;
    @w("iidPrefs")
    private final SharedPreferences a;
    private final String b;
    
    static {
        j = new String[] { "*", "FCM", "GCM", "" };
    }
    
    @b1
    public b(@j0 final SharedPreferences a, @k0 final String b) {
        this.a = a;
        this.b = b;
    }
    
    public b(@j0 final e e) {
        this.a = e.m().getSharedPreferences("com.google.android.gms.appid", 0);
        this.b = b(e);
    }
    
    private String a(@j0 final String str, @j0 final String str2) {
        final StringBuilder sb = new StringBuilder();
        sb.append("|T|");
        sb.append(str);
        sb.append("|");
        sb.append(str2);
        return sb.toString();
    }
    
    private static String b(final e e) {
        final String m = e.r().m();
        if (m != null) {
            return m;
        }
        final String j = e.r().j();
        if (!j.startsWith("1:") && !j.startsWith("2:")) {
            return j;
        }
        final String[] split = j.split(":");
        if (split.length != 4) {
            return null;
        }
        final String s = split[1];
        if (s.isEmpty()) {
            return null;
        }
        return s;
    }
    
    @k0
    private static String c(@j0 final PublicKey publicKey) {
        final byte[] encoded = publicKey.getEncoded();
        try {
            final byte[] digest = MessageDigest.getInstance("SHA1").digest(encoded);
            digest[0] = (byte)((digest[0] & 0xF) + 112 & 0xFF);
            return Base64.encodeToString(digest, 0, 8, 11);
        }
        catch (NoSuchAlgorithmException ex) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }
    
    private String d(String string) {
        try {
            string = new JSONObject(string).getString("token");
            return string;
        }
        catch (JSONException ex) {
            return null;
        }
    }
    
    @k0
    private PublicKey e(String ex) {
        try {
            ex = (NoSuchAlgorithmException)(Object)Base64.decode((String)ex, 8);
            ex = (NoSuchAlgorithmException)KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec((byte[])(Object)ex));
            return (PublicKey)ex;
        }
        catch (NoSuchAlgorithmException ex) {}
        catch (InvalidKeySpecException ex) {}
        catch (IllegalArgumentException ex2) {}
        final StringBuilder sb = new StringBuilder();
        sb.append("Invalid key stored ");
        sb.append(ex);
        Log.w("ContentValues", sb.toString());
        return null;
    }
    
    @k0
    private String g() {
        synchronized (this.a) {
            return this.a.getString("|S|id", (String)null);
        }
    }
    
    @k0
    private String h() {
        synchronized (this.a) {
            final String string = this.a.getString("|S||P|", (String)null);
            if (string == null) {
                return null;
            }
            final PublicKey e = this.e(string);
            if (e == null) {
                return null;
            }
            return c(e);
        }
    }
    
    @k0
    public String f() {
        synchronized (this.a) {
            final String g = this.g();
            if (g != null) {
                return g;
            }
            return this.h();
        }
    }
    
    @k0
    public String i() {
        synchronized (this.a) {
            final String[] j = com.google.firebase.installations.local.b.j;
            for (int length = j.length, i = 0; i < length; ++i) {
                final String string = this.a.getString(this.a(this.b, j[i]), (String)null);
                if (string != null && !string.isEmpty()) {
                    String d = string;
                    if (string.startsWith("{")) {
                        d = this.d(string);
                    }
                    return d;
                }
            }
            return null;
        }
    }
}
