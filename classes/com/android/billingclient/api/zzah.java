// 
// Decompiled by Procyon v0.5.36
// 

package com.android.billingclient.api;

import java.util.Collections;
import java.util.List;

final class zzah implements c, f, j, k, m, n, o, q
{
    private final long a;
    
    zzah() {
        this.a = 0L;
    }
    
    zzah(final long a) {
        this.a = a;
    }
    
    public static native void nativeOnAcknowledgePurchaseResponse(final int p0, final String p1, final long p2);
    
    public static native void nativeOnBillingServiceDisconnected();
    
    public static native void nativeOnBillingSetupFinished(final int p0, final String p1, final long p2);
    
    public static native void nativeOnConsumePurchaseResponse(final int p0, final String p1, final String p2, final long p3);
    
    public static native void nativeOnPriceChangeConfirmationResult(final int p0, final String p1, final long p2);
    
    public static native void nativeOnPurchaseHistoryResponse(final int p0, final String p1, final PurchaseHistoryRecord[] p2, final long p3);
    
    public static native void nativeOnPurchasesUpdated(final int p0, final String p1, final Purchase[] p2);
    
    public static native void nativeOnQueryPurchasesResponse(final int p0, final String p1, final Purchase[] p2, final long p3);
    
    public static native void nativeOnSkuDetailsResponse(final int p0, final String p1, final SkuDetails[] p2, final long p3);
    
    @Override
    public final void a(final h h, final List<Purchase> list) {
        nativeOnQueryPurchasesResponse(h.b(), h.a(), list.toArray(new Purchase[list.size()]), this.a);
    }
    
    @Override
    public final void b(final h h, final List<SkuDetails> list) {
        List<SkuDetails> emptyList = list;
        if (list == null) {
            emptyList = Collections.emptyList();
        }
        nativeOnSkuDetailsResponse(h.b(), h.a(), emptyList.toArray(new SkuDetails[emptyList.size()]), this.a);
    }
    
    @Override
    public final void c(final h h, final List<Purchase> list) {
        List<Purchase> emptyList = list;
        if (list == null) {
            emptyList = Collections.emptyList();
        }
        nativeOnPurchasesUpdated(h.b(), h.a(), emptyList.toArray(new Purchase[emptyList.size()]));
    }
    
    @Override
    public final void d(final h h) {
        nativeOnAcknowledgePurchaseResponse(h.b(), h.a(), this.a);
    }
    
    @Override
    public final void e(final h h, final List<PurchaseHistoryRecord> list) {
        List<PurchaseHistoryRecord> emptyList = list;
        if (list == null) {
            emptyList = Collections.emptyList();
        }
        nativeOnPurchaseHistoryResponse(h.b(), h.a(), emptyList.toArray(new PurchaseHistoryRecord[emptyList.size()]), this.a);
    }
    
    @Override
    public final void f(final h h) {
        nativeOnBillingSetupFinished(h.b(), h.a(), this.a);
    }
    
    @Override
    public final void g(final h h) {
        nativeOnPriceChangeConfirmationResult(h.b(), h.a(), this.a);
    }
    
    @Override
    public final void h() {
        nativeOnBillingServiceDisconnected();
    }
    
    @Override
    public final void i(final h h, final String s) {
        nativeOnConsumePurchaseResponse(h.b(), h.a(), s, this.a);
    }
}
