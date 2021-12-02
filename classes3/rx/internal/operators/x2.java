// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import java.util.concurrent.atomic.AtomicReference;
import rx.h;
import java.util.concurrent.atomic.AtomicLong;
import rx.i;
import rx.o;
import rx.n;
import rx.g;

public final class x2<T> implements g.b<T, T>
{
    public static <T> x2<T> b() {
        return (x2<T>)a.a;
    }
    
    public n<? super T> a(final n<? super T> n) {
        final b b = new b((n<? super Object>)n);
        final c h = new c((b<Object>)b);
        n.r(b.H = (c<? super T>)h);
        n.r(b);
        n.s0(b);
        return (n<? super T>)h;
    }
    
    static final class a
    {
        static final x2<Object> a;
        
        static {
            a = new x2<Object>();
        }
    }
    
    static final class b<T> extends AtomicLong implements i, o, h<T>
    {
        private static final long N = -1364393685005146274L;
        static final Object O;
        static final long P = -4611686018427387904L;
        final n<? super T> G;
        c<? super T> H;
        final AtomicReference<Object> I;
        Throwable J;
        volatile boolean K;
        boolean L;
        boolean M;
        
        static {
            O = new Object();
        }
        
        public b(final n<? super T> g) {
            this.G = g;
            this.I = new AtomicReference<Object>(b.O);
            this.lazySet(-4611686018427387904L);
        }
        
        @Override
        public void b(final Throwable j) {
            this.J = j;
            this.K = true;
            this.h();
        }
        
        @Override
        public void c() {
            this.K = true;
            this.h();
        }
        
        @Override
        public boolean g() {
            return this.get() == Long.MIN_VALUE;
        }
        
        void h() {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     2: aload_0        
            //     3: getfield        rx/internal/operators/x2$b.L:Z
            //     6: istore_1       
            //     7: iconst_1       
            //     8: istore_2       
            //     9: iload_1        
            //    10: ifeq            21
            //    13: aload_0        
            //    14: iconst_1       
            //    15: putfield        rx/internal/operators/x2$b.M:Z
            //    18: aload_0        
            //    19: monitorexit    
            //    20: return         
            //    21: aload_0        
            //    22: iconst_1       
            //    23: putfield        rx/internal/operators/x2$b.L:Z
            //    26: aload_0        
            //    27: iconst_0       
            //    28: putfield        rx/internal/operators/x2$b.M:Z
            //    31: aload_0        
            //    32: monitorexit    
            //    33: aload_0        
            //    34: invokevirtual   java/util/concurrent/atomic/AtomicLong.get:()J
            //    37: lstore_3       
            //    38: lload_3        
            //    39: ldc2_w          -9223372036854775808
            //    42: lcmp           
            //    43: ifne            49
            //    46: goto            182
            //    49: aload_0        
            //    50: getfield        rx/internal/operators/x2$b.I:Ljava/util/concurrent/atomic/AtomicReference;
            //    53: invokevirtual   java/util/concurrent/atomic/AtomicReference.get:()Ljava/lang/Object;
            //    56: astore          5
            //    58: aload           5
            //    60: astore          6
            //    62: lload_3        
            //    63: lconst_0       
            //    64: lcmp           
            //    65: ifle            117
            //    68: getstatic       rx/internal/operators/x2$b.O:Ljava/lang/Object;
            //    71: astore          7
            //    73: aload           5
            //    75: astore          6
            //    77: aload           5
            //    79: aload           7
            //    81: if_acmpeq       117
            //    84: aload_0        
            //    85: getfield        rx/internal/operators/x2$b.G:Lrx/n;
            //    88: aload           5
            //    90: invokeinterface rx/h.m:(Ljava/lang/Object;)V
            //    95: aload_0        
            //    96: getfield        rx/internal/operators/x2$b.I:Ljava/util/concurrent/atomic/AtomicReference;
            //    99: aload           5
            //   101: aload           7
            //   103: invokevirtual   java/util/concurrent/atomic/AtomicReference.compareAndSet:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //   106: pop            
            //   107: aload_0        
            //   108: lconst_1       
            //   109: invokevirtual   rx/internal/operators/x2$b.j:(J)J
            //   112: pop2           
            //   113: aload           7
            //   115: astore          6
            //   117: aload           6
            //   119: getstatic       rx/internal/operators/x2$b.O:Ljava/lang/Object;
            //   122: if_acmpne       166
            //   125: aload_0        
            //   126: getfield        rx/internal/operators/x2$b.K:Z
            //   129: ifeq            166
            //   132: aload_0        
            //   133: getfield        rx/internal/operators/x2$b.J:Ljava/lang/Throwable;
            //   136: astore          6
            //   138: aload           6
            //   140: ifnull          157
            //   143: aload_0        
            //   144: getfield        rx/internal/operators/x2$b.G:Lrx/n;
            //   147: aload           6
            //   149: invokeinterface rx/h.b:(Ljava/lang/Throwable;)V
            //   154: goto            166
            //   157: aload_0        
            //   158: getfield        rx/internal/operators/x2$b.G:Lrx/n;
            //   161: invokeinterface rx/h.c:()V
            //   166: aload_0        
            //   167: monitorenter   
            //   168: aload_0        
            //   169: getfield        rx/internal/operators/x2$b.M:Z
            //   172: ifne            183
            //   175: aload_0        
            //   176: iconst_0       
            //   177: putfield        rx/internal/operators/x2$b.L:Z
            //   180: aload_0        
            //   181: monitorexit    
            //   182: return         
            //   183: aload_0        
            //   184: iconst_0       
            //   185: putfield        rx/internal/operators/x2$b.M:Z
            //   188: aload_0        
            //   189: monitorexit    
            //   190: goto            33
            //   193: astore          6
            //   195: iconst_0       
            //   196: istore          8
            //   198: iload           8
            //   200: istore_2       
            //   201: aload_0        
            //   202: monitorexit    
            //   203: aload           6
            //   205: athrow         
            //   206: astore          6
            //   208: goto            224
            //   211: astore          6
            //   213: iload_2        
            //   214: istore          8
            //   216: goto            198
            //   219: astore          6
            //   221: iconst_0       
            //   222: istore          8
            //   224: iload           8
            //   226: ifne            248
            //   229: aload_0        
            //   230: monitorenter   
            //   231: aload_0        
            //   232: iconst_0       
            //   233: putfield        rx/internal/operators/x2$b.L:Z
            //   236: aload_0        
            //   237: monitorexit    
            //   238: goto            248
            //   241: astore          6
            //   243: aload_0        
            //   244: monitorexit    
            //   245: aload           6
            //   247: athrow         
            //   248: aload           6
            //   250: athrow         
            //   251: astore          6
            //   253: aload_0        
            //   254: monitorexit    
            //   255: aload           6
            //   257: athrow         
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type
            //  -----  -----  -----  -----  ----
            //  2      7      251    258    Any
            //  13     20     251    258    Any
            //  21     33     251    258    Any
            //  33     38     219    224    Any
            //  49     58     219    224    Any
            //  68     73     219    224    Any
            //  84     113    219    224    Any
            //  117    138    219    224    Any
            //  143    154    219    224    Any
            //  157    166    219    224    Any
            //  166    168    219    224    Any
            //  168    180    193    198    Any
            //  180    182    211    219    Any
            //  183    190    193    198    Any
            //  201    203    211    219    Any
            //  203    206    206    211    Any
            //  231    238    241    248    Any
            //  243    245    241    248    Any
            //  253    255    251    258    Any
            // 
            // The error that occurred was:
            // 
            // java.lang.IllegalStateException: Expression is linked from several locations: Label_0182:
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
        public void i() {
            if (this.get() >= 0L) {
                this.getAndSet(Long.MIN_VALUE);
            }
        }
        
        long j(final long n) {
            long value;
            long newValue;
            do {
                value = this.get();
                if (value < 0L) {
                    return value;
                }
                newValue = value - n;
            } while (!this.compareAndSet(value, newValue));
            return newValue;
        }
        
        @Override
        public void m(final T newValue) {
            this.I.lazySet(newValue);
            this.h();
        }
        
        @Override
        public void v(final long n) {
            if (n >= 0L) {
                long value;
                long newValue;
                long n2;
                do {
                    value = this.get();
                    if (value == Long.MIN_VALUE) {
                        return;
                    }
                    n2 = lcmp(value, -4611686018427387904L);
                    if (n2 == 0) {
                        newValue = n;
                    }
                    else {
                        if ((newValue = value + n) >= 0L) {
                            continue;
                        }
                        newValue = Long.MAX_VALUE;
                    }
                } while (!this.compareAndSet(value, newValue));
                if (n2 == 0) {
                    this.H.w(Long.MAX_VALUE);
                }
                this.h();
            }
        }
    }
    
    static final class c<T> extends n<T>
    {
        private final b<T> L;
        
        c(final b<T> l) {
            this.L = l;
        }
        
        @Override
        public void b(final Throwable t) {
            this.L.b(t);
        }
        
        @Override
        public void c() {
            this.L.c();
        }
        
        @Override
        public void f() {
            this.v(0L);
        }
        
        @Override
        public void m(final T t) {
            this.L.m(t);
        }
        
        void w(final long n) {
            this.v(n);
        }
    }
}
