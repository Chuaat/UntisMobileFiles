// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.j;
import io.reactivex.annotations.g;
import o7.d;
import io.reactivex.q;
import o7.c;
import io.reactivex.l;

public final class q1<T> extends io.reactivex.internal.operators.flowable.a<T, T>
{
    public q1(final l<T> l) {
        super(l);
    }
    
    @Override
    protected void n6(final c<? super T> c) {
        super.H.m6(new a<Object>((o7.c<? super T>)c));
    }
    
    static final class a<T> implements q<T>, y5.l<T>
    {
        final c<? super T> G;
        d H;
        
        a(final c<? super T> g) {
            this.G = g;
        }
        
        public int E(final int n) {
            return n & 0x2;
        }
        
        public void b(final Throwable t) {
            this.G.b(t);
        }
        
        public void cancel() {
            this.H.cancel();
        }
        
        public void clear() {
        }
        
        public void f() {
            this.G.f();
        }
        
        public boolean isEmpty() {
            return true;
        }
        
        public void m(final T t) {
        }
        
        public boolean offer(final T t) {
            throw new UnsupportedOperationException("Should not be called!");
        }
        
        public boolean p(final T t, final T t2) {
            throw new UnsupportedOperationException("Should not be called!");
        }
        
        @g
        public T poll() {
            return null;
        }
        
        public void v(final long n) {
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
