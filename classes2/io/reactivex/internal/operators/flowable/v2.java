// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.functions.b;
import io.reactivex.internal.subscriptions.j;
import o7.d;
import io.reactivex.internal.subscriptions.f;
import io.reactivex.q;
import io.reactivex.l;
import x5.c;

public final class v2<T> extends io.reactivex.internal.operators.flowable.a<T, T>
{
    final c<T, T, T> I;
    
    public v2(final l<T> l, final c<T, T, T> i) {
        super(l);
        this.I = i;
    }
    
    @Override
    protected void n6(final o7.c<? super T> c) {
        super.H.m6(new a<Object>((o7.c<? super T>)c, (c<? super T, ? super T, ? super T>)this.I));
    }
    
    static final class a<T> extends f<T> implements q<T>
    {
        private static final long U = -4663883003264602070L;
        final x5.c<T, T, T> S;
        d T;
        
        a(final o7.c<? super T> c, final x5.c<T, T, T> s) {
            super(c);
            this.S = s;
        }
        
        public void b(final Throwable t) {
            final d t2 = this.T;
            final j g = j.G;
            if (t2 == g) {
                io.reactivex.plugins.a.Y(t);
                return;
            }
            this.T = (d)g;
            super.H.b(t);
        }
        
        @Override
        public void cancel() {
            super.cancel();
            this.T.cancel();
            this.T = (d)j.G;
        }
        
        public void f() {
            final d t = this.T;
            final j g = j.G;
            if (t == g) {
                return;
            }
            this.T = (d)g;
            final T i = (T)super.I;
            if (i != null) {
                this.g(i);
            }
            else {
                super.H.f();
            }
        }
        
        public void m(final T i) {
            if (this.T == j.G) {
                return;
            }
            final T j = (T)super.I;
            if (j == null) {
                super.I = i;
            }
            else {
                try {
                    super.I = b.g((T)this.S.b(j, i), "The reducer returned a null value");
                }
                finally {
                    final Throwable t;
                    io.reactivex.exceptions.b.b(t);
                    this.T.cancel();
                    this.b(t);
                }
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
