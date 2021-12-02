// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.single;

import io.reactivex.internal.subscriptions.j;
import java.util.NoSuchElementException;
import io.reactivex.plugins.a;
import o7.d;
import io.reactivex.q;
import o7.c;
import io.reactivex.n0;
import o7.b;
import io.reactivex.k0;

public final class e0<T> extends k0<T>
{
    final b<? extends T> G;
    
    public e0(final b<? extends T> g) {
        this.G = g;
    }
    
    @Override
    protected void e1(final n0<? super T> n0) {
        this.G.e((c)new a((n0<? super Object>)n0));
    }
    
    static final class a<T> implements q<T>, c
    {
        final n0<? super T> G;
        d H;
        T I;
        boolean J;
        volatile boolean K;
        
        a(final n0<? super T> g) {
            this.G = g;
        }
        
        public void b(final Throwable t) {
            if (this.J) {
                io.reactivex.plugins.a.Y(t);
                return;
            }
            this.J = true;
            this.I = null;
            this.G.b(t);
        }
        
        @Override
        public void dispose() {
            this.K = true;
            this.H.cancel();
        }
        
        public void f() {
            if (this.J) {
                return;
            }
            this.J = true;
            final T i = this.I;
            this.I = null;
            if (i == null) {
                this.G.b(new NoSuchElementException("The source Publisher is empty"));
            }
            else {
                this.G.d((Object)i);
            }
        }
        
        @Override
        public boolean i() {
            return this.K;
        }
        
        public void m(final T i) {
            if (this.J) {
                return;
            }
            if (this.I != null) {
                this.H.cancel();
                this.J = true;
                this.I = null;
                this.G.b(new IndexOutOfBoundsException("Too many elements in the Publisher"));
            }
            else {
                this.I = i;
            }
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
