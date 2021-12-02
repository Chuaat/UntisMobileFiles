// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.completable;

import io.reactivex.plugins.a;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.disposables.b;
import io.reactivex.f;
import io.reactivex.i;
import io.reactivex.c;

public final class c0 extends c
{
    final i[] G;
    
    public c0(final i[] g) {
        this.G = g;
    }
    
    public void L0(final f f) {
        final b b = new b();
        final AtomicInteger atomicInteger = new AtomicInteger(this.G.length + 1);
        final io.reactivex.internal.util.c c = new io.reactivex.internal.util.c();
        f.l(b);
        for (final i j : this.G) {
            if (b.i()) {
                return;
            }
            if (j == null) {
                c.a(new NullPointerException("A completable source is null"));
                atomicInteger.decrementAndGet();
            }
            else {
                j.c(new a(f, b, c, atomicInteger));
            }
        }
        if (atomicInteger.decrementAndGet() == 0) {
            final Throwable c2 = c.c();
            if (c2 == null) {
                f.f();
            }
            else {
                f.b(c2);
            }
        }
    }
    
    static final class a implements f
    {
        final f G;
        final b H;
        final io.reactivex.internal.util.c I;
        final AtomicInteger J;
        
        a(final f g, final b h, final io.reactivex.internal.util.c i, final AtomicInteger j) {
            this.G = g;
            this.H = h;
            this.I = i;
            this.J = j;
        }
        
        void a() {
            if (this.J.decrementAndGet() == 0) {
                final Throwable c = this.I.c();
                if (c == null) {
                    this.G.f();
                }
                else {
                    this.G.b(c);
                }
            }
        }
        
        @Override
        public void b(final Throwable t) {
            if (this.I.a(t)) {
                this.a();
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        @Override
        public void f() {
            this.a();
        }
        
        @Override
        public void l(final io.reactivex.disposables.c c) {
            this.H.b(c);
        }
    }
}
