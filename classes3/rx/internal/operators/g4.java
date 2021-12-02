// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;
import rx.subjects.i;
import rx.functions.a;
import java.util.List;
import rx.observers.f;
import rx.h;
import rx.o;
import rx.n;
import rx.j;
import java.util.concurrent.TimeUnit;
import rx.g;

public final class g4<T> implements g.b<g<T>, T>
{
    static final Object L;
    final long G;
    final long H;
    final TimeUnit I;
    final j J;
    final int K;
    
    static {
        L = new Object();
    }
    
    public g4(final long g, final long h, final TimeUnit i, final int k, final j j) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.K = k;
        this.J = j;
    }
    
    public n<? super T> a(final n<? super g<T>> n) {
        final j.a a = this.J.a();
        if (this.G == this.H) {
            final b b = new b(n, a);
            b.r(a);
            b.G();
            return b;
        }
        final c c = new c(n, a);
        c.r(a);
        c.A();
        c.x();
        return c;
    }
    
    static final class a<T>
    {
        final h<T> a;
        final g<T> b;
        int c;
        
        public a(final h<T> h, final g<T> b) {
            this.a = new f<T>(h);
            this.b = b;
        }
    }
    
    final class b extends n<T>
    {
        final n<? super g<T>> L;
        final j.a M;
        final Object N;
        List<Object> O;
        boolean P;
        volatile d<T> Q;
        
        public b(final n<? super g<T>> n, final j.a m) {
            this.L = new rx.observers.g<Object>(n);
            this.M = m;
            this.N = new Object();
            this.Q = d.c();
            n.r(rx.subscriptions.f.a(new rx.functions.a() {
                @Override
                public void call() {
                    if (b.this.Q.a == null) {
                        b.this.i();
                    }
                }
            }));
        }
        
        boolean A(final T t) {
            d<T> d;
            if ((d = this.Q).a == null) {
                if (!this.F()) {
                    return false;
                }
                d = this.Q;
            }
            d.a.m(t);
            d<T> q;
            if (d.c == g4.this.K - 1) {
                d.a.c();
                q = d.a();
            }
            else {
                q = d.d();
            }
            this.Q = q;
            return true;
        }
        
        void C(final Throwable t) {
            final h<T> a = this.Q.a;
            this.Q = this.Q.a();
            if (a != null) {
                a.b(t);
            }
            this.L.b(t);
            this.i();
        }
        
        void D() {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     4: astore_1       
            //     5: aload_1        
            //     6: monitorenter   
            //     7: aload_0        
            //     8: getfield        rx/internal/operators/g4$b.P:Z
            //    11: ifeq            50
            //    14: aload_0        
            //    15: getfield        rx/internal/operators/g4$b.O:Ljava/util/List;
            //    18: ifnonnull       34
            //    21: new             Ljava/util/ArrayList;
            //    24: astore_2       
            //    25: aload_2        
            //    26: invokespecial   java/util/ArrayList.<init>:()V
            //    29: aload_0        
            //    30: aload_2        
            //    31: putfield        rx/internal/operators/g4$b.O:Ljava/util/List;
            //    34: aload_0        
            //    35: getfield        rx/internal/operators/g4$b.O:Ljava/util/List;
            //    38: getstatic       rx/internal/operators/g4.L:Ljava/lang/Object;
            //    41: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
            //    46: pop            
            //    47: aload_1        
            //    48: monitorexit    
            //    49: return         
            //    50: iconst_1       
            //    51: istore_3       
            //    52: aload_0        
            //    53: iconst_1       
            //    54: putfield        rx/internal/operators/g4$b.P:Z
            //    57: aload_1        
            //    58: monitorexit    
            //    59: aload_0        
            //    60: invokevirtual   rx/internal/operators/g4$b.F:()Z
            //    63: istore          4
            //    65: iload           4
            //    67: ifne            90
            //    70: aload_0        
            //    71: getfield        rx/internal/operators/g4$b.N:Ljava/lang/Object;
            //    74: astore_2       
            //    75: aload_2        
            //    76: monitorenter   
            //    77: aload_0        
            //    78: iconst_0       
            //    79: putfield        rx/internal/operators/g4$b.P:Z
            //    82: aload_2        
            //    83: monitorexit    
            //    84: return         
            //    85: astore_1       
            //    86: aload_2        
            //    87: monitorexit    
            //    88: aload_1        
            //    89: athrow         
            //    90: aload_0        
            //    91: getfield        rx/internal/operators/g4$b.N:Ljava/lang/Object;
            //    94: astore_2       
            //    95: aload_2        
            //    96: monitorenter   
            //    97: aload_0        
            //    98: getfield        rx/internal/operators/g4$b.O:Ljava/util/List;
            //   101: astore_1       
            //   102: aload_1        
            //   103: ifnonnull       114
            //   106: aload_0        
            //   107: iconst_0       
            //   108: putfield        rx/internal/operators/g4$b.P:Z
            //   111: aload_2        
            //   112: monitorexit    
            //   113: return         
            //   114: aload_0        
            //   115: aconst_null    
            //   116: putfield        rx/internal/operators/g4$b.O:Ljava/util/List;
            //   119: aload_2        
            //   120: monitorexit    
            //   121: aload_0        
            //   122: aload_1        
            //   123: invokevirtual   rx/internal/operators/g4$b.x:(Ljava/util/List;)Z
            //   126: istore          4
            //   128: iload           4
            //   130: ifne            90
            //   133: aload_0        
            //   134: getfield        rx/internal/operators/g4$b.N:Ljava/lang/Object;
            //   137: astore_2       
            //   138: aload_2        
            //   139: monitorenter   
            //   140: aload_0        
            //   141: iconst_0       
            //   142: putfield        rx/internal/operators/g4$b.P:Z
            //   145: aload_2        
            //   146: monitorexit    
            //   147: return         
            //   148: astore_1       
            //   149: aload_2        
            //   150: monitorexit    
            //   151: aload_1        
            //   152: athrow         
            //   153: astore_1       
            //   154: iconst_0       
            //   155: istore          5
            //   157: iload           5
            //   159: istore_3       
            //   160: aload_2        
            //   161: monitorexit    
            //   162: aload_1        
            //   163: athrow         
            //   164: astore_1       
            //   165: goto            179
            //   168: astore_1       
            //   169: iload_3        
            //   170: istore          5
            //   172: goto            157
            //   175: astore_1       
            //   176: iconst_0       
            //   177: istore          5
            //   179: iload           5
            //   181: ifne            206
            //   184: aload_0        
            //   185: getfield        rx/internal/operators/g4$b.N:Ljava/lang/Object;
            //   188: astore_2       
            //   189: aload_2        
            //   190: monitorenter   
            //   191: aload_0        
            //   192: iconst_0       
            //   193: putfield        rx/internal/operators/g4$b.P:Z
            //   196: aload_2        
            //   197: monitorexit    
            //   198: goto            206
            //   201: astore_1       
            //   202: aload_2        
            //   203: monitorexit    
            //   204: aload_1        
            //   205: athrow         
            //   206: aload_1        
            //   207: athrow         
            //   208: astore_2       
            //   209: aload_1        
            //   210: monitorexit    
            //   211: aload_2        
            //   212: athrow         
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type
            //  -----  -----  -----  -----  ----
            //  7      34     208    213    Any
            //  34     49     208    213    Any
            //  52     59     208    213    Any
            //  59     65     175    179    Any
            //  77     84     85     90     Any
            //  86     88     85     90     Any
            //  90     97     175    179    Any
            //  97     102    153    157    Any
            //  106    111    153    157    Any
            //  111    113    168    175    Any
            //  114    121    153    157    Any
            //  121    128    175    179    Any
            //  140    147    148    153    Any
            //  149    151    148    153    Any
            //  160    162    168    175    Any
            //  162    164    164    168    Any
            //  191    198    201    206    Any
            //  202    204    201    206    Any
            //  209    211    208    213    Any
            // 
            // The error that occurred was:
            // 
            // java.lang.IllegalStateException: Expression is linked from several locations: Label_0114:
            //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
            //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
            //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
            //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
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
        
        boolean F() {
            final h<T> a = this.Q.a;
            if (a != null) {
                a.c();
            }
            if (this.L.g()) {
                this.Q = this.Q.a();
                this.i();
                return false;
            }
            final i<Object> g7 = i.G7();
            this.Q = this.Q.b((h<T>)g7, (g<T>)g7);
            this.L.m((g<T>)g7);
            return true;
        }
        
        void G() {
            final j.a m = this.M;
            final rx.functions.a a = new rx.functions.a() {
                @Override
                public void call() {
                    b.this.D();
                }
            };
            final g4 r = g4.this;
            m.e(a, 0L, r.G, r.I);
        }
        
        @Override
        public void b(final Throwable t) {
            synchronized (this.N) {
                if (this.P) {
                    this.O = Collections.singletonList(x.c(t));
                    return;
                }
                this.O = null;
                this.P = true;
                // monitorexit(this.N)
                this.C(t);
            }
        }
        
        @Override
        public void c() {
            final Object n = this.N;
            synchronized (n) {
                if (this.P) {
                    if (this.O == null) {
                        this.O = new ArrayList<Object>();
                    }
                    this.O.add(x.b());
                    return;
                }
                final List<Object> o = this.O;
                this.O = null;
                this.P = true;
                // monitorexit(n)
                try {
                    this.x(o);
                    this.w();
                }
                finally {
                    this.C((Throwable)n);
                }
            }
        }
        
        @Override
        public void f() {
            this.v(Long.MAX_VALUE);
        }
        
        @Override
        public void m(final T p0) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: getfield        rx/internal/operators/g4$b.N:Ljava/lang/Object;
            //     4: astore_2       
            //     5: aload_2        
            //     6: monitorenter   
            //     7: aload_0        
            //     8: getfield        rx/internal/operators/g4$b.P:Z
            //    11: ifeq            48
            //    14: aload_0        
            //    15: getfield        rx/internal/operators/g4$b.O:Ljava/util/List;
            //    18: ifnonnull       34
            //    21: new             Ljava/util/ArrayList;
            //    24: astore_3       
            //    25: aload_3        
            //    26: invokespecial   java/util/ArrayList.<init>:()V
            //    29: aload_0        
            //    30: aload_3        
            //    31: putfield        rx/internal/operators/g4$b.O:Ljava/util/List;
            //    34: aload_0        
            //    35: getfield        rx/internal/operators/g4$b.O:Ljava/util/List;
            //    38: aload_1        
            //    39: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
            //    44: pop            
            //    45: aload_2        
            //    46: monitorexit    
            //    47: return         
            //    48: iconst_1       
            //    49: istore          4
            //    51: aload_0        
            //    52: iconst_1       
            //    53: putfield        rx/internal/operators/g4$b.P:Z
            //    56: aload_2        
            //    57: monitorexit    
            //    58: aload_0        
            //    59: aload_1        
            //    60: invokevirtual   rx/internal/operators/g4$b.A:(Ljava/lang/Object;)Z
            //    63: istore          5
            //    65: iload           5
            //    67: ifne            90
            //    70: aload_0        
            //    71: getfield        rx/internal/operators/g4$b.N:Ljava/lang/Object;
            //    74: astore_2       
            //    75: aload_2        
            //    76: monitorenter   
            //    77: aload_0        
            //    78: iconst_0       
            //    79: putfield        rx/internal/operators/g4$b.P:Z
            //    82: aload_2        
            //    83: monitorexit    
            //    84: return         
            //    85: astore_1       
            //    86: aload_2        
            //    87: monitorexit    
            //    88: aload_1        
            //    89: athrow         
            //    90: aload_0        
            //    91: getfield        rx/internal/operators/g4$b.N:Ljava/lang/Object;
            //    94: astore_2       
            //    95: aload_2        
            //    96: monitorenter   
            //    97: aload_0        
            //    98: getfield        rx/internal/operators/g4$b.O:Ljava/util/List;
            //   101: astore_1       
            //   102: aload_1        
            //   103: ifnonnull       114
            //   106: aload_0        
            //   107: iconst_0       
            //   108: putfield        rx/internal/operators/g4$b.P:Z
            //   111: aload_2        
            //   112: monitorexit    
            //   113: return         
            //   114: aload_0        
            //   115: aconst_null    
            //   116: putfield        rx/internal/operators/g4$b.O:Ljava/util/List;
            //   119: aload_2        
            //   120: monitorexit    
            //   121: aload_0        
            //   122: aload_1        
            //   123: invokevirtual   rx/internal/operators/g4$b.x:(Ljava/util/List;)Z
            //   126: istore          5
            //   128: iload           5
            //   130: ifne            90
            //   133: aload_0        
            //   134: getfield        rx/internal/operators/g4$b.N:Ljava/lang/Object;
            //   137: astore_1       
            //   138: aload_1        
            //   139: monitorenter   
            //   140: aload_0        
            //   141: iconst_0       
            //   142: putfield        rx/internal/operators/g4$b.P:Z
            //   145: aload_1        
            //   146: monitorexit    
            //   147: return         
            //   148: astore_2       
            //   149: aload_1        
            //   150: monitorexit    
            //   151: aload_2        
            //   152: athrow         
            //   153: astore_1       
            //   154: iconst_0       
            //   155: istore          6
            //   157: iload           6
            //   159: istore          4
            //   161: aload_2        
            //   162: monitorexit    
            //   163: aload_1        
            //   164: athrow         
            //   165: astore_1       
            //   166: goto            181
            //   169: astore_1       
            //   170: iload           4
            //   172: istore          6
            //   174: goto            157
            //   177: astore_1       
            //   178: iconst_0       
            //   179: istore          6
            //   181: iload           6
            //   183: ifne            208
            //   186: aload_0        
            //   187: getfield        rx/internal/operators/g4$b.N:Ljava/lang/Object;
            //   190: astore_2       
            //   191: aload_2        
            //   192: monitorenter   
            //   193: aload_0        
            //   194: iconst_0       
            //   195: putfield        rx/internal/operators/g4$b.P:Z
            //   198: aload_2        
            //   199: monitorexit    
            //   200: goto            208
            //   203: astore_1       
            //   204: aload_2        
            //   205: monitorexit    
            //   206: aload_1        
            //   207: athrow         
            //   208: aload_1        
            //   209: athrow         
            //   210: astore_1       
            //   211: aload_2        
            //   212: monitorexit    
            //   213: aload_1        
            //   214: athrow         
            //    Signature:
            //  (TT;)V
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type
            //  -----  -----  -----  -----  ----
            //  7      34     210    215    Any
            //  34     47     210    215    Any
            //  51     58     210    215    Any
            //  58     65     177    181    Any
            //  77     84     85     90     Any
            //  86     88     85     90     Any
            //  90     97     177    181    Any
            //  97     102    153    157    Any
            //  106    111    153    157    Any
            //  111    113    169    177    Any
            //  114    121    153    157    Any
            //  121    128    177    181    Any
            //  140    147    148    153    Any
            //  149    151    148    153    Any
            //  161    163    169    177    Any
            //  163    165    165    169    Any
            //  193    200    203    208    Any
            //  204    206    203    208    Any
            //  211    213    210    215    Any
            // 
            // The error that occurred was:
            // 
            // java.lang.IllegalStateException: Expression is linked from several locations: Label_0114:
            //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
            //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
            //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
            //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
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
        
        void w() {
            final h<T> a = this.Q.a;
            this.Q = this.Q.a();
            if (a != null) {
                a.c();
            }
            this.L.c();
            this.i();
        }
        
        boolean x(final List<Object> list) {
            if (list == null) {
                return true;
            }
            for (final T next : list) {
                if (next == g4.L) {
                    if (!this.F()) {
                        return false;
                    }
                    continue;
                }
                else {
                    if (x.g(next)) {
                        this.C(x.d(next));
                        break;
                    }
                    if (x.f(next)) {
                        this.w();
                        break;
                    }
                    if (!this.A(next)) {
                        return false;
                    }
                    continue;
                }
            }
            return true;
        }
    }
    
    final class c extends n<T>
    {
        final n<? super g<T>> L;
        final j.a M;
        final Object N;
        final List<a<T>> O;
        boolean P;
        
        public c(final n<? super g<T>> l, final j.a m) {
            super(l);
            this.L = l;
            this.M = m;
            this.N = new Object();
            this.O = new LinkedList<a<T>>();
        }
        
        void A() {
            final a<T> w = this.w();
            final Object n = this.N;
            synchronized (n) {
                if (this.P) {
                    return;
                }
                this.O.add(w);
                // monitorexit(n)
                try {
                    this.L.m(w.b);
                    final j.a m = this.M;
                    final rx.functions.a a = new rx.functions.a() {
                        @Override
                        public void call() {
                            c.this.C(w);
                        }
                    };
                    final g4 q = g4.this;
                    m.d(a, q.G, q.I);
                }
                finally {
                    this.b((Throwable)n);
                }
            }
        }
        
        void C(final a<T> a) {
            synchronized (this.N) {
                if (this.P) {
                    return;
                }
                final Iterator<a<T>> iterator = this.O.iterator();
                while (true) {
                    while (iterator.hasNext()) {
                        if (iterator.next() == a) {
                            final boolean b = true;
                            iterator.remove();
                            // monitorexit(this.N)
                            if (b) {
                                a.a.c();
                            }
                            return;
                        }
                    }
                    final boolean b = false;
                    continue;
                }
            }
        }
        
        @Override
        public void b(final Throwable t) {
            Object o = this.N;
            synchronized (o) {
                if (this.P) {
                    return;
                }
                this.P = true;
                final ArrayList<a> list = (ArrayList<a>)new ArrayList<Object>(this.O);
                this.O.clear();
                // monitorexit(o)
                o = list.iterator();
                while (((Iterator)o).hasNext()) {
                    ((a)((Iterator<a>)o).next()).a.b(t);
                }
                this.L.b(t);
            }
        }
        
        @Override
        public void c() {
            Object o = this.N;
            synchronized (o) {
                if (this.P) {
                    return;
                }
                this.P = true;
                final ArrayList<a> list = (ArrayList<a>)new ArrayList<Object>(this.O);
                this.O.clear();
                // monitorexit(o)
                o = list.iterator();
                while (((Iterator)o).hasNext()) {
                    ((a)((Iterator<a>)o).next()).a.c();
                }
                this.L.c();
            }
        }
        
        @Override
        public void f() {
            this.v(Long.MAX_VALUE);
        }
        
        @Override
        public void m(final T t) {
            Object n = this.N;
            synchronized (n) {
                if (this.P) {
                    return;
                }
                final ArrayList<a<?>> list = new ArrayList<a<?>>((Collection<? extends a<?>>)this.O);
                final Iterator<a<T>> iterator = this.O.iterator();
                while (iterator.hasNext()) {
                    final a a = (a)iterator.next();
                    if (++((a)a).c == g4.this.K) {
                        iterator.remove();
                    }
                }
                // monitorexit(n)
                final Iterator<Object> iterator2 = list.iterator();
                while (iterator2.hasNext()) {
                    n = iterator2.next();
                    ((a)n).a.m((T)t);
                    if (((a)n).c == g4.this.K) {
                        ((a)n).a.c();
                    }
                }
            }
        }
        
        a<T> w() {
            final i<Object> g7 = i.G7();
            return (a<T>)new a((h<Object>)g7, (g<Object>)g7);
        }
        
        void x() {
            final j.a m = this.M;
            final rx.functions.a a = new rx.functions.a() {
                @Override
                public void call() {
                    c.this.A();
                }
            };
            final g4 q = g4.this;
            final long h = q.H;
            m.e(a, h, h, q.I);
        }
    }
    
    static final class d<T>
    {
        static final d<Object> d;
        final h<T> a;
        final g<T> b;
        final int c;
        
        static {
            d = new d<Object>(null, null, 0);
        }
        
        public d(final h<T> a, final g<T> b, final int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        public static <T> d<T> c() {
            return (d<T>)g4.d.d;
        }
        
        public d<T> a() {
            return c();
        }
        
        public d<T> b(final h<T> h, final g<T> g) {
            return new d<T>(h, g, 0);
        }
        
        public d<T> d() {
            return new d<T>(this.a, this.b, this.c + 1);
        }
    }
}
