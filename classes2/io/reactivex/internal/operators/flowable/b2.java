// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.annotations.g;
import io.reactivex.internal.functions.b;
import io.reactivex.q;
import o7.c;
import io.reactivex.l;
import x5.o;

public final class b2<T, U> extends io.reactivex.internal.operators.flowable.a<T, U>
{
    final o<? super T, ? extends U> I;
    
    public b2(final l<T> l, final o<? super T, ? extends U> i) {
        super(l);
        this.I = i;
    }
    
    @Override
    protected void n6(final c<? super U> c) {
        Object o;
        l<T> l;
        if (c instanceof y5.a) {
            final l<T> h = (l<T>)super.H;
            o = new a<Object, Object>((y5.a<? super Object>)c, (o<? super Object, ?>)this.I);
            l = h;
        }
        else {
            final l<T> h2 = (l<T>)super.H;
            o = new b<Object, Object>(c, this.I);
            l = h2;
        }
        l.m6((q<? super T>)o);
    }
    
    static final class a<T, U> extends io.reactivex.internal.subscribers.a<T, U>
    {
        final x5.o<? super T, ? extends U> L;
        
        a(final y5.a<? super U> a, final x5.o<? super T, ? extends U> l) {
            super(a);
            this.L = l;
        }
        
        @Override
        public boolean B(final T t) {
            if (super.J) {
                return false;
            }
            try {
                return super.G.B(io.reactivex.internal.functions.b.g((Object)this.L.apply((Object)t), "The mapper function returned a null value."));
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
            if (super.J) {
                return;
            }
            if (super.K != 0) {
                ((c)super.G).m((Object)null);
                return;
            }
            try {
                ((c)super.G).m(io.reactivex.internal.functions.b.g((Object)this.L.apply((Object)t), "The mapper function returned a null value."));
            }
            finally {
                final Throwable t2;
                this.d(t2);
            }
        }
        
        @g
        public U poll() throws Exception {
            final Object poll = super.I.poll();
            U g;
            if (poll != null) {
                g = io.reactivex.internal.functions.b.g((U)this.L.apply((Object)poll), "The mapper function returned a null value.");
            }
            else {
                g = null;
            }
            return g;
        }
    }
    
    static final class b<T, U> extends io.reactivex.internal.subscribers.b<T, U>
    {
        final x5.o<? super T, ? extends U> L;
        
        b(final c<? super U> c, final x5.o<? super T, ? extends U> l) {
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
            if (super.K != 0) {
                super.G.m((Object)null);
                return;
            }
            try {
                super.G.m(io.reactivex.internal.functions.b.g((Object)this.L.apply((Object)t), "The mapper function returned a null value."));
            }
            finally {
                final Throwable t2;
                this.d(t2);
            }
        }
        
        @g
        public U poll() throws Exception {
            final Object poll = super.I.poll();
            U g;
            if (poll != null) {
                g = io.reactivex.internal.functions.b.g((U)this.L.apply((Object)poll), "The mapper function returned a null value.");
            }
            else {
                g = null;
            }
            return g;
        }
    }
}
