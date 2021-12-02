// 
// Decompiled by Procyon v0.5.36
// 

package androidx.lifecycle;

import android.os.Bundle;
import android.app.Activity;
import androidx.annotation.b1;
import android.app.Application$ActivityLifecycleCallbacks;
import android.app.Application;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

class u
{
    private static AtomicBoolean a;
    
    static {
        u.a = new AtomicBoolean(false);
    }
    
    private u() {
    }
    
    static void a(final Context context) {
        if (u.a.getAndSet(true)) {
            return;
        }
        ((Application)context.getApplicationContext()).registerActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)new a());
    }
    
    @b1
    static class a extends m
    {
        @Override
        public void onActivityCreated(final Activity activity, final Bundle bundle) {
            q0.g(activity);
        }
        
        @Override
        public void onActivitySaveInstanceState(final Activity activity, final Bundle bundle) {
        }
        
        @Override
        public void onActivityStopped(final Activity activity) {
        }
    }
}
