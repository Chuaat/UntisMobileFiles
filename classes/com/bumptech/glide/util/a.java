// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.util;

import java.io.OutputStream;
import androidx.annotation.k0;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import androidx.annotation.j0;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;

public final class a
{
    private static final int a = 16384;
    private static final AtomicReference<byte[]> b;
    
    static {
        b = new AtomicReference<byte[]>();
    }
    
    private a() {
    }
    
    @j0
    public static ByteBuffer a(@j0 final File p0) throws IOException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore_1       
        //     2: aconst_null    
        //     3: astore_2       
        //     4: aload_0        
        //     5: invokevirtual   java/io/File.length:()J
        //     8: lstore_3       
        //     9: lload_3        
        //    10: ldc2_w          2147483647
        //    13: lcmp           
        //    14: ifgt            90
        //    17: lload_3        
        //    18: lconst_0       
        //    19: lcmp           
        //    20: ifeq            78
        //    23: new             Ljava/io/RandomAccessFile;
        //    26: astore          5
        //    28: aload           5
        //    30: aload_0        
        //    31: ldc             "r"
        //    33: invokespecial   java/io/RandomAccessFile.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    36: aload_2        
        //    37: astore_0       
        //    38: aload           5
        //    40: invokevirtual   java/io/RandomAccessFile.getChannel:()Ljava/nio/channels/FileChannel;
        //    43: astore_1       
        //    44: aload_1        
        //    45: astore_0       
        //    46: aload_1        
        //    47: getstatic       java/nio/channels/FileChannel$MapMode.READ_ONLY:Ljava/nio/channels/FileChannel$MapMode;
        //    50: lconst_0       
        //    51: lload_3        
        //    52: invokevirtual   java/nio/channels/FileChannel.map:(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;
        //    55: invokevirtual   java/nio/MappedByteBuffer.load:()Ljava/nio/MappedByteBuffer;
        //    58: astore_2       
        //    59: aload_1        
        //    60: invokevirtual   java/nio/channels/FileChannel.close:()V
        //    63: aload           5
        //    65: invokevirtual   java/io/RandomAccessFile.close:()V
        //    68: aload_2        
        //    69: areturn        
        //    70: astore_2       
        //    71: aload_0        
        //    72: astore_1       
        //    73: aload_2        
        //    74: astore_0       
        //    75: goto            106
        //    78: new             Ljava/io/IOException;
        //    81: astore_0       
        //    82: aload_0        
        //    83: ldc             "File unsuitable for memory mapping"
        //    85: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //    88: aload_0        
        //    89: athrow         
        //    90: new             Ljava/io/IOException;
        //    93: astore_0       
        //    94: aload_0        
        //    95: ldc             "File too large to map into memory"
        //    97: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   100: aload_0        
        //   101: athrow         
        //   102: astore_0       
        //   103: aconst_null    
        //   104: astore          5
        //   106: aload_1        
        //   107: ifnull          118
        //   110: aload_1        
        //   111: invokevirtual   java/nio/channels/FileChannel.close:()V
        //   114: goto            118
        //   117: astore_1       
        //   118: aload           5
        //   120: ifnull          128
        //   123: aload           5
        //   125: invokevirtual   java/io/RandomAccessFile.close:()V
        //   128: aload_0        
        //   129: athrow         
        //   130: astore_0       
        //   131: goto            63
        //   134: astore_0       
        //   135: goto            68
        //   138: astore          5
        //   140: goto            128
        //    Exceptions:
        //  throws java.io.IOException
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  4      9      102    106    Any
        //  23     36     102    106    Any
        //  38     44     70     78     Any
        //  46     59     70     78     Any
        //  59     63     130    134    Ljava/io/IOException;
        //  63     68     134    138    Ljava/io/IOException;
        //  78     90     102    106    Any
        //  90     102    102    106    Any
        //  110    114    117    118    Ljava/io/IOException;
        //  123    128    138    143    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 82 out of bounds for length 82
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
    
    @j0
    public static ByteBuffer b(@j0 final InputStream inputStream) throws IOException {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        byte[] newValue;
        if ((newValue = com.bumptech.glide.util.a.b.getAndSet(null)) == null) {
            newValue = new byte[16384];
        }
        while (true) {
            final int read = inputStream.read(newValue);
            if (read < 0) {
                break;
            }
            byteArrayOutputStream.write(newValue, 0, read);
        }
        com.bumptech.glide.util.a.b.set(newValue);
        final byte[] byteArray = byteArrayOutputStream.toByteArray();
        return (ByteBuffer)ByteBuffer.allocateDirect(byteArray.length).put(byteArray).position(0);
    }
    
    @k0
    private static b c(@j0 final ByteBuffer byteBuffer) {
        if (!byteBuffer.isReadOnly() && byteBuffer.hasArray()) {
            return new b(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
        }
        return null;
    }
    
    @j0
    public static byte[] d(@j0 final ByteBuffer byteBuffer) {
        final b c = c(byteBuffer);
        byte[] array;
        if (c != null && c.a == 0 && c.b == c.c.length) {
            array = byteBuffer.array();
        }
        else {
            final ByteBuffer readOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            array = new byte[readOnlyBuffer.limit()];
            readOnlyBuffer.position(0);
            readOnlyBuffer.get(array);
        }
        return array;
    }
    
    public static void e(@j0 final ByteBuffer p0, @j0 final File p1) throws IOException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: iconst_0       
        //     2: invokevirtual   java/nio/ByteBuffer.position:(I)Ljava/nio/Buffer;
        //     5: pop            
        //     6: aconst_null    
        //     7: astore_2       
        //     8: aconst_null    
        //     9: astore_3       
        //    10: new             Ljava/io/RandomAccessFile;
        //    13: astore          4
        //    15: aload           4
        //    17: aload_1        
        //    18: ldc             "rw"
        //    20: invokespecial   java/io/RandomAccessFile.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    23: aload_3        
        //    24: astore_1       
        //    25: aload           4
        //    27: invokevirtual   java/io/RandomAccessFile.getChannel:()Ljava/nio/channels/FileChannel;
        //    30: astore_2       
        //    31: aload_2        
        //    32: astore_1       
        //    33: aload_2        
        //    34: aload_0        
        //    35: invokevirtual   java/nio/channels/FileChannel.write:(Ljava/nio/ByteBuffer;)I
        //    38: pop            
        //    39: aload_2        
        //    40: astore_1       
        //    41: aload_2        
        //    42: iconst_0       
        //    43: invokevirtual   java/nio/channels/FileChannel.force:(Z)V
        //    46: aload_2        
        //    47: astore_1       
        //    48: aload_2        
        //    49: invokevirtual   java/nio/channels/FileChannel.close:()V
        //    52: aload_2        
        //    53: astore_1       
        //    54: aload           4
        //    56: invokevirtual   java/io/RandomAccessFile.close:()V
        //    59: aload_2        
        //    60: invokevirtual   java/nio/channels/FileChannel.close:()V
        //    63: aload           4
        //    65: invokevirtual   java/io/RandomAccessFile.close:()V
        //    68: return         
        //    69: astore_0       
        //    70: aload_1        
        //    71: astore_2       
        //    72: aload           4
        //    74: astore_1       
        //    75: goto            81
        //    78: astore_0       
        //    79: aconst_null    
        //    80: astore_1       
        //    81: aload_2        
        //    82: ifnull          93
        //    85: aload_2        
        //    86: invokevirtual   java/nio/channels/FileChannel.close:()V
        //    89: goto            93
        //    92: astore_2       
        //    93: aload_1        
        //    94: ifnull          101
        //    97: aload_1        
        //    98: invokevirtual   java/io/RandomAccessFile.close:()V
        //   101: aload_0        
        //   102: athrow         
        //   103: astore_0       
        //   104: goto            63
        //   107: astore_0       
        //   108: goto            68
        //   111: astore_1       
        //   112: goto            101
        //    Exceptions:
        //  throws java.io.IOException
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  10     23     78     81     Any
        //  25     31     69     78     Any
        //  33     39     69     78     Any
        //  41     46     69     78     Any
        //  48     52     69     78     Any
        //  54     59     69     78     Any
        //  59     63     103    107    Ljava/io/IOException;
        //  63     68     107    111    Ljava/io/IOException;
        //  85     89     92     93     Ljava/io/IOException;
        //  97     101    111    115    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 70 out of bounds for length 70
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
    
    @j0
    public static InputStream f(@j0 final ByteBuffer byteBuffer) {
        return new a(byteBuffer);
    }
    
    public static void g(@j0 final ByteBuffer byteBuffer, @j0 final OutputStream outputStream) throws IOException {
        final b c = c(byteBuffer);
        if (c != null) {
            final byte[] c2 = c.c;
            final int a = c.a;
            outputStream.write(c2, a, c.b + a);
        }
        else {
            byte[] newValue;
            if ((newValue = com.bumptech.glide.util.a.b.getAndSet(null)) == null) {
                newValue = new byte[16384];
            }
            while (byteBuffer.remaining() > 0) {
                final int min = Math.min(byteBuffer.remaining(), newValue.length);
                byteBuffer.get(newValue, 0, min);
                outputStream.write(newValue, 0, min);
            }
            com.bumptech.glide.util.a.b.set(newValue);
        }
    }
    
    private static class a extends InputStream
    {
        private static final int I = -1;
        @j0
        private final ByteBuffer G;
        private int H;
        
        a(@j0 final ByteBuffer g) {
            this.H = -1;
            this.G = g;
        }
        
        @Override
        public int available() {
            return this.G.remaining();
        }
        
        @Override
        public void mark(final int n) {
            synchronized (this) {
                this.H = this.G.position();
            }
        }
        
        @Override
        public boolean markSupported() {
            return true;
        }
        
        @Override
        public int read() {
            if (!this.G.hasRemaining()) {
                return -1;
            }
            return this.G.get() & 0xFF;
        }
        
        @Override
        public int read(@j0 final byte[] dst, final int offset, int min) throws IOException {
            if (!this.G.hasRemaining()) {
                return -1;
            }
            min = Math.min(min, this.available());
            this.G.get(dst, offset, min);
            return min;
        }
        
        @Override
        public void reset() throws IOException {
            synchronized (this) {
                final int h = this.H;
                if (h != -1) {
                    this.G.position(h);
                    return;
                }
                throw new IOException("Cannot reset to unset mark position");
            }
        }
        
        @Override
        public long skip(long min) throws IOException {
            if (!this.G.hasRemaining()) {
                return -1L;
            }
            min = Math.min(min, this.available());
            final ByteBuffer g = this.G;
            g.position((int)(g.position() + min));
            return min;
        }
    }
    
    static final class b
    {
        final int a;
        final int b;
        final byte[] c;
        
        b(@j0 final byte[] c, final int a, final int b) {
            this.c = c;
            this.a = a;
            this.b = b;
        }
    }
}
