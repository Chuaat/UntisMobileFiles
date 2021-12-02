// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.j;
import o7.d;
import io.reactivex.q;
import java.util.concurrent.atomic.AtomicBoolean;
import io.reactivex.exceptions.a;
import o7.c;
import x5.g;
import o7.b;
import x5.o;
import java.util.concurrent.Callable;
import io.reactivex.l;

public final class r4<T, D> extends l<T>
{
    final Callable<? extends D> H;
    final o<? super D, ? extends b<? extends T>> I;
    final g<? super D> J;
    final boolean K;
    
    public r4(final Callable<? extends D> h, final o<? super D, ? extends b<? extends T>> i, final g<? super D> j, final boolean k) {
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
    }
    
    public void n6(final c<? super T> c) {
        try {
            final D call = (D)this.H.call();
            try {
                io.reactivex.internal.functions.b.g((b)this.I.apply((Object)call), "The sourceSupplier returned a null Publisher").e((c)new a((o7.c<? super Object>)c, call, (g<? super Object>)this.J, this.K));
            }
            finally {
                final Throwable t;
                io.reactivex.exceptions.b.b(t);
                try {
                    this.J.accept((Object)call);
                    io.reactivex.internal.subscriptions.g.d(t, c);
                }
                finally {
                    final Throwable t2;
                    io.reactivex.exceptions.b.b(t2);
                    io.reactivex.internal.subscriptions.g.d(new io.reactivex.exceptions.a(new Throwable[] { t, t2 }), c);
                }
            }
        }
        finally {
            final Throwable t3;
            io.reactivex.exceptions.b.b(t3);
            io.reactivex.internal.subscriptions.g.d(t3, c);
        }
    }
    
    static final class a<T, D> extends AtomicBoolean implements q<T>, d
    {
        private static final long L = 5904473792286235046L;
        final c<? super T> G;
        final D H;
        final g<? super D> I;
        final boolean J;
        d K;
        
        a(final c<? super T> g, final D h, final g<? super D> i, final boolean j) {
            this.G = g;
            this.H = h;
            this.I = i;
            this.J = j;
        }
        
        void a() {
            if (this.compareAndSet(false, true)) {
                try {
                    this.I.accept((Object)this.H);
                }
                finally {
                    final Throwable t;
                    io.reactivex.exceptions.b.b(t);
                    io.reactivex.plugins.a.Y(t);
                }
            }
        }
        
        public void b(final Throwable t) {
            if (this.J) {
                final Throwable t2 = null;
                if (this.compareAndSet(false, true)) {
                    try {
                        this.I.accept((Object)this.H);
                    }
                    finally {
                        io.reactivex.exceptions.b.b(t2);
                    }
                }
                this.K.cancel();
                if (t2 != null) {
                    this.G.b((Throwable)new io.reactivex.exceptions.a(new Throwable[] { t, t2 }));
                }
                else {
                    this.G.b(t);
                }
            }
            else {
                this.G.b(t);
                this.K.cancel();
                this.a();
            }
        }
        
        public void cancel() {
            this.a();
            this.K.cancel();
        }
        
        public void f() {
            if (this.J) {
                if (this.compareAndSet(false, true)) {
                    try {
                        this.I.accept((Object)this.H);
                    }
                    finally {
                        final Throwable t;
                        io.reactivex.exceptions.b.b(t);
                        this.G.b(t);
                        return;
                    }
                }
                this.K.cancel();
                this.G.f();
            }
            else {
                this.G.f();
                this.K.cancel();
                this.a();
            }
        }
        
        public void m(final T t) {
            this.G.m((Object)t);
        }
        
        public void v(final long n) {
            this.K.v(n);
        }
        
        @Override
        public void z(final d k) {
            if (j.o(this.K, k)) {
                this.K = k;
                this.G.z((d)this);
            }
        }
    }
}
