// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.j;
import io.reactivex.exceptions.b;
import o7.d;
import io.reactivex.q;
import o7.c;
import io.reactivex.l;
import x5.r;

public final class f<T> extends io.reactivex.internal.operators.flowable.a<T, Boolean>
{
    final r<? super T> I;
    
    public f(final l<T> l, final r<? super T> i) {
        super(l);
        this.I = i;
    }
    
    @Override
    protected void n6(final c<? super Boolean> c) {
        super.H.m6(new a<Object>(c, (r<? super T>)this.I));
    }
    
    static final class a<T> extends f<Boolean> implements q<T>
    {
        private static final long V = -3521127104134758517L;
        final r<? super T> S;
        d T;
        boolean U;
        
        a(final o7.c<? super Boolean> c, final r<? super T> s) {
            super(c);
            this.S = s;
        }
        
        public void b(final Throwable t) {
            if (this.U) {
                io.reactivex.plugins.a.Y(t);
                return;
            }
            this.U = true;
            super.H.b(t);
        }
        
        @Override
        public void cancel() {
            super.cancel();
            this.T.cancel();
        }
        
        public void f() {
            if (this.U) {
                return;
            }
            this.U = true;
            this.g(Boolean.TRUE);
        }
        
        public void m(final T t) {
            if (this.U) {
                return;
            }
            try {
                if (!this.S.a((Object)t)) {
                    this.U = true;
                    this.T.cancel();
                    this.g(Boolean.FALSE);
                }
            }
            finally {
                final Throwable t2;
                b.b(t2);
                this.T.cancel();
                this.b(t2);
            }
        }
        
        @Override
        public void z(final d t) {
            if (j.o(this.T, t)) {
                this.T = t;
                super.H.z((d)this);
                t.v(Long.MAX_VALUE);
            }
        }
    }
}
