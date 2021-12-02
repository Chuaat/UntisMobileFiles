// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.subscribers;

import io.reactivex.internal.subscriptions.j;
import o7.c;
import o7.d;
import io.reactivex.q;
import io.reactivex.internal.subscriptions.f;

public abstract class h<T, R> extends f<R> implements q<T>
{
    private static final long U = 2984505488220891551L;
    protected d S;
    protected boolean T;
    
    public h(final o7.c<? super R> c) {
        super(c);
    }
    
    public void b(final Throwable t) {
        super.I = null;
        super.H.b(t);
    }
    
    @Override
    public void cancel() {
        super.cancel();
        this.S.cancel();
    }
    
    public void f() {
        if (this.T) {
            this.g((R)super.I);
        }
        else {
            super.H.f();
        }
    }
    
    @Override
    public void z(final d s) {
        if (j.o(this.S, s)) {
            this.S = s;
            super.H.z((d)this);
            s.v(Long.MAX_VALUE);
        }
    }
}
