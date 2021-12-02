// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.j;
import io.reactivex.exceptions.b;
import o7.d;
import java.util.concurrent.atomic.AtomicLong;
import io.reactivex.q;
import o7.c;
import io.reactivex.l;
import x5.g;

public final class m2<T> extends io.reactivex.internal.operators.flowable.a<T, T> implements g<T>
{
    final g<? super T> I;
    
    public m2(final l<T> l) {
        super(l);
        this.I = this;
    }
    
    public m2(final l<T> l, final g<? super T> i) {
        super(l);
        this.I = i;
    }
    
    @Override
    public void accept(final T t) {
    }
    
    @Override
    protected void n6(final c<? super T> c) {
        super.H.m6(new a<Object>((o7.c<? super T>)c, (g<? super T>)this.I));
    }
    
    static final class a<T> extends AtomicLong implements q<T>, d
    {
        private static final long K = -6246093802440953054L;
        final c<? super T> G;
        final g<? super T> H;
        d I;
        boolean J;
        
        a(final c<? super T> g, final g<? super T> h) {
            this.G = g;
            this.H = h;
        }
        
        public void b(final Throwable t) {
            if (this.J) {
                io.reactivex.plugins.a.Y(t);
                return;
            }
            this.J = true;
            this.G.b(t);
        }
        
        public void cancel() {
            this.I.cancel();
        }
        
        public void f() {
            if (this.J) {
                return;
            }
            this.J = true;
            this.G.f();
        }
        
        public void m(final T t) {
            if (this.J) {
                return;
            }
            if (this.get() != 0L) {
                this.G.m((Object)t);
                io.reactivex.internal.util.d.e(this, 1L);
            }
            else {
                try {
                    this.H.accept((Object)t);
                }
                finally {
                    final Throwable t2;
                    b.b(t2);
                    this.cancel();
                    this.b(t2);
                }
            }
        }
        
        public void v(final long n) {
            if (j.m(n)) {
                io.reactivex.internal.util.d.a(this, n);
            }
        }
        
        @Override
        public void z(final d i) {
            if (j.o(this.I, i)) {
                this.I = i;
                this.G.z((d)this);
                i.v(Long.MAX_VALUE);
            }
        }
    }
}
