// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.model;

import com.bumptech.glide.load.j;
import java.io.File;
import androidx.annotation.j0;
import com.bumptech.glide.load.engine.bitmap_recycle.b;
import java.io.InputStream;
import com.bumptech.glide.load.d;

public class t implements d<InputStream>
{
    private static final String b = "StreamEncoder";
    private final b a;
    
    public t(final b a) {
        this.a = a;
    }
    
    public boolean c(@j0 final InputStream p0, @j0 final File p1, @j0 final j p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/bumptech/glide/load/model/t.a:Lcom/bumptech/glide/load/engine/bitmap_recycle/b;
        //     4: ldc             65536
        //     6: ldc             [B.class
        //     8: invokeinterface com/bumptech/glide/load/engine/bitmap_recycle/b.f:(ILjava/lang/Class;)Ljava/lang/Object;
        //    13: checkcast       [B
        //    16: astore          4
        //    18: iconst_0       
        //    19: istore          5
        //    21: iconst_0       
        //    22: istore          6
        //    24: aconst_null    
        //    25: astore          7
        //    27: aconst_null    
        //    28: astore          8
        //    30: aload           8
        //    32: astore_3       
        //    33: new             Ljava/io/FileOutputStream;
        //    36: astore          9
        //    38: aload           8
        //    40: astore_3       
        //    41: aload           9
        //    43: aload_2        
        //    44: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //    47: aload_1        
        //    48: aload           4
        //    50: invokevirtual   java/io/InputStream.read:([B)I
        //    53: istore          10
        //    55: iload           10
        //    57: iconst_m1      
        //    58: if_icmpeq       74
        //    61: aload           9
        //    63: aload           4
        //    65: iconst_0       
        //    66: iload           10
        //    68: invokevirtual   java/io/OutputStream.write:([BII)V
        //    71: goto            47
        //    74: aload           9
        //    76: invokevirtual   java/io/OutputStream.close:()V
        //    79: iconst_1       
        //    80: istore          11
        //    82: iconst_1       
        //    83: istore          6
        //    85: aload           9
        //    87: invokevirtual   java/io/OutputStream.close:()V
        //    90: iload           6
        //    92: istore          11
        //    94: goto            161
        //    97: astore_1       
        //    98: aload           9
        //   100: astore_3       
        //   101: goto            175
        //   104: astore_2       
        //   105: aload           9
        //   107: astore_1       
        //   108: goto            119
        //   111: astore_1       
        //   112: goto            175
        //   115: astore_2       
        //   116: aload           7
        //   118: astore_1       
        //   119: aload_1        
        //   120: astore_3       
        //   121: ldc             "StreamEncoder"
        //   123: iconst_3       
        //   124: invokestatic    android/util/Log.isLoggable:(Ljava/lang/String;I)Z
        //   127: ifeq            141
        //   130: aload_1        
        //   131: astore_3       
        //   132: ldc             "StreamEncoder"
        //   134: ldc             "Failed to encode data onto the OutputStream"
        //   136: aload_2        
        //   137: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   140: pop            
        //   141: iload           6
        //   143: istore          11
        //   145: aload_1        
        //   146: ifnull          161
        //   149: iload           5
        //   151: istore          11
        //   153: aload_1        
        //   154: invokevirtual   java/io/OutputStream.close:()V
        //   157: iload           6
        //   159: istore          11
        //   161: aload_0        
        //   162: getfield        com/bumptech/glide/load/model/t.a:Lcom/bumptech/glide/load/engine/bitmap_recycle/b;
        //   165: aload           4
        //   167: invokeinterface com/bumptech/glide/load/engine/bitmap_recycle/b.d:(Ljava/lang/Object;)V
        //   172: iload           11
        //   174: ireturn        
        //   175: aload_3        
        //   176: ifnull          183
        //   179: aload_3        
        //   180: invokevirtual   java/io/OutputStream.close:()V
        //   183: aload_0        
        //   184: getfield        com/bumptech/glide/load/model/t.a:Lcom/bumptech/glide/load/engine/bitmap_recycle/b;
        //   187: aload           4
        //   189: invokeinterface com/bumptech/glide/load/engine/bitmap_recycle/b.d:(Ljava/lang/Object;)V
        //   194: aload_1        
        //   195: athrow         
        //   196: astore_1       
        //   197: goto            161
        //   200: astore_2       
        //   201: goto            183
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  33     38     115    119    Ljava/io/IOException;
        //  33     38     111    115    Any
        //  41     47     115    119    Ljava/io/IOException;
        //  41     47     111    115    Any
        //  47     55     104    111    Ljava/io/IOException;
        //  47     55     97     104    Any
        //  61     71     104    111    Ljava/io/IOException;
        //  61     71     97     104    Any
        //  74     79     104    111    Ljava/io/IOException;
        //  74     79     97     104    Any
        //  85     90     196    200    Ljava/io/IOException;
        //  121    130    111    115    Any
        //  132    141    111    115    Any
        //  153    157    196    200    Ljava/io/IOException;
        //  179    183    200    204    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0183:
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
