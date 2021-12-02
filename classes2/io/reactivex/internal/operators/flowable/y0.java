// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import o7.d;
import io.reactivex.internal.subscribers.b;
import io.reactivex.annotations.g;
import io.reactivex.q;
import o7.c;
import io.reactivex.l;
import x5.r;

public final class y0<T> extends io.reactivex.internal.operators.flowable.a<T, T>
{
    final r<? super T> I;
    
    public y0(final l<T> l, final r<? super T> i) {
        super(l);
        this.I = i;
    }
    
    @Override
    protected void n6(final c<? super T> c) {
        Object o;
        Object o2;
        if (c instanceof y5.a) {
            o = super.H;
            o2 = new a((y5.a<? super Object>)c, (r<? super Object>)this.I);
        }
        else {
            o = super.H;
            o2 = new b(c, this.I);
        }
        ((l)o).m6((q)o2);
    }
    
    static final class a<T> extends io.reactivex.internal.subscribers.a<T, T>
    {
        final r<? super T> L;
        
        a(final y5.a<? super T> a, final r<? super T> l) {
            super(a);
            this.L = l;
        }
        
        @Override
        public boolean B(final T t) {
            final boolean j = super.J;
            final boolean b = false;
            if (j) {
                return false;
            }
            if (super.K != 0) {
                return super.G.B(null);
            }
            try {
                final boolean a = this.L.a((Object)t);
                boolean b2 = b;
                if (a) {
                    b2 = b;
                    if (super.G.B(t)) {
                        b2 = true;
                    }
                }
                return b2;
            }
            finally {
                final Throwable t2;
                this.d(t2);
                return true;
            }
        }
        
        @Override
        public int E(final int n) {
            return this.e(n);
        }
        
        public void m(final T t) {
            if (!this.B(t)) {
                super.H.v(1L);
            }
        }
        
        @g
        public T poll() throws Exception {
            final y5.l<T> i = (y5.l<T>)super.I;
            final r<? super T> l = this.L;
            while (true) {
                final T poll = i.poll();
                if (poll == null) {
                    return null;
                }
                if (l.a(poll)) {
                    return poll;
                }
                if (super.K != 2) {
                    continue;
                }
                ((d)i).v(1L);
            }
        }
    }
    
    static final class b<T> extends io.reactivex.internal.subscribers.b<T, T> implements y5.a<T>
    {
        final r<? super T> L;
        
        b(final c<? super T> c, final r<? super T> l) {
            super(c);
            this.L = l;
        }
        
        @Override
        public boolean B(final T t) {
            if (super.J) {
                return false;
            }
            if (super.K != 0) {
                super.G.m((Object)null);
                return true;
            }
            try {
                final boolean a = this.L.a((Object)t);
                if (a) {
                    super.G.m((Object)t);
                }
                return a;
            }
            finally {
                final Throwable t2;
                this.d(t2);
                return true;
            }
        }
        
        public int E(final int n) {
            return this.e(n);
        }
        
        public void m(final T t) {
            if (!this.B(t)) {
                super.H.v(1L);
            }
        }
        
        @g
        public T poll() throws Exception {
            final y5.l<T> i = (y5.l<T>)super.I;
            final r<? super T> l = this.L;
            while (true) {
                final T poll = i.poll();
                if (poll == null) {
                    return null;
                }
                if (l.a(poll)) {
                    return poll;
                }
                if (super.K != 2) {
                    continue;
                }
                ((d)i).v(1L);
            }
        }
    }
}
