// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.completable;

import io.reactivex.internal.disposables.d;
import io.reactivex.exceptions.b;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.f;
import x5.a;
import io.reactivex.i;
import io.reactivex.c;

public final class l extends c
{
    final i G;
    final x5.a H;
    
    public l(final i g, final x5.a h) {
        this.G = g;
        this.H = h;
    }
    
    @Override
    protected void L0(final f f) {
        this.G.c(new a(f, this.H));
    }
    
    static final class a extends AtomicInteger implements f, io.reactivex.disposables.c
    {
        private static final long J = 4109457741734051389L;
        final f G;
        final x5.a H;
        io.reactivex.disposables.c I;
        
        a(final f g, final x5.a h) {
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
        public void l(final io.reactivex.disposables.c i) {
            if (d.l(this.I, i)) {
                this.I = i;
                this.G.l(this);
            }
        }
    }
}
