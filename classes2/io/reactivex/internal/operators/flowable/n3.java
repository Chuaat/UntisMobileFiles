// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.j;
import y5.o;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.plugins.a;
import io.reactivex.l;
import io.reactivex.disposables.c;
import io.reactivex.n0;
import x5.d;
import y5.b;
import io.reactivex.k0;

public final class n3<T> extends k0<Boolean> implements b<Boolean>
{
    final o7.b<? extends T> G;
    final o7.b<? extends T> H;
    final d<? super T, ? super T> I;
    final int J;
    
    public n3(final o7.b<? extends T> g, final o7.b<? extends T> h, final d<? super T, ? super T> i, final int j) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
    }
    
    public void e1(final n0<? super Boolean> n0) {
        final a a = new a(n0, this.J, (d<? super Object, ? super Object>)this.I);
        n0.l(a);
        a.d(this.G, this.H);
    }
    
    @Override
    public l<Boolean> g() {
        return io.reactivex.plugins.a.P((l<Boolean>)new m3<Object>(this.G, this.H, this.I, this.J));
    }
    
    static final class a<T> extends AtomicInteger implements c, m3.b
    {
        private static final long N = -6178010334400373240L;
        final n0<? super Boolean> G;
        final d<? super T, ? super T> H;
        final m3.c<T> I;
        final m3.c<T> J;
        final io.reactivex.internal.util.c K;
        T L;
        T M;
        
        a(final n0<? super Boolean> g, final int n, final d<? super T, ? super T> h) {
            this.G = g;
            this.H = h;
            this.I = (m3.c<T>)new m3.c(this, n);
            this.J = (m3.c<T>)new m3.c(this, n);
            this.K = new io.reactivex.internal.util.c();
        }
        
        @Override
        public void a(final Throwable t) {
            if (this.K.a(t)) {
                this.c();
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        void b() {
            this.I.a();
            this.I.c();
            this.J.a();
            this.J.c();
        }
        
        @Override
        public void c() {
            if (this.getAndIncrement() != 0) {
                return;
            }
            int addAndGet = 1;
        Label_0511:
            do {
                final o<T> k = this.I.K;
                final o<T> i = this.J.K;
                Label_0455: {
                    if (k != null && i != null) {
                        while (!this.i()) {
                            if (this.K.get() != null) {
                                this.b();
                                this.G.b(this.K.c());
                                return;
                            }
                            final boolean l = this.I.L;
                            final T j;
                            if ((j = this.L) == null) {
                                try {
                                    this.L = k.poll();
                                }
                                finally {
                                    io.reactivex.exceptions.b.b((Throwable)j);
                                    this.b();
                                    this.K.a((Throwable)j);
                                    this.G.b(this.K.c());
                                    return;
                                }
                            }
                            boolean b = false;
                            final boolean b2 = j == null;
                            final boolean m = this.J.L;
                            T m2;
                            if ((m2 = this.M) == null) {
                                try {
                                    m2 = i.poll();
                                    this.M = m2;
                                }
                                finally {
                                    io.reactivex.exceptions.b.b((Throwable)j);
                                    this.b();
                                    this.K.a((Throwable)j);
                                    this.G.b(this.K.c());
                                    return;
                                }
                            }
                            if (m2 == null) {
                                b = true;
                            }
                            if (l && m && b2 && b) {
                                this.G.d(Boolean.TRUE);
                                return;
                            }
                            if (l && m && b2 != b) {
                                this.b();
                                this.G.d(Boolean.FALSE);
                                return;
                            }
                            if (b2) {
                                continue Label_0511;
                            }
                            if (b) {
                                continue Label_0511;
                            }
                            try {
                                if (!this.H.a((Object)j, (Object)m2)) {
                                    this.b();
                                    this.G.d(Boolean.FALSE);
                                    return;
                                }
                                this.L = null;
                                this.M = null;
                                this.I.d();
                                this.J.d();
                                continue;
                            }
                            finally {
                                final Throwable t;
                                io.reactivex.exceptions.b.b(t);
                                this.b();
                                this.K.a(t);
                                this.G.b(this.K.c());
                                return;
                            }
                            break Label_0455;
                        }
                        this.I.c();
                        this.J.c();
                        return;
                    }
                }
                if (this.i()) {
                    this.I.c();
                    this.J.c();
                    return;
                }
                if (this.K.get() != null) {
                    this.b();
                    this.G.b(this.K.c());
                }
            } while ((addAndGet = this.addAndGet(-addAndGet)) != 0);
        }
        
        void d(final o7.b<? extends T> b, final o7.b<? extends T> b2) {
            b.e((o7.c)this.I);
            b2.e((o7.c)this.J);
        }
        
        @Override
        public void dispose() {
            this.I.a();
            this.J.a();
            if (this.getAndIncrement() == 0) {
                this.I.c();
                this.J.c();
            }
        }
        
        @Override
        public boolean i() {
            return this.I.get() == j.G;
        }
    }
}
