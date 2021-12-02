// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.exceptions.h;
import rx.exceptions.d;
import rx.internal.util.atomic.f;
import rx.internal.util.atomic.e;
import rx.internal.util.unsafe.z;
import rx.internal.util.unsafe.n0;
import rx.internal.util.unsafe.p;
import rx.exceptions.c;
import java.util.Collection;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import rx.subscriptions.b;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import rx.internal.util.m;
import rx.i;
import rx.o;
import rx.n;
import rx.g;

public final class s2<T> implements g.b<T, g<? extends T>>
{
    final boolean G;
    final int H;
    
    s2(final boolean g, final int h) {
        this.G = g;
        this.H = h;
    }
    
    public static <T> s2<T> b(final boolean b) {
        if (b) {
            return (s2<T>)a.a;
        }
        return (s2<T>)s2.b.a;
    }
    
    public static <T> s2<T> c(final boolean b, final int i) {
        if (i <= 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("maxConcurrent > 0 required but it was ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i == Integer.MAX_VALUE) {
            return b(b);
        }
        return new s2<T>(b, i);
    }
    
    public n<g<? extends T>> a(final n<? super T> n) {
        final e e = new e((n<? super Object>)n, this.G, this.H);
        final d o = new d((e<Object>)e);
        e.O = (d<T>)o;
        n.r(e);
        n.s0(o);
        return (n<g<? extends T>>)e;
    }
    
    static final class a
    {
        static final s2<Object> a;
        
        static {
            a = new s2<Object>(true, Integer.MAX_VALUE);
        }
    }
    
    static final class b
    {
        static final s2<Object> a;
        
        static {
            a = new s2<Object>(false, Integer.MAX_VALUE);
        }
    }
    
    static final class c<T> extends n<T>
    {
        static final int Q;
        final e<T> L;
        final long M;
        volatile boolean N;
        volatile m O;
        int P;
        
        static {
            Q = m.J / 4;
        }
        
        public c(final e<T> l, final long m) {
            this.L = l;
            this.M = m;
        }
        
        @Override
        public void b(final Throwable t) {
            this.L.J().offer(t);
            this.N = true;
            this.L.A();
        }
        
        @Override
        public void c() {
            this.N = true;
            this.L.A();
        }
        
        @Override
        public void f() {
            final int j = m.J;
            this.P = j;
            this.v(j);
        }
        
        @Override
        public void m(final T t) {
            this.L.X(this, t);
        }
        
        public void w(final long n) {
            final int p = this.P - (int)n;
            if (p > c.Q) {
                this.P = p;
                return;
            }
            final int j = m.J;
            this.P = j;
            final int n2 = j - p;
            if (n2 > 0) {
                this.v(n2);
            }
        }
    }
    
    static final class d<T> extends AtomicLong implements i
    {
        private static final long H = -1214379189873595503L;
        final e<T> G;
        
        public d(final e<T> g) {
            this.G = g;
        }
        
        public long a(final int n) {
            return this.addAndGet(-n);
        }
        
        @Override
        public void v(final long n) {
            final long n2 = lcmp(n, 0L);
            if (n2 > 0) {
                if (this.get() == Long.MAX_VALUE) {
                    return;
                }
                rx.internal.operators.a.b(this, n);
                this.G.A();
            }
            else if (n2 < 0) {
                throw new IllegalArgumentException("n >= 0 required");
            }
        }
    }
    
    static final class e<T> extends n<g<? extends T>>
    {
        static final c<?>[] c0;
        final n<? super T> L;
        final boolean M;
        final int N;
        d<T> O;
        volatile Queue<Object> P;
        volatile rx.subscriptions.b Q;
        volatile ConcurrentLinkedQueue<Throwable> R;
        volatile boolean S;
        boolean T;
        boolean U;
        final Object V;
        volatile c<?>[] W;
        long X;
        long Y;
        int Z;
        final int a0;
        int b0;
        
        static {
            c0 = new c[0];
        }
        
        public e(final n<? super T> l, final boolean m, final int n) {
            this.L = l;
            this.M = m;
            this.N = n;
            this.V = new Object();
            this.W = e.c0;
            long n2;
            if (n == Integer.MAX_VALUE) {
                this.a0 = Integer.MAX_VALUE;
                n2 = Long.MAX_VALUE;
            }
            else {
                this.a0 = Math.max(1, n >> 1);
                n2 = n;
            }
            this.v(n2);
        }
        
        private void R() {
            final ArrayList<Throwable> list = new ArrayList<Throwable>(this.R);
            if (list.size() == 1) {
                this.L.b((Throwable)list.get(0));
            }
            else {
                this.L.b(new rx.exceptions.b(list));
            }
        }
        
        void A() {
            synchronized (this) {
                if (this.T) {
                    this.U = true;
                    return;
                }
                this.T = true;
                // monitorexit(this)
                this.D();
            }
        }
        
        void C() {
            final int b0 = this.b0 + 1;
            if (b0 == this.a0) {
                this.b0 = 0;
                this.S(b0);
            }
            else {
                this.b0 = b0;
            }
        }
        
        void D() {
            boolean b2;
            try {
                final n<? super T> l = this.L;
                while (!this.x()) {
                    final Queue<Object> p = this.P;
                    long n = this.O.get();
                    final boolean b = n == Long.MAX_VALUE;
                    int n6;
                    long n7;
                    if (p != null) {
                        int n2 = 0;
                        while (true) {
                            final int n3 = 0;
                            int n4 = n2;
                            Object poll = null;
                            int n5 = n3;
                            while (n > 0L) {
                                poll = p.poll();
                                if (this.x()) {
                                    return;
                                }
                                if (poll == null) {
                                    break;
                                }
                                final Object e = x.e(poll);
                                Label_0159: {
                                    final Throwable t;
                                    try {
                                        l.m(e);
                                        break Label_0159;
                                    }
                                    finally {
                                        if (!this.M) {
                                            rx.exceptions.c.e(t);
                                            try {
                                                this.i();
                                                l.b(t);
                                                return;
                                            }
                                            finally {}
                                        }
                                    }
                                    this.J().offer(t);
                                }
                                ++n4;
                                ++n5;
                                --n;
                            }
                            if (n5 > 0) {
                                if (b) {
                                    n = Long.MAX_VALUE;
                                }
                                else {
                                    n = this.O.a(n5);
                                }
                            }
                            n6 = n4;
                            n7 = n;
                            if (n == 0L) {
                                break;
                            }
                            if (poll == null) {
                                n6 = n4;
                                n7 = n;
                                break;
                            }
                            n2 = n4;
                        }
                    }
                    else {
                        n6 = 0;
                        n7 = n;
                    }
                    final boolean s = this.S;
                    final Queue<Object> p2 = this.P;
                    final c<?>[] w = this.W;
                    final int length = w.length;
                    if (s && (p2 == null || p2.isEmpty()) && length == 0) {
                        final ConcurrentLinkedQueue<Throwable> r = this.R;
                        if (r != null && !r.isEmpty()) {
                            this.R();
                        }
                        else {
                            l.c();
                        }
                        return;
                    }
                    int n13;
                    if (length > 0) {
                        final long y = this.Y;
                        final int z = this.Z;
                        int n8 = 0;
                        Label_0454: {
                            if (length > z) {
                                n8 = z;
                                if (w[z].M == y) {
                                    break Label_0454;
                                }
                            }
                            int z2;
                            if (length <= (z2 = z)) {
                                z2 = 0;
                            }
                            for (int n9 = 0; n9 < length && w[z2].M != y; ++n9) {
                                if (++z2 == length) {
                                    z2 = 0;
                                }
                            }
                            this.Z = z2;
                            this.Y = w[z2].M;
                            n8 = z2;
                        }
                        int n10 = 0;
                        int n11 = 0;
                        long a = n7;
                        int z3 = n8;
                        int n12;
                        while (true) {
                            n12 = n6;
                            n13 = n11;
                            if (n10 >= length) {
                                break;
                            }
                            if (this.x()) {
                                return;
                            }
                            final c<?> c = w[z3];
                            Object e2 = null;
                            long n14 = a;
                            Object s2;
                            long n16;
                            do {
                                int n15 = 0;
                                a = n14;
                                while (true) {
                                    s2 = e2;
                                    if (a <= 0L) {
                                        break;
                                    }
                                    if (this.x()) {
                                        return;
                                    }
                                    final m o = c.O;
                                    if (o == null) {
                                        s2 = e2;
                                        break;
                                    }
                                    s2 = o.s();
                                    if (s2 == null) {
                                        break;
                                    }
                                    e2 = x.e(s2);
                                    try {
                                        l.m(e2);
                                        --a;
                                        ++n15;
                                        e2 = s2;
                                        continue;
                                    }
                                    finally {
                                        final Throwable t2;
                                        rx.exceptions.c.e(t2);
                                        try {
                                            l.b(t2);
                                            return;
                                        }
                                        finally {
                                            this.i();
                                        }
                                    }
                                    break;
                                }
                                if (n15 > 0) {
                                    if (!b) {
                                        a = this.O.a(n15);
                                    }
                                    else {
                                        a = Long.MAX_VALUE;
                                    }
                                    c.w(n15);
                                }
                                n16 = lcmp(a, 0L);
                                if (n16 == 0) {
                                    break;
                                }
                                e2 = s2;
                                n14 = a;
                            } while (s2 != null);
                            final boolean n17 = c.N;
                            final m o2 = c.O;
                            n12 = n6;
                            n13 = n11;
                            Label_0740: {
                                if (n17) {
                                    if (o2 != null) {
                                        n12 = n6;
                                        n13 = n11;
                                        if (!o2.m()) {
                                            break Label_0740;
                                        }
                                    }
                                    this.N((c<T>)c);
                                    if (this.x()) {
                                        return;
                                    }
                                    n12 = n6 + 1;
                                    n13 = 1;
                                }
                            }
                            if (n16 == 0) {
                                break;
                            }
                            int n18;
                            if ((n18 = z3 + 1) == length) {
                                n18 = 0;
                            }
                            ++n10;
                            z3 = n18;
                            n6 = n12;
                            n11 = n13;
                        }
                        this.Z = z3;
                        this.Y = w[z3].M;
                        n6 = n12;
                    }
                    else {
                        n13 = 0;
                    }
                    if (n6 > 0) {
                        this.v(n6);
                    }
                    if (n13 != 0) {
                        continue;
                    }
                    // monitorenter(this)
                    try {
                        if (!this.U) {
                            try {
                                this.T = false;
                                // monitorexit(this)
                                return;
                            }
                            finally {}
                        }
                        this.U = false;
                        // monitorexit(this)
                        continue;
                    }
                    finally {}
                    try {
                        // monitorexit(this)
                        try {
                            throw;
                        }
                        finally {}
                    }
                    finally {}
                }
                return;
            }
            finally {
                b2 = false;
            }
            if (!b2) {
                synchronized (this) {
                    this.T = false;
                }
            }
        }
        
        protected void F(final T t, final long n) {
            boolean b3 = false;
            Label_0042: {
                final Throwable t3;
                try {
                    this.L.m((Object)t);
                    break Label_0042;
                }
                finally {
                    final e e = this;
                    final boolean b = e.M;
                    if (b) {
                        break Label_0042;
                    }
                    final Throwable t2 = t3;
                    rx.exceptions.c.e(t2);
                    try {
                        final e e2 = this;
                        e2.i();
                        final e e3 = this;
                        final Throwable t4 = t3;
                        e3.b(t4);
                        return;
                    }
                    finally {}
                }
                try {
                    final e e = this;
                    final boolean b = e.M;
                    if (!b) {
                        final Throwable t2 = t3;
                        rx.exceptions.c.e(t2);
                        final e e2 = this;
                        e2.i();
                        final e e3 = this;
                        final Throwable t4 = t3;
                        e3.b(t4);
                        return;
                    }
                    this.J().offer(t3);
                    if (n != Long.MAX_VALUE) {
                        this.O.a(1);
                    }
                    final int b2 = this.b0 + 1;
                    if (b2 == this.a0) {
                        this.b0 = 0;
                        this.S(b2);
                    }
                    else {
                        this.b0 = b2;
                    }
                    synchronized (this) {
                        if (!this.U) {
                            this.T = false;
                            return;
                        }
                        this.U = false;
                        // monitorexit(this)
                        this.D();
                        return;
                    }
                }
                finally {
                    b3 = false;
                }
            }
            if (!b3) {
                synchronized (this) {
                    this.T = false;
                }
            }
        }
        
        protected void G(final c<T> c, final T t, final long n) {
            boolean b2 = false;
            Label_0042: {
                final Throwable t3;
                try {
                    this.L.m((Object)t);
                    break Label_0042;
                }
                finally {
                    final e e = this;
                    final boolean b = e.M;
                    if (b) {
                        break Label_0042;
                    }
                    final Throwable t2 = t3;
                    c.e(t2);
                    try {
                        final c<T> c2 = c;
                        c2.i();
                        final c<T> c3 = c;
                        final Throwable t4 = t3;
                        c3.b(t4);
                        return;
                    }
                    finally {}
                }
                try {
                    final e e = this;
                    final boolean b = e.M;
                    if (!b) {
                        final Throwable t2 = t3;
                        c.e(t2);
                        final c<T> c2 = c;
                        c2.i();
                        final c<T> c3 = c;
                        final Throwable t4 = t3;
                        c3.b(t4);
                        return;
                    }
                    this.J().offer(t3);
                    if (n != Long.MAX_VALUE) {
                        this.O.a(1);
                    }
                    c.w(1L);
                    synchronized (this) {
                        if (!this.U) {
                            this.T = false;
                            return;
                        }
                        this.U = false;
                        // monitorexit(this)
                        this.D();
                        return;
                    }
                }
                finally {
                    b2 = false;
                }
            }
            if (!b2) {
                synchronized (this) {
                    this.T = false;
                }
            }
        }
        
        rx.subscriptions.b H() {
            final rx.subscriptions.b q;
            if ((q = this.Q) == null) {
                boolean b = false;
                synchronized (this) {
                    rx.subscriptions.b q2;
                    if ((q2 = this.Q) == null) {
                        q2 = new rx.subscriptions.b();
                        this.Q = q2;
                        b = true;
                    }
                    // monitorexit(this)
                    if (b) {
                        this.r(q2);
                    }
                }
            }
            return q;
        }
        
        Queue<Throwable> J() {
            final ConcurrentLinkedQueue<Throwable> r;
            if ((r = this.R) == null) {
                synchronized (this) {
                    if (this.R == null) {
                        this.R = new ConcurrentLinkedQueue<Throwable>();
                    }
                }
            }
            return r;
        }
        
        public void K(final g<? extends T> g) {
            if (g == null) {
                return;
            }
            if (g == g.a2()) {
                this.C();
            }
            else if (g instanceof rx.internal.util.o) {
                this.W(((rx.internal.util.o<T>)g).G7());
            }
            else {
                final long x = this.X;
                this.X = 1L + x;
                final c c = new c<Object>((e<Object>)this, x);
                this.w((c<T>)c);
                g.R6((n<? super Object>)c);
                this.A();
            }
        }
        
        protected void L(final T t) {
            Queue<Object> p;
            if ((p = this.P) == null) {
                final int n = this.N;
                if (n == Integer.MAX_VALUE) {
                    p = new rx.internal.util.atomic.i<Object>(m.J);
                }
                else if (rx.internal.util.unsafe.p.a(n)) {
                    if (n0.f()) {
                        p = new rx.internal.util.unsafe.z<Object>(n);
                    }
                    else {
                        p = new rx.internal.util.atomic.e<Object>(n);
                    }
                }
                else {
                    p = new f<Object>(n);
                }
                this.P = p;
            }
            if (!p.offer(x.j(t))) {
                this.i();
                this.b(rx.exceptions.h.a(new rx.exceptions.d(), t));
            }
        }
        
        protected void M(final c<T> c, final T ex) {
            m o;
            if ((o = c.O) == null) {
                o = m.j();
                c.r(o);
                c.O = o;
            }
            try {
                o.q(x.j(ex));
                return;
            }
            catch (IllegalStateException ex) {
                if (c.g()) {
                    return;
                }
            }
            catch (rx.exceptions.d d) {}
            c.i();
            c.b(ex);
        }
        
        void N(final c<T> c) {
            final m o = c.O;
            if (o != null) {
                o.t();
            }
            this.Q.e(c);
            synchronized (this.V) {
                final c<?>[] w = this.W;
                final int length = w.length;
                final int n = -1;
                int n2 = 0;
                int n3;
                while (true) {
                    n3 = n;
                    if (n2 >= length) {
                        break;
                    }
                    if (c.equals(w[n2])) {
                        n3 = n2;
                        break;
                    }
                    ++n2;
                }
                if (n3 < 0) {
                    return;
                }
                if (length == 1) {
                    this.W = e.c0;
                    return;
                }
                final c[] w2 = new c[length - 1];
                System.arraycopy(w, 0, w2, 0, n3);
                System.arraycopy(w, n3 + 1, w2, n3, length - n3 - 1);
                this.W = (c<?>[])w2;
            }
        }
        
        public void S(final long n) {
            this.v(n);
        }
        
        void W(final T t) {
            final long value = this.O.get();
            int n = 0;
            final boolean b = false;
            long value2 = value;
            if (value != 0L) {
                synchronized (this) {
                    value2 = this.O.get();
                    n = (b ? 1 : 0);
                    if (!this.T) {
                        n = (b ? 1 : 0);
                        if (value2 != 0L) {
                            this.T = true;
                            n = 1;
                        }
                    }
                }
            }
            if (n != 0) {
                final Queue<Object> p = this.P;
                if (p != null && !p.isEmpty()) {
                    this.L(t);
                    this.D();
                }
                else {
                    this.F(t, value2);
                }
            }
            else {
                this.L(t);
                this.A();
            }
        }
        
        void X(final c<T> c, final T t) {
            final long value = this.O.get();
            int n = 0;
            final boolean b = false;
            long value2 = value;
            if (value != 0L) {
                synchronized (this) {
                    value2 = this.O.get();
                    n = (b ? 1 : 0);
                    if (!this.T) {
                        n = (b ? 1 : 0);
                        if (value2 != 0L) {
                            this.T = true;
                            n = 1;
                        }
                    }
                }
            }
            if (n != 0) {
                final m o = c.O;
                if (o != null && !o.m()) {
                    this.M(c, t);
                    this.D();
                }
                else {
                    this.G(c, t, value2);
                }
            }
            else {
                this.M(c, t);
                this.A();
            }
        }
        
        @Override
        public void b(final Throwable t) {
            this.J().offer(t);
            this.S = true;
            this.A();
        }
        
        @Override
        public void c() {
            this.S = true;
            this.A();
        }
        
        void w(final c<T> c) {
            this.H().a(c);
            synchronized (this.V) {
                final c<?>[] w = this.W;
                final int length = w.length;
                final c[] w2 = new c[length + 1];
                System.arraycopy(w, 0, w2, 0, length);
                w2[length] = c;
                this.W = (c<?>[])w2;
            }
        }
        
        boolean x() {
            if (this.L.g()) {
                return true;
            }
            final ConcurrentLinkedQueue<Throwable> r = this.R;
            if (!this.M && r != null && !r.isEmpty()) {
                try {
                    this.R();
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
