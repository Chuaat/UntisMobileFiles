// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.engine;

import java.util.Map;
import com.bumptech.glide.util.pool.b;
import android.content.Context;
import androidx.annotation.j0;
import android.os.Build$VERSION;
import android.util.Log;
import com.bumptech.glide.load.data.e;
import java.util.Collection;
import java.util.ArrayList;
import com.bumptech.glide.d;
import androidx.core.util.m;
import com.bumptech.glide.util.pool.c;
import java.util.List;
import com.bumptech.glide.util.pool.a;

class h<R> implements com.bumptech.glide.load.engine.f.a, Runnable, Comparable<h<?>>, com.bumptech.glide.util.pool.a.f
{
    private static final String l0 = "DecodeJob";
    private final com.bumptech.glide.load.engine.g<R> G;
    private final List<Throwable> H;
    private final com.bumptech.glide.util.pool.c I;
    private final e J;
    private final m.a<h<?>> K;
    private final d<?> L;
    private final f M;
    private com.bumptech.glide.d N;
    private com.bumptech.glide.load.g O;
    private h P;
    private n Q;
    private int R;
    private int S;
    private j T;
    private com.bumptech.glide.load.j U;
    private b<R> V;
    private int W;
    private h X;
    private g Y;
    private long Z;
    private boolean a0;
    private Object b0;
    private Thread c0;
    private com.bumptech.glide.load.g d0;
    private com.bumptech.glide.load.g e0;
    private Object f0;
    private com.bumptech.glide.load.a g0;
    private com.bumptech.glide.load.data.d<?> h0;
    private volatile com.bumptech.glide.load.engine.f i0;
    private volatile boolean j0;
    private volatile boolean k0;
    
    h(final e j, final m.a<h<?>> k) {
        this.G = new com.bumptech.glide.load.engine.g<R>();
        this.H = new ArrayList<Throwable>();
        this.I = com.bumptech.glide.util.pool.c.a();
        this.L = new d<Object>();
        this.M = new f();
        this.J = j;
        this.K = k;
    }
    
    private void A(final v<R> v, final com.bumptech.glide.load.a a) {
        if (v instanceof r) {
            ((r)v).b();
        }
        u<R> c = null;
        v<R> v2 = v;
        if (this.L.c()) {
            v2 = (c = u.c(v));
        }
        this.z(v2, a);
        this.X = h.K;
        try {
            if (this.L.c()) {
                this.L.b(this.J, this.U);
            }
            if (c != null) {
                c.e();
            }
            this.E();
        }
        finally {
            if (c != null) {
                c.e();
            }
        }
    }
    
    private void B() {
        this.T();
        this.V.a(new q("Failed to load resource", new ArrayList<Throwable>(this.H)));
        this.G();
    }
    
    private void E() {
        if (this.M.b()) {
            this.M();
        }
    }
    
    private void G() {
        if (this.M.c()) {
            this.M();
        }
    }
    
    private void M() {
        this.M.e();
        this.L.a();
        this.G.a();
        this.j0 = false;
        this.N = null;
        this.O = null;
        this.U = null;
        this.P = null;
        this.Q = null;
        this.V = null;
        this.X = null;
        this.i0 = null;
        this.c0 = null;
        this.d0 = null;
        this.f0 = null;
        this.g0 = null;
        this.h0 = null;
        this.Z = 0L;
        this.k0 = false;
        this.b0 = null;
        this.H.clear();
        this.K.a(this);
    }
    
    private void O() {
        this.c0 = Thread.currentThread();
        this.Z = com.bumptech.glide.util.g.b();
        boolean a = false;
        do {
            boolean b = a;
            if (!this.k0) {
                b = a;
                if (this.i0 != null) {
                    a = this.i0.a();
                    if (!(b = a)) {
                        this.X = this.o(this.X);
                        this.i0 = this.m();
                        continue;
                    }
                }
            }
            if ((this.X == h.L || this.k0) && !b) {
                this.B();
            }
            return;
        } while (this.X != h.J);
        this.d();
    }
    
    private <Data, ResourceType> v<R> P(Data l, final com.bumptech.glide.load.a a, final t<Data, ResourceType, R> t) throws q {
        final com.bumptech.glide.load.j p3 = this.p(a);
        l = (Data)this.N.h().l(l);
        try {
            return t.b((com.bumptech.glide.load.data.e<Data>)l, p3, this.R, this.S, new c<ResourceType>(a));
        }
        finally {
            ((com.bumptech.glide.load.data.e)l).b();
        }
    }
    
    private void Q() {
        final int n = h$a.a[this.Y.ordinal()];
        if (n != 1) {
            if (n != 2) {
                if (n == 3) {
                    this.l();
                    return;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("Unrecognized run reason: ");
                sb.append(this.Y);
                throw new IllegalStateException(sb.toString());
            }
        }
        else {
            this.X = this.o(h.G);
            this.i0 = this.m();
        }
        this.O();
    }
    
    private void T() {
        this.I.c();
        if (this.j0) {
            Throwable cause;
            if (this.H.isEmpty()) {
                cause = null;
            }
            else {
                final List<Throwable> h = this.H;
                cause = h.get(h.size() - 1);
            }
            throw new IllegalStateException("Already notified", cause);
        }
        this.j0 = true;
    }
    
    private <Data> v<R> j(final com.bumptech.glide.load.data.d<?> d, final Data data, final com.bumptech.glide.load.a a) throws q {
        if (data == null) {
            d.b();
            return null;
        }
        try {
            final long b = com.bumptech.glide.util.g.b();
            final v<R> k = this.k(data, a);
            if (Log.isLoggable("DecodeJob", 2)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Decoded result ");
                sb.append(k);
                this.v(sb.toString(), b);
            }
            return k;
        }
        finally {
            d.b();
        }
    }
    
    private <Data> v<R> k(final Data data, final com.bumptech.glide.load.a a) throws q {
        return this.P(data, a, (t<Data, ?, R>)this.G.h(data.getClass()));
    }
    
    private void l() {
        if (Log.isLoggable("DecodeJob", 2)) {
            final long z = this.Z;
            final StringBuilder sb = new StringBuilder();
            sb.append("data: ");
            sb.append(this.f0);
            sb.append(", cache key: ");
            sb.append(this.d0);
            sb.append(", fetcher: ");
            sb.append(this.h0);
            this.y("Retrieved data", z, sb.toString());
        }
        v<R> j = null;
        try {
            j = this.j(this.h0, this.f0, this.g0);
        }
        catch (q q) {
            q.j(this.e0, this.g0);
            this.H.add(q);
        }
        if (j != null) {
            this.A(j, this.g0);
        }
        else {
            this.O();
        }
    }
    
    private com.bumptech.glide.load.engine.f m() {
        final int n = h$a.b[this.X.ordinal()];
        if (n == 1) {
            return new w(this.G, this);
        }
        if (n == 2) {
            return new com.bumptech.glide.load.engine.c(this.G, this);
        }
        if (n == 3) {
            return new z(this.G, this);
        }
        if (n == 4) {
            return null;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Unrecognized stage: ");
        sb.append(this.X);
        throw new IllegalStateException(sb.toString());
    }
    
    private h o(h obj) {
        final int n = h$a.b[obj.ordinal()];
        if (n == 1) {
            if (this.T.a()) {
                obj = h.I;
            }
            else {
                obj = this.o(h.I);
            }
            return obj;
        }
        if (n == 2) {
            if (this.a0) {
                obj = h.L;
            }
            else {
                obj = h.J;
            }
            return obj;
        }
        if (n == 3 || n == 4) {
            return h.L;
        }
        if (n == 5) {
            if (this.T.b()) {
                obj = h.H;
            }
            else {
                obj = this.o(h.H);
            }
            return obj;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Unrecognized stage: ");
        sb.append(obj);
        throw new IllegalArgumentException(sb.toString());
    }
    
    @j0
    private com.bumptech.glide.load.j p(final com.bumptech.glide.load.a a) {
        final com.bumptech.glide.load.j u = this.U;
        if (Build$VERSION.SDK_INT < 26) {
            return u;
        }
        final boolean b = a == com.bumptech.glide.load.a.J || this.G.w();
        final com.bumptech.glide.load.i<Boolean> k = com.bumptech.glide.load.resource.bitmap.q.k;
        final Boolean b2 = u.c(k);
        if (b2 != null && (!b2 || b)) {
            return u;
        }
        final com.bumptech.glide.load.j j = new com.bumptech.glide.load.j();
        j.d(this.U);
        j.e(k, b);
        return j;
    }
    
    private int s() {
        return this.P.ordinal();
    }
    
    private void v(final String s, final long n) {
        this.y(s, n, null);
    }
    
    private void y(String string, final long n, final String str) {
        final StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.append(" in ");
        sb.append(com.bumptech.glide.util.g.a(n));
        sb.append(", load key: ");
        sb.append(this.Q);
        if (str != null) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(", ");
            sb2.append(str);
            string = sb2.toString();
        }
        else {
            string = "";
        }
        sb.append(string);
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sb.toString());
    }
    
    private void z(final v<R> v, final com.bumptech.glide.load.a a) {
        this.T();
        this.V.c(v, a);
    }
    
    @j0
     <Z> v<Z> I(final com.bumptech.glide.load.a a, @j0 final v<Z> v) {
        final Class<?> class1 = v.get().getClass();
        final com.bumptech.glide.load.a j = com.bumptech.glide.load.a.J;
        final com.bumptech.glide.load.m<Object> m = null;
        com.bumptech.glide.load.n<?> r;
        v<?> b;
        if (a != j) {
            r = this.G.r(class1);
            b = r.b((Context)this.N, v, this.R, this.S);
        }
        else {
            b = v;
            r = null;
        }
        if (!v.equals(b)) {
            v.a();
        }
        Object n;
        com.bumptech.glide.load.c obj;
        if (this.G.v(b)) {
            n = this.G.n(b);
            obj = ((com.bumptech.glide.load.m)n).b(this.U);
        }
        else {
            obj = com.bumptech.glide.load.c.I;
            n = m;
        }
        final boolean x = this.G.x(this.d0);
        v<Z> c = (v<Z>)b;
        if (this.T.d(x ^ true, a, obj)) {
            if (n == null) {
                throw new com.bumptech.glide.j.d(b.get().getClass());
            }
            final int n2 = h$a.c[obj.ordinal()];
            com.bumptech.glide.load.g g;
            if (n2 != 1) {
                if (n2 != 2) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Unknown strategy: ");
                    sb.append(obj);
                    throw new IllegalArgumentException(sb.toString());
                }
                g = new x(this.G.b(), this.d0, this.O, this.R, this.S, r, class1, this.U);
            }
            else {
                g = new com.bumptech.glide.load.engine.d(this.d0, this.O);
            }
            c = u.c(b);
            this.L.d(g, (com.bumptech.glide.load.m<Object>)n, (u<Object>)c);
        }
        return c;
    }
    
    void K(final boolean b) {
        if (this.M.d(b)) {
            this.M();
        }
    }
    
    boolean U() {
        final h o = this.o(h.G);
        return o == h.H || o == h.I;
    }
    
    @Override
    public void b(final com.bumptech.glide.load.g g, final Exception ex, final com.bumptech.glide.load.data.d<?> d, final com.bumptech.glide.load.a a) {
        d.b();
        final q q = new q("Fetching data failed", ex);
        q.k(g, a, d.a());
        this.H.add(q);
        if (Thread.currentThread() != this.c0) {
            this.Y = g.H;
            this.V.d(this);
        }
        else {
            this.O();
        }
    }
    
    @Override
    public void d() {
        this.Y = g.H;
        this.V.d(this);
    }
    
    @Override
    public void f(final com.bumptech.glide.load.g d0, final Object f0, final com.bumptech.glide.load.data.d<?> h0, final com.bumptech.glide.load.a g0, final com.bumptech.glide.load.g e0) {
        this.d0 = d0;
        this.f0 = f0;
        this.h0 = h0;
        this.g0 = g0;
        this.e0 = e0;
        if (Thread.currentThread() != this.c0) {
            this.Y = g.I;
            this.V.d(this);
            return;
        }
        com.bumptech.glide.util.pool.b.a("DecodeJob.decodeFromRetrievedData");
        try {
            this.l();
        }
        finally {
            com.bumptech.glide.util.pool.b.e();
        }
    }
    
    @j0
    @Override
    public com.bumptech.glide.util.pool.c g() {
        return this.I;
    }
    
    public void h() {
        this.k0 = true;
        final com.bumptech.glide.load.engine.f i0 = this.i0;
        if (i0 != null) {
            i0.cancel();
        }
    }
    
    public int i(@j0 final h<?> h) {
        int n;
        if ((n = this.s() - h.s()) == 0) {
            n = this.W - h.W;
        }
        return n;
    }
    
    @Override
    public void run() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: aload_0        
        //     4: getfield        com/bumptech/glide/load/engine/h.b0:Ljava/lang/Object;
        //     7: invokestatic    com/bumptech/glide/util/pool/b.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //    10: aload_0        
        //    11: getfield        com/bumptech/glide/load/engine/h.h0:Lcom/bumptech/glide/load/data/d;
        //    14: astore_1       
        //    15: aload_0        
        //    16: getfield        com/bumptech/glide/load/engine/h.k0:Z
        //    19: ifeq            40
        //    22: aload_0        
        //    23: invokespecial   com/bumptech/glide/load/engine/h.B:()V
        //    26: aload_1        
        //    27: ifnull          36
        //    30: aload_1        
        //    31: invokeinterface com/bumptech/glide/load/data/d.b:()V
        //    36: invokestatic    com/bumptech/glide/util/pool/b.e:()V
        //    39: return         
        //    40: aload_0        
        //    41: invokespecial   com/bumptech/glide/load/engine/h.Q:()V
        //    44: aload_1        
        //    45: ifnull          54
        //    48: aload_1        
        //    49: invokeinterface com/bumptech/glide/load/data/d.b:()V
        //    54: invokestatic    com/bumptech/glide/util/pool/b.e:()V
        //    57: return         
        //    58: astore_2       
        //    59: ldc             "DecodeJob"
        //    61: iconst_3       
        //    62: invokestatic    android/util/Log.isLoggable:(Ljava/lang/String;I)Z
        //    65: ifeq            121
        //    68: new             Ljava/lang/StringBuilder;
        //    71: astore_3       
        //    72: aload_3        
        //    73: invokespecial   java/lang/StringBuilder.<init>:()V
        //    76: aload_3        
        //    77: ldc_w           "DecodeJob threw unexpectedly, isCancelled: "
        //    80: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    83: pop            
        //    84: aload_3        
        //    85: aload_0        
        //    86: getfield        com/bumptech/glide/load/engine/h.k0:Z
        //    89: invokevirtual   java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
        //    92: pop            
        //    93: aload_3        
        //    94: ldc_w           ", stage: "
        //    97: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   100: pop            
        //   101: aload_3        
        //   102: aload_0        
        //   103: getfield        com/bumptech/glide/load/engine/h.X:Lcom/bumptech/glide/load/engine/h$h;
        //   106: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   109: pop            
        //   110: ldc             "DecodeJob"
        //   112: aload_3        
        //   113: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   116: aload_2        
        //   117: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   120: pop            
        //   121: aload_0        
        //   122: getfield        com/bumptech/glide/load/engine/h.X:Lcom/bumptech/glide/load/engine/h$h;
        //   125: getstatic       com/bumptech/glide/load/engine/h$h.K:Lcom/bumptech/glide/load/engine/h$h;
        //   128: if_acmpeq       146
        //   131: aload_0        
        //   132: getfield        com/bumptech/glide/load/engine/h.H:Ljava/util/List;
        //   135: aload_2        
        //   136: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   141: pop            
        //   142: aload_0        
        //   143: invokespecial   com/bumptech/glide/load/engine/h.B:()V
        //   146: aload_0        
        //   147: getfield        com/bumptech/glide/load/engine/h.k0:Z
        //   150: ifne            155
        //   153: aload_2        
        //   154: athrow         
        //   155: aload_2        
        //   156: athrow         
        //   157: astore_3       
        //   158: aload_3        
        //   159: athrow         
        //   160: astore_3       
        //   161: aload_1        
        //   162: ifnull          171
        //   165: aload_1        
        //   166: invokeinterface com/bumptech/glide/load/data/d.b:()V
        //   171: invokestatic    com/bumptech/glide/util/pool/b.e:()V
        //   174: aload_3        
        //   175: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  15     26     157    160    Lcom/bumptech/glide/load/engine/b;
        //  15     26     58     157    Any
        //  40     44     157    160    Lcom/bumptech/glide/load/engine/b;
        //  40     44     58     157    Any
        //  59     121    160    176    Any
        //  121    146    160    176    Any
        //  146    155    160    176    Any
        //  155    157    160    176    Any
        //  158    160    160    176    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0121:
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
    
    h<R> u(final com.bumptech.glide.d n, final Object b0, final n q, final com.bumptech.glide.load.g o, final int r, final int s, final Class<?> clazz, final Class<R> clazz2, final h p17, final j t, final Map<Class<?>, com.bumptech.glide.load.n<?>> map, final boolean b2, final boolean b3, final boolean a0, final com.bumptech.glide.load.j u, final b<R> v, final int w) {
        this.G.u(n, b0, o, r, s, t, clazz, clazz2, p17, u, map, b2, b3, this.J);
        this.N = n;
        this.O = o;
        this.P = p17;
        this.Q = q;
        this.R = r;
        this.S = s;
        this.T = t;
        this.a0 = a0;
        this.U = u;
        this.V = v;
        this.W = w;
        this.Y = g.G;
        this.b0 = b0;
        return this;
    }
    
    interface b<R>
    {
        void a(final q p0);
        
        void c(final v<R> p0, final com.bumptech.glide.load.a p1);
        
        void d(final h<?> p0);
    }
    
    private final class c<Z> implements i.a<Z>
    {
        private final com.bumptech.glide.load.a a;
        
        c(final com.bumptech.glide.load.a a) {
            this.a = a;
        }
        
        @j0
        @Override
        public v<Z> a(@j0 final v<Z> v) {
            return h.this.I(this.a, v);
        }
    }
    
    private static class d<Z>
    {
        private com.bumptech.glide.load.g a;
        private com.bumptech.glide.load.m<Z> b;
        private u<Z> c;
        
        d() {
        }
        
        void a() {
            this.a = null;
            this.b = null;
            this.c = null;
        }
        
        void b(final e e, final com.bumptech.glide.load.j j) {
            com.bumptech.glide.util.pool.b.a("DecodeJob.encode");
            try {
                e.a().a(this.a, (com.bumptech.glide.load.engine.cache.a.b)new com.bumptech.glide.load.engine.e((com.bumptech.glide.load.d<Object>)this.b, this.c, j));
            }
            finally {
                this.c.e();
                com.bumptech.glide.util.pool.b.e();
            }
        }
        
        boolean c() {
            return this.c != null;
        }
        
         <X> void d(final com.bumptech.glide.load.g a, final com.bumptech.glide.load.m<X> b, final u<X> c) {
            this.a = a;
            this.b = (com.bumptech.glide.load.m<Z>)b;
            this.c = (u<Z>)c;
        }
    }
    
    interface e
    {
        com.bumptech.glide.load.engine.cache.a a();
    }
    
    private static class f
    {
        private boolean a;
        private boolean b;
        private boolean c;
        
        f() {
        }
        
        private boolean a(final boolean b) {
            return (this.c || b || this.b) && this.a;
        }
        
        boolean b() {
            synchronized (this) {
                this.b = true;
                return this.a(false);
            }
        }
        
        boolean c() {
            synchronized (this) {
                this.c = true;
                return this.a(false);
            }
        }
        
        boolean d(final boolean b) {
            synchronized (this) {
                this.a = true;
                return this.a(b);
            }
        }
        
        void e() {
            synchronized (this) {
                this.b = false;
                this.a = false;
                this.c = false;
            }
        }
    }
    
    private enum g
    {
        G, 
        H, 
        I;
    }
    
    private enum h
    {
        G, 
        H, 
        I, 
        J, 
        K, 
        L;
    }
}
