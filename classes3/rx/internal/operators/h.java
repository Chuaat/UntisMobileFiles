// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicBoolean;
import rx.o;
import rx.n;
import rx.subscriptions.e;
import rx.internal.util.i;
import rx.g;

public final class h<T> extends g<T>
{
    private final a<T> H;
    
    private h(final g.a<T> a, final a<T> h) {
        super((g.a)a);
        this.H = h;
    }
    
    public static <T> h<T> E7(final g<? extends T> g) {
        return F7(g, 16);
    }
    
    public static <T> h<T> F7(final g<? extends T> g, final int n) {
        if (n >= 1) {
            final a a = new a(g, n);
            return new h<T>(new b<Object>((a<Object>)a), (a<Object>)a);
        }
        throw new IllegalArgumentException("capacityHint > 0 required");
    }
    
    boolean G7() {
        return this.H.N.length != 0;
    }
    
    boolean H7() {
        return this.H.O;
    }
    
    static final class a<T> extends i implements h<T>
    {
        static final c<?>[] Q;
        final g<? extends T> L;
        final e M;
        volatile c<?>[] N;
        volatile boolean O;
        boolean P;
        
        static {
            Q = new c[0];
        }
        
        public a(final g<? extends T> l, final int n) {
            super(n);
            this.L = l;
            this.N = a.Q;
            this.M = new e();
        }
        
        @Override
        public void b(final Throwable t) {
            if (!this.P) {
                this.P = true;
                this.h(x.c(t));
                this.M.i();
                this.s();
            }
        }
        
        @Override
        public void c() {
            if (!this.P) {
                this.P = true;
                this.h(x.b());
                this.M.i();
                this.s();
            }
        }
        
        @Override
        public void m(final T t) {
            if (!this.P) {
                this.h(x.j(t));
                this.s();
            }
        }
        
        public void q(final c<T> c) {
            synchronized (this.M) {
                final c<?>[] n = this.N;
                final int length = n.length;
                final c[] n2 = new c[length + 1];
                System.arraycopy(n, 0, n2, 0, length);
                n2[length] = c;
                this.N = (c<?>[])n2;
            }
        }
        
        public void r() {
            final n<T> n = new n<T>() {
                @Override
                public void b(final Throwable t) {
                    a.this.b(t);
                }
                
                @Override
                public void c() {
                    a.this.c();
                }
                
                @Override
                public void m(final T t) {
                    a.this.m(t);
                }
            };
            this.M.b(n);
            this.L.R6((n<? super T>)n);
            this.O = true;
        }
        
        void s() {
            final c<?>[] n = this.N;
            for (int length = n.length, i = 0; i < length; ++i) {
                n[i].b();
            }
        }
        
        public void t(final c<T> obj) {
            synchronized (this.M) {
                final c<?>[] n = this.N;
                final int length = n.length;
                final int n2 = -1;
                int n3 = 0;
                int n4;
                while (true) {
                    n4 = n2;
                    if (n3 >= length) {
                        break;
                    }
                    if (n[n3].equals(obj)) {
                        n4 = n3;
                        break;
                    }
                    ++n3;
                }
                if (n4 < 0) {
                    return;
                }
                if (length == 1) {
                    this.N = a.Q;
                    return;
                }
                final c[] n5 = new c[length - 1];
                System.arraycopy(n, 0, n5, 0, n4);
                System.arraycopy(n, n4 + 1, n5, n4, length - n4 - 1);
                this.N = (c<?>[])n5;
            }
        }
    }
    
    static final class b<T> extends AtomicBoolean implements g.a<T>
    {
        private static final long H = -2817751667698696782L;
        final h.a<T> G;
        
        public b(final h.a<T> g) {
            this.G = g;
        }
        
        public void a(final n<? super T> n) {
            final h.c c = new h.c((n<? super Object>)n, (h.a<Object>)this.G);
            this.G.q((h.c<T>)c);
            n.r(c);
            n.s0(c);
            if (!this.get() && this.compareAndSet(false, true)) {
                this.G.r();
            }
        }
    }
    
    static final class c<T> extends AtomicLong implements i, o
    {
        private static final long N = -2557562030197141021L;
        final n<? super T> G;
        final a<T> H;
        Object[] I;
        int J;
        int K;
        boolean L;
        boolean M;
        
        public c(final n<? super T> g, final a<T> h) {
            this.G = g;
            this.H = h;
        }
        
        public long a(final long n) {
            return this.addAndGet(-n);
        }
        
        public void b() {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: monitorenter   
            //     2: aload_0        
            //     3: getfield        rx/internal/operators/h$c.L:Z
            //     6: istore_1       
            //     7: iconst_1       
            //     8: istore_2       
            //     9: iload_1        
            //    10: ifeq            21
            //    13: aload_0        
            //    14: iconst_1       
            //    15: putfield        rx/internal/operators/h$c.M:Z
            //    18: aload_0        
            //    19: monitorexit    
            //    20: return         
            //    21: aload_0        
            //    22: iconst_1       
            //    23: putfield        rx/internal/operators/h$c.L:Z
            //    26: aload_0        
            //    27: monitorexit    
            //    28: aload_0        
            //    29: getfield        rx/internal/operators/h$c.G:Lrx/n;
            //    32: astore_3       
            //    33: aload_0        
            //    34: invokevirtual   java/util/concurrent/atomic/AtomicLong.get:()J
            //    37: lstore          4
            //    39: lload           4
            //    41: lconst_0       
            //    42: lcmp           
            //    43: istore          6
            //    45: iload           6
            //    47: ifge            51
            //    50: return         
            //    51: aload_0        
            //    52: getfield        rx/internal/operators/h$c.H:Lrx/internal/operators/h$a;
            //    55: invokevirtual   rx/internal/util/i.n:()I
            //    58: istore          7
            //    60: iload           7
            //    62: ifeq            381
            //    65: aload_0        
            //    66: getfield        rx/internal/operators/h$c.I:[Ljava/lang/Object;
            //    69: astore          8
            //    71: aload           8
            //    73: astore          9
            //    75: aload           8
            //    77: ifnonnull       95
            //    80: aload_0        
            //    81: getfield        rx/internal/operators/h$c.H:Lrx/internal/operators/h$a;
            //    84: invokevirtual   rx/internal/util/i.k:()[Ljava/lang/Object;
            //    87: astore          9
            //    89: aload_0        
            //    90: aload           9
            //    92: putfield        rx/internal/operators/h$c.I:[Ljava/lang/Object;
            //    95: aload           9
            //    97: arraylength    
            //    98: iconst_1       
            //    99: isub           
            //   100: istore          10
            //   102: aload_0        
            //   103: getfield        rx/internal/operators/h$c.K:I
            //   106: istore          11
            //   108: aload_0        
            //   109: getfield        rx/internal/operators/h$c.J:I
            //   112: istore          12
            //   114: iload           6
            //   116: ifne            177
            //   119: aload           9
            //   121: iload           12
            //   123: aaload         
            //   124: astore          9
            //   126: aload           9
            //   128: invokestatic    rx/internal/operators/x.f:(Ljava/lang/Object;)Z
            //   131: ifeq            153
            //   134: aload_3        
            //   135: invokeinterface rx/h.c:()V
            //   140: aload_0        
            //   141: invokevirtual   rx/internal/operators/h$c.i:()V
            //   144: return         
            //   145: astore          9
            //   147: iconst_1       
            //   148: istore          12
            //   150: goto            444
            //   153: aload           9
            //   155: invokestatic    rx/internal/operators/x.g:(Ljava/lang/Object;)Z
            //   158: ifeq            381
            //   161: aload_3        
            //   162: aload           9
            //   164: invokestatic    rx/internal/operators/x.d:(Ljava/lang/Object;)Ljava/lang/Throwable;
            //   167: invokeinterface rx/h.b:(Ljava/lang/Throwable;)V
            //   172: aload_0        
            //   173: invokevirtual   rx/internal/operators/h$c.i:()V
            //   176: return         
            //   177: iload           6
            //   179: ifle            381
            //   182: iconst_0       
            //   183: istore          6
            //   185: aload           9
            //   187: astore          8
            //   189: iload           11
            //   191: iload           7
            //   193: if_icmpge       347
            //   196: lload           4
            //   198: lconst_0       
            //   199: lcmp           
            //   200: ifle            347
            //   203: aload_3        
            //   204: invokevirtual   rx/n.g:()Z
            //   207: ifeq            211
            //   210: return         
            //   211: aload           8
            //   213: astore          9
            //   215: iload           12
            //   217: istore          13
            //   219: iload           12
            //   221: iload           10
            //   223: if_icmpne       239
            //   226: aload           8
            //   228: iload           10
            //   230: aaload         
            //   231: checkcast       [Ljava/lang/Object;
            //   234: astore          9
            //   236: iconst_0       
            //   237: istore          13
            //   239: aload           9
            //   241: iload           13
            //   243: aaload         
            //   244: astore          8
            //   246: aload_3        
            //   247: aload           8
            //   249: invokestatic    rx/internal/operators/x.a:(Lrx/h;Ljava/lang/Object;)Z
            //   252: istore_1       
            //   253: iload_1        
            //   254: ifeq            270
            //   257: aload_0        
            //   258: invokevirtual   rx/internal/operators/h$c.i:()V
            //   261: return         
            //   262: astore          9
            //   264: iconst_1       
            //   265: istore          12
            //   267: goto            300
            //   270: iload           13
            //   272: iconst_1       
            //   273: iadd           
            //   274: istore          12
            //   276: iinc            11, 1
            //   279: lload           4
            //   281: lconst_1       
            //   282: lsub           
            //   283: lstore          4
            //   285: iinc            6, 1
            //   288: aload           9
            //   290: astore          8
            //   292: goto            189
            //   295: astore          9
            //   297: iconst_0       
            //   298: istore          12
            //   300: aload           9
            //   302: invokestatic    rx/exceptions/c.e:(Ljava/lang/Throwable;)V
            //   305: aload_0        
            //   306: invokevirtual   rx/internal/operators/h$c.i:()V
            //   309: aload           8
            //   311: invokestatic    rx/internal/operators/x.g:(Ljava/lang/Object;)Z
            //   314: ifne            341
            //   317: aload           8
            //   319: invokestatic    rx/internal/operators/x.f:(Ljava/lang/Object;)Z
            //   322: ifne            341
            //   325: aload_3        
            //   326: aload           9
            //   328: aload           8
            //   330: invokestatic    rx/internal/operators/x.e:(Ljava/lang/Object;)Ljava/lang/Object;
            //   333: invokestatic    rx/exceptions/h.a:(Ljava/lang/Throwable;Ljava/lang/Object;)Ljava/lang/Throwable;
            //   336: invokeinterface rx/h.b:(Ljava/lang/Throwable;)V
            //   341: return         
            //   342: astore          9
            //   344: goto            444
            //   347: aload_3        
            //   348: invokevirtual   rx/n.g:()Z
            //   351: ifeq            355
            //   354: return         
            //   355: aload_0        
            //   356: iload           11
            //   358: putfield        rx/internal/operators/h$c.K:I
            //   361: aload_0        
            //   362: iload           12
            //   364: putfield        rx/internal/operators/h$c.J:I
            //   367: aload_0        
            //   368: aload           8
            //   370: putfield        rx/internal/operators/h$c.I:[Ljava/lang/Object;
            //   373: aload_0        
            //   374: iload           6
            //   376: i2l            
            //   377: invokevirtual   rx/internal/operators/h$c.a:(J)J
            //   380: pop2           
            //   381: aload_0        
            //   382: monitorenter   
            //   383: aload_0        
            //   384: getfield        rx/internal/operators/h$c.M:Z
            //   387: ifne            401
            //   390: aload_0        
            //   391: iconst_0       
            //   392: putfield        rx/internal/operators/h$c.L:Z
            //   395: iload_2        
            //   396: istore          6
            //   398: aload_0        
            //   399: monitorexit    
            //   400: return         
            //   401: aload_0        
            //   402: iconst_0       
            //   403: putfield        rx/internal/operators/h$c.M:Z
            //   406: aload_0        
            //   407: monitorexit    
            //   408: goto            33
            //   411: astore          9
            //   413: iconst_0       
            //   414: istore          12
            //   416: iload           12
            //   418: istore          6
            //   420: aload_0        
            //   421: monitorexit    
            //   422: aload           9
            //   424: athrow         
            //   425: astore          9
            //   427: goto            444
            //   430: astore          9
            //   432: iload           6
            //   434: istore          12
            //   436: goto            416
            //   439: astore          9
            //   441: iconst_0       
            //   442: istore          12
            //   444: iload           12
            //   446: ifne            468
            //   449: aload_0        
            //   450: monitorenter   
            //   451: aload_0        
            //   452: iconst_0       
            //   453: putfield        rx/internal/operators/h$c.L:Z
            //   456: aload_0        
            //   457: monitorexit    
            //   458: goto            468
            //   461: astore          9
            //   463: aload_0        
            //   464: monitorexit    
            //   465: aload           9
            //   467: athrow         
            //   468: aload           9
            //   470: athrow         
            //   471: astore          9
            //   473: aload_0        
            //   474: monitorexit    
            //   475: aload           9
            //   477: athrow         
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type
            //  -----  -----  -----  -----  ----
            //  2      7      471    478    Any
            //  13     20     471    478    Any
            //  21     28     471    478    Any
            //  28     33     439    444    Any
            //  33     39     439    444    Any
            //  51     60     439    444    Any
            //  65     71     439    444    Any
            //  80     95     439    444    Any
            //  95     114    439    444    Any
            //  126    140    439    444    Any
            //  140    144    145    153    Any
            //  153    172    439    444    Any
            //  172    176    145    153    Any
            //  203    210    439    444    Any
            //  226    236    439    444    Any
            //  246    253    295    300    Any
            //  257    261    262    270    Any
            //  300    305    342    347    Any
            //  305    341    145    153    Any
            //  347    354    439    444    Any
            //  355    381    439    444    Any
            //  381    383    439    444    Any
            //  383    395    411    416    Any
            //  398    400    430    439    Any
            //  401    408    411    416    Any
            //  420    422    430    439    Any
            //  422    425    425    430    Any
            //  451    458    461    468    Any
            //  463    465    461    468    Any
            //  473    475    471    478    Any
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
        public boolean g() {
            return this.get() < 0L;
        }
        
        @Override
        public void i() {
            if (this.get() >= 0L && this.getAndSet(-1L) >= 0L) {
                this.H.t(this);
            }
        }
        
        @Override
        public void v(final long n) {
            long value;
            long newValue;
            do {
                value = this.get();
                if (value < 0L) {
                    return;
                }
                if ((newValue = value + n) >= 0L) {
                    continue;
                }
                newValue = Long.MAX_VALUE;
            } while (!this.compareAndSet(value, newValue));
            this.b();
        }
    }
}
