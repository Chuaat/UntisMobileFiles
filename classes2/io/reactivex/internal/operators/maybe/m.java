// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.maybe;

import io.reactivex.q;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.internal.disposables.d;
import io.reactivex.disposables.c;
import io.reactivex.v;
import io.reactivex.y;
import o7.b;

public final class m<T, U> extends io.reactivex.internal.operators.maybe.a<T, T>
{
    final o7.b<U> H;
    
    public m(final y<T> y, final o7.b<U> h) {
        super(y);
        this.H = h;
    }
    
    @Override
    protected void u1(final v<? super T> v) {
        super.G.c(new a<Object, Object>(v, this.H));
    }
    
    static final class a<T, U> implements v<T>, c
    {
        final b<T> G;
        final o7.b<U> H;
        c I;
        
        a(final v<? super T> v, final o7.b<U> h) {
            this.G = (b<T>)new b((v<? super Object>)v);
            this.H = h;
        }
        
        void a() {
            this.H.e((o7.c)this.G);
        }
        
        @Override
        public void b(final Throwable i) {
            this.I = d.G;
            this.G.I = i;
            this.a();
        }
        
        @Override
        public void d(final T h) {
            this.I = d.G;
            this.G.H = h;
            this.a();
        }
        
        @Override
        public void dispose() {
            this.I.dispose();
            this.I = d.G;
            j.b(this.G);
        }
        
        @Override
        public void f() {
            this.I = d.G;
            this.a();
        }
        
        @Override
        public boolean i() {
            return this.G.get() == j.G;
        }
        
        @Override
        public void l(final c i) {
            if (d.l(this.I, i)) {
                this.I = i;
                this.G.G.l(this);
            }
        }
    }
    
    static final class b<T> extends AtomicReference<o7.d> implements q<Object>
    {
        private static final long J = -1215060610805418006L;
        final v<? super T> G;
        T H;
        Throwable I;
        
        b(final v<? super T> g) {
            this.G = g;
        }
        
        public void b(final Throwable t) {
            final Throwable i = this.I;
            if (i == null) {
                this.G.b(t);
            }
            else {
                this.G.b(new io.reactivex.exceptions.a(new Throwable[] { i, t }));
            }
        }
        
        public void f() {
            final Throwable i = this.I;
            if (i != null) {
                this.G.b(i);
            }
            else {
                final T h = this.H;
                if (h != null) {
                    this.G.d((Object)h);
                }
                else {
                    this.G.f();
                }
            }
        }
        
        public void m(final Object o) {
            final o7.d d = this.get();
            final j g = j.G;
            if (d != g) {
                this.lazySet((o7.d)g);
                d.cancel();
                this.f();
            }
        }
        
        @Override
        public void z(final o7.d d) {
            j.l(this, d, Long.MAX_VALUE);
        }
    }
}
