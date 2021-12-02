// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.internal;

import com.google.android.gms.common.util.l;
import androidx.annotation.j0;
import android.content.pm.PackageManager$NameNotFoundException;
import com.google.android.gms.common.wrappers.c;
import com.google.android.gms.common.o;
import android.text.TextUtils;
import com.google.android.gms.common.k;
import androidx.core.os.d;
import android.content.res.Resources;
import android.util.Log;
import android.content.Context;
import androidx.annotation.k0;
import java.util.Locale;
import d6.a;
import androidx.collection.m;

public final class g0
{
    @a("sCache")
    private static final m<String, String> a;
    @k0
    @a("sCache")
    private static Locale b;
    
    static {
        a = new m<String, String>();
    }
    
    public static String a(final Context context) {
        return context.getResources().getString(e2.a.e.g);
    }
    
    @k0
    public static String b(final Context context, final int i) {
        final Resources resources = context.getResources();
        String string = null;
        switch (i) {
            default: {
                final StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(i);
                string = sb.toString();
                break;
            }
            case 20: {
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return c(context, "common_google_play_services_restricted_profile_title");
            }
            case 17: {
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return c(context, "common_google_play_services_sign_in_failed_title");
            }
            case 16: {
                string = "One of the API components you attempted to connect to is not available.";
                break;
            }
            case 11: {
                string = "The application is not licensed to the user.";
                break;
            }
            case 10: {
                string = "Developer error occurred. Please see logs for detailed information";
                break;
            }
            case 9: {
                string = "Google Play services is invalid. Cannot recover.";
                break;
            }
            case 8: {
                string = "Internal error occurred. Please see logs for detailed information";
                break;
            }
            case 7: {
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return c(context, "common_google_play_services_network_error_title");
            }
            case 5: {
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return c(context, "common_google_play_services_invalid_account_title");
            }
            case 4:
            case 6:
            case 18: {
                return null;
            }
            case 3: {
                return resources.getString(e2.a.e.c);
            }
            case 2: {
                return resources.getString(e2.a.e.l);
            }
            case 1: {
                return resources.getString(e2.a.e.f);
            }
        }
        Log.e("GoogleApiAvailability", string);
        return null;
    }
    
    @k0
    private static String c(final Context context, final String s) {
        final m<String, String> a = g0.a;
        synchronized (a) {
            final Locale d = androidx.core.os.d.a(context.getResources().getConfiguration()).d(0);
            if (!d.equals(g0.b)) {
                a.clear();
                g0.b = d;
            }
            final String s2 = a.get(s);
            if (s2 != null) {
                return s2;
            }
            final Resources j = k.j(context);
            if (j == null) {
                return null;
            }
            final int identifier = j.getIdentifier(s, "string", "com.google.android.gms");
            if (identifier == 0) {
                final String value = String.valueOf(s);
                String concat;
                if (value.length() != 0) {
                    concat = "Missing resource: ".concat(value);
                }
                else {
                    concat = new String("Missing resource: ");
                }
                Log.w("GoogleApiAvailability", concat);
                return null;
            }
            final String string = j.getString(identifier);
            if (TextUtils.isEmpty((CharSequence)string)) {
                final String value2 = String.valueOf(s);
                String concat2;
                if (value2.length() != 0) {
                    concat2 = "Got empty resource: ".concat(value2);
                }
                else {
                    concat2 = new String("Got empty resource: ");
                }
                Log.w("GoogleApiAvailability", concat2);
                return null;
            }
            a.put(s, string);
            return string;
        }
    }
    
    private static String d(final Context context, String s, final String s2) {
        final Resources resources = context.getResources();
        String format;
        s = (format = c(context, s));
        if (s == null) {
            format = resources.getString(o.b.a);
        }
        return String.format(resources.getConfiguration().locale, format, s2);
    }
    
    private static String e(final Context context) {
        final String packageName = context.getPackageName();
        try {
            return c.a(context).d(packageName).toString();
        }
        catch (PackageManager$NameNotFoundException | NullPointerException ex) {
            final String name = context.getApplicationInfo().name;
            if (TextUtils.isEmpty((CharSequence)name)) {
                return packageName;
            }
            return name;
        }
    }
    
    @j0
    public static String f(final Context context, final int n) {
        String s;
        if (n == 6) {
            s = c(context, "common_google_play_services_resolution_required_title");
        }
        else {
            s = b(context, n);
        }
        String string = s;
        if (s == null) {
            string = context.getResources().getString(e2.a.e.h);
        }
        return string;
    }
    
    @j0
    public static String g(final Context context, final int n) {
        final Resources resources = context.getResources();
        final String e = e(context);
        if (n == 1) {
            return resources.getString(e2.a.e.e, new Object[] { e });
        }
        if (n != 2) {
            if (n == 3) {
                return resources.getString(e2.a.e.b, new Object[] { e });
            }
            if (n == 5) {
                return d(context, "common_google_play_services_invalid_account_text", e);
            }
            if (n == 7) {
                return d(context, "common_google_play_services_network_error_text", e);
            }
            if (n == 9) {
                return resources.getString(e2.a.e.i, new Object[] { e });
            }
            if (n == 20) {
                return d(context, "common_google_play_services_restricted_profile_text", e);
            }
            switch (n) {
                default: {
                    return resources.getString(o.b.a, new Object[] { e });
                }
                case 18: {
                    return resources.getString(e2.a.e.m, new Object[] { e });
                }
                case 17: {
                    return d(context, "common_google_play_services_sign_in_failed_text", e);
                }
                case 16: {
                    return d(context, "common_google_play_services_api_unavailable_text", e);
                }
            }
        }
        else {
            if (l.l(context)) {
                return resources.getString(e2.a.e.n);
            }
            return resources.getString(e2.a.e.k, new Object[] { e });
        }
    }
    
    @j0
    public static String h(final Context context, final int n) {
        if (n != 6 && n != 19) {
            return g(context, n);
        }
        return d(context, "common_google_play_services_resolution_required_text", e(context));
    }
    
    @j0
    public static String i(final Context context, int n) {
        final Resources resources = context.getResources();
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    n = 17039370;
                }
                else {
                    n = e2.a.e.a;
                }
            }
            else {
                n = e2.a.e.j;
            }
        }
        else {
            n = e2.a.e.d;
        }
        return resources.getString(n);
    }
}
