// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.maybe;

import io.reactivex.disposables.c;
import io.reactivex.exceptions.b;
import io.reactivex.v;
import x5.a;
import io.reactivex.y;
import io.reactivex.s;

public final class t<T> extends s<T>
{
    final y<T> G;
    final x5.a H;
    
    public t(final y<T> g, final x5.a h) {
        this.G = g;
        this.H = h;
    }
    
    @Override
    protected void u1(final v<? super T> v) {
        this.G.c(new a(v));
    }
    
    final class a implements v<T>
    {
        final v<? super T> G;
        
        a(final v<? super T> g) {
            this.G = g;
        }
        
        @Override
        public void b(final Throwable t) {
            io.reactivex.exceptions.a a = null;
            try {
                t.this.H.run();
            }
            finally {
                final Throwable t2;
                b.b(t2);
                a = new io.reactivex.exceptions.a(new Throwable[] { t, t2 });
            }
            this.G.b(a);
        }
        
        @Override
        public void d(final T t) {
            try {
                t.this.H.run();
                this.G.d((Object)t);
            }
            finally {
                final Throwable t2;
                b.b(t2);
                this.G.b(t2);
            }
        }
        
        @Override
        public void f() {
            try {
                t.this.H.run();
                this.G.f();
            }
            finally {
                final Throwable t;
                b.b(t);
                this.G.b(t);
            }
        }
        
        @Override
        public void l(final c c) {
            this.G.l(c);
        }
    }
}
