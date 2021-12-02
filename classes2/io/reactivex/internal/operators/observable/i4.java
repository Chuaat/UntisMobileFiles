// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import io.reactivex.internal.util.q;
import io.reactivex.internal.disposables.d;
import y5.n;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.subjects.j;
import io.reactivex.disposables.c;
import io.reactivex.internal.observers.v;
import io.reactivex.observers.m;
import io.reactivex.i0;
import io.reactivex.g0;
import io.reactivex.j0;
import java.util.concurrent.TimeUnit;
import io.reactivex.b0;

public final class i4<T> extends io.reactivex.internal.operators.observable.a<T, b0<T>>
{
    final long H;
    final long I;
    final TimeUnit J;
    final j0 K;
    final long L;
    final int M;
    final boolean N;
    
    public i4(final g0<T> g0, final long h, final long i, final TimeUnit j, final j0 k, final long l, final int m, final boolean n) {
        super(g0);
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
        this.L = l;
        this.M = m;
        this.N = n;
    }
    
    public void L5(final i0<? super b0<T>> i0) {
        final m<Object> m = new m<Object>((i0<? super Object>)i0);
        final long h = this.H;
        final long j = this.I;
        if (h != j) {
            super.G.c(new c(m, h, j, this.J, this.K.c(), this.M));
            return;
        }
        final long l = this.L;
        if (l == Long.MAX_VALUE) {
            super.G.c(new b(m, this.H, this.J, this.K, this.M));
            return;
        }
        super.G.c(new a(m, h, this.J, this.K, this.M, l, this.N));
    }
    
    static final class a<T> extends v<T, Object, b0<T>> implements c
    {
        j<T> A0;
        volatile boolean B0;
        final AtomicReference<c> C0;
        final long q0;
        final TimeUnit r0;
        final j0 s0;
        final int t0;
        final boolean u0;
        final long v0;
        final j0.c w0;
        long x0;
        long y0;
        c z0;
        
        a(final i0<? super b0<T>> i0, final long q0, final TimeUnit r0, final j0 s0, final int t0, final long v0, final boolean u0) {
            super(i0, new io.reactivex.internal.queue.a());
            this.C0 = new AtomicReference<c>();
            this.q0 = q0;
            this.r0 = r0;
            this.s0 = s0;
            this.t0 = t0;
            this.v0 = v0;
            this.u0 = u0;
            c c;
            if (u0) {
                c = s0.c();
            }
            else {
                c = null;
            }
            this.w0 = (j0.c)c;
        }
        
        @Override
        public void b(final Throwable p) {
            super.p0 = p;
            super.o0 = true;
            if (this.e()) {
                this.r();
            }
            super.l0.b(p);
            this.q();
        }
        
        @Override
        public void dispose() {
            super.n0 = true;
        }
        
        @Override
        public void f() {
            super.o0 = true;
            if (this.e()) {
                this.r();
            }
            super.l0.f();
            this.q();
        }
        
        @Override
        public boolean i() {
            return super.n0;
        }
        
        @Override
        public void l(c z0) {
            if (d.l(this.z0, z0)) {
                this.z0 = z0;
                final i0<? super V> l0 = (i0<? super V>)super.l0;
                l0.l(this);
                if (super.n0) {
                    return;
                }
                l0.m(this.A0 = j.r8(this.t0));
                final i4.a.a a = new i4.a.a(this.y0, this);
                if (this.u0) {
                    final j0.c w0 = this.w0;
                    final long q0 = this.q0;
                    z0 = w0.d(a, q0, q0, this.r0);
                }
                else {
                    final j0 s0 = this.s0;
                    final long q2 = this.q0;
                    z0 = s0.g(a, q2, q2, this.r0);
                }
                d.f(this.C0, z0);
            }
        }
        
        @Override
        public void m(final T t) {
            if (this.B0) {
                return;
            }
            if (this.d()) {
                final j<T> a0 = this.A0;
                a0.m(t);
                final long x0 = this.x0 + 1L;
                if (x0 >= this.v0) {
                    ++this.y0;
                    this.x0 = 0L;
                    a0.f();
                    final j<Object> r8 = j.r8(this.t0);
                    this.A0 = (j<T>)r8;
                    super.l0.m(r8);
                    if (this.u0) {
                        this.C0.get().dispose();
                        final j0.c w0 = this.w0;
                        final i4.a.a a2 = new i4.a.a(this.y0, this);
                        final long q0 = this.q0;
                        d.f(this.C0, w0.d(a2, q0, q0, this.r0));
                    }
                }
                else {
                    this.x0 = x0;
                }
                if (this.h(-1) == 0) {
                    return;
                }
            }
            else {
                super.m0.offer(q.y(t));
                if (!this.e()) {
                    return;
                }
            }
            this.r();
        }
        
        void q() {
            d.b(this.C0);
            final j0.c w0 = this.w0;
            if (w0 != null) {
                w0.dispose();
            }
        }
        
        void r() {
            final io.reactivex.internal.queue.a a = (io.reactivex.internal.queue.a)super.m0;
            final i0<? super V> l0 = (i0<? super V>)super.l0;
            Object a2 = this.A0;
            int h = 1;
            while (!this.B0) {
                final boolean o0 = super.o0;
                final i4.a.a poll = a.poll();
                final boolean b = poll == null;
                final boolean b2 = poll instanceof i4.a.a;
                if (o0 && (b || b2)) {
                    this.A0 = null;
                    a.clear();
                    this.q();
                    final Throwable p0 = super.p0;
                    if (p0 != null) {
                        ((j)a2).b(p0);
                    }
                    else {
                        ((j)a2).f();
                    }
                    return;
                }
                if (b) {
                    if ((h = this.h(-h)) == 0) {
                        return;
                    }
                    continue;
                }
                else if (b2) {
                    final i4.a.a a3 = poll;
                    if (!this.u0 && this.y0 != a3.G) {
                        continue;
                    }
                    ((j)a2).f();
                    this.x0 = 0L;
                    a2 = j.r8(this.t0);
                    l0.m(this.A0 = (j<T>)a2);
                }
                else {
                    ((j<Object>)a2).m(q.o(poll));
                    final long x0 = this.x0 + 1L;
                    if (x0 >= this.v0) {
                        ++this.y0;
                        this.x0 = 0L;
                        ((j)a2).f();
                        final j<Object> r8 = j.r8(this.t0);
                        this.A0 = (j<T>)r8;
                        super.l0.m(r8);
                        a2 = r8;
                        if (!this.u0) {
                            continue;
                        }
                        final c expectedValue = this.C0.get();
                        expectedValue.dispose();
                        final j0.c w0 = this.w0;
                        final i4.a.a a4 = new i4.a.a(this.y0, this);
                        final long q0 = this.q0;
                        final c d = w0.d(a4, q0, q0, this.r0);
                        a2 = r8;
                        if (this.C0.compareAndSet(expectedValue, d)) {
                            continue;
                        }
                        d.dispose();
                        a2 = r8;
                    }
                    else {
                        this.x0 = x0;
                    }
                }
            }
            this.z0.dispose();
            a.clear();
            this.q();
        }
        
        static final class a implements Runnable
        {
            final long G;
            final i4.a<?> H;
            
            a(final long g, final i4.a<?> h) {
                this.G = g;
                this.H = h;
            }
            
            @Override
            public void run() {
                final i4.a<?> h = this.H;
                if (!((i4.a<Object>)h).n0) {
                    ((i4.a<Object>)h).m0.offer(this);
                }
                else {
                    h.B0 = true;
                    h.q();
                }
                if (h.e()) {
                    h.r();
                }
            }
        }
    }
    
    static final class b<T> extends v<T, Object, b0<T>> implements i0<T>, c, Runnable
    {
        static final Object y0;
        final long q0;
        final TimeUnit r0;
        final j0 s0;
        final int t0;
        c u0;
        j<T> v0;
        final AtomicReference<c> w0;
        volatile boolean x0;
        
        static {
            y0 = new Object();
        }
        
        b(final i0<? super b0<T>> i0, final long q0, final TimeUnit r0, final j0 s0, final int t0) {
            super(i0, new io.reactivex.internal.queue.a());
            this.w0 = new AtomicReference<c>();
            this.q0 = q0;
            this.r0 = r0;
            this.s0 = s0;
            this.t0 = t0;
        }
        
        @Override
        public void b(final Throwable p) {
            super.p0 = p;
            super.o0 = true;
            if (this.e()) {
                this.p();
            }
            this.o();
            super.l0.b(p);
        }
        
        @Override
        public void dispose() {
            super.n0 = true;
        }
        
        @Override
        public void f() {
            super.o0 = true;
            if (this.e()) {
                this.p();
            }
            this.o();
            super.l0.f();
        }
        
        @Override
        public boolean i() {
            return super.n0;
        }
        
        @Override
        public void l(c g) {
            if (d.l(this.u0, g)) {
                this.u0 = g;
                this.v0 = j.r8(this.t0);
                final i0<? super V> l0 = (i0<? super V>)super.l0;
                l0.l(this);
                l0.m(this.v0);
                if (!super.n0) {
                    final j0 s0 = this.s0;
                    final long q0 = this.q0;
                    g = s0.g(this, q0, q0, this.r0);
                    d.f(this.w0, g);
                }
            }
        }
        
        @Override
        public void m(final T t) {
            if (this.x0) {
                return;
            }
            if (this.d()) {
                this.v0.m(t);
                if (this.h(-1) == 0) {
                    return;
                }
            }
            else {
                super.m0.offer(q.y(t));
                if (!this.e()) {
                    return;
                }
            }
            this.p();
        }
        
        void o() {
            d.b(this.w0);
        }
        
        void p() {
            final io.reactivex.internal.queue.a a = (io.reactivex.internal.queue.a)super.m0;
            final i0<? super V> l0 = (i0<? super V>)super.l0;
            j<T> v0 = this.v0;
            int h = 1;
            while (true) {
                final boolean x0 = this.x0;
                final boolean o0 = super.o0;
                final Object poll = a.poll();
                if (o0 && (poll == null || poll == b.y0)) {
                    this.v0 = null;
                    a.clear();
                    this.o();
                    final Throwable p0 = super.p0;
                    if (p0 != null) {
                        v0.b(p0);
                    }
                    else {
                        v0.f();
                    }
                    return;
                }
                if (poll == null) {
                    if ((h = this.h(-h)) == 0) {
                        return;
                    }
                    continue;
                }
                else if (poll == b.y0) {
                    v0.f();
                    if (!x0) {
                        v0 = (j<T>)j.r8(this.t0);
                        l0.m(this.v0 = v0);
                    }
                    else {
                        this.u0.dispose();
                    }
                }
                else {
                    v0.m((T)q.o(poll));
                }
            }
        }
        
        @Override
        public void run() {
            if (super.n0) {
                this.x0 = true;
                this.o();
            }
            super.m0.offer(b.y0);
            if (this.e()) {
                this.p();
            }
        }
    }
    
    static final class c<T> extends v<T, Object, b0<T>> implements io.reactivex.disposables.c, Runnable
    {
        final long q0;
        final long r0;
        final TimeUnit s0;
        final j0.c t0;
        final int u0;
        final List<j<T>> v0;
        io.reactivex.disposables.c w0;
        volatile boolean x0;
        
        c(final i0<? super b0<T>> i0, final long q0, final long r0, final TimeUnit s0, final j0.c t0, final int u0) {
            super(i0, new io.reactivex.internal.queue.a());
            this.q0 = q0;
            this.r0 = r0;
            this.s0 = s0;
            this.t0 = t0;
            this.u0 = u0;
            this.v0 = new LinkedList<j<T>>();
        }
        
        @Override
        public void b(final Throwable p) {
            super.p0 = p;
            super.o0 = true;
            if (this.e()) {
                this.q();
            }
            super.l0.b(p);
            this.p();
        }
        
        @Override
        public void dispose() {
            super.n0 = true;
        }
        
        @Override
        public void f() {
            super.o0 = true;
            if (this.e()) {
                this.q();
            }
            super.l0.f();
            this.p();
        }
        
        @Override
        public boolean i() {
            return super.n0;
        }
        
        @Override
        public void l(final io.reactivex.disposables.c w0) {
            if (d.l(this.w0, w0)) {
                this.w0 = w0;
                super.l0.l(this);
                if (super.n0) {
                    return;
                }
                final j<Object> r8 = j.r8(this.u0);
                this.v0.add((j<T>)r8);
                super.l0.m(r8);
                this.t0.c(new a((j<T>)r8), this.q0, this.s0);
                final j0.c t0 = this.t0;
                final long r9 = this.r0;
                t0.d(this, r9, r9, this.s0);
            }
        }
        
        @Override
        public void m(final T t) {
            if (this.d()) {
                final Iterator<j<T>> iterator = this.v0.iterator();
                while (iterator.hasNext()) {
                    iterator.next().m(t);
                }
                if (this.h(-1) == 0) {
                    return;
                }
            }
            else {
                super.m0.offer(t);
                if (!this.e()) {
                    return;
                }
            }
            this.q();
        }
        
        void o(final j<T> j) {
            super.m0.offer(new b<T>(j, false));
            if (this.e()) {
                this.q();
            }
        }
        
        void p() {
            this.t0.dispose();
        }
        
        void q() {
            final io.reactivex.internal.queue.a a = (io.reactivex.internal.queue.a)super.m0;
            final i0<? super V> l0 = (i0<? super V>)super.l0;
            final List<j<T>> v0 = this.v0;
            int h = 1;
            while (true) {
                while (!this.x0) {
                    final boolean o0 = super.o0;
                    final b poll = a.poll();
                    final boolean b = poll == null;
                    final boolean b2 = poll instanceof b;
                    if (o0 && (b || b2)) {
                        a.clear();
                        final Throwable p0 = super.p0;
                        if (p0 != null) {
                            final Iterator<j<T>> iterator = v0.iterator();
                            while (iterator.hasNext()) {
                                iterator.next().b(p0);
                            }
                        }
                        else {
                            final Iterator<j<T>> iterator2 = v0.iterator();
                            while (iterator2.hasNext()) {
                                iterator2.next().f();
                            }
                        }
                        this.p();
                        v0.clear();
                        return;
                    }
                    if (b) {
                        if ((h = this.h(-h)) == 0) {
                            return;
                        }
                        continue;
                    }
                    else if (b2) {
                        final b b3 = poll;
                        if (b3.b) {
                            if (super.n0) {
                                continue;
                            }
                            final j<Object> r8 = j.r8(this.u0);
                            v0.add((j<T>)r8);
                            l0.m((j<T>)r8);
                            this.t0.c(new a((j<T>)r8), this.q0, this.s0);
                        }
                        else {
                            v0.remove(b3.a);
                            b3.a.f();
                            if (!v0.isEmpty() || !super.n0) {
                                continue;
                            }
                            this.x0 = true;
                        }
                    }
                    else {
                        final Iterator<j<T>> iterator3 = v0.iterator();
                        while (iterator3.hasNext()) {
                            iterator3.next().m((T)poll);
                        }
                    }
                }
                this.w0.dispose();
                this.p();
                a.clear();
                continue;
            }
        }
        
        @Override
        public void run() {
            final b b = new b(j.r8(this.u0), true);
            if (!super.n0) {
                super.m0.offer(b);
            }
            if (this.e()) {
                this.q();
            }
        }
        
        final class a implements Runnable
        {
            private final j<T> G;
            
            a(final j<T> g) {
                this.G = g;
            }
            
            @Override
            public void run() {
                c.this.o(this.G);
            }
        }
        
        static final class b<T>
        {
            final j<T> a;
            final boolean b;
            
            b(final j<T> a, final boolean b) {
                this.a = a;
                this.b = b;
            }
        }
    }
}
