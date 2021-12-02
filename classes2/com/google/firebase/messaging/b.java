// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.messaging;

import android.content.res.Resources$Theme;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.media.RingtoneManager;
import androidx.annotation.b1;
import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.res.Resources$NotFoundException;
import androidx.core.content.d;
import android.graphics.Color;
import android.os.Build$VERSION;
import android.util.Log;
import android.net.Uri;
import androidx.core.app.r$p;
import androidx.core.app.r$e;
import android.text.TextUtils;
import androidx.core.app.r$g;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.content.ComponentName;
import androidx.annotation.k0;
import android.content.Intent;
import android.app.PendingIntent;
import android.content.pm.PackageManager;
import android.content.Context;
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;
import androidx.annotation.j0;

public final class b
{
    @j0
    public static final String a = "com.google.firebase.messaging.default_notification_color";
    @j0
    public static final String b = "com.google.firebase.messaging.default_notification_icon";
    @j0
    public static final String c = "com.google.firebase.messaging.default_notification_channel_id";
    @j0
    public static final String d = "fcm_fallback_notification_channel";
    @j0
    public static final String e = "fcm_fallback_notification_channel_label";
    private static final AtomicInteger f;
    
    static {
        f = new AtomicInteger((int)SystemClock.elapsedRealtime());
    }
    
    private b() {
    }
    
    @k0
    private static PendingIntent a(final Context context, final n0 n0, final String s, final PackageManager packageManager) {
        final Intent f = f(s, n0, packageManager);
        if (f == null) {
            return null;
        }
        f.addFlags(67108864);
        f.putExtras(n0.A());
        if (q(n0)) {
            f.putExtra("gcm.n.analytics_data", n0.z());
        }
        return PendingIntent.getActivity(context, g(), f, l(1073741824));
    }
    
    @k0
    private static PendingIntent b(final Context context, final n0 n0) {
        if (!q(n0)) {
            return null;
        }
        return c(context, new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(n0.z()));
    }
    
    private static PendingIntent c(final Context context, final Intent intent) {
        return PendingIntent.getBroadcast(context, g(), new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(context, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra("wrapped_intent", (Parcelable)intent), l(1073741824));
    }
    
    static a d(final Context context, final n0 n0) {
        final Bundle j = j(context.getPackageManager(), context.getPackageName());
        return e(context, context.getPackageName(), n0, k(context, n0.k(), j), context.getResources(), context.getPackageManager(), j);
    }
    
    @j0
    public static a e(@j0 final Context context, @j0 final String s, @j0 final n0 n0, @j0 final String s2, @j0 final Resources resources, @j0 final PackageManager packageManager, @j0 final Bundle bundle) {
        final r$g r$g = new r$g(context, s2);
        final String n2 = n0.n(resources, s, "gcm.n.title");
        if (!TextUtils.isEmpty((CharSequence)n2)) {
            r$g.O((CharSequence)n2);
        }
        final String n3 = n0.n(resources, s, "gcm.n.body");
        if (!TextUtils.isEmpty((CharSequence)n3)) {
            r$g.N((CharSequence)n3);
            r$g.x0((r$p)new r$e().A((CharSequence)n3));
        }
        r$g.r0(m(packageManager, resources, s, n0.p("gcm.n.icon"), bundle));
        final Uri n4 = n(s, n0, resources);
        if (n4 != null) {
            r$g.v0(n4);
        }
        r$g.M(a(context, n0, s, packageManager));
        final PendingIntent b = b(context, n0);
        if (b != null) {
            r$g.T(b);
        }
        final Integer h = h(context, n0.p("gcm.n.color"), bundle);
        if (h != null) {
            r$g.I((int)h);
        }
        r$g.C(n0.a("gcm.n.sticky") ^ true);
        r$g.c0(n0.a("gcm.n.local_only"));
        final String p7 = n0.p("gcm.n.ticker");
        if (p7 != null) {
            r$g.z0((CharSequence)p7);
        }
        final Integer m = n0.m();
        if (m != null) {
            r$g.i0((int)m);
        }
        final Integer r = n0.r();
        if (r != null) {
            r$g.E0((int)r);
        }
        final Integer l = n0.l();
        if (l != null) {
            r$g.f0((int)l);
        }
        final Long j = n0.j("gcm.n.event_time");
        if (j != null) {
            r$g.p0(true);
            r$g.F0((long)j);
        }
        final long[] q = n0.q();
        if (q != null) {
            r$g.D0(q);
        }
        final int[] e = n0.e();
        if (e != null) {
            r$g.b0(e[0], e[1], e[2]);
        }
        r$g.S(i(n0));
        return new a(r$g, o(n0), 0);
    }
    
    private static Intent f(final String s, final n0 n0, final PackageManager packageManager) {
        final String p3 = n0.p("gcm.n.click_action");
        if (!TextUtils.isEmpty((CharSequence)p3)) {
            final Intent intent = new Intent(p3);
            intent.setPackage(s);
            intent.setFlags(268435456);
            return intent;
        }
        final Uri f = n0.f();
        if (f != null) {
            final Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setPackage(s);
            intent2.setData(f);
            return intent2;
        }
        final Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(s);
        if (launchIntentForPackage == null) {
            Log.w("FirebaseMessaging", "No activity found to launch app");
        }
        return launchIntentForPackage;
    }
    
    private static int g() {
        return com.google.firebase.messaging.b.f.incrementAndGet();
    }
    
    private static Integer h(final Context context, final String s, final Bundle bundle) {
        if (Build$VERSION.SDK_INT < 21) {
            return null;
        }
        if (!TextUtils.isEmpty((CharSequence)s)) {
            try {
                return Color.parseColor(s);
            }
            catch (IllegalArgumentException ex) {
                final StringBuilder sb = new StringBuilder(String.valueOf(s).length() + 56);
                sb.append("Color is invalid: ");
                sb.append(s);
                sb.append(". Notification will use default color.");
                Log.w("FirebaseMessaging", sb.toString());
            }
        }
        final int int1 = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (int1 != 0) {
            try {
                return androidx.core.content.d.f(context, int1);
            }
            catch (Resources$NotFoundException ex2) {
                Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
            }
        }
        return null;
    }
    
    private static int i(final n0 n0) {
        int a;
        final boolean b = (a = (n0.a("gcm.n.default_sound") ? 1 : 0)) != 0;
        if (n0.a("gcm.n.default_vibrate_timings")) {
            a = ((b ? 1 : 0) | 0x2);
        }
        if (n0.a("gcm.n.default_light_settings")) {
            return a | 0x4;
        }
        return a;
    }
    
    private static Bundle j(final PackageManager packageManager, String value) {
        try {
            final ApplicationInfo applicationInfo = packageManager.getApplicationInfo(value, 128);
            if (applicationInfo != null) {
                final Bundle metaData = applicationInfo.metaData;
                if (metaData != null) {
                    return metaData;
                }
            }
        }
        catch (PackageManager$NameNotFoundException obj) {
            value = String.valueOf(obj);
            final StringBuilder sb = new StringBuilder(value.length() + 35);
            sb.append("Couldn't get own application info: ");
            sb.append(value);
            Log.w("FirebaseMessaging", sb.toString());
        }
        return Bundle.EMPTY;
    }
    
    @TargetApi(26)
    @b1
    @j0
    public static String k(@j0 final Context context, @j0 String string, @j0 final Bundle bundle) {
        if (Build$VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion >= 26) {
                final NotificationManager notificationManager = (NotificationManager)context.getSystemService((Class)NotificationManager.class);
                if (!TextUtils.isEmpty((CharSequence)string)) {
                    if (notificationManager.getNotificationChannel(string) != null) {
                        return string;
                    }
                    final StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 122);
                    sb.append("Notification Channel requested (");
                    sb.append(string);
                    sb.append(") has not been created by the app. Manifest configuration, or default, value will be used.");
                    Log.w("FirebaseMessaging", sb.toString());
                }
                string = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
                if (!TextUtils.isEmpty((CharSequence)string)) {
                    if (notificationManager.getNotificationChannel(string) != null) {
                        return string;
                    }
                    string = "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.";
                }
                else {
                    string = "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.";
                }
                Log.w("FirebaseMessaging", string);
                if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                    final int identifier = context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName());
                    String string2;
                    if (identifier == 0) {
                        Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                        string2 = "Misc";
                    }
                    else {
                        string2 = context.getString(identifier);
                    }
                    notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", (CharSequence)string2, 3));
                }
                return "fcm_fallback_notification_channel";
            }
            return null;
        }
        catch (PackageManager$NameNotFoundException ex) {
            return null;
        }
    }
    
    private static int l(final int n) {
        if (Build$VERSION.SDK_INT >= 23) {
            return 1140850688;
        }
        return 1073741824;
    }
    
    private static int m(final PackageManager packageManager, final Resources resources, String value, final String s, final Bundle bundle) {
        if (!TextUtils.isEmpty((CharSequence)s)) {
            final int identifier = resources.getIdentifier(s, "drawable", value);
            if (identifier != 0 && p(resources, identifier)) {
                return identifier;
            }
            final int identifier2 = resources.getIdentifier(s, "mipmap", value);
            if (identifier2 != 0 && p(resources, identifier2)) {
                return identifier2;
            }
            final StringBuilder sb = new StringBuilder(String.valueOf(s).length() + 61);
            sb.append("Icon resource ");
            sb.append(s);
            sb.append(" not found. Notification will use default icon.");
            Log.w("FirebaseMessaging", sb.toString());
        }
        final int int1 = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        int icon = 0;
        Label_0217: {
            if (int1 != 0) {
                icon = int1;
                if (p(resources, int1)) {
                    break Label_0217;
                }
            }
            try {
                icon = packageManager.getApplicationInfo(value, 0).icon;
            }
            catch (PackageManager$NameNotFoundException obj) {
                value = String.valueOf(obj);
                final StringBuilder sb2 = new StringBuilder(value.length() + 35);
                sb2.append("Couldn't get own application info: ");
                sb2.append(value);
                Log.w("FirebaseMessaging", sb2.toString());
                icon = int1;
            }
        }
        int n;
        if (icon != 0) {
            n = icon;
            if (!p(resources, icon)) {
                return 17301651;
            }
        }
        else {
            n = 17301651;
        }
        return n;
    }
    
    private static Uri n(final String s, final n0 n0, final Resources resources) {
        final String o = n0.o();
        if (TextUtils.isEmpty((CharSequence)o)) {
            return null;
        }
        if (!"default".equals(o) && resources.getIdentifier(o, "raw", s) != 0) {
            final StringBuilder sb = new StringBuilder(String.valueOf(s).length() + 24 + String.valueOf(o).length());
            sb.append("android.resource://");
            sb.append(s);
            sb.append("/raw/");
            sb.append(o);
            return Uri.parse(sb.toString());
        }
        return RingtoneManager.getDefaultUri(2);
    }
    
    private static String o(final n0 n0) {
        final String p = n0.p("gcm.n.tag");
        if (!TextUtils.isEmpty((CharSequence)p)) {
            return p;
        }
        final long uptimeMillis = SystemClock.uptimeMillis();
        final StringBuilder sb = new StringBuilder(37);
        sb.append("FCM-Notification:");
        sb.append(uptimeMillis);
        return sb.toString();
    }
    
    @TargetApi(26)
    private static boolean p(final Resources resources, final int n) {
        if (Build$VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (resources.getDrawable(n, (Resources$Theme)null) instanceof AdaptiveIconDrawable) {
                final StringBuilder sb = new StringBuilder(77);
                sb.append("Adaptive icons cannot be used in notifications. Ignoring icon id: ");
                sb.append(n);
                Log.e("FirebaseMessaging", sb.toString());
                return false;
            }
            return true;
        }
        catch (Resources$NotFoundException ex) {
            final StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Couldn't find resource ");
            sb2.append(n);
            sb2.append(", treating it as an invalid icon");
            Log.e("FirebaseMessaging", sb2.toString());
            return false;
        }
    }
    
    static boolean q(@j0 final n0 n0) {
        return n0.a("google.c.a.e");
    }
    
    public static class a
    {
        @j0
        public final r$g a;
        @j0
        public final String b;
        public final int c;
        
        a(final r$g a, final String b, final int n) {
            this.a = a;
            this.b = b;
            this.c = 0;
        }
    }
}
