// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.annotations.g;
import io.reactivex.f;
import o7.d;
import io.reactivex.disposables.b;
import io.reactivex.q;
import o7.c;
import io.reactivex.l;
import io.reactivex.i;
import x5.o;

public final class a1<T> extends io.reactivex.internal.operators.flowable.a<T, T>
{
    final o<? super T, ? extends i> I;
    final int J;
    final boolean K;
    
    public a1(final l<T> l, final o<? super T, ? extends i> i, final boolean k, final int j) {
        super(l);
        this.I = i;
        this.K = k;
        this.J = j;
    }
    
    @Override
    protected void n6(final c<? super T> c) {
        super.H.m6(new a<Object>((o7.c<? super T>)c, (o<? super T, ? extends i>)this.I, this.K, this.J));
    }
    
    static final class a<T> extends c<T> implements q<T>
    {
        private static final long P = 8443155186132538303L;
        final o7.c<? super T> H;
        final io.reactivex.internal.util.c I;
        final x5.o<? super T, ? extends i> J;
        final boolean K;
        final b L;
        final int M;
        d N;
        volatile boolean O;
        
        a(final o7.c<? super T> h, final x5.o<? super T, ? extends i> j, final boolean k, final int m) {
            this.H = h;
            this.J = j;
            this.K = k;
            this.I = new io.reactivex.internal.util.c();
            this.L = new b();
            this.M = m;
            this.lazySet(1);
        }
        
        public int E(final int n) {
            return n & 0x2;
        }
        
        public void b(Throwable c) {
            if (this.I.a(c)) {
                if (this.K) {
                    if (this.decrementAndGet() != 0) {
                        if (this.M != Integer.MAX_VALUE) {
                            this.N.v(1L);
                        }
                        return;
                    }
                }
                else {
                    this.cancel();
                    if (this.getAndSet(0) <= 0) {
                        return;
                    }
                }
                c = this.I.c();
                this.H.b(c);
            }
            else {
                io.reactivex.plugins.a.Y(c);
            }
        }
        
        public void cancel() {
            this.O = true;
            this.N.cancel();
            this.L.dispose();
        }
        
        public void clear() {
        }
        
        public void f() {
            if (this.decrementAndGet() == 0) {
                final Throwable c = this.I.c();
                if (c != null) {
                    this.H.b(c);
                }
                else {
                    this.H.f();
                }
            }
            else if (this.M != Integer.MAX_VALUE) {
                this.N.v(1L);
            }
        }
        
        void g(final a1.a.a a) {
            this.L.c(a);
            this.f();
        }
        
        void i(final a1.a.a a, final Throwable t) {
            this.L.c(a);
            this.b(t);
        }
        
        public boolean isEmpty() {
            return true;
        }
        
        public void m(final T t) {
            try {
                final i i = io.reactivex.internal.functions.b.g((i)this.J.apply((Object)t), "The mapper returned a null CompletableSource");
                this.getAndIncrement();
                final a1.a.a a = new a1.a.a();
                if (!this.O && this.L.b(a)) {
                    i.c(a);
                }
            }
            finally {
                final Throwable t2;
                io.reactivex.exceptions.b.b(t2);
                this.N.cancel();
                this.b(t2);
            }
        }
        
        @g
        public T poll() throws Exception {
            return null;
        }
        
        public void v(final long n) {
        }
        
        @Override
        public void z(final d n) {
            if (j.o(this.N, n)) {
                this.N = n;
                this.H.z((d)this);
                final int m = this.M;
                long n2;
                if (m == Integer.MAX_VALUE) {
                    n2 = Long.MAX_VALUE;
                }
                else {
                    n2 = m;
                }
                n.v(n2);
            }
        }
        
        final class a extends AtomicReference<io.reactivex.disposables.c> implements f, io.reactivex.disposables.c
        {
            private static final long H = 8606673141535671828L;
            
            @Override
            public void b(final Throwable t) {
                a1.a.this.i(this, t);
            }
            
            @Override
            public void dispose() {
                io.reactivex.internal.disposables.d.b(this);
            }
            
            @Override
            public void f() {
                a1.a.this.g(this);
            }
            
            @Override
            public boolean i() {
                return io.reactivex.internal.disposables.d.d(this.get());
            }
            
            @Override
            public void l(final io.reactivex.disposables.c c) {
                io.reactivex.internal.disposables.d.j(this, c);
            }
        }
    }
}
