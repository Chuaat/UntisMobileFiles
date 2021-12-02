// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.analytics.ktx;

import java.util.Map;
import java.util.LinkedHashMap;
import kotlin.j2;
import n6.l;
import com.google.firebase.ktx.c;
import kotlin.jvm.internal.k0;
import com.google.firebase.ktx.b;
import org.jetbrains.annotations.e;
import org.jetbrains.annotations.f;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a3\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0019\b\u0004\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\b\u00f8\u0001\u0000\u001a+\u0010\n\u001a\u00020\u0005*\u00020\u00002\u0019\b\u0004\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\b\u00f8\u0001\u0000\"$\u0010\u000b\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\"\u0016\u0010\u0013\u001a\u00020\u00018\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u001c\u0010\u0015\u001a\u00020\u00148\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0017\"\u0017\u0010\u001b\u001a\u00020\u0000*\u00020\u00188F@\u0006¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001c" }, d2 = { "Lcom/google/firebase/analytics/FirebaseAnalytics;", "", "name", "Lkotlin/Function1;", "Lcom/google/firebase/analytics/ktx/b;", "Lkotlin/j2;", "Lkotlin/s;", "block", "d", "Lcom/google/firebase/analytics/ktx/ConsentBuilder;", "f", "ANALYTICS", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "a", "()Lcom/google/firebase/analytics/FirebaseAnalytics;", "e", "(Lcom/google/firebase/analytics/FirebaseAnalytics;)V", "c", "Ljava/lang/String;", "LIBRARY_NAME", "", "LOCK", "Ljava/lang/Object;", "()Ljava/lang/Object;", "Lcom/google/firebase/ktx/b;", "b", "(Lcom/google/firebase/ktx/b;)Lcom/google/firebase/analytics/FirebaseAnalytics;", "analytics", "java.com.google.android.libraries.firebase.firebase_analytics_ktx_granule" }, k = 2, mv = { 1, 4, 0 })
public final class a
{
    @f
    private static volatile FirebaseAnalytics a;
    @e
    private static final Object b;
    @e
    public static final String c = "fire-analytics-ktx";
    
    static {
        b = new Object();
    }
    
    @f
    public static final FirebaseAnalytics a() {
        return com.google.firebase.analytics.ktx.a.a;
    }
    
    @e
    public static final FirebaseAnalytics b(@e final b b) {
        k0.p((Object)b, "$this$analytics");
        if (com.google.firebase.analytics.ktx.a.a == null) {
            synchronized (com.google.firebase.analytics.ktx.a.b) {
                if (com.google.firebase.analytics.ktx.a.a == null) {
                    com.google.firebase.analytics.ktx.a.a = FirebaseAnalytics.getInstance(com.google.firebase.ktx.c.b(b.a).m());
                }
            }
        }
        final FirebaseAnalytics a = com.google.firebase.analytics.ktx.a.a;
        k0.m((Object)a);
        return a;
    }
    
    @e
    public static final Object c() {
        return com.google.firebase.analytics.ktx.a.b;
    }
    
    public static final void d(@e final FirebaseAnalytics firebaseAnalytics, @e final String s, @e final l<? super com.google.firebase.analytics.ktx.b, j2> l) {
        k0.p((Object)firebaseAnalytics, "$this$logEvent");
        k0.p((Object)s, "name");
        k0.p((Object)l, "block");
        final com.google.firebase.analytics.ktx.b b = new com.google.firebase.analytics.ktx.b();
        l.invoke((Object)b);
        firebaseAnalytics.b(s, b.a());
    }
    
    public static final void e(@f final FirebaseAnalytics a) {
        a.a = a;
    }
    
    public static final void f(@e final FirebaseAnalytics firebaseAnalytics, @e final l<? super d, j2> l) {
        k0.p((Object)firebaseAnalytics, "$this$setConsent");
        k0.p((Object)l, "block");
        l.invoke((Object)new d());
        firebaseAnalytics.e(new LinkedHashMap<FirebaseAnalytics.b, FirebaseAnalytics.a>());
    }
}
