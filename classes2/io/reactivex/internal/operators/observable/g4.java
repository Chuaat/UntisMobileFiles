// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import java.util.Iterator;
import io.reactivex.internal.util.q;
import io.reactivex.internal.disposables.d;
import java.util.ArrayList;
import y5.n;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.disposables.b;
import io.reactivex.disposables.c;
import io.reactivex.internal.observers.v;
import io.reactivex.subjects.j;
import io.reactivex.observers.e;
import io.reactivex.observers.m;
import io.reactivex.i0;
import x5.o;
import io.reactivex.g0;
import io.reactivex.b0;

public final class g4<T, B, V> extends io.reactivex.internal.operators.observable.a<T, b0<T>>
{
    final g0<B> H;
    final o<? super B, ? extends g0<V>> I;
    final int J;
    
    public g4(final g0<T> g0, final g0<B> h, final o<? super B, ? extends g0<V>> i, final int j) {
        super(g0);
        this.H = h;
        this.I = i;
        this.J = j;
    }
    
    public void L5(final i0<? super b0<T>> i0) {
        super.G.c(new c<Object, Object, Object>(new m<Object>((i0<? super b0<? super T>>)i0), this.H, this.I, this.J));
    }
    
    static final class a<T, V> extends e<V>
    {
        final g4.c<T, ?, V> H;
        final j<T> I;
        boolean J;
        
        a(final g4.c<T, ?, V> h, final j<T> i) {
            this.H = h;
            this.I = i;
        }
        
        @Override
        public void b(final Throwable t) {
            if (this.J) {
                io.reactivex.plugins.a.Y(t);
                return;
            }
            this.J = true;
            this.H.r(t);
        }
        
        @Override
        public void f() {
            if (this.J) {
                return;
            }
            this.J = true;
            this.H.o(this);
        }
        
        @Override
        public void m(final V v) {
            this.dispose();
            this.f();
        }
    }
    
    static final class b<T, B> extends e<B>
    {
        final g4.c<T, B, ?> H;
        
        b(final g4.c<T, B, ?> h) {
            this.H = h;
        }
        
        @Override
        public void b(final Throwable t) {
            this.H.r(t);
        }
        
        @Override
        public void f() {
            this.H.f();
        }
        
        @Override
        public void m(final B b) {
            this.H.s(b);
        }
    }
    
    static final class c<T, B, V> extends v<T, Object, b0<T>> implements io.reactivex.disposables.c
    {
        final g0<B> q0;
        final o<? super B, ? extends g0<V>> r0;
        final int s0;
        final io.reactivex.disposables.b t0;
        io.reactivex.disposables.c u0;
        final AtomicReference<io.reactivex.disposables.c> v0;
        final List<j<T>> w0;
        final AtomicLong x0;
        final AtomicBoolean y0;
        
        c(final i0<? super b0<T>> i0, final g0<B> q0, final o<? super B, ? extends g0<V>> r0, final int s0) {
            super(i0, new io.reactivex.internal.queue.a());
            this.v0 = new AtomicReference<io.reactivex.disposables.c>();
            final AtomicLong x0 = new AtomicLong();
            this.x0 = x0;
            this.y0 = new AtomicBoolean();
            this.q0 = q0;
            this.r0 = r0;
            this.s0 = s0;
            this.t0 = new io.reactivex.disposables.b();
            this.w0 = new ArrayList<j<T>>();
            x0.lazySet(1L);
        }
        
        @Override
        public void b(final Throwable p) {
            if (super.o0) {
                io.reactivex.plugins.a.Y(p);
                return;
            }
            super.p0 = p;
            super.o0 = true;
            if (this.e()) {
                this.q();
            }
            if (this.x0.decrementAndGet() == 0L) {
                this.t0.dispose();
            }
            super.l0.b(p);
        }
        
        @Override
        public void dispose() {
            if (this.y0.compareAndSet(false, true)) {
                io.reactivex.internal.disposables.d.b(this.v0);
                if (this.x0.decrementAndGet() == 0L) {
                    this.u0.dispose();
                }
            }
        }
        
        @Override
        public void f() {
            if (super.o0) {
                return;
            }
            super.o0 = true;
            if (this.e()) {
                this.q();
            }
            if (this.x0.decrementAndGet() == 0L) {
                this.t0.dispose();
            }
            super.l0.f();
        }
        
        @Override
        public boolean i() {
            return this.y0.get();
        }
        
        @Override
        public void j(final i0<? super b0<T>> i0, final Object o) {
        }
        
        @Override
        public void l(final io.reactivex.disposables.c u0) {
            if (io.reactivex.internal.disposables.d.l(this.u0, u0)) {
                this.u0 = u0;
                super.l0.l(this);
                if (this.y0.get()) {
                    return;
                }
                final b<Object, Object> newValue = new b<Object, Object>((c<Object, Object, ?>)this);
                if (this.v0.compareAndSet(null, newValue)) {
                    this.q0.c((i0<? super B>)newValue);
                }
            }
        }
        
        @Override
        public void m(final T t) {
            if (this.d()) {
                final Iterator<j<T>> iterator = this.w0.iterator();
                while (iterator.hasNext()) {
                    iterator.next().m(t);
                }
                if (this.h(-1) == 0) {
                    return;
                }
            }
            else {
                super.m0.offer(q.y(t));
                if (!this.e()) {
                    return;
                }
            }
            this.q();
        }
        
        void o(final a<T, V> a) {
            this.t0.c(a);
            super.m0.offer(new d<T, Object>(a.I, null));
            if (this.e()) {
                this.q();
            }
        }
        
        void p() {
            this.t0.dispose();
            io.reactivex.internal.disposables.d.b(this.v0);
        }
        
        void q() {
            final io.reactivex.internal.queue.a a = (io.reactivex.internal.queue.a)super.m0;
            final i0<? super V> l0 = (i0<? super V>)super.l0;
            final List<j<T>> w0 = this.w0;
            int h = 1;
            while (true) {
                final boolean o0 = super.o0;
                final d poll = a.poll();
                final boolean b = poll == null;
                if (o0 && b) {
                    this.p();
                    final Throwable p0 = super.p0;
                    if (p0 != null) {
                        final Iterator<j<T>> iterator = w0.iterator();
                        while (iterator.hasNext()) {
                            iterator.next().b(p0);
                        }
                    }
                    else {
                        final Iterator<j<T>> iterator2 = w0.iterator();
                        while (iterator2.hasNext()) {
                            iterator2.next().f();
                        }
                    }
                    w0.clear();
                    return;
                }
                if (b) {
                    if ((h = this.h(-h)) == 0) {
                        return;
                    }
                    continue;
                }
                else if (poll instanceof d) {
                    final d d = (d)poll;
                    final j<T> a2 = d.a;
                    if (a2 != null) {
                        if (!w0.remove(a2)) {
                            continue;
                        }
                        d.a.f();
                        if (this.x0.decrementAndGet() == 0L) {
                            this.p();
                            return;
                        }
                        continue;
                    }
                    else {
                        if (this.y0.get()) {
                            continue;
                        }
                        final j<Object> r8 = j.r8(this.s0);
                        w0.add((j<T>)r8);
                        l0.m((j<T>)r8);
                        try {
                            final g0 g0 = io.reactivex.internal.functions.b.g((g0)this.r0.apply((Object)d.b), "The ObservableSource supplied is null");
                            final a a3 = new a<Object, Object>((c<Object, ?, Object>)this, r8);
                            if (!this.t0.b(a3)) {
                                continue;
                            }
                            this.x0.getAndIncrement();
                            g0.c(a3);
                        }
                        finally {
                            final Throwable t;
                            io.reactivex.exceptions.b.b(t);
                            this.y0.set(true);
                            l0.b(t);
                        }
                    }
                }
                else {
                    final Iterator<j<T>> iterator3 = w0.iterator();
                    while (iterator3.hasNext()) {
                        iterator3.next().m(q.o(poll));
                    }
                }
            }
        }
        
        void r(final Throwable t) {
            this.u0.dispose();
            this.t0.dispose();
            this.b(t);
        }
        
        void s(final B b) {
            super.m0.offer(new d<Object, B>(null, b));
            if (this.e()) {
                this.q();
            }
        }
    }
    
    static final class d<T, B>
    {
        final j<T> a;
        final B b;
        
        d(final j<T> a, final B b) {
            this.a = a;
            this.b = b;
        }
    }
}
