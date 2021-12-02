// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.common;

import java.io.IOException;
import java.io.Closeable;
import java.io.FileInputStream;
import c6.h;

public class ProcessUtil
{
    private static final int CMDLINE_BUFFER_SIZE = 64;
    private static String sProcessName;
    private static boolean sProcessNameRead;
    
    @h
    public static String getProcessName() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: monitorenter   
        //     3: getstatic       com/facebook/stetho/common/ProcessUtil.sProcessNameRead:Z
        //     6: ifne            19
        //     9: iconst_1       
        //    10: putstatic       com/facebook/stetho/common/ProcessUtil.sProcessNameRead:Z
        //    13: invokestatic    com/facebook/stetho/common/ProcessUtil.readProcessName:()Ljava/lang/String;
        //    16: putstatic       com/facebook/stetho/common/ProcessUtil.sProcessName:Ljava/lang/String;
        //    19: getstatic       com/facebook/stetho/common/ProcessUtil.sProcessName:Ljava/lang/String;
        //    22: astore_0       
        //    23: ldc             Lcom/facebook/stetho/common/ProcessUtil;.class
        //    25: monitorexit    
        //    26: aload_0        
        //    27: areturn        
        //    28: astore_0       
        //    29: ldc             Lcom/facebook/stetho/common/ProcessUtil;.class
        //    31: monitorexit    
        //    32: aload_0        
        //    33: athrow         
        //    34: astore_0       
        //    35: goto            19
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  3      13     28     34     Any
        //  13     19     34     38     Ljava/io/IOException;
        //  13     19     28     34     Any
        //  19     23     28     34     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0019:
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
    
    private static int indexOf(final byte[] array, int i, final int n, final byte b) {
        for (i = 0; i < array.length; ++i) {
            if (array[i] == b) {
                return i;
            }
        }
        return -1;
    }
    
    private static String readProcessName() throws IOException {
        final byte[] array = new byte[64];
        final FileInputStream fileInputStream = new FileInputStream("/proc/self/cmdline");
        int index = 0;
        boolean b;
        try {
            int read = fileInputStream.read(array);
            try {
                index = indexOf(array, 0, read, (byte)0);
                if (index > 0) {
                    read = index;
                }
                final String s = new String(array, 0, read);
                Util.close(fileInputStream, false);
                return s;
            }
            finally {}
        }
        finally {
            b = (index != 0);
        }
        Util.close(fileInputStream, true ^ b);
    }
}
