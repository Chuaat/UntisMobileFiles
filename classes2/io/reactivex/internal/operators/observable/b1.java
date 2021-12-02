// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import java.util.Iterator;
import io.reactivex.internal.functions.b;
import io.reactivex.internal.disposables.d;
import io.reactivex.disposables.c;
import io.reactivex.i0;
import io.reactivex.g0;
import x5.o;

public final class b1<T, R> extends io.reactivex.internal.operators.observable.a<T, R>
{
    final o<? super T, ? extends Iterable<? extends R>> H;
    
    public b1(final g0<T> g0, final o<? super T, ? extends Iterable<? extends R>> h) {
        super(g0);
        this.H = h;
    }
    
    @Override
    protected void L5(final i0<? super R> i0) {
        super.G.c(new a<Object, Object>(i0, this.H));
    }
    
    static final class a<T, R> implements i0<T>, c
    {
        final i0<? super R> G;
        final o<? super T, ? extends Iterable<? extends R>> H;
        c I;
        
        a(final i0<? super R> g, final o<? super T, ? extends Iterable<? extends R>> h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public void b(final Throwable t) {
            final c i = this.I;
            final d g = d.G;
            if (i == g) {
                io.reactivex.plugins.a.Y(t);
                return;
            }
            this.I = g;
            this.G.b(t);
        }
        
        @Override
        public void dispose() {
            this.I.dispose();
            this.I = d.G;
        }
        
        @Override
        public void f() {
            final c i = this.I;
            final d g = d.G;
            if (i == g) {
                return;
            }
            this.I = g;
            this.G.f();
        }
        
        @Override
        public boolean i() {
            return this.I.i();
        }
        
        @Override
        public void l(final c i) {
            if (d.l(this.I, i)) {
                this.I = i;
                this.G.l(this);
            }
        }
        
        @Override
        public void m(final T t) {
            if (this.I == d.G) {
                return;
            }
            try {
                final Iterator<T> iterator = (Iterator<T>)((Iterable)this.H.apply((Object)t)).iterator();
                final i0<? super R> g = this.G;
                while (iterator.hasNext()) {
                    g.m(b.g((Object)iterator.next(), "The iterator returned a null value"));
                }
            }
            finally {
                final Throwable t2;
                io.reactivex.exceptions.b.b(t2);
                this.I.dispose();
                this.b(t2);
            }
        }
    }
}
