// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.exceptions.b;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.h;
import io.reactivex.i0;
import io.reactivex.g0;
import io.reactivex.b0;
import x5.d;

public final class s2<T> extends io.reactivex.internal.operators.observable.a<T, T>
{
    final d<? super Integer, ? super Throwable> H;
    
    public s2(final b0<T> b0, final d<? super Integer, ? super Throwable> h) {
        super(b0);
        this.H = h;
    }
    
    public void L5(final i0<? super T> i0) {
        final h h = new h();
        i0.l(h);
        new a((i0<? super Object>)i0, this.H, h, super.G).a();
    }
    
    static final class a<T> extends AtomicInteger implements i0<T>
    {
        private static final long L = -7098360935104053232L;
        final i0<? super T> G;
        final h H;
        final g0<? extends T> I;
        final d<? super Integer, ? super Throwable> J;
        int K;
        
        a(final i0<? super T> g, final d<? super Integer, ? super Throwable> j, final h h, final g0<? extends T> i) {
            this.G = g;
            this.H = h;
            this.I = i;
            this.J = j;
        }
        
        void a() {
            if (this.getAndIncrement() == 0) {
                int addAndGet = 1;
                while (!this.H.i()) {
                    this.I.c(this);
                    if ((addAndGet = this.addAndGet(-addAndGet)) == 0) {
                        return;
                    }
                }
            }
        }
        
        @Override
        public void b(final Throwable t) {
            try {
                final d<? super Integer, ? super Throwable> j = this.J;
                final int n = this.K + 1;
                this.K = n;
                if (!j.a(n, t)) {
                    this.G.b(t);
                    return;
                }
                this.a();
            }
            finally {
                final Throwable t2;
                b.b(t2);
                this.G.b(new io.reactivex.exceptions.a(new Throwable[] { t, t2 }));
            }
        }
        
        @Override
        public void f() {
            this.G.f();
        }
        
        @Override
        public void l(final c c) {
            this.H.a(c);
        }
        
        @Override
        public void m(final T t) {
            this.G.m((Object)t);
        }
    }
}
