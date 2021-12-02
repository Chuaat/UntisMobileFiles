// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.observers;

import io.reactivex.a0;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import io.reactivex.internal.util.k;
import x5.r;
import io.reactivex.internal.functions.b;
import io.reactivex.internal.util.y;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import io.reactivex.disposables.c;

public abstract class a<T, U extends a<T, U>> implements c
{
    protected final CountDownLatch G;
    protected final List<T> H;
    protected final List<Throwable> I;
    protected long J;
    protected Thread K;
    protected boolean L;
    protected int M;
    protected int N;
    protected CharSequence O;
    protected boolean P;
    
    public a() {
        this.H = new y<T>();
        this.I = new y<Throwable>();
        this.G = new CountDownLatch(1);
    }
    
    public static String g0(final Object obj) {
        if (obj != null) {
            final StringBuilder sb = new StringBuilder();
            sb.append(obj);
            sb.append(" (class: ");
            sb.append(obj.getClass().getSimpleName());
            sb.append(")");
            return sb.toString();
        }
        return "null";
    }
    
    public abstract U A();
    
    public final U C() {
        if (this.G.getCount() != 0L) {
            throw this.b0("Subscriber still running!");
        }
        final long j = this.J;
        if (j > 1L) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Terminated with multiple completions: ");
            sb.append(j);
            throw this.b0(sb.toString());
        }
        final int size = this.I.size();
        if (size > 1) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Terminated with multiple errors: ");
            sb2.append(size);
            throw this.b0(sb2.toString());
        }
        if (j != 0L && size != 0) {
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("Terminated with multiple completions and errors: ");
            sb3.append(j);
            throw this.b0(sb3.toString());
        }
        return (U)this;
    }
    
    public final U D() {
        if (this.P) {
            return (U)this;
        }
        throw this.b0("No timeout?!");
    }
    
    public final U E(final T t) {
        if (this.H.size() != 1) {
            final StringBuilder sb = new StringBuilder();
            sb.append("expected: ");
            sb.append(g0(t));
            sb.append(" but was: ");
            sb.append(this.H);
            throw this.b0(sb.toString());
        }
        final T value = this.H.get(0);
        if (io.reactivex.internal.functions.b.c(t, value)) {
            return (U)this;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("expected: ");
        sb2.append(g0(t));
        sb2.append(" but was: ");
        sb2.append(g0(value));
        throw this.b0(sb2.toString());
    }
    
    public final U F(final r<T> r) {
        this.H(0, r);
        if (this.H.size() <= 1) {
            return (U)this;
        }
        throw this.b0("Value present but other values as well");
    }
    
    public final U G(final int i, final T t) {
        final int size = this.H.size();
        if (size == 0) {
            throw this.b0("No values");
        }
        if (i >= size) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Invalid index: ");
            sb.append(i);
            throw this.b0(sb.toString());
        }
        final T value = this.H.get(i);
        if (io.reactivex.internal.functions.b.c(t, value)) {
            return (U)this;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("expected: ");
        sb2.append(g0(t));
        sb2.append(" but was: ");
        sb2.append(g0(value));
        throw this.b0(sb2.toString());
    }
    
    public final U H(final int i, final r<T> r) {
        if (this.H.size() != 0) {
            if (i < this.H.size()) {
                try {
                    if (r.a(this.H.get(i))) {
                        return (U)this;
                    }
                    throw this.b0("Value not present");
                }
                catch (Exception ex) {
                    throw k.f(ex);
                }
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Invalid index: ");
            sb.append(i);
            throw this.b0(sb.toString());
        }
        throw this.b0("No values");
    }
    
    public final U I(final int i) {
        final int size = this.H.size();
        if (size == i) {
            return (U)this;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Value counts differ; expected: ");
        sb.append(i);
        sb.append(" but was: ");
        sb.append(size);
        throw this.b0(sb.toString());
    }
    
    public final U J(final Iterable<? extends T> iterable) {
        final Iterator<T> iterator = this.H.iterator();
        final Iterator<? extends T> iterator2 = iterable.iterator();
        int i = 0;
        while (true) {
            final boolean hasNext = iterator2.hasNext();
            final boolean hasNext2 = iterator.hasNext();
            if (hasNext2 && hasNext) {
                final T next = (T)iterator2.next();
                final T next2 = iterator.next();
                if (!io.reactivex.internal.functions.b.c(next, next2)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Values at position ");
                    sb.append(i);
                    sb.append(" differ; expected: ");
                    sb.append(g0(next));
                    sb.append(" but was: ");
                    sb.append(g0(next2));
                    throw this.b0(sb.toString());
                }
                ++i;
            }
            else {
                if (hasNext2) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("More values received than expected (");
                    sb2.append(i);
                    sb2.append(")");
                    throw this.b0(sb2.toString());
                }
                if (!hasNext) {
                    return (U)this;
                }
                final StringBuilder sb3 = new StringBuilder();
                sb3.append("Fewer values received than expected (");
                sb3.append(i);
                sb3.append(")");
                throw this.b0(sb3.toString());
            }
        }
    }
    
    public final U K(final Iterable<? extends T> p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   io/reactivex/observers/a.A:()Lio/reactivex/observers/a;
        //     4: aload_1        
        //     5: invokevirtual   io/reactivex/observers/a.J:(Ljava/lang/Iterable;)Lio/reactivex/observers/a;
        //     8: invokevirtual   io/reactivex/observers/a.r:()Lio/reactivex/observers/a;
        //    11: invokevirtual   io/reactivex/observers/a.u:()Lio/reactivex/observers/a;
        //    14: areturn        
        //    Signature:
        //  (Ljava/lang/Iterable<+TT;>;)TU;
        // 
        // The error that occurred was:
        // 
        // java.lang.UnsupportedOperationException: The requested operation is not supported.
        //     at com.strobel.util.ContractUtils.unsupported(ContractUtils.java:27)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:276)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:271)
        //     at com.strobel.assembler.metadata.TypeReference.makeGenericType(TypeReference.java:150)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:187)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:25)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visit(TypeSubstitutionVisitor.java:39)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitMethod(TypeSubstitutionVisitor.java:276)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2591)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2669)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:770)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:766)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2463)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1656)
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
    
    public final U L(final Collection<? extends T> collection) {
        if (collection.isEmpty()) {
            this.t();
            return (U)this;
        }
        for (final T next : this.H) {
            if (collection.contains(next)) {
                continue;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Value not in the expected collection: ");
            sb.append(g0(next));
            throw this.b0(sb.toString());
        }
        return (U)this;
    }
    
    public final U M(final Collection<? extends T> p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   io/reactivex/observers/a.A:()Lio/reactivex/observers/a;
        //     4: aload_1        
        //     5: invokevirtual   io/reactivex/observers/a.L:(Ljava/util/Collection;)Lio/reactivex/observers/a;
        //     8: invokevirtual   io/reactivex/observers/a.r:()Lio/reactivex/observers/a;
        //    11: invokevirtual   io/reactivex/observers/a.u:()Lio/reactivex/observers/a;
        //    14: areturn        
        //    Signature:
        //  (Ljava/util/Collection<+TT;>;)TU;
        // 
        // The error that occurred was:
        // 
        // java.lang.UnsupportedOperationException: The requested operation is not supported.
        //     at com.strobel.util.ContractUtils.unsupported(ContractUtils.java:27)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:276)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:271)
        //     at com.strobel.assembler.metadata.TypeReference.makeGenericType(TypeReference.java:150)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:187)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:25)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visit(TypeSubstitutionVisitor.java:39)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitMethod(TypeSubstitutionVisitor.java:276)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2591)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2669)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:770)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:766)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2463)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1656)
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
    
    public final U N(final T... a) {
        final int size = this.H.size();
        if (size == a.length) {
            for (int i = 0; i < size; ++i) {
                final T value = this.H.get(i);
                final T t = a[i];
                if (!io.reactivex.internal.functions.b.c(t, value)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Values at position ");
                    sb.append(i);
                    sb.append(" differ; expected: ");
                    sb.append(g0(t));
                    sb.append(" but was: ");
                    sb.append(g0(value));
                    throw this.b0(sb.toString());
                }
            }
            return (U)this;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Value count differs; expected: ");
        sb2.append(a.length);
        sb2.append(" ");
        sb2.append(Arrays.toString(a));
        sb2.append(" but was: ");
        sb2.append(size);
        sb2.append(" ");
        sb2.append(this.H);
        throw this.b0(sb2.toString());
    }
    
    public final U O(final T... p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   io/reactivex/observers/a.A:()Lio/reactivex/observers/a;
        //     4: aload_1        
        //     5: invokevirtual   io/reactivex/observers/a.N:([Ljava/lang/Object;)Lio/reactivex/observers/a;
        //     8: invokevirtual   io/reactivex/observers/a.r:()Lio/reactivex/observers/a;
        //    11: invokevirtual   io/reactivex/observers/a.u:()Lio/reactivex/observers/a;
        //    14: areturn        
        //    Signature:
        //  ([TT;)TU;
        // 
        // The error that occurred was:
        // 
        // java.lang.UnsupportedOperationException: The requested operation is not supported.
        //     at com.strobel.util.ContractUtils.unsupported(ContractUtils.java:27)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:276)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:271)
        //     at com.strobel.assembler.metadata.TypeReference.makeGenericType(TypeReference.java:150)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:187)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:25)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visit(TypeSubstitutionVisitor.java:39)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitMethod(TypeSubstitutionVisitor.java:276)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2591)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2669)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:770)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:766)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2463)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1656)
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
    
    public final U P() throws InterruptedException {
        if (this.G.getCount() == 0L) {
            return (U)this;
        }
        this.G.await();
        return (U)this;
    }
    
    public final boolean Q(final long timeout, final TimeUnit unit) throws InterruptedException {
        final boolean b = this.G.getCount() == 0L || this.G.await(timeout, unit);
        this.P = (b ^ true);
        return b;
    }
    
    public final U R(final int n) {
        return this.T(n, b.J, 5000L);
    }
    
    public final U S(final int n, final Runnable runnable) {
        return this.T(n, runnable, 5000L);
    }
    
    public final U T(final int n, final Runnable runnable, final long n2) {
        final long currentTimeMillis = System.currentTimeMillis();
        while (n2 <= 0L || System.currentTimeMillis() - currentTimeMillis < n2) {
            if (this.G.getCount() != 0L) {
                if (this.H.size() < n) {
                    runnable.run();
                    continue;
                }
            }
            return (U)this;
        }
        this.P = true;
        return (U)this;
    }
    
    public final U U(final long timeout, final TimeUnit unit) {
        try {
            if (!this.G.await(timeout, unit)) {
                this.P = true;
                this.dispose();
            }
            return (U)this;
        }
        catch (InterruptedException ex) {
            this.dispose();
            throw k.f(ex);
        }
    }
    
    public final boolean V() {
        try {
            this.P();
            return true;
        }
        catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
            return false;
        }
    }
    
    public final boolean W(final long n, final TimeUnit timeUnit) {
        try {
            return this.Q(n, timeUnit);
        }
        catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
            return false;
        }
    }
    
    public final U X() {
        this.P = false;
        return (U)this;
    }
    
    public final long Y() {
        return this.J;
    }
    
    public final int Z() {
        return this.I.size();
    }
    
    public final U a() {
        final long j = this.J;
        if (j == 0L) {
            throw this.b0("Not completed");
        }
        if (j <= 1L) {
            return (U)this;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Multiple completions: ");
        sb.append(j);
        throw this.b0(sb.toString());
    }
    
    public final List<Throwable> a0() {
        return this.I;
    }
    
    protected final AssertionError b0(final String str) {
        final StringBuilder sb = new StringBuilder(str.length() + 64);
        sb.append(str);
        sb.append(" (");
        sb.append("latch = ");
        sb.append(this.G.getCount());
        sb.append(", ");
        sb.append("values = ");
        sb.append(this.H.size());
        sb.append(", ");
        sb.append("errors = ");
        sb.append(this.I.size());
        sb.append(", ");
        sb.append("completions = ");
        sb.append(this.J);
        if (this.P) {
            sb.append(", timeout!");
        }
        if (this.i()) {
            sb.append(", disposed!");
        }
        final CharSequence o = this.O;
        if (o != null) {
            sb.append(", tag = ");
            sb.append(o);
        }
        sb.append(')');
        final AssertionError assertionError = new AssertionError((Object)sb.toString());
        if (!this.I.isEmpty()) {
            Throwable cause;
            if (this.I.size() == 1) {
                cause = this.I.get(0);
            }
            else {
                cause = new io.reactivex.exceptions.a(this.I);
            }
            assertionError.initCause(cause);
        }
        return assertionError;
    }
    
    public final U c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   io/reactivex/observers/a.A:()Lio/reactivex/observers/a;
        //     4: invokevirtual   io/reactivex/observers/a.t:()Lio/reactivex/observers/a;
        //     7: invokevirtual   io/reactivex/observers/a.r:()Lio/reactivex/observers/a;
        //    10: invokevirtual   io/reactivex/observers/a.u:()Lio/reactivex/observers/a;
        //    13: areturn        
        //    Signature:
        //  ()TU;
        // 
        // The error that occurred was:
        // 
        // java.lang.UnsupportedOperationException: The requested operation is not supported.
        //     at com.strobel.util.ContractUtils.unsupported(ContractUtils.java:27)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:276)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:271)
        //     at com.strobel.assembler.metadata.TypeReference.makeGenericType(TypeReference.java:150)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:187)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:25)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visit(TypeSubstitutionVisitor.java:39)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitMethod(TypeSubstitutionVisitor.java:276)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2591)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2669)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:770)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:766)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2463)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1656)
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
    
    public final List<List<Object>> c0() {
        final ArrayList<ArrayList<T>> list = new ArrayList<ArrayList<T>>();
        list.add((ArrayList<T>)this.i0());
        list.add((ArrayList<T>)this.a0());
        final ArrayList<T> list2 = new ArrayList<T>();
        for (long n = 0L; n < this.J; ++n) {
            list2.add((T)a0.a());
        }
        list.add(list2);
        return (List<List<Object>>)list;
    }
    
    public final boolean d0() {
        return this.G.getCount() == 0L;
    }
    
    public final U e(final Class<? extends Throwable> clazz) {
        return this.h(io.reactivex.internal.functions.a.l((Class<Object>)clazz));
    }
    
    public final boolean e0() {
        return this.P;
    }
    
    public final Thread f0() {
        return this.K;
    }
    
    public final U g(final Throwable t) {
        return this.h(io.reactivex.internal.functions.a.i(t));
    }
    
    public final U h(final r<Throwable> r) {
        final int size = this.I.size();
        if (size == 0) {
            throw this.b0("No errors");
        }
        final int n = 0;
        final Iterator<Throwable> iterator = this.I.iterator();
        int n2;
        while (true) {
            n2 = n;
            if (iterator.hasNext()) {
                final Throwable t = iterator.next();
                try {
                    if (!r.a(t)) {
                        continue;
                    }
                    n2 = 1;
                }
                catch (Exception ex) {
                    throw k.f(ex);
                }
                break;
            }
            break;
        }
        if (n2 == 0) {
            throw this.b0("Error not present");
        }
        if (size == 1) {
            return (U)this;
        }
        throw this.b0("Error present but other errors as well");
    }
    
    public final int h0() {
        return this.H.size();
    }
    
    public final List<T> i0() {
        return this.H;
    }
    
    public final U j(final String str) {
        final int size = this.I.size();
        if (size == 0) {
            throw this.b0("No errors");
        }
        if (size != 1) {
            throw this.b0("Multiple errors");
        }
        final String message = this.I.get(0).getMessage();
        if (io.reactivex.internal.functions.b.c(str, message)) {
            return (U)this;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Error message differs; exptected: ");
        sb.append(str);
        sb.append(" but was: ");
        sb.append(message);
        throw this.b0(sb.toString());
    }
    
    public final U j0(final CharSequence o) {
        this.O = o;
        return (U)this;
    }
    
    public final U k(final Class<? extends Throwable> p0, final T... p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   io/reactivex/observers/a.A:()Lio/reactivex/observers/a;
        //     4: aload_2        
        //     5: invokevirtual   io/reactivex/observers/a.N:([Ljava/lang/Object;)Lio/reactivex/observers/a;
        //     8: aload_1        
        //     9: invokevirtual   io/reactivex/observers/a.e:(Ljava/lang/Class;)Lio/reactivex/observers/a;
        //    12: invokevirtual   io/reactivex/observers/a.u:()Lio/reactivex/observers/a;
        //    15: areturn        
        //    Signature:
        //  (Ljava/lang/Class<+Ljava/lang/Throwable;>;[TT;)TU;
        // 
        // The error that occurred was:
        // 
        // java.lang.UnsupportedOperationException: The requested operation is not supported.
        //     at com.strobel.util.ContractUtils.unsupported(ContractUtils.java:27)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:276)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:271)
        //     at com.strobel.assembler.metadata.TypeReference.makeGenericType(TypeReference.java:150)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:187)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:25)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visit(TypeSubstitutionVisitor.java:39)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitMethod(TypeSubstitutionVisitor.java:276)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2591)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2669)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:770)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:766)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2463)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1656)
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
    
    public final U n(final r<Throwable> p0, final T... p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   io/reactivex/observers/a.A:()Lio/reactivex/observers/a;
        //     4: aload_2        
        //     5: invokevirtual   io/reactivex/observers/a.N:([Ljava/lang/Object;)Lio/reactivex/observers/a;
        //     8: aload_1        
        //     9: invokevirtual   io/reactivex/observers/a.h:(Lx5/r;)Lio/reactivex/observers/a;
        //    12: invokevirtual   io/reactivex/observers/a.u:()Lio/reactivex/observers/a;
        //    15: areturn        
        //    Signature:
        //  (Lx5/r<Ljava/lang/Throwable;>;[TT;)TU;
        // 
        // The error that occurred was:
        // 
        // java.lang.UnsupportedOperationException: The requested operation is not supported.
        //     at com.strobel.util.ContractUtils.unsupported(ContractUtils.java:27)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:276)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:271)
        //     at com.strobel.assembler.metadata.TypeReference.makeGenericType(TypeReference.java:150)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:187)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:25)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visit(TypeSubstitutionVisitor.java:39)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitMethod(TypeSubstitutionVisitor.java:276)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2591)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2669)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:770)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:766)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2463)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1656)
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
    
    public final U o(final Class<? extends Throwable> p0, final String p1, final T... p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   io/reactivex/observers/a.A:()Lio/reactivex/observers/a;
        //     4: aload_3        
        //     5: invokevirtual   io/reactivex/observers/a.N:([Ljava/lang/Object;)Lio/reactivex/observers/a;
        //     8: aload_1        
        //     9: invokevirtual   io/reactivex/observers/a.e:(Ljava/lang/Class;)Lio/reactivex/observers/a;
        //    12: aload_2        
        //    13: invokevirtual   io/reactivex/observers/a.j:(Ljava/lang/String;)Lio/reactivex/observers/a;
        //    16: invokevirtual   io/reactivex/observers/a.u:()Lio/reactivex/observers/a;
        //    19: areturn        
        //    Signature:
        //  (Ljava/lang/Class<+Ljava/lang/Throwable;>;Ljava/lang/String;[TT;)TU;
        // 
        // The error that occurred was:
        // 
        // java.lang.UnsupportedOperationException: The requested operation is not supported.
        //     at com.strobel.util.ContractUtils.unsupported(ContractUtils.java:27)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:276)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:271)
        //     at com.strobel.assembler.metadata.TypeReference.makeGenericType(TypeReference.java:150)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:187)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:25)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visit(TypeSubstitutionVisitor.java:39)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitMethod(TypeSubstitutionVisitor.java:276)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2591)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2669)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:770)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:766)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2463)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:770)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:766)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2463)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1656)
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
    
    public final U p(final T t) {
        for (int size = this.H.size(), i = 0; i < size; ++i) {
            if (io.reactivex.internal.functions.b.c(this.H.get(i), t)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Value at position ");
                sb.append(i);
                sb.append(" is equal to ");
                sb.append(g0(t));
                sb.append("; Expected them to be different");
                throw this.b0(sb.toString());
            }
        }
        return (U)this;
    }
    
    public final U q(final r<? super T> r) {
        final int size = this.H.size();
        int i = 0;
        while (i < size) {
            final T value = this.H.get(i);
            try {
                if (!r.a(value)) {
                    ++i;
                    continue;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("Value at position ");
                sb.append(i);
                sb.append(" matches predicate ");
                sb.append(r.toString());
                sb.append(", which was not expected.");
                throw this.b0(sb.toString());
            }
            catch (Exception ex) {
                throw k.f(ex);
            }
            break;
        }
        return (U)this;
    }
    
    public final U r() {
        if (this.I.size() == 0) {
            return (U)this;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Error(s) present: ");
        sb.append(this.I);
        throw this.b0(sb.toString());
    }
    
    public final U s() {
        if (!this.P) {
            return (U)this;
        }
        throw this.b0("Timeout?!");
    }
    
    public final U t() {
        return this.I(0);
    }
    
    public final U u() {
        final long j = this.J;
        final long n = lcmp(j, 1L);
        if (n == 0) {
            throw this.b0("Completed!");
        }
        if (n <= 0) {
            return (U)this;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Multiple completions: ");
        sb.append(j);
        throw this.b0(sb.toString());
    }
    
    public abstract U w();
    
    public final U x() {
        if (this.G.getCount() != 0L) {
            return (U)this;
        }
        throw this.b0("Subscriber terminated!");
    }
    
    public final U y(final T... p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   io/reactivex/observers/a.A:()Lio/reactivex/observers/a;
        //     4: aload_1        
        //     5: invokevirtual   io/reactivex/observers/a.N:([Ljava/lang/Object;)Lio/reactivex/observers/a;
        //     8: invokevirtual   io/reactivex/observers/a.r:()Lio/reactivex/observers/a;
        //    11: invokevirtual   io/reactivex/observers/a.a:()Lio/reactivex/observers/a;
        //    14: areturn        
        //    Signature:
        //  ([TT;)TU;
        // 
        // The error that occurred was:
        // 
        // java.lang.UnsupportedOperationException: The requested operation is not supported.
        //     at com.strobel.util.ContractUtils.unsupported(ContractUtils.java:27)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:276)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:271)
        //     at com.strobel.assembler.metadata.TypeReference.makeGenericType(TypeReference.java:150)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:187)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:25)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visit(TypeSubstitutionVisitor.java:39)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitMethod(TypeSubstitutionVisitor.java:276)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2591)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2669)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:770)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:766)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2463)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1656)
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
    
    public enum b implements Runnable
    {
        G {
            @Override
            public void run() {
            }
        }, 
        H {
            @Override
            public void run() {
                Thread.yield();
            }
        }, 
        I {
            @Override
            public void run() {
                b.b(1);
            }
        }, 
        J {
            @Override
            public void run() {
                b.b(10);
            }
        }, 
        K {
            @Override
            public void run() {
                b.b(100);
            }
        }, 
        L {
            @Override
            public void run() {
                b.b(1000);
            }
        };
        
        static void b(final int n) {
            final long n2 = n;
            try {
                Thread.sleep(n2);
            }
            catch (InterruptedException cause) {
                throw new RuntimeException(cause);
            }
        }
        
        @Override
        public abstract void run();
    }
}
