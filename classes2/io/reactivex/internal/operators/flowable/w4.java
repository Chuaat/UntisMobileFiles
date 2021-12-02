// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import io.reactivex.internal.subscriptions.j;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.processors.h;
import o7.d;
import io.reactivex.internal.subscribers.n;
import io.reactivex.q;
import io.reactivex.subscribers.e;
import o7.c;
import io.reactivex.j0;
import java.util.concurrent.TimeUnit;
import io.reactivex.l;

public final class w4<T> extends io.reactivex.internal.operators.flowable.a<T, l<T>>
{
    final long I;
    final long J;
    final TimeUnit K;
    final j0 L;
    final long M;
    final int N;
    final boolean O;
    
    public w4(final l<T> l, final long i, final long j, final TimeUnit k, final j0 m, final long m2, final int n, final boolean o) {
        super(l);
        this.I = i;
        this.J = j;
        this.K = k;
        this.L = m;
        this.M = m2;
        this.N = n;
        this.O = o;
    }
    
    @Override
    protected void n6(final o7.c<? super l<T>> c) {
        final e e = new e((o7.c<? super Object>)c);
        final long i = this.I;
        final long j = this.J;
        if (i != j) {
            super.H.m6(new c((o7.c<? super l<Object>>)e, i, j, this.K, this.L.c(), this.N));
            return;
        }
        final long m = this.M;
        if (m == Long.MAX_VALUE) {
            super.H.m6(new b((o7.c<? super l<Object>>)e, this.I, this.K, this.L, this.N));
            return;
        }
        super.H.m6(new a((o7.c<? super l<Object>>)e, i, this.K, this.L, this.N, m, this.O));
    }
    
    static final class a<T> extends n<T, Object, l<T>> implements d
    {
        final long G0;
        final TimeUnit H0;
        final j0 I0;
        final int J0;
        final boolean K0;
        final long L0;
        final j0.c M0;
        long N0;
        long O0;
        d P0;
        io.reactivex.processors.h<T> Q0;
        volatile boolean R0;
        final io.reactivex.internal.disposables.h S0;
        
        a(final o7.c<? super l<T>> c, final long g0, final TimeUnit h0, final j0 i0, final int j0, final long l0, final boolean k0) {
            super(c, new io.reactivex.internal.queue.a());
            this.S0 = new io.reactivex.internal.disposables.h();
            this.G0 = g0;
            this.H0 = h0;
            this.I0 = i0;
            this.J0 = j0;
            this.L0 = l0;
            this.K0 = k0;
            io.reactivex.disposables.c c2;
            if (k0) {
                c2 = i0.c();
            }
            else {
                c2 = null;
            }
            this.M0 = (j0.c)c2;
        }
        
        public void b(final Throwable f0) {
            super.F0 = f0;
            super.E0 = true;
            if (this.e()) {
                this.s();
            }
            super.B0.b(f0);
            this.dispose();
        }
        
        public void cancel() {
            super.D0 = true;
        }
        
        public void dispose() {
            io.reactivex.internal.disposables.d.b(this.S0);
            final j0.c m0 = this.M0;
            if (m0 != null) {
                m0.dispose();
            }
        }
        
        public void f() {
            super.E0 = true;
            if (this.e()) {
                this.s();
            }
            super.B0.f();
            this.dispose();
        }
        
        public void m(final T t) {
            if (this.R0) {
                return;
            }
            if (this.l()) {
                final io.reactivex.processors.h<T> q0 = this.Q0;
                q0.m(t);
                final long n0 = this.N0 + 1L;
                if (n0 >= this.L0) {
                    ++this.O0;
                    this.N0 = 0L;
                    q0.f();
                    final long d = this.d();
                    if (d == 0L) {
                        this.Q0 = null;
                        this.P0.cancel();
                        super.B0.b((Throwable)new io.reactivex.exceptions.c("Could not deliver window due to lack of requests"));
                        this.dispose();
                        return;
                    }
                    final io.reactivex.processors.h<T> w8 = io.reactivex.processors.h.W8(this.J0);
                    this.Q0 = w8;
                    super.B0.m((Object)w8);
                    if (d != Long.MAX_VALUE) {
                        this.k(1L);
                    }
                    if (this.K0) {
                        this.S0.get().dispose();
                        final j0.c m0 = this.M0;
                        final w4.a.a a = new w4.a.a(this.O0, this);
                        final long g0 = this.G0;
                        this.S0.a(m0.d(a, g0, g0, this.H0));
                    }
                }
                else {
                    this.N0 = n0;
                }
                if (this.h(-1) == 0) {
                    return;
                }
            }
            else {
                super.C0.offer(io.reactivex.internal.util.q.y(t));
                if (!this.e()) {
                    return;
                }
            }
            this.s();
        }
        
        void s() {
            final y5.n<U> c0 = (y5.n<U>)super.C0;
            final o7.c<? super V> b0 = (o7.c<? super V>)super.B0;
            io.reactivex.processors.h<T> q0 = this.Q0;
            int h = 1;
        Label_0040:
            while (true) {
                while (!this.R0) {
                    final boolean e0 = super.E0;
                    final U poll = c0.poll();
                    final boolean b2 = poll == null;
                    final boolean b3 = poll instanceof w4.a.a;
                    if (e0 && (b2 || b3)) {
                        this.Q0 = null;
                        c0.clear();
                        final Throwable f0 = super.F0;
                        if (f0 != null) {
                            q0.b(f0);
                        }
                        else {
                            q0.f();
                        }
                        this.dispose();
                        return;
                    }
                    if (!b2) {
                        Object w8 = null;
                        Label_0197: {
                            if (b3) {
                                final w4.a.a a = (w4.a.a)poll;
                                if (!this.K0) {
                                    w8 = q0;
                                    if (this.O0 != a.G) {
                                        break Label_0197;
                                    }
                                }
                                q0.f();
                                this.N0 = 0L;
                                final io.reactivex.processors.h<T> w9 = io.reactivex.processors.h.W8(this.J0);
                                this.Q0 = w9;
                                final long d = this.d();
                                if (d == 0L) {
                                    this.Q0 = null;
                                    super.C0.clear();
                                    this.P0.cancel();
                                    b0.b((Throwable)new io.reactivex.exceptions.c("Could not deliver first window due to lack of requests."));
                                    break Label_0040;
                                }
                                b0.m((Object)w9);
                                w8 = w9;
                                if (d != Long.MAX_VALUE) {
                                    this.k(1L);
                                    w8 = w9;
                                }
                            }
                            else {
                                q0.m(io.reactivex.internal.util.q.o(poll));
                                final long n0 = this.N0 + 1L;
                                if (n0 >= this.L0) {
                                    ++this.O0;
                                    this.N0 = 0L;
                                    q0.f();
                                    final long d2 = this.d();
                                    if (d2 == 0L) {
                                        this.Q0 = null;
                                        this.P0.cancel();
                                        super.B0.b((Throwable)new io.reactivex.exceptions.c("Could not deliver window due to lack of requests"));
                                        break Label_0040;
                                    }
                                    w8 = io.reactivex.processors.h.W8(this.J0);
                                    this.Q0 = (io.reactivex.processors.h<T>)w8;
                                    super.B0.m(w8);
                                    if (d2 != Long.MAX_VALUE) {
                                        this.k(1L);
                                    }
                                    if (this.K0) {
                                        this.S0.get().dispose();
                                        final j0.c m0 = this.M0;
                                        final w4.a.a a2 = new w4.a.a(this.O0, this);
                                        final long g0 = this.G0;
                                        this.S0.a(m0.d(a2, g0, g0, this.H0));
                                    }
                                }
                                else {
                                    this.N0 = n0;
                                    w8 = q0;
                                }
                            }
                        }
                        q0 = (io.reactivex.processors.h<T>)w8;
                        continue;
                        this.dispose();
                        return;
                    }
                    if ((h = this.h(-h)) == 0) {
                        return;
                    }
                }
                this.P0.cancel();
                c0.clear();
                continue Label_0040;
            }
        }
        
        public void v(final long n) {
            this.p(n);
        }
        
        public void z(final d p) {
            if (j.o(this.P0, p)) {
                this.P0 = p;
                final o7.c<? super V> b0 = (o7.c<? super V>)super.B0;
                b0.z((d)this);
                if (super.D0) {
                    return;
                }
                final io.reactivex.processors.h<T> w8 = io.reactivex.processors.h.W8(this.J0);
                this.Q0 = w8;
                final long d = this.d();
                if (d != 0L) {
                    b0.m((Object)w8);
                    if (d != Long.MAX_VALUE) {
                        this.k(1L);
                    }
                    final w4.a.a a = new w4.a.a(this.O0, this);
                    io.reactivex.disposables.c c;
                    if (this.K0) {
                        final j0.c m0 = this.M0;
                        final long g0 = this.G0;
                        c = m0.d(a, g0, g0, this.H0);
                    }
                    else {
                        final j0 i0 = this.I0;
                        final long g2 = this.G0;
                        c = i0.g(a, g2, g2, this.H0);
                    }
                    if (this.S0.a(c)) {
                        p.v(Long.MAX_VALUE);
                    }
                }
                else {
                    super.D0 = true;
                    p.cancel();
                    b0.b((Throwable)new io.reactivex.exceptions.c("Could not deliver initial window due to lack of requests."));
                }
            }
        }
        
        static final class a implements Runnable
        {
            final long G;
            final w4.a<?> H;
            
            a(final long g, final w4.a<?> h) {
                this.G = g;
                this.H = h;
            }
            
            @Override
            public void run() {
                final w4.a<?> h = this.H;
                if (!((w4.a<Object>)h).D0) {
                    ((w4.a<Object>)h).C0.offer(this);
                }
                else {
                    h.R0 = true;
                    h.dispose();
                }
                if (h.e()) {
                    h.s();
                }
            }
        }
    }
    
    static final class b<T> extends n<T, Object, l<T>> implements q<T>, d, Runnable
    {
        static final Object O0;
        final long G0;
        final TimeUnit H0;
        final j0 I0;
        final int J0;
        d K0;
        io.reactivex.processors.h<T> L0;
        final io.reactivex.internal.disposables.h M0;
        volatile boolean N0;
        
        static {
            O0 = new Object();
        }
        
        b(final o7.c<? super l<T>> c, final long g0, final TimeUnit h0, final j0 i0, final int j0) {
            super(c, new io.reactivex.internal.queue.a());
            this.M0 = new io.reactivex.internal.disposables.h();
            this.G0 = g0;
            this.H0 = h0;
            this.I0 = i0;
            this.J0 = j0;
        }
        
        public void b(final Throwable f0) {
            super.F0 = f0;
            super.E0 = true;
            if (this.e()) {
                this.q();
            }
            super.B0.b(f0);
            this.dispose();
        }
        
        public void cancel() {
            super.D0 = true;
        }
        
        public void dispose() {
            io.reactivex.internal.disposables.d.b(this.M0);
        }
        
        public void f() {
            super.E0 = true;
            if (this.e()) {
                this.q();
            }
            super.B0.f();
            this.dispose();
        }
        
        public void m(final T t) {
            if (this.N0) {
                return;
            }
            if (this.l()) {
                this.L0.m(t);
                if (this.h(-1) == 0) {
                    return;
                }
            }
            else {
                super.C0.offer(io.reactivex.internal.util.q.y(t));
                if (!this.e()) {
                    return;
                }
            }
            this.q();
        }
        
        void q() {
            final y5.n<U> c0 = (y5.n<U>)super.C0;
            final o7.c<? super V> b0 = (o7.c<? super V>)super.B0;
            Object l0 = this.L0;
            int h = 1;
            while (true) {
                final boolean n0 = this.N0;
                final boolean e0 = super.E0;
                final U poll = c0.poll();
                if (e0 && (poll == null || poll == b.O0)) {
                    this.L0 = null;
                    c0.clear();
                    this.dispose();
                    final Throwable f0 = super.F0;
                    if (f0 != null) {
                        ((io.reactivex.processors.h)l0).b(f0);
                    }
                    else {
                        ((io.reactivex.processors.h)l0).f();
                    }
                    return;
                }
                if (poll == null) {
                    if ((h = this.h(-h)) == 0) {
                        return;
                    }
                    continue;
                }
                else if (poll == b.O0) {
                    ((io.reactivex.processors.h)l0).f();
                    if (!n0) {
                        final io.reactivex.processors.h<Object> w8 = io.reactivex.processors.h.W8(this.J0);
                        this.L0 = (io.reactivex.processors.h<T>)w8;
                        final long d = this.d();
                        if (d == 0L) {
                            this.L0 = null;
                            super.C0.clear();
                            this.K0.cancel();
                            this.dispose();
                            b0.b((Throwable)new io.reactivex.exceptions.c("Could not deliver first window due to lack of requests."));
                            return;
                        }
                        b0.m((Object)w8);
                        l0 = w8;
                        if (d == Long.MAX_VALUE) {
                            continue;
                        }
                        this.k(1L);
                        l0 = w8;
                    }
                    else {
                        this.K0.cancel();
                    }
                }
                else {
                    ((io.reactivex.processors.h<Object>)l0).m(io.reactivex.internal.util.q.o(poll));
                }
            }
        }
        
        public void run() {
            if (super.D0) {
                this.N0 = true;
                this.dispose();
            }
            super.C0.offer(b.O0);
            if (this.e()) {
                this.q();
            }
        }
        
        public void v(final long n) {
            this.p(n);
        }
        
        @Override
        public void z(final d k0) {
            if (j.o(this.K0, k0)) {
                this.K0 = k0;
                this.L0 = io.reactivex.processors.h.W8(this.J0);
                final o7.c<? super V> b0 = (o7.c<? super V>)super.B0;
                b0.z((d)this);
                final long d = this.d();
                if (d != 0L) {
                    b0.m((Object)this.L0);
                    if (d != Long.MAX_VALUE) {
                        this.k(1L);
                    }
                    if (!super.D0) {
                        final io.reactivex.internal.disposables.h m0 = this.M0;
                        final j0 i0 = this.I0;
                        final long g0 = this.G0;
                        if (m0.a(i0.g(this, g0, g0, this.H0))) {
                            k0.v(Long.MAX_VALUE);
                        }
                    }
                }
                else {
                    super.D0 = true;
                    k0.cancel();
                    b0.b((Throwable)new io.reactivex.exceptions.c("Could not deliver first window due to lack of requests."));
                }
            }
        }
    }
    
    static final class c<T> extends n<T, Object, l<T>> implements d, Runnable
    {
        final long G0;
        final long H0;
        final TimeUnit I0;
        final j0.c J0;
        final int K0;
        final List<io.reactivex.processors.h<T>> L0;
        d M0;
        volatile boolean N0;
        
        c(final o7.c<? super l<T>> c, final long g0, final long h0, final TimeUnit i0, final j0.c j0, final int k0) {
            super(c, new io.reactivex.internal.queue.a());
            this.G0 = g0;
            this.H0 = h0;
            this.I0 = i0;
            this.J0 = j0;
            this.K0 = k0;
            this.L0 = new LinkedList<io.reactivex.processors.h<T>>();
        }
        
        public void b(final Throwable f0) {
            super.F0 = f0;
            super.E0 = true;
            if (this.e()) {
                this.r();
            }
            super.B0.b(f0);
            this.dispose();
        }
        
        public void cancel() {
            super.D0 = true;
        }
        
        public void dispose() {
            this.J0.dispose();
        }
        
        public void f() {
            super.E0 = true;
            if (this.e()) {
                this.r();
            }
            super.B0.f();
            this.dispose();
        }
        
        public void m(final T t) {
            if (this.l()) {
                final Iterator<io.reactivex.processors.h<T>> iterator = this.L0.iterator();
                while (iterator.hasNext()) {
                    iterator.next().m(t);
                }
                if (this.h(-1) == 0) {
                    return;
                }
            }
            else {
                super.C0.offer(t);
                if (!this.e()) {
                    return;
                }
            }
            this.r();
        }
        
        void q(final io.reactivex.processors.h<T> h) {
            super.C0.offer(new b<T>(h, false));
            if (this.e()) {
                this.r();
            }
        }
        
        void r() {
            final y5.n<U> c0 = (y5.n<U>)super.C0;
            final o7.c<? super V> b0 = (o7.c<? super V>)super.B0;
            final List<io.reactivex.processors.h<T>> l0 = this.L0;
            int h = 1;
            while (!this.N0) {
                final boolean e0 = super.E0;
                final U poll = c0.poll();
                final boolean b2 = poll == null;
                final boolean b3 = poll instanceof b;
                if (e0 && (b2 || b3)) {
                    c0.clear();
                    final Throwable f0 = super.F0;
                    if (f0 != null) {
                        final Iterator<io.reactivex.processors.h<T>> iterator = l0.iterator();
                        while (iterator.hasNext()) {
                            iterator.next().b(f0);
                        }
                    }
                    else {
                        final Iterator<io.reactivex.processors.h<T>> iterator2 = l0.iterator();
                        while (iterator2.hasNext()) {
                            iterator2.next().f();
                        }
                    }
                    l0.clear();
                    this.dispose();
                    return;
                }
                if (b2) {
                    if ((h = this.h(-h)) == 0) {
                        return;
                    }
                    continue;
                }
                else if (b3) {
                    final b b4 = (b)poll;
                    if (b4.b) {
                        if (super.D0) {
                            continue;
                        }
                        final long d = this.d();
                        if (d != 0L) {
                            final io.reactivex.processors.h<T> w8 = io.reactivex.processors.h.W8(this.K0);
                            l0.add(w8);
                            b0.m((Object)w8);
                            if (d != Long.MAX_VALUE) {
                                this.k(1L);
                            }
                            this.J0.c(new a(w8), this.G0, this.I0);
                        }
                        else {
                            b0.b((Throwable)new io.reactivex.exceptions.c("Can't emit window due to lack of requests"));
                        }
                    }
                    else {
                        l0.remove(b4.a);
                        b4.a.f();
                        if (!l0.isEmpty() || !super.D0) {
                            continue;
                        }
                        this.N0 = true;
                    }
                }
                else {
                    final Iterator<io.reactivex.processors.h<T>> iterator3 = l0.iterator();
                    while (iterator3.hasNext()) {
                        iterator3.next().m((T)poll);
                    }
                }
            }
            this.M0.cancel();
            this.dispose();
            c0.clear();
            l0.clear();
        }
        
        public void run() {
            final b b = new b(io.reactivex.processors.h.W8(this.K0), true);
            if (!super.D0) {
                super.C0.offer(b);
            }
            if (this.e()) {
                this.r();
            }
        }
        
        public void v(final long n) {
            this.p(n);
        }
        
        public void z(final d m0) {
            if (j.o(this.M0, m0)) {
                this.M0 = m0;
                super.B0.z((d)this);
                if (super.D0) {
                    return;
                }
                final long d = this.d();
                if (d != 0L) {
                    final io.reactivex.processors.h<T> w8 = io.reactivex.processors.h.W8(this.K0);
                    this.L0.add(w8);
                    super.B0.m((Object)w8);
                    if (d != Long.MAX_VALUE) {
                        this.k(1L);
                    }
                    this.J0.c(new a(w8), this.G0, this.I0);
                    final j0.c j0 = this.J0;
                    final long h0 = this.H0;
                    j0.d(this, h0, h0, this.I0);
                    m0.v(Long.MAX_VALUE);
                }
                else {
                    m0.cancel();
                    super.B0.b((Throwable)new io.reactivex.exceptions.c("Could not emit the first window due to lack of requests"));
                }
            }
        }
        
        final class a implements Runnable
        {
            private final io.reactivex.processors.h<T> G;
            
            a(final io.reactivex.processors.h<T> g) {
                this.G = g;
            }
            
            @Override
            public void run() {
                c.this.q(this.G);
            }
        }
        
        static final class b<T>
        {
            final io.reactivex.processors.h<T> a;
            final boolean b;
            
            b(final io.reactivex.processors.h<T> a, final boolean b) {
                this.a = a;
                this.b = b;
            }
        }
    }
}
