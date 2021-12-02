// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscribers.b;
import io.reactivex.q;
import o7.c;
import io.reactivex.l;
import x5.g;

public final class p0<T> extends io.reactivex.internal.operators.flowable.a<T, T>
{
    final g<? super T> I;
    
    public p0(final l<T> l, final g<? super T> i) {
        super(l);
        this.I = i;
    }
    
    @Override
    protected void n6(final c<? super T> c) {
        Object o;
        Object o2;
        if (c instanceof y5.a) {
            final l<T> h = (l<T>)super.H;
            final a a = new a((y5.a)c, this.I);
            o = h;
            o2 = a;
        }
        else {
            final l<T> h2 = (l<T>)super.H;
            o2 = new b((o7.c<? super Object>)c, (g<? super Object>)this.I);
            o = h2;
        }
        ((l<T>)o).m6((q<? super T>)o2);
    }
    
    static final class a<T> extends io.reactivex.internal.subscribers.a<T, T>
    {
        final g<? super T> L;
        
        a(final y5.a<? super T> a, final g<? super T> l) {
            super(a);
            this.L = l;
        }
        
        @Override
        public boolean B(final T t) {
            final boolean b = super.G.B(t);
            try {
                this.L.accept((Object)t);
            }
            finally {
                final Throwable t2;
                this.d(t2);
            }
            return b;
        }
        
        @Override
        public int E(final int n) {
            return this.e(n);
        }
        
        public void m(final T t) {
            ((c)super.G).m((Object)t);
            if (super.K == 0) {
                try {
                    this.L.accept((Object)t);
                }
                finally {
                    final Throwable t2;
                    this.d(t2);
                }
            }
        }
        
        @io.reactivex.annotations.g
        public T poll() throws Exception {
            final T poll = (T)super.I.poll();
            if (poll != null) {
                this.L.accept((Object)poll);
            }
            return (T)poll;
        }
    }
    
    static final class b<T> extends io.reactivex.internal.subscribers.b<T, T>
    {
        final g<? super T> L;
        
        b(final c<? super T> c, final g<? super T> l) {
            super(c);
            this.L = l;
        }
        
        public int E(final int n) {
            return this.e(n);
        }
        
        public void m(final T t) {
            if (super.J) {
                return;
            }
            super.G.m((Object)t);
            if (super.K == 0) {
                try {
                    this.L.accept((Object)t);
                }
                finally {
                    final Throwable t2;
                    this.d(t2);
                }
            }
        }
        
        @io.reactivex.annotations.g
        public T poll() throws Exception {
            final T poll = (T)super.I.poll();
            if (poll != null) {
                this.L.accept((Object)poll);
            }
            return (T)poll;
        }
    }
}
