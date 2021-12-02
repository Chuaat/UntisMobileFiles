// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.j;
import o7.d;
import java.util.concurrent.atomic.AtomicLong;
import io.reactivex.q;
import o7.c;
import io.reactivex.l;

public final class n2<T> extends io.reactivex.internal.operators.flowable.a<T, T>
{
    public n2(final l<T> l) {
        super(l);
    }
    
    @Override
    protected void n6(final c<? super T> c) {
        super.H.m6(new a<Object>((o7.c<? super T>)c));
    }
    
    static final class a<T> extends AtomicLong implements q<T>, d
    {
        private static final long J = -3176480756392482682L;
        final c<? super T> G;
        d H;
        boolean I;
        
        a(final c<? super T> g) {
            this.G = g;
        }
        
        public void b(final Throwable t) {
            if (this.I) {
                io.reactivex.plugins.a.Y(t);
                return;
            }
            this.I = true;
            this.G.b(t);
        }
        
        public void cancel() {
            this.H.cancel();
        }
        
        public void f() {
            if (this.I) {
                return;
            }
            this.I = true;
            this.G.f();
        }
        
        public void m(final T t) {
            if (this.I) {
                return;
            }
            if (this.get() != 0L) {
                this.G.m((Object)t);
                io.reactivex.internal.util.d.e(this, 1L);
            }
            else {
                this.b(new io.reactivex.exceptions.c("could not emit value due to lack of requests"));
            }
        }
        
        public void v(final long n) {
            if (j.m(n)) {
                io.reactivex.internal.util.d.a(this, n);
            }
        }
        
        @Override
        public void z(final d h) {
            if (j.o(this.H, h)) {
                this.H = h;
                this.G.z((d)this);
                h.v(Long.MAX_VALUE);
            }
        }
    }
}
