// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.x;
import java.util.Map;
import java.net.URL;
import androidx.annotation.c1;

@c1
final class s3 implements Runnable
{
    private final URL G;
    private final byte[] H;
    private final p3 I;
    private final String J;
    private final Map<String, String> K;
    final /* synthetic */ t3 L;
    
    public s3(final t3 l, final String j, final URL g, final byte[] h, final Map<String, String> k, final p3 i) {
        this.L = l;
        x.g(j);
        x.k(g);
        x.k(i);
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
        //     1: getfield        com/google/android/gms/measurement/internal/s3.L:Lcom/google/android/gms/measurement/internal/t3;
        //     4: invokevirtual   com/google/android/gms/measurement/internal/t5.d:()V
        //     7: aconst_null    
        //     8: astore_1       
        //     9: aconst_null    
        //    10: astore_2       
        //    11: aconst_null    
        //    12: astore_3       
        //    13: aconst_null    
        //    14: astore          4
        //    16: aload_0        
        //    17: getfield        com/google/android/gms/measurement/internal/s3.L:Lcom/google/android/gms/measurement/internal/t3;
        //    20: aload_0        
        //    21: getfield        com/google/android/gms/measurement/internal/s3.G:Ljava/net/URL;
        //    24: invokevirtual   com/google/android/gms/measurement/internal/t3.j:(Ljava/net/URL;)Ljava/net/HttpURLConnection;
        //    27: astore          5
        //    29: aload_0        
        //    30: getfield        com/google/android/gms/measurement/internal/s3.K:Ljava/util/Map;
        //    33: astore          6
        //    35: aload           6
        //    37: ifnull          104
        //    40: aload           6
        //    42: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
        //    47: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //    52: astore          7
        //    54: aload           7
        //    56: invokeinterface java/util/Iterator.hasNext:()Z
        //    61: ifeq            104
        //    64: aload           7
        //    66: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    71: checkcast       Ljava/util/Map$Entry;
        //    74: astore          6
        //    76: aload           5
        //    78: aload           6
        //    80: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //    85: checkcast       Ljava/lang/String;
        //    88: aload           6
        //    90: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //    95: checkcast       Ljava/lang/String;
        //    98: invokevirtual   java/net/HttpURLConnection.addRequestProperty:(Ljava/lang/String;Ljava/lang/String;)V
        //   101: goto            54
        //   104: aload_0        
        //   105: getfield        com/google/android/gms/measurement/internal/s3.H:[B
        //   108: ifnull          227
        //   111: aload_0        
        //   112: getfield        com/google/android/gms/measurement/internal/s3.L:Lcom/google/android/gms/measurement/internal/t3;
        //   115: getfield        com/google/android/gms/measurement/internal/o9.b:Lcom/google/android/gms/measurement/internal/z9;
        //   118: invokevirtual   com/google/android/gms/measurement/internal/z9.f0:()Lcom/google/android/gms/measurement/internal/ba;
        //   121: aload_0        
        //   122: getfield        com/google/android/gms/measurement/internal/s3.H:[B
        //   125: invokevirtual   com/google/android/gms/measurement/internal/ba.P:([B)[B
        //   128: astore          7
        //   130: aload_0        
        //   131: getfield        com/google/android/gms/measurement/internal/s3.L:Lcom/google/android/gms/measurement/internal/t3;
        //   134: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //   137: invokevirtual   com/google/android/gms/measurement/internal/z4.c:()Lcom/google/android/gms/measurement/internal/n3;
        //   140: invokevirtual   com/google/android/gms/measurement/internal/n3.s:()Lcom/google/android/gms/measurement/internal/l3;
        //   143: astore          6
        //   145: aload           7
        //   147: arraylength    
        //   148: istore          8
        //   150: aload           6
        //   152: ldc             "Uploading data. size"
        //   154: iload           8
        //   156: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   159: invokevirtual   com/google/android/gms/measurement/internal/l3.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //   162: aload           5
        //   164: iconst_1       
        //   165: invokevirtual   java/net/HttpURLConnection.setDoOutput:(Z)V
        //   168: aload           5
        //   170: ldc             "Content-Encoding"
        //   172: ldc             "gzip"
        //   174: invokevirtual   java/net/HttpURLConnection.addRequestProperty:(Ljava/lang/String;Ljava/lang/String;)V
        //   177: aload           5
        //   179: iload           8
        //   181: invokevirtual   java/net/HttpURLConnection.setFixedLengthStreamingMode:(I)V
        //   184: aload           5
        //   186: invokevirtual   java/net/HttpURLConnection.connect:()V
        //   189: aload           5
        //   191: invokevirtual   java/net/HttpURLConnection.getOutputStream:()Ljava/io/OutputStream;
        //   194: astore          6
        //   196: aload           6
        //   198: aload           7
        //   200: invokevirtual   java/io/OutputStream.write:([B)V
        //   203: aload           6
        //   205: invokevirtual   java/io/OutputStream.close:()V
        //   208: goto            227
        //   211: astore_2       
        //   212: aload           5
        //   214: astore          7
        //   216: aload_2        
        //   217: astore          5
        //   219: goto            449
        //   222: astore          7
        //   224: goto            556
        //   227: aload           5
        //   229: invokevirtual   java/net/HttpURLConnection.getResponseCode:()I
        //   232: istore          8
        //   234: aload           5
        //   236: invokevirtual   java/net/HttpURLConnection.getHeaderFields:()Ljava/util/Map;
        //   239: astore          6
        //   241: new             Ljava/io/ByteArrayOutputStream;
        //   244: astore          7
        //   246: aload           7
        //   248: invokespecial   java/io/ByteArrayOutputStream.<init>:()V
        //   251: aload           5
        //   253: invokevirtual   java/net/HttpURLConnection.getInputStream:()Ljava/io/InputStream;
        //   256: astore_2       
        //   257: sipush          1024
        //   260: newarray        B
        //   262: astore          4
        //   264: aload_2        
        //   265: aload           4
        //   267: invokevirtual   java/io/InputStream.read:([B)I
        //   270: istore          9
        //   272: iload           9
        //   274: ifle            290
        //   277: aload           7
        //   279: aload           4
        //   281: iconst_0       
        //   282: iload           9
        //   284: invokevirtual   java/io/ByteArrayOutputStream.write:([BII)V
        //   287: goto            264
        //   290: aload           7
        //   292: invokevirtual   java/io/ByteArrayOutputStream.toByteArray:()[B
        //   295: astore          7
        //   297: aload_2        
        //   298: invokevirtual   java/io/InputStream.close:()V
        //   301: aload           5
        //   303: invokevirtual   java/net/HttpURLConnection.disconnect:()V
        //   306: aload_0        
        //   307: getfield        com/google/android/gms/measurement/internal/s3.L:Lcom/google/android/gms/measurement/internal/t3;
        //   310: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //   313: invokevirtual   com/google/android/gms/measurement/internal/z4.b:()Lcom/google/android/gms/measurement/internal/w4;
        //   316: astore          5
        //   318: new             Lcom/google/android/gms/measurement/internal/r3;
        //   321: dup            
        //   322: aload_0        
        //   323: getfield        com/google/android/gms/measurement/internal/s3.J:Ljava/lang/String;
        //   326: aload_0        
        //   327: getfield        com/google/android/gms/measurement/internal/s3.I:Lcom/google/android/gms/measurement/internal/p3;
        //   330: iload           8
        //   332: aconst_null    
        //   333: aload           7
        //   335: aload           6
        //   337: aconst_null    
        //   338: invokespecial   com/google/android/gms/measurement/internal/r3.<init>:(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/p3;ILjava/lang/Throwable;[BLjava/util/Map;Lcom/google/android/gms/measurement/internal/q3;)V
        //   341: astore          6
        //   343: aload           5
        //   345: aload           6
        //   347: invokevirtual   com/google/android/gms/measurement/internal/w4.w:(Ljava/lang/Runnable;)V
        //   350: return         
        //   351: astore          7
        //   353: goto            360
        //   356: astore          7
        //   358: aconst_null    
        //   359: astore_2       
        //   360: aload_2        
        //   361: ifnull          368
        //   364: aload_2        
        //   365: invokevirtual   java/io/InputStream.close:()V
        //   368: aload           7
        //   370: athrow         
        //   371: astore_2       
        //   372: aload_1        
        //   373: astore_3       
        //   374: aload           5
        //   376: astore          7
        //   378: aload_2        
        //   379: astore          5
        //   381: aload           6
        //   383: astore_2       
        //   384: goto            457
        //   387: astore          7
        //   389: goto            414
        //   392: astore          6
        //   394: aconst_null    
        //   395: astore_2       
        //   396: aload_1        
        //   397: astore_3       
        //   398: aload           5
        //   400: astore          7
        //   402: aload           6
        //   404: astore          5
        //   406: goto            457
        //   409: astore          7
        //   411: aconst_null    
        //   412: astore          6
        //   414: aload           6
        //   416: astore_2       
        //   417: goto            564
        //   420: astore_2       
        //   421: aload           4
        //   423: astore          6
        //   425: aload           5
        //   427: astore          7
        //   429: aload_2        
        //   430: astore          5
        //   432: goto            449
        //   435: astore          6
        //   437: goto            549
        //   440: astore          5
        //   442: aconst_null    
        //   443: astore          7
        //   445: aload           4
        //   447: astore          6
        //   449: aconst_null    
        //   450: astore_2       
        //   451: iconst_0       
        //   452: istore          8
        //   454: aload           6
        //   456: astore_3       
        //   457: aload_3        
        //   458: ifnull          497
        //   461: aload_3        
        //   462: invokevirtual   java/io/OutputStream.close:()V
        //   465: goto            497
        //   468: astore          6
        //   470: aload_0        
        //   471: getfield        com/google/android/gms/measurement/internal/s3.L:Lcom/google/android/gms/measurement/internal/t3;
        //   474: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //   477: invokevirtual   com/google/android/gms/measurement/internal/z4.c:()Lcom/google/android/gms/measurement/internal/n3;
        //   480: invokevirtual   com/google/android/gms/measurement/internal/n3.o:()Lcom/google/android/gms/measurement/internal/l3;
        //   483: ldc             "Error closing HTTP compressed POST connection output stream. appId"
        //   485: aload_0        
        //   486: getfield        com/google/android/gms/measurement/internal/s3.J:Ljava/lang/String;
        //   489: invokestatic    com/google/android/gms/measurement/internal/n3.w:(Ljava/lang/String;)Ljava/lang/Object;
        //   492: aload           6
        //   494: invokevirtual   com/google/android/gms/measurement/internal/l3.c:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
        //   497: aload           7
        //   499: ifnull          507
        //   502: aload           7
        //   504: invokevirtual   java/net/HttpURLConnection.disconnect:()V
        //   507: aload_0        
        //   508: getfield        com/google/android/gms/measurement/internal/s3.L:Lcom/google/android/gms/measurement/internal/t3;
        //   511: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //   514: invokevirtual   com/google/android/gms/measurement/internal/z4.b:()Lcom/google/android/gms/measurement/internal/w4;
        //   517: new             Lcom/google/android/gms/measurement/internal/r3;
        //   520: dup            
        //   521: aload_0        
        //   522: getfield        com/google/android/gms/measurement/internal/s3.J:Ljava/lang/String;
        //   525: aload_0        
        //   526: getfield        com/google/android/gms/measurement/internal/s3.I:Lcom/google/android/gms/measurement/internal/p3;
        //   529: iload           8
        //   531: aconst_null    
        //   532: aconst_null    
        //   533: aload_2        
        //   534: aconst_null    
        //   535: invokespecial   com/google/android/gms/measurement/internal/r3.<init>:(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/p3;ILjava/lang/Throwable;[BLjava/util/Map;Lcom/google/android/gms/measurement/internal/q3;)V
        //   538: invokevirtual   com/google/android/gms/measurement/internal/w4.w:(Ljava/lang/Runnable;)V
        //   541: aload           5
        //   543: athrow         
        //   544: astore          6
        //   546: aconst_null    
        //   547: astore          5
        //   549: aload           6
        //   551: astore          7
        //   553: aload_2        
        //   554: astore          6
        //   556: aconst_null    
        //   557: astore_2       
        //   558: iconst_0       
        //   559: istore          8
        //   561: aload           6
        //   563: astore_3       
        //   564: aload_3        
        //   565: ifnull          604
        //   568: aload_3        
        //   569: invokevirtual   java/io/OutputStream.close:()V
        //   572: goto            604
        //   575: astore          6
        //   577: aload_0        
        //   578: getfield        com/google/android/gms/measurement/internal/s3.L:Lcom/google/android/gms/measurement/internal/t3;
        //   581: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //   584: invokevirtual   com/google/android/gms/measurement/internal/z4.c:()Lcom/google/android/gms/measurement/internal/n3;
        //   587: invokevirtual   com/google/android/gms/measurement/internal/n3.o:()Lcom/google/android/gms/measurement/internal/l3;
        //   590: ldc             "Error closing HTTP compressed POST connection output stream. appId"
        //   592: aload_0        
        //   593: getfield        com/google/android/gms/measurement/internal/s3.J:Ljava/lang/String;
        //   596: invokestatic    com/google/android/gms/measurement/internal/n3.w:(Ljava/lang/String;)Ljava/lang/Object;
        //   599: aload           6
        //   601: invokevirtual   com/google/android/gms/measurement/internal/l3.c:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
        //   604: aload           5
        //   606: ifnull          614
        //   609: aload           5
        //   611: invokevirtual   java/net/HttpURLConnection.disconnect:()V
        //   614: aload_0        
        //   615: getfield        com/google/android/gms/measurement/internal/s3.L:Lcom/google/android/gms/measurement/internal/t3;
        //   618: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //   621: invokevirtual   com/google/android/gms/measurement/internal/z4.b:()Lcom/google/android/gms/measurement/internal/w4;
        //   624: astore          5
        //   626: new             Lcom/google/android/gms/measurement/internal/r3;
        //   629: dup            
        //   630: aload_0        
        //   631: getfield        com/google/android/gms/measurement/internal/s3.J:Ljava/lang/String;
        //   634: aload_0        
        //   635: getfield        com/google/android/gms/measurement/internal/s3.I:Lcom/google/android/gms/measurement/internal/p3;
        //   638: iload           8
        //   640: aload           7
        //   642: aconst_null    
        //   643: aload_2        
        //   644: aconst_null    
        //   645: invokespecial   com/google/android/gms/measurement/internal/r3.<init>:(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/p3;ILjava/lang/Throwable;[BLjava/util/Map;Lcom/google/android/gms/measurement/internal/q3;)V
        //   648: astore          6
        //   650: goto            343
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  16     29     544    549    Ljava/io/IOException;
        //  16     29     440    449    Any
        //  29     35     435    440    Ljava/io/IOException;
        //  29     35     420    435    Any
        //  40     54     435    440    Ljava/io/IOException;
        //  40     54     420    435    Any
        //  54     101    435    440    Ljava/io/IOException;
        //  54     101    420    435    Any
        //  104    196    435    440    Ljava/io/IOException;
        //  104    196    420    435    Any
        //  196    208    222    227    Ljava/io/IOException;
        //  196    208    211    222    Any
        //  227    234    435    440    Ljava/io/IOException;
        //  227    234    420    435    Any
        //  234    241    409    414    Ljava/io/IOException;
        //  234    241    392    409    Any
        //  241    257    356    360    Any
        //  257    264    351    356    Any
        //  264    272    351    356    Any
        //  277    287    351    356    Any
        //  290    297    351    356    Any
        //  297    301    387    392    Ljava/io/IOException;
        //  297    301    371    387    Any
        //  364    368    387    392    Ljava/io/IOException;
        //  364    368    371    387    Any
        //  368    371    387    392    Ljava/io/IOException;
        //  368    371    371    387    Any
        //  461    465    468    497    Ljava/io/IOException;
        //  568    572    575    604    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0343:
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
