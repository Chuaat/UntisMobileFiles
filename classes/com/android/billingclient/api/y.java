// 
// Decompiled by Procyon v0.5.36
// 

package com.android.billingclient.api;

import androidx.annotation.k0;
import java.util.List;

final class y
{
    private final List<PurchaseHistoryRecord> a;
    private final h b;
    
    y(final h b, @k0 final List<PurchaseHistoryRecord> a) {
        this.a = a;
        this.b = b;
    }
    
    final h a() {
        return this.b;
    }
    
    final List<PurchaseHistoryRecord> b() {
        return this.a;
    }
}
