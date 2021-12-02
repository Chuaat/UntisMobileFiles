// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.parallel;

import io.reactivex.internal.subscriptions.j;
import o7.d;
import org.reactivestreams.Subscriber;
import io.reactivex.parallel.a;
import x5.c;
import x5.r;
import io.reactivex.parallel.b;

public final class e<T> extends io.reactivex.parallel.b<T>
{
    final io.reactivex.parallel.b<T> a;
    final r<? super T> b;
    final x5.c<? super Long, ? super Throwable, a> c;
    
    public e(final io.reactivex.parallel.b<T> a, final r<? super T> b, final x5.c<? super Long, ? super Throwable, a> c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public int F() {
        return this.a.F();
    }
    
    @Override
    public void Q(final Subscriber<? super T>[] array) {
        if (!this.U((o7.c[])array)) {
            return;
        }
        final int length = array.length;
        final o7.c[] array2 = new o7.c[length];
        for (int i = 0; i < length; ++i) {
            final Subscriber<? super T> subscriber = array[i];
            if (subscriber instanceof y5.a) {
                array2[i] = (o7.c)new c((y5.a<? super Object>)subscriber, (r<? super Object>)this.b, this.c);
            }
            else {
                array2[i] = (o7.c)new d((o7.c<? super Object>)subscriber, (r<? super Object>)this.b, this.c);
            }
        }
        this.a.Q(array2);
    }
    
    abstract static class b<T> implements a<T>, o7.d
    {
        final r<? super T> G;
        final x5.c<? super Long, ? super Throwable, io.reactivex.parallel.a> H;
        o7.d I;
        boolean J;
        
        b(final r<? super T> g, final x5.c<? super Long, ? super Throwable, io.reactivex.parallel.a> h) {
            this.G = g;
            this.H = h;
        }
        
        public final void cancel() {
            this.I.cancel();
        }
        
        public final void m(final T t) {
            if (!this.B(t) && !this.J) {
                this.I.v(1L);
            }
        }
        
        public final void v(final long n) {
            this.I.v(n);
        }
    }
    
    static final class c<T> extends b<T>
    {
        final a<? super T> K;
        
        c(final a<? super T> k, final r<? super T> r, final x5.c<? super Long, ? super Throwable, io.reactivex.parallel.a> c) {
            super(r, c);
            this.K = k;
        }
        
        @Override
        public boolean B(final T t) {
            final boolean j = super.J;
            final boolean b = false;
            if (!j) {
                long l = 0L;
                while (true) {
                    try {
                        final boolean a = super.G.a(t);
                        boolean b2 = b;
                        if (a) {
                            b2 = b;
                            if (this.K.B((Object)t)) {
                                b2 = true;
                            }
                        }
                        return b2;
                    }
                    finally {
                        final Throwable t2;
                        io.reactivex.exceptions.b.b(t2);
                        try {
                            final x5.c<? super Long, ? super Throwable, io.reactivex.parallel.a> h = (x5.c<? super Long, ? super Throwable, io.reactivex.parallel.a>)super.H;
                            ++l;
                            final int n = e$a.a[io.reactivex.internal.functions.b.g(h.b(l, t2), "The errorHandler returned a null item").ordinal()];
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
                        }
                    }
                    break;
                }
            }
            return false;
        }
        
        public void b(final Throwable t) {
            if (super.J) {
                io.reactivex.plugins.a.Y(t);
                return;
            }
            super.J = true;
            ((o7.c)this.K).b(t);
        }
        
        public void f() {
            if (!super.J) {
                super.J = true;
                ((o7.c)this.K).f();
            }
        }
        
        public void z(final o7.d i) {
            if (j.o(super.I, i)) {
                super.I = i;
                this.K.z((o7.d)this);
            }
        }
    }
    
    static final class d<T> extends b<T>
    {
        final o7.c<? super T> K;
        
        d(final o7.c<? super T> k, final r<? super T> r, final x5.c<? super Long, ? super Throwable, io.reactivex.parallel.a> c) {
            super(r, c);
            this.K = k;
        }
        
        @Override
        public boolean B(final T t) {
            if (!super.J) {
                long l = 0L;
                while (true) {
                    try {
                        if (super.G.a(t)) {
                            this.K.m((Object)t);
                            return true;
                        }
                        return false;
                    }
                    finally {
                        final Throwable t2;
                        io.reactivex.exceptions.b.b(t2);
                        try {
                            final x5.c<? super Long, ? super Throwable, io.reactivex.parallel.a> h = (x5.c<? super Long, ? super Throwable, io.reactivex.parallel.a>)super.H;
                            ++l;
                            final int n = e$a.a[io.reactivex.internal.functions.b.g(h.b(l, t2), "The errorHandler returned a null item").ordinal()];
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
                        }
                    }
                    break;
                }
            }
            return false;
        }
        
        public void b(final Throwable t) {
            if (super.J) {
                io.reactivex.plugins.a.Y(t);
                return;
            }
            super.J = true;
            this.K.b(t);
        }
        
        public void f() {
            if (!super.J) {
                super.J = true;
                this.K.f();
            }
        }
        
        public void z(final o7.d i) {
            if (j.o(super.I, i)) {
                super.I = i;
                this.K.z((o7.d)this);
            }
        }
    }
}
