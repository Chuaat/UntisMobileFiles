// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.i;
import java.util.concurrent.Callable;
import o7.d;
import io.reactivex.q;
import java.util.concurrent.atomic.AtomicInteger;
import o7.c;
import io.reactivex.l;
import io.reactivex.internal.util.j;
import o7.b;
import x5.o;

public final class w<T, R> extends a<T, R>
{
    final o<? super T, ? extends o7.b<? extends R>> I;
    final int J;
    final j K;
    
    public w(final l<T> l, final o<? super T, ? extends o7.b<? extends R>> i, final int j, final j k) {
        super(l);
        this.I = i;
        this.J = j;
        this.K = k;
    }
    
    public static <T, R> o7.c<T> P8(final o7.c<? super R> c, final o<? super T, ? extends o7.b<? extends R>> o, final int n, final j j) {
        final int n2 = w$a.a[j.ordinal()];
        if (n2 == 1) {
            return (o7.c<T>)new c((o7.c<? super Object>)c, (o<? super Object, ? extends o7.b<?>>)o, n, false);
        }
        if (n2 != 2) {
            return (o7.c<T>)new d((o7.c<? super Object>)c, (o<? super Object, ? extends o7.b<?>>)o, n);
        }
        return (o7.c<T>)new c((o7.c<? super Object>)c, (o<? super Object, ? extends o7.b<?>>)o, n, true);
    }
    
    @Override
    protected void n6(final o7.c<? super R> c) {
        if (j3.b((o7.b<Object>)super.H, (o7.c<? super Object>)c, (o<? super Object, ? extends o7.b<?>>)this.I)) {
            return;
        }
        super.H.e(P8((o7.c<? super Object>)c, (o<? super T, ? extends o7.b<?>>)this.I, this.J, this.K));
    }
    
    abstract static class b<T, R> extends AtomicInteger implements q<T>, f<R>, o7.d
    {
        private static final long S = -3511336836796789179L;
        final e<R> G;
        final o<? super T, ? extends o7.b<? extends R>> H;
        final int I;
        final int J;
        o7.d K;
        int L;
        y5.o<T> M;
        volatile boolean N;
        volatile boolean O;
        final io.reactivex.internal.util.c P;
        volatile boolean Q;
        int R;
        
        b(final o<? super T, ? extends o7.b<? extends R>> h, final int i) {
            this.H = h;
            this.I = i;
            this.J = i - (i >> 2);
            this.G = (e<R>)new e((f<Object>)this);
            this.P = new io.reactivex.internal.util.c();
        }
        
        @Override
        public final void d() {
            this.Q = false;
            this.e();
        }
        
        abstract void e();
        
        public final void f() {
            this.N = true;
            this.e();
        }
        
        abstract void g();
        
        public final void m(final T t) {
            if (this.R != 2 && !this.M.offer(t)) {
                this.K.cancel();
                ((o7.c)this).b((Throwable)new IllegalStateException("Queue full?!"));
                return;
            }
            this.e();
        }
        
        @Override
        public final void z(final o7.d k) {
            if (io.reactivex.internal.subscriptions.j.o(this.K, k)) {
                this.K = k;
                if (k instanceof y5.l) {
                    final y5.l l = (y5.l)k;
                    final int e = l.E(7);
                    if (e == 1) {
                        this.R = e;
                        this.M = (y5.o<T>)l;
                        this.N = true;
                        this.g();
                        this.e();
                        return;
                    }
                    if (e == 2) {
                        this.R = e;
                        this.M = (y5.o<T>)l;
                        this.g();
                        k.v((long)this.I);
                        return;
                    }
                }
                this.M = new io.reactivex.internal.queue.b<T>(this.I);
                this.g();
                k.v((long)this.I);
            }
        }
    }
    
    static final class c<T, R> extends b<T, R>
    {
        private static final long V = -2945777694260521066L;
        final o7.c<? super R> T;
        final boolean U;
        
        c(final o7.c<? super R> t, final o<? super T, ? extends o7.b<? extends R>> o, final int n, final boolean u) {
            super(o, n);
            this.T = t;
            this.U = u;
        }
        
        @Override
        public void a(final Throwable t) {
            if (super.P.a(t)) {
                if (!this.U) {
                    super.K.cancel();
                    super.N = true;
                }
                super.Q = false;
                this.e();
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        public void b(final Throwable t) {
            if (super.P.a(t)) {
                super.N = true;
                this.e();
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        @Override
        public void c(final R r) {
            this.T.m((Object)r);
        }
        
        public void cancel() {
            if (!super.O) {
                super.O = true;
                super.G.cancel();
                super.K.cancel();
            }
        }
        
        @Override
        void e() {
            if (this.getAndIncrement() == 0) {
                while (!super.O) {
                    Label_0321: {
                        if (!super.Q) {
                            final boolean n = super.N;
                            Label_0051: {
                                if (!n || this.U || super.P.get() == null) {
                                    final Throwable t;
                                    try {
                                        final T poll = super.M.poll();
                                        final boolean b = poll == null;
                                        if (n && b) {
                                            final Throwable c = super.P.c();
                                            if (c != null) {
                                                this.T.b(c);
                                            }
                                            else {
                                                this.T.f();
                                            }
                                            return;
                                        }
                                        if (b) {
                                            break Label_0321;
                                        }
                                        final o7.b b2 = io.reactivex.internal.functions.b.g((o7.b)super.H.apply(poll), "The mapper returned a null Publisher");
                                        if (super.R != 1) {
                                            final int l = super.L + 1;
                                            if (l == super.J) {
                                                super.L = 0;
                                                super.K.v((long)l);
                                            }
                                            else {
                                                super.L = l;
                                            }
                                        }
                                        if (b2 instanceof Callable) {
                                            final Object call = ((Callable<Object>)b2).call();
                                            if (call == null) {
                                                continue;
                                            }
                                            if (super.G.h()) {
                                                this.T.m(call);
                                                continue;
                                            }
                                            super.Q = true;
                                            final e<R> g = (e<R>)super.G;
                                            g.j((o7.d)new g(call, (o7.c<? super Object>)g));
                                            break Label_0321;
                                        }
                                    }
                                    finally {
                                        io.reactivex.exceptions.b.b(t);
                                        super.K.cancel();
                                        super.P.a(t);
                                        break Label_0051;
                                    }
                                    super.Q = true;
                                    ((o7.b)t).e((o7.c)super.G);
                                    break Label_0321;
                                }
                            }
                            this.T.b(super.P.c());
                            return;
                        }
                    }
                    if (this.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }
        
        @Override
        void g() {
            this.T.z((o7.d)this);
        }
        
        public void v(final long n) {
            super.G.v(n);
        }
    }
    
    static final class d<T, R> extends b<T, R>
    {
        private static final long V = 7898995095634264146L;
        final o7.c<? super R> T;
        final AtomicInteger U;
        
        d(final o7.c<? super R> t, final o<? super T, ? extends o7.b<? extends R>> o, final int n) {
            super(o, n);
            this.T = t;
            this.U = new AtomicInteger();
        }
        
        @Override
        public void a(final Throwable t) {
            if (super.P.a(t)) {
                super.K.cancel();
                if (this.getAndIncrement() == 0) {
                    this.T.b(super.P.c());
                }
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        public void b(final Throwable t) {
            if (super.P.a(t)) {
                super.G.cancel();
                if (this.getAndIncrement() == 0) {
                    this.T.b(super.P.c());
                }
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        @Override
        public void c(final R r) {
            if (this.get() == 0 && this.compareAndSet(0, 1)) {
                this.T.m((Object)r);
                if (this.compareAndSet(1, 0)) {
                    return;
                }
                this.T.b(super.P.c());
            }
        }
        
        public void cancel() {
            if (!super.O) {
                super.O = true;
                super.G.cancel();
                super.K.cancel();
            }
        }
        
        @Override
        void e() {
            if (this.U.getAndIncrement() == 0) {
                while (!super.O) {
                    Label_0395: {
                        if (!super.Q) {
                            final boolean n = super.N;
                            try {
                                final T poll = super.M.poll();
                                final boolean b = poll == null;
                                if (n && b) {
                                    this.T.f();
                                    return;
                                }
                                if (!b) {
                                    try {
                                        final o7.b b2 = io.reactivex.internal.functions.b.g((o7.b)super.H.apply(poll), "The mapper returned a null Publisher");
                                        if (super.R != 1) {
                                            final int l = super.L + 1;
                                            if (l == super.J) {
                                                super.L = 0;
                                                super.K.v((long)l);
                                            }
                                            else {
                                                super.L = l;
                                            }
                                        }
                                        if (b2 instanceof Callable) {
                                            final Callable<Object> callable = (Callable<Object>)b2;
                                            try {
                                                final Object call = callable.call();
                                                if (call == null) {
                                                    continue;
                                                }
                                                if (!super.G.h()) {
                                                    super.Q = true;
                                                    final e<R> g = (e<R>)super.G;
                                                    g.j((o7.d)new g(call, (o7.c<? super Object>)g));
                                                    break Label_0395;
                                                }
                                                if (this.get() != 0 || !this.compareAndSet(0, 1)) {
                                                    continue;
                                                }
                                                this.T.m(call);
                                                if (!this.compareAndSet(1, 0)) {
                                                    this.T.b(super.P.c());
                                                    return;
                                                }
                                                continue;
                                            }
                                            finally {
                                                final Throwable t;
                                                io.reactivex.exceptions.b.b(t);
                                                super.K.cancel();
                                                super.P.a(t);
                                                this.T.b(super.P.c());
                                                return;
                                            }
                                        }
                                        super.Q = true;
                                        b2.e((o7.c)super.G);
                                    }
                                    finally {
                                        final Throwable t2;
                                        io.reactivex.exceptions.b.b(t2);
                                        super.K.cancel();
                                        super.P.a(t2);
                                        this.T.b(super.P.c());
                                        return;
                                    }
                                }
                            }
                            finally {
                                final Throwable t3;
                                io.reactivex.exceptions.b.b(t3);
                                super.K.cancel();
                                super.P.a(t3);
                                this.T.b(super.P.c());
                                return;
                            }
                        }
                    }
                    if (this.U.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }
        
        @Override
        void g() {
            this.T.z((o7.d)this);
        }
        
        public void v(final long n) {
            super.G.v(n);
        }
    }
    
    static final class e<R> extends i implements q<R>
    {
        private static final long R = 897683679971470653L;
        final f<R> P;
        long Q;
        
        e(final f<R> p) {
            super(false);
            this.P = p;
        }
        
        public void b(final Throwable t) {
            final long q = this.Q;
            if (q != 0L) {
                this.Q = 0L;
                this.i(q);
            }
            this.P.a(t);
        }
        
        public void f() {
            final long q = this.Q;
            if (q != 0L) {
                this.Q = 0L;
                this.i(q);
            }
            this.P.d();
        }
        
        public void m(final R r) {
            ++this.Q;
            this.P.c(r);
        }
        
        @Override
        public void z(final o7.d d) {
            this.j(d);
        }
    }
    
    interface f<T>
    {
        void a(final Throwable p0);
        
        void c(final T p0);
        
        void d();
    }
    
    static final class g<T> implements o7.d
    {
        final o7.c<? super T> G;
        final T H;
        boolean I;
        
        g(final T h, final o7.c<? super T> g) {
            this.H = h;
            this.G = g;
        }
        
        public void cancel() {
        }
        
        public void v(final long n) {
            if (n > 0L && !this.I) {
                this.I = true;
                final o7.c<? super T> g = this.G;
                g.m((Object)this.H);
                g.f();
            }
        }
    }
}
