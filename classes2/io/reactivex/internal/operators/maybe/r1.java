// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.d;
import io.reactivex.disposables.c;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.v;
import io.reactivex.y;
import io.reactivex.j0;

public final class r1<T> extends io.reactivex.internal.operators.maybe.a<T, T>
{
    final j0 H;
    
    public r1(final y<T> y, final j0 h) {
        super(y);
        this.H = h;
    }
    
    @Override
    protected void u1(final v<? super T> v) {
        super.G.c(new a<Object>((v<? super T>)v, this.H));
    }
    
    static final class a<T> extends AtomicReference<c> implements v<T>, c, Runnable
    {
        private static final long J = 3256698449646456986L;
        final v<? super T> G;
        final j0 H;
        c I;
        
        a(final v<? super T> g, final j0 h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public void b(final Throwable t) {
            this.G.b(t);
        }
        
        @Override
        public void d(final T t) {
            this.G.d((Object)t);
        }
        
        @Override
        public void dispose() {
            final d g = d.G;
            final d i = this.getAndSet(g);
            if (i != g) {
                this.I = i;
                this.H.e(this);
            }
        }
        
        @Override
        public void f() {
            this.G.f();
        }
        
        @Override
        public boolean i() {
            return d.d(this.get());
        }
        
        @Override
        public void l(final c c) {
            if (d.j(this, c)) {
                this.G.l(this);
            }
        }
        
        @Override
        public void run() {
            this.I.dispose();
        }
    }
}
