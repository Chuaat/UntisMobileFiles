// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import androidx.annotation.w;
import com.google.android.gms.common.util.d0;

@d0
public final class z2<V>
{
    private static final Object h;
    private final String a = a;
    private final w2<V> b = b;
    private final V c = c;
    private final V d = d;
    private final Object e = new Object();
    @w("overrideLock")
    private volatile V f = null;
    @w("cachingLock")
    private volatile V g = null;
    
    static {
        h = new Object();
    }
    
    public final V a(final V p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/google/android/gms/measurement/internal/z2.e:Ljava/lang/Object;
        //     4: astore_2       
        //     5: aload_2        
        //     6: monitorenter   
        //     7: aload_2        
        //     8: monitorexit    
        //     9: aload_1        
        //    10: ifnull          15
        //    13: aload_1        
        //    14: areturn        
        //    15: getstatic       com/google/android/gms/measurement/internal/x2.a:Lcom/google/android/gms/measurement/internal/b;
        //    18: ifnull          197
        //    21: getstatic       com/google/android/gms/measurement/internal/z2.h:Ljava/lang/Object;
        //    24: astore_2       
        //    25: aload_2        
        //    26: monitorenter   
        //    27: invokestatic    com/google/android/gms/measurement/internal/b.a:()Z
        //    30: ifeq            57
        //    33: aload_0        
        //    34: getfield        com/google/android/gms/measurement/internal/z2.g:Ljava/lang/Object;
        //    37: ifnonnull       48
        //    40: aload_0        
        //    41: getfield        com/google/android/gms/measurement/internal/z2.c:Ljava/lang/Object;
        //    44: astore_1       
        //    45: goto            53
        //    48: aload_0        
        //    49: getfield        com/google/android/gms/measurement/internal/z2.g:Ljava/lang/Object;
        //    52: astore_1       
        //    53: aload_2        
        //    54: monitorexit    
        //    55: aload_1        
        //    56: areturn        
        //    57: aload_2        
        //    58: monitorexit    
        //    59: invokestatic    com/google/android/gms/measurement/internal/a3.b:()Ljava/util/List;
        //    62: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    67: astore_3       
        //    68: aload_3        
        //    69: invokeinterface java/util/Iterator.hasNext:()Z
        //    74: ifeq            157
        //    77: aload_3        
        //    78: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    83: checkcast       Lcom/google/android/gms/measurement/internal/z2;
        //    86: astore          4
        //    88: invokestatic    com/google/android/gms/measurement/internal/b.a:()Z
        //    91: istore          5
        //    93: iload           5
        //    95: ifne            144
        //    98: aconst_null    
        //    99: astore_2       
        //   100: aload           4
        //   102: getfield        com/google/android/gms/measurement/internal/z2.b:Lcom/google/android/gms/measurement/internal/w2;
        //   105: astore          6
        //   107: aload_2        
        //   108: astore_1       
        //   109: aload           6
        //   111: ifnull          122
        //   114: aload           6
        //   116: invokeinterface com/google/android/gms/measurement/internal/w2.zza:()Ljava/lang/Object;
        //   121: astore_1       
        //   122: getstatic       com/google/android/gms/measurement/internal/z2.h:Ljava/lang/Object;
        //   125: astore_2       
        //   126: aload_2        
        //   127: monitorenter   
        //   128: aload           4
        //   130: aload_1        
        //   131: putfield        com/google/android/gms/measurement/internal/z2.g:Ljava/lang/Object;
        //   134: aload_2        
        //   135: monitorexit    
        //   136: goto            68
        //   139: astore_1       
        //   140: aload_2        
        //   141: monitorexit    
        //   142: aload_1        
        //   143: athrow         
        //   144: new             Ljava/lang/IllegalStateException;
        //   147: astore_1       
        //   148: aload_1        
        //   149: ldc             "Refreshing flag cache must be done on a worker thread."
        //   151: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   154: aload_1        
        //   155: athrow         
        //   156: astore_1       
        //   157: aload_0        
        //   158: getfield        com/google/android/gms/measurement/internal/z2.b:Lcom/google/android/gms/measurement/internal/w2;
        //   161: astore_1       
        //   162: aload_1        
        //   163: ifnonnull       171
        //   166: aload_0        
        //   167: getfield        com/google/android/gms/measurement/internal/z2.c:Ljava/lang/Object;
        //   170: areturn        
        //   171: aload_1        
        //   172: invokeinterface com/google/android/gms/measurement/internal/w2.zza:()Ljava/lang/Object;
        //   177: astore_1       
        //   178: aload_1        
        //   179: areturn        
        //   180: astore_1       
        //   181: aload_0        
        //   182: getfield        com/google/android/gms/measurement/internal/z2.c:Ljava/lang/Object;
        //   185: areturn        
        //   186: astore_1       
        //   187: aload_0        
        //   188: getfield        com/google/android/gms/measurement/internal/z2.c:Ljava/lang/Object;
        //   191: areturn        
        //   192: astore_1       
        //   193: aload_2        
        //   194: monitorexit    
        //   195: aload_1        
        //   196: athrow         
        //   197: aload_0        
        //   198: getfield        com/google/android/gms/measurement/internal/z2.c:Ljava/lang/Object;
        //   201: areturn        
        //   202: astore_1       
        //   203: aload_2        
        //   204: monitorexit    
        //   205: aload_1        
        //   206: athrow         
        //   207: astore_1       
        //   208: aload_2        
        //   209: astore_1       
        //   210: goto            122
        //    Signature:
        //  (TV;)TV;
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  7      9      202    207    Any
        //  27     45     192    197    Any
        //  48     53     192    197    Any
        //  53     55     192    197    Any
        //  57     59     192    197    Any
        //  59     68     156    157    Ljava/lang/SecurityException;
        //  68     93     156    157    Ljava/lang/SecurityException;
        //  100    107    207    213    Ljava/lang/IllegalStateException;
        //  100    107    156    157    Ljava/lang/SecurityException;
        //  114    122    207    213    Ljava/lang/IllegalStateException;
        //  114    122    156    157    Ljava/lang/SecurityException;
        //  122    128    156    157    Ljava/lang/SecurityException;
        //  128    136    139    144    Any
        //  140    142    139    144    Any
        //  142    144    156    157    Ljava/lang/SecurityException;
        //  144    156    156    157    Ljava/lang/SecurityException;
        //  171    178    186    192    Ljava/lang/SecurityException;
        //  171    178    180    186    Ljava/lang/IllegalStateException;
        //  193    195    192    197    Any
        //  203    205    202    207    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0122:
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
    
    public final String b() {
        return this.a;
    }
}
