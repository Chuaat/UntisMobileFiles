// 
// Decompiled by Procyon v0.5.36
// 

package com.getkeepsafe.relinker;

import android.content.pm.ApplicationInfo;
import android.os.Build$VERSION;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.io.File;
import android.content.Context;
import java.io.OutputStream;
import java.io.InputStream;
import java.io.IOException;
import java.io.Closeable;

public class a implements e.a
{
    private static final int a = 5;
    private static final int b = 4096;
    
    private void b(final Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        }
        catch (IOException ex) {}
    }
    
    private long c(final InputStream inputStream, final OutputStream outputStream) throws IOException {
        final byte[] array = new byte[4096];
        long n = 0L;
        while (true) {
            final int read = inputStream.read(array);
            if (read == -1) {
                break;
            }
            outputStream.write(array, 0, read);
            n += read;
        }
        outputStream.flush();
        return n;
    }
    
    private a d(final Context context, final String[] array, final String str, final f f) {
        final String[] f2 = this.f(context);
        final int length = f2.length;
        int n = 0;
        ZipFile zipFile2 = null;
        ZipEntry entry = null;
    Label_0228_Outer:
        while (true) {
            final ZipFile zipFile = null;
            Label_0234: {
                if (n >= length) {
                    break Label_0234;
                }
                final String pathname = f2[n];
                int n2 = 0;
                while (true) {
                    zipFile2 = zipFile;
                    if (n2 < 5) {
                        try {
                            zipFile2 = new ZipFile(new File(pathname), 1);
                        }
                        catch (IOException ex) {
                            ++n2;
                            continue Label_0228_Outer;
                        }
                        break;
                    }
                    break;
                }
                while (true) {
                    if (zipFile2 == null) {
                        break Label_0228;
                    }
                    for (int i = 0; i < 5; ++i) {
                        for (final String str2 : array) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("lib");
                            sb.append(File.separatorChar);
                            sb.append(str2);
                            sb.append(File.separatorChar);
                            sb.append(str);
                            final String string = sb.toString();
                            f.m("Looking for %s in APK %s...", string, pathname);
                            entry = zipFile2.getEntry(string);
                            if (entry != null) {
                                break Label_0228_Outer;
                            }
                        }
                    }
                    try {
                        zipFile2.close();
                        ++n;
                        continue Label_0228_Outer;
                        return null;
                    }
                    catch (IOException ex2) {
                        continue;
                    }
                    break;
                }
            }
        }
        return new a(zipFile2, entry);
    }
    
    private String[] e(final Context p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: invokespecial   java/lang/StringBuilder.<init>:()V
        //     7: astore_3       
        //     8: aload_3        
        //     9: ldc             "lib"
        //    11: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    14: pop            
        //    15: aload_3        
        //    16: getstatic       java/io/File.separatorChar:C
        //    19: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //    22: pop            
        //    23: aload_3        
        //    24: ldc             "([^\\"
        //    26: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    29: pop            
        //    30: aload_3        
        //    31: getstatic       java/io/File.separatorChar:C
        //    34: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //    37: pop            
        //    38: aload_3        
        //    39: ldc             "]*)"
        //    41: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    44: pop            
        //    45: aload_3        
        //    46: getstatic       java/io/File.separatorChar:C
        //    49: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //    52: pop            
        //    53: aload_3        
        //    54: aload_2        
        //    55: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    58: pop            
        //    59: aload_3        
        //    60: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    63: invokestatic    java/util/regex/Pattern.compile:(Ljava/lang/String;)Ljava/util/regex/Pattern;
        //    66: astore_3       
        //    67: new             Ljava/util/HashSet;
        //    70: dup            
        //    71: invokespecial   java/util/HashSet.<init>:()V
        //    74: astore_2       
        //    75: aload_0        
        //    76: aload_1        
        //    77: invokespecial   com/getkeepsafe/relinker/a.f:(Landroid/content/Context;)[Ljava/lang/String;
        //    80: astore_1       
        //    81: aload_1        
        //    82: arraylength    
        //    83: istore          4
        //    85: iconst_0       
        //    86: istore          5
        //    88: iload           5
        //    90: iload           4
        //    92: if_icmpge       192
        //    95: aload_1        
        //    96: iload           5
        //    98: aaload         
        //    99: astore          6
        //   101: new             Ljava/util/zip/ZipFile;
        //   104: astore          7
        //   106: new             Ljava/io/File;
        //   109: astore          8
        //   111: aload           8
        //   113: aload           6
        //   115: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //   118: aload           7
        //   120: aload           8
        //   122: iconst_1       
        //   123: invokespecial   java/util/zip/ZipFile.<init>:(Ljava/io/File;I)V
        //   126: aload           7
        //   128: invokevirtual   java/util/zip/ZipFile.entries:()Ljava/util/Enumeration;
        //   131: astore          8
        //   133: aload           8
        //   135: invokeinterface java/util/Enumeration.hasMoreElements:()Z
        //   140: ifeq            186
        //   143: aload_3        
        //   144: aload           8
        //   146: invokeinterface java/util/Enumeration.nextElement:()Ljava/lang/Object;
        //   151: checkcast       Ljava/util/zip/ZipEntry;
        //   154: invokevirtual   java/util/zip/ZipEntry.getName:()Ljava/lang/String;
        //   157: invokevirtual   java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
        //   160: astore          7
        //   162: aload           7
        //   164: invokevirtual   java/util/regex/Matcher.matches:()Z
        //   167: ifeq            133
        //   170: aload_2        
        //   171: aload           7
        //   173: iconst_1       
        //   174: invokevirtual   java/util/regex/Matcher.group:(I)Ljava/lang/String;
        //   177: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //   182: pop            
        //   183: goto            133
        //   186: iinc            5, 1
        //   189: goto            88
        //   192: aload_2        
        //   193: aload_2        
        //   194: invokeinterface java/util/Set.size:()I
        //   199: anewarray       Ljava/lang/String;
        //   202: invokeinterface java/util/Set.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //   207: checkcast       [Ljava/lang/String;
        //   210: areturn        
        //   211: astore          8
        //   213: goto            186
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  101    126    211    216    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.assembler.ir.StackMappingVisitor.push(StackMappingVisitor.java:290)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:833)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.visit(StackMappingVisitor.java:398)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2030)
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
    
    private String[] f(final Context context) {
        final ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (Build$VERSION.SDK_INT >= 21) {
            final String[] splitSourceDirs = applicationInfo.splitSourceDirs;
            if (splitSourceDirs != null && splitSourceDirs.length != 0) {
                final String[] array = new String[splitSourceDirs.length + 1];
                array[0] = applicationInfo.sourceDir;
                System.arraycopy(splitSourceDirs, 0, array, 1, splitSourceDirs.length);
                return array;
            }
        }
        return new String[] { applicationInfo.sourceDir };
    }
    
    @Override
    public void a(final Context p0, final String[] p1, final String p2, final File p3, final f p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore          6
        //     3: aconst_null    
        //     4: astore          7
        //     6: aload_0        
        //     7: aload_1        
        //     8: aload_2        
        //     9: aload_3        
        //    10: aload           5
        //    12: invokespecial   com/getkeepsafe/relinker/a.d:(Landroid/content/Context;[Ljava/lang/String;Ljava/lang/String;Lcom/getkeepsafe/relinker/f;)Lcom/getkeepsafe/relinker/a$a;
        //    15: astore          8
        //    17: aload           8
        //    19: ifnull          284
        //    22: iconst_0       
        //    23: istore          9
        //    25: iload           9
        //    27: iconst_5       
        //    28: if_icmpge       262
        //    31: aload           5
        //    33: ldc             "Found %s! Extracting..."
        //    35: iconst_1       
        //    36: anewarray       Ljava/lang/Object;
        //    39: dup            
        //    40: iconst_0       
        //    41: aload_3        
        //    42: aastore        
        //    43: invokevirtual   com/getkeepsafe/relinker/f.m:(Ljava/lang/String;[Ljava/lang/Object;)V
        //    46: aload           4
        //    48: invokevirtual   java/io/File.exists:()Z
        //    51: ifne            69
        //    54: aload           4
        //    56: invokevirtual   java/io/File.createNewFile:()Z
        //    59: istore          10
        //    61: iload           10
        //    63: ifne            69
        //    66: goto            256
        //    69: aload           8
        //    71: getfield        com/getkeepsafe/relinker/a$a.a:Ljava/util/zip/ZipFile;
        //    74: aload           8
        //    76: getfield        com/getkeepsafe/relinker/a$a.b:Ljava/util/zip/ZipEntry;
        //    79: invokevirtual   java/util/zip/ZipFile.getInputStream:(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
        //    82: astore_2       
        //    83: new             Ljava/io/FileOutputStream;
        //    86: astore_1       
        //    87: aload_1        
        //    88: aload           4
        //    90: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //    93: aload_0        
        //    94: aload_2        
        //    95: aload_1        
        //    96: invokespecial   com/getkeepsafe/relinker/a.c:(Ljava/io/InputStream;Ljava/io/OutputStream;)J
        //    99: lstore          11
        //   101: aload_1        
        //   102: invokevirtual   java/io/FileOutputStream.getFD:()Ljava/io/FileDescriptor;
        //   105: invokevirtual   java/io/FileDescriptor.sync:()V
        //   108: aload           4
        //   110: invokevirtual   java/io/File.length:()J
        //   113: lstore          13
        //   115: lload           11
        //   117: lload           13
        //   119: lcmp           
        //   120: ifeq            136
        //   123: aload_0        
        //   124: aload_2        
        //   125: invokespecial   com/getkeepsafe/relinker/a.b:(Ljava/io/Closeable;)V
        //   128: aload_0        
        //   129: aload_1        
        //   130: invokespecial   com/getkeepsafe/relinker/a.b:(Ljava/io/Closeable;)V
        //   133: goto            256
        //   136: aload_0        
        //   137: aload_2        
        //   138: invokespecial   com/getkeepsafe/relinker/a.b:(Ljava/io/Closeable;)V
        //   141: aload_0        
        //   142: aload_1        
        //   143: invokespecial   com/getkeepsafe/relinker/a.b:(Ljava/io/Closeable;)V
        //   146: aload           4
        //   148: iconst_1       
        //   149: iconst_0       
        //   150: invokevirtual   java/io/File.setReadable:(ZZ)Z
        //   153: pop            
        //   154: aload           4
        //   156: iconst_1       
        //   157: iconst_0       
        //   158: invokevirtual   java/io/File.setExecutable:(ZZ)Z
        //   161: pop            
        //   162: aload           4
        //   164: iconst_1       
        //   165: invokevirtual   java/io/File.setWritable:(Z)Z
        //   168: pop            
        //   169: aload           8
        //   171: getfield        com/getkeepsafe/relinker/a$a.a:Ljava/util/zip/ZipFile;
        //   174: astore_1       
        //   175: aload_1        
        //   176: ifnull          183
        //   179: aload_1        
        //   180: invokevirtual   java/util/zip/ZipFile.close:()V
        //   183: return         
        //   184: astore          4
        //   186: aload_1        
        //   187: astore_3       
        //   188: aload           4
        //   190: astore_1       
        //   191: goto            197
        //   194: astore_1       
        //   195: aconst_null    
        //   196: astore_3       
        //   197: goto            218
        //   200: astore_1       
        //   201: aconst_null    
        //   202: astore_1       
        //   203: goto            235
        //   206: astore_1       
        //   207: aconst_null    
        //   208: astore_1       
        //   209: goto            248
        //   212: astore_1       
        //   213: aconst_null    
        //   214: astore_3       
        //   215: aload           7
        //   217: astore_2       
        //   218: aload_0        
        //   219: aload_2        
        //   220: invokespecial   com/getkeepsafe/relinker/a.b:(Ljava/io/Closeable;)V
        //   223: aload_0        
        //   224: aload_3        
        //   225: invokespecial   com/getkeepsafe/relinker/a.b:(Ljava/io/Closeable;)V
        //   228: aload_1        
        //   229: athrow         
        //   230: astore_1       
        //   231: aconst_null    
        //   232: astore_2       
        //   233: aload_2        
        //   234: astore_1       
        //   235: aload_0        
        //   236: aload_2        
        //   237: invokespecial   com/getkeepsafe/relinker/a.b:(Ljava/io/Closeable;)V
        //   240: goto            128
        //   243: astore_1       
        //   244: aconst_null    
        //   245: astore_2       
        //   246: aload_2        
        //   247: astore_1       
        //   248: aload_0        
        //   249: aload_2        
        //   250: invokespecial   com/getkeepsafe/relinker/a.b:(Ljava/io/Closeable;)V
        //   253: goto            128
        //   256: iinc            9, 1
        //   259: goto            25
        //   262: aload           5
        //   264: ldc             "FATAL! Couldn't extract the library from the APK!"
        //   266: invokevirtual   com/getkeepsafe/relinker/f.l:(Ljava/lang/String;)V
        //   269: aload           8
        //   271: getfield        com/getkeepsafe/relinker/a$a.a:Ljava/util/zip/ZipFile;
        //   274: astore_1       
        //   275: aload_1        
        //   276: ifnull          283
        //   279: aload_1        
        //   280: invokevirtual   java/util/zip/ZipFile.close:()V
        //   283: return         
        //   284: aload_0        
        //   285: aload_1        
        //   286: aload_3        
        //   287: invokespecial   com/getkeepsafe/relinker/a.e:(Landroid/content/Context;Ljava/lang/String;)[Ljava/lang/String;
        //   290: astore_1       
        //   291: goto            314
        //   294: astore_1       
        //   295: aload           8
        //   297: astore_2       
        //   298: goto            334
        //   301: astore_1       
        //   302: iconst_1       
        //   303: anewarray       Ljava/lang/String;
        //   306: dup            
        //   307: iconst_0       
        //   308: aload_1        
        //   309: invokevirtual   java/lang/Exception.toString:()Ljava/lang/String;
        //   312: aastore        
        //   313: astore_1       
        //   314: new             Lcom/getkeepsafe/relinker/c;
        //   317: astore          4
        //   319: aload           4
        //   321: aload_3        
        //   322: aload_2        
        //   323: aload_1        
        //   324: invokespecial   com/getkeepsafe/relinker/c.<init>:(Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)V
        //   327: aload           4
        //   329: athrow         
        //   330: astore_1       
        //   331: aload           6
        //   333: astore_2       
        //   334: aload_2        
        //   335: ifnull          351
        //   338: aload_2        
        //   339: getfield        com/getkeepsafe/relinker/a$a.a:Ljava/util/zip/ZipFile;
        //   342: astore_2       
        //   343: aload_2        
        //   344: ifnull          351
        //   347: aload_2        
        //   348: invokevirtual   java/util/zip/ZipFile.close:()V
        //   351: aload_1        
        //   352: athrow         
        //   353: astore_1       
        //   354: goto            256
        //   357: astore          6
        //   359: goto            248
        //   362: astore          6
        //   364: goto            235
        //   367: astore_1       
        //   368: goto            183
        //   371: astore_1       
        //   372: goto            283
        //   375: astore_2       
        //   376: goto            351
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                           
        //  -----  -----  -----  -----  -------------------------------
        //  6      17     330    334    Any
        //  31     46     294    301    Any
        //  46     61     353    357    Ljava/io/IOException;
        //  46     61     294    301    Any
        //  69     83     243    248    Ljava/io/FileNotFoundException;
        //  69     83     230    235    Ljava/io/IOException;
        //  69     83     212    218    Any
        //  83     93     206    212    Ljava/io/FileNotFoundException;
        //  83     93     200    206    Ljava/io/IOException;
        //  83     93     194    197    Any
        //  93     115    357    362    Ljava/io/FileNotFoundException;
        //  93     115    362    367    Ljava/io/IOException;
        //  93     115    184    194    Any
        //  123    128    294    301    Any
        //  128    133    294    301    Any
        //  136    169    294    301    Any
        //  169    175    367    371    Ljava/io/IOException;
        //  179    183    367    371    Ljava/io/IOException;
        //  218    230    294    301    Any
        //  235    240    294    301    Any
        //  248    253    294    301    Any
        //  262    269    294    301    Any
        //  269    275    371    375    Ljava/io/IOException;
        //  279    283    371    375    Ljava/io/IOException;
        //  284    291    301    314    Ljava/lang/Exception;
        //  284    291    294    301    Any
        //  302    314    294    301    Any
        //  314    330    294    301    Any
        //  338    343    375    379    Ljava/io/IOException;
        //  347    351    375    379    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 213 out of bounds for length 213
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
    
    private static class a
    {
        public ZipFile a;
        public ZipEntry b;
        
        public a(final ZipFile a, final ZipEntry b) {
            this.a = a;
            this.b = b;
        }
    }
}
