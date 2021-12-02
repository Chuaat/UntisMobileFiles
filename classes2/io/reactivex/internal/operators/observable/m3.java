// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.exceptions.b;
import java.util.concurrent.atomic.AtomicInteger;
import y5.j;
import io.reactivex.internal.disposables.d;
import io.reactivex.disposables.c;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.i0;
import io.reactivex.g0;
import x5.o;

public final class m3<T, R> extends io.reactivex.internal.operators.observable.a<T, R>
{
    final o<? super T, ? extends g0<? extends R>> H;
    final int I;
    final boolean J;
    
    public m3(final g0<T> g0, final o<? super T, ? extends g0<? extends R>> h, final int i, final boolean j) {
        super(g0);
        this.H = h;
        this.I = i;
        this.J = j;
    }
    
    public void L5(final i0<? super R> i0) {
        if (x2.b((g0<T>)super.G, (i0<? super Object>)i0, (o<? super T, ? extends g0<?>>)this.H)) {
            return;
        }
        super.G.c(new b<Object, Object>(i0, this.H, this.I, this.J));
    }
    
    static final class a<T, R> extends AtomicReference<c> implements i0<R>
    {
        private static final long L = 3837284832786408377L;
        final b<T, R> G;
        final long H;
        final int I;
        volatile y5.o<R> J;
        volatile boolean K;
        
        a(final b<T, R> g, final long h, final int i) {
            this.G = g;
            this.H = h;
            this.I = i;
        }
        
        public void a() {
            d.b(this);
        }
        
        @Override
        public void b(final Throwable t) {
            this.G.d(this, t);
        }
        
        @Override
        public void f() {
            if (this.H == this.G.P) {
                this.K = true;
                this.G.c();
            }
        }
        
        @Override
        public void l(final c c) {
            if (d.j(this, c)) {
                if (c instanceof j) {
                    final j j = (j)c;
                    final int e = j.E(7);
                    if (e == 1) {
                        this.J = (y5.o<R>)j;
                        this.K = true;
                        this.G.c();
                        return;
                    }
                    if (e == 2) {
                        this.J = (y5.o<R>)j;
                        return;
                    }
                }
                this.J = new io.reactivex.internal.queue.c<R>(this.I);
            }
        }
        
        @Override
        public void m(final R r) {
            if (this.H == this.G.P) {
                if (r != null) {
                    this.J.offer(r);
                }
                this.G.c();
            }
        }
    }
    
    static final class b<T, R> extends AtomicInteger implements i0<T>, c
    {
        private static final long Q = -3491074160481096299L;
        static final a<Object, Object> R;
        final i0<? super R> G;
        final o<? super T, ? extends g0<? extends R>> H;
        final int I;
        final boolean J;
        final io.reactivex.internal.util.c K;
        volatile boolean L;
        volatile boolean M;
        c N;
        final AtomicReference<a<T, R>> O;
        volatile long P;
        
        static {
            (R = new a(null, -1L, 1)).a();
        }
        
        b(final i0<? super R> g, final o<? super T, ? extends g0<? extends R>> h, final int i, final boolean j) {
            this.O = new AtomicReference<a<T, R>>();
            this.G = g;
            this.H = h;
            this.I = i;
            this.J = j;
            this.K = new io.reactivex.internal.util.c();
        }
        
        void a() {
            final a a = this.O.get();
            final a<Object, Object> r = b.R;
            if (a != r) {
                final a a2 = this.O.getAndSet((a<T, R>)r);
                if (a2 != r && a2 != null) {
                    a2.a();
                }
            }
        }
        
        @Override
        public void b(final Throwable t) {
            if (!this.L && this.K.a(t)) {
                if (!this.J) {
                    this.a();
                }
                this.L = true;
                this.c();
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        void c() {
            if (this.getAndIncrement() != 0) {
                return;
            }
            final i0<? super R> g = this.G;
            final AtomicReference<a<T, R>> o = this.O;
            final boolean j = this.J;
            int addAndGet = 1;
        Label_0026:
            while (!this.M) {
                Label_0114: {
                    if (this.L) {
                        final boolean b = o.get() == null;
                        if (j) {
                            if (b) {
                                final Throwable t = this.K.get();
                                if (t != null) {
                                    g.b(t);
                                }
                                else {
                                    g.f();
                                }
                                return;
                            }
                        }
                        else {
                            if (this.K.get() != null) {
                                break Label_0114;
                            }
                            if (b) {
                                g.f();
                                return;
                            }
                        }
                    }
                    final a expectedValue = (a)o.get();
                    Label_0412: {
                        if (expectedValue != null) {
                            final y5.o<R> i = ((a)expectedValue).J;
                            if (i != null) {
                                Label_0227: {
                                    if (((a)expectedValue).K) {
                                        final boolean empty = i.isEmpty();
                                        if (j) {
                                            if (!empty) {
                                                break Label_0227;
                                            }
                                        }
                                        else {
                                            if (this.K.get() != null) {
                                                break Label_0114;
                                            }
                                            if (!empty) {
                                                break Label_0227;
                                            }
                                        }
                                        o.compareAndSet(expectedValue, null);
                                        continue;
                                    }
                                }
                                while (!this.M) {
                                    boolean b2 = false;
                                    Label_0393: {
                                        if (expectedValue == o.get()) {
                                            if (!j && this.K.get() != null) {
                                                break Label_0114;
                                            }
                                            final boolean k = ((a)expectedValue).K;
                                            Object o2 = null;
                                            try {
                                                i.poll();
                                            }
                                            finally {
                                                final Throwable t2;
                                                io.reactivex.exceptions.b.b(t2);
                                                this.K.a(t2);
                                                o.compareAndSet(expectedValue, null);
                                                if (!j) {
                                                    this.a();
                                                    this.N.dispose();
                                                    this.L = true;
                                                }
                                                else {
                                                    expectedValue.a();
                                                }
                                                o2 = null;
                                                b2 = true;
                                            }
                                            final boolean b3 = o2 == null;
                                            if (k && b3) {
                                                o.compareAndSet(expectedValue, null);
                                            }
                                            else {
                                                if (b3) {
                                                    break Label_0393;
                                                }
                                                g.m(o2);
                                                continue;
                                            }
                                        }
                                        b2 = true;
                                    }
                                    if (b2) {
                                        continue Label_0026;
                                    }
                                    break Label_0412;
                                }
                                return;
                            }
                        }
                    }
                    if ((addAndGet = this.addAndGet(-addAndGet)) == 0) {
                        return;
                    }
                    continue;
                }
                g.b(this.K.c());
            }
        }
        
        void d(final a<T, R> a, final Throwable t) {
            if (a.H == this.P && this.K.a(t)) {
                if (!this.J) {
                    this.N.dispose();
                }
                a.K = true;
                this.c();
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        @Override
        public void dispose() {
            if (!this.M) {
                this.M = true;
                this.N.dispose();
                this.a();
            }
        }
        
        @Override
        public void f() {
            if (!this.L) {
                this.L = true;
                this.c();
            }
        }
        
        @Override
        public boolean i() {
            return this.M;
        }
        
        @Override
        public void l(final c n) {
            if (d.l(this.N, n)) {
                this.N = n;
                this.G.l(this);
            }
        }
        
        @Override
        public void m(final T t) {
            final long p = this.P + 1L;
            this.P = p;
            final a a = this.O.get();
            if (a != null) {
                a.a();
            }
            try {
                final g0 g0 = io.reactivex.internal.functions.b.g((g0)this.H.apply((Object)t), "The ObservableSource returned is null");
                final a newValue = new a((b<Object, Object>)this, p, this.I);
                a expectedValue;
                do {
                    expectedValue = this.O.get();
                    if (expectedValue == b.R) {
                        return;
                    }
                } while (!this.O.compareAndSet(expectedValue, (a<T, R>)newValue));
                g0.c(newValue);
            }
            finally {
                final Throwable t2;
                io.reactivex.exceptions.b.b(t2);
                this.N.dispose();
                this.b(t2);
            }
        }
    }
}
