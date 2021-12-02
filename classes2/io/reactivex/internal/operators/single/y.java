// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.single;

import io.reactivex.internal.disposables.d;
import io.reactivex.internal.functions.b;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.n0;
import io.reactivex.f;
import io.reactivex.i;
import x5.o;
import io.reactivex.q0;
import io.reactivex.c;

public final class y<T> extends c
{
    final q0<T> G;
    final o<? super T, ? extends i> H;
    
    public y(final q0<T> g, final o<? super T, ? extends i> h) {
        this.G = g;
        this.H = h;
    }
    
    @Override
    protected void L0(final f f) {
        final a<Object> a = new a<Object>(f, (o<? super Object, ? extends i>)this.H);
        f.l(a);
        this.G.c(a);
    }
    
    static final class a<T> extends AtomicReference<io.reactivex.disposables.c> implements n0<T>, f, io.reactivex.disposables.c
    {
        private static final long I = -2177128922851101253L;
        final f G;
        final o<? super T, ? extends i> H;
        
        a(final f g, final o<? super T, ? extends i> h) {
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
                final i i = b.g((i)this.H.apply((Object)t), "The mapper returned a null CompletableSource");
                if (!this.i()) {
                    i.c(this);
                }
            }
            finally {
                final Throwable t2;
                io.reactivex.exceptions.b.b(t2);
                this.b(t2);
            }
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
        public void l(final io.reactivex.disposables.c c) {
            d.f(this, c);
        }
    }
}
