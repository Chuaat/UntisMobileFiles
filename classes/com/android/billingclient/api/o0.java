// 
// Decompiled by Procyon v0.5.36
// 

package com.android.billingclient.api;

import android.content.IntentFilter;
import android.content.Context;

final class o0
{
    private final Context a;
    private final n0 b;
    
    o0(final Context a, final o o) {
        this.a = a;
        this.b = new n0(this, o, null);
    }
    
    final o b() {
        return this.b.a;
    }
    
    final void c() {
        this.b.c(this.a);
    }
    
    final void d() {
        this.b.b(this.a, new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED"));
    }
}
