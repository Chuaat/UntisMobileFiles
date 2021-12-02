// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.q;
import io.reactivex.internal.util.d;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.plugins.a;
import io.reactivex.internal.util.k;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicLong;
import o7.c;
import io.reactivex.annotations.f;
import x5.o;
import o7.b;
import io.reactivex.annotations.g;
import org.reactivestreams.Publisher;
import io.reactivex.l;

public final class u<T, R> extends l<R>
{
    @g
    final Publisher<? extends T>[] H;
    @g
    final Iterable<? extends o7.b<? extends T>> I;
    final o<? super Object[], ? extends R> J;
    final int K;
    final boolean L;
    
    public u(@f final Iterable<? extends o7.b<? extends T>> i, @f final o<? super Object[], ? extends R> j, final int k, final boolean l) {
        this.H = null;
        this.I = i;
        this.J = j;
        this.K = k;
        this.L = l;
    }
    
    public u(@f final Publisher<? extends T>[] h, @f final o<? super Object[], ? extends R> j, final int k, final boolean l) {
        this.H = (o7.b[])h;
        this.I = null;
        this.J = j;
        this.K = k;
        this.L = l;
    }
    
    public void n6(final o7.c<? super R> p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        io/reactivex/internal/operators/flowable/u.H:[Lo7/b;
        //     4: astore_2       
        //     5: aload_2        
        //     6: ifnonnull       149
        //     9: bipush          8
        //    11: anewarray       Lo7/b;
        //    14: astore_2       
        //    15: aload_0        
        //    16: getfield        io/reactivex/internal/operators/flowable/u.I:Ljava/lang/Iterable;
        //    19: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    24: ldc             "The iterator returned is null"
        //    26: invokestatic    io/reactivex/internal/functions/b.g:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
        //    29: checkcast       Ljava/util/Iterator;
        //    32: astore_3       
        //    33: iconst_0       
        //    34: istore          4
        //    36: aload_3        
        //    37: invokeinterface java/util/Iterator.hasNext:()Z
        //    42: istore          5
        //    44: iload           5
        //    46: ifne            52
        //    49: goto            153
        //    52: aload_3        
        //    53: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    58: ldc             "The publisher returned by the iterator is null"
        //    60: invokestatic    io/reactivex/internal/functions/b.g:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
        //    63: checkcast       Lo7/b;
        //    66: astore          6
        //    68: aload_2        
        //    69: astore          7
        //    71: iload           4
        //    73: aload_2        
        //    74: arraylength    
        //    75: if_icmpne       100
        //    78: iload           4
        //    80: iconst_2       
        //    81: ishr           
        //    82: iload           4
        //    84: iadd           
        //    85: anewarray       Lo7/b;
        //    88: astore          7
        //    90: aload_2        
        //    91: iconst_0       
        //    92: aload           7
        //    94: iconst_0       
        //    95: iload           4
        //    97: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //   100: aload           7
        //   102: iload           4
        //   104: aload           6
        //   106: aastore        
        //   107: iinc            4, 1
        //   110: aload           7
        //   112: astore_2       
        //   113: goto            36
        //   116: astore_2       
        //   117: aload_2        
        //   118: invokestatic    io/reactivex/exceptions/b.b:(Ljava/lang/Throwable;)V
        //   121: aload_2        
        //   122: aload_1        
        //   123: invokestatic    io/reactivex/internal/subscriptions/g.d:(Ljava/lang/Throwable;Lo7/c;)V
        //   126: return         
        //   127: astore_2       
        //   128: aload_2        
        //   129: invokestatic    io/reactivex/exceptions/b.b:(Ljava/lang/Throwable;)V
        //   132: aload_2        
        //   133: aload_1        
        //   134: invokestatic    io/reactivex/internal/subscriptions/g.d:(Ljava/lang/Throwable;Lo7/c;)V
        //   137: return         
        //   138: astore_2       
        //   139: aload_2        
        //   140: invokestatic    io/reactivex/exceptions/b.b:(Ljava/lang/Throwable;)V
        //   143: aload_2        
        //   144: aload_1        
        //   145: invokestatic    io/reactivex/internal/subscriptions/g.d:(Ljava/lang/Throwable;Lo7/c;)V
        //   148: return         
        //   149: aload_2        
        //   150: arraylength    
        //   151: istore          4
        //   153: iload           4
        //   155: ifne            163
        //   158: aload_1        
        //   159: invokestatic    io/reactivex/internal/subscriptions/g.b:(Lo7/c;)V
        //   162: return         
        //   163: iload           4
        //   165: iconst_1       
        //   166: if_icmpne       194
        //   169: aload_2        
        //   170: iconst_0       
        //   171: aaload         
        //   172: new             Lio/reactivex/internal/operators/flowable/b2$b;
        //   175: dup            
        //   176: aload_1        
        //   177: new             Lio/reactivex/internal/operators/flowable/u$c;
        //   180: dup            
        //   181: aload_0        
        //   182: invokespecial   io/reactivex/internal/operators/flowable/u$c.<init>:(Lio/reactivex/internal/operators/flowable/u;)V
        //   185: invokespecial   io/reactivex/internal/operators/flowable/b2$b.<init>:(Lo7/c;Lx5/o;)V
        //   188: invokeinterface o7/b.e:(Lo7/c;)V
        //   193: return         
        //   194: new             Lio/reactivex/internal/operators/flowable/u$a;
        //   197: dup            
        //   198: aload_1        
        //   199: aload_0        
        //   200: getfield        io/reactivex/internal/operators/flowable/u.J:Lx5/o;
        //   203: iload           4
        //   205: aload_0        
        //   206: getfield        io/reactivex/internal/operators/flowable/u.K:I
        //   209: aload_0        
        //   210: getfield        io/reactivex/internal/operators/flowable/u.L:Z
        //   213: invokespecial   io/reactivex/internal/operators/flowable/u$a.<init>:(Lo7/c;Lx5/o;IIZ)V
        //   216: astore          7
        //   218: aload_1        
        //   219: aload           7
        //   221: invokeinterface o7/c.z:(Lo7/d;)V
        //   226: aload           7
        //   228: aload_2        
        //   229: iload           4
        //   231: invokevirtual   io/reactivex/internal/operators/flowable/u$a.t:([Lo7/b;I)V
        //   234: return         
        //    Signature:
        //  (Lo7/c<-TR;>;)V
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  15     33     138    149    Any
        //  36     44     127    138    Any
        //  52     68     116    127    Any
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
    
    static final class a<T, R> extends io.reactivex.internal.subscriptions.c<R>
    {
        private static final long U = -5082275438355852221L;
        final c<? super R> H;
        final x5.o<? super Object[], ? extends R> I;
        final b<T>[] J;
        final io.reactivex.internal.queue.c<Object> K;
        final Object[] L;
        final boolean M;
        boolean N;
        int O;
        int P;
        volatile boolean Q;
        final AtomicLong R;
        volatile boolean S;
        final AtomicReference<Throwable> T;
        
        a(final c<? super R> h, final x5.o<? super Object[], ? extends R> i, final int n, final int n2, final boolean m) {
            this.H = h;
            this.I = i;
            final b[] j = new b[n];
            for (int k = 0; k < n; ++k) {
                j[k] = new b((a<Object, ?>)this, k, n2);
            }
            this.J = (b<T>[])j;
            this.L = new Object[n];
            this.K = new io.reactivex.internal.queue.c<Object>(n2);
            this.R = new AtomicLong();
            this.T = new AtomicReference<Throwable>();
            this.M = m;
        }
        
        @Override
        public int E(int n) {
            boolean n2 = false;
            if ((n & 0x4) != 0x0) {
                return 0;
            }
            n &= 0x2;
            if (n != 0) {
                n2 = true;
            }
            this.N = n2;
            return n;
        }
        
        void c() {
            if (this.getAndIncrement() != 0) {
                return;
            }
            if (this.N) {
                this.n();
            }
            else {
                this.j();
            }
        }
        
        public void cancel() {
            this.Q = true;
            this.g();
        }
        
        public void clear() {
            this.K.clear();
        }
        
        void g() {
            final b<T>[] j = this.J;
            for (int length = j.length, i = 0; i < length; ++i) {
                j[i].a();
            }
        }
        
        boolean i(final boolean b, final boolean b2, final c<?> c, final io.reactivex.internal.queue.c<?> c2) {
            if (this.Q) {
                this.g();
                c2.clear();
                return true;
            }
            if (b) {
                if (this.M) {
                    if (b2) {
                        this.g();
                        final Throwable c3 = io.reactivex.internal.util.k.c(this.T);
                        if (c3 != null && c3 != io.reactivex.internal.util.k.a) {
                            c.b(c3);
                        }
                        else {
                            c.f();
                        }
                        return true;
                    }
                }
                else {
                    final Throwable c4 = io.reactivex.internal.util.k.c(this.T);
                    if (c4 != null && c4 != io.reactivex.internal.util.k.a) {
                        this.g();
                        c2.clear();
                        c.b(c4);
                        return true;
                    }
                    if (b2) {
                        this.g();
                        c.f();
                        return true;
                    }
                }
            }
            return false;
        }
        
        public boolean isEmpty() {
            return this.K.isEmpty();
        }
        
        void j() {
            final c<? super R> h = this.H;
            final io.reactivex.internal.queue.c<Object> k = this.K;
            int addAndGet = 1;
            do {
                final long value = this.R.get();
                long n = 0L;
                long n2;
                while (true) {
                    n2 = lcmp(n, value);
                    if (n2 == 0) {
                        break;
                    }
                    final boolean s = this.S;
                    final b poll = k.poll();
                    final boolean b = poll == null;
                    if (this.i(s, b, h, k)) {
                        return;
                    }
                    if (b) {
                        break;
                    }
                    final Object[] array = k.poll();
                    try {
                        h.m(io.reactivex.internal.functions.b.g((Object)this.I.apply(array), "The combiner returned a null value"));
                        poll.c();
                        ++n;
                        continue;
                    }
                    finally {
                        final Throwable t;
                        io.reactivex.exceptions.b.b(t);
                        this.g();
                        io.reactivex.internal.util.k.a(this.T, t);
                        h.b(io.reactivex.internal.util.k.c(this.T));
                        return;
                    }
                    break;
                }
                if (n2 == 0 && this.i(this.S, k.isEmpty(), h, k)) {
                    return;
                }
                if (n == 0L || value == Long.MAX_VALUE) {
                    continue;
                }
                this.R.addAndGet(-n);
            } while ((addAndGet = this.addAndGet(-addAndGet)) != 0);
        }
        
        void n() {
            final c<? super R> h = this.H;
            final io.reactivex.internal.queue.c<Object> k = this.K;
            int addAndGet = 1;
            while (!this.Q) {
                final Throwable t = this.T.get();
                if (t != null) {
                    k.clear();
                    h.b(t);
                    return;
                }
                final boolean s = this.S;
                final boolean empty = k.isEmpty();
                if (!empty) {
                    h.m((Object)null);
                }
                if (s && empty) {
                    h.f();
                    return;
                }
                if ((addAndGet = this.addAndGet(-addAndGet)) == 0) {
                    return;
                }
            }
            k.clear();
        }
        
        @g
        public R poll() throws Exception {
            final b poll = this.K.poll();
            if (poll == null) {
                return null;
            }
            final R g = io.reactivex.internal.functions.b.g((R)this.I.apply(this.K.poll()), "The combiner returned a null value");
            poll.c();
            return g;
        }
        
        void q(int p) {
            synchronized (this) {
                final Object[] l = this.L;
                if (l[p] != null) {
                    p = this.P + 1;
                    if (p != l.length) {
                        this.P = p;
                        return;
                    }
                }
                this.S = true;
                // monitorexit(this)
                this.c();
            }
        }
        
        void r(final int n, final Throwable t) {
            if (io.reactivex.internal.util.k.a(this.T, t)) {
                if (!this.M) {
                    this.g();
                    this.S = true;
                    this.c();
                }
                else {
                    this.q(n);
                }
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        void s(final int n, final T t) {
            synchronized (this) {
                final Object[] l = this.L;
                int o;
                final int n2 = o = this.O;
                if (l[n] == null) {
                    o = n2 + 1;
                    this.O = o;
                }
                l[n] = t;
                boolean b;
                if (l.length == o) {
                    this.K.p(this.J[n], l.clone());
                    b = false;
                }
                else {
                    b = true;
                }
                // monitorexit(this)
                if (b) {
                    this.J[n].c();
                }
                else {
                    this.c();
                }
            }
        }
        
        void t(final Publisher<? extends T>[] array, final int n) {
            final b<T>[] j = this.J;
            for (int n2 = 0; n2 < n && !this.S && !this.Q; ++n2) {
                ((o7.b)array[n2]).e((c)j[n2]);
            }
        }
        
        public void v(final long n) {
            if (j.m(n)) {
                d.a(this.R, n);
                this.c();
            }
        }
    }
    
    static final class b<T> extends AtomicReference<o7.d> implements q<T>
    {
        private static final long L = -8730235182291002949L;
        final a<T, ?> G;
        final int H;
        final int I;
        final int J;
        int K;
        
        b(final a<T, ?> g, final int h, final int i) {
            this.G = g;
            this.H = h;
            this.I = i;
            this.J = i - (i >> 2);
        }
        
        public void a() {
            j.b(this);
        }
        
        public void b(final Throwable t) {
            this.G.r(this.H, t);
        }
        
        public void c() {
            final int k = this.K + 1;
            if (k == this.J) {
                this.K = 0;
                this.get().v((long)k);
            }
            else {
                this.K = k;
            }
        }
        
        public void f() {
            this.G.q(this.H);
        }
        
        public void m(final T t) {
            this.G.s(this.H, t);
        }
        
        @Override
        public void z(final o7.d d) {
            j.l(this, d, this.I);
        }
    }
    
    final class c implements o<T, R>
    {
        @Override
        public R apply(final T t) throws Exception {
            return (R)u.this.J.apply(new Object[] { t });
        }
    }
}
