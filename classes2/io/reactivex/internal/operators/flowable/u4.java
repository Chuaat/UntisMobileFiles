// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.j;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import o7.d;
import io.reactivex.internal.subscribers.n;
import io.reactivex.processors.h;
import io.reactivex.q;
import io.reactivex.subscribers.e;
import o7.c;
import x5.o;
import o7.b;
import io.reactivex.l;

public final class u4<T, B, V> extends io.reactivex.internal.operators.flowable.a<T, l<T>>
{
    final o7.b<B> I;
    final o<? super B, ? extends o7.b<V>> J;
    final int K;
    
    public u4(final l<T> l, final o7.b<B> i, final o<? super B, ? extends o7.b<V>> j, final int k) {
        super(l);
        this.I = i;
        this.J = j;
        this.K = k;
    }
    
    @Override
    protected void n6(final o7.c<? super l<T>> c) {
        super.H.m6(new c<Object, Object, Object>((o7.c<? super l<? super T>>)new e((o7.c<? super Object>)c), this.I, this.J, this.K));
    }
    
    static final class a<T, V> extends io.reactivex.subscribers.b<V>
    {
        final u4.c<T, ?, V> H;
        final io.reactivex.processors.h<T> I;
        boolean J;
        
        a(final u4.c<T, ?, V> h, final io.reactivex.processors.h<T> i) {
            this.H = h;
            this.I = i;
        }
        
        public void b(final Throwable t) {
            if (this.J) {
                io.reactivex.plugins.a.Y(t);
                return;
            }
            this.J = true;
            this.H.s(t);
        }
        
        public void f() {
            if (this.J) {
                return;
            }
            this.J = true;
            this.H.q(this);
        }
        
        public void m(final V v) {
            this.a();
            this.f();
        }
    }
    
    static final class b<T, B> extends io.reactivex.subscribers.b<B>
    {
        final u4.c<T, B, ?> H;
        
        b(final u4.c<T, B, ?> h) {
            this.H = h;
        }
        
        public void b(final Throwable t) {
            this.H.s(t);
        }
        
        public void f() {
            this.H.f();
        }
        
        public void m(final B b) {
            this.H.t(b);
        }
    }
    
    static final class c<T, B, V> extends n<T, Object, l<T>> implements o7.d
    {
        final o7.b<B> G0;
        final x5.o<? super B, ? extends o7.b<V>> H0;
        final int I0;
        final io.reactivex.disposables.b J0;
        o7.d K0;
        final AtomicReference<io.reactivex.disposables.c> L0;
        final List<io.reactivex.processors.h<T>> M0;
        final AtomicLong N0;
        final AtomicBoolean O0;
        
        c(final o7.c<? super l<T>> c, final o7.b<B> g0, final x5.o<? super B, ? extends o7.b<V>> h0, final int i0) {
            super(c, new io.reactivex.internal.queue.a());
            this.L0 = new AtomicReference<io.reactivex.disposables.c>();
            final AtomicLong n0 = new AtomicLong();
            this.N0 = n0;
            this.O0 = new AtomicBoolean();
            this.G0 = g0;
            this.H0 = h0;
            this.I0 = i0;
            this.J0 = new io.reactivex.disposables.b();
            this.M0 = new ArrayList<io.reactivex.processors.h<T>>();
            n0.lazySet(1L);
        }
        
        public void b(final Throwable f0) {
            if (super.E0) {
                io.reactivex.plugins.a.Y(f0);
                return;
            }
            super.F0 = f0;
            super.E0 = true;
            if (this.e()) {
                this.r();
            }
            if (this.N0.decrementAndGet() == 0L) {
                this.J0.dispose();
            }
            super.B0.b(f0);
        }
        
        public void cancel() {
            if (this.O0.compareAndSet(false, true)) {
                io.reactivex.internal.disposables.d.b(this.L0);
                if (this.N0.decrementAndGet() == 0L) {
                    this.K0.cancel();
                }
            }
        }
        
        void dispose() {
            this.J0.dispose();
            io.reactivex.internal.disposables.d.b(this.L0);
        }
        
        public void f() {
            if (super.E0) {
                return;
            }
            super.E0 = true;
            if (this.e()) {
                this.r();
            }
            if (this.N0.decrementAndGet() == 0L) {
                this.J0.dispose();
            }
            super.B0.f();
        }
        
        @Override
        public boolean j(final o7.c<? super l<T>> c, final Object o) {
            return false;
        }
        
        public void m(final T t) {
            if (super.E0) {
                return;
            }
            if (this.l()) {
                final Iterator<io.reactivex.processors.h<T>> iterator = this.M0.iterator();
                while (iterator.hasNext()) {
                    iterator.next().m(t);
                }
                if (this.h(-1) == 0) {
                    return;
                }
            }
            else {
                super.C0.offer(io.reactivex.internal.util.q.y(t));
                if (!this.e()) {
                    return;
                }
            }
            this.r();
        }
        
        void q(final a<T, V> a) {
            this.J0.c(a);
            super.C0.offer(new d<T, Object>(a.I, null));
            if (this.e()) {
                this.r();
            }
        }
        
        void r() {
            final y5.n<B> c0 = (y5.n<B>)super.C0;
            final o7.c<? super V> b0 = (o7.c<? super V>)super.B0;
            final List<io.reactivex.processors.h<T>> m0 = this.M0;
            int h = 1;
            while (true) {
                final boolean e0 = super.E0;
                final B poll = c0.poll();
                final boolean b2 = poll == null;
                if (e0 && b2) {
                    this.dispose();
                    final Throwable f0 = super.F0;
                    if (f0 != null) {
                        final Iterator<io.reactivex.processors.h<T>> iterator = m0.iterator();
                        while (iterator.hasNext()) {
                            iterator.next().b(f0);
                        }
                    }
                    else {
                        final Iterator<io.reactivex.processors.h<T>> iterator2 = m0.iterator();
                        while (iterator2.hasNext()) {
                            iterator2.next().f();
                        }
                    }
                    m0.clear();
                    return;
                }
                if (b2) {
                    if ((h = this.h(-h)) == 0) {
                        return;
                    }
                    continue;
                }
                else if (poll instanceof d) {
                    final d d = (d)poll;
                    final io.reactivex.processors.h<T> a = d.a;
                    if (a != null) {
                        if (!m0.remove(a)) {
                            continue;
                        }
                        d.a.f();
                        if (this.N0.decrementAndGet() == 0L) {
                            this.dispose();
                            return;
                        }
                        continue;
                    }
                    else {
                        if (this.O0.get()) {
                            continue;
                        }
                        final io.reactivex.processors.h<Object> w8 = io.reactivex.processors.h.W8(this.I0);
                        final long d2 = this.d();
                        final io.reactivex.exceptions.c c2;
                        Label_0392: {
                            if (d2 != 0L) {
                                m0.add((io.reactivex.processors.h<T>)w8);
                                b0.m((Object)w8);
                                if (d2 != Long.MAX_VALUE) {
                                    this.k(1L);
                                }
                                try {
                                    final o7.b b3 = io.reactivex.internal.functions.b.g((o7.b)this.H0.apply((Object)d.b), "The publisher supplied is null");
                                    final a a2 = new a<Object, Object>((c<Object, ?, Object>)this, w8);
                                    if (this.J0.b(a2)) {
                                        this.N0.getAndIncrement();
                                        b3.e((o7.c)a2);
                                        continue;
                                    }
                                    continue;
                                }
                                finally {
                                    this.cancel();
                                    break Label_0392;
                                }
                            }
                            this.cancel();
                            c2 = new io.reactivex.exceptions.c("Could not deliver new window due to lack of requests");
                        }
                        b0.b((Throwable)c2);
                    }
                }
                else {
                    final Iterator<io.reactivex.processors.h<T>> iterator3 = m0.iterator();
                    while (iterator3.hasNext()) {
                        iterator3.next().m(io.reactivex.internal.util.q.o(poll));
                    }
                }
            }
        }
        
        void s(final Throwable t) {
            this.K0.cancel();
            this.J0.dispose();
            io.reactivex.internal.disposables.d.b(this.L0);
            super.B0.b(t);
        }
        
        void t(final B b) {
            super.C0.offer(new d<Object, B>(null, b));
            if (this.e()) {
                this.r();
            }
        }
        
        public void v(final long n) {
            this.p(n);
        }
        
        public void z(final o7.d k0) {
            if (j.o(this.K0, k0)) {
                this.K0 = k0;
                super.B0.z((o7.d)this);
                if (this.O0.get()) {
                    return;
                }
                final b<Object, Object> newValue = new b<Object, Object>((c<Object, Object, ?>)this);
                if (this.L0.compareAndSet(null, newValue)) {
                    k0.v(Long.MAX_VALUE);
                    this.G0.e((o7.c)newValue);
                }
            }
        }
    }
    
    static final class d<T, B>
    {
        final io.reactivex.processors.h<T> a;
        final B b;
        
        d(final io.reactivex.processors.h<T> a, final B b) {
            this.a = a;
            this.b = b;
        }
    }
}
