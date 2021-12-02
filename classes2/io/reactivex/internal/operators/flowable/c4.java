// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.j;
import o7.d;
import io.reactivex.internal.subscriptions.f;
import io.reactivex.q;
import o7.c;
import io.reactivex.l;

public final class c4<T> extends io.reactivex.internal.operators.flowable.a<T, T>
{
    public c4(final l<T> l) {
        super(l);
    }
    
    @Override
    protected void n6(final c<? super T> c) {
        super.H.m6(new a<Object>((o7.c<? super T>)c));
    }
    
    static final class a<T> extends f<T> implements q<T>
    {
        private static final long T = -5467847744262967226L;
        d S;
        
        a(final o7.c<? super T> c) {
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
            final T i = (T)super.I;
            if (i != null) {
                this.g(i);
            }
            else {
                super.H.f();
            }
        }
        
        public void m(final T i) {
            super.I = i;
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
}
