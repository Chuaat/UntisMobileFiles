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
import x5.r;

public final class f3<T> extends io.reactivex.internal.operators.flowable.a<T, T>
{
    final r<? super Throwable> I;
    final long J;
    
    public f3(final l<T> l, final long j, final r<? super Throwable> i) {
        super(l);
        this.I = i;
        this.J = j;
    }
    
    public void n6(final c<? super T> c) {
        final i i = new i(false);
        c.z((d)i);
        new a((o7.c<? super Object>)c, this.J, this.I, i, (o7.b<?>)super.H).a();
    }
    
    static final class a<T> extends AtomicInteger implements q<T>
    {
        private static final long M = -7098360935104053232L;
        final c<? super T> G;
        final i H;
        final b<? extends T> I;
        final r<? super Throwable> J;
        long K;
        long L;
        
        a(final c<? super T> g, final long k, final r<? super Throwable> j, final i h, final b<? extends T> i) {
            this.G = g;
            this.H = h;
            this.I = i;
            this.J = j;
            this.K = k;
        }
        
        void a() {
            if (this.getAndIncrement() == 0) {
                int addAndGet = 1;
                while (!this.H.g()) {
                    final long l = this.L;
                    if (l != 0L) {
                        this.L = 0L;
                        this.H.i(l);
                    }
                    this.I.e((c)this);
                    if ((addAndGet = this.addAndGet(-addAndGet)) == 0) {
                        return;
                    }
                }
            }
        }
        
        public void b(final Throwable t) {
            final long k = this.K;
            if (k != Long.MAX_VALUE) {
                this.K = k - 1L;
            }
            if (k == 0L) {
                this.G.b(t);
                return;
            }
            try {
                if (!this.J.a(t)) {
                    this.G.b(t);
                    return;
                }
                this.a();
            }
            finally {
                final Throwable t2;
                io.reactivex.exceptions.b.b(t2);
                this.G.b((Throwable)new io.reactivex.exceptions.a(new Throwable[] { t, t2 }));
            }
        }
        
        public void f() {
            this.G.f();
        }
        
        public void m(final T t) {
            ++this.L;
            this.G.m((Object)t);
        }
        
        @Override
        public void z(final d d) {
            this.H.j(d);
        }
    }
}
