// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.functions.b;
import io.reactivex.internal.disposables.d;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.observers.m;
import io.reactivex.i0;
import io.reactivex.g0;
import x5.c;

public final class j4<T, U, R> extends io.reactivex.internal.operators.observable.a<T, R>
{
    final c<? super T, ? super U, ? extends R> H;
    final g0<? extends U> I;
    
    public j4(final g0<T> g0, final c<? super T, ? super U, ? extends R> h, final g0<? extends U> i) {
        super(g0);
        this.H = h;
        this.I = i;
    }
    
    public void L5(final i0<? super R> i0) {
        final m<Object> m = new m<Object>((i0<? super Object>)i0);
        final a a = new a(m, this.H);
        m.l(a);
        this.I.c(new b((a<T, U, R>)a));
        super.G.c(a);
    }
    
    static final class a<T, U, R> extends AtomicReference<U> implements i0<T>, c
    {
        private static final long K = -312246233408980075L;
        final i0<? super R> G;
        final x5.c<? super T, ? super U, ? extends R> H;
        final AtomicReference<c> I;
        final AtomicReference<c> J;
        
        a(final i0<? super R> g, final x5.c<? super T, ? super U, ? extends R> h) {
            this.I = new AtomicReference<c>();
            this.J = new AtomicReference<c>();
            this.G = g;
            this.H = h;
        }
        
        public void a(final Throwable t) {
            d.b(this.I);
            this.G.b(t);
        }
        
        @Override
        public void b(final Throwable t) {
            d.b(this.J);
            this.G.b(t);
        }
        
        public boolean c(final c c) {
            return d.j(this.J, c);
        }
        
        @Override
        public void dispose() {
            d.b(this.I);
            d.b(this.J);
        }
        
        @Override
        public void f() {
            d.b(this.J);
            this.G.f();
        }
        
        @Override
        public boolean i() {
            return d.d(this.I.get());
        }
        
        @Override
        public void l(final c c) {
            d.j(this.I, c);
        }
        
        @Override
        public void m(final T t) {
            final Object value = this.get();
            if (value != null) {
                try {
                    this.G.m((Object)io.reactivex.internal.functions.b.g((Object)this.H.b((Object)t, (Object)value), "The combiner returned a null value"));
                }
                finally {
                    final Throwable t2;
                    io.reactivex.exceptions.b.b(t2);
                    this.dispose();
                    this.G.b(t2);
                }
            }
        }
    }
    
    final class b implements i0<U>
    {
        private final a<T, U, R> G;
        
        b(final a<T, U, R> g) {
            this.G = g;
        }
        
        @Override
        public void b(final Throwable t) {
            this.G.a(t);
        }
        
        @Override
        public void f() {
        }
        
        @Override
        public void l(final io.reactivex.disposables.c c) {
            this.G.c(c);
        }
        
        @Override
        public void m(final U newValue) {
            this.G.lazySet((U)newValue);
        }
    }
}
