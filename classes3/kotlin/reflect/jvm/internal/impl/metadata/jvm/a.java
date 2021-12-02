// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.metadata.jvm;

import java.util.Objects;
import java.util.Collection;
import java.util.ArrayList;
import java.io.InputStream;
import java.util.Collections;
import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.f;
import kotlin.reflect.jvm.internal.impl.protobuf.k;
import kotlin.reflect.jvm.internal.impl.protobuf.e;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import kotlin.reflect.jvm.internal.impl.protobuf.s;
import kotlin.reflect.jvm.internal.impl.protobuf.g;
import kotlin.reflect.jvm.internal.impl.protobuf.j;
import kotlin.reflect.jvm.internal.impl.protobuf.q;
import kotlin.reflect.jvm.internal.impl.protobuf.z;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.i;

public final class a
{
    public static final i.g<kotlin.reflect.jvm.internal.impl.metadata.a.d, c> a;
    public static final i.g<kotlin.reflect.jvm.internal.impl.metadata.a.i, c> b;
    public static final i.g<kotlin.reflect.jvm.internal.impl.metadata.a.i, Integer> c;
    public static final i.g<kotlin.reflect.jvm.internal.impl.metadata.a.n, d> d;
    public static final i.g<kotlin.reflect.jvm.internal.impl.metadata.a.n, Integer> e;
    public static final i.g<kotlin.reflect.jvm.internal.impl.metadata.a.q, List<kotlin.reflect.jvm.internal.impl.metadata.a.b>> f;
    public static final i.g<kotlin.reflect.jvm.internal.impl.metadata.a.q, Boolean> g;
    public static final i.g<kotlin.reflect.jvm.internal.impl.metadata.a.s, List<kotlin.reflect.jvm.internal.impl.metadata.a.b>> h;
    public static final i.g<kotlin.reflect.jvm.internal.impl.metadata.a.c, Integer> i;
    public static final i.g<kotlin.reflect.jvm.internal.impl.metadata.a.c, List<kotlin.reflect.jvm.internal.impl.metadata.a.n>> j;
    public static final i.g<kotlin.reflect.jvm.internal.impl.metadata.a.c, Integer> k;
    public static final i.g<kotlin.reflect.jvm.internal.impl.metadata.a.c, Integer> l;
    public static final i.g<kotlin.reflect.jvm.internal.impl.metadata.a.l, Integer> m;
    public static final i.g<kotlin.reflect.jvm.internal.impl.metadata.a.l, List<kotlin.reflect.jvm.internal.impl.metadata.a.n>> n;
    
    static {
        final kotlin.reflect.jvm.internal.impl.metadata.a.d j2 = kotlin.reflect.jvm.internal.impl.metadata.a.d.J();
        final c w = kotlin.reflect.jvm.internal.impl.metadata.jvm.a.c.w();
        final c w2 = kotlin.reflect.jvm.internal.impl.metadata.jvm.a.c.w();
        final z.b s = z.b.S;
        a = (i.g)kotlin.reflect.jvm.internal.impl.protobuf.i.p(j2, w, w2, null, 100, s, c.class);
        b = (i.g)kotlin.reflect.jvm.internal.impl.protobuf.i.p(kotlin.reflect.jvm.internal.impl.metadata.a.i.U(), kotlin.reflect.jvm.internal.impl.metadata.jvm.a.c.w(), kotlin.reflect.jvm.internal.impl.metadata.jvm.a.c.w(), null, 100, s, c.class);
        final kotlin.reflect.jvm.internal.impl.metadata.a.i u = kotlin.reflect.jvm.internal.impl.metadata.a.i.U();
        final Integer value = 0;
        final z.b m2 = z.b.M;
        c = (i.g)kotlin.reflect.jvm.internal.impl.protobuf.i.p(u, value, null, null, 101, m2, Integer.class);
        d = (i.g)kotlin.reflect.jvm.internal.impl.protobuf.i.p(kotlin.reflect.jvm.internal.impl.metadata.a.n.S(), kotlin.reflect.jvm.internal.impl.metadata.jvm.a.d.y(), kotlin.reflect.jvm.internal.impl.metadata.jvm.a.d.y(), null, 100, s, d.class);
        e = (i.g)kotlin.reflect.jvm.internal.impl.protobuf.i.p(kotlin.reflect.jvm.internal.impl.metadata.a.n.S(), value, null, null, 101, m2, Integer.class);
        f = (i.g)kotlin.reflect.jvm.internal.impl.protobuf.i.o(kotlin.reflect.jvm.internal.impl.metadata.a.q.Z(), kotlin.reflect.jvm.internal.impl.metadata.a.b.B(), null, 100, s, false, kotlin.reflect.jvm.internal.impl.metadata.a.b.class);
        g = (i.g)kotlin.reflect.jvm.internal.impl.protobuf.i.p(kotlin.reflect.jvm.internal.impl.metadata.a.q.Z(), Boolean.FALSE, null, null, 101, z.b.P, Boolean.class);
        h = (i.g)kotlin.reflect.jvm.internal.impl.protobuf.i.o(kotlin.reflect.jvm.internal.impl.metadata.a.s.M(), kotlin.reflect.jvm.internal.impl.metadata.a.b.B(), null, 100, s, false, kotlin.reflect.jvm.internal.impl.metadata.a.b.class);
        i = (i.g)kotlin.reflect.jvm.internal.impl.protobuf.i.p(kotlin.reflect.jvm.internal.impl.metadata.a.c.j0(), value, null, null, 101, m2, Integer.class);
        j = (i.g)kotlin.reflect.jvm.internal.impl.protobuf.i.o(kotlin.reflect.jvm.internal.impl.metadata.a.c.j0(), kotlin.reflect.jvm.internal.impl.metadata.a.n.S(), null, 102, s, false, kotlin.reflect.jvm.internal.impl.metadata.a.n.class);
        k = (i.g)kotlin.reflect.jvm.internal.impl.protobuf.i.p(kotlin.reflect.jvm.internal.impl.metadata.a.c.j0(), value, null, null, 103, m2, Integer.class);
        l = (i.g)kotlin.reflect.jvm.internal.impl.protobuf.i.p(kotlin.reflect.jvm.internal.impl.metadata.a.c.j0(), value, null, null, 104, m2, Integer.class);
        m = (i.g)kotlin.reflect.jvm.internal.impl.protobuf.i.p(kotlin.reflect.jvm.internal.impl.metadata.a.l.M(), value, null, null, 101, m2, Integer.class);
        n = (i.g)kotlin.reflect.jvm.internal.impl.protobuf.i.o(kotlin.reflect.jvm.internal.impl.metadata.a.l.M(), kotlin.reflect.jvm.internal.impl.metadata.a.n.S(), null, 102, s, false, kotlin.reflect.jvm.internal.impl.metadata.a.n.class);
    }
    
    public static void a(final g g) {
        g.a(kotlin.reflect.jvm.internal.impl.metadata.jvm.a.a);
        g.a(kotlin.reflect.jvm.internal.impl.metadata.jvm.a.b);
        g.a(kotlin.reflect.jvm.internal.impl.metadata.jvm.a.c);
        g.a(kotlin.reflect.jvm.internal.impl.metadata.jvm.a.d);
        g.a(kotlin.reflect.jvm.internal.impl.metadata.jvm.a.e);
        g.a(kotlin.reflect.jvm.internal.impl.metadata.jvm.a.f);
        g.a(kotlin.reflect.jvm.internal.impl.metadata.jvm.a.g);
        g.a(kotlin.reflect.jvm.internal.impl.metadata.jvm.a.h);
        g.a(kotlin.reflect.jvm.internal.impl.metadata.jvm.a.i);
        g.a(kotlin.reflect.jvm.internal.impl.metadata.jvm.a.j);
        g.a(kotlin.reflect.jvm.internal.impl.metadata.jvm.a.k);
        g.a(kotlin.reflect.jvm.internal.impl.metadata.jvm.a.l);
        g.a(kotlin.reflect.jvm.internal.impl.metadata.jvm.a.m);
        g.a(kotlin.reflect.jvm.internal.impl.metadata.jvm.a.n);
    }
    
    public static final class b extends i implements b
    {
        private static final b N;
        public static s<b> O;
        private final d H;
        private int I;
        private int J;
        private int K;
        private byte L;
        private int M;
        
        static {
            b.O = new kotlin.reflect.jvm.internal.impl.protobuf.b<b>() {
                public b m(final e e, final kotlin.reflect.jvm.internal.impl.protobuf.g g) throws k {
                    return new b(e, g);
                }
            };
            (N = new b(true)).D();
        }
        
        private b(final e p0, final kotlin.reflect.jvm.internal.impl.protobuf.g p1) throws k {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: invokespecial   kotlin/reflect/jvm/internal/impl/protobuf/i.<init>:()V
            //     4: aload_0        
            //     5: iconst_m1      
            //     6: i2b            
            //     7: putfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$b.L:B
            //    10: aload_0        
            //    11: iconst_m1      
            //    12: putfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$b.M:I
            //    15: aload_0        
            //    16: invokespecial   kotlin/reflect/jvm/internal/impl/metadata/jvm/a$b.D:()V
            //    19: invokestatic    kotlin/reflect/jvm/internal/impl/protobuf/d.v:()Lkotlin/reflect/jvm/internal/impl/protobuf/d$b;
            //    22: astore_3       
            //    23: aload_3        
            //    24: iconst_1       
            //    25: invokestatic    kotlin/reflect/jvm/internal/impl/protobuf/f.J:(Ljava/io/OutputStream;I)Lkotlin/reflect/jvm/internal/impl/protobuf/f;
            //    28: astore          4
            //    30: iconst_0       
            //    31: istore          5
            //    33: iload           5
            //    35: ifne            190
            //    38: aload_1        
            //    39: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/e.K:()I
            //    42: istore          6
            //    44: iload           6
            //    46: ifeq            121
            //    49: iload           6
            //    51: bipush          8
            //    53: if_icmpeq       100
            //    56: iload           6
            //    58: bipush          16
            //    60: if_icmpeq       79
            //    63: aload_0        
            //    64: aload_1        
            //    65: aload           4
            //    67: aload_2        
            //    68: iload           6
            //    70: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/i.q:(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;Lkotlin/reflect/jvm/internal/impl/protobuf/g;I)Z
            //    73: ifne            33
            //    76: goto            121
            //    79: aload_0        
            //    80: aload_0        
            //    81: getfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$b.I:I
            //    84: iconst_2       
            //    85: ior            
            //    86: putfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$b.I:I
            //    89: aload_0        
            //    90: aload_1        
            //    91: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/e.s:()I
            //    94: putfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$b.K:I
            //    97: goto            33
            //   100: aload_0        
            //   101: aload_0        
            //   102: getfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$b.I:I
            //   105: iconst_1       
            //   106: ior            
            //   107: putfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$b.I:I
            //   110: aload_0        
            //   111: aload_1        
            //   112: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/e.s:()I
            //   115: putfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$b.J:I
            //   118: goto            33
            //   121: iconst_1       
            //   122: istore          5
            //   124: goto            33
            //   127: astore_1       
            //   128: goto            157
            //   131: astore_1       
            //   132: new             Lkotlin/reflect/jvm/internal/impl/protobuf/k;
            //   135: astore_2       
            //   136: aload_2        
            //   137: aload_1        
            //   138: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
            //   141: invokespecial   kotlin/reflect/jvm/internal/impl/protobuf/k.<init>:(Ljava/lang/String;)V
            //   144: aload_2        
            //   145: aload_0        
            //   146: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/k.i:(Lkotlin/reflect/jvm/internal/impl/protobuf/q;)Lkotlin/reflect/jvm/internal/impl/protobuf/k;
            //   149: athrow         
            //   150: astore_1       
            //   151: aload_1        
            //   152: aload_0        
            //   153: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/k.i:(Lkotlin/reflect/jvm/internal/impl/protobuf/q;)Lkotlin/reflect/jvm/internal/impl/protobuf/k;
            //   156: athrow         
            //   157: aload           4
            //   159: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/f.I:()V
            //   162: aload_0        
            //   163: aload_3        
            //   164: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/d$b.e:()Lkotlin/reflect/jvm/internal/impl/protobuf/d;
            //   167: putfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$b.H:Lkotlin/reflect/jvm/internal/impl/protobuf/d;
            //   170: goto            184
            //   173: astore_1       
            //   174: aload_0        
            //   175: aload_3        
            //   176: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/d$b.e:()Lkotlin/reflect/jvm/internal/impl/protobuf/d;
            //   179: putfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$b.H:Lkotlin/reflect/jvm/internal/impl/protobuf/d;
            //   182: aload_1        
            //   183: athrow         
            //   184: aload_0        
            //   185: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/i.n:()V
            //   188: aload_1        
            //   189: athrow         
            //   190: aload           4
            //   192: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/f.I:()V
            //   195: aload_0        
            //   196: aload_3        
            //   197: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/d$b.e:()Lkotlin/reflect/jvm/internal/impl/protobuf/d;
            //   200: putfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$b.H:Lkotlin/reflect/jvm/internal/impl/protobuf/d;
            //   203: goto            217
            //   206: astore_1       
            //   207: aload_0        
            //   208: aload_3        
            //   209: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/d$b.e:()Lkotlin/reflect/jvm/internal/impl/protobuf/d;
            //   212: putfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$b.H:Lkotlin/reflect/jvm/internal/impl/protobuf/d;
            //   215: aload_1        
            //   216: athrow         
            //   217: aload_0        
            //   218: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/i.n:()V
            //   221: return         
            //   222: astore_2       
            //   223: goto            162
            //   226: astore_1       
            //   227: goto            195
            //    Exceptions:
            //  throws kotlin.reflect.jvm.internal.impl.protobuf.k
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                                         
            //  -----  -----  -----  -----  ---------------------------------------------
            //  38     44     150    157    Lkotlin/reflect/jvm/internal/impl/protobuf/k;
            //  38     44     131    150    Ljava/io/IOException;
            //  38     44     127    190    Any
            //  63     76     150    157    Lkotlin/reflect/jvm/internal/impl/protobuf/k;
            //  63     76     131    150    Ljava/io/IOException;
            //  63     76     127    190    Any
            //  79     97     150    157    Lkotlin/reflect/jvm/internal/impl/protobuf/k;
            //  79     97     131    150    Ljava/io/IOException;
            //  79     97     127    190    Any
            //  100    118    150    157    Lkotlin/reflect/jvm/internal/impl/protobuf/k;
            //  100    118    131    150    Ljava/io/IOException;
            //  100    118    127    190    Any
            //  132    150    127    190    Any
            //  151    157    127    190    Any
            //  157    162    222    226    Ljava/io/IOException;
            //  157    162    173    184    Any
            //  190    195    226    230    Ljava/io/IOException;
            //  190    195    206    217    Any
            // 
            // The error that occurred was:
            // 
            // java.lang.IllegalStateException: Expression is linked from several locations: Label_0157:
            //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
            //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
            //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
            //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:713)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:549)
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
        
        private b(final i.b b) {
            super(b);
            this.L = -1;
            this.M = -1;
            this.H = b.r();
        }
        
        private b(final boolean b) {
            this.L = -1;
            this.M = -1;
            this.H = d.G;
        }
        
        private void D() {
            this.J = 0;
            this.K = 0;
        }
        
        public static b E() {
            return y();
        }
        
        public static b F(final b b) {
            return E().B(b);
        }
        
        public static b w() {
            return b.N;
        }
        
        public boolean B() {
            return (this.I & 0x2) == 0x2;
        }
        
        public boolean C() {
            final int i = this.I;
            boolean b = true;
            if ((i & 0x1) != 0x1) {
                b = false;
            }
            return b;
        }
        
        public b G() {
            return E();
        }
        
        public b H() {
            return F(this);
        }
        
        @Override
        public final boolean a() {
            final byte l = this.L;
            if (l == 1) {
                return true;
            }
            if (l == 0) {
                return false;
            }
            this.L = 1;
            return true;
        }
        
        @Override
        public void d(final kotlin.reflect.jvm.internal.impl.protobuf.f f) throws IOException {
            this.f();
            if ((this.I & 0x1) == 0x1) {
                f.a0(1, this.J);
            }
            if ((this.I & 0x2) == 0x2) {
                f.a0(2, this.K);
            }
            f.i0(this.H);
        }
        
        @Override
        public int f() {
            final int m = this.M;
            if (m != -1) {
                return m;
            }
            int n = 0;
            if ((this.I & 0x1) == 0x1) {
                n = 0 + f.o(1, this.J);
            }
            int n2 = n;
            if ((this.I & 0x2) == 0x2) {
                n2 = n + f.o(2, this.K);
            }
            return this.M = n2 + this.H.size();
        }
        
        @Override
        public s<b> i() {
            return b.O;
        }
        
        public b x() {
            return b.N;
        }
        
        public int y() {
            return this.K;
        }
        
        public int z() {
            return this.J;
        }
        
        public static final class b extends i.b<kotlin.reflect.jvm.internal.impl.metadata.jvm.a.b, b> implements kotlin.reflect.jvm.internal.impl.metadata.jvm.b
        {
            private int H;
            private int I;
            private int J;
            
            private b() {
                this.A();
            }
            
            private void A() {
            }
            
            private static b y() {
                return new b();
            }
            
            public b B(final kotlin.reflect.jvm.internal.impl.metadata.jvm.a.b b) {
                if (b == b.w()) {
                    return this;
                }
                if (b.C()) {
                    this.E(b.z());
                }
                if (b.B()) {
                    this.D(b.y());
                }
                this.t(((i.b)this).r().f(b.H));
                return this;
            }
            
            public b C(final e e, kotlin.reflect.jvm.internal.impl.protobuf.g g) throws IOException {
                final kotlin.reflect.jvm.internal.impl.protobuf.g g2 = null;
                try {
                    try {
                        final kotlin.reflect.jvm.internal.impl.metadata.jvm.a.b b = kotlin.reflect.jvm.internal.impl.metadata.jvm.a.b.O.b(e, g);
                        if (b != null) {
                            this.B(b);
                        }
                        return this;
                    }
                    finally {
                        g = g2;
                    }
                }
                catch (k k) {
                    g = (kotlin.reflect.jvm.internal.impl.protobuf.g)k.a();
                    try {
                        throw k;
                    }
                    finally {}
                }
                if (g != null) {
                    this.B((kotlin.reflect.jvm.internal.impl.metadata.jvm.a.b)g);
                }
            }
            
            public b D(final int j) {
                this.H |= 0x2;
                this.J = j;
                return this;
            }
            
            public b E(final int i) {
                this.H |= 0x1;
                this.I = i;
                return this;
            }
            
            @Override
            public final boolean a() {
                return true;
            }
            
            public kotlin.reflect.jvm.internal.impl.metadata.jvm.a.b v() {
                final kotlin.reflect.jvm.internal.impl.metadata.jvm.a.b w = this.w();
                if (w.a()) {
                    return w;
                }
                throw a.m(w);
            }
            
            public kotlin.reflect.jvm.internal.impl.metadata.jvm.a.b w() {
                final kotlin.reflect.jvm.internal.impl.metadata.jvm.a.b b = new kotlin.reflect.jvm.internal.impl.metadata.jvm.a.b((i.b)this);
                final int h = this.H;
                int n = 1;
                if ((h & 0x1) != 0x1) {
                    n = 0;
                }
                b.J = this.I;
                int n2 = n;
                if ((h & 0x2) == 0x2) {
                    n2 = (n | 0x2);
                }
                b.K = this.J;
                b.I = n2;
                return b;
            }
            
            public b x() {
                return y().B(this.w());
            }
            
            public kotlin.reflect.jvm.internal.impl.metadata.jvm.a.b z() {
                return kotlin.reflect.jvm.internal.impl.metadata.jvm.a.b.w();
            }
        }
    }
    
    public static final class c extends i implements kotlin.reflect.jvm.internal.impl.metadata.jvm.c
    {
        private static final c N;
        public static s<c> O;
        private final d H;
        private int I;
        private int J;
        private int K;
        private byte L;
        private int M;
        
        static {
            c.O = new kotlin.reflect.jvm.internal.impl.protobuf.b<c>() {
                public c m(final e e, final kotlin.reflect.jvm.internal.impl.protobuf.g g) throws k {
                    return new c(e, g);
                }
            };
            (N = new c(true)).D();
        }
        
        private c(final e p0, final kotlin.reflect.jvm.internal.impl.protobuf.g p1) throws k {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: invokespecial   kotlin/reflect/jvm/internal/impl/protobuf/i.<init>:()V
            //     4: aload_0        
            //     5: iconst_m1      
            //     6: i2b            
            //     7: putfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$c.L:B
            //    10: aload_0        
            //    11: iconst_m1      
            //    12: putfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$c.M:I
            //    15: aload_0        
            //    16: invokespecial   kotlin/reflect/jvm/internal/impl/metadata/jvm/a$c.D:()V
            //    19: invokestatic    kotlin/reflect/jvm/internal/impl/protobuf/d.v:()Lkotlin/reflect/jvm/internal/impl/protobuf/d$b;
            //    22: astore_3       
            //    23: aload_3        
            //    24: iconst_1       
            //    25: invokestatic    kotlin/reflect/jvm/internal/impl/protobuf/f.J:(Ljava/io/OutputStream;I)Lkotlin/reflect/jvm/internal/impl/protobuf/f;
            //    28: astore          4
            //    30: iconst_0       
            //    31: istore          5
            //    33: iload           5
            //    35: ifne            190
            //    38: aload_1        
            //    39: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/e.K:()I
            //    42: istore          6
            //    44: iload           6
            //    46: ifeq            121
            //    49: iload           6
            //    51: bipush          8
            //    53: if_icmpeq       100
            //    56: iload           6
            //    58: bipush          16
            //    60: if_icmpeq       79
            //    63: aload_0        
            //    64: aload_1        
            //    65: aload           4
            //    67: aload_2        
            //    68: iload           6
            //    70: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/i.q:(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;Lkotlin/reflect/jvm/internal/impl/protobuf/g;I)Z
            //    73: ifne            33
            //    76: goto            121
            //    79: aload_0        
            //    80: aload_0        
            //    81: getfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$c.I:I
            //    84: iconst_2       
            //    85: ior            
            //    86: putfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$c.I:I
            //    89: aload_0        
            //    90: aload_1        
            //    91: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/e.s:()I
            //    94: putfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$c.K:I
            //    97: goto            33
            //   100: aload_0        
            //   101: aload_0        
            //   102: getfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$c.I:I
            //   105: iconst_1       
            //   106: ior            
            //   107: putfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$c.I:I
            //   110: aload_0        
            //   111: aload_1        
            //   112: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/e.s:()I
            //   115: putfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$c.J:I
            //   118: goto            33
            //   121: iconst_1       
            //   122: istore          5
            //   124: goto            33
            //   127: astore_1       
            //   128: goto            157
            //   131: astore_1       
            //   132: new             Lkotlin/reflect/jvm/internal/impl/protobuf/k;
            //   135: astore_2       
            //   136: aload_2        
            //   137: aload_1        
            //   138: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
            //   141: invokespecial   kotlin/reflect/jvm/internal/impl/protobuf/k.<init>:(Ljava/lang/String;)V
            //   144: aload_2        
            //   145: aload_0        
            //   146: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/k.i:(Lkotlin/reflect/jvm/internal/impl/protobuf/q;)Lkotlin/reflect/jvm/internal/impl/protobuf/k;
            //   149: athrow         
            //   150: astore_1       
            //   151: aload_1        
            //   152: aload_0        
            //   153: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/k.i:(Lkotlin/reflect/jvm/internal/impl/protobuf/q;)Lkotlin/reflect/jvm/internal/impl/protobuf/k;
            //   156: athrow         
            //   157: aload           4
            //   159: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/f.I:()V
            //   162: aload_0        
            //   163: aload_3        
            //   164: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/d$b.e:()Lkotlin/reflect/jvm/internal/impl/protobuf/d;
            //   167: putfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$c.H:Lkotlin/reflect/jvm/internal/impl/protobuf/d;
            //   170: goto            184
            //   173: astore_1       
            //   174: aload_0        
            //   175: aload_3        
            //   176: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/d$b.e:()Lkotlin/reflect/jvm/internal/impl/protobuf/d;
            //   179: putfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$c.H:Lkotlin/reflect/jvm/internal/impl/protobuf/d;
            //   182: aload_1        
            //   183: athrow         
            //   184: aload_0        
            //   185: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/i.n:()V
            //   188: aload_1        
            //   189: athrow         
            //   190: aload           4
            //   192: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/f.I:()V
            //   195: aload_0        
            //   196: aload_3        
            //   197: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/d$b.e:()Lkotlin/reflect/jvm/internal/impl/protobuf/d;
            //   200: putfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$c.H:Lkotlin/reflect/jvm/internal/impl/protobuf/d;
            //   203: goto            217
            //   206: astore_1       
            //   207: aload_0        
            //   208: aload_3        
            //   209: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/d$b.e:()Lkotlin/reflect/jvm/internal/impl/protobuf/d;
            //   212: putfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$c.H:Lkotlin/reflect/jvm/internal/impl/protobuf/d;
            //   215: aload_1        
            //   216: athrow         
            //   217: aload_0        
            //   218: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/i.n:()V
            //   221: return         
            //   222: astore_2       
            //   223: goto            162
            //   226: astore_1       
            //   227: goto            195
            //    Exceptions:
            //  throws kotlin.reflect.jvm.internal.impl.protobuf.k
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                                         
            //  -----  -----  -----  -----  ---------------------------------------------
            //  38     44     150    157    Lkotlin/reflect/jvm/internal/impl/protobuf/k;
            //  38     44     131    150    Ljava/io/IOException;
            //  38     44     127    190    Any
            //  63     76     150    157    Lkotlin/reflect/jvm/internal/impl/protobuf/k;
            //  63     76     131    150    Ljava/io/IOException;
            //  63     76     127    190    Any
            //  79     97     150    157    Lkotlin/reflect/jvm/internal/impl/protobuf/k;
            //  79     97     131    150    Ljava/io/IOException;
            //  79     97     127    190    Any
            //  100    118    150    157    Lkotlin/reflect/jvm/internal/impl/protobuf/k;
            //  100    118    131    150    Ljava/io/IOException;
            //  100    118    127    190    Any
            //  132    150    127    190    Any
            //  151    157    127    190    Any
            //  157    162    222    226    Ljava/io/IOException;
            //  157    162    173    184    Any
            //  190    195    226    230    Ljava/io/IOException;
            //  190    195    206    217    Any
            // 
            // The error that occurred was:
            // 
            // java.lang.IllegalStateException: Expression is linked from several locations: Label_0157:
            //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
            //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
            //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
            //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:713)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:549)
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
        
        private c(final i.b b) {
            super(b);
            this.L = -1;
            this.M = -1;
            this.H = b.r();
        }
        
        private c(final boolean b) {
            this.L = -1;
            this.M = -1;
            this.H = d.G;
        }
        
        private void D() {
            this.J = 0;
            this.K = 0;
        }
        
        public static b E() {
            return y();
        }
        
        public static b F(final c c) {
            return E().B(c);
        }
        
        public static c w() {
            return c.N;
        }
        
        public boolean B() {
            return (this.I & 0x2) == 0x2;
        }
        
        public boolean C() {
            final int i = this.I;
            boolean b = true;
            if ((i & 0x1) != 0x1) {
                b = false;
            }
            return b;
        }
        
        public b G() {
            return E();
        }
        
        public b H() {
            return F(this);
        }
        
        @Override
        public final boolean a() {
            final byte l = this.L;
            if (l == 1) {
                return true;
            }
            if (l == 0) {
                return false;
            }
            this.L = 1;
            return true;
        }
        
        @Override
        public void d(final kotlin.reflect.jvm.internal.impl.protobuf.f f) throws IOException {
            this.f();
            if ((this.I & 0x1) == 0x1) {
                f.a0(1, this.J);
            }
            if ((this.I & 0x2) == 0x2) {
                f.a0(2, this.K);
            }
            f.i0(this.H);
        }
        
        @Override
        public int f() {
            final int m = this.M;
            if (m != -1) {
                return m;
            }
            int n = 0;
            if ((this.I & 0x1) == 0x1) {
                n = 0 + f.o(1, this.J);
            }
            int n2 = n;
            if ((this.I & 0x2) == 0x2) {
                n2 = n + f.o(2, this.K);
            }
            return this.M = n2 + this.H.size();
        }
        
        @Override
        public s<c> i() {
            return c.O;
        }
        
        public c x() {
            return c.N;
        }
        
        public int y() {
            return this.K;
        }
        
        public int z() {
            return this.J;
        }
        
        public static final class b extends i.b<c, b> implements c
        {
            private int H;
            private int I;
            private int J;
            
            private b() {
                this.A();
            }
            
            private void A() {
            }
            
            private static b y() {
                return new b();
            }
            
            public b B(final c c) {
                if (c == c.w()) {
                    return this;
                }
                if (c.C()) {
                    this.E(c.z());
                }
                if (c.B()) {
                    this.D(c.y());
                }
                this.t(((i.b)this).r().f(c.H));
                return this;
            }
            
            public b C(final e e, kotlin.reflect.jvm.internal.impl.protobuf.g g) throws IOException {
                final c c = null;
                Object o;
                Throwable t;
                try {
                    try {
                        final c c2 = kotlin.reflect.jvm.internal.impl.metadata.jvm.a.c.O.b(e, g);
                        if (c2 != null) {
                            this.B(c2);
                        }
                        return this;
                    }
                    finally {
                        o = c;
                        final Throwable t2;
                        t = t2;
                    }
                }
                catch (k k) {
                    g = (kotlin.reflect.jvm.internal.impl.protobuf.g)k.a();
                    try {
                        throw k;
                    }
                    finally {
                        final Throwable t3;
                        t = t3;
                        o = g;
                    }
                }
                if (o != null) {
                    this.B((c)o);
                }
                throw t;
            }
            
            public b D(final int j) {
                this.H |= 0x2;
                this.J = j;
                return this;
            }
            
            public b E(final int i) {
                this.H |= 0x1;
                this.I = i;
                return this;
            }
            
            @Override
            public final boolean a() {
                return true;
            }
            
            public c v() {
                final c w = this.w();
                if (w.a()) {
                    return w;
                }
                throw a.m(w);
            }
            
            public c w() {
                final c c = new c((i.b)this);
                final int h = this.H;
                int n = 1;
                if ((h & 0x1) != 0x1) {
                    n = 0;
                }
                c.J = this.I;
                int n2 = n;
                if ((h & 0x2) == 0x2) {
                    n2 = (n | 0x2);
                }
                c.K = this.J;
                c.I = n2;
                return c;
            }
            
            public b x() {
                return y().B(this.w());
            }
            
            public c z() {
                return c.w();
            }
        }
    }
    
    public static final class d extends i implements kotlin.reflect.jvm.internal.impl.metadata.jvm.d
    {
        private static final d P;
        public static s<d> Q;
        private final kotlin.reflect.jvm.internal.impl.protobuf.d H;
        private int I;
        private kotlin.reflect.jvm.internal.impl.metadata.jvm.a.b J;
        private c K;
        private c L;
        private c M;
        private byte N;
        private int O;
        
        static {
            d.Q = new kotlin.reflect.jvm.internal.impl.protobuf.b<d>() {
                public d m(final e e, final kotlin.reflect.jvm.internal.impl.protobuf.g g) throws k {
                    return new d(e, g);
                }
            };
            (P = new d(true)).J();
        }
        
        private d(final e p0, final kotlin.reflect.jvm.internal.impl.protobuf.g p1) throws k {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: invokespecial   kotlin/reflect/jvm/internal/impl/protobuf/i.<init>:()V
            //     4: aload_0        
            //     5: iconst_m1      
            //     6: i2b            
            //     7: putfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$d.N:B
            //    10: aload_0        
            //    11: iconst_m1      
            //    12: putfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$d.O:I
            //    15: aload_0        
            //    16: invokespecial   kotlin/reflect/jvm/internal/impl/metadata/jvm/a$d.J:()V
            //    19: invokestatic    kotlin/reflect/jvm/internal/impl/protobuf/d.v:()Lkotlin/reflect/jvm/internal/impl/protobuf/d$b;
            //    22: astore_3       
            //    23: aload_3        
            //    24: iconst_1       
            //    25: invokestatic    kotlin/reflect/jvm/internal/impl/protobuf/f.J:(Ljava/io/OutputStream;I)Lkotlin/reflect/jvm/internal/impl/protobuf/f;
            //    28: astore          4
            //    30: iconst_0       
            //    31: istore          5
            //    33: iload           5
            //    35: ifne            499
            //    38: aload_1        
            //    39: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/e.K:()I
            //    42: istore          6
            //    44: iload           6
            //    46: ifeq            430
            //    49: aconst_null    
            //    50: astore          7
            //    52: aconst_null    
            //    53: astore          8
            //    55: aconst_null    
            //    56: astore          9
            //    58: aconst_null    
            //    59: astore          10
            //    61: iload           6
            //    63: bipush          10
            //    65: if_icmpeq       353
            //    68: iload           6
            //    70: bipush          18
            //    72: if_icmpeq       273
            //    75: iload           6
            //    77: bipush          26
            //    79: if_icmpeq       193
            //    82: iload           6
            //    84: bipush          34
            //    86: if_icmpeq       105
            //    89: aload_0        
            //    90: aload_1        
            //    91: aload           4
            //    93: aload_2        
            //    94: iload           6
            //    96: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/i.q:(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;Lkotlin/reflect/jvm/internal/impl/protobuf/g;I)Z
            //    99: ifne            33
            //   102: goto            430
            //   105: aload_0        
            //   106: getfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$d.I:I
            //   109: istore          6
            //   111: bipush          8
            //   113: istore          11
            //   115: iload           6
            //   117: bipush          8
            //   119: iand           
            //   120: bipush          8
            //   122: if_icmpne       134
            //   125: aload_0        
            //   126: getfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$d.M:Lkotlin/reflect/jvm/internal/impl/metadata/jvm/a$c;
            //   129: invokevirtual   kotlin/reflect/jvm/internal/impl/metadata/jvm/a$c.H:()Lkotlin/reflect/jvm/internal/impl/metadata/jvm/a$c$b;
            //   132: astore          10
            //   134: aload_1        
            //   135: getstatic       kotlin/reflect/jvm/internal/impl/metadata/jvm/a$c.O:Lkotlin/reflect/jvm/internal/impl/protobuf/s;
            //   138: aload_2        
            //   139: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/e.u:(Lkotlin/reflect/jvm/internal/impl/protobuf/s;Lkotlin/reflect/jvm/internal/impl/protobuf/g;)Lkotlin/reflect/jvm/internal/impl/protobuf/q;
            //   142: checkcast       Lkotlin/reflect/jvm/internal/impl/metadata/jvm/a$c;
            //   145: astore          7
            //   147: aload_0        
            //   148: aload           7
            //   150: putfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$d.M:Lkotlin/reflect/jvm/internal/impl/metadata/jvm/a$c;
            //   153: aload           10
            //   155: ifnull          175
            //   158: aload           10
            //   160: aload           7
            //   162: invokevirtual   kotlin/reflect/jvm/internal/impl/metadata/jvm/a$c$b.B:(Lkotlin/reflect/jvm/internal/impl/metadata/jvm/a$c;)Lkotlin/reflect/jvm/internal/impl/metadata/jvm/a$c$b;
            //   165: pop            
            //   166: aload_0        
            //   167: aload           10
            //   169: invokevirtual   kotlin/reflect/jvm/internal/impl/metadata/jvm/a$c$b.w:()Lkotlin/reflect/jvm/internal/impl/metadata/jvm/a$c;
            //   172: putfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$d.M:Lkotlin/reflect/jvm/internal/impl/metadata/jvm/a$c;
            //   175: aload_0        
            //   176: getfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$d.I:I
            //   179: istore          6
            //   181: aload_0        
            //   182: iload           6
            //   184: iload           11
            //   186: ior            
            //   187: putfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$d.I:I
            //   190: goto            33
            //   193: aload_0        
            //   194: getfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$d.I:I
            //   197: istore          6
            //   199: iconst_4       
            //   200: istore          11
            //   202: aload           7
            //   204: astore          10
            //   206: iload           6
            //   208: iconst_4       
            //   209: iand           
            //   210: iconst_4       
            //   211: if_icmpne       223
            //   214: aload_0        
            //   215: getfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$d.L:Lkotlin/reflect/jvm/internal/impl/metadata/jvm/a$c;
            //   218: invokevirtual   kotlin/reflect/jvm/internal/impl/metadata/jvm/a$c.H:()Lkotlin/reflect/jvm/internal/impl/metadata/jvm/a$c$b;
            //   221: astore          10
            //   223: aload_1        
            //   224: getstatic       kotlin/reflect/jvm/internal/impl/metadata/jvm/a$c.O:Lkotlin/reflect/jvm/internal/impl/protobuf/s;
            //   227: aload_2        
            //   228: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/e.u:(Lkotlin/reflect/jvm/internal/impl/protobuf/s;Lkotlin/reflect/jvm/internal/impl/protobuf/g;)Lkotlin/reflect/jvm/internal/impl/protobuf/q;
            //   231: checkcast       Lkotlin/reflect/jvm/internal/impl/metadata/jvm/a$c;
            //   234: astore          7
            //   236: aload_0        
            //   237: aload           7
            //   239: putfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$d.L:Lkotlin/reflect/jvm/internal/impl/metadata/jvm/a$c;
            //   242: aload           10
            //   244: ifnull          264
            //   247: aload           10
            //   249: aload           7
            //   251: invokevirtual   kotlin/reflect/jvm/internal/impl/metadata/jvm/a$c$b.B:(Lkotlin/reflect/jvm/internal/impl/metadata/jvm/a$c;)Lkotlin/reflect/jvm/internal/impl/metadata/jvm/a$c$b;
            //   254: pop            
            //   255: aload_0        
            //   256: aload           10
            //   258: invokevirtual   kotlin/reflect/jvm/internal/impl/metadata/jvm/a$c$b.w:()Lkotlin/reflect/jvm/internal/impl/metadata/jvm/a$c;
            //   261: putfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$d.L:Lkotlin/reflect/jvm/internal/impl/metadata/jvm/a$c;
            //   264: aload_0        
            //   265: getfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$d.I:I
            //   268: istore          6
            //   270: goto            181
            //   273: aload_0        
            //   274: getfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$d.I:I
            //   277: istore          6
            //   279: iconst_2       
            //   280: istore          11
            //   282: aload           8
            //   284: astore          10
            //   286: iload           6
            //   288: iconst_2       
            //   289: iand           
            //   290: iconst_2       
            //   291: if_icmpne       303
            //   294: aload_0        
            //   295: getfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$d.K:Lkotlin/reflect/jvm/internal/impl/metadata/jvm/a$c;
            //   298: invokevirtual   kotlin/reflect/jvm/internal/impl/metadata/jvm/a$c.H:()Lkotlin/reflect/jvm/internal/impl/metadata/jvm/a$c$b;
            //   301: astore          10
            //   303: aload_1        
            //   304: getstatic       kotlin/reflect/jvm/internal/impl/metadata/jvm/a$c.O:Lkotlin/reflect/jvm/internal/impl/protobuf/s;
            //   307: aload_2        
            //   308: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/e.u:(Lkotlin/reflect/jvm/internal/impl/protobuf/s;Lkotlin/reflect/jvm/internal/impl/protobuf/g;)Lkotlin/reflect/jvm/internal/impl/protobuf/q;
            //   311: checkcast       Lkotlin/reflect/jvm/internal/impl/metadata/jvm/a$c;
            //   314: astore          7
            //   316: aload_0        
            //   317: aload           7
            //   319: putfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$d.K:Lkotlin/reflect/jvm/internal/impl/metadata/jvm/a$c;
            //   322: aload           10
            //   324: ifnull          344
            //   327: aload           10
            //   329: aload           7
            //   331: invokevirtual   kotlin/reflect/jvm/internal/impl/metadata/jvm/a$c$b.B:(Lkotlin/reflect/jvm/internal/impl/metadata/jvm/a$c;)Lkotlin/reflect/jvm/internal/impl/metadata/jvm/a$c$b;
            //   334: pop            
            //   335: aload_0        
            //   336: aload           10
            //   338: invokevirtual   kotlin/reflect/jvm/internal/impl/metadata/jvm/a$c$b.w:()Lkotlin/reflect/jvm/internal/impl/metadata/jvm/a$c;
            //   341: putfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$d.K:Lkotlin/reflect/jvm/internal/impl/metadata/jvm/a$c;
            //   344: aload_0        
            //   345: getfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$d.I:I
            //   348: istore          6
            //   350: goto            181
            //   353: aload           9
            //   355: astore          10
            //   357: aload_0        
            //   358: getfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$d.I:I
            //   361: iconst_1       
            //   362: iand           
            //   363: iconst_1       
            //   364: if_icmpne       376
            //   367: aload_0        
            //   368: getfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$d.J:Lkotlin/reflect/jvm/internal/impl/metadata/jvm/a$b;
            //   371: invokevirtual   kotlin/reflect/jvm/internal/impl/metadata/jvm/a$b.H:()Lkotlin/reflect/jvm/internal/impl/metadata/jvm/a$b$b;
            //   374: astore          10
            //   376: aload_1        
            //   377: getstatic       kotlin/reflect/jvm/internal/impl/metadata/jvm/a$b.O:Lkotlin/reflect/jvm/internal/impl/protobuf/s;
            //   380: aload_2        
            //   381: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/e.u:(Lkotlin/reflect/jvm/internal/impl/protobuf/s;Lkotlin/reflect/jvm/internal/impl/protobuf/g;)Lkotlin/reflect/jvm/internal/impl/protobuf/q;
            //   384: checkcast       Lkotlin/reflect/jvm/internal/impl/metadata/jvm/a$b;
            //   387: astore          7
            //   389: aload_0        
            //   390: aload           7
            //   392: putfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$d.J:Lkotlin/reflect/jvm/internal/impl/metadata/jvm/a$b;
            //   395: aload           10
            //   397: ifnull          417
            //   400: aload           10
            //   402: aload           7
            //   404: invokevirtual   kotlin/reflect/jvm/internal/impl/metadata/jvm/a$b$b.B:(Lkotlin/reflect/jvm/internal/impl/metadata/jvm/a$b;)Lkotlin/reflect/jvm/internal/impl/metadata/jvm/a$b$b;
            //   407: pop            
            //   408: aload_0        
            //   409: aload           10
            //   411: invokevirtual   kotlin/reflect/jvm/internal/impl/metadata/jvm/a$b$b.w:()Lkotlin/reflect/jvm/internal/impl/metadata/jvm/a$b;
            //   414: putfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$d.J:Lkotlin/reflect/jvm/internal/impl/metadata/jvm/a$b;
            //   417: aload_0        
            //   418: aload_0        
            //   419: getfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$d.I:I
            //   422: iconst_1       
            //   423: ior            
            //   424: putfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$d.I:I
            //   427: goto            33
            //   430: iconst_1       
            //   431: istore          5
            //   433: goto            33
            //   436: astore_1       
            //   437: goto            466
            //   440: astore_1       
            //   441: new             Lkotlin/reflect/jvm/internal/impl/protobuf/k;
            //   444: astore_2       
            //   445: aload_2        
            //   446: aload_1        
            //   447: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
            //   450: invokespecial   kotlin/reflect/jvm/internal/impl/protobuf/k.<init>:(Ljava/lang/String;)V
            //   453: aload_2        
            //   454: aload_0        
            //   455: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/k.i:(Lkotlin/reflect/jvm/internal/impl/protobuf/q;)Lkotlin/reflect/jvm/internal/impl/protobuf/k;
            //   458: athrow         
            //   459: astore_1       
            //   460: aload_1        
            //   461: aload_0        
            //   462: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/k.i:(Lkotlin/reflect/jvm/internal/impl/protobuf/q;)Lkotlin/reflect/jvm/internal/impl/protobuf/k;
            //   465: athrow         
            //   466: aload           4
            //   468: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/f.I:()V
            //   471: aload_0        
            //   472: aload_3        
            //   473: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/d$b.e:()Lkotlin/reflect/jvm/internal/impl/protobuf/d;
            //   476: putfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$d.H:Lkotlin/reflect/jvm/internal/impl/protobuf/d;
            //   479: goto            493
            //   482: astore_1       
            //   483: aload_0        
            //   484: aload_3        
            //   485: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/d$b.e:()Lkotlin/reflect/jvm/internal/impl/protobuf/d;
            //   488: putfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$d.H:Lkotlin/reflect/jvm/internal/impl/protobuf/d;
            //   491: aload_1        
            //   492: athrow         
            //   493: aload_0        
            //   494: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/i.n:()V
            //   497: aload_1        
            //   498: athrow         
            //   499: aload           4
            //   501: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/f.I:()V
            //   504: aload_0        
            //   505: aload_3        
            //   506: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/d$b.e:()Lkotlin/reflect/jvm/internal/impl/protobuf/d;
            //   509: putfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$d.H:Lkotlin/reflect/jvm/internal/impl/protobuf/d;
            //   512: goto            526
            //   515: astore_1       
            //   516: aload_0        
            //   517: aload_3        
            //   518: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/d$b.e:()Lkotlin/reflect/jvm/internal/impl/protobuf/d;
            //   521: putfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$d.H:Lkotlin/reflect/jvm/internal/impl/protobuf/d;
            //   524: aload_1        
            //   525: athrow         
            //   526: aload_0        
            //   527: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/i.n:()V
            //   530: return         
            //   531: astore_2       
            //   532: goto            471
            //   535: astore_1       
            //   536: goto            504
            //    Exceptions:
            //  throws kotlin.reflect.jvm.internal.impl.protobuf.k
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                                         
            //  -----  -----  -----  -----  ---------------------------------------------
            //  38     44     459    466    Lkotlin/reflect/jvm/internal/impl/protobuf/k;
            //  38     44     440    459    Ljava/io/IOException;
            //  38     44     436    499    Any
            //  89     102    459    466    Lkotlin/reflect/jvm/internal/impl/protobuf/k;
            //  89     102    440    459    Ljava/io/IOException;
            //  89     102    436    499    Any
            //  105    111    459    466    Lkotlin/reflect/jvm/internal/impl/protobuf/k;
            //  105    111    440    459    Ljava/io/IOException;
            //  105    111    436    499    Any
            //  125    134    459    466    Lkotlin/reflect/jvm/internal/impl/protobuf/k;
            //  125    134    440    459    Ljava/io/IOException;
            //  125    134    436    499    Any
            //  134    153    459    466    Lkotlin/reflect/jvm/internal/impl/protobuf/k;
            //  134    153    440    459    Ljava/io/IOException;
            //  134    153    436    499    Any
            //  158    175    459    466    Lkotlin/reflect/jvm/internal/impl/protobuf/k;
            //  158    175    440    459    Ljava/io/IOException;
            //  158    175    436    499    Any
            //  175    181    459    466    Lkotlin/reflect/jvm/internal/impl/protobuf/k;
            //  175    181    440    459    Ljava/io/IOException;
            //  175    181    436    499    Any
            //  181    190    459    466    Lkotlin/reflect/jvm/internal/impl/protobuf/k;
            //  181    190    440    459    Ljava/io/IOException;
            //  181    190    436    499    Any
            //  193    199    459    466    Lkotlin/reflect/jvm/internal/impl/protobuf/k;
            //  193    199    440    459    Ljava/io/IOException;
            //  193    199    436    499    Any
            //  214    223    459    466    Lkotlin/reflect/jvm/internal/impl/protobuf/k;
            //  214    223    440    459    Ljava/io/IOException;
            //  214    223    436    499    Any
            //  223    242    459    466    Lkotlin/reflect/jvm/internal/impl/protobuf/k;
            //  223    242    440    459    Ljava/io/IOException;
            //  223    242    436    499    Any
            //  247    264    459    466    Lkotlin/reflect/jvm/internal/impl/protobuf/k;
            //  247    264    440    459    Ljava/io/IOException;
            //  247    264    436    499    Any
            //  264    270    459    466    Lkotlin/reflect/jvm/internal/impl/protobuf/k;
            //  264    270    440    459    Ljava/io/IOException;
            //  264    270    436    499    Any
            //  273    279    459    466    Lkotlin/reflect/jvm/internal/impl/protobuf/k;
            //  273    279    440    459    Ljava/io/IOException;
            //  273    279    436    499    Any
            //  294    303    459    466    Lkotlin/reflect/jvm/internal/impl/protobuf/k;
            //  294    303    440    459    Ljava/io/IOException;
            //  294    303    436    499    Any
            //  303    322    459    466    Lkotlin/reflect/jvm/internal/impl/protobuf/k;
            //  303    322    440    459    Ljava/io/IOException;
            //  303    322    436    499    Any
            //  327    344    459    466    Lkotlin/reflect/jvm/internal/impl/protobuf/k;
            //  327    344    440    459    Ljava/io/IOException;
            //  327    344    436    499    Any
            //  344    350    459    466    Lkotlin/reflect/jvm/internal/impl/protobuf/k;
            //  344    350    440    459    Ljava/io/IOException;
            //  344    350    436    499    Any
            //  357    376    459    466    Lkotlin/reflect/jvm/internal/impl/protobuf/k;
            //  357    376    440    459    Ljava/io/IOException;
            //  357    376    436    499    Any
            //  376    395    459    466    Lkotlin/reflect/jvm/internal/impl/protobuf/k;
            //  376    395    440    459    Ljava/io/IOException;
            //  376    395    436    499    Any
            //  400    417    459    466    Lkotlin/reflect/jvm/internal/impl/protobuf/k;
            //  400    417    440    459    Ljava/io/IOException;
            //  400    417    436    499    Any
            //  417    427    459    466    Lkotlin/reflect/jvm/internal/impl/protobuf/k;
            //  417    427    440    459    Ljava/io/IOException;
            //  417    427    436    499    Any
            //  441    459    436    499    Any
            //  460    466    436    499    Any
            //  466    471    531    535    Ljava/io/IOException;
            //  466    471    482    493    Any
            //  499    504    535    539    Ljava/io/IOException;
            //  499    504    515    526    Any
            // 
            // The error that occurred was:
            // 
            // java.lang.IllegalStateException: Expression is linked from several locations: Label_0466:
            //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
            //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
            //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
            //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:713)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:549)
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
        
        private d(final i.b b) {
            super(b);
            this.N = -1;
            this.O = -1;
            this.H = b.r();
        }
        
        private d(final boolean b) {
            this.N = -1;
            this.O = -1;
            this.H = kotlin.reflect.jvm.internal.impl.protobuf.d.G;
        }
        
        private void J() {
            this.J = kotlin.reflect.jvm.internal.impl.metadata.jvm.a.b.w();
            this.K = c.w();
            this.L = c.w();
            this.M = c.w();
        }
        
        public static b K() {
            return y();
        }
        
        public static b L(final d d) {
            return K().C(d);
        }
        
        public static d y() {
            return d.P;
        }
        
        public kotlin.reflect.jvm.internal.impl.metadata.jvm.a.b B() {
            return this.J;
        }
        
        public c C() {
            return this.L;
        }
        
        public c D() {
            return this.M;
        }
        
        public c E() {
            return this.K;
        }
        
        public boolean F() {
            final int i = this.I;
            boolean b = true;
            if ((i & 0x1) != 0x1) {
                b = false;
            }
            return b;
        }
        
        public boolean G() {
            return (this.I & 0x4) == 0x4;
        }
        
        public boolean H() {
            return (this.I & 0x8) == 0x8;
        }
        
        public boolean I() {
            return (this.I & 0x2) == 0x2;
        }
        
        public b M() {
            return K();
        }
        
        public b N() {
            return L(this);
        }
        
        @Override
        public final boolean a() {
            final byte n = this.N;
            if (n == 1) {
                return true;
            }
            if (n == 0) {
                return false;
            }
            this.N = 1;
            return true;
        }
        
        @Override
        public void d(final kotlin.reflect.jvm.internal.impl.protobuf.f f) throws IOException {
            this.f();
            if ((this.I & 0x1) == 0x1) {
                f.d0(1, this.J);
            }
            if ((this.I & 0x2) == 0x2) {
                f.d0(2, this.K);
            }
            if ((this.I & 0x4) == 0x4) {
                f.d0(3, this.L);
            }
            if ((this.I & 0x8) == 0x8) {
                f.d0(4, this.M);
            }
            f.i0(this.H);
        }
        
        @Override
        public int f() {
            final int o = this.O;
            if (o != -1) {
                return o;
            }
            int n = 0;
            if ((this.I & 0x1) == 0x1) {
                n = 0 + f.s(1, this.J);
            }
            int n2 = n;
            if ((this.I & 0x2) == 0x2) {
                n2 = n + f.s(2, this.K);
            }
            int n3 = n2;
            if ((this.I & 0x4) == 0x4) {
                n3 = n2 + f.s(3, this.L);
            }
            int n4 = n3;
            if ((this.I & 0x8) == 0x8) {
                n4 = n3 + f.s(4, this.M);
            }
            return this.O = n4 + this.H.size();
        }
        
        @Override
        public s<d> i() {
            return d.Q;
        }
        
        public d z() {
            return d.P;
        }
        
        public static final class b extends i.b<d, b> implements d
        {
            private int H;
            private kotlin.reflect.jvm.internal.impl.metadata.jvm.a.b I;
            private c J;
            private c K;
            private c L;
            
            private b() {
                this.I = kotlin.reflect.jvm.internal.impl.metadata.jvm.a.b.w();
                this.J = c.w();
                this.K = c.w();
                this.L = c.w();
                this.A();
            }
            
            private void A() {
            }
            
            private static b y() {
                return new b();
            }
            
            public b B(final kotlin.reflect.jvm.internal.impl.metadata.jvm.a.b b) {
                kotlin.reflect.jvm.internal.impl.metadata.jvm.b w = b;
                if ((this.H & 0x1) == 0x1) {
                    w = b;
                    if (this.I != b.w()) {
                        w = b.F(this.I).B(b).w();
                    }
                }
                this.I = (kotlin.reflect.jvm.internal.impl.metadata.jvm.a.b)w;
                this.H |= 0x1;
                return this;
            }
            
            public b C(final d d) {
                if (d == d.y()) {
                    return this;
                }
                if (d.F()) {
                    this.B(d.B());
                }
                if (d.I()) {
                    this.H(d.E());
                }
                if (d.G()) {
                    this.E(d.C());
                }
                if (d.H()) {
                    this.F(d.D());
                }
                this.t(((i.b)this).r().f(d.H));
                return this;
            }
            
            public b D(final e e, kotlin.reflect.jvm.internal.impl.protobuf.g g) throws IOException {
                final kotlin.reflect.jvm.internal.impl.protobuf.g g2 = null;
                try {
                    try {
                        final d d = kotlin.reflect.jvm.internal.impl.metadata.jvm.a.d.Q.b(e, g);
                        if (d != null) {
                            this.C(d);
                        }
                        return this;
                    }
                    finally {
                        g = g2;
                    }
                }
                catch (k k) {
                    g = (kotlin.reflect.jvm.internal.impl.protobuf.g)k.a();
                    try {
                        throw k;
                    }
                    finally {}
                }
                if (g != null) {
                    this.C((d)g);
                }
            }
            
            public b E(final c c) {
                c w = c;
                if ((this.H & 0x4) == 0x4) {
                    w = c;
                    if (this.K != c.w()) {
                        w = c.F(this.K).B(c).w();
                    }
                }
                this.K = (c)w;
                this.H |= 0x4;
                return this;
            }
            
            public b F(final c c) {
                c w = c;
                if ((this.H & 0x8) == 0x8) {
                    w = c;
                    if (this.L != c.w()) {
                        w = c.F(this.L).B(c).w();
                    }
                }
                this.L = (c)w;
                this.H |= 0x8;
                return this;
            }
            
            public b H(final c c) {
                c w = c;
                if ((this.H & 0x2) == 0x2) {
                    w = c;
                    if (this.J != c.w()) {
                        w = c.F(this.J).B(c).w();
                    }
                }
                this.J = (c)w;
                this.H |= 0x2;
                return this;
            }
            
            @Override
            public final boolean a() {
                return true;
            }
            
            public d v() {
                final d w = this.w();
                if (w.a()) {
                    return w;
                }
                throw a.m(w);
            }
            
            public d w() {
                final d d = new d((i.b)this);
                final int h = this.H;
                boolean b = true;
                if ((h & 0x1) != 0x1) {
                    b = false;
                }
                d.J = this.I;
                int n = b ? 1 : 0;
                if ((h & 0x2) == 0x2) {
                    n = ((b ? 1 : 0) | 0x2);
                }
                d.K = this.J;
                int n2 = n;
                if ((h & 0x4) == 0x4) {
                    n2 = (n | 0x4);
                }
                d.L = this.K;
                int n3 = n2;
                if ((h & 0x8) == 0x8) {
                    n3 = (n2 | 0x8);
                }
                d.M = this.L;
                d.I = n3;
                return d;
            }
            
            public b x() {
                return y().C(this.w());
            }
            
            public d z() {
                return d.y();
            }
        }
    }
    
    public static final class e extends i implements f
    {
        private static final e N;
        public static s<e> O;
        private final d H;
        private List<c> I;
        private List<Integer> J;
        private int K;
        private byte L;
        private int M;
        
        static {
            e.O = new kotlin.reflect.jvm.internal.impl.protobuf.b<e>() {
                public e m(final kotlin.reflect.jvm.internal.impl.protobuf.e e, final kotlin.reflect.jvm.internal.impl.protobuf.g g) throws k {
                    return new e(e, g);
                }
            };
            (N = new e(true)).C();
        }
        
        private e(final kotlin.reflect.jvm.internal.impl.protobuf.e p0, final kotlin.reflect.jvm.internal.impl.protobuf.g p1) throws k {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: invokespecial   kotlin/reflect/jvm/internal/impl/protobuf/i.<init>:()V
            //     4: aload_0        
            //     5: iconst_m1      
            //     6: putfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$e.K:I
            //     9: aload_0        
            //    10: iconst_m1      
            //    11: i2b            
            //    12: putfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$e.L:B
            //    15: aload_0        
            //    16: iconst_m1      
            //    17: putfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$e.M:I
            //    20: aload_0        
            //    21: invokespecial   kotlin/reflect/jvm/internal/impl/metadata/jvm/a$e.C:()V
            //    24: invokestatic    kotlin/reflect/jvm/internal/impl/protobuf/d.v:()Lkotlin/reflect/jvm/internal/impl/protobuf/d$b;
            //    27: astore_3       
            //    28: aload_3        
            //    29: iconst_1       
            //    30: invokestatic    kotlin/reflect/jvm/internal/impl/protobuf/f.J:(Ljava/io/OutputStream;I)Lkotlin/reflect/jvm/internal/impl/protobuf/f;
            //    33: astore          4
            //    35: iconst_0       
            //    36: istore          5
            //    38: iconst_0       
            //    39: istore          6
            //    41: iload           5
            //    43: ifne            687
            //    46: iload           6
            //    48: istore          7
            //    50: iload           6
            //    52: istore          8
            //    54: iload           6
            //    56: istore          9
            //    58: aload_1        
            //    59: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/e.K:()I
            //    62: istore          10
            //    64: iload           10
            //    66: ifeq            564
            //    69: iload           10
            //    71: bipush          10
            //    73: if_icmpeq       447
            //    76: iload           10
            //    78: bipush          40
            //    80: if_icmpeq       309
            //    83: iload           10
            //    85: bipush          42
            //    87: if_icmpeq       118
            //    90: iload           6
            //    92: istore          7
            //    94: iload           6
            //    96: istore          8
            //    98: iload           6
            //   100: istore          9
            //   102: aload_0        
            //   103: aload_1        
            //   104: aload           4
            //   106: aload_2        
            //   107: iload           10
            //   109: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/i.q:(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;Lkotlin/reflect/jvm/internal/impl/protobuf/g;I)Z
            //   112: ifne            41
            //   115: goto            564
            //   118: iload           6
            //   120: istore          7
            //   122: iload           6
            //   124: istore          8
            //   126: iload           6
            //   128: istore          9
            //   130: aload_1        
            //   131: aload_1        
            //   132: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/e.A:()I
            //   135: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/e.j:(I)I
            //   138: istore          11
            //   140: iload           6
            //   142: istore          10
            //   144: iload           6
            //   146: iconst_2       
            //   147: iand           
            //   148: iconst_2       
            //   149: if_icmpeq       233
            //   152: iload           6
            //   154: istore          10
            //   156: iload           6
            //   158: istore          7
            //   160: iload           6
            //   162: istore          8
            //   164: iload           6
            //   166: istore          9
            //   168: aload_1        
            //   169: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/e.e:()I
            //   172: ifle            233
            //   175: iload           6
            //   177: istore          7
            //   179: iload           6
            //   181: istore          8
            //   183: iload           6
            //   185: istore          9
            //   187: new             Ljava/util/ArrayList;
            //   190: astore          12
            //   192: iload           6
            //   194: istore          7
            //   196: iload           6
            //   198: istore          8
            //   200: iload           6
            //   202: istore          9
            //   204: aload           12
            //   206: invokespecial   java/util/ArrayList.<init>:()V
            //   209: iload           6
            //   211: istore          7
            //   213: iload           6
            //   215: istore          8
            //   217: iload           6
            //   219: istore          9
            //   221: aload_0        
            //   222: aload           12
            //   224: putfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$e.J:Ljava/util/List;
            //   227: iload           6
            //   229: iconst_2       
            //   230: ior            
            //   231: istore          10
            //   233: iload           10
            //   235: istore          7
            //   237: iload           10
            //   239: istore          8
            //   241: iload           10
            //   243: istore          9
            //   245: aload_1        
            //   246: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/e.e:()I
            //   249: ifle            284
            //   252: iload           10
            //   254: istore          7
            //   256: iload           10
            //   258: istore          8
            //   260: iload           10
            //   262: istore          9
            //   264: aload_0        
            //   265: getfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$e.J:Ljava/util/List;
            //   268: aload_1        
            //   269: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/e.s:()I
            //   272: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //   275: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
            //   280: pop            
            //   281: goto            233
            //   284: iload           10
            //   286: istore          7
            //   288: iload           10
            //   290: istore          8
            //   292: iload           10
            //   294: istore          9
            //   296: aload_1        
            //   297: iload           11
            //   299: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/e.i:(I)V
            //   302: iload           10
            //   304: istore          6
            //   306: goto            41
            //   309: iload           6
            //   311: istore          10
            //   313: iload           6
            //   315: iconst_2       
            //   316: iand           
            //   317: iconst_2       
            //   318: if_icmpeq       379
            //   321: iload           6
            //   323: istore          7
            //   325: iload           6
            //   327: istore          8
            //   329: iload           6
            //   331: istore          9
            //   333: new             Ljava/util/ArrayList;
            //   336: astore          12
            //   338: iload           6
            //   340: istore          7
            //   342: iload           6
            //   344: istore          8
            //   346: iload           6
            //   348: istore          9
            //   350: aload           12
            //   352: invokespecial   java/util/ArrayList.<init>:()V
            //   355: iload           6
            //   357: istore          7
            //   359: iload           6
            //   361: istore          8
            //   363: iload           6
            //   365: istore          9
            //   367: aload_0        
            //   368: aload           12
            //   370: putfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$e.J:Ljava/util/List;
            //   373: iload           6
            //   375: iconst_2       
            //   376: ior            
            //   377: istore          10
            //   379: iload           10
            //   381: istore          7
            //   383: iload           10
            //   385: istore          8
            //   387: iload           10
            //   389: istore          9
            //   391: aload_0        
            //   392: getfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$e.J:Ljava/util/List;
            //   395: astore          12
            //   397: iload           10
            //   399: istore          7
            //   401: iload           10
            //   403: istore          8
            //   405: iload           10
            //   407: istore          9
            //   409: aload_1        
            //   410: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/e.s:()I
            //   413: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //   416: astore          13
            //   418: iload           10
            //   420: istore          6
            //   422: iload           6
            //   424: istore          7
            //   426: iload           6
            //   428: istore          8
            //   430: iload           6
            //   432: istore          9
            //   434: aload           12
            //   436: aload           13
            //   438: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
            //   443: pop            
            //   444: goto            41
            //   447: iload           6
            //   449: istore          10
            //   451: iload           6
            //   453: iconst_1       
            //   454: iand           
            //   455: iconst_1       
            //   456: if_icmpeq       517
            //   459: iload           6
            //   461: istore          7
            //   463: iload           6
            //   465: istore          8
            //   467: iload           6
            //   469: istore          9
            //   471: new             Ljava/util/ArrayList;
            //   474: astore          12
            //   476: iload           6
            //   478: istore          7
            //   480: iload           6
            //   482: istore          8
            //   484: iload           6
            //   486: istore          9
            //   488: aload           12
            //   490: invokespecial   java/util/ArrayList.<init>:()V
            //   493: iload           6
            //   495: istore          7
            //   497: iload           6
            //   499: istore          8
            //   501: iload           6
            //   503: istore          9
            //   505: aload_0        
            //   506: aload           12
            //   508: putfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$e.I:Ljava/util/List;
            //   511: iload           6
            //   513: iconst_1       
            //   514: ior            
            //   515: istore          10
            //   517: iload           10
            //   519: istore          7
            //   521: iload           10
            //   523: istore          8
            //   525: iload           10
            //   527: istore          9
            //   529: aload_0        
            //   530: getfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$e.I:Ljava/util/List;
            //   533: astore          12
            //   535: iload           10
            //   537: istore          7
            //   539: iload           10
            //   541: istore          8
            //   543: iload           10
            //   545: istore          9
            //   547: aload_1        
            //   548: getstatic       kotlin/reflect/jvm/internal/impl/metadata/jvm/a$e$c.U:Lkotlin/reflect/jvm/internal/impl/protobuf/s;
            //   551: aload_2        
            //   552: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/e.u:(Lkotlin/reflect/jvm/internal/impl/protobuf/s;Lkotlin/reflect/jvm/internal/impl/protobuf/g;)Lkotlin/reflect/jvm/internal/impl/protobuf/q;
            //   555: astore          13
            //   557: iload           10
            //   559: istore          6
            //   561: goto            422
            //   564: iconst_1       
            //   565: istore          5
            //   567: goto            41
            //   570: astore_1       
            //   571: goto            616
            //   574: astore_1       
            //   575: iload           8
            //   577: istore          7
            //   579: new             Lkotlin/reflect/jvm/internal/impl/protobuf/k;
            //   582: astore_2       
            //   583: iload           8
            //   585: istore          7
            //   587: aload_2        
            //   588: aload_1        
            //   589: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
            //   592: invokespecial   kotlin/reflect/jvm/internal/impl/protobuf/k.<init>:(Ljava/lang/String;)V
            //   595: iload           8
            //   597: istore          7
            //   599: aload_2        
            //   600: aload_0        
            //   601: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/k.i:(Lkotlin/reflect/jvm/internal/impl/protobuf/q;)Lkotlin/reflect/jvm/internal/impl/protobuf/k;
            //   604: athrow         
            //   605: astore_1       
            //   606: iload           9
            //   608: istore          7
            //   610: aload_1        
            //   611: aload_0        
            //   612: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/k.i:(Lkotlin/reflect/jvm/internal/impl/protobuf/q;)Lkotlin/reflect/jvm/internal/impl/protobuf/k;
            //   615: athrow         
            //   616: iload           7
            //   618: iconst_1       
            //   619: iand           
            //   620: iconst_1       
            //   621: if_icmpne       635
            //   624: aload_0        
            //   625: aload_0        
            //   626: getfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$e.I:Ljava/util/List;
            //   629: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
            //   632: putfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$e.I:Ljava/util/List;
            //   635: iload           7
            //   637: iconst_2       
            //   638: iand           
            //   639: iconst_2       
            //   640: if_icmpne       654
            //   643: aload_0        
            //   644: aload_0        
            //   645: getfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$e.J:Ljava/util/List;
            //   648: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
            //   651: putfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$e.J:Ljava/util/List;
            //   654: aload           4
            //   656: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/f.I:()V
            //   659: aload_0        
            //   660: aload_3        
            //   661: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/d$b.e:()Lkotlin/reflect/jvm/internal/impl/protobuf/d;
            //   664: putfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$e.H:Lkotlin/reflect/jvm/internal/impl/protobuf/d;
            //   667: goto            681
            //   670: astore_1       
            //   671: aload_0        
            //   672: aload_3        
            //   673: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/d$b.e:()Lkotlin/reflect/jvm/internal/impl/protobuf/d;
            //   676: putfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$e.H:Lkotlin/reflect/jvm/internal/impl/protobuf/d;
            //   679: aload_1        
            //   680: athrow         
            //   681: aload_0        
            //   682: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/i.n:()V
            //   685: aload_1        
            //   686: athrow         
            //   687: iload           6
            //   689: iconst_1       
            //   690: iand           
            //   691: iconst_1       
            //   692: if_icmpne       706
            //   695: aload_0        
            //   696: aload_0        
            //   697: getfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$e.I:Ljava/util/List;
            //   700: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
            //   703: putfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$e.I:Ljava/util/List;
            //   706: iload           6
            //   708: iconst_2       
            //   709: iand           
            //   710: iconst_2       
            //   711: if_icmpne       725
            //   714: aload_0        
            //   715: aload_0        
            //   716: getfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$e.J:Ljava/util/List;
            //   719: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
            //   722: putfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$e.J:Ljava/util/List;
            //   725: aload           4
            //   727: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/f.I:()V
            //   730: aload_0        
            //   731: aload_3        
            //   732: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/d$b.e:()Lkotlin/reflect/jvm/internal/impl/protobuf/d;
            //   735: putfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$e.H:Lkotlin/reflect/jvm/internal/impl/protobuf/d;
            //   738: goto            752
            //   741: astore_1       
            //   742: aload_0        
            //   743: aload_3        
            //   744: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/d$b.e:()Lkotlin/reflect/jvm/internal/impl/protobuf/d;
            //   747: putfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$e.H:Lkotlin/reflect/jvm/internal/impl/protobuf/d;
            //   750: aload_1        
            //   751: athrow         
            //   752: aload_0        
            //   753: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/i.n:()V
            //   756: return         
            //   757: astore_2       
            //   758: goto            659
            //   761: astore_1       
            //   762: goto            730
            //    Exceptions:
            //  throws kotlin.reflect.jvm.internal.impl.protobuf.k
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                                         
            //  -----  -----  -----  -----  ---------------------------------------------
            //  58     64     605    616    Lkotlin/reflect/jvm/internal/impl/protobuf/k;
            //  58     64     574    605    Ljava/io/IOException;
            //  58     64     570    687    Any
            //  102    115    605    616    Lkotlin/reflect/jvm/internal/impl/protobuf/k;
            //  102    115    574    605    Ljava/io/IOException;
            //  102    115    570    687    Any
            //  130    140    605    616    Lkotlin/reflect/jvm/internal/impl/protobuf/k;
            //  130    140    574    605    Ljava/io/IOException;
            //  130    140    570    687    Any
            //  168    175    605    616    Lkotlin/reflect/jvm/internal/impl/protobuf/k;
            //  168    175    574    605    Ljava/io/IOException;
            //  168    175    570    687    Any
            //  187    192    605    616    Lkotlin/reflect/jvm/internal/impl/protobuf/k;
            //  187    192    574    605    Ljava/io/IOException;
            //  187    192    570    687    Any
            //  204    209    605    616    Lkotlin/reflect/jvm/internal/impl/protobuf/k;
            //  204    209    574    605    Ljava/io/IOException;
            //  204    209    570    687    Any
            //  221    227    605    616    Lkotlin/reflect/jvm/internal/impl/protobuf/k;
            //  221    227    574    605    Ljava/io/IOException;
            //  221    227    570    687    Any
            //  245    252    605    616    Lkotlin/reflect/jvm/internal/impl/protobuf/k;
            //  245    252    574    605    Ljava/io/IOException;
            //  245    252    570    687    Any
            //  264    281    605    616    Lkotlin/reflect/jvm/internal/impl/protobuf/k;
            //  264    281    574    605    Ljava/io/IOException;
            //  264    281    570    687    Any
            //  296    302    605    616    Lkotlin/reflect/jvm/internal/impl/protobuf/k;
            //  296    302    574    605    Ljava/io/IOException;
            //  296    302    570    687    Any
            //  333    338    605    616    Lkotlin/reflect/jvm/internal/impl/protobuf/k;
            //  333    338    574    605    Ljava/io/IOException;
            //  333    338    570    687    Any
            //  350    355    605    616    Lkotlin/reflect/jvm/internal/impl/protobuf/k;
            //  350    355    574    605    Ljava/io/IOException;
            //  350    355    570    687    Any
            //  367    373    605    616    Lkotlin/reflect/jvm/internal/impl/protobuf/k;
            //  367    373    574    605    Ljava/io/IOException;
            //  367    373    570    687    Any
            //  391    397    605    616    Lkotlin/reflect/jvm/internal/impl/protobuf/k;
            //  391    397    574    605    Ljava/io/IOException;
            //  391    397    570    687    Any
            //  409    418    605    616    Lkotlin/reflect/jvm/internal/impl/protobuf/k;
            //  409    418    574    605    Ljava/io/IOException;
            //  409    418    570    687    Any
            //  434    444    605    616    Lkotlin/reflect/jvm/internal/impl/protobuf/k;
            //  434    444    574    605    Ljava/io/IOException;
            //  434    444    570    687    Any
            //  471    476    605    616    Lkotlin/reflect/jvm/internal/impl/protobuf/k;
            //  471    476    574    605    Ljava/io/IOException;
            //  471    476    570    687    Any
            //  488    493    605    616    Lkotlin/reflect/jvm/internal/impl/protobuf/k;
            //  488    493    574    605    Ljava/io/IOException;
            //  488    493    570    687    Any
            //  505    511    605    616    Lkotlin/reflect/jvm/internal/impl/protobuf/k;
            //  505    511    574    605    Ljava/io/IOException;
            //  505    511    570    687    Any
            //  529    535    605    616    Lkotlin/reflect/jvm/internal/impl/protobuf/k;
            //  529    535    574    605    Ljava/io/IOException;
            //  529    535    570    687    Any
            //  547    557    605    616    Lkotlin/reflect/jvm/internal/impl/protobuf/k;
            //  547    557    574    605    Ljava/io/IOException;
            //  547    557    570    687    Any
            //  579    583    570    687    Any
            //  587    595    570    687    Any
            //  599    605    570    687    Any
            //  610    616    570    687    Any
            //  654    659    757    761    Ljava/io/IOException;
            //  654    659    670    681    Any
            //  725    730    761    765    Ljava/io/IOException;
            //  725    730    741    752    Any
            // 
            // The error that occurred was:
            // 
            // java.lang.IllegalStateException: Expression is linked from several locations: Label_0654:
            //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
            //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
            //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
            //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:713)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:549)
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
        
        private e(final i.b b) {
            super(b);
            this.K = -1;
            this.L = -1;
            this.M = -1;
            this.H = b.r();
        }
        
        private e(final boolean b) {
            this.K = -1;
            this.L = -1;
            this.M = -1;
            this.H = d.G;
        }
        
        private void C() {
            this.I = Collections.emptyList();
            this.J = Collections.emptyList();
        }
        
        public static b D() {
            return y();
        }
        
        public static b E(final e e) {
            return D().D(e);
        }
        
        public static e G(final InputStream inputStream, final kotlin.reflect.jvm.internal.impl.protobuf.g g) throws IOException {
            return e.O.c(inputStream, g);
        }
        
        public static e x() {
            return e.N;
        }
        
        public List<c> B() {
            return this.I;
        }
        
        public b F() {
            return D();
        }
        
        public b H() {
            return E(this);
        }
        
        @Override
        public final boolean a() {
            final byte l = this.L;
            if (l == 1) {
                return true;
            }
            if (l == 0) {
                return false;
            }
            this.L = 1;
            return true;
        }
        
        @Override
        public void d(final f f) throws IOException {
            this.f();
            final int n = 0;
            for (int i = 0; i < this.I.size(); ++i) {
                f.d0(1, this.I.get(i));
            }
            int j = n;
            if (this.z().size() > 0) {
                f.o0(42);
                f.o0(this.K);
                j = n;
            }
            while (j < this.J.size()) {
                f.b0(this.J.get(j));
                ++j;
            }
            f.i0(this.H);
        }
        
        @Override
        public int f() {
            final int m = this.M;
            if (m != -1) {
                return m;
            }
            int i = 0;
            int j = 0;
            int n = 0;
            while (j < this.I.size()) {
                n += f.s(1, this.I.get(j));
                ++j;
            }
            int k = 0;
            while (i < this.J.size()) {
                k += f.p(this.J.get(i));
                ++i;
            }
            int n2 = n + k;
            if (!this.z().isEmpty()) {
                n2 = n2 + 1 + f.p(k);
            }
            this.K = k;
            return this.M = n2 + this.H.size();
        }
        
        @Override
        public s<e> i() {
            return e.O;
        }
        
        public e y() {
            return e.N;
        }
        
        public List<Integer> z() {
            return this.J;
        }
        
        public static final class b extends i.b<e, b> implements f
        {
            private int H;
            private List<c> I;
            private List<Integer> J;
            
            private b() {
                this.I = Collections.emptyList();
                this.J = Collections.emptyList();
                this.C();
            }
            
            private void A() {
                if ((this.H & 0x1) != 0x1) {
                    this.I = new ArrayList<c>(this.I);
                    this.H |= 0x1;
                }
            }
            
            private void C() {
            }
            
            private static b y() {
                return new b();
            }
            
            private void z() {
                if ((this.H & 0x2) != 0x2) {
                    this.J = new ArrayList<Integer>(this.J);
                    this.H |= 0x2;
                }
            }
            
            public e B() {
                return e.x();
            }
            
            public b D(final e e) {
                if (e == e.x()) {
                    return this;
                }
                if (!e.I.isEmpty()) {
                    if (this.I.isEmpty()) {
                        this.I = e.I;
                        this.H &= 0xFFFFFFFE;
                    }
                    else {
                        this.A();
                        this.I.addAll(e.I);
                    }
                }
                if (!e.J.isEmpty()) {
                    if (this.J.isEmpty()) {
                        this.J = e.J;
                        this.H &= 0xFFFFFFFD;
                    }
                    else {
                        this.z();
                        this.J.addAll(e.J);
                    }
                }
                this.t(((i.b)this).r().f(e.H));
                return this;
            }
            
            public b E(final e e, kotlin.reflect.jvm.internal.impl.protobuf.g g) throws IOException {
                final e e2 = null;
                Object o;
                try {
                    try {
                        final e e3 = e.O.b(e, g);
                        if (e3 != null) {
                            this.D(e3);
                        }
                        return this;
                    }
                    finally {
                        o = e2;
                    }
                }
                catch (k k) {
                    g = (kotlin.reflect.jvm.internal.impl.protobuf.g)k.a();
                    try {
                        throw k;
                    }
                    finally {
                        o = g;
                    }
                }
                if (o != null) {
                    this.D((e)o);
                }
            }
            
            @Override
            public final boolean a() {
                return true;
            }
            
            public e v() {
                final e w = this.w();
                if (w.a()) {
                    return w;
                }
                throw a.m(w);
            }
            
            public e w() {
                final e e = new e((i.b)this);
                if ((this.H & 0x1) == 0x1) {
                    this.I = Collections.unmodifiableList((List<? extends c>)this.I);
                    this.H &= 0xFFFFFFFE;
                }
                e.I = this.I;
                if ((this.H & 0x2) == 0x2) {
                    this.J = Collections.unmodifiableList((List<? extends Integer>)this.J);
                    this.H &= 0xFFFFFFFD;
                }
                e.J = this.J;
                return e;
            }
            
            public b x() {
                return y().D(this.w());
            }
        }
        
        public static final class c extends i implements e
        {
            private static final c T;
            public static s<c> U;
            private final d H;
            private int I;
            private int J;
            private int K;
            private Object L;
            private c M;
            private List<Integer> N;
            private int O;
            private List<Integer> P;
            private int Q;
            private byte R;
            private int S;
            
            static {
                c.U = new kotlin.reflect.jvm.internal.impl.protobuf.b<c>() {
                    public c m(final e e, final kotlin.reflect.jvm.internal.impl.protobuf.g g) throws k {
                        return new c(e, g);
                    }
                };
                (T = new c(true)).T();
            }
            
            private c(final e p0, final kotlin.reflect.jvm.internal.impl.protobuf.g p1) throws k {
                // 
                // This method could not be decompiled.
                // 
                // Original Bytecode:
                // 
                //     1: invokespecial   kotlin/reflect/jvm/internal/impl/protobuf/i.<init>:()V
                //     4: aload_0        
                //     5: iconst_m1      
                //     6: putfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$e$c.O:I
                //     9: aload_0        
                //    10: iconst_m1      
                //    11: putfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$e$c.Q:I
                //    14: aload_0        
                //    15: iconst_m1      
                //    16: i2b            
                //    17: putfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$e$c.R:B
                //    20: aload_0        
                //    21: iconst_m1      
                //    22: putfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$e$c.S:I
                //    25: aload_0        
                //    26: invokespecial   kotlin/reflect/jvm/internal/impl/metadata/jvm/a$e$c.T:()V
                //    29: invokestatic    kotlin/reflect/jvm/internal/impl/protobuf/d.v:()Lkotlin/reflect/jvm/internal/impl/protobuf/d$b;
                //    32: astore_3       
                //    33: aload_3        
                //    34: iconst_1       
                //    35: invokestatic    kotlin/reflect/jvm/internal/impl/protobuf/f.J:(Ljava/io/OutputStream;I)Lkotlin/reflect/jvm/internal/impl/protobuf/f;
                //    38: astore          4
                //    40: iconst_0       
                //    41: istore          5
                //    43: iconst_0       
                //    44: istore          6
                //    46: iload           5
                //    48: ifne            1198
                //    51: iload           6
                //    53: istore          7
                //    55: iload           6
                //    57: istore          8
                //    59: iload           6
                //    61: istore          9
                //    63: aload_1        
                //    64: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/e.K:()I
                //    67: istore          10
                //    69: iload           10
                //    71: ifeq            1071
                //    74: iload           10
                //    76: bipush          8
                //    78: if_icmpeq       1026
                //    81: iload           10
                //    83: bipush          16
                //    85: if_icmpeq       981
                //    88: iload           10
                //    90: bipush          24
                //    92: if_icmpeq       854
                //    95: iload           10
                //    97: bipush          32
                //    99: if_icmpeq       735
                //   102: iload           10
                //   104: bipush          34
                //   106: if_icmpeq       558
                //   109: iload           10
                //   111: bipush          40
                //   113: if_icmpeq       417
                //   116: iload           10
                //   118: bipush          42
                //   120: if_icmpeq       219
                //   123: iload           10
                //   125: bipush          50
                //   127: if_icmpeq       158
                //   130: iload           6
                //   132: istore          7
                //   134: iload           6
                //   136: istore          8
                //   138: iload           6
                //   140: istore          9
                //   142: aload_0        
                //   143: aload_1        
                //   144: aload           4
                //   146: aload_2        
                //   147: iload           10
                //   149: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/i.q:(Lkotlin/reflect/jvm/internal/impl/protobuf/e;Lkotlin/reflect/jvm/internal/impl/protobuf/f;Lkotlin/reflect/jvm/internal/impl/protobuf/g;I)Z
                //   152: ifne            46
                //   155: goto            1071
                //   158: iload           6
                //   160: istore          7
                //   162: iload           6
                //   164: istore          8
                //   166: iload           6
                //   168: istore          9
                //   170: aload_1        
                //   171: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/e.l:()Lkotlin/reflect/jvm/internal/impl/protobuf/d;
                //   174: astore          11
                //   176: iload           6
                //   178: istore          7
                //   180: iload           6
                //   182: istore          8
                //   184: iload           6
                //   186: istore          9
                //   188: aload_0        
                //   189: aload_0        
                //   190: getfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$e$c.I:I
                //   193: iconst_4       
                //   194: ior            
                //   195: putfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$e$c.I:I
                //   198: iload           6
                //   200: istore          7
                //   202: iload           6
                //   204: istore          8
                //   206: iload           6
                //   208: istore          9
                //   210: aload_0        
                //   211: aload           11
                //   213: putfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$e$c.L:Ljava/lang/Object;
                //   216: goto            46
                //   219: iload           6
                //   221: istore          7
                //   223: iload           6
                //   225: istore          8
                //   227: iload           6
                //   229: istore          9
                //   231: aload_1        
                //   232: aload_1        
                //   233: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/e.A:()I
                //   236: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/e.j:(I)I
                //   239: istore          12
                //   241: iload           6
                //   243: istore          10
                //   245: iload           6
                //   247: bipush          32
                //   249: iand           
                //   250: bipush          32
                //   252: if_icmpeq       337
                //   255: iload           6
                //   257: istore          10
                //   259: iload           6
                //   261: istore          7
                //   263: iload           6
                //   265: istore          8
                //   267: iload           6
                //   269: istore          9
                //   271: aload_1        
                //   272: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/e.e:()I
                //   275: ifle            337
                //   278: iload           6
                //   280: istore          7
                //   282: iload           6
                //   284: istore          8
                //   286: iload           6
                //   288: istore          9
                //   290: new             Ljava/util/ArrayList;
                //   293: astore          11
                //   295: iload           6
                //   297: istore          7
                //   299: iload           6
                //   301: istore          8
                //   303: iload           6
                //   305: istore          9
                //   307: aload           11
                //   309: invokespecial   java/util/ArrayList.<init>:()V
                //   312: iload           6
                //   314: istore          7
                //   316: iload           6
                //   318: istore          8
                //   320: iload           6
                //   322: istore          9
                //   324: aload_0        
                //   325: aload           11
                //   327: putfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$e$c.P:Ljava/util/List;
                //   330: iload           6
                //   332: bipush          32
                //   334: ior            
                //   335: istore          10
                //   337: iload           10
                //   339: istore          6
                //   341: iload           12
                //   343: istore          13
                //   345: iload           10
                //   347: istore          7
                //   349: iload           10
                //   351: istore          8
                //   353: iload           10
                //   355: istore          9
                //   357: aload_1        
                //   358: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/e.e:()I
                //   361: ifle            396
                //   364: iload           10
                //   366: istore          7
                //   368: iload           10
                //   370: istore          8
                //   372: iload           10
                //   374: istore          9
                //   376: aload_0        
                //   377: getfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$e$c.P:Ljava/util/List;
                //   380: aload_1        
                //   381: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/e.s:()I
                //   384: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
                //   387: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
                //   392: pop            
                //   393: goto            337
                //   396: iload           6
                //   398: istore          7
                //   400: iload           6
                //   402: istore          8
                //   404: iload           6
                //   406: istore          9
                //   408: aload_1        
                //   409: iload           13
                //   411: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/e.i:(I)V
                //   414: goto            46
                //   417: iload           6
                //   419: istore          10
                //   421: iload           6
                //   423: bipush          32
                //   425: iand           
                //   426: bipush          32
                //   428: if_icmpeq       490
                //   431: iload           6
                //   433: istore          7
                //   435: iload           6
                //   437: istore          8
                //   439: iload           6
                //   441: istore          9
                //   443: new             Ljava/util/ArrayList;
                //   446: astore          11
                //   448: iload           6
                //   450: istore          7
                //   452: iload           6
                //   454: istore          8
                //   456: iload           6
                //   458: istore          9
                //   460: aload           11
                //   462: invokespecial   java/util/ArrayList.<init>:()V
                //   465: iload           6
                //   467: istore          7
                //   469: iload           6
                //   471: istore          8
                //   473: iload           6
                //   475: istore          9
                //   477: aload_0        
                //   478: aload           11
                //   480: putfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$e$c.P:Ljava/util/List;
                //   483: iload           6
                //   485: bipush          32
                //   487: ior            
                //   488: istore          10
                //   490: iload           10
                //   492: istore          7
                //   494: iload           10
                //   496: istore          8
                //   498: iload           10
                //   500: istore          9
                //   502: aload_0        
                //   503: getfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$e$c.P:Ljava/util/List;
                //   506: astore          14
                //   508: iload           10
                //   510: istore          7
                //   512: iload           10
                //   514: istore          8
                //   516: iload           10
                //   518: istore          9
                //   520: aload_1        
                //   521: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/e.s:()I
                //   524: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
                //   527: astore          11
                //   529: iload           10
                //   531: istore          6
                //   533: iload           6
                //   535: istore          7
                //   537: iload           6
                //   539: istore          8
                //   541: iload           6
                //   543: istore          9
                //   545: aload           14
                //   547: aload           11
                //   549: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
                //   554: pop            
                //   555: goto            46
                //   558: iload           6
                //   560: istore          7
                //   562: iload           6
                //   564: istore          8
                //   566: iload           6
                //   568: istore          9
                //   570: aload_1        
                //   571: aload_1        
                //   572: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/e.A:()I
                //   575: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/e.j:(I)I
                //   578: istore          12
                //   580: iload           6
                //   582: istore          10
                //   584: iload           6
                //   586: bipush          16
                //   588: iand           
                //   589: bipush          16
                //   591: if_icmpeq       676
                //   594: iload           6
                //   596: istore          10
                //   598: iload           6
                //   600: istore          7
                //   602: iload           6
                //   604: istore          8
                //   606: iload           6
                //   608: istore          9
                //   610: aload_1        
                //   611: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/e.e:()I
                //   614: ifle            676
                //   617: iload           6
                //   619: istore          7
                //   621: iload           6
                //   623: istore          8
                //   625: iload           6
                //   627: istore          9
                //   629: new             Ljava/util/ArrayList;
                //   632: astore          11
                //   634: iload           6
                //   636: istore          7
                //   638: iload           6
                //   640: istore          8
                //   642: iload           6
                //   644: istore          9
                //   646: aload           11
                //   648: invokespecial   java/util/ArrayList.<init>:()V
                //   651: iload           6
                //   653: istore          7
                //   655: iload           6
                //   657: istore          8
                //   659: iload           6
                //   661: istore          9
                //   663: aload_0        
                //   664: aload           11
                //   666: putfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$e$c.N:Ljava/util/List;
                //   669: iload           6
                //   671: bipush          16
                //   673: ior            
                //   674: istore          10
                //   676: iload           10
                //   678: istore          6
                //   680: iload           12
                //   682: istore          13
                //   684: iload           10
                //   686: istore          7
                //   688: iload           10
                //   690: istore          8
                //   692: iload           10
                //   694: istore          9
                //   696: aload_1        
                //   697: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/e.e:()I
                //   700: ifle            396
                //   703: iload           10
                //   705: istore          7
                //   707: iload           10
                //   709: istore          8
                //   711: iload           10
                //   713: istore          9
                //   715: aload_0        
                //   716: getfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$e$c.N:Ljava/util/List;
                //   719: aload_1        
                //   720: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/e.s:()I
                //   723: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
                //   726: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
                //   731: pop            
                //   732: goto            676
                //   735: iload           6
                //   737: istore          10
                //   739: iload           6
                //   741: bipush          16
                //   743: iand           
                //   744: bipush          16
                //   746: if_icmpeq       808
                //   749: iload           6
                //   751: istore          7
                //   753: iload           6
                //   755: istore          8
                //   757: iload           6
                //   759: istore          9
                //   761: new             Ljava/util/ArrayList;
                //   764: astore          11
                //   766: iload           6
                //   768: istore          7
                //   770: iload           6
                //   772: istore          8
                //   774: iload           6
                //   776: istore          9
                //   778: aload           11
                //   780: invokespecial   java/util/ArrayList.<init>:()V
                //   783: iload           6
                //   785: istore          7
                //   787: iload           6
                //   789: istore          8
                //   791: iload           6
                //   793: istore          9
                //   795: aload_0        
                //   796: aload           11
                //   798: putfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$e$c.N:Ljava/util/List;
                //   801: iload           6
                //   803: bipush          16
                //   805: ior            
                //   806: istore          10
                //   808: iload           10
                //   810: istore          7
                //   812: iload           10
                //   814: istore          8
                //   816: iload           10
                //   818: istore          9
                //   820: aload_0        
                //   821: getfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$e$c.N:Ljava/util/List;
                //   824: astore          14
                //   826: iload           10
                //   828: istore          7
                //   830: iload           10
                //   832: istore          8
                //   834: iload           10
                //   836: istore          9
                //   838: aload_1        
                //   839: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/e.s:()I
                //   842: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
                //   845: astore          11
                //   847: iload           10
                //   849: istore          6
                //   851: goto            533
                //   854: iload           6
                //   856: istore          7
                //   858: iload           6
                //   860: istore          8
                //   862: iload           6
                //   864: istore          9
                //   866: aload_1        
                //   867: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/e.n:()I
                //   870: istore          13
                //   872: iload           6
                //   874: istore          7
                //   876: iload           6
                //   878: istore          8
                //   880: iload           6
                //   882: istore          9
                //   884: iload           13
                //   886: invokestatic    kotlin/reflect/jvm/internal/impl/metadata/jvm/a$e$c$c.b:(I)Lkotlin/reflect/jvm/internal/impl/metadata/jvm/a$e$c$c;
                //   889: astore          11
                //   891: aload           11
                //   893: ifnonnull       937
                //   896: iload           6
                //   898: istore          7
                //   900: iload           6
                //   902: istore          8
                //   904: iload           6
                //   906: istore          9
                //   908: aload           4
                //   910: iload           10
                //   912: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/f.o0:(I)V
                //   915: iload           6
                //   917: istore          7
                //   919: iload           6
                //   921: istore          8
                //   923: iload           6
                //   925: istore          9
                //   927: aload           4
                //   929: iload           13
                //   931: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/f.o0:(I)V
                //   934: goto            46
                //   937: iload           6
                //   939: istore          7
                //   941: iload           6
                //   943: istore          8
                //   945: iload           6
                //   947: istore          9
                //   949: aload_0        
                //   950: aload_0        
                //   951: getfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$e$c.I:I
                //   954: bipush          8
                //   956: ior            
                //   957: putfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$e$c.I:I
                //   960: iload           6
                //   962: istore          7
                //   964: iload           6
                //   966: istore          8
                //   968: iload           6
                //   970: istore          9
                //   972: aload_0        
                //   973: aload           11
                //   975: putfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$e$c.M:Lkotlin/reflect/jvm/internal/impl/metadata/jvm/a$e$c$c;
                //   978: goto            46
                //   981: iload           6
                //   983: istore          7
                //   985: iload           6
                //   987: istore          8
                //   989: iload           6
                //   991: istore          9
                //   993: aload_0        
                //   994: aload_0        
                //   995: getfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$e$c.I:I
                //   998: iconst_2       
                //   999: ior            
                //  1000: putfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$e$c.I:I
                //  1003: iload           6
                //  1005: istore          7
                //  1007: iload           6
                //  1009: istore          8
                //  1011: iload           6
                //  1013: istore          9
                //  1015: aload_0        
                //  1016: aload_1        
                //  1017: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/e.s:()I
                //  1020: putfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$e$c.K:I
                //  1023: goto            46
                //  1026: iload           6
                //  1028: istore          7
                //  1030: iload           6
                //  1032: istore          8
                //  1034: iload           6
                //  1036: istore          9
                //  1038: aload_0        
                //  1039: aload_0        
                //  1040: getfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$e$c.I:I
                //  1043: iconst_1       
                //  1044: ior            
                //  1045: putfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$e$c.I:I
                //  1048: iload           6
                //  1050: istore          7
                //  1052: iload           6
                //  1054: istore          8
                //  1056: iload           6
                //  1058: istore          9
                //  1060: aload_0        
                //  1061: aload_1        
                //  1062: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/e.s:()I
                //  1065: putfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$e$c.J:I
                //  1068: goto            46
                //  1071: iconst_1       
                //  1072: istore          5
                //  1074: goto            46
                //  1077: astore_1       
                //  1078: goto            1123
                //  1081: astore_1       
                //  1082: iload           8
                //  1084: istore          7
                //  1086: new             Lkotlin/reflect/jvm/internal/impl/protobuf/k;
                //  1089: astore_2       
                //  1090: iload           8
                //  1092: istore          7
                //  1094: aload_2        
                //  1095: aload_1        
                //  1096: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
                //  1099: invokespecial   kotlin/reflect/jvm/internal/impl/protobuf/k.<init>:(Ljava/lang/String;)V
                //  1102: iload           8
                //  1104: istore          7
                //  1106: aload_2        
                //  1107: aload_0        
                //  1108: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/k.i:(Lkotlin/reflect/jvm/internal/impl/protobuf/q;)Lkotlin/reflect/jvm/internal/impl/protobuf/k;
                //  1111: athrow         
                //  1112: astore_1       
                //  1113: iload           9
                //  1115: istore          7
                //  1117: aload_1        
                //  1118: aload_0        
                //  1119: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/k.i:(Lkotlin/reflect/jvm/internal/impl/protobuf/q;)Lkotlin/reflect/jvm/internal/impl/protobuf/k;
                //  1122: athrow         
                //  1123: iload           7
                //  1125: bipush          16
                //  1127: iand           
                //  1128: bipush          16
                //  1130: if_icmpne       1144
                //  1133: aload_0        
                //  1134: aload_0        
                //  1135: getfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$e$c.N:Ljava/util/List;
                //  1138: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
                //  1141: putfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$e$c.N:Ljava/util/List;
                //  1144: iload           7
                //  1146: bipush          32
                //  1148: iand           
                //  1149: bipush          32
                //  1151: if_icmpne       1165
                //  1154: aload_0        
                //  1155: aload_0        
                //  1156: getfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$e$c.P:Ljava/util/List;
                //  1159: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
                //  1162: putfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$e$c.P:Ljava/util/List;
                //  1165: aload           4
                //  1167: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/f.I:()V
                //  1170: aload_0        
                //  1171: aload_3        
                //  1172: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/d$b.e:()Lkotlin/reflect/jvm/internal/impl/protobuf/d;
                //  1175: putfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$e$c.H:Lkotlin/reflect/jvm/internal/impl/protobuf/d;
                //  1178: goto            1192
                //  1181: astore_1       
                //  1182: aload_0        
                //  1183: aload_3        
                //  1184: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/d$b.e:()Lkotlin/reflect/jvm/internal/impl/protobuf/d;
                //  1187: putfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$e$c.H:Lkotlin/reflect/jvm/internal/impl/protobuf/d;
                //  1190: aload_1        
                //  1191: athrow         
                //  1192: aload_0        
                //  1193: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/i.n:()V
                //  1196: aload_1        
                //  1197: athrow         
                //  1198: iload           6
                //  1200: bipush          16
                //  1202: iand           
                //  1203: bipush          16
                //  1205: if_icmpne       1219
                //  1208: aload_0        
                //  1209: aload_0        
                //  1210: getfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$e$c.N:Ljava/util/List;
                //  1213: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
                //  1216: putfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$e$c.N:Ljava/util/List;
                //  1219: iload           6
                //  1221: bipush          32
                //  1223: iand           
                //  1224: bipush          32
                //  1226: if_icmpne       1240
                //  1229: aload_0        
                //  1230: aload_0        
                //  1231: getfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$e$c.P:Ljava/util/List;
                //  1234: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
                //  1237: putfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$e$c.P:Ljava/util/List;
                //  1240: aload           4
                //  1242: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/f.I:()V
                //  1245: aload_0        
                //  1246: aload_3        
                //  1247: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/d$b.e:()Lkotlin/reflect/jvm/internal/impl/protobuf/d;
                //  1250: putfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$e$c.H:Lkotlin/reflect/jvm/internal/impl/protobuf/d;
                //  1253: goto            1267
                //  1256: astore_1       
                //  1257: aload_0        
                //  1258: aload_3        
                //  1259: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/d$b.e:()Lkotlin/reflect/jvm/internal/impl/protobuf/d;
                //  1262: putfield        kotlin/reflect/jvm/internal/impl/metadata/jvm/a$e$c.H:Lkotlin/reflect/jvm/internal/impl/protobuf/d;
                //  1265: aload_1        
                //  1266: athrow         
                //  1267: aload_0        
                //  1268: invokevirtual   kotlin/reflect/jvm/internal/impl/protobuf/i.n:()V
                //  1271: return         
                //  1272: astore_2       
                //  1273: goto            1170
                //  1276: astore_1       
                //  1277: goto            1245
                //    Exceptions:
                //  throws kotlin.reflect.jvm.internal.impl.protobuf.k
                //    Exceptions:
                //  Try           Handler
                //  Start  End    Start  End    Type                                         
                //  -----  -----  -----  -----  ---------------------------------------------
                //  63     69     1112   1123   Lkotlin/reflect/jvm/internal/impl/protobuf/k;
                //  63     69     1081   1112   Ljava/io/IOException;
                //  63     69     1077   1198   Any
                //  142    155    1112   1123   Lkotlin/reflect/jvm/internal/impl/protobuf/k;
                //  142    155    1081   1112   Ljava/io/IOException;
                //  142    155    1077   1198   Any
                //  170    176    1112   1123   Lkotlin/reflect/jvm/internal/impl/protobuf/k;
                //  170    176    1081   1112   Ljava/io/IOException;
                //  170    176    1077   1198   Any
                //  188    198    1112   1123   Lkotlin/reflect/jvm/internal/impl/protobuf/k;
                //  188    198    1081   1112   Ljava/io/IOException;
                //  188    198    1077   1198   Any
                //  210    216    1112   1123   Lkotlin/reflect/jvm/internal/impl/protobuf/k;
                //  210    216    1081   1112   Ljava/io/IOException;
                //  210    216    1077   1198   Any
                //  231    241    1112   1123   Lkotlin/reflect/jvm/internal/impl/protobuf/k;
                //  231    241    1081   1112   Ljava/io/IOException;
                //  231    241    1077   1198   Any
                //  271    278    1112   1123   Lkotlin/reflect/jvm/internal/impl/protobuf/k;
                //  271    278    1081   1112   Ljava/io/IOException;
                //  271    278    1077   1198   Any
                //  290    295    1112   1123   Lkotlin/reflect/jvm/internal/impl/protobuf/k;
                //  290    295    1081   1112   Ljava/io/IOException;
                //  290    295    1077   1198   Any
                //  307    312    1112   1123   Lkotlin/reflect/jvm/internal/impl/protobuf/k;
                //  307    312    1081   1112   Ljava/io/IOException;
                //  307    312    1077   1198   Any
                //  324    330    1112   1123   Lkotlin/reflect/jvm/internal/impl/protobuf/k;
                //  324    330    1081   1112   Ljava/io/IOException;
                //  324    330    1077   1198   Any
                //  357    364    1112   1123   Lkotlin/reflect/jvm/internal/impl/protobuf/k;
                //  357    364    1081   1112   Ljava/io/IOException;
                //  357    364    1077   1198   Any
                //  376    393    1112   1123   Lkotlin/reflect/jvm/internal/impl/protobuf/k;
                //  376    393    1081   1112   Ljava/io/IOException;
                //  376    393    1077   1198   Any
                //  408    414    1112   1123   Lkotlin/reflect/jvm/internal/impl/protobuf/k;
                //  408    414    1081   1112   Ljava/io/IOException;
                //  408    414    1077   1198   Any
                //  443    448    1112   1123   Lkotlin/reflect/jvm/internal/impl/protobuf/k;
                //  443    448    1081   1112   Ljava/io/IOException;
                //  443    448    1077   1198   Any
                //  460    465    1112   1123   Lkotlin/reflect/jvm/internal/impl/protobuf/k;
                //  460    465    1081   1112   Ljava/io/IOException;
                //  460    465    1077   1198   Any
                //  477    483    1112   1123   Lkotlin/reflect/jvm/internal/impl/protobuf/k;
                //  477    483    1081   1112   Ljava/io/IOException;
                //  477    483    1077   1198   Any
                //  502    508    1112   1123   Lkotlin/reflect/jvm/internal/impl/protobuf/k;
                //  502    508    1081   1112   Ljava/io/IOException;
                //  502    508    1077   1198   Any
                //  520    529    1112   1123   Lkotlin/reflect/jvm/internal/impl/protobuf/k;
                //  520    529    1081   1112   Ljava/io/IOException;
                //  520    529    1077   1198   Any
                //  545    555    1112   1123   Lkotlin/reflect/jvm/internal/impl/protobuf/k;
                //  545    555    1081   1112   Ljava/io/IOException;
                //  545    555    1077   1198   Any
                //  570    580    1112   1123   Lkotlin/reflect/jvm/internal/impl/protobuf/k;
                //  570    580    1081   1112   Ljava/io/IOException;
                //  570    580    1077   1198   Any
                //  610    617    1112   1123   Lkotlin/reflect/jvm/internal/impl/protobuf/k;
                //  610    617    1081   1112   Ljava/io/IOException;
                //  610    617    1077   1198   Any
                //  629    634    1112   1123   Lkotlin/reflect/jvm/internal/impl/protobuf/k;
                //  629    634    1081   1112   Ljava/io/IOException;
                //  629    634    1077   1198   Any
                //  646    651    1112   1123   Lkotlin/reflect/jvm/internal/impl/protobuf/k;
                //  646    651    1081   1112   Ljava/io/IOException;
                //  646    651    1077   1198   Any
                //  663    669    1112   1123   Lkotlin/reflect/jvm/internal/impl/protobuf/k;
                //  663    669    1081   1112   Ljava/io/IOException;
                //  663    669    1077   1198   Any
                //  696    703    1112   1123   Lkotlin/reflect/jvm/internal/impl/protobuf/k;
                //  696    703    1081   1112   Ljava/io/IOException;
                //  696    703    1077   1198   Any
                //  715    732    1112   1123   Lkotlin/reflect/jvm/internal/impl/protobuf/k;
                //  715    732    1081   1112   Ljava/io/IOException;
                //  715    732    1077   1198   Any
                //  761    766    1112   1123   Lkotlin/reflect/jvm/internal/impl/protobuf/k;
                //  761    766    1081   1112   Ljava/io/IOException;
                //  761    766    1077   1198   Any
                //  778    783    1112   1123   Lkotlin/reflect/jvm/internal/impl/protobuf/k;
                //  778    783    1081   1112   Ljava/io/IOException;
                //  778    783    1077   1198   Any
                //  795    801    1112   1123   Lkotlin/reflect/jvm/internal/impl/protobuf/k;
                //  795    801    1081   1112   Ljava/io/IOException;
                //  795    801    1077   1198   Any
                //  820    826    1112   1123   Lkotlin/reflect/jvm/internal/impl/protobuf/k;
                //  820    826    1081   1112   Ljava/io/IOException;
                //  820    826    1077   1198   Any
                //  838    847    1112   1123   Lkotlin/reflect/jvm/internal/impl/protobuf/k;
                //  838    847    1081   1112   Ljava/io/IOException;
                //  838    847    1077   1198   Any
                //  866    872    1112   1123   Lkotlin/reflect/jvm/internal/impl/protobuf/k;
                //  866    872    1081   1112   Ljava/io/IOException;
                //  866    872    1077   1198   Any
                //  884    891    1112   1123   Lkotlin/reflect/jvm/internal/impl/protobuf/k;
                //  884    891    1081   1112   Ljava/io/IOException;
                //  884    891    1077   1198   Any
                //  908    915    1112   1123   Lkotlin/reflect/jvm/internal/impl/protobuf/k;
                //  908    915    1081   1112   Ljava/io/IOException;
                //  908    915    1077   1198   Any
                //  927    934    1112   1123   Lkotlin/reflect/jvm/internal/impl/protobuf/k;
                //  927    934    1081   1112   Ljava/io/IOException;
                //  927    934    1077   1198   Any
                //  949    960    1112   1123   Lkotlin/reflect/jvm/internal/impl/protobuf/k;
                //  949    960    1081   1112   Ljava/io/IOException;
                //  949    960    1077   1198   Any
                //  972    978    1112   1123   Lkotlin/reflect/jvm/internal/impl/protobuf/k;
                //  972    978    1081   1112   Ljava/io/IOException;
                //  972    978    1077   1198   Any
                //  993    1003   1112   1123   Lkotlin/reflect/jvm/internal/impl/protobuf/k;
                //  993    1003   1081   1112   Ljava/io/IOException;
                //  993    1003   1077   1198   Any
                //  1015   1023   1112   1123   Lkotlin/reflect/jvm/internal/impl/protobuf/k;
                //  1015   1023   1081   1112   Ljava/io/IOException;
                //  1015   1023   1077   1198   Any
                //  1038   1048   1112   1123   Lkotlin/reflect/jvm/internal/impl/protobuf/k;
                //  1038   1048   1081   1112   Ljava/io/IOException;
                //  1038   1048   1077   1198   Any
                //  1060   1068   1112   1123   Lkotlin/reflect/jvm/internal/impl/protobuf/k;
                //  1060   1068   1081   1112   Ljava/io/IOException;
                //  1060   1068   1077   1198   Any
                //  1086   1090   1077   1198   Any
                //  1094   1102   1077   1198   Any
                //  1106   1112   1077   1198   Any
                //  1117   1123   1077   1198   Any
                //  1165   1170   1272   1276   Ljava/io/IOException;
                //  1165   1170   1181   1192   Any
                //  1240   1245   1276   1280   Ljava/io/IOException;
                //  1240   1245   1256   1267   Any
                // 
                // The error that occurred was:
                // 
                // java.lang.IllegalStateException: Expression is linked from several locations: Label_1165:
                //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
                //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
                //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
                //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:713)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:549)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:576)
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
            
            private c(final i.b b) {
                super(b);
                this.O = -1;
                this.Q = -1;
                this.R = -1;
                this.S = -1;
                this.H = b.r();
            }
            
            private c(final boolean b) {
                this.O = -1;
                this.Q = -1;
                this.R = -1;
                this.S = -1;
                this.H = d.G;
            }
            
            public static c E() {
                return c.T;
            }
            
            private void T() {
                this.J = 1;
                this.K = 0;
                this.L = "";
                this.M = c.H;
                this.N = Collections.emptyList();
                this.P = Collections.emptyList();
            }
            
            public static b U() {
                return y();
            }
            
            public static b V(final c c) {
                return U().D(c);
            }
            
            public c F() {
                return c.T;
            }
            
            public c G() {
                return this.M;
            }
            
            public int H() {
                return this.K;
            }
            
            public int I() {
                return this.J;
            }
            
            public int J() {
                return this.P.size();
            }
            
            public List<Integer> K() {
                return this.P;
            }
            
            public String L() {
                final Object l = this.L;
                if (l instanceof String) {
                    return (String)l;
                }
                final d d = (d)l;
                final String c = d.C();
                if (d.q()) {
                    this.L = c;
                }
                return c;
            }
            
            public d M() {
                final Object l = this.L;
                if (l instanceof String) {
                    return (d)(this.L = d.l((String)l));
                }
                return (d)l;
            }
            
            public int N() {
                return this.N.size();
            }
            
            public List<Integer> O() {
                return this.N;
            }
            
            public boolean P() {
                return (this.I & 0x8) == 0x8;
            }
            
            public boolean Q() {
                return (this.I & 0x2) == 0x2;
            }
            
            public boolean R() {
                final int i = this.I;
                boolean b = true;
                if ((i & 0x1) != 0x1) {
                    b = false;
                }
                return b;
            }
            
            public boolean S() {
                return (this.I & 0x4) == 0x4;
            }
            
            public b W() {
                return U();
            }
            
            public b X() {
                return V(this);
            }
            
            @Override
            public final boolean a() {
                final byte r = this.R;
                if (r == 1) {
                    return true;
                }
                if (r == 0) {
                    return false;
                }
                this.R = 1;
                return true;
            }
            
            @Override
            public void d(final f f) throws IOException {
                this.f();
                if ((this.I & 0x1) == 0x1) {
                    f.a0(1, this.J);
                }
                if ((this.I & 0x2) == 0x2) {
                    f.a0(2, this.K);
                }
                if ((this.I & 0x8) == 0x8) {
                    f.S(3, this.M.q());
                }
                if (this.O().size() > 0) {
                    f.o0(34);
                    f.o0(this.O);
                }
                final int n = 0;
                for (int i = 0; i < this.N.size(); ++i) {
                    f.b0(this.N.get(i));
                }
                int j = n;
                if (this.K().size() > 0) {
                    f.o0(42);
                    f.o0(this.Q);
                    j = n;
                }
                while (j < this.P.size()) {
                    f.b0(this.P.get(j));
                    ++j;
                }
                if ((this.I & 0x4) == 0x4) {
                    f.O(6, this.M());
                }
                f.i0(this.H);
            }
            
            @Override
            public int f() {
                final int s = this.S;
                if (s != -1) {
                    return s;
                }
                final int i = this.I;
                final int n = 0;
                int n2;
                if ((i & 0x1) == 0x1) {
                    n2 = f.o(1, this.J) + 0;
                }
                else {
                    n2 = 0;
                }
                int n3 = n2;
                if ((this.I & 0x2) == 0x2) {
                    n3 = n2 + f.o(2, this.K);
                }
                int n4 = n3;
                if ((this.I & 0x8) == 0x8) {
                    n4 = n3 + f.h(3, this.M.q());
                }
                int j = 0;
                int o = 0;
                while (j < this.N.size()) {
                    o += f.p(this.N.get(j));
                    ++j;
                }
                int n5 = n4 + o;
                if (!this.O().isEmpty()) {
                    n5 = n5 + 1 + f.p(o);
                }
                this.O = o;
                int q = 0;
                for (int k = n; k < this.P.size(); ++k) {
                    q += f.p(this.P.get(k));
                }
                int n7;
                final int n6 = n7 = n5 + q;
                if (!this.K().isEmpty()) {
                    n7 = n6 + 1 + f.p(q);
                }
                this.Q = q;
                int n8 = n7;
                if ((this.I & 0x4) == 0x4) {
                    n8 = n7 + f.d(6, this.M());
                }
                return this.S = n8 + this.H.size();
            }
            
            @Override
            public s<c> i() {
                return c.U;
            }
            
            public static final class b extends i.b<c, b> implements e
            {
                private int H;
                private int I;
                private int J;
                private Object K;
                private c L;
                private List<Integer> M;
                private List<Integer> N;
                
                private b() {
                    this.I = 1;
                    this.K = "";
                    this.L = c.H;
                    this.M = Collections.emptyList();
                    this.N = Collections.emptyList();
                    this.C();
                }
                
                private void A() {
                    if ((this.H & 0x10) != 0x10) {
                        this.M = new ArrayList<Integer>(this.M);
                        this.H |= 0x10;
                    }
                }
                
                private void C() {
                }
                
                private static b y() {
                    return new b();
                }
                
                private void z() {
                    if ((this.H & 0x20) != 0x20) {
                        this.N = new ArrayList<Integer>(this.N);
                        this.H |= 0x20;
                    }
                }
                
                public c B() {
                    return c.E();
                }
                
                public b D(final c c) {
                    if (c == c.E()) {
                        return this;
                    }
                    if (c.R()) {
                        this.I(c.I());
                    }
                    if (c.Q()) {
                        this.H(c.H());
                    }
                    if (c.S()) {
                        this.H |= 0x4;
                        this.K = c.L;
                    }
                    if (c.P()) {
                        this.F(c.G());
                    }
                    if (!c.N.isEmpty()) {
                        if (this.M.isEmpty()) {
                            this.M = c.N;
                            this.H &= 0xFFFFFFEF;
                        }
                        else {
                            this.A();
                            this.M.addAll(c.N);
                        }
                    }
                    if (!c.P.isEmpty()) {
                        if (this.N.isEmpty()) {
                            this.N = c.P;
                            this.H &= 0xFFFFFFDF;
                        }
                        else {
                            this.z();
                            this.N.addAll(c.P);
                        }
                    }
                    this.t(((i.b)this).r().f(c.H));
                    return this;
                }
                
                public b E(final e e, kotlin.reflect.jvm.internal.impl.protobuf.g g) throws IOException {
                    final kotlin.reflect.jvm.internal.impl.protobuf.g g2 = null;
                    try {
                        try {
                            final c c = kotlin.reflect.jvm.internal.impl.metadata.jvm.a.e.c.U.b(e, g);
                            if (c != null) {
                                this.D(c);
                            }
                            return this;
                        }
                        finally {
                            g = g2;
                        }
                    }
                    catch (k k) {
                        g = (kotlin.reflect.jvm.internal.impl.protobuf.g)k.a();
                        try {
                            throw k;
                        }
                        finally {}
                    }
                    if (g != null) {
                        this.D((c)g);
                    }
                }
                
                public b F(final c c) {
                    Objects.requireNonNull(c);
                    this.H |= 0x8;
                    this.L = c;
                    return this;
                }
                
                public b H(final int j) {
                    this.H |= 0x2;
                    this.J = j;
                    return this;
                }
                
                public b I(final int i) {
                    this.H |= 0x1;
                    this.I = i;
                    return this;
                }
                
                @Override
                public final boolean a() {
                    return true;
                }
                
                public c v() {
                    final c w = this.w();
                    if (w.a()) {
                        return w;
                    }
                    throw a.m(w);
                }
                
                public c w() {
                    final c c = new c((i.b)this);
                    final int h = this.H;
                    boolean b = true;
                    if ((h & 0x1) != 0x1) {
                        b = false;
                    }
                    c.J = this.I;
                    int n = b ? 1 : 0;
                    if ((h & 0x2) == 0x2) {
                        n = ((b ? 1 : 0) | 0x2);
                    }
                    c.K = this.J;
                    int n2 = n;
                    if ((h & 0x4) == 0x4) {
                        n2 = (n | 0x4);
                    }
                    c.L = this.K;
                    int n3 = n2;
                    if ((h & 0x8) == 0x8) {
                        n3 = (n2 | 0x8);
                    }
                    c.M = this.L;
                    if ((this.H & 0x10) == 0x10) {
                        this.M = Collections.unmodifiableList((List<? extends Integer>)this.M);
                        this.H &= 0xFFFFFFEF;
                    }
                    c.N = this.M;
                    if ((this.H & 0x20) == 0x20) {
                        this.N = Collections.unmodifiableList((List<? extends Integer>)this.N);
                        this.H &= 0xFFFFFFDF;
                    }
                    c.P = this.N;
                    c.I = n3;
                    return c;
                }
                
                public b x() {
                    return y().D(this.w());
                }
            }
            
            public enum c implements j.a
            {
                H(0, 0), 
                I(1, 1), 
                J(2, 2);
                
                private static j.b<c> K;
                private final int G;
                
                static {
                    c.K = new j.b<c>() {
                        public c b(final int n) {
                            return c.b(n);
                        }
                    };
                }
                
                private c(final int n, final int g) {
                    this.G = g;
                }
                
                public static c b(final int n) {
                    if (n == 0) {
                        return c.H;
                    }
                    if (n == 1) {
                        return c.I;
                    }
                    if (n != 2) {
                        return null;
                    }
                    return c.J;
                }
                
                @Override
                public final int q() {
                    return this.G;
                }
            }
        }
    }
}
