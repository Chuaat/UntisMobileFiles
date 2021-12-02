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

public final class h0<T, R> extends io.reactivex.internal.operators.maybe.a<T, R>
{
    final o<? super T, ? extends y<? extends R>> H;
    
    public h0(final y<T> y, final o<? super T, ? extends y<? extends R>> h) {
        super(y);
        this.H = h;
    }
    
    @Override
    protected void u1(final v<? super R> v) {
        super.G.c(new a<Object, Object>(v, this.H));
    }
    
    static final class a<T, R> extends AtomicReference<c> implements v<T>, c
    {
        private static final long J = 4375739915521278546L;
        final v<? super R> G;
        final o<? super T, ? extends y<? extends R>> H;
        c I;
        
        a(final v<? super R> g, final o<? super T, ? extends y<? extends R>> h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public void b(final Throwable t) {
            this.G.b(t);
        }
        
        @Override
        public void d(final T t) {
            try {
                final y y = b.g((y)this.H.apply((Object)t), "The mapper returned a null MaybeSource");
                if (!this.i()) {
                    y.c(new h0.a.a());
                }
            }
            catch (Exception ex) {
                io.reactivex.exceptions.b.b(ex);
                this.G.b(ex);
            }
        }
        
        @Override
        public void dispose() {
            d.b(this);
            this.I.dispose();
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
        public void l(final c i) {
            if (d.l(this.I, i)) {
                this.I = i;
                this.G.l(this);
            }
        }
        
        final class a implements v<R>
        {
            @Override
            public void b(final Throwable t) {
                h0.a.this.G.b(t);
            }
            
            @Override
            public void d(final R r) {
                h0.a.this.G.d((Object)r);
            }
            
            @Override
            public void f() {
                h0.a.this.G.f();
            }
            
            @Override
            public void l(final c c) {
                d.j(h0.a.this, c);
            }
        }
    }
}
