// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.completable;

import io.reactivex.internal.disposables.d;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.f;
import io.reactivex.i;
import io.reactivex.c;

public final class b extends c
{
    final i G;
    final i H;
    
    public b(final i g, final i h) {
        this.G = g;
        this.H = h;
    }
    
    @Override
    protected void L0(final f f) {
        this.G.c(new b(f, this.H));
    }
    
    static final class a implements f
    {
        final AtomicReference<io.reactivex.disposables.c> G;
        final f H;
        
        public a(final AtomicReference<io.reactivex.disposables.c> g, final f h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public void b(final Throwable t) {
            this.H.b(t);
        }
        
        @Override
        public void f() {
            this.H.f();
        }
        
        @Override
        public void l(final io.reactivex.disposables.c c) {
            d.f(this.G, c);
        }
    }
    
    static final class b extends AtomicReference<io.reactivex.disposables.c> implements f, io.reactivex.disposables.c
    {
        private static final long I = -4101678820158072998L;
        final f G;
        final i H;
        
        b(final f g, final i h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public void b(final Throwable t) {
            this.G.b(t);
        }
        
        @Override
        public void dispose() {
            d.b(this);
        }
        
        @Override
        public void f() {
            this.H.c(new a(this, this.G));
        }
        
        @Override
        public boolean i() {
            return d.d(this.get());
        }
        
        @Override
        public void l(final io.reactivex.disposables.c c) {
            if (d.j(this, c)) {
                this.G.l(this);
            }
        }
    }
}
