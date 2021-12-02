// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.internal.disposables.d;
import x5.f;
import io.reactivex.plugins.a;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.exceptions.b;
import io.reactivex.d0;
import io.reactivex.disposables.c;
import io.reactivex.i0;
import io.reactivex.e0;
import io.reactivex.b0;

public final class c0<T> extends b0<T>
{
    final e0<T> G;
    
    public c0(final e0<T> g) {
        this.G = g;
    }
    
    @Override
    protected void L5(final i0<? super T> i0) {
        final a<T> a = new a<T>(i0);
        i0.l(a);
        try {
            this.G.a(a);
        }
        finally {
            final Throwable t;
            io.reactivex.exceptions.b.b(t);
            a.b(t);
        }
    }
    
    static final class a<T> extends AtomicReference<c> implements d0<T>, c
    {
        private static final long H = -3434801548987643227L;
        final i0<? super T> G;
        
        a(final i0<? super T> g) {
            this.G = g;
        }
        
        @Override
        public void b(final Throwable t) {
            if (!this.e(t)) {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        @Override
        public void c(final f f) {
            this.j(new io.reactivex.internal.disposables.b(f));
        }
        
        @Override
        public void dispose() {
            d.b(this);
        }
        
        @Override
        public boolean e(final Throwable t) {
            Throwable t2 = t;
            if (t == null) {
                t2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (!this.i()) {
                try {
                    this.G.b(t2);
                    return true;
                }
                finally {
                    this.dispose();
                }
            }
            return false;
        }
        
        @Override
        public void f() {
            if (!this.i()) {
                try {
                    this.G.f();
                }
                finally {
                    this.dispose();
                }
            }
        }
        
        @Override
        public boolean i() {
            return d.d(this.get());
        }
        
        @Override
        public void j(final c c) {
            d.h(this, c);
        }
        
        @Override
        public void m(final T t) {
            if (t == null) {
                this.b(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            if (!this.i()) {
                this.G.m((Object)t);
            }
        }
        
        @Override
        public d0<T> serialize() {
            return new b<T>(this);
        }
        
        @Override
        public String toString() {
            return String.format("%s{%s}", a.class.getSimpleName(), super.toString());
        }
    }
    
    static final class b<T> extends AtomicInteger implements d0<T>
    {
        private static final long K = 4883307006032401862L;
        final d0<T> G;
        final io.reactivex.internal.util.c H;
        final io.reactivex.internal.queue.c<T> I;
        volatile boolean J;
        
        b(final d0<T> g) {
            this.G = g;
            this.H = new io.reactivex.internal.util.c();
            this.I = new io.reactivex.internal.queue.c<T>(16);
        }
        
        void a() {
            if (this.getAndIncrement() == 0) {
                this.g();
            }
        }
        
        @Override
        public void b(final Throwable t) {
            if (!this.e(t)) {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        @Override
        public void c(final f f) {
            this.G.c(f);
        }
        
        @Override
        public boolean e(final Throwable t) {
            if (!this.G.i()) {
                if (!this.J) {
                    Throwable t2;
                    if ((t2 = t) == null) {
                        t2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
                    }
                    if (this.H.a(t2)) {
                        this.J = true;
                        this.a();
                        return true;
                    }
                }
            }
            return false;
        }
        
        @Override
        public void f() {
            if (!this.G.i()) {
                if (!this.J) {
                    this.J = true;
                    this.a();
                }
            }
        }
        
        void g() {
            final d0<T> g = this.G;
            final io.reactivex.internal.queue.c<T> i = this.I;
            final io.reactivex.internal.util.c h = this.H;
            int addAndGet = 1;
            while (!g.i()) {
                if (h.get() != null) {
                    i.clear();
                    g.b(h.c());
                    return;
                }
                final boolean j = this.J;
                final T poll = i.poll();
                final boolean b = poll == null;
                if (j && b) {
                    g.f();
                    return;
                }
                if (b) {
                    if ((addAndGet = this.addAndGet(-addAndGet)) == 0) {
                        return;
                    }
                    continue;
                }
                else {
                    g.m(poll);
                }
            }
            i.clear();
        }
        
        @Override
        public boolean i() {
            return this.G.i();
        }
        
        @Override
        public void j(final c c) {
            this.G.j(c);
        }
        
        @Override
        public void m(final T t) {
            if (!this.G.i()) {
                if (!this.J) {
                    if (t == null) {
                        this.b(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                        return;
                    }
                    Label_0099: {
                        if (this.get() == 0 && this.compareAndSet(0, 1)) {
                            this.G.m(t);
                            if (this.decrementAndGet() == 0) {
                                return;
                            }
                            break Label_0099;
                        }
                        final io.reactivex.internal.queue.c<T> i = this.I;
                        synchronized (i) {
                            i.offer(t);
                            // monitorexit(i)
                            if (this.getAndIncrement() != 0) {
                                return;
                            }
                            this.g();
                        }
                    }
                }
            }
        }
        
        @Override
        public d0<T> serialize() {
            return this;
        }
        
        @Override
        public String toString() {
            return this.G.toString();
        }
    }
}
