// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.parallel;

import io.reactivex.q;
import o7.d;
import y5.a;
import o7.c;
import org.reactivestreams.Subscriber;
import x5.o;
import io.reactivex.parallel.b;

public final class j<T, R> extends io.reactivex.parallel.b<R>
{
    final io.reactivex.parallel.b<T> a;
    final o<? super T, ? extends R> b;
    
    public j(final io.reactivex.parallel.b<T> a, final o<? super T, ? extends R> b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public int F() {
        return this.a.F();
    }
    
    @Override
    public void Q(final Subscriber<? super R>[] array) {
        if (!this.U((c[])array)) {
            return;
        }
        final int length = array.length;
        final c[] array2 = new c[length];
        for (int i = 0; i < length; ++i) {
            final Subscriber<? super R> subscriber = array[i];
            if (subscriber instanceof y5.a) {
                array2[i] = (c)new a((y5.a<? super Object>)subscriber, (o<? super Object, ?>)this.b);
            }
            else {
                array2[i] = (c)new b((o7.c<? super Object>)subscriber, (o<? super Object, ?>)this.b);
            }
        }
        this.a.Q(array2);
    }
    
    static final class a<T, R> implements y5.a<T>, d
    {
        final y5.a<? super R> G;
        final o<? super T, ? extends R> H;
        d I;
        boolean J;
        
        a(final y5.a<? super R> g, final o<? super T, ? extends R> h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public boolean B(final T t) {
            if (this.J) {
                return false;
            }
            try {
                return this.G.B((Object)io.reactivex.internal.functions.b.g((Object)this.H.apply((Object)t), "The mapper returned a null value"));
            }
            finally {
                final Throwable t2;
                io.reactivex.exceptions.b.b(t2);
                this.cancel();
                this.b(t2);
                return false;
            }
        }
        
        public void b(final Throwable t) {
            if (this.J) {
                io.reactivex.plugins.a.Y(t);
                return;
            }
            this.J = true;
            ((c)this.G).b(t);
        }
        
        public void cancel() {
            this.I.cancel();
        }
        
        public void f() {
            if (this.J) {
                return;
            }
            this.J = true;
            ((c)this.G).f();
        }
        
        public void m(final T t) {
            if (this.J) {
                return;
            }
            try {
                ((c)this.G).m(io.reactivex.internal.functions.b.g((Object)this.H.apply((Object)t), "The mapper returned a null value"));
            }
            finally {
                final Throwable t2;
                io.reactivex.exceptions.b.b(t2);
                this.cancel();
                this.b(t2);
            }
        }
        
        public void v(final long n) {
            this.I.v(n);
        }
        
        public void z(final d i) {
            if (io.reactivex.internal.subscriptions.j.o(this.I, i)) {
                this.I = i;
                this.G.z((d)this);
            }
        }
    }
    
    static final class b<T, R> implements q<T>, d
    {
        final c<? super R> G;
        final o<? super T, ? extends R> H;
        d I;
        boolean J;
        
        b(final c<? super R> g, final o<? super T, ? extends R> h) {
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
            try {
                this.G.m(io.reactivex.internal.functions.b.g((Object)this.H.apply((Object)t), "The mapper returned a null value"));
            }
            finally {
                final Throwable t2;
                io.reactivex.exceptions.b.b(t2);
                this.cancel();
                this.b(t2);
            }
        }
        
        public void v(final long n) {
            this.I.v(n);
        }
        
        @Override
        public void z(final d i) {
            if (io.reactivex.internal.subscriptions.j.o(this.I, i)) {
                this.I = i;
                this.G.z((d)this);
            }
        }
    }
}
