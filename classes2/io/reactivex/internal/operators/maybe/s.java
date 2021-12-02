// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.d;
import io.reactivex.disposables.c;
import io.reactivex.v;
import io.reactivex.y;
import x5.b;

public final class s<T> extends io.reactivex.internal.operators.maybe.a<T, T>
{
    final b<? super T, ? super Throwable> H;
    
    public s(final y<T> y, final b<? super T, ? super Throwable> h) {
        super(y);
        this.H = h;
    }
    
    @Override
    protected void u1(final v<? super T> v) {
        super.G.c(new a<Object>((v<? super T>)v, (b<? super T, ? super Throwable>)this.H));
    }
    
    static final class a<T> implements v<T>, c
    {
        final v<? super T> G;
        final b<? super T, ? super Throwable> H;
        c I;
        
        a(final v<? super T> g, final b<? super T, ? super Throwable> h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public void b(final Throwable t) {
            this.I = d.G;
            io.reactivex.exceptions.a a = null;
            try {
                this.H.a((Object)null, t);
            }
            finally {
                final Throwable t2;
                io.reactivex.exceptions.b.b(t2);
                a = new io.reactivex.exceptions.a(new Throwable[] { t, t2 });
            }
            this.G.b(a);
        }
        
        @Override
        public void d(final T t) {
            this.I = d.G;
            try {
                this.H.a((Object)t, (Object)null);
                this.G.d((Object)t);
            }
            finally {
                final Throwable t2;
                io.reactivex.exceptions.b.b(t2);
                this.G.b(t2);
            }
        }
        
        @Override
        public void dispose() {
            this.I.dispose();
            this.I = d.G;
        }
        
        @Override
        public void f() {
            this.I = d.G;
            try {
                this.H.a((Object)null, (Object)null);
                this.G.f();
            }
            finally {
                final Throwable t;
                io.reactivex.exceptions.b.b(t);
                this.G.b(t);
            }
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
