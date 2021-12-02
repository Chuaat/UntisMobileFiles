// 
// Decompiled by Procyon v0.5.36
// 

package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.a;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

final class f1 extends ResultReceiver
{
    final /* synthetic */ k G;
    
    f1(final e e, final Handler handler, final k g) {
        this.G = g;
        super(handler);
    }
    
    public final void onReceiveResult(final int n, final Bundle bundle) {
        final h.a c = h.c();
        c.c(n);
        c.b(a.h(bundle, "BillingClient"));
        this.G.g(c.a());
    }
}
