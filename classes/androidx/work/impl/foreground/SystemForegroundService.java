// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.foreground;

import android.content.Intent;
import android.os.Build$VERSION;
import androidx.annotation.j0;
import android.app.Notification;
import androidx.annotation.g0;
import android.os.Looper;
import androidx.work.q;
import android.app.NotificationManager;
import android.os.Handler;
import androidx.annotation.k0;
import androidx.annotation.t0;
import androidx.lifecycle.c0;

@t0({ t0.a.H })
public class SystemForegroundService extends c0 implements b
{
    private static final String L;
    @k0
    private static SystemForegroundService M;
    private Handler H;
    private boolean I;
    androidx.work.impl.foreground.b J;
    NotificationManager K;
    
    static {
        L = q.f("SystemFgService");
        SystemForegroundService.M = null;
    }
    
    @k0
    public static SystemForegroundService e() {
        return SystemForegroundService.M;
    }
    
    @g0
    private void f() {
        this.H = new Handler(Looper.getMainLooper());
        this.K = (NotificationManager)this.getApplicationContext().getSystemService("notification");
        (this.J = new androidx.work.impl.foreground.b(this.getApplicationContext())).o((b)this);
    }
    
    @Override
    public void b(final int n, final int n2, @j0 final Notification notification) {
        this.H.post((Runnable)new Runnable() {
            @Override
            public void run() {
                if (Build$VERSION.SDK_INT >= 29) {
                    SystemForegroundService.this.startForeground(n, notification, n2);
                }
                else {
                    SystemForegroundService.this.startForeground(n, notification);
                }
            }
        });
    }
    
    @Override
    public void c(final int n, @j0 final Notification notification) {
        this.H.post((Runnable)new Runnable() {
            @Override
            public void run() {
                SystemForegroundService.this.K.notify(n, notification);
            }
        });
    }
    
    @Override
    public void d(final int n) {
        this.H.post((Runnable)new Runnable() {
            @Override
            public void run() {
                SystemForegroundService.this.K.cancel(n);
            }
        });
    }
    
    @Override
    public void onCreate() {
        super.onCreate();
        (SystemForegroundService.M = this).f();
    }
    
    @Override
    public void onDestroy() {
        super.onDestroy();
        this.J.m();
    }
    
    @Override
    public int onStartCommand(@k0 final Intent intent, final int n, final int n2) {
        super.onStartCommand(intent, n, n2);
        if (this.I) {
            q.c().d(SystemForegroundService.L, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.J.m();
            this.f();
            this.I = false;
        }
        if (intent != null) {
            this.J.n(intent);
        }
        return 3;
    }
    
    @g0
    @Override
    public void stop() {
        this.I = true;
        q.c().a(SystemForegroundService.L, "All commands completed.", new Throwable[0]);
        if (Build$VERSION.SDK_INT >= 26) {
            this.stopForeground(true);
        }
        SystemForegroundService.M = null;
        this.stopSelf();
    }
}
