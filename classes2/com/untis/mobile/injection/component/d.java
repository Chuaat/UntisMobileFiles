// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.injection.component;

import android.os.Vibrator;
import android.app.NotificationChannel;
import android.os.Build$VERSION;
import com.untis.mobile.utils.extension.h;
import android.app.NotificationManager;
import android.net.ConnectivityManager;
import android.media.AudioManager;
import java.util.Objects;
import kotlin.jvm.internal.k0;
import android.app.AlarmManager;
import android.content.Context;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0011" }, d2 = { "Lcom/untis/mobile/injection/component/d;", "", "Landroid/content/Context;", "context", "Landroid/media/AudioManager;", "b", "Landroid/app/NotificationManager;", "e", "d", "Landroid/os/Vibrator;", "f", "Landroid/app/AlarmManager;", "a", "Landroid/net/ConnectivityManager;", "c", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class d
{
    @e
    public static final d a;
    
    static {
        a = new d();
    }
    
    private d() {
    }
    
    @e
    public final AlarmManager a(@e final Context context) {
        k0.p(context, "context");
        final Object systemService = context.getSystemService("alarm");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        return (AlarmManager)systemService;
    }
    
    @e
    public final AudioManager b(@e final Context context) {
        k0.p(context, "context");
        final Object systemService = context.getSystemService("audio");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        return (AudioManager)systemService;
    }
    
    @e
    public final ConnectivityManager c(@e final Context context) {
        k0.p(context, "context");
        final Object systemService = context.getSystemService("connectivity");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        return (ConnectivityManager)systemService;
    }
    
    @e
    public final NotificationManager d(@e final Context context) {
        k0.p(context, "context");
        final Object systemService = context.getSystemService("notification");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        final NotificationManager notificationManager = (NotificationManager)systemService;
        final String v = h.V(2131886429, context);
        if (Build$VERSION.SDK_INT >= 26) {
            final NotificationChannel notificationChannel = new NotificationChannel("untismobile_messages", (CharSequence)v, 4);
            notificationChannel.setDescription("Notification channel for untis mobile messages");
            notificationChannel.setLockscreenVisibility(1);
            notificationChannel.enableLights(true);
            notificationChannel.setLightColor(-1);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        return notificationManager;
    }
    
    @e
    public final NotificationManager e(@e final Context context) {
        k0.p(context, "context");
        final Object systemService = context.getSystemService("notification");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        final NotificationManager notificationManager = (NotificationManager)systemService;
        final String v = h.V(2131886140, context);
        final String v2 = h.V(2131886569, context);
        if (Build$VERSION.SDK_INT >= 26) {
            final NotificationChannel notificationChannel = new NotificationChannel("untismobile_important", (CharSequence)v, 2);
            notificationChannel.setDescription(v2);
            notificationChannel.setLockscreenVisibility(1);
            notificationChannel.enableLights(true);
            notificationChannel.setLightColor(-1);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        return notificationManager;
    }
    
    @e
    public final Vibrator f(@e final Context context) {
        k0.p(context, "context");
        final Object systemService = context.getSystemService("vibrator");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.os.Vibrator");
        return (Vibrator)systemService;
    }
}
