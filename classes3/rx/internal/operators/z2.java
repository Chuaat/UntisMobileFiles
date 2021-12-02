// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import java.util.Objects;
import rx.exceptions.d;
import rx.subscriptions.f;
import rx.functions.a;
import rx.h;
import rx.internal.util.atomic.e;
import rx.internal.util.unsafe.z;
import rx.internal.util.unsafe.n0;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import rx.functions.b;
import rx.o;
import rx.i;
import rx.internal.util.m;
import rx.n;
import rx.functions.p;
import java.util.concurrent.atomic.AtomicReference;
import rx.g;
import rx.observables.c;

public final class z2<T> extends rx.observables.c<T>
{
    final g<? extends T> H;
    final AtomicReference<d<T>> I;
    
    private z2(final a<T> a, final g<? extends T> h, final AtomicReference<d<T>> i) {
        super(a);
        this.H = h;
        this.I = i;
    }
    
    public static <T, R> g<R> K7(final g<? extends T> g, final p<? super g<T>, ? extends g<R>> p2) {
        return L7((g<?>)g, (p<? super g<Object>, ? extends g<R>>)p2, false);
    }
    
    public static <T, R> g<R> L7(final g<? extends T> g, final p<? super g<T>, ? extends g<R>> p3, final boolean b) {
        return g.Q6((a<R>)new a<R>() {
            public void a(final n<? super R> n) {
                final y0 y0 = new y0<Object>(m.J, b);
                final n<R> n2 = new n<R>() {
                    @Override
                    public void b(final Throwable t) {
                        y0.i();
                        n.b(t);
                    }
                    
                    @Override
                    public void c() {
                        y0.i();
                        n.c();
                    }
                    
                    @Override
                    public void m(final R r) {
                        n.m(r);
                    }
                    
                    @Override
                    public void s0(final i i) {
                        n.s0(i);
                    }
                };
                n.r(y0);
                n.r(n2);
                p3.h(g.Q6((a<Object>)y0)).R6(n2);
                g.R6(y0.w());
            }
        });
    }
    
    public static <T> rx.observables.c<T> M7(final g<? extends T> g) {
        final AtomicReference<d<T>> atomicReference = (AtomicReference<d<T>>)new AtomicReference<d<Object>>();
        return new z2<T>((a<Object>)new a<T>() {
            public void a(final n<? super T> n) {
                z2.c c;
                while (true) {
                    final d expectedValue = atomicReference.get();
                    d newValue = null;
                    Label_0055: {
                        if (expectedValue != null) {
                            newValue = expectedValue;
                            if (!expectedValue.g()) {
                                break Label_0055;
                            }
                        }
                        newValue = new d(atomicReference);
                        newValue.C();
                        if (!atomicReference.compareAndSet(expectedValue, newValue)) {
                            continue;
                        }
                    }
                    c = new z2.c(newValue, (n<? super Object>)n);
                    if (newValue.w((z2.c<Object>)c)) {
                        break;
                    }
                }
                n.r(c);
                n.s0(c);
            }
        }, g, (AtomicReference<d<Object>>)atomicReference);
    }
    
    @Override
    public void I7(final rx.functions.b<? super o> b) {
        d<T> expectedValue;
        d<T> newValue;
        do {
            expectedValue = this.I.get();
            if (expectedValue != null) {
                newValue = expectedValue;
                if (!expectedValue.g()) {
                    break;
                }
            }
            newValue = new d<T>(this.I);
            newValue.C();
        } while (!this.I.compareAndSet(expectedValue, newValue));
        final boolean value = newValue.P.get();
        boolean b2 = true;
        if (value || !newValue.P.compareAndSet(false, true)) {
            b2 = false;
        }
        b.h(newValue);
        if (b2) {
            this.H.R6(newValue);
        }
    }
    
    static final class c<T> extends AtomicLong implements i, o
    {
        private static final long I = -4453897557930727610L;
        static final long J = Long.MIN_VALUE;
        static final long K = -4611686018427387904L;
        final d<T> G;
        final n<? super T> H;
        
        public c(final d<T> g, final n<? super T> h) {
            this.G = g;
            this.H = h;
            this.lazySet(-4611686018427387904L);
        }
        
        public long a(final long lng) {
            if (lng > 0L) {
                long value;
                long newValue;
                do {
                    value = this.get();
                    if (value == -4611686018427387904L) {
                        throw new IllegalStateException("Produced without request");
                    }
                    if (value == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    newValue = value - lng;
                    if (newValue >= 0L) {
                        continue;
                    }
                    final StringBuilder sb = new StringBuilder();
                    sb.append("More produced (");
                    sb.append(lng);
                    sb.append(") than requested (");
                    sb.append(value);
                    sb.append(")");
                    throw new IllegalStateException(sb.toString());
                } while (!this.compareAndSet(value, newValue));
                return newValue;
            }
            throw new IllegalArgumentException("Cant produce zero or less");
        }
        
        @Override
        public boolean g() {
            return this.get() == Long.MIN_VALUE;
        }
        
        @Override
        public void i() {
            if (this.get() != Long.MIN_VALUE && this.getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.G.D(this);
                this.G.A();
            }
        }
        
        @Override
        public void v(final long n) {
            final long n2 = lcmp(n, 0L);
            if (n2 < 0) {
                return;
            }
            long value;
            long newValue;
            do {
                value = this.get();
                if (value == Long.MIN_VALUE) {
                    return;
                }
                if (value >= 0L && n2 == 0) {
                    return;
                }
                if (value == -4611686018427387904L) {
                    newValue = n;
                }
                else {
                    if ((newValue = value + n) >= 0L) {
                        continue;
                    }
                    newValue = Long.MAX_VALUE;
                }
            } while (!this.compareAndSet(value, newValue));
            this.G.A();
        }
    }
    
    static final class d<T> extends n<T> implements o
    {
        static final c[] S;
        static final c[] T;
        final Queue<Object> L;
        final AtomicReference<d<T>> M;
        volatile Object N;
        final AtomicReference<c[]> O;
        final AtomicBoolean P;
        boolean Q;
        boolean R;
        
        static {
            S = new c[0];
            T = new c[0];
        }
        
        public d(final AtomicReference<d<T>> m) {
            Object l;
            if (n0.f()) {
                l = new z<Object>(m.J);
            }
            else {
                l = new e<Object>(m.J);
            }
            this.L = (Queue<Object>)l;
            this.O = new AtomicReference<c[]>(d.S);
            this.M = m;
            this.P = new AtomicBoolean();
        }
        
        void A() {
            synchronized (this) {
                if (this.Q) {
                    this.R = true;
                    return;
                }
                this.Q = true;
                this.R = false;
                // monitorexit(this)
                boolean b;
                try {
                    while (true) {
                        final Object n = this.N;
                        boolean empty = this.L.isEmpty();
                        if (this.x(n, empty)) {
                            return;
                        }
                        // monitorenter(this)
                        Label_0428: {
                            if (!empty) {
                                final c[] array = this.O.get();
                                final int length = array.length;
                                long a = Long.MAX_VALUE;
                                final int length2 = array.length;
                                int i = 0;
                                int n2 = 0;
                                while (i < length2) {
                                    final long value = array[i].get();
                                    long min;
                                    int n3;
                                    if (value >= 0L) {
                                        min = Math.min(a, value);
                                        n3 = n2;
                                    }
                                    else {
                                        min = a;
                                        n3 = n2;
                                        if (value == Long.MIN_VALUE) {
                                            n3 = n2 + 1;
                                            min = a;
                                        }
                                    }
                                    ++i;
                                    a = min;
                                    n2 = n3;
                                }
                                if (length == n2) {
                                    if (this.x(this.N, this.L.poll() == null)) {
                                        return;
                                    }
                                    this.v(1L);
                                    continue;
                                }
                                else {
                                    int n4 = 0;
                                    long n5;
                                    while (true) {
                                        n5 = n4;
                                        if (n5 >= a) {
                                            break;
                                        }
                                        final Object n6 = this.N;
                                        final Object poll = this.L.poll();
                                        empty = (poll == null);
                                        if (this.x(n6, empty)) {
                                            return;
                                        }
                                        if (empty) {
                                            break;
                                        }
                                        final Object e = x.e(poll);
                                        for (final c c : array) {
                                            if (c.get() > 0L) {
                                                try {
                                                    c.H.m((Object)e);
                                                    c.a(1L);
                                                }
                                                finally {
                                                    c.i();
                                                    final Throwable t;
                                                    rx.exceptions.c.g(t, c.H, e);
                                                }
                                            }
                                        }
                                        ++n4;
                                    }
                                    if (n4 > 0) {
                                        this.v(n5);
                                    }
                                    if (a != 0L && !empty) {
                                        break Label_0428;
                                    }
                                }
                            }
                            try {
                                if (!this.R) {
                                    this.Q = false;
                                    try {
                                        return;
                                    }
                                    finally {}
                                }
                                this.R = false;
                                // monitorexit(this)
                                continue;
                            }
                            finally {}
                        }
                        try {
                            // monitorexit(this)
                            try {
                                throw;
                            }
                            finally {}
                        }
                        finally {}
                    }
                }
                finally {
                    b = false;
                }
                if (!b) {
                    synchronized (this) {
                        this.Q = false;
                    }
                }
            }
        }
        
        void C() {
            this.r(f.a(new rx.functions.a() {
                @Override
                public void call() {
                    d.this.O.getAndSet(d.T);
                    final d g = d.this;
                    g.M.compareAndSet(g, null);
                }
            }));
        }
        
        void D(final c<T> obj) {
            c[] expectedValue;
            c[] s;
            do {
                expectedValue = this.O.get();
                if (expectedValue == d.S) {
                    break;
                }
                if (expectedValue == d.T) {
                    break;
                }
                final int n = -1;
                final int length = expectedValue.length;
                int n2 = 0;
                int n3;
                while (true) {
                    n3 = n;
                    if (n2 >= length) {
                        break;
                    }
                    if (expectedValue[n2].equals(obj)) {
                        n3 = n2;
                        break;
                    }
                    ++n2;
                }
                if (n3 < 0) {
                    return;
                }
                if (length == 1) {
                    s = d.S;
                }
                else {
                    s = new c[length - 1];
                    System.arraycopy(expectedValue, 0, s, 0, n3);
                    System.arraycopy(expectedValue, n3 + 1, s, n3, length - n3 - 1);
                }
            } while (!this.O.compareAndSet(expectedValue, s));
        }
        
        @Override
        public void b(final Throwable t) {
            if (this.N == null) {
                this.N = x.c(t);
                this.A();
            }
        }
        
        @Override
        public void c() {
            if (this.N == null) {
                this.N = x.b();
                this.A();
            }
        }
        
        @Override
        public void f() {
            this.v(m.J);
        }
        
        @Override
        public void m(final T t) {
            if (!this.L.offer(x.j(t))) {
                this.b(new rx.exceptions.d());
            }
            else {
                this.A();
            }
        }
        
        boolean w(final c<T> obj) {
            Objects.requireNonNull(obj);
            c[] expectedValue;
            c[] newValue;
            do {
                expectedValue = this.O.get();
                if (expectedValue == d.T) {
                    return false;
                }
                final int length = expectedValue.length;
                newValue = new c[length + 1];
                System.arraycopy(expectedValue, 0, newValue, 0, length);
                newValue[length] = obj;
            } while (!this.O.compareAndSet(expectedValue, newValue));
            return true;
        }
        
        boolean x(final Object o, final boolean b) {
            final int n = 0;
            int i = 0;
            if (o != null) {
                if (x.f(o)) {
                    if (!b) {
                        return false;
                    }
                    this.M.compareAndSet(this, null);
                    try {
                        for (c[] array = this.O.getAndSet(d.T); i < array.length; ++i) {
                            array[i].H.c();
                        }
                        return true;
                    }
                    finally {
                        this.i();
                    }
                }
                final Throwable d = x.d(o);
                this.M.compareAndSet(this, null);
                try {
                    final c[] array2 = this.O.getAndSet(z2.d.T);
                    for (int length = array2.length, j = n; j < length; ++j) {
                        array2[j].H.b(d);
                    }
                    return true;
                }
                finally {
                    this.i();
                }
            }
            return false;
        }
    }
}
