// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.d;
import io.reactivex.disposables.c;
import java.util.ArrayDeque;
import io.reactivex.i0;
import io.reactivex.g0;

public final class g3<T> extends io.reactivex.internal.operators.observable.a<T, T>
{
    final int H;
    
    public g3(final g0<T> g0, final int h) {
        super(g0);
        this.H = h;
    }
    
    public void L5(final i0<? super T> i0) {
        super.G.c(new a<Object>((i0<? super T>)i0, this.H));
    }
    
    static final class a<T> extends ArrayDeque<T> implements i0<T>, c
    {
        private static final long J = -3807491841935125653L;
        final i0<? super T> G;
        final int H;
        c I;
        
        a(final i0<? super T> g, final int n) {
            super(n);
            this.G = g;
            this.H = n;
        }
        
        @Override
        public void b(final Throwable t) {
            this.G.b(t);
        }
        
        @Override
        public void dispose() {
            this.I.dispose();
        }
        
        @Override
        public void f() {
            this.G.f();
        }
        
        @Override
        public boolean i() {
            return this.I.i();
        }
        
        @Override
        public void l(final c i) {
            if (d.l(this.I, i)) {
                this.I = i;
                this.G.l(this);
            }
        }
        
        @Override
        public void m(final T e) {
            if (this.H == this.size()) {
                this.G.m(this.poll());
            }
            this.offer(e);
        }
    }
}
