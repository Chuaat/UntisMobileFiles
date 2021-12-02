// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.parallel;

import io.reactivex.internal.subscriptions.j;
import o7.d;
import io.reactivex.internal.subscribers.h;
import io.reactivex.internal.subscriptions.g;
import o7.c;
import org.reactivestreams.Subscriber;
import java.util.concurrent.Callable;
import io.reactivex.parallel.b;

public final class a<T, C> extends b<C>
{
    final b<? extends T> a;
    final Callable<? extends C> b;
    final x5.b<? super C, ? super T> c;
    
    public a(final b<? extends T> a, final Callable<? extends C> b, final x5.b<? super C, ? super T> c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public int F() {
        return this.a.F();
    }
    
    @Override
    public void Q(final Subscriber<? super C>[] array) {
        if (!this.U((c[])array)) {
            return;
        }
        final int length = array.length;
        final c[] array2 = new c[length];
        int i = 0;
        while (i < length) {
            try {
                array2[i] = (c)new a((o7.c<? super Object>)array[i], io.reactivex.internal.functions.b.g((Object)this.b.call(), "The initialSupplier returned a null value"), (x5.b<? super Object, ? super Object>)this.c);
                ++i;
                continue;
            }
            finally {
                io.reactivex.exceptions.b.b((Throwable)(Object)array2);
                this.V((c[])array, (Throwable)(Object)array2);
                return;
            }
            break;
        }
        this.a.Q(array2);
    }
    
    void V(final Subscriber<?>[] array, final Throwable t) {
        for (int length = array.length, i = 0; i < length; ++i) {
            g.d(t, (c<?>)array[i]);
        }
    }
    
    static final class a<T, C> extends h<T, C>
    {
        private static final long Y = -4767392946044436228L;
        final x5.b<? super C, ? super T> V;
        C W;
        boolean X;
        
        a(final o7.c<? super C> c, final C w, final x5.b<? super C, ? super T> v) {
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
            if (this.X) {
                return;
            }
            this.X = true;
            final C w = this.W;
            this.W = null;
            this.g((R)w);
        }
        
        public void m(final T t) {
            if (this.X) {
                return;
            }
            try {
                this.V.a((Object)this.W, (Object)t);
            }
            finally {
                final Throwable t2;
                io.reactivex.exceptions.b.b(t2);
                this.cancel();
                this.b(t2);
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
