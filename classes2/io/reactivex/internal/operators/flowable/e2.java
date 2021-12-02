// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscribers.t;
import io.reactivex.q;
import o7.c;
import io.reactivex.l;
import io.reactivex.a0;

public final class e2<T> extends io.reactivex.internal.operators.flowable.a<T, a0<T>>
{
    public e2(final l<T> l) {
        super(l);
    }
    
    @Override
    protected void n6(final c<? super a0<T>> c) {
        super.H.m6(new a((o7.c<? super a0<Object>>)c));
    }
    
    static final class a<T> extends t<T, a0<T>>
    {
        private static final long N = -3740826063558713822L;
        
        a(final c<? super a0<T>> c) {
            super(c);
        }
        
        public void b(final Throwable t) {
            this.a(a0.b(t));
        }
        
        protected void e(final a0<T> a0) {
            if (a0.g()) {
                io.reactivex.plugins.a.Y(a0.d());
            }
        }
        
        public void f() {
            this.a(a0.a());
        }
        
        public void m(final T t) {
            ++super.J;
            super.G.m((Object)a0.c(t));
        }
    }
}
