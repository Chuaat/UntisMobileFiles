// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.j;
import java.util.NoSuchElementException;
import o7.d;
import io.reactivex.internal.subscriptions.f;
import io.reactivex.q;
import o7.c;
import io.reactivex.l;

public final class p3<T> extends io.reactivex.internal.operators.flowable.a<T, T>
{
    final T I;
    final boolean J;
    
    public p3(final l<T> l, final T i, final boolean j) {
        super(l);
        this.I = i;
        this.J = j;
    }
    
    @Override
    protected void n6(final c<? super T> c) {
        super.H.m6(new a<Object>((o7.c<? super T>)c, (Object)this.I, this.J));
    }
    
    static final class a<T> extends f<T> implements q<T>
    {
        private static final long W = -5526049321428043809L;
        final T S;
        final boolean T;
        d U;
        boolean V;
        
        a(final o7.c<? super T> c, final T s, final boolean t) {
            super(c);
            this.S = s;
            this.T = t;
        }
        
        public void b(final Throwable t) {
            if (this.V) {
                io.reactivex.plugins.a.Y(t);
                return;
            }
            this.V = true;
            super.H.b(t);
        }
        
        @Override
        public void cancel() {
            super.cancel();
            this.U.cancel();
        }
        
        public void f() {
            if (this.V) {
                return;
            }
            this.V = true;
            final T i = (T)super.I;
            super.I = null;
            T s;
            if ((s = i) == null) {
                s = this.S;
            }
            if (s == null) {
                if (this.T) {
                    super.H.b((Throwable)new NoSuchElementException());
                }
                else {
                    super.H.f();
                }
            }
            else {
                this.g(s);
            }
        }
        
        public void m(final T i) {
            if (this.V) {
                return;
            }
            if (super.I != null) {
                this.V = true;
                this.U.cancel();
                super.H.b((Throwable)new IllegalArgumentException("Sequence contains more than one element!"));
                return;
            }
            super.I = i;
        }
        
        @Override
        public void z(final d u) {
            if (j.o(this.U, u)) {
                this.U = u;
                super.H.z((d)this);
                u.v(Long.MAX_VALUE);
            }
        }
    }
}
