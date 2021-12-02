// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.d;
import io.reactivex.exceptions.b;
import io.reactivex.disposables.c;
import io.reactivex.v;
import io.reactivex.y;
import x5.r;

public final class a1<T> extends io.reactivex.internal.operators.maybe.a<T, T>
{
    final r<? super Throwable> H;
    
    public a1(final y<T> y, final r<? super Throwable> h) {
        super(y);
        this.H = h;
    }
    
    @Override
    protected void u1(final v<? super T> v) {
        super.G.c(new a<Object>((v<? super T>)v, this.H));
    }
    
    static final class a<T> implements v<T>, c
    {
        final v<? super T> G;
        final r<? super Throwable> H;
        c I;
        
        a(final v<? super T> g, final r<? super Throwable> h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public void b(final Throwable t) {
            try {
                if (this.H.a(t)) {
                    this.G.f();
                }
                else {
                    this.G.b(t);
                }
            }
            finally {
                final Throwable t2;
                b.b(t2);
                this.G.b(new io.reactivex.exceptions.a(new Throwable[] { t, t2 }));
            }
        }
        
        @Override
        public void d(final T t) {
            this.G.d((Object)t);
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
    }
}
