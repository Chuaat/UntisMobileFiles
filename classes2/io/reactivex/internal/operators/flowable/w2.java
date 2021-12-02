// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.j;
import o7.d;
import io.reactivex.q;
import io.reactivex.v;
import io.reactivex.plugins.a;
import x5.c;
import io.reactivex.l;
import y5.b;
import y5.h;
import io.reactivex.s;

public final class w2<T> extends s<T> implements h<T>, b<T>
{
    final l<T> G;
    final c<T, T, T> H;
    
    public w2(final l<T> g, final c<T, T, T> h) {
        this.G = g;
        this.H = h;
    }
    
    @Override
    public l<T> g() {
        return io.reactivex.plugins.a.P(new v2((l<Object>)this.G, (c<Object, Object, Object>)this.H));
    }
    
    @Override
    public o7.b<T> source() {
        return (o7.b<T>)this.G;
    }
    
    @Override
    protected void u1(final v<? super T> v) {
        this.G.m6(new a<Object>(v, this.H));
    }
    
    static final class a<T> implements q<T>, c
    {
        final v<? super T> G;
        final x5.c<T, T, T> H;
        T I;
        d J;
        boolean K;
        
        a(final v<? super T> g, final x5.c<T, T, T> h) {
            this.G = g;
            this.H = h;
        }
        
        public void b(final Throwable t) {
            if (this.K) {
                io.reactivex.plugins.a.Y(t);
                return;
            }
            this.K = true;
            this.G.b(t);
        }
        
        @Override
        public void dispose() {
            this.J.cancel();
            this.K = true;
        }
        
        public void f() {
            if (this.K) {
                return;
            }
            this.K = true;
            final T i = this.I;
            if (i != null) {
                this.G.d((Object)i);
            }
            else {
                this.G.f();
            }
        }
        
        @Override
        public boolean i() {
            return this.K;
        }
        
        public void m(final T i) {
            if (this.K) {
                return;
            }
            final T j = this.I;
            if (j == null) {
                this.I = i;
            }
            else {
                try {
                    this.I = io.reactivex.internal.functions.b.g(this.H.b(j, i), "The reducer returned a null value");
                }
                finally {
                    final Throwable t;
                    io.reactivex.exceptions.b.b(t);
                    this.J.cancel();
                    this.b(t);
                }
            }
        }
        
        @Override
        public void z(final d j) {
            if (j.o(this.J, j)) {
                this.J = j;
                this.G.l(this);
                j.v(Long.MAX_VALUE);
            }
        }
    }
}
