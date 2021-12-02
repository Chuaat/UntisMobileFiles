// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.d;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.disposables.c;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Iterator;
import io.reactivex.internal.disposables.e;
import io.reactivex.i0;
import x5.o;
import io.reactivex.g0;
import io.reactivex.b0;

public final class l4<T, R> extends b0<R>
{
    final g0<? extends T>[] G;
    final Iterable<? extends g0<? extends T>> H;
    final o<? super Object[], ? extends R> I;
    final int J;
    final boolean K;
    
    public l4(final g0<? extends T>[] g, final Iterable<? extends g0<? extends T>> h, final o<? super Object[], ? extends R> i, final int j, final boolean k) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
    }
    
    public void L5(final i0<? super R> i0) {
        g0<? extends T>[] g = this.G;
        int length;
        if (g == null) {
            g0<? extends T>[] array = (g0<? extends T>[])new b0[8];
            final Iterator<? extends g0<? extends T>> iterator = this.H.iterator();
            int n = 0;
            while (true) {
                g = array;
                length = n;
                if (!iterator.hasNext()) {
                    break;
                }
                final g0<? extends T> g2 = (g0<? extends T>)iterator.next();
                g0<? extends T>[] array2 = array;
                if (n == array.length) {
                    array2 = (g0<? extends T>[])new g0[(n >> 2) + n];
                    System.arraycopy(array, 0, array2, 0, n);
                }
                array2[n] = g2;
                ++n;
                array = array2;
            }
        }
        else {
            length = g.length;
        }
        if (length == 0) {
            e.f(i0);
            return;
        }
        new a((i0<? super Object>)i0, this.I, length, this.K).f((g0[])g, this.J);
    }
    
    static final class a<T, R> extends AtomicInteger implements c
    {
        private static final long M = 2983708048395377667L;
        final i0<? super R> G;
        final o<? super Object[], ? extends R> H;
        final b<T, R>[] I;
        final T[] J;
        final boolean K;
        volatile boolean L;
        
        a(final i0<? super R> g, final o<? super Object[], ? extends R> h, final int n, final boolean k) {
            this.G = g;
            this.H = h;
            this.I = (b<T, R>[])new b[n];
            this.J = (T[])new Object[n];
            this.K = k;
        }
        
        void a() {
            this.d();
            this.b();
        }
        
        void b() {
            final b<T, R>[] i = this.I;
            for (int length = i.length, j = 0; j < length; ++j) {
                i[j].a();
            }
        }
        
        boolean c(final boolean b, final boolean b2, final i0<? super R> i0, final boolean b3, final b<?, ?> b4) {
            if (this.L) {
                this.a();
                return true;
            }
            if (b) {
                if (b3) {
                    if (b2) {
                        final Throwable j = b4.J;
                        this.L = true;
                        this.a();
                        if (j != null) {
                            i0.b(j);
                        }
                        else {
                            i0.f();
                        }
                        return true;
                    }
                }
                else {
                    final Throwable k = b4.J;
                    if (k != null) {
                        this.L = true;
                        this.a();
                        i0.b(k);
                        return true;
                    }
                    if (b2) {
                        this.L = true;
                        this.a();
                        i0.f();
                        return true;
                    }
                }
            }
            return false;
        }
        
        void d() {
            final b<T, R>[] i = this.I;
            for (int length = i.length, j = 0; j < length; ++j) {
                i[j].H.clear();
            }
        }
        
        @Override
        public void dispose() {
            if (!this.L) {
                this.L = true;
                this.b();
                if (this.getAndIncrement() == 0) {
                    this.d();
                }
            }
        }
        
        public void e() {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: invokevirtual   java/util/concurrent/atomic/AtomicInteger.getAndIncrement:()I
            //     4: ifeq            8
            //     7: return         
            //     8: aload_0        
            //     9: getfield        io/reactivex/internal/operators/observable/l4$a.I:[Lio/reactivex/internal/operators/observable/l4$b;
            //    12: astore_1       
            //    13: aload_0        
            //    14: getfield        io/reactivex/internal/operators/observable/l4$a.G:Lio/reactivex/i0;
            //    17: astore_2       
            //    18: aload_0        
            //    19: getfield        io/reactivex/internal/operators/observable/l4$a.J:[Ljava/lang/Object;
            //    22: astore_3       
            //    23: aload_0        
            //    24: getfield        io/reactivex/internal/operators/observable/l4$a.K:Z
            //    27: istore          4
            //    29: iconst_1       
            //    30: istore          5
            //    32: aload_1        
            //    33: arraylength    
            //    34: istore          6
            //    36: iconst_0       
            //    37: istore          7
            //    39: iconst_0       
            //    40: istore          8
            //    42: iconst_0       
            //    43: istore          9
            //    45: iload           7
            //    47: iload           6
            //    49: if_icmpge       208
            //    52: aload_1        
            //    53: iload           7
            //    55: aaload         
            //    56: astore          10
            //    58: aload_3        
            //    59: iload           9
            //    61: aaload         
            //    62: ifnonnull       140
            //    65: aload           10
            //    67: getfield        io/reactivex/internal/operators/observable/l4$b.I:Z
            //    70: istore          11
            //    72: aload           10
            //    74: getfield        io/reactivex/internal/operators/observable/l4$b.H:Lio/reactivex/internal/queue/c;
            //    77: invokevirtual   io/reactivex/internal/queue/c.poll:()Ljava/lang/Object;
            //    80: astore          12
            //    82: aload           12
            //    84: ifnonnull       93
            //    87: iconst_1       
            //    88: istore          13
            //    90: goto            96
            //    93: iconst_0       
            //    94: istore          13
            //    96: aload_0        
            //    97: iload           11
            //    99: iload           13
            //   101: aload_2        
            //   102: iload           4
            //   104: aload           10
            //   106: invokevirtual   io/reactivex/internal/operators/observable/l4$a.c:(ZZLio/reactivex/i0;ZLio/reactivex/internal/operators/observable/l4$b;)Z
            //   109: ifeq            113
            //   112: return         
            //   113: iload           13
            //   115: ifne            131
            //   118: aload_3        
            //   119: iload           9
            //   121: aload           12
            //   123: aastore        
            //   124: iload           8
            //   126: istore          14
            //   128: goto            195
            //   131: iload           8
            //   133: iconst_1       
            //   134: iadd           
            //   135: istore          14
            //   137: goto            195
            //   140: iload           8
            //   142: istore          14
            //   144: aload           10
            //   146: getfield        io/reactivex/internal/operators/observable/l4$b.I:Z
            //   149: ifeq            195
            //   152: iload           8
            //   154: istore          14
            //   156: iload           4
            //   158: ifne            195
            //   161: aload           10
            //   163: getfield        io/reactivex/internal/operators/observable/l4$b.J:Ljava/lang/Throwable;
            //   166: astore          12
            //   168: iload           8
            //   170: istore          14
            //   172: aload           12
            //   174: ifnull          195
            //   177: aload_0        
            //   178: iconst_1       
            //   179: putfield        io/reactivex/internal/operators/observable/l4$a.L:Z
            //   182: aload_0        
            //   183: invokevirtual   io/reactivex/internal/operators/observable/l4$a.a:()V
            //   186: aload_2        
            //   187: aload           12
            //   189: invokeinterface io/reactivex/i0.b:(Ljava/lang/Throwable;)V
            //   194: return         
            //   195: iinc            9, 1
            //   198: iinc            7, 1
            //   201: iload           14
            //   203: istore          8
            //   205: goto            45
            //   208: iload           8
            //   210: ifeq            232
            //   213: aload_0        
            //   214: iload           5
            //   216: ineg           
            //   217: invokevirtual   java/util/concurrent/atomic/AtomicInteger.addAndGet:(I)I
            //   220: istore          9
            //   222: iload           9
            //   224: istore          5
            //   226: iload           9
            //   228: ifne            32
            //   231: return         
            //   232: aload_0        
            //   233: getfield        io/reactivex/internal/operators/observable/l4$a.H:Lx5/o;
            //   236: aload_3        
            //   237: invokevirtual   [java/lang/Object.clone:()Ljava/lang/Object;
            //   240: invokeinterface x5/o.apply:(Ljava/lang/Object;)Ljava/lang/Object;
            //   245: ldc             "The zipper returned a null value"
            //   247: invokestatic    io/reactivex/internal/functions/b.g:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
            //   250: astore          12
            //   252: aload_2        
            //   253: aload           12
            //   255: invokeinterface io/reactivex/i0.m:(Ljava/lang/Object;)V
            //   260: aload_3        
            //   261: aconst_null    
            //   262: invokestatic    java/util/Arrays.fill:([Ljava/lang/Object;Ljava/lang/Object;)V
            //   265: goto            32
            //   268: astore_1       
            //   269: aload_1        
            //   270: invokestatic    io/reactivex/exceptions/b.b:(Ljava/lang/Throwable;)V
            //   273: aload_0        
            //   274: invokevirtual   io/reactivex/internal/operators/observable/l4$a.a:()V
            //   277: aload_2        
            //   278: aload_1        
            //   279: invokeinterface io/reactivex/i0.b:(Ljava/lang/Throwable;)V
            //   284: return         
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type
            //  -----  -----  -----  -----  ----
            //  232    252    268    285    Any
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
        
        public void f(final g0<? extends T>[] array, int i) {
            final b<T, R>[] j = this.I;
            final int length = j.length;
            final int n = 0;
            for (int k = 0; k < length; ++k) {
                j[k] = (b<T, R>)new b((a<Object, Object>)this, i);
            }
            this.lazySet(0);
            this.G.l(this);
            for (i = n; i < length; ++i) {
                if (this.L) {
                    return;
                }
                array[i].c(j[i]);
            }
        }
        
        @Override
        public boolean i() {
            return this.L;
        }
    }
    
    static final class b<T, R> implements i0<T>
    {
        final a<T, R> G;
        final io.reactivex.internal.queue.c<T> H;
        volatile boolean I;
        Throwable J;
        final AtomicReference<c> K;
        
        b(final a<T, R> g, final int n) {
            this.K = new AtomicReference<c>();
            this.G = g;
            this.H = new io.reactivex.internal.queue.c<T>(n);
        }
        
        public void a() {
            d.b(this.K);
        }
        
        @Override
        public void b(final Throwable j) {
            this.J = j;
            this.I = true;
            this.G.e();
        }
        
        @Override
        public void f() {
            this.I = true;
            this.G.e();
        }
        
        @Override
        public void l(final c c) {
            d.j(this.K, c);
        }
        
        @Override
        public void m(final T t) {
            this.H.offer(t);
            this.G.e();
        }
    }
}
