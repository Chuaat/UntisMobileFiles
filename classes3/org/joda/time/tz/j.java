// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.tz;

import java.lang.ref.SoftReference;
import java.io.DataInputStream;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.io.FileInputStream;
import java.io.InputStream;
import org.joda.time.i;
import java.util.SortedSet;
import java.util.Collections;
import java.util.Collection;
import java.util.TreeSet;
import java.io.IOException;
import java.util.Set;
import java.util.Map;
import java.io.File;

public class j implements f
{
    private final File a;
    private final String b;
    private final ClassLoader c;
    private final Map<String, Object> d;
    private final Set<String> e;
    
    public j() throws IOException {
        this("org/joda/time/tz/data");
    }
    
    public j(final File obj) throws IOException {
        if (obj == null) {
            throw new IllegalArgumentException("No file directory provided");
        }
        if (!obj.exists()) {
            final StringBuilder sb = new StringBuilder();
            sb.append("File directory doesn't exist: ");
            sb.append(obj);
            throw new IOException(sb.toString());
        }
        if (obj.isDirectory()) {
            this.a = obj;
            this.b = null;
            this.c = null;
            final Map<String, Object> e = e(this.f("ZoneInfoMap"));
            this.d = e;
            this.e = (Set<String>)Collections.unmodifiableSortedSet(new TreeSet<Object>(e.keySet()));
            return;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("File doesn't refer to a directory: ");
        sb2.append(obj);
        throw new IOException(sb2.toString());
    }
    
    public j(final String s) throws IOException {
        this(s, null, false);
    }
    
    public j(final String s, final ClassLoader classLoader) throws IOException {
        this(s, classLoader, true);
    }
    
    private j(final String str, final ClassLoader classLoader, final boolean b) throws IOException {
        if (str != null) {
            String string = str;
            if (!str.endsWith("/")) {
                final StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append('/');
                string = sb.toString();
            }
            this.a = null;
            this.b = string;
            ClassLoader classLoader2;
            if ((classLoader2 = classLoader) == null) {
                classLoader2 = classLoader;
                if (!b) {
                    classLoader2 = this.getClass().getClassLoader();
                }
            }
            this.c = classLoader2;
            final Map<String, Object> e = e(this.f("ZoneInfoMap"));
            this.d = e;
            this.e = (Set<String>)Collections.unmodifiableSortedSet(new TreeSet<Object>(e.keySet()));
            return;
        }
        throw new IllegalArgumentException("No resource path provided");
    }
    
    private i d(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore_2       
        //     2: aload_0        
        //     3: aload_1        
        //     4: invokespecial   org/joda/time/tz/j.f:(Ljava/lang/String;)Ljava/io/InputStream;
        //     7: astore_3       
        //     8: aload_3        
        //     9: astore_2       
        //    10: aload_3        
        //    11: aload_1        
        //    12: invokestatic    org/joda/time/tz/b.g:(Ljava/io/InputStream;Ljava/lang/String;)Lorg/joda/time/i;
        //    15: astore          4
        //    17: aload_3        
        //    18: astore_2       
        //    19: aload_0        
        //    20: getfield        org/joda/time/tz/j.d:Ljava/util/Map;
        //    23: astore          5
        //    25: aload_3        
        //    26: astore_2       
        //    27: new             Ljava/lang/ref/SoftReference;
        //    30: astore          6
        //    32: aload_3        
        //    33: astore_2       
        //    34: aload           6
        //    36: aload           4
        //    38: invokespecial   java/lang/ref/SoftReference.<init>:(Ljava/lang/Object;)V
        //    41: aload_3        
        //    42: astore_2       
        //    43: aload           5
        //    45: aload_1        
        //    46: aload           6
        //    48: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    53: pop            
        //    54: aload_3        
        //    55: ifnull          62
        //    58: aload_3        
        //    59: invokevirtual   java/io/InputStream.close:()V
        //    62: aload           4
        //    64: areturn        
        //    65: astore_3       
        //    66: aload_2        
        //    67: astore_1       
        //    68: goto            117
        //    71: astore          4
        //    73: goto            86
        //    76: astore_3       
        //    77: aload_2        
        //    78: astore_1       
        //    79: goto            117
        //    82: astore          4
        //    84: aconst_null    
        //    85: astore_3       
        //    86: aload_3        
        //    87: astore_2       
        //    88: aload_0        
        //    89: aload           4
        //    91: invokevirtual   org/joda/time/tz/j.h:(Ljava/lang/Exception;)V
        //    94: aload_3        
        //    95: astore_2       
        //    96: aload_0        
        //    97: getfield        org/joda/time/tz/j.d:Ljava/util/Map;
        //   100: aload_1        
        //   101: invokeinterface java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //   106: pop            
        //   107: aload_3        
        //   108: ifnull          115
        //   111: aload_3        
        //   112: invokevirtual   java/io/InputStream.close:()V
        //   115: aconst_null    
        //   116: areturn        
        //   117: aload_1        
        //   118: ifnull          125
        //   121: aload_1        
        //   122: invokevirtual   java/io/InputStream.close:()V
        //   125: aload_3        
        //   126: athrow         
        //   127: astore_1       
        //   128: goto            62
        //   131: astore_1       
        //   132: goto            115
        //   135: astore_1       
        //   136: goto            125
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  2      8      82     86     Ljava/io/IOException;
        //  2      8      76     82     Any
        //  10     17     71     76     Ljava/io/IOException;
        //  10     17     65     71     Any
        //  19     25     71     76     Ljava/io/IOException;
        //  19     25     65     71     Any
        //  27     32     71     76     Ljava/io/IOException;
        //  27     32     65     71     Any
        //  34     41     71     76     Ljava/io/IOException;
        //  34     41     65     71     Any
        //  43     54     71     76     Ljava/io/IOException;
        //  43     54     65     71     Any
        //  58     62     127    131    Ljava/io/IOException;
        //  88     94     65     71     Any
        //  96     107    65     71     Any
        //  111    115    131    135    Ljava/io/IOException;
        //  121    125    135    139    Ljava/io/IOException;
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
    
    private static Map<String, Object> e(final InputStream p0) throws IOException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: invokespecial   java/util/concurrent/ConcurrentHashMap.<init>:()V
        //     7: astore_1       
        //     8: new             Ljava/io/DataInputStream;
        //    11: dup            
        //    12: aload_0        
        //    13: invokespecial   java/io/DataInputStream.<init>:(Ljava/io/InputStream;)V
        //    16: astore_2       
        //    17: aload_2        
        //    18: aload_1        
        //    19: invokestatic    org/joda/time/tz/j.g:(Ljava/io/DataInputStream;Ljava/util/Map;)V
        //    22: aload_2        
        //    23: invokevirtual   java/io/DataInputStream.close:()V
        //    26: aload_1        
        //    27: ldc             "UTC"
        //    29: new             Ljava/lang/ref/SoftReference;
        //    32: dup            
        //    33: getstatic       org/joda/time/i.I:Lorg/joda/time/i;
        //    36: invokespecial   java/lang/ref/SoftReference.<init>:(Ljava/lang/Object;)V
        //    39: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    44: pop            
        //    45: aload_1        
        //    46: areturn        
        //    47: astore_0       
        //    48: aload_2        
        //    49: invokevirtual   java/io/DataInputStream.close:()V
        //    52: aload_0        
        //    53: athrow         
        //    54: astore_0       
        //    55: goto            26
        //    58: astore_1       
        //    59: goto            52
        //    Exceptions:
        //  throws java.io.IOException
        //    Signature:
        //  (Ljava/io/InputStream;)Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  17     22     47     54     Any
        //  22     26     54     58     Ljava/io/IOException;
        //  48     52     58     62     Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 33 out of bounds for length 33
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
    
    private InputStream f(String string) throws IOException {
        InputStream inputStream;
        if (this.a != null) {
            inputStream = new FileInputStream(new File(this.a, string));
        }
        else {
            final String concat = this.b.concat(string);
            if ((inputStream = AccessController.doPrivileged((PrivilegedAction<InputStream>)new PrivilegedAction<InputStream>() {
                public InputStream a() {
                    if (j.this.c != null) {
                        return j.this.c.getResourceAsStream(concat);
                    }
                    return ClassLoader.getSystemResourceAsStream(concat);
                }
            })) == null) {
                final StringBuilder sb = new StringBuilder(40);
                sb.append("Resource not found: \"");
                sb.append(concat);
                sb.append("\" ClassLoader: ");
                final ClassLoader c = this.c;
                if (c != null) {
                    string = c.toString();
                }
                else {
                    string = "system";
                }
                sb.append(string);
                throw new IOException(sb.toString());
            }
        }
        return inputStream;
    }
    
    private static void g(final DataInputStream dataInputStream, final Map<String, Object> map) throws IOException {
        final int unsignedShort = dataInputStream.readUnsignedShort();
        final String[] array = new String[unsignedShort];
        final int n = 0;
        for (int i = 0; i < unsignedShort; ++i) {
            array[i] = dataInputStream.readUTF().intern();
        }
        final int unsignedShort2 = dataInputStream.readUnsignedShort();
        int j = n;
        while (j < unsignedShort2) {
            try {
                map.put(array[dataInputStream.readUnsignedShort()], array[dataInputStream.readUnsignedShort()]);
                ++j;
                continue;
            }
            catch (ArrayIndexOutOfBoundsException ex) {
                throw new IOException("Corrupt zone info map");
            }
            break;
        }
    }
    
    @Override
    public i a(final String s) {
        if (s == null) {
            return null;
        }
        final String value = this.d.get(s);
        if (value == null) {
            return null;
        }
        if (value instanceof SoftReference) {
            final i i = ((SoftReference<i>)value).get();
            if (i != null) {
                return i;
            }
            return this.d(s);
        }
        else {
            if (s.equals(value)) {
                return this.d(s);
            }
            return this.a(value);
        }
    }
    
    @Override
    public Set<String> b() {
        return this.e;
    }
    
    protected void h(final Exception ex) {
        ex.printStackTrace();
    }
}
