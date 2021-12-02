// 
// Decompiled by Procyon v0.5.36
// 

package rx.subjects;

import java.util.ArrayList;
import rx.internal.operators.x;
import java.util.List;
import rx.h;
import rx.subscriptions.f;
import rx.functions.a;
import rx.n;
import rx.functions.m;
import rx.functions.b;
import java.util.concurrent.atomic.AtomicReference;

final class g<T> extends AtomicReference<b<T>> implements a<T>
{
    private static final long L = 6035251036011671568L;
    volatile Object G;
    boolean H;
    rx.functions.b<c<T>> I;
    rx.functions.b<c<T>> J;
    rx.functions.b<c<T>> K;
    
    public g() {
        super(b.e);
        this.H = true;
        this.I = (rx.functions.b<c<T>>)m.a();
        this.J = (rx.functions.b<c<T>>)m.a();
        this.K = (rx.functions.b<c<T>>)m.a();
    }
    
    boolean a(final c<T> c) {
        b<T> expectedValue;
        do {
            expectedValue = this.get();
            if (expectedValue.a) {
                this.K.h(c);
                return false;
            }
        } while (!this.compareAndSet(expectedValue, expectedValue.a((c)c)));
        this.J.h(c);
        return true;
    }
    
    void b(final n<? super T> n, final c<T> c) {
        n.r(f.a(new rx.functions.a() {
            @Override
            public void call() {
                g.this.g(c);
            }
        }));
    }
    
    public void c(final n<? super T> n) {
        final c c = new c<T>((n<? super Object>)n);
        this.b(n, (c<T>)c);
        this.I.h((c<T>)c);
        if (!n.g() && this.a((c<T>)c) && n.g()) {
            this.g((c<T>)c);
        }
    }
    
    Object d() {
        return this.G;
    }
    
    c<T>[] e(final Object o) {
        this.i(o);
        return (c<T>[])this.get().b;
    }
    
    c<T>[] f() {
        return (c<T>[])this.get().b;
    }
    
    void g(final c<T> c) {
        b<T> b;
        b<T> expectedValue;
        do {
            expectedValue = this.get();
            if (expectedValue.a) {
                return;
            }
            b = expectedValue.b((c)c);
        } while (b != expectedValue && !this.compareAndSet(expectedValue, b));
    }
    
    void i(final Object g) {
        this.G = g;
    }
    
    c<T>[] m(final Object o) {
        this.i(o);
        this.H = false;
        if (this.get().a) {
            return (c<T>[])b.c;
        }
        return (c<T>[])this.getAndSet(b.d).b;
    }
    
    protected static final class b<T>
    {
        static final c[] c;
        static final b d;
        static final b e;
        final boolean a;
        final c[] b;
        
        static {
            final c[] array = c = new c[0];
            d = new b(true, array);
            e = new b(false, array);
        }
        
        public b(final boolean a, final c[] b) {
            this.a = a;
            this.b = b;
        }
        
        public b a(final c c) {
            final c[] b = this.b;
            final int length = b.length;
            final c[] array = new c[length + 1];
            System.arraycopy(b, 0, array, 0, length);
            array[length] = c;
            return new b(this.a, array);
        }
        
        public b b(final c c) {
            final c[] b = this.b;
            final int length = b.length;
            if (length == 1 && b[0] == c) {
                return g.b.e;
            }
            if (length == 0) {
                return this;
            }
            final int n = length - 1;
            final c[] array = new c[n];
            int i = 0;
            int n2 = 0;
            while (i < length) {
                final c c2 = b[i];
                int n3 = n2;
                if (c2 != c) {
                    if (n2 == n) {
                        return this;
                    }
                    array[n2] = c2;
                    n3 = n2 + 1;
                }
                ++i;
                n2 = n3;
            }
            if (n2 == 0) {
                return g.b.e;
            }
            c[] array2 = array;
            if (n2 < n) {
                array2 = new c[n2];
                System.arraycopy(array, 0, array2, 0, n2);
            }
            return new b(this.a, array2);
        }
    }
    
    protected static final class c<T> implements h<T>
    {
        final n<? super T> G;
        boolean H;
        boolean I;
        List<Object> J;
        boolean K;
        volatile boolean L;
        private volatile Object M;
        
        public c(final n<? super T> g) {
            this.H = true;
            this.G = g;
        }
        
        @Override
        public void b(final Throwable t) {
            this.G.b(t);
        }
        
        @Override
        public void c() {
            this.G.c();
        }
        
        void h(final Object o) {
            if (o != null) {
                x.a((h<? super Object>)this.G, o);
            }
        }
        
        void j(final Object o) {
            synchronized (this) {
                if (this.H && !this.I) {
                    boolean i = false;
                    this.H = false;
                    if (o != null) {
                        i = true;
                    }
                    this.I = i;
                    // monitorexit(this)
                    if (o != null) {
                        this.k(null, o);
                    }
                }
            }
        }
        
        void k(final List<Object> p0, final Object p1) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     2: iconst_1       
            //     3: istore          4
            //     5: aload_1        
            //     6: ifnull          45
            //     9: aload_1        
            //    10: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
            //    15: astore_1       
            //    16: aload_1        
            //    17: invokeinterface java/util/Iterator.hasNext:()Z
            //    22: ifeq            45
            //    25: aload_0        
            //    26: aload_1        
            //    27: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
            //    32: invokevirtual   rx/subjects/g$c.h:(Ljava/lang/Object;)V
            //    35: goto            16
            //    38: astore_1       
            //    39: iconst_0       
            //    40: istore          5
            //    42: goto            122
            //    45: iload           4
            //    47: istore          5
            //    49: iload           4
            //    51: ifeq            62
            //    54: aload_0        
            //    55: aload_2        
            //    56: invokevirtual   rx/subjects/g$c.h:(Ljava/lang/Object;)V
            //    59: iconst_0       
            //    60: istore          5
            //    62: aload_0        
            //    63: monitorenter   
            //    64: aload_0        
            //    65: getfield        rx/subjects/g$c.J:Ljava/util/List;
            //    68: astore_1       
            //    69: aload_0        
            //    70: aconst_null    
            //    71: putfield        rx/subjects/g$c.J:Ljava/util/List;
            //    74: aload_1        
            //    75: ifnonnull       89
            //    78: aload_0        
            //    79: iconst_0       
            //    80: putfield        rx/subjects/g$c.I:Z
            //    83: iload_3        
            //    84: istore          4
            //    86: aload_0        
            //    87: monitorexit    
            //    88: return         
            //    89: aload_0        
            //    90: monitorexit    
            //    91: iload           5
            //    93: istore          4
            //    95: goto            5
            //    98: astore_1       
            //    99: iconst_0       
            //   100: istore          5
            //   102: iload           5
            //   104: istore          4
            //   106: aload_0        
            //   107: monitorexit    
            //   108: aload_1        
            //   109: athrow         
            //   110: astore_1       
            //   111: goto            122
            //   114: astore_1       
            //   115: iload           4
            //   117: istore          5
            //   119: goto            102
            //   122: iload           5
            //   124: ifne            144
            //   127: aload_0        
            //   128: monitorenter   
            //   129: aload_0        
            //   130: iconst_0       
            //   131: putfield        rx/subjects/g$c.I:Z
            //   134: aload_0        
            //   135: monitorexit    
            //   136: goto            144
            //   139: astore_1       
            //   140: aload_0        
            //   141: monitorexit    
            //   142: aload_1        
            //   143: athrow         
            //   144: aload_1        
            //   145: athrow         
            //    Signature:
            //  (Ljava/util/List<Ljava/lang/Object;>;Ljava/lang/Object;)V
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type
            //  -----  -----  -----  -----  ----
            //  9      16     38     45     Any
            //  16     35     38     45     Any
            //  54     59     38     45     Any
            //  62     64     38     45     Any
            //  64     74     98     102    Any
            //  78     83     98     102    Any
            //  86     88     114    122    Any
            //  89     91     98     102    Any
            //  106    108    114    122    Any
            //  108    110    110    114    Any
            //  129    136    139    144    Any
            //  140    142    139    144    Any
            // 
            // The error that occurred was:
            // 
            // java.lang.IllegalStateException: Expression is linked from several locations: Label_0089:
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
        
        void l(final Object o) {
            if (!this.K) {
                synchronized (this) {
                    this.H = false;
                    if (this.I) {
                        if (this.J == null) {
                            this.J = new ArrayList<Object>();
                        }
                        this.J.add(o);
                        return;
                    }
                    // monitorexit(this)
                    this.K = true;
                }
            }
            x.a((h<? super Object>)this.G, o);
        }
        
        @Override
        public void m(final T t) {
            this.G.m((Object)t);
        }
        
        h<? super T> n() {
            return this.G;
        }
        
        public <I> I o() {
            return (I)this.M;
        }
        
        public void p(final Object m) {
            this.M = m;
        }
    }
}
