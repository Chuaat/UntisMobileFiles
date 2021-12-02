// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.data.mediastore;

import java.io.FileNotFoundException;
import android.text.TextUtils;
import java.io.InputStream;
import java.io.File;
import androidx.annotation.k0;
import androidx.annotation.j0;
import android.net.Uri;
import com.bumptech.glide.load.ImageHeaderParser;
import java.util.List;
import android.content.ContentResolver;
import com.bumptech.glide.load.engine.bitmap_recycle.b;

class e
{
    private static final String f = "ThumbStreamOpener";
    private static final a g;
    private final a a;
    private final d b;
    private final b c;
    private final ContentResolver d;
    private final List<ImageHeaderParser> e;
    
    static {
        g = new a();
    }
    
    e(final List<ImageHeaderParser> e, final a a, final d b, final b c, final ContentResolver d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    e(final List<ImageHeaderParser> list, final d d, final b b, final ContentResolver contentResolver) {
        this(list, com.bumptech.glide.load.data.mediastore.e.g, d, b, contentResolver);
    }
    
    @k0
    private String b(@j0 final Uri p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore_2       
        //     2: aload_0        
        //     3: getfield        com/bumptech/glide/load/data/mediastore/e.b:Lcom/bumptech/glide/load/data/mediastore/d;
        //     6: aload_1        
        //     7: invokeinterface com/bumptech/glide/load/data/mediastore/d.a:(Landroid/net/Uri;)Landroid/database/Cursor;
        //    12: astore_3       
        //    13: aload_3        
        //    14: ifnull          53
        //    17: aload_3        
        //    18: astore_2       
        //    19: aload_3        
        //    20: invokeinterface android/database/Cursor.moveToFirst:()Z
        //    25: ifeq            53
        //    28: aload_3        
        //    29: astore_2       
        //    30: aload_3        
        //    31: iconst_0       
        //    32: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //    37: astore          4
        //    39: aload_3        
        //    40: invokeinterface android/database/Cursor.close:()V
        //    45: aload           4
        //    47: areturn        
        //    48: astore          4
        //    50: goto            73
        //    53: aload_3        
        //    54: ifnull          63
        //    57: aload_3        
        //    58: invokeinterface android/database/Cursor.close:()V
        //    63: aconst_null    
        //    64: areturn        
        //    65: astore_1       
        //    66: goto            145
        //    69: astore          4
        //    71: aconst_null    
        //    72: astore_3       
        //    73: aload_3        
        //    74: astore_2       
        //    75: ldc             "ThumbStreamOpener"
        //    77: iconst_3       
        //    78: invokestatic    android/util/Log.isLoggable:(Ljava/lang/String;I)Z
        //    81: ifeq            132
        //    84: aload_3        
        //    85: astore_2       
        //    86: new             Ljava/lang/StringBuilder;
        //    89: astore          5
        //    91: aload_3        
        //    92: astore_2       
        //    93: aload           5
        //    95: invokespecial   java/lang/StringBuilder.<init>:()V
        //    98: aload_3        
        //    99: astore_2       
        //   100: aload           5
        //   102: ldc             "Failed to query for thumbnail for Uri: "
        //   104: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   107: pop            
        //   108: aload_3        
        //   109: astore_2       
        //   110: aload           5
        //   112: aload_1        
        //   113: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   116: pop            
        //   117: aload_3        
        //   118: astore_2       
        //   119: ldc             "ThumbStreamOpener"
        //   121: aload           5
        //   123: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   126: aload           4
        //   128: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   131: pop            
        //   132: aload_3        
        //   133: ifnull          142
        //   136: aload_3        
        //   137: invokeinterface android/database/Cursor.close:()V
        //   142: aconst_null    
        //   143: areturn        
        //   144: astore_1       
        //   145: aload_2        
        //   146: ifnull          155
        //   149: aload_2        
        //   150: invokeinterface android/database/Cursor.close:()V
        //   155: aload_1        
        //   156: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                         
        //  -----  -----  -----  -----  -----------------------------
        //  2      13     69     73     Ljava/lang/SecurityException;
        //  2      13     65     69     Any
        //  19     28     48     53     Ljava/lang/SecurityException;
        //  19     28     144    145    Any
        //  30     39     48     53     Ljava/lang/SecurityException;
        //  30     39     144    145    Any
        //  75     84     144    145    Any
        //  86     91     144    145    Any
        //  93     98     144    145    Any
        //  100    108    144    145    Any
        //  110    117    144    145    Any
        //  119    132    144    145    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0053:
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
    
    private boolean c(final File file) {
        return this.a.a(file) && 0L < this.a.c(file);
    }
    
    int a(final Uri p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: aconst_null    
        //     3: astore_3       
        //     4: aconst_null    
        //     5: astore          4
        //     7: aload_0        
        //     8: getfield        com/bumptech/glide/load/data/mediastore/e.d:Landroid/content/ContentResolver;
        //    11: aload_1        
        //    12: invokevirtual   android/content/ContentResolver.openInputStream:(Landroid/net/Uri;)Ljava/io/InputStream;
        //    15: astore          5
        //    17: aload           5
        //    19: astore          4
        //    21: aload           5
        //    23: astore_2       
        //    24: aload           5
        //    26: astore_3       
        //    27: aload_0        
        //    28: getfield        com/bumptech/glide/load/data/mediastore/e.e:Ljava/util/List;
        //    31: aload           5
        //    33: aload_0        
        //    34: getfield        com/bumptech/glide/load/data/mediastore/e.c:Lcom/bumptech/glide/load/engine/bitmap_recycle/b;
        //    37: invokestatic    com/bumptech/glide/load/f.b:(Ljava/util/List;Ljava/io/InputStream;Lcom/bumptech/glide/load/engine/bitmap_recycle/b;)I
        //    40: istore          6
        //    42: aload           5
        //    44: ifnull          52
        //    47: aload           5
        //    49: invokevirtual   java/io/InputStream.close:()V
        //    52: iload           6
        //    54: ireturn        
        //    55: astore_1       
        //    56: goto            138
        //    59: astore          5
        //    61: goto            68
        //    64: astore          5
        //    66: aload_3        
        //    67: astore_2       
        //    68: aload_2        
        //    69: astore          4
        //    71: ldc             "ThumbStreamOpener"
        //    73: iconst_3       
        //    74: invokestatic    android/util/Log.isLoggable:(Ljava/lang/String;I)Z
        //    77: ifeq            128
        //    80: aload_2        
        //    81: astore          4
        //    83: new             Ljava/lang/StringBuilder;
        //    86: astore_3       
        //    87: aload_2        
        //    88: astore          4
        //    90: aload_3        
        //    91: invokespecial   java/lang/StringBuilder.<init>:()V
        //    94: aload_2        
        //    95: astore          4
        //    97: aload_3        
        //    98: ldc             "Failed to open uri: "
        //   100: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   103: pop            
        //   104: aload_2        
        //   105: astore          4
        //   107: aload_3        
        //   108: aload_1        
        //   109: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   112: pop            
        //   113: aload_2        
        //   114: astore          4
        //   116: ldc             "ThumbStreamOpener"
        //   118: aload_3        
        //   119: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   122: aload           5
        //   124: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   127: pop            
        //   128: aload_2        
        //   129: ifnull          136
        //   132: aload_2        
        //   133: invokevirtual   java/io/InputStream.close:()V
        //   136: iconst_m1      
        //   137: ireturn        
        //   138: aload           4
        //   140: ifnull          148
        //   143: aload           4
        //   145: invokevirtual   java/io/InputStream.close:()V
        //   148: aload_1        
        //   149: athrow         
        //   150: astore_1       
        //   151: goto            52
        //   154: astore_1       
        //   155: goto            136
        //   158: astore          4
        //   160: goto            148
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  7      17     64     68     Ljava/io/IOException;
        //  7      17     59     64     Ljava/lang/NullPointerException;
        //  7      17     55     150    Any
        //  27     42     64     68     Ljava/io/IOException;
        //  27     42     59     64     Ljava/lang/NullPointerException;
        //  27     42     55     150    Any
        //  47     52     150    154    Ljava/io/IOException;
        //  71     80     55     150    Any
        //  83     87     55     150    Any
        //  90     94     55     150    Any
        //  97     104    55     150    Any
        //  107    113    55     150    Any
        //  116    128    55     150    Any
        //  132    136    154    158    Ljava/io/IOException;
        //  143    148    158    163    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.util.ConcurrentModificationException
        //     at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1042)
        //     at java.base/java.util.ArrayList$Itr.next(ArrayList.java:996)
        //     at com.strobel.decompiler.ast.AstBuilder.convertLocalVariables(AstBuilder.java:2863)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2445)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
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
    
    public InputStream d(final Uri obj) throws FileNotFoundException {
        final String b = this.b(obj);
        if (TextUtils.isEmpty((CharSequence)b)) {
            return null;
        }
        final File b2 = this.a.b(b);
        if (!this.c(b2)) {
            return null;
        }
        final Uri fromFile = Uri.fromFile(b2);
        try {
            return this.d.openInputStream(fromFile);
        }
        catch (NullPointerException cause) {
            final StringBuilder sb = new StringBuilder();
            sb.append("NPE opening uri: ");
            sb.append(obj);
            sb.append(" -> ");
            sb.append(fromFile);
            throw (FileNotFoundException)new FileNotFoundException(sb.toString()).initCause(cause);
        }
    }
}
