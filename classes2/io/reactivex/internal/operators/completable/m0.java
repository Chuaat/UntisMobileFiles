// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.completable;

import io.reactivex.plugins.a;
import java.util.concurrent.TimeoutException;
import io.reactivex.internal.util.k;
import java.util.concurrent.atomic.AtomicBoolean;
import io.reactivex.disposables.b;
import io.reactivex.f;
import io.reactivex.j0;
import java.util.concurrent.TimeUnit;
import io.reactivex.i;
import io.reactivex.c;

public final class m0 extends c
{
    final i G;
    final long H;
    final TimeUnit I;
    final j0 J;
    final i K;
    
    public m0(final i g, final long h, final TimeUnit i, final j0 j, final i k) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
    }
    
    public void L0(final f f) {
        final io.reactivex.disposables.b b = new io.reactivex.disposables.b();
        f.l(b);
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        b.b(this.J.f(new a(atomicBoolean, b, f), this.H, this.I));
        this.G.c(new b(b, atomicBoolean, f));
    }
    
    final class a implements Runnable
    {
        private final AtomicBoolean G;
        final io.reactivex.disposables.b H;
        final f I;
        
        a(final AtomicBoolean g, final io.reactivex.disposables.b h, final f i) {
            this.G = g;
            this.H = h;
            this.I = i;
        }
        
        @Override
        public void run() {
            if (this.G.compareAndSet(false, true)) {
                this.H.e();
                final i k = m0.this.K;
                if (k == null) {
                    final f i = this.I;
                    final m0 j = m0.this;
                    i.b(new TimeoutException(io.reactivex.internal.util.k.e(j.H, j.I)));
                }
                else {
                    k.c(new m0.a.a());
                }
            }
        }
        
        final class a implements f
        {
            @Override
            public void b(final Throwable t) {
                m0.a.this.H.dispose();
                m0.a.this.I.b(t);
            }
            
            @Override
            public void f() {
                m0.a.this.H.dispose();
                m0.a.this.I.f();
            }
            
            @Override
            public void l(final io.reactivex.disposables.c c) {
                m0.a.this.H.b(c);
            }
        }
    }
    
    static final class b implements f
    {
        private final io.reactivex.disposables.b G;
        private final AtomicBoolean H;
        private final f I;
        
        b(final io.reactivex.disposables.b g, final AtomicBoolean h, final f i) {
            this.G = g;
            this.H = h;
            this.I = i;
        }
        
        @Override
        public void b(final Throwable t) {
            if (this.H.compareAndSet(false, true)) {
                this.G.dispose();
                this.I.b(t);
            }
            else {
                a.Y(t);
            }
        }
        
        @Override
        public void f() {
            if (this.H.compareAndSet(false, true)) {
                this.G.dispose();
                this.I.f();
            }
        }
        
        @Override
        public void l(final io.reactivex.disposables.c c) {
            this.G.b(c);
        }
    }
}
