// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils;

import com.untis.mobile.persistence.models.masterdata.Klasse;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.persistence.models.profile.Profile;
import android.graphics.Color;
import br.com.goncalves.pugnotification.notification.c;
import android.graphics.BitmapFactory;
import androidx.core.app.r$g;
import android.app.NotificationChannel;
import androidx.annotation.k0;
import android.content.Intent;
import android.app.PendingIntent;
import android.app.NotificationManager;
import br.com.goncalves.pugnotification.notification.e;
import android.os.Build$VERSION;
import androidx.annotation.j0;
import android.content.Context;

public class c0
{
    private static c0 b;
    public Context a;
    
    private c0(@j0 final Context a) {
        this.a = a;
    }
    
    public static void a(@j0 final Context context, final int n) {
        if (Build$VERSION.SDK_INT < 26) {
            e.e(context).a(n);
        }
        else {
            final NotificationManager notificationManager = (NotificationManager)context.getSystemService("notification");
            if (notificationManager != null) {
                notificationManager.cancel(n);
            }
        }
    }
    
    @k0
    private static PendingIntent b(@j0 final Context context, @j0 final p0 p2) {
        if (p2.e() == null) {
            return null;
        }
        final Intent intent = new Intent(context, (Class)p2.e());
        if (p2.d() != null) {
            intent.putExtras(p2.d());
        }
        return PendingIntent.getActivity(context, 0, intent, 268435456);
    }
    
    public static void c(@j0 final Context context) {
        if (Build$VERSION.SDK_INT >= 26) {
            final NotificationManager notificationManager = (NotificationManager)context.getSystemService("notification");
            if (notificationManager != null) {
                final NotificationChannel notificationChannel = new NotificationChannel("untismobile_important", (CharSequence)context.getString(2131886140), 2);
                notificationChannel.setDescription(context.getString(2131886569));
                notificationManager.createNotificationChannel(notificationChannel);
            }
        }
    }
    
    public static c0 e(@j0 final Context context) {
        synchronized (c0.class) {
            final c0 b = c0.b;
            if (b == null) {
                c0.b = new c0(context.getApplicationContext());
            }
            else {
                b.a = context.getApplicationContext();
            }
            return c0.b;
        }
    }
    
    public static void f(@j0 final Context context, @j0 final p0 p2) {
        if (Build$VERSION.SDK_INT < 26) {
            h(context, p2);
        }
        else {
            g(context, p2);
        }
    }
    
    private static void g(@j0 final Context context, @j0 final p0 p2) {
        final NotificationManager notificationManager = (NotificationManager)context.getSystemService("notification");
        if (notificationManager == null) {
            return;
        }
        notificationManager.notify(p2.a(), new r$g(context, "untismobile_important").r0(p2.g()).a0(BitmapFactory.decodeResource(context.getResources(), p2.b())).O((CharSequence)p2.h()).N((CharSequence)p2.c()).M(b(context, p2)).G("untismobile_important").i0(1).h());
    }
    
    private static void h(@j0 final Context context, @j0 final p0 p2) {
        c c = e.e(context).c().O(p2.g()).B(p2.b()).U(p2.h()).G(p2.c()).X(p2.f()).z(p2.a());
        if (p2.e() != null) {
            c = c.n((Class)p2.e(), p2.d());
        }
        c.N().b();
    }
    
    @j0
    public static String i(@k0 final String s) {
        if (s == null) {
            return "";
        }
        return s.replaceAll("[\u00c4]", "Ae").replaceAll("[\u00e4]", "ae").replaceAll("[\u00dc]", "Ue").replaceAll("[\u00fc]", "ue").replaceAll("[\u00d6]", "Oe").replaceAll("[\u00f6]", "oe").replaceAll("[^a-zA-Z0-9_-]", "_");
    }
    
    public static boolean j(final int n) {
        boolean b = true;
        if (17170445 == n) {
            return true;
        }
        final int[] array = { Color.red(n), Color.green(n), Color.blue(n) };
        if ((int)Math.sqrt(array[0] * array[0] * 0.241 + array[1] * array[1] * 0.691 + array[2] * array[2] * 0.068) > 200) {
            b = false;
        }
        return b;
    }
    
    @Deprecated
    public String d(@k0 final Profile profile) {
        if (profile == null) {
            return "";
        }
        if (profile.hasAnyRole(EntityType.CLASS)) {
            final Klasse n = profile.getMasterDataService().N(profile.getEntityId());
            if (n != null) {
                return n.getDisplayName();
            }
        }
        if (profile.hasAnyRole(EntityType.TEACHER)) {
            return String.format("%s [%s]", profile.getUserDisplayName(), profile.getUserLogin());
        }
        if (profile.hasAnyRole(EntityType.STUDENT)) {
            return profile.getUserDisplayName();
        }
        if (profile.isAnonymousUser()) {
            return this.a.getResources().getString(2131886345);
        }
        return profile.getUserDisplayName();
    }
}
