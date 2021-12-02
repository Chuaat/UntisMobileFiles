// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.j;
import io.reactivex.annotations.g;
import io.reactivex.exceptions.b;
import o7.d;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.q;
import o7.c;
import io.reactivex.l;

public final class q0<T> extends io.reactivex.internal.operators.flowable.a<T, T>
{
    final x5.a I;
    
    public q0(final l<T> l, final x5.a i) {
        super(l);
        this.I = i;
    }
    
    @Override
    protected void n6(final c<? super T> c) {
        Object o;
        AtomicInteger atomicInteger;
        if (c instanceof y5.a) {
            final l<T> h = (l<T>)super.H;
            final a<Object> a = new a<Object>((y5.a<? super Object>)c, this.I);
            o = h;
            atomicInteger = a;
        }
        else {
            final l<T> h2 = (l<T>)super.H;
            atomicInteger = new b<Object>((o7.c<? super T>)c, this.I);
            o = h2;
        }
        ((l<T>)o).m6((q<? super T>)atomicInteger);
    }
    
    static final class a<T> extends c<T> implements y5.a<T>
    {
        private static final long M = 4109457741734051389L;
        final y5.a<? super T> H;
        final x5.a I;
        d J;
        y5.l<T> K;
        boolean L;
        
        a(final y5.a<? super T> h, final x5.a i) {
            this.H = h;
            this.I = i;
        }
        
        @Override
        public boolean B(final T t) {
            return this.H.B((Object)t);
        }
        
        @Override
        public int E(int e) {
            final y5.l<T> k = this.K;
            boolean l = false;
            if (k != null && (e & 0x4) == 0x0) {
                e = k.E(e);
                if (e != 0) {
                    if (e == 1) {
                        l = true;
                    }
                    this.L = l;
                }
                return e;
            }
            return 0;
        }
        
        public void b(final Throwable t) {
            ((o7.c)this.H).b(t);
            this.g();
        }
        
        public void cancel() {
            this.J.cancel();
            this.g();
        }
        
        public void clear() {
            this.K.clear();
        }
        
        public void f() {
            ((o7.c)this.H).f();
            this.g();
        }
        
        void g() {
            if (this.compareAndSet(0, 1)) {
                try {
                    this.I.run();
                }
                finally {
                    final Throwable t;
                    io.reactivex.exceptions.b.b(t);
                    io.reactivex.plugins.a.Y(t);
                }
            }
        }
        
        public boolean isEmpty() {
            return this.K.isEmpty();
        }
        
        public void m(final T t) {
            ((o7.c)this.H).m((Object)t);
        }
        
        @g
        public T poll() throws Exception {
            final T poll = this.K.poll();
            if (poll == null && this.L) {
                this.g();
            }
            return poll;
        }
        
        public void v(final long n) {
            this.J.v(n);
        }
        
        @Override
        public void z(final d j) {
            if (j.o(this.J, j)) {
                this.J = j;
                if (j instanceof y5.l) {
                    this.K = (y5.l<T>)j;
                }
                this.H.z((d)this);
            }
        }
    }
    
    static final class b<T> extends c<T> implements q<T>
    {
        private static final long M = 4109457741734051389L;
        final o7.c<? super T> H;
        final x5.a I;
        d J;
        y5.l<T> K;
        boolean L;
        
        b(final o7.c<? super T> h, final x5.a i) {
            this.H = h;
            this.I = i;
        }
        
        public int E(int e) {
            final y5.l<T> k = this.K;
            boolean l = false;
            if (k != null && (e & 0x4) == 0x0) {
                e = k.E(e);
                if (e != 0) {
                    if (e == 1) {
                        l = true;
                    }
                    this.L = l;
                }
                return e;
            }
            return 0;
        }
        
        public void b(final Throwable t) {
            this.H.b(t);
            this.g();
        }
        
        public void cancel() {
            this.J.cancel();
            this.g();
        }
        
        public void clear() {
            this.K.clear();
        }
        
        public void f() {
            this.H.f();
            this.g();
        }
        
        void g() {
            if (this.compareAndSet(0, 1)) {
                try {
                    this.I.run();
                }
                finally {
                    final Throwable t;
                    io.reactivex.exceptions.b.b(t);
                    io.reactivex.plugins.a.Y(t);
                }
            }
        }
        
        public boolean isEmpty() {
            return this.K.isEmpty();
        }
        
        public void m(final T t) {
            this.H.m((Object)t);
        }
        
        @g
        public T poll() throws Exception {
            final T poll = this.K.poll();
            if (poll == null && this.L) {
                this.g();
            }
            return poll;
        }
        
        public void v(final long n) {
            this.J.v(n);
        }
        
        @Override
        public void z(final d j) {
            if (j.o(this.J, j)) {
                this.J = j;
                if (j instanceof y5.l) {
                    this.K = (y5.l<T>)j;
                }
                this.H.z((d)this);
            }
        }
    }
}
