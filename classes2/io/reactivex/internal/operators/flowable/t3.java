// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.j;
import o7.d;
import java.util.ArrayDeque;
import io.reactivex.q;
import o7.c;
import io.reactivex.l;

public final class t3<T> extends io.reactivex.internal.operators.flowable.a<T, T>
{
    final int I;
    
    public t3(final l<T> l, final int i) {
        super(l);
        this.I = i;
    }
    
    @Override
    protected void n6(final c<? super T> c) {
        super.H.m6(new a<Object>((o7.c<? super T>)c, this.I));
    }
    
    static final class a<T> extends ArrayDeque<T> implements q<T>, d
    {
        private static final long J = -3807491841935125653L;
        final c<? super T> G;
        final int H;
        d I;
        
        a(final c<? super T> g, final int n) {
            super(n);
            this.G = g;
            this.H = n;
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
        
        public void m(final T e) {
            if (this.H == this.size()) {
                this.G.m(this.poll());
            }
            else {
                this.I.v(1L);
            }
            this.offer(e);
        }
        
        public void v(final long n) {
            this.I.v(n);
        }
        
        @Override
        public void z(final d i) {
            if (j.o(this.I, i)) {
                this.I = i;
                this.G.z((d)this);
            }
        }
    }
}
