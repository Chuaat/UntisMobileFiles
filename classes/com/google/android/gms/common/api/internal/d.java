// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import android.content.res.Configuration;
import androidx.annotation.k0;
import android.os.Bundle;
import android.app.Activity;
import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.ActivityManager$RunningAppProcessInfo;
import com.google.android.gms.common.util.v;
import android.content.ComponentCallbacks;
import android.app.Application;
import androidx.annotation.RecentlyNonNull;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import f2.a;
import android.content.ComponentCallbacks2;
import android.app.Application$ActivityLifecycleCallbacks;

@f2.a
public final class d implements Application$ActivityLifecycleCallbacks, ComponentCallbacks2
{
    private static final d K;
    private final AtomicBoolean G;
    private final AtomicBoolean H;
    @d6.a("sInstance")
    private final ArrayList<a> I;
    @d6.a("sInstance")
    private boolean J;
    
    static {
        K = new d();
    }
    
    @f2.a
    private d() {
        this.G = new AtomicBoolean();
        this.H = new AtomicBoolean();
        this.I = new ArrayList<a>();
        this.J = false;
    }
    
    @RecentlyNonNull
    @f2.a
    public static d b() {
        return d.K;
    }
    
    @f2.a
    public static void c(@RecentlyNonNull final Application application) {
        final d k = d.K;
        synchronized (k) {
            if (!k.J) {
                application.registerActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)k);
                application.registerComponentCallbacks((ComponentCallbacks)k);
                k.J = true;
            }
        }
    }
    
    private final void f(final boolean b) {
        synchronized (d.K) {
            final ArrayList<a> i = this.I;
            final int size = i.size();
            int j = 0;
            while (j < size) {
                final a value = i.get(j);
                ++j;
                value.a(b);
            }
        }
    }
    
    @f2.a
    public final void a(@RecentlyNonNull final a e) {
        synchronized (d.K) {
            this.I.add(e);
        }
    }
    
    @RecentlyNonNull
    @f2.a
    public final boolean d() {
        return this.G.get();
    }
    
    @TargetApi(16)
    @RecentlyNonNull
    @f2.a
    public final boolean e(@RecentlyNonNull final boolean b) {
        if (!this.H.get()) {
            if (!v.e()) {
                return b;
            }
            final ActivityManager$RunningAppProcessInfo activityManager$RunningAppProcessInfo = new ActivityManager$RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(activityManager$RunningAppProcessInfo);
            if (!this.H.getAndSet(true) && activityManager$RunningAppProcessInfo.importance > 100) {
                this.G.set(true);
            }
        }
        return this.d();
    }
    
    public final void onActivityCreated(@RecentlyNonNull final Activity activity, @k0 final Bundle bundle) {
        final boolean compareAndSet = this.G.compareAndSet(true, false);
        this.H.set(true);
        if (compareAndSet) {
            this.f(false);
        }
    }
    
    public final void onActivityDestroyed(@RecentlyNonNull final Activity activity) {
    }
    
    public final void onActivityPaused(@RecentlyNonNull final Activity activity) {
    }
    
    public final void onActivityResumed(@RecentlyNonNull final Activity activity) {
        final boolean compareAndSet = this.G.compareAndSet(true, false);
        this.H.set(true);
        if (compareAndSet) {
            this.f(false);
        }
    }
    
    public final void onActivitySaveInstanceState(@RecentlyNonNull final Activity activity, @RecentlyNonNull final Bundle bundle) {
    }
    
    public final void onActivityStarted(@RecentlyNonNull final Activity activity) {
    }
    
    public final void onActivityStopped(@RecentlyNonNull final Activity activity) {
    }
    
    public final void onConfigurationChanged(@RecentlyNonNull final Configuration configuration) {
    }
    
    public final void onLowMemory() {
    }
    
    public final void onTrimMemory(@RecentlyNonNull final int n) {
        if (n == 20 && this.G.compareAndSet(false, true)) {
            this.H.set(true);
            this.f(true);
        }
    }
    
    @f2.a
    public interface a
    {
        @f2.a
        void a(@RecentlyNonNull final boolean p0);
    }
}
