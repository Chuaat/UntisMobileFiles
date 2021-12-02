// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class y7 implements Runnable
{
    final /* synthetic */ AtomicReference G;
    final /* synthetic */ na H;
    final /* synthetic */ u8 I;
    
    y7(final u8 i, final AtomicReference g, final na h) {
        this.I = i;
        this.G = g;
        this.H = h;
    }
    
    @Override
    public final void run() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/google/android/gms/measurement/internal/y7.G:Ljava/util/concurrent/atomic/AtomicReference;
        //     4: astore_1       
        //     5: aload_1        
        //     6: monitorenter   
        //     7: aload_0        
        //     8: getfield        com/google/android/gms/measurement/internal/y7.I:Lcom/google/android/gms/measurement/internal/u8;
        //    11: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //    14: invokevirtual   com/google/android/gms/measurement/internal/z4.C:()Lcom/google/android/gms/measurement/internal/c4;
        //    17: invokevirtual   com/google/android/gms/measurement/internal/c4.n:()Lcom/google/android/gms/measurement/internal/h;
        //    20: invokevirtual   com/google/android/gms/measurement/internal/h.k:()Z
        //    23: ifne            93
        //    26: aload_0        
        //    27: getfield        com/google/android/gms/measurement/internal/y7.I:Lcom/google/android/gms/measurement/internal/u8;
        //    30: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //    33: invokevirtual   com/google/android/gms/measurement/internal/z4.c:()Lcom/google/android/gms/measurement/internal/n3;
        //    36: invokevirtual   com/google/android/gms/measurement/internal/n3.u:()Lcom/google/android/gms/measurement/internal/l3;
        //    39: ldc             "Analytics storage consent denied; will not get app instance id"
        //    41: invokevirtual   com/google/android/gms/measurement/internal/l3.a:(Ljava/lang/String;)V
        //    44: aload_0        
        //    45: getfield        com/google/android/gms/measurement/internal/y7.I:Lcom/google/android/gms/measurement/internal/u8;
        //    48: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //    51: invokevirtual   com/google/android/gms/measurement/internal/z4.G:()Lcom/google/android/gms/measurement/internal/e7;
        //    54: aconst_null    
        //    55: invokevirtual   com/google/android/gms/measurement/internal/e7.y:(Ljava/lang/String;)V
        //    58: aload_0        
        //    59: getfield        com/google/android/gms/measurement/internal/y7.I:Lcom/google/android/gms/measurement/internal/u8;
        //    62: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //    65: invokevirtual   com/google/android/gms/measurement/internal/z4.C:()Lcom/google/android/gms/measurement/internal/c4;
        //    68: getfield        com/google/android/gms/measurement/internal/c4.g:Lcom/google/android/gms/measurement/internal/b4;
        //    71: aconst_null    
        //    72: invokevirtual   com/google/android/gms/measurement/internal/b4.b:(Ljava/lang/String;)V
        //    75: aload_0        
        //    76: getfield        com/google/android/gms/measurement/internal/y7.G:Ljava/util/concurrent/atomic/AtomicReference;
        //    79: aconst_null    
        //    80: invokevirtual   java/util/concurrent/atomic/AtomicReference.set:(Ljava/lang/Object;)V
        //    83: aload_0        
        //    84: getfield        com/google/android/gms/measurement/internal/y7.G:Ljava/util/concurrent/atomic/AtomicReference;
        //    87: invokevirtual   java/lang/Object.notify:()V
        //    90: aload_1        
        //    91: monitorexit    
        //    92: return         
        //    93: aload_0        
        //    94: getfield        com/google/android/gms/measurement/internal/y7.I:Lcom/google/android/gms/measurement/internal/u8;
        //    97: invokestatic    com/google/android/gms/measurement/internal/u8.E:(Lcom/google/android/gms/measurement/internal/u8;)Lcom/google/android/gms/measurement/internal/d3;
        //   100: astore_2       
        //   101: aload_2        
        //   102: ifnonnull       133
        //   105: aload_0        
        //   106: getfield        com/google/android/gms/measurement/internal/y7.I:Lcom/google/android/gms/measurement/internal/u8;
        //   109: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //   112: invokevirtual   com/google/android/gms/measurement/internal/z4.c:()Lcom/google/android/gms/measurement/internal/n3;
        //   115: invokevirtual   com/google/android/gms/measurement/internal/n3.o:()Lcom/google/android/gms/measurement/internal/l3;
        //   118: ldc             "Failed to get app instance id"
        //   120: invokevirtual   com/google/android/gms/measurement/internal/l3.a:(Ljava/lang/String;)V
        //   123: aload_0        
        //   124: getfield        com/google/android/gms/measurement/internal/y7.G:Ljava/util/concurrent/atomic/AtomicReference;
        //   127: invokevirtual   java/lang/Object.notify:()V
        //   130: aload_1        
        //   131: monitorexit    
        //   132: return         
        //   133: aload_0        
        //   134: getfield        com/google/android/gms/measurement/internal/y7.H:Lcom/google/android/gms/measurement/internal/na;
        //   137: invokestatic    com/google/android/gms/common/internal/x.k:(Ljava/lang/Object;)Ljava/lang/Object;
        //   140: pop            
        //   141: aload_0        
        //   142: getfield        com/google/android/gms/measurement/internal/y7.G:Ljava/util/concurrent/atomic/AtomicReference;
        //   145: aload_2        
        //   146: aload_0        
        //   147: getfield        com/google/android/gms/measurement/internal/y7.H:Lcom/google/android/gms/measurement/internal/na;
        //   150: invokeinterface com/google/android/gms/measurement/internal/d3.x0:(Lcom/google/android/gms/measurement/internal/na;)Ljava/lang/String;
        //   155: invokevirtual   java/util/concurrent/atomic/AtomicReference.set:(Ljava/lang/Object;)V
        //   158: aload_0        
        //   159: getfield        com/google/android/gms/measurement/internal/y7.G:Ljava/util/concurrent/atomic/AtomicReference;
        //   162: invokevirtual   java/util/concurrent/atomic/AtomicReference.get:()Ljava/lang/Object;
        //   165: checkcast       Ljava/lang/String;
        //   168: astore_2       
        //   169: aload_2        
        //   170: ifnull          204
        //   173: aload_0        
        //   174: getfield        com/google/android/gms/measurement/internal/y7.I:Lcom/google/android/gms/measurement/internal/u8;
        //   177: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //   180: invokevirtual   com/google/android/gms/measurement/internal/z4.G:()Lcom/google/android/gms/measurement/internal/e7;
        //   183: aload_2        
        //   184: invokevirtual   com/google/android/gms/measurement/internal/e7.y:(Ljava/lang/String;)V
        //   187: aload_0        
        //   188: getfield        com/google/android/gms/measurement/internal/y7.I:Lcom/google/android/gms/measurement/internal/u8;
        //   191: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //   194: invokevirtual   com/google/android/gms/measurement/internal/z4.C:()Lcom/google/android/gms/measurement/internal/c4;
        //   197: getfield        com/google/android/gms/measurement/internal/c4.g:Lcom/google/android/gms/measurement/internal/b4;
        //   200: aload_2        
        //   201: invokevirtual   com/google/android/gms/measurement/internal/b4.b:(Ljava/lang/String;)V
        //   204: aload_0        
        //   205: getfield        com/google/android/gms/measurement/internal/y7.I:Lcom/google/android/gms/measurement/internal/u8;
        //   208: invokestatic    com/google/android/gms/measurement/internal/u8.M:(Lcom/google/android/gms/measurement/internal/u8;)V
        //   211: aload_0        
        //   212: getfield        com/google/android/gms/measurement/internal/y7.G:Ljava/util/concurrent/atomic/AtomicReference;
        //   215: astore_2       
        //   216: aload_2        
        //   217: invokevirtual   java/lang/Object.notify:()V
        //   220: goto            255
        //   223: astore_2       
        //   224: goto            258
        //   227: astore_2       
        //   228: aload_0        
        //   229: getfield        com/google/android/gms/measurement/internal/y7.I:Lcom/google/android/gms/measurement/internal/u8;
        //   232: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //   235: invokevirtual   com/google/android/gms/measurement/internal/z4.c:()Lcom/google/android/gms/measurement/internal/n3;
        //   238: invokevirtual   com/google/android/gms/measurement/internal/n3.o:()Lcom/google/android/gms/measurement/internal/l3;
        //   241: ldc             "Failed to get app instance id"
        //   243: aload_2        
        //   244: invokevirtual   com/google/android/gms/measurement/internal/l3.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //   247: aload_0        
        //   248: getfield        com/google/android/gms/measurement/internal/y7.G:Ljava/util/concurrent/atomic/AtomicReference;
        //   251: astore_2       
        //   252: goto            216
        //   255: aload_1        
        //   256: monitorexit    
        //   257: return         
        //   258: aload_0        
        //   259: getfield        com/google/android/gms/measurement/internal/y7.G:Ljava/util/concurrent/atomic/AtomicReference;
        //   262: invokevirtual   java/lang/Object.notify:()V
        //   265: aload_2        
        //   266: athrow         
        //   267: astore_2       
        //   268: aload_1        
        //   269: monitorexit    
        //   270: aload_2        
        //   271: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  7      83     227    255    Landroid/os/RemoteException;
        //  7      83     223    227    Any
        //  83     92     267    272    Any
        //  93     101    227    255    Landroid/os/RemoteException;
        //  93     101    223    227    Any
        //  105    123    227    255    Landroid/os/RemoteException;
        //  105    123    223    227    Any
        //  123    132    267    272    Any
        //  133    169    227    255    Landroid/os/RemoteException;
        //  133    169    223    227    Any
        //  173    204    227    255    Landroid/os/RemoteException;
        //  173    204    223    227    Any
        //  204    211    227    255    Landroid/os/RemoteException;
        //  204    211    223    227    Any
        //  211    216    267    272    Any
        //  216    220    267    272    Any
        //  228    247    223    227    Any
        //  247    252    267    272    Any
        //  255    257    267    272    Any
        //  258    267    267    272    Any
        //  268    270    267    272    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0093:
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
