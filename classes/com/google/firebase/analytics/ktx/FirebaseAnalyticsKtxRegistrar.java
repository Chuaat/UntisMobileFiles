// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.analytics.ktx;

import org.jetbrains.annotations.e;
import kotlin.collections.v;
import com.google.firebase.platforminfo.h;
import com.google.firebase.components.f;
import java.util.List;
import kotlin.Metadata;
import com.google.firebase.components.k;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002H\u0016¨\u0006\u0007" }, d2 = { "Lcom/google/firebase/analytics/ktx/FirebaseAnalyticsKtxRegistrar;", "Lcom/google/firebase/components/k;", "", "Lcom/google/firebase/components/f;", "getComponents", "<init>", "()V", "java.com.google.android.libraries.firebase.firebase_analytics_ktx_granule" }, k = 1, mv = { 1, 4, 0 })
public final class FirebaseAnalyticsKtxRegistrar implements k
{
    @e
    @Override
    public final List<f<?>> getComponents() {
        return (List<f<?>>)v.k((Object)h.b("fire-analytics-ktx", "18.0.0"));
    }
}
