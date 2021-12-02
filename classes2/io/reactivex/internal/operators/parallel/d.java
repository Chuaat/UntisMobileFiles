// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.parallel;

import io.reactivex.internal.subscriptions.j;
import y5.a;
import o7.c;
import org.reactivestreams.Subscriber;
import x5.r;
import io.reactivex.parallel.b;

public final class d<T> extends io.reactivex.parallel.b<T>
{
    final io.reactivex.parallel.b<T> a;
    final r<? super T> b;
    
    public d(final io.reactivex.parallel.b<T> a, final r<? super T> b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public int F() {
        return this.a.F();
    }
    
    @Override
    public void Q(final Subscriber<? super T>[] array) {
        if (!this.U((o7.c[])array)) {
            return;
        }
        final int length = array.length;
        final o7.c[] array2 = new o7.c[length];
        for (int i = 0; i < length; ++i) {
            final Subscriber<? super T> subscriber = array[i];
            if (subscriber instanceof y5.a) {
                array2[i] = (o7.c)new b((y5.a<? super Object>)subscriber, (r<? super Object>)this.b);
            }
            else {
                array2[i] = (o7.c)new c((o7.c<? super Object>)subscriber, (r<? super Object>)this.b);
            }
        }
        this.a.Q(array2);
    }
    
    abstract static class a<T> implements y5.a<T>, o7.d
    {
        final r<? super T> G;
        o7.d H;
        boolean I;
        
        a(final r<? super T> g) {
            this.G = g;
        }
        
        public final void cancel() {
            this.H.cancel();
        }
        
        public final void m(final T t) {
            if (!this.B(t) && !this.I) {
                this.H.v(1L);
            }
        }
        
        public final void v(final long n) {
            this.H.v(n);
        }
    }
    
    static final class b<T> extends a<T>
    {
        final y5.a<? super T> J;
        
        b(final y5.a<? super T> j, final r<? super T> r) {
            super(r);
            this.J = j;
        }
        
        @Override
        public boolean B(final T t) {
            if (!super.I) {
                try {
                    if (super.G.a(t)) {
                        return this.J.B((Object)t);
                    }
                }
                finally {
                    final Throwable t2;
                    io.reactivex.exceptions.b.b(t2);
                    this.cancel();
                    this.b(t2);
                }
            }
            return false;
        }
        
        public void b(final Throwable t) {
            if (super.I) {
                io.reactivex.plugins.a.Y(t);
                return;
            }
            super.I = true;
            ((o7.c)this.J).b(t);
        }
        
        public void f() {
            if (!super.I) {
                super.I = true;
                ((o7.c)this.J).f();
            }
        }
        
        public void z(final o7.d h) {
            if (j.o(super.H, h)) {
                super.H = h;
                this.J.z((o7.d)this);
            }
        }
    }
    
    static final class c<T> extends a<T>
    {
        final o7.c<? super T> J;
        
        c(final o7.c<? super T> j, final r<? super T> r) {
            super(r);
            this.J = j;
        }
        
        @Override
        public boolean B(final T t) {
            if (!super.I) {
                try {
                    if (super.G.a(t)) {
                        this.J.m((Object)t);
                        return true;
                    }
                }
                finally {
                    final Throwable t2;
                    io.reactivex.exceptions.b.b(t2);
                    this.cancel();
                    this.b(t2);
                }
            }
            return false;
        }
        
        public void b(final Throwable t) {
            if (super.I) {
                io.reactivex.plugins.a.Y(t);
                return;
            }
            super.I = true;
            this.J.b(t);
        }
        
        public void f() {
            if (!super.I) {
                super.I = true;
                this.J.f();
            }
        }
        
        public void z(final o7.d h) {
            if (j.o(super.H, h)) {
                super.H = h;
                this.J.z((o7.d)this);
            }
        }
    }
}
