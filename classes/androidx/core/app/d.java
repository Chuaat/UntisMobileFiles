// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.app;

import android.os.Bundle;
import android.app.Application;
import android.app.Application$ActivityLifecycleCallbacks;
import androidx.annotation.j0;
import android.util.Log;
import android.os.Build$VERSION;
import android.content.res.Configuration;
import java.util.List;
import android.os.IBinder;
import android.app.Activity;
import android.os.Looper;
import android.os.Handler;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import androidx.annotation.t0;

@t0({ t0.a.G })
final class d
{
    private static final String a = "ActivityRecreator";
    protected static final Class<?> b;
    protected static final Field c;
    protected static final Field d;
    protected static final Method e;
    protected static final Method f;
    protected static final Method g;
    private static final Handler h;
    
    static {
        h = new Handler(Looper.getMainLooper());
        final Class<?> clazz = (Class<?>)(b = a());
        c = b();
        d = f();
        e = d(clazz);
        f = c(clazz);
        g = e(clazz);
    }
    
    private d() {
    }
    
    private static Class<?> a() {
        try {
            return Class.forName("android.app.ActivityThread");
        }
        finally {
            return null;
        }
    }
    
    private static Field b() {
        try {
            final Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        }
        finally {
            return null;
        }
    }
    
    private static Method c(final Class<?> clazz) {
        if (clazz == null) {
            return null;
        }
        try {
            final Method declaredMethod = clazz.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        }
        finally {
            return null;
        }
    }
    
    private static Method d(final Class<?> clazz) {
        if (clazz == null) {
            return null;
        }
        try {
            final Method declaredMethod = clazz.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        }
        finally {
            return null;
        }
    }
    
    private static Method e(final Class<?> clazz) {
        Label_0084: {
            if (!g()) {
                break Label_0084;
            }
            if (clazz == null) {
                break Label_0084;
            }
            try {
                final Class<Integer> type = Integer.TYPE;
                final Class<Boolean> type2 = Boolean.TYPE;
                final Method declaredMethod = clazz.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, type, type2, Configuration.class, Configuration.class, type2, type2);
                declaredMethod.setAccessible(true);
                return declaredMethod;
                return null;
            }
            finally {
                return null;
            }
        }
    }
    
    private static Field f() {
        try {
            final Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        }
        finally {
            return null;
        }
    }
    
    private static boolean g() {
        final int sdk_INT = Build$VERSION.SDK_INT;
        return sdk_INT == 26 || sdk_INT == 27;
    }
    
    protected static boolean h(Object o, final int n, final Activity activity) {
        try {
            final Object value = androidx.core.app.d.d.get(activity);
            if (value == o && activity.hashCode() == n) {
                final Object value2 = androidx.core.app.d.c.get(activity);
                final Handler h = androidx.core.app.d.h;
                o = new Runnable() {
                    @Override
                    public void run() {
                        try {
                            final Method e = androidx.core.app.d.e;
                            if (e != null) {
                                e.invoke(value2, value, Boolean.FALSE, "AppCompat recreation");
                            }
                            else {
                                androidx.core.app.d.f.invoke(value2, value, Boolean.FALSE);
                            }
                        }
                        catch (RuntimeException ex) {
                            if (ex.getClass() == RuntimeException.class && ex.getMessage() != null) {
                                if (ex.getMessage().startsWith("Unable to stop")) {
                                    throw ex;
                                }
                            }
                        }
                        finally {
                            final Throwable t;
                            Log.e("ActivityRecreator", "Exception while invoking performStopActivity", t);
                        }
                    }
                };
                h.postAtFrontOfQueue((Runnable)o);
                return true;
            }
            return false;
        }
        finally {
            final Throwable t;
            Log.e("ActivityRecreator", "Exception while fetching field values", t);
            return false;
        }
    }
    
    static boolean i(@j0 final Activity activity) {
        if (Build$VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (g() && androidx.core.app.d.g == null) {
            return false;
        }
        if (androidx.core.app.d.f == null && androidx.core.app.d.e == null) {
            return false;
        }
        try {
            final Object value = androidx.core.app.d.d.get(activity);
            if (value == null) {}
            final Object value2 = androidx.core.app.d.c.get(activity);
            if (value2 == null) {}
            final Application application = activity.getApplication();
            final d d = new d(activity);
            application.registerActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)d);
            final Handler h = androidx.core.app.d.h;
            h.post((Runnable)new Runnable() {
                @Override
                public void run() {
                    d.G = value;
                }
            });
            try {
                if (g()) {
                    final Method g = androidx.core.app.d.g;
                    final Boolean false = Boolean.FALSE;
                    g.invoke(value2, value, null, null, 0, false, null, null, false, false);
                }
                else {
                    activity.recreate();
                }
                h.post((Runnable)new Runnable() {
                    final /* synthetic */ Application G;
                    final /* synthetic */ d H;
                    
                    @Override
                    public void run() {
                        this.G.unregisterActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)this.H);
                    }
                });
                return true;
            }
            finally {
                androidx.core.app.d.h.post((Runnable)new Runnable() {
                    final /* synthetic */ Application G;
                    final /* synthetic */ d H;
                    
                    @Override
                    public void run() {
                        application.unregisterActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)d);
                    }
                });
            }
        }
        finally {
            return false;
        }
    }
    
    private static final class d implements Application$ActivityLifecycleCallbacks
    {
        Object G;
        private Activity H;
        private final int I;
        private boolean J;
        private boolean K;
        private boolean L;
        
        d(@j0 final Activity h) {
            this.J = false;
            this.K = false;
            this.L = false;
            this.H = h;
            this.I = h.hashCode();
        }
        
        public void onActivityCreated(final Activity activity, final Bundle bundle) {
        }
        
        public void onActivityDestroyed(final Activity activity) {
            if (this.H == activity) {
                this.H = null;
                this.K = true;
            }
        }
        
        public void onActivityPaused(final Activity activity) {
            if (this.K && !this.L && !this.J && androidx.core.app.d.h(this.G, this.I, activity)) {
                this.L = true;
                this.G = null;
            }
        }
        
        public void onActivityResumed(final Activity activity) {
        }
        
        public void onActivitySaveInstanceState(final Activity activity, final Bundle bundle) {
        }
        
        public void onActivityStarted(final Activity activity) {
            if (this.H == activity) {
                this.J = true;
            }
        }
        
        public void onActivityStopped(final Activity activity) {
        }
    }
}
