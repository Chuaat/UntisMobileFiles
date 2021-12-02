// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.exceptions.d;
import rx.internal.util.m;
import rx.subscriptions.b;
import rx.h;
import java.util.concurrent.atomic.AtomicLong;
import rx.i;
import rx.o;
import rx.n;
import rx.functions.x;
import rx.functions.w;
import rx.functions.v;
import rx.functions.u;
import rx.functions.t;
import rx.functions.s;
import rx.functions.r;
import rx.functions.a0;
import rx.functions.q;
import rx.functions.y;
import rx.g;

public final class j4<R> implements g.b<R, g<?>[]>
{
    final y<? extends R> G;
    
    public j4(final q q) {
        this.G = a0.g((q<? super Object, ? super Object, ? extends R>)q);
    }
    
    public j4(final r r) {
        this.G = a0.h((r<? super Object, ? super Object, ? super Object, ? extends R>)r);
    }
    
    public j4(final s s) {
        this.G = a0.i((s<? super Object, ? super Object, ? super Object, ? super Object, ? extends R>)s);
    }
    
    public j4(final t t) {
        this.G = a0.j((t<? super Object, ? super Object, ? super Object, ? super Object, ? super Object, ? extends R>)t);
    }
    
    public j4(final u u) {
        this.G = a0.k((u<? super Object, ? super Object, ? super Object, ? super Object, ? super Object, ? super Object, ? extends R>)u);
    }
    
    public j4(final v v) {
        this.G = a0.l((v<? super Object, ? super Object, ? super Object, ? super Object, ? super Object, ? super Object, ? super Object, ? extends R>)v);
    }
    
    public j4(final w w) {
        this.G = a0.m((w<? super Object, ? super Object, ? super Object, ? super Object, ? super Object, ? super Object, ? super Object, ? super Object, ? extends R>)w);
    }
    
    public j4(final x x) {
        this.G = a0.n((x<? super Object, ? super Object, ? super Object, ? super Object, ? super Object, ? super Object, ? super Object, ? super Object, ? super Object, ? extends R>)x);
    }
    
    public j4(final y<? extends R> g) {
        this.G = g;
    }
    
    public n<? super g[]> a(final n<? super R> n) {
        final a a = new a((n<? super Object>)n, this.G);
        final b b = new b((a<Object>)a);
        final c c = new c(n, (a<R>)a, (b<R>)b);
        n.r(c);
        n.s0(b);
        return c;
    }
    
    static final class a<R> extends AtomicLong
    {
        private static final long M = 5995274816189928317L;
        static final int N;
        final h<? super R> G;
        private final y<? extends R> H;
        private final rx.subscriptions.b I;
        int J;
        private volatile Object[] K;
        private AtomicLong L;
        
        static {
            N = (int)(m.J * 0.7);
        }
        
        public a(final n<? super R> g, final y<? extends R> h) {
            final rx.subscriptions.b i = new rx.subscriptions.b();
            this.I = i;
            this.G = g;
            this.H = h;
            g.r(i);
        }
        
        public void a(final g[] array, final AtomicLong l) {
            final Object[] k = new Object[array.length];
            final int n = 0;
            for (int i = 0; i < array.length; ++i) {
                final j4.a.a a = new j4.a.a();
                k[i] = a;
                this.I.a(a);
            }
            this.L = l;
            this.K = k;
            for (int j = n; j < array.length; ++j) {
                array[j].R6((n)k[j]);
            }
        }
        
        void b() {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     4: astore_1       
            //     5: aload_1        
            //     6: ifnonnull       10
            //     9: return         
            //    10: aload_0        
            //    11: invokevirtual   java/util/concurrent/atomic/AtomicLong.getAndIncrement:()J
            //    14: lconst_0       
            //    15: lcmp           
            //    16: ifne            296
            //    19: aload_1        
            //    20: arraylength    
            //    21: istore_2       
            //    22: aload_0        
            //    23: getfield        rx/internal/operators/j4$a.G:Lrx/h;
            //    26: astore_3       
            //    27: aload_0        
            //    28: getfield        rx/internal/operators/j4$a.L:Ljava/util/concurrent/atomic/AtomicLong;
            //    31: astore          4
            //    33: iload_2        
            //    34: anewarray       Ljava/lang/Object;
            //    37: astore          5
            //    39: iconst_0       
            //    40: istore          6
            //    42: iconst_1       
            //    43: istore          7
            //    45: iload           6
            //    47: iload_2        
            //    48: if_icmpge       123
            //    51: aload_1        
            //    52: iload           6
            //    54: aaload         
            //    55: checkcast       Lrx/internal/operators/j4$a$a;
            //    58: getfield        rx/internal/operators/j4$a$a.L:Lrx/internal/util/m;
            //    61: astore          8
            //    63: aload           8
            //    65: invokevirtual   rx/internal/util/m.r:()Ljava/lang/Object;
            //    68: astore          9
            //    70: aload           9
            //    72: ifnonnull       81
            //    75: iconst_0       
            //    76: istore          7
            //    78: goto            117
            //    81: aload           8
            //    83: aload           9
            //    85: invokevirtual   rx/internal/util/m.l:(Ljava/lang/Object;)Z
            //    88: ifeq            105
            //    91: aload_3        
            //    92: invokeinterface rx/h.c:()V
            //    97: aload_0        
            //    98: getfield        rx/internal/operators/j4$a.I:Lrx/subscriptions/b;
            //   101: invokevirtual   rx/subscriptions/b.i:()V
            //   104: return         
            //   105: aload           5
            //   107: iload           6
            //   109: aload           8
            //   111: aload           9
            //   113: invokevirtual   rx/internal/util/m.k:(Ljava/lang/Object;)Ljava/lang/Object;
            //   116: aastore        
            //   117: iinc            6, 1
            //   120: goto            45
            //   123: iload           7
            //   125: ifeq            287
            //   128: aload           4
            //   130: invokevirtual   java/util/concurrent/atomic/AtomicLong.get:()J
            //   133: lconst_0       
            //   134: lcmp           
            //   135: ifle            287
            //   138: aload_3        
            //   139: aload_0        
            //   140: getfield        rx/internal/operators/j4$a.H:Lrx/functions/y;
            //   143: aload           5
            //   145: invokeinterface rx/functions/y.call:([Ljava/lang/Object;)Ljava/lang/Object;
            //   150: invokeinterface rx/h.m:(Ljava/lang/Object;)V
            //   155: aload           4
            //   157: invokevirtual   java/util/concurrent/atomic/AtomicLong.decrementAndGet:()J
            //   160: pop2           
            //   161: aload_0        
            //   162: aload_0        
            //   163: getfield        rx/internal/operators/j4$a.J:I
            //   166: iconst_1       
            //   167: iadd           
            //   168: putfield        rx/internal/operators/j4$a.J:I
            //   171: aload_1        
            //   172: arraylength    
            //   173: istore          7
            //   175: iconst_0       
            //   176: istore          6
            //   178: iload           6
            //   180: iload           7
            //   182: if_icmpge       225
            //   185: aload_1        
            //   186: iload           6
            //   188: aaload         
            //   189: checkcast       Lrx/internal/operators/j4$a$a;
            //   192: getfield        rx/internal/operators/j4$a$a.L:Lrx/internal/util/m;
            //   195: astore          5
            //   197: aload           5
            //   199: invokevirtual   rx/internal/util/m.s:()Ljava/lang/Object;
            //   202: pop            
            //   203: aload           5
            //   205: aload           5
            //   207: invokevirtual   rx/internal/util/m.r:()Ljava/lang/Object;
            //   210: invokevirtual   rx/internal/util/m.l:(Ljava/lang/Object;)Z
            //   213: ifeq            219
            //   216: goto            91
            //   219: iinc            6, 1
            //   222: goto            178
            //   225: aload_0        
            //   226: getfield        rx/internal/operators/j4$a.J:I
            //   229: getstatic       rx/internal/operators/j4$a.N:I
            //   232: if_icmple       33
            //   235: aload_1        
            //   236: arraylength    
            //   237: istore          7
            //   239: iconst_0       
            //   240: istore          6
            //   242: iload           6
            //   244: iload           7
            //   246: if_icmpge       270
            //   249: aload_1        
            //   250: iload           6
            //   252: aaload         
            //   253: checkcast       Lrx/internal/operators/j4$a$a;
            //   256: aload_0        
            //   257: getfield        rx/internal/operators/j4$a.J:I
            //   260: i2l            
            //   261: invokevirtual   rx/internal/operators/j4$a$a.w:(J)V
            //   264: iinc            6, 1
            //   267: goto            242
            //   270: aload_0        
            //   271: iconst_0       
            //   272: putfield        rx/internal/operators/j4$a.J:I
            //   275: goto            33
            //   278: astore_1       
            //   279: aload_1        
            //   280: aload_3        
            //   281: aload           5
            //   283: invokestatic    rx/exceptions/c.g:(Ljava/lang/Throwable;Lrx/h;Ljava/lang/Object;)V
            //   286: return         
            //   287: aload_0        
            //   288: invokevirtual   java/util/concurrent/atomic/AtomicLong.decrementAndGet:()J
            //   291: lconst_0       
            //   292: lcmp           
            //   293: ifgt            33
            //   296: return         
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type
            //  -----  -----  -----  -----  ----
            //  138    171    278    287    Any
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
        
        final class a extends n
        {
            final m L;
            
            a() {
                this.L = m.h();
            }
            
            @Override
            public void b(final Throwable t) {
                j4.a.this.G.b(t);
            }
            
            @Override
            public void c() {
                this.L.o();
                j4.a.this.b();
            }
            
            @Override
            public void f() {
                this.v(m.J);
            }
            
            @Override
            public void m(final Object o) {
                try {
                    this.L.q(o);
                }
                catch (d d) {
                    this.b(d);
                }
                j4.a.this.b();
            }
            
            public void w(final long n) {
                this.v(n);
            }
        }
    }
    
    static final class b<R> extends AtomicLong implements i
    {
        private static final long H = -1216676403723546796L;
        final j4.a<R> G;
        
        public b(final j4.a<R> g) {
            this.G = g;
        }
        
        @Override
        public void v(final long n) {
            a.b(this, n);
            this.G.b();
        }
    }
    
    final class c extends n<g[]>
    {
        final n<? super R> L;
        final j4.a<R> M;
        final b<R> N;
        boolean O;
        
        public c(final n<? super R> l, final j4.a<R> m, final b<R> n) {
            this.L = l;
            this.M = m;
            this.N = n;
        }
        
        @Override
        public void b(final Throwable t) {
            this.L.b(t);
        }
        
        @Override
        public void c() {
            if (!this.O) {
                this.L.c();
            }
        }
        
        public void w(final g[] array) {
            if (array != null && array.length != 0) {
                this.O = true;
                this.M.a(array, this.N);
            }
            else {
                this.L.c();
            }
        }
    }
}
