// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.disposables.d;
import io.reactivex.internal.functions.b;
import io.reactivex.v;
import x5.c;
import io.reactivex.y;
import x5.o;

public final class a0<T, U, R> extends io.reactivex.internal.operators.maybe.a<T, R>
{
    final o<? super T, ? extends y<? extends U>> H;
    final c<? super T, ? super U, ? extends R> I;
    
    public a0(final y<T> y, final o<? super T, ? extends y<? extends U>> h, final c<? super T, ? super U, ? extends R> i) {
        super(y);
        this.H = h;
        this.I = i;
    }
    
    @Override
    protected void u1(final v<? super R> v) {
        super.G.c(new a<Object, Object, Object>(v, (o<? super T, ? extends y<?>>)this.H, (c<? super T, ?, ?>)this.I));
    }
    
    static final class a<T, U, R> implements v<T>, c
    {
        final o<? super T, ? extends y<? extends U>> G;
        final a0.a.a<T, U, R> H;
        
        a(final v<? super R> v, final o<? super T, ? extends y<? extends U>> g, final x5.c<? super T, ? super U, ? extends R> c) {
            this.H = new a0.a.a<T, U, R>(v, c);
            this.G = g;
        }
        
        @Override
        public void b(final Throwable t) {
            this.H.G.b(t);
        }
        
        @Override
        public void d(final T i) {
            try {
                final y y = b.g((y)this.G.apply((Object)i), "The mapper returned a null MaybeSource");
                if (d.f(this.H, null)) {
                    final a0.a.a<T, U, R> h = this.H;
                    h.I = i;
                    y.c(h);
                }
            }
            finally {
                final Throwable t;
                io.reactivex.exceptions.b.b(t);
                this.H.G.b(t);
            }
        }
        
        @Override
        public void dispose() {
            d.b(this.H);
        }
        
        @Override
        public void f() {
            this.H.G.f();
        }
        
        @Override
        public boolean i() {
            return d.d(this.H.get());
        }
        
        @Override
        public void l(final c c) {
            if (d.j(this.H, c)) {
                this.H.G.l(this);
            }
        }
        
        static final class a<T, U, R> extends AtomicReference<c> implements v<U>
        {
            private static final long J = -2897979525538174559L;
            final v<? super R> G;
            final x5.c<? super T, ? super U, ? extends R> H;
            T I;
            
            a(final v<? super R> g, final x5.c<? super T, ? super U, ? extends R> h) {
                this.G = g;
                this.H = h;
            }
            
            @Override
            public void b(final Throwable t) {
                this.G.b(t);
            }
            
            @Override
            public void d(final U u) {
                final T i = this.I;
                this.I = null;
                try {
                    this.G.d((Object)b.g((Object)this.H.b((Object)i, (Object)u), "The resultSelector returned a null value"));
                }
                finally {
                    final Throwable t;
                    io.reactivex.exceptions.b.b(t);
                    this.G.b(t);
                }
            }
            
            @Override
            public void f() {
                this.G.f();
            }
            
            @Override
            public void l(final c c) {
                d.j(this, c);
            }
        }
    }
}
