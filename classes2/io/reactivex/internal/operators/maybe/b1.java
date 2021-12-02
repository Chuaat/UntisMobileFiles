// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.d;
import io.reactivex.internal.functions.b;
import io.reactivex.disposables.c;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.v;
import io.reactivex.y;
import x5.o;

public final class b1<T> extends io.reactivex.internal.operators.maybe.a<T, T>
{
    final o<? super Throwable, ? extends y<? extends T>> H;
    final boolean I;
    
    public b1(final y<T> y, final o<? super Throwable, ? extends y<? extends T>> h, final boolean i) {
        super(y);
        this.H = h;
        this.I = i;
    }
    
    @Override
    protected void u1(final v<? super T> v) {
        super.G.c(new a<Object>((v<? super T>)v, (o<? super Throwable, ? extends y<? extends T>>)this.H, this.I));
    }
    
    static final class a<T> extends AtomicReference<c> implements v<T>, c
    {
        private static final long J = 2026620218879969836L;
        final v<? super T> G;
        final o<? super Throwable, ? extends y<? extends T>> H;
        final boolean I;
        
        a(final v<? super T> g, final o<? super Throwable, ? extends y<? extends T>> h, final boolean i) {
            this.G = g;
            this.H = h;
            this.I = i;
        }
        
        @Override
        public void b(final Throwable t) {
            if (!this.I && !(t instanceof Exception)) {
                this.G.b(t);
                return;
            }
            try {
                final y y = b.g((y)this.H.apply(t), "The resumeFunction returned a null MaybeSource");
                d.f(this, null);
                y.c(new b1.a.a(this.G, this));
            }
            finally {
                final Throwable t2;
                io.reactivex.exceptions.b.b(t2);
                this.G.b(new io.reactivex.exceptions.a(new Throwable[] { t, t2 }));
            }
        }
        
        @Override
        public void d(final T t) {
            this.G.d((Object)t);
        }
        
        @Override
        public void dispose() {
            d.b(this);
        }
        
        @Override
        public void f() {
            this.G.f();
        }
        
        @Override
        public boolean i() {
            return d.d(this.get());
        }
        
        @Override
        public void l(final c c) {
            if (d.j(this, c)) {
                this.G.l(this);
            }
        }
        
        static final class a<T> implements v<T>
        {
            final v<? super T> G;
            final AtomicReference<c> H;
            
            a(final v<? super T> g, final AtomicReference<c> h) {
                this.G = g;
                this.H = h;
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
            public void f() {
                this.G.f();
            }
            
            @Override
            public void l(final c c) {
                d.j(this.H, c);
            }
        }
    }
}
