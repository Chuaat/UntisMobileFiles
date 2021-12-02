// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.j;
import o7.d;
import io.reactivex.disposables.c;
import io.reactivex.q;
import io.reactivex.v;
import io.reactivex.plugins.a;
import io.reactivex.l;
import y5.b;
import io.reactivex.s;

public final class q3<T> extends s<T> implements b<T>
{
    final l<T> G;
    
    public q3(final l<T> g) {
        this.G = g;
    }
    
    @Override
    public l<T> g() {
        return io.reactivex.plugins.a.P(new p3((l<Object>)this.G, null, false));
    }
    
    @Override
    protected void u1(final v<? super T> v) {
        this.G.m6(new a<Object>(v));
    }
    
    static final class a<T> implements q<T>, c
    {
        final v<? super T> G;
        d H;
        boolean I;
        T J;
        
        a(final v<? super T> g) {
            this.G = g;
        }
        
        public void b(final Throwable t) {
            if (this.I) {
                io.reactivex.plugins.a.Y(t);
                return;
            }
            this.I = true;
            this.H = (d)j.G;
            this.G.b(t);
        }
        
        @Override
        public void dispose() {
            this.H.cancel();
            this.H = (d)j.G;
        }
        
        public void f() {
            if (this.I) {
                return;
            }
            this.I = true;
            this.H = (d)j.G;
            final T j = this.J;
            this.J = null;
            if (j == null) {
                this.G.f();
            }
            else {
                this.G.d((Object)j);
            }
        }
        
        @Override
        public boolean i() {
            return this.H == j.G;
        }
        
        public void m(final T j) {
            if (this.I) {
                return;
            }
            if (this.J != null) {
                this.I = true;
                this.H.cancel();
                this.H = (d)j.G;
                this.G.b(new IllegalArgumentException("Sequence contains more than one element!"));
                return;
            }
            this.J = j;
        }
        
        @Override
        public void z(final d h) {
            if (j.o(this.H, h)) {
                this.H = h;
                this.G.l(this);
                h.v(Long.MAX_VALUE);
            }
        }
    }
}
