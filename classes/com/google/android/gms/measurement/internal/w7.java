// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class w7 implements Runnable
{
    final /* synthetic */ AtomicReference G;
    final /* synthetic */ na H;
    final /* synthetic */ boolean I;
    final /* synthetic */ u8 J;
    
    w7(final u8 j, final AtomicReference g, final na h, final boolean i) {
        this.J = j;
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    @Override
    public final void run() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/google/android/gms/measurement/internal/w7.G:Ljava/util/concurrent/atomic/AtomicReference;
        //     4: astore_1       
        //     5: aload_1        
        //     6: monitorenter   
        //     7: aload_0        
        //     8: getfield        com/google/android/gms/measurement/internal/w7.J:Lcom/google/android/gms/measurement/internal/u8;
        //    11: invokestatic    com/google/android/gms/measurement/internal/u8.E:(Lcom/google/android/gms/measurement/internal/u8;)Lcom/google/android/gms/measurement/internal/d3;
        //    14: astore_2       
        //    15: aload_2        
        //    16: ifnonnull       47
        //    19: aload_0        
        //    20: getfield        com/google/android/gms/measurement/internal/w7.J:Lcom/google/android/gms/measurement/internal/u8;
        //    23: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //    26: invokevirtual   com/google/android/gms/measurement/internal/z4.c:()Lcom/google/android/gms/measurement/internal/n3;
        //    29: invokevirtual   com/google/android/gms/measurement/internal/n3.o:()Lcom/google/android/gms/measurement/internal/l3;
        //    32: ldc             "Failed to get all user properties; not connected to service"
        //    34: invokevirtual   com/google/android/gms/measurement/internal/l3.a:(Ljava/lang/String;)V
        //    37: aload_0        
        //    38: getfield        com/google/android/gms/measurement/internal/w7.G:Ljava/util/concurrent/atomic/AtomicReference;
        //    41: invokevirtual   java/lang/Object.notify:()V
        //    44: aload_1        
        //    45: monitorexit    
        //    46: return         
        //    47: aload_0        
        //    48: getfield        com/google/android/gms/measurement/internal/w7.H:Lcom/google/android/gms/measurement/internal/na;
        //    51: invokestatic    com/google/android/gms/common/internal/x.k:(Ljava/lang/Object;)Ljava/lang/Object;
        //    54: pop            
        //    55: aload_0        
        //    56: getfield        com/google/android/gms/measurement/internal/w7.G:Ljava/util/concurrent/atomic/AtomicReference;
        //    59: aload_2        
        //    60: aload_0        
        //    61: getfield        com/google/android/gms/measurement/internal/w7.H:Lcom/google/android/gms/measurement/internal/na;
        //    64: aload_0        
        //    65: getfield        com/google/android/gms/measurement/internal/w7.I:Z
        //    68: invokeinterface com/google/android/gms/measurement/internal/d3.W1:(Lcom/google/android/gms/measurement/internal/na;Z)Ljava/util/List;
        //    73: invokevirtual   java/util/concurrent/atomic/AtomicReference.set:(Ljava/lang/Object;)V
        //    76: aload_0        
        //    77: getfield        com/google/android/gms/measurement/internal/w7.J:Lcom/google/android/gms/measurement/internal/u8;
        //    80: invokestatic    com/google/android/gms/measurement/internal/u8.M:(Lcom/google/android/gms/measurement/internal/u8;)V
        //    83: aload_0        
        //    84: getfield        com/google/android/gms/measurement/internal/w7.G:Ljava/util/concurrent/atomic/AtomicReference;
        //    87: astore_2       
        //    88: aload_2        
        //    89: invokevirtual   java/lang/Object.notify:()V
        //    92: goto            127
        //    95: astore_2       
        //    96: goto            130
        //    99: astore_2       
        //   100: aload_0        
        //   101: getfield        com/google/android/gms/measurement/internal/w7.J:Lcom/google/android/gms/measurement/internal/u8;
        //   104: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //   107: invokevirtual   com/google/android/gms/measurement/internal/z4.c:()Lcom/google/android/gms/measurement/internal/n3;
        //   110: invokevirtual   com/google/android/gms/measurement/internal/n3.o:()Lcom/google/android/gms/measurement/internal/l3;
        //   113: ldc             "Failed to get all user properties; remote exception"
        //   115: aload_2        
        //   116: invokevirtual   com/google/android/gms/measurement/internal/l3.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //   119: aload_0        
        //   120: getfield        com/google/android/gms/measurement/internal/w7.G:Ljava/util/concurrent/atomic/AtomicReference;
        //   123: astore_2       
        //   124: goto            88
        //   127: aload_1        
        //   128: monitorexit    
        //   129: return         
        //   130: aload_0        
        //   131: getfield        com/google/android/gms/measurement/internal/w7.G:Ljava/util/concurrent/atomic/AtomicReference;
        //   134: invokevirtual   java/lang/Object.notify:()V
        //   137: aload_2        
        //   138: athrow         
        //   139: astore_2       
        //   140: aload_1        
        //   141: monitorexit    
        //   142: aload_2        
        //   143: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  7      15     99     127    Landroid/os/RemoteException;
        //  7      15     95     99     Any
        //  19     37     99     127    Landroid/os/RemoteException;
        //  19     37     95     99     Any
        //  37     46     139    144    Any
        //  47     83     99     127    Landroid/os/RemoteException;
        //  47     83     95     99     Any
        //  83     88     139    144    Any
        //  88     92     139    144    Any
        //  100    119    95     99     Any
        //  119    124    139    144    Any
        //  127    129    139    144    Any
        //  130    139    139    144    Any
        //  140    142    139    144    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0047:
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
}
