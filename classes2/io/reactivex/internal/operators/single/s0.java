// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.single;

import java.util.concurrent.TimeoutException;
import io.reactivex.internal.util.k;
import io.reactivex.plugins.a;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.disposables.d;
import io.reactivex.disposables.c;
import io.reactivex.n0;
import io.reactivex.j0;
import java.util.concurrent.TimeUnit;
import io.reactivex.q0;
import io.reactivex.k0;

public final class s0<T> extends k0<T>
{
    final q0<T> G;
    final long H;
    final TimeUnit I;
    final j0 J;
    final q0<? extends T> K;
    
    public s0(final q0<T> g, final long h, final TimeUnit i, final j0 j, final q0<? extends T> k) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
    }
    
    @Override
    protected void e1(final n0<? super T> n0) {
        final a<Object> a = new a<Object>((n0<? super Object>)n0, this.K, this.H, this.I);
        n0.l(a);
        d.f(a.H, this.J.f(a, this.H, this.I));
        this.G.c(a);
    }
    
    static final class a<T> extends AtomicReference<c> implements n0<T>, Runnable, c
    {
        private static final long M = 37497744973048446L;
        final n0<? super T> G;
        final AtomicReference<c> H;
        final s0.a.a<T> I;
        q0<? extends T> J;
        final long K;
        final TimeUnit L;
        
        a(final n0<? super T> g, final q0<? extends T> j, final long k, final TimeUnit l) {
            this.G = g;
            this.J = j;
            this.K = k;
            this.L = l;
            this.H = new AtomicReference<c>();
            if (j != null) {
                this.I = new s0.a.a<T>(g);
            }
            else {
                this.I = null;
            }
        }
        
        @Override
        public void b(final Throwable t) {
            final c expectedValue = this.get();
            final d g = d.G;
            if (expectedValue != g && this.compareAndSet(expectedValue, g)) {
                d.b(this.H);
                this.G.b(t);
            }
            else {
                a.Y(t);
            }
        }
        
        @Override
        public void d(final T t) {
            final c expectedValue = this.get();
            final d g = d.G;
            if (expectedValue != g && this.compareAndSet(expectedValue, g)) {
                d.b(this.H);
                this.G.d((Object)t);
            }
        }
        
        @Override
        public void dispose() {
            d.b(this);
            d.b(this.H);
            final s0.a.a<T> i = this.I;
            if (i != null) {
                d.b(i);
            }
        }
        
        @Override
        public boolean i() {
            return d.d(this.get());
        }
        
        @Override
        public void l(final c c) {
            d.j(this, c);
        }
        
        @Override
        public void run() {
            final c expectedValue = this.get();
            final d g = d.G;
            if (expectedValue != g && this.compareAndSet(expectedValue, g)) {
                if (expectedValue != null) {
                    expectedValue.dispose();
                }
                final q0<? extends T> j = this.J;
                if (j == null) {
                    this.G.b(new TimeoutException(k.e(this.K, this.L)));
                }
                else {
                    this.J = null;
                    j.c(this.I);
                }
            }
        }
        
        static final class a<T> extends AtomicReference<c> implements n0<T>
        {
            private static final long H = 2071387740092105509L;
            final n0<? super T> G;
            
            a(final n0<? super T> g) {
                this.G = g;
            }
            
            @Override
            public void b(final Throwable t) {
                this.G.b(t);
            }
            
            @Override
            public void d(final T t) {
                this.G.d((Object)t);
            }
            
            @Override
            public void l(final c c) {
                d.j(this, c);
            }
        }
    }
}
