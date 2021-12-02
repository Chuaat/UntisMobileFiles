// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.observers.f;
import rx.subjects.c;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import rx.subscriptions.b;
import rx.subscriptions.d;
import rx.h;
import java.util.HashMap;
import rx.o;
import rx.n;
import rx.functions.q;
import rx.functions.p;
import rx.g;

public final class r0<T1, T2, D1, D2, R> implements g.a<R>
{
    final g<T1> G;
    final g<T2> H;
    final p<? super T1, ? extends g<D1>> I;
    final p<? super T2, ? extends g<D2>> J;
    final q<? super T1, ? super g<T2>, ? extends R> K;
    
    public r0(final g<T1> g, final g<T2> h, final p<? super T1, ? extends g<D1>> i, final p<? super T2, ? extends g<D2>> j, final q<? super T1, ? super g<T2>, ? extends R> k) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
    }
    
    public void a(final n<? super R> n) {
        final a a = new a(new rx.observers.g<Object>(n));
        n.r(a);
        a.d();
    }
    
    final class a extends HashMap<Integer, h<T2>> implements o
    {
        private static final long P = -3035156013812425335L;
        final rx.subscriptions.d G;
        final n<? super R> H;
        final rx.subscriptions.b I;
        int J;
        int K;
        final Map<Integer, T2> L;
        boolean M;
        boolean N;
        
        public a(final n<? super R> h) {
            this.L = new HashMap<Integer, T2>();
            this.H = h;
            final rx.subscriptions.b i = new rx.subscriptions.b();
            this.I = i;
            this.G = new rx.subscriptions.d(i);
        }
        
        void a(final List<h<T2>> list) {
            if (list != null) {
                final Iterator<h<T2>> iterator = list.iterator();
                while (iterator.hasNext()) {
                    iterator.next().c();
                }
                this.H.c();
                this.G.i();
            }
        }
        
        void b(final Throwable t) {
            synchronized (this) {
                final ArrayList<h> list = new ArrayList<h>(this.j().values());
                this.j().clear();
                this.L.clear();
                // monitorexit(this)
                final Iterator<Object> iterator = list.iterator();
                while (iterator.hasNext()) {
                    iterator.next().b(t);
                }
                this.H.b(t);
                this.G.i();
            }
        }
        
        void c(final Throwable t) {
            synchronized (this) {
                this.j().clear();
                this.L.clear();
                // monitorexit(this)
                this.H.b(t);
                this.G.i();
            }
        }
        
        public void d() {
            final b b = new b();
            final d d = new d();
            this.I.a(b);
            this.I.a(d);
            r0.this.G.R6(b);
            r0.this.H.R6(d);
        }
        
        @Override
        public boolean g() {
            return this.G.g();
        }
        
        @Override
        public void i() {
            this.G.i();
        }
        
        Map<Integer, h<T2>> j() {
            return this;
        }
        
        final class a extends n<D1>
        {
            final int L;
            boolean M;
            
            public a(final int l) {
                this.M = true;
                this.L = l;
            }
            
            @Override
            public void b(final Throwable t) {
                r0.a.this.c(t);
            }
            
            @Override
            public void c() {
                if (this.M) {
                    this.M = false;
                    synchronized (r0.a.this) {
                        final h<T2> h = r0.a.this.j().remove(this.L);
                        // monitorexit(this.N)
                        if (h != null) {
                            h.c();
                        }
                        r0.a.this.I.e(this);
                    }
                }
            }
            
            @Override
            public void m(final D1 d1) {
                this.c();
            }
        }
        
        final class b extends n<T1>
        {
            @Override
            public void b(final Throwable t) {
                r0.a.this.b(t);
            }
            
            @Override
            public void c() {
                synchronized (r0.a.this) {
                    final r0.a l = r0.a.this;
                    l.M = true;
                    List<h<T2>> list;
                    if (l.N) {
                        list = new ArrayList<h<T2>>(r0.a.this.j().values());
                        r0.a.this.j().clear();
                        r0.a.this.L.clear();
                    }
                    else {
                        list = null;
                    }
                    // monitorexit(this.L)
                    r0.a.this.a(list);
                }
            }
            
            @Override
            public void m(T1 t1) {
                try {
                    final rx.subjects.c<Object> g7 = rx.subjects.c.G7();
                    final f f = new f<T2>((h<? super Object>)g7);
                    Object o = r0.a.this;
                    synchronized (o) {
                        final r0.a l = r0.a.this;
                        final int i = l.J++;
                        l.j().put(i, (f<T2>)f);
                        // monitorexit(o)
                        o = new r0.b((g<Object>)g7, r0.a.this.G);
                        o = g.Q6((g.a<Object>)o);
                        final g g8 = (g)r0.this.I.h((Object)t1);
                        final r0.a.a a = new r0.a.a(i);
                        r0.a.this.I.a(a);
                        g8.R6(a);
                        o = r0.this.K.s((Object)t1, (Object)o);
                        t1 = (T1)r0.a.this;
                        synchronized (t1) {
                            final ArrayList list = new ArrayList(r0.a.this.L.values());
                            // monitorexit(t1)
                            r0.a.this.H.m((Object)o);
                            t1 = (T1)list.iterator();
                            while (((Iterator)t1).hasNext()) {
                                f.m(((Iterator<T2>)t1).next());
                            }
                        }
                    }
                }
                finally {
                    final Throwable t2;
                    rx.exceptions.c.f(t2, this);
                }
            }
        }
        
        final class c extends n<D2>
        {
            final int L;
            boolean M;
            
            public c(final int l) {
                this.M = true;
                this.L = l;
            }
            
            @Override
            public void b(final Throwable t) {
                r0.a.this.c(t);
            }
            
            @Override
            public void c() {
                if (this.M) {
                    this.M = false;
                    synchronized (r0.a.this) {
                        r0.a.this.L.remove(this.L);
                        // monitorexit(this.N)
                        r0.a.this.I.e(this);
                    }
                }
            }
            
            @Override
            public void m(final D2 d2) {
                this.c();
            }
        }
        
        final class d extends n<T2>
        {
            @Override
            public void b(final Throwable t) {
                r0.a.this.b(t);
            }
            
            @Override
            public void c() {
                synchronized (r0.a.this) {
                    final r0.a l = r0.a.this;
                    l.N = true;
                    List<h<T2>> list;
                    if (l.M) {
                        list = new ArrayList<h<T2>>(r0.a.this.j().values());
                        r0.a.this.j().clear();
                        r0.a.this.L.clear();
                    }
                    else {
                        list = null;
                    }
                    // monitorexit(this.L)
                    r0.a.this.a(list);
                }
            }
            
            @Override
            public void m(final T2 t2) {
                try {
                    Object o = r0.a.this;
                    synchronized (o) {
                        final r0.a l = r0.a.this;
                        final int i = l.K++;
                        l.L.put(i, t2);
                        // monitorexit(o)
                        final g g = (g)r0.this.J.h((Object)t2);
                        o = new c(i);
                        r0.a.this.I.a((o)o);
                        g.R6((n)o);
                        o = r0.a.this;
                        synchronized (o) {
                            final ArrayList<h<T2>> list = new ArrayList<h<T2>>(r0.a.this.j().values());
                            // monitorexit(o)
                            o = list.iterator();
                            while (((Iterator)o).hasNext()) {
                                ((Iterator<h<T2>>)o).next().m(t2);
                            }
                        }
                    }
                }
                finally {
                    final Throwable t3;
                    rx.exceptions.c.f(t3, this);
                }
            }
        }
    }
    
    static final class b<T> implements g.a<T>
    {
        final rx.subscriptions.d G;
        final g<T> H;
        
        public b(final g<T> h, final rx.subscriptions.d g) {
            this.G = g;
            this.H = h;
        }
        
        public void a(final n<? super T> p0) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: getfield        rx/internal/operators/r0$b.G:Lrx/subscriptions/d;
            //     4: invokevirtual   rx/subscriptions/d.a:()Lrx/o;
            //     7: astore_2       
            //     8: new             Lrx/internal/operators/r0$b$a;
            //    11: dup            
            //    12: aload_0        
            //    13: aload_1        
            //    14: aload_2        
            //    15: invokespecial   rx/internal/operators/r0$b$a.<init>:(Lrx/internal/operators/r0$b;Lrx/n;Lrx/o;)V
            //    18: astore_1       
            //    19: aload_1        
            //    20: aload_2        
            //    21: invokevirtual   rx/n.r:(Lrx/o;)V
            //    24: aload_0        
            //    25: getfield        rx/internal/operators/r0$b.H:Lrx/g;
            //    28: aload_1        
            //    29: invokevirtual   rx/g.R6:(Lrx/n;)Lrx/o;
            //    32: pop            
            //    33: return         
            //    Signature:
            //  (Lrx/n<-TT;>;)V
            // 
            // The error that occurred was:
            // 
            // java.lang.NullPointerException
            //     at com.strobel.assembler.metadata.WildcardType.containsGenericParameters(WildcardType.java:55)
            //     at com.strobel.assembler.metadata.TypeReference.containsGenericParameters(TypeReference.java:48)
            //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2521)
            //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
            //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
            //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:672)
            //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:655)
            //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:365)
            //     at com.strobel.decompiler.ast.TypeAnalysis.run(TypeAnalysis.java:96)
            //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:109)
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
        
        final class a extends n<Object>
        {
            final n<?> L;
            private final o M;
            
            public a(final b p0, final n<?> p2, final o p3) {
                // 
                // This method could not be decompiled.
                // 
                // Could not show original bytecode, likely due to the same error.
                // 
                // The error that occurred was:
                // 
                // java.lang.NullPointerException
                //     at com.strobel.assembler.metadata.WildcardType.containsGenericParameters(WildcardType.java:55)
                //     at com.strobel.assembler.metadata.TypeReference.containsGenericParameters(TypeReference.java:48)
                //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:930)
                //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
                //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:770)
                //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:766)
                //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2515)
                //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
                //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
                //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:672)
                //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:655)
                //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:365)
                //     at com.strobel.decompiler.ast.TypeAnalysis.run(TypeAnalysis.java:96)
                //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:109)
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
            
            @Override
            public void b(final Throwable t) {
                this.L.b(t);
                this.M.i();
            }
            
            @Override
            public void c() {
                this.L.c();
                this.M.i();
            }
            
            @Override
            public void m(final Object p0) {
                // 
                // This method could not be decompiled.
                // 
                // Original Bytecode:
                // 
                //     1: getfield        rx/internal/operators/r0$b$a.L:Lrx/n;
                //     4: aload_1        
                //     5: invokeinterface rx/h.m:(Ljava/lang/Object;)V
                //    10: return         
                //    Signature:
                //  (Ljava/lang/Object;)V [from metadata: (TT;)V]
                //  
                // 
                // The error that occurred was:
                // 
                // java.lang.NullPointerException
                //     at com.strobel.assembler.metadata.WildcardType.containsGenericParameters(WildcardType.java:55)
                //     at com.strobel.assembler.metadata.TypeReference.containsGenericParameters(TypeReference.java:48)
                //     at com.strobel.assembler.metadata.MemberReference.containsGenericParameters(MemberReference.java:45)
                //     at com.strobel.assembler.metadata.MethodReference.containsGenericParameters(MethodReference.java:67)
                //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2497)
                //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
                //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
                //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:672)
                //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:655)
                //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:365)
                //     at com.strobel.decompiler.ast.TypeAnalysis.run(TypeAnalysis.java:96)
                //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:109)
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
        }
    }
}
