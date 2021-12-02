// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.d;
import io.reactivex.exceptions.b;
import io.reactivex.disposables.c;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.v;
import io.reactivex.y;

public final class r<T> extends io.reactivex.internal.operators.maybe.a<T, T>
{
    final x5.a H;
    
    public r(final y<T> y, final x5.a h) {
        super(y);
        this.H = h;
    }
    
    @Override
    protected void u1(final v<? super T> v) {
        super.G.c(new a<Object>((v<? super T>)v, this.H));
    }
    
    static final class a<T> extends AtomicInteger implements v<T>, c
    {
        private static final long J = 4109457741734051389L;
        final v<? super T> G;
        final x5.a H;
        c I;
        
        a(final v<? super T> g, final x5.a h) {
            this.G = g;
            this.H = h;
        }
        
        void a() {
            if (this.compareAndSet(0, 1)) {
                try {
                    this.H.run();
                }
                finally {
                    final Throwable t;
                    b.b(t);
                    io.reactivex.plugins.a.Y(t);
                }
            }
        }
        
        @Override
        public void b(final Throwable t) {
            this.G.b(t);
            this.a();
        }
        
        @Override
        public void d(final T t) {
            this.G.d((Object)t);
            this.a();
        }
        
        @Override
        public void dispose() {
            this.I.dispose();
            this.a();
        }
        
        @Override
        public void f() {
            this.G.f();
            this.a();
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
    }
}
