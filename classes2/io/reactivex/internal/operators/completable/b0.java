// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.completable;

import io.reactivex.plugins.a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicBoolean;
import io.reactivex.disposables.b;
import io.reactivex.f;
import io.reactivex.i;
import io.reactivex.c;

public final class b0 extends c
{
    final i[] G;
    
    public b0(final i[] g) {
        this.G = g;
    }
    
    public void L0(final f f) {
        final b b = new b();
        final a a = new a(f, new AtomicBoolean(), b, this.G.length + 1);
        f.l(b);
        for (final i j : this.G) {
            if (b.i()) {
                return;
            }
            if (j == null) {
                b.dispose();
                a.b(new NullPointerException("A completable source is null"));
                return;
            }
            j.c(a);
        }
        a.f();
    }
    
    static final class a extends AtomicInteger implements f
    {
        private static final long J = -8360547806504310570L;
        final f G;
        final AtomicBoolean H;
        final b I;
        
        a(final f g, final AtomicBoolean h, final b i, final int newValue) {
            this.G = g;
            this.H = h;
            this.I = i;
            this.lazySet(newValue);
        }
        
        @Override
        public void b(final Throwable t) {
            this.I.dispose();
            if (this.H.compareAndSet(false, true)) {
                this.G.b(t);
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        @Override
        public void f() {
            if (this.decrementAndGet() == 0 && this.H.compareAndSet(false, true)) {
                this.G.f();
            }
        }
        
        @Override
        public void l(final io.reactivex.disposables.c c) {
            this.I.b(c);
        }
    }
}
