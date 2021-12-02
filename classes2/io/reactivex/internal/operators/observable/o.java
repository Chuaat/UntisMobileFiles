// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.d;
import y5.n;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.disposables.c;
import io.reactivex.internal.observers.v;
import io.reactivex.observers.e;
import io.reactivex.i0;
import io.reactivex.g0;
import java.util.concurrent.Callable;
import java.util.Collection;

public final class o<T, U extends Collection<? super T>, B> extends io.reactivex.internal.operators.observable.a<T, U>
{
    final Callable<? extends g0<B>> H;
    final Callable<U> I;
    
    public o(final g0<T> g0, final Callable<? extends g0<B>> h, final Callable<U> i) {
        super(g0);
        this.H = h;
        this.I = i;
    }
    
    @Override
    protected void L5(final i0<? super U> p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        io/reactivex/internal/operators/observable/a.G:Lio/reactivex/g0;
        //     4: new             Lio/reactivex/internal/operators/observable/o$b;
        //     7: dup            
        //     8: new             Lio/reactivex/observers/m;
        //    11: dup            
        //    12: aload_1        
        //    13: invokespecial   io/reactivex/observers/m.<init>:(Lio/reactivex/i0;)V
        //    16: aload_0        
        //    17: getfield        io/reactivex/internal/operators/observable/o.I:Ljava/util/concurrent/Callable;
        //    20: aload_0        
        //    21: getfield        io/reactivex/internal/operators/observable/o.H:Ljava/util/concurrent/Callable;
        //    24: invokespecial   io/reactivex/internal/operators/observable/o$b.<init>:(Lio/reactivex/i0;Ljava/util/concurrent/Callable;Ljava/util/concurrent/Callable;)V
        //    27: invokeinterface io/reactivex/g0.c:(Lio/reactivex/i0;)V
        //    32: return         
        //    Signature:
        //  (Lio/reactivex/i0<-TU;>;)V
        // 
        // The error that occurred was:
        // 
        // com.strobel.assembler.metadata.MetadataHelper$AdaptFailure
        //     at com.strobel.assembler.metadata.MetadataHelper$Adapter.visitGenericParameter(MetadataHelper.java:2300)
        //     at com.strobel.assembler.metadata.MetadataHelper$Adapter.visitGenericParameter(MetadataHelper.java:2221)
        //     at com.strobel.assembler.metadata.GenericParameter.accept(GenericParameter.java:85)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper$Adapter.adaptRecursive(MetadataHelper.java:2255)
        //     at com.strobel.assembler.metadata.MetadataHelper$Adapter.adaptRecursive(MetadataHelper.java:2232)
        //     at com.strobel.assembler.metadata.MetadataHelper$Adapter.visitParameterizedType(MetadataHelper.java:2245)
        //     at com.strobel.assembler.metadata.MetadataHelper$Adapter.visitParameterizedType(MetadataHelper.java:2221)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedGenericType.accept(CoreMetadataFactory.java:653)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.adapt(MetadataHelper.java:1312)
        //     at com.strobel.assembler.metadata.MetadataHelper.substituteGenericArguments(MetadataHelper.java:1010)
        //     at com.strobel.assembler.metadata.MetadataHelper$9.visitClassType(MetadataHelper.java:2146)
        //     at com.strobel.assembler.metadata.MetadataHelper$9.visitParameterizedType(MetadataHelper.java:2165)
        //     at com.strobel.assembler.metadata.MetadataHelper$9.visitParameterizedType(MetadataHelper.java:2075)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:21)
        //     at com.strobel.assembler.metadata.MetadataHelper.getSuperType(MetadataHelper.java:1264)
        //     at com.strobel.assembler.metadata.MetadataHelper$8.visitClassType(MetadataHelper.java:2011)
        //     at com.strobel.assembler.metadata.MetadataHelper$8.visitParameterizedType(MetadataHelper.java:2056)
        //     at com.strobel.assembler.metadata.MetadataHelper$8.visitParameterizedType(MetadataHelper.java:1994)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.asSuper(MetadataHelper.java:727)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitClassType(MetadataHelper.java:1853)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitParameterizedType(MetadataHelper.java:1882)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitParameterizedType(MetadataHelper.java:1815)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubType(MetadataHelper.java:1302)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubType(MetadataHelper.java:568)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:922)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:770)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:766)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2515)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:672)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:759)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1011)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2669)
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
    
    static final class a<T, U extends Collection<? super T>, B> extends e<B>
    {
        final b<T, U, B> H;
        boolean I;
        
        a(final b<T, U, B> h) {
            this.H = h;
        }
        
        @Override
        public void b(final Throwable t) {
            if (this.I) {
                io.reactivex.plugins.a.Y(t);
                return;
            }
            this.I = true;
            this.H.b(t);
        }
        
        @Override
        public void f() {
            if (this.I) {
                return;
            }
            this.I = true;
            this.H.q();
        }
        
        @Override
        public void m(final B b) {
            if (this.I) {
                return;
            }
            this.I = true;
            this.dispose();
            this.H.q();
        }
    }
    
    static final class b<T, U extends Collection<? super T>, B> extends v<T, U, U> implements i0<T>, c
    {
        final Callable<U> q0;
        final Callable<? extends g0<B>> r0;
        c s0;
        final AtomicReference<c> t0;
        U u0;
        
        b(final i0<? super U> i0, final Callable<U> q0, final Callable<? extends g0<B>> r0) {
            super(i0, new io.reactivex.internal.queue.a());
            this.t0 = new AtomicReference<c>();
            this.q0 = q0;
            this.r0 = r0;
        }
        
        @Override
        public void b(final Throwable p0) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: invokevirtual   io/reactivex/internal/operators/observable/o$b.dispose:()V
            //     4: aload_0        
            //     5: getfield        io/reactivex/internal/observers/v.l0:Lio/reactivex/i0;
            //     8: aload_1        
            //     9: invokeinterface io/reactivex/i0.b:(Ljava/lang/Throwable;)V
            //    14: return         
            // 
            // The error that occurred was:
            // 
            // com.strobel.assembler.metadata.MetadataHelper$AdaptFailure
            //     at com.strobel.assembler.metadata.MetadataHelper$Adapter.visitGenericParameter(MetadataHelper.java:2300)
            //     at com.strobel.assembler.metadata.MetadataHelper$Adapter.visitGenericParameter(MetadataHelper.java:2221)
            //     at com.strobel.assembler.metadata.GenericParameter.accept(GenericParameter.java:85)
            //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
            //     at com.strobel.assembler.metadata.MetadataHelper$Adapter.adaptRecursive(MetadataHelper.java:2255)
            //     at com.strobel.assembler.metadata.MetadataHelper$Adapter.adaptRecursive(MetadataHelper.java:2232)
            //     at com.strobel.assembler.metadata.MetadataHelper$Adapter.visitParameterizedType(MetadataHelper.java:2245)
            //     at com.strobel.assembler.metadata.MetadataHelper$Adapter.visitParameterizedType(MetadataHelper.java:2221)
            //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedGenericType.accept(CoreMetadataFactory.java:653)
            //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
            //     at com.strobel.assembler.metadata.MetadataHelper.adapt(MetadataHelper.java:1312)
            //     at com.strobel.assembler.metadata.MetadataHelper.substituteGenericArguments(MetadataHelper.java:1010)
            //     at com.strobel.assembler.metadata.MetadataHelper.getBaseType(MetadataHelper.java:698)
            //     at com.strobel.assembler.metadata.MetadataHelper.getGenericSubTypeMappings(MetadataHelper.java:813)
            //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2503)
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
        
        @Override
        public void dispose() {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: getfield        io/reactivex/internal/observers/v.n0:Z
            //     4: ifne            41
            //     7: aload_0        
            //     8: iconst_1       
            //     9: putfield        io/reactivex/internal/observers/v.n0:Z
            //    12: aload_0        
            //    13: getfield        io/reactivex/internal/operators/observable/o$b.s0:Lio/reactivex/disposables/c;
            //    16: invokeinterface io/reactivex/disposables/c.dispose:()V
            //    21: aload_0        
            //    22: invokevirtual   io/reactivex/internal/operators/observable/o$b.p:()V
            //    25: aload_0        
            //    26: invokevirtual   io/reactivex/internal/observers/v.e:()Z
            //    29: ifeq            41
            //    32: aload_0        
            //    33: getfield        io/reactivex/internal/observers/v.m0:Ly5/n;
            //    36: invokeinterface y5/o.clear:()V
            //    41: return         
            // 
            // The error that occurred was:
            // 
            // com.strobel.assembler.metadata.MetadataHelper$AdaptFailure
            //     at com.strobel.assembler.metadata.MetadataHelper$Adapter.visitGenericParameter(MetadataHelper.java:2300)
            //     at com.strobel.assembler.metadata.MetadataHelper$Adapter.visitGenericParameter(MetadataHelper.java:2221)
            //     at com.strobel.assembler.metadata.GenericParameter.accept(GenericParameter.java:85)
            //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
            //     at com.strobel.assembler.metadata.MetadataHelper$Adapter.adaptRecursive(MetadataHelper.java:2255)
            //     at com.strobel.assembler.metadata.MetadataHelper$Adapter.adaptRecursive(MetadataHelper.java:2232)
            //     at com.strobel.assembler.metadata.MetadataHelper$Adapter.visitParameterizedType(MetadataHelper.java:2245)
            //     at com.strobel.assembler.metadata.MetadataHelper$Adapter.visitParameterizedType(MetadataHelper.java:2221)
            //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedGenericType.accept(CoreMetadataFactory.java:653)
            //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
            //     at com.strobel.assembler.metadata.MetadataHelper.adapt(MetadataHelper.java:1312)
            //     at com.strobel.assembler.metadata.MetadataHelper.substituteGenericArguments(MetadataHelper.java:1010)
            //     at com.strobel.assembler.metadata.MetadataHelper.getBaseType(MetadataHelper.java:698)
            //     at com.strobel.assembler.metadata.MetadataHelper.getGenericSubTypeMappings(MetadataHelper.java:813)
            //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2503)
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
        
        @Override
        public void f() {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: monitorenter   
            //     2: aload_0        
            //     3: getfield        io/reactivex/internal/operators/observable/o$b.u0:Ljava/util/Collection;
            //     6: astore_1       
            //     7: aload_1        
            //     8: ifnonnull       14
            //    11: aload_0        
            //    12: monitorexit    
            //    13: return         
            //    14: aload_0        
            //    15: aconst_null    
            //    16: putfield        io/reactivex/internal/operators/observable/o$b.u0:Ljava/util/Collection;
            //    19: aload_0        
            //    20: monitorexit    
            //    21: aload_0        
            //    22: getfield        io/reactivex/internal/observers/v.m0:Ly5/n;
            //    25: aload_1        
            //    26: invokeinterface y5/o.offer:(Ljava/lang/Object;)Z
            //    31: pop            
            //    32: aload_0        
            //    33: iconst_1       
            //    34: putfield        io/reactivex/internal/observers/v.o0:Z
            //    37: aload_0        
            //    38: invokevirtual   io/reactivex/internal/observers/v.e:()Z
            //    41: ifeq            58
            //    44: aload_0        
            //    45: getfield        io/reactivex/internal/observers/v.m0:Ly5/n;
            //    48: aload_0        
            //    49: getfield        io/reactivex/internal/observers/v.l0:Lio/reactivex/i0;
            //    52: iconst_0       
            //    53: aload_0        
            //    54: aload_0        
            //    55: invokestatic    io/reactivex/internal/util/v.d:(Ly5/n;Lio/reactivex/i0;ZLio/reactivex/disposables/c;Lio/reactivex/internal/util/r;)V
            //    58: return         
            //    59: astore_1       
            //    60: aload_0        
            //    61: monitorexit    
            //    62: aload_1        
            //    63: athrow         
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type
            //  -----  -----  -----  -----  ----
            //  2      7      59     64     Any
            //  11     13     59     64     Any
            //  14     21     59     64     Any
            //  60     62     59     64     Any
            // 
            // The error that occurred was:
            // 
            // com.strobel.assembler.metadata.MetadataHelper$AdaptFailure
            //     at com.strobel.assembler.metadata.MetadataHelper$Adapter.visitGenericParameter(MetadataHelper.java:2300)
            //     at com.strobel.assembler.metadata.MetadataHelper$Adapter.visitGenericParameter(MetadataHelper.java:2221)
            //     at com.strobel.assembler.metadata.GenericParameter.accept(GenericParameter.java:85)
            //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
            //     at com.strobel.assembler.metadata.MetadataHelper$Adapter.adaptRecursive(MetadataHelper.java:2255)
            //     at com.strobel.assembler.metadata.MetadataHelper$Adapter.adaptRecursive(MetadataHelper.java:2232)
            //     at com.strobel.assembler.metadata.MetadataHelper$Adapter.visitParameterizedType(MetadataHelper.java:2245)
            //     at com.strobel.assembler.metadata.MetadataHelper$Adapter.visitParameterizedType(MetadataHelper.java:2221)
            //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedGenericType.accept(CoreMetadataFactory.java:653)
            //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
            //     at com.strobel.assembler.metadata.MetadataHelper.adapt(MetadataHelper.java:1312)
            //     at com.strobel.assembler.metadata.MetadataHelper.substituteGenericArguments(MetadataHelper.java:1010)
            //     at com.strobel.assembler.metadata.MetadataHelper.getBaseType(MetadataHelper.java:698)
            //     at com.strobel.assembler.metadata.MetadataHelper.findCommonSuperTypeCore(MetadataHelper.java:275)
            //     at com.strobel.assembler.metadata.MetadataHelper.findCommonSuperType(MetadataHelper.java:200)
            //     at com.strobel.assembler.ir.Frame.merge(Frame.java:369)
            //     at com.strobel.assembler.ir.Frame.merge(Frame.java:273)
            //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2206)
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
        public boolean i() {
            return super.n0;
        }
        
        @Override
        public void l(final c p0) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: getfield        io/reactivex/internal/operators/observable/o$b.s0:Lio/reactivex/disposables/c;
            //     4: aload_1        
            //     5: invokestatic    io/reactivex/internal/disposables/d.l:(Lio/reactivex/disposables/c;Lio/reactivex/disposables/c;)Z
            //     8: ifeq            124
            //    11: aload_0        
            //    12: aload_1        
            //    13: putfield        io/reactivex/internal/operators/observable/o$b.s0:Lio/reactivex/disposables/c;
            //    16: aload_0        
            //    17: getfield        io/reactivex/internal/observers/v.l0:Lio/reactivex/i0;
            //    20: astore_2       
            //    21: aload_0        
            //    22: getfield        io/reactivex/internal/operators/observable/o$b.q0:Ljava/util/concurrent/Callable;
            //    25: invokeinterface java/util/concurrent/Callable.call:()Ljava/lang/Object;
            //    30: ldc             "The buffer supplied is null"
            //    32: invokestatic    io/reactivex/internal/functions/b.g:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
            //    35: checkcast       Ljava/util/Collection;
            //    38: astore_3       
            //    39: aload_0        
            //    40: aload_3        
            //    41: putfield        io/reactivex/internal/operators/observable/o$b.u0:Ljava/util/Collection;
            //    44: aload_0        
            //    45: getfield        io/reactivex/internal/operators/observable/o$b.r0:Ljava/util/concurrent/Callable;
            //    48: invokeinterface java/util/concurrent/Callable.call:()Ljava/lang/Object;
            //    53: ldc             "The boundary ObservableSource supplied is null"
            //    55: invokestatic    io/reactivex/internal/functions/b.g:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
            //    58: checkcast       Lio/reactivex/g0;
            //    61: astore_3       
            //    62: new             Lio/reactivex/internal/operators/observable/o$a;
            //    65: dup            
            //    66: aload_0        
            //    67: invokespecial   io/reactivex/internal/operators/observable/o$a.<init>:(Lio/reactivex/internal/operators/observable/o$b;)V
            //    70: astore_1       
            //    71: aload_0        
            //    72: getfield        io/reactivex/internal/operators/observable/o$b.t0:Ljava/util/concurrent/atomic/AtomicReference;
            //    75: aload_1        
            //    76: invokevirtual   java/util/concurrent/atomic/AtomicReference.set:(Ljava/lang/Object;)V
            //    79: aload_2        
            //    80: aload_0        
            //    81: invokeinterface io/reactivex/i0.l:(Lio/reactivex/disposables/c;)V
            //    86: aload_0        
            //    87: getfield        io/reactivex/internal/observers/v.n0:Z
            //    90: ifne            124
            //    93: aload_3        
            //    94: aload_1        
            //    95: invokeinterface io/reactivex/g0.c:(Lio/reactivex/i0;)V
            //   100: goto            124
            //   103: astore_3       
            //   104: aload_3        
            //   105: invokestatic    io/reactivex/exceptions/b.b:(Ljava/lang/Throwable;)V
            //   108: aload_0        
            //   109: iconst_1       
            //   110: putfield        io/reactivex/internal/observers/v.n0:Z
            //   113: aload_1        
            //   114: invokeinterface io/reactivex/disposables/c.dispose:()V
            //   119: aload_3        
            //   120: aload_2        
            //   121: invokestatic    io/reactivex/internal/disposables/e.l:(Ljava/lang/Throwable;Lio/reactivex/i0;)V
            //   124: return         
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type
            //  -----  -----  -----  -----  ----
            //  21     39     103    124    Any
            //  44     62     103    124    Any
            // 
            // The error that occurred was:
            // 
            // com.strobel.assembler.metadata.MetadataHelper$AdaptFailure
            //     at com.strobel.assembler.metadata.MetadataHelper$Adapter.visitGenericParameter(MetadataHelper.java:2300)
            //     at com.strobel.assembler.metadata.MetadataHelper$Adapter.visitGenericParameter(MetadataHelper.java:2221)
            //     at com.strobel.assembler.metadata.GenericParameter.accept(GenericParameter.java:85)
            //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
            //     at com.strobel.assembler.metadata.MetadataHelper$Adapter.adaptRecursive(MetadataHelper.java:2255)
            //     at com.strobel.assembler.metadata.MetadataHelper$Adapter.adaptRecursive(MetadataHelper.java:2232)
            //     at com.strobel.assembler.metadata.MetadataHelper$Adapter.visitParameterizedType(MetadataHelper.java:2245)
            //     at com.strobel.assembler.metadata.MetadataHelper$Adapter.visitParameterizedType(MetadataHelper.java:2221)
            //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedGenericType.accept(CoreMetadataFactory.java:653)
            //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
            //     at com.strobel.assembler.metadata.MetadataHelper.adapt(MetadataHelper.java:1312)
            //     at com.strobel.assembler.metadata.MetadataHelper.substituteGenericArguments(MetadataHelper.java:1010)
            //     at com.strobel.assembler.metadata.MetadataHelper.getBaseType(MetadataHelper.java:698)
            //     at com.strobel.assembler.metadata.MetadataHelper.findCommonSuperTypeCore(MetadataHelper.java:275)
            //     at com.strobel.assembler.metadata.MetadataHelper.findCommonSuperType(MetadataHelper.java:200)
            //     at com.strobel.assembler.ir.Frame.merge(Frame.java:369)
            //     at com.strobel.assembler.ir.Frame.merge(Frame.java:273)
            //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2206)
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
        public void m(final T p0) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: monitorenter   
            //     2: aload_0        
            //     3: getfield        io/reactivex/internal/operators/observable/o$b.u0:Ljava/util/Collection;
            //     6: astore_2       
            //     7: aload_2        
            //     8: ifnonnull       14
            //    11: aload_0        
            //    12: monitorexit    
            //    13: return         
            //    14: aload_2        
            //    15: aload_1        
            //    16: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
            //    21: pop            
            //    22: aload_0        
            //    23: monitorexit    
            //    24: return         
            //    25: astore_1       
            //    26: aload_0        
            //    27: monitorexit    
            //    28: aload_1        
            //    29: athrow         
            //    Signature:
            //  (TT;)V
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type
            //  -----  -----  -----  -----  ----
            //  2      7      25     30     Any
            //  11     13     25     30     Any
            //  14     24     25     30     Any
            //  26     28     25     30     Any
            // 
            // The error that occurred was:
            // 
            // com.strobel.assembler.metadata.MetadataHelper$AdaptFailure
            //     at com.strobel.assembler.metadata.MetadataHelper$Adapter.visitGenericParameter(MetadataHelper.java:2300)
            //     at com.strobel.assembler.metadata.MetadataHelper$Adapter.visitGenericParameter(MetadataHelper.java:2221)
            //     at com.strobel.assembler.metadata.GenericParameter.accept(GenericParameter.java:85)
            //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
            //     at com.strobel.assembler.metadata.MetadataHelper$Adapter.adaptRecursive(MetadataHelper.java:2255)
            //     at com.strobel.assembler.metadata.MetadataHelper$Adapter.adaptRecursive(MetadataHelper.java:2232)
            //     at com.strobel.assembler.metadata.MetadataHelper$Adapter.visitParameterizedType(MetadataHelper.java:2245)
            //     at com.strobel.assembler.metadata.MetadataHelper$Adapter.visitParameterizedType(MetadataHelper.java:2221)
            //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedGenericType.accept(CoreMetadataFactory.java:653)
            //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
            //     at com.strobel.assembler.metadata.MetadataHelper.adapt(MetadataHelper.java:1312)
            //     at com.strobel.assembler.metadata.MetadataHelper.substituteGenericArguments(MetadataHelper.java:1010)
            //     at com.strobel.assembler.metadata.MetadataHelper.getBaseType(MetadataHelper.java:698)
            //     at com.strobel.assembler.metadata.MetadataHelper.findCommonSuperTypeCore(MetadataHelper.java:275)
            //     at com.strobel.assembler.metadata.MetadataHelper.findCommonSuperType(MetadataHelper.java:200)
            //     at com.strobel.assembler.ir.Frame.merge(Frame.java:369)
            //     at com.strobel.assembler.ir.Frame.merge(Frame.java:273)
            //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2206)
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
        
        public void o(final i0<? super U> i0, final U u) {
            super.l0.m(u);
        }
        
        void p() {
            d.b(this.t0);
        }
        
        void q() {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     4: invokeinterface java/util/concurrent/Callable.call:()Ljava/lang/Object;
            //     9: ldc             "The buffer supplied is null"
            //    11: invokestatic    io/reactivex/internal/functions/b.g:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
            //    14: checkcast       Ljava/util/Collection;
            //    17: astore_1       
            //    18: aload_0        
            //    19: getfield        io/reactivex/internal/operators/observable/o$b.r0:Ljava/util/concurrent/Callable;
            //    22: invokeinterface java/util/concurrent/Callable.call:()Ljava/lang/Object;
            //    27: ldc             "The boundary ObservableSource supplied is null"
            //    29: invokestatic    io/reactivex/internal/functions/b.g:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
            //    32: checkcast       Lio/reactivex/g0;
            //    35: astore_2       
            //    36: new             Lio/reactivex/internal/operators/observable/o$a;
            //    39: dup            
            //    40: aload_0        
            //    41: invokespecial   io/reactivex/internal/operators/observable/o$a.<init>:(Lio/reactivex/internal/operators/observable/o$b;)V
            //    44: astore_3       
            //    45: aload_0        
            //    46: getfield        io/reactivex/internal/operators/observable/o$b.t0:Ljava/util/concurrent/atomic/AtomicReference;
            //    49: aload_3        
            //    50: invokestatic    io/reactivex/internal/disposables/d.f:(Ljava/util/concurrent/atomic/AtomicReference;Lio/reactivex/disposables/c;)Z
            //    53: ifeq            102
            //    56: aload_0        
            //    57: monitorenter   
            //    58: aload_0        
            //    59: getfield        io/reactivex/internal/operators/observable/o$b.u0:Ljava/util/Collection;
            //    62: astore          4
            //    64: aload           4
            //    66: ifnonnull       72
            //    69: aload_0        
            //    70: monitorexit    
            //    71: return         
            //    72: aload_0        
            //    73: aload_1        
            //    74: putfield        io/reactivex/internal/operators/observable/o$b.u0:Ljava/util/Collection;
            //    77: aload_0        
            //    78: monitorexit    
            //    79: aload_2        
            //    80: aload_3        
            //    81: invokeinterface io/reactivex/g0.c:(Lio/reactivex/i0;)V
            //    86: aload_0        
            //    87: aload           4
            //    89: iconst_0       
            //    90: aload_0        
            //    91: invokevirtual   io/reactivex/internal/observers/v.k:(Ljava/lang/Object;ZLio/reactivex/disposables/c;)V
            //    94: goto            102
            //    97: astore_2       
            //    98: aload_0        
            //    99: monitorexit    
            //   100: aload_2        
            //   101: athrow         
            //   102: return         
            //   103: astore_2       
            //   104: aload_2        
            //   105: invokestatic    io/reactivex/exceptions/b.b:(Ljava/lang/Throwable;)V
            //   108: aload_0        
            //   109: iconst_1       
            //   110: putfield        io/reactivex/internal/observers/v.n0:Z
            //   113: aload_0        
            //   114: getfield        io/reactivex/internal/operators/observable/o$b.s0:Lio/reactivex/disposables/c;
            //   117: invokeinterface io/reactivex/disposables/c.dispose:()V
            //   122: aload_0        
            //   123: getfield        io/reactivex/internal/observers/v.l0:Lio/reactivex/i0;
            //   126: aload_2        
            //   127: invokeinterface io/reactivex/i0.b:(Ljava/lang/Throwable;)V
            //   132: return         
            //   133: astore_2       
            //   134: aload_2        
            //   135: invokestatic    io/reactivex/exceptions/b.b:(Ljava/lang/Throwable;)V
            //   138: aload_0        
            //   139: invokevirtual   io/reactivex/internal/operators/observable/o$b.dispose:()V
            //   142: goto            122
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type
            //  -----  -----  -----  -----  ----
            //  0      18     133    145    Any
            //  18     36     103    122    Any
            //  58     64     97     102    Any
            //  69     71     97     102    Any
            //  72     79     97     102    Any
            //  98     100    97     102    Any
            // 
            // The error that occurred was:
            // 
            // com.strobel.assembler.metadata.MetadataHelper$AdaptFailure
            //     at com.strobel.assembler.metadata.MetadataHelper$Adapter.visitGenericParameter(MetadataHelper.java:2300)
            //     at com.strobel.assembler.metadata.MetadataHelper$Adapter.visitGenericParameter(MetadataHelper.java:2221)
            //     at com.strobel.assembler.metadata.GenericParameter.accept(GenericParameter.java:85)
            //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
            //     at com.strobel.assembler.metadata.MetadataHelper$Adapter.adaptRecursive(MetadataHelper.java:2255)
            //     at com.strobel.assembler.metadata.MetadataHelper$Adapter.adaptRecursive(MetadataHelper.java:2232)
            //     at com.strobel.assembler.metadata.MetadataHelper$Adapter.visitParameterizedType(MetadataHelper.java:2245)
            //     at com.strobel.assembler.metadata.MetadataHelper$Adapter.visitParameterizedType(MetadataHelper.java:2221)
            //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedGenericType.accept(CoreMetadataFactory.java:653)
            //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
            //     at com.strobel.assembler.metadata.MetadataHelper.adapt(MetadataHelper.java:1312)
            //     at com.strobel.assembler.metadata.MetadataHelper.substituteGenericArguments(MetadataHelper.java:1010)
            //     at com.strobel.assembler.metadata.MetadataHelper.getBaseType(MetadataHelper.java:698)
            //     at com.strobel.assembler.metadata.MetadataHelper.findCommonSuperTypeCore(MetadataHelper.java:275)
            //     at com.strobel.assembler.metadata.MetadataHelper.findCommonSuperType(MetadataHelper.java:200)
            //     at com.strobel.assembler.ir.Frame.merge(Frame.java:369)
            //     at com.strobel.assembler.ir.Frame.merge(Frame.java:273)
            //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2206)
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
    }
}
