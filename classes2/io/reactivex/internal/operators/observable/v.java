// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.disposables.d;
import java.io.Serializable;
import java.util.concurrent.Callable;
import io.reactivex.internal.functions.b;
import io.reactivex.disposables.c;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.observers.m;
import io.reactivex.i0;
import io.reactivex.internal.util.j;
import io.reactivex.g0;
import x5.o;

public final class v<T, U> extends io.reactivex.internal.operators.observable.a<T, U>
{
    final o<? super T, ? extends g0<? extends U>> H;
    final int I;
    final j J;
    
    public v(final g0<T> g0, final o<? super T, ? extends g0<? extends U>> h, final int b, final j j) {
        super(g0);
        this.H = h;
        this.J = j;
        this.I = Math.max(8, b);
    }
    
    public void L5(final i0<? super U> i0) {
        if (x2.b((g0<T>)super.G, (i0<? super Object>)i0, (o<? super T, ? extends g0<?>>)this.H)) {
            return;
        }
        if (this.J == j.G) {
            super.G.c(new b<Object, Object>(new m<Object>(i0), this.H, this.I));
        }
        else {
            super.G.c(new a<Object, Object>(i0, this.H, this.I, this.J == j.I));
        }
    }
    
    static final class a<T, R> extends AtomicInteger implements i0<T>, c
    {
        private static final long S = -6951100001833242599L;
        final i0<? super R> G;
        final o<? super T, ? extends g0<? extends R>> H;
        final int I;
        final io.reactivex.internal.util.c J;
        final v.a.a<R> K;
        final boolean L;
        y5.o<T> M;
        c N;
        volatile boolean O;
        volatile boolean P;
        volatile boolean Q;
        int R;
        
        a(final i0<? super R> g, final o<? super T, ? extends g0<? extends R>> h, final int i, final boolean l) {
            this.G = g;
            this.H = h;
            this.I = i;
            this.L = l;
            this.J = new io.reactivex.internal.util.c();
            this.K = new v.a.a<R>(g, this);
        }
        
        void a() {
            if (this.getAndIncrement() != 0) {
                return;
            }
            final i0<? super R> g = this.G;
            final y5.o<T> m = this.M;
            Serializable s = this.J;
            while (true) {
                if (!this.O) {
                    if (this.Q) {
                        m.clear();
                        return;
                    }
                    if (!this.L && ((AtomicReference<Throwable>)s).get() != null) {
                        m.clear();
                        this.Q = true;
                        break;
                    }
                    final boolean p = this.P;
                    try {
                        final T poll = m.poll();
                        final boolean b = poll == null;
                        if (p && b) {
                            this.Q = true;
                            s = ((io.reactivex.internal.util.c)s).c();
                            if (s != null) {
                                g.b((Throwable)s);
                            }
                            else {
                                g.f();
                            }
                            return;
                        }
                        if (!b) {
                            try {
                                final g0<Object> g2 = io.reactivex.internal.functions.b.g((g0<Object>)this.H.apply((Object)poll), "The mapper returned a null ObservableSource");
                                if (g2 instanceof Callable) {
                                    try {
                                        final Object call = ((Callable<Object>)g2).call();
                                        if (call == null || this.Q) {
                                            continue;
                                        }
                                        g.m(call);
                                    }
                                    finally {
                                        final Throwable t;
                                        io.reactivex.exceptions.b.b(t);
                                        ((io.reactivex.internal.util.c)s).a(t);
                                    }
                                    continue;
                                }
                                this.O = true;
                                g2.c((i0<? super Object>)this.K);
                            }
                            finally {
                                final Throwable t2;
                                io.reactivex.exceptions.b.b(t2);
                                this.Q = true;
                                this.N.dispose();
                                m.clear();
                                ((io.reactivex.internal.util.c)s).a(t2);
                            }
                        }
                    }
                    finally {
                        io.reactivex.exceptions.b.b((Throwable)m);
                        this.Q = true;
                        this.N.dispose();
                        ((io.reactivex.internal.util.c)s).a((Throwable)m);
                        break;
                    }
                }
                if (this.decrementAndGet() == 0) {
                    return;
                }
            }
            g.b(((io.reactivex.internal.util.c)s).c());
        }
        
        @Override
        public void b(final Throwable t) {
            if (this.J.a(t)) {
                this.P = true;
                this.a();
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        @Override
        public void dispose() {
            this.Q = true;
            this.N.dispose();
            this.K.a();
        }
        
        @Override
        public void f() {
            this.P = true;
            this.a();
        }
        
        @Override
        public boolean i() {
            return this.Q;
        }
        
        @Override
        public void l(final c n) {
            if (d.l(this.N, n)) {
                this.N = n;
                if (n instanceof y5.j) {
                    final y5.j j = (y5.j)n;
                    final int e = j.E(3);
                    if (e == 1) {
                        this.R = e;
                        this.M = (y5.o<T>)j;
                        this.P = true;
                        this.G.l(this);
                        this.a();
                        return;
                    }
                    if (e == 2) {
                        this.R = e;
                        this.M = (y5.o<T>)j;
                        this.G.l(this);
                        return;
                    }
                }
                this.M = new io.reactivex.internal.queue.c<T>(this.I);
                this.G.l(this);
            }
        }
        
        @Override
        public void m(final T t) {
            if (this.R == 0) {
                this.M.offer(t);
            }
            this.a();
        }
        
        static final class a<R> extends AtomicReference<c> implements i0<R>
        {
            private static final long I = 2620149119579502636L;
            final i0<? super R> G;
            final v.a<?, R> H;
            
            a(final i0<? super R> g, final v.a<?, R> h) {
                this.G = g;
                this.H = h;
            }
            
            void a() {
                d.b(this);
            }
            
            @Override
            public void b(final Throwable t) {
                final v.a<?, R> h = this.H;
                if (h.J.a(t)) {
                    if (!h.L) {
                        h.N.dispose();
                    }
                    h.O = false;
                    h.a();
                }
                else {
                    io.reactivex.plugins.a.Y(t);
                }
            }
            
            @Override
            public void f() {
                final v.a<?, R> h = this.H;
                h.O = false;
                h.a();
            }
            
            @Override
            public void l(final c c) {
                d.f(this, c);
            }
            
            @Override
            public void m(final R r) {
                this.G.m((Object)r);
            }
        }
    }
    
    static final class b<T, U> extends AtomicInteger implements i0<T>, c
    {
        private static final long Q = 8828587559905699186L;
        final i0<? super U> G;
        final o<? super T, ? extends g0<? extends U>> H;
        final a<U> I;
        final int J;
        y5.o<T> K;
        c L;
        volatile boolean M;
        volatile boolean N;
        volatile boolean O;
        int P;
        
        b(final i0<? super U> g, final o<? super T, ? extends g0<? extends U>> h, final int j) {
            this.G = g;
            this.H = h;
            this.J = j;
            this.I = new a<U>(g, this);
        }
        
        void a() {
            if (this.getAndIncrement() != 0) {
                return;
            }
            while (!this.N) {
                if (!this.M) {
                    final boolean o = this.O;
                    try {
                        final T poll = this.K.poll();
                        final boolean b = poll == null;
                        if (o && b) {
                            this.N = true;
                            this.G.f();
                            return;
                        }
                        if (!b) {
                            try {
                                final g0 g0 = io.reactivex.internal.functions.b.g((g0)this.H.apply((Object)poll), "The mapper returned a null ObservableSource");
                                this.M = true;
                                g0.c(this.I);
                            }
                            finally {
                                final Throwable t;
                                io.reactivex.exceptions.b.b(t);
                                this.dispose();
                                this.K.clear();
                                this.G.b(t);
                                return;
                            }
                        }
                    }
                    finally {
                        final Throwable t2;
                        io.reactivex.exceptions.b.b(t2);
                        this.dispose();
                        this.K.clear();
                        this.G.b(t2);
                        return;
                    }
                }
                if (this.decrementAndGet() == 0) {
                    return;
                }
            }
            this.K.clear();
        }
        
        @Override
        public void b(final Throwable t) {
            if (this.O) {
                io.reactivex.plugins.a.Y(t);
                return;
            }
            this.O = true;
            this.dispose();
            this.G.b(t);
        }
        
        void c() {
            this.M = false;
            this.a();
        }
        
        @Override
        public void dispose() {
            this.N = true;
            this.I.a();
            this.L.dispose();
            if (this.getAndIncrement() == 0) {
                this.K.clear();
            }
        }
        
        @Override
        public void f() {
            if (this.O) {
                return;
            }
            this.O = true;
            this.a();
        }
        
        @Override
        public boolean i() {
            return this.N;
        }
        
        @Override
        public void l(final c l) {
            if (d.l(this.L, l)) {
                this.L = l;
                if (l instanceof y5.j) {
                    final y5.j j = (y5.j)l;
                    final int e = j.E(3);
                    if (e == 1) {
                        this.P = e;
                        this.K = (y5.o<T>)j;
                        this.O = true;
                        this.G.l(this);
                        this.a();
                        return;
                    }
                    if (e == 2) {
                        this.P = e;
                        this.K = (y5.o<T>)j;
                        this.G.l(this);
                        return;
                    }
                }
                this.K = new io.reactivex.internal.queue.c<T>(this.J);
                this.G.l(this);
            }
        }
        
        @Override
        public void m(final T t) {
            if (this.O) {
                return;
            }
            if (this.P == 0) {
                this.K.offer(t);
            }
            this.a();
        }
        
        static final class a<U> extends AtomicReference<c> implements i0<U>
        {
            private static final long I = -7449079488798789337L;
            final i0<? super U> G;
            final b<?, ?> H;
            
            a(final i0<? super U> g, final b<?, ?> h) {
                this.G = g;
                this.H = h;
            }
            
            void a() {
                d.b(this);
            }
            
            @Override
            public void b(final Throwable t) {
                this.H.dispose();
                this.G.b(t);
            }
            
            @Override
            public void f() {
                this.H.c();
            }
            
            @Override
            public void l(final c c) {
                d.f(this, c);
            }
            
            @Override
            public void m(final U u) {
                this.G.m((Object)u);
            }
        }
    }
}
