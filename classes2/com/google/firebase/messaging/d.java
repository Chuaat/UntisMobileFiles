// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.messaging;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import androidx.core.app.r$p;
import androidx.core.app.r$d;
import com.google.android.gms.tasks.m;
import com.google.android.gms.tasks.p;
import java.util.concurrent.TimeUnit;
import android.graphics.Bitmap;
import androidx.core.app.r$g;
import androidx.annotation.k0;
import android.app.NotificationManager;
import android.util.Log;
import java.util.Iterator;
import java.util.List;
import android.app.ActivityManager$RunningAppProcessInfo;
import android.app.ActivityManager;
import android.os.Process;
import android.os.SystemClock;
import com.google.android.gms.common.util.v;
import android.app.KeyguardManager;
import android.content.Context;
import java.util.concurrent.Executor;

class d
{
    private final Executor a;
    private final Context b;
    private final n0 c;
    
    public d(final Context b, final n0 c, final Executor a) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    private boolean b() {
        if (((KeyguardManager)this.b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!v.j()) {
            SystemClock.sleep(10L);
        }
        final int myPid = Process.myPid();
        final List runningAppProcesses = ((ActivityManager)this.b.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (final ActivityManager$RunningAppProcessInfo activityManager$RunningAppProcessInfo : runningAppProcesses) {
                if (activityManager$RunningAppProcessInfo.pid == myPid) {
                    if (activityManager$RunningAppProcessInfo.importance == 100) {
                        return true;
                    }
                    break;
                }
            }
        }
        return false;
    }
    
    private void c(final b.a a) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager)this.b.getSystemService("notification")).notify(a.b, a.c, a.a.h());
    }
    
    @k0
    private j0 d() {
        final j0 c = j0.c(this.c.p("gcm.n.image"));
        if (c != null) {
            c.e(this.a);
        }
        return c;
    }
    
    private void e(final r$g r$g, @k0 final j0 j0) {
        if (j0 == null) {
            return;
        }
        try {
            final Bitmap bitmap = (Bitmap)p.b((m)j0.d(), 5L, TimeUnit.SECONDS);
            r$g.a0(bitmap);
            r$g.x0((r$p)new r$d().C(bitmap).B((Bitmap)null));
        }
        catch (TimeoutException ex2) {
            Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
            j0.close();
        }
        catch (InterruptedException ex3) {
            Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
            j0.close();
            Thread.currentThread().interrupt();
        }
        catch (ExecutionException ex) {
            final String value = String.valueOf(ex.getCause());
            final StringBuilder sb = new StringBuilder(value.length() + 26);
            sb.append("Failed to download image: ");
            sb.append(value);
            Log.w("FirebaseMessaging", sb.toString());
        }
    }
    
    boolean a() {
        if (this.c.a("gcm.n.noui")) {
            return true;
        }
        if (this.b()) {
            return false;
        }
        final j0 d = this.d();
        final b.a d2 = com.google.firebase.messaging.b.d(this.b, this.c);
        this.e(d2.a, d);
        this.c(d2);
        return true;
    }
}
