// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.parallel;

import io.reactivex.internal.subscriptions.j;
import o7.c;
import org.reactivestreams.Subscriber;
import x5.q;
import o7.d;
import x5.a;
import x5.g;
import io.reactivex.parallel.b;

public final class l<T> extends b<T>
{
    final b<T> a;
    final g<? super T> b;
    final g<? super T> c;
    final g<? super Throwable> d;
    final x5.a e;
    final x5.a f;
    final g<? super d> g;
    final q h;
    final x5.a i;
    
    public l(final b<T> a, final g<? super T> g, final g<? super T> g2, final g<? super Throwable> g3, final x5.a a2, final x5.a a3, final g<? super d> g4, final q q, final x5.a a4) {
        this.a = a;
        this.b = io.reactivex.internal.functions.b.g(g, "onNext is null");
        this.c = io.reactivex.internal.functions.b.g(g2, "onAfterNext is null");
        this.d = io.reactivex.internal.functions.b.g(g3, "onError is null");
        this.e = io.reactivex.internal.functions.b.g(a2, "onComplete is null");
        this.f = io.reactivex.internal.functions.b.g(a3, "onAfterTerminated is null");
        this.g = io.reactivex.internal.functions.b.g(g4, "onSubscribe is null");
        this.h = io.reactivex.internal.functions.b.g(q, "onRequest is null");
        this.i = io.reactivex.internal.functions.b.g(a4, "onCancel is null");
    }
    
    @Override
    public int F() {
        return this.a.F();
    }
    
    @Override
    public void Q(final Subscriber<? super T>[] array) {
        if (!this.U((c[])array)) {
            return;
        }
        final int length = array.length;
        final c[] array2 = new c[length];
        for (int i = 0; i < length; ++i) {
            array2[i] = (c)new a((o7.c<? super Object>)array[i], (l<Object>)this);
        }
        this.a.Q(array2);
    }
    
    static final class a<T> implements q<T>, d
    {
        final c<? super T> G;
        final l<T> H;
        d I;
        boolean J;
        
        a(final c<? super T> g, final l<T> h) {
            this.G = g;
            this.H = h;
        }
        
        public void b(final Throwable t) {
            if (this.J) {
                io.reactivex.plugins.a.Y(t);
                return;
            }
            this.J = true;
            io.reactivex.exceptions.a a = null;
            try {
                this.H.d.accept(t);
            }
            finally {
                final Throwable t2;
                io.reactivex.exceptions.b.b(t2);
                a = new io.reactivex.exceptions.a(new Throwable[] { t, t2 });
            }
            this.G.b((Throwable)a);
            try {
                this.H.f.run();
            }
            finally {
                io.reactivex.exceptions.b.b(t);
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        public void cancel() {
            try {
                this.H.i.run();
            }
            finally {
                final Throwable t;
                io.reactivex.exceptions.b.b(t);
                io.reactivex.plugins.a.Y(t);
            }
            this.I.cancel();
        }
        
        public void f() {
            if (!this.J) {
                this.J = true;
                try {
                    this.H.e.run();
                    this.G.f();
                    try {
                        this.H.f.run();
                    }
                    finally {
                        final Throwable t;
                        io.reactivex.exceptions.b.b(t);
                        io.reactivex.plugins.a.Y(t);
                    }
                }
                finally {
                    final Throwable t2;
                    io.reactivex.exceptions.b.b(t2);
                    this.G.b(t2);
                }
            }
        }
        
        public void m(final T t) {
            if (!this.J) {
                try {
                    this.H.b.accept((Object)t);
                    this.G.m((Object)t);
                    try {
                        this.H.c.accept((Object)t);
                    }
                    finally {}
                }
                finally {
                    final Throwable t2;
                    io.reactivex.exceptions.b.b(t2);
                    this.b(t2);
                }
            }
        }
        
        public void v(final long n) {
            try {
                this.H.h.a(n);
            }
            finally {
                final Throwable t;
                io.reactivex.exceptions.b.b(t);
                io.reactivex.plugins.a.Y(t);
            }
            this.I.v(n);
        }
        
        @Override
        public void z(final d i) {
            if (j.o(this.I, i)) {
                this.I = i;
                try {
                    this.H.g.accept(i);
                    this.G.z((d)this);
                }
                finally {
                    final Throwable t;
                    io.reactivex.exceptions.b.b(t);
                    i.cancel();
                    this.G.z((d)io.reactivex.internal.subscriptions.g.G);
                    this.b(t);
                }
            }
        }
    }
}
