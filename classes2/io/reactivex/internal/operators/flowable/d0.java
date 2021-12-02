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

public final class d0<T> extends io.reactivex.internal.operators.flowable.a<T, Long>
{
    public d0(final l<T> l) {
        super(l);
    }
    
    @Override
    protected void n6(final c<? super Long> c) {
        super.H.m6(new a(c));
    }
    
    static final class a extends f<Long> implements q<Object>
    {
        private static final long U = 4973004223787171406L;
        d S;
        long T;
        
        a(final o7.c<? super Long> c) {
            super(c);
        }
        
        public void b(final Throwable t) {
            super.H.b(t);
        }
        
        @Override
        public void cancel() {
            super.cancel();
            this.S.cancel();
        }
        
        public void f() {
            this.g(this.T);
        }
        
        public void m(final Object o) {
            ++this.T;
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
