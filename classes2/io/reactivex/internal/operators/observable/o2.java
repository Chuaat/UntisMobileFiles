// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.h;
import io.reactivex.i0;
import io.reactivex.g0;
import io.reactivex.b0;

public final class o2<T> extends io.reactivex.internal.operators.observable.a<T, T>
{
    final long H;
    
    public o2(final b0<T> b0, final long h) {
        super(b0);
        this.H = h;
    }
    
    public void L5(final i0<? super T> i0) {
        final h h = new h();
        i0.l(h);
        final long h2 = this.H;
        long n = Long.MAX_VALUE;
        if (h2 != Long.MAX_VALUE) {
            n = h2 - 1L;
        }
        new a((i0<? super Object>)i0, n, h, super.G).a();
    }
    
    static final class a<T> extends AtomicInteger implements i0<T>
    {
        private static final long K = -7098360935104053232L;
        final i0<? super T> G;
        final h H;
        final g0<? extends T> I;
        long J;
        
        a(final i0<? super T> g, final long j, final h h, final g0<? extends T> i) {
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
            this.G.b(t);
        }
        
        @Override
        public void f() {
            final long j = this.J;
            if (j != Long.MAX_VALUE) {
                this.J = j - 1L;
            }
            if (j != 0L) {
                this.a();
            }
            else {
                this.G.f();
            }
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
