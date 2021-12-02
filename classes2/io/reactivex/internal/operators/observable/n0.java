// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.annotations.g;
import io.reactivex.internal.disposables.d;
import y5.j;
import io.reactivex.disposables.c;
import io.reactivex.internal.observers.b;
import io.reactivex.i0;
import io.reactivex.g0;

public final class n0<T> extends io.reactivex.internal.operators.observable.a<T, T>
{
    final x5.a H;
    
    public n0(final g0<T> g0, final x5.a h) {
        super(g0);
        this.H = h;
    }
    
    @Override
    protected void L5(final i0<? super T> i0) {
        super.G.c(new a<Object>((i0<? super T>)i0, this.H));
    }
    
    static final class a<T> extends b<T> implements i0<T>
    {
        private static final long M = 4109457741734051389L;
        final i0<? super T> H;
        final x5.a I;
        c J;
        j<T> K;
        boolean L;
        
        a(final i0<? super T> h, final x5.a i) {
            this.H = h;
            this.I = i;
        }
        
        @Override
        public int E(int e) {
            final j<T> k = this.K;
            boolean l = false;
            if (k != null && (e & 0x4) == 0x0) {
                e = k.E(e);
                if (e != 0) {
                    if (e == 1) {
                        l = true;
                    }
                    this.L = l;
                }
                return e;
            }
            return 0;
        }
        
        void a() {
            if (this.compareAndSet(0, 1)) {
                try {
                    this.I.run();
                }
                finally {
                    final Throwable t;
                    io.reactivex.exceptions.b.b(t);
                    io.reactivex.plugins.a.Y(t);
                }
            }
        }
        
        @Override
        public void b(final Throwable t) {
            this.H.b(t);
            this.a();
        }
        
        @Override
        public void clear() {
            this.K.clear();
        }
        
        @Override
        public void dispose() {
            this.J.dispose();
            this.a();
        }
        
        @Override
        public void f() {
            this.H.f();
            this.a();
        }
        
        @Override
        public boolean i() {
            return this.J.i();
        }
        
        @Override
        public boolean isEmpty() {
            return this.K.isEmpty();
        }
        
        @Override
        public void l(final c j) {
            if (d.l(this.J, j)) {
                this.J = j;
                if (j instanceof j) {
                    this.K = (j<T>)j;
                }
                this.H.l(this);
            }
        }
        
        @Override
        public void m(final T t) {
            this.H.m((Object)t);
        }
        
        @io.reactivex.annotations.g
        @Override
        public T poll() throws Exception {
            final T poll = this.K.poll();
            if (poll == null && this.L) {
                this.a();
            }
            return poll;
        }
    }
}
