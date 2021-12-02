// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.annotations.g;
import io.reactivex.exceptions.b;
import io.reactivex.internal.subscriptions.j;
import y5.o;
import o7.d;
import java.util.concurrent.atomic.AtomicLong;
import io.reactivex.q;
import o7.c;
import io.reactivex.l;
import io.reactivex.j0;

public final class j2<T> extends io.reactivex.internal.operators.flowable.a<T, T>
{
    final j0 I;
    final boolean J;
    final int K;
    
    public j2(final l<T> l, final j0 i, final boolean j, final int k) {
        super(l);
        this.I = i;
        this.J = j;
        this.K = k;
    }
    
    public void n6(final o7.c<? super T> c) {
        final j0.c c2 = this.I.c();
        Object o;
        Runnable runnable;
        if (c instanceof y5.a) {
            final l<T> h = (l<T>)super.H;
            final b b = new b<Object>((y5.a<? super Object>)c, c2, this.J, this.K);
            o = h;
            runnable = b;
        }
        else {
            final l<T> h2 = (l<T>)super.H;
            runnable = new c<Object>((o7.c<? super T>)c, c2, this.J, this.K);
            o = h2;
        }
        ((l<T>)o).m6((q<? super T>)runnable);
    }
    
    abstract static class a<T> extends io.reactivex.internal.subscriptions.c<T> implements q<T>, Runnable
    {
        private static final long U = -8241002408341274697L;
        final j0.c H;
        final boolean I;
        final int J;
        final int K;
        final AtomicLong L;
        d M;
        o<T> N;
        volatile boolean O;
        volatile boolean P;
        Throwable Q;
        int R;
        long S;
        boolean T;
        
        a(final j0.c h, final boolean i, final int j) {
            this.H = h;
            this.I = i;
            this.J = j;
            this.L = new AtomicLong();
            this.K = j - (j >> 2);
        }
        
        public final int E(final int n) {
            if ((n & 0x2) != 0x0) {
                this.T = true;
                return 2;
            }
            return 0;
        }
        
        public final void b(final Throwable q) {
            if (this.P) {
                io.reactivex.plugins.a.Y(q);
                return;
            }
            this.Q = q;
            this.P = true;
            this.q();
        }
        
        public final void cancel() {
            if (this.O) {
                return;
            }
            this.O = true;
            this.M.cancel();
            this.H.dispose();
            if (this.getAndIncrement() == 0) {
                this.N.clear();
            }
        }
        
        public final void clear() {
            this.N.clear();
        }
        
        public final void f() {
            if (!this.P) {
                this.P = true;
                this.q();
            }
        }
        
        final boolean g(final boolean b, final boolean b2, final c<?> c) {
            if (this.O) {
                this.clear();
                return true;
            }
            if (b) {
                while (true) {
                    Label_0098: {
                        Throwable t = null;
                        Label_0078: {
                            if (this.I) {
                                if (!b2) {
                                    return false;
                                }
                                this.O = true;
                                t = this.Q;
                                if (t != null) {
                                    break Label_0078;
                                }
                                break Label_0098;
                            }
                            else {
                                t = this.Q;
                                if (t != null) {
                                    this.O = true;
                                    this.clear();
                                    break Label_0078;
                                }
                                if (b2) {
                                    this.O = true;
                                    break Label_0098;
                                }
                                return false;
                            }
                            this.H.dispose();
                            return true;
                        }
                        c.b(t);
                        continue;
                    }
                    c.f();
                    continue;
                }
            }
            return false;
        }
        
        abstract void i();
        
        public final boolean isEmpty() {
            return this.N.isEmpty();
        }
        
        abstract void j();
        
        public final void m(final T t) {
            if (this.P) {
                return;
            }
            if (this.R == 2) {
                this.q();
                return;
            }
            if (!this.N.offer(t)) {
                this.M.cancel();
                this.Q = new io.reactivex.exceptions.c("Queue is full?!");
                this.P = true;
            }
            this.q();
        }
        
        abstract void n();
        
        final void q() {
            if (this.getAndIncrement() != 0) {
                return;
            }
            this.H.b(this);
        }
        
        @Override
        public final void run() {
            if (this.T) {
                this.j();
            }
            else if (this.R == 1) {
                this.n();
            }
            else {
                this.i();
            }
        }
        
        public final void v(final long n) {
            if (j.m(n)) {
                io.reactivex.internal.util.d.a(this.L, n);
                this.q();
            }
        }
    }
    
    static final class b<T> extends a<T>
    {
        private static final long X = 644624475404284533L;
        final y5.a<? super T> V;
        long W;
        
        b(final y5.a<? super T> v, final j0.c c, final boolean b, final int n) {
            super(c, b, n);
            this.V = v;
        }
        
        @Override
        void i() {
            final y5.a<? super T> v = this.V;
            final o<T> n = (o<T>)super.N;
            long s = super.S;
            long w = this.W;
            int addAndGet = 1;
            while (true) {
                final long value = super.L.get();
                long n2;
                while (true) {
                    n2 = lcmp(s, value);
                    if (n2 != 0) {
                        final boolean p = super.P;
                        try {
                            final T poll = n.poll();
                            final boolean b = poll == null;
                            if (this.g(p, b, (c<?>)v)) {
                                return;
                            }
                            if (!b) {
                                long n3 = s;
                                if (v.B((Object)poll)) {
                                    n3 = s + 1L;
                                }
                                final long n4 = w + 1L;
                                s = n3;
                                w = n4;
                                if (n4 == super.K) {
                                    super.M.v(n4);
                                    w = 0L;
                                    s = n3;
                                    continue;
                                }
                                continue;
                            }
                        }
                        finally {
                            final Throwable t;
                            io.reactivex.exceptions.b.b(t);
                            super.O = true;
                            super.M.cancel();
                            n.clear();
                            ((c)v).b(t);
                            super.H.dispose();
                            return;
                        }
                        break;
                    }
                    break;
                }
                if (n2 == 0 && this.g(super.P, n.isEmpty(), (c<?>)v)) {
                    return;
                }
                final int value2 = this.get();
                if (addAndGet == value2) {
                    super.S = s;
                    this.W = w;
                    if ((addAndGet = this.addAndGet(-addAndGet)) == 0) {
                        return;
                    }
                    continue;
                }
                else {
                    addAndGet = value2;
                }
            }
        }
        
        @Override
        void j() {
            int addAndGet = 1;
            while (!super.O) {
                final boolean p = super.P;
                ((c)this.V).m((Object)null);
                if (p) {
                    super.O = true;
                    final Throwable q = super.Q;
                    if (q != null) {
                        ((c)this.V).b(q);
                    }
                    else {
                        ((c)this.V).f();
                    }
                    super.H.dispose();
                    return;
                }
                if ((addAndGet = this.addAndGet(-addAndGet)) == 0) {
                    return;
                }
            }
        }
        
        @Override
        void n() {
            final y5.a<? super T> v = this.V;
            final o<T> n = (o<T>)super.N;
            long s = super.S;
            int addAndGet = 1;
            while (true) {
                final long value = super.L.get();
            Label_0055_Outer:
                while (true) {
                    while (true) {
                        Label_0126: {
                            if (s == value) {
                                break Label_0126;
                            }
                            while (true) {
                                try {
                                    final T poll = n.poll();
                                    if (super.O) {
                                        return;
                                    }
                                    if (poll == null) {
                                        super.O = true;
                                        ((c)v).f();
                                        super.H.dispose();
                                        return;
                                    }
                                    if (v.B(poll)) {
                                        ++s;
                                        continue Label_0055_Outer;
                                    }
                                    continue Label_0055_Outer;
                                }
                                finally {
                                    final Throwable t;
                                    io.reactivex.exceptions.b.b(t);
                                    super.O = true;
                                    super.M.cancel();
                                    ((c)v).b(t);
                                    continue;
                                }
                                break;
                            }
                        }
                        if (super.O) {
                            return;
                        }
                        if (n.isEmpty()) {
                            continue;
                        }
                        break;
                    }
                    final int value2 = this.get();
                    if (addAndGet != value2) {
                        addAndGet = value2;
                        break;
                    }
                    super.S = s;
                    if ((addAndGet = this.addAndGet(-addAndGet)) == 0) {
                        return;
                    }
                    break;
                }
            }
        }
        
        @g
        public T poll() throws Exception {
            final T poll = super.N.poll();
            if (poll != null && super.R != 1) {
                final long w = this.W + 1L;
                if (w == super.K) {
                    this.W = 0L;
                    super.M.v(w);
                }
                else {
                    this.W = w;
                }
            }
            return poll;
        }
        
        @Override
        public void z(final d m) {
            if (j.o(super.M, m)) {
                super.M = m;
                if (m instanceof y5.l) {
                    final y5.l l = (y5.l)m;
                    final int e = l.E(7);
                    if (e == 1) {
                        super.R = 1;
                        super.N = l;
                        super.P = true;
                        this.V.z((d)this);
                        return;
                    }
                    if (e == 2) {
                        super.R = 2;
                        super.N = l;
                        this.V.z((d)this);
                        m.v((long)super.J);
                        return;
                    }
                }
                super.N = new io.reactivex.internal.queue.b<Object>(super.J);
                this.V.z((d)this);
                m.v((long)super.J);
            }
        }
    }
    
    static final class c<T> extends a<T> implements q<T>
    {
        private static final long W = -4547113800637756442L;
        final o7.c<? super T> V;
        
        c(final o7.c<? super T> v, final j0.c c, final boolean b, final int n) {
            super(c, b, n);
            this.V = v;
        }
        
        @Override
        void i() {
            final o7.c<? super T> v = this.V;
            final o<T> n = (o<T>)super.N;
            long s = super.S;
            int addAndGet = 1;
            while (true) {
                long value = super.L.get();
                long n2;
                while (true) {
                    n2 = lcmp(s, value);
                    if (n2 != 0) {
                        final boolean p = super.P;
                        try {
                            final T poll = n.poll();
                            final boolean b = poll == null;
                            if (this.g(p, b, v)) {
                                return;
                            }
                            if (!b) {
                                v.m((Object)poll);
                                final long n3 = ++s;
                                if (n3 == super.K) {
                                    long addAndGet2 = value;
                                    if (value != Long.MAX_VALUE) {
                                        addAndGet2 = super.L.addAndGet(-n3);
                                    }
                                    super.M.v(n3);
                                    s = 0L;
                                    value = addAndGet2;
                                    continue;
                                }
                                continue;
                            }
                        }
                        finally {
                            final Throwable t;
                            io.reactivex.exceptions.b.b(t);
                            super.O = true;
                            super.M.cancel();
                            n.clear();
                            v.b(t);
                            super.H.dispose();
                            return;
                        }
                        break;
                    }
                    break;
                }
                if (n2 == 0 && this.g(super.P, n.isEmpty(), v)) {
                    return;
                }
                final int value2 = this.get();
                if (addAndGet == value2) {
                    super.S = s;
                    if ((addAndGet = this.addAndGet(-addAndGet)) == 0) {
                        return;
                    }
                    continue;
                }
                else {
                    addAndGet = value2;
                }
            }
        }
        
        @Override
        void j() {
            int addAndGet = 1;
            while (!super.O) {
                final boolean p = super.P;
                this.V.m((Object)null);
                if (p) {
                    super.O = true;
                    final Throwable q = super.Q;
                    if (q != null) {
                        this.V.b(q);
                    }
                    else {
                        this.V.f();
                    }
                    super.H.dispose();
                    return;
                }
                if ((addAndGet = this.addAndGet(-addAndGet)) == 0) {
                    return;
                }
            }
        }
        
        @Override
        void n() {
            final o7.c<? super T> v = this.V;
            final o<T> n = (o<T>)super.N;
            long s = super.S;
            int addAndGet = 1;
            while (true) {
                final long value = super.L.get();
            Label_0055_Outer:
                while (true) {
                    while (true) {
                        Label_0120: {
                            if (s == value) {
                                break Label_0120;
                            }
                            while (true) {
                                try {
                                    final T poll = n.poll();
                                    if (super.O) {
                                        return;
                                    }
                                    if (poll == null) {
                                        super.O = true;
                                        v.f();
                                        super.H.dispose();
                                        return;
                                    }
                                    v.m((Object)poll);
                                    ++s;
                                    continue Label_0055_Outer;
                                }
                                finally {
                                    io.reactivex.exceptions.b.b((Throwable)n);
                                    super.O = true;
                                    super.M.cancel();
                                    v.b((Throwable)n);
                                    continue;
                                }
                                break;
                            }
                        }
                        if (super.O) {
                            return;
                        }
                        if (n.isEmpty()) {
                            continue;
                        }
                        break;
                    }
                    final int value2 = this.get();
                    if (addAndGet != value2) {
                        addAndGet = value2;
                        break;
                    }
                    super.S = s;
                    if ((addAndGet = this.addAndGet(-addAndGet)) == 0) {
                        return;
                    }
                    break;
                }
            }
        }
        
        @g
        public T poll() throws Exception {
            final T poll = super.N.poll();
            if (poll != null && super.R != 1) {
                final long s = super.S + 1L;
                if (s == super.K) {
                    super.S = 0L;
                    super.M.v(s);
                }
                else {
                    super.S = s;
                }
            }
            return poll;
        }
        
        @Override
        public void z(final d m) {
            if (j.o(super.M, m)) {
                super.M = m;
                if (m instanceof y5.l) {
                    final y5.l l = (y5.l)m;
                    final int e = l.E(7);
                    if (e == 1) {
                        super.R = 1;
                        super.N = l;
                        super.P = true;
                        this.V.z((d)this);
                        return;
                    }
                    if (e == 2) {
                        super.R = 2;
                        super.N = l;
                        this.V.z((d)this);
                        m.v((long)super.J);
                        return;
                    }
                }
                super.N = new io.reactivex.internal.queue.b<Object>(super.J);
                this.V.z((d)this);
                m.v((long)super.J);
            }
        }
    }
}
