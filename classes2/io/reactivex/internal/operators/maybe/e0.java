// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.d;
import io.reactivex.internal.functions.b;
import io.reactivex.disposables.c;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.v;
import java.util.concurrent.Callable;
import io.reactivex.y;
import x5.o;

public final class e0<T, R> extends io.reactivex.internal.operators.maybe.a<T, R>
{
    final o<? super T, ? extends y<? extends R>> H;
    final o<? super Throwable, ? extends y<? extends R>> I;
    final Callable<? extends y<? extends R>> J;
    
    public e0(final y<T> y, final o<? super T, ? extends y<? extends R>> h, final o<? super Throwable, ? extends y<? extends R>> i, final Callable<? extends y<? extends R>> j) {
        super(y);
        this.H = h;
        this.I = i;
        this.J = j;
    }
    
    @Override
    protected void u1(final v<? super R> v) {
        super.G.c(new a<Object, Object>(v, this.H, this.I, this.J));
    }
    
    static final class a<T, R> extends AtomicReference<c> implements v<T>, c
    {
        private static final long L = 4375739915521278546L;
        final v<? super R> G;
        final o<? super T, ? extends y<? extends R>> H;
        final o<? super Throwable, ? extends y<? extends R>> I;
        final Callable<? extends y<? extends R>> J;
        c K;
        
        a(final v<? super R> g, final o<? super T, ? extends y<? extends R>> h, final o<? super Throwable, ? extends y<? extends R>> i, final Callable<? extends y<? extends R>> j) {
            this.G = g;
            this.H = h;
            this.I = i;
            this.J = j;
        }
        
        @Override
        public void b(final Throwable t) {
            try {
                b.g((y)this.I.apply(t), "The onErrorMapper returned a null MaybeSource").c(new e0.a.a());
            }
            catch (Exception ex) {
                io.reactivex.exceptions.b.b(ex);
                this.G.b(new io.reactivex.exceptions.a(new Throwable[] { t, ex }));
            }
        }
        
        @Override
        public void d(final T t) {
            try {
                b.g((y)this.H.apply((Object)t), "The onSuccessMapper returned a null MaybeSource").c(new e0.a.a());
            }
            catch (Exception ex) {
                io.reactivex.exceptions.b.b(ex);
                this.G.b(ex);
            }
        }
        
        @Override
        public void dispose() {
            d.b(this);
            this.K.dispose();
        }
        
        @Override
        public void f() {
            try {
                b.g((y)this.J.call(), "The onCompleteSupplier returned a null MaybeSource").c(new e0.a.a());
            }
            catch (Exception ex) {
                io.reactivex.exceptions.b.b(ex);
                this.G.b(ex);
            }
        }
        
        @Override
        public boolean i() {
            return d.d(this.get());
        }
        
        @Override
        public void l(final c k) {
            if (d.l(this.K, k)) {
                this.K = k;
                this.G.l(this);
            }
        }
        
        final class a implements v<R>
        {
            @Override
            public void b(final Throwable t) {
                e0.a.this.G.b(t);
            }
            
            @Override
            public void d(final R r) {
                e0.a.this.G.d((Object)r);
            }
            
            @Override
            public void f() {
                e0.a.this.G.f();
            }
            
            @Override
            public void l(final c c) {
                d.j(e0.a.this, c);
            }
        }
    }
}
