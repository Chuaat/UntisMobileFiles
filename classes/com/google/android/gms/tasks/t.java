// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.tasks;

import androidx.annotation.j0;
import java.util.concurrent.Executor;

final class t<TResult, TContinuationResult> implements i0<TResult>
{
    private final Executor a;
    private final c<TResult, TContinuationResult> b;
    private final l0<TContinuationResult> c;
    
    public t(@j0 final Executor a, @j0 final c<TResult, TContinuationResult> b, @j0 final l0<TContinuationResult> c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void b(@j0 final m<TResult> m) {
        this.a.execute(new v(this, m));
    }
    
    @Override
    public final void zza() {
        throw new UnsupportedOperationException();
    }
}
