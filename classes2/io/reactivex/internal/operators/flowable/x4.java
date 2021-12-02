// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.j;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.q;
import o7.d;
import io.reactivex.subscribers.e;
import io.reactivex.l;
import o7.b;
import x5.c;

public final class x4<T, U, R> extends io.reactivex.internal.operators.flowable.a<T, R>
{
    final c<? super T, ? super U, ? extends R> I;
    final o7.b<? extends U> J;
    
    public x4(final l<T> l, final c<? super T, ? super U, ? extends R> i, final o7.b<? extends U> j) {
        super(l);
        this.I = i;
        this.J = j;
    }
    
    @Override
    protected void n6(final o7.c<? super R> c) {
        final e e = new e<Object>((o7.c<? super Object>)c);
        final b b = new b((o7.c<? super Object>)e, (c<? super Object, ? super Object, ?>)this.I);
        e.z((d)b);
        this.J.e((o7.c)new a((b<T, U, R>)b));
        super.H.m6(b);
    }
    
    final class a implements q<U>
    {
        private final b<T, U, R> G;
        
        a(final b<T, U, R> g) {
            this.G = g;
        }
        
        public void b(final Throwable t) {
            this.G.a(t);
        }
        
        public void f() {
        }
        
        public void m(final U newValue) {
            this.G.lazySet((U)newValue);
        }
        
        @Override
        public void z(final d d) {
            if (this.G.c(d)) {
                d.v(Long.MAX_VALUE);
            }
        }
    }
    
    static final class b<T, U, R> extends AtomicReference<U> implements y5.a<T>, d
    {
        private static final long L = -312246233408980075L;
        final o7.c<? super R> G;
        final c<? super T, ? super U, ? extends R> H;
        final AtomicReference<d> I;
        final AtomicLong J;
        final AtomicReference<d> K;
        
        b(final o7.c<? super R> g, final c<? super T, ? super U, ? extends R> h) {
            this.I = new AtomicReference<d>();
            this.J = new AtomicLong();
            this.K = new AtomicReference<d>();
            this.G = g;
            this.H = h;
        }
        
        @Override
        public boolean B(final T t) {
            final Object value = this.get();
            if (value != null) {
                try {
                    this.G.m(io.reactivex.internal.functions.b.g((Object)this.H.b((Object)t, (Object)value), "The combiner returned a null value"));
                    return true;
                }
                finally {
                    final Throwable t2;
                    io.reactivex.exceptions.b.b(t2);
                    this.cancel();
                    this.G.b(t2);
                }
            }
            return false;
        }
        
        public void a(final Throwable t) {
            j.b(this.I);
            this.G.b(t);
        }
        
        public void b(final Throwable t) {
            j.b(this.K);
            this.G.b(t);
        }
        
        public boolean c(final d d) {
            return j.k(this.K, d);
        }
        
        public void cancel() {
            j.b(this.I);
            j.b(this.K);
        }
        
        public void f() {
            j.b(this.K);
            this.G.f();
        }
        
        public void m(final T t) {
            if (!this.B(t)) {
                this.I.get().v(1L);
            }
        }
        
        public void v(final long n) {
            j.d(this.I, this.J, n);
        }
        
        public void z(final d d) {
            j.f(this.I, this.J, d);
        }
    }
}
