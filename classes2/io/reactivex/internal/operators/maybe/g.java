// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.subscriptions.j;
import io.reactivex.internal.util.q;
import io.reactivex.internal.disposables.h;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicLong;
import io.reactivex.v;
import java.util.concurrent.atomic.AtomicInteger;
import o7.d;
import io.reactivex.internal.functions.b;
import java.util.Iterator;
import o7.c;
import io.reactivex.y;
import io.reactivex.l;

public final class g<T> extends l<T>
{
    final Iterable<? extends y<? extends T>> H;
    
    public g(final Iterable<? extends y<? extends T>> h) {
        this.H = h;
    }
    
    @Override
    protected void n6(final c<? super T> c) {
        try {
            final a a = new a((c<? super T>)c, (Iterator<? extends y<? extends T>>)b.g(this.H.iterator(), "The sources Iterable returned a null Iterator"));
            c.z((d)a);
            a.a();
        }
        finally {
            final Throwable t;
            io.reactivex.exceptions.b.b(t);
            io.reactivex.internal.subscriptions.g.d(t, c);
        }
    }
    
    static final class a<T> extends AtomicInteger implements v<T>, d
    {
        private static final long M = 3520831347801429610L;
        final c<? super T> G;
        final AtomicLong H;
        final AtomicReference<Object> I;
        final h J;
        final Iterator<? extends y<? extends T>> K;
        long L;
        
        a(final c<? super T> g, final Iterator<? extends y<? extends T>> k) {
            this.G = g;
            this.K = k;
            this.H = new AtomicLong();
            this.J = new h();
            this.I = new AtomicReference<Object>(q.G);
        }
        
        void a() {
            if (this.getAndIncrement() != 0) {
                return;
            }
            final AtomicReference<Object> i = this.I;
            final c<? super T> g = this.G;
            final h j = this.J;
            while (!j.i()) {
                final q value = i.get();
                Label_0193: {
                    if (value != null) {
                        final q g2 = q.G;
                        boolean b = true;
                        if (value != g2) {
                            final long l = this.L;
                            if (l != this.H.get()) {
                                this.L = l + 1L;
                                i.lazySet(null);
                                g.m((Object)value);
                            }
                            else {
                                b = false;
                            }
                        }
                        else {
                            i.lazySet(null);
                        }
                        if (b && !j.i()) {
                            try {
                                if (this.K.hasNext()) {
                                    io.reactivex.internal.functions.b.g((y)this.K.next(), "The source Iterator returned a null MaybeSource").c(this);
                                    break Label_0193;
                                }
                            }
                            finally {
                                io.reactivex.exceptions.b.b((Throwable)j);
                                g.b((Throwable)j);
                                return;
                            }
                            g.f();
                        }
                    }
                }
                if (this.decrementAndGet() == 0) {
                    return;
                }
            }
            i.lazySet(null);
        }
        
        @Override
        public void b(final Throwable t) {
            this.G.b(t);
        }
        
        public void cancel() {
            this.J.dispose();
        }
        
        @Override
        public void d(final T newValue) {
            this.I.lazySet(newValue);
            this.a();
        }
        
        @Override
        public void f() {
            this.I.lazySet(q.G);
            this.a();
        }
        
        @Override
        public void l(final io.reactivex.disposables.c c) {
            this.J.a(c);
        }
        
        public void v(final long n) {
            if (j.m(n)) {
                io.reactivex.internal.util.d.a(this.H, n);
                this.a();
            }
        }
    }
}
