// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.q;
import java.util.concurrent.atomic.AtomicInteger;
import o7.b;
import io.reactivex.internal.subscriptions.i;
import o7.c;
import io.reactivex.l;
import x5.d;

public final class e3<T> extends io.reactivex.internal.operators.flowable.a<T, T>
{
    final d<? super Integer, ? super Throwable> I;
    
    public e3(final l<T> l, final d<? super Integer, ? super Throwable> i) {
        super(l);
        this.I = i;
    }
    
    public void n6(final c<? super T> c) {
        final i i = new i(false);
        c.z((o7.d)i);
        new a((o7.c<? super Object>)c, this.I, i, (o7.b<?>)super.H).a();
    }
    
    static final class a<T> extends AtomicInteger implements q<T>
    {
        private static final long M = -7098360935104053232L;
        final c<? super T> G;
        final i H;
        final b<? extends T> I;
        final d<? super Integer, ? super Throwable> J;
        int K;
        long L;
        
        a(final c<? super T> g, final d<? super Integer, ? super Throwable> j, final i h, final b<? extends T> i) {
            this.G = g;
            this.H = h;
            this.I = i;
            this.J = j;
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
        public void z(final o7.d d) {
            this.H.j(d);
        }
    }
}
