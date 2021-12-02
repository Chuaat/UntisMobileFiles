// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.i;
import io.reactivex.q;
import o7.d;
import o7.c;
import io.reactivex.l;
import o7.b;

public final class y3<T> extends io.reactivex.internal.operators.flowable.a<T, T>
{
    final b<? extends T> I;
    
    public y3(final l<T> l, final b<? extends T> i) {
        super(l);
        this.I = i;
    }
    
    @Override
    protected void n6(final c<? super T> c) {
        final a<Object> a = new a<Object>((o7.c<? super Object>)c, this.I);
        c.z((d)a.I);
        super.H.m6(a);
    }
    
    static final class a<T> implements q<T>
    {
        final c<? super T> G;
        final b<? extends T> H;
        final i I;
        boolean J;
        
        a(final c<? super T> g, final b<? extends T> h) {
            this.G = g;
            this.H = h;
            this.J = true;
            this.I = new i(false);
        }
        
        public void b(final Throwable t) {
            this.G.b(t);
        }
        
        public void f() {
            if (this.J) {
                this.J = false;
                this.H.e((c)this);
            }
            else {
                this.G.f();
            }
        }
        
        public void m(final T t) {
            if (this.J) {
                this.J = false;
            }
            this.G.m((Object)t);
        }
        
        @Override
        public void z(final d d) {
            this.I.j(d);
        }
    }
}
