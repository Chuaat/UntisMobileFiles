// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.internal.subscriptions.j;
import x5.f;
import io.reactivex.plugins.a;
import io.reactivex.internal.disposables.h;
import java.util.concurrent.atomic.AtomicLong;
import io.reactivex.n;
import o7.d;
import o7.c;
import io.reactivex.b;
import io.reactivex.o;
import io.reactivex.l;

public final class f0<T> extends l<T>
{
    final o<T> H;
    final io.reactivex.b I;
    
    public f0(final o<T> h, final io.reactivex.b i) {
        this.H = h;
        this.I = i;
    }
    
    public void n6(final o7.c<? super T> c) {
        final int n = f0$a.a[this.I.ordinal()];
        AtomicLong atomicLong;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n != 4) {
                        atomicLong = new c<Object>(c, l.b0());
                    }
                    else {
                        atomicLong = new f<Object>(c);
                    }
                }
                else {
                    atomicLong = new d<Object>(c);
                }
            }
            else {
                atomicLong = new e<Object>(c);
            }
        }
        else {
            atomicLong = new g<Object>(c);
        }
        c.z((o7.d)atomicLong);
        try {
            this.H.a((n<T>)atomicLong);
        }
        finally {
            final Throwable t;
            io.reactivex.exceptions.b.b(t);
            ((b)atomicLong).b(t);
        }
    }
    
    abstract static class b<T> extends AtomicLong implements n<T>, o7.d
    {
        private static final long I = 7326289992464377023L;
        final o7.c<? super T> G;
        final io.reactivex.internal.disposables.h H;
        
        b(final o7.c<? super T> g) {
            this.G = g;
            this.H = new io.reactivex.internal.disposables.h();
        }
        
        protected void a() {
            if (this.isCancelled()) {
                return;
            }
            try {
                this.G.f();
            }
            finally {
                this.H.dispose();
            }
        }
        
        public final void b(final Throwable t) {
            if (!this.e(t)) {
                a.Y(t);
            }
        }
        
        @Override
        public final void c(final x5.f f) {
            this.j(new io.reactivex.internal.disposables.b(f));
        }
        
        public final void cancel() {
            this.H.dispose();
            this.k();
        }
        
        @Override
        public final long d() {
            return this.get();
        }
        
        @Override
        public boolean e(final Throwable t) {
            return this.g(t);
        }
        
        public void f() {
            this.a();
        }
        
        protected boolean g(final Throwable t) {
            Throwable t2 = t;
            if (t == null) {
                t2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (this.isCancelled()) {
                return false;
            }
            try {
                this.G.b(t2);
                return true;
            }
            finally {
                this.H.dispose();
            }
        }
        
        void h() {
        }
        
        @Override
        public final boolean isCancelled() {
            return this.H.i();
        }
        
        @Override
        public final void j(final io.reactivex.disposables.c c) {
            this.H.b(c);
        }
        
        void k() {
        }
        
        @Override
        public final n<T> serialize() {
            return new i<T>(this);
        }
        
        @Override
        public String toString() {
            return String.format("%s{%s}", this.getClass().getSimpleName(), super.toString());
        }
        
        public final void v(final long n) {
            if (j.m(n)) {
                io.reactivex.internal.util.d.a(this, n);
                this.h();
            }
        }
    }
    
    static final class c<T> extends b<T>
    {
        private static final long N = 2427151001689639875L;
        final io.reactivex.internal.queue.c<T> J;
        Throwable K;
        volatile boolean L;
        final AtomicInteger M;
        
        c(final o7.c<? super T> c, final int n) {
            super(c);
            this.J = new io.reactivex.internal.queue.c<T>(n);
            this.M = new AtomicInteger();
        }
        
        @Override
        public boolean e(final Throwable t) {
            if (!this.L && !this.isCancelled()) {
                Throwable k;
                if ((k = t) == null) {
                    k = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
                }
                this.K = k;
                this.L = true;
                this.l();
                return true;
            }
            return false;
        }
        
        @Override
        public void f() {
            this.L = true;
            this.l();
        }
        
        @Override
        void h() {
            this.l();
        }
        
        @Override
        void k() {
            if (this.M.getAndIncrement() == 0) {
                this.J.clear();
            }
        }
        
        void l() {
            if (this.M.getAndIncrement() != 0) {
                return;
            }
            final o7.c<? super T> g = (o7.c<? super T>)super.G;
            final io.reactivex.internal.queue.c<T> j = this.J;
            int addAndGet = 1;
            do {
                final long value = this.get();
                long n = 0L;
                long n2;
                while (true) {
                    n2 = lcmp(n, value);
                    if (n2 == 0) {
                        break;
                    }
                    if (this.isCancelled()) {
                        j.clear();
                        return;
                    }
                    final boolean l = this.L;
                    final T poll = j.poll();
                    final boolean b = poll == null;
                    if (l && b) {
                        final Throwable k = this.K;
                        if (k != null) {
                            this.g(k);
                        }
                        else {
                            this.a();
                        }
                        return;
                    }
                    if (b) {
                        break;
                    }
                    g.m((Object)poll);
                    ++n;
                }
                if (n2 == 0) {
                    if (this.isCancelled()) {
                        j.clear();
                        return;
                    }
                    final boolean i = this.L;
                    final boolean empty = j.isEmpty();
                    if (i && empty) {
                        final Throwable m = this.K;
                        if (m != null) {
                            this.g(m);
                        }
                        else {
                            this.a();
                        }
                        return;
                    }
                }
                if (n != 0L) {
                    io.reactivex.internal.util.d.e(this, n);
                }
            } while ((addAndGet = this.M.addAndGet(-addAndGet)) != 0);
        }
        
        public void m(final T t) {
            if (!this.L) {
                if (!this.isCancelled()) {
                    if (t == null) {
                        this.b(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                        return;
                    }
                    this.J.offer(t);
                    this.l();
                }
            }
        }
    }
    
    static final class d<T> extends h<T>
    {
        private static final long K = 8360058422307496563L;
        
        d(final o7.c<? super T> c) {
            super(c);
        }
        
        @Override
        void l() {
        }
    }
    
    static final class e<T> extends h<T>
    {
        private static final long K = 338953216916120960L;
        
        e(final o7.c<? super T> c) {
            super(c);
        }
        
        @Override
        void l() {
            this.b(new io.reactivex.exceptions.c("create: could not emit value due to lack of requests"));
        }
    }
    
    static final class f<T> extends b<T>
    {
        private static final long N = 4023437720691792495L;
        final AtomicReference<T> J;
        Throwable K;
        volatile boolean L;
        final AtomicInteger M;
        
        f(final o7.c<? super T> c) {
            super(c);
            this.J = new AtomicReference<T>();
            this.M = new AtomicInteger();
        }
        
        @Override
        public boolean e(final Throwable k) {
            if (!this.L && !this.isCancelled()) {
                if (k == null) {
                    this.b(new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources."));
                }
                this.K = k;
                this.L = true;
                this.l();
                return true;
            }
            return false;
        }
        
        @Override
        public void f() {
            this.L = true;
            this.l();
        }
        
        @Override
        void h() {
            this.l();
        }
        
        @Override
        void k() {
            if (this.M.getAndIncrement() == 0) {
                this.J.lazySet(null);
            }
        }
        
        void l() {
            if (this.M.getAndIncrement() != 0) {
                return;
            }
            final o7.c<? super T> g = (o7.c<? super T>)super.G;
            final AtomicReference<T> j = this.J;
            int addAndGet = 1;
            do {
                final long value = this.get();
                long n = 0L;
                int n2;
                long n3;
                while (true) {
                    n2 = 0;
                    n3 = lcmp(n, value);
                    if (n3 == 0) {
                        break;
                    }
                    if (this.isCancelled()) {
                        j.lazySet(null);
                        return;
                    }
                    final boolean l = this.L;
                    final T andSet = j.getAndSet(null);
                    final boolean b = andSet == null;
                    if (l && b) {
                        final Throwable k = this.K;
                        if (k != null) {
                            this.g(k);
                        }
                        else {
                            this.a();
                        }
                        return;
                    }
                    if (b) {
                        break;
                    }
                    g.m((Object)andSet);
                    ++n;
                }
                if (n3 == 0) {
                    if (this.isCancelled()) {
                        j.lazySet(null);
                        return;
                    }
                    final boolean i = this.L;
                    int n4 = n2;
                    if (j.get() == null) {
                        n4 = 1;
                    }
                    if (i && n4 != 0) {
                        final Throwable m = this.K;
                        if (m != null) {
                            this.g(m);
                        }
                        else {
                            this.a();
                        }
                        return;
                    }
                }
                if (n != 0L) {
                    io.reactivex.internal.util.d.e(this, n);
                }
            } while ((addAndGet = this.M.addAndGet(-addAndGet)) != 0);
        }
        
        public void m(final T newValue) {
            if (!this.L) {
                if (!this.isCancelled()) {
                    if (newValue == null) {
                        this.b(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                        return;
                    }
                    this.J.set(newValue);
                    this.l();
                }
            }
        }
    }
    
    static final class g<T> extends b<T>
    {
        private static final long J = 3776720187248809713L;
        
        g(final o7.c<? super T> c) {
            super(c);
        }
        
        public void m(final T t) {
            if (this.isCancelled()) {
                return;
            }
            if (t != null) {
                super.G.m((Object)t);
                long value;
                do {
                    value = this.get();
                } while (value != 0L && !this.compareAndSet(value, value - 1L));
                return;
            }
            this.b(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
        }
    }
    
    abstract static class h<T> extends b<T>
    {
        private static final long J = 4127754106204442833L;
        
        h(final o7.c<? super T> c) {
            super(c);
        }
        
        abstract void l();
        
        public final void m(final T t) {
            if (this.isCancelled()) {
                return;
            }
            if (t == null) {
                this.b(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            if (this.get() != 0L) {
                super.G.m((Object)t);
                io.reactivex.internal.util.d.e(this, 1L);
            }
            else {
                this.l();
            }
        }
    }
    
    static final class i<T> extends AtomicInteger implements n<T>
    {
        private static final long K = 4883307006032401862L;
        final b<T> G;
        final io.reactivex.internal.util.c H;
        final y5.n<T> I;
        volatile boolean J;
        
        i(final b<T> g) {
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
                a.Y(t);
            }
        }
        
        @Override
        public void c(final x5.f f) {
            this.G.c(f);
        }
        
        @Override
        public long d() {
            return this.G.d();
        }
        
        @Override
        public boolean e(final Throwable t) {
            if (!this.G.isCancelled()) {
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
            if (!this.G.isCancelled()) {
                if (!this.J) {
                    this.J = true;
                    this.a();
                }
            }
        }
        
        void g() {
            final b<T> g = this.G;
            final y5.n<T> i = this.I;
            final io.reactivex.internal.util.c h = this.H;
            int addAndGet = 1;
            while (!g.isCancelled()) {
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
        public boolean isCancelled() {
            return this.G.isCancelled();
        }
        
        @Override
        public void j(final io.reactivex.disposables.c c) {
            this.G.j(c);
        }
        
        @Override
        public void m(final T t) {
            if (!this.G.isCancelled()) {
                if (!this.J) {
                    if (t == null) {
                        this.b(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                        return;
                    }
                    Label_0097: {
                        if (this.get() == 0 && this.compareAndSet(0, 1)) {
                            this.G.m(t);
                            if (this.decrementAndGet() == 0) {
                                return;
                            }
                            break Label_0097;
                        }
                        final y5.n<T> i = this.I;
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
        public n<T> serialize() {
            return this;
        }
        
        @Override
        public String toString() {
            return this.G.toString();
        }
    }
}
