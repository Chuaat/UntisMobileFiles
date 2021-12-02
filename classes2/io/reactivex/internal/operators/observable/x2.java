// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.annotations.g;
import y5.j;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.disposables.c;
import io.reactivex.internal.functions.b;
import io.reactivex.internal.disposables.e;
import java.util.concurrent.Callable;
import io.reactivex.i0;
import io.reactivex.plugins.a;
import io.reactivex.b0;
import io.reactivex.g0;
import x5.o;

public final class x2
{
    private x2() {
        throw new IllegalStateException("No instances!");
    }
    
    public static <T, U> b0<U> a(final T t, final o<? super T, ? extends g0<? extends U>> o) {
        return io.reactivex.plugins.a.R((b0<U>)new b(t, (o<? super Object, ? extends g0<?>>)o));
    }
    
    public static <T, R> boolean b(final g0<T> g0, final i0<? super R> i0, final o<? super T, ? extends g0<? extends R>> o) {
        if (g0 instanceof Callable) {
            final g0 g3;
            try {
                final Object call = ((Callable<Object>)g0).call();
                if (call == null) {
                    e.f(i0);
                    return true;
                }
                final g0 g2 = io.reactivex.internal.functions.b.g((g0)o.apply((Object)call), "The mapper returned a null ObservableSource");
                if (g2 instanceof Callable) {
                    final Object call2 = ((Callable<Object>)g2).call();
                    if (call2 == null) {
                        e.f(i0);
                        return true;
                    }
                    final a a = new a(i0, call2);
                    i0.l(a);
                    a.run();
                    return true;
                }
            }
            finally {
                io.reactivex.exceptions.b.b((Throwable)g3);
                e.l((Throwable)g3, i0);
                return true;
            }
            g3.c(i0);
            return true;
        }
        return false;
    }
    
    public static final class a<T> extends AtomicInteger implements j<T>, Runnable
    {
        private static final long I = 3880992722410194083L;
        static final int J = 0;
        static final int K = 1;
        static final int L = 2;
        static final int M = 3;
        final i0<? super T> G;
        final T H;
        
        public a(final i0<? super T> g, final T h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public int E(final int n) {
            if ((n & 0x1) != 0x0) {
                this.lazySet(1);
                return 1;
            }
            return 0;
        }
        
        @Override
        public void clear() {
            this.lazySet(3);
        }
        
        @Override
        public void dispose() {
            this.set(3);
        }
        
        @Override
        public boolean i() {
            return this.get() == 3;
        }
        
        @Override
        public boolean isEmpty() {
            final int value = this.get();
            boolean b = true;
            if (value == 1) {
                b = false;
            }
            return b;
        }
        
        @Override
        public boolean offer(final T t) {
            throw new UnsupportedOperationException("Should not be called!");
        }
        
        @Override
        public boolean p(final T t, final T t2) {
            throw new UnsupportedOperationException("Should not be called!");
        }
        
        @g
        @Override
        public T poll() throws Exception {
            if (this.get() == 1) {
                this.lazySet(3);
                return this.H;
            }
            return null;
        }
        
        @Override
        public void run() {
            if (this.get() == 0 && this.compareAndSet(0, 2)) {
                this.G.m((Object)this.H);
                if (this.get() == 2) {
                    this.lazySet(3);
                    this.G.f();
                }
            }
        }
    }
    
    static final class b<T, R> extends b0<R>
    {
        final T G;
        final o<? super T, ? extends g0<? extends R>> H;
        
        b(final T g, final o<? super T, ? extends g0<? extends R>> h) {
            this.G = g;
            this.H = h;
        }
        
        public void L5(final i0<? super R> i0) {
            try {
                final g0<Object> g0 = io.reactivex.internal.functions.b.g((g0<Object>)this.H.apply((Object)this.G), "The mapper returned a null ObservableSource");
                if (g0 instanceof Callable) {
                    try {
                        final Object call = ((Callable<Object>)g0).call();
                        if (call == null) {
                            e.f(i0);
                            return;
                        }
                        final a a = new a(i0, call);
                        i0.l(a);
                        a.run();
                        return;
                    }
                    finally {
                        final Throwable t;
                        io.reactivex.exceptions.b.b(t);
                        e.l(t, i0);
                        return;
                    }
                }
                g0.c((i0<? super Object>)i0);
            }
            finally {
                final Throwable t2;
                e.l(t2, i0);
            }
        }
    }
}
