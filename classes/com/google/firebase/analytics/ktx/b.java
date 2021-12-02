// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.analytics.ktx;

import android.os.Parcelable;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import android.os.Bundle;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\bJ\u0016\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002J\u0016\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u000bJ#\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0010\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016" }, d2 = { "Lcom/google/firebase/analytics/ktx/b;", "", "", "key", "", "value", "Lkotlin/j2;", "b", "", "c", "e", "Landroid/os/Bundle;", "d", "", "f", "(Ljava/lang/String;[Landroid/os/Bundle;)V", "bundle", "Landroid/os/Bundle;", "a", "()Landroid/os/Bundle;", "<init>", "()V", "java.com.google.android.libraries.firebase.firebase_analytics_ktx_granule" }, k = 1, mv = { 1, 4, 0 })
public final class b
{
    @e
    private final Bundle a;
    
    public b() {
        this.a = new Bundle();
    }
    
    @e
    public final Bundle a() {
        return this.a;
    }
    
    public final void b(@e final String s, final double n) {
        k0.p((Object)s, "key");
        this.a.putDouble(s, n);
    }
    
    public final void c(@e final String s, final long n) {
        k0.p((Object)s, "key");
        this.a.putLong(s, n);
    }
    
    public final void d(@e final String s, @e final Bundle bundle) {
        k0.p((Object)s, "key");
        k0.p((Object)bundle, "value");
        this.a.putBundle(s, bundle);
    }
    
    public final void e(@e final String s, @e final String s2) {
        k0.p((Object)s, "key");
        k0.p((Object)s2, "value");
        this.a.putString(s, s2);
    }
    
    public final void f(@e final String s, @e final Bundle[] array) {
        k0.p((Object)s, "key");
        k0.p((Object)array, "value");
        this.a.putParcelableArray(s, (Parcelable[])array);
    }
}
