// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.model;

import androidx.work.c0;
import androidx.work.r;
import androidx.work.d;
import androidx.room.f3;
import androidx.work.a;

public class x
{
    private x() {
    }
    
    @f3
    public static int a(final a obj) {
        final int n = x$a.b[obj.ordinal()];
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Could not convert ");
        sb.append(obj);
        sb.append(" to int");
        throw new IllegalArgumentException(sb.toString());
    }
    
    @f3
    public static androidx.work.d b(final byte[] p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: invokespecial   androidx/work/d.<init>:()V
        //     7: astore_1       
        //     8: aload_0        
        //     9: ifnonnull       14
        //    12: aload_1        
        //    13: areturn        
        //    14: new             Ljava/io/ByteArrayInputStream;
        //    17: dup            
        //    18: aload_0        
        //    19: invokespecial   java/io/ByteArrayInputStream.<init>:([B)V
        //    22: astore_2       
        //    23: new             Ljava/io/ObjectInputStream;
        //    26: astore_3       
        //    27: aload_3        
        //    28: aload_2        
        //    29: invokespecial   java/io/ObjectInputStream.<init>:(Ljava/io/InputStream;)V
        //    32: aload_3        
        //    33: astore_0       
        //    34: aload_3        
        //    35: invokevirtual   java/io/ObjectInputStream.readInt:()I
        //    38: istore          4
        //    40: iload           4
        //    42: ifle            68
        //    45: aload_3        
        //    46: astore_0       
        //    47: aload_1        
        //    48: aload_3        
        //    49: invokevirtual   java/io/ObjectInputStream.readUTF:()Ljava/lang/String;
        //    52: invokestatic    android/net/Uri.parse:(Ljava/lang/String;)Landroid/net/Uri;
        //    55: aload_3        
        //    56: invokevirtual   java/io/ObjectInputStream.readBoolean:()Z
        //    59: invokevirtual   androidx/work/d.a:(Landroid/net/Uri;Z)V
        //    62: iinc            4, -1
        //    65: goto            40
        //    68: aload_3        
        //    69: invokevirtual   java/io/ObjectInputStream.close:()V
        //    72: goto            80
        //    75: astore_0       
        //    76: aload_0        
        //    77: invokevirtual   java/io/IOException.printStackTrace:()V
        //    80: aload_2        
        //    81: invokevirtual   java/io/ByteArrayInputStream.close:()V
        //    84: goto            137
        //    87: astore          5
        //    89: goto            102
        //    92: astore_3       
        //    93: aconst_null    
        //    94: astore_0       
        //    95: goto            140
        //    98: astore          5
        //   100: aconst_null    
        //   101: astore_3       
        //   102: aload_3        
        //   103: astore_0       
        //   104: aload           5
        //   106: invokevirtual   java/io/IOException.printStackTrace:()V
        //   109: aload_3        
        //   110: ifnull          125
        //   113: aload_3        
        //   114: invokevirtual   java/io/ObjectInputStream.close:()V
        //   117: goto            125
        //   120: astore_0       
        //   121: aload_0        
        //   122: invokevirtual   java/io/IOException.printStackTrace:()V
        //   125: aload_2        
        //   126: invokevirtual   java/io/ByteArrayInputStream.close:()V
        //   129: goto            137
        //   132: astore_0       
        //   133: aload_0        
        //   134: invokevirtual   java/io/IOException.printStackTrace:()V
        //   137: aload_1        
        //   138: areturn        
        //   139: astore_3       
        //   140: aload_0        
        //   141: ifnull          156
        //   144: aload_0        
        //   145: invokevirtual   java/io/ObjectInputStream.close:()V
        //   148: goto            156
        //   151: astore_0       
        //   152: aload_0        
        //   153: invokevirtual   java/io/IOException.printStackTrace:()V
        //   156: aload_2        
        //   157: invokevirtual   java/io/ByteArrayInputStream.close:()V
        //   160: goto            168
        //   163: astore_0       
        //   164: aload_0        
        //   165: invokevirtual   java/io/IOException.printStackTrace:()V
        //   168: aload_3        
        //   169: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  23     32     98     102    Ljava/io/IOException;
        //  23     32     92     98     Any
        //  34     40     87     92     Ljava/io/IOException;
        //  34     40     139    140    Any
        //  47     62     87     92     Ljava/io/IOException;
        //  47     62     139    140    Any
        //  68     72     75     80     Ljava/io/IOException;
        //  80     84     132    137    Ljava/io/IOException;
        //  104    109    139    140    Any
        //  113    117    120    125    Ljava/io/IOException;
        //  125    129    132    137    Ljava/io/IOException;
        //  144    148    151    156    Ljava/io/IOException;
        //  156    160    163    168    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0040:
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
    
    @f3
    public static byte[] c(final androidx.work.d p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   androidx/work/d.c:()I
        //     4: istore_1       
        //     5: aconst_null    
        //     6: astore_2       
        //     7: aconst_null    
        //     8: astore_3       
        //     9: iload_1        
        //    10: ifne            15
        //    13: aconst_null    
        //    14: areturn        
        //    15: new             Ljava/io/ByteArrayOutputStream;
        //    18: dup            
        //    19: invokespecial   java/io/ByteArrayOutputStream.<init>:()V
        //    22: astore          4
        //    24: aload_3        
        //    25: astore          5
        //    27: new             Ljava/io/ObjectOutputStream;
        //    30: astore          6
        //    32: aload_3        
        //    33: astore          5
        //    35: aload           6
        //    37: aload           4
        //    39: invokespecial   java/io/ObjectOutputStream.<init>:(Ljava/io/OutputStream;)V
        //    42: aload           6
        //    44: aload_0        
        //    45: invokevirtual   androidx/work/d.c:()I
        //    48: invokevirtual   java/io/ObjectOutputStream.writeInt:(I)V
        //    51: aload_0        
        //    52: invokevirtual   androidx/work/d.b:()Ljava/util/Set;
        //    55: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //    60: astore_0       
        //    61: aload_0        
        //    62: invokeinterface java/util/Iterator.hasNext:()Z
        //    67: ifeq            107
        //    70: aload_0        
        //    71: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    76: checkcast       Landroidx/work/d$a;
        //    79: astore          5
        //    81: aload           6
        //    83: aload           5
        //    85: invokevirtual   androidx/work/d$a.a:()Landroid/net/Uri;
        //    88: invokevirtual   android/net/Uri.toString:()Ljava/lang/String;
        //    91: invokevirtual   java/io/ObjectOutputStream.writeUTF:(Ljava/lang/String;)V
        //    94: aload           6
        //    96: aload           5
        //    98: invokevirtual   androidx/work/d$a.b:()Z
        //   101: invokevirtual   java/io/ObjectOutputStream.writeBoolean:(Z)V
        //   104: goto            61
        //   107: aload           6
        //   109: invokevirtual   java/io/ObjectOutputStream.close:()V
        //   112: goto            120
        //   115: astore_0       
        //   116: aload_0        
        //   117: invokevirtual   java/io/IOException.printStackTrace:()V
        //   120: aload           4
        //   122: invokevirtual   java/io/ByteArrayOutputStream.close:()V
        //   125: goto            193
        //   128: astore_0       
        //   129: aload           6
        //   131: astore          5
        //   133: goto            199
        //   136: astore          5
        //   138: aload           6
        //   140: astore_0       
        //   141: aload           5
        //   143: astore          6
        //   145: goto            156
        //   148: astore_0       
        //   149: goto            199
        //   152: astore          6
        //   154: aload_2        
        //   155: astore_0       
        //   156: aload_0        
        //   157: astore          5
        //   159: aload           6
        //   161: invokevirtual   java/io/IOException.printStackTrace:()V
        //   164: aload_0        
        //   165: ifnull          180
        //   168: aload_0        
        //   169: invokevirtual   java/io/ObjectOutputStream.close:()V
        //   172: goto            180
        //   175: astore_0       
        //   176: aload_0        
        //   177: invokevirtual   java/io/IOException.printStackTrace:()V
        //   180: aload           4
        //   182: invokevirtual   java/io/ByteArrayOutputStream.close:()V
        //   185: goto            193
        //   188: astore_0       
        //   189: aload_0        
        //   190: invokevirtual   java/io/IOException.printStackTrace:()V
        //   193: aload           4
        //   195: invokevirtual   java/io/ByteArrayOutputStream.toByteArray:()[B
        //   198: areturn        
        //   199: aload           5
        //   201: ifnull          219
        //   204: aload           5
        //   206: invokevirtual   java/io/ObjectOutputStream.close:()V
        //   209: goto            219
        //   212: astore          5
        //   214: aload           5
        //   216: invokevirtual   java/io/IOException.printStackTrace:()V
        //   219: aload           4
        //   221: invokevirtual   java/io/ByteArrayOutputStream.close:()V
        //   224: goto            234
        //   227: astore          5
        //   229: aload           5
        //   231: invokevirtual   java/io/IOException.printStackTrace:()V
        //   234: aload_0        
        //   235: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  27     32     152    156    Ljava/io/IOException;
        //  27     32     148    152    Any
        //  35     42     152    156    Ljava/io/IOException;
        //  35     42     148    152    Any
        //  42     61     136    148    Ljava/io/IOException;
        //  42     61     128    136    Any
        //  61     104    136    148    Ljava/io/IOException;
        //  61     104    128    136    Any
        //  107    112    115    120    Ljava/io/IOException;
        //  120    125    188    193    Ljava/io/IOException;
        //  159    164    148    152    Any
        //  168    172    175    180    Ljava/io/IOException;
        //  180    185    188    193    Ljava/io/IOException;
        //  204    209    212    219    Ljava/io/IOException;
        //  219    224    227    234    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0120:
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
    
    @f3
    public static a d(final int i) {
        if (i == 0) {
            return a.G;
        }
        if (i == 1) {
            return a.H;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Could not convert ");
        sb.append(i);
        sb.append(" to BackoffPolicy");
        throw new IllegalArgumentException(sb.toString());
    }
    
    @f3
    public static r e(final int i) {
        if (i == 0) {
            return r.G;
        }
        if (i == 1) {
            return r.H;
        }
        if (i == 2) {
            return r.I;
        }
        if (i == 3) {
            return r.J;
        }
        if (i == 4) {
            return r.K;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Could not convert ");
        sb.append(i);
        sb.append(" to NetworkType");
        throw new IllegalArgumentException(sb.toString());
    }
    
    @f3
    public static c0.a f(final int i) {
        if (i == 0) {
            return c0.a.G;
        }
        if (i == 1) {
            return c0.a.H;
        }
        if (i == 2) {
            return c0.a.I;
        }
        if (i == 3) {
            return c0.a.J;
        }
        if (i == 4) {
            return c0.a.K;
        }
        if (i == 5) {
            return c0.a.L;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Could not convert ");
        sb.append(i);
        sb.append(" to State");
        throw new IllegalArgumentException(sb.toString());
    }
    
    @f3
    public static int g(final r obj) {
        final int n = x$a.c[obj.ordinal()];
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        if (n == 3) {
            return 2;
        }
        if (n == 4) {
            return 3;
        }
        if (n == 5) {
            return 4;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Could not convert ");
        sb.append(obj);
        sb.append(" to int");
        throw new IllegalArgumentException(sb.toString());
    }
    
    @f3
    public static int h(final c0.a obj) {
        switch (x$a.a[obj.ordinal()]) {
            default: {
                final StringBuilder sb = new StringBuilder();
                sb.append("Could not convert ");
                sb.append(obj);
                sb.append(" to int");
                throw new IllegalArgumentException(sb.toString());
            }
            case 6: {
                return 5;
            }
            case 5: {
                return 4;
            }
            case 4: {
                return 3;
            }
            case 3: {
                return 2;
            }
            case 2: {
                return 1;
            }
            case 1: {
                return 0;
            }
        }
    }
    
    public interface b
    {
        public static final int a = 0;
        public static final int b = 1;
    }
    
    public interface c
    {
        public static final int a = 0;
        public static final int b = 1;
        public static final int c = 2;
        public static final int d = 3;
        public static final int e = 4;
    }
    
    public interface d
    {
        public static final int a = 0;
        public static final int b = 1;
        public static final int c = 2;
        public static final int d = 3;
        public static final int e = 4;
        public static final int f = 5;
        public static final String g = "(2, 3, 5)";
    }
}
