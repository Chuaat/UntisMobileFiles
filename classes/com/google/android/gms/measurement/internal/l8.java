// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class l8 implements Runnable
{
    final /* synthetic */ AtomicReference G;
    final /* synthetic */ String H;
    final /* synthetic */ String I;
    final /* synthetic */ na J;
    final /* synthetic */ u8 K;
    
    l8(final u8 k, final AtomicReference g, final String s, final String h, final String i, final na j) {
        this.K = k;
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
    }
    
    @Override
    public final void run() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/google/android/gms/measurement/internal/l8.G:Ljava/util/concurrent/atomic/AtomicReference;
        //     4: astore_1       
        //     5: aload_1        
        //     6: monitorenter   
        //     7: aload_0        
        //     8: getfield        com/google/android/gms/measurement/internal/l8.K:Lcom/google/android/gms/measurement/internal/u8;
        //    11: invokestatic    com/google/android/gms/measurement/internal/u8.E:(Lcom/google/android/gms/measurement/internal/u8;)Lcom/google/android/gms/measurement/internal/d3;
        //    14: astore_2       
        //    15: aload_2        
        //    16: ifnonnull       66
        //    19: aload_0        
        //    20: getfield        com/google/android/gms/measurement/internal/l8.K:Lcom/google/android/gms/measurement/internal/u8;
        //    23: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //    26: invokevirtual   com/google/android/gms/measurement/internal/z4.c:()Lcom/google/android/gms/measurement/internal/n3;
        //    29: invokevirtual   com/google/android/gms/measurement/internal/n3.o:()Lcom/google/android/gms/measurement/internal/l3;
        //    32: ldc             "(legacy) Failed to get conditional properties; not connected to service"
        //    34: aconst_null    
        //    35: aload_0        
        //    36: getfield        com/google/android/gms/measurement/internal/l8.H:Ljava/lang/String;
        //    39: aload_0        
        //    40: getfield        com/google/android/gms/measurement/internal/l8.I:Ljava/lang/String;
        //    43: invokevirtual   com/google/android/gms/measurement/internal/l3.d:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
        //    46: aload_0        
        //    47: getfield        com/google/android/gms/measurement/internal/l8.G:Ljava/util/concurrent/atomic/AtomicReference;
        //    50: invokestatic    java/util/Collections.emptyList:()Ljava/util/List;
        //    53: invokevirtual   java/util/concurrent/atomic/AtomicReference.set:(Ljava/lang/Object;)V
        //    56: aload_0        
        //    57: getfield        com/google/android/gms/measurement/internal/l8.G:Ljava/util/concurrent/atomic/AtomicReference;
        //    60: invokevirtual   java/lang/Object.notify:()V
        //    63: aload_1        
        //    64: monitorexit    
        //    65: return         
        //    66: aconst_null    
        //    67: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    70: ifeq            113
        //    73: aload_0        
        //    74: getfield        com/google/android/gms/measurement/internal/l8.J:Lcom/google/android/gms/measurement/internal/na;
        //    77: invokestatic    com/google/android/gms/common/internal/x.k:(Ljava/lang/Object;)Ljava/lang/Object;
        //    80: pop            
        //    81: aload_0        
        //    82: getfield        com/google/android/gms/measurement/internal/l8.G:Ljava/util/concurrent/atomic/AtomicReference;
        //    85: astore_3       
        //    86: aload_2        
        //    87: aload_0        
        //    88: getfield        com/google/android/gms/measurement/internal/l8.H:Ljava/lang/String;
        //    91: aload_0        
        //    92: getfield        com/google/android/gms/measurement/internal/l8.I:Ljava/lang/String;
        //    95: aload_0        
        //    96: getfield        com/google/android/gms/measurement/internal/l8.J:Lcom/google/android/gms/measurement/internal/na;
        //    99: invokeinterface com/google/android/gms/measurement/internal/d3.W0:(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/measurement/internal/na;)Ljava/util/List;
        //   104: astore_2       
        //   105: aload_3        
        //   106: aload_2        
        //   107: invokevirtual   java/util/concurrent/atomic/AtomicReference.set:(Ljava/lang/Object;)V
        //   110: goto            137
        //   113: aload_0        
        //   114: getfield        com/google/android/gms/measurement/internal/l8.G:Ljava/util/concurrent/atomic/AtomicReference;
        //   117: astore_3       
        //   118: aload_2        
        //   119: aconst_null    
        //   120: aload_0        
        //   121: getfield        com/google/android/gms/measurement/internal/l8.H:Ljava/lang/String;
        //   124: aload_0        
        //   125: getfield        com/google/android/gms/measurement/internal/l8.I:Ljava/lang/String;
        //   128: invokeinterface com/google/android/gms/measurement/internal/d3.E0:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
        //   133: astore_2       
        //   134: goto            105
        //   137: aload_0        
        //   138: getfield        com/google/android/gms/measurement/internal/l8.K:Lcom/google/android/gms/measurement/internal/u8;
        //   141: invokestatic    com/google/android/gms/measurement/internal/u8.M:(Lcom/google/android/gms/measurement/internal/u8;)V
        //   144: aload_0        
        //   145: getfield        com/google/android/gms/measurement/internal/l8.G:Ljava/util/concurrent/atomic/AtomicReference;
        //   148: astore_3       
        //   149: aload_3        
        //   150: invokevirtual   java/lang/Object.notify:()V
        //   153: goto            203
        //   156: astore_3       
        //   157: goto            206
        //   160: astore_3       
        //   161: aload_0        
        //   162: getfield        com/google/android/gms/measurement/internal/l8.K:Lcom/google/android/gms/measurement/internal/u8;
        //   165: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //   168: invokevirtual   com/google/android/gms/measurement/internal/z4.c:()Lcom/google/android/gms/measurement/internal/n3;
        //   171: invokevirtual   com/google/android/gms/measurement/internal/n3.o:()Lcom/google/android/gms/measurement/internal/l3;
        //   174: ldc             "(legacy) Failed to get conditional properties; remote exception"
        //   176: aconst_null    
        //   177: aload_0        
        //   178: getfield        com/google/android/gms/measurement/internal/l8.H:Ljava/lang/String;
        //   181: aload_3        
        //   182: invokevirtual   com/google/android/gms/measurement/internal/l3.d:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
        //   185: aload_0        
        //   186: getfield        com/google/android/gms/measurement/internal/l8.G:Ljava/util/concurrent/atomic/AtomicReference;
        //   189: invokestatic    java/util/Collections.emptyList:()Ljava/util/List;
        //   192: invokevirtual   java/util/concurrent/atomic/AtomicReference.set:(Ljava/lang/Object;)V
        //   195: aload_0        
        //   196: getfield        com/google/android/gms/measurement/internal/l8.G:Ljava/util/concurrent/atomic/AtomicReference;
        //   199: astore_3       
        //   200: goto            149
        //   203: aload_1        
        //   204: monitorexit    
        //   205: return         
        //   206: aload_0        
        //   207: getfield        com/google/android/gms/measurement/internal/l8.G:Ljava/util/concurrent/atomic/AtomicReference;
        //   210: invokevirtual   java/lang/Object.notify:()V
        //   213: aload_3        
        //   214: athrow         
        //   215: astore_3       
        //   216: aload_1        
        //   217: monitorexit    
        //   218: aload_3        
        //   219: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  7      15     160    203    Landroid/os/RemoteException;
        //  7      15     156    160    Any
        //  19     56     160    203    Landroid/os/RemoteException;
        //  19     56     156    160    Any
        //  56     65     215    220    Any
        //  66     105    160    203    Landroid/os/RemoteException;
        //  66     105    156    160    Any
        //  105    110    160    203    Landroid/os/RemoteException;
        //  105    110    156    160    Any
        //  113    134    160    203    Landroid/os/RemoteException;
        //  113    134    156    160    Any
        //  137    144    160    203    Landroid/os/RemoteException;
        //  137    144    156    160    Any
        //  144    149    215    220    Any
        //  149    153    215    220    Any
        //  161    195    156    160    Any
        //  195    200    215    220    Any
        //  203    205    215    220    Any
        //  206    215    215    220    Any
        //  216    218    215    220    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0066:
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
