// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.d;
import io.reactivex.disposables.c;
import java.util.ArrayDeque;
import io.reactivex.i0;
import io.reactivex.g0;

public final class o3<T> extends io.reactivex.internal.operators.observable.a<T, T>
{
    final int H;
    
    public o3(final g0<T> g0, final int h) {
        super(g0);
        this.H = h;
    }
    
    public void L5(final i0<? super T> i0) {
        super.G.c(new a<Object>((i0<? super T>)i0, this.H));
    }
    
    static final class a<T> extends ArrayDeque<T> implements i0<T>, c
    {
        private static final long K = 7240042530241604978L;
        final i0<? super T> G;
        final int H;
        c I;
        volatile boolean J;
        
        a(final i0<? super T> g, final int h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public void b(final Throwable t) {
            this.G.b(t);
        }
        
        @Override
        public void dispose() {
            if (!this.J) {
                this.J = true;
                this.I.dispose();
            }
        }
        
        @Override
        public void f() {
            final i0<? super T> g = this.G;
            while (!this.J) {
                final Object poll = this.poll();
                if (poll == null) {
                    if (!this.J) {
                        g.f();
                    }
                    return;
                }
                g.m(poll);
            }
        }
        
        @Override
        public boolean i() {
            return this.J;
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
                this.poll();
            }
            this.offer(e);
        }
    }
}
