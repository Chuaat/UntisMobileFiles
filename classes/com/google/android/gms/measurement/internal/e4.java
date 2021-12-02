// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import androidx.annotation.g0;
import com.google.android.gms.internal.measurement.t0;
import com.google.android.gms.internal.measurement.s0;
import android.os.IBinder;
import android.content.ComponentName;
import android.content.ServiceConnection;

public final class e4 implements ServiceConnection
{
    private final String c;
    final /* synthetic */ g4 d;
    
    e4(final g4 d, final String c) {
        this.d = d;
        this.c = c;
    }
    
    @g0
    public final void onServiceConnected(final ComponentName componentName, final IBinder binder) {
        if (binder != null) {
            try {
                final t0 x2 = s0.x2(binder);
                if (x2 == null) {
                    this.d.a.c().t().a("Install Referrer Service implementation was not found");
                    return;
                }
                this.d.a.c().s().a("Install Referrer Service connected");
                this.d.a.b().w(new d4(this, x2, (ServiceConnection)this));
                return;
            }
            catch (RuntimeException ex) {
                this.d.a.c().t().b("Exception occurred while calling Install Referrer API", ex);
                return;
            }
        }
        this.d.a.c().t().a("Install Referrer connection returned with null binder");
    }
    
    @g0
    public final void onServiceDisconnected(final ComponentName componentName) {
        this.d.a.c().s().a("Install Referrer Service disconnected");
    }
}
