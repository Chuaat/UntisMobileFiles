// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.j;
import io.reactivex.internal.util.h;
import o7.d;
import io.reactivex.q;
import o7.c;
import io.reactivex.l;

public final class m0<T> extends io.reactivex.internal.operators.flowable.a<T, T>
{
    public m0(final l<T> l) {
        super(l);
    }
    
    @Override
    protected void n6(final c<? super T> c) {
        super.H.m6(new a<Object>((o7.c<? super T>)c));
    }
    
    static final class a<T> implements q<T>, d
    {
        c<? super T> G;
        d H;
        
        a(final c<? super T> g) {
            this.G = g;
        }
        
        public void b(final Throwable t) {
            final c<? super T> g = this.G;
            this.H = (d)io.reactivex.internal.util.h.G;
            this.G = io.reactivex.internal.util.h.h();
            g.b(t);
        }
        
        public void cancel() {
            final d h = this.H;
            this.H = (d)io.reactivex.internal.util.h.G;
            this.G = io.reactivex.internal.util.h.h();
            h.cancel();
        }
        
        public void f() {
            final c<? super T> g = this.G;
            this.H = (d)io.reactivex.internal.util.h.G;
            this.G = io.reactivex.internal.util.h.h();
            g.f();
        }
        
        public void m(final T t) {
            this.G.m((Object)t);
        }
        
        public void v(final long n) {
            this.H.v(n);
        }
        
        @Override
        public void z(final d h) {
            if (j.o(this.H, h)) {
                this.H = h;
                this.G.z((d)this);
            }
        }
    }
}
