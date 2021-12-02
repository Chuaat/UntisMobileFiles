// 
// Decompiled by Procyon v0.5.36
// 

package androidx.lifecycle;

import android.app.Application$ActivityLifecycleCallbacks;
import androidx.annotation.k0;
import android.os.Build$VERSION;
import android.os.Bundle;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import androidx.annotation.j0;
import android.os.Handler;
import androidx.annotation.b1;

public class p0 implements y
{
    @b1
    static final long O = 700L;
    private static final p0 P;
    private int G;
    private int H;
    private boolean I;
    private boolean J;
    private Handler K;
    private final a0 L;
    private Runnable M;
    q0.a N;
    
    static {
        P = new p0();
    }
    
    private p0() {
        this.G = 0;
        this.H = 0;
        this.I = true;
        this.J = true;
        this.L = new a0(this);
        this.M = new Runnable() {
            @Override
            public void run() {
                p0.this.f();
                p0.this.g();
            }
        };
        this.N = new q0.a() {
            @Override
            public void f() {
                p0.this.c();
            }
            
            @Override
            public void g() {
                p0.this.b();
            }
            
            @Override
            public void onCreate() {
            }
        };
    }
    
    @j0
    public static y h() {
        return p0.P;
    }
    
    static void i(final Context context) {
        p0.P.e(context);
    }
    
    void a() {
        final int h = this.H - 1;
        this.H = h;
        if (h == 0) {
            this.K.postDelayed(this.M, 700L);
        }
    }
    
    void b() {
        final int h = this.H + 1;
        this.H = h;
        if (h == 1) {
            if (this.I) {
                this.L.j(s.b.ON_RESUME);
                this.I = false;
            }
            else {
                this.K.removeCallbacks(this.M);
            }
        }
    }
    
    void c() {
        final int g = this.G + 1;
        this.G = g;
        if (g == 1 && this.J) {
            this.L.j(s.b.ON_START);
            this.J = false;
        }
    }
    
    void d() {
        --this.G;
        this.g();
    }
    
    void e(final Context context) {
        this.K = new Handler();
        this.L.j(s.b.ON_CREATE);
        ((Application)context.getApplicationContext()).registerActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)new m() {
            @Override
            public void onActivityCreated(final Activity activity, final Bundle bundle) {
                if (Build$VERSION.SDK_INT < 29) {
                    q0.f(activity).h(p0.this.N);
                }
            }
            
            @Override
            public void onActivityPaused(final Activity activity) {
                p0.this.a();
            }
            
            public void onActivityPreCreated(@j0 final Activity activity, @k0 final Bundle bundle) {
                activity.registerActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)new m() {
                    public void onActivityPostResumed(@j0 final Activity activity) {
                        p0.this.b();
                    }
                    
                    public void onActivityPostStarted(@j0 final Activity activity) {
                        p0.this.c();
                    }
                });
            }
            
            @Override
            public void onActivityStopped(final Activity activity) {
                p0.this.d();
            }
        });
    }
    
    void f() {
        if (this.H == 0) {
            this.I = true;
            this.L.j(s.b.ON_PAUSE);
        }
    }
    
    void g() {
        if (this.G == 0 && this.I) {
            this.L.j(s.b.ON_STOP);
            this.J = true;
        }
    }
    
    @j0
    @Override
    public s getLifecycle() {
        return this.L;
    }
}
