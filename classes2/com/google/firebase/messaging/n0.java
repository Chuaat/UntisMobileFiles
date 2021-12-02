// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.messaging;

import java.util.MissingFormatArgumentException;
import java.util.Arrays;
import android.content.res.Resources;
import android.net.Uri;
import androidx.annotation.k0;
import org.json.JSONException;
import org.json.JSONArray;
import android.util.Log;
import android.text.TextUtils;
import java.util.Iterator;
import android.graphics.Color;
import java.util.Objects;
import androidx.annotation.j0;
import android.os.Bundle;

public class n0
{
    @j0
    private final Bundle a;
    
    public n0(@j0 final Bundle obj) {
        Objects.requireNonNull(obj, "data");
        this.a = new Bundle(obj);
    }
    
    private static String B(final String s) {
        String substring = s;
        if (s.startsWith("gcm.n.")) {
            substring = s.substring(6);
        }
        return substring;
    }
    
    private static int d(final String s) {
        final int color = Color.parseColor(s);
        if (color != -16777216) {
            return color;
        }
        throw new IllegalArgumentException("Transparent color is invalid");
    }
    
    private static boolean t(final String s) {
        return s.startsWith("google.c.a.") || s.equals("from");
    }
    
    public static boolean v(@j0 final Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString(x("gcm.n.e")));
    }
    
    private static boolean w(final String s) {
        return s.startsWith("google.c.") || s.startsWith("gcm.n.") || s.startsWith("gcm.notification.");
    }
    
    private static String x(final String s) {
        if (!s.startsWith("gcm.n.")) {
            return s;
        }
        return s.replace("gcm.n.", "gcm.notification.");
    }
    
    private String y(final String s) {
        if (!this.a.containsKey(s) && s.startsWith("gcm.n.")) {
            final String x = x(s);
            if (this.a.containsKey(x)) {
                return x;
            }
        }
        return s;
    }
    
    @j0
    public Bundle A() {
        final Bundle bundle = new Bundle(this.a);
        for (final String s : this.a.keySet()) {
            if (w(s)) {
                bundle.remove(s);
            }
        }
        return bundle;
    }
    
    public boolean a(@j0 String p) {
        p = this.p(p);
        return "1".equals(p) || Boolean.parseBoolean(p);
    }
    
    @j0
    public Integer b(@j0 String b) {
        final String p = this.p(b);
        if (!TextUtils.isEmpty((CharSequence)p)) {
            try {
                return Integer.parseInt(p);
            }
            catch (NumberFormatException ex) {
                b = B(b);
                final StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 38 + String.valueOf(p).length());
                sb.append("Couldn't parse value of ");
                sb.append(b);
                sb.append("(");
                sb.append(p);
                sb.append(") into an int");
                Log.w("NotificationParams", sb.toString());
            }
        }
        return null;
    }
    
    @k0
    public JSONArray c(@j0 String b) {
        final String p = this.p(b);
        if (!TextUtils.isEmpty((CharSequence)p)) {
            try {
                return new JSONArray(p);
            }
            catch (JSONException ex) {
                b = B(b);
                final StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 50 + String.valueOf(p).length());
                sb.append("Malformed JSON for key ");
                sb.append(b);
                sb.append(": ");
                sb.append(p);
                sb.append(", falling back to default");
                Log.w("NotificationParams", sb.toString());
            }
        }
        return null;
    }
    
    @k0
    int[] e() {
        final JSONArray c = this.c("gcm.n.light_settings");
        if (c == null) {
            return null;
        }
        String s;
        try {
            if (c.length() == 3) {
                return new int[] { d(c.optString(0)), c.optInt(1), c.optInt(2) };
            }
            throw new JSONException("lightSettings don't have all three fields");
        }
        catch (IllegalArgumentException ex) {
            final String value = String.valueOf(c);
            final String message = ex.getMessage();
            final StringBuilder sb = new StringBuilder(value.length() + 60 + String.valueOf(message).length());
            sb.append("LightSettings is invalid: ");
            sb.append(value);
            sb.append(". ");
            sb.append(message);
            sb.append(". Skipping setting LightSettings");
            s = sb.toString();
        }
        catch (JSONException ex2) {
            final String value2 = String.valueOf(c);
            final StringBuilder sb2 = new StringBuilder(value2.length() + 58);
            sb2.append("LightSettings is invalid: ");
            sb2.append(value2);
            sb2.append(". Skipping setting LightSettings");
            s = sb2.toString();
        }
        Log.w("NotificationParams", s);
        return null;
    }
    
    @k0
    public Uri f() {
        String s;
        if (TextUtils.isEmpty((CharSequence)(s = this.p("gcm.n.link_android")))) {
            s = this.p("gcm.n.link");
        }
        if (!TextUtils.isEmpty((CharSequence)s)) {
            return Uri.parse(s);
        }
        return null;
    }
    
    @k0
    public Object[] g(@j0 final String obj) {
        final JSONArray c = this.c(String.valueOf(obj).concat("_loc_args"));
        if (c == null) {
            return null;
        }
        final int length = c.length();
        final String[] array = new String[length];
        for (int i = 0; i < length; ++i) {
            array[i] = c.optString(i);
        }
        return array;
    }
    
    @k0
    public String h(@j0 final String obj) {
        return this.p(String.valueOf(obj).concat("_loc_key"));
    }
    
    @k0
    public String i(@j0 final Resources resources, @j0 String str, @j0 String b) {
        final String h = this.h(b);
        if (TextUtils.isEmpty((CharSequence)h)) {
            return null;
        }
        final int identifier = resources.getIdentifier(h, "string", (String)str);
        if (identifier == 0) {
            str = B(String.valueOf(b).concat("_loc_key"));
            final StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 49 + String.valueOf(b).length());
            sb.append((String)str);
            sb.append(" resource not found: ");
            sb.append(b);
            sb.append(" Default value will be used.");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
        str = this.g(b);
        if (str == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, (Object[])str);
        }
        catch (MissingFormatArgumentException ex) {
            b = B(b);
            str = Arrays.toString((Object[])str);
            final StringBuilder sb2 = new StringBuilder(String.valueOf(b).length() + 58 + String.valueOf(str).length());
            sb2.append("Missing format argument for ");
            sb2.append(b);
            sb2.append(": ");
            sb2.append((String)str);
            sb2.append(" Default value will be used.");
            Log.w("NotificationParams", sb2.toString(), (Throwable)ex);
            return null;
        }
    }
    
    @j0
    public Long j(@j0 String b) {
        final String p = this.p(b);
        if (!TextUtils.isEmpty((CharSequence)p)) {
            try {
                return Long.parseLong(p);
            }
            catch (NumberFormatException ex) {
                b = B(b);
                final StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 38 + String.valueOf(p).length());
                sb.append("Couldn't parse value of ");
                sb.append(b);
                sb.append("(");
                sb.append(p);
                sb.append(") into a long");
                Log.w("NotificationParams", sb.toString());
            }
        }
        return null;
    }
    
    @j0
    public String k() {
        return this.p("gcm.n.android_channel_id");
    }
    
    @k0
    Integer l() {
        final Integer b = this.b("gcm.n.notification_count");
        if (b == null) {
            return null;
        }
        if (b < 0) {
            final String value = String.valueOf(b);
            final StringBuilder sb = new StringBuilder(value.length() + 67);
            sb.append("notificationCount is invalid: ");
            sb.append(value);
            sb.append(". Skipping setting notificationCount.");
            Log.w("FirebaseMessaging", sb.toString());
            return null;
        }
        return b;
    }
    
    @k0
    Integer m() {
        final Integer b = this.b("gcm.n.notification_priority");
        if (b == null) {
            return null;
        }
        if (b >= -2 && b <= 2) {
            return b;
        }
        final String value = String.valueOf(b);
        final StringBuilder sb = new StringBuilder(value.length() + 72);
        sb.append("notificationPriority is invalid ");
        sb.append(value);
        sb.append(". Skipping setting notificationPriority.");
        Log.w("FirebaseMessaging", sb.toString());
        return null;
    }
    
    @j0
    public String n(@j0 final Resources resources, @j0 final String s, @j0 final String s2) {
        final String p3 = this.p(s2);
        if (!TextUtils.isEmpty((CharSequence)p3)) {
            return p3;
        }
        return this.i(resources, s, s2);
    }
    
    @k0
    public String o() {
        String s;
        if (TextUtils.isEmpty((CharSequence)(s = this.p("gcm.n.sound2")))) {
            s = this.p("gcm.n.sound");
        }
        return s;
    }
    
    @j0
    public String p(@j0 final String s) {
        return this.a.getString(this.y(s));
    }
    
    @k0
    public long[] q() {
        final JSONArray c = this.c("gcm.n.vibrate_timings");
        if (c == null) {
            return null;
        }
        try {
            if (c.length() > 1) {
                final int length = c.length();
                final long[] array = new long[length];
                for (int i = 0; i < length; ++i) {
                    array[i] = c.optLong(i);
                }
                return array;
            }
            throw new JSONException("vibrateTimings have invalid length");
        }
        catch (JSONException | NumberFormatException ex) {
            final String value = String.valueOf(c);
            final StringBuilder sb = new StringBuilder(value.length() + 74);
            sb.append("User defined vibrateTimings is invalid: ");
            sb.append(value);
            sb.append(". Skipping setting vibrateTimings.");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
    }
    
    Integer r() {
        final Integer b = this.b("gcm.n.visibility");
        if (b == null) {
            return null;
        }
        if (b >= -1 && b <= 1) {
            return b;
        }
        final String value = String.valueOf(b);
        final StringBuilder sb = new StringBuilder(value.length() + 53);
        sb.append("visibility is invalid: ");
        sb.append(value);
        sb.append(". Skipping setting visibility.");
        Log.w("NotificationParams", sb.toString());
        return null;
    }
    
    public boolean s() {
        return !TextUtils.isEmpty((CharSequence)this.p("gcm.n.image"));
    }
    
    public boolean u() {
        return this.a("gcm.n.e");
    }
    
    @j0
    public Bundle z() {
        final Bundle bundle = new Bundle(this.a);
        for (final String s : this.a.keySet()) {
            if (!t(s)) {
                bundle.remove(s);
            }
        }
        return bundle;
    }
}
