// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.content.Context;
import com.google.android.gms.common.api.t;
import androidx.annotation.j0;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.a;

public final class p1<O extends com.google.android.gms.common.api.a.d> extends r3
{
    @NotOnlyInitialized
    private final j<O> f;
    
    public p1(final j<O> f) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f = f;
    }
    
    @Override
    public final void H(final q2 q2) {
    }
    
    @Override
    public final void I(final q2 q2) {
    }
    
    @Override
    public final <A extends com.google.android.gms.common.api.a.b, R extends t, T extends e.a<R, A>> T k(@j0 final T t) {
        return this.f.h(t);
    }
    
    @Override
    public final <A extends com.google.android.gms.common.api.a.b, T extends e.a<? extends t, A>> T l(@j0 final T t) {
        return this.f.m(t);
    }
    
    @Override
    public final Context p() {
        return this.f.p();
    }
    
    @Override
    public final Looper q() {
        return this.f.s();
    }
}
