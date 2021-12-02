// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.load.c;
import com.bumptech.glide.load.engine.v;
import java.io.File;
import com.bumptech.glide.load.j;
import androidx.annotation.j0;
import androidx.annotation.k0;
import com.bumptech.glide.load.engine.bitmap_recycle.b;
import android.graphics.Bitmap$CompressFormat;
import com.bumptech.glide.load.i;
import android.graphics.Bitmap;
import com.bumptech.glide.load.m;

public class e implements m<Bitmap>
{
    public static final i<Integer> b;
    public static final i<Bitmap$CompressFormat> c;
    private static final String d = "BitmapEncoder";
    @k0
    private final b a;
    
    static {
        b = i.g("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);
        c = i.f("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");
    }
    
    @Deprecated
    public e() {
        this.a = null;
    }
    
    public e(@j0 final b a) {
        this.a = a;
    }
    
    private Bitmap$CompressFormat d(final Bitmap bitmap, final j j) {
        final Bitmap$CompressFormat bitmap$CompressFormat = j.c(e.c);
        if (bitmap$CompressFormat != null) {
            return bitmap$CompressFormat;
        }
        if (bitmap.hasAlpha()) {
            return Bitmap$CompressFormat.PNG;
        }
        return Bitmap$CompressFormat.JPEG;
    }
    
    @j0
    @Override
    public c b(@j0 final j j) {
        return com.bumptech.glide.load.c.H;
    }
    
    public boolean c(@j0 final v<Bitmap> p0, @j0 final File p1, @j0 final j p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokeinterface com/bumptech/glide/load/engine/v.get:()Ljava/lang/Object;
        //     6: checkcast       Landroid/graphics/Bitmap;
        //     9: astore          4
        //    11: aload_0        
        //    12: aload           4
        //    14: aload_3        
        //    15: invokespecial   com/bumptech/glide/load/resource/bitmap/e.d:(Landroid/graphics/Bitmap;Lcom/bumptech/glide/load/j;)Landroid/graphics/Bitmap$CompressFormat;
        //    18: astore          5
        //    20: ldc             "encode: [%dx%d] %s"
        //    22: aload           4
        //    24: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //    27: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    30: aload           4
        //    32: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //    35: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    38: aload           5
        //    40: invokestatic    com/bumptech/glide/util/pool/b.d:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
        //    43: invokestatic    com/bumptech/glide/util/g.b:()J
        //    46: lstore          6
        //    48: aload_3        
        //    49: getstatic       com/bumptech/glide/load/resource/bitmap/e.b:Lcom/bumptech/glide/load/i;
        //    52: invokevirtual   com/bumptech/glide/load/j.c:(Lcom/bumptech/glide/load/i;)Ljava/lang/Object;
        //    55: checkcast       Ljava/lang/Integer;
        //    58: invokevirtual   java/lang/Integer.intValue:()I
        //    61: istore          8
        //    63: iconst_0       
        //    64: istore          9
        //    66: iconst_0       
        //    67: istore          10
        //    69: aconst_null    
        //    70: astore          11
        //    72: aconst_null    
        //    73: astore          12
        //    75: aload           12
        //    77: astore          13
        //    79: aload           11
        //    81: astore          14
        //    83: new             Ljava/io/FileOutputStream;
        //    86: astore_1       
        //    87: aload           12
        //    89: astore          13
        //    91: aload           11
        //    93: astore          14
        //    95: aload_1        
        //    96: aload_2        
        //    97: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //   100: aload_0        
        //   101: getfield        com/bumptech/glide/load/resource/bitmap/e.a:Lcom/bumptech/glide/load/engine/bitmap_recycle/b;
        //   104: ifnull          125
        //   107: new             Lcom/bumptech/glide/load/data/c;
        //   110: astore_2       
        //   111: aload_2        
        //   112: aload_1        
        //   113: aload_0        
        //   114: getfield        com/bumptech/glide/load/resource/bitmap/e.a:Lcom/bumptech/glide/load/engine/bitmap_recycle/b;
        //   117: invokespecial   com/bumptech/glide/load/data/c.<init>:(Ljava/io/OutputStream;Lcom/bumptech/glide/load/engine/bitmap_recycle/b;)V
        //   120: aload_2        
        //   121: astore_1       
        //   122: goto            125
        //   125: aload_1        
        //   126: astore          13
        //   128: aload_1        
        //   129: astore          14
        //   131: aload           4
        //   133: aload           5
        //   135: iload           8
        //   137: aload_1        
        //   138: invokevirtual   android/graphics/Bitmap.compress:(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
        //   141: pop            
        //   142: aload_1        
        //   143: astore          13
        //   145: aload_1        
        //   146: astore          14
        //   148: aload_1        
        //   149: invokevirtual   java/io/OutputStream.close:()V
        //   152: iconst_1       
        //   153: istore          9
        //   155: aload_1        
        //   156: invokevirtual   java/io/OutputStream.close:()V
        //   159: goto            216
        //   162: astore_2       
        //   163: aload_1        
        //   164: astore          13
        //   166: goto            333
        //   169: astore_2       
        //   170: goto            181
        //   173: astore_2       
        //   174: goto            333
        //   177: astore_2       
        //   178: aload           14
        //   180: astore_1       
        //   181: aload_1        
        //   182: astore          13
        //   184: ldc             "BitmapEncoder"
        //   186: iconst_3       
        //   187: invokestatic    android/util/Log.isLoggable:(Ljava/lang/String;I)Z
        //   190: ifeq            205
        //   193: aload_1        
        //   194: astore          13
        //   196: ldc             "BitmapEncoder"
        //   198: ldc             "Failed to encode Bitmap"
        //   200: aload_2        
        //   201: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   204: pop            
        //   205: aload_1        
        //   206: ifnull          216
        //   209: iload           10
        //   211: istore          9
        //   213: goto            155
        //   216: ldc             "BitmapEncoder"
        //   218: iconst_2       
        //   219: invokestatic    android/util/Log.isLoggable:(Ljava/lang/String;I)Z
        //   222: ifeq            327
        //   225: new             Ljava/lang/StringBuilder;
        //   228: astore_1       
        //   229: aload_1        
        //   230: invokespecial   java/lang/StringBuilder.<init>:()V
        //   233: aload_1        
        //   234: ldc             "Compressed with type: "
        //   236: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   239: pop            
        //   240: aload_1        
        //   241: aload           5
        //   243: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   246: pop            
        //   247: aload_1        
        //   248: ldc             " of size "
        //   250: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   253: pop            
        //   254: aload_1        
        //   255: aload           4
        //   257: invokestatic    com/bumptech/glide/util/m.h:(Landroid/graphics/Bitmap;)I
        //   260: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   263: pop            
        //   264: aload_1        
        //   265: ldc             " in "
        //   267: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   270: pop            
        //   271: aload_1        
        //   272: lload           6
        //   274: invokestatic    com/bumptech/glide/util/g.a:(J)D
        //   277: invokevirtual   java/lang/StringBuilder.append:(D)Ljava/lang/StringBuilder;
        //   280: pop            
        //   281: aload_1        
        //   282: ldc             ", options format: "
        //   284: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   287: pop            
        //   288: aload_1        
        //   289: aload_3        
        //   290: getstatic       com/bumptech/glide/load/resource/bitmap/e.c:Lcom/bumptech/glide/load/i;
        //   293: invokevirtual   com/bumptech/glide/load/j.c:(Lcom/bumptech/glide/load/i;)Ljava/lang/Object;
        //   296: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   299: pop            
        //   300: aload_1        
        //   301: ldc             ", hasAlpha: "
        //   303: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   306: pop            
        //   307: aload_1        
        //   308: aload           4
        //   310: invokevirtual   android/graphics/Bitmap.hasAlpha:()Z
        //   313: invokevirtual   java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
        //   316: pop            
        //   317: ldc             "BitmapEncoder"
        //   319: aload_1        
        //   320: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   323: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //   326: pop            
        //   327: invokestatic    com/bumptech/glide/util/pool/b.e:()V
        //   330: iload           9
        //   332: ireturn        
        //   333: aload           13
        //   335: ifnull          343
        //   338: aload           13
        //   340: invokevirtual   java/io/OutputStream.close:()V
        //   343: aload_2        
        //   344: athrow         
        //   345: astore_1       
        //   346: invokestatic    com/bumptech/glide/util/pool/b.e:()V
        //   349: aload_1        
        //   350: athrow         
        //   351: astore_1       
        //   352: goto            216
        //   355: astore_1       
        //   356: goto            343
        //    Signature:
        //  (Lcom/bumptech/glide/load/engine/v<Landroid/graphics/Bitmap;>;Ljava/io/File;Lcom/bumptech/glide/load/j;)Z
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  43     63     345    351    Any
        //  83     87     177    181    Ljava/io/IOException;
        //  83     87     173    177    Any
        //  95     100    177    181    Ljava/io/IOException;
        //  95     100    173    177    Any
        //  100    120    169    173    Ljava/io/IOException;
        //  100    120    162    169    Any
        //  131    142    177    181    Ljava/io/IOException;
        //  131    142    173    177    Any
        //  148    152    177    181    Ljava/io/IOException;
        //  148    152    173    177    Any
        //  155    159    351    355    Ljava/io/IOException;
        //  155    159    345    351    Any
        //  184    193    173    177    Any
        //  196    205    173    177    Any
        //  216    327    345    351    Any
        //  338    343    355    359    Ljava/io/IOException;
        //  338    343    345    351    Any
        //  343    345    345    351    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 185 out of bounds for length 185
        //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        //     at java.base/java.util.Objects.checkIndex(Objects.java:372)
        //     at java.base/java.util.ArrayList.get(ArrayList.java:458)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3321)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
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
}
