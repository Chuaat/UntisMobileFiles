// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.protobuf;

public class m
{
    private d a;
    private g b;
    private volatile boolean c;
    protected volatile q d;
    
    protected void a(final q p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        kotlin/reflect/jvm/internal/impl/protobuf/m.d:Lkotlin/reflect/jvm/internal/impl/protobuf/q;
        //     4: ifnull          8
        //     7: return         
        //     8: aload_0        
        //     9: monitorenter   
        //    10: aload_0        
        //    11: getfield        kotlin/reflect/jvm/internal/impl/protobuf/m.d:Lkotlin/reflect/jvm/internal/impl/protobuf/q;
        //    14: ifnull          20
        //    17: aload_0        
        //    18: monitorexit    
        //    19: return         
        //    20: aload_1        
        //    21: astore_2       
        //    22: aload_0        
        //    23: getfield        kotlin/reflect/jvm/internal/impl/protobuf/m.a:Lkotlin/reflect/jvm/internal/impl/protobuf/d;
        //    26: ifnull          52
        //    29: aload_1        
        //    30: invokeinterface kotlin/reflect/jvm/internal/impl/protobuf/q.i:()Lkotlin/reflect/jvm/internal/impl/protobuf/s;
        //    35: aload_0        
        //    36: getfield        kotlin/reflect/jvm/internal/impl/protobuf/m.a:Lkotlin/reflect/jvm/internal/impl/protobuf/d;
        //    39: aload_0        
        //    40: getfield        kotlin/reflect/jvm/internal/impl/protobuf/m.b:Lkotlin/reflect/jvm/internal/impl/protobuf/g;
        //    43: invokeinterface kotlin/reflect/jvm/internal/impl/protobuf/s.d:(Lkotlin/reflect/jvm/internal/impl/protobuf/d;Lkotlin/reflect/jvm/internal/impl/protobuf/g;)Ljava/lang/Object;
        //    48: checkcast       Lkotlin/reflect/jvm/internal/impl/protobuf/q;
        //    51: astore_2       
        //    52: aload_0        
        //    53: aload_2        
        //    54: putfield        kotlin/reflect/jvm/internal/impl/protobuf/m.d:Lkotlin/reflect/jvm/internal/impl/protobuf/q;
        //    57: aload_0        
        //    58: monitorexit    
        //    59: return         
        //    60: astore_1       
        //    61: aload_0        
        //    62: monitorexit    
        //    63: aload_1        
        //    64: athrow         
        //    65: astore_1       
        //    66: goto            57
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  10     19     60     65     Any
        //  22     52     65     69     Ljava/io/IOException;
        //  22     52     60     65     Any
        //  52     57     65     69     Ljava/io/IOException;
        //  52     57     60     65     Any
        //  57     59     60     65     Any
        //  61     63     60     65     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0052:
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
    
    public int b() {
        if (this.c) {
            return this.d.f();
        }
        return this.a.size();
    }
    
    public q c(final q q) {
        this.a(q);
        return this.d;
    }
    
    public q d(final q d) {
        final q d2 = this.d;
        this.d = d;
        this.a = null;
        this.c = true;
        return d2;
    }
}
