// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.parallel;

import io.reactivex.internal.subscriptions.j;
import o7.d;
import org.reactivestreams.Subscriber;
import io.reactivex.parallel.a;
import x5.c;
import x5.o;
import io.reactivex.parallel.b;

public final class k<T, R> extends io.reactivex.parallel.b<R>
{
    final io.reactivex.parallel.b<T> a;
    final o<? super T, ? extends R> b;
    final x5.c<? super Long, ? super Throwable, a> c;
    
    public k(final io.reactivex.parallel.b<T> a, final o<? super T, ? extends R> b, final x5.c<? super Long, ? super Throwable, a> c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public int F() {
        return this.a.F();
    }
    
    @Override
    public void Q(final Subscriber<? super R>[] array) {
        if (!this.U((o7.c[])array)) {
            return;
        }
        final int length = array.length;
        final o7.c[] array2 = new o7.c[length];
        for (int i = 0; i < length; ++i) {
            final Subscriber<? super R> subscriber = array[i];
            if (subscriber instanceof y5.a) {
                array2[i] = (o7.c)new b((y5.a<? super Object>)subscriber, (o<? super Object, ?>)this.b, this.c);
            }
            else {
                array2[i] = (o7.c)new c((o7.c<? super Object>)subscriber, (o<? super Object, ?>)this.b, this.c);
            }
        }
        this.a.Q(array2);
    }
    
    static final class b<T, R> implements a<T>, d
    {
        final a<? super R> G;
        final o<? super T, ? extends R> H;
        final x5.c<? super Long, ? super Throwable, io.reactivex.parallel.a> I;
        d J;
        boolean K;
        
        b(final a<? super R> g, final o<? super T, ? extends R> h, final x5.c<? super Long, ? super Throwable, io.reactivex.parallel.a> i) {
            this.G = g;
            this.H = h;
            this.I = i;
        }
        
        @Override
        public boolean B(final T t) {
            if (this.K) {
                return false;
            }
            long l = 0L;
            try {
                return this.G.B((Object)io.reactivex.internal.functions.b.g((Object)this.H.apply((Object)t), "The mapper returned a null value"));
            }
            finally {
                final Throwable t2;
                io.reactivex.exceptions.b.b(t2);
                try {
                    final x5.c<? super Long, ? super Throwable, io.reactivex.parallel.a> i = this.I;
                    ++l;
                    final int n = k$a.a[io.reactivex.internal.functions.b.g(i.b(l, t2), "The errorHandler returned a null item").ordinal()];
                    if (n != 1) {
                        if (n != 2) {
                            this.cancel();
                            if (n != 3) {
                                this.b(t2);
                                return false;
                            }
                            this.f();
                        }
                        return false;
                    }
                    return this.G.B((Object)io.reactivex.internal.functions.b.g((Object)this.H.apply((Object)t), "The mapper returned a null value"));
                }
                finally {
                    io.reactivex.exceptions.b.b((Throwable)t);
                    this.cancel();
                    this.b(new io.reactivex.exceptions.a(new Throwable[] { t2, (Throwable)t }));
                    return false;
                }
            }
        }
        
        public void b(final Throwable t) {
            if (this.K) {
                io.reactivex.plugins.a.Y(t);
                return;
            }
            this.K = true;
            ((o7.c)this.G).b(t);
        }
        
        public void cancel() {
            this.J.cancel();
        }
        
        public void f() {
            if (this.K) {
                return;
            }
            this.K = true;
            ((o7.c)this.G).f();
        }
        
        public void m(final T t) {
            if (!this.B(t) && !this.K) {
                this.J.v(1L);
            }
        }
        
        public void v(final long n) {
            this.J.v(n);
        }
        
        public void z(final d j) {
            if (j.o(this.J, j)) {
                this.J = j;
                this.G.z((d)this);
            }
        }
    }
    
    static final class c<T, R> implements a<T>, d
    {
        final o7.c<? super R> G;
        final o<? super T, ? extends R> H;
        final x5.c<? super Long, ? super Throwable, io.reactivex.parallel.a> I;
        d J;
        boolean K;
        
        c(final o7.c<? super R> g, final o<? super T, ? extends R> h, final x5.c<? super Long, ? super Throwable, io.reactivex.parallel.a> i) {
            this.G = g;
            this.H = h;
            this.I = i;
        }
        
        @Override
        public boolean B(final T t) {
            if (this.K) {
                return false;
            }
            long l = 0L;
            while (true) {
                try {
                    this.G.m(io.reactivex.internal.functions.b.g((Object)this.H.apply((Object)t), "The mapper returned a null value"));
                    return true;
                }
                finally {
                    final Throwable t2;
                    io.reactivex.exceptions.b.b(t2);
                    try {
                        final x5.c<? super Long, ? super Throwable, io.reactivex.parallel.a> i = this.I;
                        ++l;
                        final int n = k$a.a[io.reactivex.internal.functions.b.g(i.b(l, t2), "The errorHandler returned a null item").ordinal()];
                        if (n != 1) {
                            if (n != 2) {
                                this.cancel();
                                if (n != 3) {
                                    this.b(t2);
                                    return false;
                                }
                                this.f();
                            }
                            return false;
                        }
                        continue;
                    }
                    finally {
                        io.reactivex.exceptions.b.b((Throwable)t);
                        this.cancel();
                        this.b(new io.reactivex.exceptions.a(new Throwable[] { t2, (Throwable)t }));
                        return false;
                    }
                }
                break;
            }
        }
        
        public void b(final Throwable t) {
            if (this.K) {
                io.reactivex.plugins.a.Y(t);
                return;
            }
            this.K = true;
            this.G.b(t);
        }
        
        public void cancel() {
            this.J.cancel();
        }
        
        public void f() {
            if (this.K) {
                return;
            }
            this.K = true;
            this.G.f();
        }
        
        public void m(final T t) {
            if (!this.B(t) && !this.K) {
                this.J.v(1L);
            }
        }
        
        public void v(final long n) {
            this.J.v(n);
        }
        
        public void z(final d j) {
            if (j.o(this.J, j)) {
                this.J = j;
                this.G.z((d)this);
            }
        }
    }
}
