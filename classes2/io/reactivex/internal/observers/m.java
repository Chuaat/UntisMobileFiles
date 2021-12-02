// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.observers;

import io.reactivex.internal.disposables.d;
import io.reactivex.disposables.c;
import io.reactivex.i0;

public abstract class m<T, R> extends l<R> implements i0<T>
{
    private static final long Q = -266195175408988651L;
    protected c P;
    
    public m(final i0<? super R> i0) {
        super(i0);
    }
    
    @Override
    public void b(final Throwable t) {
        super.I = null;
        this.e(t);
    }
    
    @Override
    public void dispose() {
        super.dispose();
        this.P.dispose();
    }
    
    @Override
    public void f() {
        final T i = (T)super.I;
        if (i != null) {
            super.I = null;
            this.c((R)i);
        }
        else {
            this.a();
        }
    }
    
    @Override
    public void l(final c p) {
        if (d.l(this.P, p)) {
            this.P = p;
            super.H.l(this);
        }
    }
}
