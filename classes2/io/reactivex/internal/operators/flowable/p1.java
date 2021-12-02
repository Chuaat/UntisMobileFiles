// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.j;
import o7.d;
import io.reactivex.q;
import o7.c;
import io.reactivex.l;

public final class p1<T> extends io.reactivex.internal.operators.flowable.a<T, T>
{
    public p1(final l<T> l) {
        super(l);
    }
    
    @Override
    protected void n6(final c<? super T> c) {
        super.H.m6(new a<Object>((o7.c<? super T>)c));
    }
    
    static final class a<T> implements q<T>, d
    {
        final c<? super T> G;
        d H;
        
        a(final c<? super T> g) {
            this.G = g;
        }
        
        public void b(final Throwable t) {
            this.G.b(t);
        }
        
        public void cancel() {
            this.H.cancel();
        }
        
        public void f() {
            this.G.f();
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
