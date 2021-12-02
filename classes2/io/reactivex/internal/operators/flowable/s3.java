// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.j;
import o7.d;
import io.reactivex.q;
import o7.c;
import io.reactivex.l;

public final class s3<T> extends io.reactivex.internal.operators.flowable.a<T, T>
{
    final long I;
    
    public s3(final l<T> l, final long i) {
        super(l);
        this.I = i;
    }
    
    @Override
    protected void n6(final c<? super T> c) {
        super.H.m6(new a<Object>((o7.c<? super T>)c, this.I));
    }
    
    static final class a<T> implements q<T>, d
    {
        final c<? super T> G;
        long H;
        d I;
        
        a(final c<? super T> g, final long h) {
            this.G = g;
            this.H = h;
        }
        
        public void b(final Throwable t) {
            this.G.b(t);
        }
        
        public void cancel() {
            this.I.cancel();
        }
        
        public void f() {
            this.G.f();
        }
        
        public void m(final T t) {
            final long h = this.H;
            if (h != 0L) {
                this.H = h - 1L;
            }
            else {
                this.G.m((Object)t);
            }
        }
        
        public void v(final long n) {
            this.I.v(n);
        }
        
        @Override
        public void z(final d i) {
            if (j.o(this.I, i)) {
                final long h = this.H;
                this.I = i;
                this.G.z((d)this);
                i.v(h);
            }
        }
    }
}
