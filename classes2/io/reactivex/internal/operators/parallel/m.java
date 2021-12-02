// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.parallel;

import io.reactivex.internal.subscriptions.j;
import o7.d;
import io.reactivex.plugins.a;
import io.reactivex.internal.subscribers.h;
import io.reactivex.internal.subscriptions.g;
import org.reactivestreams.Subscriber;
import x5.c;
import java.util.concurrent.Callable;
import io.reactivex.parallel.b;

public final class m<T, R> extends b<R>
{
    final b<? extends T> a;
    final Callable<R> b;
    final c<R, ? super T, R> c;
    
    public m(final b<? extends T> a, final Callable<R> b, final c<R, ? super T, R> c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public int F() {
        return this.a.F();
    }
    
    @Override
    public void Q(final Subscriber<? super R>[] array) {
        if (!this.U((o7.c[])array)) {
            return;
        }
        final int length = array.length;
        final o7.c[] array2 = new o7.c[length];
        int i = 0;
        while (i < length) {
            try {
                array2[i] = (o7.c)new a((o7.c<? super Object>)array[i], io.reactivex.internal.functions.b.g(this.b.call(), "The initialSupplier returned a null value"), (c<Object, ? super Object, Object>)this.c);
                ++i;
                continue;
            }
            finally {
                final Throwable t;
                io.reactivex.exceptions.b.b(t);
                this.V((o7.c[])array, t);
                return;
            }
            break;
        }
        this.a.Q(array2);
    }
    
    void V(final Subscriber<?>[] array, final Throwable t) {
        for (int length = array.length, i = 0; i < length; ++i) {
            g.d(t, (o7.c<?>)array[i]);
        }
    }
    
    static final class a<T, R> extends h<T, R>
    {
        private static final long Y = 8200530050639449080L;
        final x5.c<R, ? super T, R> V;
        R W;
        boolean X;
        
        a(final o7.c<? super R> c, final R w, final x5.c<R, ? super T, R> v) {
            super(c);
            this.W = w;
            this.V = v;
        }
        
        @Override
        public void b(final Throwable t) {
            if (this.X) {
                io.reactivex.plugins.a.Y(t);
                return;
            }
            this.X = true;
            this.W = null;
            super.H.b(t);
        }
        
        @Override
        public void cancel() {
            super.cancel();
            super.S.cancel();
        }
        
        @Override
        public void f() {
            if (!this.X) {
                this.X = true;
                final R w = this.W;
                this.W = null;
                this.g((R)w);
            }
        }
        
        public void m(final T t) {
            if (!this.X) {
                try {
                    this.W = io.reactivex.internal.functions.b.g(this.V.b(this.W, (Object)t), "The reducer returned a null value");
                }
                finally {
                    final Throwable t2;
                    io.reactivex.exceptions.b.b(t2);
                    this.cancel();
                    this.b(t2);
                }
            }
        }
        
        @Override
        public void z(final d s) {
            if (j.o(super.S, s)) {
                super.S = s;
                super.H.z((d)this);
                s.v(Long.MAX_VALUE);
            }
        }
    }
}
