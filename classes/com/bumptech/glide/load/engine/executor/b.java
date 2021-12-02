// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.engine.executor;

import android.os.Build$VERSION;

final class b
{
    private static final String a = "GlideRuntimeCompat";
    private static final String b = "cpu[0-9]+";
    private static final String c = "/sys/devices/system/cpu/";
    
    private b() {
    }
    
    static int a() {
        int b = Runtime.getRuntime().availableProcessors();
        if (Build$VERSION.SDK_INT < 17) {
            b = Math.max(b(), b);
        }
        return b;
    }
    
    private static int b() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore_0       
        //     4: new             Ljava/io/File;
        //     7: astore_1       
        //     8: aload_1        
        //     9: ldc             "/sys/devices/system/cpu/"
        //    11: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //    14: ldc             "cpu[0-9]+"
        //    16: invokestatic    java/util/regex/Pattern.compile:(Ljava/lang/String;)Ljava/util/regex/Pattern;
        //    19: astore_2       
        //    20: new             Lcom/bumptech/glide/load/engine/executor/b$a;
        //    23: astore_3       
        //    24: aload_3        
        //    25: aload_2        
        //    26: invokespecial   com/bumptech/glide/load/engine/executor/b$a.<init>:(Ljava/util/regex/Pattern;)V
        //    29: aload_1        
        //    30: aload_3        
        //    31: invokevirtual   java/io/File.listFiles:(Ljava/io/FilenameFilter;)[Ljava/io/File;
        //    34: astore_2       
        //    35: aload_0        
        //    36: invokestatic    android/os/StrictMode.setThreadPolicy:(Landroid/os/StrictMode$ThreadPolicy;)V
        //    39: goto            68
        //    42: astore_2       
        //    43: ldc             "GlideRuntimeCompat"
        //    45: bipush          6
        //    47: invokestatic    android/util/Log.isLoggable:(Ljava/lang/String;I)Z
        //    50: ifeq            62
        //    53: ldc             "GlideRuntimeCompat"
        //    55: ldc             "Failed to calculate accurate cpu count"
        //    57: aload_2        
        //    58: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //    61: pop            
        //    62: aload_0        
        //    63: invokestatic    android/os/StrictMode.setThreadPolicy:(Landroid/os/StrictMode$ThreadPolicy;)V
        //    66: aconst_null    
        //    67: astore_2       
        //    68: aload_2        
        //    69: ifnull          79
        //    72: aload_2        
        //    73: arraylength    
        //    74: istore          4
        //    76: goto            82
        //    79: iconst_0       
        //    80: istore          4
        //    82: iconst_1       
        //    83: iload           4
        //    85: invokestatic    java/lang/Math.max:(II)I
        //    88: ireturn        
        //    89: astore_2       
        //    90: aload_0        
        //    91: invokestatic    android/os/StrictMode.setThreadPolicy:(Landroid/os/StrictMode$ThreadPolicy;)V
        //    94: aload_2        
        //    95: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  4      35     42     68     Any
        //  43     62     89     96     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0062:
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
