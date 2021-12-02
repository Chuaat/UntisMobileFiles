// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load;

import java.nio.ByteBuffer;
import com.bumptech.glide.load.resource.bitmap.b0;
import androidx.annotation.k0;
import java.io.InputStream;
import androidx.annotation.p0;
import java.io.IOException;
import com.bumptech.glide.load.engine.bitmap_recycle.b;
import com.bumptech.glide.load.data.m;
import androidx.annotation.j0;
import java.util.List;

public final class f
{
    private static final int a = 5242880;
    
    private f() {
    }
    
    @p0(21)
    public static int a(@j0 final List<ImageHeaderParser> list, @j0 final m m, @j0 final b b) throws IOException {
        return c(list, (f)new f() {
            @Override
            public int a(final ImageHeaderParser p0) throws IOException {
                // 
                // This method could not be decompiled.
                // 
                // Original Bytecode:
                // 
                //     1: astore_2       
                //     2: new             Lcom/bumptech/glide/load/resource/bitmap/b0;
                //     5: astore_3       
                //     6: new             Ljava/io/FileInputStream;
                //     9: astore          4
                //    11: aload           4
                //    13: aload_0        
                //    14: getfield        com/bumptech/glide/load/f$e.a:Lcom/bumptech/glide/load/data/m;
                //    17: invokevirtual   com/bumptech/glide/load/data/m.d:()Landroid/os/ParcelFileDescriptor;
                //    20: invokevirtual   android/os/ParcelFileDescriptor.getFileDescriptor:()Ljava/io/FileDescriptor;
                //    23: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/FileDescriptor;)V
                //    26: aload_3        
                //    27: aload           4
                //    29: aload_0        
                //    30: getfield        com/bumptech/glide/load/f$e.b:Lcom/bumptech/glide/load/engine/bitmap_recycle/b;
                //    33: invokespecial   com/bumptech/glide/load/resource/bitmap/b0.<init>:(Ljava/io/InputStream;Lcom/bumptech/glide/load/engine/bitmap_recycle/b;)V
                //    36: aload_1        
                //    37: aload_3        
                //    38: aload_0        
                //    39: getfield        com/bumptech/glide/load/f$e.b:Lcom/bumptech/glide/load/engine/bitmap_recycle/b;
                //    42: invokeinterface com/bumptech/glide/load/ImageHeaderParser.d:(Ljava/io/InputStream;Lcom/bumptech/glide/load/engine/bitmap_recycle/b;)I
                //    47: istore          5
                //    49: aload_3        
                //    50: invokevirtual   java/io/InputStream.close:()V
                //    53: aload_0        
                //    54: getfield        com/bumptech/glide/load/f$e.a:Lcom/bumptech/glide/load/data/m;
                //    57: invokevirtual   com/bumptech/glide/load/data/m.d:()Landroid/os/ParcelFileDescriptor;
                //    60: pop            
                //    61: iload           5
                //    63: ireturn        
                //    64: astore_1       
                //    65: aload_3        
                //    66: astore_2       
                //    67: goto            71
                //    70: astore_1       
                //    71: aload_2        
                //    72: ifnull          79
                //    75: aload_2        
                //    76: invokevirtual   java/io/InputStream.close:()V
                //    79: aload_0        
                //    80: getfield        com/bumptech/glide/load/f$e.a:Lcom/bumptech/glide/load/data/m;
                //    83: invokevirtual   com/bumptech/glide/load/data/m.d:()Landroid/os/ParcelFileDescriptor;
                //    86: pop            
                //    87: aload_1        
                //    88: athrow         
                //    89: astore_1       
                //    90: goto            53
                //    93: astore_2       
                //    94: goto            79
                //    Exceptions:
                //  throws java.io.IOException
                //    Exceptions:
                //  Try           Handler
                //  Start  End    Start  End    Type                 
                //  -----  -----  -----  -----  ---------------------
                //  2      36     70     71     Any
                //  36     49     64     70     Any
                //  49     53     89     93     Ljava/io/IOException;
                //  75     79     93     97     Ljava/io/IOException;
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
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformCall(AstMethodBodyBuilder.java:1164)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:1009)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:554)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:554)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:392)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:333)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:294)
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
        });
    }
    
    public static int b(@j0 final List<ImageHeaderParser> list, @k0 final InputStream inputStream, @j0 final b b) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        InputStream inputStream2 = inputStream;
        if (!inputStream.markSupported()) {
            inputStream2 = new b0(inputStream, b);
        }
        inputStream2.mark(5242880);
        return c(list, (f)new f() {
            @Override
            public int a(final ImageHeaderParser imageHeaderParser) throws IOException {
                try {
                    return imageHeaderParser.d(inputStream2, b);
                }
                finally {
                    inputStream2.reset();
                }
            }
        });
    }
    
    private static int c(@j0 final List<ImageHeaderParser> list, final f f) throws IOException {
        for (int size = list.size(), i = 0; i < size; ++i) {
            final int a = f.a(list.get(i));
            if (a != -1) {
                return a;
            }
        }
        return -1;
    }
    
    @j0
    @p0(21)
    public static ImageHeaderParser.ImageType d(@j0 final List<ImageHeaderParser> list, @j0 final m m, @j0 final b b) throws IOException {
        return g(list, (g)new g() {
            @Override
            public ImageHeaderParser.ImageType a(final ImageHeaderParser p0) throws IOException {
                // 
                // This method could not be decompiled.
                // 
                // Original Bytecode:
                // 
                //     1: astore_2       
                //     2: new             Lcom/bumptech/glide/load/resource/bitmap/b0;
                //     5: astore_3       
                //     6: new             Ljava/io/FileInputStream;
                //     9: astore          4
                //    11: aload           4
                //    13: aload_0        
                //    14: getfield        com/bumptech/glide/load/f$c.a:Lcom/bumptech/glide/load/data/m;
                //    17: invokevirtual   com/bumptech/glide/load/data/m.d:()Landroid/os/ParcelFileDescriptor;
                //    20: invokevirtual   android/os/ParcelFileDescriptor.getFileDescriptor:()Ljava/io/FileDescriptor;
                //    23: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/FileDescriptor;)V
                //    26: aload_3        
                //    27: aload           4
                //    29: aload_0        
                //    30: getfield        com/bumptech/glide/load/f$c.b:Lcom/bumptech/glide/load/engine/bitmap_recycle/b;
                //    33: invokespecial   com/bumptech/glide/load/resource/bitmap/b0.<init>:(Ljava/io/InputStream;Lcom/bumptech/glide/load/engine/bitmap_recycle/b;)V
                //    36: aload_1        
                //    37: aload_3        
                //    38: invokeinterface com/bumptech/glide/load/ImageHeaderParser.c:(Ljava/io/InputStream;)Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;
                //    43: astore_1       
                //    44: aload_3        
                //    45: invokevirtual   java/io/InputStream.close:()V
                //    48: aload_0        
                //    49: getfield        com/bumptech/glide/load/f$c.a:Lcom/bumptech/glide/load/data/m;
                //    52: invokevirtual   com/bumptech/glide/load/data/m.d:()Landroid/os/ParcelFileDescriptor;
                //    55: pop            
                //    56: aload_1        
                //    57: areturn        
                //    58: astore_1       
                //    59: aload_3        
                //    60: astore_2       
                //    61: goto            65
                //    64: astore_1       
                //    65: aload_2        
                //    66: ifnull          73
                //    69: aload_2        
                //    70: invokevirtual   java/io/InputStream.close:()V
                //    73: aload_0        
                //    74: getfield        com/bumptech/glide/load/f$c.a:Lcom/bumptech/glide/load/data/m;
                //    77: invokevirtual   com/bumptech/glide/load/data/m.d:()Landroid/os/ParcelFileDescriptor;
                //    80: pop            
                //    81: aload_1        
                //    82: athrow         
                //    83: astore_2       
                //    84: goto            48
                //    87: astore_2       
                //    88: goto            73
                //    Exceptions:
                //  throws java.io.IOException
                //    Exceptions:
                //  Try           Handler
                //  Start  End    Start  End    Type                 
                //  -----  -----  -----  -----  ---------------------
                //  2      36     64     65     Any
                //  36     44     58     64     Any
                //  44     48     83     87     Ljava/io/IOException;
                //  69     73     87     91     Ljava/io/IOException;
                // 
                // The error that occurred was:
                // 
                // java.lang.IllegalStateException: Expression is linked from several locations: Label_0048:
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
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformCall(AstMethodBodyBuilder.java:1164)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:1009)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:554)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:554)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:392)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:333)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:294)
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
        });
    }
    
    @j0
    public static ImageHeaderParser.ImageType e(@j0 final List<ImageHeaderParser> list, @k0 final InputStream inputStream, @j0 final b b) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        InputStream inputStream2 = inputStream;
        if (!inputStream.markSupported()) {
            inputStream2 = new b0(inputStream, b);
        }
        inputStream2.mark(5242880);
        return g(list, (g)new g() {
            @Override
            public ImageHeaderParser.ImageType a(final ImageHeaderParser imageHeaderParser) throws IOException {
                try {
                    return imageHeaderParser.c(inputStream2);
                }
                finally {
                    inputStream2.reset();
                }
            }
        });
    }
    
    @j0
    public static ImageHeaderParser.ImageType f(@j0 final List<ImageHeaderParser> list, @k0 final ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        return g(list, (g)new g() {
            @Override
            public ImageHeaderParser.ImageType a(final ImageHeaderParser imageHeaderParser) throws IOException {
                return imageHeaderParser.a(byteBuffer);
            }
        });
    }
    
    @j0
    private static ImageHeaderParser.ImageType g(@j0 final List<ImageHeaderParser> list, final g g) throws IOException {
        for (int size = list.size(), i = 0; i < size; ++i) {
            final ImageHeaderParser.ImageType a = g.a(list.get(i));
            if (a != ImageHeaderParser.ImageType.UNKNOWN) {
                return a;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
    
    private interface f
    {
        int a(final ImageHeaderParser p0) throws IOException;
    }
    
    private interface g
    {
        ImageHeaderParser.ImageType a(final ImageHeaderParser p0) throws IOException;
    }
}
