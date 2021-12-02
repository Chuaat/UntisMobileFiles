// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.d;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.disposables.c;
import io.reactivex.observers.m;
import io.reactivex.i0;
import io.reactivex.g0;

public final class w2<T> extends io.reactivex.internal.operators.observable.a<T, T>
{
    final g0<?> H;
    final boolean I;
    
    public w2(final g0<T> g0, final g0<?> h, final boolean i) {
        super(g0);
        this.H = h;
        this.I = i;
    }
    
    public void L5(final i0<? super T> i0) {
        final m<Object> m = new m<Object>((i0<? super Object>)i0);
        Object o;
        io.reactivex.disposables.c c;
        if (this.I) {
            o = super.G;
            c = new a<Object>(m, this.H);
        }
        else {
            o = super.G;
            c = new b<Object>(m, this.H);
        }
        ((g0)o).c((i0)c);
    }
    
    static final class a<T> extends c<T>
    {
        private static final long N = -3029755663834015785L;
        final AtomicInteger L;
        volatile boolean M;
        
        a(final i0<? super T> i0, final g0<?> g0) {
            super(i0, g0);
            this.L = new AtomicInteger();
        }
        
        @Override
        void c() {
            this.M = true;
            if (this.L.getAndIncrement() == 0) {
                this.d();
                super.G.f();
            }
        }
        
        @Override
        void g() {
            if (this.L.getAndIncrement() == 0) {
                do {
                    final boolean m = this.M;
                    this.d();
                    if (m) {
                        super.G.f();
                    }
                } while (this.L.decrementAndGet() != 0);
            }
        }
    }
    
    static final class b<T> extends c<T>
    {
        private static final long L = -3029755663834015785L;
        
        b(final i0<? super T> i0, final g0<?> g0) {
            super(i0, g0);
        }
        
        @Override
        void c() {
            super.G.f();
        }
        
        @Override
        void g() {
            this.d();
        }
    }
    
    abstract static class c<T> extends AtomicReference<T> implements i0<T>, io.reactivex.disposables.c
    {
        private static final long K = -3517602651313910099L;
        final i0<? super T> G;
        final g0<?> H;
        final AtomicReference<io.reactivex.disposables.c> I;
        io.reactivex.disposables.c J;
        
        c(final i0<? super T> g, final g0<?> h) {
            this.I = new AtomicReference<io.reactivex.disposables.c>();
            this.G = g;
            this.H = h;
        }
        
        public void a() {
            this.J.dispose();
            this.c();
        }
        
        @Override
        public void b(final Throwable t) {
            io.reactivex.internal.disposables.d.b(this.I);
            this.G.b(t);
        }
        
        abstract void c();
        
        void d() {
            final T andSet = this.getAndSet(null);
            if (andSet != null) {
                this.G.m((Object)andSet);
            }
        }
        
        @Override
        public void dispose() {
            io.reactivex.internal.disposables.d.b(this.I);
            this.J.dispose();
        }
        
        public void e(final Throwable t) {
            this.J.dispose();
            this.G.b(t);
        }
        
        @Override
        public void f() {
            io.reactivex.internal.disposables.d.b(this.I);
            this.c();
        }
        
        abstract void g();
        
        boolean h(final io.reactivex.disposables.c c) {
            return io.reactivex.internal.disposables.d.j(this.I, c);
        }
        
        @Override
        public boolean i() {
            return this.I.get() == io.reactivex.internal.disposables.d.G;
        }
        
        @Override
        public void l(final io.reactivex.disposables.c j) {
            if (io.reactivex.internal.disposables.d.l(this.J, j)) {
                this.J = j;
                this.G.l(this);
                if (this.I.get() == null) {
                    this.H.c(new d<Object>((c<?>)this));
                }
            }
        }
        
        @Override
        public void m(final T newValue) {
            this.lazySet(newValue);
        }
    }
    
    static final class d<T> implements i0<Object>
    {
        final c<T> G;
        
        d(final c<T> g) {
            this.G = g;
        }
        
        @Override
        public void b(final Throwable t) {
            this.G.e(t);
        }
        
        @Override
        public void f() {
            this.G.a();
        }
        
        @Override
        public void l(final io.reactivex.disposables.c c) {
            this.G.h(c);
        }
        
        @Override
        public void m(final Object o) {
            this.G.g();
        }
    }
}
