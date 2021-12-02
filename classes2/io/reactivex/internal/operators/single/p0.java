// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.single;

import io.reactivex.internal.disposables.d;
import io.reactivex.exceptions.a;
import io.reactivex.internal.observers.z;
import io.reactivex.internal.functions.b;
import io.reactivex.disposables.c;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.n0;
import x5.o;
import io.reactivex.q0;
import io.reactivex.k0;

public final class p0<T> extends k0<T>
{
    final q0<? extends T> G;
    final o<? super Throwable, ? extends q0<? extends T>> H;
    
    public p0(final q0<? extends T> g, final o<? super Throwable, ? extends q0<? extends T>> h) {
        this.G = g;
        this.H = h;
    }
    
    @Override
    protected void e1(final n0<? super T> n0) {
        this.G.c(new a<Object>(n0, this.H));
    }
    
    static final class a<T> extends AtomicReference<c> implements n0<T>, c
    {
        private static final long I = -5314538511045349925L;
        final n0<? super T> G;
        final o<? super Throwable, ? extends q0<? extends T>> H;
        
        a(final n0<? super T> g, final o<? super Throwable, ? extends q0<? extends T>> h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public void b(final Throwable t) {
            try {
                b.g((q0)this.H.apply(t), "The nextFunction returned a null SingleSource.").c(new z(this, this.G));
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
        public boolean i() {
            return d.d(this.get());
        }
        
        @Override
        public void l(final c c) {
            if (d.j(this, c)) {
                this.G.l(this);
            }
        }
    }
}
