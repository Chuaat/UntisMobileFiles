// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class n8 implements Runnable
{
    final /* synthetic */ AtomicReference G;
    final /* synthetic */ String H;
    final /* synthetic */ String I;
    final /* synthetic */ na J;
    final /* synthetic */ boolean K;
    final /* synthetic */ u8 L;
    
    n8(final u8 l, final AtomicReference g, final String s, final String h, final String i, final na j, final boolean k) {
        this.L = l;
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
    }
    
    @Override
    public final void run() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/google/android/gms/measurement/internal/n8.G:Ljava/util/concurrent/atomic/AtomicReference;
        //     4: astore_1       
        //     5: aload_1        
        //     6: monitorenter   
        //     7: aload_0        
        //     8: getfield        com/google/android/gms/measurement/internal/n8.L:Lcom/google/android/gms/measurement/internal/u8;
        //    11: invokestatic    com/google/android/gms/measurement/internal/u8.E:(Lcom/google/android/gms/measurement/internal/u8;)Lcom/google/android/gms/measurement/internal/d3;
        //    14: astore_2       
        //    15: aload_2        
        //    16: ifnonnull       66
        //    19: aload_0        
        //    20: getfield        com/google/android/gms/measurement/internal/n8.L:Lcom/google/android/gms/measurement/internal/u8;
        //    23: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //    26: invokevirtual   com/google/android/gms/measurement/internal/z4.c:()Lcom/google/android/gms/measurement/internal/n3;
        //    29: invokevirtual   com/google/android/gms/measurement/internal/n3.o:()Lcom/google/android/gms/measurement/internal/l3;
        //    32: ldc             "(legacy) Failed to get user properties; not connected to service"
        //    34: aconst_null    
        //    35: aload_0        
        //    36: getfield        com/google/android/gms/measurement/internal/n8.H:Ljava/lang/String;
        //    39: aload_0        
        //    40: getfield        com/google/android/gms/measurement/internal/n8.I:Ljava/lang/String;
        //    43: invokevirtual   com/google/android/gms/measurement/internal/l3.d:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
        //    46: aload_0        
        //    47: getfield        com/google/android/gms/measurement/internal/n8.G:Ljava/util/concurrent/atomic/AtomicReference;
        //    50: invokestatic    java/util/Collections.emptyList:()Ljava/util/List;
        //    53: invokevirtual   java/util/concurrent/atomic/AtomicReference.set:(Ljava/lang/Object;)V
        //    56: aload_0        
        //    57: getfield        com/google/android/gms/measurement/internal/n8.G:Ljava/util/concurrent/atomic/AtomicReference;
        //    60: invokevirtual   java/lang/Object.notify:()V
        //    63: aload_1        
        //    64: monitorexit    
        //    65: return         
        //    66: aconst_null    
        //    67: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    70: ifeq            117
        //    73: aload_0        
        //    74: getfield        com/google/android/gms/measurement/internal/n8.J:Lcom/google/android/gms/measurement/internal/na;
        //    77: invokestatic    com/google/android/gms/common/internal/x.k:(Ljava/lang/Object;)Ljava/lang/Object;
        //    80: pop            
        //    81: aload_0        
        //    82: getfield        com/google/android/gms/measurement/internal/n8.G:Ljava/util/concurrent/atomic/AtomicReference;
        //    85: astore_3       
        //    86: aload_2        
        //    87: aload_0        
        //    88: getfield        com/google/android/gms/measurement/internal/n8.H:Ljava/lang/String;
        //    91: aload_0        
        //    92: getfield        com/google/android/gms/measurement/internal/n8.I:Ljava/lang/String;
        //    95: aload_0        
        //    96: getfield        com/google/android/gms/measurement/internal/n8.K:Z
        //    99: aload_0        
        //   100: getfield        com/google/android/gms/measurement/internal/n8.J:Lcom/google/android/gms/measurement/internal/na;
        //   103: invokeinterface com/google/android/gms/measurement/internal/d3.u1:(Ljava/lang/String;Ljava/lang/String;ZLcom/google/android/gms/measurement/internal/na;)Ljava/util/List;
        //   108: astore_2       
        //   109: aload_3        
        //   110: aload_2        
        //   111: invokevirtual   java/util/concurrent/atomic/AtomicReference.set:(Ljava/lang/Object;)V
        //   114: goto            145
        //   117: aload_0        
        //   118: getfield        com/google/android/gms/measurement/internal/n8.G:Ljava/util/concurrent/atomic/AtomicReference;
        //   121: astore_3       
        //   122: aload_2        
        //   123: aconst_null    
        //   124: aload_0        
        //   125: getfield        com/google/android/gms/measurement/internal/n8.H:Ljava/lang/String;
        //   128: aload_0        
        //   129: getfield        com/google/android/gms/measurement/internal/n8.I:Ljava/lang/String;
        //   132: aload_0        
        //   133: getfield        com/google/android/gms/measurement/internal/n8.K:Z
        //   136: invokeinterface com/google/android/gms/measurement/internal/d3.i0:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/util/List;
        //   141: astore_2       
        //   142: goto            109
        //   145: aload_0        
        //   146: getfield        com/google/android/gms/measurement/internal/n8.L:Lcom/google/android/gms/measurement/internal/u8;
        //   149: invokestatic    com/google/android/gms/measurement/internal/u8.M:(Lcom/google/android/gms/measurement/internal/u8;)V
        //   152: aload_0        
        //   153: getfield        com/google/android/gms/measurement/internal/n8.G:Ljava/util/concurrent/atomic/AtomicReference;
        //   156: astore_2       
        //   157: aload_2        
        //   158: invokevirtual   java/lang/Object.notify:()V
        //   161: goto            211
        //   164: astore_2       
        //   165: goto            214
        //   168: astore_2       
        //   169: aload_0        
        //   170: getfield        com/google/android/gms/measurement/internal/n8.L:Lcom/google/android/gms/measurement/internal/u8;
        //   173: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //   176: invokevirtual   com/google/android/gms/measurement/internal/z4.c:()Lcom/google/android/gms/measurement/internal/n3;
        //   179: invokevirtual   com/google/android/gms/measurement/internal/n3.o:()Lcom/google/android/gms/measurement/internal/l3;
        //   182: ldc             "(legacy) Failed to get user properties; remote exception"
        //   184: aconst_null    
        //   185: aload_0        
        //   186: getfield        com/google/android/gms/measurement/internal/n8.H:Ljava/lang/String;
        //   189: aload_2        
        //   190: invokevirtual   com/google/android/gms/measurement/internal/l3.d:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
        //   193: aload_0        
        //   194: getfield        com/google/android/gms/measurement/internal/n8.G:Ljava/util/concurrent/atomic/AtomicReference;
        //   197: invokestatic    java/util/Collections.emptyList:()Ljava/util/List;
        //   200: invokevirtual   java/util/concurrent/atomic/AtomicReference.set:(Ljava/lang/Object;)V
        //   203: aload_0        
        //   204: getfield        com/google/android/gms/measurement/internal/n8.G:Ljava/util/concurrent/atomic/AtomicReference;
        //   207: astore_2       
        //   208: goto            157
        //   211: aload_1        
        //   212: monitorexit    
        //   213: return         
        //   214: aload_0        
        //   215: getfield        com/google/android/gms/measurement/internal/n8.G:Ljava/util/concurrent/atomic/AtomicReference;
        //   218: invokevirtual   java/lang/Object.notify:()V
        //   221: aload_2        
        //   222: athrow         
        //   223: astore_2       
        //   224: aload_1        
        //   225: monitorexit    
        //   226: aload_2        
        //   227: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  7      15     168    211    Landroid/os/RemoteException;
        //  7      15     164    168    Any
        //  19     56     168    211    Landroid/os/RemoteException;
        //  19     56     164    168    Any
        //  56     65     223    228    Any
        //  66     109    168    211    Landroid/os/RemoteException;
        //  66     109    164    168    Any
        //  109    114    168    211    Landroid/os/RemoteException;
        //  109    114    164    168    Any
        //  117    142    168    211    Landroid/os/RemoteException;
        //  117    142    164    168    Any
        //  145    152    168    211    Landroid/os/RemoteException;
        //  145    152    164    168    Any
        //  152    157    223    228    Any
        //  157    161    223    228    Any
        //  169    203    164    168    Any
        //  203    208    223    228    Any
        //  211    213    223    228    Any
        //  214    223    223    228    Any
        //  224    226    223    228    Any
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
