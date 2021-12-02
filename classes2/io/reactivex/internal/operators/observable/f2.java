// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.d;
import io.reactivex.exceptions.b;
import io.reactivex.disposables.c;
import io.reactivex.i0;
import io.reactivex.g0;
import x5.o;

public final class f2<T> extends io.reactivex.internal.operators.observable.a<T, T>
{
    final o<? super Throwable, ? extends T> H;
    
    public f2(final g0<T> g0, final o<? super Throwable, ? extends T> h) {
        super(g0);
        this.H = h;
    }
    
    public void L5(final i0<? super T> i0) {
        super.G.c(new a<Object>((i0<? super T>)i0, (o<? super Throwable, ? extends T>)this.H));
    }
    
    static final class a<T> implements i0<T>, c
    {
        final i0<? super T> G;
        final o<? super Throwable, ? extends T> H;
        c I;
        
        a(final i0<? super T> g, final o<? super Throwable, ? extends T> h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public void b(final Throwable cause) {
            try {
                final T apply = (T)this.H.apply(cause);
                if (apply == null) {
                    final NullPointerException ex = new NullPointerException("The supplied value is null");
                    ex.initCause(cause);
                    this.G.b(ex);
                    return;
                }
                this.G.m((Object)apply);
                this.G.f();
            }
            finally {
                final Throwable t;
                b.b(t);
                this.G.b(new io.reactivex.exceptions.a(new Throwable[] { cause, t }));
            }
        }
        
        @Override
        public void dispose() {
            this.I.dispose();
        }
        
        @Override
        public void f() {
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
            this.G.m((Object)t);
        }
    }
}
