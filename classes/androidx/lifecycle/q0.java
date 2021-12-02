// 
// Decompiled by Procyon v0.5.36
// 

package androidx.lifecycle;

import androidx.annotation.k0;
import androidx.annotation.p0;
import android.app.Application$ActivityLifecycleCallbacks;
import android.os.Bundle;
import android.app.FragmentManager;
import android.os.Build$VERSION;
import androidx.annotation.j0;
import android.app.Activity;
import androidx.annotation.t0;
import android.app.Fragment;

@t0({ t0.a.I })
public class q0 extends Fragment
{
    private static final String H = "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag";
    private a G;
    
    static void a(@j0 final Activity activity, @j0 final s.b b) {
        if (activity instanceof b0) {
            ((b0)activity).getLifecycle().j(b);
            return;
        }
        if (activity instanceof y) {
            final s lifecycle = ((y)activity).getLifecycle();
            if (lifecycle instanceof a0) {
                ((a0)lifecycle).j(b);
            }
        }
    }
    
    private void b(@j0 final s.b b) {
        if (Build$VERSION.SDK_INT < 29) {
            a(this.getActivity(), b);
        }
    }
    
    private void c(final a a) {
        if (a != null) {
            a.onCreate();
        }
    }
    
    private void d(final a a) {
        if (a != null) {
            a.g();
        }
    }
    
    private void e(final a a) {
        if (a != null) {
            a.f();
        }
    }
    
    static q0 f(final Activity activity) {
        return (q0)activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
    }
    
    public static void g(final Activity activity) {
        if (Build$VERSION.SDK_INT >= 29) {
            b.registerIn(activity);
        }
        final FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add((Fragment)new q0(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
    
    void h(final a g) {
        this.G = g;
    }
    
    public void onActivityCreated(final Bundle bundle) {
        super.onActivityCreated(bundle);
        this.c(this.G);
        this.b(s.b.ON_CREATE);
    }
    
    public void onDestroy() {
        super.onDestroy();
        this.b(s.b.ON_DESTROY);
        this.G = null;
    }
    
    public void onPause() {
        super.onPause();
        this.b(s.b.ON_PAUSE);
    }
    
    public void onResume() {
        super.onResume();
        this.d(this.G);
        this.b(s.b.ON_RESUME);
    }
    
    public void onStart() {
        super.onStart();
        this.e(this.G);
        this.b(s.b.ON_START);
    }
    
    public void onStop() {
        super.onStop();
        this.b(s.b.ON_STOP);
    }
    
    interface a
    {
        void f();
        
        void g();
        
        void onCreate();
    }
    
    @p0(29)
    static class b implements Application$ActivityLifecycleCallbacks
    {
        static void registerIn(final Activity activity) {
            activity.registerActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)new b());
        }
        
        public void onActivityCreated(@j0 final Activity activity, @k0 final Bundle bundle) {
        }
        
        public void onActivityDestroyed(@j0 final Activity activity) {
        }
        
        public void onActivityPaused(@j0 final Activity activity) {
        }
        
        public void onActivityPostCreated(@j0 final Activity activity, @k0 final Bundle bundle) {
            q0.a(activity, s.b.ON_CREATE);
        }
        
        public void onActivityPostResumed(@j0 final Activity activity) {
            q0.a(activity, s.b.ON_RESUME);
        }
        
        public void onActivityPostStarted(@j0 final Activity activity) {
            q0.a(activity, s.b.ON_START);
        }
        
        public void onActivityPreDestroyed(@j0 final Activity activity) {
            q0.a(activity, s.b.ON_DESTROY);
        }
        
        public void onActivityPrePaused(@j0 final Activity activity) {
            q0.a(activity, s.b.ON_PAUSE);
        }
        
        public void onActivityPreStopped(@j0 final Activity activity) {
            q0.a(activity, s.b.ON_STOP);
        }
        
        public void onActivityResumed(@j0 final Activity activity) {
        }
        
        public void onActivitySaveInstanceState(@j0 final Activity activity, @j0 final Bundle bundle) {
        }
        
        public void onActivityStarted(@j0 final Activity activity) {
        }
        
        public void onActivityStopped(@j0 final Activity activity) {
        }
    }
}
