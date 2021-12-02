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
import x5.e;

public final class p2<T> extends io.reactivex.internal.operators.observable.a<T, T>
{
    final e H;
    
    public p2(final b0<T> b0, final e h) {
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
        private static final long K = -7098360935104053232L;
        final i0<? super T> G;
        final h H;
        final g0<? extends T> I;
        final e J;
        
        a(final i0<? super T> g, final e j, final h h, final g0<? extends T> i) {
            this.G = g;
            this.H = h;
            this.I = i;
            this.J = j;
        }
        
        void a() {
            if (this.getAndIncrement() == 0) {
                int addAndGet = 1;
                do {
                    this.I.c(this);
                } while ((addAndGet = this.addAndGet(-addAndGet)) != 0);
            }
        }
        
        @Override
        public void b(final Throwable t) {
            this.G.b(t);
        }
        
        @Override
        public void f() {
            try {
                if (this.J.a()) {
                    this.G.f();
                }
                else {
                    this.a();
                }
            }
            finally {
                final Throwable t;
                b.b(t);
                this.G.b(t);
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
