// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.q;
import java.util.concurrent.atomic.AtomicInteger;
import o7.b;
import o7.d;
import io.reactivex.internal.subscriptions.i;
import o7.c;
import io.reactivex.l;
import x5.e;

public final class b3<T> extends io.reactivex.internal.operators.flowable.a<T, T>
{
    final e I;
    
    public b3(final l<T> l, final e i) {
        super(l);
        this.I = i;
    }
    
    public void n6(final c<? super T> c) {
        final i i = new i(false);
        c.z((d)i);
        new a((o7.c<? super Object>)c, this.I, i, (o7.b<?>)super.H).a();
    }
    
    static final class a<T> extends AtomicInteger implements q<T>
    {
        private static final long L = -7098360935104053232L;
        final c<? super T> G;
        final i H;
        final b<? extends T> I;
        final e J;
        long K;
        
        a(final c<? super T> g, final e j, final i h, final b<? extends T> i) {
            this.G = g;
            this.H = h;
            this.I = i;
            this.J = j;
        }
        
        void a() {
            if (this.getAndIncrement() == 0) {
                int addAndGet = 1;
                while (!this.H.g()) {
                    final long k = this.K;
                    if (k != 0L) {
                        this.K = 0L;
                        this.H.i(k);
                    }
                    this.I.e((c)this);
                    if ((addAndGet = this.addAndGet(-addAndGet)) == 0) {
                        return;
                    }
                }
            }
        }
        
        public void b(final Throwable t) {
            this.G.b(t);
        }
        
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
                io.reactivex.exceptions.b.b(t);
                this.G.b(t);
            }
        }
        
        public void m(final T t) {
            ++this.K;
            this.G.m((Object)t);
        }
        
        @Override
        public void z(final d d) {
            this.H.j(d);
        }
    }
}
