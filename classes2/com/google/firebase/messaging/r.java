// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.messaging;

import android.os.Bundle;
import android.app.Activity;
import java.util.Map;
import java.util.Collections;
import java.util.WeakHashMap;
import android.content.Intent;
import java.util.Set;
import android.app.Application$ActivityLifecycleCallbacks;

class r implements Application$ActivityLifecycleCallbacks
{
    private final Set<Intent> G;
    
    r() {
        this.G = Collections.newSetFromMap(new WeakHashMap<Intent, Boolean>());
    }
    
    public void onActivityCreated(final Activity activity, final Bundle bundle) {
        final Intent intent = activity.getIntent();
        if (intent != null) {
            if (this.G.add(intent)) {
                final Bundle extras = intent.getExtras();
                if (extras != null) {
                    final Bundle bundle2 = extras.getBundle("gcm.n.analytics_data");
                    if (l0.C(bundle2)) {
                        l0.u(bundle2);
                    }
                }
            }
        }
    }
    
    public void onActivityDestroyed(final Activity activity) {
    }
    
    public void onActivityPaused(final Activity activity) {
        if (activity.isFinishing()) {
            this.G.remove(activity.getIntent());
        }
    }
    
    public void onActivityResumed(final Activity activity) {
    }
    
    public void onActivitySaveInstanceState(final Activity activity, final Bundle bundle) {
    }
    
    public void onActivityStarted(final Activity activity) {
    }
    
    public void onActivityStopped(final Activity activity) {
    }
}
