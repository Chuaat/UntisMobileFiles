// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import androidx.annotation.g0;
import android.content.Intent;
import android.content.Context;
import androidx.annotation.c1;
import android.content.IntentFilter;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.common.util.d0;
import android.content.BroadcastReceiver;

final class v3 extends BroadcastReceiver
{
    @d0
    static final String d;
    private final z9 a;
    private boolean b;
    private boolean c;
    
    static {
        d = v3.class.getName();
    }
    
    v3(final z9 a) {
        x.k(a);
        this.a = a;
    }
    
    @c1
    public final void b() {
        this.a.d();
        this.a.b().e();
        if (this.b) {
            return;
        }
        this.a.X().registerReceiver((BroadcastReceiver)this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.c = this.a.W().k();
        this.a.c().s().b("Registering connectivity change receiver. Network connected", this.c);
        this.b = true;
    }
    
    @c1
    public final void c() {
        this.a.d();
        this.a.b().e();
        this.a.b().e();
        if (this.b) {
            this.a.c().s().a("Unregistering connectivity change receiver");
            this.b = false;
            this.c = false;
            final Context x = this.a.X();
            try {
                x.unregisterReceiver((BroadcastReceiver)this);
            }
            catch (IllegalArgumentException ex) {
                this.a.c().o().b("Failed to unregister the network broadcast receiver", ex);
            }
        }
    }
    
    @g0
    public final void onReceive(final Context context, final Intent intent) {
        this.a.d();
        final String action = intent.getAction();
        this.a.c().s().b("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            final boolean k = this.a.W().k();
            if (this.c != k) {
                this.c = k;
                this.a.b().w(new u3(this, k));
            }
            return;
        }
        this.a.c().t().b("NetworkBroadcastReceiver received unknown action", action);
    }
}
