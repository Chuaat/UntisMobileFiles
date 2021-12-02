// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.app.Activity;
import android.app.Application$ActivityLifecycleCallbacks;

final class i3 implements Application$ActivityLifecycleCallbacks
{
    final /* synthetic */ j3 G;
    
    i3(final j3 g) {
        this.G = g;
    }
    
    public final void onActivityCreated(final Activity activity, final Bundle bundle) {
        j3.P(this.G, (x2)new a3(this, bundle, activity));
    }
    
    public final void onActivityDestroyed(final Activity activity) {
        j3.P(this.G, (x2)new h3(this, activity));
    }
    
    public final void onActivityPaused(final Activity activity) {
        j3.P(this.G, (x2)new d3(this, activity));
    }
    
    public final void onActivityResumed(final Activity activity) {
        j3.P(this.G, (x2)new c3(this, activity));
    }
    
    public final void onActivitySaveInstanceState(final Activity activity, final Bundle bundle) {
        final b1 b1 = new b1();
        j3.P(this.G, (x2)new g3(this, activity, b1));
        final Bundle x2 = b1.x2(50L);
        if (x2 != null) {
            bundle.putAll(x2);
        }
    }
    
    public final void onActivityStarted(final Activity activity) {
        j3.P(this.G, (x2)new b3(this, activity));
    }
    
    public final void onActivityStopped(final Activity activity) {
        j3.P(this.G, (x2)new f3(this, activity));
    }
}
