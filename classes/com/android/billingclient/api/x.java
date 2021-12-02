// 
// Decompiled by Procyon v0.5.36
// 

package com.android.billingclient.api;

import java.util.concurrent.Callable;
import com.google.android.gms.internal.play_billing.c;
import com.google.android.gms.internal.play_billing.a;
import android.os.IBinder;
import android.content.ComponentName;
import com.google.android.gms.internal.play_billing.d;
import android.content.ServiceConnection;

final class x implements ServiceConnection
{
    private final Object c = new Object();
    private boolean d = false;
    private f e = e;
    final /* synthetic */ e f;
    
    private final void d(final h h) {
        synchronized (this.c) {
            final f e = this.e;
            if (e != null) {
                e.f(h);
            }
        }
    }
    
    final void c() {
        synchronized (this.c) {
            this.e = null;
            this.d = true;
        }
    }
    
    public final void onServiceConnected(final ComponentName componentName, final IBinder binder) {
        a.j("BillingClient", "Billing service connected.");
        this.f.g = com.google.android.gms.internal.play_billing.c.H(binder);
        if (com.android.billingclient.api.e.S(this.f, new w(this), 30000L, new v(this), this.f.v()) == null) {
            this.d(this.f.x());
        }
    }
    
    public final void onServiceDisconnected(final ComponentName componentName) {
        a.k("BillingClient", "Billing service disconnected.");
        this.f.g = null;
        this.f.a = 0;
        synchronized (this.c) {
            final f e = this.e;
            if (e != null) {
                e.h();
            }
        }
    }
}
