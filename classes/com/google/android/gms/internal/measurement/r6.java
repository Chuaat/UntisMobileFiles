// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import android.net.Uri;
import android.content.Context;

public final class r6
{
    static volatile h7<Boolean> a;
    private static final Object b;
    
    static {
        r6.a = h7.c();
        b = new Object();
    }
    
    public static boolean a(final Context p0, final Uri p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   android/net/Uri.getAuthority:()Ljava/lang/String;
        //     4: astore_1       
        //     5: ldc             "com.google.android.gms.phenotype"
        //     7: aload_1        
        //     8: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    11: istore_2       
        //    12: iconst_0       
        //    13: istore_3       
        //    14: iload_2        
        //    15: ifne            61
        //    18: new             Ljava/lang/StringBuilder;
        //    21: dup            
        //    22: aload_1        
        //    23: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //    26: invokevirtual   java/lang/String.length:()I
        //    29: bipush          91
        //    31: iadd           
        //    32: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //    35: astore_0       
        //    36: aload_0        
        //    37: aload_1        
        //    38: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    41: pop            
        //    42: aload_0        
        //    43: ldc             " is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."
        //    45: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    48: pop            
        //    49: ldc             "PhenotypeClientHelper"
        //    51: aload_0        
        //    52: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    55: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //    58: pop            
        //    59: iconst_0       
        //    60: ireturn        
        //    61: getstatic       com/google/android/gms/internal/measurement/r6.a:Lcom/google/android/gms/internal/measurement/h7;
        //    64: invokevirtual   com/google/android/gms/internal/measurement/h7.b:()Z
        //    67: ifeq            83
        //    70: getstatic       com/google/android/gms/internal/measurement/r6.a:Lcom/google/android/gms/internal/measurement/h7;
        //    73: invokevirtual   com/google/android/gms/internal/measurement/h7.a:()Ljava/lang/Object;
        //    76: checkcast       Ljava/lang/Boolean;
        //    79: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    82: ireturn        
        //    83: getstatic       com/google/android/gms/internal/measurement/r6.b:Ljava/lang/Object;
        //    86: astore_1       
        //    87: aload_1        
        //    88: monitorenter   
        //    89: getstatic       com/google/android/gms/internal/measurement/r6.a:Lcom/google/android/gms/internal/measurement/h7;
        //    92: invokevirtual   com/google/android/gms/internal/measurement/h7.b:()Z
        //    95: ifeq            115
        //    98: getstatic       com/google/android/gms/internal/measurement/r6.a:Lcom/google/android/gms/internal/measurement/h7;
        //   101: invokevirtual   com/google/android/gms/internal/measurement/h7.a:()Ljava/lang/Object;
        //   104: checkcast       Ljava/lang/Boolean;
        //   107: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   110: istore_2       
        //   111: aload_1        
        //   112: monitorexit    
        //   113: iload_2        
        //   114: ireturn        
        //   115: ldc             "com.google.android.gms"
        //   117: aload_0        
        //   118: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //   121: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   124: ifeq            130
        //   127: goto            190
        //   130: aload_0        
        //   131: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //   134: astore          4
        //   136: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   139: bipush          29
        //   141: if_icmpge       150
        //   144: iconst_0       
        //   145: istore          5
        //   147: goto            154
        //   150: ldc             268435456
        //   152: istore          5
        //   154: aload           4
        //   156: ldc             "com.google.android.gms.phenotype"
        //   158: iload           5
        //   160: invokevirtual   android/content/pm/PackageManager.resolveContentProvider:(Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;
        //   163: astore          4
        //   165: iload_3        
        //   166: istore_2       
        //   167: aload           4
        //   169: ifnull          218
        //   172: ldc             "com.google.android.gms"
        //   174: aload           4
        //   176: getfield        android/content/pm/ProviderInfo.packageName:Ljava/lang/String;
        //   179: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   182: ifne            190
        //   185: iload_3        
        //   186: istore_2       
        //   187: goto            218
        //   190: aload_0        
        //   191: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //   194: astore_0       
        //   195: aload_0        
        //   196: ldc             "com.google.android.gms"
        //   198: iconst_0       
        //   199: invokevirtual   android/content/pm/PackageManager.getApplicationInfo:(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
        //   202: astore_0       
        //   203: iload_3        
        //   204: istore_2       
        //   205: aload_0        
        //   206: getfield        android/content/pm/ApplicationInfo.flags:I
        //   209: sipush          129
        //   212: iand           
        //   213: ifeq            218
        //   216: iconst_1       
        //   217: istore_2       
        //   218: iload_2        
        //   219: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   222: invokestatic    com/google/android/gms/internal/measurement/h7.d:(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/h7;
        //   225: putstatic       com/google/android/gms/internal/measurement/r6.a:Lcom/google/android/gms/internal/measurement/h7;
        //   228: aload_1        
        //   229: monitorexit    
        //   230: goto            70
        //   233: astore_0       
        //   234: aload_1        
        //   235: monitorexit    
        //   236: aload_0        
        //   237: athrow         
        //   238: astore_0       
        //   239: iload_3        
        //   240: istore_2       
        //   241: goto            218
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                     
        //  -----  -----  -----  -----  ---------------------------------------------------------
        //  89     113    233    238    Any
        //  115    127    233    238    Any
        //  130    144    233    238    Any
        //  154    165    233    238    Any
        //  172    185    233    238    Any
        //  190    195    233    238    Any
        //  195    203    238    244    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  195    203    233    238    Any
        //  205    216    233    238    Any
        //  218    230    233    238    Any
        //  234    236    233    238    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0218:
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
