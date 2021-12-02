// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import java.util.concurrent.atomic.AtomicReference;
import rx.exceptions.d;
import rx.plugins.c;
import rx.internal.util.unsafe.h0;
import rx.internal.util.unsafe.n0;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Queue;
import rx.internal.subscriptions.a;
import java.util.concurrent.atomic.AtomicLong;
import rx.i;
import rx.o;
import rx.internal.util.m;
import rx.n;
import rx.e;
import rx.functions.b;
import rx.g;

public final class d0<T> implements a<T>
{
    final rx.functions.b<rx.e<T>> G;
    final rx.e.a H;
    
    public d0(final rx.functions.b<rx.e<T>> g, final rx.e.a h) {
        this.G = g;
        this.H = h;
    }
    
    public void a(final n<? super T> n) {
        final int n2 = d0$a.a[this.H.ordinal()];
        i i;
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    if (n2 != 4) {
                        i = new c<T>(n, m.J);
                    }
                    else {
                        i = new f<T>(n);
                    }
                }
                else {
                    i = new d<T>(n);
                }
            }
            else {
                i = new e<T>(n);
            }
        }
        else {
            i = new h<T>(n);
        }
        n.r((o)i);
        n.s0(i);
        this.G.h((rx.e<T>)i);
    }
    
    abstract static class b<T> extends AtomicLong implements e<T>, i, o
    {
        private static final long I = 7326289992464377023L;
        final n<? super T> G;
        final rx.subscriptions.e H;
        
        public b(final n<? super T> g) {
            this.G = g;
            this.H = new rx.subscriptions.e();
        }
        
        @Override
        public final void a(final o o) {
            this.H.b(o);
        }
        
        @Override
        public void b(final Throwable t) {
            if (this.G.g()) {
                return;
            }
            try {
                this.G.b(t);
            }
            finally {
                this.H.i();
            }
        }
        
        @Override
        public void c() {
            if (this.G.g()) {
                return;
            }
            try {
                this.G.c();
            }
            finally {
                this.H.i();
            }
        }
        
        @Override
        public final long d() {
            return this.get();
        }
        
        @Override
        public final void e(final rx.functions.n n) {
            this.a(new a(n));
        }
        
        @Override
        public final boolean g() {
            return this.H.g();
        }
        
        void h() {
        }
        
        @Override
        public final void i() {
            this.H.i();
            this.j();
        }
        
        void j() {
        }
        
        @Override
        public final void v(final long n) {
            if (a.j(n)) {
                a.b(this, n);
                this.h();
            }
        }
    }
    
    static final class c<T> extends b<T>
    {
        private static final long N = 2427151001689639875L;
        final Queue<Object> J;
        Throwable K;
        volatile boolean L;
        final AtomicInteger M;
        
        public c(final n<? super T> n, final int n2) {
            super(n);
            Object j;
            if (n0.f()) {
                j = new h0<Object>(n2);
            }
            else {
                j = new rx.internal.util.atomic.i<Object>(n2);
            }
            this.J = (Queue<Object>)j;
            this.M = new AtomicInteger();
        }
        
        @Override
        public void b(final Throwable k) {
            this.K = k;
            this.L = true;
            this.k();
        }
        
        @Override
        public void c() {
            this.L = true;
            this.k();
        }
        
        @Override
        void h() {
            this.k();
        }
        
        @Override
        void j() {
            if (this.M.getAndIncrement() == 0) {
                this.J.clear();
            }
        }
        
        void k() {
            if (this.M.getAndIncrement() != 0) {
                return;
            }
            final n<? super T> g = (n<? super T>)super.G;
            final Queue<Object> j = this.J;
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
                    if (g.g()) {
                        j.clear();
                        return;
                    }
                    final boolean l = this.L;
                    final Object poll = j.poll();
                    final boolean b = poll == null;
                    if (l && b) {
                        final Throwable k = this.K;
                        if (k != null) {
                            super.b(k);
                        }
                        else {
                            super.c();
                        }
                        return;
                    }
                    if (b) {
                        break;
                    }
                    g.m(x.e(poll));
                    ++n;
                }
                if (n2 == 0) {
                    if (g.g()) {
                        j.clear();
                        return;
                    }
                    final boolean i = this.L;
                    final boolean empty = j.isEmpty();
                    if (i && empty) {
                        final Throwable m = this.K;
                        if (m != null) {
                            super.b(m);
                        }
                        else {
                            super.c();
                        }
                        return;
                    }
                }
                if (n != 0L) {
                    a.i(this, n);
                }
            } while ((addAndGet = this.M.addAndGet(-addAndGet)) != 0);
        }
        
        @Override
        public void m(final T t) {
            this.J.offer(x.j(t));
            this.k();
        }
    }
    
    static final class d<T> extends g<T>
    {
        private static final long K = 8360058422307496563L;
        
        public d(final n<? super T> n) {
            super(n);
        }
        
        @Override
        void k() {
        }
    }
    
    static final class e<T> extends g<T>
    {
        private static final long L = 338953216916120960L;
        private boolean K;
        
        public e(final n<? super T> n) {
            super(n);
        }
        
        @Override
        public void b(final Throwable t) {
            if (this.K) {
                rx.plugins.c.I(t);
                return;
            }
            this.K = true;
            super.b(t);
        }
        
        @Override
        public void c() {
            if (this.K) {
                return;
            }
            this.K = true;
            super.c();
        }
        
        @Override
        void k() {
            this.b(new rx.exceptions.d("create: could not emit value due to lack of requests"));
        }
        
        @Override
        public void m(final T t) {
            if (this.K) {
                return;
            }
            super.m(t);
        }
    }
    
    static final class f<T> extends b<T>
    {
        private static final long N = 4023437720691792495L;
        final AtomicReference<Object> J;
        Throwable K;
        volatile boolean L;
        final AtomicInteger M;
        
        public f(final n<? super T> n) {
            super(n);
            this.J = new AtomicReference<Object>();
            this.M = new AtomicInteger();
        }
        
        @Override
        public void b(final Throwable k) {
            this.K = k;
            this.L = true;
            this.k();
        }
        
        @Override
        public void c() {
            this.L = true;
            this.k();
        }
        
        @Override
        void h() {
            this.k();
        }
        
        @Override
        void j() {
            if (this.M.getAndIncrement() == 0) {
                this.J.lazySet(null);
            }
        }
        
        void k() {
            if (this.M.getAndIncrement() != 0) {
                return;
            }
            final n<? super T> g = (n<? super T>)super.G;
            final AtomicReference<Object> j = this.J;
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
                    if (g.g()) {
                        j.lazySet(null);
                        return;
                    }
                    final boolean l = this.L;
                    final Object andSet = j.getAndSet(null);
                    final boolean b = andSet == null;
                    if (l && b) {
                        final Throwable k = this.K;
                        if (k != null) {
                            super.b(k);
                        }
                        else {
                            super.c();
                        }
                        return;
                    }
                    if (b) {
                        break;
                    }
                    g.m(x.e(andSet));
                    ++n;
                }
                if (n3 == 0) {
                    if (g.g()) {
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
                            super.b(m);
                        }
                        else {
                            super.c();
                        }
                        return;
                    }
                }
                if (n != 0L) {
                    a.i(this, n);
                }
            } while ((addAndGet = this.M.addAndGet(-addAndGet)) != 0);
        }
        
        @Override
        public void m(final T t) {
            this.J.set(x.j(t));
            this.k();
        }
    }
    
    abstract static class g<T> extends b<T>
    {
        private static final long J = 4127754106204442833L;
        
        public g(final n<? super T> n) {
            super(n);
        }
        
        abstract void k();
        
        @Override
        public void m(final T t) {
            if (super.G.g()) {
                return;
            }
            if (this.get() != 0L) {
                super.G.m(t);
                a.i(this, 1L);
            }
            else {
                this.k();
            }
        }
    }
    
    static final class h<T> extends b<T>
    {
        private static final long J = 3776720187248809713L;
        
        public h(final n<? super T> n) {
            super(n);
        }
        
        @Override
        public void m(final T t) {
            if (super.G.g()) {
                return;
            }
            super.G.m(t);
            long value;
            do {
                value = this.get();
            } while (value != 0L && !this.compareAndSet(value, value - 1L));
        }
    }
}
