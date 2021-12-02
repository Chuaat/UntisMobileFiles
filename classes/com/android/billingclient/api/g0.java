// 
// Decompiled by Procyon v0.5.36
// 

package com.android.billingclient.api;

import android.text.TextUtils;

public final class g0
{
    private String a;
    
    private g0() {
    }
    
    public final g0 a(final String a) {
        this.a = a;
        return this;
    }
    
    public final h0 b() {
        if (!TextUtils.isEmpty((CharSequence)this.a)) {
            return new h0(this.a, null, null);
        }
        throw new IllegalArgumentException("SKU must be set.");
    }
}
