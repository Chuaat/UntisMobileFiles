// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.subjects.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import rx.subscriptions.e;
import java.util.List;
import rx.h;
import rx.n;
import rx.functions.o;
import rx.g;

public final class d4<T, U> implements g.b<g<T>, T>
{
    static final Object H;
    final o<? extends g<? extends U>> G;
    
    static {
        H = new Object();
    }
    
    public d4(final o<? extends g<? extends U>> g) {
        this.G = g;
    }
    
    public n<? super T> a(final n<? super g<T>> n) {
        final b b = new b(n, this.G);
        n.r(b);
        b.G();
        return (n<? super T>)b;
    }
    
    static final class a<T, U> extends n<U>
    {
        final b<T, U> L;
        boolean M;
        
        public a(final b<T, U> l) {
            this.L = l;
        }
        
        @Override
        public void b(final Throwable t) {
            this.L.b(t);
        }
        
        @Override
        public void c() {
            if (!this.M) {
                this.M = true;
                this.L.c();
            }
        }
        
        @Override
        public void f() {
            this.v(Long.MAX_VALUE);
        }
        
        @Override
        public void m(final U u) {
            if (!this.M) {
                this.M = true;
                this.L.G();
            }
        }
    }
    
    static final class b<T, U> extends n<T>
    {
        final n<? super g<T>> L;
        final Object M;
        h<T> N;
        g<T> O;
        boolean P;
        List<Object> Q;
        final e R;
        final rx.functions.o<? extends g<? extends U>> S;
        
        public b(final n<? super g<T>> n, final rx.functions.o<? extends g<? extends U>> s) {
            this.L = new rx.observers.g<Object>(n);
            this.M = new Object();
            final e r = new e();
            this.R = r;
            this.S = s;
            this.r(r);
        }
        
        void A(final List<Object> list) {
            if (list == null) {
                return;
            }
            for (final T next : list) {
                if (next == d4.H) {
                    this.F();
                }
                else {
                    if (x.g(next)) {
                        this.D(x.d(next));
                        break;
                    }
                    if (x.f(next)) {
                        this.w();
                        break;
                    }
                    this.C(next);
                }
            }
        }
        
        void C(final T t) {
            final h<T> n = this.N;
            if (n != null) {
                n.m(t);
            }
        }
        
        void D(final Throwable t) {
            final h<T> n = this.N;
            this.N = null;
            this.O = null;
            if (n != null) {
                n.b(t);
            }
            this.L.b(t);
            this.i();
        }
        
        void F() {
            final h<T> n = this.N;
            if (n != null) {
                n.c();
            }
            this.x();
            this.L.m(this.O);
        }
        
        void G() {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     4: astore_1       
            //     5: aload_1        
            //     6: monitorenter   
            //     7: aload_0        
            //     8: getfield        rx/internal/operators/d4$b.P:Z
            //    11: ifeq            50
            //    14: aload_0        
            //    15: getfield        rx/internal/operators/d4$b.Q:Ljava/util/List;
            //    18: ifnonnull       34
            //    21: new             Ljava/util/ArrayList;
            //    24: astore_2       
            //    25: aload_2        
            //    26: invokespecial   java/util/ArrayList.<init>:()V
            //    29: aload_0        
            //    30: aload_2        
            //    31: putfield        rx/internal/operators/d4$b.Q:Ljava/util/List;
            //    34: aload_0        
            //    35: getfield        rx/internal/operators/d4$b.Q:Ljava/util/List;
            //    38: getstatic       rx/internal/operators/d4.H:Ljava/lang/Object;
            //    41: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
            //    46: pop            
            //    47: aload_1        
            //    48: monitorexit    
            //    49: return         
            //    50: aload_0        
            //    51: getfield        rx/internal/operators/d4$b.Q:Ljava/util/List;
            //    54: astore_2       
            //    55: aload_0        
            //    56: aconst_null    
            //    57: putfield        rx/internal/operators/d4$b.Q:Ljava/util/List;
            //    60: iconst_1       
            //    61: istore_3       
            //    62: aload_0        
            //    63: iconst_1       
            //    64: putfield        rx/internal/operators/d4$b.P:Z
            //    67: aload_1        
            //    68: monitorexit    
            //    69: iconst_1       
            //    70: istore          4
            //    72: aload_0        
            //    73: aload_2        
            //    74: invokevirtual   rx/internal/operators/d4$b.A:(Ljava/util/List;)V
            //    77: iload           4
            //    79: istore          5
            //    81: iload           4
            //    83: ifeq            93
            //    86: aload_0        
            //    87: invokevirtual   rx/internal/operators/d4$b.F:()V
            //    90: iconst_0       
            //    91: istore          5
            //    93: aload_0        
            //    94: getfield        rx/internal/operators/d4$b.M:Ljava/lang/Object;
            //    97: astore_1       
            //    98: aload_1        
            //    99: monitorenter   
            //   100: aload_0        
            //   101: getfield        rx/internal/operators/d4$b.Q:Ljava/util/List;
            //   104: astore_2       
            //   105: aload_0        
            //   106: aconst_null    
            //   107: putfield        rx/internal/operators/d4$b.Q:Ljava/util/List;
            //   110: aload_2        
            //   111: ifnonnull       125
            //   114: aload_0        
            //   115: iconst_0       
            //   116: putfield        rx/internal/operators/d4$b.P:Z
            //   119: iload_3        
            //   120: istore          5
            //   122: aload_1        
            //   123: monitorexit    
            //   124: return         
            //   125: aload_1        
            //   126: monitorexit    
            //   127: aload_0        
            //   128: getfield        rx/internal/operators/d4$b.L:Lrx/n;
            //   131: invokevirtual   rx/n.g:()Z
            //   134: istore          6
            //   136: iload           6
            //   138: ifeq            161
            //   141: aload_0        
            //   142: getfield        rx/internal/operators/d4$b.M:Ljava/lang/Object;
            //   145: astore_2       
            //   146: aload_2        
            //   147: monitorenter   
            //   148: aload_0        
            //   149: iconst_0       
            //   150: putfield        rx/internal/operators/d4$b.P:Z
            //   153: aload_2        
            //   154: monitorexit    
            //   155: return         
            //   156: astore_1       
            //   157: aload_2        
            //   158: monitorexit    
            //   159: aload_1        
            //   160: athrow         
            //   161: iload           5
            //   163: istore          4
            //   165: goto            72
            //   168: astore_2       
            //   169: iconst_0       
            //   170: istore          4
            //   172: iload           4
            //   174: istore          5
            //   176: aload_1        
            //   177: monitorexit    
            //   178: aload_2        
            //   179: athrow         
            //   180: astore_2       
            //   181: goto            196
            //   184: astore_2       
            //   185: iload           5
            //   187: istore          4
            //   189: goto            172
            //   192: astore_2       
            //   193: iconst_0       
            //   194: istore          4
            //   196: iload           4
            //   198: ifne            223
            //   201: aload_0        
            //   202: getfield        rx/internal/operators/d4$b.M:Ljava/lang/Object;
            //   205: astore_1       
            //   206: aload_1        
            //   207: monitorenter   
            //   208: aload_0        
            //   209: iconst_0       
            //   210: putfield        rx/internal/operators/d4$b.P:Z
            //   213: aload_1        
            //   214: monitorexit    
            //   215: goto            223
            //   218: astore_2       
            //   219: aload_1        
            //   220: monitorexit    
            //   221: aload_2        
            //   222: athrow         
            //   223: aload_2        
            //   224: athrow         
            //   225: astore_2       
            //   226: aload_1        
            //   227: monitorexit    
            //   228: aload_2        
            //   229: athrow         
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type
            //  -----  -----  -----  -----  ----
            //  7      34     225    230    Any
            //  34     49     225    230    Any
            //  50     60     225    230    Any
            //  62     69     225    230    Any
            //  72     77     192    196    Any
            //  86     90     192    196    Any
            //  93     100    192    196    Any
            //  100    110    168    172    Any
            //  114    119    168    172    Any
            //  122    124    184    192    Any
            //  125    127    168    172    Any
            //  127    136    192    196    Any
            //  148    155    156    161    Any
            //  157    159    156    161    Any
            //  176    178    184    192    Any
            //  178    180    180    184    Any
            //  208    215    218    223    Any
            //  219    221    218    223    Any
            //  226    228    225    230    Any
            // 
            // The error that occurred was:
            // 
            // java.lang.IllegalStateException: Expression is linked from several locations: Label_0125:
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
        
        @Override
        public void b(final Throwable t) {
            synchronized (this.M) {
                if (this.P) {
                    this.Q = Collections.singletonList(x.c(t));
                    return;
                }
                this.Q = null;
                this.P = true;
                // monitorexit(this.M)
                this.D(t);
            }
        }
        
        @Override
        public void c() {
            final Object m = this.M;
            synchronized (m) {
                if (this.P) {
                    if (this.Q == null) {
                        this.Q = new ArrayList<Object>();
                    }
                    this.Q.add(x.b());
                    return;
                }
                final List<Object> q = this.Q;
                this.Q = null;
                this.P = true;
                // monitorexit(m)
                try {
                    this.A(q);
                    this.w();
                }
                finally {
                    this.D((Throwable)m);
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
            //     1: getfield        rx/internal/operators/d4$b.M:Ljava/lang/Object;
            //     4: astore_2       
            //     5: aload_2        
            //     6: monitorenter   
            //     7: aload_0        
            //     8: getfield        rx/internal/operators/d4$b.P:Z
            //    11: ifeq            48
            //    14: aload_0        
            //    15: getfield        rx/internal/operators/d4$b.Q:Ljava/util/List;
            //    18: ifnonnull       34
            //    21: new             Ljava/util/ArrayList;
            //    24: astore_3       
            //    25: aload_3        
            //    26: invokespecial   java/util/ArrayList.<init>:()V
            //    29: aload_0        
            //    30: aload_3        
            //    31: putfield        rx/internal/operators/d4$b.Q:Ljava/util/List;
            //    34: aload_0        
            //    35: getfield        rx/internal/operators/d4$b.Q:Ljava/util/List;
            //    38: aload_1        
            //    39: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
            //    44: pop            
            //    45: aload_2        
            //    46: monitorexit    
            //    47: return         
            //    48: aload_0        
            //    49: getfield        rx/internal/operators/d4$b.Q:Ljava/util/List;
            //    52: astore_3       
            //    53: aload_0        
            //    54: aconst_null    
            //    55: putfield        rx/internal/operators/d4$b.Q:Ljava/util/List;
            //    58: iconst_1       
            //    59: istore          4
            //    61: aload_0        
            //    62: iconst_1       
            //    63: putfield        rx/internal/operators/d4$b.P:Z
            //    66: aload_2        
            //    67: monitorexit    
            //    68: iconst_1       
            //    69: istore          5
            //    71: aload_0        
            //    72: aload_3        
            //    73: invokevirtual   rx/internal/operators/d4$b.A:(Ljava/util/List;)V
            //    76: iload           5
            //    78: istore          6
            //    80: iload           5
            //    82: ifeq            93
            //    85: aload_0        
            //    86: aload_1        
            //    87: invokevirtual   rx/internal/operators/d4$b.C:(Ljava/lang/Object;)V
            //    90: iconst_0       
            //    91: istore          6
            //    93: aload_0        
            //    94: getfield        rx/internal/operators/d4$b.M:Ljava/lang/Object;
            //    97: astore_2       
            //    98: aload_2        
            //    99: monitorenter   
            //   100: aload_0        
            //   101: getfield        rx/internal/operators/d4$b.Q:Ljava/util/List;
            //   104: astore_3       
            //   105: aload_0        
            //   106: aconst_null    
            //   107: putfield        rx/internal/operators/d4$b.Q:Ljava/util/List;
            //   110: aload_3        
            //   111: ifnonnull       126
            //   114: aload_0        
            //   115: iconst_0       
            //   116: putfield        rx/internal/operators/d4$b.P:Z
            //   119: iload           4
            //   121: istore          6
            //   123: aload_2        
            //   124: monitorexit    
            //   125: return         
            //   126: aload_2        
            //   127: monitorexit    
            //   128: aload_0        
            //   129: getfield        rx/internal/operators/d4$b.L:Lrx/n;
            //   132: invokevirtual   rx/n.g:()Z
            //   135: istore          7
            //   137: iload           7
            //   139: ifeq            162
            //   142: aload_0        
            //   143: getfield        rx/internal/operators/d4$b.M:Ljava/lang/Object;
            //   146: astore_3       
            //   147: aload_3        
            //   148: monitorenter   
            //   149: aload_0        
            //   150: iconst_0       
            //   151: putfield        rx/internal/operators/d4$b.P:Z
            //   154: aload_3        
            //   155: monitorexit    
            //   156: return         
            //   157: astore_1       
            //   158: aload_3        
            //   159: monitorexit    
            //   160: aload_1        
            //   161: athrow         
            //   162: iload           6
            //   164: istore          5
            //   166: goto            71
            //   169: astore_1       
            //   170: iconst_0       
            //   171: istore          5
            //   173: iload           5
            //   175: istore          6
            //   177: aload_2        
            //   178: monitorexit    
            //   179: aload_1        
            //   180: athrow         
            //   181: astore_1       
            //   182: goto            197
            //   185: astore_1       
            //   186: iload           6
            //   188: istore          5
            //   190: goto            173
            //   193: astore_1       
            //   194: iconst_0       
            //   195: istore          5
            //   197: iload           5
            //   199: ifne            224
            //   202: aload_0        
            //   203: getfield        rx/internal/operators/d4$b.M:Ljava/lang/Object;
            //   206: astore_3       
            //   207: aload_3        
            //   208: monitorenter   
            //   209: aload_0        
            //   210: iconst_0       
            //   211: putfield        rx/internal/operators/d4$b.P:Z
            //   214: aload_3        
            //   215: monitorexit    
            //   216: goto            224
            //   219: astore_1       
            //   220: aload_3        
            //   221: monitorexit    
            //   222: aload_1        
            //   223: athrow         
            //   224: aload_1        
            //   225: athrow         
            //   226: astore_1       
            //   227: aload_2        
            //   228: monitorexit    
            //   229: aload_1        
            //   230: athrow         
            //    Signature:
            //  (TT;)V
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type
            //  -----  -----  -----  -----  ----
            //  7      34     226    231    Any
            //  34     47     226    231    Any
            //  48     58     226    231    Any
            //  61     68     226    231    Any
            //  71     76     193    197    Any
            //  85     90     193    197    Any
            //  93     100    193    197    Any
            //  100    110    169    173    Any
            //  114    119    169    173    Any
            //  123    125    185    193    Any
            //  126    128    169    173    Any
            //  128    137    193    197    Any
            //  149    156    157    162    Any
            //  158    160    157    162    Any
            //  177    179    185    193    Any
            //  179    181    181    185    Any
            //  209    216    219    224    Any
            //  220    222    219    224    Any
            //  227    229    226    231    Any
            // 
            // The error that occurred was:
            // 
            // java.lang.IllegalStateException: Expression is linked from several locations: Label_0126:
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
            final h<T> n = this.N;
            this.N = null;
            this.O = null;
            if (n != null) {
                n.c();
            }
            this.L.c();
            this.i();
        }
        
        void x() {
            final i<Object> g7 = i.G7();
            this.N = (h<T>)g7;
            this.O = (g<T>)g7;
            try {
                final g g8 = (g)this.S.call();
                final a a = new a((b<T, U>)this);
                this.R.b(a);
                g8.R6(a);
            }
            finally {
                final Throwable t;
                this.L.b(t);
                this.i();
            }
        }
    }
}
