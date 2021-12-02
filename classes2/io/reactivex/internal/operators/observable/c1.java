// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.annotations.g;
import io.reactivex.internal.functions.b;
import io.reactivex.disposables.c;
import io.reactivex.i0;
import io.reactivex.b0;

public final class c1<T> extends b0<T>
{
    final T[] G;
    
    public c1(final T[] g) {
        this.G = g;
    }
    
    public void L5(final i0<? super T> i0) {
        final a a = new a((i0<? super Object>)i0, this.G);
        i0.l(a);
        if (a.J) {
            return;
        }
        a.a();
    }
    
    static final class a<T> extends c<T>
    {
        final i0<? super T> G;
        final T[] H;
        int I;
        boolean J;
        volatile boolean K;
        
        a(final i0<? super T> g, final T[] h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public int E(final int n) {
            if ((n & 0x1) != 0x0) {
                this.J = true;
                return 1;
            }
            return 0;
        }
        
        void a() {
            final T[] h = this.H;
            for (int length = h.length, i = 0; i < length && !this.i(); ++i) {
                final T t = h[i];
                if (t == null) {
                    final i0<? super T> g = this.G;
                    final StringBuilder sb = new StringBuilder();
                    sb.append("The element at index ");
                    sb.append(i);
                    sb.append(" is null");
                    g.b(new NullPointerException(sb.toString()));
                    return;
                }
                this.G.m((Object)t);
            }
            if (!this.i()) {
                this.G.f();
            }
        }
        
        @Override
        public void clear() {
            this.I = this.H.length;
        }
        
        @Override
        public void dispose() {
            this.K = true;
        }
        
        @Override
        public boolean i() {
            return this.K;
        }
        
        @Override
        public boolean isEmpty() {
            return this.I == this.H.length;
        }
        
        @g
        @Override
        public T poll() {
            final int i = this.I;
            final T[] h = this.H;
            if (i != h.length) {
                this.I = i + 1;
                return b.g(h[i], "The array element is null");
            }
            return null;
        }
    }
}
