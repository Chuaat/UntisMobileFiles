// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import java.util.Objects;
import java.util.Iterator;
import java.util.ArrayList;
import rx.subscriptions.f;
import rx.functions.a;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import rx.internal.util.k;
import java.util.concurrent.atomic.AtomicLong;
import java.util.Collection;
import rx.h;
import rx.functions.b;
import rx.functions.p;
import rx.i;
import rx.n;
import rx.j;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import rx.g;
import rx.o;
import rx.observables.c;

public final class a3<T> extends c<T> implements rx.o
{
    static final rx.functions.o K;
    final g<? extends T> H;
    final AtomicReference<l<T>> I;
    final rx.functions.o<? extends k<T>> J;
    
    static {
        K = new rx.functions.o() {
            @Override
            public Object call() {
                return new a3.o(16);
            }
        };
    }
    
    private a3(final a<T> a, final g<? extends T> h, final AtomicReference<l<T>> i, final rx.functions.o<? extends k<T>> j) {
        super(a);
        this.H = h;
        this.I = i;
        this.J = j;
    }
    
    public static <T> c<T> K7(final g<? extends T> g) {
        return O7(g, (rx.functions.o<? extends k<T>>)a3.K);
    }
    
    public static <T> c<T> L7(final g<? extends T> g, final int n) {
        if (n == Integer.MAX_VALUE) {
            return K7(g);
        }
        return O7(g, (rx.functions.o<? extends k<T>>)new rx.functions.o<k<T>>() {
            public k<T> a() {
                return new n<T>(n);
            }
        });
    }
    
    public static <T> c<T> M7(final g<? extends T> g, final long n, final TimeUnit timeUnit, final rx.j j) {
        return N7(g, n, timeUnit, j, Integer.MAX_VALUE);
    }
    
    public static <T> c<T> N7(final g<? extends T> g, final long duration, final TimeUnit timeUnit, final rx.j j, final int n) {
        return O7(g, (rx.functions.o<? extends k<T>>)new rx.functions.o<k<T>>() {
            final /* synthetic */ long H = timeUnit.toMillis(duration);
            
            public k<T> a() {
                return new m<T>(n, this.H, j);
            }
        });
    }
    
    static <T> c<T> O7(final g<? extends T> g, final rx.functions.o<? extends k<T>> o) {
        final AtomicReference<l<T>> atomicReference = (AtomicReference<l<T>>)new AtomicReference<l<Object>>();
        return new a3<T>((a<Object>)new a<T>() {
            public void a(final rx.n<? super T> n) {
                rx.o newValue;
                l<?> expectedValue;
                do {
                    expectedValue = (l<?>)(newValue = atomicReference.get());
                    if (expectedValue != null) {
                        break;
                    }
                    newValue = new l<Object>(o.call());
                    ((l)newValue).A();
                } while (!atomicReference.compareAndSet(expectedValue, newValue));
                final i i = new i((l<Object>)newValue, (rx.n<? super Object>)n);
                ((l<?>)newValue).w((i<?>)i);
                n.r(i);
                ((l)newValue).L.l((i<T>)i);
                n.s0(i);
            }
        }, g, (AtomicReference<l<Object>>)atomicReference, (rx.functions.o<? extends k<Object>>)o);
    }
    
    public static <T, U, R> g<R> P7(final rx.functions.o<? extends c<U>> o, final p<? super g<U>, ? extends g<R>> p2) {
        return g.Q6((a<R>)new a<R>() {
            public void a(final rx.n<? super R> n) {
                try {
                    final c c = o.call();
                    ((g)p2.h(c)).z5(n);
                    c.I7(new b<rx.o>() {
                        public void a(final rx.o o) {
                            n.r(o);
                        }
                    });
                }
                finally {
                    final Throwable t;
                    rx.exceptions.c.f(t, n);
                }
            }
        });
    }
    
    public static <T> c<T> Q7(final c<T> c, final rx.j j) {
        return new c<T>(new a<T>() {
            final /* synthetic */ g G = c.Q3(j);
            
            public void a(final rx.n<? super T> n) {
                this.G.R6(new rx.n<T>(n) {
                    @Override
                    public void b(final Throwable t) {
                        n.b(t);
                    }
                    
                    @Override
                    public void c() {
                        n.c();
                    }
                    
                    @Override
                    public void m(final T t) {
                        n.m(t);
                    }
                });
            }
        }) {
            @Override
            public void I7(final rx.functions.b<? super rx.o> b) {
                c.I7(b);
            }
        };
    }
    
    @Override
    public void I7(final rx.functions.b<? super rx.o> b) {
        l<T> expectedValue;
        l<T> newValue;
        do {
            expectedValue = this.I.get();
            if (expectedValue != null) {
                newValue = expectedValue;
                if (!expectedValue.g()) {
                    break;
                }
            }
            newValue = new l<T>((k<T>)this.J.call());
            newValue.A();
        } while (!this.I.compareAndSet(expectedValue, newValue));
        final boolean value = newValue.S.get();
        boolean b2 = true;
        if (value || !newValue.S.compareAndSet(false, true)) {
            b2 = false;
        }
        b.h(newValue);
        if (b2) {
            this.H.R6(newValue);
        }
    }
    
    @Override
    public boolean g() {
        final l<T> l = this.I.get();
        return l == null || l.g();
    }
    
    @Override
    public void i() {
        this.I.lazySet(null);
    }
    
    static class h<T> extends AtomicReference<j> implements k<T>
    {
        private static final long J = 2346567790059478686L;
        j G;
        int H;
        long I;
        
        public h() {
            this.set(this.G = new j(null, 0L));
        }
        
        final void a(final j j) {
            this.G.set(j);
            this.G = j;
            ++this.H;
        }
        
        @Override
        public final void b() {
            final Object d = this.d(x.b());
            final long i = this.I + 1L;
            this.I = i;
            this.a(new j(d, i));
            this.p();
        }
        
        final void c(final Collection<? super T> collection) {
            j e = this.e();
            while (true) {
                e = (j)e.get();
                if (e == null) {
                    break;
                }
                final Object j = this.j(e.G);
                if (x.f(j)) {
                    break;
                }
                if (x.g(j)) {
                    break;
                }
                collection.add((Object)x.e(j));
            }
        }
        
        Object d(final Object o) {
            return o;
        }
        
        j e() {
            return this.get();
        }
        
        @Override
        public final void f(final T t) {
            final Object d = this.d(x.j(t));
            final long i = this.I + 1L;
            this.I = i;
            this.a(new j(d, i));
            this.o();
        }
        
        boolean g() {
            final Object g = this.G.G;
            return g != null && x.f(this.j(g));
        }
        
        boolean h() {
            final Object g = this.G.G;
            return g != null && x.g(this.j(g));
        }
        
        @Override
        public final void i(final Throwable t) {
            final Object d = this.d(x.c(t));
            final long i = this.I + 1L;
            this.I = i;
            this.a(new j(d, i));
            this.p();
        }
        
        Object j(final Object o) {
            return o;
        }
        
        final void k() {
            final j j = this.get().get();
            if (j != null) {
                --this.H;
                this.n(j);
                return;
            }
            throw new IllegalStateException("Empty list!");
        }
        
        @Override
        public final void l(final i<T> i) {
            synchronized (i) {
                if (i.K) {
                    i.L = true;
                    return;
                }
                i.K = true;
                // monitorexit(i)
                while (!i.g()) {
                    Object o;
                    if ((o = i.b()) == null) {
                        o = this.e();
                        i.I = o;
                        i.a(((j)o).H);
                    }
                    if (i.g()) {
                        return;
                    }
                    final rx.n<? super T> h = (rx.n<? super T>)i.H;
                    if (h == null) {
                        return;
                    }
                    final long value = i.get();
                    long n = 0L;
                    while (n != value) {
                        final j j = ((AtomicReference<j>)o).get();
                        if (j != null) {
                            o = this.j(j.G);
                            try {
                                if (x.a((rx.h<? super Object>)h, o)) {
                                    i.I = null;
                                    return;
                                }
                                ++n;
                                if (i.g()) {
                                    return;
                                }
                                o = j;
                                continue;
                            }
                            finally {
                                i.I = null;
                                final Throwable t;
                                rx.exceptions.c.e(t);
                                i.i();
                                if (!x.g(o) && !x.f(o)) {
                                    h.b(rx.exceptions.h.a(t, x.e(o)));
                                }
                                return;
                            }
                            break;
                        }
                        break;
                    }
                    if (n != 0L) {
                        i.I = o;
                        if (value != Long.MAX_VALUE) {
                            i.c(n);
                        }
                    }
                    synchronized (i) {
                        if (!i.L) {
                            i.K = false;
                            return;
                        }
                        i.L = false;
                        continue;
                    }
                }
            }
        }
        
        final void m(int i) {
            j j = this.get();
            while (i > 0) {
                j = (j)j.get();
                --i;
                --this.H;
            }
            this.n(j);
        }
        
        final void n(final j newValue) {
            this.set(newValue);
        }
        
        void o() {
        }
        
        void p() {
        }
    }
    
    static final class i<T> extends AtomicLong implements rx.i, o
    {
        private static final long M = -4453897557930727610L;
        static final long N = Long.MIN_VALUE;
        final l<T> G;
        rx.n<? super T> H;
        Object I;
        final AtomicLong J;
        boolean K;
        boolean L;
        
        public i(final l<T> g, final rx.n<? super T> h) {
            this.G = g;
            this.H = h;
            this.J = new AtomicLong();
        }
        
        void a(final long n) {
            long value;
            long newValue;
            do {
                value = this.J.get();
                if ((newValue = value + n) < 0L) {
                    newValue = Long.MAX_VALUE;
                }
            } while (!this.J.compareAndSet(value, newValue));
        }
        
         <U> U b() {
            return (U)this.I;
        }
        
        public long c(final long lng) {
            if (lng > 0L) {
                long value;
                long newValue;
                do {
                    value = this.get();
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
                this.G.F(this);
                this.G.D(this);
                this.H = null;
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
                if ((newValue = value + n) >= 0L) {
                    continue;
                }
                newValue = Long.MAX_VALUE;
            } while (!this.compareAndSet(value, newValue));
            this.a(n);
            this.G.D(this);
            this.G.L.l(this);
        }
    }
    
    static final class j extends AtomicReference<j>
    {
        private static final long I = 245354315435971818L;
        final Object G;
        final long H;
        
        public j(final Object g, final long h) {
            this.G = g;
            this.H = h;
        }
    }
    
    interface k<T>
    {
        void b();
        
        void f(final T p0);
        
        void i(final Throwable p0);
        
        void l(final i<T> p0);
    }
    
    static final class l<T> extends n<T> implements o
    {
        static final i[] a0;
        static final i[] b0;
        final k<T> L;
        boolean M;
        volatile boolean N;
        final rx.internal.util.k<i<T>> O;
        i<T>[] P;
        volatile long Q;
        long R;
        final AtomicBoolean S;
        boolean T;
        boolean U;
        long V;
        long W;
        volatile rx.i X;
        List<i<T>> Y;
        boolean Z;
        
        static {
            a0 = new i[0];
            b0 = new i[0];
        }
        
        public l(final k<T> l) {
            this.L = l;
            this.O = new rx.internal.util.k<i<T>>();
            this.P = (i<T>[])l.a0;
            this.S = new AtomicBoolean();
            this.v(0L);
        }
        
        void A() {
            this.r(f.a(new rx.functions.a() {
                @Override
                public void call() {
                    if (!l.this.N) {
                        synchronized (l.this.O) {
                            if (!l.this.N) {
                                l.this.O.h();
                                final l g = l.this;
                                ++g.Q;
                                l.this.N = true;
                            }
                        }
                    }
                }
            }));
        }
        
        void C(long n, long n2) {
            final long w = this.W;
            final rx.i x = this.X;
            n2 = n - n2;
            if (n2 != 0L) {
                this.V = n;
                if (x == null) {
                    n2 = (n = w + n2);
                    if (n2 < 0L) {
                        n = Long.MAX_VALUE;
                    }
                    this.W = n;
                    return;
                }
                if (w == 0L) {
                    x.v(n2);
                    return;
                }
                this.W = 0L;
                n = w + n2;
            }
            else {
                if (w == 0L || x == null) {
                    return;
                }
                this.W = 0L;
                n = w;
            }
            x.v(n);
        }
        
        void D(final i<T> i) {
            if (this.g()) {
                return;
            }
            synchronized (this) {
                if (this.T) {
                    if (i != null) {
                        List<i<T>> y;
                        if ((y = this.Y) == null) {
                            y = new ArrayList<i<T>>();
                            this.Y = y;
                        }
                        y.add(i);
                    }
                    else {
                        this.Z = true;
                    }
                    this.U = true;
                    return;
                }
                this.T = true;
                // monitorexit(this)
                final long v = this.V;
                long max;
                if (i != null) {
                    max = Math.max(v, i.J.get());
                }
                else {
                    final i<T>[] x = this.x();
                    final int length = x.length;
                    max = v;
                    long max2;
                    for (int j = 0; j < length; ++j, max = max2) {
                        final i<T> k = x[j];
                        max2 = max;
                        if (k != null) {
                            max2 = Math.max(max, k.J.get());
                        }
                    }
                }
                this.C(max, v);
                while (!this.g()) {
                    synchronized (this) {
                        if (!this.U) {
                            this.T = false;
                            return;
                        }
                        this.U = false;
                        final List<i<T>> y2 = this.Y;
                        this.Y = null;
                        final boolean z = this.Z;
                        this.Z = false;
                        // monitorexit(this)
                        final long v2 = this.V;
                        long a;
                        if (y2 != null) {
                            final Iterator<i<T>> iterator = y2.iterator();
                            long max3 = v2;
                            while (true) {
                                a = max3;
                                if (!iterator.hasNext()) {
                                    break;
                                }
                                max3 = Math.max(max3, ((i)(i)iterator.next()).J.get());
                            }
                        }
                        else {
                            a = v2;
                        }
                        long n = a;
                        if (z) {
                            final i<T>[] x2 = this.x();
                            final int length2 = x2.length;
                            int n2 = 0;
                            while (true) {
                                n = a;
                                if (n2 >= length2) {
                                    break;
                                }
                                final i<T> l = x2[n2];
                                long max4 = a;
                                if (l != null) {
                                    max4 = Math.max(a, l.J.get());
                                }
                                ++n2;
                                a = max4;
                            }
                        }
                        this.C(n, v2);
                        continue;
                    }
                }
            }
        }
        
        void F(final i<T> i) {
            if (this.N) {
                return;
            }
            synchronized (this.O) {
                if (this.N) {
                    return;
                }
                this.O.f(i);
                if (this.O.c()) {
                    this.P = (i<T>[])l.a0;
                }
                ++this.Q;
            }
        }
        
        void G() {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     4: astore_1       
            //     5: aload_0        
            //     6: getfield        rx/internal/operators/a3$l.R:J
            //     9: lstore_2       
            //    10: aload_0        
            //    11: getfield        rx/internal/operators/a3$l.Q:J
            //    14: lstore          4
            //    16: iconst_0       
            //    17: istore          6
            //    19: lload_2        
            //    20: lload           4
            //    22: lcmp           
            //    23: ifeq            107
            //    26: aload_0        
            //    27: getfield        rx/internal/operators/a3$l.O:Lrx/internal/util/k;
            //    30: astore          7
            //    32: aload           7
            //    34: monitorenter   
            //    35: aload_0        
            //    36: getfield        rx/internal/operators/a3$l.P:[Lrx/internal/operators/a3$i;
            //    39: astore          8
            //    41: aload_0        
            //    42: getfield        rx/internal/operators/a3$l.O:Lrx/internal/util/k;
            //    45: invokevirtual   rx/internal/util/k.i:()[Ljava/lang/Object;
            //    48: astore          9
            //    50: aload           9
            //    52: arraylength    
            //    53: istore          10
            //    55: aload           8
            //    57: astore_1       
            //    58: aload           8
            //    60: arraylength    
            //    61: iload           10
            //    63: if_icmpeq       77
            //    66: iload           10
            //    68: anewarray       Lrx/internal/operators/a3$i;
            //    71: astore_1       
            //    72: aload_0        
            //    73: aload_1        
            //    74: putfield        rx/internal/operators/a3$l.P:[Lrx/internal/operators/a3$i;
            //    77: aload           9
            //    79: iconst_0       
            //    80: aload_1        
            //    81: iconst_0       
            //    82: iload           10
            //    84: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
            //    87: aload_0        
            //    88: aload_0        
            //    89: getfield        rx/internal/operators/a3$l.Q:J
            //    92: putfield        rx/internal/operators/a3$l.R:J
            //    95: aload           7
            //    97: monitorexit    
            //    98: goto            107
            //   101: astore_1       
            //   102: aload           7
            //   104: monitorexit    
            //   105: aload_1        
            //   106: athrow         
            //   107: aload_0        
            //   108: getfield        rx/internal/operators/a3$l.L:Lrx/internal/operators/a3$k;
            //   111: astore          7
            //   113: aload_1        
            //   114: arraylength    
            //   115: istore          10
            //   117: iload           6
            //   119: iload           10
            //   121: if_icmpge       150
            //   124: aload_1        
            //   125: iload           6
            //   127: aaload         
            //   128: astore          8
            //   130: aload           8
            //   132: ifnull          144
            //   135: aload           7
            //   137: aload           8
            //   139: invokeinterface rx/internal/operators/a3$k.l:(Lrx/internal/operators/a3$i;)V
            //   144: iinc            6, 1
            //   147: goto            117
            //   150: return         
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type
            //  -----  -----  -----  -----  ----
            //  35     55     101    107    Any
            //  58     77     101    107    Any
            //  77     98     101    107    Any
            //  102    105    101    107    Any
            // 
            // The error that occurred was:
            // 
            // java.lang.NullPointerException
            //     at com.strobel.assembler.ir.StackMappingVisitor.push(StackMappingVisitor.java:290)
            //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:833)
            //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.visit(StackMappingVisitor.java:398)
            //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2030)
            //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:576)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
            //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
            //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
            //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:126)
            // 
            throw new IllegalStateException("An error occurred while decompiling this method.");
        }
        
        @Override
        public void b(final Throwable t) {
            if (!this.M) {
                this.M = true;
                try {
                    this.L.i(t);
                    this.G();
                }
                finally {
                    this.i();
                }
            }
        }
        
        @Override
        public void c() {
            if (!this.M) {
                this.M = true;
                try {
                    this.L.b();
                    this.G();
                }
                finally {
                    this.i();
                }
            }
        }
        
        @Override
        public void m(final T t) {
            if (!this.M) {
                this.L.f(t);
                this.G();
            }
        }
        
        @Override
        public void s0(final rx.i x) {
            if (this.X == null) {
                this.X = x;
                this.D(null);
                this.G();
                return;
            }
            throw new IllegalStateException("Only a single producer can be set on a Subscriber.");
        }
        
        boolean w(final i<T> obj) {
            Objects.requireNonNull(obj);
            if (this.N) {
                return false;
            }
            synchronized (this.O) {
                if (this.N) {
                    return false;
                }
                this.O.a(obj);
                ++this.Q;
                return true;
            }
        }
        
        i<T>[] x() {
            synchronized (this.O) {
                final i<T>[] i = this.O.i();
                final int length = i.length;
                final i[] array = new i[length];
                System.arraycopy(i, 0, array, 0, length);
                return (i<T>[])array;
            }
        }
    }
    
    static final class m<T> extends h<T>
    {
        private static final long N = 3457957419649567404L;
        final rx.j K;
        final long L;
        final int M;
        
        public m(final int m, final long l, final rx.j k) {
            this.K = k;
            this.M = m;
            this.L = l;
        }
        
        @Override
        Object d(final Object o) {
            return new rx.schedulers.f(this.K.b(), o);
        }
        
        @Override
        j e() {
            final long b = this.K.b();
            final long l = this.L;
            j j = this.get();
            j i;
            Object g;
            do {
                i = j;
                j = (j)i.get();
                if (j == null) {
                    break;
                }
                g = j.G;
                final Object k = this.j(g);
                if (x.f(k)) {
                    break;
                }
                if (x.g(k)) {
                    break;
                }
            } while (((rx.schedulers.f)g).a() <= b - l);
            return i;
        }
        
        @Override
        Object j(final Object o) {
            return ((rx.schedulers.f)o).b();
        }
        
        @Override
        void o() {
            final long b = this.K.b();
            final long l = this.L;
            j j = this.get();
            j i = j.get();
            int n = 0;
            while (i != null) {
                final int h = super.H;
                if (h > this.M) {
                    ++n;
                    super.H = h - 1;
                }
                else {
                    if (((rx.schedulers.f)i.G).a() > b - l) {
                        break;
                    }
                    ++n;
                    --super.H;
                }
                final j k = i.get();
                j = i;
                i = k;
            }
            if (n != 0) {
                this.n(j);
            }
        }
        
        @Override
        void p() {
            final long b = this.K.b();
            final long l = this.L;
            j j = this.get();
            j i = j.get();
            int n = 0;
            while (i != null && super.H > 1 && ((rx.schedulers.f)i.G).a() <= b - l) {
                ++n;
                --super.H;
                final j k = i.get();
                j = i;
                i = k;
            }
            if (n != 0) {
                this.n(j);
            }
        }
    }
    
    static final class n<T> extends h<T>
    {
        private static final long L = -5898283885385201806L;
        final int K;
        
        public n(final int k) {
            this.K = k;
        }
        
        @Override
        void o() {
            if (super.H > this.K) {
                this.k();
            }
        }
    }
    
    static final class o<T> extends ArrayList<Object> implements k<T>
    {
        private static final long H = 7063189396499112664L;
        volatile int G;
        
        public o(final int initialCapacity) {
            super(initialCapacity);
        }
        
        @Override
        public void b() {
            this.add(x.b());
            ++this.G;
        }
        
        @Override
        public void f(final T t) {
            this.add(x.j(t));
            ++this.G;
        }
        
        @Override
        public void i(final Throwable t) {
            this.add(x.c(t));
            ++this.G;
        }
        
        @Override
        public void l(final i<T> i) {
            synchronized (i) {
                if (i.K) {
                    i.L = true;
                    return;
                }
                i.K = true;
                // monitorexit(i)
                while (!i.g()) {
                    final int g = this.G;
                    final Integer n = i.b();
                    int intValue;
                    if (n != null) {
                        intValue = n;
                    }
                    else {
                        intValue = 0;
                    }
                    final rx.n<? super T> h = (rx.n<? super T>)i.H;
                    if (h == null) {
                        return;
                    }
                    final long value = i.get();
                    long n2 = 0L;
                    while (n2 != value && intValue < g) {
                        final Object value2 = this.get(intValue);
                        try {
                            if (x.a((rx.h<? super Object>)h, value2)) {
                                return;
                            }
                            if (i.g()) {
                                return;
                            }
                            ++intValue;
                            ++n2;
                            continue;
                        }
                        finally {
                            final Throwable t;
                            rx.exceptions.c.e(t);
                            i.i();
                            if (!x.g(value2) && !x.f(value2)) {
                                h.b(rx.exceptions.h.a(t, x.e(value2)));
                            }
                            return;
                        }
                        break;
                    }
                    if (n2 != 0L) {
                        i.I = intValue;
                        if (value != Long.MAX_VALUE) {
                            i.c(n2);
                        }
                    }
                    synchronized (i) {
                        if (!i.L) {
                            i.K = false;
                            return;
                        }
                        i.L = false;
                        continue;
                    }
                }
            }
        }
    }
}
