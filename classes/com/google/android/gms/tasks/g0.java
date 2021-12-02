// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.tasks;

import androidx.annotation.j0;
import java.util.concurrent.Executor;

final class g0<TResult, TContinuationResult> implements e, g, h<TContinuationResult>, i0<TResult>
{
    private final Executor a;
    private final l<TResult, TContinuationResult> b;
    private final l0<TContinuationResult> c;
    
    public g0(@j0 final Executor a, @j0 final l<TResult, TContinuationResult> b, @j0 final l0<TContinuationResult> c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void a() {
        this.c.A();
    }
    
    @Override
    public final void b(@j0 final m<TResult> m) {
        this.a.execute(new f0(this, m));
    }
    
    @Override
    public final void c(@j0 final Exception ex) {
        this.c.y(ex);
    }
    
    @Override
    public final void d(final TContinuationResult tContinuationResult) {
        this.c.z(tContinuationResult);
    }
    
    @Override
    public final void zza() {
        throw new UnsupportedOperationException();
    }
}
