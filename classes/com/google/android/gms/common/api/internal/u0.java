// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import java.util.Iterator;
import java.util.Collections;
import com.google.android.gms.common.api.t;
import androidx.annotation.k0;
import android.os.Bundle;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.c;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

public final class u0 implements c1
{
    @NotOnlyInitialized
    private final b1 a;
    
    public u0(final b1 a) {
        this.a = a;
    }
    
    @Override
    public final void H(final c c, final a<?> a, final boolean b) {
    }
    
    @Override
    public final void I() {
        this.a.p();
    }
    
    @Override
    public final void J(@k0 final Bundle bundle) {
    }
    
    @Override
    public final <A extends a.b, R extends t, T extends e.a<R, A>> T K(final T t) {
        this.a.r.k.add(t);
        return t;
    }
    
    @Override
    public final <A extends a.b, T extends e.a<? extends t, A>> T L(final T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }
    
    @Override
    public final void b() {
        final Iterator<a.f> iterator = this.a.j.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().d();
        }
        this.a.r.s = Collections.emptySet();
    }
    
    @Override
    public final boolean f() {
        return true;
    }
    
    @Override
    public final void h(final int n) {
    }
}
